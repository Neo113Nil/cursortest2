package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.xka;
import defpackage.y9h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializedMemberScope$NoReorderImplementation$functionNames$2 extends xka implements Function0<Set<? extends Name>> {
    final /* synthetic */ DeserializedMemberScope.NoReorderImplementation this$0;
    final /* synthetic */ DeserializedMemberScope this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$NoReorderImplementation$functionNames$2(DeserializedMemberScope.NoReorderImplementation noReorderImplementation, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.this$0 = noReorderImplementation;
        this.this$1 = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Set<Name> invoke() {
        List list;
        DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.this$0;
        list = noReorderImplementation.functionList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DeserializedMemberScope deserializedMemberScope = noReorderImplementation.this$0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope.getC().getNameResolver(), ((ProtoBuf.Function) ((MessageLite) it.next())).getName()));
        }
        return y9h.f(linkedHashSet, this.this$1.getNonDeclaredFunctionNames());
    }
}
