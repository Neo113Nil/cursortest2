package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import defpackage.k13;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeTable {

    @NotNull
    private final List<ProtoBuf.Type> types;

    public TypeTable(@NotNull ProtoBuf.TypeTable typeTable) {
        typeTable.getClass();
        List<ProtoBuf.Type> typeList = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            List<ProtoBuf.Type> typeList2 = typeTable.getTypeList();
            typeList2.getClass();
            ArrayList arrayList = new ArrayList(k13.r(typeList2, 10));
            int i = 0;
            for (Object obj : typeList2) {
                int i2 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                ProtoBuf.Type type = (ProtoBuf.Type) obj;
                if (i >= firstNullable) {
                    type = type.toBuilder().setNullable(true).build();
                }
                arrayList.add(type);
                i = i2;
            }
            typeList = arrayList;
        }
        typeList.getClass();
        this.types = typeList;
    }

    @NotNull
    public final ProtoBuf.Type get(int i) {
        return this.types.get(i);
    }
}
