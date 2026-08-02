package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.internal.ads.zzamp;
import com.google.android.gms.internal.ads.zzamw;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzcea;
import com.google.android.gms.internal.ads.zzda;
import com.google.android.gms.internal.ads.zzduc;
import com.google.android.gms.internal.ads.zzflp;
import com.google.android.gms.internal.ads.zzgub;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ahn implements zzgub {
    public final /* synthetic */ int a;
    public static final /* synthetic */ ahn b = new ahn(1);
    public static final /* synthetic */ ahn c = new ahn(2);
    public static final /* synthetic */ ahn d = new ahn(3);
    public static final /* synthetic */ ahn e = new ahn(4);
    public static final /* synthetic */ ahn f = new ahn(5);
    public static final /* synthetic */ ahn g = new ahn(6);
    public static final /* synthetic */ ahn h = new ahn(7);
    public static final /* synthetic */ ahn i = new ahn(8);
    public static final /* synthetic */ ahn j = new ahn(9);
    public static final /* synthetic */ ahn k = new ahn(10);
    public static final /* synthetic */ ahn l = new ahn(11);
    public static final /* synthetic */ ahn m = new ahn(12);
    public static final /* synthetic */ ahn n = new ahn(13);
    public static final /* synthetic */ ahn o = new ahn(14);
    public static final /* synthetic */ ahn p = new ahn(15);
    public static final /* synthetic */ ahn q = new ahn(17);
    public static final /* synthetic */ ahn r = new ahn(18);
    public static final /* synthetic */ ahn s = new ahn(19);
    public static final /* synthetic */ ahn t = new ahn(20);
    public static final /* synthetic */ ahn u = new ahn(21);
    public static final /* synthetic */ ahn v = new ahn(22);
    public static final /* synthetic */ ahn w = new ahn(23);
    public static final /* synthetic */ ahn x = new ahn(24);
    public static final /* synthetic */ ahn y = new ahn(25);
    public static final /* synthetic */ ahn z = new ahn(26);
    public static final /* synthetic */ ahn A = new ahn(27);
    public static final /* synthetic */ ahn B = new ahn(28);
    public static final /* synthetic */ ahn C = new ahn(29);

    public /* synthetic */ ahn(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                zzamw zzamwVar = (zzamw) obj;
                int i2 = zzamp.G;
                break;
            case 2:
                Throwable th = (Throwable) obj;
                mon monVar = zzbqg.a;
                if (((Boolean) zzblg.i.c()).booleanValue()) {
                    zzt.zzh().d("prepareClickUrl.attestation1", th);
                    break;
                }
                break;
            case 3:
                List list = zzcea.l;
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                bio bioVar = zzda.a;
                break;
            case 8:
                ArrayList arrayList = new ArrayList();
                for (zzbmg zzbmgVar : (List) obj) {
                    if (zzbmgVar != null) {
                        arrayList.add(zzbmgVar);
                    }
                }
                break;
            case 9:
                ArrayList arrayList2 = new ArrayList();
                for (zzduc zzducVar : (List) obj) {
                    if (zzducVar != null) {
                        arrayList2.add(zzducVar);
                    }
                }
                break;
            case 10:
                break;
            case 11:
                ArrayList arrayList3 = (ArrayList) obj;
                break;
            case 12:
                AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                String str = ((zzflp) obj).b;
                if (TextUtils.isEmpty(str)) {
                    break;
                } else if (!zzl.zzj()) {
                    break;
                }
                break;
            case 19:
                String str2 = ((zzflp) obj).a;
                if (TextUtils.isEmpty(str2)) {
                    break;
                } else if (!zzl.zzj()) {
                    break;
                }
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            default:
                break;
        }
        return null;
    }
}
