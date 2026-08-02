package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Tm extends Ci {
    public Tm(@NotNull Context context, @NotNull String str) {
        super(context, str, "array");
    }

    @Override // io.appmetrica.analytics.impl.Ci
    public final Object a(int i5) {
        return this.f12111a.getResources().getStringArray(i5);
    }

    @Nullable
    public final String[] b(int i5) {
        return this.f12111a.getResources().getStringArray(i5);
    }
}
