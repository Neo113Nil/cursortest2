package com.google.android.material.color.utilities;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class QuantizerCelebi {
    private QuantizerCelebi() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int i5) {
        Set<Integer> keySet = new QuantizerWu().quantize(iArr, i5).colorToCount.keySet();
        int[] iArr2 = new int[keySet.size()];
        Iterator<Integer> it = keySet.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr2[i10] = it.next().intValue();
            i10++;
        }
        return QuantizerWsmeans.quantize(iArr, iArr2, i5);
    }
}
