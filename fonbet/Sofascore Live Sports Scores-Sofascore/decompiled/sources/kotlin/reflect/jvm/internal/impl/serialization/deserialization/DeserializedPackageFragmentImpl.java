package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.a70;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {
    private MemberScope _memberScope;

    @Nullable
    private ProtoBuf.PackageFragment _proto;

    @NotNull
    private final ProtoBasedClassDataFinder classDataFinder;

    @Nullable
    private final DeserializedContainerSource containerSource;

    @NotNull
    private final BinaryVersion metadataVersion;

    @NotNull
    private final NameResolverImpl nameResolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(@NotNull FqName fqName, @NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull ProtoBuf.PackageFragment packageFragment, @NotNull BinaryVersion binaryVersion, @Nullable DeserializedContainerSource deserializedContainerSource) {
        super(fqName, storageManager, moduleDescriptor);
        fqName.getClass();
        storageManager.getClass();
        moduleDescriptor.getClass();
        packageFragment.getClass();
        binaryVersion.getClass();
        this.metadataVersion = binaryVersion;
        this.containerSource = deserializedContainerSource;
        ProtoBuf.StringTable strings = packageFragment.getStrings();
        strings.getClass();
        ProtoBuf.QualifiedNameTable qualifiedNames = packageFragment.getQualifiedNames();
        qualifiedNames.getClass();
        NameResolverImpl nameResolverImpl = new NameResolverImpl(strings, qualifiedNames);
        this.nameResolver = nameResolverImpl;
        this.classDataFinder = new ProtoBasedClassDataFinder(packageFragment, nameResolverImpl, binaryVersion, new DeserializedPackageFragmentImpl$classDataFinder$1(this));
        this._proto = packageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    public MemberScope getMemberScope() {
        MemberScope memberScope = this._memberScope;
        if (memberScope != null) {
            return memberScope;
        }
        Intrinsics.i("_memberScope");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public void initialize(@NotNull DeserializationComponents deserializationComponents) {
        deserializationComponents.getClass();
        ProtoBuf.PackageFragment packageFragment = this._proto;
        if (packageFragment == null) {
            a70.r("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this._proto = null;
        ProtoBuf.Package r4 = packageFragment.getPackage();
        r4.getClass();
        this._memberScope = new DeserializedPackageMemberScope(this, r4, this.nameResolver, this.metadataVersion, this.containerSource, deserializationComponents, "scope of " + this, new DeserializedPackageFragmentImpl$initialize$1(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    @NotNull
    public ProtoBasedClassDataFinder getClassDataFinder() {
        return this.classDataFinder;
    }
}
