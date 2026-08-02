package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryData;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import com.sofascore.results.R;
import com.sofascore.results.player.statistics.regular.view.PlayerPenaltyShotView;
import com.sofascore.results.view.EventInfoView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tue extends t2 {
    public final js2 j;
    public PlayerPenaltyHistoryData k;
    public List l;
    public Integer m;
    public List n;
    public que o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tue(Context context, Function1 function1) {
        super(context);
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.penalty_history_layout, (ViewGroup) getBinding().a, false);
        int i = R.id.event_info;
        EventInfoView eventInfoView = (EventInfoView) nq8.B(R.id.event_info, inflate);
        if (eventInfoView != null) {
            i = R.id.goal_zone;
            if (((TextView) nq8.B(R.id.goal_zone, inflate)) != null) {
                i = R.id.goal_zone_text;
                TextView textView = (TextView) nq8.B(R.id.goal_zone_text, inflate);
                if (textView != null) {
                    i = R.id.info_card;
                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.info_card, inflate);
                    if (frameLayout != null) {
                        i = R.id.penalty_conversion;
                        TextView textView2 = (TextView) nq8.B(R.id.penalty_conversion, inflate);
                        if (textView2 != null) {
                            i = R.id.penalty_conversion_value;
                            TextView textView3 = (TextView) nq8.B(R.id.penalty_conversion_value, inflate);
                            if (textView3 != null) {
                                i = R.id.penalty_empty_state_text;
                                TextView textView4 = (TextView) nq8.B(R.id.penalty_empty_state_text, inflate);
                                if (textView4 != null) {
                                    i = R.id.penalty_goal;
                                    TextView textView5 = (TextView) nq8.B(R.id.penalty_goal, inflate);
                                    if (textView5 != null) {
                                        i = R.id.penalty_goal_value;
                                        TextView textView6 = (TextView) nq8.B(R.id.penalty_goal_value, inflate);
                                        if (textView6 != null) {
                                            i = R.id.penalty_shotmap_next;
                                            ImageView imageView = (ImageView) nq8.B(R.id.penalty_shotmap_next, inflate);
                                            if (imageView != null) {
                                                i = R.id.penalty_shotmap_previous;
                                                ImageView imageView2 = (ImageView) nq8.B(R.id.penalty_shotmap_previous, inflate);
                                                if (imageView2 != null) {
                                                    i = R.id.penalty_shotmap_view;
                                                    PlayerPenaltyShotView playerPenaltyShotView = (PlayerPenaltyShotView) nq8.B(R.id.penalty_shotmap_view, inflate);
                                                    if (playerPenaltyShotView != null) {
                                                        i = R.id.penalty_types_holder;
                                                        TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.penalty_types_holder, inflate);
                                                        if (typeHeaderView != null) {
                                                            i = R.id.result;
                                                            if (((TextView) nq8.B(R.id.result, inflate)) != null) {
                                                                i = R.id.result_text;
                                                                TextView textView7 = (TextView) nq8.B(R.id.result_text, inflate);
                                                                if (textView7 != null) {
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                    this.j = new js2(constraintLayout, eventInfoView, textView, frameLayout, textView2, textView3, textView4, textView5, textView6, imageView, imageView2, playerPenaltyShotView, typeHeaderView, textView7);
                                                                    this.n = km5.a;
                                                                    this.o = que.a;
                                                                    setVisibility(8);
                                                                    Integer valueOf = Integer.valueOf(R.drawable.ic_penalty_shotmap);
                                                                    constraintLayout.getClass();
                                                                    t2.j(this, R.string.season_penalty_shotmap, valueOf, 0, constraintLayout, false, "FOOTBALL_PENALTY_SHOTMAP", function1, null, 298);
                                                                    setBottomDividerVisibility(false);
                                                                    setTopDividerVisibility(false);
                                                                    g5k g5kVar = new g5k(typeHeaderView);
                                                                    g5kVar.m = new ur1(this, 17);
                                                                    g5kVar.b();
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
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    public static final void n(tue tueVar, String str) {
        str.getClass();
        oue oueVar = oue.d;
        if (str.equals("All")) {
            tueVar.setDisplayData(tueVar.n);
            return;
        }
        if (str.equals("Goal")) {
            List list = tueVar.n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.c(((PlayerPenaltyHistoryData) obj).getOutcome(), "goal")) {
                    arrayList.add(obj);
                }
            }
            tueVar.setDisplayData(arrayList);
            return;
        }
        if (str.equals("Attempt saved")) {
            List list2 = tueVar.n;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (Intrinsics.c(((PlayerPenaltyHistoryData) obj2).getOutcome(), FootballShotmapItem.SHOT_TYPE_SAVE)) {
                    arrayList2.add(obj2);
                }
            }
            tueVar.setDisplayData(arrayList2);
            return;
        }
        if (str.equals("Missed")) {
            List list3 = tueVar.n;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list3) {
                PlayerPenaltyHistoryData playerPenaltyHistoryData = (PlayerPenaltyHistoryData) obj3;
                if (Intrinsics.c(playerPenaltyHistoryData.getOutcome(), FootballShotmapItem.SHOT_TYPE_POST) || Intrinsics.c(playerPenaltyHistoryData.getOutcome(), FootballShotmapItem.SHOT_TYPE_MISS)) {
                    arrayList3.add(obj3);
                }
            }
            tueVar.setDisplayData(arrayList3);
        }
    }

    public static final Unit q(tue tueVar, int i, PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse, int i2) {
        Context context = tueVar.getContext();
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("action", "shot_click");
        firebaseBundle.putInt("id", i);
        nv.N(context, firebaseBundle, "penalty_shotmap");
        for (PlayerPenaltyHistoryData playerPenaltyHistoryData : playerPenaltyHistoryResponse.getPenalties()) {
            if (playerPenaltyHistoryData.getId() == i2) {
                tueVar.setSelectedShot(playerPenaltyHistoryData);
                return Unit.a;
            }
        }
        ogj.m("Collection contains no element matching the predicate.");
        return null;
    }

    private final void setControlsEnabled(boolean z) {
        js2 js2Var = this.j;
        ImageView imageView = (ImageView) js2Var.b;
        imageView.setEnabled(z);
        Context context = imageView.getContext();
        int i = R.color.n_lv_4;
        imageView.setImageTintList(ColorStateList.valueOf(context.getColor(z ? R.color.primary_default : R.color.n_lv_4)));
        ImageView imageView2 = (ImageView) js2Var.c;
        imageView2.setEnabled(z);
        Context context2 = imageView2.getContext();
        if (z) {
            i = R.color.primary_default;
        }
        imageView2.setImageTintList(ColorStateList.valueOf(context2.getColor(i)));
    }

    private final void setDisplayData(List<PlayerPenaltyHistoryData> list) {
        this.l = list;
        js2 js2Var = this.j;
        ((TextView) js2Var.g).setVisibility(8);
        ((PlayerPenaltyShotView) js2Var.m).f(list, this.o);
        setSelectedShot((PlayerPenaltyHistoryData) CollectionsKt.j0(list));
        setControlsEnabled(list.size() > 1);
    }

    private final void setSelectedShot(PlayerPenaltyHistoryData playerPenaltyHistoryData) {
        js2 js2Var = this.j;
        ((EventInfoView) js2Var.k).setVisibility(playerPenaltyHistoryData == null ? 4 : 0);
        if (playerPenaltyHistoryData != null) {
            this.k = playerPenaltyHistoryData;
            ((ConstraintLayout) js2Var.j).post(new kdc(9, this, playerPenaltyHistoryData, playerPenaltyHistoryData));
        } else {
            ((TextView) js2Var.o).setText("-");
            js2Var.d.setText("-");
        }
    }

    public final void o(List list, boolean z) {
        Integer num = this.m;
        if (num != null) {
            int intValue = num.intValue();
            Context context = getContext();
            context.getClass();
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            firebaseBundle.putString("action", "arrow_click");
            firebaseBundle.putInt("id", intValue);
            nv.N(context, firebaseBundle, "penalty_shotmap");
        }
        PlayerPenaltyHistoryData playerPenaltyHistoryData = this.k;
        if (playerPenaltyHistoryData == null) {
            Intrinsics.i("selectedShot");
            throw null;
        }
        int indexOf = list.indexOf(playerPenaltyHistoryData);
        int size = z ? list.size() - 1 : 0;
        int size2 = z ? 0 : list.size() - 1;
        int i = z ? indexOf + 1 : indexOf - 1;
        if (indexOf != size) {
            size2 = i;
        }
        setSelectedShot((PlayerPenaltyHistoryData) list.get(size2));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i, PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse, que queVar) {
        ArrayList<String> arrayList;
        String str;
        Object obj;
        String str2;
        boolean z;
        boolean z2;
        playerPenaltyHistoryResponse.getClass();
        queVar.getClass();
        if (Intrinsics.c(this.n, playerPenaltyHistoryResponse.getPenalties())) {
            return;
        }
        this.o = queVar;
        this.m = Integer.valueOf(i);
        this.n = playerPenaltyHistoryResponse.getPenalties();
        js2 js2Var = this.j;
        TypeHeaderView typeHeaderView = (TypeHeaderView) js2Var.n;
        final int i2 = 1;
        final int i3 = 0;
        boolean z3 = this.o == que.b;
        if (z3) {
            Set a0 = ph0.a0(new oue[]{oue.d, oue.f, oue.e});
            arrayList = new ArrayList(k13.r(a0, 10));
            Iterator it = a0.iterator();
            while (it.hasNext()) {
                arrayList.add(((oue) it.next()).a);
            }
        } else {
            kp5 kp5Var = oue.h;
            arrayList = new ArrayList(k13.r(kp5Var, 10));
            Iterator<E> it2 = kp5Var.iterator();
            while (it2.hasNext()) {
                arrayList.add(((oue) it2.next()).a);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        for (String str3 : arrayList) {
            Context context = typeHeaderView.getContext();
            context.getClass();
            str3.getClass();
            Iterator<E> it3 = oue.h.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (Intrinsics.c(((oue) obj).a, str3)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            oue oueVar = (oue) obj;
            if (oueVar != null) {
                String string = context.getString(z3 ? oueVar.c : oueVar.b);
                if (string != null) {
                    str2 = string;
                    oue oueVar2 = oue.d;
                    if (str3.equals("All")) {
                        if (str3.equals("Goal")) {
                            List<PlayerPenaltyHistoryData> penalties = playerPenaltyHistoryResponse.getPenalties();
                            if (penalties == null || !penalties.isEmpty()) {
                                Iterator<T> it4 = penalties.iterator();
                                while (it4.hasNext()) {
                                    if (Intrinsics.c(((PlayerPenaltyHistoryData) it4.next()).getOutcome(), "goal")) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                            z2 = false;
                        } else if (str3.equals("Attempt saved")) {
                            List<PlayerPenaltyHistoryData> penalties2 = playerPenaltyHistoryResponse.getPenalties();
                            if (penalties2 == null || !penalties2.isEmpty()) {
                                Iterator<T> it5 = penalties2.iterator();
                                while (it5.hasNext()) {
                                    if (Intrinsics.c(((PlayerPenaltyHistoryData) it5.next()).getOutcome(), FootballShotmapItem.SHOT_TYPE_SAVE)) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                            z2 = false;
                        } else if (str3.equals("Missed")) {
                            List<PlayerPenaltyHistoryData> penalties3 = playerPenaltyHistoryResponse.getPenalties();
                            if (penalties3 == null || !penalties3.isEmpty()) {
                                for (PlayerPenaltyHistoryData playerPenaltyHistoryData : penalties3) {
                                    if (!Intrinsics.c(playerPenaltyHistoryData.getOutcome(), FootballShotmapItem.SHOT_TYPE_MISS) && !Intrinsics.c(playerPenaltyHistoryData.getOutcome(), FootballShotmapItem.SHOT_TYPE_POST)) {
                                    }
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        } else {
                            z = false;
                        }
                        z = z2;
                    } else {
                        z = true;
                    }
                    arrayList2.add(new vt2(str3, str2, z, null, null, null, null, 248));
                }
            }
            str2 = str3;
            oue oueVar22 = oue.d;
            if (str3.equals("All")) {
            }
            arrayList2.add(new vt2(str3, str2, z, null, null, null, null, 248));
        }
        oue oueVar3 = oue.d;
        typeHeaderView.w(arrayList2, "All", Boolean.TRUE);
        ImageView imageView = (ImageView) js2Var.c;
        aba.y(imageView, 0, 3);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: sue
            public final /* synthetic */ tue b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                tue tueVar = this.b;
                switch (i4) {
                    case 0:
                        List list = tueVar.l;
                        if (list != null) {
                            tueVar.o(list, false);
                            return;
                        } else {
                            Intrinsics.i("selectedData");
                            throw null;
                        }
                    default:
                        List list2 = tueVar.l;
                        if (list2 != null) {
                            tueVar.o(list2, true);
                            return;
                        } else {
                            Intrinsics.i("selectedData");
                            throw null;
                        }
                }
            }
        });
        ImageView imageView2 = (ImageView) js2Var.b;
        aba.y(imageView2, 0, 3);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: sue
            public final /* synthetic */ tue b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i2;
                tue tueVar = this.b;
                switch (i4) {
                    case 0:
                        List list = tueVar.l;
                        if (list != null) {
                            tueVar.o(list, false);
                            return;
                        } else {
                            Intrinsics.i("selectedData");
                            throw null;
                        }
                    default:
                        List list2 = tueVar.l;
                        if (list2 != null) {
                            tueVar.o(list2, true);
                            return;
                        } else {
                            Intrinsics.i("selectedData");
                            throw null;
                        }
                }
            }
        });
        ((TextView) js2Var.l).setText(String.format("%d/%d", Arrays.copyOf(new Object[]{Integer.valueOf(playerPenaltyHistoryResponse.getScored()), Integer.valueOf(playerPenaltyHistoryResponse.getAttempts())}, 2)));
        TextView textView = (TextView) js2Var.f;
        if (playerPenaltyHistoryResponse.getAttempts() != 0) {
            int scored = playerPenaltyHistoryResponse.getScored();
            Regex regex = yid.a;
            str = rei.d(scored, playerPenaltyHistoryResponse.getAttempts(), 0, 12);
        } else {
            str = "";
        }
        textView.setText(str);
        ((PlayerPenaltyShotView) js2Var.m).setOnShotSelected(new y51(this, i, playerPenaltyHistoryResponse, 8));
        if (playerPenaltyHistoryResponse.getPenalties().isEmpty()) {
            return;
        }
        setSelectedShot((PlayerPenaltyHistoryData) CollectionsKt.h0(playerPenaltyHistoryResponse.getPenalties()));
    }

    public final void r() {
        setDisplayData(km5.a);
        js2 js2Var = this.j;
        ((TextView) js2Var.g).setVisibility(0);
        ((TextView) js2Var.l).setText("0");
        ((TextView) js2Var.f).setText("0%");
        ((TypeHeaderView) js2Var.n).setVisibility(8);
    }
}
