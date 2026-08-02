package te;

import androidx.lifecycle.d1;
import androidx.recyclerview.widget.z0;
import com.sports.insider.ui.support.SupportChat;
import eg.m0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SupportChat f23927a;

    public y(SupportChat supportChat) {
        this.f23927a = supportChat;
    }

    @Override // androidx.recyclerview.widget.z0
    public final void onItemRangeInserted(int i5, int i10) {
        if (i5 == 0) {
            SupportChat supportChat = this.f23927a;
            androidx.lifecycle.z g10 = d1.g(supportChat);
            lg.e eVar = m0.f9201a;
            eg.c0.t(g10, jg.q.f18523a, null, new z(supportChat, null, 2), 2);
        }
    }
}
