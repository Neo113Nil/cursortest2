package da;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8339a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_global_supportChat;
    }

    public final int b() {
        return ((Integer) this.f8339a.get("errorCode")).intValue();
    }

    public final void c(int i5) {
        this.f8339a.put("errorCode", Integer.valueOf(i5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f8339a.containsKey("errorCode") == nVar.f8339a.containsKey("errorCode") && b() == nVar.b();
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f8339a;
        if (hashMap.containsKey("errorCode")) {
            bundle.putInt("errorCode", ((Integer) hashMap.get("errorCode")).intValue());
            return bundle;
        }
        bundle.putInt("errorCode", -1);
        return bundle;
    }

    public final int hashCode() {
        return ((b() + 31) * 31) + R.id.action_global_supportChat;
    }

    public final String toString() {
        return "ActionGlobalSupportChat(actionId=2131361893){errorCode=" + b() + "}";
    }
}
