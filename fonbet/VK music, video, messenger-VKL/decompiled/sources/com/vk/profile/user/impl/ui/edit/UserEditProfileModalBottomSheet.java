package com.vk.profile.user.impl.ui.edit;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.personalaccount.VkPersonalAccountRouter;
import com.vk.bridges.di.BridgeComponent;
import com.vk.dto.common.id.UserId;
import com.vk.followersmode.api.di.FollowersModeComponent;
import com.vk.log.L;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.profile.user.api.di.UserProfileParamsComponent;
import com.vk.profile.user.impl.domain.edit.models.ExternalEvent;
import com.vk.profile.user.impl.ui.edit.UserEditProfileModalBottomSheet;
import com.vk.profile.user.impl.ui.edit.mvi.models.UserEditProfileParams;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a470;
import xsna.a4s;
import xsna.aiq0;
import xsna.anj;
import xsna.ao50;
import xsna.b25;
import xsna.b33;
import xsna.bc6;
import xsna.bpn0;
import xsna.c270;
import xsna.cb0;
import xsna.cv4;
import xsna.d4s;
import xsna.dw20;
import xsna.e43;
import xsna.ejf0;
import xsna.evq0;
import xsna.f4s;
import xsna.fkq0;
import xsna.fpf0;
import xsna.gyo0;
import xsna.hb0;
import xsna.hf8;
import xsna.htq0;
import xsna.inj0;
import xsna.km50;
import xsna.kmu0;
import xsna.knj0;
import xsna.lyd0;
import xsna.m7m;
import xsna.mk50;
import xsna.mzd0;
import xsna.nf3;
import xsna.nie;
import xsna.niq0;
import xsna.nvm0;
import xsna.oqh0;
import xsna.ozd0;
import xsna.ps;
import xsna.pyd0;
import xsna.qcy;
import xsna.qmq0;
import xsna.qr5;
import xsna.riq0;
import xsna.s200;
import xsna.s3q0;
import xsna.siq0;
import xsna.skj0;
import xsna.sw50;
import xsna.td5;
import xsna.tzp0;
import xsna.u61;
import xsna.ua0;
import xsna.vk50;
import xsna.w61;
import xsna.ww50;
import xsna.xn50;
import xsna.yfb;
import xsna.zhq0;
import xsna.zjq0;

