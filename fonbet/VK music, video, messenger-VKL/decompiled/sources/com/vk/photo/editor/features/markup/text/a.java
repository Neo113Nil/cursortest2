package com.vk.photo.editor.features.markup.text;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.markup.internal.utils.State;
import com.vk.photo.editor.features.markup.text.model.stat.TextStatEvent;
import com.vk.photo.editor.markup.view.tools.button.RemoveButton;
import com.vk.photo.editor.markup.view.tools.editor.TextElementEditText;
import com.vk.photo.editor.views.ToolBottomView;
import com.vk.photo.editor.views.ToolButton;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.afo0;
import xsna.b6l;
import xsna.bbp;
import xsna.bo00;
import xsna.c5p;
import xsna.ceo0;
import xsna.d5p;
import xsna.ddp0;
import xsna.dnz;
import xsna.drm0;
import xsna.edi;
import xsna.ew5;
import xsna.f5p;
import xsna.fem0;
import xsna.ffo0;
import xsna.fgm0;
import xsna.fko0;
import xsna.fyt0;
import xsna.g5p;
import xsna.g5z;
import xsna.g8n0;
import xsna.gfo0;
import xsna.h5p;
import xsna.heq;
import xsna.hif0;
import xsna.i4p;
import xsna.izs;
import xsna.j5g;
import xsna.jeo0;
import xsna.jio0;
import xsna.kif0;
import xsna.kzp0;
import xsna.l290;
import xsna.lkf0;
import xsna.lw5;
import xsna.m3p;
import xsna.mv10;
import xsna.nn10;
import xsna.nv10;
import xsna.odc0;
import xsna.ov10;
import xsna.p290;
import xsna.qkp0;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.t6c0;
import xsna.tf10;
import xsna.u9p;
import xsna.uap;
import xsna.uf10;
import xsna.ulo0;
import xsna.urk0;
import xsna.v0g;
import xsna.v3p;
import xsna.v7g;
import xsna.veo0;
import xsna.veq;
import xsna.vlo;
import xsna.vua0;
import xsna.we2;
import xsna.weo0;
import xsna.wg1;
import xsna.wzs;
import xsna.xeo0;
import xsna.xmo0;
import xsna.xw70;
import xsna.y8g;
import xsna.yq2;
import xsna.z1q;
import xsna.zeo0;
import xsna.zkj0;

/* compiled from: TextTool.kt */
/* loaded from: classes4.dex */
public final class a extends m3p<fko0> implements p290, qkp0, v0g, DialogInterface.OnDismissListener, DialogInterface.OnShowListener {
    public final xeo0 c;
    public final v3p d;
    public final int e;
    public View f;
    public ToolBottomView g;
    public View h;
    public RemoveButton i;
    public final int[] j = {0, 0};
    public final Rect k = new Rect();
    public State l = State.Add;
    public ffo0 m;
    public AnimatorSet n;
    public final nv10 o;
    public final c5p p;
    public final tf10 q;
    public final bbp r;
    public final heq s;
    public final weo0 t;

