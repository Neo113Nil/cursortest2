package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class P5 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<P5> CREATOR = new O5();

    /* renamed from: a, reason: collision with root package name */
    protected String f12727a;

    /* renamed from: b, reason: collision with root package name */
    protected String f12728b;

    /* renamed from: c, reason: collision with root package name */
    public String f12729c;

    /* renamed from: d, reason: collision with root package name */
    public int f12730d;

    /* renamed from: e, reason: collision with root package name */
    public int f12731e;

    /* renamed from: f, reason: collision with root package name */
    public Pair f12732f;

    /* renamed from: g, reason: collision with root package name */
    public int f12733g;

    /* renamed from: h, reason: collision with root package name */
    public String f12734h;

    /* renamed from: i, reason: collision with root package name */
    public long f12735i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public EnumC0098da f12736k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC0327m9 f12737l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f12738m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f12739n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f12740o;

    /* renamed from: p, reason: collision with root package name */
    public Map f12741p;

    public P5() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f12732f == null) {
            this.f12732f = new Pair(str, str2);
        }
    }

    public final Pair<String, String> b() {
        return this.f12732f;
    }

    public final void c(Bundle bundle) {
        this.f12738m = bundle;
    }

    public final long d() {
        return this.f12735i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.j;
    }

    public final String f() {
        return this.f12729c;
    }

    @NonNull
    public final EnumC0098da g() {
        return this.f12736k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f12733g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f12731e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @NonNull
    public final Map<String, byte[]> getExtras() {
        return this.f12741p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getName() {
        return this.f12727a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f12730d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getValue() {
        return this.f12728b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        String str = this.f12728b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public final Integer h() {
        return this.f12740o;
    }

    public final Bundle i() {
        return this.f12738m;
    }

    public final String j() {
        return this.f12734h;
    }

    public final EnumC0327m9 k() {
        return this.f12737l;
    }

    public final boolean l() {
        return this.f12727a == null;
    }

    public final boolean m() {
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        return -1 == this.f12730d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i5) {
        this.f12733g = i5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i5) {
        this.f12731e = i5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(@NonNull Map<String, byte[]> map) {
        this.f12741p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(String str) {
        this.f12727a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i5) {
        this.f12730d = i5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(String str) {
        this.f12728b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.f12728b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    @NonNull
    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f12727a;
        String str2 = EnumC0047bb.a(this.f12730d).f13441b;
        String str3 = this.f12728b;
        if (str3 == null) {
            str3 = null;
        } else if (str3.length() > 500) {
            str3 = str3.substring(0, 500);
        }
        return d9.e.l(r4.k.q("[event: ", str, ", type: ", str2, ", value: "), str3, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f12727a);
        bundle.putString("CounterReport.Value", this.f12728b);
        bundle.putInt("CounterReport.Type", this.f12730d);
        bundle.putInt("CounterReport.CustomType", this.f12731e);
        bundle.putInt("CounterReport.TRUNCATED", this.f12733g);
        bundle.putString("CounterReport.ProfileID", this.f12734h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f12736k.f13590a);
        Bundle bundle2 = this.f12738m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f12729c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f12732f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f12735i);
        bundle.putLong("CounterReport.CreationTimestamp", this.j);
        EnumC0327m9 enumC0327m9 = this.f12737l;
        if (enumC0327m9 != null) {
            bundle.putInt("CounterReport.Source", enumC0327m9.f14257a);
        }
        Boolean bool = this.f12739n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f12740o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f12741p));
        parcel.writeBundle(bundle);
    }

    public P5(String str, int i5) {
        this("", str, i5);
    }

    @NonNull
    public static P5 e(@NonNull P5 p52) {
        return a(p52, EnumC0047bb.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(String str) {
        this.f12729c = str;
    }

    public void c(String str) {
        this.f12734h = str;
    }

    @NonNull
    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public P5(String str, String str2, int i5) {
        this(str, str2, i5, new SystemTimeProvider());
    }

    public final void a(long j) {
        this.f12735i = j;
    }

    public final void b(long j) {
        this.j = j;
    }

    public final Boolean c() {
        return this.f12739n;
    }

    public P5(String str, String str2, int i5, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f12736k = EnumC0098da.UNKNOWN;
        this.f12741p = new HashMap();
        this.f12727a = str2;
        this.f12730d = i5;
        this.f12728b = str;
        this.f12735i = systemTimeProvider.elapsedRealtime();
        this.j = systemTimeProvider.currentTimeMillis();
    }

    @NonNull
    public static P5 b(Bundle bundle) {
        if (bundle != null) {
            try {
                P5 p52 = (P5) bundle.getParcelable("CounterReport.Object");
                if (p52 != null) {
                    return p52;
                }
            } catch (Throwable unused) {
                return new P5("", 0);
            }
        }
        return new P5("", 0);
    }

    @NonNull
    public static P5 c(@NonNull P5 p52) {
        return a(p52, EnumC0047bb.EVENT_TYPE_INIT);
    }

    @NonNull
    public static P5 d(@NonNull P5 p52) {
        P5 p53 = new P5("", 0);
        p53.j = p52.j;
        p53.f12735i = p52.f12735i;
        p53.f12732f = p52.f12732f;
        p53.f12729c = p52.f12729c;
        p53.f12738m = p52.f12738m;
        p53.f12741p = p52.f12741p;
        p53.f12734h = p52.f12734h;
        return p53;
    }

    public final void a(@NonNull EnumC0098da enumC0098da) {
        this.f12736k = enumC0098da;
    }

    public final void a(EnumC0327m9 enumC0327m9) {
        this.f12737l = enumC0327m9;
    }

    public final void a(Boolean bool) {
        this.f12739n = bool;
    }

    public final void a(Integer num) {
        this.f12740o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    @NonNull
    public static P5 b(@NonNull P5 p52) {
        return a(p52, EnumC0047bb.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static P5 a(P5 p52, EnumC0047bb enumC0047bb) {
        P5 d10 = d(p52);
        d10.f12730d = enumC0047bb.f13440a;
        return d10;
    }

    @NonNull
    public static P5 a(@NonNull P5 p52) {
        return a(p52, EnumC0047bb.EVENT_TYPE_ALIVE);
    }

    @NonNull
    public static P5 a(@NonNull P5 p52, @NonNull M9 m92) {
        P5 a7 = a(p52, EnumC0047bb.EVENT_TYPE_START);
        a7.setValueBytes(MessageNano.toByteArray(new C0402p9().fromModel(new C0377o9((String) m92.f12577b.a()))));
        a7.j = p52.j;
        a7.f12735i = p52.f12735i;
        return a7;
    }

    @NonNull
    public static P5 a(@NonNull P5 p52, @NonNull Collection<PermissionState> collection, C0594x2 c0594x2, @NonNull C0064c2 c0064c2, @NonNull List<String> list) {
        String str;
        String str2;
        P5 d10 = d(p52);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (c0594x2 != null) {
                jSONObject.put("background_restricted", c0594x2.f14886b);
                EnumC0569w2 enumC0569w2 = c0594x2.f14885a;
                c0064c2.getClass();
                if (enumC0569w2 != null) {
                    int ordinal = enumC0569w2.ordinal();
                    if (ordinal == 0) {
                        str2 = "EXEMPTED";
                    } else if (ordinal == 1) {
                        str2 = "ACTIVE";
                    } else if (ordinal == 2) {
                        str2 = "WORKING_SET";
                    } else if (ordinal == 3) {
                        str2 = "FREQUENT";
                    } else if (ordinal == 4) {
                        str2 = "RARE";
                    } else if (ordinal == 5) {
                        str2 = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str2);
                }
                str2 = null;
                jSONObject.put("app_standby_bucket", str2);
            }
            str = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            str = "";
        }
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        d10.f12730d = 12288;
        d10.setValue(str);
        return d10;
    }

    @NonNull
    public static P5 a(@NonNull P5 p52, String str) {
        P5 d10 = d(p52);
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        d10.f12730d = 12289;
        d10.setValue(str);
        return d10;
    }

    @NonNull
    public static P5 a() {
        P5 p52 = new P5("", 0);
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        p52.f12730d = 16384;
        return p52;
    }

    @NonNull
    public static P5 a(@NonNull String str) {
        P5 p52 = new P5("", 0);
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        p52.f12730d = 12320;
        p52.f12728b = str;
        p52.f12737l = EnumC0327m9.JS;
        return p52;
    }
}
