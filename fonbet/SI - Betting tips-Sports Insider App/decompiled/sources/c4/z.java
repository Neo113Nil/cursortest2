package c4;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements x {
    @Override // c4.x
    public final v a(Context context) {
        androidx.appcompat.widget.a0 a0Var = new androidx.appcompat.widget.a0(context);
        j jVar = (j) a0Var.f685g;
        k kVar = a0.f3566b;
        Unit unit = Unit.f19194a;
        LinkedHashMap linkedHashMap = jVar.f3592a;
        if (unit != null) {
            linkedHashMap.put(kVar, unit);
        } else {
            linkedHashMap.remove(kVar);
        }
        return a0Var.o();
    }
}
