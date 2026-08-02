package kotlin.reflect.jvm.internal.impl.utils;

import defpackage.ct8;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class FunctionsKt {

    @NotNull
    private static final Function1<Object, Object> IDENTITY = FunctionsKt$IDENTITY$1.INSTANCE;

    @NotNull
    private static final Function1<Object, Boolean> ALWAYS_TRUE = FunctionsKt$ALWAYS_TRUE$1.INSTANCE;

    @NotNull
    private static final Function1<Object, Object> ALWAYS_NULL = FunctionsKt$ALWAYS_NULL$1.INSTANCE;

    @NotNull
    private static final Function1<Object, Unit> DO_NOTHING = FunctionsKt$DO_NOTHING$1.INSTANCE;

    @NotNull
    private static final Function2<Object, Object, Unit> DO_NOTHING_2 = FunctionsKt$DO_NOTHING_2$1.INSTANCE;

    @NotNull
    private static final ct8 DO_NOTHING_3 = FunctionsKt$DO_NOTHING_3$1.INSTANCE;

    @NotNull
    public static final <T> Function1<T, Boolean> alwaysTrue() {
        return (Function1<T, Boolean>) ALWAYS_TRUE;
    }

    @NotNull
    public static final ct8 getDO_NOTHING_3() {
        return DO_NOTHING_3;
    }
}
