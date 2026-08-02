package kotlin.reflect.jvm.internal.impl.types;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class IntersectionTypeConstructor$makeDebugNameForIntersectionType$1 extends xka implements Function1<KotlinType, String> {
    public static final IntersectionTypeConstructor$makeDebugNameForIntersectionType$1 INSTANCE = new IntersectionTypeConstructor$makeDebugNameForIntersectionType$1();

    public IntersectionTypeConstructor$makeDebugNameForIntersectionType$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final String invoke(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.toString();
    }
}
