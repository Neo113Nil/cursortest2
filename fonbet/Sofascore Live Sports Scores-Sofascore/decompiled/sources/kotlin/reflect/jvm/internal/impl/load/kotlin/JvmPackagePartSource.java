package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.ironsource.U3;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmPackagePartSource implements DeserializedContainerSource {

    @NotNull
    private final DeserializedContainerAbiStability abiStability;

    @NotNull
    private final JvmClassName className;

    @Nullable
    private final JvmClassName facadeClassName;

    @Nullable
    private final IncompatibleVersionErrorData<JvmMetadataVersion> incompatibility;
    private final boolean isPreReleaseInvisible;

    @Nullable
    private final KotlinJvmBinaryClass knownJvmBinaryClass;

    @NotNull
    private final String moduleName;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JvmPackagePartSource(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass, @NotNull ProtoBuf.Package r12, @NotNull NameResolver nameResolver, @Nullable IncompatibleVersionErrorData<JvmMetadataVersion> incompatibleVersionErrorData, boolean z, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability) {
        this(r2, r1, r12, nameResolver, incompatibleVersionErrorData, z, deserializedContainerAbiStability, kotlinJvmBinaryClass);
        kotlinJvmBinaryClass.getClass();
        r12.getClass();
        nameResolver.getClass();
        deserializedContainerAbiStability.getClass();
        JvmClassName byClassId = JvmClassName.byClassId(kotlinJvmBinaryClass.getClassId());
        byClassId.getClass();
        String multifileClassName = kotlinJvmBinaryClass.getClassHeader().getMultifileClassName();
        JvmClassName jvmClassName = null;
        if (multifileClassName != null && multifileClassName.length() > 0) {
            jvmClassName = JvmClassName.byInternalName(multifileClassName);
        }
    }

    @NotNull
    public final ClassId getClassId() {
        return new ClassId(getClassName().getPackageFqName(), getSimpleName());
    }

    @NotNull
    public JvmClassName getClassName() {
        return this.className;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    public SourceFile getContainingFile() {
        SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
        sourceFile.getClass();
        return sourceFile;
    }

    @Nullable
    public JvmClassName getFacadeClassName() {
        return this.facadeClassName;
    }

    @Nullable
    public final KotlinJvmBinaryClass getKnownJvmBinaryClass() {
        return this.knownJvmBinaryClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    @NotNull
    public String getPresentableString() {
        return "Class '" + getClassId().asSingleFqName().asString() + '\'';
    }

    @NotNull
    public final Name getSimpleName() {
        String internalName = getClassName().getInternalName();
        internalName.getClass();
        Name identifier = Name.identifier(StringsKt.e0('/', internalName, internalName));
        identifier.getClass();
        return identifier;
    }

    @NotNull
    public String toString() {
        return "JvmPackagePartSource: " + getClassName();
    }

    public JvmPackagePartSource(@NotNull JvmClassName jvmClassName, @Nullable JvmClassName jvmClassName2, @NotNull ProtoBuf.Package r3, @NotNull NameResolver nameResolver, @Nullable IncompatibleVersionErrorData<JvmMetadataVersion> incompatibleVersionErrorData, boolean z, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability, @Nullable KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        String string;
        jvmClassName.getClass();
        r3.getClass();
        nameResolver.getClass();
        deserializedContainerAbiStability.getClass();
        this.className = jvmClassName;
        this.facadeClassName = jvmClassName2;
        this.incompatibility = incompatibleVersionErrorData;
        this.isPreReleaseInvisible = z;
        this.abiStability = deserializedContainerAbiStability;
        this.knownJvmBinaryClass = kotlinJvmBinaryClass;
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> generatedExtension = JvmProtoBuf.packageModuleName;
        generatedExtension.getClass();
        Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(r3, generatedExtension);
        this.moduleName = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? U3.i.Z : string;
    }
}
