package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.TeamForm;
import com.sofascore.results.R;
import com.sofascore.results.view.SofascoreRatingView;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u5f extends o8 {
    public final e92 d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final Map i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5f(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.indicator_1;
        ImageView imageView = (ImageView) nq8.B(R.id.indicator_1, root);
        if (imageView != null) {
            i = R.id.indicator_2;
            ImageView imageView2 = (ImageView) nq8.B(R.id.indicator_2, root);
            if (imageView2 != null) {
                i = R.id.indicator_3;
                ImageView imageView3 = (ImageView) nq8.B(R.id.indicator_3, root);
                if (imageView3 != null) {
                    i = R.id.indicator_4;
                    ImageView imageView4 = (ImageView) nq8.B(R.id.indicator_4, root);
                    if (imageView4 != null) {
                        i = R.id.indicator_5;
                        ImageView imageView5 = (ImageView) nq8.B(R.id.indicator_5, root);
                        if (imageView5 != null) {
                            i = R.id.rank_column;
                            TextView textView = (TextView) nq8.B(R.id.rank_column, root);
                            if (textView != null) {
                                i = R.id.standings_form_1;
                                TextView textView2 = (TextView) nq8.B(R.id.standings_form_1, root);
                                if (textView2 != null) {
                                    i = R.id.standings_form_2;
                                    TextView textView3 = (TextView) nq8.B(R.id.standings_form_2, root);
                                    if (textView3 != null) {
                                        i = R.id.standings_form_3;
                                        TextView textView4 = (TextView) nq8.B(R.id.standings_form_3, root);
                                        if (textView4 != null) {
                                            i = R.id.standings_form_4;
                                            TextView textView5 = (TextView) nq8.B(R.id.standings_form_4, root);
                                            if (textView5 != null) {
                                                i = R.id.standings_form_5;
                                                TextView textView6 = (TextView) nq8.B(R.id.standings_form_5, root);
                                                if (textView6 != null) {
                                                    i = R.id.standings_form_6;
                                                    if (((TextView) nq8.B(R.id.standings_form_6, root)) != null) {
                                                        i = R.id.team_logo;
                                                        ImageView imageView6 = (ImageView) nq8.B(R.id.team_logo, root);
                                                        if (imageView6 != null) {
                                                            i = R.id.team_points;
                                                            TextView textView7 = (TextView) nq8.B(R.id.team_points, root);
                                                            if (textView7 != null) {
                                                                i = R.id.team_rating;
                                                                SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) nq8.B(R.id.team_rating, root);
                                                                if (sofascoreRatingView != null) {
                                                                    this.d = new e92((ConstraintLayout) root, imageView, imageView2, imageView3, imageView4, imageView5, textView, textView2, textView3, textView4, textView5, textView6, imageView6, textView7, sofascoreRatingView);
                                                                    this.e = context.getColor(R.color.success);
                                                                    this.f = context.getColor(R.color.error);
                                                                    this.g = context.getColor(R.color.neutral_default);
                                                                    this.h = context.getColor(R.color.neutral_default);
                                                                    this.i = tub.h(new Pair(textView2, imageView), new Pair(textView3, imageView2), new Pair(textView4, imageView3), new Pair(textView5, imageView4), new Pair(textView6, imageView5));
                                                                    setVisibility(8);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.prematch_form_row_view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (r4.equals("OTL") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        r6 = r9.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (r4.equals("NC") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        r6 = r9.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009a, code lost:
    
        if (r4.equals("L") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        if (r4.equals("D") == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(TeamForm teamForm, boolean z, boolean z2) {
        int i;
        teamForm.getClass();
        setVisibility(0);
        Iterator it = CollectionsKt.X0(this.i.entrySet()).iterator();
        while (true) {
            sc5 sc5Var = (sc5) it;
            if (!sc5Var.b.hasNext()) {
                Team team = teamForm.getTeam();
                e92 e92Var = this.d;
                if (team != null) {
                    int id = team.getId();
                    as9.o((ImageView) e92Var.c, id);
                    if (!z2) {
                        ((ImageView) e92Var.c).setOnClickListener(new l8(this, id, 8));
                    }
                }
                TextView textView = (TextView) e92Var.d;
                SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) e92Var.f;
                textView.setText(String.valueOf(teamForm.getPosition()));
                ((TextView) e92Var.b).setText(teamForm.getValue());
                String avgRating = teamForm.getAvgRating();
                if (avgRating == null || avgRating.length() <= 0) {
                    avgRating = null;
                }
                sofascoreRatingView.setVisibility(avgRating == null ? 8 : 0);
                if (avgRating != null) {
                    sofascoreRatingView.setShouldAnimate(!z2);
                    sofascoreRatingView.setRating(avgRating);
                    return;
                }
                return;
            }
            IndexedValue indexedValue = (IndexedValue) sc5Var.next();
            int i2 = indexedValue.a;
            Map.Entry entry = (Map.Entry) indexedValue.b;
            String str = (String) CollectionsKt.a0(i2, teamForm.getForm());
            if (str == null) {
                str = "?";
            }
            Object key = entry.getKey();
            key.getClass();
            TextView textView2 = (TextView) key;
            Object value = entry.getValue();
            value.getClass();
            ImageView imageView = (ImageView) value;
            Context context = getContext();
            context.getClass();
            textView2.setText(wba.A(context, str));
            int hashCode = str.hashCode();
            if (hashCode != 68) {
                if (hashCode != 76) {
                    if (hashCode != 87) {
                        if (hashCode != 2485) {
                            if (hashCode == 78599) {
                            }
                        }
                    } else if (str.equals("W")) {
                        i = this.e;
                    }
                    i = this.h;
                }
            }
            if (i2 == 0) {
                textView2.setBackgroundTintList(ColorStateList.valueOf(i));
            } else {
                textView2.setBackgroundColor(i);
            }
            if (str.equals("OTL")) {
                imageView.setVisibility(0);
            }
            if (z) {
                ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    return;
                }
                tl3 tl3Var = (tl3) layoutParams;
                Context context2 = getContext();
                context2.getClass();
                tl3Var.N = ao2.s(26, context2);
                textView2.setLayoutParams(tl3Var);
            }
        }
    }
}
