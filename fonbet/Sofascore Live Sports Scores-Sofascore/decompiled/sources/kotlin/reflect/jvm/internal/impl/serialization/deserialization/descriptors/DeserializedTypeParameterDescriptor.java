package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.k13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    @NotNull
    private final DeserializedAnnotations annotations;

    @NotNull
    private final DeserializationContext c;

    @NotNull
    private final ProtoBuf.TypeParameter proto;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeserializedTypeParameterDescriptor(@NotNull DeserializationContext deserializationContext, @NotNull ProtoBuf.TypeParameter typeParameter, int i) {
        super(r1, r2, r3, r4, r0.variance(r5), typeParameter.getReified(), i, SourceElement.NO_SOURCE, SupertypeLoopChecker.EMPTY.INSTANCE);
        deserializationContext.getClass();
        typeParameter.getClass();
        StorageManager storageManager = deserializationContext.getStorageManager();
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        Annotations empty = Annotations.Companion.getEMPTY();
        Name name = NameResolverUtilKt.getName(deserializationContext.getNameResolver(), typeParameter.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        ProtoBuf.TypeParameter.Variance variance = typeParameter.getVariance();
        variance.getClass();
        this.c = deserializationContext;
        this.proto = typeParameter;
        this.annotations = new DeserializedAnnotations(deserializationContext.getStorageManager(), new DeserializedTypeParameterDescriptor$annotations$1(this));
    }

    @NotNull
    public final ProtoBuf.TypeParameter getProto() {
        return this.proto;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* renamed from: reportSupertypeLoopError, reason: merged with bridge method [inline-methods] */
    public Void mo896reportSupertypeLoopError(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    public List<KotlinType> resolveUpperBounds() {
        List<ProtoBuf.Type> upperBounds = ProtoTypeTableUtilKt.upperBounds(this.proto, this.c.getTypeTable());
        if (upperBounds.isEmpty()) {
            return a.c(DescriptorUtilsKt.getBuiltIns(this).getDefaultBound());
        }
        TypeDeserializer typeDeserializer = this.c.getTypeDeserializer();
        ArrayList arrayList = new ArrayList(k13.r(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(typeDeserializer.type((ProtoBuf.Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public DeserializedAnnotations getAnnotations() {
        return this.annotations;
    }
}
