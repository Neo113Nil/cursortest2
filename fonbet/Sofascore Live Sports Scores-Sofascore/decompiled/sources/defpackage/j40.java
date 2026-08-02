package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Looper;
import android.view.Choreographer;
import com.google.android.gms.internal.ads.zzhkh;
import com.google.android.gms.internal.ads.zzhmb;
import com.google.android.gms.internal.ads.zzhov;
import com.google.android.gms.internal.ads.zzibh;
import com.google.android.gms.internal.cast.zzko;
import com.google.android.gms.internal.fido.zzfm;
import com.google.android.gms.internal.measurement.zzabt;
import com.google.android.gms.internal.measurement.zzrn;
import com.google.android.gms.internal.measurement.zzvy;
import com.google.android.gms.internal.measurement.zzwq;
import com.google.android.gms.internal.pal.zzxz;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class j40 extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ j40(int i) {
        this.a = i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:23|(4:25|26|27|28)|31|32|33|(4:36|37|27|28)|35|27|28) */
    @Override // java.lang.ThreadLocal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initialValue() {
        SecureRandom secureRandom;
        Provider provider = null;
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    l40 l40Var = new l40(choreographer, o1j.u(myLooper));
                    return l40Var.plus(l40Var.l);
                }
                a70.r("no Looper on this thread");
                return null;
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(yol.a);
                return simpleDateFormat;
            case 2:
                return new PathMeasure();
            case 3:
                return new Path();
            case 4:
                return new Path();
            case 5:
                return new float[4];
            case 6:
                return Boolean.FALSE;
            case 7:
                return new zzabt();
            case 8:
                return ByteBuffer.allocate(32);
            case 9:
                return 0L;
            case 10:
                return new zzfm();
            case 11:
                iho ihoVar = new iho();
                Choreographer.getInstance();
                return ihoVar;
            case 12:
                try {
                    return (Cipher) zzibh.b.a.zza("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e) {
                    yhk.q(e);
                    return null;
                }
            case 13:
                try {
                    Cipher cipher = (Cipher) zzibh.b.a.zza("AES/GCM-SIV/NoPadding");
                    if (zzhkh.a(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException e2) {
                    yhk.q(e2);
                    return null;
                }
            case 14:
                j40 j40Var = zzhov.a;
                Provider a = zzhmb.a();
                if (a != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", a);
                    } catch (GeneralSecurityException unused) {
                    }
                    secureRandom.nextLong();
                    return secureRandom;
                }
                provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                if (provider != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } catch (GeneralSecurityException unused2) {
                    }
                    secureRandom.nextLong();
                    return secureRandom;
                }
                secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 15:
                try {
                    return (Cipher) zzibh.b.a.zza("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e3) {
                    yhk.q(e3);
                    return null;
                }
            case 16:
                try {
                    return (Cipher) zzibh.b.a.zza("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e4) {
                    yhk.q(e4);
                    return null;
                }
            case 17:
                try {
                    return (Cipher) zzibh.b.a.zza("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e5) {
                    yhk.q(e5);
                    return null;
                }
            case 18:
                return new zzko();
            case 19:
                try {
                    return (Cipher) zzxz.e.a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e6) {
                    yhk.q(e6);
                    return null;
                }
            case 20:
                try {
                    return (Cipher) zzxz.e.a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e7) {
                    yhk.q(e7);
                    return null;
                }
            case 21:
                Thread.currentThread();
                if (zzrn.b == null) {
                    zzrn.b = Looper.getMainLooper().getThread();
                }
                zzwq zzwqVar = new zzwq();
                zzwqVar.a = false;
                zzwqVar.b = null;
                Thread currentThread = Thread.currentThread();
                WeakHashMap weakHashMap = zzvy.c;
                synchronized (weakHashMap) {
                    weakHashMap.put(currentThread, zzwqVar);
                }
                return zzwqVar;
            case 22:
                try {
                    return (Cipher) zzxz.e.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e8) {
                    yhk.q(e8);
                    return null;
                }
            case 23:
                try {
                    return (Cipher) zzxz.e.a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e9) {
                    yhk.q(e9);
                    return null;
                }
            case 24:
                try {
                    return (Cipher) zzxz.e.a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e10) {
                    yhk.q(e10);
                    return null;
                }
            case 25:
                SecureRandom secureRandom2 = new SecureRandom();
                secureRandom2.nextLong();
                return secureRandom2;
            default:
                return new Random();
        }
    }
}
