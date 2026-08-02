package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class W2 extends Ci {
    public W2(@NonNull Context context, @NonNull String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.Ci
    public final Object a(int i5) {
        return Boolean.valueOf(this.f12111a.getResources().getBoolean(i5));
    }

    public final Boolean b(int i5) {
        return Boolean.valueOf(this.f12111a.getResources().getBoolean(i5));
    }
}
