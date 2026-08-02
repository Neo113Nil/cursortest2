package kotlin.reflect.jvm.internal;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.cp4;
import defpackage.dzf;
import defpackage.i3c;
import defpackage.k13;
import defpackage.nef;
import defpackage.nt8;
import defpackage.o13;
import defpackage.ogj;
import defpackage.sha;
import defpackage.tub;
import defpackage.zzl;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0018*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010\"\u001a\u0004\u0018\u00010!*\u0006\u0012\u0002\b\u00030 2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001d\u0010%\u001a\u0004\u0018\u00010!*\u00020$2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&\u001a\u0017\u0010(\u001a\u0004\u0018\u00010'*\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b(\u0010)\u001a\u001b\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010**\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b+\u0010,\u001a\u001b\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010-*\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b.\u0010/\u001a\u0019\u00102\u001a\u0004\u0018\u00010!2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103\u001a=\u00108\u001a\u0004\u0018\u000107*\u0006\u0012\u0002\b\u00030\u00012\u0006\u00104\u001a\u00020\f2\u001a\u00106\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000105\"\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b8\u00109\u001a!\u0010;\u001a\u0004\u0018\u00010:*\u0006\u0012\u0002\b\u00030\u00012\u0006\u00104\u001a\u00020\fH\u0000¢\u0006\u0004\b;\u0010<\u001ai\u0010L\u001a\u00028\u0001\"\b\b\u0000\u0010>*\u00020=\"\b\b\u0001\u0010@*\u00020?2\n\u0010A\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010B\u001a\u00028\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G2\u0018\u0010K\u001a\u0014\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010IH\u0000¢\u0006\u0004\bL\u0010M\u001a'\u0010Q\u001a\u00028\u0000\"\u0004\b\u0000\u0010N2\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000OH\u0080\bø\u0001\u0000¢\u0006\u0004\bQ\u0010R\"\u001a\u0010T\u001a\u00020S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0018\u0010Z\u001a\u00020Y*\u00020X8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\"\u0018\u0010]\u001a\u00020Y*\u00020X8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010[\"\u001a\u0010a\u001a\u0004\u0018\u00010^*\u00020?8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006b"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Ljava/lang/Class;", "toJavaClass", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;)Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "classLoader", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "kotlinClassId", "", "arrayDimensions", "loadClass", "(Ljava/lang/ClassLoader;Lkotlin/reflect/jvm/internal/impl/name/ClassId;I)Ljava/lang/Class;", "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "className", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Class;", "createArrayType", "(Ljava/lang/Class;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "Lkotlin/reflect/KVisibility;", "toKVisibility", "(Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;)Lkotlin/reflect/KVisibility;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;", "", "", "computeAnnotations", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;)Ljava/util/List;", "unwrapRepeatableAnnotations", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;", "toAnnotationInstance", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;)Ljava/lang/annotation/Annotation;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;", "", "toRuntimeValue", "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;", "arrayToRuntimeValue", "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/KFunctionImpl;", "asKFunctionImpl", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "asKPropertyImpl", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "asKCallableImpl", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "Ljava/lang/reflect/Type;", "type", "defaultPrimitiveValue", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;", "name", "", "parameterTypes", "Ljava/lang/reflect/Method;", "getDeclaredMethodOrNull", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Field;", "getDeclaredFieldOrNull", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", PlayerKt.FOOTBALL_MIDFIELDER, "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "D", "moduleAnchor", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", PlayerKt.ICE_HOCKEY_RIGHT_WING, "Lkotlin/Function0;", "block", "reflectionCall", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "JVM_STATIC", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "Lkotlin/reflect/KType;", "", "isInlineClassType", "(Lkotlin/reflect/KType;)Z", "getNeedsMultiFieldValueClassFlattening", "needsMultiFieldValueClassFlattening", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UtilKt {

    @NotNull
    private static final FqName JVM_STATIC = new FqName("kotlin.jvm.JvmStatic");

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Object arrayToRuntimeValue(ArrayValue arrayValue, ClassLoader classLoader) {
        KotlinType type;
        Class loadClass$default;
        TypedArrayValue typedArrayValue = arrayValue instanceof TypedArrayValue ? (TypedArrayValue) arrayValue : null;
        if (typedArrayValue != null && (type = typedArrayValue.getType()) != null) {
            List<? extends ConstantValue<?>> value = arrayValue.getValue();
            ArrayList arrayList = new ArrayList(k13.r(value, 10));
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(toRuntimeValue((ConstantValue) it.next(), classLoader));
            }
            PrimitiveType primitiveArrayElementType = KotlinBuiltIns.getPrimitiveArrayElementType(type);
            int i = 0;
            switch (primitiveArrayElementType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[primitiveArrayElementType.ordinal()]) {
                case -1:
                    if (!KotlinBuiltIns.isArray(type)) {
                        i3c.i(type, "Not an array type: ");
                        break;
                    } else {
                        KotlinType type2 = ((TypeProjection) CollectionsKt.D0(type.getArguments())).getType();
                        type2.getClass();
                        ClassifierDescriptor mo893getDeclarationDescriptor = type2.getConstructor().mo893getDeclarationDescriptor();
                        ClassDescriptor classDescriptor = mo893getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo893getDeclarationDescriptor : null;
                        if (classDescriptor == null) {
                            cp4.g(type2, "Not a class type: ");
                            return null;
                        }
                        if (KotlinBuiltIns.isString(type2)) {
                            int size = arrayValue.getValue().size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                obj.getClass();
                                strArr[i] = obj;
                                i++;
                            }
                            return strArr;
                        }
                        if (KotlinBuiltIns.isKClass(classDescriptor)) {
                            int size2 = arrayValue.getValue().size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj2 = arrayList.get(i);
                                obj2.getClass();
                                clsArr[i] = obj2;
                                i++;
                            }
                            return clsArr;
                        }
                        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
                        if (classId == null || (loadClass$default = loadClass$default(classLoader, classId, 0, 4, null)) == null) {
                            return null;
                        }
                        Object newInstance = Array.newInstance((Class<?>) loadClass$default, arrayValue.getValue().size());
                        newInstance.getClass();
                        Object[] objArr = (Object[]) newInstance;
                        int size3 = arrayList.size();
                        while (i < size3) {
                            objArr[i] = arrayList.get(i);
                            i++;
                        }
                        return objArr;
                    }
                case 0:
                default:
                    zzl.b();
                    return null;
                case 1:
                    int size4 = arrayValue.getValue().size();
                    boolean[] zArr = new boolean[size4];
                    while (i < size4) {
                        Object obj3 = arrayList.get(i);
                        obj3.getClass();
                        zArr[i] = ((Boolean) obj3).booleanValue();
                        i++;
                    }
                    return zArr;
                case 2:
                    int size5 = arrayValue.getValue().size();
                    char[] cArr = new char[size5];
                    while (i < size5) {
                        Object obj4 = arrayList.get(i);
                        obj4.getClass();
                        cArr[i] = ((Character) obj4).charValue();
                        i++;
                    }
                    return cArr;
                case 3:
                    int size6 = arrayValue.getValue().size();
                    byte[] bArr = new byte[size6];
                    while (i < size6) {
                        Object obj5 = arrayList.get(i);
                        obj5.getClass();
                        bArr[i] = ((Byte) obj5).byteValue();
                        i++;
                    }
                    return bArr;
                case 4:
                    int size7 = arrayValue.getValue().size();
                    short[] sArr = new short[size7];
                    while (i < size7) {
                        Object obj6 = arrayList.get(i);
                        obj6.getClass();
                        sArr[i] = ((Short) obj6).shortValue();
                        i++;
                    }
                    return sArr;
                case 5:
                    int size8 = arrayValue.getValue().size();
                    int[] iArr = new int[size8];
                    while (i < size8) {
                        Object obj7 = arrayList.get(i);
                        obj7.getClass();
                        iArr[i] = ((Integer) obj7).intValue();
                        i++;
                    }
                    return iArr;
                case 6:
                    int size9 = arrayValue.getValue().size();
                    float[] fArr = new float[size9];
                    while (i < size9) {
                        Object obj8 = arrayList.get(i);
                        obj8.getClass();
                        fArr[i] = ((Float) obj8).floatValue();
                        i++;
                    }
                    return fArr;
                case 7:
                    int size10 = arrayValue.getValue().size();
                    long[] jArr = new long[size10];
                    while (i < size10) {
                        Object obj9 = arrayList.get(i);
                        obj9.getClass();
                        jArr[i] = ((Long) obj9).longValue();
                        i++;
                    }
                    return jArr;
                case 8:
                    int size11 = arrayValue.getValue().size();
                    double[] dArr = new double[size11];
                    while (i < size11) {
                        Object obj10 = arrayList.get(i);
                        obj10.getClass();
                        dArr[i] = ((Double) obj10).doubleValue();
                        i++;
                    }
                    return dArr;
            }
        }
        return null;
    }

    @Nullable
    public static final KCallableImpl<?> asKCallableImpl(@Nullable Object obj) {
        KCallableImpl<?> kCallableImpl = obj instanceof KCallableImpl ? (KCallableImpl) obj : null;
        if (kCallableImpl != null) {
            return kCallableImpl;
        }
        KFunctionImpl asKFunctionImpl = asKFunctionImpl(obj);
        return asKFunctionImpl != null ? asKFunctionImpl : asKPropertyImpl(obj);
    }

    @Nullable
    public static final KFunctionImpl asKFunctionImpl(@Nullable Object obj) {
        KFunctionImpl kFunctionImpl = obj instanceof KFunctionImpl ? (KFunctionImpl) obj : null;
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        nt8 nt8Var = obj instanceof nt8 ? (nt8) obj : null;
        KCallable compute = nt8Var != null ? nt8Var.compute() : null;
        if (compute instanceof KFunctionImpl) {
            return (KFunctionImpl) compute;
        }
        return null;
    }

    @Nullable
    public static final KPropertyImpl<?> asKPropertyImpl(@Nullable Object obj) {
        KPropertyImpl<?> kPropertyImpl = obj instanceof KPropertyImpl ? (KPropertyImpl) obj : null;
        if (kPropertyImpl != null) {
            return kPropertyImpl;
        }
        nef nefVar = obj instanceof nef ? (nef) obj : null;
        KCallable compute = nefVar != null ? nefVar.compute() : null;
        if (compute instanceof KPropertyImpl) {
            return (KPropertyImpl) compute;
        }
        return null;
    }

    @NotNull
    public static final List<Annotation> computeAnnotations(@NotNull Annotated annotated) {
        Annotation annotationInstance;
        annotated.getClass();
        Annotations annotations = annotated.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            SourceElement source = annotationDescriptor.getSource();
            if (source instanceof ReflectAnnotationSource) {
                annotationInstance = ((ReflectAnnotationSource) source).getAnnotation();
            } else if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
                ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
                ReflectJavaAnnotation reflectJavaAnnotation = javaElement instanceof ReflectJavaAnnotation ? (ReflectJavaAnnotation) javaElement : null;
                annotationInstance = reflectJavaAnnotation != null ? reflectJavaAnnotation.getAnnotation() : null;
            } else {
                annotationInstance = toAnnotationInstance(annotationDescriptor);
            }
            if (annotationInstance != null) {
                arrayList.add(annotationInstance);
            }
        }
        return unwrapRepeatableAnnotations(arrayList);
    }

    @NotNull
    public static final Class<?> createArrayType(@NotNull Class<?> cls) {
        cls.getClass();
        return Array.newInstance(cls, 0).getClass();
    }

    @Nullable
    public static final Object defaultPrimitiveValue(@NotNull Type type) {
        type.getClass();
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            if (type.equals(Boolean.TYPE)) {
                return Boolean.FALSE;
            }
            if (type.equals(Character.TYPE)) {
                return (char) 0;
            }
            if (type.equals(Byte.TYPE)) {
                return (byte) 0;
            }
            if (type.equals(Short.TYPE)) {
                return (short) 0;
            }
            if (type.equals(Integer.TYPE)) {
                return 0;
            }
            if (type.equals(Float.TYPE)) {
                return Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (type.equals(Long.TYPE)) {
                return 0L;
            }
            if (type.equals(Double.TYPE)) {
                return Double.valueOf(0.0d);
            }
            if (type.equals(Void.TYPE)) {
                a70.r("Parameter with void type is illegal");
                return null;
            }
            ogj.i(type, "Unknown primitive: ");
        }
        return null;
    }

    @NotNull
    public static final <M extends MessageLite, D extends CallableDescriptor> D deserializeToDescriptor(@NotNull Class<?> cls, @NotNull M m, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull BinaryVersion binaryVersion, @NotNull Function2<? super MemberDeserializer, ? super M, ? extends D> function2) {
        List<ProtoBuf.TypeParameter> typeParameterList;
        cls.getClass();
        m.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        binaryVersion.getClass();
        function2.getClass();
        RuntimeModuleData orCreateModule = ModuleByClassLoaderKt.getOrCreateModule(cls);
        if (m instanceof ProtoBuf.Function) {
            typeParameterList = ((ProtoBuf.Function) m).getTypeParameterList();
        } else {
            if (!(m instanceof ProtoBuf.Property)) {
                cp4.g(m, "Unsupported message: ");
                return null;
            }
            typeParameterList = ((ProtoBuf.Property) m).getTypeParameterList();
        }
        List<ProtoBuf.TypeParameter> list = typeParameterList;
        DeserializationComponents deserialization = orCreateModule.getDeserialization();
        ModuleDescriptor module = orCreateModule.getModule();
        VersionRequirementTable empty = VersionRequirementTable.Companion.getEMPTY();
        list.getClass();
        return (D) function2.invoke(new MemberDeserializer(new DeserializationContext(deserialization, nameResolver, module, typeTable, empty, binaryVersion, null, null, list)), m);
    }

    @Nullable
    public static final Field getDeclaredFieldOrNull(@NotNull Class<?> cls, @NotNull String str) {
        cls.getClass();
        str.getClass();
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Nullable
    public static final Method getDeclaredMethodOrNull(@NotNull Class<?> cls, @NotNull String str, @NotNull Class<?>... clsArr) {
        cls.getClass();
        str.getClass();
        clsArr.getClass();
        try {
            return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Nullable
    public static final ReceiverParameterDescriptor getInstanceReceiverParameter(@NotNull CallableDescriptor callableDescriptor) {
        callableDescriptor.getClass();
        if (callableDescriptor.getDispatchReceiverParameter() == null) {
            return null;
        }
        DeclarationDescriptor containingDeclaration = callableDescriptor.getContainingDeclaration();
        containingDeclaration.getClass();
        return ((ClassDescriptor) containingDeclaration).getThisAsReceiverParameter();
    }

    @NotNull
    public static final FqName getJVM_STATIC() {
        return JVM_STATIC;
    }

    public static final boolean getNeedsMultiFieldValueClassFlattening(@NotNull KType kType) {
        KotlinType type;
        kType.getClass();
        KTypeImpl kTypeImpl = kType instanceof KTypeImpl ? (KTypeImpl) kType : null;
        return (kTypeImpl == null || (type = kTypeImpl.getType()) == null || !InlineClassesUtilsKt.needsMfvcFlattening(type)) ? false : true;
    }

    public static final boolean isInlineClassType(@NotNull KType kType) {
        KotlinType type;
        kType.getClass();
        KTypeImpl kTypeImpl = kType instanceof KTypeImpl ? (KTypeImpl) kType : null;
        return (kTypeImpl == null || (type = kTypeImpl.getType()) == null || !InlineClassesUtilsKt.isInlineClassType(type)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static final Class<?> loadClass(ClassLoader classLoader, String str, String str2, int i) {
        if (Intrinsics.c(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(U3.j.d);
            }
            sb.append("L");
        }
        if (str.length() > 0) {
            sb.append(str.concat("."));
        }
        sb.append(c.s(str2, '.', '$'));
        if (i > 0) {
            sb.append(";");
        }
        return ReflectJavaClassFinderKt.tryLoadClass(classLoader, sb.toString());
    }

    public static /* synthetic */ Class loadClass$default(ClassLoader classLoader, ClassId classId, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return loadClass(classLoader, classId, i);
    }

    private static final Annotation toAnnotationInstance(AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        Class<?> javaClass = annotationClass != null ? toJavaClass(annotationClass) : null;
        if (javaClass == null) {
            javaClass = null;
        }
        if (javaClass == null) {
            return null;
        }
        Set<Map.Entry<Name, ConstantValue<?>>> entrySet = annotationDescriptor.getAllValueArguments().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Name name = (Name) entry.getKey();
            ConstantValue constantValue = (ConstantValue) entry.getValue();
            ClassLoader classLoader = javaClass.getClassLoader();
            classLoader.getClass();
            Object runtimeValue = toRuntimeValue(constantValue, classLoader);
            Pair pair = runtimeValue != null ? new Pair(name.asString(), runtimeValue) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return (Annotation) AnnotationConstructorCallerKt.createAnnotationInstance$default(javaClass, tub.o(arrayList), null, 4, null);
    }

    @Nullable
    public static final Class<?> toJavaClass(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        SourceElement source = classDescriptor.getSource();
        source.getClass();
        if (source instanceof KotlinJvmBinarySourceElement) {
            KotlinJvmBinaryClass binaryClass = ((KotlinJvmBinarySourceElement) source).getBinaryClass();
            binaryClass.getClass();
            return ((ReflectKotlinClass) binaryClass).getKlass();
        }
        if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
            ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
            javaElement.getClass();
            return ((ReflectJavaClass) javaElement).getElement();
        }
        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
        if (classId == null) {
            return null;
        }
        return loadClass(ReflectClassUtilKt.getSafeClassLoader(classDescriptor.getClass()), classId, 0);
    }

    @Nullable
    public static final KVisibility toKVisibility(@NotNull DescriptorVisibility descriptorVisibility) {
        descriptorVisibility.getClass();
        if (Intrinsics.c(descriptorVisibility, DescriptorVisibilities.PUBLIC)) {
            return KVisibility.PUBLIC;
        }
        if (Intrinsics.c(descriptorVisibility, DescriptorVisibilities.PROTECTED)) {
            return KVisibility.PROTECTED;
        }
        if (Intrinsics.c(descriptorVisibility, DescriptorVisibilities.INTERNAL)) {
            return KVisibility.INTERNAL;
        }
        if (Intrinsics.c(descriptorVisibility, DescriptorVisibilities.PRIVATE) ? true : Intrinsics.c(descriptorVisibility, DescriptorVisibilities.PRIVATE_TO_THIS)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    private static final Object toRuntimeValue(ConstantValue<?> constantValue, ClassLoader classLoader) {
        if (constantValue instanceof AnnotationValue) {
            return toAnnotationInstance(((AnnotationValue) constantValue).getValue());
        }
        if (constantValue instanceof ArrayValue) {
            return arrayToRuntimeValue((ArrayValue) constantValue, classLoader);
        }
        if (constantValue instanceof EnumValue) {
            Pair<? extends ClassId, ? extends Name> value = ((EnumValue) constantValue).getValue();
            ClassId classId = (ClassId) value.a;
            Name name = (Name) value.b;
            Class loadClass$default = loadClass$default(classLoader, classId, 0, 4, null);
            if (loadClass$default != null) {
                return Util.getEnumConstantByName(loadClass$default, name.asString());
            }
            return null;
        }
        if (!(constantValue instanceof KClassValue)) {
            if (constantValue instanceof ErrorValue ? true : constantValue instanceof NullValue) {
                return null;
            }
            return constantValue.getValue();
        }
        KClassValue.Value value2 = ((KClassValue) constantValue).getValue();
        if (value2 instanceof KClassValue.Value.NormalClass) {
            KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value2;
            return loadClass(classLoader, normalClass.getClassId(), normalClass.getArrayDimensions());
        }
        if (!(value2 instanceof KClassValue.Value.LocalClass)) {
            zzl.b();
            return null;
        }
        ClassifierDescriptor mo893getDeclarationDescriptor = ((KClassValue.Value.LocalClass) value2).getType().getConstructor().mo893getDeclarationDescriptor();
        ClassDescriptor classDescriptor = mo893getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo893getDeclarationDescriptor : null;
        if (classDescriptor != null) {
            return toJavaClass(classDescriptor);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List<Annotation> unwrapRepeatableAnnotations(List<? extends Annotation> list) {
        List c;
        if (list != 0 && list.isEmpty()) {
            return list;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (sha.x(sha.v((Annotation) it.next())).getSimpleName().equals("Container")) {
                ArrayList arrayList = new ArrayList();
                for (Annotation annotation : list) {
                    Class x = sha.x(sha.v(annotation));
                    if (!x.getSimpleName().equals("Container") || x.getAnnotation(dzf.class) == null) {
                        c = a.c(annotation);
                    } else {
                        Object invoke = x.getDeclaredMethod(U3.i.X, null).invoke(annotation, null);
                        invoke.getClass();
                        c = Arrays.asList((Annotation[]) invoke);
                        c.getClass();
                    }
                    o13.v(c, arrayList);
                }
                return arrayList;
            }
        }
        return list;
    }

    private static final Class<?> loadClass(ClassLoader classLoader, ClassId classId, int i) {
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        FqNameUnsafe unsafe = classId.asSingleFqName().toUnsafe();
        unsafe.getClass();
        ClassId mapKotlinToJava = javaToKotlinClassMap.mapKotlinToJava(unsafe);
        if (mapKotlinToJava != null) {
            classId = mapKotlinToJava;
        }
        String asString = classId.getPackageFqName().asString();
        asString.getClass();
        String asString2 = classId.getRelativeClassName().asString();
        asString2.getClass();
        return loadClass(classLoader, asString, asString2, i);
    }
}
