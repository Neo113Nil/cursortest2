package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;
import xsna.rr2;

/* loaded from: classes11.dex */
public interface Config {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OptionPriority {
        private static final /* synthetic */ OptionPriority[] $VALUES;
        public static final OptionPriority ALWAYS_OVERRIDE;
        public static final OptionPriority OPTIONAL;
        public static final OptionPriority REQUIRED;

        static {
            OptionPriority optionPriority = new OptionPriority("ALWAYS_OVERRIDE", 0);
            ALWAYS_OVERRIDE = optionPriority;
            OptionPriority optionPriority2 = new OptionPriority("REQUIRED", 1);
            REQUIRED = optionPriority2;
            OptionPriority optionPriority3 = new OptionPriority("OPTIONAL", 2);
            OPTIONAL = optionPriority3;
            $VALUES = new OptionPriority[]{optionPriority, optionPriority2, optionPriority3};
        }

        public OptionPriority() {
            throw null;
        }

        public static OptionPriority valueOf(String str) {
            return (OptionPriority) Enum.valueOf(OptionPriority.class, str);
        }

        public static OptionPriority[] values() {
            return (OptionPriority[]) $VALUES.clone();
        }
    }

    public static abstract class a<T> {
        @NonNull
        public static androidx.camera.core.impl.a a(@NonNull Class cls, @NonNull String str) {
            return new androidx.camera.core.impl.a(str, cls, null);
        }

        @NonNull
        public abstract String b();

        @Nullable
        public abstract Object c();

        @NonNull
        public abstract Class<T> d();
    }

    @NonNull
    static o w(@Nullable Config config, @Nullable Config config2) {
        if (config == null && config2 == null) {
            return o.u;
        }
        n A = config2 != null ? n.A(config2) : n.z();
        if (config != null) {
            for (a<?> aVar : config.e()) {
                A.B(aVar, config.h(aVar), config.f(aVar));
            }
        }
        return o.y(A);
    }

    @NonNull
    Set<OptionPriority> a(@NonNull a<?> aVar);

    void b(@NonNull rr2 rr2Var);

    boolean c(@NonNull a<?> aVar);

    @Nullable
    <ValueT> ValueT d(@NonNull a<ValueT> aVar, @NonNull OptionPriority optionPriority);

    @NonNull
    Set<a<?>> e();

    @Nullable
    <ValueT> ValueT f(@NonNull a<ValueT> aVar);

    @Nullable
    <ValueT> ValueT g(@NonNull a<ValueT> aVar, @Nullable ValueT valuet);

    @NonNull
    OptionPriority h(@NonNull a<?> aVar);
}
