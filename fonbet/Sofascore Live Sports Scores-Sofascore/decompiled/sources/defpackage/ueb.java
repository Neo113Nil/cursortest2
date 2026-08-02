package defpackage;

import com.sofascore.results.profile.LoginScreenActivity;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ueb implements b98 {
    public static final ueb b = new ueb(0);
    public static final ueb c = new ueb(1);
    public final /* synthetic */ int a;

    public ueb(LoginScreenActivity loginScreenActivity) {
        this.a = 2;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                return Unit.a;
            default:
                if (((j52) obj) != null) {
                    throw new ClassCastException();
                }
                throw new NullPointerException("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.SyncFail");
        }
    }

    public /* synthetic */ ueb(int i) {
        this.a = i;
    }
}
