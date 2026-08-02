package defpackage;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.sofascore.results.R;
import com.sofascore.results.service.SyncWorker;
import java.util.Calendar;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class trd implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6b b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ rgh d;
    public final /* synthetic */ ComponentActivity e;

    public /* synthetic */ trd(u6b u6bVar, Function2 function2, rgh rghVar, ComponentActivity componentActivity, int i) {
        this.a = i;
        this.b = u6bVar;
        this.c = function2;
        this.d = rghVar;
        this.e = componentActivity;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        ktd ktdVar;
        int i = this.a;
        u6b u6bVar = this.b;
        Function2 function2 = this.c;
        rgh rghVar = this.d;
        ComponentActivity componentActivity = this.e;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (!(j52Var instanceof i42) || !(u6bVar instanceof Fragment)) {
                    if (j52Var == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.LoginSuccess");
                        break;
                    } else {
                        function2.invoke(Boolean.TRUE, Boolean.FALSE);
                        String string = componentActivity.getString(R.string.sync_favourites);
                        string.getClass();
                        rghVar.e(string);
                        ktdVar = new ktd(SyncWorker.class);
                    }
                } else {
                    if (Intrinsics.c(((Fragment) u6bVar).toString(), ((i42) j52Var).a)) {
                        function2.invoke(Boolean.TRUE, Boolean.FALSE);
                        String string2 = componentActivity.getString(R.string.sync_favourites);
                        string2.getClass();
                        rghVar.e(string2);
                        ktdVar = new ktd(SyncWorker.class);
                    }
                    break;
                }
                ktd A = mha.A(ktdVar);
                mha.y(A);
                Context applicationContext = componentActivity.getApplicationContext();
                applicationContext.getClass();
                xbl d = xbl.d(applicationContext);
                d.getClass();
                d.b("SyncWorker-".concat(""), nf6.a, (ltd) A.a());
                break;
            case 1:
                j52 j52Var2 = (j52) obj;
                if (!(j52Var2 instanceof i42) || !(u6bVar instanceof Fragment)) {
                    if (j52Var2 == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.LoginFail");
                        break;
                    }
                } else {
                    if (Intrinsics.c(((Fragment) u6bVar).toString(), ((i42) j52Var2).a)) {
                    }
                    break;
                }
                function2.invoke(Boolean.FALSE, Boolean.TRUE);
                rghVar.a();
                Calendar calendar = ke0.a;
                ke0.g(componentActivity, componentActivity.getString(R.string.login_failed), 0);
                break;
            default:
                j52 j52Var3 = (j52) obj;
                if (!(j52Var3 instanceof i42) || !(u6bVar instanceof Fragment)) {
                    if (j52Var3 == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.LoginFailAccountDeleted");
                        break;
                    }
                } else {
                    if (Intrinsics.c(((Fragment) u6bVar).toString(), ((i42) j52Var3).a)) {
                    }
                    break;
                }
                function2.invoke(Boolean.FALSE, Boolean.TRUE);
                rghVar.a();
                Calendar calendar2 = ke0.a;
                ke0.g(componentActivity, componentActivity.getString(R.string.account_deleted_message), 0);
                break;
        }
        return null;
    }
}
