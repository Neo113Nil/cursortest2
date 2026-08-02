package kotlin.reflect.jvm.internal.impl.types.checker;

import defpackage.xka;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1 extends xka implements Function0<String> {
    final /* synthetic */ Set<SimpleType> $inputTypes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1(Set<? extends SimpleType> set) {
        super(0);
        this.$inputTypes = set;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        return "This collections cannot be empty! input types: ".concat(CollectionsKt.f0(this.$inputTypes, null, null, null, null, 63));
    }
}
