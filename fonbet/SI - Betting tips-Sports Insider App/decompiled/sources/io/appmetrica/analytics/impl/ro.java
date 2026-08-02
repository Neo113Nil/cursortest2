package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ro implements so {
    @Override // io.appmetrica.analytics.impl.so
    public final qo a(List<qo> list) {
        LinkedList linkedList = new LinkedList();
        boolean z5 = true;
        for (qo qoVar : list) {
            if (!qoVar.f14527a) {
                linkedList.add(qoVar.f14528b);
                z5 = false;
            }
        }
        return z5 ? new qo(this, true, "") : new qo(this, false, TextUtils.join(", ", linkedList));
    }
}
