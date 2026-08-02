package com.vk.media.ok.recording;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.vk.clips.design.view.recording.StopwatchView;
import com.vk.log.L;
import com.vk.media.ok.a;
import com.vk.media.ok.b;
import com.vk.media.ok.recording.RecognitionView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.tf.factory.HandRecognitionFactory;
import ru.ok.gl.tf.gestures.Figure;
import ru.ok.gl.util.ThreadHelper;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.recognition.DynamicRequirements;
import ru.ok.tensorflow.entity.Gesture;
import xsna.aad;
import xsna.o93;
import xsna.s9z0;
import xsna.sj1;
import xsna.uot;
import xsna.vot;
import xsna.vw70;
import xsna.y930;

/* loaded from: classes3.dex */
public final class GesturedRecording implements RecognitionView.b {
    public final StopwatchView a;
    public final RecognitionView b;
    public final long[] c;

    @NonNull
    public final List<Gesture> g;
    public final b i;
    public final Handler j;
    public boolean l;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final PointF d = new PointF();
    public final PointF e = new PointF();
    public final PointF f = new PointF();
    public final HashSet<Figure<Gesture>> h = new HashSet<>();
    public boolean k = true;
    public boolean m = true;
    public boolean n = true;
    public boolean s = false;
    public int t = -1;
    public boolean u = true;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    public boolean z = false;
    public boolean A = false;
    public TensorflowModel[] B = null;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Answers {
        private static final /* synthetic */ Answers[] $VALUES;
        public static final Answers FIRST;
        public static final Answers NO;
        public static final Answers YES;

        static {
            Answers answers = new Answers("YES", 0);
            YES = answers;
            Answers answers2 = new Answers("NO", 1);
            NO = answers2;
            Answers answers3 = new Answers("FIRST", 2);
            FIRST = answers3;
            $VALUES = new Answers[]{answers, answers2, answers3};
        }

        public Answers() {
            throw null;
        }

        public static Answers valueOf(String str) {
            return (Answers) Enum.valueOf(Answers.class, str);
        }

        public static Answers[] values() {
            return (Answers[]) $VALUES.clone();
        }
    }

    public GesturedRecording(StopwatchView stopwatchView, b bVar, RecognitionView recognitionView) {
        long[] jArr = new long[2];
        this.c = jArr;
        this.i = bVar;
        this.a = stopwatchView;
        this.b = recognitionView;
        recognitionView.setRecognitionListener(this);
        this.g = Collections.singletonList(Gesture.VICTORY);
        Arrays.fill(jArr, -1L);
        this.j = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        if (this.l || !this.i.s) {
            return;
        }
        if (this.s && b() != Answers.FIRST) {
            this.j.postDelayed(new o93(this, 17), 250L);
            return;
        }
        this.s = false;
        if (this.l) {
            return;
        }
        e(true);
    }

