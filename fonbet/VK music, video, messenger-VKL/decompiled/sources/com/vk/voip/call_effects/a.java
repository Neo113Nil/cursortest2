package com.vk.voip.call_effects;

import android.app.Activity;
import com.vk.core.apps.BuildInfo;
import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.core.dynamic_loader.b;
import com.vk.log.L;
import com.vk.ml.api.tf.TensorflowFacade;
import com.vk.movika.sdk.base.model.e;
import com.vk.voip.call_effects.CallEffectsDependency;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.subjects.d;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.gl.tf.TensorflowFaceLandmarksType;
import ru.ok.gl.tf.TensorflowSegmentationType;
import xsna.c39;
import xsna.d1d;
import xsna.d60;
import xsna.izs;
import xsna.krw0;
import xsna.kta;
import xsna.m20;
import xsna.o2l;
import xsna.qcy;
import xsna.rf1;
import xsna.s3q0;
import xsna.v29;
import xsna.vpo;
import xsna.za;

/* compiled from: CallEffectsDependencyImpl.kt */
/* loaded from: classes7.dex */
public final class a implements CallEffectsDependency {
    public final d1d a;
    public final c39 b;
    public final krw0 c;
    public final TensorflowFacade d;
    public io.reactivex.rxjava3.disposables.c e;
    public final d<CallEffectsDependency.DynamicLibsState> f = d.O0(CallEffectsDependency.DynamicLibsState.NOT_LOADED);

    /* compiled from: CallEffectsDependencyImpl.kt */
    /* renamed from: com.vk.voip.call_effects.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2005a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TensorflowFacade.OkEngineConfig.values().length];
            try {
                iArr[TensorflowFacade.OkEngineConfig.GPU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TensorflowFacade.OkEngineConfig.CPU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TensorflowFacade.OkEngineConfig.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CallEffectsDependencyImpl.kt */
    public static final class b implements izs {
        public final /* synthetic */ Activity b;

        public b(Activity activity) {
            this.b = activity;
        }

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            if (obj instanceof b.AbstractC0762b.C0763b) {
                ((b.AbstractC0762b.C0763b) obj).a.invoke(this.b);
            }
            return s3q0.a;
        }
    }

    /* compiled from: CallEffectsDependencyImpl.kt */
    public static final class c implements izs {
        public c() {
        }

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            a.this.f.onNext(CallEffectsDependency.DynamicLibsState.LOADING);
            return s3q0.a;
        }
    }

    public a(d1d d1dVar, c39 c39Var, krw0 krw0Var, TensorflowFacade tensorflowFacade) {
        this.a = d1dVar;
        this.b = c39Var;
        this.c = krw0Var;
        this.d = tensorflowFacade;
    }

    @Override // com.vk.voip.call_effects.CallEffectsDependency
    public final boolean a() {
        try {
            kta ktaVar = this.b.e;
            qcy<Object> qcyVar = c39.g[0];
            return ktaVar.a().isReady();
        } catch (Exception e) {
            L.i(e);
            return false;
        }
    }

    @Override // com.vk.voip.call_effects.CallEffectsDependency
    public final void b() {
        this.c.a();
    }

    @Override // com.vk.voip.call_effects.CallEffectsDependency
    public final boolean c() {
        return this.f.P0() == CallEffectsDependency.DynamicLibsState.LOADED;
    }

    @Override // com.vk.voip.call_effects.CallEffectsDependency
    public final void d(Activity activity) {
        q T;
        o2l.a.getClass();
        int i = 0;
        boolean b2 = o2l.b("__dbg_voip_call_effects_dynamic_debug_enabled_", false);
        boolean b3 = o2l.b("__dbg_call_effects_dynamic_debug_err_resp_enabled_", false);
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar == null) {
            if (BuildInfo.k()) {
                T = q.T(CallEffectsDependency.DynamicLibsState.LOADED);
            } else if (BuildInfo.o() && BuildInfo.h) {
                vpo vpoVar = com.vk.core.dynamic_loader.b.a;
                T = com.vk.core.dynamic_loader.b.h(DynamicTask.CALL_EFFECTS);
            } else if (b2) {
                LinkedHashSet linkedHashSet = com.vk.core.dynamic_loader.a.a;
                T = com.vk.core.dynamic_loader.a.a(DynamicTask.CALL_EFFECTS, b3);
            } else {
                T = q.T(CallEffectsDependency.DynamicLibsState.LOADED);
            }
            int i2 = 8;
            m20 m20Var = new m20(new b(activity), i2);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            cVar = T.E(m20Var, lVar, kVar, kVar).E(lVar, lVar, kVar, new v29(this, i)).C(new d60(1)).subscribe(io.reactivex.rxjava3.kotlin.c.a(new c()), io.reactivex.rxjava3.kotlin.c.c(new za(this, 12)), io.reactivex.rxjava3.kotlin.c.b(new e(this, i2)));
        }
        this.e = cVar;
    }

    @Override // com.vk.voip.call_effects.CallEffectsDependency
    public final d e() {
        return this.f;
    }

    @Override // com.vk.voip.call_effects.CallEffectsDependency
    public final TensorflowFaceLandmarksType f() {
        return ((Boolean) this.a.invoke()).booleanValue() ? this.d.e() : TensorflowFaceLandmarksType.DEFAULT_FACE_LANDMARKS;
    }

    @Override // com.vk.voip.call_effects.CallEffectsDependency
    public final boolean g() {
        return this.d.d();
    }

    @Override // com.vk.voip.call_effects.CallEffectsDependency
    public final TensorflowSegmentationType getTensorflowSegmentationType() {
        return ((Boolean) this.a.invoke()).booleanValue() ? this.d.b() : TensorflowSegmentationType.OLD_SEGMENTATION;
    }

    @Override // com.vk.voip.call_effects.CallEffectsDependency
    public final rf1 h() {
        return new rf1(this, 6);
    }

    public final CallEffectsDependency.TensorflowMode i() {
        int i = C2005a.$EnumSwitchMapping$0[this.d.a().ordinal()];
        if (i == 1) {
            return CallEffectsDependency.TensorflowMode.GPU;
        }
        if (i == 2) {
            return CallEffectsDependency.TensorflowMode.CPU;
        }
        if (i == 3) {
            return CallEffectsDependency.TensorflowMode.OFF;
        }
        throw new NoWhenBranchMatchedException();
    }
}
