package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import defpackage.me4;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmNameResolverKt {
    @NotNull
    public static final List<JvmProtoBuf.StringTableTypes.Record> toExpandedRecordsList(@NotNull List<JvmProtoBuf.StringTableTypes.Record> list) {
        ArrayList k = me4.k(list);
        k.ensureCapacity(list.size());
        for (JvmProtoBuf.StringTableTypes.Record record : list) {
            int range = record.getRange();
            for (int i = 0; i < range; i++) {
                k.add(record);
            }
        }
        k.trimToSize();
        return k;
    }
}
