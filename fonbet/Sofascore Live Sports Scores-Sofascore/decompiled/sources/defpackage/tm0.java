package defpackage;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdkx;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tm0 implements s5a, zzdjm {
    public final /* synthetic */ int a;
    public String b;
    public String c;

    public tm0(fp4 fp4Var) {
        this.a = 1;
        Context context = (Context) fp4Var.b;
        int q0 = k53.q0(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (q0 != 0) {
            this.b = "Unity";
            this.c = context.getResources().getString(q0);
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.b = "Flutter";
                this.c = null;
                return;
            } catch (IOException unused) {
            }
        }
        this.b = null;
        this.c = null;
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 3:
                if (!(obj instanceof g7e)) {
                    return false;
                }
                g7e g7eVar = (g7e) obj;
                Object obj2 = g7eVar.a;
                String str = this.b;
                if (obj2 != str && (obj2 == null || !obj2.equals(str))) {
                    return false;
                }
                Object obj3 = g7eVar.b;
                String str2 = this.c;
                return obj3 == str2 || (obj3 != null && obj3.equals(str2));
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 3:
                String str = this.b;
                int hashCode = str == null ? 0 : str.hashCode();
                String str2 = this.c;
                return hashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // defpackage.s5a
    public o5a toInstant() {
        throw new gk4(this.b + " when parsing an Instant from \"" + ml4.t0(64, this.c) + '\"');
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "Pair{" + ((Object) this.b) + " " + ((Object) this.c) + "}";
            case 4:
                return this.b + ", " + this.c;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 5:
                ((AppEventListener) obj).onAppEvent(this.b, this.c);
                break;
            default:
                ((zzdkx) obj).c(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ tm0(String str, String str2, int i, byte b) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public tm0(String str, String str2, int i) {
        this.a = 0;
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ tm0() {
        this.a = 3;
    }
}
