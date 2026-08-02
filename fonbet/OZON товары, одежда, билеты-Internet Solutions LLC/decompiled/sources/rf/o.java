package rf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rf.j;

/* loaded from: classes10.dex */
public final class o implements j.a<List<Object>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f83448a;

    o(n nVar) {
        this.f83448a = nVar;
    }

    @Override // rf.j.a
    public final List<Object> a(q reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        ArrayList arrayList = new ArrayList();
        while (reader.l() != null) {
            arrayList.add(this.f83448a.d(reader));
        }
        return arrayList;
    }

    @Override // rf.j.a
    public final void b(r writer, List<Object> list) {
        List<Object> value = list;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<Object> it = value.iterator();
        while (it.hasNext()) {
            this.f83448a.b(writer, it.next());
        }
    }
}
