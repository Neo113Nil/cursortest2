package ru.ozon.app.android.session.accountRecoveryStart;

import Pb0.f;
import android.app.Activity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"ru/ozon/app/android/session/accountRecoveryStart/AccountRecoveryStartDeeplinkHandler$startFlowForSignInUser$1", "LPb0/f;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "", "uri", "Ljava/lang/String;", "getUri", "()Ljava/lang/String;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AccountRecoveryStartDeeplinkHandler$startFlowForSignInUser$1 extends f {
    private final Activity activity;
    private final String uri;

    AccountRecoveryStartDeeplinkHandler$startFlowForSignInUser$1(Activity activity, String str) {
        this.activity = activity;
        this.uri = str;
    }

    public Activity getActivity() {
        return this.activity;
    }

    public String getUri() {
        return this.uri;
    }
}
