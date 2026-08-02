package com.vk.profile.community.members.impl.ui;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.i0;
import com.vk.core.compose.component.cell.content.k0;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import com.vk.movika.sdk.base.ui.p;
import com.vk.profile.community.members.impl.domain.BannerButtonStyle;
import com.vk.profile.community.members.impl.domain.MembersListBanner;
import com.vk.profile.community.members.impl.domain.User;
import com.vk.profile.community.members.impl.ui.a;
import com.vk.profile.community.members.impl.ui.b;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.a690;
import xsna.ahn;
import xsna.alb0;
import xsna.am3;
import xsna.b1z;
import xsna.b220;
import xsna.b6l;
import xsna.bap;
import xsna.bbk0;
import xsna.bx;
import xsna.c220;
import xsna.cp10;
import xsna.cri;
import xsna.d370;
import xsna.dhx0;
import xsna.dt1;
import xsna.e220;
import xsna.e43;
import xsna.egi0;
import xsna.epx;
import xsna.f870;
import xsna.f9t;
import xsna.fnj;
import xsna.ft9;
import xsna.fwu0;
import xsna.g0t;
import xsna.ge3;
import xsna.gzs;
import xsna.h4c;
import xsna.i220;
import xsna.iah0;
import xsna.iy5;
import xsna.iyk0;
import xsna.izs;
import xsna.j220;
import xsna.ja8;
import xsna.js5;
import xsna.k9q0;
import xsna.kai;
import xsna.kpv;
import xsna.kqu0;
import xsna.ksy;
import xsna.l5g;
import xsna.ldv0;
import xsna.lg90;
import xsna.lj50;
import xsna.me4;
import xsna.mtk0;
import xsna.n34;
import xsna.ng90;
import xsna.opq;
import xsna.ou20;
import xsna.pco;
import xsna.pg90;
import xsna.phw;
import xsna.q630;
import xsna.qjg;
import xsna.qri;
import xsna.qzu0;
import xsna.r37;
import xsna.ra8;
import xsna.rep;
import xsna.rrv0;
import xsna.s200;
import xsna.s3q0;
import xsna.spj;
import xsna.swn;
import xsna.sy90;
import xsna.txj0;
import xsna.ty6;
import xsna.u4u;
import xsna.u890;
import xsna.uct;
import xsna.us9;
import xsna.vfk;
import xsna.w65;
import xsna.wiu0;
import xsna.wow;
import xsna.wzs;
import xsna.x1v0;
import xsna.xmz;
import xsna.xvy;
import xsna.xx9;
import xsna.xy;
import xsna.xzs;
import xsna.ylu0;
import xsna.yzs;
import xsna.z37;
import xsna.zak0;
import xsna.zra0;
import xsna.zzs;

/* compiled from: MembersScreen.kt */
/* loaded from: classes5.dex */
public final class d {

