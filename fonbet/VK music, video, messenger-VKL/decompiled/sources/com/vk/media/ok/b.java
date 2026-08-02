package com.vk.media.ok;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.WindowManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.recording.StopwatchView;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.gles.EglTexture;
import com.vk.media.ok.IClipsGalleryPicker;
import com.vk.media.ok.recording.GesturedRecording;
import com.vk.media.ok.recording.RecognitionView;
import com.vk.media.rotation.Flip;
import com.vk.ml.api.tf.TensorflowFacade;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLConfig;
import ru.ok.gl.GlBitmapReader;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import ru.ok.gl.effects.media.controller.video.ExtraVideoSupplier;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.gl.objects.TrivialFragmentShader;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.gl.tf.TensorflowFaceLandmarksType;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.tf.TensorflowSegmentationType;
import ru.ok.gl.tf.gestures.Figure;
import ru.ok.gl.tf.gestures.TensorflowGestureDetector;
import ru.ok.gl.util.ThreadHelper;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.EffectListener;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.GlView;
import ru.ok.gleffects.recognition.DynamicRequirements;
import ru.ok.gleffects.recognition.FigureData;
import ru.ok.gleffects.recognition.GalleryAsset;
import ru.ok.gleffects.recognition.GalleryPanelSettings;
import ru.ok.gleffects.util.AsyncEffectResourceProvider;
import ru.ok.tensorflow.customview.FpsView;
import ru.ok.tensorflow.entity.Gesture;
import xsna.a72;
import xsna.bpn0;
import xsna.df6;
import xsna.epx;
import xsna.ezf0;
import xsna.gzs;
import xsna.h;
import xsna.i6m;
import xsna.ix70;
import xsna.izs;
import xsna.j5g;
import xsna.kno;
import xsna.nbr;
import xsna.o7j;
import xsna.pw70;
import xsna.qao0;
import xsna.qo4;
import xsna.qye;
import xsna.r0a;
import xsna.rw70;
import xsna.s3q0;
import xsna.uq50;
import xsna.w7;
import xsna.w8i;
import xsna.xy9;
import xsna.y930;
import xsna.z930;
import xsna.zv6;

/* compiled from: OkEffects.kt */
/* loaded from: classes.dex */
public final class b extends com.vk.media.gles.a implements GlView, StopwatchView.a, w8i {
    public static final int W0 = EffectHolder.getMasksEngineFaceModelVersion();
    public int A;
    public final SensorManager A0;
    public volatile boolean B;
    public final WindowManager B0;
    public volatile boolean C;
    public i6m C0;
    public float D;
    public boolean D0;
    public final ix70 E;
    public boolean E0;
    public final ExtraVideoSupplier F;
    public boolean F0;
    public final ExtraVideoSupplier G;
    public int G0;
    public final EffectHolder H;
    public final C1263b H0;
    public final EffectHolder I;
    public FpsView I0;
    public final a J;
    public z930 J0;
    public final TrivialFragmentShader K;
    public String K0;
    public zv6 L;
    public boolean L0;
    public volatile Tensorflow M;
    public DynamicRequirements M0;
    public TensorflowGestureDetector N;
    public TensorflowModel[] N0;
    public final GlBitmapReader O;
    public boolean O0;
    public final GlBitmapReader P;
    public long P0;
    public boolean Q;
    public long Q0;
    public FrameBuffer R;
    public boolean R0;
    public FrameBuffer S;
    public boolean S0;
    public final LinkedHashMap T;
    public final qao0 T0;
    public SimpleGLProgram U;
    public long U0;
    public final FrameBuffer[] V;
    public float V0;
    public int W;
    public volatile boolean X;
    public final int Y;
    public InitStage Z;
    public long a0;
    public StopwatchView b0;
    public RecognitionView c0;
    public IClipsGalleryPicker d0;
    public final Context e;
    public final Object e0;
    public MediaUtils.d f;
    public GesturedRecording f0;
    public final Handler g;
    public long g0;
    public final com.vk.media.ok.a h;
    public long h0;
    public final ExtraAudioSupplier i;
    public boolean i0;
    public final rw70 j;
    public boolean j0;
    public final TensorflowFacade.a k;
    public boolean k0;
    public final TensorflowFacade.OkEngineConfig l;
    public long[] l0;
    public final Runnable m;
    public long m0;
    public final boolean n;
    public boolean n0;
    public final TensorflowSegmentationType o;
    public final ezf0 o0;
    public final TensorflowFaceLandmarksType p;
    public EffectRegistry.EffectId p0;
    public final String q;
    public File q0;
    public final y930 r;
    public boolean r0;
    public volatile boolean s;
    public boolean s0;
    public volatile boolean t;
    public boolean t0;
    public volatile boolean u;
    public boolean u0;
    public float v;
    public boolean v0;
    public boolean w;
    public final Rect w0;
    public boolean x;
    public final c x0;
    public ArrayList<Long> y;
    public final d y0;
    public gzs<s3q0> z;
    public boolean z0;

    /* compiled from: OkEffects.kt */
    /* renamed from: com.vk.media.ok.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C1263b {
        public int a = -1;

        public C1263b() {
        }
    }

    /* compiled from: OkEffects.kt */
    /* loaded from: classes3.dex */
    public final class c {
        public final AtomicInteger a = new AtomicInteger(0);

        public c() {
        }

        public final int a() {
            return this.a.get();
        }

        public final com.vk.media.ok.c b() {
            return new com.vk.media.ok.c(this, b.this);
        }

        public final void c() {
            this.a.incrementAndGet();
        }
    }

    /* compiled from: OkEffects.kt */
    /* loaded from: classes3.dex */
    public final class d {
        public d() {
        }

