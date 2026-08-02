package kotlin.reflect.jvm.internal;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.duf;
import defpackage.fuf;
import defpackage.kef;
import defpackage.km5;
import defpackage.n1k;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001)B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00062\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020(H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR$\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012 \r*\b\u0018\u00010\fR\u00020\u00000\fR\u00020\u00000\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\tR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006*"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "kotlin.jvm.PlatformType", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "methodOwner", "getMethodOwner", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "equals", "", "other", "", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", "", "getProperties", "hashCode", "toString", "", "Data", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KPackageImpl extends KDeclarationContainerImpl {

    @NotNull
    private final ReflectProperties.LazyVal<Data> data;

    @NotNull
    private final Class<?> jClass;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\n\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R/\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR%\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "scope$delegate", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Ljava/lang/Class;", "multifileFacade$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "getMultifileFacade", "()Ljava/lang/Class;", "multifileFacade", "Ln1k;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "metadata$delegate", "getMetadata", "()Ln1k;", TtmlNode.TAG_METADATA, "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "members$delegate", "getMembers", "()Ljava/util/Collection;", "members", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Data extends KDeclarationContainerImpl.Data {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;

        /* renamed from: kotlinClass$delegate, reason: from kotlin metadata */
        @NotNull
        private final ReflectProperties.LazySoftVal kotlinClass;

        /* renamed from: members$delegate, reason: from kotlin metadata */
        @NotNull
        private final ReflectProperties.LazySoftVal members;

        /* renamed from: metadata$delegate, reason: from kotlin metadata */
        @NotNull
        private final ReflectProperties.LazyVal metadata;

        /* renamed from: multifileFacade$delegate, reason: from kotlin metadata */
        @NotNull
        private final ReflectProperties.LazyVal multifileFacade;

        /* renamed from: scope$delegate, reason: from kotlin metadata */
        @NotNull
        private final ReflectProperties.LazySoftVal scope;

        static {
            fuf fufVar = duf.a;
            $$delegatedProperties = new KProperty[]{fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(Data.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(Data.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(Data.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(Data.class), TtmlNode.TAG_METADATA, "getMetadata()Lkotlin/Triple;")), fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(Data.class), "members", "getMembers()Ljava/util/Collection;"))};
        }

        public Data() {
            super();
            this.kotlinClass = ReflectProperties.lazySoft(new KPackageImpl$Data$kotlinClass$2(KPackageImpl.this));
            this.scope = ReflectProperties.lazySoft(new KPackageImpl$Data$scope$2(this));
            this.multifileFacade = ReflectProperties.lazy(new KPackageImpl$Data$multifileFacade$2(this, KPackageImpl.this));
            this.metadata = ReflectProperties.lazy(new KPackageImpl$Data$metadata$2(this));
            this.members = ReflectProperties.lazySoft(new KPackageImpl$Data$members$2(KPackageImpl.this, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final ReflectKotlinClass getKotlinClass() {
            return (ReflectKotlinClass) this.kotlinClass.getValue(this, $$delegatedProperties[0]);
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getMembers() {
            T value = this.members.getValue(this, $$delegatedProperties[4]);
            value.getClass();
            return (Collection) value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final n1k getMetadata() {
            return (n1k) this.metadata.getValue(this, $$delegatedProperties[3]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final Class<?> getMultifileFacade() {
            return (Class) this.multifileFacade.getValue(this, $$delegatedProperties[2]);
        }

        @NotNull
        public final MemberScope getScope() {
            T value = this.scope.getValue(this, $$delegatedProperties[1]);
            value.getClass();
            return (MemberScope) value;
        }
    }

    public KPackageImpl(@NotNull Class<?> cls) {
        cls.getClass();
        this.jClass = cls;
        ReflectProperties.LazyVal<Data> lazy = ReflectProperties.lazy(new KPackageImpl$data$1(this));
        lazy.getClass();
        this.data = lazy;
    }

    private final MemberScope getScope() {
        return this.data.invoke().getScope();
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof KPackageImpl) && Intrinsics.c(getJClass(), ((KPackageImpl) other).getJClass());
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<ConstructorDescriptor> getConstructorDescriptors() {
        return km5.a;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<FunctionDescriptor> getFunctions(@NotNull Name name) {
        name.getClass();
        return getScope().getContributedFunctions(name, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl, defpackage.rv2
    @NotNull
    public Class<?> getJClass() {
        return this.jClass;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    public PropertyDescriptor getLocalProperty(int index) {
        n1k metadata = this.data.invoke().getMetadata();
        if (metadata != null) {
            JvmNameResolver jvmNameResolver = (JvmNameResolver) metadata.a;
            ProtoBuf.Package r2 = (ProtoBuf.Package) metadata.b;
            JvmMetadataVersion jvmMetadataVersion = (JvmMetadataVersion) metadata.c;
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> generatedExtension = JvmProtoBuf.packageLocalVariable;
            generatedExtension.getClass();
            ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.getExtensionOrNull(r2, generatedExtension, index);
            if (property != null) {
                Class<?> jClass = getJClass();
                ProtoBuf.TypeTable typeTable = r2.getTypeTable();
                typeTable.getClass();
                return (PropertyDescriptor) UtilKt.deserializeToDescriptor(jClass, property, jvmNameResolver, new TypeTable(typeTable), jvmMetadataVersion, KPackageImpl$getLocalProperty$1$1$1.INSTANCE);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.KDeclarationContainer
    @NotNull
    public Collection<KCallable<?>> getMembers() {
        return this.data.invoke().getMembers();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Class<?> getMethodOwner() {
        Class<?> multifileFacade = this.data.invoke().getMultifileFacade();
        return multifileFacade == null ? getJClass() : multifileFacade;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<PropertyDescriptor> getProperties(@NotNull Name name) {
        name.getClass();
        return getScope().getContributedVariables(name, NoLookupLocation.FROM_REFLECTION);
    }

    public int hashCode() {
        return getJClass().hashCode();
    }

    @NotNull
    public String toString() {
        return "file class " + ReflectClassUtilKt.getClassId(getJClass()).asSingleFqName();
    }
}
