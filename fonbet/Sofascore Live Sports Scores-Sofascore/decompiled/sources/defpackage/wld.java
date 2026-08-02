package defpackage;

import android.content.Context;
import android.util.Base64;
import com.sofascore.model.newNetwork.OddsProvidersResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;
import kotlin.text.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wld {
    public final Context a;
    public final umd b;

    public wld(Context context, umd umdVar) {
        umdVar.getClass();
        this.a = context;
        this.b = umdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, sq3 sq3Var) {
        uld uldVar;
        int i;
        x2g x2gVar;
        Double f;
        if (sq3Var instanceof uld) {
            uldVar = (uld) sq3Var;
            int i2 = uldVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uldVar.t = i2 - Integer.MIN_VALUE;
                Object obj = uldVar.r;
                lu3 lu3Var = lu3.a;
                i = uldVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    uldVar.t = 1;
                    umd umdVar = this.b;
                    umdVar.getClass();
                    obj = yaa.P(new yw(this.a, umdVar, str, rq3Var, 10), uldVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2gVar = (x2g) obj;
                if (!(x2gVar instanceof v2g)) {
                    OddsProvidersResponse oddsProvidersResponse = (OddsProvidersResponse) ((v2g) x2gVar).a;
                    if (oddsProvidersResponse != null) {
                        List<OddsCountryProvider> H0 = CollectionsKt.H0(oddsProvidersResponse.getProviders(), new rs2(new mpa(15), 8));
                        ArrayList arrayList = new ArrayList();
                        for (OddsCountryProvider oddsCountryProvider : H0) {
                            String impressionCostEncrypted = oddsCountryProvider.getImpressionCostEncrypted();
                            if (impressionCostEncrypted == null) {
                                f = null;
                            } else {
                                Charset charset = Charsets.UTF_8;
                                byte[] bytes = "Sofa365!Sofa365!".getBytes(charset);
                                bytes.getClass();
                                byte[] bytes2 = "qC9sJnXgvT3C".getBytes(charset);
                                bytes2.getClass();
                                byte[] decode = Base64.decode(impressionCostEncrypted, 0);
                                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                                cipher.init(2, new SecretKeySpec(bytes, "AES"), new GCMParameterSpec(128, bytes2));
                                byte[] doFinal = cipher.doFinal(decode);
                                doFinal.getClass();
                                f = b.f(new String(doFinal, charset));
                            }
                            oddsCountryProvider.setImpressionCostDecrypted(f != null ? f.doubleValue() : 0.0d);
                            Integer group = oddsCountryProvider.getGroup();
                            if (group != null && !arrayList.contains(group)) {
                                arrayList.add(group);
                                ArrayList arrayList2 = new ArrayList();
                                for (OddsCountryProvider oddsCountryProvider2 : H0) {
                                    Integer group2 = oddsCountryProvider2.getGroup();
                                    if (group2 == null || !group2.equals(group) || oddsCountryProvider2.equals(oddsCountryProvider)) {
                                        oddsCountryProvider2 = null;
                                    }
                                    if (oddsCountryProvider2 != null) {
                                        arrayList2.add(oddsCountryProvider2);
                                    }
                                }
                                oddsCountryProvider.setSubProviders(arrayList2);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : H0) {
                            OddsCountryProvider oddsCountryProvider3 = (OddsCountryProvider) obj2;
                            if (oddsCountryProvider3.getGroup() == null || oddsCountryProvider3.getSubProviders() != null) {
                                arrayList3.add(obj2);
                            }
                        }
                        return OddsProvidersResponse.copy$default(oddsProvidersResponse, arrayList3, null, 2, null);
                    }
                } else {
                    if (!(x2gVar instanceof t2g)) {
                        zzl.b();
                        return null;
                    }
                    Throwable th = ((t2g) x2gVar).a;
                    if ((th instanceof wi9) && ((wi9) th).a == 404) {
                        return new OddsProvidersResponse(km5.a, null);
                    }
                }
                return null;
            }
        }
        uldVar = new uld(this, sq3Var);
        Object obj3 = uldVar.r;
        lu3 lu3Var2 = lu3.a;
        i = uldVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2gVar = (x2g) obj3;
        if (!(x2gVar instanceof v2g)) {
        }
        return null;
    }
}
