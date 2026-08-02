package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import defpackage.xka;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmBuiltInsCustomizer$getFunctions$2 extends xka implements Function1<MemberScope, Collection<? extends SimpleFunctionDescriptor>> {
    final /* synthetic */ Name $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$getFunctions$2(Name name) {
        super(1);
        this.$name = name;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Collection<SimpleFunctionDescriptor> invoke(@NotNull MemberScope memberScope) {
        memberScope.getClass();
        return memberScope.getContributedFunctions(this.$name, NoLookupLocation.FROM_BUILTINS);
    }
}
