package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.duf;
import defpackage.nt8;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$4 extends nt8 implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
    public LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(Object obj) {
        super(1, obj);
    }

    @Override // defpackage.nh2, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic";
    }

    @Override // defpackage.nh2
    @NotNull
    public final KDeclarationContainer getOwner() {
        return duf.a.getOrCreateKotlinClass(LazyJavaClassMemberScope.class);
    }

    @Override // defpackage.nh2
    @NotNull
    public final String getSignature() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name name) {
        Collection<SimpleFunctionDescriptor> searchMethodsInSupertypesWithoutBuiltinMagic;
        name.getClass();
        searchMethodsInSupertypesWithoutBuiltinMagic = ((LazyJavaClassMemberScope) this.receiver).searchMethodsInSupertypesWithoutBuiltinMagic(name);
        return searchMethodsInSupertypesWithoutBuiltinMagic;
    }
}
