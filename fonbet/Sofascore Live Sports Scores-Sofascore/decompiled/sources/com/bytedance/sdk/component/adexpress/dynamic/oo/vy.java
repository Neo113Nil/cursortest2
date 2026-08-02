package com.bytedance.sdk.component.adexpress.dynamic.oo;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy {
    public float pcc;
    public float sf;

    public vy(float f, float f2) {
        this.pcc = f;
        this.sf = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            vy vyVar = (vy) obj;
            if (Float.compare(vyVar.pcc, this.pcc) == 0 && Float.compare(vyVar.sf, this.sf) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.pcc), Float.valueOf(this.sf)});
    }
}
