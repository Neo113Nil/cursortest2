package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface TypeConstructor extends TypeConstructorMarker {
    @NotNull
    KotlinBuiltIns getBuiltIns();

    @Nullable
    /* renamed from: getDeclarationDescriptor */
    ClassifierDescriptor mo893getDeclarationDescriptor();

    @NotNull
    List<TypeParameterDescriptor> getParameters();

    @NotNull
    /* renamed from: getSupertypes */
    Collection<KotlinType> mo894getSupertypes();

    boolean isDenotable();

    @NotNull
    TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner);
}
