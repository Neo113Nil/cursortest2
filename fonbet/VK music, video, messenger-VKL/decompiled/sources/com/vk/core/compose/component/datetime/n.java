package com.vk.core.compose.component.datetime;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.datetime.b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bap;
import xsna.bbk0;
import xsna.caj0;
import xsna.dli0;
import xsna.f1m;
import xsna.g8n0;
import xsna.k9x;
import xsna.kf7;
import xsna.lsr;
import xsna.op1;
import xsna.pvr;
import xsna.qvr;
import xsna.rli0;
import xsna.s3q0;
import xsna.spj;
import xsna.uxn;
import xsna.vax;
import xsna.vpn0;
import xsna.wax;
import xsna.wh50;
import xsna.wzs;
import xsna.yvj;
import xsna.zak0;

/* compiled from: TemporalPickerState.kt */
/* loaded from: classes17.dex */
public abstract class n {
    public final m a;
    public final wh50 b = androidx.compose.runtime.k.b(null);
    public final wh50 c;
    public final wh50 d;
    public final f1m e;
    public final f1m f;

    /* compiled from: TemporalPickerState.kt */
    @b6l(c = "com.vk.core.compose.component.datetime.TemporalPickerState$ObserveFocusFrom$1$1", f = "TemporalPickerState.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return n.this.new a(spjVar);
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
            m mVar = n.this.a;
            mVar.a().a = false;
            s3q0 s3q0Var = s3q0.a;
            ((zak0) mVar.a).setValue(mVar.a());
            return s3q0.a;
        }
    }

    /* compiled from: TemporalPickerState.kt */
    @b6l(c = "com.vk.core.compose.component.datetime.TemporalPickerState$ObserveFocusFrom$2$1", f = "TemporalPickerState.kt", l = {112}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wax $interactionSource;
        int label;
        final /* synthetic */ n this$0;

        /* compiled from: TemporalPickerState.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ ArrayList b;
            public final /* synthetic */ n c;

            public a(ArrayList arrayList, n nVar) {
                this.b = arrayList;
                this.c = nVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                vax vaxVar = (vax) obj;
                boolean z = vaxVar instanceof pvr;
                ArrayList arrayList = this.b;
                if (z) {
                    arrayList.add(vaxVar);
                } else if (vaxVar instanceof qvr) {
                    arrayList.remove(((qvr) vaxVar).a);
                }
                boolean z2 = !arrayList.isEmpty();
                m mVar = this.c.a;
                mVar.a().a = z2;
                s3q0 s3q0Var = s3q0.a;
                ((zak0) mVar.a).setValue(mVar.a());
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wax waxVar, n nVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$interactionSource = waxVar;
            this.this$0 = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$interactionSource, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ArrayList arrayList = new ArrayList();
                caj0 b = this.$interactionSource.b();
                a aVar = new a(arrayList, this.this$0);
                this.label = 1;
                b.getClass();
                if (caj0.k(b, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public n(k9x k9xVar, l lVar, m mVar) {
        this.a = mVar;
        this.c = androidx.compose.runtime.k.b(k9xVar);
        this.d = androidx.compose.runtime.k.b(lVar);
        int i = 2;
        this.e = bbk0.b(new vpn0(this, i));
        this.f = bbk0.b(new g8n0(this, i));
    }

    public final void a(wax waxVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1099487170);
        if ((i & 6) == 0) {
            i2 = (M.J(waxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1099487170, i2, -1, "com.vk.core.compose.component.datetime.TemporalPickerState.ObserveFocusFrom (TemporalPickerState.kt:105)");
            }
            s3q0 s3q0Var = s3q0.a;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new a(null);
                M.R(x);
            }
            bap.g(s3q0Var, (wzs) x, M, 6);
            int i4 = i2 & 14;
            boolean z2 = (i4 == 4) | (i3 == 32);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new b(waxVar, this, null);
                M.R(x2);
            }
            bap.g(waxVar, (wzs) x2, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uxn(this, waxVar, i, 3);
        }
    }

    public final l b() {
        return (l) ((zak0) this.d).getValue();
    }

    public abstract boolean c();

    public final Date d(SimpleDateFormat simpleDateFormat, b.C0739b c0739b) {
        m mVar = this.a;
        com.vk.core.compose.component.datetime.a c = mVar.a().c(c0739b);
        if (c != null) {
            Iterator it = dli0.e(c.e, new com.vk.movika.sdk.base.logic.interactor.d(c, 14)).iterator();
            while (it.hasNext()) {
                if (!((kf7) it.next()).i()) {
                    return null;
                }
            }
            try {
                com.vk.core.compose.component.datetime.a c2 = mVar.a().c(c0739b);
                String str = "";
                String r = c2 != null ? rli0.r(dli0.e(c2.e, new com.vk.movika.sdk.base.logic.interactor.d(c2, 14)), "", new op1(c2, 6), 30) : null;
                if (r != null) {
                    str = r;
                }
                return simpleDateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        return null;
    }
}
