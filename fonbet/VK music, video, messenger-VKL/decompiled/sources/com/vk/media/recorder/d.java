package com.vk.media.recorder;

import android.graphics.ImageFormat;
import android.media.MediaCodecInfo;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.Matrix;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.MediaUtils;
import com.vk.media.camera.CameraObject$CameraMode;
import com.vk.media.recorder.RecorderBase;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.GLComputerProgram;
import ru.ok.gl.objects.GLSSBO;
import ru.ok.gl.objects.SimpleGLProgram;
import xsna.aoa0;
import xsna.asu0;
import xsna.fap;
import xsna.m8g;
import xsna.pes;
import xsna.q8l;
import xsna.s3q0;
import xsna.t12;
import xsna.te9;
import xsna.vau;
import xsna.x52;
import xsna.yk9;
import xsna.zna0;

/* compiled from: RecorderPingPong.kt */
/* loaded from: classes3.dex */
public final class d extends i {
    public final zna0 L = new zna0();
    public long M;
    public final vau N;
    public boolean O;

    public d() {
        vau vauVar = new vau();
        vauVar.c = new float[16];
        vauVar.d = new float[16];
        this.N = vauVar;
        this.s = 2000;
        this.A = RecorderBase.RecordingType.LOOP;
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void A() {
        Q(false);
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void B() {
        Q(true);
    }

    @Override // com.vk.media.recorder.i, com.vk.media.recorder.f
    public final void L(pes pesVar, fap fapVar) {
        pes pesVar2;
        if (this.L.b || this.r == RecorderBase.State.IDLE || ((pesVar == null && !this.O) || !this.q)) {
            return;
        }
        if (pesVar == null) {
            vau vauVar = this.N;
            MediaUtils.d dVar = this.E;
            CameraObject$CameraMode cameraObject$CameraMode = this.c.d;
            vauVar.getClass();
            IntBuffer allocate = IntBuffer.allocate(4);
            GLES20.glGetIntegerv(2978, allocate);
            int i = allocate.get(2);
            int i2 = allocate.get(3);
            if (vauVar.a == null) {
                vauVar.a = new FrameBuffer(i, i2);
                vauVar.b = new FrameBuffer(dVar.a, dVar.b);
                vauVar.e = new SimpleGLProgram();
                vauVar.f = new GLComputerProgram("#version 310 es\nlayout(local_size_x = 2, local_size_y = 4) in;\nprecision highp float;\nstruct SSBOBlock\n{\n  uint data;\n};        \nlayout(binding = 0) uniform sampler2D u_Texture0;\nlayout(std430) buffer;\nlayout(binding = 1) buffer Output { SSBOBlock elements[]; } output_data;\nuniform int u_width;\nuniform int u_height;\n\nvec3 gammaCorrection (vec3 colour, float gamma) {\n  return pow(colour, vec3(1. / gamma));\n}\n\nvec4 getYUVForPixel(ivec2 gid, ivec2 offset) {\n    vec3 pixel = texelFetch(u_Texture0, gid + offset, 0).xyz;\n    mat3 convertMatrix;\n    convertMatrix[0] = vec3(66.0  / 255.0 , -38.0 / 255.0, 112.0 / 255.0);\n    convertMatrix[1] = vec3(129.0 / 255.0,  -74.0 / 255.0, -94.0 / 255.0);\n    convertMatrix[2] = vec3(25.0  / 255.0,  112.0 / 255.0, -18.0 / 255.0);   \n    vec3 yuv = convertMatrix * pixel.bgr + vec3(16.0 / 255.0, 0.5, 0.5);\n    vec4 out_value = clamp(vec4(yuv.r, yuv.g, yuv.b, 0.0), 0.0, 1.0);\n    return out_value;\n}\n\nvoid main() \n{\n    ivec2 originVec = ivec2(gl_GlobalInvocationID.xy);\n    ivec2 gid = originVec * ivec2(4, 2);\n    if (gid.x >= u_width || gid.y >= u_height) return;\n   \n    vec4 p11 = getYUVForPixel(gid, ivec2(0, 0));\n    vec4 p12 = getYUVForPixel(gid, ivec2(1, 0));\n    vec4 p13 = getYUVForPixel(gid, ivec2(2, 0));\n    vec4 p14 = getYUVForPixel(gid, ivec2(3, 0));\n    \n    vec4 p21 = getYUVForPixel(gid, ivec2(0, 1));\n    vec4 p22 = getYUVForPixel(gid, ivec2(1, 1));\n    vec4 p23 = getYUVForPixel(gid, ivec2(2, 1));\n    vec4 p24 = getYUVForPixel(gid, ivec2(3, 1));            \n    \n    int linear_index_y_1  = gid.y * u_width + gid.x;\n    int linear_index_y_2  = (gid.y + 1) * u_width + gid.x;\n    output_data.elements[linear_index_y_1 / 4].data = packUnorm4x8(vec4(p11.x, p12.x, p13.x, p14.x));\n    output_data.elements[linear_index_y_2 / 4].data = packUnorm4x8(vec4(p21.x, p22.x, p23.x, p24.x));\n    int linear_index_uv  = u_width * u_height / 4 + originVec.y * u_width / 4 + originVec.x;\n    output_data.elements[linear_index_uv].data = packUnorm4x8(vec4(p12.y, p12.z, p14.y, p14.z));\n}        ");
                int ceil = (int) Math.ceil(((dVar.b * dVar.a) * ImageFormat.getBitsPerPixel(35)) / 8.0d);
                vauVar.h = new byte[ceil];
                vauVar.g = new GLSSBO(ceil);
                float[] fArr = new float[16];
                vauVar.c = fArr;
                vauVar.d = new float[16];
                Matrix.setIdentityM(fArr, 0);
                Matrix.setIdentityM(vauVar.d, 0);
                Matrix.rotateM(vauVar.d, 0, 180.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                Matrix.scaleM(vauVar.d, 0, -1.0f, 1.0f, 1.0f);
                float f = dVar.a / dVar.b;
                float f2 = i / i2;
                Float valueOf = Float.valueOf(1.0f);
                float f3 = 1;
                float f4 = (f2 / f) - f3;
                Pair pair = Math.abs(f4) <= 0.01f ? new Pair(valueOf, valueOf) : f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? new Pair(Float.valueOf(f4 + f3), valueOf) : new Pair(valueOf, Float.valueOf((f3 / f2) * f));
                Matrix.scaleM(vauVar.d, 0, f3 / ((Number) pair.second).floatValue(), f3 / ((Number) pair.first).floatValue(), 1.0f);
            }
            FrameBuffer frameBuffer = vauVar.a;
            if (frameBuffer != null) {
                frameBuffer.bind();
            }
            IntBuffer allocate2 = IntBuffer.allocate(1);
            GLES20.glGetIntegerv(36006, allocate2);
            GLES20.glBindFramebuffer(36008, 0);
            GLES20.glBindFramebuffer(36009, allocate2.get(0));
            GLES30.glBlitFramebuffer(0, 0, i, i2, 0, 0, i, i2, 16640, 9728);
            GLES20.glBindFramebuffer(36008, 0);
            GLES20.glBindFramebuffer(36009, 0);
            FrameBuffer frameBuffer2 = vauVar.b;
            if (frameBuffer2 != null) {
                frameBuffer2.bind(true);
            }
            SimpleGLProgram simpleGLProgram = vauVar.e;
            if (simpleGLProgram != null) {
                FrameBuffer frameBuffer3 = vauVar.a;
                simpleGLProgram.setTextureId(frameBuffer3 != null ? frameBuffer3.getTextureId() : 0);
            }
            SimpleGLProgram simpleGLProgram2 = vauVar.e;
            if (simpleGLProgram2 != null) {
                simpleGLProgram2.setMVPMat(vauVar.d);
            }
            SimpleGLProgram simpleGLProgram3 = vauVar.e;
            if (simpleGLProgram3 != null) {
                simpleGLProgram3.setTexMat(vauVar.c);
            }
            SimpleGLProgram simpleGLProgram4 = vauVar.e;
            if (simpleGLProgram4 != null) {
                simpleGLProgram4.render();
            }
            GLComputerProgram gLComputerProgram = vauVar.f;
            if (gLComputerProgram != null) {
                gLComputerProgram.useProgram();
            }
            GLComputerProgram gLComputerProgram2 = vauVar.f;
            if (gLComputerProgram2 != null) {
                gLComputerProgram2.setIntUniform("u_Texture0", 0);
            }
            GLComputerProgram gLComputerProgram3 = vauVar.f;
            if (gLComputerProgram3 != null) {
                gLComputerProgram3.setIntUniform("u_width", dVar.a);
            }
            GLComputerProgram gLComputerProgram4 = vauVar.f;
            if (gLComputerProgram4 != null) {
                gLComputerProgram4.setIntUniform("u_height", dVar.b);
            }
            GLComputerProgram gLComputerProgram5 = vauVar.f;
            if (gLComputerProgram5 != null) {
                gLComputerProgram5.resetProgram();
            }
            GLComputerProgram gLComputerProgram6 = vauVar.f;
            if (gLComputerProgram6 != null) {
                gLComputerProgram6.useProgram();
            }
            GLSSBO glssbo = vauVar.g;
            if (glssbo != null) {
                glssbo.copyTextureToBufferWithShader(vauVar.b.getTextureId(), vauVar.b.getWidth(), vauVar.b.getHeight());
            }
            GLComputerProgram gLComputerProgram7 = vauVar.f;
            if (gLComputerProgram7 != null) {
                gLComputerProgram7.resetProgram();
            }
            pesVar2 = new pes();
            int i3 = dVar.a;
            int i4 = dVar.b;
            pesVar2.a = i3;
            pesVar2.b = i4;
            GLSSBO glssbo2 = vauVar.g;
            if (glssbo2 != null) {
                glssbo2.copyDataTo(vauVar.h);
            }
            pesVar2.g(vauVar.h);
            GLES20.glViewport(allocate.get(0), allocate.get(1), allocate.get(2), allocate.get(3));
        } else {
            pesVar2 = pesVar;
        }
        J();
        this.r = RecorderBase.State.RECORDING;
        long nanoTime = System.nanoTime();
        if ((nanoTime - this.M) - 26000000 >= 0) {
            this.M = nanoTime;
            this.L.c.b(pesVar2.a, pesVar2.b);
            aoa0 aoa0Var = this.L.c;
            synchronized (aoa0Var.a) {
                try {
                    if (aoa0Var.f && pesVar2.i() != null) {
                        pesVar2.f(aoa0Var.h);
                        aoa0Var.g = false;
                        aoa0Var.a.notifyAll();
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        r(nanoTime);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(boolean z) {
        long j;
        yk9 yk9Var;
        long j2 = this.t;
        if (j2 > 0) {
            long j3 = this.u;
            if (j3 > j2) {
                j = (j3 - j2) / 1000000;
                super.A();
                boolean z2 = this.q;
                this.q = false;
                this.M = 0L;
                if (j != 0) {
                    Objects.toString(this.r);
                    this.s = 2000;
                    aoa0 aoa0Var = this.L.c;
                    synchronized (aoa0Var.a) {
                        try {
                            if (aoa0Var.f) {
                                aoa0Var.f = false;
                                aoa0Var.c = null;
                                aoa0Var.h.e();
                                aoa0Var.g = false;
                                aoa0Var.a.notifyAll();
                            }
                            s3q0 s3q0Var = s3q0.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!z && z2 && !this.L.b && this.r != RecorderBase.State.IDLE && j >= e()) {
                        zna0 zna0Var = this.L;
                        RecorderBase.b bVar = new RecorderBase.b(this);
                        zna0Var.getClass();
                        asu0.a.getClass();
                        Future<?> submit = asu0.h().submit(new te9(3, zna0Var, bVar));
                        synchronized (zna0Var.a) {
                            zna0Var.a.add(submit);
                        }
                    }
                }
                this.r = RecorderBase.State.PREPARED;
                yk9Var = this.e;
                if (yk9Var == null) {
                    yk9Var.a.d(new t12(this, 10));
                    return;
                }
                return;
            }
        }
        j = 0;
        super.A();
        boolean z22 = this.q;
        this.q = false;
        this.M = 0L;
        if (j != 0) {
        }
        this.r = RecorderBase.State.PREPARED;
        yk9Var = this.e;
        if (yk9Var == null) {
        }
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean l() {
        if (this.r == RecorderBase.State.PREPARED && this.L.d != null) {
            return true;
        }
        this.r = RecorderBase.State.IDLE;
        zna0 zna0Var = this.L;
        MediaUtils.e eVar = this.c.e;
        zna0Var.getClass();
        if (eVar != null && eVar.a > 0 && eVar.b > 0) {
            synchronized (zna0Var) {
                zna0Var.h = eVar;
                q8l.a.getClass();
                MediaCodecInfo a = q8l.a();
                boolean z = false;
                if (a != null) {
                    for (int i : a.getCapabilitiesForType("video/avc").colorFormats) {
                        if (i == 19 || i == 21) {
                            if (i == 19) {
                                z = true;
                            }
                        }
                    }
                }
                zna0Var.g = z;
                s3q0 s3q0Var = s3q0.a;
            }
        }
        this.r = RecorderBase.State.PREPARED;
        f(-1000);
        this.h.b(this.c);
        return true;
    }

    @Override // com.vk.media.recorder.f, com.vk.media.recorder.RecorderBase
    public final void m() {
        Q(false);
        this.r = RecorderBase.State.IDLE;
        this.L.c(true);
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void p(int i) {
        if (i != e()) {
            i = 2000;
        }
        this.s = i;
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean r(long j) {
        if (super.r(j)) {
            return true;
        }
        this.a.post(new a(this));
        Q(false);
        return false;
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void s(MediaUtils.e eVar) {
        this.c.e = eVar;
        aoa0 aoa0Var = this.L.c;
        aoa0Var.getClass();
        aoa0Var.b(eVar.a, eVar.b);
        l();
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void x(boolean z) {
        this.O = z;
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean z() {
        boolean z = false;
        this.q = false;
        l();
        zna0 zna0Var = this.L;
        File file = this.m;
        if (file == null) {
            zna0Var.getClass();
            Objects.toString(file);
        } else {
            zna0Var.f = file;
            aoa0 aoa0Var = zna0Var.c;
            asu0.a.getClass();
            ExecutorService h = asu0.h();
            boolean z2 = zna0Var.g;
            synchronized (aoa0Var.a) {
                try {
                    if (!aoa0Var.d.d()) {
                        aoa0Var.e = z2;
                        if (!aoa0Var.f) {
                            aoa0Var.c = ByteBuffer.allocateDirect(m8g.a(aoa0Var.d));
                            aoa0Var.f = true;
                            h.execute(new x52(aoa0Var, 8));
                        }
                        s3q0 s3q0Var = s3q0.a;
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.q = z;
        Objects.toString(this.r);
        return this.q;
    }
}
