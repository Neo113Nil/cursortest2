package da;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8334a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_global_predictionFragment2;
    }

    public final int b() {
        return ((Integer) this.f8334a.get("id")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f8334a.containsKey("id") == iVar.f8334a.containsKey("id") && b() == iVar.b();
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f8334a;
        if (hashMap.containsKey("id")) {
            bundle.putInt("id", ((Integer) hashMap.get("id")).intValue());
            return bundle;
        }
        bundle.putInt("id", 0);
        return bundle;
    }

    public final int hashCode() {
        return ((b() + 31) * 31) + R.id.action_global_predictionFragment2;
    }

    public final String toString() {
        return "ActionGlobalPredictionFragment2(actionId=2131361887){id=" + b() + "}";
    }
}
