package kotlin.reflect.jvm.internal;

import defpackage.xka;
import defpackage.zzl;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.DescriptorsJvmAbiUtil;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "V", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KPropertyImpl$_javaField$1 extends xka implements Function0<Field> {
    final /* synthetic */ KPropertyImpl<V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KPropertyImpl$_javaField$1(KPropertyImpl<? extends V> kPropertyImpl) {
        super(0);
        this.this$0 = kPropertyImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Field invoke() {
        Class enclosingClass;
        JvmPropertySignature mapPropertySignature = RuntimeTypeMapper.INSTANCE.mapPropertySignature(this.this$0.getDescriptor());
        if (!(mapPropertySignature instanceof JvmPropertySignature.KotlinProperty)) {
            if (mapPropertySignature instanceof JvmPropertySignature.JavaField) {
                return ((JvmPropertySignature.JavaField) mapPropertySignature).getField();
            }
            if ((mapPropertySignature instanceof JvmPropertySignature.JavaMethodProperty) || (mapPropertySignature instanceof JvmPropertySignature.MappedKotlinProperty)) {
                return null;
            }
            zzl.b();
            return null;
        }
        JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) mapPropertySignature;
        PropertyDescriptor descriptor = kotlinProperty.getDescriptor();
        JvmMemberSignature.Field jvmFieldSignature$default = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, kotlinProperty.getProto(), kotlinProperty.getNameResolver(), kotlinProperty.getTypeTable(), false, 8, null);
        if (jvmFieldSignature$default == null) {
            return null;
        }
        KCallableImpl kCallableImpl = this.this$0;
        if (DescriptorsJvmAbiUtil.isPropertyWithBackingFieldInOuterClass(descriptor) || JvmProtoBufUtil.isMovedFromInterfaceCompanion(kotlinProperty.getProto())) {
            enclosingClass = kCallableImpl.getContainer().getJClass().getEnclosingClass();
        } else {
            DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
            enclosingClass = containingDeclaration instanceof ClassDescriptor ? UtilKt.toJavaClass((ClassDescriptor) containingDeclaration) : kCallableImpl.getContainer().getJClass();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(jvmFieldSignature$default.getName());
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }
}