    /* compiled from: TextTool.kt */
    @b6l(c = "com.vk.photo.editor.features.markup.text.TextTool$1", f = "TextTool.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.vk.photo.editor.features.markup.text.a$a, reason: collision with other inner class name */
    public static final class C1461a extends SuspendLambda implements wzs<veo0, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C1461a(spj<? super C1461a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            C1461a c1461a = a.this.new C1461a(spjVar);
            c1461a.L$0 = obj;
            return c1461a;
        }

        @Override // xsna.wzs
        public final Object invoke(veo0 veo0Var, spj<? super s3q0> spjVar) {
            return ((C1461a) create(veo0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            veo0 veo0Var = (veo0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            ffo0 ffo0Var = a.this.m;
            if (ffo0Var != null) {
                ffo0Var.c(veo0Var);
            }
            return s3q0.a;
        }
    }

    /* compiled from: TextTool.kt */
    @b6l(c = "com.vk.photo.editor.features.markup.text.TextTool$2", f = "TextTool.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<ceo0, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
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
        public final Object invoke(ceo0 ceo0Var, spj<? super s3q0> spjVar) {
            return ((b) create(ceo0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ceo0 ceo0Var = (ceo0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            ffo0 ffo0Var = a.this.m;
            if (ffo0Var != null) {
                if (ceo0Var instanceof ceo0.c) {
                    ffo0Var.c.invoke(((ceo0.c) ceo0Var).a);
                    ffo0Var.dismiss();
                } else if (ceo0Var instanceof ceo0.b) {
                    ffo0Var.d.invoke(((ceo0.b) ceo0Var).a);
                    ffo0Var.dismiss();
                } else {
                    if (!(ceo0Var instanceof ceo0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    veo0 veo0Var = ((ceo0.a) ceo0Var).a;
                    gfo0 gfo0Var = veo0Var.b;
                    ffo0Var.c(veo0Var);
                    TextElementEditText textElementEditText = ffo0Var.i;
                    if (textElementEditText == null) {
                        textElementEditText = null;
                    }
                    textElementEditText.setText(gfo0Var.b);
                    TextElementEditText textElementEditText2 = ffo0Var.i;
                    if (textElementEditText2 == null) {
                        textElementEditText2 = null;
                    }
                    textElementEditText2.setSelection(gfo0Var.b.length());
                    View view = ffo0Var.h;
                    if (view == null) {
                        view = null;
                    }
                    view.animate().alpha(1.0f).start();
                    RecyclerView recyclerView = ffo0Var.o;
                    if (recyclerView == null) {
                        recyclerView = null;
                    }
                    Iterator<kzp0> it = ffo0Var.y.getCurrentList().iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (it.next().b) {
                            break;
                        }
                        i++;
                    }
                    lkf0.c(recyclerView, i);
                    RecyclerView recyclerView2 = ffo0Var.n;
                    lkf0.c(recyclerView2 != null ? recyclerView2 : null, ffo0Var.d());
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: TextTool.kt */
    public static final class c implements d5p.a<fko0> {
        public final xeo0 a;
        public final v7g b = v7g.a.a;
        public final int c = R.style.TextToolDialogTheme;

        public c(xeo0 xeo0Var) {
            this.a = xeo0Var;
        }

        @Override // xsna.d5p.a
        public final d5p<fko0> a(v3p v3pVar) {
            return new a(this.a, this.b, v3pVar, this.c);
        }
    }

    /* compiled from: TextTool.kt */
    public static final class d implements l290 {
        public final heq a;
        public final ddp0 b;
        public final bbp c;

        public d(a aVar, Context context) {
            heq heqVar = aVar.s;
            this.a = heqVar;
            ddp0 ddp0Var = new ddp0(context);
            ddp0Var.setDelegate(heqVar);
            this.b = ddp0Var;
            this.c = aVar.r;
        }

        @Override // xsna.l290
        public final View a() {
            return this.a;
        }

        @Override // xsna.l290
        public final View b() {
            return this.c;
        }

        @Override // xsna.l290
        public final View c() {
            return this.b;
        }
    }

    /* compiled from: TextTool.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<vlo, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(vlo vloVar) {
            ((a) this.receiver).M(vloVar);
            return s3q0.a;
        }
    }

    /* compiled from: TextTool.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<jeo0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(jeo0 jeo0Var) {
            ((weo0) this.receiver).a(jeo0Var);
            return s3q0.a;
        }
    }

    /* compiled from: TextTool.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<gfo0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(gfo0 gfo0Var) {
            gfo0 gfo0Var2 = gfo0Var;
            a aVar = (a) this.receiver;
            aVar.getClass();
            String str = gfo0Var2.b;
            if (!drm0.N(str)) {
                zeo0 zeo0Var = new zeo0(str, gfo0Var2.a, a.L(gfo0Var2));
                mv10 provide = aVar.o.provide();
                hif0 hif0Var = provide.d;
                boolean z = provide.g;
                kif0 D = edi.D(hif0Var);
                float f = D.a;
                float f2 = D.b;
                hif0 hif0Var2 = provide.f;
                PointF pointF = hif0Var2.a;
                float f3 = pointF.x;
                PointF pointF2 = hif0Var2.c;
                float f4 = 2;
                float f5 = (f3 + pointF2.x) / f4;
                float f6 = (pointF.y + pointF2.y) / f4;
                float floor = f - ((int) Math.floor(32 * Resources.getSystem().getDisplayMetrics().density));
                kif0 D2 = edi.D(hif0Var2);
                float f7 = D2.a;
                float f8 = D2.b;
                float f9 = floor * f8 < f2 * f7 ? f8 / f2 : f7 / floor;
                zeo0Var.j();
                kif0 kif0Var = zeo0Var.f;
                zeo0Var.e(f5 - (kif0Var.a / 2.0f), f6 - (kif0Var.b / 2.0f));
                zeo0Var.f(f9, f5, f6);
                zeo0Var.g(nn10.c(provide.b), f5, f6);
                zeo0Var.c().postScale(z ? -1.0f : 1.0f, 1.0f, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                aVar.H(zeo0Var);
            }
            return s3q0.a;
        }
    }

    public a(xeo0 xeo0Var, v7g v7gVar, v3p v3pVar, int i) {
        bbp bbpVar;
        a aVar;
        this.c = xeo0Var;
        this.d = v3pVar;
        this.e = i;
        ov10 r = v3pVar.r();
        this.o = r;
        this.p = v3pVar.b();
        tf10 tf10Var = (tf10) v3pVar.g(uf10.a).h();
        tf10Var = (tf10Var == null || !tf10Var.a(xmo0.a)) ? null : tf10Var;
        this.q = tf10Var;
        if (tf10Var == null || (bbpVar = tf10Var.e()) == null) {
            bbpVar = new bbp(v3pVar.x());
            aVar = this;
            bbpVar.setOnViewResized(new e(1, aVar, a.class, "updateParams", "updateParams(Lcom/vk/photo/editor/markup/state/DrawingState;)V", 0));
        } else {
            aVar = this;
        }
        aVar.r = bbpVar;
        heq heqVar = new heq(v3pVar.x());
        heqVar.setMediaPropertiesProvider(r);
        heqVar.setHandleTouchesFromDelegate(true);
        heqVar.setListener(this);
        fyt0.m(bbpVar, heqVar.getDrawView());
        aVar.s = heqVar;
        weo0 weo0Var = new weo0(v7gVar, xeo0Var, I());
        aVar.t = weo0Var;
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(weo0Var.b, new C1461a(null)), g5z.a(v3pVar.w()));
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(weo0Var.d, new b(null)), g5z.a(v3pVar.w()));
    }

    public static TextStatEvent.e L(gfo0 gfo0Var) {
        TextStatEvent.Align align;
        String str = gfo0Var.b;
        afo0 afo0Var = gfo0Var.a;
        int i = urk0.$EnumSwitchMapping$0[afo0Var.a.g.ordinal()];
        if (i == 1) {
            align = TextStatEvent.Align.Center;
        } else if (i == 2) {
            align = TextStatEvent.Align.End;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            align = TextStatEvent.Align.Start;
        }
        TextStatEvent.Align align2 = align;
        jio0 jio0Var = afo0Var.a;
        return new TextStatEvent.e(align2, str, (int) (jio0Var.d * 100.0f), jio0Var.c.a, jio0Var.a, afo0Var.b.b);
    }

    @Override // xsna.m3p, xsna.d5p
    public final void C() {
        View view = this.h;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            fyt0.i(viewGroup);
        }
    }

    @Override // xsna.m3p
    public final void G(fko0 fko0Var) {
        fko0 fko0Var2 = fko0Var;
        if (this.q == null) {
            this.r.b(fko0Var2.a);
        }
    }

    public final void H(zeo0 zeo0Var) {
        if (drm0.N(zeo0Var.c)) {
            return;
        }
        vlo d2 = this.r.d();
        M(vlo.a(d2, j5g.v0(zeo0Var, d2.a)));
    }

    public final gfo0 I() {
        lw5 lw5Var;
        xeo0 xeo0Var = this.c;
        y8g.c cVar = (y8g.c) j5g.a0(xeo0Var.e);
        if (cVar == null) {
            cVar = new y8g.c(-1);
        }
        int i = (int) edi.D(this.o.provide().d).a;
        jio0.a aVar = (jio0.a) j5g.a0(xeo0Var.a);
        if (aVar == null) {
            aVar = new jio0.a("", Typeface.DEFAULT, (int) Math.floor(12 * Resources.getSystem().getDisplayMetrics().density), (int) Math.floor(60 * Resources.getSystem().getDisplayMetrics().density));
        }
        jio0 jio0Var = new jio0(cVar, i, aVar, 0.5f, (int) Math.floor(32 * Resources.getSystem().getDisplayMetrics().density), jio0.b.a, Layout.Alignment.ALIGN_CENTER, new ulo0(0), u9p.c.a);
        ew5 ew5Var = (ew5) j5g.a0(xeo0Var.c);
        if (ew5Var == null || (lw5Var = ew5Var.a) == null) {
            lw5Var = lw5.i;
        }
        return new gfo0(new afo0(jio0Var, lw5Var), "");
    }

    public final void J() {
        bbp bbpVar = this.r;
        bbpVar.setTouchesEnabled(false);
        heq heqVar = this.s;
        heqVar.setTouchesEnabled(false);
        bbpVar.setExternalModifier(null);
        veq veqVar = heqVar.b.f;
        if (veqVar != null) {
            veqVar.finish();
        }
        bbpVar.c(true);
        M(bbpVar.d());
    }

    public final void K() {
        if (this.m == null) {
            int i = ffo0.B;
            v3p v3pVar = this.d;
            Context x = v3pVar.x();
            weo0 weo0Var = this.t;
            ffo0 ffo0Var = new ffo0(this.e, x, new f(1, weo0Var, weo0.class, "consume", "consume(Lcom/vk/photo/editor/markup/dialog/mvi/model/TextEditMessage;)V", 0));
            ffo0Var.c = new g(1, this, a.class, "onTextNewElement", "onTextNewElement(Lcom/vk/photo/editor/markup/dialog/model/TextElementEditableData;)V", 0);
            ffo0Var.d = new t6c0(9);
            ffo0Var.e = new xw70(this, 6);
            ffo0Var.f = v3pVar.getLogger();
            ffo0Var.setOnShowListener(this);
            ffo0Var.setOnDismissListener(this);
            ffo0Var.show();
            this.m = ffo0Var;
            weo0Var.a(new jeo0.a(I(), true));
        }
    }

    public final void M(vlo vloVar) {
        tf10 tf10Var = this.q;
        if (tf10Var != null) {
            tf10Var.b(vloVar);
        } else {
            this.d.s(new fko0(vloVar));
        }
    }

    public final void N(State state) {
        if (state == this.l) {
            return;
        }
        Object[] objArr = {this.i, this.f};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                return;
            }
        }
        this.l = state;
        RemoveButton removeButton = this.i;
        if (removeButton == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        View view = this.f;
        if (view == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet a = yq2.a(removeButton, view, this.l);
        we2.a(a, new g8n0(this, 3));
        a.start();
        this.n = a;
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean a0() {
        J();
        this.d.c(false);
        return false;
    }

    @Override // xsna.d5p
    public final String e(g5p g5pVar, g5p g5pVar2) {
        return null;
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean f(ToolButton toolButton, Map map) {
        vlo a;
        Object obj = map.get(xmo0.a);
        fko0 fko0Var = null;
        bo00 bo00Var = obj instanceof fko0 ? (fko0) obj : null;
        if (this.q != null) {
            Object obj2 = map.get(uf10.a);
            bo00Var = obj2 instanceof bo00 ? (bo00) obj2 : null;
        }
        if (bo00Var != null && (a = bo00Var.a()) != null) {
            fko0Var = new fko0(a);
        }
        boolean z = false;
        if (fko0Var != null && !fko0Var.I()) {
            z = true;
        }
        toolButton.setIndicatorActive(z);
        return true;
    }

    @Override // xsna.d5p
    public final /* bridge */ /* synthetic */ f5p getId() {
        return xmo0.a;
    }

    @Override // xsna.d5p
    public final h5p getRenderer() {
        return new vua0();
    }

    @Override // xsna.d5p
    public final void k() {
        v3p v3pVar = this.d;
        View inflate = LayoutInflater.from(v3pVar.x()).inflate(R.layout.feature_text_bottom_panel, (ViewGroup) v3pVar.getBottom(), false);
        this.i = (RemoveButton) inflate.findViewById(R.id.remove_text_button);
        this.f = inflate.findViewById(R.id.add_text_button);
        ToolBottomView toolBottomView = (ToolBottomView) inflate.findViewById(R.id.tool_bottom_view);
        this.g = toolBottomView;
        if (toolBottomView != null) {
            toolBottomView.setOnDoneClickListener(new fem0(this, 3));
        }
        ToolBottomView toolBottomView2 = this.g;
        if (toolBottomView2 != null) {
            toolBottomView2.setOnCancelClickListener(new odc0(this, 20));
        }
        View view = this.f;
        if (view != null) {
            view.setOnClickListener(new z1q(this, 6));
        }
        bbp bbpVar = this.r;
        List<uap> list = bbpVar.d().a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((uap) it.next()) instanceof zeo0) {
                    break;
                }
            }
        }
        K();
        inflate.setVisibility(4);
        this.h = inflate;
        v3pVar.getBottom().addView(inflate);
        bbpVar.setTouchesEnabled(true);
        heq heqVar = this.s;
        heqVar.setTouchesEnabled(true);
        bbpVar.setExternalModifier(heqVar);
        this.l = State.Add;
        this.p.b(TextStatEvent.c.a);
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean o() {
        return true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.m = null;
        View view = this.h;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        View view = this.h;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // xsna.d5p
    public final void p() {
        View view = this.h;
        if (view != null) {
            this.d.getBottom().removeView(view);
        }
        this.i = null;
        this.f = null;
        this.g = null;
        bbp bbpVar = this.r;
        bbpVar.setTouchesEnabled(false);
        this.s.setTouchesEnabled(false);
        bbpVar.setExternalModifier(null);
    }

    @Override // xsna.d5p
    public final String r(g5p g5pVar, g5p g5pVar2) {
        return null;
    }

    @Override // xsna.d5p
    public final ToolButton s(Context context) {
        ToolButton toolButton = new ToolButton(context, null, R.attr.editorToolButtonStyle_Text, R.style.EditorToolButton_Text, 2);
        toolButton.setImportantForAccessibility(1);
        toolButton.setContentDescription(toolButton.getResources().getString(R.string.editor_tool_button_text));
        return toolButton;
    }

    @Override // xsna.d5p
    public final Object u(i4p i4pVar, spj<? super fko0> spjVar) {
        return new fko0(0);
    }

    @Override // xsna.qkp0
    public final void w(uap uapVar) {
        if (uapVar instanceof zeo0) {
            zeo0 zeo0Var = (zeo0) uapVar;
            if (this.m == null) {
                this.p.b(TextStatEvent.b.a);
                vlo d2 = this.r.d();
                ArrayList arrayList = new ArrayList(d2.a);
                arrayList.remove(zeo0Var);
                M(vlo.a(d2, arrayList));
                int i = ffo0.B;
                v3p v3pVar = this.d;
                Context x = v3pVar.x();
                weo0 weo0Var = this.t;
                ffo0 ffo0Var = new ffo0(this.e, x, new wg1(weo0Var, 18));
                ffo0Var.c = new fgm0(1, zeo0Var, this);
                ffo0Var.d = new zkj0(3, this, zeo0Var);
                ffo0Var.e = new dnz(this, 19);
                ffo0Var.f = v3pVar.getLogger();
                ffo0Var.setOnShowListener(this);
                ffo0Var.setOnDismissListener(this);
                ffo0Var.show();
                this.m = ffo0Var;
                weo0Var.a(new jeo0.a(new gfo0(zeo0Var.d, zeo0Var.c), false));
            }
        }
    }

    @Override // xsna.p290
    public final l290 x(Context context) {
        return new d(this, context);
    }

    @Override // xsna.qkp0
    public final void z(uap uapVar, MotionEvent motionEvent) {
        RemoveButton removeButton = this.i;
        int[] iArr = this.j;
        if (removeButton != null) {
            removeButton.getLocationOnScreen(iArr);
        }
        int i = iArr[0];
        int i2 = iArr[1];
        int floor = (int) Math.floor(16 * Resources.getSystem().getDisplayMetrics().density);
        int i3 = i - floor;
        int i4 = i2 - floor;
        int i5 = i + floor;
        RemoveButton removeButton2 = this.i;
        int measuredWidth = i5 + (removeButton2 != null ? removeButton2.getMeasuredWidth() : 0);
        int i6 = floor + i2;
        RemoveButton removeButton3 = this.i;
        int measuredHeight = i6 + (removeButton3 != null ? removeButton3.getMeasuredHeight() : 0);
        Rect rect = this.k;
        rect.set(i3, i4, measuredWidth, measuredHeight);
        boolean z = rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && motionEvent.getPointerCount() == 1;
        RemoveButton removeButton4 = this.i;
        if (removeButton4 != null) {
            removeButton4.setActive(z);
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                if (motionEvent.getPointerCount() == 1) {
                    N(State.Remove);
                    return;
                } else {
                    N(State.Add);
                    return;
                }
            }
            if (action != 3) {
                return;
            }
        }
        if (z) {
            vlo d2 = this.r.d();
            ArrayList arrayList = new ArrayList(d2.a);
            arrayList.remove(uapVar);
            M(vlo.a(d2, arrayList));
            RemoveButton removeButton5 = this.i;
            if (removeButton5 != null) {
                removeButton5.setActive(false);
            }
        }
        N(State.Add);
    }
}
