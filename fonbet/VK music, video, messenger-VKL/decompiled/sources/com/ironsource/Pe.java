package com.ironsource;

import java.util.List;
import xsna.brm0;
import xsna.drm0;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Pe {
    private final String a;
    private final List<String> b;
    private final boolean c;

    public Pe(String str, List<String> list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean a() {
        if (this.c) {
            List<String> list = this.b;
            if (list != null && !list.isEmpty()) {
                for (String str : list) {
                    String str2 = this.a;
                    if (str2 != null && brm0.B(str2, str, false)) {
                        return true;
                    }
                }
            }
            return false;
        }
        List<String> list2 = this.b;
        if (list2 != null && !list2.isEmpty()) {
            for (String str3 : list2) {
                String str4 = this.a;
                if (str4 != null && drm0.D(str4, str3, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String b() {
        return this.a;
    }

    public /* synthetic */ Pe(String str, List list, boolean z, int i, zcl zclVar) {
        this(str, list, (i & 4) != 0 ? false : z);
    }
}
