package com.miui.referrer.api;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/miui/referrer/api/GetAppsReferrerDetails;", "", "mOriginalBundle", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "installBeginTimestampSeconds", "", "getInstallBeginTimestampSeconds", "()J", "installBeginTimestampServerSeconds", "getInstallBeginTimestampServerSeconds", "installReferrer", "", "getInstallReferrer", "()Ljava/lang/String;", "installVersion", "getInstallVersion", "referrerClickTimestampSeconds", "getReferrerClickTimestampSeconds", "referrerClickTimestampServerSeconds", "getReferrerClickTimestampServerSeconds", "Companion", "referrer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetAppsReferrerDetails {

    @NotNull
    private static final String KEY_INSTALL_BEGIN_TIMESTAMP = "install_begin_timestamp_seconds";

    @NotNull
    private static final String KEY_INSTALL_BEGIN_TIMESTAMP_SERVER = "install_begin_timestamp_server_seconds";

    @NotNull
    private static final String KEY_INSTALL_REFERRER = "install_referrer";

    @NotNull
    private static final String KEY_INSTALL_VERSION = "install_version";

    @NotNull
    private static final String KEY_REFERRER_CLICK_TIMESTAMP = "referrer_click_timestamp_seconds";

    @NotNull
    private static final String KEY_REFERRER_CLICK_TIMESTAMP_SERVER = "referrer_click_timestamp_server_seconds";

    @NotNull
    private final Bundle mOriginalBundle;

    public GetAppsReferrerDetails(@NotNull Bundle mOriginalBundle) {
        Intrinsics.checkNotNullParameter(mOriginalBundle, "mOriginalBundle");
        this.mOriginalBundle = mOriginalBundle;
    }

    public final long getInstallBeginTimestampSeconds() {
        return this.mOriginalBundle.getLong(KEY_INSTALL_BEGIN_TIMESTAMP);
    }

    public final long getInstallBeginTimestampServerSeconds() {
        return this.mOriginalBundle.getLong(KEY_INSTALL_BEGIN_TIMESTAMP_SERVER);
    }

    @Nullable
    public final String getInstallReferrer() {
        return this.mOriginalBundle.getString(KEY_INSTALL_REFERRER);
    }

    @Nullable
    public final String getInstallVersion() {
        return this.mOriginalBundle.getString(KEY_INSTALL_VERSION);
    }

    public final long getReferrerClickTimestampSeconds() {
        return this.mOriginalBundle.getLong(KEY_REFERRER_CLICK_TIMESTAMP);
    }

    public final long getReferrerClickTimestampServerSeconds() {
        return this.mOriginalBundle.getLong(KEY_REFERRER_CLICK_TIMESTAMP_SERVER);
    }
}
