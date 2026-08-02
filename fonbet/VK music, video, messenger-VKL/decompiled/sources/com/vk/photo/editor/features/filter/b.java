package com.vk.photo.editor.features.filter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.lifecycle.j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.features.filter.f;
import com.vk.photo.editor.features.filter.f.c;
import com.vk.photo.editor.ivm.filter.FilterMessage;
import com.vk.photo.editor.ivm.filter.i;
import com.vk.photo.editor.views.DashedSeekBar;
import com.vk.photo.editor.views.ToolBottomView;
import com.vk.photo.editor.views.ToolButton;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.aa00;
import xsna.b6l;
import xsna.b8f0;
import xsna.c4i0;
import xsna.d5p;
import xsna.dnh;
import xsna.edr;
import xsna.epx;
import xsna.f5p;
import xsna.fbh;
import xsna.foh;
import xsna.fpf0;
import xsna.fyt0;
import xsna.g5p;
import xsna.g5z;
import xsna.h5p;
import xsna.hdr;
import xsna.i4p;
import xsna.ier;
import xsna.jer;
import xsna.jpf;
import xsna.kbe;
import xsna.ker;
import xsna.ler;
import xsna.m3p;
import xsna.mdr;
import xsna.n2k0;
import xsna.on00;
import xsna.pli;
import xsna.q0g;
import xsna.q5f;
import xsna.qbk;
import xsna.r0g;
import xsna.rfc;
import xsna.rsr;
import xsna.spj;
import xsna.ter;
import xsna.u19;
import xsna.v0g;
import xsna.v3p;
import xsna.vyt0;
import xsna.wyt0;
import xsna.xcr;
import xsna.xdr;
import xsna.xqc;
import xsna.y2g;
import xsna.yce;
import xsna.z900;

/* compiled from: FilterTool.kt */
/* loaded from: classes4.dex */
public final class b extends m3p<edr> implements v0g {
    public final c c;
    public final v3p d;
    public final mdr e;
    public View f;
    public ViewGroup g;
    public c4i0 h;
    public TextView i;
    public RecyclerView j;
    public d k;
    public f l;
    public xcr m;
    public final Map<f5p, d5p.a<?>> n;
    public final Handler o;
    public List<? extends com.vk.photo.editor.features.filter.a> p;

    /* compiled from: FilterTool.kt */
    public static final class a implements d5p.a<edr> {
        @Override // xsna.d5p.a
        public final d5p<edr> a(v3p v3pVar) {
            mdr mdrVar = new mdr(v3pVar.q(), new z900());
            wyt0 viewModelStore = v3pVar.getViewModelStore();
            hdr hdrVar = new hdr(new yce(v3pVar, 19), new kbe(v3pVar, 22));
            vyt0 vyt0Var = new vyt0(viewModelStore, new ter(v3pVar.d(), new jpf(v3pVar, 19), v3pVar.b(), hdrVar, mdrVar), qbk.a.b);
            rfc a = fpf0.a(c.class);
            String h = a.h();
            if (h != null) {
                return new b((c) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a), g5z.a(v3pVar.w()), v3pVar, mdrVar);
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
    }

