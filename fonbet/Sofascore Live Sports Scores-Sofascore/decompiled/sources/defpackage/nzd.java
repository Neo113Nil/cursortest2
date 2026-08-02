package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.R;
import com.sofascore.results.event.statistics.view.football.PESMFootballGoalmapView;
import com.sofascore.results.fantasy.competition.fixtures.FantasyFdrInfoBottomSheetModal;
import com.sofascore.results.player.details.view.PlayerCompareView;
import com.sofascore.results.player.details.view.PlayerPentagonSlider;
import com.sofascore.results.player.statistics.regular.view.PlayerPenaltyShotView;
import com.sofascore.results.profile.editor.ProfileEditorTournamentsModal;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class nzd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ nzd(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Drawable mutate;
        int color;
        Drawable mutate2;
        int i = this.a;
        int i2 = 3;
        rq3 rq3Var = null;
        Context context = this.b;
        switch (i) {
            case 0:
                int i3 = PESMFootballGoalmapView.G;
                int v = ao2.v(16, context);
                Drawable drawable = context.getDrawable(R.drawable.ic_football_glove);
                if (drawable == null || (mutate = drawable.mutate()) == null) {
                    return null;
                }
                mutate.setBounds(0, 0, v, v);
                return mutate;
            case 1:
                int i4 = PlayerCompareView.g;
                return new qme(context);
            case 2:
                color = context.getColor(R.color.primary_default);
                break;
            case 3:
                color = context.getColor(R.color.neutral_default);
                break;
            case 4:
                color = context.getColor(R.color.value);
                break;
            case 5:
                return LayoutInflater.from(context);
            case 6:
                color = ao2.s(160, context);
                break;
            case 7:
                return new oxh(context.getString(R.string.select_a_player), context.getString(R.string.select_a_player), ml4.j, null, null, false, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
            case 8:
                FragmentActivity O = hkg.O(context);
                if (O != null) {
                    FantasyFdrInfoBottomSheetModal fantasyFdrInfoBottomSheetModal = new FantasyFdrInfoBottomSheetModal();
                    AppCompatActivity appCompatActivity = O instanceof AppCompatActivity ? (AppCompatActivity) O : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyFdrInfoBottomSheetModal, appCompatActivity, rq3Var, i2));
                    }
                }
                return Unit.a;
            case 9:
                int i5 = PlayerPenaltyShotView.J;
                int s = ao2.s(16, context);
                Drawable drawable2 = context.getDrawable(R.drawable.ic_football_glove);
                if (drawable2 == null || (mutate2 = drawable2.mutate()) == null) {
                    return null;
                }
                mutate2.setTint(context.getColor(R.color.success));
                mutate2.setBounds(0, 0, s, s);
                return mutate2;
            case 10:
                int i6 = PlayerPentagonSlider.l;
                color = context.getColor(R.color.secondary_default);
                break;
            case 11:
                int i7 = PlayerPentagonSlider.l;
                color = context.getColor(R.color.surface_1);
                break;
            case 12:
                int i8 = PlayerPentagonSlider.l;
                color = context.getColor(R.color.neutral_default);
                break;
            case 13:
                int i9 = PlayerPentagonSlider.l;
                color = context.getColor(R.color.neutral_variant);
                break;
            case 14:
                color = context.getColor(R.color.forward);
                break;
            case 15:
                color = context.getColor(R.color.midfield);
                break;
            case 16:
                color = context.getColor(R.color.defender);
                break;
            case 17:
                color = context.getColor(R.color.goalkeeper);
                break;
            case 18:
                f99 b = f99.b(LayoutInflater.from(context), null);
                v9g.K(b.b.getBackground().mutate(), context.getColor(R.color.terrain_football));
                return b;
            case 19:
                return LayoutInflater.from(context);
            case 20:
                color = ao2.s(32, context);
                break;
            case 21:
                color = ao2.s(16, context);
                break;
            case 22:
                color = ao2.s(2, context);
                break;
            case 23:
                color = ao2.s(400, context);
                break;
            case 24:
                color = ao2.s(260, context);
                break;
            case 25:
                color = ao2.s(4, context);
                break;
            case 26:
                color = ao2.s(32, context);
                break;
            case 27:
                return new x5f(context);
            case 28:
                context.getClass();
                return new m0j(context);
            default:
                ProfileEditorTournamentsModal profileEditorTournamentsModal = new ProfileEditorTournamentsModal();
                context.getClass();
                if (context instanceof csk) {
                    context = ((csk) context).getBaseContext();
                }
                AppCompatActivity appCompatActivity2 = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity2 != null) {
                    wca.x(appCompatActivity2.getLifecycle()).b(new r1(profileEditorTournamentsModal, appCompatActivity2, rq3Var, i2));
                }
                return Unit.a;
        }
        return Integer.valueOf(color);
    }
}
