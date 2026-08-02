package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.xka;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1 extends xka implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
    final /* synthetic */ SimpleFunctionDescriptor $function;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1(SimpleFunctionDescriptor simpleFunctionDescriptor, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(1);
        this.$function = simpleFunctionDescriptor;
        this.this$0 = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name name) {
        Collection searchMethodsByNameWithoutBuiltinMagic;
        Collection searchMethodsInSupertypesWithoutBuiltinMagic;
        name.getClass();
        if (Intrinsics.c(this.$function.getName(), name)) {
            return a.c(this.$function);
        }
        searchMethodsByNameWithoutBuiltinMagic = this.this$0.searchMethodsByNameWithoutBuiltinMagic(name);
        searchMethodsInSupertypesWithoutBuiltinMagic = this.this$0.searchMethodsInSupertypesWithoutBuiltinMagic(name);
        return CollectionsKt.w0(searchMethodsInSupertypesWithoutBuiltinMagic, searchMethodsByNameWithoutBuiltinMagic);
    }
}
