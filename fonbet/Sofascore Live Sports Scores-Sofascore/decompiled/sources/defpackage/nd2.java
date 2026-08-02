package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.newNetwork.ESportRound;
import com.sofascore.model.newNetwork.ESportsGameRoundsResponse;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nd2 extends o8 {
    public final ez0 d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public ESportsGameRoundsResponse p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd2(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.first_half;
        View B = nq8.B(R.id.first_half, root);
        if (B != null) {
            v82 b = v82.b(B);
            i = R.id.overtime_container;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.overtime_container, root);
            if (linearLayout != null) {
                i = R.id.second_half;
                View B2 = nq8.B(R.id.second_half, root);
                if (B2 != null) {
                    this.d = new ez0((ConstraintLayout) root, b, linearLayout, v82.b(B2), 8);
                    this.e = context.getColor(R.color.esp_csgo_t_30);
                    this.f = context.getColor(R.color.esp_csgo_t);
                    this.g = context.getColor(R.color.esp_csgo_ct_30);
                    this.h = context.getColor(R.color.esp_csgo_ct);
                    this.i = context.getColor(R.color.surface_2);
                    this.j = R.drawable.ic_ct_defuse;
                    this.k = R.drawable.ic_ct_time;
                    this.l = R.drawable.ic_t_bomb;
                    this.m = R.drawable.ic_elimination;
                    this.n = ao2.s(1, context);
                    this.o = ao2.s(16, context);
                    this.t = 12;
                    this.u = 3;
                    setVisibility(8);
                    o8.d(this, 0, 7);
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    public static void p(v82 v82Var) {
        ConstraintLayout constraintLayout = (ConstraintLayout) v82Var.b;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.width = -2;
        constraintLayout.setLayoutParams(layoutParams);
        LinearLayout linearLayout = (LinearLayout) v82Var.h;
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        layoutParams2.width = -2;
        linearLayout.setLayoutParams(layoutParams2);
        LinearLayout linearLayout2 = (LinearLayout) v82Var.f;
        ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
        layoutParams3.width = -2;
        linearLayout2.setLayoutParams(layoutParams3);
        LinearLayout linearLayout3 = (LinearLayout) v82Var.c;
        ViewGroup.LayoutParams layoutParams4 = linearLayout3.getLayoutParams();
        layoutParams4.width = -2;
        linearLayout3.setLayoutParams(layoutParams4);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.esports_csgo_graph_layout;
    }

    public final void j(v82 v82Var, List list, boolean z) {
        int i;
        int i2;
        int i3;
        Drawable mutate;
        Drawable mutate2;
        Integer homeTeamSide$default;
        Integer homeTeamSide$default2;
        Integer homeTeamSide$default3;
        Integer homeTeamSide$default4;
        LinearLayout linearLayout = (LinearLayout) v82Var.h;
        LinearLayout linearLayout2 = (LinearLayout) v82Var.c;
        LinearLayout linearLayout3 = (LinearLayout) v82Var.f;
        int i4 = 1;
        linearLayout.setClipToOutline(true);
        ((ConstraintLayout) v82Var.b).setVisibility(list.isEmpty() ? 8 : 0);
        linearLayout3.removeAllViews();
        linearLayout2.removeAllViews();
        Iterator it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                b.q();
                throw null;
            }
            ESportRound eSportRound = (ESportRound) next;
            FrameLayout frameLayout = new FrameLayout(getContext());
            linearLayout3.addView(frameLayout);
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            linearLayout2.addView(frameLayout2);
            l(frameLayout, z);
            l(frameLayout2, z);
            if (i5 < list.size() - i4) {
                int i7 = this.u;
                if (i5 % i7 == i7 - i4) {
                    View view = new View(getContext());
                    linearLayout3.addView(view);
                    View view2 = new View(getContext());
                    linearLayout2.addView(view2);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.getClass();
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    int i8 = this.n;
                    layoutParams2.width = i8;
                    layoutParams2.height = -1;
                    view.setLayoutParams(layoutParams2);
                    ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                    layoutParams3.getClass();
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    layoutParams4.width = i8;
                    layoutParams4.height = -1;
                    view2.setLayoutParams(layoutParams4);
                }
            }
            int i9 = this.i;
            int i10 = this.g;
            int i11 = this.e;
            if (eSportRound == null || (homeTeamSide$default4 = ESportRound.getHomeTeamSide$default(eSportRound, null, i4, null)) == null) {
                i = i9;
            } else {
                int intValue = homeTeamSide$default4.intValue();
                bg5[] bg5VarArr = bg5.c;
                i = intValue == 4 ? i11 : i10;
            }
            int i12 = this.h;
            Iterator it2 = it;
            int i13 = this.f;
            if (eSportRound == null || (homeTeamSide$default3 = ESportRound.getHomeTeamSide$default(eSportRound, null, i4, null)) == null) {
                i2 = 0;
            } else {
                int intValue2 = homeTeamSide$default3.intValue();
                bg5[] bg5VarArr2 = bg5.c;
                i2 = intValue2 == 4 ? i13 : i12;
            }
            if (eSportRound != null && (homeTeamSide$default2 = ESportRound.getHomeTeamSide$default(eSportRound, null, 1, null)) != null) {
                int intValue3 = homeTeamSide$default2.intValue();
                bg5[] bg5VarArr3 = bg5.c;
                i9 = intValue3 == 4 ? i10 : i11;
            }
            if (eSportRound == null || (homeTeamSide$default = ESportRound.getHomeTeamSide$default(eSportRound, null, 1, null)) == null) {
                i12 = 0;
            } else {
                int intValue4 = homeTeamSide$default.intValue();
                bg5[] bg5VarArr4 = bg5.c;
                if (intValue4 != 4) {
                    i12 = i13;
                }
            }
            frameLayout.setBackgroundColor(i);
            frameLayout2.setBackgroundColor(i9);
            if ((eSportRound != null ? eSportRound.getOutcome() : null) != null) {
                Integer winnerCode$default = ESportRound.getWinnerCode$default(eSportRound, null, 1, null);
                if ((winnerCode$default != null ? winnerCode$default.intValue() : 0) > 0) {
                    ImageView imageView = new ImageView(getContext());
                    Context context = getContext();
                    Integer outcome = eSportRound.getOutcome();
                    int intValue5 = outcome != null ? outcome.intValue() : 0;
                    Drawable drawable = context.getDrawable(intValue5 != 1 ? intValue5 != 2 ? intValue5 != 3 ? this.m : this.k : this.l : this.j);
                    i3 = 1;
                    Integer winnerCode$default2 = ESportRound.getWinnerCode$default(eSportRound, null, 1, null);
                    if (winnerCode$default2 != null && winnerCode$default2.intValue() == 1) {
                        frameLayout.addView(imageView);
                        if (drawable != null && (mutate2 = drawable.mutate()) != null) {
                            mutate2.setTint(i2);
                        }
                    } else {
                        frameLayout2.addView(imageView);
                        if (drawable != null && (mutate = drawable.mutate()) != null) {
                            mutate.setTint(i12);
                        }
                    }
                    imageView.setImageDrawable(drawable);
                    ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
                    layoutParams5.getClass();
                    FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                    int i14 = this.o;
                    layoutParams6.width = i14;
                    layoutParams6.height = i14;
                    layoutParams6.gravity = 17;
                    imageView.setLayoutParams(layoutParams6);
                    i5 = i6;
                    i4 = i3;
                    it = it2;
                }
            }
            i3 = 1;
            i5 = i6;
            i4 = i3;
            it = it2;
        }
    }

    public final void l(FrameLayout frameLayout, boolean z) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.getClass();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (z) {
            layoutParams2.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            layoutParams2.width = this.s;
        } else {
            layoutParams2.weight = 1.0f;
            layoutParams2.width = 0;
        }
        layoutParams2.height = -1;
        layoutParams2.gravity = 17;
        frameLayout.setLayoutParams(layoutParams2);
    }

    public final void n(int i, List list) {
        ((LinearLayout) this.d.d).removeAllViews();
        int i2 = 0;
        if (i <= 3) {
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    b.q();
                    throw null;
                }
                arrayList.add(new Pair(Integer.valueOf(i2), (ESportRound) obj));
                i2 = i3;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Integer valueOf = Integer.valueOf(((Number) ((Pair) next).a).intValue() / (i * 4));
                Object obj2 = linkedHashMap.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(valueOf, obj2);
                }
                ((List) obj2).add(next);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!((Collection) entry.getValue()).isEmpty()) {
                    int intValue = (((Number) entry.getKey()).intValue() * 2) + 1;
                    Iterable iterable = (Iterable) entry.getValue();
                    ArrayList arrayList2 = new ArrayList(k13.r(iterable, 10));
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((ESportRound) ((Pair) it2.next()).b);
                    }
                    o(arrayList2, intValue, i);
                }
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList(k13.r(list, 10));
        for (Object obj3 : list) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            arrayList3.add(new Pair(Integer.valueOf(i2), (ESportRound) obj3));
            i2 = i4;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            Integer valueOf2 = Integer.valueOf(((Number) ((Pair) next2).a).intValue() / (i * 2));
            Object obj4 = linkedHashMap2.get(valueOf2);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap2.put(valueOf2, obj4);
            }
            ((List) obj4).add(next2);
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!((Collection) entry2.getValue()).isEmpty()) {
                int intValue2 = ((Number) entry2.getKey()).intValue() + 1;
                Iterable iterable2 = (Iterable) entry2.getValue();
                ArrayList arrayList4 = new ArrayList(k13.r(iterable2, 10));
                Iterator it4 = iterable2.iterator();
                while (it4.hasNext()) {
                    arrayList4.add((ESportRound) ((Pair) it4.next()).b);
                }
                o(arrayList4, intValue2, i);
            }
        }
    }

    public final void o(ArrayList arrayList, int i, int i2) {
        int i3 = i2 * 2;
        LayoutInflater from = LayoutInflater.from(getContext());
        ez0 ez0Var = this.d;
        View inflate = from.inflate(R.layout.esports_csgo_graph_overtime_row, (ViewGroup) ez0Var.d, false);
        int i4 = R.id.first_half;
        View B = nq8.B(R.id.first_half, inflate);
        if (B != null) {
            v82 b = v82.b(B);
            View B2 = nq8.B(R.id.second_half, inflate);
            if (B2 != null) {
                v82 b2 = v82.b(B2);
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                as9.o((ImageView) b.g, this.q);
                as9.o((ImageView) b.d, this.r);
                ArrayList z0 = CollectionsKt.z0(arrayList, new ESportRound[i2 * 4]);
                ((TextView) b.e).setText(getContext().getString(R.string.esports_overtime, yid.p(i)));
                p(b);
                p(b2);
                j(b, CollectionsKt.L0(z0, i3), true);
                if (arrayList.size() <= i3) {
                    ((ConstraintLayout) b2.b).setVisibility(4);
                } else {
                    as9.o((ImageView) b2.g, this.q);
                    as9.o((ImageView) b2.d, this.r);
                    ((TextView) b2.e).setText(getContext().getString(R.string.esports_overtime, yid.p(i + 1)));
                    j(b2, CollectionsKt.L0(CollectionsKt.S(z0, i3), i3), true);
                }
                ((LinearLayout) ez0Var.d).addView(constraintLayout);
                return;
            }
            i4 = R.id.second_half;
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ((ConstraintLayout) this.d.b).post(new pn0(this, i, 5));
    }
}
