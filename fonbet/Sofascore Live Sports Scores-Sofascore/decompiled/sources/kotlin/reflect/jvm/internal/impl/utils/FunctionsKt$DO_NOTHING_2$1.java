package kotlin.reflect.jvm.internal.impl.utils;

import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class FunctionsKt$DO_NOTHING_2$1 extends xka implements Function2<Object, Object, Unit> {
    public static final FunctionsKt$DO_NOTHING_2$1 INSTANCE = new FunctionsKt$DO_NOTHING_2$1();

    public FunctionsKt$DO_NOTHING_2$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m901invoke(obj, obj2);
        return Unit.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m901invoke(@Nullable Object obj, @Nullable Object obj2) {
    }
}
