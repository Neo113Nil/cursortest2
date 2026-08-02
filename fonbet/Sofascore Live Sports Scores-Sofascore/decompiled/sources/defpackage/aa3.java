package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.PinnedTournament;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class aa3 extends p8 {
    public final z82 c;
    public final /* synthetic */ ca3 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aa3(ca3 ca3Var, z82 z82Var) {
        super(r1);
        this.d = ca3Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) z82Var.b;
        constraintLayout.getClass();
        this.c = z82Var;
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        String name;
        PinnedTournament pinnedTournament = (PinnedTournament) obj;
        pinnedTournament.getClass();
        z82 z82Var = this.c;
        ConstraintLayout constraintLayout = (ConstraintLayout) z82Var.b;
        TextView textView = (TextView) z82Var.c;
        constraintLayout.getClass();
        ca3 ca3Var = this.d;
        ArrayList arrayList = ca3Var.i;
        int i3 = i + 1;
        int i4 = 0;
        sea.v(constraintLayout, false, arrayList.size() == i3 || !((CollectionsKt.a0(i3, arrayList) instanceof PinnedTournament) || (CollectionsKt.a0(i + 2, arrayList) instanceof PinnedTournament)), 24, 6, 0, null, 112);
        TextView textView2 = (TextView) z82Var.d;
        FieldTranslations fieldTranslations = pinnedTournament.getFieldTranslations();
        if (fieldTranslations == null || (name = tba.r(fieldTranslations)) == null) {
            name = pinnedTournament.getName();
        }
        textView2.setText(name);
        as9.q((ImageView) z82Var.g, Integer.valueOf(pinnedTournament.getId()), 0, null);
        if (pinnedTournament.getCategory().getId() == c6j.e.a || pinnedTournament.getCategory().getId() == c6j.f.a) {
            textView.setText(tba.q(pinnedTournament.getCategory(), this.b));
            textView.setVisibility(0);
        } else {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        }
        boolean z = ca3Var.x;
        ImageView imageView = (ImageView) z82Var.e;
        if (z) {
            imageView.setImageDrawable(ca3Var.u);
            imageView.setOnTouchListener(new z93(i4, ca3Var, this));
            imageView.setOnClickListener(null);
        } else {
            imageView.setImageDrawable(ca3Var.s);
            imageView.setOnTouchListener(null);
            imageView.setOnClickListener(new qh(12, imageView, ca3Var, pinnedTournament));
        }
    }
}
