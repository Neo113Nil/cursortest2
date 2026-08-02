package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.newNetwork.PregameFormResponse;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v5f extends o8 {
    public static final /* synthetic */ int g = 0;
    public Function0 d;
    public final v82 e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5f(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.bottom_link;
        TextView textView = (TextView) nq8.B(R.id.bottom_link, root);
        if (textView != null) {
            i = R.id.form_rows_container;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.form_rows_container, root);
            if (linearLayout != null) {
                i = R.id.form_spacing_end;
                View B = nq8.B(R.id.form_spacing_end, root);
                if (B != null) {
                    i = R.id.legend_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.legend_container, root);
                    if (constraintLayout != null) {
                        i = R.id.points_column;
                        TextView textView2 = (TextView) nq8.B(R.id.points_column, root);
                        if (textView2 != null) {
                            i = R.id.rank_column;
                            if (((TextView) nq8.B(R.id.rank_column, root)) != null) {
                                i = R.id.team_column;
                                if (((TextView) nq8.B(R.id.team_column, root)) != null) {
                                    i = R.id.title;
                                    TextView textView3 = (TextView) nq8.B(R.id.title, root);
                                    if (textView3 != null) {
                                        this.e = new v82((LinearLayout) root, textView, linearLayout, B, constraintLayout, textView2, textView3);
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
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.prematch_form;
    }

    @Nullable
    public final Function0<Unit> getLinkClickListener() {
        return this.d;
    }

    public final void j() {
        v82 v82Var = this.e;
        ((TextView) v82Var.e).setVisibility(8);
        ((ConstraintLayout) v82Var.b).setVisibility(8);
        Iterator it = new tsk((LinearLayout) v82Var.c).iterator();
        while (true) {
            usk uskVar = (usk) it;
            if (!uskVar.hasNext()) {
                return;
            }
            View view = (View) uskVar.next();
            u5f u5fVar = view instanceof u5f ? (u5f) view : null;
            if (u5fVar != null) {
                e92 e92Var = u5fVar.d;
                ((TextView) e92Var.d).setVisibility(8);
                ((TextView) e92Var.b).setVisibility(8);
            }
        }
    }

    public final void l(PregameFormResponse pregameFormResponse, String str, boolean z) {
        pregameFormResponse.getClass();
        str.getClass();
        if (this.f) {
            return;
        }
        boolean z2 = true;
        this.f = true;
        o8.d(this, z ? 0 : 8, 5);
        Context context = getContext();
        context.getClass();
        u5f u5fVar = new u5f(context);
        Context context2 = getContext();
        context2.getClass();
        u5f u5fVar2 = new u5f(context2);
        boolean z3 = pregameFormResponse.getHomeTeam().getPosition() > pregameFormResponse.getAwayTeam().getPosition();
        ArrayList w0 = CollectionsKt.w0(pregameFormResponse.getAwayTeam().getForm(), pregameFormResponse.getHomeTeam().getForm());
        if (!w0.isEmpty()) {
            Iterator it = w0.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() > 1) {
                    break;
                }
            }
        }
        z2 = false;
        u5fVar.j(z3 ? pregameFormResponse.getAwayTeam() : pregameFormResponse.getHomeTeam(), z2, z);
        u5fVar2.j(z3 ? pregameFormResponse.getHomeTeam() : pregameFormResponse.getAwayTeam(), z2, z);
        v82 v82Var = this.e;
        LinearLayout linearLayout = (LinearLayout) v82Var.c;
        TextView textView = (TextView) v82Var.e;
        linearLayout.addView(u5fVar);
        ((LinearLayout) v82Var.c).addView(u5fVar2);
        TextView textView2 = (TextView) v82Var.d;
        if (z) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
        } else {
            textView2.setText(b.j(Sports.BASKETBALL, Sports.AMERICAN_FOOTBALL, Sports.ICE_HOCKEY, Sports.BASEBALL).contains(str) ? getContext().getString(R.string.pre_game_form) : getContext().getString(R.string.pre_match_form));
            z8e.a0(textView, 1000L, this.d);
        }
        ((TextView) v82Var.g).setText(pregameFormResponse.getLabel());
        LinearLayout linearLayout2 = (LinearLayout) v82Var.h;
        linearLayout2.getClass();
        tgj.p(linearLayout2, 0L, 3);
    }

    public final void setLinkClickListener(@Nullable Function0<Unit> function0) {
        this.d = function0;
    }
}
