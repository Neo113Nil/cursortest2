package ru.ozon.app.android.core.navigation.interceptors;

import Fb0.b;
import Pb0.d;
import android.app.Activity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"ru/ozon/app/android/core/navigation/interceptors/AuthDestinationInterceptorImpl$startOzonIdSdkAuth$1", "LPb0/d;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "", "startDeeplink", "Ljava/lang/String;", "getStartDeeplink", "()Ljava/lang/String;", "", "isCloseButtonVisible", "Z", "()Z", "LFb0/b;", "extraPage", "LFb0/b;", "getExtraPage", "()LFb0/b;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuthDestinationInterceptorImpl$startOzonIdSdkAuth$1 extends d {
    private final Activity activity;
    private final b extraPage;
    private final boolean isCloseButtonVisible = true;
    private final String startDeeplink;

    AuthDestinationInterceptorImpl$startOzonIdSdkAuth$1(Activity activity, String str, b bVar) {
        this.activity = activity;
        this.startDeeplink = str;
        this.extraPage = bVar;
    }

    public Activity getActivity() {
        return this.activity;
    }

    @Override // Pb0.d
    public b getExtraPage() {
        return this.extraPage;
    }

    @Override // Pb0.d
    public String getStartDeeplink() {
        return this.startDeeplink;
    }

    /* renamed from: isCloseButtonVisible, reason: from getter */
    public boolean getIsCloseButtonVisible() {
        return this.isCloseButtonVisible;
    }
}
