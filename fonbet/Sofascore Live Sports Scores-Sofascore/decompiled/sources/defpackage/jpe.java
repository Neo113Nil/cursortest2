package defpackage;

import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.internal.ads.zzagb;
import com.google.android.gms.internal.ads.zzagd;
import com.google.android.gms.internal.ads.zzagh;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhge;
import com.google.android.gms.internal.ads.zzhgm;
import com.google.android.gms.internal.ads.zzhjo;
import com.google.android.gms.internal.ads.zzhjt;
import com.google.android.gms.internal.ads.zzhlq;
import com.google.android.gms.internal.ads.zzhmw;
import com.google.android.gms.internal.ads.zzhnz;
import com.google.android.gms.internal.ads.zzhoc;
import com.google.android.gms.internal.ads.zzhoj;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhrv;
import com.google.android.gms.internal.ads.zzhrw;
import com.google.android.gms.internal.ads.zzhrz;
import com.google.android.gms.internal.ads.zzhsa;
import com.google.android.gms.internal.ads.zzhsb;
import com.google.android.gms.internal.ads.zzhsc;
import com.google.android.gms.internal.ads.zzhth;
import com.google.android.gms.internal.ads.zzhtj;
import com.google.android.gms.internal.ads.zzhto;
import com.google.android.gms.internal.ads.zzhtp;
import com.google.android.gms.internal.ads.zzhtr;
import com.google.android.gms.internal.ads.zzhtw;
import com.google.android.gms.internal.ads.zzhvr;
import com.google.android.gms.internal.ads.zzhwi;
import com.google.android.gms.internal.ads.zzhwo;
import com.google.android.gms.internal.ads.zzhzi;
import com.google.android.gms.internal.ads.zzibc;
import com.google.android.gms.internal.ads.zzich;
import com.google.android.gms.internal.ads.zzicj;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzaic;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.pal.zzhv;
import com.google.android.gms.internal.stats.zze;
import com.google.android.gms.internal.wearable.zzm;
import com.google.android.gms.measurement.internal.zzfy;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.Sports;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import java.lang.reflect.Constructor;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class jpe implements y0i, xnd, f, zzagb, fon, zzdjm, zze, zzhoj, zzhoc, zzhnz, zzhv, zzhmw, zzm, zzeb {
    public static final /* synthetic */ jpe b = new jpe(7);
    public static final /* synthetic */ jpe c = new jpe(8);
    public static final /* synthetic */ jpe d = new jpe(9);
    public static final /* synthetic */ jpe e = new jpe(10);
    public static final /* synthetic */ jpe f = new jpe(11);
    public static final /* synthetic */ jpe g = new jpe(12);
    public static final /* synthetic */ jpe h = new jpe(13);
    public static final /* synthetic */ jpe i = new jpe(14);
    public static final /* synthetic */ jpe j = new jpe(15);
    public static final /* synthetic */ jpe k = new jpe(16);
    public static final /* synthetic */ jpe l = new jpe(17);
    public static final /* synthetic */ jpe m = new jpe(19);
    public static final /* synthetic */ jpe n = new jpe(20);
    public static final /* synthetic */ jpe o = new jpe(21);
    public static final /* synthetic */ jpe p = new jpe(23);
    public final /* synthetic */ int a;

    public /* synthetic */ jpe(int i2) {
        this.a = i2;
    }

    public static fzg a(String str) {
        int hashCode;
        return (str == null || ((hashCode = str.hashCode()) == -2002238939 ? !str.equals(Sports.ICE_HOCKEY) : hashCode == -83759494 ? !str.equals(Sports.AMERICAN_FOOTBALL) : !(hashCode == 394668909 && str.equals(Sports.FOOTBALL)))) ? fzg.e : fzg.f;
    }

    public static PlayerEventStatisticsModal c(hzd hzdVar, String str) {
        hzdVar.getClass();
        PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
        List list = hzdVar.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((xoe) obj).a.getDisabled()) {
                arrayList.add(obj);
            }
        }
        Integer num = hzdVar.a;
        Integer num2 = hzdVar.b;
        String str2 = hzdVar.d;
        boolean z = hzdVar.e;
        boolean z2 = hzdVar.f;
        int i2 = hzdVar.g;
        String str3 = hzdVar.h;
        int i3 = hzdVar.i;
        Boolean bool = hzdVar.j;
        long j2 = hzdVar.k;
        mzd mzdVar = hzdVar.l;
        wj1 wj1Var = hzdVar.m;
        str2.getClass();
        playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(num, num2, arrayList, str2, z, z2, i2, str3, i3, bool, j2, mzdVar, wj1Var)), fz8.H("ANALYTICS_LOCATION", str)));
        return playerEventStatisticsModal;
    }

    public boolean b(CharSequence charSequence) {
        return charSequence instanceof g3f;
    }

    @Override // defpackage.xnd
    public a0h createSeekMap() {
        return new aw0(C.TIME_UNSET);
    }

    @Override // defpackage.y0i
    public StackTraceElement[] e(StackTraceElement[] stackTraceElementArr) {
        int i2;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i3];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i6 = i3 - intValue;
                if (i3 + i6 <= stackTraceElementArr.length) {
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (stackTraceElementArr[intValue + i7].equals(stackTraceElementArr[i3 + i7])) {
                        }
                    }
                    int intValue2 = i3 - num.intValue();
                    if (i5 < 10) {
                        System.arraycopy(stackTraceElementArr, i3, stackTraceElementArr2, i4, intValue2);
                        i4 += intValue2;
                        i5++;
                    }
                    i2 = (intValue2 - 1) + i3;
                    hashMap.put(stackTraceElement, Integer.valueOf(i3));
                    i3 = i2 + 1;
                }
            }
            stackTraceElementArr2[i4] = stackTraceElementArr[i3];
            i4++;
            i5 = 1;
            i2 = i3;
            hashMap.put(stackTraceElement, Integer.valueOf(i3));
            i3 = i2 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i4);
        return i4 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhnz
    public zzhfj f(zzhot zzhotVar) {
        jno jnoVar = zzhlq.a;
        zzhtw zzhtwVar = zzhotVar.b;
        if (!zzhtwVar.D().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            a70.p("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhtwVar.D())));
            return null;
        }
        try {
            zziei E = zzhtwVar.E();
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            if (zzhvr.E(E, zziew.c).D() == 0) {
                return new zzhjo(zzhlq.b(zzhotVar.c));
            }
            zzl.x("Only version 0 parameters are accepted");
            return null;
        } catch (zzige e2) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e2);
        }
    }

    @Override // defpackage.xnd
    public long g(ml6 ml6Var) {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzhoc
    public zzhot l(zzhfj zzhfjVar) {
        zzhgm zzhgmVar = (zzhgm) zzhfjVar;
        jno jnoVar = zzhjt.a;
        zzhfm a = zzhjt.a(zzhgmVar.e);
        zzhrv G = zzhrw.G();
        zzhrz F = zzhsa.F();
        zzhsb E = zzhsc.E();
        int i2 = zzhgmVar.c;
        E.n();
        ((zzhsc) E.b).G(i2);
        zzhsc zzhscVar = (zzhsc) E.o();
        F.n();
        ((zzhsa) F.b).H(zzhscVar);
        int i3 = zzhgmVar.a;
        F.n();
        ((zzhsa) F.b).I(i3);
        zzhsa zzhsaVar = (zzhsa) F.o();
        G.n();
        ((zzhrw) G.b).H(zzhsaVar);
        zzhto H = zzhtp.H();
        zzhtr d2 = zzhjt.d(zzhgmVar);
        H.n();
        ((zzhtp) H.b).J(d2);
        int i4 = zzhgmVar.b;
        H.n();
        ((zzhtp) H.b).K(i4);
        zzhtp zzhtpVar = (zzhtp) H.o();
        G.n();
        ((zzhrw) G.b).I(zzhtpVar);
        return zzhot.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", a, (mpo) ((zzhrw) G.o()).e());
    }

    @Override // com.google.android.gms.internal.ads.zzhmw
    public zzhes n(zzhos zzhosVar, zzhfr zzhfrVar) {
        jno jnoVar = zzhzi.a;
        String str = zzhosVar.a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            a70.p("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            zziei zzieiVar = zzhosVar.c;
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhth G = zzhth.G(zzieiVar, zziew.c);
            if (G.D() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhtj F = G.F();
            if (F.D() == 0) {
                return zzhwi.d(zzhwo.d(zzhzi.b(zzhosVar.e), zzich.a(F.E().d()), zzhosVar.f), new zzicj(zzich.a(G.E().d())));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzige unused) {
            zzl.x("Parsing Ed25519PrivateKey failed");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhoj
    public /* synthetic */ Object o(zzhes zzhesVar) {
        return zzibc.a((zzhge) zzhesVar);
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 8:
                List list = zzfy.a;
                return zzags.b.get().zze();
            case 9:
                List list2 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().A());
            case 10:
                List list3 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzR());
            case 11:
                List list4 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzH());
            case 12:
            default:
                List list5 = zzfy.a;
                return Boolean.valueOf(zzaif.b.get().zzb());
            case 13:
                List list6 = zzfy.a;
                return Boolean.valueOf(zzaic.b.get().zza());
            case 14:
                List list7 = zzfy.a;
                return Long.valueOf(zzaic.b.get().zze());
            case 15:
                List list8 = zzfy.a;
                return zzags.b.get().y();
            case 16:
                List list9 = zzfy.a;
                return Boolean.valueOf(zzags.b.get().zzE());
        }
    }

    @Override // defpackage.xnd, defpackage.ynd
    public void startSeek(long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 12:
                ((zzr) obj).zzdq();
                break;
            case 26:
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagb, defpackage.fon
    /* renamed from: zza */
    public /* synthetic */ Constructor mo792zza() {
        int[] iArr = zzagd.c;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzagh.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
