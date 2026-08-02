package io.appmetrica.analytics.impl;

import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345n2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0365nm fromModel(@NonNull C0320m2 c0320m2) {
        C0315lm c0315lm;
        C0365nm c0365nm = new C0365nm();
        c0365nm.f14373a = new C0340mm[c0320m2.f14223a.size()];
        for (int i5 = 0; i5 < c0320m2.f14223a.size(); i5++) {
            C0340mm c0340mm = new C0340mm();
            Pair pair = (Pair) c0320m2.f14223a.get(i5);
            c0340mm.f14284a = (String) pair.first;
            if (pair.second != null) {
                c0340mm.f14285b = new C0315lm();
                C0295l2 c0295l2 = (C0295l2) pair.second;
                if (c0295l2 == null) {
                    c0315lm = null;
                } else {
                    C0315lm c0315lm2 = new C0315lm();
                    c0315lm2.f14214a = c0295l2.f14162a;
                    c0315lm = c0315lm2;
                }
                c0340mm.f14285b = c0315lm;
            }
            c0365nm.f14373a[i5] = c0340mm;
        }
        return c0365nm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0320m2 toModel(@NonNull C0365nm c0365nm) {
        ArrayList arrayList = new ArrayList();
        for (C0340mm c0340mm : c0365nm.f14373a) {
            String str = c0340mm.f14284a;
            C0315lm c0315lm = c0340mm.f14285b;
            arrayList.add(new Pair(str, c0315lm == null ? null : new C0295l2(c0315lm.f14214a)));
        }
        return new C0320m2(arrayList);
    }
}
