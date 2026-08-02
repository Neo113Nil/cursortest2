package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.webkit.URLUtil;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.internal.ads.zzanx;
import com.google.android.gms.internal.ads.zzanz;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdlb;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhhb;
import com.google.android.gms.internal.ads.zzhhn;
import com.google.android.gms.internal.ads.zzhhq;
import com.google.android.gms.internal.ads.zzhkf;
import com.google.android.gms.internal.ads.zzhkn;
import com.google.android.gms.internal.ads.zzhma;
import com.google.android.gms.internal.ads.zzhmz;
import com.google.android.gms.internal.ads.zzhne;
import com.google.android.gms.internal.ads.zzhni;
import com.google.android.gms.internal.ads.zzhnz;
import com.google.android.gms.internal.ads.zzhoj;
import com.google.android.gms.internal.ads.zzhor;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhsm;
import com.google.android.gms.internal.ads.zzhtw;
import com.google.android.gms.internal.ads.zzhuw;
import com.google.android.gms.internal.ads.zzhux;
import com.google.android.gms.internal.ads.zzhuz;
import com.google.android.gms.internal.ads.zzhxs;
import com.google.android.gms.internal.ads.zzhxu;
import com.google.android.gms.internal.ads.zzhzl;
import com.google.android.gms.internal.ads.zzhzt;
import com.google.android.gms.internal.ads.zziau;
import com.google.android.gms.internal.ads.zzicj;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.fido.zzdz;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzahe;
import com.google.android.gms.internal.measurement.zzahf;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.measurement.internal.zzfy;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import com.sofascore.results.dialog.SofascoreRatingBottomSheetDialog;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class v9f implements x9f, uqg, ptm, zzanx, fon, don, zzdjm, zzdz, OnUserEarnedRewardListener, zzgvc, zzhoj, zzhnz, zzhni, zzhmz, zzeb {
    public static v9f b;
    public static final /* synthetic */ v9f c = new v9f(8);
    public static final /* synthetic */ v9f d = new v9f(9);
    public static final /* synthetic */ v9f e = new v9f(11);
    public static final /* synthetic */ v9f f = new v9f(12);
    public static final /* synthetic */ v9f g = new v9f(13);
    public static final /* synthetic */ v9f h = new v9f(15);
    public static final /* synthetic */ v9f i = new v9f(16);
    public static final /* synthetic */ v9f j = new v9f(17);
    public static final /* synthetic */ v9f k = new v9f(18);
    public static final /* synthetic */ v9f l = new v9f(19);
    public static final /* synthetic */ v9f m = new v9f(20);
    public static final /* synthetic */ v9f n = new v9f(22);
    public static final /* synthetic */ v9f o = new v9f(23);
    public static final /* synthetic */ v9f p = new v9f(24);
    public final /* synthetic */ int a;

    public static SofascoreRatingBottomSheetDialog e(gvh gvhVar, Double d2, Integer num, String str, TeamAverageRatingVersion teamAverageRatingVersion, int i2) {
        if ((i2 & 2) != 0) {
            d2 = null;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 16) != 0) {
            teamAverageRatingVersion = TeamAverageRatingVersion.ORIGINAL;
        }
        gvhVar.getClass();
        str.getClass();
        teamAverageRatingVersion.getClass();
        SofascoreRatingBottomSheetDialog sofascoreRatingBottomSheetDialog = new SofascoreRatingBottomSheetDialog();
        Bundle f2 = bf3.f("sport_slug", str);
        f2.putInt("rating_type", gvhVar.ordinal());
        if (d2 != null) {
            f2.putDouble(CampaignEx.JSON_KEY_STAR, d2.doubleValue());
        }
        if (num != null) {
            f2.putInt("entity_id", num.intValue());
        }
        f2.putString("avg_rating_version", teamAverageRatingVersion.name());
        sofascoreRatingBottomSheetDialog.setArguments(f2);
        return sofascoreRatingBottomSheetDialog;
    }

    public static List i(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("adLoaded");
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
            jSONObject2.getClass();
            String G = hda.G("trackUrl", jSONObject2);
            if (G != null && URLUtil.isValidUrl(G)) {
                arrayList.add(G);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return CollectionsKt.S0(arrayList);
    }

    public static ArrayList j(JSONObject jSONObject) {
        String G;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("trackClickUrls");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString = optJSONArray.optString(i2);
                if (URLUtil.isValidUrl(optString)) {
                    optString.getClass();
                    arrayList.add(optString);
                }
            }
        }
        if (arrayList.isEmpty() && (G = hda.G("countClickUrl", jSONObject)) != null && URLUtil.isValidUrl(G)) {
            arrayList.add(G);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static List l(JSONObject jSONObject) {
        String G = hda.G("impUrls", jSONObject);
        if (G == null) {
            G = jSONObject.optString("impUrl");
        }
        G.getClass();
        if (StringsKt.R(G) || G.equals(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) {
            return null;
        }
        List h2 = new Regex("\\s*,\\s*[hH][tT]{2}[pP]").h(G);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : h2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            arrayList.add(StringsKt.l0((i2 > 0 ? "http" : "") + ((String) obj)).toString());
            i2 = i3;
        }
        if (!arrayList.isEmpty() && c.n((String) CollectionsKt.h0(arrayList), BlazeDataSourcePersonalizedType.STRING_SEPARATOR, false)) {
            arrayList.add(StringsKt.l0(((String) arrayList.remove(arrayList.size() - 1)).substring(0, r8.length() - 1)).toString());
        }
        return CollectionsKt.S0(arrayList);
    }

    public static List m(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("viewCount");
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String optString = optJSONArray.getJSONObject(i2).optString("trackUrl");
            long optInt = r3.optInt(IronSourceConstants.EVENTS_DURATION, -1) * 1000;
            double optInt2 = r3.optInt("area", -1) / 100.0d;
            if (optInt > 0 && optInt2 >= 0.0d && optInt2 <= 1.0d) {
                optString.getClass();
                arrayList.add(new ihg("viewcount", optString, optInt, optInt2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return CollectionsKt.S0(arrayList);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v0 jag, still in use, count: 2, list:
          (r10v0 jag) from 0x0157: MOVE (r28v0 jag) = (r10v0 jag) (LINE:344)
          (r10v0 jag) from 0x0104: MOVE (r28v4 jag) = (r10v0 jag) (LINE:261)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static defpackage.jag n(org.json.JSONObject r75) {
        /*
            Method dump skipped, instructions count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9f.n(org.json.JSONObject):jag");
    }

    public static ArrayList p(JSONObject jSONObject) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("mediationAds");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = optJSONArray.get(i2);
                JSONObject jSONObject2 = obj instanceof JSONObject ? (JSONObject) obj : null;
                if (jSONObject2 != null) {
                    try {
                        JSONObject optJSONObject = jSONObject2.optJSONObject("extraParameters");
                        String string = jSONObject2.getString("androidAdapterClassName");
                        string.getClass();
                        x3f x3fVar = rag.b;
                        int optInt = jSONObject2.optInt("formatType", -1);
                        x3fVar.getClass();
                        rag ragVar = optInt != 0 ? optInt != 1 ? optInt != 2 ? optInt != 3 ? rag.UNKNOWN : rag.NATIVE_AD : rag.REWARDED : rag.INTERSTITIAL : rag.BANNER;
                        try {
                            num = Integer.valueOf(jSONObject2.getInt("bannerIntegrationType"));
                        } catch (JSONException unused) {
                            num = null;
                        }
                        String optString = jSONObject2.optString("insertionId");
                        List l2 = l(jSONObject2);
                        List i3 = i(jSONObject2);
                        ArrayList j2 = j(jSONObject2);
                        List m2 = m(jSONObject2);
                        try {
                            num2 = Integer.valueOf(jSONObject2.getInt("width"));
                        } catch (JSONException unused2) {
                            num2 = null;
                        }
                        try {
                            num3 = Integer.valueOf(jSONObject2.getInt("height"));
                        } catch (JSONException unused3) {
                            num3 = null;
                        }
                        String optString2 = jSONObject2.optString("mediationAndroidAdapterClassName");
                        int optInt2 = jSONObject2.optInt("sdkId");
                        String optString3 = jSONObject2.optString("sdkName");
                        JSONObject optJSONObject2 = jSONObject2.optJSONObject("placementConfig");
                        String optString4 = optJSONObject2 != null ? optJSONObject2.optString("placementInfo") : null;
                        try {
                            num4 = Integer.valueOf(jSONObject2.getInt("channelType"));
                        } catch (JSONException unused4) {
                            num4 = null;
                        }
                        arrayList.add(new jag(string, ragVar, num, optString, null, null, null, l2, null, i3, j2, null, m2, null, num2, num3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optJSONObject != null ? hda.S(optJSONObject) : null, null, null, null, null, null, null, null, optString2, Integer.valueOf(optInt2), optString3, optString4, num4, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
                    } catch (Exception e2) {
                        jeg jegVar = jeg.d;
                        e2.toString();
                        jegVar.f(1);
                        Unit unit = Unit.a;
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public boolean b(zzv zzvVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public int c(zzv zzvVar) {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public zzanz d(zzv zzvVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // com.google.android.gms.internal.ads.zzhnz
    public zzhfj f(zzhot zzhotVar) {
        jno jnoVar = zzhkf.a;
        zzhtw zzhtwVar = zzhotVar.b;
        if (!zzhtwVar.D().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            a70.p("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzhtwVar.D())));
            return null;
        }
        try {
            zziei E = zzhtwVar.E();
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhsm F = zzhsm.F(E, zziew.c);
            if (F.E() != 0) {
                zzl.x("Only version 0 parameters are accepted");
                return null;
            }
            zzhhb zzhhbVar = new zzhhb(0);
            zzhhbVar.a(F.D());
            zzhhbVar.b();
            zzhhbVar.c();
            zzhhbVar.d = zzhkf.b(zzhotVar.c);
            return zzhhbVar.d();
        } catch (zzige e2) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e2);
        }
    }

    @Override // defpackage.uqg
    public Object g(lpg lpgVar, Object obj) {
        kfj kfjVar = (kfj) obj;
        Integer valueOf = Integer.valueOf(kfjVar.a);
        String str = kfjVar.b;
        String str2 = kfjVar.c;
        long j2 = kfjVar.d;
        int i2 = pej.c;
        Integer valueOf2 = Integer.valueOf((int) (j2 >> 32));
        Integer valueOf3 = Integer.valueOf((int) (j2 & 4294967295L));
        long j3 = kfjVar.e;
        return b.j(valueOf, str, str2, valueOf2, valueOf3, Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) (4294967295L & j3)), Long.valueOf(kfjVar.f));
    }

    @Override // com.google.android.gms.internal.ads.zzhmz
    public zzhos h(zzhes zzhesVar, zzhfr zzhfrVar) {
        zzhxs zzhxsVar = (zzhxs) zzhesVar;
        jno jnoVar = zzhzt.a;
        zzhuw M = zzhux.M();
        M.n();
        ((zzhux) M.b).O();
        zzhuz c2 = zzhzt.c(zzhxsVar.a);
        M.n();
        ((zzhux) M.b).P(c2);
        byte[] a = zzhma.a(zzhxsVar.b.a);
        mpo mpoVar = zziei.b;
        mpo B = zziei.B(0, a.length, a);
        M.n();
        ((zzhux) M.b).Q(B);
        byte[] a2 = zzhma.a(zzhxsVar.c.a);
        mpo B2 = zziei.B(0, a2.length, a2);
        M.n();
        ((zzhux) M.b).R(B2);
        byte[] a3 = zzhma.a(zzhxsVar.d.a);
        mpo B3 = zziei.B(0, a3.length, a3);
        M.n();
        ((zzhux) M.b).S(B3);
        byte[] a4 = zzhma.a(zzhxsVar.e.a);
        mpo B4 = zziei.B(0, a4.length, a4);
        M.n();
        ((zzhux) M.b).U(B4);
        byte[] a5 = zzhma.a(zzhxsVar.f.a);
        mpo B5 = zziei.B(0, a5.length, a5);
        M.n();
        ((zzhux) M.b).V(B5);
        byte[] a6 = zzhma.a(zzhxsVar.g.a);
        mpo B6 = zziei.B(0, a6.length, a6);
        M.n();
        ((zzhux) M.b).W(B6);
        zziei e2 = ((zzhux) M.o()).e();
        zzhxu zzhxuVar = zzhxsVar.a;
        return zzhos.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", e2, zzhfl.d, zzhzt.a(zzhxuVar.a.c), zzhxuVar.d);
    }

    @Override // defpackage.uqg
    public Object k(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        obj3.getClass();
        String str = (String) obj3;
        Object obj4 = list.get(2);
        obj4.getClass();
        String str2 = (String) obj4;
        Object obj5 = list.get(3);
        obj5.getClass();
        int intValue2 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        obj6.getClass();
        long g2 = t6a.g(intValue2, ((Integer) obj6).intValue());
        Object obj7 = list.get(5);
        obj7.getClass();
        int intValue3 = ((Integer) obj7).intValue();
        Object obj8 = list.get(6);
        obj8.getClass();
        long g3 = t6a.g(intValue3, ((Integer) obj8).intValue());
        Object obj9 = list.get(7);
        obj9.getClass();
        return new kfj(intValue, str, str2, g2, g3, ((Long) obj9).longValue(), false, 64);
    }

    @Override // com.google.android.gms.internal.ads.zzhoj
    public Object o(zzhes zzhesVar) {
        switch (this.a) {
            case 19:
                zzhhn zzhhnVar = (zzhhn) zzhesVar;
                kno knoVar = zzhhq.a;
                try {
                    zzhkn.a();
                    Cipher a = zzhkn.a();
                    zzicj zzicjVar = zzhhnVar.b;
                    zzhfr zzhfrVar = zzhfr.a;
                    return new zzhkn(zzicjVar.a.b(), zzhhnVar.c.b(), a.getProvider());
                } catch (GeneralSecurityException unused) {
                    zzicj zzicjVar2 = zzhhnVar.b;
                    zzhfr zzhfrVar2 = zzhfr.a;
                    return new zziau(zzicjVar2.a.b(), zzhhnVar.c.b());
                }
            default:
                zzhfr zzhfrVar3 = zzhfr.a;
                zzhos zzhosVar = ((zzhne) zzhesVar).a;
                zzhfl zzhflVar = zzhosVar.d;
                zzhor.a(zzhosVar.e, zzhosVar.f).b();
                return new zzhzl();
        }
    }

    public void q(Context context, nem nemVar, etm etmVar) {
        ConcurrentHashMap concurrentHashMap = rem.a;
        synchronized (rem.class) {
            if (nemVar != null) {
                try {
                    ConcurrentHashMap concurrentHashMap2 = rem.a;
                    rwm rwmVar = (rwm) concurrentHashMap2.get(nemVar.nac());
                    if (rwmVar == null) {
                        rwmVar = new rwm(context, nemVar);
                        concurrentHashMap2.put(nemVar.nac(), rwmVar);
                        nemVar.wh();
                        nemVar.nac();
                    }
                    rwmVar.d(etmVar);
                    nemVar.wh();
                    nemVar.nac();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        lwm lwmVar = sea.q;
        if (lwmVar != null) {
            ((p03) lwmVar).t();
        }
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 8:
                List list = zzfy.a;
                return ((zzahf) zzahe.b.a.a).zzb();
            case 9:
                List list2 = zzfy.a;
                return zzags.b.get().zzp();
            case 16:
                List list3 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzk());
            case 17:
                List list4 = zzfy.a;
                return Boolean.valueOf(zzaif.b.get().zzd());
            case 18:
                return -1;
            default:
                return new zzjj();
        }
    }

    public /* synthetic */ v9f(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public /* synthetic */ void onUserEarnedReward(RewardItem rewardItem) {
    }

    @Override // defpackage.x9f
    public void a(int i2, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 11:
                ((zza) obj).onAdClicked();
                break;
            case 12:
                ((zzr) obj).zzdy();
                break;
            case 13:
                ((zzdlb) obj).zzh();
                break;
            default:
                break;
        }
    }
}