    /* compiled from: FilterTool.kt */
    @b6l(c = "com.vk.photo.editor.features.filter.FilterTool", f = "FilterTool.kt", l = {97}, m = "getDefaultParams")
    /* renamed from: com.vk.photo.editor.features.filter.b$b, reason: collision with other inner class name */
    public static final class C1459b extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C1459b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.u(null, this);
        }
    }

    public b(c cVar, j jVar, v3p v3pVar, mdr mdrVar) {
        this.c = cVar;
        this.d = v3pVar;
        this.e = mdrVar;
        List<n2k0> list = r0g.a;
        this.n = on00.f(new Pair(y2g.a, new q0g()));
        this.o = new Handler(Looper.getMainLooper());
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(cVar.i(), new ier(this, null)), jVar);
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(cVar.m(), new jer(this, null)), jVar);
    }

    @Override // xsna.m3p, xsna.d5p
    public final void C() {
        ViewGroup viewGroup = this.g;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            ViewGroup viewGroup2 = this.g;
            ViewParent parent = viewGroup2 != null ? viewGroup2.getParent() : null;
            ViewGroup viewGroup3 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this.g);
            }
        }
    }

    @Override // xsna.m3p, xsna.d5p
    public final Map<f5p, d5p.a<?>> E() {
        return this.n;
    }

    @Override // xsna.m3p
    public final /* bridge */ /* synthetic */ void G(edr edrVar) {
    }

    @Override // xsna.d5p
    public final String e(g5p g5pVar, g5p g5pVar2) {
        String str;
        String str2;
        if (g5pVar instanceof edr) {
            if (g5pVar2 == null ? true : g5pVar2 instanceof edr) {
                edr edrVar = (edr) g5pVar;
                boolean I = edrVar.I();
                aa00 aa00Var = edrVar.a;
                String str3 = "";
                v3p v3pVar = this.d;
                if (I && g5pVar2 != null) {
                    Context x = v3pVar.x();
                    aa00 aa00Var2 = ((edr) g5pVar2).a;
                    if (aa00Var2 != null && (str2 = aa00Var2.b) != null) {
                        str3 = str2;
                    }
                    return x.getString(R.string.editor_history_filter_redo, str3);
                }
                if (g5pVar2 != null) {
                    edr edrVar2 = (edr) g5pVar2;
                    aa00 aa00Var3 = edrVar2.a;
                    if (epx.f(aa00Var3 != null ? aa00Var3.a : null, aa00Var != null ? aa00Var.a : null)) {
                        return v3pVar.x().getString(R.string.editor_history_filter_intensity, Integer.valueOf(edrVar2.b));
                    }
                }
                Context x2 = v3pVar.x();
                if (aa00Var != null && (str = aa00Var.b) != null) {
                    str3 = str;
                }
                return x2.getString(R.string.editor_history_filter_undo, str3);
            }
        }
        return null;
    }

    @Override // xsna.d5p
    public final /* bridge */ /* synthetic */ f5p getId() {
        return ler.a;
    }

    @Override // xsna.d5p
    public final h5p getRenderer() {
        return new pli(8);
    }

    @Override // xsna.d5p
    public final void k() {
        v3p v3pVar = this.d;
        v3pVar.b().b(xdr.d.a);
        Context context = v3pVar.getBottom().getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.feature_filter, (ViewGroup) v3pVar.getBottom(), false);
        v3pVar.getBottom().addView(inflate);
        ToolBottomView toolBottomView = (ToolBottomView) inflate.findViewById(R.id.tool_bottom_view);
        toolBottomView.setOnCancelClickListener(new fbh(this, 15));
        toolBottomView.setOnDoneClickListener(new dnh(this, 18));
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.layout_filter_enhance);
        c cVar = this.c;
        fyt0.o(viewGroup, ((com.vk.photo.editor.ivm.filter.c) ((b8f0) cVar.m()).b.getValue()).c);
        this.g = viewGroup;
        TextView textView = (TextView) inflate.findViewById(R.id.text_filter_enhance);
        textView.setText(String.valueOf(((com.vk.photo.editor.ivm.filter.c) ((b8f0) cVar.m()).b.getValue()).d));
        this.i = textView;
        KeyEvent.Callback findViewById = inflate.findViewById(R.id.seekbar_filter_enhance);
        DashedSeekBar dashedSeekBar = (DashedSeekBar) findViewById;
        dashedSeekBar.a(((com.vk.photo.editor.ivm.filter.c) ((b8f0) cVar.m()).b.getValue()).d, false);
        dashedSeekBar.setOnSeekBarChangeListener(new ker(this));
        this.h = (c4i0) findViewById;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view_filters);
        d dVar = new d();
        dVar.submitList((List) cVar.i().b.getValue(), new xqc(this, 5));
        this.k = dVar;
        dVar.d = new foh(cVar, 1);
        d dVar2 = this.k;
        if (dVar2 != null) {
            dVar2.e = new u19(cVar, 2);
        }
        recyclerView.setAdapter(this.k);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        xcr xcrVar = new xcr(dVar, recyclerView, new q5f(this, 20));
        this.m = xcrVar;
        dVar.f = xcrVar;
        f fVar = new f(dVar, linearLayoutManager, cVar, xcrVar);
        this.l = fVar;
        f.c cVar2 = fVar.e;
        if (cVar2 != null && cVar2 != null) {
            recyclerView.removeOnScrollListener(cVar2);
            fVar.e = null;
        }
        f.c cVar3 = fVar.new c();
        recyclerView.addOnScrollListener(cVar3);
        fVar.e = cVar3;
        recyclerView.setItemAnimator(xcrVar);
        recyclerView.addItemDecoration(new e(dVar));
        this.j = recyclerView;
        this.f = inflate;
        cVar.p();
        i iVar = cVar.c;
        if (iVar == null) {
            iVar = null;
        }
        if (((com.vk.photo.editor.ivm.filter.c) iVar.b.b.getValue()).b.isEmpty()) {
            i iVar2 = cVar.c;
            if (iVar2 == null) {
                iVar2 = null;
            }
            iVar2.b(new FilterMessage.a(context));
        }
        cVar.f = null;
        cVar.n();
    }

    @Override // xsna.d5p
    public final void p() {
        f fVar;
        f.c cVar;
        View view = this.f;
        if (view != null) {
            this.d.getBottom().removeView(view);
            this.f = null;
            this.g = null;
            this.i = null;
            this.k = null;
            RecyclerView recyclerView = this.j;
            if (recyclerView != null && (fVar = this.l) != null && (cVar = fVar.e) != null) {
                recyclerView.removeOnScrollListener(cVar);
                fVar.e = null;
            }
            this.l = null;
            this.m = null;
        }
    }

    @Override // xsna.d5p
    public final String r(g5p g5pVar, g5p g5pVar2) {
        String str;
        String str2;
        if (g5pVar2 instanceof edr) {
            if (g5pVar == null ? true : g5pVar instanceof edr) {
                edr edrVar = (edr) g5pVar2;
                boolean I = edrVar.I();
                aa00 aa00Var = edrVar.a;
                String str3 = "";
                v3p v3pVar = this.d;
                if (I && g5pVar != null) {
                    Context x = v3pVar.x();
                    aa00 aa00Var2 = ((edr) g5pVar).a;
                    if (aa00Var2 != null && (str2 = aa00Var2.b) != null) {
                        str3 = str2;
                    }
                    return x.getString(R.string.editor_history_filter_undo, str3);
                }
                if (g5pVar != null) {
                    aa00 aa00Var3 = ((edr) g5pVar).a;
                    if (epx.f(aa00Var3 != null ? aa00Var3.a : null, aa00Var != null ? aa00Var.a : null)) {
                        return v3pVar.x().getString(R.string.editor_history_filter_intensity, Integer.valueOf(edrVar.b));
                    }
                }
                Context x2 = v3pVar.x();
                if (aa00Var != null && (str = aa00Var.b) != null) {
                    str3 = str;
                }
                return x2.getString(R.string.editor_history_filter_redo, str3);
            }
        }
        return null;
    }

    @Override // xsna.d5p
    public final ToolButton s(Context context) {
        ToolButton toolButton = new ToolButton(context, null, R.attr.editorToolButtonStyle_Filter, R.style.EditorToolButton_Filter, 2);
        toolButton.setImportantForAccessibility(1);
        toolButton.setContentDescription(toolButton.getResources().getString(R.string.editor_tool_button_filters));
        return toolButton;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.d5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(i4p i4pVar, spj<? super edr> spjVar) {
        C1459b c1459b;
        int i;
        if (spjVar instanceof C1459b) {
            c1459b = (C1459b) spjVar;
            int i2 = c1459b.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1459b.label = i2 - Integer.MIN_VALUE;
                Object obj = c1459b.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c1459b.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Context x = this.d.x();
                    c1459b.L$0 = null;
                    c1459b.label = 1;
                    obj = this.e.a(x, c1459b);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return new edr((aa00) obj, 1, 0);
            }
        }
        c1459b = new C1459b((ContinuationImpl) spjVar);
        Object obj2 = c1459b.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c1459b.label;
        if (i != 0) {
        }
        return new edr((aa00) obj2, 1, 0);
    }
}