        public final com.vk.media.ok.d a() {
            return new com.vk.media.ok.d(b.this);
        }
    }

    /* compiled from: OkEffects.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitStage.values().length];
            try {
                iArr[InitStage.EFFECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitStage.TENS1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitStage.TENS2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitStage.BUFFER1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InitStage.BUFFER2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InitStage.DONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: OkEffects.kt */
    /* loaded from: classes3.dex */
    public static final class f {
        public f() {
        }

        public final void a(int i, String str) {
            b bVar = b.this;
            bVar.H.pushImage(str);
            bVar.H.handleGalleryItemSelected(new GalleryAsset(GalleryAsset.Type.Image, str, i));
        }

        public final void b() {
            b.this.H.handleGalleryItemDeselected();
        }
    }

    public b(Context context, MediaUtils.d dVar, Handler handler, com.vk.media.ok.a aVar, ExtraAudioSupplier extraAudioSupplier, rw70 rw70Var, TensorflowFacade.a aVar2, TensorflowFacade.OkEngineConfig okEngineConfig, Runnable runnable, boolean z, TensorflowSegmentationType tensorflowSegmentationType, TensorflowFaceLandmarksType tensorflowFaceLandmarksType, String str, y930 y930Var) {
        super(new EglTexture(EglTexture.ProgramType.TEXTURE_EXT));
        this.e = context;
        this.f = dVar;
        this.g = handler;
        this.h = aVar;
        this.i = extraAudioSupplier;
        this.j = rw70Var;
        this.k = aVar2;
        this.l = okEngineConfig;
        this.m = runnable;
        this.n = z;
        this.o = tensorflowSegmentationType;
        this.p = tensorflowFaceLandmarksType;
        this.q = str;
        this.r = y930Var;
        new bpn0(new uq50(this, 6));
        this.v = 1.0f;
        this.y = new ArrayList<>();
        o7j o7jVar = new o7j() { // from class: xsna.dx70
            @Override // xsna.o7j
            public final void accept(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                com.vk.media.ok.b bVar = com.vk.media.ok.b.this;
                if (bVar.u() || bVar.q()) {
                    ExtraVideoSupplier extraVideoSupplier = bVar.F;
                    if (booleanValue) {
                        bVar.queueEvent(new oo6(bVar, 6));
                    } else {
                        bVar.queueEvent(new dxt(2, bVar, extraVideoSupplier));
                    }
                }
            }
        };
        o7j o7jVar2 = new o7j() { // from class: xsna.hx70
            @Override // xsna.o7j
            public final void accept(Object obj) {
                com.vk.media.ok.b bVar = com.vk.media.ok.b.this;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (bVar.u) {
                    ExtraVideoSupplier extraVideoSupplier = bVar.G;
                    if (booleanValue) {
                        bVar.queueEvent(new oo6(bVar, 6));
                    } else {
                        bVar.queueEvent(new dxt(2, bVar, extraVideoSupplier));
                    }
                }
            }
        };
        this.A = -1;
        this.B = true;
        this.D = 0.65f;
        this.E = new ix70(this, 0);
        ExtraVideoSupplier extraVideoSupplier = new ExtraVideoSupplier(context, o7jVar, false);
        this.F = extraVideoSupplier;
        ExtraVideoSupplier extraVideoSupplier2 = new ExtraVideoSupplier(context, o7jVar2, false);
        this.G = extraVideoSupplier2;
        this.H = new EffectHolder(this, extraAudioSupplier, extraVideoSupplier);
        this.I = new EffectHolder(this, extraAudioSupplier, extraVideoSupplier2);
        this.K = new TrivialFragmentShader(0, false);
        this.O = new GlBitmapReader(GlUtil.getGlVersion(context), null, false);
        this.P = new GlBitmapReader(GlUtil.getGlVersion(context), null, true);
        this.T = new LinkedHashMap();
        this.V = new FrameBuffer[]{null, null};
        this.Y = 500;
        this.Z = InitStage.TENS1;
        this.a0 = System.currentTimeMillis();
        this.e0 = new Object();
        this.i0 = true;
        this.j0 = true;
        this.o0 = new ezf0();
        this.s0 = true;
        this.t0 = true;
        this.u0 = true;
        this.w0 = new Rect();
        this.x0 = new c();
        this.y0 = new d();
        this.A0 = (SensorManager) context.getSystemService("sensor");
        this.B0 = (WindowManager) context.getSystemService("window");
        this.G0 = 60000000;
        this.H0 = new C1263b();
        this.K0 = "";
        this.M0 = DynamicRequirements.EMPTY;
        this.T0 = new qao0();
        this.J = new a();
        L.e("OkEffects engine initialized");
    }

    public static void k(String str) {
        if (GLES20.glGetError() != 0) {
            com.vk.metrics.eventtracking.b.a.a(new Exception(str));
        }
    }

    public static FrameBuffer l(FrameBuffer frameBuffer, int i, int i2) {
        if (frameBuffer != null && (i != frameBuffer.getWidth() || i2 != frameBuffer.getHeight())) {
            frameBuffer.release();
            frameBuffer = null;
        }
        if (frameBuffer == null && i > 0 && i2 > 0) {
            frameBuffer = new FrameBuffer(i, i2);
        }
        GlUtil.checkGlError("OkEffects::checkFrameBuffer");
        return frameBuffer;
    }

    public static PointF r(float[] fArr, int i, int i2) {
        int i3 = i * 2;
        int i4 = i2 * 2;
        return new PointF((fArr[i3] + fArr[i4]) * 0.5f, (fArr[i3 + 1] + fArr[i4 + 1]) * 0.5f);
    }

