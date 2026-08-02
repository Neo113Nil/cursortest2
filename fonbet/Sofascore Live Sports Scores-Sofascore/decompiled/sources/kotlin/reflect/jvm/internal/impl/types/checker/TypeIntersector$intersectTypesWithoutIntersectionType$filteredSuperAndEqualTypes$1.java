package kotlin.reflect.jvm.internal.impl.types.checker;

import defpackage.duf;
import defpackage.nt8;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public /* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1 extends nt8 implements Function2<KotlinType, KotlinType, Boolean> {
    public TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(Object obj) {
        super(2, obj);
    }

    @Override // defpackage.nh2, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "equalTypes";
    }

    @Override // defpackage.nh2
    @NotNull
    public final KDeclarationContainer getOwner() {
        return duf.a.getOrCreateKotlinClass(NewKotlinTypeCheckerImpl.class);
    }

    @Override // defpackage.nh2
    @NotNull
    public final String getSignature() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Boolean invoke(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        kotlinType.getClass();
        kotlinType2.getClass();
        return Boolean.valueOf(((NewKotlinTypeCheckerImpl) this.receiver).equalTypes(kotlinType, kotlinType2));
    }
}
