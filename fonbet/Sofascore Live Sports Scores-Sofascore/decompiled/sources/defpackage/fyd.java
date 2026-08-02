package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.R;
import com.sofascore.results.event.overs.view.OverBallsContainerView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fyd extends p8 {
    public final zl c;
    public final Function2 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fyd(zl zlVar, t46 t46Var) {
        super(r0);
        t46Var.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) zlVar.b;
        constraintLayout.getClass();
        this.c = zlVar;
        this.d = t46Var;
    }

    public static void d(ArrayList arrayList, ImageView imageView, drc drcVar, z82 z82Var) {
        ConstraintLayout constraintLayout = drcVar.b;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) z82Var.b;
        int size = arrayList.size();
        if (size == 1) {
            imageView.setVisibility(0);
            constraintLayout.setVisibility(8);
            constraintLayout2.setVisibility(8);
            Player player = (Player) arrayList.get(0);
            as9.l(imageView, player != null ? player.getId() : 0, null);
            return;
        }
        if (size == 2) {
            imageView.setVisibility(4);
            constraintLayout.setVisibility(0);
            constraintLayout2.setVisibility(8);
            ImageView imageView2 = drcVar.c;
            Player player2 = (Player) arrayList.get(0);
            as9.l(imageView2, player2 != null ? player2.getId() : 0, null);
            ImageView imageView3 = drcVar.d;
            Player player3 = (Player) arrayList.get(1);
            as9.l(imageView3, player3 != null ? player3.getId() : 0, null);
            return;
        }
        imageView.setVisibility(4);
        constraintLayout.setVisibility(8);
        TextView textView = (TextView) z82Var.d;
        ImageView imageView4 = (ImageView) z82Var.c;
        constraintLayout2.setVisibility(0);
        ImageView imageView5 = (ImageView) z82Var.e;
        Player player4 = (Player) arrayList.get(0);
        as9.l(imageView5, player4 != null ? player4.getId() : 0, null);
        ImageView imageView6 = (ImageView) z82Var.g;
        Player player5 = (Player) arrayList.get(1);
        as9.l(imageView6, player5 != null ? player5.getId() : 0, null);
        ImageView imageView7 = (ImageView) z82Var.f;
        Player player6 = (Player) arrayList.get(2);
        as9.l(imageView7, player6 != null ? player6.getId() : 0, null);
        if (arrayList.size() == 4) {
            imageView4.setVisibility(0);
            textView.setVisibility(8);
            Player player7 = (Player) arrayList.get(3);
            as9.l(imageView4, player7 != null ? player7.getId() : 0, null);
            return;
        }
        if (arrayList.size() > 4) {
            imageView4.setVisibility(8);
            textView.setVisibility(0);
            textView.setText("+" + (arrayList.size() - 3));
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        String format;
        String t;
        String t2;
        q04 q04Var = (q04) obj;
        zl zlVar = this.c;
        ConstraintLayout constraintLayout = (ConstraintLayout) zlVar.m;
        q04Var.getClass();
        List<Incident.CricketIncident> list = q04Var.c;
        String valueOf = String.valueOf(q04Var.b);
        boolean z = q04Var.d;
        String U = StringsKt.U(z ? 1 : 3, valueOf);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Integer totalRuns = ((Incident.CricketIncident) it.next()).getTotalRuns();
            i3 += totalRuns != null ? totalRuns.intValue() : 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Incident.CricketIncident) obj2).getBowler() != null) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Incident.CricketIncident) it2.next()).getBowler());
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            Player player = (Player) next;
            if (hashSet.add(player != null ? Integer.valueOf(player.getId()) : null)) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list) {
            if (((Incident.CricketIncident) obj3).getBatsman() != null) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((Incident.CricketIncident) it4.next()).getBatsman());
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            Player player2 = (Player) next2;
            if (hashSet2.add(player2 != null ? Integer.valueOf(player2.getId()) : null)) {
                arrayList6.add(next2);
            }
        }
        ArrayList arrayList7 = new ArrayList(k13.r(arrayList3, 10));
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            Player player3 = (Player) it6.next();
            if (player3 == null || (t2 = tba.C(player3)) == null) {
                t2 = player3 != null ? tba.t(player3) : null;
            }
            arrayList7.add(t2);
        }
        String f0 = CollectionsKt.f0(arrayList7, " & ", null, null, null, 62);
        ArrayList arrayList8 = new ArrayList(k13.r(arrayList6, 10));
        Iterator it7 = arrayList6.iterator();
        while (it7.hasNext()) {
            Player player4 = (Player) it7.next();
            if (player4 == null || (t = tba.C(player4)) == null) {
                t = player4 != null ? tba.t(player4) : null;
            }
            arrayList8.add(t);
        }
        String f02 = CollectionsKt.f0(arrayList8, " & ", null, null, null, 62);
        constraintLayout.setOnClickListener(new eyd(0, this, q04Var));
        ((TextView) zlVar.j).setText(f0 + " to " + f02);
        TextView textView = (TextView) zlVar.k;
        Context context = this.b;
        if (i3 == 1) {
            format = context.getString(R.string.cricket_one_run);
        } else {
            Locale d = dla.d();
            String string = context.getString(R.string.cricket_runs_format);
            string.getClass();
            format = String.format(d, string, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
        }
        textView.setText(format);
        zlVar.g.setText(z ? context.getString(R.string.cricket_super_over_number, U) : context.getString(R.string.cricket_over_number, U));
        d(arrayList6, (ImageView) zlVar.c, (drc) zlVar.f, (z82) zlVar.l);
        d(arrayList3, (ImageView) zlVar.d, (drc) zlVar.e, (z82) zlVar.h);
        ((OverBallsContainerView) zlVar.n).setup(list);
        ((View) zlVar.i).setVisibility(!q04Var.e ? 0 : 8);
        View view = this.itemView;
        view.getClass();
        sea.v(view, false, q04Var.e, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        constraintLayout.getClass();
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), q04Var.e ? ao2.s(16, context) : 0);
        aba.y(constraintLayout, 0, 3);
    }
}
