package com.vk.photo.editor.features.filter;

import com.vk.photo.editor.features.filter.FilterUiModel;
import com.vk.photo.editor.features.filter.f;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.ivm.filter.FilterMessage;
import com.vk.photo.editor.ivm.filter.g;
import com.vk.photo.editor.ivm.filter.h;
import com.vk.photo.editor.ivm.filter.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.aa00;
import xsna.b6l;
import xsna.b8f0;
import xsna.c5p;
import xsna.edr;
import xsna.epx;
import xsna.fai;
import xsna.g5p;
import xsna.gzs;
import xsna.hcj0;
import xsna.hdr;
import xsna.j5g;
import xsna.jpf;
import xsna.ksr;
import xsna.ler;
import xsna.lsr;
import xsna.mdr;
import xsna.n4p;
import xsna.per;
import xsna.rer;
import xsna.rsr;
import xsna.rvf;
import xsna.s3q0;
import xsna.ser;
import xsna.spj;
import xsna.ttk0;
import xsna.vy1;
import xsna.wgl;
import xsna.xdr;
import xsna.zvj;

/* compiled from: FilterViewModel.kt */
/* loaded from: classes4.dex */
public final class c extends vy1 implements f.a {
    public i c;
    public c5p d;
    public gzs<? extends n4p> e;
    public String f;

    /* compiled from: FilterViewModel.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EditorMessage.Source.values().length];
            try {
                iArr[EditorMessage.Source.UserInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static edr j(EditorState editorState) {
        g5p g5pVar = editorState.b.get(ler.a);
        if (g5pVar instanceof edr) {
            return (edr) g5pVar;
        }
        return null;
    }

    @Override // com.vk.photo.editor.features.filter.f.a
    public final void c(FilterUiModel filterUiModel) {
        i iVar = this.c;
        if (iVar == null) {
            iVar = null;
        }
        iVar.b(new FilterMessage.b(filterUiModel));
    }

    @Override // com.vk.photo.editor.features.filter.f.a
    public final void d(FilterUiModel filterUiModel) {
        i iVar = this.c;
        if (iVar == null) {
            iVar = null;
        }
        iVar.b(new FilterMessage.c(filterUiModel));
    }

    public final b8f0 i() {
        ttk0<com.vk.photo.editor.ivm.filter.c> m = m();
        rvf t = fai.t(this);
        final per perVar = new per(0);
        final b8f0 b8f0Var = (b8f0) m;
        return rsr.w(new ksr<Object>() { // from class: com.vk.photo.editor.extensions.FlowExtKt$map$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.vk.photo.editor.extensions.FlowExtKt$map$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                public final /* synthetic */ lsr b;
                public final /* synthetic */ per c;

