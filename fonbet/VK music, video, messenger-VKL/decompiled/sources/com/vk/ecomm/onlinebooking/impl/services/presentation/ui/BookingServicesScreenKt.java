package com.vk.ecomm.onlinebooking.impl.services.presentation.ui;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.k;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import com.vkontakte.android.R;
import defpackage.j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ahn;
import xsna.alb0;
import xsna.b6l;
import xsna.bap;
import xsna.bu00;
import xsna.c490;
import xsna.ck70;
import xsna.cq;
import xsna.cqm0;
import xsna.cr7;
import xsna.cri;
import xsna.d370;
import xsna.drm0;
import xsna.dt1;
import xsna.e43;
import xsna.epx;
import xsna.er3;
import xsna.fh9;
import xsna.fy0;
import xsna.fy7;
import xsna.gq0;
import xsna.gy7;
import xsna.gzs;
import xsna.hc1;
import xsna.hy7;
import xsna.i97;
import xsna.iu6;
import xsna.iy7;
import xsna.izs;
import xsna.j5g;
import xsna.jai;
import xsna.jn7;
import xsna.jw5;
import xsna.jy7;
import xsna.k9q0;
import xsna.kai;
import xsna.kqu0;
import xsna.ksy;
import xsna.lg90;
import xsna.lqy;
import xsna.mc90;
import xsna.muv0;
import xsna.n34;
import xsna.nb90;
import xsna.or;
import xsna.ow7;
import xsna.phv0;
import xsna.q630;
import xsna.q9g;
import xsna.qjg;
import xsna.qri;
import xsna.r37;
import xsna.rc90;
import xsna.rg50;
import xsna.rrv0;
import xsna.rvi;
import xsna.s200;
import xsna.s3q0;
import xsna.spj;
import xsna.sy90;
import xsna.tx7;
import xsna.txj0;
import xsna.u6u0;
import xsna.ul1;
import xsna.uw7;
import xsna.v;
import xsna.vx7;
import xsna.wh50;
import xsna.ww7;
import xsna.wx7;
import xsna.wy7;
import xsna.wzs;
import xsna.xh2;
import xsna.xvy;
import xsna.xx7;
import xsna.yjl;
import xsna.ylu0;
import xsna.yvj;
import xsna.yx7;
import xsna.yzs;
import xsna.z37;
import xsna.zq;
import xsna.zvy;
import xsna.zx7;
import xsna.zzs;

/* compiled from: BookingServicesScreen.kt */
/* loaded from: classes18.dex */
public final class BookingServicesScreenKt {

