package defpackage;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wn4 implements ff2 {
    public static final Set b = ph0.a0(new Integer[]{300, Integer.valueOf(Sdk.SDKError.Reason.MRAID_ERROR_VALUE), 404, 405, 410, Integer.valueOf(TTAdConstant.VIDEO_URL_CODE), 501});

    @Override // defpackage.ff2
    public final Object a(zad zadVar, mad madVar, zad zadVar2, tvd tvdVar, cad cadVar) {
        int i = zadVar2.a;
        if (i != 304 || zadVar == null) {
            if (200 > i || i >= 300) {
                if (!b.contains(new Integer(i))) {
                    return ef2.b;
                }
            }
            return new ef2(zadVar2);
        }
        fad fadVar = zadVar.d;
        fad fadVar2 = zadVar2.d;
        fadVar.getClass();
        Map map = fadVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), CollectionsKt.U0((Collection) entry.getValue()));
        }
        for (Map.Entry entry2 : fadVar2.a.entrySet()) {
            String str = (String) entry2.getKey();
            List list = (List) entry2.getValue();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            linkedHashMap.put(lowerCase, CollectionsKt.U0(list));
        }
        return new ef2(zad.a(zadVar2, new fad(tub.p(linkedHashMap)), 39));
    }

    @Override // defpackage.ff2
    public final df2 b(zad zadVar, mad madVar, tvd tvdVar, aad aadVar) {
        return new df2(zadVar);
    }
}
