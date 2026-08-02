package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.k13;
import defpackage.sub;
import defpackage.xka;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2 extends xka implements Function0<Map<Name, ? extends TypeAliasDescriptor>> {
    final /* synthetic */ DeserializedMemberScope.NoReorderImplementation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2(DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
        super(0);
        this.this$0 = noReorderImplementation;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Map<Name, TypeAliasDescriptor> invoke() {
        List allTypeAliases;
        allTypeAliases = this.this$0.getAllTypeAliases();
        int c = sub.c(k13.r(allTypeAliases, 10));
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        for (Object obj : allTypeAliases) {
            Name name = ((TypeAliasDescriptor) obj).getName();
            name.getClass();
            linkedHashMap.put(name, obj);
        }
        return linkedHashMap;
    }
}
