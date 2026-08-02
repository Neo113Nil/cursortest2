package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;
import java.util.Set;
import xsna.rr2;

/* compiled from: ReadableConfig.java */
/* loaded from: classes11.dex */
public interface q extends Config {
    @Override // androidx.camera.core.impl.Config
    @NonNull
    default Set<Config.OptionPriority> a(@NonNull Config.a<?> aVar) {
        return getConfig().a(aVar);
    }

    @Override // androidx.camera.core.impl.Config
    default void b(@NonNull rr2 rr2Var) {
        getConfig().b(rr2Var);
    }

    @Override // androidx.camera.core.impl.Config
    default boolean c(@NonNull Config.a<?> aVar) {
        return getConfig().c(aVar);
    }

    @Override // androidx.camera.core.impl.Config
    @Nullable
    default <ValueT> ValueT d(@NonNull Config.a<ValueT> aVar, @NonNull Config.OptionPriority optionPriority) {
        return (ValueT) getConfig().d(aVar, optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    @NonNull
    default Set<Config.a<?>> e() {
        return getConfig().e();
    }

    @Override // androidx.camera.core.impl.Config
    @Nullable
    default <ValueT> ValueT f(@NonNull Config.a<ValueT> aVar) {
        return (ValueT) getConfig().f(aVar);
    }

    @Override // androidx.camera.core.impl.Config
    @Nullable
    default <ValueT> ValueT g(@NonNull Config.a<ValueT> aVar, @Nullable ValueT valuet) {
        return (ValueT) getConfig().g(aVar, valuet);
    }

    @NonNull
    Config getConfig();

    @Override // androidx.camera.core.impl.Config
    @NonNull
    default Config.OptionPriority h(@NonNull Config.a<?> aVar) {
        return getConfig().h(aVar);
    }
}
