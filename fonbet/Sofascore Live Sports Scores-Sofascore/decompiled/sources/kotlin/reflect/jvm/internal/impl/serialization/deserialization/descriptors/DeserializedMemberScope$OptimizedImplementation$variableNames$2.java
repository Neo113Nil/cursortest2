package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.xka;
import defpackage.y9h;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializedMemberScope$OptimizedImplementation$variableNames$2 extends xka implements Function0<Set<? extends Name>> {
    final /* synthetic */ DeserializedMemberScope.OptimizedImplementation this$0;
    final /* synthetic */ DeserializedMemberScope this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$variableNames$2(DeserializedMemberScope.OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.this$0 = optimizedImplementation;
        this.this$1 = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Set<Name> invoke() {
        Map map;
        map = this.this$0.propertyProtosBytes;
        return y9h.f(map.keySet(), this.this$1.getNonDeclaredVariableNames());
    }
}
