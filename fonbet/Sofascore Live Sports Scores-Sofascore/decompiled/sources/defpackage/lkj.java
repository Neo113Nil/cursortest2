package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lkj extends w7 {
    @Override // defpackage.w7
    public final View b(Context context, ViewGroup viewGroup, Object obj, View view) {
        Object b;
        zu1 zu1Var = (zu1) obj;
        context.getClass();
        viewGroup.getClass();
        zu1Var.getClass();
        if (view == null || (b = view.getTag()) == null) {
            b = nfc.b(this.d, viewGroup);
        }
        nfc nfcVar = (nfc) b;
        ConstraintLayout constraintLayout = nfcVar.a;
        TextView textView = nfcVar.c;
        String string = context.getString(zu1Var.b);
        string.getClass();
        textView.setText(string);
        if (zu1Var.equals(null)) {
            constraintLayout.getClass();
            z8e.V(context.getColor(R.color.surface_2), constraintLayout);
            textView.setTextColor(context.getColor(R.color.primary_default));
        } else {
            constraintLayout.setBackgroundTintList(null);
            textView.setTextColor(context.getColor(R.color.n_lv_1));
        }
        constraintLayout.getClass();
        w7.a(constraintLayout, nfcVar);
        return constraintLayout;
    }

    @Override // defpackage.w7
    public final View c(Context context, ViewGroup viewGroup, Object obj, View view) {
        Object c0iVar;
        zu1 zu1Var = (zu1) obj;
        context.getClass();
        viewGroup.getClass();
        zu1Var.getClass();
        if (view == null || (c0iVar = view.getTag()) == null) {
            View inflate = this.d.inflate(R.layout.sport_select, viewGroup, false);
            TextView textView = (TextView) nq8.B(R.id.tvTitle, inflate);
            if (textView == null) {
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.tvTitle)));
                return null;
            }
            c0iVar = new c0i((LinearLayout) inflate, textView);
        }
        c0i c0iVar2 = (c0i) c0iVar;
        LinearLayout linearLayout = c0iVar2.a;
        TextView textView2 = c0iVar2.b;
        String string = context.getString(zu1Var.b);
        string.getClass();
        textView2.setText(string);
        linearLayout.getClass();
        w7.a(linearLayout, c0iVar2);
        return linearLayout;
    }

    public final int d(zu1 zu1Var) {
        Iterator it = this.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.c((zu1) it.next(), zu1Var)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
