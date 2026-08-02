package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.xka;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1 extends xka implements Function1<Name, ClassDescriptor> {
    final /* synthetic */ DeserializedClassDescriptor.EnumEntryClassDescriptors this$0;
    final /* synthetic */ DeserializedClassDescriptor this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1(DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors, DeserializedClassDescriptor deserializedClassDescriptor) {
        super(1);
        this.this$0 = enumEntryClassDescriptors;
        this.this$1 = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final ClassDescriptor invoke(@NotNull Name name) {
        Map map;
        NotNullLazyValue notNullLazyValue;
        name.getClass();
        map = this.this$0.enumEntryProtos;
        ProtoBuf.EnumEntry enumEntry = (ProtoBuf.EnumEntry) map.get(name);
        if (enumEntry == null) {
            return null;
        }
        DeserializedClassDescriptor deserializedClassDescriptor = this.this$1;
        DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.this$0;
        StorageManager storageManager = deserializedClassDescriptor.getC().getStorageManager();
        notNullLazyValue = enumEntryClassDescriptors.enumMemberNames;
        return EnumEntrySyntheticClassDescriptor.create(storageManager, deserializedClassDescriptor, name, notNullLazyValue, new DeserializedAnnotations(deserializedClassDescriptor.getC().getStorageManager(), new DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$1$1(deserializedClassDescriptor, enumEntry)), SourceElement.NO_SOURCE);
    }
}
