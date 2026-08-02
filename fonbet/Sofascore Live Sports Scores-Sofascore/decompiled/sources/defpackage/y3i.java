package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ironsource.L6;
import com.sofascore.model.mvvm.model.CyclingStageType;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageInfo;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.StageStandingsItem;
import com.sofascore.model.newNetwork.StageStandingsResponse;
import com.sofascore.results.R;
import com.sofascore.results.stagesport.fragments.details.StageDetailsResultsFragment;
import java.time.DayOfWeek;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class y3i implements d5k, lt8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageDetailsResultsFragment b;

    public /* synthetic */ y3i(StageDetailsResultsFragment stageDetailsResultsFragment, int i) {
        this.a = i;
        this.b = stageDetailsResultsFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [km5] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    @Override // defpackage.d5k
    public final void a(int i, String str) {
        w3i valueOf;
        ?? r4;
        Object obj;
        int i2;
        CharSequence a;
        String str2;
        String str3;
        String str4;
        CyclingStageType stageType;
        int i3;
        Float raceDistance;
        x2g x2gVar;
        StageStandingsResponse stageStandingsResponse;
        x2g x2gVar2;
        StageStandingsResponse stageStandingsResponse2;
        int i4 = this.a;
        r3 = null;
        r3 = null;
        List<StageStandingsItem> list = null;
        StageDetailsResultsFragment stageDetailsResultsFragment = this.b;
        str.getClass();
        switch (i4) {
            case 0:
                String selectedItem = stageDetailsResultsFragment.E().e.getSelectedItem();
                if (selectedItem == null || (valueOf = w3i.valueOf(selectedItem)) == null) {
                    return;
                }
                List list2 = (List) stageDetailsResultsFragment.C().o.d();
                if (list2 != null) {
                    r4 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (CollectionsKt.R(valueOf.b, ((Stage) obj2).getType())) {
                            r4.add(obj2);
                        }
                    }
                } else {
                    r4 = km5.a;
                }
                Iterator it = r4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (str.equals(stageDetailsResultsFragment.F((Stage) obj))) {
                        }
                    } else {
                        obj = null;
                    }
                }
                Stage stage = (Stage) obj;
                if (stage == null) {
                    return;
                }
                stageDetailsResultsFragment.G().n = stage;
                stageDetailsResultsFragment.G().n();
                if (stage.getType() != ServerType.RACE && stage.getType() != ServerType.STAGE) {
                    stageDetailsResultsFragment.K(stage, km5.a);
                }
                joa joaVar = l5i.a;
                if (l5i.f(stage)) {
                    e92 e92Var = stageDetailsResultsFragment.E().b;
                    TextView textView = (TextView) e92Var.f;
                    ImageView imageView = (ImageView) e92Var.c;
                    TextView textView2 = (TextView) e92Var.d;
                    TextView textView3 = (TextView) e92Var.b;
                    long startDateTimestamp = stage.getStartDateTimestamp();
                    bi4 bi4Var = bi4.PATTERN_DMMHHSS;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    String format = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(startDateTimestamp));
                    format.getClass();
                    textView.setText(format);
                    StageInfo info = stage.getInfo();
                    String departureCity = info != null ? info.getDepartureCity() : null;
                    StageInfo info2 = stage.getInfo();
                    String arrivalCity = info2 != null ? info2.getArrivalCity() : null;
                    if (departureCity == null || arrivalCity == null) {
                        str2 = null;
                    } else {
                        Context requireContext = stageDetailsResultsFragment.requireContext();
                        requireContext.getClass();
                        str2 = hkg.c0(requireContext) ? lnb.o(arrivalCity, " < ", departureCity) : lnb.o(departureCity, " > ", arrivalCity);
                    }
                    haa.N(textView3, str2);
                    StageInfo info3 = stage.getInfo();
                    if (info3 == null || (raceDistance = info3.getRaceDistance()) == null) {
                        str3 = null;
                    } else {
                        float floatValue = raceDistance.floatValue();
                        String string = stageDetailsResultsFragment.getString(R.string.cycling_stage_length);
                        Context requireContext2 = stageDetailsResultsFragment.requireContext();
                        requireContext2.getClass();
                        str3 = wv8.i(string, " ", v7a.r(requireContext2, floatValue));
                    }
                    StageInfo info4 = stage.getInfo();
                    if (info4 == null || (stageType = info4.getStageType()) == null) {
                        str4 = null;
                    } else {
                        String string2 = stageDetailsResultsFragment.getString(R.string.cycling_stage_type);
                        int i5 = k5i.b[stageType.ordinal()];
                        if (i5 == 1) {
                            i3 = R.string.cycling_stage_type_flat;
                        } else if (i5 == 2) {
                            i3 = R.string.cycling_stage_type_hilly;
                        } else if (i5 == 3) {
                            i3 = R.string.cycling_stage_type_time_trial;
                        } else {
                            if (i5 != 4) {
                                zzl.b();
                                return;
                            }
                            i3 = R.string.cycling_stage_type_mountain;
                        }
                        str4 = wv8.i(string2, " ", stageDetailsResultsFragment.getString(i3));
                    }
                    if (str3 != null && str4 != null) {
                        str3 = stageDetailsResultsFragment.getString(R.string.bullet_separator, str3, str4);
                    } else if (str3 == null) {
                        str3 = str4 == null ? null : str4;
                    }
                    haa.N(textView2, str3);
                    Context requireContext3 = stageDetailsResultsFragment.requireContext();
                    requireContext3.getClass();
                    StageInfo info5 = stage.getInfo();
                    imageView.setImageDrawable(o3a.G(requireContext3, info5 != null ? info5.getWeather() : null));
                    ((ConstraintLayout) e92Var.e).setVisibility((textView3.getVisibility() == 0 || textView2.getVisibility() == 0 || imageView.getDrawable() != null) ? 0 : 8);
                    stageDetailsResultsFragment.E().j.setVisibility(8);
                    i2 = 0;
                } else {
                    TextView textView4 = stageDetailsResultsFragment.E().j;
                    DayOfWeek dayOfWeek = hwc.a;
                    textView4.setSelected(hwc.f(stage));
                    TextView textView5 = stageDetailsResultsFragment.E().j;
                    if (hwc.f(stage)) {
                        String string3 = stageDetailsResultsFragment.getString(R.string.standings_live);
                        Context requireContext4 = stageDetailsResultsFragment.requireContext();
                        requireContext4.getClass();
                        a = stageDetailsResultsFragment.getString(R.string.bullet_separator, string3, hwc.a(requireContext4, stage));
                        i2 = 0;
                    } else if (Intrinsics.c(stage.getStatusType(), StatusKt.STATUS_CANCELED)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        Context requireContext5 = stageDetailsResultsFragment.requireContext();
                        requireContext5.getClass();
                        i2 = 0;
                        a = spannableStringBuilder.append(hwc.a(requireContext5, stage), new StrikethroughSpan(), 0);
                    } else {
                        i2 = 0;
                        if (stage.getType() != ServerType.AFTER_STAGE || stage.getSequence() == null) {
                            Context requireContext6 = stageDetailsResultsFragment.requireContext();
                            requireContext6.getClass();
                            a = hwc.a(requireContext6, stage);
                        } else {
                            Context requireContext7 = stageDetailsResultsFragment.requireContext();
                            requireContext7.getClass();
                            a = wv8.i(hwc.a(requireContext7, stage), " - ", stageDetailsResultsFragment.getString(R.string.motorsport_wrc_results_after_stage_x, stage.getSequence()));
                        }
                    }
                    haa.N(textView5, a);
                }
                TextView textView6 = stageDetailsResultsFragment.E().i;
                DayOfWeek dayOfWeek2 = hwc.a;
                textView6.setVisibility(Intrinsics.c(stage.getStatusType(), StatusKt.STATUS_CANCELED) ? i2 : 8);
                stageDetailsResultsFragment.L(stage);
                return;
            case 1:
                ta4 valueOf2 = ta4.valueOf(str);
                r6i r6iVar = stageDetailsResultsFragment.v;
                if (r6iVar == null) {
                    Intrinsics.i(L6.G1);
                    throw null;
                }
                if (r6iVar.o != valueOf2) {
                    stageDetailsResultsFragment.G();
                    b4i b4iVar = (b4i) stageDetailsResultsFragment.G().p.d();
                    List<StageStandingsItem> standings = (b4iVar == null || (x2gVar = b4iVar.a) == null || (stageStandingsResponse = (StageStandingsResponse) yaa.x(x2gVar)) == null) ? null : stageStandingsResponse.getStandings();
                    if (standings == null) {
                        standings = km5.a;
                    }
                    ArrayList k = g4i.k(standings, valueOf2);
                    r6i r6iVar2 = stageDetailsResultsFragment.v;
                    if (r6iVar2 == null) {
                        Intrinsics.i(L6.G1);
                        throw null;
                    }
                    r6iVar2.o = valueOf2;
                    r6iVar2.G(stageDetailsResultsFragment.G().n, k);
                    return;
                }
                return;
            default:
                r6i r6iVar3 = stageDetailsResultsFragment.v;
                if (r6iVar3 == null) {
                    Intrinsics.i(L6.G1);
                    throw null;
                }
                fwc valueOf3 = fwc.valueOf(str);
                valueOf3.getClass();
                r6iVar3.o = valueOf3;
                r6i r6iVar4 = stageDetailsResultsFragment.v;
                if (r6iVar4 == null) {
                    Intrinsics.i(L6.G1);
                    throw null;
                }
                b4i b4iVar2 = (b4i) stageDetailsResultsFragment.G().p.d();
                if (b4iVar2 != null && (x2gVar2 = b4iVar2.a) != null && (stageStandingsResponse2 = (StageStandingsResponse) yaa.x(x2gVar2)) != null) {
                    list = stageStandingsResponse2.getStandings();
                }
                if (list == null) {
                    list = km5.a;
                }
                r6iVar4.G(stageDetailsResultsFragment.G().n, list);
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof d5k) && (obj instanceof lt8)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof d5k) && (obj instanceof lt8)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof d5k) && (obj instanceof lt8)) {
                    break;
                }
                break;
        }
        return Intrinsics.c(getFunctionDelegate(), ((lt8) obj).getFunctionDelegate());
    }

    @Override // defpackage.lt8
    public final dt8 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new ot8(2, 0, StageDetailsResultsFragment.class, this.b, "onSubStageSelected", "onSubStageSelected(Ljava/lang/String;I)V");
            case 1:
                return new ot8(2, 0, StageDetailsResultsFragment.class, this.b, "onCyclingResultTypeSelected", "onCyclingResultTypeSelected(Ljava/lang/String;I)V");
            default:
                return new ot8(2, 0, StageDetailsResultsFragment.class, this.b, "onMotoResultTypeSelected", "onMotoResultTypeSelected(Ljava/lang/String;I)V");
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
