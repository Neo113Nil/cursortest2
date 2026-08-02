package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface ClassDescriptor extends ClassOrPackageFragmentDescriptor, ClassifierDescriptorWithTypeParameters {
    @Nullable
    /* renamed from: getCompanionObjectDescriptor */
    ClassDescriptor mo885getCompanionObjectDescriptor();

    @NotNull
    Collection<ClassConstructorDescriptor> getConstructors();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    DeclarationDescriptor getContainingDeclaration();

    @NotNull
    List<ReceiverParameterDescriptor> getContextReceivers();

    @NotNull
    List<TypeParameterDescriptor> getDeclaredTypeParameters();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    SimpleType getDefaultType();

    @NotNull
    ClassKind getKind();

    @NotNull
    MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution);

    @NotNull
    Modality getModality();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    ClassDescriptor getOriginal();

    @NotNull
    Collection<ClassDescriptor> getSealedSubclasses();

    @NotNull
    MemberScope getStaticScope();

    @NotNull
    ReceiverParameterDescriptor getThisAsReceiverParameter();

    @NotNull
    MemberScope getUnsubstitutedInnerClassesScope();

    @NotNull
    MemberScope getUnsubstitutedMemberScope();

    @Nullable
    /* renamed from: getUnsubstitutedPrimaryConstructor */
    ClassConstructorDescriptor mo886getUnsubstitutedPrimaryConstructor();

    @Nullable
    ValueClassRepresentation<SimpleType> getValueClassRepresentation();

    @NotNull
    DescriptorVisibility getVisibility();

    boolean isCompanionObject();

    boolean isData();

    boolean isFun();

    boolean isInline();

    boolean isValue();
}
