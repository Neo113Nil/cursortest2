package defpackage;

import android.content.Context;
import android.net.NetworkCapabilities;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzaza;
import com.google.android.gms.internal.ads.zzgei;
import com.google.android.gms.internal.ads.zzgiw;
import com.google.android.gms.internal.ads.zzgka;
import com.google.android.gms.internal.ads.zzgrh;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wdo extends zzgka {
    public final /* synthetic */ int f = 0;
    public final Object g;

    public wdo(zzaya zzayaVar, zzgiw zzgiwVar, Context context, zzgrh zzgrhVar) {
        super("uhXgNuGSyd8UZxNVLle6+R5FVDrGs3ztJxFRccM25tfzP1xuUPcwCU9TKSVvh2k9", "qKJ/azzJVrSI96ukKyGiETTBFTHn9OIRjLO/t8+zHyA=", zzayaVar, zzgiwVar, zzgrhVar.a(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE));
        this.g = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    public final void a(Method method, zzaya zzayaVar) {
        switch (this.f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (Context) this.g);
                objArr.getClass();
                synchronized (zzayaVar) {
                    try {
                        long intValue = ((Integer) objArr[0]).intValue();
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).c0(intValue);
                        long intValue2 = ((Integer) objArr[1]).intValue();
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).L0(intValue2);
                        long intValue3 = ((Integer) objArr[2]).intValue();
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).M0(intValue3);
                        long intValue4 = ((Integer) objArr[3]).intValue();
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).q0(intValue4);
                        Boolean bool = (Boolean) objArr[4];
                        if (bool == null) {
                            zzayaVar.n();
                            ((zzaza) zzayaVar.b).u0(3);
                        } else {
                            int i = true != bool.booleanValue() ? 1 : 2;
                            zzayaVar.n();
                            ((zzaza) zzayaVar.b).u0(i);
                        }
                        Boolean bool2 = (Boolean) objArr[5];
                        if (bool2 == null) {
                            zzayaVar.q(3);
                        } else {
                            zzayaVar.q(true != bool2.booleanValue() ? 1 : 2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                Object[] objArr2 = (Object[]) method.invoke("", ((zzgei) this.g).V());
                objArr2.getClass();
                synchronized (zzayaVar) {
                    String str = (String) objArr2[0];
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).J0(str);
                    String str2 = (String) objArr2[1];
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).p0(str2);
                }
                return;
            default:
                Map map = (Map) this.g;
                Object[] objArr3 = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
                objArr3.getClass();
                synchronized (zzayaVar) {
                    long longValue = ((Long) objArr3[0]).longValue();
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).N0(longValue);
                    long longValue2 = ((Long) objArr3[1]).longValue();
                    if (longValue2 >= 0) {
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).l0(longValue2);
                    }
                    long longValue3 = ((Long) objArr3[2]).longValue();
                    if (longValue3 >= 0) {
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).m0(longValue3);
                    }
                }
                return;
        }
    }

    public wdo(zzaya zzayaVar, zzgiw zzgiwVar, zzgei zzgeiVar, zzgrh zzgrhVar) {
        super("Sg9wh/uRZZt11trI0/ArQR457JKvhvXPZq07aU70olp83YOM+BSyiAIXktC8LJHR", "EzsZPxHde//8PaxXqjETRoZ/+tCf60bKZdwrCpNCQLk=", zzayaVar, zzgiwVar, zzgrhVar.a(Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE));
        this.g = zzgeiVar;
    }

    public wdo(zzaya zzayaVar, zzgiw zzgiwVar, Map map, zzgrh zzgrhVar) {
        super("lgB22o3+xtO6b1PB1kHO8Agbi+6HbLXaRU20SARWIrq6m129Ofvaya/yhX25r56V", "Rqk2tq5zRAYapYluu1wAppyX64RE9M13E2H+pIaATIY=", zzayaVar, zzgiwVar, zzgrhVar.a(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
        this.g = map;
    }
}
