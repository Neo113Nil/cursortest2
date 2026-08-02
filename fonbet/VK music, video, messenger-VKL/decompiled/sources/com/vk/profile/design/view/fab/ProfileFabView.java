package com.vk.profile.design.view.fab;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.core.tabs.ui.fab.ProfileFabState;
import com.vk.profile.design.view.fab.ProfileFabView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.aak0;
import xsna.anp;
import xsna.aoo;
import xsna.aqw;
import xsna.asp;
import xsna.b6l;
import xsna.bap;
import xsna.bbk0;
import xsna.c050;
import xsna.c3v;
import xsna.dhq;
import xsna.etk0;
import xsna.fcy;
import xsna.fkb0;
import xsna.gwd0;
import xsna.gzs;
import xsna.i440;
import xsna.izs;
import xsna.jq2;
import xsna.kai;
import xsna.ki80;
import xsna.kn0;
import xsna.mm2;
import xsna.mtk0;
import xsna.mwd0;
import xsna.phr;
import xsna.pqz;
import xsna.pr6;
import xsna.q83;
import xsna.rpo0;
import xsna.rrv0;
import xsna.s3q0;
import xsna.spj;
import xsna.sv1;
import xsna.tra0;
import xsna.uog0;
import xsna.uov0;
import xsna.vog0;
import xsna.wh50;
import xsna.wzs;
import xsna.xk6;
import xsna.xtm0;
import xsna.y18;
import xsna.ylu0;
import xsna.yvj;
import xsna.zak0;
import xsna.zf20;
import xsna.zrp;

/* compiled from: ProfileFabView.kt */
/* loaded from: classes5.dex */
public final class ProfileFabView extends rpo0 implements dhq {
    public static final /* synthetic */ int r = 0;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileFabView.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CURRENT;
        public static final a NEXT;

        static {
            a aVar = new a("CURRENT", 0);
            CURRENT = aVar;
            a aVar2 = new a("NEXT", 1);
            NEXT = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: ProfileFabView.kt */
    @b6l(c = "com.vk.profile.design.view.fab.ProfileFabView$ThemedContent$1$1$1", f = "ProfileFabView.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return ProfileFabView.this.new b(spjVar);
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
            ProfileFabView.this.getOnGrowthTrapButtonShown().invoke();
            return s3q0.a;
        }
    }

