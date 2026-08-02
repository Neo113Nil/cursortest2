package te;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import com.sports.insider.ui.support.SupportChat;
import hg.t0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements g.a, androidx.swiperefreshlayout.widget.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SupportChat f23919b;

    public /* synthetic */ s(SupportChat supportChat, int i5) {
        this.f23918a = i5;
        this.f23919b = supportChat;
    }

    @Override // g.a
    public void a(Object obj) {
        int i5 = this.f23918a;
        SupportChat supportChat = this.f23919b;
        switch (i5) {
            case 0:
                Uri uri = (Uri) obj;
                if (uri == null) {
                    t0 t0Var = rc.x.f22455a;
                    Intrinsics.checkNotNullParameter("No media selected", "msg");
                    rc.x.f22455a.b(new gf.u(null, 500, "No media selected"));
                    break;
                } else {
                    supportChat.I().j(uri);
                    break;
                }
            case 1:
            default:
                ActivityResult result = (ActivityResult) obj;
                Intrinsics.checkNotNullParameter(result, "result");
                supportChat.getClass();
                if (result != null && result.f194a == -1) {
                    l0 I = supportChat.I();
                    Intent intent = result.f195b;
                    I.j(intent != null ? intent.getData() : null);
                    break;
                }
                break;
            case 2:
                Map it = (Map) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!it.containsValue(Boolean.FALSE)) {
                    ka.a aVar = supportChat.f7058r;
                    if (aVar != null) {
                        supportChat.I().g(aVar);
                        break;
                    }
                } else {
                    supportChat.f7058r = null;
                    break;
                }
                break;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.i
    public void p() {
        this.f23919b.I().i(true);
    }
}
