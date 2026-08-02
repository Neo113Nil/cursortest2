package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.newNetwork.ESportCharacter;
import com.sofascore.results.R;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cg5 extends o8 {
    public final ez0 d;
    public final List e;
    public final List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg5(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.ban_row_1;
        View B = nq8.B(R.id.ban_row_1, root);
        if (B != null) {
            v82 a = v82.a(B);
            i = R.id.ban_row_2;
            View B2 = nq8.B(R.id.ban_row_2, root);
            if (B2 != null) {
                v82 a2 = v82.a(B2);
                i = R.id.ban_row_3;
                View B3 = nq8.B(R.id.ban_row_3, root);
                if (B3 != null) {
                    v82 a3 = v82.a(B3);
                    i = R.id.section_title;
                    if (((TextView) nq8.B(R.id.section_title, root)) != null) {
                        this.d = new ez0((ConstraintLayout) root, a, a2, a3, 7);
                        List j = b.j((jq5) a.e, (jq5) a.h, (jq5) a.c, (jq5) a2.e, (jq5) a2.h, (jq5) a2.c, (jq5) a3.e, (jq5) a3.h, (jq5) a3.c);
                        this.e = j;
                        this.f = b.j((jq5) a.f, (jq5) a.g, (jq5) a.d, (jq5) a2.f, (jq5) a2.g, (jq5) a2.d, (jq5) a3.f, (jq5) a3.g, (jq5) a3.d);
                        setVisibility(8);
                        o8.d(this, 0, 7);
                        Iterator it = j.iterator();
                        while (it.hasNext()) {
                            ((jq5) it.next()).b.setVisibility(8);
                        }
                        Iterator it2 = this.f.iterator();
                        while (it2.hasNext()) {
                            ((jq5) it2.next()).b.setVisibility(8);
                        }
                        return;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    public static void j(List list, List list2, boolean z) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            jq5 jq5Var = (jq5) obj;
            ConstraintLayout constraintLayout = jq5Var.a;
            ImageView imageView = jq5Var.c;
            Float valueOf = z ? Float.valueOf(1.0f) : null;
            constraintLayout.setScaleX(valueOf != null ? valueOf.floatValue() : -1.0f);
            ESportCharacter eSportCharacter = (ESportCharacter) CollectionsKt.a0(i, list2);
            ConstraintLayout constraintLayout2 = jq5Var.a;
            if (eSportCharacter != null) {
                constraintLayout2.setVisibility(0);
                String y = pco.y(eSportCharacter.getId());
                apf a = ajh.a(imageView.getContext());
                ht9 ht9Var = new ht9(imageView.getContext());
                ht9Var.c = y;
                vt9.f(ht9Var, imageView);
                awj[] awjVarArr = {new urh()};
                sl6 sl6Var = st9.a;
                st9.b(ht9Var, ph0.X(awjVarArr));
                ht9Var.e = new de0(jq5Var, 18);
                a.a(ht9Var.a());
            } else {
                constraintLayout2.setVisibility(8);
                imageView.setImageResource(R.drawable.player_photo_placeholder);
                jq5Var.b.setVisibility(8);
            }
            i = i2;
        }
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.esports_ban_phase_layout;
    }
}
