package kotlin.reflect.jvm.internal;

import com.ironsource.U3;
import defpackage.duf;
import defpackage.fuf;
import defpackage.hka;
import defpackage.kef;
import defpackage.ph0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u00013B/\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ!\u0010)\u001a\u00020*2\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0,\"\u00020*H\u0002¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u001c2\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\b\u00101\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\"H\u0016R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u00064"}, d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "callable", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "index", "", "kind", "Lkotlin/reflect/KParameter$Kind;", "computeDescriptor", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "(Lkotlin/reflect/jvm/internal/KCallableImpl;ILkotlin/reflect/KParameter$Kind;Lkotlin/jvm/functions/Function0;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getCallable", "()Lkotlin/reflect/jvm/internal/KCallableImpl;", "descriptor", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor$delegate", "getIndex", "()I", "isOptional", "", "()Z", "isVararg", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "name", "", "getName", "()Ljava/lang/String;", "type", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "compoundType", "Ljava/lang/reflect/Type;", "types", "", "([Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;", "equals", "other", "", "hashCode", "toString", "CompoundTypeImpl", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KParameterImpl implements KParameter {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;

    /* renamed from: annotations$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReflectProperties.LazySoftVal annotations;

    @NotNull
    private final KCallableImpl<?> callable;

    /* renamed from: descriptor$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReflectProperties.LazySoftVal descriptor;
    private final int index;

    @NotNull
    private final KParameter.Kind kind;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl$CompoundTypeImpl;", "Ljava/lang/reflect/Type;", "types", "", "([Ljava/lang/reflect/Type;)V", "hashCode", "", "getTypes", "()[Ljava/lang/reflect/Type;", "[Ljava/lang/reflect/Type;", "equals", "", "other", "", "getTypeName", "", "toString", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CompoundTypeImpl implements Type {
        private final int hashCode;

        @NotNull
        private final Type[] types;

        public CompoundTypeImpl(@NotNull Type[] typeArr) {
            typeArr.getClass();
            this.types = typeArr;
            this.hashCode = Arrays.hashCode(typeArr);
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof CompoundTypeImpl) && Arrays.equals(this.types, ((CompoundTypeImpl) other).types);
        }

        @Override // java.lang.reflect.Type
        @NotNull
        public String getTypeName() {
            return ph0.K(this.types, ", ", U3.j.d, U3.j.e, null, 56);
        }

        /* renamed from: hashCode, reason: from getter */
        public int getHashCode() {
            return this.hashCode;
        }

        @NotNull
        public String toString() {
            return getTypeName();
        }
    }

    static {
        fuf fufVar = duf.a;
        $$delegatedProperties = new KProperty[]{fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(KParameterImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(KParameterImpl.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public KParameterImpl(@NotNull KCallableImpl<?> kCallableImpl, int i, @NotNull KParameter.Kind kind, @NotNull Function0<? extends ParameterDescriptor> function0) {
        kCallableImpl.getClass();
        kind.getClass();
        function0.getClass();
        this.callable = kCallableImpl;
        this.index = i;
        this.kind = kind;
        this.descriptor = ReflectProperties.lazySoft(function0);
        this.annotations = ReflectProperties.lazySoft(new KParameterImpl$annotations$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Type compoundType(Type... types) {
        int length = types.length;
        if (length != 0) {
            return length != 1 ? new CompoundTypeImpl(types) : (Type) ph0.Q(types);
        }
        throw new hka("Expected at least 1 type for compound type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParameterDescriptor getDescriptor() {
        T value = this.descriptor.getValue(this, $$delegatedProperties[0]);
        value.getClass();
        return (ParameterDescriptor) value;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof KParameterImpl)) {
            return false;
        }
        KParameterImpl kParameterImpl = (KParameterImpl) other;
        return Intrinsics.c(this.callable, kParameterImpl.callable) && getIndex() == kParameterImpl.getIndex();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        T value = this.annotations.getValue(this, $$delegatedProperties[1]);
        value.getClass();
        return (List) value;
    }

    @NotNull
    public final KCallableImpl<?> getCallable() {
        return this.callable;
    }

    @Override // kotlin.reflect.KParameter
    public int getIndex() {
        return this.index;
    }

    @Override // kotlin.reflect.KParameter
    @NotNull
    public KParameter.Kind getKind() {
        return this.kind;
    }

    @Override // kotlin.reflect.KParameter
    @Nullable
    public String getName() {
        ParameterDescriptor descriptor = getDescriptor();
        ValueParameterDescriptor valueParameterDescriptor = descriptor instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) descriptor : null;
        if (valueParameterDescriptor == null || valueParameterDescriptor.getContainingDeclaration().hasSynthesizedParameterNames()) {
            return null;
        }
        Name name = valueParameterDescriptor.getName();
        name.getClass();
        if (name.isSpecial()) {
            return null;
        }
        return name.asString();
    }

    @Override // kotlin.reflect.KParameter
    @NotNull
    public KType getType() {
        KotlinType type = getDescriptor().getType();
        type.getClass();
        return new KTypeImpl(type, new KParameterImpl$type$1(this));
    }

    public int hashCode() {
        return Integer.hashCode(getIndex()) + (this.callable.hashCode() * 31);
    }

    @Override // kotlin.reflect.KParameter
    public boolean isOptional() {
        ParameterDescriptor descriptor = getDescriptor();
        ValueParameterDescriptor valueParameterDescriptor = descriptor instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) descriptor : null;
        if (valueParameterDescriptor != null) {
            return DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor);
        }
        return false;
    }

    @Override // kotlin.reflect.KParameter
    public boolean isVararg() {
        ParameterDescriptor descriptor = getDescriptor();
        return (descriptor instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) descriptor).getVarargElementType() != null;
    }

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderParameter(this);
    }
}
