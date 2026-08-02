package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class mo implements Ka {
    @Override // io.appmetrica.analytics.impl.Ka
    public final String a(@NonNull Context context) {
        IdentifiersResult q = new Ve(C0040b4.l().c(context).a(context)).q();
        if (TextUtils.isEmpty(q.f15009id)) {
            return null;
        }
        return q.f15009id;
    }
}
