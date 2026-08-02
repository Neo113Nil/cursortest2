package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.a70;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl extends AbstractBinaryClassAnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    @NotNull
    private final AnnotationDeserializer annotationDeserializer;

    @NotNull
    private JvmMetadataVersion jvmMetadataVersion;

    @NotNull
    private final ModuleDescriptor module;

    @NotNull
    private final NotFoundClasses notFoundClasses;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public abstract class AbstractAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public AbstractAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(@Nullable Name name, @Nullable Object obj) {
            visitConstantValue(name, BinaryClassAnnotationAndConstantLoaderImpl.this.createConstant(name, obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@Nullable final Name name, @NotNull ClassId classId) {
            classId.getClass();
            final ArrayList arrayList = new ArrayList();
            BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = BinaryClassAnnotationAndConstantLoaderImpl.this;
            SourceElement sourceElement = SourceElement.NO_SOURCE;
            sourceElement.getClass();
            final KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotation = binaryClassAnnotationAndConstantLoaderImpl.loadAnnotation(classId, sourceElement, arrayList);
            loadAnnotation.getClass();
            return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, name, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitAnnotation$1
                private final /* synthetic */ KotlinJvmBinaryClass.AnnotationArgumentVisitor $$delegate_0;
                final /* synthetic */ ArrayList<AnnotationDescriptor> $list;
                final /* synthetic */ Name $name;
                final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor this$0;

                {
                    this.this$0 = this;
                    this.$name = name;
                    this.$list = arrayList;
                    this.$$delegate_0 = KotlinJvmBinaryClass.AnnotationArgumentVisitor.this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visit(@Nullable Name name2, @Nullable Object obj) {
                    this.$$delegate_0.visit(name2, obj);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                @Nullable
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@Nullable Name name2, @NotNull ClassId classId2) {
                    classId2.getClass();
                    return this.$$delegate_0.visitAnnotation(name2, classId2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                @Nullable
                public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(@Nullable Name name2) {
                    return this.$$delegate_0.visitArray(name2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitClassLiteral(@Nullable Name name2, @NotNull ClassLiteralValue classLiteralValue) {
                    classLiteralValue.getClass();
                    this.$$delegate_0.visitClassLiteral(name2, classLiteralValue);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnd() {
                    KotlinJvmBinaryClass.AnnotationArgumentVisitor.this.visitEnd();
                    this.this$0.visitConstantValue(this.$name, new AnnotationValue((AnnotationDescriptor) CollectionsKt.D0(this.$list)));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnum(@Nullable Name name2, @NotNull ClassId classId2, @NotNull Name name3) {
                    classId2.getClass();
                    name3.getClass();
                    this.$$delegate_0.visitEnum(name2, classId2, name3);
                }
            };
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(@Nullable Name name) {
            return new BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1(BinaryClassAnnotationAndConstantLoaderImpl.this, name, this);
        }

        public abstract void visitArrayValue(@Nullable Name name, @NotNull ArrayList<ConstantValue<?>> arrayList);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue) {
            classLiteralValue.getClass();
            visitConstantValue(name, new KClassValue(classLiteralValue));
        }

        public abstract void visitConstantValue(@Nullable Name name, @NotNull ConstantValue<?> constantValue);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2) {
            classId.getClass();
            name2.getClass();
            visitConstantValue(name, new EnumValue(classId, name2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryClassAnnotationAndConstantLoaderImpl(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses, @NotNull StorageManager storageManager, @NotNull KotlinClassFinder kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        moduleDescriptor.getClass();
        notFoundClasses.getClass();
        storageManager.getClass();
        kotlinClassFinder.getClass();
        this.module = moduleDescriptor;
        this.notFoundClasses = notFoundClasses;
        this.annotationDeserializer = new AnnotationDeserializer(moduleDescriptor, notFoundClasses);
        this.jvmMetadataVersion = JvmMetadataVersion.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConstantValue<?> createConstant(Name name, Object obj) {
        ConstantValue<?> createConstantValue = ConstantValueFactory.INSTANCE.createConstantValue(obj, this.module);
        if (createConstantValue != null) {
            return createConstantValue;
        }
        return ErrorValue.Companion.create("Unsupported annotation argument: " + name);
    }

    private final ClassDescriptor resolveClass(ClassId classId) {
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.module, classId, this.notFoundClasses);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @NotNull
    public JvmMetadataVersion getJvmMetadataVersion() {
        return this.jvmMetadataVersion;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @Nullable
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotation(@NotNull final ClassId classId, @NotNull final SourceElement sourceElement, @NotNull final List<AnnotationDescriptor> list) {
        classId.getClass();
        sourceElement.getClass();
        list.getClass();
        final ClassDescriptor resolveClass = resolveClass(classId);
        return new AbstractAnnotationArgumentVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1

            @NotNull
            private final HashMap<Name, ConstantValue<?>> arguments;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.arguments = new HashMap<>();
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public void visitArrayValue(@Nullable Name name, @NotNull ArrayList<ConstantValue<?>> arrayList) {
                arrayList.getClass();
                if (name == null) {
                    return;
                }
                ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(name, resolveClass);
                if (annotationParameterByName != null) {
                    HashMap<Name, ConstantValue<?>> hashMap = this.arguments;
                    ConstantValueFactory constantValueFactory = ConstantValueFactory.INSTANCE;
                    List<? extends ConstantValue<?>> compact = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList);
                    KotlinType type = annotationParameterByName.getType();
                    type.getClass();
                    hashMap.put(name, constantValueFactory.createArrayValue(compact, type));
                    return;
                }
                if (BinaryClassAnnotationAndConstantLoaderImpl.this.isImplicitRepeatableContainer(classId) && Intrinsics.c(name.asString(), U3.i.X)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (obj instanceof AnnotationValue) {
                            arrayList2.add(obj);
                        }
                    }
                    List<AnnotationDescriptor> list2 = list;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        list2.add(((AnnotationValue) it.next()).getValue());
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public void visitConstantValue(@Nullable Name name, @NotNull ConstantValue<?> constantValue) {
                constantValue.getClass();
                if (name != null) {
                    this.arguments.put(name, constantValue);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnd() {
                if (BinaryClassAnnotationAndConstantLoaderImpl.this.isRepeatableWithImplicitContainer(classId, this.arguments) || BinaryClassAnnotationAndConstantLoaderImpl.this.isImplicitRepeatableContainer(classId)) {
                    return;
                }
                list.add(new AnnotationDescriptorImpl(resolveClass.getDefaultType(), this.arguments, sourceElement));
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    @Nullable
    public ConstantValue<?> loadConstant(@NotNull String str, @NotNull Object obj) {
        str.getClass();
        obj.getClass();
        if (StringsKt.J("ZBCS", str, false)) {
            int intValue = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode == 66) {
                if (str.equals("B")) {
                    obj = Byte.valueOf((byte) intValue);
                }
                a70.j(str);
                return null;
            }
            if (hashCode == 67) {
                if (str.equals("C")) {
                    obj = Character.valueOf((char) intValue);
                }
                a70.j(str);
                return null;
            }
            if (hashCode == 83) {
                if (str.equals(PlayerKt.VOLLEYBALL_SETTER)) {
                    obj = Short.valueOf((short) intValue);
                }
                a70.j(str);
                return null;
            }
            if (hashCode == 90 && str.equals("Z")) {
                obj = Boolean.valueOf(intValue != 0);
            }
            a70.j(str);
            return null;
        }
        return ConstantValueFactory.INSTANCE.createConstantValue(obj, this.module);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @NotNull
    public AnnotationDescriptor loadTypeAnnotation(@NotNull ProtoBuf.Annotation annotation, @NotNull NameResolver nameResolver) {
        annotation.getClass();
        nameResolver.getClass();
        return this.annotationDeserializer.deserializeAnnotation(annotation, nameResolver);
    }

    public void setJvmMetadataVersion(@NotNull JvmMetadataVersion jvmMetadataVersion) {
        jvmMetadataVersion.getClass();
        this.jvmMetadataVersion = jvmMetadataVersion;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    @Nullable
    public ConstantValue<?> transformToUnsignedConstant(@NotNull ConstantValue<?> constantValue) {
        constantValue.getClass();
        return constantValue instanceof ByteValue ? new UByteValue(((ByteValue) constantValue).getValue().byteValue()) : constantValue instanceof ShortValue ? new UShortValue(((ShortValue) constantValue).getValue().shortValue()) : constantValue instanceof IntValue ? new UIntValue(((IntValue) constantValue).getValue().intValue()) : constantValue instanceof LongValue ? new ULongValue(((LongValue) constantValue).getValue().longValue()) : constantValue;
    }
}
