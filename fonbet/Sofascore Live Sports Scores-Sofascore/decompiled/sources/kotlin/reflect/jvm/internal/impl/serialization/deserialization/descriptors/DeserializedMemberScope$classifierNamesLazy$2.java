package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.xka;
import defpackage.y9h;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializedMemberScope$classifierNamesLazy$2 extends xka implements Function0<Set<? extends Name>> {
    final /* synthetic */ DeserializedMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$classifierNamesLazy$2(DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.this$0 = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Set<Name> invoke() {
        DeserializedMemberScope.Implementation implementation;
        Set<Name> nonDeclaredClassifierNames = this.this$0.getNonDeclaredClassifierNames();
        if (nonDeclaredClassifierNames == null) {
            return null;
        }
        Set<Name> classNames$deserialization = this.this$0.getClassNames$deserialization();
        implementation = this.this$0.impl;
        return y9h.f(y9h.f(classNames$deserialization, implementation.getTypeAliasNames()), nonDeclaredClassifierNames);
    }
}