/* compiled from: UserEditProfileModalBottomSheet.kt */
/* loaded from: classes5.dex */
public final class UserEditProfileModalBottomSheet extends pyd0<niq0, zjq0, aiq0> {
    public static final /* synthetic */ qcy<Object>[] s1;
    public zhq0 o1;
    public final bpn0 l1 = new bpn0(new oqh0(this, 7));
    public final bpn0 m1 = new bpn0(new ejf0(this, 12));
    public final nf3 n1 = new nf3();
    public final hb0<Intent> p1 = registerForActivityResult(new cb0(), new ua0() { // from class: xsna.piq0
        @Override // xsna.ua0
        public final void onActivityResult(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            qcy<Object>[] qcyVarArr = UserEditProfileModalBottomSheet.s1;
            if (activityResult.b == -1) {
                xn50.a.c(UserEditProfileModalBottomSheet.this, new aiq0.a.c(activityResult.c));
            }
        }
    });
    public final hb0<Intent> q1 = registerForActivityResult(new cb0(), new ua0() { // from class: xsna.qiq0
        @Override // xsna.ua0
        public final void onActivityResult(Object obj) {
            Bundle extras;
            UserEditProfileModalBottomSheet userEditProfileModalBottomSheet = UserEditProfileModalBottomSheet.this;
            bpn0 bpn0Var = userEditProfileModalBottomSheet.l1;
            ActivityResult activityResult = (ActivityResult) obj;
            qcy<Object>[] qcyVarArr = UserEditProfileModalBottomSheet.s1;
            Intent intent = activityResult.c;
            if (activityResult.b == -1) {
                Boolean valueOf = (intent == null || (extras = intent.getExtras()) == null) ? null : Boolean.valueOf(extras.getBoolean("is_from_gallery"));
                if (valueOf != null) {
                    if (valueOf.booleanValue()) {
                        ((lyd0) bpn0Var.getValue()).f().c();
                    } else {
                        ((lyd0) bpn0Var.getValue()).f().b();
                    }
                }
                xn50.a.c(userEditProfileModalBottomSheet, new aiq0.e.b(intent));
            }
        }
    });
    public final UserEditProfileModalBottomSheet$receiver$1 r1 = new BroadcastReceiver() { // from class: com.vk.profile.user.impl.ui.edit.UserEditProfileModalBottomSheet$receiver$1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            xn50.a.c(UserEditProfileModalBottomSheet.this, new aiq0.c(intent));
        }
    };

    /* compiled from: UserEditProfileModalBottomSheet.kt */
    public static final class a extends kmu0 {
        public final htq0 h;
        public final UserId i;

        public a(FragmentActivity fragmentActivity, htq0 htq0Var, UserId userId) {
            super(fragmentActivity, tzp0.a(null, 1));
            this.h = htq0Var;
            this.i = userId;
            c(new a470());
            F0(true);
            x(0);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            UserEditProfileModalBottomSheet userEditProfileModalBottomSheet = new UserEditProfileModalBottomSheet();
            htq0 htq0Var = this.h;
            userEditProfileModalBottomSheet.setArguments(yfb.b(new Pair("PROFILE_PARAMS_KEY_USER_EDIT", new UserEditProfileParams(htq0Var.a, this.i, htq0Var.b, htq0Var.c, htq0Var.d, htq0Var.e, htq0Var.f, htq0Var.g))));
            return userEditProfileModalBottomSheet;
        }
    }

    /* compiled from: UserEditProfileModalBottomSheet.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExternalEvent.ShowSnackbar.ShowType.values().length];
            try {
                iArr[ExternalEvent.ShowSnackbar.ShowType.Window.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExternalEvent.ShowSnackbar.ShowType.ViewGroup.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExternalEvent.ShowSnackbar.ShowType.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(UserEditProfileModalBottomSheet.class, "mainMviView", "getMainMviView()Lcom/vk/profile/user/impl/ui/edit/mvi/view/main/UserEditProfileMviView;", 0);
        fpf0.a.getClass();
        s1 = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        siq0 siq0Var = new siq0(requireContext(), this);
        qcy<Object> qcyVar = s1[0];
        nf3 nf3Var = this.n1;
        nf3Var.c = siq0Var;
        return new mk50.c(((siq0) nf3Var.getValue(this, qcyVar)).d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((siq0) this.n1.getValue(this, s1[0])).f((zjq0) ao50Var, new td5(1, this, UserEditProfileModalBottomSheet.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 16));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        niq0 niq0Var = (niq0) vk50Var;
        niq0Var.B.a(new skj0(this, 7), this);
        niq0Var.e.b(((inj0) this.m1.getValue()).b().subscribe(new nvm0(new gyo0(this, 1), 4)));
    }

    @Override // xsna.dw20
    public final boolean a0() {
        xn50.a.c(this, aiq0.b.C2545b.b);
        return true;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.USER_PHOTO_CHANGED");
        intentFilter.addAction("com.vkontakte.android.ACTION_PROFILE_UPDATED");
        intentFilter.addAction("com.vkontakte.android.USER_COVER_CHANGED");
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        anj.d(context2, this.r1, intentFilter, hf8.a, 4);
        d4s Ld = ((FollowersModeComponent) m7m.d(this).mo408a(fpf0.a(FollowersModeComponent.class))).Ld(kn());
        BridgeComponent bridgeComponent = (BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class));
        sw50.o l = bridgeComponent.id().l();
        bc6 bc6Var = new bc6(context, new u61(this, 12));
        this.o1 = new zhq0(new qr5(context, new bc6(context, new cv4(this, 11))), new nie(kn(), new bc6(context, new w61(this, 15))), new mzd0(bc6Var, l, new VkPersonalAccountRouter(context)), new ps(bc6Var, l), new c270(bc6Var, l), new ozd0(kn(), bridgeComponent.h8()), new knj0(kn(), bridgeComponent.p()), new a4s(Ld, new riq0(this)));
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        Object failure;
        this.o1 = null;
        try {
            Context context = e43.a;
            (context != null ? context : null).unregisterReceiver(this.r1);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            L.i(a2);
        }
        super.onDetach();
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ww50 v;
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null && (v = s200.v(mo2getContext)) != null) {
            v.H(this.j1);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        evq0 Jc = ((UserProfileComponent) m7m.d(this).mo408a(fpf0.a(UserProfileComponent.class))).Jc();
        UserEditProfileParams userEditProfileParams = (UserEditProfileParams) bundle.getParcelable("PROFILE_PARAMS_KEY_USER_EDIT");
        UserEditProfileParams userEditProfileParams2 = fkq0.c(userEditProfileParams.c) ? userEditProfileParams : null;
        if (userEditProfileParams2 == null) {
            userEditProfileParams2 = new UserEditProfileParams(userEditProfileParams.b, Jc.b.c(), userEditProfileParams.d, userEditProfileParams.e, userEditProfileParams.f, userEditProfileParams.g, userEditProfileParams.h, userEditProfileParams.i);
        }
        htq0 htq0Var = new htq0(userEditProfileParams2.b, userEditProfileParams2.d, userEditProfileParams2.e, userEditProfileParams2.f, userEditProfileParams2.g, userEditProfileParams2.h, userEditProfileParams2.i, null, 16256);
        b25 s = ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).s();
        UserProfileParamsComponent userProfileParamsComponent = (UserProfileParamsComponent) m7m.d(this).b(fpf0.a(UserProfileParamsComponent.class), new qmq0(htq0Var));
        return new niq0(userProfileParamsComponent.xd(), userProfileParamsComponent.P3(), ((FollowersModeComponent) m7m.d(this).mo408a(fpf0.a(FollowersModeComponent.class))).b(), new f4s(), Jc, s, (lyd0) this.l1.getValue());
    }

    @Override // xsna.pyd0, xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        final b33 b33Var = (b33) yn;
        yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.oiq0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                qcy<Object>[] qcyVarArr = UserEditProfileModalBottomSheet.s1;
                ww50 v = s200.v(b33.this.getContext());
                if (v != null) {
                    v.S(this.j1);
                }
            }
        });
        return yn;
    }
}
