package ru.ozon.android.messenger.framework.data.local;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class p implements ru.ozon.android.messenger.framework.domain.repository.c {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f87622a;

    public p(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f87622a = context.getSharedPreferences("PREFERENCES_FILTER_STATES", 0);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.c
    @NotNull
    public final ru.ozon.android.messenger.utils.j c() {
        Intrinsics.checkNotNullParameter("PREFERENCES_HIDE_READ_KEY", "filterKey");
        return ru.ozon.android.messenger.utils.k.a(this.f87622a);
    }
}
