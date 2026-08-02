package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzbc;
import com.google.android.gms.internal.ads.zzaz;
import com.google.android.gms.internal.ads.zzddp;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzguz;
import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhhs;
import com.google.android.gms.internal.ads.zzhii;
import com.google.android.gms.internal.ads.zzhil;
import com.google.android.gms.internal.ads.zzhir;
import com.google.android.gms.internal.ads.zzhks;
import com.google.android.gms.internal.ads.zzhmw;
import com.google.android.gms.internal.ads.zzhmz;
import com.google.android.gms.internal.ads.zzhnz;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhpf;
import com.google.android.gms.internal.ads.zzhpm;
import com.google.android.gms.internal.ads.zzhqp;
import com.google.android.gms.internal.ads.zzhrn;
import com.google.android.gms.internal.ads.zzhro;
import com.google.android.gms.internal.ads.zzhrr;
import com.google.android.gms.internal.ads.zzhrs;
import com.google.android.gms.internal.ads.zzhsu;
import com.google.android.gms.internal.ads.zzhtc;
import com.google.android.gms.internal.ads.zzhtw;
import com.google.android.gms.internal.ads.zzhul;
import com.google.android.gms.internal.ads.zzhum;
import com.google.android.gms.internal.ads.zzhuo;
import com.google.android.gms.internal.ads.zzhvs;
import com.google.android.gms.internal.ads.zzhvx;
import com.google.android.gms.internal.ads.zzhwa;
import com.google.android.gms.internal.ads.zzhyz;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlz;
import com.google.android.gms.internal.ads.zzrg;
import com.google.android.gms.internal.ads_identifier.zzj;
import com.google.android.gms.internal.cast.zzwz;
import com.google.android.gms.internal.cast.zzxp;
import com.google.android.gms.internal.cast.zzyd;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzagy;
import com.google.android.gms.internal.measurement.zzagz;
import com.google.android.gms.internal.pal.zzrd;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.sofascore.results.tracker.TrackerBottomSheet;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bgf implements zzgvc, fon, zzbc, don, zzdjm, kwj, Continuation, hho, zzhmz, zzhnz, zzhmw, zzj, zzeb, zzrd {
    public static final /* synthetic */ bgf b = new bgf(6);
    public static final /* synthetic */ bgf c = new bgf(7);
    public static final /* synthetic */ bgf d = new bgf(10);
    public static final /* synthetic */ bgf e = new bgf(11);
    public static final /* synthetic */ bgf f = new bgf(12);
    public static final /* synthetic */ bgf g = new bgf(13);
    public static final /* synthetic */ bgf h = new bgf(14);
    public static final /* synthetic */ bgf i = new bgf(15);
    public static final /* synthetic */ bgf j = new bgf(16);
    public static final /* synthetic */ bgf k = new bgf(19);
    public static final /* synthetic */ bgf l = new bgf(20);
    public static final /* synthetic */ bgf m = new bgf(21);
    public static final /* synthetic */ bgf n = new bgf(22);
    public static final /* synthetic */ bgf o = new bgf(24);
    public static final /* synthetic */ bgf p = new bgf(27);
    public final /* synthetic */ int a;

    public static w5i a(int i2) {
        Object obj;
        Iterator<E> it = w5i.j.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((w5i) obj).a.contains(Integer.valueOf(i2))) {
                break;
            }
        }
        w5i w5iVar = (w5i) obj;
        return w5iVar == null ? w5i.c : w5iVar;
    }

    public static TrackerBottomSheet b(juj jujVar, int i2, int i3, String str, String str2, String str3, Integer num, Integer num2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        TrackerBottomSheet trackerBottomSheet = new TrackerBottomSheet();
        Bundle bundle = new Bundle();
        bundle.putString("tracker_type", jujVar.name());
        bundle.putInt("uniqueTournamentId", i2);
        bundle.putInt("seasonId", i3);
        bundle.putString("seasonYear", str);
        bundle.putString("leagueName", str2);
        bundle.putString("sportSlug", str3);
        if (num != null) {
            bundle.putInt("teamId1", num.intValue());
        }
        if (num2 != null) {
            bundle.putInt("teamId2", num2.intValue());
        }
        trackerBottomSheet.setArguments(bundle);
        return trackerBottomSheet;
    }

    @Override // defpackage.kwj
    public Object apply(Object obj) {
        zzwz zzwzVar = (zzwz) obj;
        zzwzVar.getClass();
        try {
            zzyd zzydVar = (zzyd) zzwzVar;
            int zzE = zzydVar.zzE();
            byte[] bArr = new byte[zzE];
            Logger logger = zzxp.b;
            hcp hcpVar = new hcp(bArr, zzE);
            zzydVar.u(hcpVar);
            if (hcpVar.e - hcpVar.f == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            String name = zzwzVar.getClass().getName();
            vp2.e(wt3.m("Serializing ", name, new StringBuilder(name.length() + 72), " to a byte array threw an IOException (should never happen)."), e2);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhnz
    public zzhfj f(zzhot zzhotVar) {
        jno jnoVar = zzhks.a;
        zzhtw zzhtwVar = zzhotVar.b;
        if (!zzhtwVar.D().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            a70.p("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhtwVar.D())));
            return null;
        }
        try {
            zziei E = zzhtwVar.E();
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhsu.D(E, zziew.c);
            return new zzhhs(zzhks.b(zzhotVar.c));
        } catch (zzige e2) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhmz
    public zzhos h(zzhes zzhesVar, zzhfr zzhfrVar) {
        zzhfm zzhfmVar;
        switch (this.a) {
            case 19:
                zzhii zzhiiVar = (zzhii) zzhesVar;
                jno jnoVar = zzhir.a;
                zzhul G = zzhum.G();
                zzhuo a = zzhir.a(zzhiiVar.a);
                G.n();
                ((zzhum) G.b).I(a);
                zziei e2 = ((zzhum) G.o()).e();
                zzhil zzhilVar = zzhiiVar.a.a;
                if (zzhil.b == zzhilVar) {
                    zzhfmVar = zzhfm.c;
                } else {
                    if (zzhil.c != zzhilVar) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhilVar)));
                    }
                    zzhfmVar = zzhfm.e;
                }
                return zzhos.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", e2, zzhfl.f, zzhfmVar, zzhiiVar.c);
            default:
                zzhpf zzhpfVar = (zzhpf) zzhesVar;
                jno jnoVar2 = zzhqp.a;
                zzhrn H = zzhro.H();
                zzhpm zzhpmVar = zzhpfVar.a;
                zzhrr E = zzhrs.E();
                int i2 = zzhpmVar.b;
                E.n();
                ((zzhrs) E.b).G(i2);
                zzhrs zzhrsVar = (zzhrs) E.o();
                H.n();
                ((zzhro) H.b).K(zzhrsVar);
                byte[] b2 = zzhpfVar.b.a.b();
                mpo B = zziei.B(0, b2.length, b2);
                H.n();
                ((zzhro) H.b).J(B);
                return zzhos.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzhro) H.o()).e(), zzhfl.c, zzhqp.a(zzhpfVar.a.c), zzhpfVar.d);
        }
    }

    @Override // defpackage.hho
    public Iterator i(zzguz zzguzVar, CharSequence charSequence) {
        return new gho(zzguzVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzhmw
    public zzhes n(zzhos zzhosVar, zzhfr zzhfrVar) {
        jno jnoVar = zzhyz.a;
        String str = zzhosVar.a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            a70.p("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            zziei zzieiVar = zzhosVar.c;
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhtc H = zzhtc.H(zzieiVar, zziew.c);
            if (H.D() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            int i3 = 0;
            zzhvs zzhvsVar = new zzhvs(i3);
            zzhvsVar.c = zzhyz.b(H.E().D());
            zzhvsVar.a = zzhyz.h(H.E().I());
            zzhvsVar.b = zzhyz.g(H.E().H());
            zzhvsVar.d = zzhyz.c(zzhosVar.e);
            zzhvx a = zzhvsVar.a();
            zzhwa zzhwaVar = new zzhwa(i3);
            zzhwaVar.a = a;
            zzhwaVar.b = new ECPoint(new BigInteger(1, H.F().d()), new BigInteger(1, H.G().d()));
            zzhwaVar.c = zzhosVar.f;
            return zzhwaVar.a();
        } catch (zzige | IllegalArgumentException unused) {
            zzl.x("Parsing EcdsaPublicKey failed");
            return null;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        return rbo.a(task);
    }

    @Override // com.google.android.gms.internal.ads.zzgvc, defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 6:
                int i2 = van.a;
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e2) {
                    yhk.q(e2);
                    return null;
                }
            case 7:
                return new Boolean(((zzagz) zzagy.b.a.a).zzb());
            case 8:
            case 9:
            case 11:
            default:
                List list = zzfy.a;
                return Long.valueOf(zzags.b.get().x());
            case 10:
                List list2 = zzfy.a;
                return Long.valueOf(zzags.b.get().I());
            case 12:
                List list3 = zzfy.a;
                return Long.valueOf(zzags.b.get().l());
            case 13:
                List list4 = zzfy.a;
                return zzags.b.get().zzg();
            case 14:
                List list5 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().G());
        }
    }

    public /* synthetic */ bgf(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public void mo13zza(Object obj) {
        switch (this.a) {
            case 11:
                ((zzddp) obj).zzf();
                break;
            case 24:
                int i2 = cwo.Z;
                ((zzaz) obj).j(new zzjn(2, new zzlz("Player release timed out."), 1003));
                break;
            case 25:
                break;
            default:
                ((zzrg) obj).zza();
                break;
        }
    }
}
