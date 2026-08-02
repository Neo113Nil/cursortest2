package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzahv {
    public static final zzhbf a = new zzhbf(new int[]{0, 2, 1}, 3);
    public static final zzhbf b = new zzhbf(new int[]{0, 2, 1, 3, 4}, 5);
    public static final zzhbf c = new zzhbf(new int[]{0, 2, 1, 5, 3, 4}, 6);
    public static final zzhbf d;
    public static final zzhbf e;

    static {
        int[] iArr = new int[7];
        iArr[0] = 0;
        System.arraycopy(new int[]{2, 1, 6, 5, 3, 4}, 0, iArr, 1, 6);
        d = new zzhbf(iArr, 7);
        int[] iArr2 = new int[8];
        iArr2[0] = 0;
        System.arraycopy(new int[]{2, 1, 7, 5, 6, 3, 4}, 0, iArr2, 1, 7);
        e = new zzhbf(iArr2, 8);
    }

    public static zzap a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = zzfm.a;
            String[] split = str.split(U3.j.b, 2);
            if (split.length != 2) {
                zzeh.c("Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzajn.b(new zzeu(Base64.decode(split[1], 0))));
                } catch (RuntimeException e2) {
                    zzeh.d("Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new zzakj(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzap(arrayList);
    }
}
