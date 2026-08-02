package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Money;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class exe extends p8 {
    public final mvj c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public exe(mvj mvjVar, boolean z) {
        super(r0);
        ConstraintLayout constraintLayout = mvjVar.b;
        constraintLayout.getClass();
        this.c = mvjVar;
        this.d = z;
        this.e = this.b.getColor(R.color.n_lv_1);
        this.f = this.b.getColor(R.color.n_lv_3);
        this.g = this.b.getColor(R.color.primary_default);
        if (z) {
            constraintLayout.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            constraintLayout.setBackgroundTintList(ColorStateList.valueOf(this.b.getColor(R.color.surface_2)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r12v10, types: [int] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        lvj lvjVar = (lvj) obj;
        lvjVar.getClass();
        List list = lvjVar.a;
        pvj pvjVar = lvjVar.b;
        Transfer transfer = (Transfer) CollectionsKt.Y(list);
        mvj mvjVar = this.c;
        ConstraintLayout constraintLayout = mvjVar.b;
        LinearLayout linearLayout = mvjVar.c;
        TextView textView = mvjVar.d;
        constraintLayout.getClass();
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Context context = this.b;
        marginLayoutParams.topMargin = ao2.s(i == 0 ? 12 : 4, context);
        constraintLayout.setLayoutParams(marginLayoutParams);
        ImageView imageView = mvjVar.e;
        Player player = transfer.getPlayer();
        boolean z = false;
        as9.l(imageView, player != null ? player.getId() : 0, null);
        TextView textView2 = mvjVar.f;
        Player player2 = transfer.getPlayer();
        textView2.setText(player2 != null ? tba.t(player2) : null);
        boolean z2 = this.d;
        textView.setTextColor(z2 ? this.e : pvjVar == pvj.b ? this.g : this.f);
        textView.setText(uxf.E(transfer.getPlayer() != null ? r0.getUserCount() : 0L, 58, false));
        linearLayout.removeAllViews();
        for (Transfer transfer2 : lvjVar.a) {
            jvj jvjVar = new jvj(context);
            transfer2.getClass();
            pvjVar.getClass();
            int color = jvjVar.getContext().getColor(R.color.n_lv_1);
            int color2 = jvjVar.getContext().getColor(R.color.n_lv_3);
            int color3 = jvjVar.getContext().getColor(R.color.primary_default);
            boolean o = c.o(transfer2.getFromTeamName(), "Ban", z);
            djf djfVar = jvjVar.d;
            if (o) {
                ((ImageView) djfVar.d).setImageResource(R.drawable.ic_block);
            } else {
                ImageView imageView2 = (ImageView) djfVar.d;
                Team transferFrom = transfer2.getTransferFrom();
                as9.o(imageView2, transferFrom != null ? transferFrom.getId() : z);
            }
            if (c.o(transfer2.getToTeamName(), "Ban", z)) {
                ((ImageView) djfVar.e).setImageResource(R.drawable.ic_block);
            } else {
                ImageView imageView3 = (ImageView) djfVar.e;
                Team transferTo = transfer2.getTransferTo();
                as9.o(imageView3, transferTo != null ? transferTo.getId() : z);
            }
            TextView textView3 = (TextView) djfVar.c;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) djfVar.b;
            TextView textView4 = (TextView) djfVar.g;
            if (!z2) {
                color = pvjVar == pvj.c ? color3 : color2;
            }
            textView3.setTextColor(color);
            Integer valueOf = Integer.valueOf(color3);
            if (pvjVar != pvj.d || z2) {
                valueOf = null;
            }
            if (valueOf != null) {
                color2 = valueOf.intValue();
            }
            textView4.setTextColor(color2);
            Money transferFeeRaw = transfer2.getTransferFeeRaw();
            ?? value = transferFeeRaw != null ? transferFeeRaw.getValue() : z;
            TextView textView5 = (TextView) djfVar.c;
            if (value > 0) {
                Set set = o84.a;
                Context context2 = jvjVar.getContext();
                context2.getClass();
                Money transferFeeRaw2 = transfer2.getTransferFeeRaw();
                transferFeeRaw2.getClass();
                textView5.setText(o84.a(context2, transferFeeRaw2, transfer2.getTransferDateTimestamp(), 8));
            } else {
                Context context3 = jvjVar.getContext();
                context3.getClass();
                textView5.setText(v8a.y(context3, transfer2.getTransferFeeDescription()));
            }
            long transferDateTimestamp = transfer2.getTransferDateTimestamp();
            bi4 bi4Var = bi4.PATTERN_DMMY;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            fn0.u(transferDateTimestamp, hk4.a(bi4Var.d()), textView4);
            TextView textView6 = (TextView) djfVar.f;
            Integer type = transfer2.getType();
            int intValue = type != null ? type.intValue() : 0;
            Context context4 = jvjVar.getContext();
            context4.getClass();
            textView6.setText(v8a.B(intValue, true, context4));
            constraintLayout2.getClass();
            aba.y(constraintLayout2, 0, 3);
            constraintLayout2.setOnClickListener(new ivj(0, jvjVar, transfer2));
            linearLayout.addView(jvjVar);
            z = false;
        }
    }
}
