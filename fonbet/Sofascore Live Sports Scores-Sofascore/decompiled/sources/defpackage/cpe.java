package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.view.SofascoreRatingView;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.sofascore.results.view.follownotification.FollowButton;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cpe extends o8 {
    public final yt7 d;
    public String e;
    public boolean f;
    public int g;
    public gpe h;
    public List i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final e1d n;
    public final e1d o;
    public final mqi p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpe(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.compare_button;
        TextView textView = (TextView) nq8.B(R.id.compare_button, root);
        if (textView != null) {
            i = R.id.follow_button;
            FollowButton followButton = (FollowButton) nq8.B(R.id.follow_button, root);
            if (followButton != null) {
                i = R.id.left_injured_pill;
                TextView textView2 = (TextView) nq8.B(R.id.left_injured_pill, root);
                if (textView2 != null) {
                    i = R.id.left_name_bottom_anchor;
                    if (((Barrier) nq8.B(R.id.left_name_bottom_anchor, root)) != null) {
                        i = R.id.left_player_compare_layout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.left_player_compare_layout, root);
                        if (constraintLayout != null) {
                            i = R.id.left_player_compare_logo;
                            ImageView imageView = (ImageView) nq8.B(R.id.left_player_compare_logo, root);
                            if (imageView != null) {
                                i = R.id.left_player_compare_mvp_badge;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) nq8.B(R.id.left_player_compare_mvp_badge, root);
                                if (appCompatImageView != null) {
                                    i = R.id.left_player_compare_rating;
                                    SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) nq8.B(R.id.left_player_compare_rating, root);
                                    if (sofascoreSmallRatingView != null) {
                                        i = R.id.left_player_logo;
                                        ImageView imageView2 = (ImageView) nq8.B(R.id.left_player_logo, root);
                                        if (imageView2 != null) {
                                            i = R.id.left_player_mvp_badge;
                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) nq8.B(R.id.left_player_mvp_badge, root);
                                            if (appCompatImageView2 != null) {
                                                i = R.id.left_player_only_name;
                                                TextView textView3 = (TextView) nq8.B(R.id.left_player_only_name, root);
                                                if (textView3 != null) {
                                                    i = R.id.left_player_only_view;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) nq8.B(R.id.left_player_only_view, root);
                                                    if (constraintLayout2 != null) {
                                                        i = R.id.left_player_rating;
                                                        SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) nq8.B(R.id.left_player_rating, root);
                                                        if (sofascoreRatingView != null) {
                                                            i = R.id.left_player_rating_small;
                                                            SofascoreSmallRatingView sofascoreSmallRatingView2 = (SofascoreSmallRatingView) nq8.B(R.id.left_player_rating_small, root);
                                                            if (sofascoreSmallRatingView2 != null) {
                                                                i = R.id.left_player_spinner;
                                                                ComposeView composeView = (ComposeView) nq8.B(R.id.left_player_spinner, root);
                                                                if (composeView != null) {
                                                                    i = R.id.left_player_team_logo;
                                                                    ImageView imageView3 = (ImageView) nq8.B(R.id.left_player_team_logo, root);
                                                                    if (imageView3 != null) {
                                                                        i = R.id.left_player_tournament_logo;
                                                                        ImageView imageView4 = (ImageView) nq8.B(R.id.left_player_tournament_logo, root);
                                                                        if (imageView4 != null) {
                                                                            i = R.id.left_position;
                                                                            TextView textView4 = (TextView) nq8.B(R.id.left_position, root);
                                                                            if (textView4 != null) {
                                                                                i = R.id.left_rating;
                                                                                FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.left_rating, root);
                                                                                if (frameLayout != null) {
                                                                                    i = R.id.middle_divider;
                                                                                    View B = nq8.B(R.id.middle_divider, root);
                                                                                    if (B != null) {
                                                                                        i = R.id.right_player_compare_layout;
                                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) nq8.B(R.id.right_player_compare_layout, root);
                                                                                        if (constraintLayout3 != null) {
                                                                                            i = R.id.right_player_logo;
                                                                                            ImageView imageView5 = (ImageView) nq8.B(R.id.right_player_logo, root);
                                                                                            if (imageView5 != null) {
                                                                                                i = R.id.right_player_mvp_badge;
                                                                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) nq8.B(R.id.right_player_mvp_badge, root);
                                                                                                if (appCompatImageView3 != null) {
                                                                                                    i = R.id.right_player_rating;
                                                                                                    SofascoreSmallRatingView sofascoreSmallRatingView3 = (SofascoreSmallRatingView) nq8.B(R.id.right_player_rating, root);
                                                                                                    if (sofascoreSmallRatingView3 != null) {
                                                                                                        i = R.id.right_player_spinner;
                                                                                                        ComposeView composeView2 = (ComposeView) nq8.B(R.id.right_player_spinner, root);
                                                                                                        if (composeView2 != null) {
                                                                                                            i = R.id.view_player_details;
                                                                                                            TextView textView5 = (TextView) nq8.B(R.id.view_player_details, root);
                                                                                                            if (textView5 != null) {
                                                                                                                LinearLayout linearLayout = (LinearLayout) root;
                                                                                                                this.d = new yt7(linearLayout, textView, followButton, textView2, constraintLayout, imageView, appCompatImageView, sofascoreSmallRatingView, imageView2, appCompatImageView2, textView3, constraintLayout2, sofascoreRatingView, sofascoreSmallRatingView2, composeView, imageView3, imageView4, textView4, frameLayout, B, constraintLayout3, imageView5, appCompatImageView3, sofascoreSmallRatingView3, composeView2, textView5);
                                                                                                                this.i = km5.a;
                                                                                                                this.n = e.f(null);
                                                                                                                this.o = e.f(null);
                                                                                                                linearLayout.getClass();
                                                                                                                linearLayout.setVisibility(8);
                                                                                                                textView.setVisibility(8);
                                                                                                                this.p = ypa.b(new nzd(context, 7));
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

    private final xoe getFirstPlayerData() {
        return (xoe) ((eoh) this.n).getValue();
    }

    private final oxh getPlaceholderSpinnerItem() {
        return (oxh) this.p.getValue();
    }

    private final xoe getSecondPlayerData() {
        return (xoe) ((eoh) this.o).getValue();
    }

    public static final Unit o(cpe cpeVar, gpe gpeVar, of3 of3Var, int i) {
        oxh placeholderSpinnerItem;
        Object obj;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            gv9 l = cpeVar.l(m4j.HOME);
            if (cpeVar.getFirstPlayerData() != null) {
                av8Var.d0(1900223981);
                Iterator<E> it = l.iterator();
                while (true) {
                    placeholderSpinnerItem = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.c(((oxh) obj).a, cpeVar.getFirstPlayerData())) {
                        break;
                    }
                }
                oxh oxhVar = (oxh) obj;
                if (oxhVar == null) {
                    av8Var.d0(1900223980);
                    av8Var.s(false);
                } else {
                    av8Var.d0(1900223981);
                    placeholderSpinnerItem = oxh.a(oxhVar, null, yqo.H(-1737191397, av8Var, new ape(cpeVar, 0)), null, 235);
                    av8Var.s(false);
                }
                av8Var.s(false);
            } else {
                av8Var.d0(1900762885);
                av8Var.s(false);
                placeholderSpinnerItem = cpeVar.getPlaceholderSpinnerItem();
            }
            boolean i2 = av8Var.i(cpeVar) | av8Var.g(gpeVar);
            Object O = av8Var.O();
            if (i2 || O == nf3.a) {
                O = new ord(16, cpeVar, gpeVar);
                av8Var.n0(O);
            }
            r4a.j(l, placeholderSpinnerItem, (Function1) O, bkh.d(utc.a, 1.0f), null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 3072, 1008);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    public static final Unit p(cpe cpeVar, xtc xtcVar, of3 of3Var, int i) {
        Team team;
        xtcVar.getClass();
        if ((i & 6) == 0) {
            i |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 19) != 18)) {
            xoe firstPlayerData = cpeVar.getFirstPlayerData();
            Integer valueOf = (firstPlayerData == null || (team = firstPlayerData.e) == null) ? null : Integer.valueOf(team.getId());
            if (valueOf == null) {
                av8Var.d0(1687088940);
                av8Var.s(false);
            } else {
                av8Var.d0(1687088941);
                td4.G(valueOf.intValue(), xtcVar, false, 0L, av8Var, (i << 3) & 112, 12);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    public static final Unit q(cpe cpeVar, gpe gpeVar, Object obj) {
        obj.getClass();
        if (obj instanceof xoe) {
            xoe xoeVar = (xoe) obj;
            cpeVar.setFirstPlayerData(xoeVar);
            gpeVar.invoke(Integer.valueOf(xoeVar.a.getId()));
        }
        return Unit.a;
    }

    public static final Unit r(cpe cpeVar, gpe gpeVar, of3 of3Var, int i) {
        oxh placeholderSpinnerItem;
        Object obj;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            gv9 l = cpeVar.l(m4j.AWAY);
            if (cpeVar.getSecondPlayerData() != null) {
                av8Var.d0(-1788803211);
                Iterator<E> it = l.iterator();
                while (true) {
                    placeholderSpinnerItem = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.c(((oxh) obj).a, cpeVar.getSecondPlayerData())) {
                        break;
                    }
                }
                oxh oxhVar = (oxh) obj;
                if (oxhVar == null) {
                    av8Var.d0(-1788803212);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1788803211);
                    placeholderSpinnerItem = oxh.a(oxhVar, null, yqo.H(-986575221, av8Var, new ape(cpeVar, 1)), null, 235);
                    av8Var.s(false);
                }
                av8Var.s(false);
            } else {
                av8Var.d0(-1788263346);
                av8Var.s(false);
                placeholderSpinnerItem = cpeVar.getPlaceholderSpinnerItem();
            }
            oxh oxhVar2 = placeholderSpinnerItem;
            xtc d = bkh.d(utc.a, 1.0f);
            boolean i2 = av8Var.i(cpeVar) | av8Var.g(gpeVar);
            Object O = av8Var.O();
            if (i2 || O == nf3.a) {
                O = new ord(15, cpeVar, gpeVar);
                av8Var.n0(O);
            }
            r4a.j(l, oxhVar2, (Function1) O, d, null, false, null, true, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 100666368, 752);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    public static final Unit s(cpe cpeVar, xtc xtcVar, of3 of3Var, int i) {
        Team team;
        xtcVar.getClass();
        if ((i & 6) == 0) {
            i |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 19) != 18)) {
            xoe secondPlayerData = cpeVar.getSecondPlayerData();
            Integer valueOf = (secondPlayerData == null || (team = secondPlayerData.e) == null) ? null : Integer.valueOf(team.getId());
            if (valueOf == null) {
                av8Var.d0(-601121124);
                av8Var.s(false);
            } else {
                av8Var.d0(-601121123);
                td4.G(valueOf.intValue(), xtcVar, false, 0L, av8Var, (i << 3) & 112, 12);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final void setFirstPlayerData(xoe xoeVar) {
        ((eoh) this.n).setValue(xoeVar);
    }

    private final void setSecondPlayerData(xoe xoeVar) {
        ((eoh) this.o).setValue(xoeVar);
    }

    public static final Unit t(cpe cpeVar, gpe gpeVar, Object obj) {
        obj.getClass();
        if (obj instanceof xoe) {
            xoe xoeVar = (xoe) obj;
            cpeVar.setSecondPlayerData(xoeVar);
            gpeVar.invoke(Integer.valueOf(xoeVar.a.getId()));
        }
        return Unit.a;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.player_info_header;
    }

    public final void j(xoe xoeVar, of3 of3Var, int i) {
        utc utcVar;
        boolean z;
        long f;
        xoe xoeVar2 = xoeVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1313735661);
        int i2 = i | (av8Var.i(xoeVar2) ? 4 : 2) | (av8Var.i(this) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            utc utcVar2 = utc.a;
            nq8.h(av8Var, bkh.p(utcVar2, 8.0f));
            String str = this.e;
            if (str == null) {
                Intrinsics.i(SearchResponseKt.SPORT_ENTITY);
                throw null;
            }
            if (str.equals(Sports.FOOTBALL)) {
                av8Var.d0(-220408596);
                String str2 = xoeVar2.d;
                if (str2 == null) {
                    av8Var.d0(1757268117);
                    av8Var.s(false);
                    utcVar = utcVar2;
                    z = false;
                } else {
                    av8Var.d0(1757268118);
                    String upperCase = str2.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    yf8 yf8Var = xth.a;
                    dfj l = xth.l();
                    int hashCode = str2.hashCode();
                    if (hashCode == 68) {
                        if (str2.equals("D")) {
                            f = ljg.f(av8Var, 556349949, R.color.primary_default, av8Var, false);
                            z = false;
                            utcVar = utcVar2;
                            udj.c(upperCase, null, f, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l, av8Var, 0, 0, 131066);
                            av8Var = av8Var;
                            av8Var.s(false);
                        }
                        f = ljg.f(av8Var, 556353811, R.color.live, av8Var, false);
                        z = false;
                        utcVar = utcVar2;
                        udj.c(upperCase, null, f, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l, av8Var, 0, 0, 131066);
                        av8Var = av8Var;
                        av8Var.s(false);
                    } else if (hashCode != 71) {
                        if (hashCode == 77 && str2.equals(PlayerKt.FOOTBALL_MIDFIELDER)) {
                            f = ljg.f(av8Var, 556352095, R.color.secondary_default, av8Var, false);
                            z = false;
                            utcVar = utcVar2;
                            udj.c(upperCase, null, f, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l, av8Var, 0, 0, 131066);
                            av8Var = av8Var;
                            av8Var.s(false);
                        }
                        f = ljg.f(av8Var, 556353811, R.color.live, av8Var, false);
                        z = false;
                        utcVar = utcVar2;
                        udj.c(upperCase, null, f, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l, av8Var, 0, 0, 131066);
                        av8Var = av8Var;
                        av8Var.s(false);
                    } else {
                        if (str2.equals("G")) {
                            f = ljg.f(av8Var, 556348148, R.color.value, av8Var, false);
                            z = false;
                            utcVar = utcVar2;
                            udj.c(upperCase, null, f, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l, av8Var, 0, 0, 131066);
                            av8Var = av8Var;
                            av8Var.s(false);
                        }
                        f = ljg.f(av8Var, 556353811, R.color.live, av8Var, false);
                        z = false;
                        utcVar = utcVar2;
                        udj.c(upperCase, null, f, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l, av8Var, 0, 0, 131066);
                        av8Var = av8Var;
                        av8Var.s(false);
                    }
                }
                av8Var.s(z);
            } else {
                utcVar = utcVar2;
                z = false;
                av8Var.d0(1757738357);
                av8Var.s(false);
            }
            if (this.j) {
                ljg.r(6.0f, 1757785508, av8Var, av8Var, utcVar);
                xoeVar2 = xoeVar;
                i9a.j(xoeVar2.c, false, false, null, false, true, null, av8Var, 197040, 88);
                av8Var.s(z);
            } else {
                xoeVar2 = xoeVar;
                av8Var.d0(1758047861);
                av8Var.s(z);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gme(this, xoeVar2, i, 1);
        }
    }

    public final gv9 l(m4j m4jVar) {
        String i;
        Player player;
        Player player2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (xoe xoeVar : this.i) {
            int i2 = -1;
            if (m4jVar == m4j.AWAY) {
                int id = xoeVar.a.getId();
                xoe firstPlayerData = getFirstPlayerData();
                if (id != ((firstPlayerData == null || (player2 = firstPlayerData.a) == null) ? -1 : player2.getId())) {
                    arrayList2.add(xoeVar);
                }
            }
            if (m4jVar == m4j.HOME) {
                int id2 = xoeVar.a.getId();
                xoe secondPlayerData = getSecondPlayerData();
                if (secondPlayerData != null && (player = secondPlayerData.a) != null) {
                    i2 = player.getId();
                }
                if (id2 != i2) {
                    arrayList2.add(xoeVar);
                }
            }
        }
        xoe xoeVar2 = (xoe) CollectionsKt.firstOrNull(arrayList2);
        Team team = null;
        boolean z = (xoeVar2 != null ? xoeVar2.b : null) != null;
        Iterator it = arrayList2.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            xoe xoeVar3 = (xoe) it.next();
            if (!z) {
                Team team2 = xoeVar3.e;
                if (team2 != null && (team == null || !team.equals(team2))) {
                    if (i3 < 2) {
                        Context context = getContext();
                        context.getClass();
                        i = tba.p(context, team2);
                    } else {
                        String string = getContext().getString(R.string.substitute);
                        Context context2 = getContext();
                        context2.getClass();
                        i = wv8.i(string, " - ", tba.p(context2, team2));
                    }
                    arrayList.add(new oxh(team2, i, new tc3(-1610221482, new bba(team2, 25), true), null, null, i3 > 0, 56));
                    i3++;
                    team = team2;
                }
            } else if (i3 == 0) {
                arrayList.add(new oxh(getContext().getString(R.string.team_of_the_week), getContext().getString(R.string.team_of_the_week), null, null, null, false, 188));
                i3++;
            }
            arrayList.add(new oxh(xoeVar3, tba.t(xoeVar3.a), null, null, new pxh(new tc3(135946118, new yya(11, this, xoeVar3), true), true), false, 236));
        }
        return l6g.W(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        if (defpackage.j58.k() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        if (defpackage.j58.k() != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(String str, boolean z, int i, zbe zbeVar, gpe gpeVar, gpe gpeVar2, gpe gpeVar3, xoe xoeVar, List list, boolean z2) {
        boolean z3;
        boolean z4;
        Boolean bool;
        str.getClass();
        xoeVar.getClass();
        list.getClass();
        this.e = str;
        this.f = z;
        this.g = i;
        this.h = gpeVar3;
        yt7 yt7Var = this.d;
        aba.y(yt7Var.g, 0, 1);
        aba.y(yt7Var.f, 0, 1);
        aba.y(yt7Var.m, 0, 1);
        aba.y(yt7Var.j, 0, 1);
        setFirstPlayerData(xoeVar);
        if (wyh.p.contains(str)) {
            if (str.equals(Sports.BASKETBALL)) {
                yea yeaVar = j58.a;
            }
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Double d = ((xoe) it.next()).c;
                    if (d != null) {
                        bool = Boolean.valueOf(d.doubleValue() > 1.0E-4d);
                    } else {
                        bool = null;
                    }
                    if (Intrinsics.c(bool, Boolean.TRUE)) {
                        z3 = true;
                        break;
                    }
                }
            }
        }
        z3 = false;
        this.j = z3;
        if (wyh.p.contains(str)) {
            if (str.equals(Sports.BASKETBALL)) {
                yea yeaVar2 = j58.a;
            }
            if (!z2) {
                z4 = true;
                this.m = z4;
                boolean z5 = b.j(Sports.AMERICAN_FOOTBALL, Sports.BASEBALL).contains(str) && list.size() > 1 && list.contains(xoeVar) && !z;
                this.k = z5;
                yt7Var.o.setVisibility(!z5 ? 0 : 8);
                LinearLayout linearLayout = yt7Var.b;
                linearLayout.getClass();
                linearLayout.setVisibility(0);
                if (this.k) {
                    return;
                }
                this.i = list;
                yt7Var.c.setOnClickListener(new r2(zbeVar, this, gpeVar, gpeVar2, 2));
                return;
            }
        }
        z4 = false;
        this.m = z4;
        if (b.j(Sports.AMERICAN_FOOTBALL, Sports.BASEBALL).contains(str)) {
        }
        this.k = z5;
        yt7Var.o.setVisibility(!z5 ? 0 : 8);
        LinearLayout linearLayout2 = yt7Var.b;
        linearLayout2.getClass();
        linearLayout2.setVisibility(0);
        if (this.k) {
        }
    }

    public final void setInjured(boolean z) {
        this.d.d.setVisibility(z ? 0 : 8);
    }

    public final void u(Player player) {
        player.getClass();
        String str = this.e;
        if (str == null) {
            Intrinsics.i(SearchResponseKt.SPORT_ENTITY);
            throw null;
        }
        if (player.getDeceased() || player.getRetired() || player.getDisabled()) {
            return;
        }
        Set set = wyh.z;
        String sportSlug = player.getSportSlug();
        if (sportSlug != null) {
            str = sportSlug;
        }
        if (CollectionsKt.R(set, str)) {
            FollowButton followButton = (FollowButton) this.d.p;
            wu wuVar = wu.PLAYER_STATISTICS;
            String str2 = this.e;
            if (str2 != null) {
                followButton.e(player, wuVar, str2);
            } else {
                Intrinsics.i(SearchResponseKt.SPORT_ENTITY);
                throw null;
            }
        }
    }

    public final void v(int i, final xoe xoeVar) {
        Player player = xoeVar.a;
        final int i2 = 2;
        yt7 yt7Var = this.d;
        if (i == 1) {
            setFirstPlayerData(xoeVar);
            TextView textView = yt7Var.h;
            AppCompatImageView appCompatImageView = (AppCompatImageView) yt7Var.q;
            ImageView imageView = yt7Var.f;
            ImageView imageView2 = yt7Var.g;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) yt7Var.s;
            textView.setText(tba.t(player));
            as9.l(imageView2, player.getId(), null);
            as9.l(imageView, player.getId(), null);
            if (!player.getIsTopRated() || appCompatImageView2.getVisibility() == 0) {
                appCompatImageView2.setVisibility(player.getIsTopRated() ? 0 : 8);
            } else {
                tgj.p(appCompatImageView2, 0L, 3);
            }
            appCompatImageView.setVisibility(player.getIsTopRated() ? 0 : 8);
            Context context = getContext();
            context.getClass();
            Double d = xoeVar.c;
            appCompatImageView.setBackgroundTintList(ColorStateList.valueOf(kpg.u(context, d != null ? d.doubleValue() : 0.0d, null)));
            Context context2 = getContext();
            context2.getClass();
            Double d2 = xoeVar.c;
            appCompatImageView2.setBackgroundTintList(ColorStateList.valueOf(kpg.u(context2, d2 != null ? d2.doubleValue() : 0.0d, null)));
            Team team = xoeVar.e;
            if (team == null) {
                team = player.getTeam();
            }
            if (team != null) {
                as9.o(yt7Var.j, team.getId());
            }
            final int i3 = 0;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: bpe
                public final /* synthetic */ cpe b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i3;
                    xoe xoeVar2 = xoeVar;
                    cpe cpeVar = this.b;
                    switch (i4) {
                        case 0:
                            gpe gpeVar = cpeVar.h;
                            if (gpeVar != null) {
                                gpeVar.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        case 1:
                            gpe gpeVar2 = cpeVar.h;
                            if (gpeVar2 != null) {
                                gpeVar2.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        case 2:
                            gpe gpeVar3 = cpeVar.h;
                            if (gpeVar3 != null) {
                                gpeVar3.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        case 3:
                            gpe gpeVar4 = cpeVar.h;
                            if (gpeVar4 != null) {
                                gpeVar4.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        default:
                            gpe gpeVar5 = cpeVar.h;
                            if (gpeVar5 != null) {
                                gpeVar5.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i4 = 1;
            yt7Var.h.setOnClickListener(new View.OnClickListener(this) { // from class: bpe
                public final /* synthetic */ cpe b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i4;
                    xoe xoeVar2 = xoeVar;
                    cpe cpeVar = this.b;
                    switch (i42) {
                        case 0:
                            gpe gpeVar = cpeVar.h;
                            if (gpeVar != null) {
                                gpeVar.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        case 1:
                            gpe gpeVar2 = cpeVar.h;
                            if (gpeVar2 != null) {
                                gpeVar2.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        case 2:
                            gpe gpeVar3 = cpeVar.h;
                            if (gpeVar3 != null) {
                                gpeVar3.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        case 3:
                            gpe gpeVar4 = cpeVar.h;
                            if (gpeVar4 != null) {
                                gpeVar4.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        default:
                            gpe gpeVar5 = cpeVar.h;
                            if (gpeVar5 != null) {
                                gpeVar5.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                    }
                }
            });
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: bpe
                public final /* synthetic */ cpe b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i2;
                    xoe xoeVar2 = xoeVar;
                    cpe cpeVar = this.b;
                    switch (i42) {
                        case 0:
                            gpe gpeVar = cpeVar.h;
                            if (gpeVar != null) {
                                gpeVar.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        case 1:
                            gpe gpeVar2 = cpeVar.h;
                            if (gpeVar2 != null) {
                                gpeVar2.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        case 2:
                            gpe gpeVar3 = cpeVar.h;
                            if (gpeVar3 != null) {
                                gpeVar3.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        case 3:
                            gpe gpeVar4 = cpeVar.h;
                            if (gpeVar4 != null) {
                                gpeVar4.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        default:
                            gpe gpeVar5 = cpeVar.h;
                            if (gpeVar5 != null) {
                                gpeVar5.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i5 = 3;
            yt7Var.o.setOnClickListener(new View.OnClickListener(this) { // from class: bpe
                public final /* synthetic */ cpe b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i5;
                    xoe xoeVar2 = xoeVar;
                    cpe cpeVar = this.b;
                    switch (i42) {
                        case 0:
                            gpe gpeVar = cpeVar.h;
                            if (gpeVar != null) {
                                gpeVar.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        case 1:
                            gpe gpeVar2 = cpeVar.h;
                            if (gpeVar2 != null) {
                                gpeVar2.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        case 2:
                            gpe gpeVar3 = cpeVar.h;
                            if (gpeVar3 != null) {
                                gpeVar3.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        case 3:
                            gpe gpeVar4 = cpeVar.h;
                            if (gpeVar4 != null) {
                                gpeVar4.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        default:
                            gpe gpeVar5 = cpeVar.h;
                            if (gpeVar5 != null) {
                                gpeVar5.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            ImageView imageView3 = yt7Var.m;
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) yt7Var.z;
            as9.l(imageView3, player.getId(), null);
            final int i6 = 4;
            yt7Var.m.setOnClickListener(new View.OnClickListener(this) { // from class: bpe
                public final /* synthetic */ cpe b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i6;
                    xoe xoeVar2 = xoeVar;
                    cpe cpeVar = this.b;
                    switch (i42) {
                        case 0:
                            gpe gpeVar = cpeVar.h;
                            if (gpeVar != null) {
                                gpeVar.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        case 1:
                            gpe gpeVar2 = cpeVar.h;
                            if (gpeVar2 != null) {
                                gpeVar2.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        case 2:
                            gpe gpeVar3 = cpeVar.h;
                            if (gpeVar3 != null) {
                                gpeVar3.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        case 3:
                            gpe gpeVar4 = cpeVar.h;
                            if (gpeVar4 != null) {
                                gpeVar4.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                        default:
                            gpe gpeVar5 = cpeVar.h;
                            if (gpeVar5 != null) {
                                gpeVar5.invoke(xoeVar2.a);
                                break;
                            }
                            break;
                    }
                }
            });
            appCompatImageView3.setVisibility(player.getIsTopRated() ? 0 : 8);
            Context context3 = getContext();
            context3.getClass();
            Double d3 = xoeVar.c;
            appCompatImageView3.setBackgroundTintList(ColorStateList.valueOf(kpg.u(context3, d3 != null ? d3.doubleValue() : 0.0d, null)));
        }
        TextView textView2 = yt7Var.c;
        ImageView imageView4 = yt7Var.k;
        SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) yt7Var.r;
        SofascoreSmallRatingView sofascoreSmallRatingView2 = (SofascoreSmallRatingView) yt7Var.A;
        TextView textView3 = yt7Var.l;
        FrameLayout frameLayout = (FrameLayout) yt7Var.w;
        textView2.setVisibility(this.k ? 0 : 8);
        String str = this.e;
        if (str == null) {
            Intrinsics.i(SearchResponseKt.SPORT_ENTITY);
            throw null;
        }
        if (str.equals(Sports.BASEBALL)) {
            List list = xoeVar.g;
            String f0 = list != null ? CollectionsKt.f0(list, ", ", null, null, null, 62) : xoeVar.d;
            if (f0 != null) {
                frameLayout.setVisibility(0);
                textView3.setVisibility(0);
                textView3.setText(f0);
            } else {
                frameLayout.setVisibility(8);
                textView3.setVisibility(8);
            }
        } else {
            Double d4 = xoeVar.c;
            if ((this.j || this.m) && d4 != null && (!Intrinsics.a(d4, 0.0d) || this.l)) {
                if (i == 1) {
                    SofascoreSmallRatingView sofascoreSmallRatingView3 = (SofascoreSmallRatingView) yt7Var.v;
                    SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) yt7Var.u;
                    frameLayout.setVisibility(0);
                    if (this.f) {
                        sofascoreSmallRatingView3.setVisibility(8);
                        sofascoreRatingView.setVisibility(0);
                        sofascoreRatingView.m(d4.doubleValue(), false);
                        as9.q(imageView4, Integer.valueOf(this.g), 0, null);
                        imageView4.setVisibility(0);
                    } else {
                        sofascoreSmallRatingView3.setVisibility(0);
                        sofascoreRatingView.setVisibility(8);
                        SofascoreSmallRatingView.k(sofascoreSmallRatingView3, d4, 6);
                    }
                    sofascoreSmallRatingView.setVisibility(0);
                    SofascoreSmallRatingView.k(sofascoreSmallRatingView, d4, 6);
                } else {
                    sofascoreSmallRatingView2.setVisibility(0);
                    SofascoreSmallRatingView.k(sofascoreSmallRatingView2, d4, 2);
                }
            } else if (i == 1) {
                frameLayout.setVisibility(8);
                sofascoreSmallRatingView.setVisibility(8);
                imageView4.setVisibility(8);
            } else {
                sofascoreSmallRatingView2.setVisibility(8);
            }
        }
        u(player);
    }
}
