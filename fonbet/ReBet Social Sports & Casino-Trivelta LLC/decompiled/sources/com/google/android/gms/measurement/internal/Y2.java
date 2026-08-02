package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgt;
import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzt;
import com.google.android.gms.internal.measurement.zzu;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import z.C6900a;

/* loaded from: classes2.dex */
public final class Y2 extends D6 implements InterfaceC3278j {

    /* renamed from: d, reason: collision with root package name */
    public final Map f33757d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f33758e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f33759f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f33760g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f33761h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f33762i;

    /* renamed from: j, reason: collision with root package name */
    public final z.j f33763j;

    /* renamed from: k, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.zzr f33764k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f33765l;

    /* renamed from: m, reason: collision with root package name */
    public final Map f33766m;

    /* renamed from: n, reason: collision with root package name */
    public final Map f33767n;

    public Y2(S6 s62) {
        super(s62);
        this.f33757d = new C6900a();
        this.f33758e = new C6900a();
        this.f33759f = new C6900a();
        this.f33760g = new C6900a();
        this.f33761h = new C6900a();
        this.f33765l = new C6900a();
        this.f33766m = new C6900a();
        this.f33767n = new C6900a();
        this.f33762i = new C6900a();
        this.f33763j = new R2(this, 20);
        this.f33764k = new S2(this);
    }

    public static final Map u(zzgl zzglVar) {
        C6900a c6900a = new C6900a();
        if (zzglVar != null) {
            for (zzgt zzgtVar : zzglVar.zze()) {
                c6900a.put(zzgtVar.zza(), zzgtVar.zzb());
            }
        }
        return c6900a;
    }

    public static final U3 v(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return U3.AD_STORAGE;
        }
        if (i11 == 2) {
            return U3.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return U3.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return U3.AD_PERSONALIZATION;
    }

    public final void A(String str) {
        h();
        this.f33766m.put(str, null);
    }

    public final void B(String str) {
        h();
        this.f33761h.remove(str);
    }

