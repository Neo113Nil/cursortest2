package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.xka;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1 extends xka implements Function0<Set<? extends Name>> {
    final /* synthetic */ DeserializedClassDescriptor.EnumEntryClassDescriptors this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1(DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors) {
        super(0);
        this.this$0 = enumEntryClassDescriptors;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Set<Name> invoke() {
        Set<Name> computeEnumMemberNames;
        computeEnumMemberNames = this.this$0.computeEnumMemberNames();
        return computeEnumMemberNames;
    }
}
