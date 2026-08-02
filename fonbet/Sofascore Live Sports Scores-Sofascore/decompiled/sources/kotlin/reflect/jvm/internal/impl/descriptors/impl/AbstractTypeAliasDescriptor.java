package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import defpackage.duf;
import defpackage.fuf;
import defpackage.kef;
import defpackage.km5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class AbstractTypeAliasDescriptor extends DeclarationDescriptorNonRootImpl implements TypeAliasDescriptor {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;

    @NotNull
    private final NotNullLazyValue constructors$delegate;
    private List<? extends TypeParameterDescriptor> declaredTypeParametersImpl;

    @NotNull
    private final StorageManager storageManager;

    @NotNull
    private final AbstractTypeAliasDescriptor$typeConstructor$1 typeConstructor;

    @NotNull
    private final DescriptorVisibility visibilityImpl;

    static {
        fuf fufVar = duf.a;
        $$delegatedProperties = new KProperty[]{fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(AbstractTypeAliasDescriptor.class), "constructors", "getConstructors()Ljava/util/Collection;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1] */
    public AbstractTypeAliasDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull SourceElement sourceElement, @NotNull DescriptorVisibility descriptorVisibility) {
        super(declarationDescriptor, annotations, name, sourceElement);
        storageManager.getClass();
        declarationDescriptor.getClass();
        annotations.getClass();
        name.getClass();
        sourceElement.getClass();
        descriptorVisibility.getClass();
        this.storageManager = storageManager;
        this.visibilityImpl = descriptorVisibility;
        this.constructors$delegate = storageManager.createLazyValue(new AbstractTypeAliasDescriptor$constructors$2(this));
        this.typeConstructor = new TypeConstructor() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            @NotNull
            public KotlinBuiltIns getBuiltIns() {
                return DescriptorUtilsKt.getBuiltIns(mo893getDeclarationDescriptor());
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            @NotNull
            public List<TypeParameterDescriptor> getParameters() {
                return AbstractTypeAliasDescriptor.this.getTypeConstructorTypeParameters();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            @NotNull
            /* renamed from: getSupertypes */
            public Collection<KotlinType> mo894getSupertypes() {
                Collection<KotlinType> mo894getSupertypes = mo893getDeclarationDescriptor().getUnderlyingType().getConstructor().mo894getSupertypes();
                mo894getSupertypes.getClass();
                return mo894getSupertypes;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public boolean isDenotable() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            @NotNull
            public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
                kotlinTypeRefiner.getClass();
                return this;
            }

            @NotNull
            public String toString() {
                return "[typealias " + mo893getDeclarationDescriptor().getName().asString() + ']';
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            @NotNull
            /* renamed from: getDeclarationDescriptor */
            public TypeAliasDescriptor mo893getDeclarationDescriptor() {
                return AbstractTypeAliasDescriptor.this;
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        declarationDescriptorVisitor.getClass();
        return declarationDescriptorVisitor.visitTypeAliasDescriptor(this, d);
    }

    @NotNull
    public final SimpleType computeDefaultType() {
        MemberScope memberScope;
        ClassDescriptor classDescriptor = getClassDescriptor();
        if (classDescriptor == null || (memberScope = classDescriptor.getUnsubstitutedMemberScope()) == null) {
            memberScope = MemberScope.Empty.INSTANCE;
        }
        SimpleType makeUnsubstitutedType = TypeUtils.makeUnsubstitutedType(this, memberScope, new AbstractTypeAliasDescriptor$computeDefaultType$1(this));
        makeUnsubstitutedType.getClass();
        return makeUnsubstitutedType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        List list = this.declaredTypeParametersImpl;
        if (list != null) {
            return list;
        }
        Intrinsics.i("declaredTypeParametersImpl");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        return Modality.FINAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public TypeAliasDescriptor getOriginal() {
        DeclarationDescriptorWithSource original = super.getOriginal();
        original.getClass();
        return (TypeAliasDescriptor) original;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.storageManager;
    }

    @NotNull
    public final Collection<TypeAliasConstructorDescriptor> getTypeAliasConstructors() {
        ClassDescriptor classDescriptor = getClassDescriptor();
        if (classDescriptor == null) {
            return km5.a;
        }
        Collection<ClassConstructorDescriptor> constructors = classDescriptor.getConstructors();
        constructors.getClass();
        ArrayList arrayList = new ArrayList();
        for (ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            TypeAliasConstructorDescriptorImpl.Companion companion = TypeAliasConstructorDescriptorImpl.Companion;
            StorageManager storageManager = this.storageManager;
            classConstructorDescriptor.getClass();
            TypeAliasConstructorDescriptor createIfAvailable = companion.createIfAvailable(storageManager, this, classConstructorDescriptor);
            if (createIfAvailable != null) {
                arrayList.add(createIfAvailable);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @NotNull
    public abstract List<TypeParameterDescriptor> getTypeConstructorTypeParameters();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public DescriptorVisibility getVisibility() {
        return this.visibilityImpl;
    }

    public final void initialize(@NotNull List<? extends TypeParameterDescriptor> list) {
        list.getClass();
        this.declaredTypeParametersImpl = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return TypeUtils.contains(getUnderlyingType(), new AbstractTypeAliasDescriptor$isInner$1(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        return "typealias " + getName().asString();
    }
}
