package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdkx;
import com.google.android.gms.internal.ads.zzgba;
import com.ironsource.C4227o2;
import com.ironsource.C4427z5;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class ih2 implements k3f, qyh, zzgba, zzdjm {
    public final /* synthetic */ int a;
    public final String b;

    public ih2(String str) {
        this.a = 3;
        str.getClass();
        this.b = str;
    }

    public static void c(sx2 sx2Var, nah nahVar) {
        String str = nahVar.a;
        if (str != null) {
            sx2Var.F("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        sx2Var.F("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        sx2Var.F("X-CRASHLYTICS-API-CLIENT-VERSION", "20.1.0");
        sx2Var.F("Accept", C4427z5.M);
        sx2Var.F("X-CRASHLYTICS-DEVICE-MODEL", nahVar.b);
        String str2 = nahVar.c;
        if (str2 != null) {
            sx2Var.F("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = nahVar.d;
        if (str3 != null) {
            sx2Var.F("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = nahVar.e.c().a;
        if (str4 != null) {
            sx2Var.F("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap d(nah nahVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", nahVar.h);
        hashMap.put("display_version", nahVar.g);
        hashMap.put("source", Integer.toString(nahVar.i));
        String str = nahVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(C4227o2.p, str);
        }
        return hashMap;
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(f(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.b);
                    sb.append(f(it.next()));
                }
            }
        } catch (IOException e) {
            a70.j(e);
        }
    }

    @Override // defpackage.qyh
    public Iterator b(a02 a02Var, CharSequence charSequence) {
        return new oyh(this, a02Var, charSequence, 1);
    }

    public String e(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public CharSequence f(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // defpackage.k3f
    public boolean test(Object obj) {
        String str = this.b;
        if (obj != str) {
            return obj != null && obj.equals(str);
        }
        return true;
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return str;
            case 5:
                return lnb.q(new StringBuilder("<"), str, '>');
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        ((zzdkx) obj).zzb(this.b);
    }

    public ih2(String str, rik rikVar) {
        this.a = 1;
        this.b = str;
    }

    public /* synthetic */ ih2(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public ih2(ih2 ih2Var) {
        this.a = 3;
        this.b = ih2Var.b;
    }
}