    public final int A(File file) {
        File file2 = new File(new File(file, "video"), "0.mp4");
        return (!file2.exists() || file2.length() <= 4) ? this.G0 : (int) MediaUtils.a.h(file2.getAbsolutePath());
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x0062, code lost:
    
        if (java.lang.Integer.parseInt(r7) == r5) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(EffectRegistry.EffectId effectId, File file) {
        boolean z;
        boolean z2;
        EffectRegistry effectRegistry;
        com.vk.media.ok.a aVar;
        EffectRegistry effectRegistry2;
        Long effectHandle;
        GesturedRecording gesturedRecording;
        GesturedRecording gesturedRecording2;
        StopwatchView stopwatchView;
        EffectHolder effectHolder;
        com.vk.media.ok.a aVar2;
        com.vk.media.ok.a aVar3;
        com.vk.media.ok.a aVar4;
        com.vk.media.ok.a aVar5;
        com.vk.media.ok.a aVar6;
        EffectHolder effectHolder2;
        rw70 rw70Var;
        boolean y;
        boolean z3;
        com.vk.media.ok.a aVar7;
        boolean z4;
        boolean z5;
        com.vk.media.ok.a aVar8;
        boolean z6;
        com.vk.media.ok.a aVar9;
        com.vk.media.ok.a aVar10;
        com.vk.media.ok.a aVar11;
        com.vk.media.ok.a aVar12;
        com.vk.media.ok.a aVar13;
        EffectRegistry effectRegistry3 = this.H.getEffectRegistry();
        String str = this.q;
        if (str != null) {
            effectRegistry3.setMaskEngineAsset(str);
        }
        this.M0 = DynamicRequirements.EMPTY;
        this.N0 = null;
        Long effectHandle2 = effectRegistry3.getEffectHandle(effectId);
        boolean j = effectId != null ? j(-effectId.id) : false;
        if (effectId != EffectRegistry.EffectId.API_PROGRAM || this.q == null) {
            if (effectId != null) {
                int minResVersion = this.H.getEffectRegistry().getMinResVersion(p());
                if (minResVersion != -1) {
                    if (file != null) {
                        File file2 = new File(file, "version");
                        if (file2.exists()) {
                            String str2 = (String) j5g.a0(nbr.q(file2));
                            if (str2 != null) {
                            }
                        }
                    }
                }
            }
            z = false;
            z2 = !j && z && (effectRegistry3.duetEffect(effectHandle2) || !this.u);
            effectRegistry = this.H.getEffectRegistry();
            if (!effectRegistry.groupedEffect(effectRegistry.getEffectHandle(this.p0)) && file != null) {
                this.H.updateResourcepack(file);
                return;
            }
            EffectRegistry.EffectId effectId2 = !z2 ? effectId : null;
            aVar = this.h;
            effectRegistry2 = this.H.getEffectRegistry();
            effectHandle = effectRegistry2.getEffectHandle(effectId2);
            Long effectHandle3 = effectRegistry2.getEffectHandle(this.p0);
            if (effectRegistry2.duetEffect(effectHandle) && effectRegistry2.duetEffect(effectHandle3)) {
                if (aVar != null) {
                    aVar.k(this.G0);
                }
                if (aVar != null) {
                    aVar.b(false);
                }
            } else if (effectRegistry2.duetEffect(effectHandle) && this.p0 != effectId2) {
                this.G0 = aVar == null ? aVar.k(A(file) + 450) : this.G0;
                if (aVar != null) {
                    aVar.b(true);
                }
            }
            this.p0 = effectId2;
            this.q0 = !z2 ? file : null;
            gesturedRecording = this.f0;
            if (gesturedRecording != null) {
                gesturedRecording.d(this.H.getEffectRegistry(), this.p0, this.i0, null);
            }
            gesturedRecording2 = this.f0;
            if (gesturedRecording2 != null) {
                gesturedRecording2.i(false);
            }
            if (this.H.getEffectRegistry().smallSegmentationRequired(p())) {
                TensorflowSegmentationType tensorflowSegmentationType = TensorflowSegmentationType.OLD_SEGMENTATION;
            }
            stopwatchView = this.b0;
            if (stopwatchView != null && !stopwatchView.k) {
                stopwatchView.a(true);
            }
            if (this.p0 == null) {
                this.H.setEffectListener(this.J);
                this.H.selectEffect(this.p0, file != null ? new AsyncEffectResourceProvider(file) : null);
                EffectHolder effectHolder3 = this.H;
                if (effectHolder3.getEffectRegistry().inputGalleryPhotoRequired(p()) || effectHolder3.getEffectRegistry().inputGalleryVideoRequired(p())) {
                    boolean inputGalleryPhotoRequired = this.H.getEffectRegistry().inputGalleryPhotoRequired(p());
                    IClipsGalleryPicker.MediaType mediaType = (inputGalleryPhotoRequired && this.H.getEffectRegistry().inputGalleryVideoRequired(p())) ? IClipsGalleryPicker.MediaType.PHOTO_AND_VIDEO : inputGalleryPhotoRequired ? IClipsGalleryPicker.MediaType.PHOTO : IClipsGalleryPicker.MediaType.VIDEO;
                    IClipsGalleryPicker iClipsGalleryPicker = this.d0;
                    if (iClipsGalleryPicker != null) {
                        iClipsGalleryPicker.b(mediaType);
                    }
                }
            } else {
                com.vk.media.ok.a aVar14 = this.h;
                if (aVar14 != null) {
                    aVar14.m();
                }
                this.k0 = false;
                this.H.removeEffectListener();
                com.vk.media.ok.a aVar15 = this.h;
                if (aVar15 != null) {
                    aVar15.onChangeReadyToStartRecording(true);
                }
                boolean z7 = this.u ? !this.B : false;
                com.vk.media.ok.a aVar16 = this.h;
                if (aVar16 != null) {
                    aVar16.onChangeMicMute(z7);
                }
                this.H.selectEffect(null, null);
                com.vk.media.ok.a aVar17 = this.h;
                if (aVar17 != null) {
                    aVar17.onChangeAudioPitch(1.0f);
                }
                this.P0 = 0L;
                this.Q0 = 0L;
                this.V0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (effectId != null) {
                this.v0 = true;
            }
            if (this.v0 && effectId != EffectRegistry.EffectId.RANDOM_MUSIC && (aVar13 = this.h) != null) {
                aVar13.onChangeReadyToStartRecording(true);
            }
            effectHolder = this.H;
            if (!effectHolder.getEffectRegistry().inputGalleryPhotoRequired(p()) && !effectHolder.getEffectRegistry().inputGalleryVideoRequired(p()) && (aVar12 = this.h) != null) {
                aVar12.o(false, null);
            }
            aVar2 = this.h;
            if (aVar2 != null) {
                aVar2.n(this.H.getEffectRegistry().inputTouchesRequired(p()));
            }
            if (!this.H.getEffectRegistry().inputDuetsTouchEventsRequired(p()) || this.u) {
                aVar3 = this.h;
                if (aVar3 != null) {
                    aVar3.f(this.H0);
                }
            } else {
                com.vk.media.ok.a aVar18 = this.h;
                if (aVar18 != null) {
                    aVar18.f(null);
                }
            }
            aVar4 = this.h;
            if (aVar4 != null) {
                aVar4.y(this.H.getEffectRegistry().inputClicksRequired(p()));
            }
            aVar5 = this.h;
            if (aVar5 != null) {
                aVar5.g(this.H.getEffectRegistry().cameraZoomBlockingRequired(p()));
            }
            aVar6 = this.h;
            if (aVar6 != null) {
                aVar6.i(this.H.getEffectRegistry().groupedEffect(p()));
            }
            effectHolder2 = this.H;
            if (!effectHolder2.getEffectRegistry().inputGalleryPhotoRequired(p()) && !effectHolder2.getEffectRegistry().inputGalleryVideoRequired(p()) && (aVar11 = this.h) != null) {
                aVar11.o(false, null);
            }
            rw70Var = this.j;
            if (rw70Var != null) {
                rw70Var.a(this.H.getEffectRegistry().inputFacesRequired(p()));
            }
            y = y();
            z3 = this.M0.selfAvatarRequired;
            if ((!y || z3) && (aVar7 = this.h) != null) {
                aVar7.p(y, z3);
            }
            EffectHolder effectHolder4 = this.H;
            z4 = !effectHolder4.getEffectRegistry().inputFriendsNamesRequired(p()) || this.M0.friendsGeneralInfoRequired;
            z5 = !effectHolder4.getEffectRegistry().inputFriendsAvatarsRequired(p()) || this.M0.friendsAvatarRequired;
            if ((!z4 || z5) && (aVar8 = this.h) != null) {
                aVar8.z(z4, z5);
            }
            if (this.H.getEffectRegistry().inputMusicTracksMetaRequired(p()) && (aVar10 = this.h) != null) {
                aVar10.C();
            }
            EffectRegistry.EffectId effectId3 = this.p0;
            if (!this.n) {
                boolean z8 = effectId3 == EffectRegistry.EffectId.TILES || effectId3 == EffectRegistry.EffectId.PHOTO_BOOTH;
                RecognitionView recognitionView = this.c0;
                if (recognitionView != null) {
                    recognitionView.setDrawingLock(z8);
                }
            }
            if (this.H.getEffectRegistry().inputAudioBitsRequired(p()) && this.L != null) {
                this.H.setMusicInfo(this.l0, 0L);
                this.H.updateMusicDelay(this.m0);
            }
            n();
            m();
            z6 = !this.H.getEffectRegistry().inputFullSegmentationRequired(p()) || this.H.getEffectRegistry().inputSkySegmentationRequired(p());
            if (z6 != this.X) {
                com.vk.media.ok.a aVar19 = this.h;
                if (aVar19 != null) {
                    aVar19.B(z6);
                }
                Tensorflow tensorflow = this.M;
                if (tensorflow != null) {
                    tensorflow.setSync(z6);
                }
            }
            this.X = z6;
            if (effectId != null || z2 || (aVar9 = this.h) == null) {
                return;
            }
            aVar9.t();
            return;
        }
        z = true;
        if (j) {
        }
        effectRegistry = this.H.getEffectRegistry();
        if (!effectRegistry.groupedEffect(effectRegistry.getEffectHandle(this.p0))) {
        }
        if (!z2) {
        }
        aVar = this.h;
        effectRegistry2 = this.H.getEffectRegistry();
        effectHandle = effectRegistry2.getEffectHandle(effectId2);
        Long effectHandle32 = effectRegistry2.getEffectHandle(this.p0);
        if (effectRegistry2.duetEffect(effectHandle)) {
        }
        if (effectRegistry2.duetEffect(effectHandle)) {
            this.G0 = aVar == null ? aVar.k(A(file) + 450) : this.G0;
            if (aVar != null) {
            }
        }
        this.p0 = effectId2;
        this.q0 = !z2 ? file : null;
        gesturedRecording = this.f0;
        if (gesturedRecording != null) {
        }
        gesturedRecording2 = this.f0;
        if (gesturedRecording2 != null) {
        }
        if (this.H.getEffectRegistry().smallSegmentationRequired(p())) {
        }
        stopwatchView = this.b0;
        if (stopwatchView != null) {
            stopwatchView.a(true);
        }
        if (this.p0 == null) {
        }
        if (effectId != null) {
        }
        if (this.v0) {
            aVar13.onChangeReadyToStartRecording(true);
        }
        effectHolder = this.H;
        if (!effectHolder.getEffectRegistry().inputGalleryPhotoRequired(p())) {
            aVar12.o(false, null);
        }
        aVar2 = this.h;
        if (aVar2 != null) {
        }
        if (this.H.getEffectRegistry().inputDuetsTouchEventsRequired(p())) {
        }
        aVar3 = this.h;
        if (aVar3 != null) {
        }
        aVar4 = this.h;
        if (aVar4 != null) {
        }
        aVar5 = this.h;
        if (aVar5 != null) {
        }
        aVar6 = this.h;
        if (aVar6 != null) {
        }
        effectHolder2 = this.H;
        if (!effectHolder2.getEffectRegistry().inputGalleryPhotoRequired(p())) {
            aVar11.o(false, null);
        }
        rw70Var = this.j;
        if (rw70Var != null) {
        }
        y = y();
        z3 = this.M0.selfAvatarRequired;
        if (!y) {
        }
        aVar7.p(y, z3);
        EffectHolder effectHolder42 = this.H;
        if (effectHolder42.getEffectRegistry().inputFriendsNamesRequired(p())) {
        }
        if (effectHolder42.getEffectRegistry().inputFriendsAvatarsRequired(p())) {
        }
        if (!z4) {
        }
        aVar8.z(z4, z5);
        if (this.H.getEffectRegistry().inputMusicTracksMetaRequired(p())) {
            aVar10.C();
        }
        EffectRegistry.EffectId effectId32 = this.p0;
        if (!this.n) {
        }
        if (this.H.getEffectRegistry().inputAudioBitsRequired(p())) {
            this.H.setMusicInfo(this.l0, 0L);
            this.H.updateMusicDelay(this.m0);
        }
        n();
        m();
        if (this.H.getEffectRegistry().inputFullSegmentationRequired(p())) {
        }
        if (z6 != this.X) {
        }
        this.X = z6;
        if (effectId != null) {
        }
    }

    public final void C(final StopwatchView stopwatchView, final RecognitionView recognitionView, final IClipsGalleryPicker iClipsGalleryPicker) {
        synchronized (this.e0) {
            if (this.r0) {
                return;
            }
            if (!ThreadHelper.isMainThread()) {
                ThreadHelper.queueOnMain(new Runnable() { // from class: xsna.sw70
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.vk.media.ok.b.this.C(stopwatchView, recognitionView, iClipsGalleryPicker);
                    }
                });
                return;
            }
            boolean z = true;
            if (stopwatchView != null) {
                StopwatchView stopwatchView2 = this.b0;
                if (stopwatchView2 != null) {
                    stopwatchView2.c();
                }
                StopwatchView stopwatchView3 = this.b0;
                if (stopwatchView3 != null) {
                    stopwatchView3.c.remove(this);
                }
                stopwatchView.c.add(this);
                stopwatchView.a(true);
                this.b0 = stopwatchView;
            }
            GesturedRecording gesturedRecording = this.f0;
            if (gesturedRecording != null) {
                gesturedRecording.h();
            }
            this.f0 = null;
            this.c0 = recognitionView;
            if (this.n && recognitionView != null) {
                this.I0 = new FpsView(recognitionView);
                y930 y930Var = this.r;
                if (y930Var == null || !y930Var.d()) {
                    z = false;
                }
                z930 z930Var = new z930(recognitionView, z);
                this.J0 = z930Var;
                z930Var.b(this.U0);
            }
            if (stopwatchView != null && recognitionView != null) {
                this.f0 = new GesturedRecording(this.b0, this, recognitionView);
            }
            if (recognitionView != null) {
                recognitionView.setRecognitionsVisibility(this.n);
            }
            this.d0 = iClipsGalleryPicker;
            if (iClipsGalleryPicker != null) {
                iClipsGalleryPicker.a(new f());
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public final void D(kno knoVar) {
        boolean z = knoVar != null;
        if (this.u != z) {
            if (z) {
                ThreadHelper.queueOnMain(new qye(8, knoVar, this));
                return;
            }
            this.u = false;
            s(null);
            this.I.removeEffectListener();
            this.I.selectEffect(null, null);
            com.vk.media.ok.a aVar = this.h;
            if (aVar != null) {
                aVar.f(null);
            }
            this.J.onNewMessage("");
        }
    }

    public final void E(File file, long j) {
        com.vk.media.ok.a aVar;
        File b;
        String absolutePath;
        EffectRegistry effectRegistry = this.H.getEffectRegistry();
        Long effectHandle = effectRegistry.getEffectHandle(this.H.getCurrentEffectName());
        this.m0 = file != null ? j : 0L;
        if (effectRegistry.inputAudioBitsRequired(effectHandle)) {
            this.H.updateMusicDelay(j);
        }
        if (this.u) {
            queueEvent(new h(8, file, this));
        }
        zv6 zv6Var = this.L;
        if (zv6Var != null && (b = zv6Var.b()) != null && (absolutePath = b.getAbsolutePath()) != null) {
            if (absolutePath.equals(file != null ? file.getAbsolutePath() : null)) {
                return;
            }
        }
        zv6 zv6Var2 = this.L;
        boolean z = (zv6Var2 != null || this.l0 != null) == (file == null);
        if (zv6Var2 != null) {
            zv6Var2.a();
        }
        this.L = null;
        this.l0 = null;
        if (file != null) {
            if (effectRegistry.inputAudioBitsRequired(effectHandle)) {
                this.H.setMusicInfo(null, 0L);
            }
            zv6.a aVar2 = new zv6.a();
            aVar2.b(file);
            aVar2.c(new w7(this, 29));
            this.L = aVar2.a();
        } else if (effectRegistry.inputAudioBitsRequired(effectHandle)) {
            this.H.clearMusicInfo();
        }
        if (!z || (aVar = this.h) == null) {
            return;
        }
        aVar.l();
    }

    @Override // com.vk.clips.design.view.recording.StopwatchView.a
    public final void a(StopwatchView stopwatchView) {
        stopwatchView.setVisibility(8);
        this.g0 = System.currentTimeMillis();
        GesturedRecording gesturedRecording = this.f0;
        if (gesturedRecording != null) {
            gesturedRecording.e(true);
        }
        com.vk.media.ok.a aVar = this.h;
        if (aVar != null) {
            aVar.stopRecording();
        }
    }

    @Override // com.vk.clips.design.view.recording.StopwatchView.a
    public final void b(StopwatchView stopwatchView) {
        stopwatchView.setVisibility(8);
        RecognitionView recognitionView = this.c0;
        if (recognitionView != null) {
            recognitionView.a();
        }
        this.h0 = System.currentTimeMillis();
        com.vk.media.ok.a aVar = this.h;
        if (aVar != null) {
            aVar.j(true);
        }
        GesturedRecording gesturedRecording = this.f0;
        if (gesturedRecording != null) {
            gesturedRecording.e(true);
        }
    }

    @Override // com.vk.clips.design.view.recording.StopwatchView.a
    public final void d(StopwatchView stopwatchView) {
        stopwatchView.setVisibility(0);
        com.vk.media.ok.a aVar = this.h;
        if (aVar != null) {
            aVar.j(false);
        }
    }

    @Override // com.vk.clips.design.view.recording.StopwatchView.a
    public final void e() {
        RecognitionView recognitionView = this.c0;
        if (recognitionView != null) {
            recognitionView.setRecognitionsVisibility(this.n);
        }
    }

    @Override // com.vk.clips.design.view.recording.StopwatchView.a
    public final void f(StopwatchView stopwatchView) {
        RecognitionView recognitionView = this.c0;
        if (recognitionView != null) {
            recognitionView.setRecognitionsVisibility(false);
        }
        RecognitionView recognitionView2 = this.c0;
        if (recognitionView2 != null) {
            recognitionView2.a();
        }
        B(null, null);
    }

    @Override // ru.ok.gleffects.GlView
    public final Context getContext() {
        return this.e;
    }

    @Override // ru.ok.gleffects.GlView
    public final EGLConfig getEglConfig() {
        throw new NullPointerException("egl10 context doesn't exist and (wasn't) used");
    }

    @Override // ru.ok.gleffects.GlView
    public final int getHeight() {
        return this.f.a();
    }

    @Override // ru.ok.gleffects.GlView
    public final int getWidth() {
        return this.f.c();
    }

    @Override // com.vk.media.gles.a
    public final void h() {
        synchronized (this.e0) {
            super.h();
            if (this.r0) {
                return;
            }
            this.r0 = true;
            s3q0 s3q0Var = s3q0.a;
            this.s0 = true;
            k("before buffers");
            FrameBuffer frameBuffer = this.R;
            if (frameBuffer != null) {
                frameBuffer.release();
            }
            k("frameBuffer release has failed");
            Iterator it = this.T.values().iterator();
            while (it.hasNext()) {
                ((FrameBuffer) it.next()).release();
            }
            k("tens buffers release has failed");
            FrameBuffer frameBuffer2 = this.S;
            if (frameBuffer2 != null) {
                frameBuffer2.release();
            }
            k("tensBuffer release has failed");
            FrameBuffer frameBuffer3 = this.V[0];
            if (frameBuffer3 != null) {
                frameBuffer3.release();
            }
            k("cameraFrameBuffer release has failed");
            FrameBuffer frameBuffer4 = this.V[1];
            if (frameBuffer4 != null) {
                frameBuffer4.release();
            }
            k("cameraFrameBuffer release has failed");
            GesturedRecording gesturedRecording = this.f0;
            if (gesturedRecording != null) {
                gesturedRecording.h();
            }
            this.i.release();
            TensorflowGestureDetector tensorflowGestureDetector = this.N;
            if (tensorflowGestureDetector != null) {
                tensorflowGestureDetector.release();
            }
            k("shouldn't fail");
            this.N = null;
            Tensorflow tensorflow = this.M;
            if (tensorflow != null) {
                tensorflow.release();
            }
            k("tensorflow release has failed");
            this.M = null;
            this.O.release(true);
            zv6 zv6Var = this.L;
            if (zv6Var != null) {
                zv6Var.a();
            }
            this.L = null;
            this.H.releaseFromGl();
            this.I.releaseFromGl();
            ThreadHelper.queueOnMain(new qo4(this, 8));
            i6m i6mVar = this.C0;
            if (i6mVar != null) {
                i6mVar.c();
            }
            this.C0 = null;
            FpsView fpsView = this.I0;
            if (fpsView != null) {
                fpsView.release();
            }
            this.I0 = null;
            z930 z930Var = this.J0;
            if (z930Var != null) {
                z930Var.a();
            }
            this.J0 = null;
            this.T0.b();
        }
    }

    public final boolean j(int i) {
        EffectRegistry effectRegistry = this.H.getEffectRegistry();
        EffectRegistry.EffectId b = pw70.b(i);
        if (b != null) {
            Long effectHandle = effectRegistry.getEffectHandle(b);
            com.vk.media.ok.a aVar = this.h;
            boolean z = (aVar != null && aVar.h() && this.l0 == null && this.L == null && effectRegistry.inputAudioBitsRequired(effectHandle)) ? false : true;
            boolean z2 = (effectRegistry.inputRecognitionsRequired(effectHandle) && (this.l == TensorflowFacade.OkEngineConfig.OFF || this.z0)) ? false : true;
            boolean z3 = (effectRegistry.fatEffect(effectHandle) && this.l == TensorflowFacade.OkEngineConfig.OFF) ? false : true;
            boolean z4 = !effectRegistry.inputFullSegmentationRequired(effectHandle) || (this.l == TensorflowFacade.OkEngineConfig.GPU && !this.z0);
            boolean z5 = !t(effectHandle) || i6m.b(this.A0);
            boolean z6 = (this.u && effectRegistry.duetEffect(effectHandle)) ? false : true;
            boolean z7 = this.O0 || !effectRegistry.inputMorphingRequired(effectHandle);
            if (z && z2 && z5 && z3 && z4 && z6 && z7) {
                return true;
            }
        }
        return false;
    }

    public final void m() {
        com.vk.media.ok.a aVar = this.h;
        if (aVar != null) {
            aVar.v(this.H.getEffectRegistry().needOffCameraStabilization(p()) || this.M0.rotationMatrixRequired);
        }
    }

    public final void n() {
        if (t(p())) {
            if (this.C0 == null) {
                this.C0 = new i6m(this.A0);
            }
        } else {
            i6m i6mVar = this.C0;
            if (i6mVar != null) {
                i6mVar.c();
            }
            this.C0 = null;
        }
    }

    public final boolean o() {
        return u() || this.u;
    }

    public final Long p() {
        return this.H.getEffectRegistry().getEffectHandle(this.p0);
    }

    public final boolean q() {
        return this.H.getEffectRegistry().needsRewindVideo(p());
    }

    @Override // ru.ok.gleffects.GlView
    public final void queueEvent(Runnable runnable) {
        this.g.post(runnable);
    }

    public final void s(File file) {
        if (!this.u) {
            com.vk.media.ok.a aVar = this.h;
            if (aVar != null) {
                aVar.k(this.G0);
            }
            queueEvent(new a72(this, 14));
            return;
        }
        int A = A(file);
        com.vk.media.ok.a aVar2 = this.h;
        this.G0 = aVar2 != null ? aVar2.k(A) : this.G0;
        if (this.w) {
            return;
        }
        queueEvent(new df6(5, file, this));
    }

    public final boolean t(Long l) {
        if (l == null) {
            return false;
        }
        return this.H.getEffectRegistry().inputDeviceRotationMatrixRequired(l) || this.M0.rotationMatrixRequired;
    }

    public final boolean u() {
        return this.H.getEffectRegistry().duetEffect(p());
    }

    public final <T> void v(Collection<? extends Figure<T>> collection, boolean z) {
        FigureData figureData;
        PointF pointF = new PointF();
        PointF pointF2 = new PointF();
        PointF pointF3 = new PointF();
        PointF pointF4 = new PointF();
        PointF pointF5 = new PointF();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Figure figure = (Figure) it.next();
            if (figure == null) {
                figureData = null;
            } else {
                RectF rectF = new RectF();
                RectF rectF2 = new RectF();
                RectF rectF3 = new RectF();
                figure.getRect(rectF);
                figure.getForefinger(pointF);
                figure.getForeFingerBase(pointF2);
                figure.getMiddleFingerBase(pointF3);
                figure.getRingFingerBase(pointF4);
                figure.getPalmBase(pointF5);
                if (z) {
                    figure.getLeftRightRects(rectF2, rectF3);
                }
                figureData = new FigureData(figure.getGesture().toString(), figure.getLastGesture().toString(), rectF, rectF2, rectF3, figure.getAngle(), pointF, pointF2, pointF3, pointF4, pointF5);
            }
            if (figureData != null) {
                arrayList.add(figureData);
            }
        }
        this.H.handleGestures(arrayList, z);
    }

    public final void w() {
        EffectRegistry effectRegistry = this.H.getEffectRegistry();
        Long effectHandle = effectRegistry.getEffectHandle(this.p0);
        if (effectRegistry.duetEffect(effectHandle)) {
            queueEvent(new r0a(effectRegistry, effectHandle, this, 5));
            return;
        }
        EffectRegistry.EffectId effectId = this.p0;
        if (effectId != null) {
            File file = this.q0;
            B(null, null);
            B(effectId, file);
        }
    }

    public final void x(final FrameBuffer frameBuffer, final Flip flip, final boolean z) {
        izs izsVar = new izs() { // from class: xsna.uw70
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                EffectHolder effectHolder = (EffectHolder) obj;
                int textureId = FrameBuffer.this.getTextureId();
                com.vk.media.ok.b bVar = this;
                effectHolder.render(textureId, bVar.f.c(), bVar.f.a(), bVar.f.c(), bVar.f.a(), flip != Flip.NO_FLIP, z);
                return s3q0.a;
            }
        };
        izsVar.invoke(this.H);
        if (this.u && !this.x && this.G.isFirstRendered()) {
            gzs<s3q0> gzsVar = this.z;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            this.z = null;
            this.i.seek(this.A, this.G.restart(this.y.size() == 0 ? 0L : ((Number) xy9.b(1, this.y)).longValue()));
            this.x = true;
        }
        izsVar.invoke(this.I);
    }

    public final boolean y() {
        EffectHolder effectHolder = this.H;
        return effectHolder.getEffectRegistry().inputUserNameRequired(p()) || effectHolder.getEffectRegistry().inputUserCityRequired(p()) || this.M0.selfGeneralInfoRequired;
    }

    public final void z() {
        if (this.C || !this.B) {
            this.D = 0.65f;
        } else {
            this.D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        this.i.setVolume(this.A, this.D);
        com.vk.media.ok.a aVar = this.h;
        if (aVar != null) {
            aVar.onChangeMicMute(!this.B);
        }
    }

    @Override // com.vk.clips.design.view.recording.StopwatchView.a
    public final void c() {
    }

    /* compiled from: OkEffects.kt */
    /* loaded from: classes3.dex */
    public static final class a implements EffectListener {
        public a() {
        }

        @Override // ru.ok.gleffects.EffectListener
        public final void clearSavedStorage() {
            com.vk.media.ok.a aVar = b.this.h;
            if (aVar != null) {
                aVar.clearSavedStorage();
            }
        }

        @Override // ru.ok.gleffects.EffectListener
        public final void onChangeAudioPitch(float f) {
            com.vk.media.ok.a aVar = b.this.h;
            if (aVar != null) {
                aVar.onChangeAudioPitch(f);
            }
        }

        @Override // ru.ok.gleffects.EffectListener
        public final void onChangeMicMute(boolean z) {
            com.vk.media.ok.a aVar = b.this.h;
            if (aVar != null) {
                aVar.onChangeMicMute(z);
            }
        }

        @Override // ru.ok.gleffects.EffectListener
        public final void onChangeReadyToStartRecording(boolean z) {
            com.vk.media.ok.a aVar = b.this.h;
            if (aVar != null) {
                aVar.onChangeReadyToStartRecording(z);
            }
        }

        @Override // ru.ok.gleffects.EffectListener
        public final void onNewMessage(String str) {
            com.vk.media.ok.a aVar = b.this.h;
            if (aVar != null) {
                aVar.x(str);
            }
        }

        @Override // ru.ok.gleffects.EffectListener
        public final void onRequirementsChanged(DynamicRequirements dynamicRequirements) {
            com.vk.media.ok.a aVar;
            com.vk.media.ok.a aVar2;
            IClipsGalleryPicker iClipsGalleryPicker;
            b bVar = b.this;
            GesturedRecording gesturedRecording = bVar.f0;
            if (gesturedRecording != null) {
                gesturedRecording.d(bVar.H.getEffectRegistry(), bVar.p0, bVar.i0, dynamicRequirements);
            }
            boolean z = true;
            bVar.k0 = bVar.k0 || dynamicRequirements.gesturesRequired;
            boolean z2 = bVar.X || dynamicRequirements.personSegmentationRequired;
            if (z2 != bVar.X) {
                com.vk.media.ok.a aVar3 = bVar.h;
                if (aVar3 != null) {
                    aVar3.B(z2);
                }
                Tensorflow tensorflow = bVar.M;
                if (tensorflow != null) {
                    tensorflow.setSync(z2);
                }
            }
            bVar.X = z2;
            bVar.M0 = dynamicRequirements;
            bVar.n();
            bVar.m();
            if (dynamicRequirements.galleryAssetRequired && (iClipsGalleryPicker = bVar.d0) != null) {
                iClipsGalleryPicker.b(IClipsGalleryPicker.MediaType.PHOTO);
            }
            boolean y = bVar.y();
            boolean z3 = bVar.M0.selfAvatarRequired;
            if ((y || z3) && (aVar = bVar.h) != null) {
                aVar.p(y, z3);
            }
            EffectHolder effectHolder = bVar.H;
            boolean z4 = effectHolder.getEffectRegistry().inputFriendsNamesRequired(bVar.p()) || bVar.M0.friendsGeneralInfoRequired;
            if (!effectHolder.getEffectRegistry().inputFriendsAvatarsRequired(bVar.p()) && !bVar.M0.friendsAvatarRequired) {
                z = false;
            }
            if ((z4 || z) && (aVar2 = bVar.h) != null) {
                aVar2.z(z4, z);
            }
        }

        @Override // ru.ok.gleffects.EffectListener
        public final void onUsingGesturesChanged(String[] strArr) {
            int length = strArr.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (epx.f(Gesture.VICTORY.toString(), strArr[i])) {
                    z = true;
                    break;
                }
                i++;
            }
            b.this.k0 = z;
        }

        @Override // ru.ok.gleffects.EffectListener
        public final void registerForFrugalReceive(boolean z) {
            GesturedRecording gesturedRecording = b.this.f0;
            if (gesturedRecording != null) {
                gesturedRecording.i(z);
            }
        }

        @Override // ru.ok.gleffects.EffectListener
        public final void setMusicById(String str) {
            com.vk.media.ok.a aVar;
            if (str == null || (aVar = b.this.h) == null) {
                return;
            }
            aVar.setMusicById(str);
        }

        @Override // ru.ok.gleffects.EffectListener
        public final void startRecording() {
            com.vk.media.ok.a aVar = b.this.h;
            if (aVar != null) {
                aVar.j(false);
            }
        }

        @Override // ru.ok.gleffects.EffectListener
        public final void stopRecording() {
            long currentTimeMillis = System.currentTimeMillis();
            b bVar = b.this;
            bVar.g0 = currentTimeMillis;
            com.vk.media.ok.a aVar = bVar.h;
            if (aVar != null) {
                aVar.stopRecording();
            }
        }

        @Override // ru.ok.gleffects.EffectListener
        public final void submitTaskOnWorkerThread(Runnable runnable) {
            com.vk.media.ok.a aVar;
            if (runnable == null || (aVar = b.this.h) == null) {
                return;
            }
            aVar.submitTaskOnWorkerThread(runnable);
        }

        @Override // ru.ok.gleffects.EffectListener
        public final void toggleGalleryPanel(boolean z, GalleryPanelSettings galleryPanelSettings) {
            com.vk.media.ok.a aVar = b.this.h;
            if (aVar != null) {
                aVar.o(z, galleryPanelSettings);
            }
        }

        @Override // ru.ok.gleffects.EffectListener
        public final void onChangePreferRecordingDuration(long j) {
        }
    }
}
