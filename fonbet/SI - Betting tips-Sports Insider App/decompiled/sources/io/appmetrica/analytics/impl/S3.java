package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class S3 {

    /* renamed from: a, reason: collision with root package name */
    public final IdentifiersResult f12843a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentifiersResult f12844b;

    /* renamed from: c, reason: collision with root package name */
    public final IdentifiersResult f12845c;

    /* renamed from: d, reason: collision with root package name */
    public final IdentifiersResult f12846d;

    /* renamed from: e, reason: collision with root package name */
    public final IdentifiersResult f12847e;

    /* renamed from: f, reason: collision with root package name */
    public final IdentifiersResult f12848f;

    /* renamed from: g, reason: collision with root package name */
    public final IdentifiersResult f12849g;

    /* renamed from: h, reason: collision with root package name */
    public final IdentifiersResult f12850h;

    /* renamed from: i, reason: collision with root package name */
    public final IdentifiersResult f12851i;
    public final IdentifiersResult j;

    /* renamed from: k, reason: collision with root package name */
    public final IdentifiersResult f12852k;

    /* renamed from: l, reason: collision with root package name */
    public final long f12853l;

    /* renamed from: m, reason: collision with root package name */
    public final long f12854m;

    /* renamed from: n, reason: collision with root package name */
    public final V9 f12855n;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f12856o;

    public S3(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j, long j6, V9 v92, Bundle bundle) {
        this.f12843a = identifiersResult;
        this.f12844b = identifiersResult2;
        this.f12845c = identifiersResult3;
        this.f12846d = identifiersResult4;
        this.f12847e = identifiersResult5;
        this.f12848f = identifiersResult6;
        this.f12849g = identifiersResult7;
        this.f12850h = identifiersResult8;
        this.f12851i = identifiersResult9;
        this.j = identifiersResult10;
        this.f12852k = identifiersResult11;
        this.f12853l = j;
        this.f12854m = j6;
        this.f12855n = v92;
        this.f12856o = bundle;
    }

    public static IdentifiersResult a(Bundle bundle, String str) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle(str);
        ClassLoader classLoader = IdentifiersResult.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) parcelable;
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : identifiersResult;
    }

    public final void b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.f12843a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f12844b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.f12845c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f12846d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f12847e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f12848f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f12849g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f12850h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle("GAID", bundle9);
        IdentifiersResult identifiersResult9 = this.f12851i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f12852k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f12853l);
        bundle.putLong("NextStartupTime", this.f12854m);
        V9 v92 = this.f12855n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", v92);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", C0353na.I.p().i());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f12843a + ", mDeviceIdData=" + this.f12844b + ", mDeviceIdHashData=" + this.f12845c + ", mReportAdUrlData=" + this.f12846d + ", mGetAdUrlData=" + this.f12847e + ", mResponseClidsData=" + this.f12848f + ", mClientClidsForRequestData=" + this.f12849g + ", mGaidData=" + this.f12850h + ", mHoaidData=" + this.f12851i + ", yandexAdvIdData=" + this.j + ", customSdkHostsData=" + this.f12852k + ", mServerTimeOffset=" + this.f12853l + ", nextStartupTime=" + this.f12854m + ", features=" + this.f12855n + ", modulesConfig=" + this.f12856o + '}';
    }

    public static V9 a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = V9.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        V9 v92 = (V9) parcelable;
        return v92 == null ? new V9(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : v92;
    }

    public static IdentifiersResult a(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, isEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, isEmpty ? "no identifier in startup state" : null);
    }

    public static V9 a(Boolean bool) {
        boolean z5 = bool != null;
        return new V9(bool, z5 ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z5 ? null : "no identifier in startup state");
    }
}
