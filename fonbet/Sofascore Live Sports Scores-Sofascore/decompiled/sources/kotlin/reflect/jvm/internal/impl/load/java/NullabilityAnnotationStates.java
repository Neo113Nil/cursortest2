package kotlin.reflect.jvm.internal.impl.load.java;

import defpackage.lm5;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface NullabilityAnnotationStates<T> {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final NullabilityAnnotationStates EMPTY;

        static {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            EMPTY = new NullabilityAnnotationStatesImpl(lm5Var);
        }

        private Companion() {
        }

        @NotNull
        public final NullabilityAnnotationStates getEMPTY() {
            return EMPTY;
        }
    }

    @Nullable
    T get(@NotNull FqName fqName);
}
