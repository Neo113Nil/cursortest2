package kotlin.reflect.jvm.internal.impl.types;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class IntersectionTypeConstructor$createType$1 extends xka implements Function1<KotlinTypeRefiner, SimpleType> {
    final /* synthetic */ IntersectionTypeConstructor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntersectionTypeConstructor$createType$1(IntersectionTypeConstructor intersectionTypeConstructor) {
        super(1);
        this.this$0 = intersectionTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final SimpleType invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this.this$0.refine(kotlinTypeRefiner).createType();
    }
}
