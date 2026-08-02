package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v74 extends g7 {
    public final LayoutInflater l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v74(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        fragmentActivity.getClass();
        LayoutInflater from = LayoutInflater.from(fragmentActivity);
        from.getClass();
        this.l = from;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g7
    public final void F(List list) {
        ArrayList k = me4.k(list);
        if (list.isEmpty()) {
            k.add(new j29(null, null, null, 511));
        } else {
            k.addAll(list);
            k.add(new CustomizableDivider(false, 0, false, null, 14, null));
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            k.add(new CustomizableDivider(objArr, objArr2, false, null, 14, null));
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            k.add(new CustomizableDivider(objArr3, objArr4, false, null, 14, null));
        }
        super.F(k);
    }

    @Override // defpackage.ysk
    public final Integer a(int i) {
        if (i == 1) {
            return Integer.valueOf(R.id.card_content);
        }
        return null;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return i == 1;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof y21) {
            return 1;
        }
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof CustomizableDivider) {
            return 3;
        }
        if (obj instanceof j29) {
            return 4;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.l;
        if (i == 1) {
            return new ir1(bcb.a(layoutInflater, viewGroup), false, false, (sl6) null, 0, 26);
        }
        if (i == 3) {
            return new wh(new SofaDivider(this.b, null, 6));
        }
        if (i != 4) {
            ilg.c();
            return null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) v82.g(layoutInflater, viewGroup).b;
        constraintLayout.getClass();
        return new wh(constraintLayout);
    }
}
