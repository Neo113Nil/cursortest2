package kotlin.reflect.jvm.internal.impl.builtins.functions;

import defpackage.gz8;
import defpackage.jp5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class FunctionClassKind {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ FunctionClassKind[] $VALUES;

    @NotNull
    public static final Companion Companion;
    public static final FunctionClassKind Function = new FunctionClassKind("Function", 0);
    public static final FunctionClassKind SuspendFunction = new FunctionClassKind("SuspendFunction", 1);
    public static final FunctionClassKind KFunction = new FunctionClassKind("KFunction", 2);
    public static final FunctionClassKind KSuspendFunction = new FunctionClassKind("KSuspendFunction", 3);
    public static final FunctionClassKind UNKNOWN = new FunctionClassKind("UNKNOWN", 4);

    private static final /* synthetic */ FunctionClassKind[] $values() {
        return new FunctionClassKind[]{Function, SuspendFunction, KFunction, KSuspendFunction, UNKNOWN};
    }

    static {
        FunctionClassKind[] $values = $values();
        $VALUES = $values;
        Companion = new Companion(null);
        $ENTRIES = gz8.G($values);
    }

    private FunctionClassKind(String str, int i) {
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FunctionClassKind getFunctionClassKind(@NotNull FunctionTypeKind functionTypeKind) {
            functionTypeKind.getClass();
            return Intrinsics.c(functionTypeKind, FunctionTypeKind.Function.INSTANCE) ? FunctionClassKind.Function : Intrinsics.c(functionTypeKind, FunctionTypeKind.SuspendFunction.INSTANCE) ? FunctionClassKind.SuspendFunction : Intrinsics.c(functionTypeKind, FunctionTypeKind.KFunction.INSTANCE) ? FunctionClassKind.KFunction : Intrinsics.c(functionTypeKind, FunctionTypeKind.KSuspendFunction.INSTANCE) ? FunctionClassKind.KSuspendFunction : FunctionClassKind.UNKNOWN;
        }

        private Companion() {
        }
    }
}
