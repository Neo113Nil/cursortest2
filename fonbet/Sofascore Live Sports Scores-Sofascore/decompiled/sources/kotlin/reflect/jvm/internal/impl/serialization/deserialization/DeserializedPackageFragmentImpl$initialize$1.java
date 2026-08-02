package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.k13;
import defpackage.xka;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializedPackageFragmentImpl$initialize$1 extends xka implements Function0<Collection<? extends Name>> {
    final /* synthetic */ DeserializedPackageFragmentImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl$initialize$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        super(0);
        this.this$0 = deserializedPackageFragmentImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Collection<Name> invoke() {
        Collection<ClassId> allClassIds = this.this$0.getClassDataFinder().getAllClassIds();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allClassIds) {
            ClassId classId = (ClassId) obj;
            if (!classId.isNestedClass() && !ClassDeserializer.Companion.getBLACK_LIST().contains(classId)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ClassId) it.next()).getShortClassName());
        }
        return arrayList2;
    }
}
