package com.vk.photo.editor.ivm.filter;

import android.graphics.Bitmap;
import com.vk.photo.editor.features.filter.FilterUiModel;
import com.vk.photo.editor.ivm.filter.FilterMessage;
import com.vk.photo.editor.ivm.filter.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.aa00;
import xsna.aer;
import xsna.b8f0;
import xsna.bdn;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.gzs;
import xsna.hdr;
import xsna.iyx;
import xsna.mdr;
import xsna.myc0;
import xsna.n4p;
import xsna.ota0;
import xsna.owx;
import xsna.rvf;
import xsna.s3q0;
import xsna.v900;
import xsna.x900;
import xsna.ydr;
import xsna.z9;
import xsna.z900;
import xsna.zdr;
import xsna.zrl;

/* compiled from: FilterStore.kt */
/* loaded from: classes4.dex */
public final class i extends owx<c, FilterMessage, a, Object> {
    public final rvf e;
    public final mdr f;
    public final gzs<n4p> g;
    public final z900 h;
    public hdr i;
    public final LinkedHashSet j;

    public i(rvf rvfVar, mdr mdrVar, gzs gzsVar) {
        super(new b(new c(0)));
        this.e = rvfVar;
        this.f = mdrVar;
        this.g = gzsVar;
        this.h = new z900();
        this.j = new LinkedHashSet();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(4:21|(4:27|(1:29)|30|(1:32))|16|17)|12|(1:14)|16|17))|38|6|7|(0)(0)|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0031, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        r6 = r6.g.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r6 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        r6.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        r0.d(com.vk.photo.editor.ivm.filter.a.C1468a.a);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: LowMemoryException -> 0x0031, TRY_LEAVE, TryCatch #0 {LowMemoryException -> 0x0031, blocks: (B:11:0x002d, B:12:0x006c, B:14:0x0070, B:27:0x0057, B:30:0x005d), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i iVar, FilterUiModel filterUiModel, ContinuationImpl continuationImpl) {
        e eVar;
        int i;
        Bitmap bitmap;
        z9 z9Var = iVar.a;
        if (continuationImpl instanceof e) {
            eVar = (e) continuationImpl;
            int i2 = eVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.label = i2 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    List<ota0> list = filterUiModel.e.c;
                    if (list != null && !list.isEmpty() && filterUiModel.c.getClass() != FilterUiModel.a.b.class) {
                        hdr hdrVar = iVar.i;
                        if (hdrVar == null) {
                            hdrVar = null;
                        }
                        aa00 aa00Var = filterUiModel.e;
                        eVar.L$0 = filterUiModel;
                        eVar.L$1 = null;
                        eVar.label = 1;
                        obj = hdrVar.a(aa00Var, eVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                filterUiModel = (FilterUiModel) eVar.L$0;
                kotlin.a.a(obj);
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    z9Var.d(new a.b(filterUiModel.e.a, bitmap));
                }
                return s3q0.a;
            }
        }
        eVar = new e(iVar, continuationImpl);
        Object obj2 = eVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eVar.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
        return s3q0.a;
    }

    public final void b(FilterMessage filterMessage) {
        boolean z = filterMessage instanceof FilterMessage.a;
        rvf rvfVar = this.e;
        if (z) {
            myc0.h(rvfVar, bdn.b, null, new d(this, ((FilterMessage.a) filterMessage).a, null), 2);
            return;
        }
        boolean z2 = filterMessage instanceof FilterMessage.c;
        LinkedHashSet linkedHashSet = this.j;
        if (z2) {
            FilterUiModel filterUiModel = ((FilterMessage.c) filterMessage).a;
            linkedHashSet.add(filterUiModel.a);
            myc0.h(rvfVar, bdn.b, null, new zdr(this, filterUiModel, null), 2);
            return;
        }
        boolean z3 = filterMessage instanceof FilterMessage.f;
        b8f0 b8f0Var = this.b;
        z9 z9Var = this.a;
        if (!z3) {
            if (filterMessage instanceof FilterMessage.g) {
                FilterMessage.g gVar = (FilterMessage.g) filterMessage;
                int i = gVar.a;
                FilterMessage.Source source = gVar.b;
                if (((c) b8f0Var.b.getValue()).d == i) {
                    return;
                }
                z9Var.d(new a.c(i, source));
                return;
            }
            if (filterMessage instanceof FilterMessage.e) {
                z9Var.d(new a.f(((FilterMessage.e) filterMessage).a));
                return;
            }
            if (filterMessage instanceof FilterMessage.d) {
                myc0.h(rvfVar, bdn.b, null, new aer(this, ((FilterMessage.d) filterMessage).a, null), 2);
                return;
            } else {
                if (!(filterMessage instanceof FilterMessage.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                FilterUiModel filterUiModel2 = ((FilterMessage.b) filterMessage).a;
                linkedHashSet.remove(filterUiModel2.a);
                myc0.h(rvfVar, bdn.b.plus(iyx.a()), null, new ydr(this, filterUiModel2, null), 2);
                return;
            }
        }
        FilterMessage.f fVar = (FilterMessage.f) filterMessage;
        String str = fVar.a;
        FilterMessage.Source source2 = fVar.b;
        List<FilterUiModel> list = ((c) b8f0Var.b.getValue()).b;
        Iterator<FilterUiModel> it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (epx.f(it.next().a, str)) {
                break;
            } else {
                i3++;
            }
        }
        ArrayList o = e43.o(Integer.valueOf(i3));
        if (i3 != -1) {
            FilterUiModel filterUiModel3 = list.get(i3);
            Iterator<FilterUiModel> it2 = list.iterator();
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i4 = -1;
                    break;
                } else if (epx.f(it2.next().a, filterUiModel3.g)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 != -1) {
                o.add(Integer.valueOf(i4));
            }
        }
        List<FilterUiModel> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (Object obj : list2) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            arrayList.add(FilterUiModel.a((FilterUiModel) obj, null, o.contains(Integer.valueOf(i2)), 503));
            i2 = i5;
        }
        z9Var.d(new a.d(arrayList, source2, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.Result$Failure] */
    public final FilterUiModel c(v900 v900Var, boolean z, String str, Integer num) {
        FilterUiModel.a aVar;
        Bitmap failure;
        this.h.getClass();
        aa00 b = z900.b(v900Var);
        hdr hdrVar = this.i;
        if (hdrVar == null) {
            hdrVar = null;
        }
        zrl zrlVar = (zrl) hdrVar.c.get(b.a);
        if (zrlVar != null && zrlVar.m()) {
            try {
                failure = (Bitmap) zrlVar.o();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            r1 = failure instanceof Result.Failure ? null : failure;
        }
        x900 x900Var = v900Var.f;
        if (epx.f(x900Var, x900.a.a)) {
            aVar = FilterUiModel.a.C1456a.a;
        } else if (x900Var instanceof x900.b) {
            aVar = r1 != null ? new FilterUiModel.a.b(r1) : FilterUiModel.a.c.a;
        } else {
            if (!epx.f(x900Var, x900.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = FilterUiModel.a.c.a;
        }
        return new FilterUiModel(String.valueOf(v900Var.c), v900Var.d, aVar, false, b, z ? FilterUiModel.Type.SUB_FILTER : FilterUiModel.Type.SINGLE, str, v900Var.e, num);
    }
}
