package y1;

import androidx.lifecycle.k1;
import androidx.lifecycle.o1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f25632b = new LinkedHashMap();

    @Override // androidx.lifecycle.k1
    public final void d() {
        LinkedHashMap linkedHashMap = this.f25632b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((o1) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        gf.z zVar = gf.a0.f10010b;
        sb2.append(kotlin.text.e0.b(identityHashCode));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f25632b.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
