package com.vk.photo.editor;

import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.j;
import com.ironsource.InterfaceC4413l1;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.tools.controls.seekbar.f;
import com.vk.movika.tools.controls.seekbar.g;
import com.vk.photo.editor.domain.LowMemoryException;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.ivm.d;
import com.vk.photo.editor.views.DispatchTouchFrameLayout;
import com.vk.photo.editor.views.ToolButton;
import com.vk.photo.editor.views.zoom.ZoomContentLayout;
import com.vk.photo.editor.views.zoom.ZoomRootLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.ag5;
import xsna.az2;
import xsna.b010;
import xsna.b6l;
import xsna.ba00;
import xsna.bdn;
import xsna.bi80;
import xsna.bkp0;
import xsna.bok;
import xsna.bpn0;
import xsna.c5g;
import xsna.c5p;
import xsna.c7y0;
import xsna.cf00;
import xsna.ct10;
import xsna.cy3;
import xsna.cyt0;
import xsna.d4p;
import xsna.d5p;
import xsna.d7y0;
import xsna.dne;
import xsna.dy0;
import xsna.e4p;
import xsna.edi;
import xsna.edr;
import xsna.ep6;
import xsna.epx;
import xsna.f370;
import xsna.f5p;
import xsna.f7a0;
import xsna.fpf0;
import xsna.fqd;
import xsna.fyt0;
import xsna.g020;
import xsna.g4p;
import xsna.g5g;
import xsna.g5p;
import xsna.g5z;
import xsna.g7a0;
import xsna.g7y0;
import xsna.ge00;
import xsna.gzs;
import xsna.h18;
import xsna.h4x;
import xsna.h7a0;
import xsna.haa0;
import xsna.hd80;
import xsna.hif0;
import xsna.hv2;
import xsna.i1f;
import xsna.i4p;
import xsna.ie00;
import xsna.izs;
import xsna.j4x;
import xsna.j5g;
import xsna.j7a0;
import xsna.jgp;
import xsna.k7a0;
import xsna.kij;
import xsna.kkw;
import xsna.knj;
import xsna.l290;
import xsna.l3p;
import xsna.ld7;
import xsna.m4p;
import xsna.m6y0;
import xsna.maa0;
import xsna.mg;
import xsna.mg00;
import xsna.mv10;
import xsna.myc0;
import xsna.n4p;
import xsna.n5p;
import xsna.n6y0;
import xsna.nrk0;
import xsna.nv10;
import xsna.otk0;
import xsna.ov10;
import xsna.p290;
import xsna.q44;
import xsna.qbk;
import xsna.qcy;
import xsna.qij;
import xsna.qp4;
import xsna.r4p;
import xsna.rfc;
import xsna.rij;
import xsna.rl3;
import xsna.rsr;
import xsna.s020;
import xsna.s3q0;
import xsna.spj;
import xsna.t6y0;
import xsna.tn0;
import xsna.ttk0;
import xsna.tu80;
import xsna.u020;
import xsna.u4z;
import xsna.ue40;
import xsna.uik;
import xsna.utk0;
import xsna.v0g;
import xsna.vtk0;
import xsna.vyt0;
import xsna.w3p;
import xsna.wgl;
import xsna.wyt0;
import xsna.wzs;
import xsna.x3p;
import xsna.xdl;
import xsna.xqo0;
import xsna.xxh;
import xsna.ybq;
import xsna.yhk;
import xsna.yvj;
import xsna.z6y0;
import xsna.zdl;
import xsna.zf00;

/* compiled from: PhotoEditorView.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes4.dex */
public final class PhotoEditorView extends u4z {
    public static final /* synthetic */ int c0 = 0;
    public final n5p A;
    public hv2 B;
    public boolean C;
    public cy3 D;
    public j7a0 E;
    public wyt0 F;
    public m4p G;
    public final utk0 H;
    public final utk0 I;
    public final utk0 J;
    public final utk0 K;
    public final utk0 L;
    public final Matrix M;
    public final Matrix N;
    public final hif0 O;
    public final RectF P;
    public final RectF Q;
    public final m6y0 R;
    public z6y0 S;
    public final d7y0 T;
    public final c7y0 U;
    public f5p V;
    public i4p W;
    public boolean a0;
    public h4x b0;
    public final w3p c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final FrameLayout g;
    public final bpn0 h;
    public final View i;
    public final TextView j;
    public final ZoomRootLayout k;
    public final FrameLayout l;
    public final FrameLayout m;
    public final FrameLayout n;
    public final FrameLayout o;
    public final FrameLayout p;
    public final FrameLayout q;
    public final ViewGroup r;
    public final int s;
    public final LinearLayout t;
    public final FrameLayout u;
    public final View v;
    public final View w;
    public final ImageButton x;
    public final ImageButton y;
    public final qij z;

