package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.results.R;
import com.sofascore.results.event.statistics.view.football.FootballShotmapView;
import com.sofascore.results.event.statistics.view.football.PESMFootballGoalmapView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wk8 extends o8 {
    public Integer d;
    public final Gender e;
    public final ez0 f;
    public final TypeHeaderView g;
    public boolean h;
    public FootballShotmapItem i;
    public List j;
    public boolean k;
    public final uk8 l;
    public vk8 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk8(Context context, Integer num, Gender gender) {
        super(context, null, 0);
        context.getClass();
        this.d = num;
        this.e = gender;
        View root = getRoot();
        int i = R.id.divider;
        View B = nq8.B(R.id.divider, root);
        if (B != null) {
            i = R.id.graphs_card;
            View B2 = nq8.B(R.id.graphs_card, root);
            if (B2 != null) {
                int i2 = R.id.goalmap;
                PESMFootballGoalmapView pESMFootballGoalmapView = (PESMFootballGoalmapView) nq8.B(R.id.goalmap, B2);
                if (pESMFootballGoalmapView != null) {
                    i2 = R.id.left_section;
                    if (((LinearLayout) nq8.B(R.id.left_section, B2)) != null) {
                        i2 = R.id.result_info;
                        View B3 = nq8.B(R.id.result_info, B2);
                        if (B3 != null) {
                            rfe b = rfe.b(B3);
                            i2 = R.id.right_section;
                            if (((LinearLayout) nq8.B(R.id.right_section, B2)) != null) {
                                i2 = R.id.shot_type_info;
                                View B4 = nq8.B(R.id.shot_type_info, B2);
                                if (B4 != null) {
                                    rfe b2 = rfe.b(B4);
                                    i2 = R.id.shotmap_container;
                                    View B5 = nq8.B(R.id.shotmap_container, B2);
                                    if (B5 != null) {
                                        dd b3 = dd.b(B5);
                                        i2 = R.id.situation_info;
                                        View B6 = nq8.B(R.id.situation_info, B2);
                                        if (B6 != null) {
                                            rfe b4 = rfe.b(B6);
                                            i2 = R.id.x_stats;
                                            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.x_stats, B2);
                                            if (linearLayout != null) {
                                                i2 = R.id.xg_info;
                                                View B7 = nq8.B(R.id.xg_info, B2);
                                                if (B7 != null) {
                                                    rfe b5 = rfe.b(B7);
                                                    i2 = R.id.xgot_info;
                                                    View B8 = nq8.B(R.id.xgot_info, B2);
                                                    if (B8 != null) {
                                                        rfe b6 = rfe.b(B8);
                                                        LinearLayout linearLayout2 = (LinearLayout) B2;
                                                        bv1 bv1Var = new bv1(linearLayout2, pESMFootballGoalmapView, b, b2, b3, b4, linearLayout, b5, b6, 11);
                                                        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.header_container, root);
                                                        if (frameLayout != null) {
                                                            this.f = new ez0((ConstraintLayout) root, B, bv1Var, frameLayout, 11);
                                                            TypeHeaderView typeHeaderView = new TypeHeaderView(context, null, 6);
                                                            aba.I(typeHeaderView);
                                                            g5k g5kVar = new g5k(typeHeaderView);
                                                            g5kVar.a();
                                                            g5kVar.m = new wt(4, this, context);
                                                            g5kVar.b();
                                                            this.g = typeHeaderView;
                                                            this.j = km5.a;
                                                            this.l = uk8.PLAYER_EVENT_STATISTICS;
                                                            this.m = vk8.a;
                                                            setVisibility(8);
                                                            aba.I(getRoot());
                                                            linearLayout2.setClipToOutline(true);
                                                            frameLayout.addView(typeHeaderView);
                                                            ((TextView) b.c).setText(getContext().getString(R.string.shot_outcome));
                                                            ((TextView) b5.c).setText(getContext().getString(R.string.xG));
                                                            ((TextView) b6.c).setText(getContext().getString(R.string.xGOT));
                                                            ((TextView) b4.c).setText(getContext().getString(R.string.football_shotmap_situation));
                                                            b2.d.setVisibility(8);
                                                            setupShotmap(this.d);
                                                            getGoalmap().setOnShotSelectionChanged(new tk8(this, 1));
                                                            return;
                                                        }
                                                        i = R.id.header_container;
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
                yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(i2)));
                throw null;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    private final PESMFootballGoalmapView getGoalmap() {
        return (PESMFootballGoalmapView) ((bv1) this.f.d).e;
    }

    private final FootballShotmapView getShotmap() {
        return (FootballShotmapView) ((dd) ((bv1) this.f.d).c).c;
    }

    public static final void j(wk8 wk8Var, Context context, String str, int i) {
        str.getClass();
        FootballShotmapItem footballShotmapItem = (FootballShotmapItem) CollectionsKt.a0(i, wk8Var.j);
        if (footballShotmapItem != null) {
            if (wk8Var.k) {
                wk8Var.getGoalmap().i(Integer.valueOf(footballShotmapItem.getId()));
            } else {
                wk8Var.getShotmap().c(footballShotmapItem);
            }
            Integer num = wk8Var.d;
            if (num != null) {
                nv.D(context, num.intValue(), "minutes_click", wk8Var.l);
            }
        }
    }

    public static final Unit n(wk8 wk8Var, x31 x31Var) {
        FootballShotmapItem footballShotmapItem;
        Object obj;
        if (wk8Var.k) {
            if (x31Var != null) {
                Iterator it = wk8Var.j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((FootballShotmapItem) obj).getId() == x31Var.a) {
                        break;
                    }
                }
                footballShotmapItem = (FootballShotmapItem) obj;
            } else {
                footballShotmapItem = null;
            }
            if (footballShotmapItem != null) {
                wk8Var.getShotmap().h(a.c(footballShotmapItem), wk8Var.m, true, (r10 & 8) != 0, false);
            } else {
                wk8Var.getShotmap().F = null;
            }
        }
        return Unit.a;
    }

    public static final Unit o(wk8 wk8Var, FootballShotmapItem footballShotmapItem) {
        Point2D goalPoint;
        footballShotmapItem.getClass();
        if (!wk8Var.k) {
            PESMFootballGoalmapView goalmap = wk8Var.getGoalmap();
            x31 x31Var = (footballShotmapItem.isBlocked() || (goalPoint = footballShotmapItem.getGoalPoint()) == null) ? null : new x31(footballShotmapItem.getId(), footballShotmapItem.getShotType(), footballShotmapItem.isOwnGoal(), goalPoint);
            vk8 vk8Var = wk8Var.m;
            goalmap.getClass();
            vk8Var.getClass();
            goalmap.x = false;
            goalmap.f(x31Var != null ? a.c(x31Var) : null, vk8Var);
        }
        wk8Var.i = footballShotmapItem;
        int indexOf = wk8Var.j.indexOf(footballShotmapItem);
        Integer valueOf = Integer.valueOf(indexOf);
        if (indexOf < 0) {
            valueOf = null;
        }
        wk8Var.g.setSelectedIndex(valueOf != null ? valueOf.intValue() : b.i(wk8Var.j));
        bv1 bv1Var = (bv1) wk8Var.f.d;
        rfe rfeVar = (rfe) bv1Var.f;
        rfe rfeVar2 = (rfe) bv1Var.h;
        LinearLayout linearLayout = (LinearLayout) rfeVar2.b;
        rfe rfeVar3 = (rfe) bv1Var.i;
        TextView textView = (TextView) rfeVar3.e;
        TextView textView2 = (TextView) rfeVar3.c;
        TextView textView3 = (TextView) rfeVar.e;
        Context context = wk8Var.getContext();
        context.getClass();
        FootballShotmapItem footballShotmapItem2 = wk8Var.i;
        if (footballShotmapItem2 == null) {
            Intrinsics.i("selectedShot");
            throw null;
        }
        String shotType = footballShotmapItem2.getShotType();
        FootballShotmapItem footballShotmapItem3 = wk8Var.i;
        if (footballShotmapItem3 == null) {
            Intrinsics.i("selectedShot");
            throw null;
        }
        textView3.setText(tgj.L(context, shotType, footballShotmapItem3.getGoalType()));
        TextView textView4 = (TextView) ((rfe) bv1Var.j).e;
        FootballShotmapItem footballShotmapItem4 = wk8Var.i;
        if (footballShotmapItem4 == null) {
            Intrinsics.i("selectedShot");
            throw null;
        }
        Double xgot = footballShotmapItem4.getXgot();
        textView4.setText(xgot != null ? rei.b(2, Double.valueOf(xgot.doubleValue())) : "-");
        TextView textView5 = (TextView) ((rfe) bv1Var.d).e;
        Context context2 = wk8Var.getContext();
        context2.getClass();
        FootballShotmapItem footballShotmapItem5 = wk8Var.i;
        if (footballShotmapItem5 == null) {
            Intrinsics.i("selectedShot");
            throw null;
        }
        textView5.setText(tgj.M(context2, footballShotmapItem5.getSituation()));
        if (wk8Var.k) {
            Context context3 = wk8Var.getContext();
            context3.getClass();
            textView2.setText(hkg.Q(context3, R.string.player, wk8Var.e, new Object[0]));
            FootballShotmapItem footballShotmapItem6 = wk8Var.i;
            if (footballShotmapItem6 == null) {
                Intrinsics.i("selectedShot");
                throw null;
            }
            textView.setText(tba.t(footballShotmapItem6.getPlayer()));
            linearLayout.setVisibility(8);
        } else {
            textView2.setText(R.string.football_shot_type);
            textView2.setText(wk8Var.getContext().getString(R.string.football_shot_type));
            ((LinearLayout) rfeVar3.b).setVisibility(0);
            Context context4 = wk8Var.getContext();
            context4.getClass();
            FootballShotmapItem footballShotmapItem7 = wk8Var.i;
            if (footballShotmapItem7 == null) {
                Intrinsics.i("selectedShot");
                throw null;
            }
            textView.setText(tgj.J(context4, footballShotmapItem7.getBodyPart()));
            linearLayout.setVisibility(0);
            TextView textView6 = (TextView) rfeVar2.e;
            FootballShotmapItem footballShotmapItem8 = wk8Var.i;
            if (footballShotmapItem8 == null) {
                Intrinsics.i("selectedShot");
                throw null;
            }
            Double xg = footballShotmapItem8.getXg();
            textView6.setText(xg != null ? rei.b(2, Double.valueOf(xg.doubleValue())) : "-");
        }
        return Unit.a;
    }

    private final void setupShotmap(Integer num) {
        FootballShotmapView shotmap = getShotmap();
        shotmap.setOnShotSelectedCallback(new tk8(this, 0));
        shotmap.setAnalyticsCallback(new l97(7, num, shotmap, this));
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.football_match_shotmap_collapsable;
    }

    @NotNull
    public final uk8 getLocation() {
        return this.l;
    }

    @NotNull
    public final vk8 getTeamSide() {
        return this.m;
    }

    public final void l(int i, boolean z, List list, boolean z2) {
        Point2D goalPoint;
        String format;
        list.getClass();
        this.d = Integer.valueOf(i);
        List<FootballShotmapItem> B0 = CollectionsKt.B0(list);
        this.j = B0;
        this.k = z2;
        ArrayList arrayList = new ArrayList(k13.r(B0, 10));
        for (FootballShotmapItem footballShotmapItem : B0) {
            String valueOf = String.valueOf(footballShotmapItem.getId());
            if (!Intrinsics.c(footballShotmapItem.getSituation(), FootballShotmapItem.SITUATION_TYPE_SHOOTOUT) || footballShotmapItem.getShootoutOrder() == null) {
                Context context = getContext();
                context.getClass();
                int time = footballShotmapItem.getTime();
                Integer addedTime = footballShotmapItem.getAddedTime();
                if (addedTime != null) {
                    int intValue = addedTime.intValue();
                    Locale d = dla.d();
                    String string = context.getString(R.string.minutes_added_time_template);
                    string.getClass();
                    format = String.format(d, string, Arrays.copyOf(new Object[]{Integer.valueOf(time), Integer.valueOf(intValue)}, 2));
                } else {
                    Locale d2 = dla.d();
                    String string2 = context.getString(R.string.minutes_template);
                    string2.getClass();
                    format = String.format(d2, string2, Arrays.copyOf(new Object[]{Integer.valueOf(time)}, 1));
                }
            } else {
                format = getContext().getString(R.string.football_penalty_shootout_order, footballShotmapItem.getShootoutOrder());
            }
            String str = format;
            str.getClass();
            arrayList.add(new vt2(valueOf, str, false, null, null, null, null, 252));
        }
        TypeHeaderView.x(this.g, arrayList, null, 6);
        List<FootballShotmapItem> list2 = this.j;
        boolean isEmpty = list2.isEmpty();
        this.h = !isEmpty;
        setVisibility(!isEmpty ? 0 : 8);
        ConstraintLayout constraintLayout = (ConstraintLayout) ((dd) ((bv1) this.f.d).c).b;
        constraintLayout.getClass();
        Context context2 = getContext();
        context2.getClass();
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), ao2.s(10, context2), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        FootballShotmapView shotmap = getShotmap();
        if (!shotmap.w) {
            shotmap.h = 0;
            shotmap.i = 0;
            shotmap.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            shotmap.w = true;
            Drawable drawable = shotmap.m;
            if (drawable != null) {
                drawable.setTint(shotmap.getContext().getColor(R.color.neutral_default));
            }
        }
        getShotmap().setSelectionAllowed(!this.k);
        if (!this.k) {
            getShotmap().h(list2, this.m, z, (r10 & 8) != 0, false);
            return;
        }
        PESMFootballGoalmapView goalmap = getGoalmap();
        ArrayList arrayList2 = new ArrayList();
        for (FootballShotmapItem footballShotmapItem2 : list2) {
            x31 x31Var = (footballShotmapItem2.isBlocked() || (goalPoint = footballShotmapItem2.getGoalPoint()) == null) ? null : new x31(footballShotmapItem2.getId(), footballShotmapItem2.getShotType(), footballShotmapItem2.isOwnGoal(), goalPoint);
            if (x31Var != null) {
                arrayList2.add(x31Var);
            }
        }
        vk8 vk8Var = this.m;
        goalmap.getClass();
        vk8Var.getClass();
        goalmap.x = true;
        x31 selectedShot = goalmap.getSelectedShot();
        goalmap.f(arrayList2, vk8Var);
        if (Intrinsics.c(selectedShot, goalmap.getSelectedShot())) {
            return;
        }
        Function1 function1 = goalmap.onShotSelectionChanged;
        if (function1 != null) {
            function1.invoke(goalmap.getSelectedShot());
        }
        if (goalmap.getWidth() <= 0 || goalmap.getHeight() <= 0) {
            return;
        }
        goalmap.h();
    }

    public final void setTeamSide(@NotNull vk8 vk8Var) {
        vk8Var.getClass();
        this.m = vk8Var;
    }

    public final void setVisibility(boolean z) {
        setVisibility(this.h && z ? 0 : 8);
    }
}
