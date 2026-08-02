package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e14 extends o8 implements go1 {
    public final z82 d;
    public final int e;
    public final int f;
    public final Drawable g;
    public final Drawable h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e14(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        LinearLayout linearLayout = (LinearLayout) root;
        int i = R.id.table_cricket_note;
        TextView textView = (TextView) nq8.B(R.id.table_cricket_note, root);
        if (textView != null) {
            i = R.id.table_current_run_rate;
            View B = nq8.B(R.id.table_current_run_rate, root);
            if (B != null) {
                cv1 b = cv1.b(B);
                i = R.id.table_inning_score_1;
                View B2 = nq8.B(R.id.table_inning_score_1, root);
                if (B2 != null) {
                    cv1 b2 = cv1.b(B2);
                    i = R.id.table_inning_score_2;
                    View B3 = nq8.B(R.id.table_inning_score_2, root);
                    if (B3 != null) {
                        cv1 b3 = cv1.b(B3);
                        i = R.id.table_target_run_rate;
                        View B4 = nq8.B(R.id.table_target_run_rate, root);
                        if (B4 != null) {
                            this.d = new z82((ViewGroup) linearLayout, textView, (Object) b, (Object) b2, (Object) b3, (Object) cv1.b(B4), 9);
                            this.e = context.getColor(R.color.n_lv_1);
                            this.f = context.getColor(R.color.live);
                            this.g = context.getDrawable(R.drawable.ic_cricket_bat);
                            this.h = context.getDrawable(R.drawable.ic_cricket_ball);
                            o8.d(this, 0, 7);
                            setVisibility(8);
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1  */
    @Override // defpackage.go1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Event event) {
        boolean z;
        boolean z2;
        Integer currentBattingTeamId;
        CricketEvent cricketEvent;
        boolean z3;
        boolean c;
        if (event instanceof CricketEvent) {
            z82 z82Var = this.d;
            TextView textView = (TextView) z82Var.d;
            cv1 cv1Var = (cv1) z82Var.g;
            cv1 cv1Var2 = (cv1) z82Var.f;
            cv1 cv1Var3 = (cv1) z82Var.e;
            cv1 cv1Var4 = (cv1) z82Var.c;
            CricketEvent cricketEvent2 = (CricketEvent) event;
            textView.setText(cricketEvent2.getNote());
            TextView textView2 = (TextView) z82Var.d;
            String note = cricketEvent2.getNote();
            boolean z4 = false;
            boolean z5 = note == null || note.length() == 0;
            setVisibility(!z5 ? 0 : 8);
            textView2.setVisibility(!z5 ? 0 : 8);
            Map<String, String> periods = cricketEvent2.getPeriods();
            if (periods == null || periods.isEmpty() || Intrinsics.c(cricketEvent2.getStatus().getType(), StatusKt.STATUS_NOT_STARTED)) {
                cv1Var4.b.setVisibility(8);
                cv1Var3.b.setVisibility(8);
                return;
            }
            List<String> cricketInningsScore = Event.getHomeScore$default(event, null, 1, null).getCricketInningsScore();
            List<String> cricketInningsScore2 = Event.getAwayScore$default(event, null, 1, null).getCricketInningsScore();
            if (getVisibility() == 8 && cricketInningsScore.isEmpty() && cricketInningsScore2.isEmpty()) {
                return;
            }
            setVisibility(0);
            cv1Var4.b.setVisibility(0);
            if (!cricketInningsScore.isEmpty()) {
                cv1Var4.d.setText(cricketInningsScore.get(0));
                if (cricketInningsScore.size() > 1) {
                    cv1Var3.d.setText(cricketInningsScore.get(1));
                    z = true;
                    if (!cricketInningsScore2.isEmpty()) {
                        cv1Var4.f.setText(cricketInningsScore2.get(0));
                        if (cricketInningsScore2.size() > 1) {
                            cv1Var3.f.setText(cricketInningsScore2.get(1));
                            z2 = true;
                            cv1Var3.b.setVisibility(z2 ? 0 : 8);
                            currentBattingTeamId = cricketEvent2.getCurrentBattingTeamId();
                            int id = Event.getHomeTeam$default(event, null, 1, null).getId();
                            if (currentBattingTeamId != null && id == currentBattingTeamId.intValue()) {
                                cricketEvent = cricketEvent2;
                                z3 = true;
                            } else {
                                cricketEvent = cricketEvent2;
                                z3 = false;
                            }
                            int id2 = Event.getAwayTeam$default(event, null, 1, null).getId();
                            if (currentBattingTeamId != null && id2 == currentBattingTeamId.intValue()) {
                                z4 = true;
                            }
                            c = Intrinsics.c(cricketEvent.getStatus().getType(), StatusKt.STATUS_IN_PROGRESS);
                            j(cv1Var4, c, !z2, z3, z4);
                            boolean z6 = z2;
                            j(cv1Var3, c, z6, z3, z4);
                            if (c || currentBattingTeamId == null) {
                                cv1Var2.b.setVisibility(8);
                                cv1Var.b.setVisibility(8);
                            }
                            int i = z6 ? 2 : 1;
                            Double cricketCurrentRunRate = (z3 ? Event.getHomeScore$default(event, null, 1, null) : Event.getAwayScore$default(event, null, 1, null)).getCricketCurrentRunRate(Integer.valueOf(i));
                            Double cricketTargetRunRate = (z3 ? Event.getHomeScore$default(event, null, 1, null) : Event.getAwayScore$default(event, null, 1, null)).getCricketTargetRunRate(Integer.valueOf(i));
                            l(cv1Var2, cricketCurrentRunRate, R.string.cricket_current_run_rate, z3, z4);
                            l(cv1Var, cricketTargetRunRate, R.string.cricket_target_run_rate, z3, z4);
                            return;
                        }
                    }
                    z2 = z;
                    cv1Var3.b.setVisibility(z2 ? 0 : 8);
                    currentBattingTeamId = cricketEvent2.getCurrentBattingTeamId();
                    int id3 = Event.getHomeTeam$default(event, null, 1, null).getId();
                    if (currentBattingTeamId != null) {
                        cricketEvent = cricketEvent2;
                        z3 = true;
                        int id22 = Event.getAwayTeam$default(event, null, 1, null).getId();
                        if (currentBattingTeamId != null) {
                            z4 = true;
                        }
                        c = Intrinsics.c(cricketEvent.getStatus().getType(), StatusKt.STATUS_IN_PROGRESS);
                        j(cv1Var4, c, !z2, z3, z4);
                        boolean z62 = z2;
                        j(cv1Var3, c, z62, z3, z4);
                        if (c) {
                        }
                        cv1Var2.b.setVisibility(8);
                        cv1Var.b.setVisibility(8);
                    }
                    cricketEvent = cricketEvent2;
                    z3 = false;
                    int id222 = Event.getAwayTeam$default(event, null, 1, null).getId();
                    if (currentBattingTeamId != null) {
                    }
                    c = Intrinsics.c(cricketEvent.getStatus().getType(), StatusKt.STATUS_IN_PROGRESS);
                    j(cv1Var4, c, !z2, z3, z4);
                    boolean z622 = z2;
                    j(cv1Var3, c, z622, z3, z4);
                    if (c) {
                    }
                    cv1Var2.b.setVisibility(8);
                    cv1Var.b.setVisibility(8);
                }
            }
            z = false;
            if (!cricketInningsScore2.isEmpty()) {
            }
            z2 = z;
            cv1Var3.b.setVisibility(z2 ? 0 : 8);
            currentBattingTeamId = cricketEvent2.getCurrentBattingTeamId();
            int id32 = Event.getHomeTeam$default(event, null, 1, null).getId();
            if (currentBattingTeamId != null) {
            }
            cricketEvent = cricketEvent2;
            z3 = false;
            int id2222 = Event.getAwayTeam$default(event, null, 1, null).getId();
            if (currentBattingTeamId != null) {
            }
            c = Intrinsics.c(cricketEvent.getStatus().getType(), StatusKt.STATUS_IN_PROGRESS);
            j(cv1Var4, c, !z2, z3, z4);
            boolean z6222 = z2;
            j(cv1Var3, c, z6222, z3, z4);
            if (c) {
            }
            cv1Var2.b.setVisibility(8);
            cv1Var.b.setVisibility(8);
        }
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.details_table_cricket;
    }

    public final void j(cv1 cv1Var, boolean z, boolean z2, boolean z3, boolean z4) {
        ImageView imageView = cv1Var.c;
        boolean z5 = z && (z3 || z4);
        ImageView imageView2 = cv1Var.e;
        imageView.setVisibility((z5 && z2) ? 0 : 8);
        imageView2.setVisibility((z5 && z2) ? 0 : 8);
        Drawable drawable = this.g;
        Integer num = null;
        Drawable drawable2 = z3 ? drawable : null;
        Drawable drawable3 = this.h;
        if (drawable2 == null) {
            drawable2 = drawable3;
        }
        imageView.setImageDrawable(drawable2);
        if (!z4) {
            drawable = null;
        }
        if (drawable != null) {
            drawable3 = drawable;
        }
        imageView2.setImageDrawable(drawable3);
        TextView textView = cv1Var.d;
        int i = this.f;
        Integer valueOf = Integer.valueOf(i);
        if (!z || !z2 || !z3) {
            valueOf = null;
        }
        int i2 = this.e;
        textView.setTextColor(valueOf != null ? valueOf.intValue() : i2);
        TextView textView2 = cv1Var.f;
        Integer valueOf2 = Integer.valueOf(i);
        if (z && z2 && z4) {
            num = valueOf2;
        }
        if (num != null) {
            i2 = num.intValue();
        }
        textView2.setTextColor(i2);
    }

    public final void l(cv1 cv1Var, Double d, int i, boolean z, boolean z2) {
        ConstraintLayout constraintLayout = cv1Var.b;
        int color = getContext().getColor(R.color.n_lv_3);
        if (d == null) {
            constraintLayout.setVisibility(8);
            return;
        }
        String b = rei.b(2, d);
        TextView textView = cv1Var.f;
        TextView textView2 = cv1Var.d;
        constraintLayout.setVisibility(0);
        textView2.setTextColor(color);
        textView.setTextColor(color);
        textView2.setText(z ? getContext().getString(i, b) : "");
        textView.setText(z2 ? getContext().getString(i, b) : "");
    }
}
