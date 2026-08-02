package kotlin.reflect.jvm.internal.impl.types;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1 extends xka implements Function1 {
    public static final KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1 INSTANCE = new KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1();

    public KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Void invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return null;
    }
}
