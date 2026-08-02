package kotlin.reflect.jvm.internal.impl.utils;

import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class FunctionsKt$DO_NOTHING$1 extends xka implements Function1<Object, Unit> {
    public static final FunctionsKt$DO_NOTHING$1 INSTANCE = new FunctionsKt$DO_NOTHING$1();

    public FunctionsKt$DO_NOTHING$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m900invoke(obj);
        return Unit.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m900invoke(@Nullable Object obj) {
    }
}
