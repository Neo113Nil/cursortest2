package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.divider.MaterialDivider;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageInfo;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.StageStandingsItem;
import com.sofascore.results.R;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r6i extends g7 {
    public final UniqueStage l;
    public Integer m;
    public String n;
    public alf o;
    public boolean p;
    public List q;
    public boolean r;
    public boolean s;
    public List t;
    public Stage u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6i(FragmentActivity fragmentActivity, UniqueStage uniqueStage, Integer num) {
        super(fragmentActivity);
        Boolean bool;
        fragmentActivity.getClass();
        this.l = uniqueStage;
        this.m = num;
        if (uniqueStage != null) {
            joa joaVar = l5i.a;
            bool = Boolean.valueOf(l5i.g(uniqueStage));
        } else {
            bool = null;
        }
        this.o = Intrinsics.c(bool, Boolean.TRUE) ? ta4.c : fwc.b;
        this.q = km5.a;
    }

    public static final boolean H(d8i d8iVar, r6i r6iVar, StageStandingsItem stageStandingsItem, ArrayList arrayList, boolean z) {
        if (!z || d8iVar.d.invoke(r6iVar.b, stageStandingsItem) == null) {
            return false;
        }
        arrayList.add(d8iVar);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x016c, code lost:
    
        if ((r5 != null ? r5.getTime() : null) != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0149, code lost:
    
        if (java.lang.Boolean.valueOf(r6 == null || r6.length() == 0).equals(java.lang.Boolean.TRUE) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015c, code lost:
    
        if ((r5 != null ? r5.getTotalTime() : null) == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016e, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01cc, code lost:
    
        if (defpackage.l5i.i(r13) != false) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0175 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(Stage stage, List list) {
        Integer num;
        boolean z;
        Team team;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        UniqueStage uniqueStage;
        this.t = list;
        this.u = stage;
        if (list == null || stage == null) {
            return;
        }
        StageSeason stageSeason = stage.getStageSeason();
        this.n = (stageSeason == null || (uniqueStage = stageSeason.getUniqueStage()) == null) ? null : uniqueStage.getName();
        DayOfWeek dayOfWeek = hwc.a;
        this.p = hwc.f(stage);
        StageInfo info = stage.getInfo();
        if (info == null || (num = info.getLaps()) == null) {
            num = this.m;
        }
        this.m = num;
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            StageStandingsItem stageStandingsItem = (StageStandingsItem) CollectionsKt.Y(list);
            StageStandingsItem stageStandingsItem2 = (StageStandingsItem) CollectionsKt.a0(1, list);
            boolean z6 = stage.getType() == ServerType.RACE || stage.getType() == ServerType.SPRINT;
            alf alfVar = this.o;
            if (alfVar == ta4.f) {
                H(d8i.r, this, stageStandingsItem, arrayList, true);
            } else if (alfVar == ta4.e) {
                H(d8i.n, this, stageStandingsItem, arrayList, true);
            } else if (alfVar == ta4.d) {
                H(d8i.m, this, stageStandingsItem, arrayList, true);
            } else if (alfVar == ta4.c || alfVar == fwc.b) {
                H(d8i.f, this, stageStandingsItem, arrayList, true);
                d8i d8iVar = d8i.g;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (yid.m(((StageStandingsItem) it.next()).getPitStops()) > 0) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                boolean H = H(d8iVar, this, stageStandingsItem, arrayList, z2);
                H(d8i.h, this, stageStandingsItem, arrayList, true);
                H(d8i.l, this, stageStandingsItem, arrayList, true);
                String gap = stageStandingsItem.getGap();
                if (gap == null || gap.length() == 0) {
                    String gap2 = stageStandingsItem2 != null ? stageStandingsItem2.getGap() : null;
                    if (Boolean.valueOf(gap2 == null || gap2.length() == 0).equals(Boolean.TRUE)) {
                        z3 = false;
                        if (z6) {
                            String interval = stageStandingsItem.getInterval();
                            if (interval == null || interval.length() == 0) {
                                String interval2 = stageStandingsItem2 != null ? stageStandingsItem2.getInterval() : null;
                            }
                            z4 = true;
                            if (stageStandingsItem.getTotalTime() != null) {
                            }
                            if (stageStandingsItem.getTime() != null) {
                            }
                            z5 = false;
                            H(d8i.i, this, stageStandingsItem, arrayList, (!z5 || z3 || Intrinsics.c(this.n, Sports.INDYCAR)) ? false : true);
                            H(d8i.k, this, stageStandingsItem, arrayList, Intrinsics.c(this.n, Sports.NASCAR));
                            d8i d8iVar2 = d8i.j;
                            String lapTime = stageStandingsItem.getLapTime();
                            H(d8iVar2, this, stageStandingsItem, arrayList, !(lapTime != null || lapTime.length() == 0));
                            if (z3) {
                                if (z4 && this.s) {
                                    arrayList.add(d8i.p);
                                } else {
                                    if (!z4) {
                                        if (!H && z5) {
                                            if (!cga.z(this.l)) {
                                                joa joaVar = l5i.a;
                                            }
                                        }
                                        UniqueStage uniqueStage2 = stage.getUniqueStage();
                                        if (Intrinsics.c(uniqueStage2 != null ? Boolean.valueOf(cga.G(uniqueStage2)) : null, Boolean.TRUE)) {
                                            arrayList.add(d8i.o);
                                        } else {
                                            arrayList.add(d8i.q);
                                        }
                                    }
                                    arrayList.add(d8i.o);
                                }
                            }
                            if (z5) {
                                d8i d8iVar3 = (d8i) CollectionsKt.j0(arrayList);
                                Integer num2 = d8iVar3 != null ? d8iVar3.a : null;
                                d8i d8iVar4 = d8i.s;
                                if (!Intrinsics.c(num2, Integer.valueOf(R.string.time)) && (!z3 || !z4)) {
                                    arrayList.add(d8iVar4);
                                }
                            }
                            this.r = !z3 && z4;
                        }
                        z4 = false;
                        if (stageStandingsItem.getTotalTime() != null) {
                        }
                        if (stageStandingsItem.getTime() != null) {
                        }
                        z5 = false;
                        H(d8i.i, this, stageStandingsItem, arrayList, (!z5 || z3 || Intrinsics.c(this.n, Sports.INDYCAR)) ? false : true);
                        H(d8i.k, this, stageStandingsItem, arrayList, Intrinsics.c(this.n, Sports.NASCAR));
                        d8i d8iVar22 = d8i.j;
                        String lapTime2 = stageStandingsItem.getLapTime();
                        H(d8iVar22, this, stageStandingsItem, arrayList, !(lapTime2 != null || lapTime2.length() == 0));
                        if (z3) {
                        }
                        if (z5) {
                        }
                        this.r = !z3 && z4;
                    }
                }
                z3 = true;
                if (z6) {
                }
                z4 = false;
                if (stageStandingsItem.getTotalTime() != null) {
                }
                if (stageStandingsItem.getTime() != null) {
                }
                z5 = false;
                H(d8i.i, this, stageStandingsItem, arrayList, (!z5 || z3 || Intrinsics.c(this.n, Sports.INDYCAR)) ? false : true);
                H(d8i.k, this, stageStandingsItem, arrayList, Intrinsics.c(this.n, Sports.NASCAR));
                d8i d8iVar222 = d8i.j;
                String lapTime22 = stageStandingsItem.getLapTime();
                H(d8iVar222, this, stageStandingsItem, arrayList, !(lapTime22 != null || lapTime22.length() == 0));
                if (z3) {
                }
                if (z5) {
                }
                this.r = !z3 && z4;
            } else if (alfVar == fwc.d) {
                H(d8i.t, this, stageStandingsItem, arrayList, true);
                H(d8i.u, this, stageStandingsItem, arrayList, true);
            } else if (alfVar != fwc.c) {
                zzl.b();
                return;
            } else {
                arrayList.add(d8i.v);
                arrayList.add(d8i.w);
            }
        }
        this.q = arrayList;
        xbb b = a.b();
        if (!list.isEmpty()) {
            List list2 = this.q;
            boolean z7 = this.o == fwc.c;
            String str = this.n;
            boolean z8 = this.r;
            StageStandingsItem stageStandingsItem3 = (StageStandingsItem) CollectionsKt.firstOrNull(list);
            b.add(new n6i(list2, z7, str, z8, (stageStandingsItem3 == null || (team = stageStandingsItem3.getTeam()) == null) ? null : team.getGender()));
            ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                StageStandingsItem stageStandingsItem4 = (StageStandingsItem) it2.next();
                List list3 = this.q;
                alf alfVar2 = this.o;
                joa joaVar2 = l5i.a;
                arrayList2.add(new o6i(stageStandingsItem4, list3, alfVar2, l5i.b(stage)));
            }
            if (this.o == fwc.d) {
                b.addAll(CollectionsKt.H0(arrayList2, new q6i(0)));
            } else {
                b.addAll(arrayList2);
            }
            if (!list.isEmpty()) {
                Iterator it3 = list.iterator();
                if (!it3.hasNext()) {
                    yhk.d();
                    return;
                }
                Long valueOf = Long.valueOf(yid.n(((StageStandingsItem) it3.next()).getUpdatedAtTimestamp()));
                while (it3.hasNext()) {
                    Long valueOf2 = Long.valueOf(yid.n(((StageStandingsItem) it3.next()).getUpdatedAtTimestamp()));
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
                if (valueOf.longValue() <= 0 && !this.p) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    b.add(new p6i(Long.valueOf(valueOf.longValue()), this.p));
                }
            }
            List list4 = this.q;
            if (list4 == null || !list4.isEmpty()) {
                Iterator it4 = list4.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (((d8i) it4.next()).b != null) {
                        List list5 = this.q;
                        boolean contains = list5.contains(d8i.f);
                        if (!list.isEmpty()) {
                            Iterator it5 = list.iterator();
                            while (it5.hasNext()) {
                                if (Intrinsics.c(((StageStandingsItem) it5.next()).getStartedFromPit(), Boolean.TRUE)) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        b.add(new l6i(list5, Boolean.valueOf(z & contains).equals(Boolean.TRUE) ? a.c(new Pair(Integer.valueOf(R.string.motorsport_pit_lane_short), Integer.valueOf(R.string.motorsport_legend_pit_lane_start))) : null, this.o == fwc.c));
                    }
                }
            }
        }
        F(a.a(b));
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        m6i m6iVar = (m6i) obj;
        return (m6iVar instanceof o6i) && !((o6i) m6iVar).a.getTeam().getDisabled();
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        m6i m6iVar = (m6i) obj;
        m6iVar.getClass();
        if (m6iVar instanceof n6i) {
            return 0;
        }
        if (m6iVar instanceof p6i) {
            return 2;
        }
        return m6iVar instanceof l6i ? 3 : 1;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = this.b;
        if (i == 0) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.stage_sport_sections_row, viewGroup, false);
            int i2 = R.id.column_container;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.column_container, inflate);
            if (linearLayout != null) {
                i2 = R.id.driver;
                TextView textView = (TextView) nq8.B(R.id.driver, inflate);
                if (textView != null) {
                    i2 = R.id.pos;
                    if (((TextView) nq8.B(R.id.pos, inflate)) != null) {
                        return new u6i(new z3f((ConstraintLayout) inflate, linearLayout, textView, 8), new k6i(this, 0), new g2i(this, 7));
                    }
                }
            }
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            return null;
        }
        int i3 = R.id.container;
        if (i != 1) {
            if (i == 2) {
                return new s6i(u22.a(LayoutInflater.from(context), viewGroup), 0);
            }
            if (i != 3) {
                a70.p(ljg.j(i, "Unknown view type: "));
                return null;
            }
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.item_moto_legend, viewGroup, false);
            LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.container, inflate2);
            if (linearLayout2 != null) {
                i3 = R.id.expand_image;
                ImageView imageView = (ImageView) nq8.B(R.id.expand_image, inflate2);
                if (imageView != null) {
                    i3 = R.id.full_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.full_container, inflate2);
                    if (constraintLayout != null) {
                        i3 = R.id.legend_label;
                        if (((TextView) nq8.B(R.id.legend_label, inflate2)) != null) {
                            return new pq5(new ez0((FrameLayout) inflate2, linearLayout2, imageView, constraintLayout));
                        }
                    }
                }
            }
            yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
            return null;
        }
        View inflate3 = LayoutInflater.from(context).inflate(R.layout.item_stage_result_row, viewGroup, false);
        LinearLayout linearLayout3 = (LinearLayout) nq8.B(R.id.container, inflate3);
        if (linearLayout3 != null) {
            i3 = R.id.divider;
            MaterialDivider materialDivider = (MaterialDivider) nq8.B(R.id.divider, inflate3);
            if (materialDivider != null) {
                i3 = R.id.driver_indicator;
                View B = nq8.B(R.id.driver_indicator, inflate3);
                if (B != null) {
                    i3 = R.id.driver_name_text;
                    TextView textView2 = (TextView) nq8.B(R.id.driver_name_text, inflate3);
                    if (textView2 != null) {
                        i3 = R.id.position_change_text;
                        TextView textView3 = (TextView) nq8.B(R.id.position_change_text, inflate3);
                        if (textView3 != null) {
                            i3 = R.id.position_text;
                            TextView textView4 = (TextView) nq8.B(R.id.position_text, inflate3);
                            if (textView4 != null) {
                                i3 = R.id.shirt_image;
                                ImageButton imageButton = (ImageButton) nq8.B(R.id.shirt_image, inflate3);
                                if (imageButton != null) {
                                    i3 = R.id.team_name_text;
                                    TextView textView5 = (TextView) nq8.B(R.id.team_name_text, inflate3);
                                    if (textView5 != null) {
                                        return new v6i(new bv1((ConstraintLayout) inflate3, linearLayout3, materialDivider, B, textView2, textView3, textView4, imageButton, textView5), this.l, this.m, new k6i(this, 1), new k6i(this, 2));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i3)));
        return null;
    }
}