    /* compiled from: PhotoEditorView.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            PhotoEditorView.F((PhotoEditorView) this.receiver);
            return s3q0.a;
        }
    }

    /* compiled from: PhotoEditorView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EditorState.ErrorType.values().length];
            try {
                iArr[EditorState.ErrorType.LowMemoryError.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EditorState.ErrorType.RenderError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PhotoEditorView.kt */
    @b6l(c = "com.vk.photo.editor.PhotoEditorView$renderResultImage$1", f = "PhotoEditorView.kt", l = {InterfaceC4413l1.a.b.g, 430}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        Object L$0;
        int label;

        /* compiled from: PhotoEditorView.kt */
        @b6l(c = "com.vk.photo.editor.PhotoEditorView$renderResultImage$1$1", f = "PhotoEditorView.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int label;
            final /* synthetic */ PhotoEditorView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PhotoEditorView photoEditorView, spj<? super a> spjVar) {
                super(2, spjVar);
                this.this$0 = photoEditorView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new a(this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                PhotoEditorView photoEditorView = this.this$0;
                photoEditorView.L(photoEditorView.getContext().getString(R.string.editor_render_error), 3000L, null);
                return s3q0.a;
            }
        }

        public c(spj<? super c> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return PhotoEditorView.this.new c(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x011b, code lost:
        
            if (xsna.myc0.k(r0, r4, r33) != r2) goto L52;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
            } catch (LowMemoryException e) {
                n4p logger = PhotoEditorView.this.getLogger();
                if (logger != null) {
                    logger.a(e);
                }
                m4p m4pVar = PhotoEditorView.this.G;
                if (m4pVar != null) {
                    m4pVar.onLowMemory();
                }
            } catch (Exception e2) {
                n4p logger2 = PhotoEditorView.this.getLogger();
                if (logger2 != null) {
                    logger2.a(e2);
                }
                bdn bdnVar = bdn.a;
                ge00 ge00Var = ie00.a;
                a aVar = new a(PhotoEditorView.this, null);
                this.L$0 = null;
                this.label = 2;
            } catch (Throwable th) {
                n4p logger3 = PhotoEditorView.this.getLogger();
                if (logger3 != null) {
                    logger3.a(th);
                }
                throw th;
            }
            if (i == 0) {
                kotlin.a.a(obj);
                w3p w3pVar = PhotoEditorView.this.c;
                zdl zdlVar = w3pVar.p;
                i4p i4pVar = ((EditorState) w3pVar.o.b.b.getValue()).a;
                if (i4pVar == null) {
                    return s3q0.a;
                }
                Map<f5p, g5p> map = ((EditorState) PhotoEditorView.this.c.o.b.b.getValue()).b;
                Integer num = new Integer(PhotoEditorView.this.c.n);
                this.label = 1;
                a2 = zdlVar.a(i4pVar, map, num, this);
                if (a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                kotlin.a.a(obj);
                a2 = obj;
            }
            ld7 ld7Var = a2 instanceof ld7 ? (ld7) a2 : null;
            if (ld7Var == null) {
                return s3q0.a;
            }
            Bitmap bitmap = ld7Var.a;
            if (!epx.f(PhotoEditorView.this.I.getValue(), ld7Var)) {
                utk0 utk0Var = PhotoEditorView.this.I;
                utk0Var.getClass();
                utk0Var.i(null, ld7Var);
                PhotoEditorView.this.c.r.b(new zf00.b(maa0.a(new haa0(false, false, false, (Integer) null, (Integer) null, false, (Integer) null, false, (String) null, (Integer) null, (CropStatEvent.Format) null, (String) null, (Integer) null, (Integer) null, (String) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, bitmap.getHeight(), bitmap.getWidth(), (List) null, (List) null, false, 15204351), ((EditorState) PhotoEditorView.this.c.o.b.b.getValue()).b)));
            }
            return s3q0.a;
        }
    }

    public PhotoEditorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static void F(PhotoEditorView photoEditorView) {
        photoEditorView.E((EditorState) photoEditorView.getStore().b.b.getValue());
    }

    public static void J(PhotoEditorView photoEditorView, g4p g4pVar) {
        float width = g4pVar.getWidth() / g4pVar.getHeight();
        i4p i4pVar = new i4p(g4pVar, (e4p) null, 6);
        Object obj = photoEditorView.c.c.get(u020.a);
        s020 s020Var = obj instanceof s020 ? (s020) obj : null;
        if (s020Var != null) {
            Float valueOf = Float.valueOf(width);
            kkw kkwVar = s020Var.e;
            if (kkwVar != null) {
                kkwVar.setCustomAspectRatio(valueOf);
            }
            photoEditorView.i.setVisibility((g4pVar.getWidth() > 4032 || g4pVar.getHeight() > 4032) ? 0 : 8);
            s020Var.B(i4pVar);
        }
        j7a0 j7a0Var = photoEditorView.E;
        if (j7a0Var == null) {
            j7a0Var = null;
        }
        d dVar = j7a0Var.c;
        (dVar != null ? dVar : null).a(new EditorMessage.f(i4pVar, jgp.b, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r0 != 3) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r6v8, types: [T, java.lang.Float] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(PhotoEditorView photoEditorView, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, MotionEvent motionEvent) {
        boolean z;
        d5p<g5p> currentTool = photoEditorView.getCurrentTool();
        if (currentTool == null || !currentTool.o()) {
            photoEditorView.A.getClass();
            Boolean bool = (Boolean) l3p.b.get("resizing");
            if (!(bool != null ? bool.booleanValue() : false) && photoEditorView.u((EditorState) photoEditorView.getStore().b.b.getValue())) {
                z = false;
                if (!z) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        if (photoEditorView.B == null) {
                            hv2 hv2Var = new hv2(photoEditorView, 10);
                            photoEditorView.getMainHandler().postDelayed(hv2Var, 100L);
                            photoEditorView.B = hv2Var;
                        }
                        ref$ObjectRef.element = Float.valueOf(motionEvent.getX());
                        ref$ObjectRef2.element = Float.valueOf(motionEvent.getY());
                        return true;
                    }
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            Float f = (Float) ref$ObjectRef.element;
                            Float f2 = (Float) ref$ObjectRef2.element;
                            if (f != null && f2 != null) {
                                float x = motionEvent.getX() - f.floatValue();
                                float y = motionEvent.getY() - f2.floatValue();
                                if (((float) Math.sqrt((y * y) + (x * x))) >= ((int) Math.floor(1 * Resources.getSystem().getDisplayMetrics().density))) {
                                    hv2 hv2Var2 = photoEditorView.B;
                                    if (hv2Var2 != null) {
                                        photoEditorView.getMainHandler().removeCallbacks(hv2Var2);
                                        photoEditorView.B = null;
                                    }
                                    if (photoEditorView.C) {
                                        photoEditorView.C = false;
                                        photoEditorView.x(false);
                                    }
                                }
                            }
                            ref$ObjectRef.element = Float.valueOf(motionEvent.getX());
                            ref$ObjectRef2.element = Float.valueOf(motionEvent.getY());
                            return false;
                        }
                    }
                    hv2 hv2Var3 = photoEditorView.B;
                    if (hv2Var3 != null) {
                        photoEditorView.getMainHandler().removeCallbacks(hv2Var3);
                        photoEditorView.B = null;
                    }
                    if (photoEditorView.C) {
                        photoEditorView.C = false;
                        photoEditorView.x(false);
                    }
                }
                return false;
            }
        }
        z = true;
        if (!z) {
        }
        return false;
    }

    public static s3q0 b(PhotoEditorView photoEditorView, f5p f5pVar) {
        if (photoEditorView.getCurrentTool() != null) {
            if (f5pVar == null) {
                photoEditorView.N(null);
            }
            photoEditorView.c.b = null;
        }
        if (f5pVar != null) {
            photoEditorView.A(f5pVar);
        }
        return s3q0.a;
    }

    public static s3q0 c(PhotoEditorView photoEditorView) {
        photoEditorView.getStore().a(EditorMessage.a.a);
        return s3q0.a;
    }

    public static s3q0 d(PhotoEditorView photoEditorView) {
        F(photoEditorView);
        Iterator it = photoEditorView.getMediaPropertiesProvider().b.iterator();
        while (it.hasNext()) {
            ((nv10.a) it.next()).b();
        }
        return s3q0.a;
    }

    public static s3q0 e(PhotoEditorView photoEditorView, d5p d5pVar) {
        qij qijVar = photoEditorView.z;
        qijVar.g = rij.e;
        d5p<g5p> currentTool = photoEditorView.getCurrentTool();
        if (currentTool != null) {
            currentTool.p();
        }
        if (d5pVar != null) {
            qijVar.g = d5pVar.m();
            d5pVar.k();
        }
        boolean z = d5pVar == null;
        fyt0.o(photoEditorView.v, z);
        fyt0.o(photoEditorView.u, z);
        photoEditorView.N(d5pVar);
        return s3q0.a;
    }

    public static s3q0 f(PhotoEditorView photoEditorView, f5p f5pVar) {
        photoEditorView.z.g = rij.e;
        d5p<g5p> currentTool = photoEditorView.getCurrentTool();
        if (currentTool != null) {
            currentTool.p();
        }
        boolean z = f5pVar == null;
        fyt0.o(photoEditorView.v, z);
        fyt0.o(photoEditorView.u, z);
        return s3q0.a;
    }

    public static ToolButton g(PhotoEditorView photoEditorView, f5p f5pVar, Context context) {
        d5p<g5p> d5pVar = photoEditorView.getTools().get(f5pVar);
        if (d5pVar != null) {
            return d5pVar.s(context);
        }
        return null;
    }

    private final boolean getCompleteInit() {
        return this.c.w;
    }

    private final d5p<g5p> getCurrentTool() {
        return this.c.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n4p getLogger() {
        return this.c.u;
    }

    private final Handler getMainHandler() {
        return (Handler) this.h.getValue();
    }

    private final ov10 getMediaPropertiesProvider() {
        return this.c.q;
    }

    private final nrk0 getStatConsumerProxy() {
        return this.c.r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d getStore() {
        return this.c.o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<f5p, d5p<g5p>> getTools() {
        return this.c.c;
    }

    public static void h(PhotoEditorView photoEditorView) {
        Iterator<Map.Entry<f5p, d5p<g5p>>> it = photoEditorView.getTools().entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().n()) {
                return;
            }
        }
        j7a0 j7a0Var = photoEditorView.E;
        if (j7a0Var == null) {
            j7a0Var = null;
        }
        d dVar = j7a0Var.c;
        (dVar != null ? dVar : null).a(EditorMessage.g.a);
        photoEditorView.c.r.b(zf00.c.a);
    }

    public static final s3q0 i(PhotoEditorView photoEditorView, x3p x3pVar) {
        photoEditorView.getClass();
        if (!(x3pVar instanceof x3p.a)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z = ((x3p.a) x3pVar).a;
        LinearLayout linearLayout = photoEditorView.t;
        if (!photoEditorView.getCompleteInit()) {
            boolean z2 = photoEditorView.a0;
            photoEditorView.a0 = z;
            photoEditorView.i.setVisibility(z ? 0 : 8);
            linearLayout.animate().alpha(z ? 0.3f : 1.0f).setDuration(200L).start();
            fyt0.l(linearLayout, !z);
            if (z2 != photoEditorView.a0) {
                photoEditorView.c.w = true;
                Iterator<T> it = photoEditorView.getTools().values().iterator();
                while (it.hasNext()) {
                    ((d5p) it.next()).q();
                }
                f5p f5pVar = photoEditorView.V;
                if (f5pVar != null) {
                    photoEditorView.B(f5pVar, false);
                }
                photoEditorView.D((EditorState) photoEditorView.getStore().b.b.getValue());
                qij qijVar = photoEditorView.z;
                qijVar.getClass();
                qijVar.e(kij.b, true);
                View view = qijVar.b;
                View view2 = qijVar.c;
                int measuredWidth = view2.getMeasuredWidth();
                int measuredHeight = view2.getMeasuredHeight();
                dne dneVar = new dne(qijVar, 12);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(measuredWidth, measuredHeight);
                }
                layoutParams.width = measuredWidth;
                layoutParams.height = measuredHeight;
                view.setLayoutParams(layoutParams);
                if (view.getMeasuredHeight() == measuredHeight && view.getMeasuredWidth() == measuredWidth) {
                    dneVar.invoke();
                } else {
                    fyt0.c(view, new cyt0(view, measuredHeight, measuredWidth, dneVar));
                }
            }
        }
        return s3q0.a;
    }

    public static final void m(PhotoEditorView photoEditorView, EditorState.a aVar) {
        String e;
        photoEditorView.getClass();
        boolean z = aVar.a;
        EditorState.b bVar = aVar.c;
        EditorState.b bVar2 = aVar.b;
        f5p f5pVar = z ? bVar2.b : bVar.b;
        d5p<g5p> d5pVar = photoEditorView.getTools().get(f5pVar);
        if (d5pVar == null) {
            e = null;
        } else {
            g5p g5pVar = bVar2.c.get(f5pVar);
            g5p g5pVar2 = bVar.c.get(f5pVar);
            e = z ? d5pVar.e(g5pVar, g5pVar2) : d5pVar.r(g5pVar, g5pVar2);
        }
        if (e == null) {
            return;
        }
        if (z) {
            ImageButton imageButton = photoEditorView.y;
            imageButton.setContentDescription(e);
            imageButton.sendAccessibilityEvent(8);
            imageButton.setContentDescription(imageButton.getResources().getString(R.string.editor_undo));
        } else {
            ImageButton imageButton2 = photoEditorView.x;
            imageButton2.setContentDescription(e);
            imageButton2.sendAccessibilityEvent(8);
            imageButton2.setContentDescription(imageButton2.getResources().getString(R.string.editor_redo));
        }
        photoEditorView.L(e, 1300L, new b010(photoEditorView, 23));
    }

    public static void n(PhotoEditorView photoEditorView, f5p f5pVar, f5p[] f5pVarArr) {
        w3p w3pVar = photoEditorView.c;
        LinkedHashMap linkedHashMap = w3pVar.e;
        LinkedHashMap linkedHashMap2 = w3pVar.k;
        linkedHashMap.put(f5pVar, new ue40(5, photoEditorView, f5pVar));
        Set y0 = rl3.y0(f5pVarArr);
        linkedHashMap2.put(f5pVar, y0);
        Set<f5p> set = y0;
        for (f5p f5pVar2 : set) {
            Set R0 = j5g.R0(set);
            R0.remove(f5pVar2);
            R0.add(f5pVar);
            linkedHashMap2.put(f5pVar2, R0);
        }
    }

    public final void A(f5p f5pVar) {
        if (getCompleteInit()) {
            B(f5pVar, true);
        }
    }

    public final void B(f5p f5pVar, boolean z) {
        ToolButton toolButton;
        w3p w3pVar = this.c;
        HashMap<f5p, String> hashMap = w3pVar.f;
        LinkedHashMap<f5p, ToolButton> linkedHashMap = w3pVar.j;
        if (hashMap.containsKey(f5pVar)) {
            L(w3pVar.f.get(f5pVar), 2000L, null);
            return;
        }
        d5p<g5p> d5pVar = getTools().get(f5pVar);
        d5p<g5p> currentTool = getCurrentTool();
        if (currentTool != null) {
            ToolButton toolButton2 = linkedHashMap.get(currentTool.getId());
            if (toolButton2 != null) {
                toolButton2.f.setVisibility(toolButton2.g ? 0 : 4);
            }
            currentTool.C();
            w3pVar.l.add(currentTool.getId());
        }
        if (d5pVar != null && (toolButton = linkedHashMap.get(d5pVar.getId())) != null) {
            toolButton.g = toolButton.f.getVisibility() == 0;
        }
        boolean z2 = d5pVar instanceof g7y0;
        c7y0 c7y0Var = this.U;
        m6y0 m6y0Var = this.R;
        if (z2) {
            if (!(this.S instanceof z6y0.a)) {
                n6y0 l = ((g7y0) d5pVar).l();
                m6y0Var.a(l.a);
                c7y0Var.b = l.b;
            }
        } else if (d5pVar != null) {
            m6y0Var.a(z6y0.a.a);
            ZoomRootLayout zoomRootLayout = m6y0Var.a;
            if (zoomRootLayout.getHasZoom()) {
                otk0<ZoomRootLayout.a> otk0Var = zoomRootLayout.n;
                otk0Var.b = ZoomRootLayout.a.c.a;
                AnimatorSet animatorSet = otk0Var.c;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                otk0Var.a(ZoomRootLayout.a.b.a, zoomRootLayout);
            }
        } else {
            m6y0Var.a(this.S);
            c7y0Var.b = this.T;
        }
        dy0 dy0Var = new dy0(22, this, d5pVar);
        f fVar = new f(17, this, d5pVar);
        n5p.a aVar = new n5p.a(dy0Var, fVar);
        if (!z) {
            dy0Var.invoke();
            fVar.invoke();
        } else {
            n5p n5pVar = this.A;
            n5pVar.getClass();
            l3p.a("resizing", new tn0(12, n5pVar, aVar));
        }
    }

    public final void C(d5p<? extends g5p> d5pVar) {
        kkw kkwVar;
        if (d5pVar instanceof bkp0) {
            FrameLayout frameLayout = this.m;
            View childAt = frameLayout.getChildAt(0);
            frameLayout.removeViewAt(0);
            uik t = ((bkp0) d5pVar).t(getContext(), childAt);
            this.l.addView(t.a, 0);
            frameLayout.addView(t.b, new FrameLayout.LayoutParams(-1, -1));
            yhk yhkVar = t.c;
            FrameLayout frameLayout2 = this.o;
            fyt0.a(frameLayout2, yhkVar, frameLayout2.getChildCount(), null, 4);
            frameLayout2.setStateListAnimator(null);
            frameLayout2.setLayoutAnimation(null);
        }
        boolean z = d5pVar instanceof s020;
        w3p w3pVar = this.c;
        if (z) {
            s020 s020Var = (s020) d5pVar;
            Context context = getContext();
            s020Var.getClass();
            kkw kkwVar2 = new kkw(context);
            s020Var.e = kkwVar2;
            kkwVar2.setOnAspectRatioDidUpdated(new j4x(s020Var, 9));
            w3pVar.m = kkwVar2;
            this.n.addView(kkwVar2);
            kkw kkwVar3 = w3pVar.m;
            if (kkwVar3 != null) {
                kkwVar3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            }
            kkw kkwVar4 = w3pVar.m;
            if (kkwVar4 != null) {
                fyt0.k(17, kkwVar4);
            }
        }
        if (d5pVar instanceof p290) {
            l290 x = ((p290) d5pVar).x(getContext());
            View b2 = x.b();
            if (b2 != null && (kkwVar = w3pVar.m) != null) {
                fyt0.a(kkwVar.e, b2, 0, null, 6);
            }
            View a2 = x.a();
            if (a2 != null) {
                FrameLayout frameLayout3 = this.q;
                fyt0.a(frameLayout3, a2, frameLayout3.getChildCount(), null, 4);
                fyt0.k(17, a2);
            }
            View c2 = x.c();
            if (c2 != null) {
                FrameLayout frameLayout4 = this.p;
                fyt0.a(frameLayout4, c2, frameLayout4.getChildCount(), null, 4);
                fyt0.k(17, c2);
            }
        }
        for (Map.Entry<f5p, d5p.a<?>> entry : d5pVar.E().entrySet()) {
            f5p key = entry.getKey();
            d5p.a value = entry.getValue();
            if (!w3pVar.c.keySet().contains(key)) {
                d5p<? extends g5p> a3 = value.a(w3pVar);
                w3pVar.c.put(a3.getId(), a3);
                w3pVar.g.add(a3.getId());
                C(a3);
            }
        }
    }

    public final void D(EditorState editorState) {
        Boolean bool;
        boolean z;
        w3p w3pVar = this.c;
        nrk0 nrk0Var = w3pVar.r;
        Map<f5p, g5p> map = editorState.b;
        Map<f5p, g5p> map2 = editorState.b;
        i4p i4pVar = editorState.a;
        nrk0Var.a(map);
        EditorState.ErrorType errorType = editorState.g;
        int i = errorType == null ? -1 : b.$EnumSwitchMapping$0[errorType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                m4p m4pVar = this.G;
                if (m4pVar != null) {
                    m4pVar.onLowMemory();
                    return;
                }
                return;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            L(getContext().getString(R.string.editor_render_error), 3000L, null);
        }
        if (!epx.f(i4pVar, this.W)) {
            Iterator<d5p<g5p>> it = getTools().values().iterator();
            while (it.hasNext()) {
                it.next().B(i4pVar);
            }
            this.W = i4pVar;
        }
        if (!getCompleteInit()) {
            d5p<g5p> d5pVar = getTools().get(u020.a);
            if (d5pVar != null) {
                d5pVar.D(editorState);
                g5p g5pVar = map2.get(d5pVar.getId());
                if (g5pVar != null) {
                    d5pVar.y(g5pVar);
                }
            }
            I();
            M(false);
            return;
        }
        boolean z2 = false;
        for (Map.Entry<f5p, d5p<g5p>> entry : getTools().entrySet()) {
            f5p key = entry.getKey();
            d5p<g5p> value = entry.getValue();
            value.D(editorState);
            g5p g5pVar2 = map2.get(value.getId());
            if (g5pVar2 != null) {
                value.y(g5pVar2);
            }
            g5p g5pVar3 = map2.get(key);
            if (!z2 && g5pVar3 != null && !g5pVar3.I()) {
                z2 = true;
            }
            LinkedHashMap<f5p, ToolButton> linkedHashMap = w3pVar.j;
            LinkedHashMap linkedHashMap2 = w3pVar.k;
            ToolButton toolButton = linkedHashMap.get(key);
            if (toolButton != null) {
                d5p<g5p> d5pVar2 = getTools().get(key);
                if (d5pVar2 != null) {
                    if (((Set) linkedHashMap2.get(key)) == null) {
                        EmptySet emptySet = EmptySet.b;
                    }
                    if (d5pVar2.f(toolButton, map2)) {
                    }
                }
                Set set = (Set) linkedHashMap2.get(key);
                if (set != null) {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            g5p g5pVar4 = map2.get((f5p) it2.next());
                            if (g5pVar4 != null && !g5pVar4.I()) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    bool = Boolean.valueOf(z);
                } else {
                    bool = null;
                }
                g5p g5pVar5 = map2.get(key);
                toolButton.setIndicatorActive(!(g5pVar5 == null || g5pVar5.I()) || epx.f(bool, Boolean.TRUE));
            }
        }
        E(editorState);
        Boolean valueOf = Boolean.valueOf(z2);
        utk0 utk0Var = this.K;
        utk0Var.getClass();
        utk0Var.i(null, valueOf);
        boolean z3 = editorState.b() > 0;
        ImageButton imageButton = this.y;
        imageButton.setEnabled(z3);
        boolean c2 = editorState.c();
        ImageButton imageButton2 = this.x;
        imageButton2.setEnabled(c2);
        imageButton.setAlpha(editorState.b() > 0 ? 1.0f : 0.4f);
        imageButton2.setAlpha(editorState.c() ? 1.0f : 0.4f);
        this.H.setValue(editorState.f);
    }

    public final void E(EditorState editorState) {
        I();
        ct10 ct10Var = new ct10(this.O);
        boolean z = false;
        for (Map.Entry<f5p, d5p<g5p>> entry : getTools().entrySet()) {
            f5p key = entry.getKey();
            d5p<g5p> value = entry.getValue();
            g5p g5pVar = editorState.b.get(key);
            if (g5pVar != null && (value instanceof bkp0)) {
                g020 g = ((bkp0) value).g(g5pVar, ct10Var);
                boolean z2 = g.c;
                this.M.postConcat(g.a);
                this.N.postConcat(g.b);
                RectF rectF = g.d;
                if (!rectF.isEmpty()) {
                    this.P.set(rectF);
                }
                z = z2;
            }
        }
        M(z);
    }

    public final <Params extends g5p> void G(d5p.a<Params> aVar) {
        this.c.d.add(aVar);
    }

    public final void H() {
        j a2 = g5z.a(this);
        bdn bdnVar = bdn.a;
        myc0.h(a2, wgl.c, null, new c(null), 2);
    }

    public final void I() {
        w3p w3pVar = this.c;
        float measuredWidth = w3pVar.m.getView().getMeasuredWidth();
        float measuredHeight = w3pVar.m.getView().getMeasuredHeight();
        hif0 hif0Var = this.O;
        hif0Var.a.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        hif0Var.b.set(measuredWidth, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        hif0Var.c.set(measuredWidth, measuredHeight);
        hif0Var.d.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight);
        RectF rectF = this.P;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth, measuredHeight);
        FrameLayout frameLayout = this.m;
        float measuredWidth2 = frameLayout.getMeasuredWidth();
        float measuredHeight2 = frameLayout.getMeasuredHeight();
        RectF rectF2 = this.Q;
        rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth2, measuredHeight2);
        rectF.offset(rectF2.centerX() - rectF.centerX(), rectF2.centerY() - rectF.centerY());
        this.M.reset();
        this.N.reset();
    }

    public final void K(String str) {
        TextView textView = this.j;
        textView.setVisibility(0);
        textView.setTranslationY(-20.0f);
        textView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        textView.setText(str);
        textView.animate().alpha(1.0f).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(150L).start();
    }

    public final void L(String str, long j, b010 b010Var) {
        K(str);
        cy3 cy3Var = this.D;
        if (cy3Var != null) {
            getMainHandler().removeCallbacks(cy3Var);
        }
        cy3 cy3Var2 = new cy3(6, this, b010Var);
        getMainHandler().postDelayed(cy3Var2, j);
        this.D = cy3Var2;
    }

    public final void M(boolean z) {
        float[] a2 = this.O.a();
        this.M.mapPoints(a2);
        getMediaPropertiesProvider().a = new mv10(this.M, this.N, this.k.getContentMatrix(), this.O, this.P, edi.C(a2), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(d5p<g5p> d5pVar) {
        boolean z = d5pVar instanceof bok;
        int i = 0;
        View view = this.w;
        if (z) {
            ((bok) d5pVar).getClass();
            view.setBackgroundColor(0);
            return;
        }
        Context context = getContext();
        qcy<Object>[] qcyVarArr = knj.a;
        Resources.Theme theme = context.getTheme();
        xqo0 xqo0Var = knj.b;
        qcy<Object>[] qcyVarArr2 = knj.a;
        qcy<Object> qcyVar = qcyVarArr2[0];
        if (theme.resolveAttribute(R.attr.editorBackground, (TypedValue) xqo0Var.b.get(), true)) {
            qcy<Object> qcyVar2 = qcyVarArr2[0];
            i = ((TypedValue) xqo0Var.b.get()).data;
        }
        view.setBackgroundColor(i);
    }

    public final FrameLayout getBottomPanelLayout$android_release() {
        return this.e;
    }

    public final r4p getEditedImageState() {
        i4p i4pVar = ((EditorState) getStore().b.b.getValue()).a;
        if (i4pVar != null) {
            return new r4p(i4pVar, ((EditorState) getStore().b.b.getValue()).b);
        }
        return null;
    }

    public final h4x getInsets() {
        return this.b0;
    }

    public final FrameLayout getOverBottomPanelLayout$android_release() {
        return this.g;
    }

    public final ttk0<ld7> getResultBitmap() {
        return this.J;
    }

    public final FrameLayout getTopPanelLayout$android_release() {
        return this.d;
    }

    public final wyt0 getViewModelStore$android_release() {
        return this.F;
    }

    public final h4x getWorkspaceInsets$android_release() {
        return h4x.c(0, this.r.getHeight(), 0, this.c.a.getBottomPanelLayout$android_release().getHeight());
    }

    public final FrameLayout getWorkspaceOverlayLayout$android_release() {
        return this.f;
    }

    public final boolean o() {
        return ((EditorState) this.c.o.b.b.getValue()).a != null;
    }

    public final boolean p(boolean z) {
        boolean z2 = getCurrentTool() != null;
        d5p<g5p> currentTool = getCurrentTool();
        w3p w3pVar = this.c;
        if (currentTool != null) {
            ToolButton toolButton = w3pVar.j.get(currentTool.getId());
            if (toolButton != null) {
                toolButton.f.setVisibility(toolButton.g ? 0 : 4);
            }
            currentTool.C();
            m4p m4pVar = this.G;
            if (m4pVar != null) {
                m4pVar.b(z);
            }
        }
        f5p f5pVar = (f5p) g5g.J(w3pVar.l);
        d5p<g5p> currentTool2 = getCurrentTool();
        if (currentTool2 != null && f5pVar == null) {
            if (z) {
                j7a0 j7a0Var = this.E;
                if (j7a0Var == null) {
                    j7a0Var = null;
                }
                f5p id = currentTool2.getId();
                d dVar = j7a0Var.c;
                (dVar != null ? dVar : null).a(new EditorMessage.e(id));
            } else {
                j7a0 j7a0Var2 = this.E;
                if (j7a0Var2 == null) {
                    j7a0Var2 = null;
                }
                d dVar2 = j7a0Var2.c;
                (dVar2 != null ? dVar2 : null).a(EditorMessage.d.a);
            }
        }
        n5p.a aVar = new n5p.a(new g(16, this, f5pVar), new fqd(10, this, f5pVar));
        if (f5pVar == null) {
            this.R.a(this.S);
            this.U.b = this.T;
        }
        n5p n5pVar = this.A;
        n5pVar.getClass();
        l3p.a("resizing", new tn0(12, n5pVar, aVar));
        return z2;
    }

    public final void q() {
        s3q0 s3q0Var;
        if (!getCompleteInit()) {
            L(getContext().getString(R.string.editor_please_wait_toast), 3000L, null);
            return;
        }
        r4p editedImageState = getEditedImageState();
        if (editedImageState != null) {
            m4p m4pVar = this.G;
            if (m4pVar != null) {
                m4pVar.a(editedImageState);
                s3q0Var = s3q0.a;
            } else {
                s3q0Var = null;
            }
            if (s3q0Var != null) {
                return;
            }
        }
        L(getContext().getString(R.string.editor_please_wait_toast), 3000L, null);
    }

    public final void r(wyt0 wyt0Var, xdl xdlVar, ba00 ba00Var, f5p f5pVar) {
        ToolButton toolButton;
        setViewModelStore$android_release(wyt0Var);
        w3p w3pVar = this.c;
        w3pVar.s = ba00Var;
        w3pVar.t = xdlVar;
        this.V = f5pVar;
        s020 s020Var = new s020(w3pVar, g5z.a(w3pVar.a));
        LinkedHashMap linkedHashMap = w3pVar.c;
        u020 u020Var = u020.a;
        linkedHashMap.put(u020Var, s020Var);
        w3pVar.g.add(u020Var);
        C(s020Var);
        ArrayList arrayList = w3pVar.d;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d5p a2 = ((d5p.a) it.next()).a(w3pVar);
            w3pVar.c.put(a2.getId(), a2);
            w3pVar.g.add(a2.getId());
            arrayList2.add(a2);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C((d5p) it2.next());
        }
        arrayList.clear();
        for (Map.Entry entry : w3pVar.e.entrySet()) {
            f5p f5pVar2 = (f5p) entry.getKey();
            izs izsVar = (izs) entry.getValue();
            if (izsVar != null && (toolButton = (ToolButton) izsVar.invoke(getContext())) != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                float f = 6;
                layoutParams.setMargins((int) Math.floor(Resources.getSystem().getDisplayMetrics().density * f), 0, (int) Math.floor(f * Resources.getSystem().getDisplayMetrics().density), 0);
                this.t.addView(toolButton, layoutParams);
                w3pVar.j.put(f5pVar2, toolButton);
                toolButton.setOnClick(new az2(25, this, f5pVar2));
                toolButton.setEnabled(!w3pVar.f.containsKey(f5pVar2));
            }
        }
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(w3pVar.o.d, new f7a0(2, this, PhotoEditorView.class, "receiveNewEvent", "receiveNewEvent(Lcom/vk/photo/editor/ivm/EditorEvent;)V", 4)), g5z.a(this));
        j7a0 j7a0Var = this.E;
        if (j7a0Var == null) {
            j7a0Var = null;
        }
        d dVar = j7a0Var.c;
        if (dVar == null) {
            dVar = null;
        }
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(dVar.b, new g7a0(2, this, PhotoEditorView.class, "receiveNewState", "receiveNewState(Lcom/vk/photo/editor/ivm/EditorState;)V", 4)), g5z.a(this));
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.H, new h7a0(this, null)), g5z.a(this));
    }

    public final void s(String str) {
        for (Map.Entry<f5p, d5p<g5p>> entry : getTools().entrySet()) {
            f5p key = entry.getKey();
            if (!(entry.getValue() instanceof v0g)) {
                w3p w3pVar = this.c;
                w3pVar.f.put(key, str);
                ToolButton toolButton = w3pVar.j.get(key);
                if (toolButton != null) {
                    toolButton.setEnabled(false);
                }
            }
        }
    }

    public final void setImage(r4p r4pVar) {
        i4p i4pVar = r4pVar.a;
        Object obj = this.c.c.get(u020.a);
        s020 s020Var = obj instanceof s020 ? (s020) obj : null;
        if (s020Var != null) {
            e4p e4pVar = i4pVar.b;
            Float valueOf = Float.valueOf(e4pVar.getWidth() / e4pVar.getHeight());
            kkw kkwVar = s020Var.e;
            if (kkwVar != null) {
                kkwVar.setCustomAspectRatio(valueOf);
            }
            e4p e4pVar2 = i4pVar.b;
            this.i.setVisibility((e4pVar2.getWidth() > 4032 || e4pVar2.getHeight() > 4032) ? 0 : 8);
            s020Var.B(i4pVar);
        }
        j7a0 j7a0Var = this.E;
        if (j7a0Var == null) {
            j7a0Var = null;
        }
        Map<f5p, g5p> map = r4pVar.b;
        d dVar = j7a0Var.c;
        (dVar != null ? dVar : null).a(new EditorMessage.f(i4pVar, map, true));
    }

    public final void setImageFileSaver(d4p d4pVar) {
        this.c.getClass();
    }

    public final void setInsets(h4x h4xVar) {
        this.b0 = h4xVar;
        View view = this.w;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = h4xVar.b;
        view.setLayoutParams(layoutParams);
    }

    public final void setListener(m4p m4pVar) {
        this.G = m4pVar;
    }

    public final void setLogger(n4p n4pVar) {
        this.c.u = n4pVar;
        f370.e = n4pVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void setOnboardingConfiguration(hd80 hd80Var) {
        h18 h18Var = this.c.x;
        h18Var.c = hd80Var;
        ?? r3 = hd80Var.a;
        h18Var.b = r3 != 0 ? new LinkedHashMap((Map) r3) : null;
    }

    public final void setStatConsumer(c5p c5pVar) {
        this.c.r.b = c5pVar;
    }

    public final void setViewModelStore$android_release(wyt0 wyt0Var) {
        if (wyt0Var == null) {
            throw new IllegalStateException("ViewModelStore should not be null");
        }
        this.F = wyt0Var;
        vyt0 vyt0Var = new vyt0(wyt0Var, new k7a0(this.c.o, new cf00(this, 14), new tu80(this, 2)), qbk.a.b);
        rfc a2 = fpf0.a(j7a0.class);
        String h = a2.h();
        if (h == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.E = (j7a0) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a2);
    }

    public final void setZoomSetting(z6y0 z6y0Var) {
        this.S = z6y0Var;
        this.R.a(z6y0Var);
        t6y0 t6y0Var = this.c.v;
        if (t6y0Var == null) {
            t6y0Var = null;
        }
        t6y0Var.b = z6y0Var.a();
    }

    public final void t() {
        for (Map.Entry<f5p, d5p<g5p>> entry : getTools().entrySet()) {
            f5p key = entry.getKey();
            if (!(entry.getValue() instanceof v0g)) {
                w3p w3pVar = this.c;
                w3pVar.f.remove(key);
                ToolButton toolButton = w3pVar.j.get(key);
                if (toolButton != null) {
                    toolButton.setEnabled(true);
                }
            }
        }
    }

    public final boolean u(EditorState editorState) {
        Map<f5p, g5p> map = editorState.b;
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry<f5p, g5p> entry : map.entrySet()) {
            f5p key = entry.getKey();
            g5p value = entry.getValue();
            if ((value instanceof ag5) || (value instanceof edr) || (value instanceof com.vk.photo.editor.features.colorgrading.a) || (getTools().get(key) instanceof p290)) {
                if (!value.I()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void v() {
        this.j.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(-20.0f).setDuration(150L).withEndAction(new q44(this, 8)).start();
    }

    public final boolean w() {
        d5p<g5p> currentTool = getCurrentTool();
        return (currentTool != null && currentTool.a0()) || p(false);
    }

    public final void x(boolean z) {
        if (u((EditorState) getStore().b.b.getValue())) {
            kkw kkwVar = this.c.m;
            if (kkwVar != null) {
                ViewPropertyAnimator animate = kkwVar.d.animate();
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                animate.alpha(z ? 1.0f : 0.0f).setDuration(0L).setStartDelay(z ? 0L : 150L).start();
                kkwVar.c.animate().alpha((z || kkwVar.f) ? 0.0f : 1.0f).setDuration(0L).setStartDelay(z ? 0L : 150L).start();
                ViewPropertyAnimator animate2 = kkwVar.e.animate();
                if (!z) {
                    f = 1.0f;
                }
                animate2.alpha(f).setDuration(150L).start();
            }
            FrameLayout frameLayout = this.e;
            FrameLayout frameLayout2 = this.d;
            if (z) {
                K(getContext().getString(R.string.editor_toast_original));
                frameLayout.animate().alpha(0.5f).setDuration(200L).start();
                frameLayout2.animate().alpha(0.5f).setDuration(200L).start();
            } else {
                v();
                frameLayout.animate().alpha(1.0f).setDuration(150L).start();
                frameLayout2.animate().alpha(1.0f).setDuration(150L).start();
            }
            boolean z2 = !z;
            fyt0.l(frameLayout2, z2);
            fyt0.l(frameLayout, z2);
        }
    }

    public final void y() {
        Iterator it = this.c.c.entrySet().iterator();
        while (it.hasNext()) {
            ((d5p) ((Map.Entry) it.next()).getValue()).onPause();
        }
    }

    public final void z() {
        this.z.f = true;
        Iterator it = this.c.c.entrySet().iterator();
        while (it.hasNext()) {
            ((d5p) ((Map.Entry) it.next()).getValue()).onResume();
        }
    }

    public PhotoEditorView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        w3p w3pVar = new w3p(this);
        this.c = w3pVar;
        this.h = new bpn0(new mg(22));
        this.H = vtk0.a(null);
        utk0 a2 = vtk0.a(null);
        this.I = a2;
        this.J = a2;
        utk0 a3 = vtk0.a(Boolean.FALSE);
        this.K = a3;
        this.L = a3;
        this.M = new Matrix();
        this.N = new Matrix();
        this.O = new hif0(0);
        this.P = new RectF();
        this.Q = new RectF();
        this.S = new z6y0.b(0);
        d7y0 d7y0Var = new d7y0(mg00.a, 2);
        this.T = d7y0Var;
        this.a0 = true;
        this.b0 = h4x.e;
        ConcurrentHashMap<String, List<izs<gzs<s3q0>, s3q0>>> concurrentHashMap = l3p.a;
        l3p.a = new ConcurrentHashMap<>();
        l3p.b = new LinkedHashMap();
        LayoutInflater.from(context).inflate(R.layout.editor_content, (ViewGroup) this, true);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.layout_editor_root);
        this.j = (TextView) findViewById(R.id.top_toast);
        this.i = findViewById(R.id.editor_loader);
        ZoomRootLayout zoomRootLayout = (ZoomRootLayout) findViewById(R.id.layout_editor_workspace_zoom_root);
        this.k = zoomRootLayout;
        ZoomContentLayout zoomContentLayout = (ZoomContentLayout) findViewById(R.id.layout_editor_workspace_zoom_content);
        this.l = (FrameLayout) findViewById(R.id.layout_editor_content_touches);
        this.f = (FrameLayout) findViewById(R.id.layout_editor_workspace_overlay);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.editor_workspace_content_size_notifier);
        DispatchTouchFrameLayout dispatchTouchFrameLayout = (DispatchTouchFrameLayout) findViewById(R.id.layout_editor_workspace_content);
        this.m = (FrameLayout) findViewById(R.id.layout_editor_media_content_wrapper);
        this.n = (FrameLayout) findViewById(R.id.layout_editor_media_content);
        this.o = (FrameLayout) findViewById(R.id.layout_editor_media_overlay);
        this.p = (FrameLayout) findViewById(R.id.layout_editor_media_underlay);
        this.q = (FrameLayout) findViewById(R.id.layout_editor_media_tools_overlay);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.layout_editor_bottom_panel);
        this.e = frameLayout2;
        this.t = (LinearLayout) findViewById(R.id.layout_editor_tools_panel);
        this.w = findViewById(R.id.system_status_bar);
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.layout_editor_top_panel);
        this.d = frameLayout3;
        this.r = (ViewGroup) findViewById(R.id.layout_editor_top_root);
        this.s = frameLayout3.getMinimumHeight();
        View findViewById = findViewById(R.id.editor_top_panel);
        this.v = findViewById;
        ImageButton imageButton = (ImageButton) findViewById.findViewById(R.id.button_editor_undo);
        this.y = imageButton;
        ImageButton imageButton2 = (ImageButton) findViewById.findViewById(R.id.button_editor_redo);
        this.x = imageButton2;
        this.u = (FrameLayout) findViewById(R.id.editor_bottom_bar);
        this.g = (FrameLayout) findViewById(R.id.layout_over_bottom_panel);
        m6y0 m6y0Var = new m6y0(zoomRootLayout, zoomContentLayout);
        this.R = m6y0Var;
        m6y0Var.a(this.S);
        w3pVar.v = new t6y0(zoomRootLayout, this.S.a());
        this.U = new c7y0(zoomRootLayout, getStatConsumerProxy(), d7y0Var);
        ov10 mediaPropertiesProvider = getMediaPropertiesProvider();
        bi80 bi80Var = new bi80(this, 3);
        zoomRootLayout.j = mediaPropertiesProvider;
        zoomRootLayout.k = bi80Var;
        M(false);
        this.z = new qij(frameLayout3, frameLayout2, dispatchTouchFrameLayout, frameLayout, getMediaPropertiesProvider(), new a(0, this, PhotoEditorView.class, "refreshMediaProperties", "refreshMediaProperties(Lcom/vk/photo/editor/ivm/EditorState;)V", 0));
        this.A = new n5p(frameLayout3, constraintLayout);
        int i2 = 5;
        imageButton.setOnClickListener(new ybq(this, i2));
        imageButton.setAlpha(0.4f);
        imageButton2.setOnClickListener(new i1f(this, i2));
        imageButton2.setAlpha(0.4f);
        dispatchTouchFrameLayout.setDispatchListener(new xxh(this, new Ref$ObjectRef(), new Ref$ObjectRef(), i2));
        frameLayout2.findViewById(R.id.button_editor_cancel).setOnClickListener(new qp4(this, 7));
        frameLayout2.findViewById(R.id.button_editor_complete).setOnClickListener(new ep6(this, 4));
    }
}
