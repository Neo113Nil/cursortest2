package defpackage;

import android.content.ClipData;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.internal.ads.zzaz;
import com.google.android.gms.internal.ads.zzdir;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzec;
import com.google.android.gms.internal.ads.zzhep;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfd;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhjg;
import com.google.android.gms.internal.ads.zzhjh;
import com.google.android.gms.internal.ads.zzhji;
import com.google.android.gms.internal.ads.zzhjm;
import com.google.android.gms.internal.ads.zzhkn;
import com.google.android.gms.internal.ads.zzhlk;
import com.google.android.gms.internal.ads.zzhll;
import com.google.android.gms.internal.ads.zzhmo;
import com.google.android.gms.internal.ads.zzhmz;
import com.google.android.gms.internal.ads.zzhnt;
import com.google.android.gms.internal.ads.zzhnz;
import com.google.android.gms.internal.ads.zzhoj;
import com.google.android.gms.internal.ads.zzhoo;
import com.google.android.gms.internal.ads.zzhoq;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhpq;
import com.google.android.gms.internal.ads.zzhpz;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzhtf;
import com.google.android.gms.internal.ads.zzhtl;
import com.google.android.gms.internal.ads.zzhtm;
import com.google.android.gms.internal.ads.zzhtn;
import com.google.android.gms.internal.ads.zzhtq;
import com.google.android.gms.internal.ads.zzhtr;
import com.google.android.gms.internal.ads.zzhtw;
import com.google.android.gms.internal.ads.zzhvl;
import com.google.android.gms.internal.ads.zzhwh;
import com.google.android.gms.internal.ads.zzhzi;
import com.google.android.gms.internal.ads.zzicg;
import com.google.android.gms.internal.ads.zzicj;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzify;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.ads.zzs;
import com.google.android.gms.internal.common.zzd;
import com.google.android.gms.internal.measurement.zzaew;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzahq;
import com.google.android.gms.internal.measurement.zzahr;
import com.google.android.gms.internal.measurement.zzair;
import com.google.android.gms.internal.measurement.zzais;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class omf implements ky3, c4a, fon, zzdjm, zzd, Continuation, zzhep, zzhoj, zzhnz, zzhmz, zzec, zzeb {
    public static final /* synthetic */ omf b = new omf(7);
    public static final /* synthetic */ omf c = new omf(8);
    public static final /* synthetic */ omf d = new omf(9);
    public static final /* synthetic */ omf e = new omf(10);
    public static final /* synthetic */ omf f = new omf(11);
    public static final /* synthetic */ omf g = new omf(12);
    public static final /* synthetic */ omf h = new omf(13);
    public static final /* synthetic */ omf i = new omf(15);
    public static final /* synthetic */ omf j = new omf(16);
    public static final /* synthetic */ omf k = new omf(19);
    public static final /* synthetic */ omf l = new omf(20);
    public static final /* synthetic */ omf m = new omf(21);
    public static final /* synthetic */ omf n = new omf(22);
    public final /* synthetic */ int a;

    public /* synthetic */ omf(int i2) {
        this.a = i2;
    }

    public static final zzify a(Object obj, long j2) {
        zzify zzifyVar = (zzify) rqo.e(obj, j2);
        if (zzifyVar.zza()) {
            return zzifyVar;
        }
        int size = zzifyVar.size();
        zzify g2 = zzifyVar.g(size == 0 ? 10 : size + size);
        rqo.f(j2, obj, g2);
        return g2;
    }

    public static final zzaew d(Object obj, Object obj2) {
        zzaew zzaewVar = (zzaew) obj;
        zzaew zzaewVar2 = (zzaew) obj2;
        if (!zzaewVar2.isEmpty()) {
            if (!zzaewVar.a) {
                zzaewVar = zzaewVar.g();
            }
            zzaewVar.i();
            if (!zzaewVar2.isEmpty()) {
                zzaewVar.putAll(zzaewVar2);
            }
        }
        return zzaewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzec
    public /* synthetic */ void b(Object obj, zzs zzsVar) {
        ((zzaz) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhep
    public Object c(zzhfd zzhfdVar, Class cls) {
        zzhoo zzhooVar = (zzhoo) zzhnt.b.a.get();
        HashMap hashMap = zzhooVar.b;
        if (!hashMap.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzhoq zzhoqVar = (zzhoq) hashMap.get(cls);
        return zzhoqVar.a(zzhfdVar, new f0o(23, zzhooVar, zzhoqVar));
    }

    @Override // defpackage.c4a
    public boolean e(d4a d4aVar, int i2, Bundle bundle) {
        if ((i2 & 1) != 0) {
            try {
                ((InputContentInfo) ((j0l) d4aVar.b).b).requestPermission();
                InputContentInfo inputContentInfo = (InputContentInfo) ((j0l) d4aVar.b).b;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e2) {
                e2.toString();
                return false;
            }
        }
        j0l j0lVar = (j0l) d4aVar.b;
        j0l j0lVar2 = (j0l) d4aVar.b;
        new ClipData(((InputContentInfo) j0lVar.b).getDescription(), new ClipData.Item(((InputContentInfo) j0lVar2.b).getContentUri()));
        ((InputContentInfo) j0lVar2.b).getDescription();
        ((InputContentInfo) j0lVar2.b).getLinkUri();
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhnz
    public zzhfj f(zzhot zzhotVar) {
        zzhjg zzhjgVar;
        switch (this.a) {
            case 20:
                jno jnoVar = zzhlk.a;
                zzhtw zzhtwVar = zzhotVar.b;
                if (!zzhtwVar.D().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    a70.p("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzhtwVar.D())));
                    return null;
                }
                try {
                    zziei E = zzhtwVar.E();
                    zziew zziewVar = zziew.b;
                    int i2 = dpo.a;
                    zzhvl F = zzhvl.F(E, zziew.c);
                    if (F.D() != 0) {
                        zzl.x("Only version 0 parameters are accepted");
                        return null;
                    }
                    zzhfm zzhfmVar = zzhotVar.c;
                    if (zzhfmVar == zzhfm.c) {
                        zzhjgVar = zzhjg.b;
                    } else {
                        if (zzhfmVar != zzhfm.e) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
                        }
                        zzhjgVar = zzhjg.c;
                    }
                    return zzhjh.b(zzhjgVar, F.E().D());
                } catch (zzige e2) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e2);
                }
            default:
                jno jnoVar2 = zzhzi.a;
                zzhtw zzhtwVar2 = zzhotVar.b;
                if (!zzhtwVar2.D().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    a70.p("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhtwVar2.D())));
                    return null;
                }
                try {
                    zziei E2 = zzhtwVar2.E();
                    zziew zziewVar2 = zziew.b;
                    int i3 = dpo.a;
                    if (zzhtf.E(E2, zziew.c).D() == 0) {
                        return new zzhwh(zzhzi.b(zzhotVar.c));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzige e3) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e3);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhmz
    public zzhos h(zzhes zzhesVar, zzhfr zzhfrVar) {
        zzhpq zzhpqVar = (zzhpq) zzhesVar;
        zzhmo zzhmoVar = zzhqy.a;
        zzhtm H = zzhtn.H();
        zzhpz zzhpzVar = zzhpqVar.a;
        zzhtq F = zzhtr.F();
        int i2 = zzhpzVar.b;
        F.n();
        ((zzhtr) F.b).I(i2);
        zzhtl zzhtlVar = (zzhtl) zzhqy.a.b(zzhpzVar.d);
        F.n();
        ((zzhtr) F.b).H(zzhtlVar);
        zzhtr zzhtrVar = (zzhtr) F.o();
        H.n();
        ((zzhtn) H.b).K(zzhtrVar);
        byte[] b2 = zzhpqVar.b.a.b();
        mpo B = zziei.B(0, b2.length, b2);
        H.n();
        ((zzhtn) H.b).L(B);
        return zzhos.a("type.googleapis.com/google.crypto.tink.HmacKey", ((zzhtn) H.o()).e(), zzhfl.c, zzhqy.a(zzhpqVar.a.c), zzhpqVar.d);
    }

    @Override // com.google.android.gms.internal.ads.zzhoj
    public Object o(zzhes zzhesVar) {
        zzhji zzhjiVar = (zzhji) zzhesVar;
        kno knoVar = zzhjm.a;
        try {
            zzhkn.a();
            Cipher a = zzhkn.a();
            zzicj zzicjVar = zzhjiVar.b;
            zzhfr zzhfrVar = zzhfr.a;
            return new zzhll(zzicjVar.a.b(), zzhjiVar.c.b(), a.getProvider());
        } catch (GeneralSecurityException unused) {
            zzicj zzicjVar2 = zzhjiVar.b;
            zzhfr zzhfrVar2 = zzhfr.a;
            return new zzicg(zzicjVar2.a.b(), zzhjiVar.c.b());
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        List list = (List) task.getResult();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        ((s9o) it.next()).getClass();
        new TaskCompletionSource();
        throw null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
                num.getClass();
                return bf3.k("CreationExtras.Key@", num, "<", duf.a.getOrCreateKotlinClass(ttk.class).getSimpleName(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 7:
                return new Boolean(((zzahr) zzahq.b.a.a).zza());
            case 8:
                List list = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().n());
            case 9:
                List list2 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzN());
            case 10:
                List list3 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzB());
            case 11:
            case 12:
            case 13:
            case 14:
            default:
                List list4 = zzfy.a;
                return Boolean.valueOf(((zzais) zzair.b.a.a).zzb());
            case 15:
                List list5 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().i());
        }
    }

    public /* synthetic */ omf(Object obj, int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 11:
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
                break;
            case 12:
                ((zzdir) obj).D();
                break;
            case 13:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoStart();
                break;
            case 25:
                break;
            default:
                break;
        }
    }
}
