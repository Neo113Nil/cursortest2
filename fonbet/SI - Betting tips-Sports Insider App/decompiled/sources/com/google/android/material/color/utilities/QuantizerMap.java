package com.google.android.material.color.utilities;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class QuantizerMap implements Quantizer {
    Map<Integer, Integer> colorToCount;

    public Map<Integer, Integer> getColorToCount() {
        return this.colorToCount;
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i5) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i10));
            int i11 = 1;
            if (num != null) {
                i11 = 1 + num.intValue();
            }
            linkedHashMap.put(Integer.valueOf(i10), Integer.valueOf(i11));
        }
        this.colorToCount = linkedHashMap;
        return new QuantizerResult(linkedHashMap);
    }
}
