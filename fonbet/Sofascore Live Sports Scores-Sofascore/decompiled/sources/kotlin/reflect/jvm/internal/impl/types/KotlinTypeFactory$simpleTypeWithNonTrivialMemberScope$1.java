package kotlin.reflect.jvm.internal.impl.types;

import defpackage.xka;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1 extends xka implements Function1<KotlinTypeRefiner, SimpleType> {
    final /* synthetic */ List<TypeProjection> $arguments;
    final /* synthetic */ TypeAttributes $attributes;
    final /* synthetic */ TypeConstructor $constructor;
    final /* synthetic */ MemberScope $memberScope;
    final /* synthetic */ boolean $nullable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1(TypeConstructor typeConstructor, List<? extends TypeProjection> list, TypeAttributes typeAttributes, boolean z, MemberScope memberScope) {
        super(1);
        this.$constructor = typeConstructor;
        this.$arguments = list;
        this.$attributes = typeAttributes;
        this.$nullable = z;
        this.$memberScope = memberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final SimpleType invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        KotlinTypeFactory.ExpandedTypeOrRefinedConstructor refineConstructor;
        kotlinTypeRefiner.getClass();
        refineConstructor = KotlinTypeFactory.INSTANCE.refineConstructor(this.$constructor, kotlinTypeRefiner, this.$arguments);
        if (refineConstructor == null) {
            return null;
        }
        SimpleType expandedType = refineConstructor.getExpandedType();
        if (expandedType != null) {
            return expandedType;
        }
        TypeAttributes typeAttributes = this.$attributes;
        TypeConstructor refinedConstructor = refineConstructor.getRefinedConstructor();
        refinedConstructor.getClass();
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes, refinedConstructor, this.$arguments, this.$nullable, this.$memberScope);
    }
}
