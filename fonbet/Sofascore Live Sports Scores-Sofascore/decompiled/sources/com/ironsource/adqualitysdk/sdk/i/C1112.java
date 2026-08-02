package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺮ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1112 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List f3498;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int f3499;

    public C1112(C1121 c1121) {
        this.f3499 = c1121.f3516;
        Collections.unmodifiableList(new ArrayList(c1121.f3515));
        Collections.unmodifiableList(new ArrayList(c1121.f3514));
        Collections.unmodifiableMap(new HashMap(c1121.f3513));
        this.f3498 = Collections.unmodifiableList(new ArrayList(c1121.f3512));
        Collections.unmodifiableList(new ArrayList(c1121.f3511));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m659() {
        String sb;
        List<Integer> list = this.f3498;
        if (list.isEmpty()) {
            sb = StringFog.decrypt("TiMDuA==\n", "IExt3aEvKmw=\n");
        } else {
            TreeSet treeSet = new TreeSet();
            for (Integer num : list) {
                if (num != null) {
                    treeSet.add(num);
                }
            }
            if (treeSet.isEmpty()) {
                sb = StringFog.decrypt("1qPYhw==\n", "uMy24qLYeVQ=\n");
            } else {
                StringBuilder sb2 = new StringBuilder();
                Iterator it = treeSet.iterator();
                boolean z = true;
                while (it.hasNext()) {
                    Integer num2 = (Integer) it.next();
                    if (!z) {
                        sb2.append(',');
                    }
                    sb2.append(num2);
                    z = false;
                }
                sb = sb2.toString();
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(StringFog.decrypt("OaH1/Kmw+iB1\n", "T5POj8rfiEU=\n"));
        sb3.append(this.f3499);
        sb3.append(StringFog.decrypt("aQ==\n", "RnWoPJBdxL0=\n"));
        sb3.append(13);
        return AbstractC0424.m255("oHeZYW3OCneh\n", "mwTwBgOvZgQ=\n", sb3, sb);
    }
}