    /* compiled from: ProfileFabView.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfileFabState.State.values().length];
            try {
                iArr[ProfileFabState.State.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileFabState.State.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfileFabState.State.INITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProfileFabState.State.RELOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProfileFabState.State.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProfileFabState.State.LOADED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProfileFabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = k.b(new etk0(0));
        setViewCompositionStrategy(sv1.g(context));
        this.n = k.b(new c3v(18));
        this.o = k.b(new pqz(18));
        this.p = k.b(new gwd0(0));
        this.q = k.b(new pr6(27));
    }

    public static s3q0 B(ProfileFabState profileFabState, ProfileFabView profileFabView, boolean z, androidx.compose.runtime.a aVar, int i) {
        ProfileFabView profileFabView2;
        fcy fcyVar;
        if (aVar.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1076888314, i, -1, "com.vk.profile.design.view.fab.ProfileFabView.getCurrentTabPlaceable.<anonymous> (ProfileFabView.kt:206)");
            }
            boolean y = aVar.y(profileFabView);
            Object x = aVar.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                q83 q83Var = new q83(0, profileFabView, ProfileFabView.class, "onLeftButtonClick", "onLeftButtonClick()V", 0, 5);
                profileFabView2 = profileFabView;
                aVar.R(q83Var);
                x = q83Var;
            } else {
                profileFabView2 = profileFabView;
            }
            gzs gzsVar = (gzs) ((fcy) x);
            ProfileFabState profileFabState2 = profileFabView2.getState().a;
            if ((profileFabState2 != null ? profileFabState2.e : null) != null) {
                aVar.K(-1825734485);
                boolean y2 = aVar.y(profileFabView2);
                Object x2 = aVar.x();
                if (y2 || x2 == c0012a) {
                    ki80 ki80Var = new ki80(0, profileFabView2, ProfileFabView.class, "onGrowthButtonClick", "onGrowthButtonClick()V", 0, 1);
                    aVar.R(ki80Var);
                    x2 = ki80Var;
                }
                fcyVar = (fcy) x2;
                aVar.j();
            } else {
                aVar.K(-1825668052);
                boolean y3 = aVar.y(profileFabView2);
                Object x3 = aVar.x();
                if (y3 || x3 == c0012a) {
                    kn0 kn0Var = new kn0(0, profileFabView2, ProfileFabView.class, "onRightButtonClick", "onRightButtonClick()V", 0, 4);
                    aVar.R(kn0Var);
                    x3 = kn0Var;
                }
                fcyVar = (fcy) x3;
                aVar.j();
            }
            mwd0.a(profileFabState, gzsVar, (gzs) fcyVar, z, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }

    public static aoo C(ProfileFabView profileFabView) {
        return profileFabView.getState().d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? jq2.d(200, 0, null, 6) : new aak0();
    }

    public static s3q0 D(final ProfileFabView profileFabView, final boolean z, androidx.compose.runtime.a aVar, int i) {
        long j;
        y18 a2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1843019681, i, -1, "com.vk.profile.design.view.fab.ProfileFabView.ThemedContent.<anonymous> (ProfileFabView.kt:132)");
        }
        final ProfileFabState profileFabState = profileFabView.getState().c != null ? profileFabView.getState().c : profileFabView.getState().a;
        final float f = profileFabView.getState().c != null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : profileFabView.getState().d;
        if ((profileFabState != null ? profileFabState.e : null) != null) {
            aVar.K(1462825229);
            s3q0 s3q0Var = s3q0.a;
            boolean y = aVar.y(profileFabView);
            Object x = aVar.x();
            if (y || x == a.C0011a.a) {
                x = profileFabView.new b(null);
                aVar.R(x);
            }
            bap.g(s3q0Var, (wzs) x, aVar, 6);
        } else {
            aVar.K(1457378467);
        }
        aVar.j();
        if (z) {
            aVar.K(-1615373553);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.j().b;
        } else {
            aVar.K(-1615372014);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.getBackground().x;
        }
        aVar.j();
        uog0 b2 = vog0.b(z ? 11 : 50);
        if (z) {
            aVar.K(1463238707);
            float f2 = (float) 0.8d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a2 = aqw.a(f2, ylu0Var3.m().d);
            aVar.j();
        } else {
            aVar.K(1463355577);
            float f3 = (float) 0.33d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var4 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a2 = aqw.a(f3, ylu0Var4.p().c);
            aVar.j();
        }
        uov0.a(null, b2, j, 0L, a2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-1375417928, new wzs() { // from class: xsna.hwd0
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                int intValue = ((Integer) obj2).intValue();
                return ProfileFabView.F(ProfileFabView.this, profileFabState, f, z, (androidx.compose.runtime.a) obj, intValue);
            }
        }, aVar), aVar, 1572864, 41);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return s3q0.a;
    }

    public static boolean E(ProfileFabView profileFabView) {
        etk0 state = profileFabView.getState();
        ProfileFabState profileFabState = profileFabView.getState().a;
        if ((profileFabState != null ? profileFabState.e : null) != null) {
            return state.e;
        }
        if (state.h) {
            return (state.d > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (state.d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) == 0 ? J(state.a) : true;
        }
        return false;
    }

    public static s3q0 F(ProfileFabView profileFabView, ProfileFabState profileFabState, float f, boolean z, androidx.compose.runtime.a aVar, int i) {
        if (aVar.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1375417928, i, -1, "com.vk.profile.design.view.fab.ProfileFabView.ThemedContent.<anonymous>.<anonymous> (ProfileFabView.kt:150)");
            }
            boolean J = profileFabState != null ? J(profileFabState) : false;
            ProfileFabState profileFabState2 = profileFabView.getState().b;
            ProfileFabState profileFabState3 = profileFabView.getState().b;
            profileFabView.G(profileFabState, J, profileFabState2, profileFabState3 != null ? J(profileFabState3) : false, f, z, aVar, 2293760);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }

    public static final void H(ProfileFabView profileFabView) {
        ProfileFabState profileFabState = profileFabView.getState().a;
        if (profileFabState != null) {
            profileFabView.getOnLeftButtonClicked().invoke(profileFabState);
        }
    }

    public static final void I(ProfileFabView profileFabView) {
        ProfileFabState profileFabState = profileFabView.getState().a;
        if (profileFabState != null) {
            profileFabView.getOnRightButtonClicked().invoke(profileFabState);
        }
    }

    public static boolean J(ProfileFabState profileFabState) {
        if (profileFabState == null) {
            return false;
        }
        switch (c.$EnumSwitchMapping$0[profileFabState.b.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return false;
            case 6:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final etk0 getState() {
        return (etk0) ((zak0) this.m).getValue();
    }

    private final void setState(etk0 etk0Var) {
        ((zak0) this.m).setValue(etk0Var);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-677183945);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-677183945, i2, -1, "com.vk.profile.design.view.fab.ProfileFabView.ThemedContent (ProfileFabView.kt:115)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                getContext();
                x = Boolean.FALSE;
                M.R(x);
            }
            boolean booleanValue = ((Boolean) x).booleanValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = bbk0.b(new i440(this, 25));
                M.R(x2);
            }
            mtk0 mtk0Var = (mtk0) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = bbk0.b(new zf20(this, 24));
                M.R(x3);
            }
            mtk0 mtk0Var2 = (mtk0) x3;
            mm2.f(((Boolean) mtk0Var.getValue()).booleanValue(), null, anp.e((phr) mtk0Var2.getValue(), 2), anp.f((phr) mtk0Var2.getValue(), 2), null, kai.c(-1843019681, new c050(this, booleanValue), M), M, 196608, 18);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new xk6(this, i, 11);
        }
    }

    public final void G(final ProfileFabState profileFabState, final boolean z, final ProfileFabState profileFabState2, final boolean z2, final float f, final boolean z3, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1091138680);
        int i2 = i | (M.J(profileFabState) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.J(profileFabState2) ? 256 : 128) | (M.l(z2) ? 2048 : 1024) | (M.n(f) ? 16384 : 8192) | (M.y(this) ? 1048576 : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1091138680, i2, -1, "com.vk.profile.design.view.fab.ProfileFabView.ClippedFabContent (ProfileFabView.kt:170)");
            }
            boolean z4 = ((3670016 & i2) == 1048576 || M.y(this)) | ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((i2 & 57344) == 16384);
            Object x = M.x();
            if (z4 || x == a.C0011a.a) {
                wzs wzsVar = new wzs() { // from class: xsna.iwd0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        zo10 zo10Var;
                        zo10 zo10Var2;
                        ztm0 ztm0Var = (ztm0) obj;
                        o6j o6jVar = (o6j) obj2;
                        int i3 = ProfileFabView.r;
                        long j = o6jVar.a;
                        ProfileFabView profileFabView = ProfileFabView.this;
                        ProfileFabState profileFabState3 = profileFabState;
                        boolean z5 = z3;
                        tra0 tra0Var = null;
                        final tra0 N = (profileFabState3 == null || !z || (zo10Var2 = (zo10) j5g.a0(ztm0Var.t1(ProfileFabView.a.CURRENT, new jai(1076888314, new fwd0(profileFabState3, profileFabView, z5), true)))) == null) ? null : zo10Var2.N(j);
                        long j2 = o6jVar.a;
                        ProfileFabState profileFabState4 = profileFabState2;
                        final float f2 = f;
                        if (profileFabState4 != null && z2 && f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (zo10Var = (zo10) j5g.a0(ztm0Var.t1(ProfileFabView.a.NEXT, new jai(-1357141568, new m3j(profileFabState4, profileFabView, z5), true)))) != null) {
                            tra0Var = zo10Var.N(j2);
                        }
                        final tra0 tra0Var2 = tra0Var;
                        int i4 = 0;
                        final int b2 = N != null ? an10.b((1.0f - f2) * N.b) : 0;
                        final int b3 = b2 + (tra0Var2 != null ? an10.b(tra0Var2.b * f2) : 0);
                        if (N != null) {
                            i4 = N.c;
                        } else if (tra0Var2 != null) {
                            i4 = tra0Var2.c;
                        }
                        return ztm0Var.Q(b3, i4, jgp.b, new izs() { // from class: xsna.ewd0
                            @Override // xsna.izs
                            public final Object invoke(Object obj3) {
                                int i5;
                                tra0.a aVar2 = (tra0.a) obj3;
                                int i6 = ProfileFabView.r;
                                tra0 tra0Var3 = tra0.this;
                                tra0 tra0Var4 = N;
                                int i7 = b3;
                                if (tra0Var3 != null) {
                                    if (tra0Var4 != null) {
                                        i5 = -an10.b(tra0Var4.b * f2);
                                    }
                                    i5 = 0;
                                } else {
                                    if (tra0Var4 != null) {
                                        i5 = (tra0Var4.b - i7) / (-2);
                                    }
                                    i5 = 0;
                                }
                                if (tra0Var4 != null) {
                                    aVar2.q(tra0Var4, i5, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                int i8 = tra0Var4 != null ? b2 : tra0Var3 != null ? (tra0Var3.b - i7) / (-2) : 0;
                                if (tra0Var3 != null) {
                                    aVar2.q(tra0Var3, i8, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                return s3q0.a;
                            }
                        });
                    }
                };
                M.R(wzsVar);
                x = wzsVar;
            }
            xtm0.a(null, (wzs) x, M, 0, 1);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new fkb0(this, profileFabState, z, profileFabState2, z2, f, z3, i);
        }
    }

    @Override // xsna.dhq
    public final void c(Boolean bool, Boolean bool2, Float f) {
        setState(etk0.a(getState(), null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bool != null ? bool.booleanValue() : getState().e, f != null ? f.floatValue() : getState().f, bool2 != null ? bool2.booleanValue() : getState().g, 15));
    }

    @Override // xsna.dhq
    public final void g(ProfileFabState profileFabState) {
        setState(etk0.a(getState(), null, null, profileFabState, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, 123));
    }

    @Override // xsna.dhq
    public boolean getHasOffset() {
        return !(getState().d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public gzs<s3q0> getOnGrowthTrapButtonClick() {
        return (gzs) ((zak0) this.p).getValue();
    }

    public gzs<s3q0> getOnGrowthTrapButtonShown() {
        return (gzs) ((zak0) this.q).getValue();
    }

    public izs<ProfileFabState, s3q0> getOnLeftButtonClicked() {
        return (izs) ((zak0) this.o).getValue();
    }

    public izs<ProfileFabState, s3q0> getOnRightButtonClicked() {
        return (izs) ((zak0) this.n).getValue();
    }

    @Override // xsna.dhq
    public final void n(ProfileFabState profileFabState, ProfileFabState profileFabState2, Float f) {
        etk0 state = getState();
        if (profileFabState == null) {
            profileFabState = getState().a;
        }
        ProfileFabState profileFabState3 = profileFabState;
        if (profileFabState2 == null) {
            profileFabState2 = getState().b;
        }
        setState(etk0.a(state, profileFabState3, profileFabState2, null, f != null ? f.floatValue() : getState().d, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, 116));
    }

    @Override // xsna.dhq
    public void setOnGrowthTrapButtonClick(gzs<s3q0> gzsVar) {
        ((zak0) this.p).setValue(gzsVar);
    }

    @Override // xsna.dhq
    public void setOnGrowthTrapButtonShown(gzs<s3q0> gzsVar) {
        ((zak0) this.q).setValue(gzsVar);
    }

    @Override // xsna.dhq
    public void setOnLeftButtonClicked(izs<? super ProfileFabState, s3q0> izsVar) {
        ((zak0) this.o).setValue(izsVar);
    }

    @Override // xsna.dhq
    public void setOnRightButtonClicked(izs<? super ProfileFabState, s3q0> izsVar) {
        ((zak0) this.n).setValue(izsVar);
    }
}
