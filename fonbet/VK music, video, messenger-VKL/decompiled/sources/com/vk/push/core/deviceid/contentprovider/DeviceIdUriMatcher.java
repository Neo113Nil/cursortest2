package com.vk.push.core.deviceid.contentprovider;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.Lambda;
import xsna.bpn0;
import xsna.gzs;
import xsna.zcl;

/* compiled from: DeviceIdUriMatcher.kt */
/* loaded from: classes.dex */
public final class DeviceIdUriMatcher {
    public static final Companion Companion = new Companion(null);
    public final bpn0 a = new bpn0(a.i);

    /* compiled from: DeviceIdUriMatcher.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final String getAuthority(String str) {
            return str.concat(".VkpnsDeviceIdContentProvider");
        }

        public final int getCode() {
            return 1;
        }

        public final String getPath() {
            return CommonUrlParts.DEVICE_ID;
        }

        public final String getVirtualColumnName() {
            return "device_id_column";
        }

        public Companion() {
        }
    }

    /* compiled from: DeviceIdUriMatcher.kt */
    public static final class a extends Lambda implements gzs<UriMatcher> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final UriMatcher invoke() {
            return new UriMatcher(-1);
        }
    }

    public final void init(Context context) {
        UriMatcher uriMatcher = (UriMatcher) this.a.getValue();
        Companion companion = Companion;
        uriMatcher.addURI(companion.getAuthority(context.getPackageName()), companion.getPath(), companion.getCode());
    }

    public final boolean match(Uri uri) {
        return ((UriMatcher) this.a.getValue()).match(uri) == Companion.getCode();
    }
}