    /* compiled from: BookingServicesScreen.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt$BookingServicesScreen$2$1", f = "BookingServicesScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements yzs<z37<com.vk.ecomm.onlinebooking.impl.services.presentation.a>, com.vk.ecomm.onlinebooking.impl.services.presentation.c, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<com.vk.ecomm.onlinebooking.impl.services.presentation.c, s3q0> $onEvent;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super com.vk.ecomm.onlinebooking.impl.services.presentation.c, s3q0> izsVar, spj<? super a> spjVar) {
            super(3, spjVar);
            this.$onEvent = izsVar;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<com.vk.ecomm.onlinebooking.impl.services.presentation.a> z37Var, com.vk.ecomm.onlinebooking.impl.services.presentation.c cVar, spj<? super s3q0> spjVar) {
            a aVar = new a(this.$onEvent, spjVar);
            aVar.L$0 = cVar;
            return aVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.vk.ecomm.onlinebooking.impl.services.presentation.c cVar = (com.vk.ecomm.onlinebooking.impl.services.presentation.c) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onEvent.invoke(cVar);
            return s3q0.a;
        }
    }

    /* compiled from: BookingServicesScreen.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt$BookingServicesView$2$2$1", f = "BookingServicesScreen.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ gzs<s3q0> $onContent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gzs<s3q0> gzsVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$onContent = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$onContent, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onContent.invoke();
            return s3q0.a;
        }
    }

    /* compiled from: BookingServicesScreen.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt$ServicesWithTabsView$1$1$1$1", f = "BookingServicesScreen.kt", l = {PsExtractor.VIDEO_STREAM_MASK}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ int $page;
        final /* synthetic */ mc90 $pagerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc90 mc90Var, int i, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$pagerState = mc90Var;
            this.$page = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$pagerState, this.$page, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                mc90 mc90Var = this.$pagerState;
                int i2 = this.$page;
                this.label = 1;
                if (mc90.g(mc90Var, i2, null, this, 6) == coroutineSingletons) {
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

    /* compiled from: BookingServicesScreen.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt$ServicesWithTabsView$1$2$1$1", f = "BookingServicesScreen.kt", l = {263, 264}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ List<Integer> $categoryIndexes;
        final /* synthetic */ int $index;
        final /* synthetic */ xvy $listState;
        final /* synthetic */ mc90 $pagerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(mc90 mc90Var, int i, xvy xvyVar, List<Integer> list, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$pagerState = mc90Var;
            this.$index = i;
            this.$listState = xvyVar;
            this.$categoryIndexes = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$pagerState, this.$index, this.$listState, this.$categoryIndexes, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r7.k(r1, 0, r6) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
        
            if (xsna.mc90.g(r7, r1, null, r6, 6) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                mc90 mc90Var = this.$pagerState;
                int i2 = this.$index;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            xvy xvyVar = this.$listState;
            int i3 = this.$index;
            int intValue = i3 == 0 ? 0 : this.$categoryIndexes.get(i3 - 1).intValue();
            this.label = 2;
            fh9 fh9Var = xvy.y;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class e implements izs<Integer, Object> {
        public final /* synthetic */ vx7 b;
        public final /* synthetic */ List c;

        public e(vx7 vx7Var, List list) {
            this.b = vx7Var;
            this.c = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            int intValue = num.intValue();
            return this.b.invoke(Integer.valueOf(intValue), this.c.get(intValue));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class f implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public f(List list) {
            this.b = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return qjg.a((BookingServicesScreenState.ServiceWrapper) this.b.get(num.intValue()));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class g implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ List b;
        public final /* synthetic */ BookingServiceType c;
        public final /* synthetic */ BookingServicesScreenState.b d;
        public final /* synthetic */ String e;
        public final /* synthetic */ izs f;
        public final /* synthetic */ List g;

        public g(List list, BookingServiceType bookingServiceType, BookingServicesScreenState.b bVar, String str, izs izsVar, List list2) {
            this.b = list;
            this.c = bookingServiceType;
            this.d = bVar;
            this.e = str;
            this.f = izsVar;
            this.g = list2;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            float f;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                BookingServicesScreenState.ServiceWrapper serviceWrapper = (BookingServicesScreenState.ServiceWrapper) this.b.get(intValue);
                aVar2.K(672347263);
                BookingServicesScreenKt.i(serviceWrapper, this.c, this.d, this.e, this.f, aVar2, 0);
                if (intValue < e43.h(this.g)) {
                    aVar2.K(-1363775245);
                    BookingServiceType bookingServiceType = this.c;
                    bookingServiceType.getClass();
                    int i2 = BookingServiceType.b.$EnumSwitchMapping$0[bookingServiceType.ordinal()];
                    if (i2 == 1) {
                        f = 12;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f = 4;
                    }
                    ck70.b(q630.a.a, f, aVar2, 0);
                } else {
                    aVar2.K(659770624);
                    aVar2.j();
                }
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: BookingServicesScreen.kt */
    public static final /* synthetic */ class h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingServiceType.values().length];
            try {
                iArr[BookingServiceType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingServiceType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class i<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(((BookingServicesScreenState.ServiceWrapper) t2).b.l, ((BookingServicesScreenState.ServiceWrapper) t).b.l);
        }
    }

    public static final void a(z37<com.vk.ecomm.onlinebooking.impl.services.presentation.a> z37Var, com.vk.ecomm.onlinebooking.impl.services.presentation.model.a aVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar2, int i2) {
        androidx.compose.runtime.a M = aVar2.M(1901296134);
        int i3 = (M.J(z37Var) ? 4 : 2) | i2 | (M.J(aVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1901296134, i3, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServices (BookingServicesScreen.kt:127)");
            }
            rvi.a(c490.a.b(null), kai.c(-2006618810, new cr7(aVar, z37Var, gzsVar, 1), M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fy7(i2, 0, z37Var, aVar, gzsVar);
        }
    }

    public static final void b(final ww7 ww7Var, final gzs<s3q0> gzsVar, final boolean z, final izs<? super com.vk.ecomm.onlinebooking.impl.services.presentation.c, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a M = aVar.M(-2122637527);
        int i3 = (M.J(ww7Var) ? 4 : 2) | i2 | (M.y(gzsVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2122637527, i3, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreen (BookingServicesScreen.kt:99)");
            }
            boolean z2 = (i3 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new ul1(ww7Var, 10);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z3 = (i3 & 7168) == 2048;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new a(izsVar, null);
                M.R(x2);
            }
            r37.a(izsVar2, (yzs) x2, kai.c(1497964821, new zzs() { // from class: xsna.cy7
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i4;
                    z37 z37Var = (z37) obj;
                    com.vk.ecomm.onlinebooking.impl.services.presentation.model.a aVar2 = (com.vk.ecomm.onlinebooking.impl.services.presentation.model.a) obj2;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        i4 = (aVar3.J(z37Var) ? 4 : 2) | intValue;
                    } else {
                        i4 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i4 |= aVar3.J(aVar2) ? 32 : 16;
                    }
                    if (aVar3.t(i4 & 1, (i4 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1497964821, i4, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreen.<anonymous> (BookingServicesScreen.kt:110)");
                        }
                        boolean z4 = z;
                        gzs gzsVar2 = gzsVar;
                        if (z4) {
                            aVar3.K(1159823473);
                            rrv0.e(true, null, null, null, null, null, kai.c(-1605592301, new ar0(z37Var, aVar2, gzsVar2, 1), aVar3), aVar3, 1572870, 62);
                            aVar3.j();
                        } else {
                            aVar3.K(1159951596);
                            rrv0.d(null, null, null, null, kai.c(-421263138, new br0(z37Var, aVar2, gzsVar2, 3), aVar3), aVar3, 24576, 15);
                            aVar3.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(gzsVar, z, izsVar, i2) { // from class: xsna.dy7
                public final /* synthetic */ gzs c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ izs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    BookingServicesScreenKt.b(ww7.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(com.vk.ecomm.onlinebooking.impl.services.presentation.model.a aVar, izs<? super com.vk.ecomm.onlinebooking.impl.services.presentation.a, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i2) {
        String a2;
        a.C0011a.C0012a c0012a;
        int i3;
        TopBar$Before.e eVar;
        androidx.compose.runtime.a M = aVar2.M(665026085);
        int i4 = (M.J(aVar) ? 4 : 2) | i2 | (M.y(izsVar) ? 32 : 16);
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(665026085, i4, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesTopBar (BookingServicesScreen.kt:179)");
            }
            BookingServiceType bookingServiceType = aVar.b;
            bookingServiceType.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(784285673, 0, -1, "com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType.<get-title> (BookingServiceType.kt:24)");
            }
            int i5 = BookingServiceType.b.$EnumSwitchMapping$0[bookingServiceType.ordinal()];
            if (i5 == 1) {
                a2 = zq.a(M, 2079256921, R.string.bookings_services_title, M, 0);
            } else {
                if (i5 != 2) {
                    throw alb0.c(2079255767, M);
                }
                a2 = zq.a(M, 2079259167, R.string.bookings_group_services_title, M, 0);
            }
            String str = a2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            androidx.compose.runtime.a aVar3 = M;
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, 196608, 30), null, null, cq.b("screen_title", null, 3), aVar3, 6);
            boolean z = aVar.c.a;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z) {
                aVar3.K(-891611868);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
                }
                lg90 b2 = or.b(aVar3, -45049119, R.drawable.vk_icon_arrow_left_outline_28, aVar3, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N = d370.N(R.string.booking_accessability_back, 0, aVar3);
                com.vk.core.compose.component.semantics.a b3 = cq.b("back_button", null, 3);
                boolean z2 = (i4 & 112) == 32;
                Object x = aVar3.x();
                if (z2 || x == c0012a2) {
                    x = new i97(izsVar, 2);
                    aVar3.R(x);
                }
                i3 = 0;
                c0012a = c0012a2;
                TopBar$Before.e a4 = TopBar$Before.e.a.a(b2, N, (gzs) x, null, null, b3, aVar3, 1572872, 24);
                aVar3 = aVar3;
                aVar3.j();
                eVar = a4;
            } else {
                c0012a = c0012a2;
                i3 = 0;
                aVar3.K(-891242751);
                aVar3.j();
                eVar = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(976347900, i3, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
            }
            lg90 b4 = or.b(aVar3, 861936997, R.drawable.vk_icon_cancel_outline_28, aVar3, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N2 = d370.N(R.string.booking_accessability_close, i3, aVar3);
            if ((i4 & 112) == 32) {
                i3 = 1;
            }
            Object x2 = aVar3.x();
            if (i3 != 0 || x2 == c0012a) {
                x2 = new gy7(izsVar, 0);
                aVar3.R(x2);
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            muv0.h(a3, null, null, null, null, eVar, d.a.a(d.c.C0760d.a.a(b4, N2, (gzs) x2, null, null, null, aVar4, 1572872, 56), null, null, cq.b("close_button", null, 3), aVar4, 24576, 6), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 0, 0, 8094);
            M = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hy7(aVar, izsVar, i2, 0);
        }
    }

    public static final void d(com.vk.ecomm.onlinebooking.impl.services.presentation.model.a aVar, izs<? super com.vk.ecomm.onlinebooking.impl.services.presentation.a, s3q0> izsVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar2, int i2) {
        androidx.compose.runtime.a M = aVar2.M(-1573647318);
        int i3 = i2 | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1573647318, i3, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesView (BookingServicesScreen.kt:142)");
            }
            jai c2 = kai.c(649846321, new jn7(1, aVar, izsVar), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phv0.b(null, c2, null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(80334470, new xx7(aVar, izsVar, gzsVar), M), M, 805306416, 381);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v(aVar, izsVar, gzsVar, i2, 2);
        }
    }

    public static final void e(final BookingServicesScreenState.e eVar, final String str, final boolean z, final int i2, final izs<? super com.vk.ecomm.onlinebooking.impl.services.presentation.a, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i3) {
        int i4;
        String str2;
        final boolean z2;
        final int i5;
        izs<? super com.vk.ecomm.onlinebooking.impl.services.presentation.a, s3q0> izsVar2;
        androidx.compose.runtime.a M = aVar.M(1099251321);
        if ((i3 & 6) == 0) {
            i4 = (M.J(eVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            str2 = str;
            i4 |= M.J(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i3 & 384) == 0) {
            z2 = z;
            i4 |= M.l(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i3 & 3072) == 0) {
            i5 = i2;
            i4 |= M.o(i5) ? 2048 : 1024;
        } else {
            i5 = i2;
        }
        if ((i3 & 24576) == 0) {
            izsVar2 = izsVar;
            i4 |= M.y(izsVar2) ? 16384 : 8192;
        } else {
            izsVar2 = izsVar;
        }
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1099251321, i4, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.CTAFooterView (BookingServicesScreen.kt:445)");
            }
            final String str3 = str2;
            final izs<? super com.vk.ecomm.onlinebooking.impl.services.presentation.a, s3q0> izsVar3 = izsVar2;
            xh2.a(Boolean.valueOf(!epx.f(eVar, BookingServicesScreenState.e.d)), null, null, null, "BookingServicesBottomBar", null, kai.c(-895907242, new zzs() { // from class: xsna.qx7
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-895907242, intValue, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.CTAFooterView.<anonymous> (BookingServicesScreen.kt:451)");
                    }
                    if (booleanValue) {
                        aVar2.K(-1045820716);
                        izs izsVar4 = izsVar3;
                        boolean J = aVar2.J(izsVar4);
                        Object x = aVar2.x();
                        if (J || x == a.C0011a.a) {
                            x = new yt7(izsVar4, 1);
                            aVar2.R(x);
                        }
                        gx7.a(BookingServicesScreenState.e.this, null, str3, (gzs) x, z2, i5, aVar2, 0);
                        aVar2.j();
                    } else {
                        aVar2.K(-1045482165);
                        ck70.b(q630.a.a, 12, aVar2, 6);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, 1597440, 46);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rx7
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    BookingServicesScreenKt.e(BookingServicesScreenState.e.this, str, z, i2, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(yjl yjlVar, yjl yjlVar2, List list, q630 q630Var, wzs wzsVar, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(-1977506769);
        int i3 = i2 | (M.J(yjlVar) ? 4 : 2) | (M.J(yjlVar2) ? 32 : 16) | (M.J(list) ? 256 : 128) | (M.y(wzsVar) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1977506769, i3, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.CategoriesTabsView (BookingServicesScreen.kt:403)");
            }
            u6u0.b(yjlVar, kai.c(1826003071, new wx7(list, yjlVar2, wzsVar, yjlVar), M), ahn.E(q630Var, "services_categories_row"), 0L, false, null, M, (i3 & 14) | 48);
            nb90.a(yjlVar2, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, null, bu00.b, M, (i3 >> 3) & 14, 24576, 16382);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yx7(yjlVar, yjlVar2, list, q630Var, wzsVar, i2);
        }
    }

    public static final void g(String str, int i2, BookingServiceType bookingServiceType, q630 q630Var, androidx.compose.runtime.a aVar, int i3) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        float f2;
        androidx.compose.runtime.a M = aVar.M(-548242534);
        int i4 = i3 | (M.J(str) ? 4 : 2) | (M.o(i2) ? 32 : 16) | (M.o(bookingServiceType.ordinal()) ? 256 : 128) | 3072;
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-548242534, i4, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.CategoryTitleView (BookingServicesScreen.kt:473)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c2 = qri.c(M, aVar3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (i2 > 0) {
                M.K(299727154);
                bookingServiceType.getClass();
                int i5 = BookingServiceType.b.$EnumSwitchMapping$0[bookingServiceType.ordinal()];
                if (i5 == 1) {
                    f2 = 0;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = 6;
                }
                ck70.b(aVar3, f2, M, 0);
            } else {
                M.K(280739902);
                M.j();
            }
            com.vk.core.compose.component.group.header.g.b(f.a.a(str, null, null, null, null, null, null, null, false, M, (i4 & 14) | 805306368, 510), ahn.E(aVar3, "services_category_subtitle"), b.d.a, null, null, null, false, M, 384, 120);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new iu6(str, i2, bookingServiceType, q630Var2, i3);
        }
    }

    public static final void h(final int i2, final int i3, final xvy xvyVar, final izs<? super Integer, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i4) {
        androidx.compose.runtime.a M = aVar.M(631155115);
        int i5 = i4 | (M.o(i2) ? 4 : 2) | (M.o(i3) ? 32 : 16) | (M.J(xvyVar) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i5 & 1, (i5 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(631155115, i5, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.OnGroupChangeEffect (BookingServicesScreen.kt:492)");
            }
            Integer valueOf = Integer.valueOf(i2);
            Integer valueOf2 = Integer.valueOf(i3);
            boolean z = ((i5 & 14) == 4) | ((i5 & 896) == 256) | ((i5 & 112) == 32) | ((i5 & 7168) == 2048);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                BookingServicesScreenKt$OnGroupChangeEffect$1$1 bookingServicesScreenKt$OnGroupChangeEffect$1$1 = new BookingServicesScreenKt$OnGroupChangeEffect$1$1(xvyVar, i2, i3, izsVar, null);
                M.R(bookingServicesScreenKt$OnGroupChangeEffect$1$1);
                x = bookingServicesScreenKt$OnGroupChangeEffect$1$1;
            }
            bap.e(valueOf, valueOf2, xvyVar, (wzs) x, M, i5 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i2, i3, xvyVar, izsVar, i4) { // from class: xsna.sx7
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ xvy d;
                public final /* synthetic */ izs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    BookingServicesScreenKt.h(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void i(BookingServicesScreenState.ServiceWrapper serviceWrapper, BookingServiceType bookingServiceType, BookingServicesScreenState.b bVar, String str, izs<? super com.vk.ecomm.onlinebooking.impl.services.presentation.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(1672910843);
        int i3 = i2 | (M.J(serviceWrapper) ? 4 : 2) | (M.o(bookingServiceType.ordinal()) ? 32 : 16) | (M.J(bVar) ? 256 : 128) | (M.J(str) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1672910843, i3, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.RenderServiceItem (BookingServicesScreen.kt:327)");
            }
            int i4 = h.$EnumSwitchMapping$0[bookingServiceType.ordinal()];
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i4 == 1) {
                M.K(-1113262707);
                q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 1, q630.a.a);
                BookingServiceModel bookingServiceModel = serviceWrapper.b;
                boolean z = serviceWrapper.c;
                boolean z2 = serviceWrapper.d;
                boolean z3 = bVar.a;
                boolean z4 = ((57344 & i3) == 16384) | ((i3 & 14) == 4);
                Object x = M.x();
                if (z4 || x == c0012a) {
                    x = new hc1(2, izsVar, serviceWrapper);
                    M.R(x);
                }
                uw7.c(bookingServiceModel, str, z, z2, F, false, z3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (gzs) x, M, (i3 >> 6) & 112);
                M = M;
                M.j();
            } else {
                if (i4 != 2) {
                    throw alb0.c(1349559854, M);
                }
                M.K(-1112781432);
                BookingServiceModel bookingServiceModel2 = serviceWrapper.b;
                boolean z5 = serviceWrapper.d;
                boolean z6 = ((57344 & i3) == 16384) | ((i3 & 14) == 4);
                Object x2 = M.x();
                if (z6 || x2 == c0012a) {
                    x2 = new fy0(3, izsVar, serviceWrapper);
                    M.R(x2);
                }
                uw7.a(bookingServiceModel2, str, z5, null, false, (gzs) x2, M, (i3 >> 6) & 112);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zx7(serviceWrapper, bookingServiceType, bVar, str, izsVar, i2, 0);
        }
    }

    public static final void j(a.InterfaceC0987a.C0988a c0988a, final BookingServiceType bookingServiceType, final izs<? super com.vk.ecomm.onlinebooking.impl.services.presentation.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i2) {
        List list;
        yvj yvjVar;
        yjl yjlVar;
        q630.a aVar2;
        List list2;
        List<ow7> list3;
        xvy xvyVar;
        androidx.compose.runtime.a aVar3;
        int i3;
        int i4;
        BookingServicesScreenState.c cVar;
        yjl yjlVar2;
        List list4;
        androidx.compose.runtime.a M = aVar.M(-116362976);
        int i5 = i2 | (M.J(c0988a) ? 4 : 2) | (M.o(bookingServiceType.ordinal()) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i5 & 1, (i5 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-116362976, i5, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.ServicesWithTabsView (BookingServicesScreen.kt:212)");
            }
            q630.a aVar4 = q630.a.a;
            q630 f2 = txj0.f(aVar4, 1.0f);
            a.b bVar = androidx.compose.foundation.layout.a.d;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(bVar, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f2);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar2 = (yvj) x;
            List<ow7> list5 = c0988a.d;
            final Map<Integer, List<BookingServicesScreenState.ServiceWrapper>> map = c0988a.c;
            final String str = c0988a.e;
            String str2 = c0988a.g;
            BookingServicesScreenState.e eVar = c0988a.f;
            BookingServicesScreenState.c cVar2 = c0988a.h;
            final BookingServicesScreenState.b bVar2 = c0988a.i;
            boolean y = M.y(list5);
            Object x2 = M.x();
            if (y || x2 == obj) {
                x2 = new j(list5, 11);
                M.R(x2);
            }
            yjl b2 = rc90.b(0, (gzs) x2, M, 0, 3);
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = new ArrayList();
                M.R(x3);
            }
            List list6 = (List) x3;
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = androidx.compose.runtime.i.a(0);
                M.R(x4);
            }
            rg50 rg50Var = (rg50) x4;
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = androidx.compose.runtime.i.a(0);
                M.R(x5);
            }
            rg50 rg50Var2 = (rg50) x5;
            Object x6 = M.x();
            if (x6 == obj) {
                x6 = k.b(null);
                M.R(x6);
            }
            final wh50 wh50Var = (wh50) x6;
            xvy a3 = zvy.a(0, 3, M);
            int intValue = rg50Var.getIntValue();
            int intValue2 = rg50Var2.getIntValue();
            boolean y2 = M.y(list6) | M.y(yvjVar2) | M.J(b2);
            Object x7 = M.x();
            if (y2 || x7 == obj) {
                list = list6;
                x7 = new iy7(list, yvjVar2, b2, rg50Var, rg50Var2, 0);
                yvjVar = yvjVar2;
                yjlVar = b2;
                M.R(x7);
            } else {
                yjlVar = b2;
                yvjVar = yvjVar2;
                list = list6;
            }
            yjl yjlVar3 = yjlVar;
            final String str3 = str2;
            List list7 = list;
            h(intValue, intValue2, a3, (izs) x7, M, 0);
            int i6 = i5 & 896;
            wy7.a(i6 | 48, M, str, izsVar, txj0.f(s200.E(aVar4, 16, 8), 1.0f));
            if (list5.isEmpty() || str.length() != 0) {
                aVar2 = aVar4;
                list2 = list7;
                list3 = list5;
                xvyVar = a3;
                aVar3 = M;
                i3 = -509666664;
                aVar3.K(-509666664);
            } else {
                M.K(-498796700);
                q630 f3 = txj0.f(aVar4, 1.0f);
                boolean y3 = M.y(yvjVar) | M.J(yjlVar3) | M.J(a3) | M.y(list7) | (i6 == 256);
                Object x8 = M.x();
                if (y3 || x8 == obj) {
                    aVar2 = aVar4;
                    yjlVar2 = yjlVar3;
                    jy7 jy7Var = new jy7(yvjVar, izsVar, yjlVar2, a3, list7);
                    xvyVar = a3;
                    list4 = list7;
                    M.R(jy7Var);
                    x8 = jy7Var;
                } else {
                    xvyVar = a3;
                    yjlVar2 = yjlVar3;
                    list4 = list7;
                    aVar2 = aVar4;
                }
                yjl yjlVar4 = yjlVar2;
                i3 = -509666664;
                yjl yjlVar5 = yjlVar2;
                list2 = list4;
                list3 = list5;
                f(yjlVar5, yjlVar4, list3, f3, (wzs) x8, M, 3072);
                aVar3 = M;
            }
            aVar3.j();
            if (str.length() == 0) {
                aVar3.K(-498150443);
                q630 E = ahn.E(q9g.a(aVar2, 1.0f), "main_list");
                boolean y4 = aVar3.y(list3) | aVar3.y(map) | aVar3.J(str) | ((i5 & 112) == 32) | aVar3.y(list2) | aVar3.J(bVar2) | aVar3.J(str3) | (i6 == 256);
                Object x9 = aVar3.x();
                if (y4 || x9 == obj) {
                    final List list8 = list2;
                    i4 = i3;
                    M = aVar3;
                    final List<ow7> list9 = list3;
                    izs izsVar2 = new izs() { // from class: xsna.px7
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            nvy nvyVar = (nvy) obj2;
                            final int i7 = 0;
                            int i8 = 0;
                            for (Object obj3 : list9) {
                                int i9 = i7 + 1;
                                if (i7 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                final ow7 ow7Var = (ow7) obj3;
                                int i10 = ow7Var.a;
                                String str4 = str;
                                Map map2 = map;
                                List l = BookingServicesScreenKt.l(i10, str4, map2);
                                wh50 wh50Var2 = wh50Var;
                                ow7 ow7Var2 = (ow7) wh50Var2.getValue();
                                final BookingServiceType bookingServiceType2 = bookingServiceType;
                                if (ow7Var2 == null || !ow7Var.equals((ow7) wh50Var2.getValue())) {
                                    nvy.g(nvyVar, null, null, new jai(1956348459, new yzs() { // from class: xsna.ux7
                                        @Override // xsna.yzs
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj5;
                                            int intValue3 = ((Integer) obj6).intValue();
                                            if (aVar6.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1956348459, intValue3, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.ServicesWithTabsView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookingServicesScreen.kt:283)");
                                                }
                                                BookingServicesScreenKt.g(ow7.this.b, i7, bookingServiceType2, null, aVar6, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar6.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, true), 3);
                                    wh50Var2.setValue(ow7Var);
                                    int size = ((List) map2.getOrDefault(Integer.valueOf(ow7Var.a), EmptyList.b)).size() + 1 + i8;
                                    list8.add(Integer.valueOf(size));
                                    i8 = size;
                                }
                                nvyVar.e(l.size(), new BookingServicesScreenKt.e(new vx7((byte) 0, 0), l), new BookingServicesScreenKt.f(l), new jai(2039820996, new BookingServicesScreenKt.g(l, bookingServiceType2, bVar2, str3, izsVar, l), true));
                                i7 = i9;
                            }
                            return s3q0.a;
                        }
                    };
                    str3 = str3;
                    M.R(izsVar2);
                    x9 = izsVar2;
                } else {
                    M = aVar3;
                    str3 = str3;
                    i4 = i3;
                }
                lqy.a(E, xvyVar, null, null, null, null, false, null, (izs) x9, M, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
                M.j();
                cVar = cVar2;
            } else {
                M = aVar3;
                i4 = i3;
                M.K(-496690870);
                cVar = cVar2;
                k(c0988a, bookingServiceType, izsVar, q9g.a(aVar2, 1.0f), M, i5 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                M.j();
            }
            if (cVar.b) {
                M.K(-496491726);
                e(eVar, str3, cVar.a, cVar.c, izsVar, M, (i5 << 6) & 57344);
            } else {
                M.K(i4);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new er3(c0988a, bookingServiceType, izsVar, i2, 3);
        }
    }

    public static final void k(a.InterfaceC0987a.C0988a c0988a, BookingServiceType bookingServiceType, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(-2014413064);
        int i3 = i2 | (M.J(c0988a) ? 4 : 2) | (M.o(bookingServiceType.ordinal()) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2014413064, i3, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.SimpleServicesList (BookingServicesScreen.kt:355)");
            }
            q630 E = ahn.E(q630Var, "service_search_result_list");
            a.j g2 = androidx.compose.foundation.layout.a.g(12);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new gq0(c0988a, bookingServiceType, izsVar, 1);
                M.R(x);
            }
            lqy.a(E, null, null, g2, null, null, false, null, (izs) x, M, 24576, 494);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tx7(c0988a, bookingServiceType, izsVar, q630Var, i2);
        }
    }

    public static final List l(int i2, String str, Map map) {
        List list = (List) map.get(Integer.valueOf(i2));
        if (list == null) {
            return j5g.D0(new i(), EmptyList.b);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (str.length() == 0 ? true : drm0.D(cqm0.n(((BookingServicesScreenState.ServiceWrapper) obj).b.c), cqm0.n(str), false)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