    public final Answers b() {
        long currentTimeMillis = System.currentTimeMillis();
        long[] jArr = this.c;
        if (currentTimeMillis - jArr[0] > 250) {
            jArr[0] = -1;
            jArr[1] = -1;
        }
        long j = jArr[1];
        return j != -1 ? jArr[0] - j < 150 ? Answers.FIRST : Answers.YES : Answers.NO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, ru.ok.gl.tf.factory.HandRecognitionFactory$RecognitionMode] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, ru.ok.gl.tf.factory.HandRecognitionFactory$RecognitionMode] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, ru.ok.gl.tf.factory.HandRecognitionFactory$RecognitionMode] */
    public final void c() {
        boolean z;
        boolean z2;
        boolean z3;
        TensorflowModel[] tensorflowModelArr;
        Ref$ObjectRef ref$ObjectRef;
        boolean z4;
        boolean z5;
        boolean z6 = this.n;
        this.u = z6 || this.l || this.t > 0 || this.o || this.p || this.q || this.r || this.w || this.v;
        b bVar = this.i;
        boolean z7 = this.m && (!this.l || this.k);
        if (!z6) {
            boolean z8 = this.l;
        }
        int max = Math.max(this.t, 0);
        boolean z9 = this.o;
        boolean z10 = this.p;
        boolean z11 = this.q;
        boolean z12 = this.r;
        boolean z13 = this.v;
        boolean z14 = this.w;
        boolean z15 = this.x;
        boolean z16 = this.y;
        boolean z17 = this.z;
        TensorflowModel[] tensorflowModelArr2 = this.B;
        bVar.getClass();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = HandRecognitionFactory.RecognitionMode.DEFAULT;
        EffectRegistry.EffectId effectId = bVar.p0;
        if (effectId == EffectRegistry.EffectId.CANDLE) {
            ref$ObjectRef2.element = HandRecognitionFactory.RecognitionMode.DRAWING;
        } else if (effectId == EffectRegistry.EffectId.SPEEDRUN) {
            ref$ObjectRef2.element = HandRecognitionFactory.RecognitionMode.GESTURE_GAME;
        }
        if (tensorflowModelArr2 != null) {
            L.e("Want models " + Arrays.toString(tensorflowModelArr2));
            int length = tensorflowModelArr2.length;
            int i = 0;
            while (i < length) {
                TensorflowModel tensorflowModel = tensorflowModelArr2[i];
                z = z15;
                Tensorflow tensorflow = bVar.M;
                if (tensorflow != null && tensorflow.isMorphingGpued(tensorflowModel)) {
                    i++;
                    z15 = z;
                }
                z5 = false;
                break;
            }
            z = z15;
            z5 = true;
            if (z5) {
                z2 = z16;
                z3 = z17;
                tensorflowModelArr = tensorflowModelArr2;
                ref$ObjectRef = ref$ObjectRef2;
                z4 = z14;
                y930 y930Var = bVar.r;
                if (y930Var != null) {
                    y930Var.e();
                }
            } else {
                y930 y930Var2 = bVar.r;
                if (y930Var2 != null) {
                    tensorflowModelArr = tensorflowModelArr2;
                    boolean z18 = z;
                    vw70 vw70Var = new vw70(bVar, z7, max, z9, z10, z11, z12, z13, z14, ref$ObjectRef2, z18, z16, z17);
                    ref$ObjectRef = ref$ObjectRef2;
                    z3 = z17;
                    z4 = z14;
                    z2 = z16;
                    z = z18;
                    y930Var2.c(tensorflowModelArr, vw70Var, new aad(9));
                } else {
                    z2 = z16;
                    z3 = z17;
                    tensorflowModelArr = tensorflowModelArr2;
                    ref$ObjectRef = ref$ObjectRef2;
                    z4 = z14;
                }
                bVar.N0 = tensorflowModelArr;
                ThreadHelper.queueOnMain(new sj1(bVar, 11));
            }
        } else {
            z = z15;
            z2 = z16;
            z3 = z17;
            tensorflowModelArr = tensorflowModelArr2;
            ref$ObjectRef = ref$ObjectRef2;
            z4 = z14;
            z5 = false;
        }
        boolean z19 = z7;
        Tensorflow tensorflow2 = bVar.M;
        if (tensorflow2 != null) {
            tensorflow2.changeSettings(z19, max, z9, z10, z11, z12, z13, z4, (HandRecognitionFactory.RecognitionMode) ref$ObjectRef.element, z, z2, z3, z5 ? tensorflowModelArr : null);
        }
        bVar.L0 = max > 0 || z11 || z12;
    }

    public final void d(EffectRegistry effectRegistry, EffectRegistry.EffectId effectId, boolean z, DynamicRequirements dynamicRequirements) {
        String[] strArr;
        Long effectHandle = effectRegistry.getEffectHandle(effectId);
        int i = dynamicRequirements != null ? dynamicRequirements.numFacesRequired : -1;
        this.t = i < 0 ? (effectRegistry.inputFaceMeshesRequired(effectHandle) || effectRegistry.inputFacesRequired(effectHandle)) ? 1 : 0 : i;
        this.o = effectRegistry.inputFullSegmentationRequired(effectHandle) || (dynamicRequirements != null && dynamicRequirements.personSegmentationRequired);
        this.p = effectRegistry.inputSkySegmentationRequired(effectHandle);
        this.q = effectRegistry.inputCatFaceRequired(effectHandle);
        this.r = effectRegistry.inputMorphingRequired(effectHandle);
        this.l = effectRegistry.inputGesturesRequired(effectHandle) || (dynamicRequirements != null && dynamicRequirements.gesturesRequired);
        this.v = effectRegistry.inputWhitePatternMatchRequired(effectHandle);
        this.w = effectRegistry.inputBlackPatternMatchRequired(effectHandle);
        this.x = effectRegistry.smallSegmentationRequired(effectHandle);
        this.y = effectRegistry.inputSolvePnpAnglesRequired(effectHandle);
        this.z = effectRegistry.inputFace3DMeshesRequired(effectHandle) && i != 0;
        this.n = z;
        if (dynamicRequirements != null && (strArr = dynamicRequirements.modelsRequired) != null) {
            try {
                this.B = (TensorflowModel[]) Arrays.stream(strArr).map(new s9z0()).map(new uot()).toArray(new vot());
            } catch (Exception e) {
                L.l("GesturedRecording", "Unknown model " + Arrays.toString(dynamicRequirements.modelsRequired) + "\n" + e);
            }
        }
        c();
    }

    public final void e(boolean z) {
        this.m = z;
        c();
    }

    public final void f() {
        b bVar = this.i;
        StopwatchView stopwatchView = this.a;
        this.A = false;
        if (stopwatchView.getVisibility() == 0) {
            e(true);
            stopwatchView.c();
            return;
        }
        if (!bVar.s) {
            this.s = true;
            e(false);
            this.c[0] = System.currentTimeMillis();
            stopwatchView.b();
            return;
        }
        bVar.g0 = System.currentTimeMillis();
        a aVar = bVar.h;
        if (aVar != null) {
            aVar.stopRecording();
        }
        StopwatchView stopwatchView2 = bVar.b0;
        if (stopwatchView2 != null) {
            stopwatchView2.setVisibility(8);
        }
        e(true);
    }

    public final void g() {
        this.A = false;
    }

    public final void h() {
        this.j.removeCallbacksAndMessages(null);
        this.b.setRecognitionListener(null);
    }

    public final void i(boolean z) {
        this.k = z;
        c();
    }

    public final void j() {
        this.A = true;
        RecognitionView recognitionView = this.b;
        if (recognitionView.h) {
            return;
        }
        if (!recognitionView.q) {
            recognitionView.s = true;
            recognitionView.setVisibility(0);
            recognitionView.s = false;
        }
        recognitionView.h = true;
        recognitionView.r.start();
    }

    public final boolean k() {
        return this.u;
    }

    public final void l(boolean z, boolean z2) {
        if (this.n != z) {
            this.n = z;
            this.b.setRecognitionsVisibility(z2);
            c();
        }
    }
}