    public final boolean C(String str, byte[] bArr, String str2, String str3) {
        j();
        h();
        AbstractC3191o.g(str);
        zzgk zzgkVar = (zzgk) t(str, bArr).zzcl();
        r(str, zzgkVar);
        s(str, (zzgl) zzgkVar.zzbc());
        this.f33761h.put(str, (zzgl) zzgkVar.zzbc());
        this.f33765l.put(str, zzgkVar.zzh());
        this.f33766m.put(str, str2);
        this.f33767n.put(str, str3);
        this.f33757d.put(str, u((zzgl) zzgkVar.zzbc()));
        this.f34418b.F0().Y(str, new ArrayList(zzgkVar.zzd()));
        try {
            zzgkVar.zze();
            bArr = ((zzgl) zzgkVar.zzbc()).zzcc();
        } catch (RuntimeException e10) {
            this.f33578a.a().r().c("Unable to serialize reduced-size config. Storing full config instead. appId", C3392x2.x(str), e10);
        }
        C3357t F02 = this.f34418b.F0();
        AbstractC3191o.g(str);
        F02.h();
        F02.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (F02.u0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                F02.f33578a.a().o().b("Failed to update remote config (got 0). appId", C3392x2.x(str));
            }
        } catch (SQLiteException e11) {
            F02.f33578a.a().o().c("Error storing remote config. appId", C3392x2.x(str), e11);
        }
        zzgkVar.zzf();
        this.f33761h.put(str, (zzgl) zzgkVar.zzbc());
        return true;
    }

    public final boolean D(String str, String str2) {
        Boolean bool;
        h();
        q(str);
        if (H(str) && b7.N(str2)) {
            return true;
        }
        if (I(str) && b7.r0(str2)) {
            return true;
        }
        Map map = (Map) this.f33759f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean E(String str, String str2) {
        Boolean bool;
        h();
        q(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f33760g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final Set F(String str) {
        h();
        q(str);
        return (Set) this.f33758e.get(str);
    }

    public final int G(String str, String str2) {
        Integer num;
        h();
        q(str);
        Map map = (Map) this.f33762i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean H(String str) {
        return "1".equals(f(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean I(String str) {
        return "1".equals(f(str, "measurement.upload.blacklist_public"));
    }

    public final boolean J(String str) {
        h();
        q(str);
        Map map = this.f33758e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains(PublisherMetadata.DEVICE_MODEL) || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean K(String str) {
        h();
        q(str);
        Map map = this.f33758e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains(PublisherMetadata.OS_VERSION) || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean L(String str) {
        h();
        q(str);
        Map map = this.f33758e;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    public final boolean M(String str) {
        h();
        q(str);
        Map map = this.f33758e;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    public final boolean N(String str) {
        h();
        q(str);
        Map map = this.f33758e;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    public final boolean O(String str) {
        h();
        q(str);
        Map map = this.f33758e;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    public final boolean P(String str, U3 u32) {
        h();
        q(str);
        zzgf R10 = R(str);
        if (R10 == null) {
            return false;
        }
        Iterator it = R10.zza().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfu zzfuVar = (zzfu) it.next();
            if (u32 == v(zzfuVar.zzb())) {
                if (zzfuVar.zzc() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final U3 Q(String str, U3 u32) {
        h();
        q(str);
        zzgf R10 = R(str);
        if (R10 == null) {
            return null;
        }
        for (zzfw zzfwVar : R10.zzb()) {
            if (u32 == v(zzfwVar.zzb())) {
                return v(zzfwVar.zzc());
            }
        }
        return null;
    }

    public final zzgf R(String str) {
        h();
        q(str);
        zzgl w10 = w(str);
        if (w10 == null || !w10.zzn()) {
            return null;
        }
        return w10.zzo();
    }

    public final boolean S(String str) {
        h();
        q(str);
        zzgf R10 = R(str);
        return R10 == null || !R10.zzd() || R10.zze();
    }

    public final SortedSet T(String str) {
        h();
        q(str);
        TreeSet treeSet = new TreeSet();
        zzgf R10 = R(str);
        if (R10 != null) {
            Iterator it = R10.zzc().iterator();
            while (it.hasNext()) {
                treeSet.add(((zzgc) it.next()).zza());
            }
        }
        return treeSet;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3278j
    public final String f(String str, String str2) {
        h();
        q(str);
        Map map = (Map) this.f33757d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.D6
    public final boolean l() {
        return false;
    }

    public final S3 m(String str, U3 u32) {
        h();
        q(str);
        zzgf R10 = R(str);
        if (R10 == null) {
            return S3.UNINITIALIZED;
        }
        for (zzfu zzfuVar : R10.zzf()) {
            if (v(zzfuVar.zzb()) == u32) {
                int zzc = zzfuVar.zzc() - 1;
                return zzc != 1 ? zzc != 2 ? S3.UNINITIALIZED : S3.DENIED : S3.GRANTED;
            }
        }
        return S3.UNINITIALIZED;
    }

    public final boolean n(String str) {
        h();
        q(str);
        zzgf R10 = R(str);
        if (R10 == null) {
            return false;
        }
        for (zzfu zzfuVar : R10.zza()) {
            if (zzfuVar.zzb() == 3 && zzfuVar.zzd() == 3) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ zzc o(String str) {
        j();
        AbstractC3191o.g(str);
        C3318o N02 = this.f34418b.F0().N0(str);
        if (N02 == null) {
            return null;
        }
        this.f33578a.a().w().b("Populate EES config from database on cache miss. appId", str);
        s(str, t(str, N02.zza));
        return (zzc) this.f33763j.snapshot().get(str);
    }

    public final /* synthetic */ Map p() {
        return this.f33757d;
    }

    public final void q(String str) {
        j();
        h();
        AbstractC3191o.g(str);
        Map map = this.f33761h;
        if (map.get(str) == null) {
            C3318o N02 = this.f34418b.F0().N0(str);
            if (N02 != null) {
                zzgk zzgkVar = (zzgk) t(str, N02.zza).zzcl();
                r(str, zzgkVar);
                this.f33757d.put(str, u((zzgl) zzgkVar.zzbc()));
                map.put(str, (zzgl) zzgkVar.zzbc());
                s(str, (zzgl) zzgkVar.zzbc());
                this.f33765l.put(str, zzgkVar.zzh());
                this.f33766m.put(str, N02.f34190a);
                this.f33767n.put(str, N02.f34191b);
                return;
            }
            this.f33757d.put(str, null);
            this.f33759f.put(str, null);
            this.f33758e.put(str, null);
            this.f33760g.put(str, null);
            map.put(str, null);
            this.f33765l.put(str, null);
            this.f33766m.put(str, null);
            this.f33767n.put(str, null);
            this.f33762i.put(str, null);
        }
    }

    public final void r(String str, zzgk zzgkVar) {
        HashSet hashSet = new HashSet();
        C6900a c6900a = new C6900a();
        C6900a c6900a2 = new C6900a();
        C6900a c6900a3 = new C6900a();
        Iterator it = zzgkVar.zzg().iterator();
        while (it.hasNext()) {
            hashSet.add(((zzgh) it.next()).zza());
        }
        for (int i10 = 0; i10 < zzgkVar.zza(); i10++) {
            zzgi zzgiVar = (zzgi) zzgkVar.zzb(i10).zzcl();
            if (zzgiVar.zza().isEmpty()) {
                this.f33578a.a().r().a("EventConfig contained null event name");
            } else {
                String zza = zzgiVar.zza();
                String b10 = W3.b(zzgiVar.zza());
                if (!TextUtils.isEmpty(b10)) {
                    zzgiVar.zzb(b10);
                    zzgkVar.zzc(i10, zzgiVar);
                }
                if (zzgiVar.zzc() && zzgiVar.zzd()) {
                    c6900a.put(zza, Boolean.TRUE);
                }
                if (zzgiVar.zze() && zzgiVar.zzf()) {
                    c6900a2.put(zzgiVar.zza(), Boolean.TRUE);
                }
                if (zzgiVar.zzg()) {
                    if (zzgiVar.zzh() < 2 || zzgiVar.zzh() > 65535) {
                        this.f33578a.a().r().c("Invalid sampling rate. Event name, sample rate", zzgiVar.zza(), Integer.valueOf(zzgiVar.zzh()));
                    } else {
                        c6900a3.put(zzgiVar.zza(), Integer.valueOf(zzgiVar.zzh()));
                    }
                }
            }
        }
        this.f33758e.put(str, hashSet);
        this.f33759f.put(str, c6900a);
        this.f33760g.put(str, c6900a2);
        this.f33762i.put(str, c6900a3);
    }

    public final void s(final String str, zzgl zzglVar) {
        if (zzglVar.zzj() == 0) {
            this.f33763j.remove(str);
            return;
        }
        C3298l3 c3298l3 = this.f33578a;
        c3298l3.a().w().b("EES programs found", Integer.valueOf(zzglVar.zzj()));
        zzja zzjaVar = (zzja) zzglVar.zzi().get(0);
        try {
            zzc zzcVar = new zzc();
            zzcVar.zza("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.X2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new zzn("internal.remoteConfig", new T2(Y2.this, str));
                }
            });
            zzcVar.zza("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.U2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    final Y2 y22 = Y2.this;
                    final String str2 = str;
                    return new zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.W2
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            Y2 y23 = Y2.this;
                            C3357t F02 = y23.f34418b.F0();
                            String str3 = str2;
                            D2 J02 = F02.J0(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put(EventKeys.PLATFORM, Constants.PLATFORM_ANDROID);
                            hashMap.put("package_name", str3);
                            y23.f33578a.w().A();
                            hashMap.put("gmp_version", 133005L);
                            if (J02 != null) {
                                String D02 = J02.D0();
                                if (D02 != null) {
                                    hashMap.put(PublisherMetadata.APP_VERSION, D02);
                                }
                                hashMap.put("app_version_int", Long.valueOf(J02.F0()));
                                hashMap.put("dynamite_version", Long.valueOf(J02.b()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzcVar.zza("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.V2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new zzt(Y2.this.f33764k);
                }
            });
            zzcVar.zzf(zzjaVar);
            this.f33763j.put(str, zzcVar);
            c3298l3.a().w().c("EES program loaded for appId, activities", str, Integer.valueOf(zzjaVar.zzb().zzb()));
            Iterator it = zzjaVar.zzb().zza().iterator();
            while (it.hasNext()) {
                c3298l3.a().w().b("EES program activity", ((zziy) it.next()).zza());
            }
        } catch (zzd unused) {
            this.f33578a.a().o().b("Failed to load EES program. appId", str);
        }
    }

    public final zzgl t(String str, byte[] bArr) {
        if (bArr == null) {
            return zzgl.zzs();
        }
        try {
            zzgl zzglVar = (zzgl) ((zzgk) X6.W(zzgl.zzr(), bArr)).zzbc();
            this.f33578a.a().w().c("Parsed config. version, gmp_app_id", zzglVar.zza() ? Long.valueOf(zzglVar.zzb()) : null, zzglVar.zzc() ? zzglVar.zzd() : null);
            return zzglVar;
        } catch (zzmr e10) {
            this.f33578a.a().r().c("Unable to merge remote config. appId", C3392x2.x(str), e10);
            return zzgl.zzs();
        } catch (RuntimeException e11) {
            this.f33578a.a().r().c("Unable to merge remote config. appId", C3392x2.x(str), e11);
            return zzgl.zzs();
        }
    }

    public final zzgl w(String str) {
        j();
        h();
        AbstractC3191o.g(str);
        q(str);
        return (zzgl) this.f33761h.get(str);
    }

    public final String x(String str) {
        h();
        q(str);
        return (String) this.f33765l.get(str);
    }

    public final String y(String str) {
        h();
        return (String) this.f33766m.get(str);
    }

    public final String z(String str) {
        h();
        return (String) this.f33767n.get(str);
    }
}
