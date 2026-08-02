package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.sofascore.results.R;
import com.sofascore.results.event.lineups.view.RugbyLineupsFieldView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q9g extends o8 {
    public final z3f d;
    public Function1 e;

    public q9g(Context context) {
        super(context, null, 0);
        View root = getRoot();
        int i = R.id.rugby_lineups_field_away;
        RugbyLineupsFieldView rugbyLineupsFieldView = (RugbyLineupsFieldView) nq8.B(R.id.rugby_lineups_field_away, root);
        if (rugbyLineupsFieldView != null) {
            i = R.id.rugby_lineups_field_home;
            RugbyLineupsFieldView rugbyLineupsFieldView2 = (RugbyLineupsFieldView) nq8.B(R.id.rugby_lineups_field_home, root);
            if (rugbyLineupsFieldView2 != null) {
                this.d = new z3f(4, rugbyLineupsFieldView2, (LinearLayout) root, rugbyLineupsFieldView);
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.rugby_lineups_list_item;
    }

    @Nullable
    public final Function1<Integer, Unit> getPlayerClickListener() {
        return this.e;
    }

    public final void setPlayerClickListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.e = function1;
        z3f z3fVar = this.d;
        ((RugbyLineupsFieldView) z3fVar.d).setPlayerClickListener(function1);
        ((RugbyLineupsFieldView) z3fVar.c).setPlayerClickListener(function1);
    }
}
