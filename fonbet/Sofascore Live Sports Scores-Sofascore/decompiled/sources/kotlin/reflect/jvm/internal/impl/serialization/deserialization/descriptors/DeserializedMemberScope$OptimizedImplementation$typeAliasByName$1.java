package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializedMemberScope$OptimizedImplementation$typeAliasByName$1 extends xka implements Function1<Name, TypeAliasDescriptor> {
    final /* synthetic */ DeserializedMemberScope.OptimizedImplementation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$typeAliasByName$1(DeserializedMemberScope.OptimizedImplementation optimizedImplementation) {
        super(1);
        this.this$0 = optimizedImplementation;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final TypeAliasDescriptor invoke(@NotNull Name name) {
        TypeAliasDescriptor createTypeAlias;
        name.getClass();
        createTypeAlias = this.this$0.createTypeAlias(name);
        return createTypeAlias;
    }
}
