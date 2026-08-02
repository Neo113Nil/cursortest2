package io.agora.base.internal.video;

import android.opengl.GLES20;
import lb.C5444x;

/* loaded from: classes2.dex */
public class GlTextureFrameBuffer {
    private int frameBufferId;
    private int height;
    private final int pixelFormat;
    private int textureId;
    private int width;

    public GlTextureFrameBuffer(int i10) {
        if (i10 != 34842) {
            switch (i10) {
                case 6407:
                case 6408:
                case 6409:
                    break;
                default:
                    throw new IllegalArgumentException("Invalid pixel format: " + i10);
            }
        }
        this.pixelFormat = i10;
        this.width = 0;
        this.height = 0;
    }

    public void bindTexture(int i10, int i11, int i12, int i13, boolean z10) {
        if (!z10 && i12 == this.width && i13 == this.height && this.textureId == i10) {
            return;
        }
        this.textureId = i10;
        this.width = i12;
        this.height = i13;
        if (this.frameBufferId == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.frameBufferId = iArr[0];
        }
        GLES20.glBindFramebuffer(36160, this.frameBufferId);
        GLES20.glFramebufferTexture2D(36160, 36064, i11, i10, 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLES20.glBindFramebuffer(36160, 0);
            return;
        }
        throw new IllegalStateException("Framebuffer not complete, status: " + glCheckFramebufferStatus);
    }

    public int getFrameBufferId() {
        return this.frameBufferId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.textureId;
    }

    public int getWidth() {
        return this.width;
    }

    public void release() {
        GLES20.glDeleteTextures(1, new int[]{this.textureId}, 0);
        this.textureId = 0;
        GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
        this.frameBufferId = 0;
        this.width = 0;
        this.height = 0;
    }

    public void setSize(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Invalid size: " + i10 + C5444x.f55808b + i11);
        }
        if (i10 == this.width && i11 == this.height) {
            return;
        }
        int i12 = this.textureId;
        if (i12 == 0) {
            i12 = GlUtil.generateTexture(3553);
        }
        int i13 = i12;
        if (this.frameBufferId == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.frameBufferId = iArr[0];
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i13);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        int i14 = this.pixelFormat;
        if (i14 != 34842) {
            GLES20.glTexImage2D(3553, 0, i14, i10, i11, 0, i14, 5121, null);
        } else {
            if (!HdrUtil.isSupportedEGL3()) {
                throw new IllegalArgumentException("not support hdr");
            }
            GLES20.glTexImage2D(3553, 0, 34842, i10, i11, 0, 6408, 5126, null);
            GlUtil.checkNoGLES2Error("GlTextureFrameBuffer glTexImage2D GL_RGBA16F");
        }
        GLES20.glBindTexture(3553, 0);
        GlUtil.checkNoGLES2Error("GlTextureFrameBuffer setSize");
        bindTexture(i13, 3553, i10, i11, false);
    }
}
