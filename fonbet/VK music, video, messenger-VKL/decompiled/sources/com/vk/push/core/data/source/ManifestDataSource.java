package com.vk.push.core.data.source;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import xsna.bpn0;
import xsna.gzs;
import xsna.zcl;

/* compiled from: ManifestDataSource.kt */
/* loaded from: classes.dex */
public final class ManifestDataSource {
    public static final Companion Companion = new Companion(null);
    public final PackageManager a;
    public final String b;
    public final bpn0 c = new bpn0(new a());

    /* compiled from: ManifestDataSource.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: ManifestDataSource.kt */
    public static final class a extends Lambda implements gzs<Bundle> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final Bundle invoke() {
            return ManifestDataSource.access$getMetaDataBundle(ManifestDataSource.this);
        }
    }

    public ManifestDataSource(PackageManager packageManager, String str) {
        this.a = packageManager;
        this.b = str;
    }

    public static final Bundle access$getMetaDataBundle(ManifestDataSource manifestDataSource) {
        Object failure;
        try {
            failure = manifestDataSource.a.getApplicationInfo(manifestDataSource.b, 128);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) failure;
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }

    public final Bundle a() {
        return (Bundle) this.c.getValue();
    }

    public final Integer getInt(String str) {
        Bundle a2;
        Bundle a3 = a();
        if (a3 == null || !a3.containsKey(str) || (a2 = a()) == null) {
            return null;
        }
        return Integer.valueOf(a2.getInt(str));
    }

    public final int getNotificationColor() {
        Bundle a2 = a();
        if (a2 != null) {
            return a2.getInt("ru.rustore.sdk.pushclient.default_notification_color");
        }
        return 0;
    }

    public final int getNotificationIcon() {
        Bundle a2 = a();
        if (a2 != null) {
            return a2.getInt("ru.rustore.sdk.pushclient.default_notification_icon");
        }
        return 0;
    }

    public final String getString(String str) {
        Bundle a2 = a();
        if (a2 != null) {
            return a2.getString(str);
        }
        return null;
    }

    public final String getString(String str, String str2) {
        Bundle a2 = a();
        String string = a2 != null ? a2.getString(str, str2) : null;
        return string == null ? str2 : string;
    }

    public final int getInt(String str, int i) {
        Bundle a2 = a();
        return a2 != null ? a2.getInt(str, i) : i;
    }
}
