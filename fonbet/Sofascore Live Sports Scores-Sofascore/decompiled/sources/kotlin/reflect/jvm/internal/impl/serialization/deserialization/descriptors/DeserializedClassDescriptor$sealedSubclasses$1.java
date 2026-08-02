package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.xka;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializedClassDescriptor$sealedSubclasses$1 extends xka implements Function0<Collection<? extends ClassDescriptor>> {
    final /* synthetic */ DeserializedClassDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$sealedSubclasses$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.this$0 = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Collection<ClassDescriptor> invoke() {
        Collection<ClassDescriptor> computeSubclassesForSealedClass;
        computeSubclassesForSealedClass = this.this$0.computeSubclassesForSealedClass();
        return computeSubclassesForSealedClass;
    }
}
