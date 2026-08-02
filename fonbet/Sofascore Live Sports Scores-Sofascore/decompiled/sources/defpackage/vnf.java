package defpackage;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vnf {
    public static final vnf b;
    public static final vnf c;
    public static final vnf d;
    public static final vnf e;
    public static final vnf f;
    public static final vnf g;
    public static final vnf h;
    public static final vnf i;
    public static final vnf j;
    public static final vnf k;
    public static final vnf l;
    public static final /* synthetic */ vnf[] m;
    public final String a;

    static {
        vnf vnfVar = new vnf("RDF", 0, "rdf:RDF");
        b = vnfVar;
        vnf vnfVar2 = new vnf(NativeAdContent.ViewTag.AD_TITLE, 1, "title");
        c = vnfVar2;
        vnf vnfVar3 = new vnf(NativeAdContent.ViewTag.AD_DESCRIPTION, 2, "description");
        d = vnfVar3;
        vnf vnfVar4 = new vnf("LINK", 3, "link");
        e = vnfVar4;
        vnf vnfVar5 = new vnf("DC_DATE", 4, "dc:date");
        f = vnfVar5;
        vnf vnfVar6 = new vnf("CHANNEL", 5, "channel");
        g = vnfVar6;
        vnf vnfVar7 = new vnf("CHANNEL_IMAGE", 6, "image");
        h = vnfVar7;
        vnf vnfVar8 = new vnf("CHANNEL_IMAGE_RESOURCE", 7, "rdf:resource");
        vnf vnfVar9 = new vnf("CHANNEL_UPDATE_PERIOD", 8, "sy:updatePeriod");
        i = vnfVar9;
        vnf vnfVar10 = new vnf("ITEM", 9, "item");
        j = vnfVar10;
        vnf vnfVar11 = new vnf("ITEM_DC_CREATOR", 10, "dc:creator");
        k = vnfVar11;
        vnf vnfVar12 = new vnf("ITEM_DC_SUBJECT", 11, "dc:subject");
        l = vnfVar12;
        vnf[] vnfVarArr = {vnfVar, vnfVar2, vnfVar3, vnfVar4, vnfVar5, vnfVar6, vnfVar7, vnfVar8, vnfVar9, vnfVar10, vnfVar11, vnfVar12};
        m = vnfVarArr;
        kp5 kp5Var = new kp5(vnfVarArr);
        int c2 = sub.c(k13.r(kp5Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2 < 16 ? 16 : c2);
        for (Object obj : kp5Var) {
            String lowerCase = ((vnf) obj).a.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            linkedHashMap.put(lowerCase, obj);
        }
    }

    public vnf(String str, int i2, String str2) {
        this.a = str2;
    }

    public static vnf valueOf(String str) {
        return (vnf) Enum.valueOf(vnf.class, str);
    }

    public static vnf[] values() {
        return (vnf[]) m.clone();
    }
}
