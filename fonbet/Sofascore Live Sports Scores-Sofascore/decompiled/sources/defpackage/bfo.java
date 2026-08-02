package defpackage;

import com.google.android.gms.internal.ads.zzbec;
import com.google.android.gms.internal.ads.zzgfd;
import com.google.android.gms.internal.ads.zzhfd;
import com.google.android.gms.internal.ads.zzhfo;
import com.google.android.gms.internal.ads.zzhfq;
import com.google.android.gms.internal.ads.zzhfs;
import com.google.android.gms.internal.ads.zzhyl;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bfo {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public zzhfo b = null;
    public zzhfo c = null;

    public final boolean a(zzbec zzbecVar) {
        byte[] d = zzbecVar.D().E().E().d();
        byte[] d2 = zzbecVar.D().G().d();
        try {
            try {
                if (!this.a.getAndSet(true)) {
                    try {
                        zzhyl.a();
                        zzhfd a = zzhfs.a(new String(zzgfd.a("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false)));
                        omf omfVar = zzhfq.a;
                        this.b = (zzhfo) a.f(omfVar, zzhfo.class);
                        this.c = (zzhfo) zzhfs.a(new String(zzgfd.a("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).f(omfVar, zzhfo.class);
                    } catch (Exception e) {
                        throw new GeneralSecurityException("Failed to verify program", e);
                    }
                }
                zzhfo zzhfoVar = this.b;
                if (zzhfoVar == null) {
                    throw new GeneralSecurityException();
                }
                zzhfoVar.c(d, d2);
                return true;
            } catch (GeneralSecurityException unused) {
                zzhfo zzhfoVar2 = this.c;
                if (zzhfoVar2 != null) {
                    zzhfoVar2.c(d, d2);
                    return true;
                }
                return false;
            }
        } catch (GeneralSecurityException unused2) {
            return false;
        }
    }
}
