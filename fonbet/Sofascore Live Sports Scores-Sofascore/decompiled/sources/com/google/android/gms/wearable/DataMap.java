package com.google.android.gms.wearable;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class DataMap {
    public final HashMap a = new HashMap();

    public final boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof DataMap)) {
            return false;
        }
        HashMap hashMap = ((DataMap) obj).a;
        HashMap hashMap2 = this.a;
        if (hashMap2.size() != hashMap.size()) {
            return false;
        }
        for (String str : hashMap2.keySet()) {
            Object obj2 = hashMap2.get(str);
            Object obj3 = hashMap.get(str);
            if (obj2 instanceof Asset) {
                if (!(obj3 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) obj2;
                String str2 = asset.b;
                Asset asset2 = (Asset) obj3;
                if (TextUtils.isEmpty(str2)) {
                    equals = Arrays.equals(asset.a, asset2.a);
                } else {
                    str2.getClass();
                    equals = str2.equals(asset2.b);
                }
                if (!equals) {
                    return false;
                }
            } else if (obj2 instanceof String[]) {
                if (!(obj3 instanceof String[]) || !Arrays.equals((String[]) obj2, (String[]) obj3)) {
                    return false;
                }
            } else if (obj2 instanceof long[]) {
                if (!(obj3 instanceof long[]) || !Arrays.equals((long[]) obj2, (long[]) obj3)) {
                    return false;
                }
            } else if (obj2 instanceof float[]) {
                if (!(obj3 instanceof float[]) || !Arrays.equals((float[]) obj2, (float[]) obj3)) {
                    return false;
                }
            } else if (obj2 instanceof byte[]) {
                if (!(obj3 instanceof byte[]) || !Arrays.equals((byte[]) obj2, (byte[]) obj3)) {
                    return false;
                }
            } else if (!Objects.a(obj2, obj3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 29;
    }

    public final String toString() {
        return this.a.toString();
    }
}
