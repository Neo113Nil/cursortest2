package ru.ozon.android.messenger.framework.core;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, Boolean> f87129a;

    public c(@NotNull Map<String, Boolean> features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f87129a = features;
    }

    public final boolean a(@NotNull String featureName) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Boolean bool = this.f87129a.get(featureName);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
