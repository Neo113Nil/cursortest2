package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import com.sofascore.results.fantasy.competition.selector.FantasyCompetitionSelectorBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ap6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyCompetitionActivity b;

    public /* synthetic */ ap6(FantasyCompetitionActivity fantasyCompetitionActivity, int i) {
        this.a = i;
        this.b = fantasyCompetitionActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        int i = this.a;
        FantasyCompetitionActivity fantasyCompetitionActivity = this.b;
        switch (i) {
            case 0:
                int i2 = FantasyCompetitionActivity.R;
                return bti.a(fantasyCompetitionActivity.getLayoutInflater());
            case 1:
                int i3 = FantasyCompetitionActivity.R;
                View inflate = fantasyCompetitionActivity.getLayoutInflater().inflate(R.layout.toolbar_title_with_dropdown, (ViewGroup) null, false);
                int i4 = R.id.container;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate);
                if (linearLayout != null) {
                    i4 = R.id.icon_dropdown;
                    ImageView imageView = (ImageView) nq8.B(R.id.icon_dropdown, inflate);
                    if (imageView != null) {
                        i4 = R.id.toolbar_title;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) nq8.B(R.id.toolbar_title, inflate);
                        if (appCompatTextView != null) {
                            return new mkj((UnderlinedToolbar) inflate, linearLayout, imageView, appCompatTextView);
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                return null;
            case 2:
                jp6 jp6Var = fantasyCompetitionActivity.O;
                if (jp6Var != null) {
                    jp6Var.F();
                    return Unit.a;
                }
                Intrinsics.i("viewPagerAdapter");
                throw null;
            default:
                int i5 = FantasyCompetitionActivity.R;
                fdi fdiVar = fantasyCompetitionActivity.S().j;
                do {
                    value = fdiVar.getValue();
                    ((Boolean) value).getClass();
                } while (!fdiVar.k(value, Boolean.TRUE));
                do7 do7Var = (do7) fantasyCompetitionActivity.S().i.a.getValue();
                if (do7Var != null) {
                    int i6 = do7Var.c.c;
                    FantasyCompetitionSelectorBottomSheet fantasyCompetitionSelectorBottomSheet = new FantasyCompetitionSelectorBottomSheet();
                    fantasyCompetitionSelectorBottomSheet.setArguments(fz8.C(fz8.D(i6, "competitionId")));
                    FantasyCompetitionActivity fantasyCompetitionActivity2 = fantasyCompetitionActivity instanceof AppCompatActivity ? fantasyCompetitionActivity : null;
                    if (fantasyCompetitionActivity2 != null) {
                        wca.x(fantasyCompetitionActivity2.getLifecycle()).b(new r1(fantasyCompetitionSelectorBottomSheet, fantasyCompetitionActivity2, null, 3));
                    }
                }
                return Unit.a;
        }
    }
}
