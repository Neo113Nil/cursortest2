package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import defpackage.rm5;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmNameResolver extends JvmNameResolverBase {

    @NotNull
    private final JvmProtoBuf.StringTableTypes types;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JvmNameResolver(@NotNull JvmProtoBuf.StringTableTypes stringTableTypes, @NotNull String[] strArr) {
        super(strArr, r0, JvmNameResolverKt.toExpandedRecordsList(r1));
        stringTableTypes.getClass();
        strArr.getClass();
        List<Integer> localNameList = stringTableTypes.getLocalNameList();
        Set W0 = localNameList.isEmpty() ? rm5.a : CollectionsKt.W0(localNameList);
        List<JvmProtoBuf.StringTableTypes.Record> recordList = stringTableTypes.getRecordList();
        recordList.getClass();
        this.types = stringTableTypes;
    }
}
