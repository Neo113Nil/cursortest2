package kotlin.reflect.jvm.internal.impl.types;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class IntersectionTypeConstructor$makeDebugNameForIntersectionType$3 extends xka implements Function1<KotlinType, CharSequence> {
    final /* synthetic */ Function1<KotlinType, Object> $getProperTypeRelatedToStringify;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IntersectionTypeConstructor$makeDebugNameForIntersectionType$3(Function1<? super KotlinType, ? extends Object> function1) {
        super(1);
        this.$getProperTypeRelatedToStringify = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(KotlinType kotlinType) {
        Function1<KotlinType, Object> function1 = this.$getProperTypeRelatedToStringify;
        kotlinType.getClass();
        return function1.invoke(kotlinType).toString();
    }
}