                @b6l(c = "com.vk.photo.editor.extensions.FlowExtKt$map$$inlined$map$1$2", f = "FlowExt.kt", l = {50}, m = "emit")
                /* renamed from: com.vk.photo.editor.extensions.FlowExtKt$map$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(spj spjVar) {
                        super(spjVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(lsr lsrVar, per perVar) {
                    this.b = lsrVar;
                    this.c = perVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // xsna.lsr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, spj spjVar) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (spjVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) spjVar;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                a.a(obj2);
                                Object invoke = this.c.invoke(obj);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (this.b.emit(invoke, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.a(obj2);
                            }
                            return s3q0.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(spjVar);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return s3q0.a;
                }
            }

            @Override // xsna.ksr
            public final Object collect(lsr<? super Object> lsrVar, spj spjVar) {
                Object collect = b8f0Var.collect(new AnonymousClass2(lsrVar, perVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, t, hcj0.a.a, perVar.invoke(b8f0Var.b.getValue()));
    }

    public final FilterUiModel k(FilterUiModel filterUiModel) {
        Object obj;
        Iterator<T> it = ((com.vk.photo.editor.ivm.filter.c) ((b8f0) m()).b.getValue()).b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((FilterUiModel) obj).a, filterUiModel.g)) {
                break;
            }
        }
        return (FilterUiModel) obj;
    }

    public final FilterUiModel l() {
        Object obj;
        List<FilterUiModel> list = ((com.vk.photo.editor.ivm.filter.c) ((b8f0) m()).b.getValue()).b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((FilterUiModel) obj2).d) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((FilterUiModel) obj).f == FilterUiModel.Type.SUB_FILTER) {
                break;
            }
        }
        FilterUiModel filterUiModel = (FilterUiModel) obj;
        return filterUiModel != null ? filterUiModel : (FilterUiModel) j5g.a0(arrayList);
    }

    public final ttk0<com.vk.photo.editor.ivm.filter.c> m() {
        i iVar = this.c;
        if (iVar == null) {
            iVar = null;
        }
        return iVar.b;
    }

    public final void n() {
        String str;
        aa00 aa00Var;
        if (((com.vk.photo.editor.ivm.filter.c) ((b8f0) m()).b.getValue()).b.isEmpty()) {
            return;
        }
        List<FilterUiModel> list = ((com.vk.photo.editor.ivm.filter.c) ((b8f0) m()).b.getValue()).b;
        FilterUiModel l = l();
        if (l != null) {
            this.f = l.a;
            return;
        }
        com.vk.photo.editor.ivm.d dVar = this.b;
        if (dVar == null) {
            dVar = null;
        }
        edr j = j((EditorState) dVar.b.b.getValue());
        if (j == null || (aa00Var = j.a) == null || (str = aa00Var.a) == null) {
            FilterUiModel filterUiModel = (FilterUiModel) j5g.a0(list);
            if (filterUiModel == null) {
                return;
            } else {
                str = filterUiModel.a;
            }
        }
        i iVar = this.c;
        if (iVar == null) {
            iVar = null;
        }
        FilterMessage.Source source = FilterMessage.Source.Synthetic;
        iVar.b(new FilterMessage.f(str, source));
        if (j != null) {
            i iVar2 = this.c;
            (iVar2 != null ? iVar2 : null).b(new FilterMessage.g(j.b, source));
        }
    }

    public final void o(com.vk.photo.editor.ivm.d dVar, jpf jpfVar, c5p c5pVar, hdr hdrVar, mdr mdrVar) {
        i iVar = new i(fai.t(this), mdrVar, jpfVar);
        this.c = iVar;
        this.d = c5pVar;
        this.b = dVar;
        this.e = jpfVar;
        iVar.i = hdrVar;
        mdr mdrVar2 = iVar.f;
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(mdrVar2.c, new com.vk.photo.editor.ivm.filter.f(iVar, null));
        rvf rvfVar = iVar.e;
        rsr.s(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, rvfVar);
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(mdrVar2.e, new g(iVar, null)), rvfVar);
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(mdrVar2.g, new h(iVar, null)), rvfVar);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(m(), new rer(this, dVar, null));
        rvf t = fai.t(this);
        wgl wglVar = wgl.c;
        rsr.s(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, zvj.g(t, wglVar));
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(dVar.b, new ser(this, null)), zvj.g(fai.t(this), wglVar));
    }

    public final void p() {
        com.vk.photo.editor.ivm.d dVar = this.b;
        if (dVar == null) {
            dVar = null;
        }
        edr j = j((EditorState) dVar.b.b.getValue());
        if (j != null) {
            this.f = null;
            i iVar = this.c;
            (iVar != null ? iVar : null).b(new FilterMessage.e(j));
        }
    }

    public final void q(FilterUiModel filterUiModel) {
        aa00 aa00Var = filterUiModel.e;
        com.vk.photo.editor.ivm.d dVar = this.b;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a(new EditorMessage.i(new edr(aa00Var, 100), EditorMessage.Source.Synthetic, 4));
        FilterUiModel k = k(filterUiModel);
        c5p c5pVar = this.d;
        if (c5pVar == null) {
            c5pVar = null;
        }
        c5pVar.b(new xdr.a(filterUiModel.b, k != null ? k.b : null, filterUiModel.i));
    }
}
