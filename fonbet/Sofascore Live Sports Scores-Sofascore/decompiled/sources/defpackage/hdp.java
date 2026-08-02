package defpackage;

import com.google.android.gms.internal.measurement.zzyc;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hdp extends zzyc {
    public int e = 0;
    public final String b = "com/google/android/libraries/phenotype/client/Phlogger";
    public final String c = "logInternal";
    public final String d = "Phlogger.java";

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String a() {
        return this.b.replace('/', '.');
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final int c() {
        return 44;
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String d() {
        char c = File.separatorChar;
        String str = this.d;
        return str.substring(str.lastIndexOf(c) + 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof hdp) {
            hdp hdpVar = (hdp) obj;
            if (this.c.equals(hdpVar.c)) {
                String str = hdpVar.b;
                String str2 = this.b;
                if (str2 != str) {
                    if (str2.length() == str.length()) {
                        for (0; i < str2.length(); i + 1) {
                            char charAt = str2.charAt(i);
                            char charAt2 = str.charAt(i);
                            i = (charAt == charAt2 || ((charAt & 65534) == 46 && (charAt ^ charAt2) == 1)) ? i + 1 : 0;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.c.hashCode() + 4867) * 31) + 44;
        this.e = hashCode;
        return hashCode;
    }
}
