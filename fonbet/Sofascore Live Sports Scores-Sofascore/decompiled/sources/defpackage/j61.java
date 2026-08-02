package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.mvvm.IUrlSharing;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.IShareContent;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.results.R;
import com.sofascore.results.sharemodal.BaseShareModal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j61 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ BaseShareModal t;
    public final /* synthetic */ RecyclerView u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j61(BaseShareModal baseShareModal, RecyclerView recyclerView, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = baseShareModal;
        this.u = recyclerView;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        RecyclerView recyclerView = this.u;
        BaseShareModal baseShareModal = this.t;
        switch (i) {
            case 0:
                return new j61(baseShareModal, recyclerView, rq3Var, 0);
            default:
                return new j61(baseShareModal, recyclerView, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((j61) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object v;
        String format;
        int i = this.r;
        RecyclerView recyclerView = this.u;
        BaseShareModal baseShareModal = this.t;
        String str = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    Context requireContext = baseShareModal.requireContext();
                    requireContext.getClass();
                    nv.x(requireContext, baseShareModal.getL().a, null, baseShareModal.I(), baseShareModal.G());
                    uic uicVar = uic.k;
                    Context requireContext2 = baseShareModal.requireContext();
                    requireContext2.getClass();
                    this.s = 1;
                    if (uicVar.t(requireContext2, recyclerView, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                Calendar calendar = ke0.a;
                Context requireContext3 = baseShareModal.requireContext();
                requireContext3.getClass();
                ke0.g(requireContext3, baseShareModal.getString(R.string.save_image_confirmation), 0);
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    Context requireContext4 = baseShareModal.requireContext();
                    requireContext4.getClass();
                    String str2 = baseShareModal.getL().a;
                    ich H = baseShareModal.H();
                    IShareContent data = H != null ? H.getData() : null;
                    Event event = data instanceof Event ? (Event) data : null;
                    nv.t0(requireContext4, str2, event != null ? event.getStatusType() : null, baseShareModal.I(), baseShareModal.G());
                    uic uicVar2 = uic.k;
                    Context requireContext5 = baseShareModal.requireContext();
                    requireContext5.getClass();
                    ich H2 = baseShareModal.H();
                    Object data2 = H2 != null ? H2.getData() : null;
                    if (data2 instanceof Event) {
                        Context requireContext6 = baseShareModal.requireContext();
                        requireContext6.getClass();
                        Event event2 = (Event) data2;
                        Team homeTeam$default = Event.getHomeTeam$default(event2, null, 1, null);
                        Team awayTeam$default = Event.getAwayTeam$default(event2, null, 1, null);
                        String p = tba.p(requireContext6, homeTeam$default);
                        String p2 = tba.p(requireContext6, awayTeam$default);
                        Integer display = Event.getHomeScore$default(event2, null, 1, null).getDisplay();
                        Integer display2 = Event.getAwayScore$default(event2, null, 1, null).getDisplay();
                        if (Intrinsics.c(event2.getStatusType(), StatusKt.STATUS_NOT_STARTED)) {
                            format = String.format(Locale.getDefault(), "%s - %s", Arrays.copyOf(new Object[]{p, p2}, 2));
                        } else {
                            format = String.format(Locale.getDefault(), "%s %s-%s %s", Arrays.copyOf(new Object[]{p, (display == null || display.intValue() <= -1) ? "" : String.valueOf(display.intValue()), (display2 == null || display2.intValue() <= -1) ? "" : String.valueOf(display2.intValue()), p2}, 4));
                        }
                        Context requireContext7 = baseShareModal.requireContext();
                        requireContext7.getClass();
                        str = baseShareModal.getString(R.string.share_screen_preview_text, format, Uri.parse(String.format("%s%s%s", Arrays.copyOf(new Object[]{requireContext7.getString(R.string.share_link), ((IUrlSharing) data2).getWebUrl(), ""}, 3))).toString());
                    } else if (data2 instanceof Tournament) {
                        Tournament tournament = (Tournament) data2;
                        String w = tba.w(tournament);
                        Context requireContext8 = baseShareModal.requireContext();
                        requireContext8.getClass();
                        Object uniqueTournament = tournament.getUniqueTournament();
                        if (uniqueTournament != null) {
                            data2 = uniqueTournament;
                        }
                        str = baseShareModal.getString(R.string.share_screen_preview_text, w, Uri.parse(String.format("%s%s%s", Arrays.copyOf(new Object[]{requireContext8.getString(R.string.share_link), ((IUrlSharing) data2).getWebUrl(), ""}, 3))).toString());
                    } else if (data2 instanceof Team) {
                        Context requireContext9 = baseShareModal.requireContext();
                        requireContext9.getClass();
                        String p3 = tba.p(requireContext9, (Team) data2);
                        Context requireContext10 = baseShareModal.requireContext();
                        requireContext10.getClass();
                        str = baseShareModal.getString(R.string.share_screen_preview_text, p3, Uri.parse(String.format("%s%s%s", Arrays.copyOf(new Object[]{requireContext10.getString(R.string.share_link), ((IUrlSharing) data2).getWebUrl(), ""}, 3))).toString());
                    }
                    this.s = 1;
                    v = uicVar2.v(requireContext5, recyclerView, str, this);
                    if (v == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    v = obj;
                }
                baseShareModal.requireContext().startActivity(Intent.createChooser((Intent) v, baseShareModal.getString(R.string.share_string)));
                break;
        }
        return Unit.a;
    }
}