    /* compiled from: MembersScreen.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ j220 b;

        public a(j220 j220Var) {
            this.b = j220Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((com.vk.profile.community.members.impl.ui.a) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, j220.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: MembersScreen.kt */
    @b6l(c = "com.vk.profile.community.members.impl.ui.MembersScreenKt$MembersScreen$2$1", f = "MembersScreen.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<com.vk.profile.community.members.impl.ui.a>, com.vk.profile.community.members.impl.ui.b, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<String, s3q0> $openUrlCallback;
        final /* synthetic */ izs<UserId, s3q0> $openUserCallback;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super UserId, s3q0> izsVar, izs<? super String, s3q0> izsVar2, spj<? super b> spjVar) {
            super(3, spjVar);
            this.$openUserCallback = izsVar;
            this.$openUrlCallback = izsVar2;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<com.vk.profile.community.members.impl.ui.a> z37Var, com.vk.profile.community.members.impl.ui.b bVar, spj<? super s3q0> spjVar) {
            b bVar2 = new b(this.$openUserCallback, this.$openUrlCallback, spjVar);
            bVar2.L$0 = bVar;
            return bVar2.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.vk.profile.community.members.impl.ui.b bVar = (com.vk.profile.community.members.impl.ui.b) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (bVar instanceof b.C1633b) {
                this.$openUserCallback.invoke(((b.C1633b) bVar).a);
            } else {
                if (!(bVar instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.$openUrlCallback.invoke(((b.a) bVar).a);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MembersScreen.kt */
    public static final class c implements izs<UserId, s3q0> {
        public final /* synthetic */ z37<com.vk.profile.community.members.impl.ui.a> b;

        public c(z37<com.vk.profile.community.members.impl.ui.a> z37Var) {
            this.b = z37Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(UserId userId) {
            this.b.b(new a.g(userId));
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    /* renamed from: com.vk.profile.community.members.impl.ui.d$d, reason: collision with other inner class name */
    public static final class C1635d implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public C1635d(u4u u4uVar, List list) {
            this.b = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return ((User) this.b.get(num.intValue())).b;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class e implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public e(xmz xmzVar, List list) {
            this.b = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return qjg.a((User) this.b.get(num.intValue()));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class f implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ List b;
        public final /* synthetic */ z37 c;

        public f(List list, z37 z37Var) {
            this.b = list;
            this.c = z37Var;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
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
                    androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                User user = (User) this.b.get(intValue);
                aVar2.K(2128457846);
                z37 z37Var = this.c;
                boolean J = aVar2.J(z37Var);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new c(z37Var);
                    aVar2.R(x);
                }
                d.h(user, null, (izs) x, aVar2, 0);
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

    /* compiled from: MembersScreen.kt */
    public static final /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BannerButtonStyle.values().length];
            try {
                iArr[BannerButtonStyle.PAID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerButtonStyle.FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Platform.values().length];
            try {
                iArr2[Platform.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Platform.WEB.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Platform.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void a(MembersListBanner membersListBanner, izs izsVar, izs izsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-584723492);
        int i2 = i | (M.J(membersListBanner) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(izsVar2) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-584723492, i2, -1, "com.vk.profile.community.members.impl.ui.DonutBanner (MembersScreen.kt:246)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean s = ylu0Var.s();
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-804783854, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationDonutWavesLight132H> (VkIcons.kt:3788)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_illustration_donut_waves_light_132h, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1417044706, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationDonutWavesDark132H> (VkIcons.kt:3784)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_illustration_donut_waves_dark_132h, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(59509737, 0, -1, "com.vk.profile.community.members.impl.ui.rememberDonutBannerBackgroundPainter (DonutBannerBackgroundPainter.kt:21)");
            }
            boolean l = M.l(s);
            Object x = M.x();
            if (l || x == a.C0011a.a) {
                x = s ? new swn(e43.l(new l5g(f870.d(4294899172L)), new l5g(f870.d(4294895552L))), a2) : new swn(e43.l(new l5g(f870.d(4293714899L)), new l5g(f870.d(4293646003L))), a3);
                M.R(x);
            }
            swn swnVar = (swn) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f2 = kqu0.r;
            q630.a aVar2 = q630.a.a;
            f9t.e(txj0.h(aVar2, f2), M, 0);
            rrv0.e(false, null, null, null, null, null, kai.c(-664969255, new uct(membersListBanner, izsVar, izsVar2, swnVar), M), M, 1572870, 62);
            if (a690.d(aVar2, kqu0.v, M, 0)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new bx(membersListBanner, izsVar, izsVar2, q630Var2, i);
        }
    }

    public static final void b(ksy ksyVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1560079322);
        if ((i & 6) == 0) {
            i2 = (M.J(ksyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1560079322, i3, -1, "com.vk.profile.community.members.impl.ui.EmptyState (MembersScreen.kt:391)");
            }
            q630 d = ksyVar.d();
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            ra8 ra8Var = ra8.a;
            ty6 ty6Var = dt1.a.f;
            q630.a aVar3 = q630.a.a;
            ldv0.d(ra8Var.b(aVar3, ty6Var), null, zra0.a.a(null, null, d370.N(R.string.empty_list, 0, M), null, M, 196608, 27), null, null, null, false, M, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar3;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new me4(ksyVar, q630Var, i, 4);
        }
    }

    public static final void c(ksy ksyVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1430770261);
        if ((i & 6) == 0) {
            i2 = (M.J(ksyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1430770261, i3, -1, "com.vk.profile.community.members.impl.ui.ErrorState (MembersScreen.kt:403)");
            }
            q630 d = ksyVar.d();
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            ra8 ra8Var = ra8.a;
            ty6 ty6Var = dt1.a.f;
            q630.a aVar3 = q630.a.a;
            ldv0.d(ra8Var.b(aVar3, ty6Var), null, zra0.a.a(null, null, d370.N(R.string.group_members_list_access_denied, 0, M), null, M, 196608, 27), null, null, null, false, M, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar3;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b220(ksyVar, q630Var, i, 0);
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        gzs gzsVar2;
        androidx.compose.runtime.a M = aVar.M(-354583046);
        int i2 = i | 6 | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-354583046, i2, -1, "com.vk.profile.community.members.impl.ui.FullscreenError (MembersScreen.kt:415)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c2 = qri.c(M, aVar2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            gzsVar2 = gzsVar;
            ldv0.b(ra8.a.b(aVar2, dt1.a.f), false, null, gzsVar2, M, (i2 << 6) & 7168, 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            gzsVar2 = gzsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xx9(q630Var, gzsVar2, i);
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar, izs izsVar, xvy xvyVar, q630 q630Var) {
        float f2;
        q630 q630Var2;
        q630 q630Var3 = q630Var;
        androidx.compose.runtime.a M = aVar.M(-719478735);
        int i2 = i | (M.J(q630Var3) ? 4 : 2) | (M.J(xvyVar) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-719478735, i2, -1, "com.vk.profile.community.members.impl.ui.LazyColumnWithCardBackground (MembersScreen.kt:182)");
            }
            iyk0 iyk0Var = AndroidCompositionLocals_androidKt.b;
            Context context = (Context) M.r(iyk0Var);
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                M.K(-2103929919);
                f2 = Math.max(16, (((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 924) / 2);
                M.j();
            } else {
                M.K(-2103846467);
                M.j();
                f2 = 0;
            }
            M.K(70684485);
            if (pco.b(f2, 0)) {
                q630Var2 = q630Var3;
            } else {
                u890 m = s200.m(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var2 = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getBackground().a;
                ((Context) M.r(iyk0Var)).getResources();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var;
                q630Var2 = q630Var3.g(ng90.a(q630.a.a, new us9(m, j, w65.p(new ft9(iah0.a(2), ft9.o, f870.H(ylu0Var2.getBackground().g), false), M, 0)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 62));
            }
            M.j();
            x1v0.a(q630Var2, xvyVar, s200.m(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, null, null, false, null, izsVar, M, (i2 & 112) | ((i2 << 21) & 1879048192), ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new am3(i, 1, q630Var3, xvyVar, izsVar);
        }
    }

    public static final void f(j220 j220Var, izs<? super UserId, s3q0> izsVar, izs<? super String, s3q0> izsVar2, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-180003335);
        int i2 = (M.J(j220Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(izsVar2) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.y(gzsVar2) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-180003335, i2, -1, "com.vk.profile.community.members.impl.ui.MembersScreen (MembersScreen.kt:105)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new vfk(j220Var, 25);
                M.R(x);
            }
            izs izsVar3 = (izs) x;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new b(izsVar, izsVar2, null);
                M.R(x2);
            }
            r37.a(izsVar3, (yzs) x2, kai.c(-142533892, new e220(0, gzsVar2, gzsVar), M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h4c(j220Var, izsVar, izsVar2, gzsVar, gzsVar2, i);
        }
    }

    public static final void g(final xvy xvyVar, final List list, float f2, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        final float f3;
        androidx.compose.runtime.a M = aVar.M(1947542252);
        int i2 = i | (M.J(xvyVar) ? 4 : 2) | (M.J(list) ? 32 : 16) | 384 | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1947542252, i2, -1, "com.vk.profile.community.members.impl.ui.TrackingEffect (MembersScreen.kt:367)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bbk0.b(new b1z(xvyVar, 5));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            wow wowVar = new wow(list);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                i220 i220Var = new i220(izsVar, list, mtk0Var, xvyVar, 80.0f, null);
                M.R(i220Var);
                x2 = i220Var;
            }
            bap.g(wowVar, (wzs) x2, M, (i2 >> 3) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f3 = 80.0f;
        } else {
            M.h();
            f3 = f2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(list, f3, izsVar, i) { // from class: xsna.g220
                public final /* synthetic */ List c;
                public final /* synthetic */ float d;
                public final /* synthetic */ izs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    com.vk.profile.community.members.impl.ui.d.g(xvy.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void h(User user, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        String d;
        Cell$Left.b bVar;
        iy5 iy5Var;
        VisibleStatus zb;
        iy5 iy5Var2;
        iy5 iy5Var3;
        androidx.compose.runtime.a M = aVar.M(-1480925562);
        int i2 = i | (M.J(user) ? 4 : 2) | 48 | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1480925562, i2, -1, "com.vk.profile.community.members.impl.ui.UserCell (MembersScreen.kt:290)");
            }
            int i3 = i2 & 14;
            M.K(-1599604311);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1599604311, i3, -1, "com.vk.profile.community.members.impl.ui.getContentDescription (MembersScreen.kt:324)");
            }
            Boolean bool = user.g;
            OnlineInfo onlineInfo = user.f;
            Boolean bool2 = Boolean.TRUE;
            if (epx.f(bool, bool2)) {
                M.K(-1149781578);
                d = d370.O(R.string.talkback_group_member_support_author, new Object[]{user.d()}, M);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-1163412743);
                M.j();
                if (onlineInfo == null || !onlineInfo.Bb()) {
                    M.K(-1163412743);
                    M.j();
                    d = user.d();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    M.K(-1149628066);
                    d = d370.O(R.string.talkback_group_member_online, new Object[]{user.d()}, M);
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                }
            }
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(aVar3, "community:friends:user");
            boolean J = M.J(d);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new ge3(d, 2);
                M.R(x);
            }
            q630 a2 = egi0.a(E, (izs) x);
            phw a3 = phw.a.a(fwu0.l(js5.a(100, user.e), null, null, null, M, 0, 62), null, null, null, null, M, 196616, 30);
            androidx.compose.runtime.a aVar4 = M;
            aVar4.K(333775792);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(333775792, i3, -1, "com.vk.profile.community.members.impl.ui.getAvatarBadge (MembersScreen.kt:335)");
            }
            if (epx.f(user.g, bool2)) {
                aVar4.K(665424745);
                qzu0.a.getClass();
                lg90 I = qzu0.I(aVar4);
                long j = l5g.k;
                Object x2 = aVar4.x();
                if (x2 == c0012a) {
                    x2 = new c220(0);
                    aVar4.R(x2);
                }
                iy5 a4 = kpv.a.a(I, j, 0L, null, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, aVar4, 100663352, 188);
                aVar4 = aVar4;
                aVar4.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                bVar = null;
                iy5Var3 = a4;
            } else {
                aVar4.K(651428338);
                aVar4.j();
                aVar4.K(-787747493);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-787747493, i3, -1, "com.vk.profile.community.members.impl.ui.getOnlineBadgeIfVisible (MembersScreen.kt:349)");
                }
                if (onlineInfo == null || (zb = onlineInfo.zb()) == null) {
                    bVar = null;
                    iy5 iy5Var4 = rep.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar4.j();
                    iy5Var = iy5Var4;
                } else if (zb.Ab()) {
                    iy5 iy5Var5 = rep.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar4.j();
                    bVar = null;
                    iy5Var = iy5Var5;
                } else {
                    int i4 = g.$EnumSwitchMapping$1[zb.e.ordinal()];
                    if (i4 == 1) {
                        bVar = null;
                        aVar4.K(-1111087419);
                        aVar4.j();
                        iy5Var2 = rep.a;
                    } else if (i4 == 2) {
                        bVar = null;
                        aVar4.K(-1111086293);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1962975051, 48, -1, "com.vk.core.compose.component.image.badge.WebOnlineBadge.Companion.invoke (WebOnlineBadge.kt:61)");
                        }
                        Object x3 = aVar4.x();
                        if (x3 == c0012a) {
                            x3 = new dhx0();
                            aVar4.R(x3);
                        }
                        dhx0 dhx0Var = (dhx0) x3;
                        ((zak0) dhx0Var.a).setValue(null);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar4.j();
                        iy5Var2 = dhx0Var;
                    } else {
                        if (i4 != 3) {
                            throw alb0.c(-1111088999, aVar4);
                        }
                        aVar4.K(-1111084882);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-266960355, 48, -1, "com.vk.core.compose.component.image.badge.MobileOnlineBadge.Companion.invoke (MobileOnlineBadge.kt:59)");
                        }
                        Object x4 = aVar4.x();
                        if (x4 == c0012a) {
                            x4 = new ou20();
                            aVar4.R(x4);
                        }
                        ou20 ou20Var = (ou20) x4;
                        bVar = null;
                        ((zak0) ou20Var.a).setValue(null);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar4.j();
                        iy5Var2 = ou20Var;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar4.j();
                    iy5Var = iy5Var2;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                iy5Var3 = iy5Var;
            }
            androidx.compose.runtime.a aVar5 = aVar4;
            i0 a5 = Cell$Left.a.a(com.vk.core.compose.component.cell.content.e.a(a3, Cell$Left.Main.Size.Small, iy5Var3, null, null, null, null, aVar5, 100663344, 248), bVar, aVar5, 2);
            k0 a6 = Cell$Middle.a.a(Cell$Middle.d.b.a(user.d(), null, null, 1, null, null, aVar5, 12610560, 102), null, null, null, aVar5, 196608, 30);
            boolean z = ((i2 & 896) == 256) | (i3 == 4);
            Object x5 = aVar5.x();
            if (z || x5 == c0012a) {
                x5 = new p(12, izsVar, user);
                aVar5.R(x5);
            }
            wiu0.b(a2, false, a5, a6, null, (gzs) x5, null, aVar5, 0, 82);
            aVar2 = aVar5;
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
            s.d = new opq(i, 2, user, q630Var2, izsVar);
        }
    }
}
