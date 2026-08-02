package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializedPackageFragmentImpl$classDataFinder$1 extends xka implements Function1<ClassId, SourceElement> {
    final /* synthetic */ DeserializedPackageFragmentImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl$classDataFinder$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        super(1);
        this.this$0 = deserializedPackageFragmentImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final SourceElement invoke(@NotNull ClassId classId) {
        DeserializedContainerSource deserializedContainerSource;
        classId.getClass();
        deserializedContainerSource = this.this$0.containerSource;
        if (deserializedContainerSource != null) {
            return deserializedContainerSource;
        }
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        sourceElement.getClass();
        return sourceElement;
    }
}
