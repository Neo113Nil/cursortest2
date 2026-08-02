package com.sofascore.results.league.view.cuptree;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.appsflyer.internal.i;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4427z5;
import com.ironsource.L6;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.cuptree.CupTree;
import com.sofascore.model.cuptree.CupTreeBlock;
import com.sofascore.model.cuptree.CupTreeParticipant;
import com.sofascore.model.cuptree.CupTreeRound;
import com.sofascore.model.mvvm.model.City;
import com.sofascore.model.mvvm.model.Stadium;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.results.R;
import com.sofascore.results.league.view.cuptree.CupTreeExtendedView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.ao2;
import defpackage.b84;
import defpackage.bi4;
import defpackage.c6;
import defpackage.c84;
import defpackage.d7g;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.fc6;
import defpackage.g5k;
import defpackage.g7;
import defpackage.gj5;
import defpackage.gv9;
import defpackage.h6b;
import defpackage.hj5;
import defpackage.hk4;
import defpackage.hl6;
import defpackage.i21;
import defpackage.k13;
import defpackage.km5;
import defpackage.l6g;
import defpackage.llf;
import defpackage.lnb;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.nr1;
import defpackage.ph0;
import defpackage.pj5;
import defpackage.qj5;
import defpackage.r8;
import defpackage.rm5;
import defpackage.tba;
import defpackage.tc3;
import defpackage.uaa;
import defpackage.ur1;
import defpackage.v02;
import defpackage.v6a;
import defpackage.wzb;
import defpackage.y74;
import defpackage.y9h;
import defpackage.yhk;
import defpackage.yid;
import defpackage.ypa;
import defpackage.z8e;
import defpackage.znh;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001b\u001cJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R+\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/sofascore/results/league/view/cuptree/CupTreeExtendedView;", "Lh6b;", "", "getLayoutId", "()I", "", "<set-?>", j.b, "Le1d;", "isExpanded", "()Z", "setExpanded", "(Z)V", InneractiveMediationDefs.GENDER_MALE, "Ljoa;", "getTabOffset", "tabOffset", "Lpj5;", C4427z5.q, "getAdapter", "()Lpj5;", L6.G1, "Lqj5;", "o", "getTrophyViewBinding", "()Lqj5;", "trophyViewBinding", "b84", "s02", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CupTreeExtendedView extends h6b {
    public static final /* synthetic */ int p = 0;
    public final nr1 d;
    public int e;
    public CupTree f;
    public Integer g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: from kotlin metadata */
    public final e1d isExpanded;
    public final y74 k;
    public final y74 l;
    public final mqi m;
    public final mqi n;
    public final mqi o;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/sofascore/results/league/view/cuptree/CupTreeExtendedView$2", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.sofascore.results.league.view.cuptree.CupTreeExtendedView$2, reason: invalid class name */
    public final class AnonymousClass2 extends LinearLayoutManager {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupTreeExtendedView(@NotNull final Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        final int i = 0;
        View root = getRoot();
        int i2 = R.id.bye_label;
        TextView textView = (TextView) nq8.B(R.id.bye_label, root);
        if (textView != null) {
            i2 = R.id.bye_label_container;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.bye_label_container, root);
            if (linearLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) root;
                i2 = R.id.draw_label;
                TextView textView2 = (TextView) nq8.B(R.id.draw_label, root);
                if (textView2 != null) {
                    i2 = R.id.draw_label_container;
                    LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.draw_label_container, root);
                    if (linearLayout2 != null) {
                        i2 = R.id.legend_container;
                        LinearLayout linearLayout3 = (LinearLayout) nq8.B(R.id.legend_container, root);
                        if (linearLayout3 != null) {
                            i2 = R.id.rounds_header;
                            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.rounds_header, root);
                            if (typeHeaderView != null) {
                                i2 = R.id.view_pager;
                                RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.view_pager, root);
                                if (recyclerView != null) {
                                    this.d = new nr1(relativeLayout, textView, linearLayout, textView2, linearLayout2, linearLayout3, typeHeaderView, recyclerView, 16);
                                    final int i3 = 1;
                                    this.i = true;
                                    this.isExpanded = e.f(Boolean.FALSE);
                                    this.k = new y74(this, i);
                                    this.l = new y74(this, i3);
                                    this.m = ypa.b(new c6(context, 15));
                                    this.n = ypa.b(new Function0() { // from class: z74
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i4 = i;
                                            CupTreeExtendedView cupTreeExtendedView = this;
                                            Context context2 = context;
                                            switch (i4) {
                                                case 0:
                                                    return CupTreeExtendedView.n(context2, cupTreeExtendedView);
                                                default:
                                                    int i5 = CupTreeExtendedView.p;
                                                    View inflate = LayoutInflater.from(context2).inflate(R.layout.elimination_round_winner_item, (ViewGroup) cupTreeExtendedView.d.i, false);
                                                    int i6 = R.id.icon_bottom;
                                                    if (((ImageView) nq8.B(R.id.icon_bottom, inflate)) != null) {
                                                        i6 = R.id.icon_top;
                                                        if (((ImageView) nq8.B(R.id.icon_top, inflate)) != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                            qj5 qj5Var = new qj5(constraintLayout);
                                                            constraintLayout.getClass();
                                                            constraintLayout.setVisibility(4);
                                                            return qj5Var;
                                                        }
                                                    }
                                                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                                                    return null;
                                            }
                                        }
                                    });
                                    b84 b84Var = new b84(this, getTabOffset());
                                    this.o = ypa.b(new Function0() { // from class: z74
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i4 = i3;
                                            CupTreeExtendedView cupTreeExtendedView = this;
                                            Context context2 = context;
                                            switch (i4) {
                                                case 0:
                                                    return CupTreeExtendedView.n(context2, cupTreeExtendedView);
                                                default:
                                                    int i5 = CupTreeExtendedView.p;
                                                    View inflate = LayoutInflater.from(context2).inflate(R.layout.elimination_round_winner_item, (ViewGroup) cupTreeExtendedView.d.i, false);
                                                    int i6 = R.id.icon_bottom;
                                                    if (((ImageView) nq8.B(R.id.icon_bottom, inflate)) != null) {
                                                        i6 = R.id.icon_top;
                                                        if (((ImageView) nq8.B(R.id.icon_top, inflate)) != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                            qj5 qj5Var = new qj5(constraintLayout);
                                                            constraintLayout.getClass();
                                                            constraintLayout.setVisibility(4);
                                                            return qj5Var;
                                                        }
                                                    }
                                                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                                                    return null;
                                            }
                                        }
                                    });
                                    g5k g5kVar = new g5k(typeHeaderView);
                                    g5kVar.a();
                                    g5kVar.k = true;
                                    g5kVar.m = new ur1(this, 2);
                                    g5kVar.b();
                                    z8e.b0(recyclerView, context, false, false, null, 30);
                                    recyclerView.setLayoutManager(new AnonymousClass2(0, false));
                                    recyclerView.setAdapter(getAdapter());
                                    b84Var.attachToRecyclerView(recyclerView);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pj5 getAdapter() {
        return (pj5) this.n.getValue();
    }

    private final int getTabOffset() {
        return ((Number) this.m.getValue()).intValue();
    }

    private final qj5 getTrophyViewBinding() {
        return (qj5) this.o.getValue();
    }

    public static final pj5 n(Context context, CupTreeExtendedView cupTreeExtendedView) {
        pj5 pj5Var = new pj5(context, cupTreeExtendedView.getTabOffset());
        pj5Var.q = new y74(cupTreeExtendedView, 2);
        return pj5Var;
    }

    public static final void p(CupTreeExtendedView cupTreeExtendedView, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ArrayList Y0 = CollectionsKt.Y0(b.j(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)), b.j(Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)));
        if (!Y0.isEmpty()) {
            Iterator it = Y0.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (((Number) pair.a).intValue() != ((Number) pair.b).intValue()) {
                    break;
                }
            }
        }
        if (!cupTreeExtendedView.i) {
            return;
        }
        int i9 = 0;
        cupTreeExtendedView.i = false;
        cupTreeExtendedView.getAdapter().notifyDataSetChanged();
        znh znhVar = cupTreeExtendedView.getAdapter().p;
        Iterator it2 = cupTreeExtendedView.getAdapter().i.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i9 = -1;
                break;
            }
            int size = ((hj5) it2.next()).d.size();
            int a = wzb.a(76.0d);
            Context context = cupTreeExtendedView.getContext();
            context.getClass();
            if (ao2.s(a, context) * size < ((RecyclerView) cupTreeExtendedView.d.i).getHeight()) {
                break;
            } else {
                i9++;
            }
        }
        Integer valueOf = Integer.valueOf(i9);
        if (i9 < 0) {
            valueOf = null;
        }
        znhVar.i(valueOf != null ? valueOf.intValue() : Integer.MAX_VALUE);
    }

    public static final void q(CupTreeExtendedView cupTreeExtendedView, int i) {
        n layoutManager = ((RecyclerView) cupTreeExtendedView.d.i).getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(i, cupTreeExtendedView.getTabOffset());
        }
        cupTreeExtendedView.getAdapter().o.i(i);
        cupTreeExtendedView.e = i;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.view_cup_tree_extended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x04eb, code lost:
    
        if (r3 != null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0514, code lost:
    
        if (r3 != null) goto L253;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x07b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x07c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0813 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x09eb  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r65v3 */
    /* JADX WARN: Type inference failed for: r65v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r65v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(CupTree cupTree, String str, Integer num, String str2, boolean z, i21 i21Var) {
        int i;
        CupTree cupTree2;
        String str3;
        ?? r65;
        List list;
        ArrayList arrayList;
        int i2;
        int i3;
        int currentRound;
        TypeHeaderView typeHeaderView;
        List<CupTreeRound> rounds;
        km5 km5Var;
        TypeHeaderView typeHeaderView2;
        Collection collection;
        CupTreeRound cupTreeRound;
        Collection collection2;
        int i4;
        List<CupTreeBlock> list2;
        v6a v6aVar;
        String str4;
        boolean z2;
        CupTree cupTree3;
        boolean z3;
        boolean z4;
        CupTreeParticipant homeParticipant;
        String string;
        CupTreeParticipant awayParticipant;
        String string2;
        Collection collection3;
        CupTreeParticipant homeParticipant2;
        Team team;
        String homeTeamScore;
        Boolean valueOf;
        Boolean bool;
        int i5;
        CupTreeParticipant homeParticipant3;
        String str5;
        CupTreeParticipant awayParticipant2;
        String str6;
        String result;
        String str7;
        String str8;
        boolean z5;
        boolean z6;
        String str9;
        String i6;
        String str10;
        boolean z7;
        gj5 gj5Var;
        Venue venue;
        Stadium stadium;
        City city;
        Stadium stadium2;
        String teamSeed;
        String teamSeed2;
        String teamSeed3;
        String teamSeed4;
        Team team2;
        Team team3;
        Team team4;
        Team team5;
        Team team6;
        Team team7;
        CupTreeBlock cupTreeBlock;
        List<CupTreeParticipant> participants;
        CupTreeRound cupTreeRound2;
        List<CupTreeBlock> blocks;
        Object obj;
        Set set;
        CupTreeRound cupTreeRound3;
        List<CupTreeBlock> blocks2;
        Iterator it;
        Integer num2;
        TypeHeaderView typeHeaderView3;
        Integer num3;
        Team team8;
        Team team9;
        Iterator it2;
        Integer num4;
        Integer num5;
        Team team10;
        Team team11;
        List B0;
        CupTreeRound cupTreeRound4;
        List<CupTreeBlock> blocks3;
        CupTree cupTree4 = this.f;
        if (cupTree4 != null && Intrinsics.c(cupTree4.getName(), cupTree.getName())) {
            return;
        }
        getAdapter().h.clear();
        getAdapter().notifyDataSetChanged();
        this.f = cupTree;
        this.g = num;
        this.h = z;
        this.i = true;
        nr1 nr1Var = this.d;
        RelativeLayout relativeLayout = (RelativeLayout) nr1Var.c;
        TypeHeaderView typeHeaderView4 = (TypeHeaderView) nr1Var.h;
        relativeLayout.addOnLayoutChangeListener(new r8(this, 2));
        ((RecyclerView) nr1Var.i).addOnScrollListener(new c84(this));
        y74 y74Var = this.k;
        if (y74Var != null) {
            y74Var.invoke(Boolean.FALSE);
        }
        y74 y74Var2 = this.l;
        if (y74Var2 != null) {
            y74Var2.invoke(Boolean.FALSE);
        }
        CupTree cupTree5 = this.f;
        String str11 = "cupTree";
        if (cupTree5 == null) {
            Intrinsics.i("cupTree");
            throw null;
        }
        List<CupTreeRound> rounds2 = cupTree5.getRounds();
        if (rounds2 != null && (cupTreeRound4 = (CupTreeRound) CollectionsKt.j0(rounds2)) != null) {
            if (cupTreeRound4.getType() == 1) {
                cupTreeRound4 = null;
            }
            if (cupTreeRound4 != null && (blocks3 = cupTreeRound4.getBlocks()) != null) {
                i = blocks3.size();
                cupTree2 = this.f;
                if (cupTree2 != null) {
                    Intrinsics.i("cupTree");
                    throw null;
                }
                List<CupTreeRound> rounds3 = cupTree2.getRounds();
                if (rounds3 == null || (B0 = CollectionsKt.B0(rounds3)) == null) {
                    str3 = "cupTree";
                    r65 = 0;
                    list = null;
                } else {
                    int size = B0.size();
                    r65 = 0;
                    ArrayList arrayList2 = new ArrayList(size);
                    int i7 = 0;
                    while (i7 < size) {
                        arrayList2.add(Integer.valueOf(wzb.a(Math.pow(2.0d, i7)) * i));
                        i7++;
                        str11 = str11;
                    }
                    str3 = str11;
                    list = CollectionsKt.B0(arrayList2);
                }
                if (list == null) {
                    list = km5.a;
                }
                HashSet hashSet = new HashSet();
                Set a0 = ph0.a0(new String[]{CupTreeBlock.BLOCK_RESULT_WALKOVER, CupTreeBlock.BLOCK_RESULT_RETIRED});
                CupTree cupTree6 = this.f;
                if (cupTree6 == null) {
                    Intrinsics.i(str3);
                    throw r65;
                }
                List<CupTreeRound> rounds4 = cupTree6.getRounds();
                if (rounds4 != null) {
                    arrayList = new ArrayList(k13.r(rounds4, 10));
                    Iterator it3 = rounds4.iterator();
                    int i8 = 0;
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            b.q();
                            throw r65;
                        }
                        CupTreeRound cupTreeRound5 = (CupTreeRound) next;
                        Object a02 = CollectionsKt.a0(i8, list);
                        Iterator it4 = it3;
                        if (cupTreeRound5.getType() == 1) {
                            a02 = r65;
                        }
                        Integer num6 = (Integer) a02;
                        int intValue = num6 != null ? num6.intValue() : cupTreeRound5.getBlocks().size();
                        List<CupTreeBlock> blocks4 = cupTreeRound5.getBlocks();
                        List list3 = list;
                        HashSet hashSet2 = new HashSet();
                        Set set2 = a0;
                        CupTree cupTree7 = this.f;
                        if (cupTree7 == null) {
                            Intrinsics.i(str3);
                            throw r65;
                        }
                        int i10 = i8;
                        if (Intrinsics.c(cupTree7.getShowSingleParticipantByeBlocks(), Boolean.TRUE) || i10 <= 0) {
                            typeHeaderView2 = typeHeaderView4;
                            collection = rm5.a;
                        } else {
                            ArrayList arrayList3 = new ArrayList(k13.r(blocks4, 10));
                            Iterator it5 = blocks4.iterator();
                            while (it5.hasNext()) {
                                CupTreeBlock cupTreeBlock2 = (CupTreeBlock) it5.next();
                                CupTreeParticipant homeParticipant4 = cupTreeBlock2.getHomeParticipant();
                                if (homeParticipant4 == null || (team11 = homeParticipant4.getTeam()) == null) {
                                    it2 = it5;
                                    num4 = r65;
                                } else {
                                    Integer valueOf2 = Integer.valueOf(team11.getId());
                                    if (team11.getDisabled()) {
                                        valueOf2 = r65;
                                    }
                                    it2 = it5;
                                    num4 = valueOf2;
                                }
                                CupTreeParticipant awayParticipant3 = cupTreeBlock2.getAwayParticipant();
                                if (awayParticipant3 == null || (team10 = awayParticipant3.getTeam()) == null) {
                                    num5 = r65;
                                } else {
                                    Integer valueOf3 = Integer.valueOf(team10.getId());
                                    if (team10.getDisabled()) {
                                        valueOf3 = r65;
                                    }
                                    num5 = valueOf3;
                                }
                                arrayList3.add(ph0.x(new Integer[]{num4, num5}));
                                it5 = it2;
                            }
                            Set W0 = CollectionsKt.W0(k13.s(arrayList3));
                            CupTree cupTree8 = this.f;
                            if (cupTree8 == null) {
                                Intrinsics.i(str3);
                                throw r65;
                            }
                            List<CupTreeRound> rounds5 = cupTree8.getRounds();
                            if (rounds5 == null || (cupTreeRound3 = (CupTreeRound) CollectionsKt.a0(i10 - 1, rounds5)) == null || (blocks2 = cupTreeRound3.getBlocks()) == null) {
                                typeHeaderView2 = typeHeaderView4;
                                set = r65;
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it6 = blocks2.iterator();
                                while (it6.hasNext()) {
                                    CupTreeBlock cupTreeBlock3 = (CupTreeBlock) it6.next();
                                    CupTreeParticipant homeParticipant5 = cupTreeBlock3.getHomeParticipant();
                                    Integer valueOf4 = (homeParticipant5 == null || (team9 = homeParticipant5.getTeam()) == null) ? r65 : Integer.valueOf(team9.getId());
                                    if (cupTreeBlock3.getAwayParticipant() != null) {
                                        Integer num7 = valueOf4;
                                        it = it6;
                                        num2 = num7;
                                    } else {
                                        it = it6;
                                        num2 = r65;
                                    }
                                    CupTreeParticipant awayParticipant4 = cupTreeBlock3.getAwayParticipant();
                                    if (awayParticipant4 == null || (team8 = awayParticipant4.getTeam()) == null) {
                                        typeHeaderView3 = typeHeaderView4;
                                        num3 = r65;
                                    } else {
                                        Integer valueOf5 = Integer.valueOf(team8.getId());
                                        typeHeaderView3 = typeHeaderView4;
                                        num3 = valueOf5;
                                    }
                                    arrayList4.add(ph0.x(new Integer[]{num2, num3}));
                                    typeHeaderView4 = typeHeaderView3;
                                    it6 = it;
                                }
                                typeHeaderView2 = typeHeaderView4;
                                set = CollectionsKt.W0(k13.s(arrayList4));
                            }
                            if (set == null) {
                                set = rm5.a;
                            }
                            collection = y9h.e(W0, set);
                        }
                        if (!collection.isEmpty() && y74Var != null) {
                            y74Var.invoke(Boolean.TRUE);
                            Unit unit = Unit.a;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        if (cupTreeRound5.getType() == 1 && cupTreeRound5.getBlocks().size() == 2) {
                            arrayList5.add(new gj5(0, null, null, null, null, null, null, 0, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, false, false, 67108608));
                        }
                        v6a it7 = llf.j(0, intValue).iterator();
                        while (it7.c) {
                            int nextInt = it7.nextInt();
                            CupTreeBlock cupTreeBlock4 = (CupTreeBlock) CollectionsKt.a0(nextInt, blocks4);
                            if (cupTreeBlock4 != null) {
                                collection2 = collection;
                                int order = (cupTreeBlock4.getOrder() - arrayList5.size()) - 1;
                                i4 = intValue;
                                int i11 = 0;
                                while (i11 < order) {
                                    int i12 = order;
                                    gj5 gj5Var2 = (gj5) CollectionsKt.j0(arrayList5);
                                    arrayList5.add(new gj5(yid.m(gj5Var2 != null ? Integer.valueOf(gj5Var2.a) : r65) + 1, null, null, null, null, null, null, 0, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, false, false, 67108608));
                                    i11++;
                                    order = i12;
                                }
                                gj5 gj5Var3 = (gj5) CollectionsKt.j0(arrayList5);
                                int m = yid.m(gj5Var3 != null ? Integer.valueOf(gj5Var3.a) : r65) + 1;
                                int i13 = m * 2;
                                boolean z8 = hashSet.contains(Integer.valueOf(i13 + (-1))) || hashSet.contains(Integer.valueOf(i13));
                                Set set3 = set2;
                                String result2 = cupTreeBlock4.getResult();
                                list2 = blocks4;
                                if (result2 != null) {
                                    Locale locale = Locale.US;
                                    str4 = i.k(locale, result2, locale);
                                } else {
                                    str4 = r65;
                                }
                                if (CollectionsKt.R(set3, str4)) {
                                    List<CupTreeParticipant> participants2 = cupTreeBlock4.getParticipants();
                                    if (yid.m(participants2 != null ? Integer.valueOf(participants2.size()) : r65) > 1) {
                                        z2 = true;
                                        cupTree3 = this.f;
                                        if (cupTree3 != null) {
                                            Intrinsics.i(str3);
                                            throw r65;
                                        }
                                        List<CupTreeRound> rounds6 = cupTree3.getRounds();
                                        IntRange j = llf.j(i9, yid.m(rounds6 != null ? Integer.valueOf(rounds6.size()) : r65));
                                        ArrayList arrayList6 = new ArrayList();
                                        v6a it8 = j.iterator();
                                        boolean z9 = z2;
                                        while (it8.c) {
                                            int nextInt2 = it8.nextInt();
                                            v6a v6aVar2 = it8;
                                            v6a v6aVar3 = it7;
                                            int i14 = nextInt;
                                            int order2 = ((cupTreeBlock4.getOrder() - 1) / wzb.a(Math.pow(2.0d, nextInt2 - i10))) + 1;
                                            CupTree cupTree9 = this.f;
                                            if (cupTree9 == null) {
                                                Intrinsics.i(str3);
                                                throw r65;
                                            }
                                            List<CupTreeRound> rounds7 = cupTree9.getRounds();
                                            if (rounds7 == null || (cupTreeRound2 = (CupTreeRound) CollectionsKt.a0(nextInt2, rounds7)) == null || (blocks = cupTreeRound2.getBlocks()) == null) {
                                                cupTreeBlock = r65;
                                            } else {
                                                Iterator it9 = blocks.iterator();
                                                while (true) {
                                                    if (it9.hasNext()) {
                                                        obj = it9.next();
                                                        if (((CupTreeBlock) obj).getOrder() == order2) {
                                                            break;
                                                        }
                                                    } else {
                                                        obj = r65;
                                                        break;
                                                    }
                                                }
                                                cupTreeBlock = (CupTreeBlock) obj;
                                            }
                                            Boolean valueOf6 = (cupTreeBlock == null || (participants = cupTreeBlock.getParticipants()) == null) ? r65 : Boolean.valueOf(!participants.isEmpty());
                                            if (valueOf6 != null) {
                                                arrayList6.add(valueOf6);
                                            }
                                            it8 = v6aVar2;
                                            nextInt = i14;
                                            it7 = v6aVar3;
                                        }
                                        v6aVar = it7;
                                        int i15 = nextInt;
                                        if (!arrayList6.isEmpty()) {
                                            Iterator it10 = arrayList6.iterator();
                                            while (it10.hasNext()) {
                                                if (((Boolean) it10.next()).booleanValue()) {
                                                    z3 = false;
                                                    break;
                                                }
                                            }
                                        }
                                        z3 = true;
                                        if (!arrayList6.isEmpty()) {
                                            CupTree cupTree10 = this.f;
                                            if (cupTree10 == null) {
                                                Intrinsics.i(str3);
                                                throw r65;
                                            }
                                            if (Intrinsics.c(cupTree10.getShowSingleParticipantByeBlocks(), Boolean.TRUE)) {
                                                z4 = true;
                                                homeParticipant = cupTreeBlock4.getHomeParticipant();
                                                if (homeParticipant != null && (team7 = homeParticipant.getTeam()) != null) {
                                                    Context context = getContext();
                                                    context.getClass();
                                                    string = tba.A(context, team7);
                                                }
                                                string = getContext().getString(R.string.label_to_be_determined);
                                                string.getClass();
                                                String str12 = string;
                                                awayParticipant = cupTreeBlock4.getAwayParticipant();
                                                if (awayParticipant != null && (team6 = awayParticipant.getTeam()) != null) {
                                                    Context context2 = getContext();
                                                    context2.getClass();
                                                    string2 = tba.A(context2, team6);
                                                }
                                                string2 = getContext().getString(R.string.label_to_be_determined);
                                                collection3 = collection2;
                                                homeParticipant2 = cupTreeBlock4.getHomeParticipant();
                                                if (!CollectionsKt.R(collection3, (homeParticipant2 != null || (team = homeParticipant2.getTeam()) == null) ? r65 : Integer.valueOf(team.getId())) || i10 == 0) {
                                                    string2 = r65;
                                                }
                                                CupTreeParticipant homeParticipant6 = cupTreeBlock4.getHomeParticipant();
                                                Integer valueOf7 = (homeParticipant6 != null || (team5 = homeParticipant6.getTeam()) == null) ? r65 : Integer.valueOf(team5.getId());
                                                CupTreeParticipant awayParticipant5 = cupTreeBlock4.getAwayParticipant();
                                                Integer valueOf8 = (awayParticipant5 != null || (team4 = awayParticipant5.getTeam()) == null) ? r65 : Integer.valueOf(team4.getId());
                                                homeTeamScore = cupTreeBlock4.getHomeTeamScore();
                                                if (homeTeamScore == null) {
                                                    homeTeamScore = "";
                                                }
                                                if (z9) {
                                                    homeTeamScore = r65;
                                                }
                                                String str13 = homeTeamScore != null ? "-" : homeTeamScore;
                                                String awayTeamScore = cupTreeBlock4.getAwayTeamScore();
                                                String str14 = awayTeamScore != null ? awayTeamScore : "";
                                                if (z9) {
                                                    str14 = r65;
                                                }
                                                String str15 = str14 != null ? "-" : str14;
                                                CupTreeParticipant homeParticipant7 = cupTreeBlock4.getHomeParticipant();
                                                valueOf = homeParticipant7 == null ? Boolean.valueOf(homeParticipant7.getWinner()) : r65;
                                                bool = Boolean.TRUE;
                                                if (Intrinsics.c(valueOf, bool)) {
                                                    CupTreeParticipant awayParticipant6 = cupTreeBlock4.getAwayParticipant();
                                                    i5 = Intrinsics.c(awayParticipant6 != null ? Boolean.valueOf(awayParticipant6.getWinner()) : r65, bool) ? 2 : 0;
                                                } else {
                                                    i5 = 1;
                                                }
                                                Collection collection4 = collection2;
                                                CupTreeParticipant homeParticipant8 = cupTreeBlock4.getHomeParticipant();
                                                boolean R = CollectionsKt.R(collection4, (homeParticipant8 != null || (team3 = homeParticipant8.getTeam()) == null) ? r65 : Integer.valueOf(team3.getId()));
                                                CupTreeParticipant awayParticipant7 = cupTreeBlock4.getAwayParticipant();
                                                boolean R2 = CollectionsKt.R(collection4, (awayParticipant7 != null || (team2 = awayParticipant7.getTeam()) == null) ? r65 : Integer.valueOf(team2.getId()));
                                                boolean finished = cupTreeBlock4.getFinished();
                                                boolean eventInProgress = cupTreeBlock4.getEventInProgress();
                                                String result3 = cupTreeBlock4.getResult();
                                                homeParticipant3 = cupTreeBlock4.getHomeParticipant();
                                                if (homeParticipant3 != null || (teamSeed4 = homeParticipant3.getTeamSeed()) == null) {
                                                    str5 = r65;
                                                } else {
                                                    Context context3 = getContext();
                                                    context3.getClass();
                                                    str5 = uaa.q(context3, teamSeed4);
                                                }
                                                CupTreeParticipant homeParticipant9 = cupTreeBlock4.getHomeParticipant();
                                                Integer valueOf9 = (homeParticipant9 != null || (teamSeed3 = homeParticipant9.getTeamSeed()) == null) ? r65 : Integer.valueOf(uaa.p(teamSeed3));
                                                awayParticipant2 = cupTreeBlock4.getAwayParticipant();
                                                if (awayParticipant2 != null || (teamSeed2 = awayParticipant2.getTeamSeed()) == null) {
                                                    str6 = r65;
                                                } else {
                                                    Context context4 = getContext();
                                                    context4.getClass();
                                                    str6 = uaa.q(context4, teamSeed2);
                                                }
                                                CupTreeParticipant awayParticipant8 = cupTreeBlock4.getAwayParticipant();
                                                Integer valueOf10 = (awayParticipant8 != null || (teamSeed = awayParticipant8.getTeamSeed()) == null) ? r65 : Integer.valueOf(uaa.p(teamSeed));
                                                Venue venue2 = cupTreeBlock4.getVenue();
                                                String name = (venue2 != null || (stadium2 = venue2.getStadium()) == null) ? r65 : stadium2.getName();
                                                Venue venue3 = cupTreeBlock4.getVenue();
                                                String name2 = (venue3 != null || (city = venue3.getCity()) == null) ? r65 : city.getName();
                                                List<Integer> events = cupTreeBlock4.getEvents();
                                                gv9 W = events == null ? l6g.W(events) : r65;
                                                result = cupTreeBlock4.getResult();
                                                if (result == null) {
                                                    Locale locale2 = Locale.US;
                                                    str7 = i.k(locale2, result, locale2);
                                                } else {
                                                    str7 = r65;
                                                }
                                                if (Intrinsics.c(str7, CupTreeBlock.BLOCK_RESULT_WALKOVER)) {
                                                    String result4 = cupTreeBlock4.getResult();
                                                    if (result4 != null) {
                                                        Locale locale3 = Locale.US;
                                                        str8 = i.k(locale3, result4, locale3);
                                                    } else {
                                                        str8 = r65;
                                                    }
                                                    if (Intrinsics.c(str8, CupTreeBlock.BLOCK_RESULT_RETIRED)) {
                                                        str9 = getContext().getString(R.string.tennis_retired_short);
                                                    } else if (cupTreeBlock4.getHomeTeamScore() != null && cupTreeBlock4.getAwayTeamScore() != null) {
                                                        str10 = r65;
                                                        z5 = z3;
                                                        z6 = z4;
                                                        if (cupTreeRound5.getType() != 1) {
                                                        }
                                                        if (cupTreeRound5.getType() != 1) {
                                                        }
                                                        if (!z5) {
                                                            venue = cupTreeBlock4.getVenue();
                                                            if (((venue != null || (stadium = venue.getStadium()) == null) ? r65 : stadium.getName()) == null) {
                                                                z7 = false;
                                                                gj5Var = new gj5(m, str12, string2, valueOf7, valueOf8, str13, str15, i5, R, R2, z8, finished, eventInProgress, result3, str5, valueOf9, str6, valueOf10, name, name2, W, str10, r53, r54, z7, C.DEFAULT_MUXED_BUFFER_SIZE);
                                                                if (gj5Var.a()) {
                                                                }
                                                                arrayList5.add(gj5Var);
                                                            }
                                                        }
                                                        z7 = true;
                                                        gj5Var = new gj5(m, str12, string2, valueOf7, valueOf8, str13, str15, i5, R, R2, z8, finished, eventInProgress, result3, str5, valueOf9, str6, valueOf10, name, name2, W, str10, r53, r54, z7, C.DEFAULT_MUXED_BUFFER_SIZE);
                                                        if (gj5Var.a()) {
                                                        }
                                                        arrayList5.add(gj5Var);
                                                    } else if (cupTreeBlock4.getEventInProgress()) {
                                                        str9 = getContext().getString(R.string.in_progress);
                                                    } else {
                                                        long seriesStartDateTimestamp = cupTreeBlock4.getSeriesStartDateTimestamp();
                                                        if (seriesStartDateTimestamp > (System.currentTimeMillis() / 1000) - 86400) {
                                                            if (fc6.B(fc6.t(Instant.ofEpochSecond(seriesStartDateTimestamp)))) {
                                                                z5 = z3;
                                                                i6 = getContext().getString(R.string.today);
                                                            } else {
                                                                z5 = z3;
                                                                bi4 bi4Var = bi4.PATTERN_DMM;
                                                                ConcurrentHashMap concurrentHashMap = hk4.a;
                                                                i6 = fc6.i(seriesStartDateTimestamp, hk4.a(bi4Var.d()));
                                                            }
                                                            i6.getClass();
                                                            Context context5 = getContext();
                                                            context5.getClass();
                                                            z6 = z4;
                                                            String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context5) ? "Hm" : "hm");
                                                            bestPattern.getClass();
                                                            str9 = lnb.o(i6, "\n", fc6.i(seriesStartDateTimestamp, hk4.a(bestPattern)));
                                                        } else {
                                                            z5 = z3;
                                                            z6 = z4;
                                                            str9 = r65;
                                                        }
                                                        str10 = str9;
                                                        boolean z10 = cupTreeRound5.getType() != 1 && i15 == 0;
                                                        boolean z11 = cupTreeRound5.getType() != 1 && i15 > 0;
                                                        if (!z5 && !z6) {
                                                            venue = cupTreeBlock4.getVenue();
                                                            if (((venue != null || (stadium = venue.getStadium()) == null) ? r65 : stadium.getName()) == null && cupTreeBlock4.getSeriesStartDateTimestamp() == 0) {
                                                                z7 = false;
                                                                gj5Var = new gj5(m, str12, string2, valueOf7, valueOf8, str13, str15, i5, R, R2, z8, finished, eventInProgress, result3, str5, valueOf9, str6, valueOf10, name, name2, W, str10, z10, z11, z7, C.DEFAULT_MUXED_BUFFER_SIZE);
                                                                if (gj5Var.a()) {
                                                                    hashSet2.add(Integer.valueOf(gj5Var.a));
                                                                }
                                                                arrayList5.add(gj5Var);
                                                            }
                                                        }
                                                        z7 = true;
                                                        gj5Var = new gj5(m, str12, string2, valueOf7, valueOf8, str13, str15, i5, R, R2, z8, finished, eventInProgress, result3, str5, valueOf9, str6, valueOf10, name, name2, W, str10, z10, z11, z7, C.DEFAULT_MUXED_BUFFER_SIZE);
                                                        if (gj5Var.a()) {
                                                        }
                                                        arrayList5.add(gj5Var);
                                                    }
                                                } else {
                                                    str9 = getContext().getString(R.string.tennis_walkover_short);
                                                }
                                                z5 = z3;
                                                z6 = z4;
                                                str10 = str9;
                                                if (cupTreeRound5.getType() != 1) {
                                                }
                                                if (cupTreeRound5.getType() != 1) {
                                                }
                                                if (!z5) {
                                                }
                                                z7 = true;
                                                gj5Var = new gj5(m, str12, string2, valueOf7, valueOf8, str13, str15, i5, R, R2, z8, finished, eventInProgress, result3, str5, valueOf9, str6, valueOf10, name, name2, W, str10, z10, z11, z7, C.DEFAULT_MUXED_BUFFER_SIZE);
                                                if (gj5Var.a()) {
                                                }
                                                arrayList5.add(gj5Var);
                                            }
                                        }
                                        z4 = false;
                                        homeParticipant = cupTreeBlock4.getHomeParticipant();
                                        if (homeParticipant != null) {
                                            Context context6 = getContext();
                                            context6.getClass();
                                            string = tba.A(context6, team7);
                                        }
                                        string = getContext().getString(R.string.label_to_be_determined);
                                        string.getClass();
                                        String str122 = string;
                                        awayParticipant = cupTreeBlock4.getAwayParticipant();
                                        if (awayParticipant != null) {
                                            Context context22 = getContext();
                                            context22.getClass();
                                            string2 = tba.A(context22, team6);
                                        }
                                        string2 = getContext().getString(R.string.label_to_be_determined);
                                        collection3 = collection2;
                                        homeParticipant2 = cupTreeBlock4.getHomeParticipant();
                                        if (!CollectionsKt.R(collection3, (homeParticipant2 != null || (team = homeParticipant2.getTeam()) == null) ? r65 : Integer.valueOf(team.getId()))) {
                                        }
                                        string2 = r65;
                                        CupTreeParticipant homeParticipant62 = cupTreeBlock4.getHomeParticipant();
                                        if (homeParticipant62 != null) {
                                        }
                                        CupTreeParticipant awayParticipant52 = cupTreeBlock4.getAwayParticipant();
                                        if (awayParticipant52 != null) {
                                        }
                                        homeTeamScore = cupTreeBlock4.getHomeTeamScore();
                                        if (homeTeamScore == null) {
                                        }
                                        if (z9) {
                                        }
                                        if (homeTeamScore != null) {
                                        }
                                        String awayTeamScore2 = cupTreeBlock4.getAwayTeamScore();
                                        if (awayTeamScore2 != null) {
                                        }
                                        if (z9) {
                                        }
                                        if (str14 != null) {
                                        }
                                        CupTreeParticipant homeParticipant72 = cupTreeBlock4.getHomeParticipant();
                                        if (homeParticipant72 == null) {
                                        }
                                        bool = Boolean.TRUE;
                                        if (Intrinsics.c(valueOf, bool)) {
                                        }
                                        Collection collection42 = collection2;
                                        CupTreeParticipant homeParticipant82 = cupTreeBlock4.getHomeParticipant();
                                        boolean R3 = CollectionsKt.R(collection42, (homeParticipant82 != null || (team3 = homeParticipant82.getTeam()) == null) ? r65 : Integer.valueOf(team3.getId()));
                                        CupTreeParticipant awayParticipant72 = cupTreeBlock4.getAwayParticipant();
                                        boolean R22 = CollectionsKt.R(collection42, (awayParticipant72 != null || (team2 = awayParticipant72.getTeam()) == null) ? r65 : Integer.valueOf(team2.getId()));
                                        boolean finished2 = cupTreeBlock4.getFinished();
                                        boolean eventInProgress2 = cupTreeBlock4.getEventInProgress();
                                        String result32 = cupTreeBlock4.getResult();
                                        homeParticipant3 = cupTreeBlock4.getHomeParticipant();
                                        if (homeParticipant3 != null) {
                                        }
                                        str5 = r65;
                                        CupTreeParticipant homeParticipant92 = cupTreeBlock4.getHomeParticipant();
                                        if (homeParticipant92 != null) {
                                        }
                                        awayParticipant2 = cupTreeBlock4.getAwayParticipant();
                                        if (awayParticipant2 != null) {
                                        }
                                        str6 = r65;
                                        CupTreeParticipant awayParticipant82 = cupTreeBlock4.getAwayParticipant();
                                        if (awayParticipant82 != null) {
                                        }
                                        Venue venue22 = cupTreeBlock4.getVenue();
                                        if (venue22 != null) {
                                        }
                                        Venue venue32 = cupTreeBlock4.getVenue();
                                        if (venue32 != null) {
                                        }
                                        List<Integer> events2 = cupTreeBlock4.getEvents();
                                        if (events2 == null) {
                                        }
                                        result = cupTreeBlock4.getResult();
                                        if (result == null) {
                                        }
                                        if (Intrinsics.c(str7, CupTreeBlock.BLOCK_RESULT_WALKOVER)) {
                                        }
                                        z5 = z3;
                                        z6 = z4;
                                        str10 = str9;
                                        if (cupTreeRound5.getType() != 1) {
                                        }
                                        if (cupTreeRound5.getType() != 1) {
                                        }
                                        if (!z5) {
                                        }
                                        z7 = true;
                                        gj5Var = new gj5(m, str122, string2, valueOf7, valueOf8, str13, str15, i5, R3, R22, z8, finished2, eventInProgress2, result32, str5, valueOf9, str6, valueOf10, name, name2, W, str10, z10, z11, z7, C.DEFAULT_MUXED_BUFFER_SIZE);
                                        if (gj5Var.a()) {
                                        }
                                        arrayList5.add(gj5Var);
                                    }
                                }
                                z2 = false;
                                cupTree3 = this.f;
                                if (cupTree3 != null) {
                                }
                            } else {
                                collection2 = collection;
                                i4 = intValue;
                                list2 = blocks4;
                                v6aVar = it7;
                            }
                            intValue = i4;
                            collection = collection2;
                            blocks4 = list2;
                            it7 = v6aVar;
                        }
                        int size2 = intValue - arrayList5.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            gj5 gj5Var4 = (gj5) CollectionsKt.j0(arrayList5);
                            arrayList5.add(new gj5(yid.m(gj5Var4 != null ? Integer.valueOf(gj5Var4.a) : r65) + 1, null, null, null, null, null, null, 0, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, false, false, 67108608));
                        }
                        hashSet.clear();
                        hashSet.addAll(hashSet2);
                        CupTree cupTree11 = this.f;
                        if (cupTree11 == null) {
                            Intrinsics.i(str3);
                            throw r65;
                        }
                        List<CupTreeRound> rounds8 = cupTree11.getRounds();
                        Boolean valueOf11 = (rounds8 == null || (cupTreeRound = (CupTreeRound) CollectionsKt.a0(i9, rounds8)) == null) ? r65 : Boolean.valueOf(cupTreeRound.getParticipantDraw());
                        Boolean bool2 = Boolean.TRUE;
                        boolean c = Intrinsics.c(valueOf11, bool2);
                        if (c && y74Var2 != null) {
                            y74Var2.invoke(bool2);
                            Unit unit2 = Unit.a;
                        }
                        arrayList.add(new hj5(cupTreeRound5.getType(), l6g.W(arrayList5), c, cupTreeRound5.getParticipantDraw()));
                        i8 = i9;
                        list = list3;
                        it3 = it4;
                        a0 = set2;
                        typeHeaderView4 = typeHeaderView2;
                    }
                } else {
                    arrayList = r65;
                }
                TypeHeaderView typeHeaderView5 = typeHeaderView4;
                List list4 = arrayList;
                if (arrayList == null) {
                    list4 = km5.a;
                }
                getAdapter().F(list4);
                ConstraintLayout constraintLayout = getTrophyViewBinding().a;
                constraintLayout.getClass();
                hj5 hj5Var = (hj5) CollectionsKt.j0(list4);
                if (hj5Var != null) {
                    i2 = 1;
                    if (hj5Var.a == 1) {
                        i3 = 0;
                        constraintLayout.setVisibility(i3);
                        currentRound = cupTree.getCurrentRound() - i2;
                        Integer valueOf12 = Integer.valueOf(currentRound);
                        if (currentRound >= 0 || currentRound >= list4.size()) {
                            valueOf12 = r65;
                        }
                        int m2 = yid.m(valueOf12);
                        if (i21Var == null) {
                            typeHeaderView = typeHeaderView5;
                            typeHeaderView.setEndContent(new tc3(-124607149, new hl6(27, (Object) this, (Object) i21Var), true));
                        } else {
                            typeHeaderView = typeHeaderView5;
                        }
                        rounds = cupTree.getRounds();
                        if (rounds == null) {
                            ?? arrayList7 = new ArrayList(k13.r(rounds, 10));
                            for (CupTreeRound cupTreeRound6 : rounds) {
                                Context context7 = getContext();
                                context7.getClass();
                                String d = v02.d(context7, cupTreeRound6.getType(), num, str2);
                                if (d == null || d.length() == 0) {
                                    String description = cupTreeRound6.getDescription();
                                    if (description != null) {
                                        Regex regex = d7g.a;
                                        Context context8 = getContext();
                                        context8.getClass();
                                        d = d7g.c(context8, description, str);
                                    } else {
                                        d = r65;
                                    }
                                }
                                if (d == null) {
                                    d = getResources().getString(R.string.round);
                                    d.getClass();
                                }
                                arrayList7.add(d);
                            }
                            km5Var = arrayList7;
                        } else {
                            km5Var = r65;
                        }
                        if (km5Var == null) {
                            km5Var = km5.a;
                        }
                        typeHeaderView.y(km5Var, (String) CollectionsKt.a0(m2, km5Var), Boolean.TRUE);
                        pj5 adapter = getAdapter();
                        ConstraintLayout constraintLayout2 = getTrophyViewBinding().a;
                        constraintLayout2.getClass();
                        g7.o(adapter, constraintLayout2, 6);
                        return;
                    }
                } else {
                    i2 = 1;
                }
                i3 = 8;
                constraintLayout.setVisibility(i3);
                currentRound = cupTree.getCurrentRound() - i2;
                Integer valueOf122 = Integer.valueOf(currentRound);
                if (currentRound >= 0) {
                }
                valueOf122 = r65;
                int m22 = yid.m(valueOf122);
                if (i21Var == null) {
                }
                rounds = cupTree.getRounds();
                if (rounds == null) {
                }
                if (km5Var == null) {
                }
                typeHeaderView.y(km5Var, (String) CollectionsKt.a0(m22, km5Var), Boolean.TRUE);
                pj5 adapter2 = getAdapter();
                ConstraintLayout constraintLayout22 = getTrophyViewBinding().a;
                constraintLayout22.getClass();
                g7.o(adapter2, constraintLayout22, 6);
                return;
            }
        }
        i = 1;
        cupTree2 = this.f;
        if (cupTree2 != null) {
        }
    }

    public final void setExpanded(boolean z) {
        ((eoh) this.isExpanded).setValue(Boolean.valueOf(z));
    }
}
