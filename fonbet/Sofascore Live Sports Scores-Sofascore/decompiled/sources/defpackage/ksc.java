package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import com.sofascore.results.event.mmastatistics.view.MmaStatsHeadDualView;
import com.sofascore.results.event.mmastatistics.view.MmaStatsLegsDualView;
import com.sofascore.results.event.mmastatistics.view.MmaStatsTorsoDualView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ksc extends o8 {
    public final ez0 d;
    public Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksc(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.all_statistics_button;
        TextView textView = (TextView) nq8.B(R.id.all_statistics_button, root);
        if (textView != null) {
            i = R.id.body_head;
            MmaStatsHeadDualView mmaStatsHeadDualView = (MmaStatsHeadDualView) nq8.B(R.id.body_head, root);
            if (mmaStatsHeadDualView != null) {
                i = R.id.body_legs;
                MmaStatsLegsDualView mmaStatsLegsDualView = (MmaStatsLegsDualView) nq8.B(R.id.body_legs, root);
                if (mmaStatsLegsDualView != null) {
                    i = R.id.body_torso;
                    MmaStatsTorsoDualView mmaStatsTorsoDualView = (MmaStatsTorsoDualView) nq8.B(R.id.body_torso, root);
                    if (mmaStatsTorsoDualView != null) {
                        this.d = new ez0((LinearLayout) root, textView, mmaStatsHeadDualView, mmaStatsLegsDualView, mmaStatsTorsoDualView);
                        setVisibility(8);
                        o8.d(this, 0, 7);
                        textView.setOnClickListener(new cd5(this, 21));
                        l(mmaStatsHeadDualView, "head");
                        l(mmaStatsTorsoDualView, "body");
                        l(mmaStatsLegsDualView, "legs");
                        return;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    public static void j(y5 y5Var, b46 b46Var) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList;
        List list = (List) b46Var.a.get(zqc.TOTAL);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (((trc) obj2).a.equals("significant_strikes")) {
                        break;
                    }
                }
            }
            trc trcVar = (trc) obj2;
            if (trcVar != null) {
                Iterator it2 = trcVar.b.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    } else {
                        obj3 = it2.next();
                        if (Intrinsics.c(((src) obj3).a, y5Var.getGroupTag())) {
                            break;
                        }
                    }
                }
                src srcVar = (src) obj3;
                if (srcVar == null || (arrayList = srcVar.b) == null) {
                    return;
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (((yqc) next).a.equals(y5Var.getTag())) {
                        obj = next;
                        break;
                    }
                }
                yqc yqcVar = (yqc) obj;
                if (yqcVar != null) {
                    y5Var.setStatisticData(yqcVar);
                }
            }
        }
    }

    public static void l(y5 y5Var, String str) {
        y5Var.s("strikes_by_zones", str);
        y5Var.setStatisticsMode(jrc.c);
        y5Var.setDisplayMode(rrc.a);
    }

    @Nullable
    public final Function0<Unit> getAllStatisticsClickListener() {
        return this.e;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_strike_zones_full_view;
    }

    public final void setAllStatisticsClickListener(@Nullable Function0<Unit> function0) {
        this.e = function0;
    }

    public final void setStatisticData(@NotNull b46 b46Var) {
        b46Var.getClass();
        setVisibility(!b46Var.a.isEmpty() ? 0 : 8);
        ez0 ez0Var = this.d;
        j((MmaStatsHeadDualView) ez0Var.c, b46Var);
        j((MmaStatsTorsoDualView) ez0Var.e, b46Var);
        j((MmaStatsLegsDualView) ez0Var.d, b46Var);
    }
}
