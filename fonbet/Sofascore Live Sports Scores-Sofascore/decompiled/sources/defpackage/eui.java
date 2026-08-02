package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.dialog.TopStatsCategoryBottomSheet;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.wc26.data.WorldCupLastDanceUiModel;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eui implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boh b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eui(boh bohVar, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = bohVar;
        this.c = obj;
        this.d = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Integer num;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        boh bohVar = this.b;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    ((Function1) obj2).invoke(Integer.valueOf(((fui) obj).a));
                }
                break;
            case 1:
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis2);
                    ((Function1) obj2).invoke(Integer.valueOf(((tvi) obj).b));
                }
                break;
            case 2:
                long currentTimeMillis3 = System.currentTimeMillis();
                if (currentTimeMillis3 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis3);
                    ((Function1) obj2).invoke(((uvi) obj).b);
                }
                break;
            case 3:
                long currentTimeMillis4 = System.currentTimeMillis();
                if (currentTimeMillis4 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis4);
                    Bitmap bitmap = (Bitmap) ((e1d) obj).getValue();
                    if (bitmap != null) {
                        ((Function1) obj2).invoke(bitmap);
                    }
                }
                break;
            case 4:
                long currentTimeMillis5 = System.currentTimeMillis();
                if (currentTimeMillis5 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis5);
                    ((Function1) obj2).invoke(Integer.valueOf(((wyi) obj).a));
                }
                break;
            case 5:
                long currentTimeMillis6 = System.currentTimeMillis();
                if (currentTimeMillis6 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis6);
                    Integer num2 = ((t1j) obj).a.a;
                    if (num2 != null) {
                        ((Function1) obj2).invoke(new d1j(num2.intValue()));
                    }
                }
                break;
            case 6:
                long currentTimeMillis7 = System.currentTimeMillis();
                if (currentTimeMillis7 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis7);
                    ((Function1) obj2).invoke(new e1j(((u1j) obj).a.a));
                }
                break;
            case 7:
                long currentTimeMillis8 = System.currentTimeMillis();
                if (currentTimeMillis8 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis8);
                    ((Function1) obj2).invoke(new v3j(((h4j) obj).c));
                }
                break;
            case 8:
                long currentTimeMillis9 = System.currentTimeMillis();
                if (currentTimeMillis9 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis9);
                    ((TopStatsCategoryBottomSheet) obj2).N().D(new ymj((TopStatsCategory) obj, true));
                }
                break;
            case 9:
                long currentTimeMillis10 = System.currentTimeMillis();
                if (currentTimeMillis10 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis10);
                    int i2 = TeamActivity.Z;
                    jle.r((Context) obj2, ((xrj) obj).a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                break;
            case 10:
                long currentTimeMillis11 = System.currentTimeMillis();
                if (currentTimeMillis11 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis11);
                    wxf wxfVar = EventActivity.h0;
                    wxf.B((Context) obj2, ((wtj) obj).a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                break;
            case 11:
                i3k i3kVar = (i3k) obj;
                Context context = (Context) obj2;
                long currentTimeMillis12 = System.currentTimeMillis();
                if (currentTimeMillis12 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis12);
                    nv.z0(context, kv.CLICK, "banner_channel_" + i3kVar.a, "event_details");
                    bea.G(context, i3kVar.c);
                }
                break;
            case 12:
                long currentTimeMillis13 = System.currentTimeMillis();
                if (currentTimeMillis13 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis13);
                    ((Function1) obj2).invoke(new a2c((l4k) obj));
                }
                break;
            case 13:
                long currentTimeMillis14 = System.currentTimeMillis();
                if (currentTimeMillis14 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis14);
                    ((Function1) obj2).invoke(new jhl(((WorldCupLastDanceUiModel) obj).a));
                }
                break;
            case 14:
                long currentTimeMillis15 = System.currentTimeMillis();
                if (currentTimeMillis15 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis15);
                    ((Function1) obj2).invoke(new ugl(((wn1) obj).a));
                }
                break;
            case 15:
                long currentTimeMillis16 = System.currentTimeMillis();
                if (currentTimeMillis16 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis16);
                    agl aglVar = ((rfl) obj).e;
                    if (aglVar != null && (num = aglVar.a) != null) {
                        ((Function1) obj2).invoke(new rhl(num.intValue()));
                    }
                }
                break;
            case 16:
                long currentTimeMillis17 = System.currentTimeMillis();
                if (currentTimeMillis17 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis17);
                    ((Function1) obj2).invoke(new khl(((cgl) obj).a));
                }
                break;
            case 17:
                long currentTimeMillis18 = System.currentTimeMillis();
                if (currentTimeMillis18 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis18);
                    ((Function1) obj2).invoke(((ydl) obj).e);
                }
                break;
            case 18:
                long currentTimeMillis19 = System.currentTimeMillis();
                if (currentTimeMillis19 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis19);
                    ((Function1) obj2).invoke(new shl(((qil) obj).b));
                }
                break;
            case 19:
                long currentTimeMillis20 = System.currentTimeMillis();
                if (currentTimeMillis20 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis20);
                    ((Function1) obj2).invoke(new ihl(((qel) obj).a.getPlayer().getId()));
                }
                break;
            case 20:
                hjl hjlVar = (hjl) obj;
                long currentTimeMillis21 = System.currentTimeMillis();
                if (currentTimeMillis21 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis21);
                    Function1 function1 = (Function1) obj2;
                    Event event = hjlVar.f;
                    Player player = hjlVar.g;
                    Team team = hjlVar.h;
                    double d = hjlVar.c;
                    Integer num3 = Event.getHomeTeam$default(hjlVar.f, null, 1, null).getId() != hjlVar.h.getId() ? null : 1;
                    function1.invoke(new ehl(event, player, team, d, num3 != null ? num3.intValue() : 2));
                }
                break;
            default:
                long currentTimeMillis22 = System.currentTimeMillis();
                if (currentTimeMillis22 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis22);
                    ((Function1) obj2).invoke(new shl(((mjl) obj).a));
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ eui(boh bohVar, Object obj, Function1 function1, int i) {
        this.a = i;
        this.b = bohVar;
        this.d = obj;
        this.c = function1;
    }
}
