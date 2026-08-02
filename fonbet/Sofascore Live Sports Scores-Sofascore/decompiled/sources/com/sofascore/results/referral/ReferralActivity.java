package com.sofascore.results.referral;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.model.profile.ReferralResponse;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.referral.ReferralActivity;
import defpackage.a99;
import defpackage.ad;
import defpackage.buf;
import defpackage.duf;
import defpackage.joa;
import defpackage.m1f;
import defpackage.mqi;
import defpackage.mtf;
import defpackage.otf;
import defpackage.otk;
import defpackage.rq3;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z3f;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/referral/ReferralActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "Lvnb;", "Lytf;", "state", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReferralActivity extends Hilt_ReferralActivity {
    public static final /* synthetic */ int N = 0;
    public final otk K = new otk(duf.a.getOrCreateKotlinClass(buf.class), new otf(this, 1), new otf(this, 0), new otf(this, 2));
    public final mqi L;
    public final joa M;

    public ReferralActivity() {
        final int i = 0;
        final int i2 = 1;
        this.L = ypa.b(new Function0(this) { // from class: ntf
            public final /* synthetic */ ReferralActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                ReferralActivity referralActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = ReferralActivity.N;
                        return ad.a(referralActivity.getLayoutInflater());
                    default:
                        int i5 = ReferralActivity.N;
                        Intent intent = referralActivity.getIntent();
                        intent.getClass();
                        Bundle extras = intent.getExtras();
                        return (ReferralResponse) (extras != null ? (Parcelable) gz8.K(extras, "extra_referral", ReferralResponse.class) : null);
                }
            }
        });
        this.M = ypa.a(ysa.c, new Function0(this) { // from class: ntf
            public final /* synthetic */ ReferralActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ReferralActivity referralActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = ReferralActivity.N;
                        return ad.a(referralActivity.getLayoutInflater());
                    default:
                        int i5 = ReferralActivity.N;
                        Intent intent = referralActivity.getIntent();
                        intent.getClass();
                        Bundle extras = intent.getExtras();
                        return (ReferralResponse) (extras != null ? (Parcelable) gz8.K(extras, "extra_referral", ReferralResponse.class) : null);
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mqi mqiVar = this.L;
        setContentView(((ad) mqiVar.getValue()).a);
        z3f z3fVar = ((ad) mqiVar.getValue()).c;
        ReferralResponse referralResponse = (ReferralResponse) this.M.getValue();
        rq3 rq3Var = null;
        AbstractActivity.M(this, z3fVar, getString((referralResponse != null ? referralResponse.getMyProgressAsInvitedUser() : null) != null ? R.string.referral_program_header : R.string.button_invite_friends), null, null, 60);
        z8e.x(this, ((buf) this.K.getValue()).h, new m1f(this, rq3Var, 3));
        ComposeView composeView = ((ad) mqiVar.getValue()).b;
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(new tc3(2075309982, new mtf(this, 0), true));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        ReferralResponse referralResponse = (ReferralResponse) this.M.getValue();
        return (referralResponse != null ? referralResponse.getMyProgressAsInvitedUser() : null) != null ? "ReferralScreen" : "InviteFriendsScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    /* renamed from: v */
    public final boolean getL() {
        return false;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
