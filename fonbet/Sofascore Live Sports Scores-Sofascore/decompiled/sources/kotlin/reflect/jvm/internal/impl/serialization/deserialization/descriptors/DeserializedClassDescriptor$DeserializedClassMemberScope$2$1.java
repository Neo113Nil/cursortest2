package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.xka;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializedClassDescriptor$DeserializedClassMemberScope$2$1 extends xka implements Function0<List<? extends Name>> {
    final /* synthetic */ List<Name> $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$DeserializedClassMemberScope$2$1(List<Name> list) {
        super(0);
        this.$it = list;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<Name> invoke() {
        return this.$it;
    }
}
