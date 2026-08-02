package com.vk.libvideo.bottomsheet.about;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.libvideo.bottomsheet.about.TopVideoBottomSheetCallback;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import xsna.ali0;
import xsna.b6l;
import xsna.bpn0;
import xsna.dw20;
import xsna.k6s0;
import xsna.l6s0;
import xsna.msy;
import xsna.nw20;
import xsna.p6s0;
import xsna.s3q0;
import xsna.s5;
import xsna.spj;
import xsna.t5;
import xsna.wzs;

/* compiled from: AboutVideoBottomSheetCallbackHolder.kt */
/* loaded from: classes2.dex */
public final class a implements l6s0 {
    public final Context b;
    public final dw20 c;
    public boolean d;
    public final bpn0 e = new bpn0(new s5(this, 0));
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new t5(this, 0));

    /* compiled from: AboutVideoBottomSheetCallbackHolder.kt */
    /* renamed from: com.vk.libvideo.bottomsheet.about.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1212a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TopVideoBottomSheetCallback.Action.values().length];
            try {
                iArr[TopVideoBottomSheetCallback.Action.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TopVideoBottomSheetCallback.Action.Dragging.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TopVideoBottomSheetCallback.Action.Cancel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TopVideoBottomSheetCallback.Action.BackPress.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TopVideoBottomSheetCallback.Action.DismissWithSwipe.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AboutVideoBottomSheetCallbackHolder.kt */
    @b6l(c = "com.vk.libvideo.bottomsheet.about.AboutVideoBottomSheetCallbackHolder$rootView$2$1", f = "AboutVideoBottomSheetCallbackHolder.kt", l = {28}, m = "invokeSuspend")
    public static final class b extends RestrictedSuspendLambda implements wzs<ali0<? super View>, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = a.this.new b(spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(ali0<? super View> ali0Var, spj<? super s3q0> spjVar) {
            return ((b) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0035 -> B:5:0x0038). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ViewGroup Ln;
            View view;
            ali0 ali0Var = (ali0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                Ln = a.this.c.Ln();
                view = Ln;
                if (view == null) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                view = (View) this.L$1;
                kotlin.a.a(obj);
                Ln = null;
                Object parent = view == null ? view.getParent() : null;
                if (parent instanceof View) {
                    view = (View) parent;
                    if (view == null) {
                        return s3q0.a;
                    }
                    this.L$0 = ali0Var;
                    this.L$1 = view;
                    this.label = 1;
                    if (ali0Var.a(view, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Ln = null;
                    if (view == null) {
                    }
                    if (parent instanceof View) {
                    }
                }
                view = Ln;
                if (view == null) {
                }
            }
        }
    }

    /* compiled from: AboutVideoBottomSheetCallbackHolder.kt */
    public static final class c extends p6s0 {
        public c(l6s0[] l6s0VarArr) {
            super(l6s0VarArr);
        }

        @Override // xsna.p6s0, xsna.k6s0, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void a(View view, float f) {
            if (a.this.d) {
                super.a(view, f);
            }
        }

        @Override // xsna.p6s0, xsna.k6s0, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void b(int i, View view) {
            View view2;
            a aVar = a.this;
            if (aVar.d) {
                super.b(i, view);
                return;
            }
            if (i != 5 || (view2 = (View) aVar.e.getValue()) == null) {
                return;
            }
            Dialog dialog = aVar.c.s;
            nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
            if (nw20Var == null) {
                return;
            }
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = nw20Var.i;
            super.b(modalBottomSheetBehavior != null ? modalBottomSheetBehavior.k : 5, view2);
        }
    }

    public a(Context context, dw20 dw20Var) {
        this.b = context;
        this.c = dw20Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.l6s0
    public final k6s0 Y4() {
        return (k6s0) this.f.getValue();
    }
}
