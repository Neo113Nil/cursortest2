package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.fragment.app.FragmentActivity;
import com.blaze.blazesdk.first_time_slide.ui.FirstTimeSlideCustomView;
import com.inmobi.media.G3;
import com.inmobi.media.Mm;
import com.inmobi.media.Nm;
import com.mbridge.msdk.config.dynamic.baseview.cusview.MoreOfferContainerView;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.mvvm.model.EventEditor;
import com.sofascore.model.newNetwork.AttributeOverviewData;
import com.sofascore.results.R;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.fragment.details.LeagueDetailsFragment;
import com.sofascore.results.league.view.cuptree.ExpandButton;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.main.favorites.FavoriteEventsFragment;
import com.sofascore.results.main.matches.redesign.datematches.MainMatchesFragment;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.player.details.view.PlayerCompareView;
import com.sofascore.results.player.details.view.PlayerPentagonSlider;
import com.sofascore.results.profile.ProfileActivity;
import com.sofascore.results.profile.UserProfileActivity;
import com.sofascore.results.tv.fragments.NewChannelsDialog;
import com.sofascore.results.view.graph.AttributeOverviewGraph;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class cd5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cd5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int colorValue;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ed5) obj).t();
                break;
            case 1:
                ji5 ji5Var = (ji5) obj;
                Context context = ji5Var.getContext();
                context.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                ia0 ia0Var = ia0.q;
                me4.d((f5d) me4.e(), "editor_banner_click", firebaseBundle, context).a.e(n9e.K(firebaseBundle), null, "editor_banner_click", false);
                Context context2 = ji5Var.getContext();
                context2.getClass();
                bea.G(context2, "https://play.google.com/store/apps/details?id=com.sofascore.editor");
                break;
            case 2:
                ((ny) obj).invoke();
                break;
            case 3:
                ((ox5) obj).invoke();
                break;
            case 4:
                ((ox5) obj).invoke();
                break;
            case 5:
                EventDetailsFragment eventDetailsFragment = (EventDetailsFragment) obj;
                EventEditor eventEditor = eventDetailsFragment.F().getEventEditor();
                if (eventEditor != null) {
                    Context requireContext = eventDetailsFragment.requireContext();
                    requireContext.getClass();
                    nv.n0(requireContext, ev.EDITOR_EVENT);
                    int i2 = ProfileActivity.Q;
                    Context requireContext2 = eventDetailsFragment.requireContext();
                    requireContext2.getClass();
                    v8a.H(requireContext2, eventEditor.getId(), eventEditor.getName());
                    break;
                }
                break;
            case 6:
                ExpandButton expandButton = (ExpandButton) obj;
                int i3 = ExpandButton.e;
                expandButton.setSelected(!expandButton.isSelected());
                Function1 function1 = expandButton.d;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(expandButton.isSelected()));
                    break;
                }
                break;
            case 7:
                FavoriteEventsFragment favoriteEventsFragment = (FavoriteEventsFragment) obj;
                krk krkVar = favoriteEventsFragment.l;
                krkVar.getClass();
                ((go8) krkVar).c.stopScroll();
                favoriteEventsFragment.G();
                break;
            case 8:
                FeaturedTournamentFragment featuredTournamentFragment = (FeaturedTournamentFragment) obj;
                a99 a99Var = LeagueActivity.h0;
                Context requireContext3 = featuredTournamentFragment.requireContext();
                requireContext3.getClass();
                featuredTournamentFragment.G().i.getClass();
                featuredTournamentFragment.G().i.getClass();
                a99.A(a99Var, requireContext3, 270, null, 71636, y4b.d, null, null, 4048);
                break;
            case 9:
                FirstTimeSlideCustomView firstTimeSlideCustomView = (FirstTimeSlideCustomView) obj;
                int i4 = FirstTimeSlideCustomView.d;
                evl.animateAndVibrate$default(firstTimeSlideCustomView, false, 1.03f, 1.08f, 0L, 9, null);
                Function0 function0 = firstTimeSlideCustomView.b;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 10:
                G3.a((G3) obj, view);
                break;
            case 11:
                ((sr8) obj).invoke();
                break;
            case 12:
                dc9 dc9Var = (dc9) obj;
                dc9Var.d.invoke((rlj) ((eoh) dc9Var.g).getValue());
                break;
            case 13:
                LeagueDetailsFragment leagueDetailsFragment = (LeagueDetailsFragment) obj;
                Context requireContext4 = leagueDetailsFragment.requireContext();
                requireContext4.getClass();
                FirebaseBundle firebaseBundle2 = new FirebaseBundle();
                ia0 ia0Var2 = ia0.q;
                me4.d((f5d) me4.e(), "editor_banner_click", firebaseBundle2, requireContext4).a.e(n9e.K(firebaseBundle2), null, "editor_banner_click", false);
                FragmentActivity requireActivity = leagueDetailsFragment.requireActivity();
                requireActivity.getClass();
                bea.G(requireActivity, "https://play.google.com/store/apps/details?id=com.sofascore.editor");
                break;
            case 14:
                geb gebVar = (geb) obj;
                vg6 vg6Var = gebVar.o;
                if (vg6Var != null) {
                    vg6Var.setVolume(1.0f);
                }
                tgj.G((ImageView) gebVar.d.d, 0L, 3);
                break;
            case 15:
                MainActivity mainActivity = (MainActivity) obj;
                boolean z = MainActivity.n0;
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) UserProfileActivity.class));
                break;
            case 16:
                r4a.M(((MainMatchesFragment) obj).C().O);
                break;
            case 17:
                ((l97) obj).invoke();
                break;
            case 18:
                ((dac) obj).dismiss();
                break;
            case 19:
                Mm.a((Nm) obj, view);
                break;
            case 20:
                ((hx5) obj).invoke();
                break;
            case 21:
                Function0 function02 = ((ksc) obj).e;
                if (function02 != null) {
                    function02.invoke();
                    break;
                }
                break;
            case 22:
                ((MoreOfferContainerView) obj).b(view);
                break;
            case 23:
                ((NewChannelsDialog) obj).k(false, false);
                break;
            case 24:
                ncd ncdVar = (ncd) obj;
                ncdVar.a.a();
                ncdVar.dismiss();
                break;
            case 25:
                ((bld) obj).f.invoke();
                break;
            case 26:
                sae saeVar = (sae) obj;
                EditText editText = saeVar.f;
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    EditText editText2 = saeVar.f;
                    boolean z2 = editText2 != null && (editText2.getTransformationMethod() instanceof PasswordTransformationMethod);
                    EditText editText3 = saeVar.f;
                    if (z2) {
                        editText3.setTransformationMethod(null);
                    } else {
                        editText3.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        saeVar.f.setSelection(selectionEnd);
                    }
                    saeVar.p();
                    break;
                }
                break;
            case 27:
                PlayerActivity playerActivity = (PlayerActivity) obj;
                int i5 = PlayerActivity.Z;
                Object tag = view.getTag();
                Integer num = tag instanceof Integer ? (Integer) tag : null;
                int intValue = (num != null ? num.intValue() : 0) + 1;
                if (intValue == 10) {
                    ((eoh) as9.b).setValue(Boolean.TRUE);
                    as9.l(playerActivity.R(), playerActivity.Y(), null);
                }
                view.setTag(Integer.valueOf(intValue));
                break;
            case 28:
                PlayerCompareView playerCompareView = (PlayerCompareView) obj;
                pme pmeVar = playerCompareView.f;
                if (pmeVar != null) {
                    moe moeVar = (moe) ((ujg) pmeVar).b;
                    moeVar.g = null;
                    z82 z82Var = moeVar.d;
                    AttributeOverviewGraph attributeOverviewGraph = (AttributeOverviewGraph) z82Var.f;
                    AttributeOverviewData attributeOverviewData = moeVar.e;
                    colorValue = moeVar.getColorValue();
                    AttributeOverviewGraph.d(attributeOverviewGraph, attributeOverviewData, colorValue, qm0.a, false, 16);
                    ((gh5) z82Var.d).d.setText(R.string.football_attribute_overview_avg_values);
                    ((SeekBar) ((PlayerPentagonSlider) z82Var.g).d.k).setProgress(3);
                }
                playerCompareView.j();
                break;
            default:
                ((one) obj).o(!r10.s0);
                break;
        }
    }
}
