package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventEditor;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.MediaHighlightSummaryResponse;
import com.sofascore.model.network.response.MediaHighlightedItem;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.mma.fighter.details.MmaFighterRankingsModal;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class hx5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventDetailsFragment b;

    public /* synthetic */ hx5(EventDetailsFragment eventDetailsFragment, int i) {
        this.a = i;
        this.b = eventDetailsFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MediaHighlightedItem<?> highlightedItem;
        String name;
        FragmentActivity activity;
        int i = this.a;
        int i2 = 3;
        rq3 rq3Var = null;
        r5 = null;
        Boolean bool = null;
        rq3Var = null;
        EventDetailsFragment eventDetailsFragment = this.b;
        switch (i) {
            case 0:
                return ok3.s(eventDetailsFragment.F());
            case 1:
                MediaHighlightSummaryResponse mediaHighlightSummaryResponse = eventDetailsFragment.D().J;
                if (mediaHighlightSummaryResponse != null && (highlightedItem = mediaHighlightSummaryResponse.getHighlightedItem()) != null) {
                    rq3Var = highlightedItem.getItem();
                }
                return Boolean.valueOf(rq3Var == null && eventDetailsFragment.D().J != null);
            case 2:
                Context requireContext = eventDetailsFragment.requireContext();
                requireContext.getClass();
                return new n4c(requireContext);
            case 3:
                return Boolean.valueOf(ok3.E(eventDetailsFragment.F()));
            case 4:
                Context requireContext2 = eventDetailsFragment.requireContext();
                requireContext2.getClass();
                return new y5f(requireContext2);
            case 5:
                return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL) && !ok3.C(eventDetailsFragment.F()));
            case 6:
                Context requireContext3 = eventDetailsFragment.requireContext();
                requireContext3.getClass();
                return new z5f(requireContext3);
            case 7:
                return Boolean.valueOf((Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getDisabled() || Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getDisabled()) ? false : true);
            case 8:
                mr5 D = eventDetailsFragment.D();
                iz2 z = un0.z(D);
                hs4 hs4Var = z45.a;
                xw3.L(z, hq4.c, null, new kr5(D, null), 2);
                return Unit.a;
            case 9:
                EventEditor eventEditor = eventDetailsFragment.F().getEventEditor();
                if (eventEditor != null && (name = eventEditor.getName()) != null) {
                    bool = Boolean.valueOf((name.length() == 0 ? 1 : 0) ^ 1);
                }
                return Boolean.valueOf(Intrinsics.c(bool, Boolean.TRUE));
            case 10:
                eventDetailsFragment.n();
                return Unit.a;
            case 11:
                krk krkVar = eventDetailsFragment.l;
                krkVar.getClass();
                RecyclerView recyclerView = ((hy4) krkVar).b;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), 0, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
                Context requireContext4 = eventDetailsFragment.requireContext();
                requireContext4.getClass();
                ii5 ii5Var = new ii5(requireContext4);
                ii5Var.setClickable(true);
                ii5Var.setOnClickListener(new cd5(eventDetailsFragment, 5));
                ii5Var.j(eventDetailsFragment.F().getEventEditorName(), eventDetailsFragment.F().getStatus());
                return ii5Var;
            case 12:
                eventDetailsFragment.M().f(rd6.m);
                return Unit.a;
            case 13:
                eventDetailsFragment.M().f(rd6.o);
                return Unit.a;
            case 14:
                dsi M = eventDetailsFragment.M();
                rd6 rd6Var = Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL) ? rd6.j : null;
                if (rd6Var == null) {
                    rd6Var = rd6.m;
                }
                M.f(rd6Var);
                return Unit.a;
            case 15:
                dz5 E = eventDetailsFragment.E();
                xw3.L(un0.z(E), null, null, new oy5(E, rq3Var, r4), 3);
                return Unit.a;
            case 16:
                MmaEvent mmaEvent = (MmaEvent) eventDetailsFragment.F();
                String weightClass = mmaEvent.getWeightClass();
                Gender gender = mmaEvent.getGender();
                if (weightClass != null && gender != null && (activity = eventDetailsFragment.getActivity()) != null) {
                    UniqueTournament uniqueTournament = mmaEvent.getTournament().getUniqueTournament();
                    r4 = uniqueTournament != null ? uniqueTournament.getId() : 0;
                    Context requireContext5 = eventDetailsFragment.requireContext();
                    requireContext5.getClass();
                    String q = tnf.q(requireContext5, weightClass);
                    MmaFighterRankingsModal mmaFighterRankingsModal = new MmaFighterRankingsModal();
                    Bundle bundle = new Bundle();
                    bundle.putInt("UNIQUE_TOURNAMENT_ID", r4);
                    bundle.putString("WEIGHT_CLASS", weightClass);
                    bundle.putSerializable("GENDER", gender);
                    bundle.putString(NativeAdContent.ViewTag.AD_TITLE, q);
                    mmaFighterRankingsModal.setArguments(bundle);
                    AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(mmaFighterRankingsModal, appCompatActivity, rq3Var, i2));
                    }
                }
                return Unit.a;
            case 17:
                eventDetailsFragment.M().f(rd6.n);
                return Unit.a;
            case 18:
                Context requireContext6 = eventDetailsFragment.requireContext();
                requireContext6.getClass();
                return new z06(requireContext6);
            case 19:
                eventDetailsFragment.M().f(rd6.p);
                return Unit.a;
            case 20:
                de deVar = eventDetailsFragment.K0;
                int i3 = ChatActivity.Z;
                Context requireContext7 = eventDetailsFragment.requireContext();
                requireContext7.getClass();
                deVar.a(uic.r(requireContext7, eventDetailsFragment.F().getTournament(), "discuss_button", false, 56), null);
                return Unit.a;
            case 21:
                Context requireContext8 = eventDetailsFragment.requireContext();
                requireContext8.getClass();
                nv.e0(requireContext8, hta.WEEKLY_CHALLENGE, "event_details");
                de deVar2 = eventDetailsFragment.L0;
                int i4 = WeeklyChallengeActivity.O;
                Context requireContext9 = eventDetailsFragment.requireContext();
                requireContext9.getClass();
                deVar2.a(new Intent(requireContext9, (Class<?>) WeeklyChallengeActivity.class), null);
                return Unit.a;
            case 22:
                Integer streamContentId = eventDetailsFragment.F().getStreamContentId();
                if (streamContentId != null) {
                    eventDetailsFragment.E().t(streamContentId.intValue(), eventDetailsFragment.F());
                }
                return Unit.a;
            case 23:
                eventDetailsFragment.M().f(rd6.s);
                return Unit.a;
            case 24:
                return Boolean.valueOf(!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA));
            case 25:
                eventDetailsFragment.M().f(rd6.m);
                return Unit.a;
            case 26:
                eventDetailsFragment.M().f(rd6.r);
                return Unit.a;
            case 27:
                eventDetailsFragment.M().f(rd6.s);
                return Unit.a;
            case 28:
                Context requireContext10 = eventDetailsFragment.requireContext();
                requireContext10.getClass();
                return new k3k(requireContext10);
            default:
                eventDetailsFragment.M().f(rd6.s);
                return Unit.a;
        }
    }
}
