package kotlin.reflect.jvm.internal.impl.utils;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class FunctionsKt$IDENTITY$1 extends xka implements Function1<Object, Object> {
    public static final FunctionsKt$IDENTITY$1 INSTANCE = new FunctionsKt$IDENTITY$1();

    public FunctionsKt$IDENTITY$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Object obj) {
        return obj;
    }
}
