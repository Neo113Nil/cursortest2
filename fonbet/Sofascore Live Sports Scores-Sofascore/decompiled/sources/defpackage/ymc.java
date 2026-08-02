package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.sofascore.results.R;
import com.sofascore.results.mma.fightNight.view.MmaFightNightItem;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ymc extends g7 {
    public final g08 l;
    public final boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymc(Context context, g08 g08Var, boolean z) {
        super(context);
        context.getClass();
        this.l = g08Var;
        this.m = z;
    }

    @Override // defpackage.ysk
    public final Integer a(int i) {
        return Integer.valueOf(R.id.mma_fight_night_root);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 25);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        return 1;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = hkg.S(this.b).inflate(R.layout.viewholder_mma_fight_night_item, viewGroup, false);
        if (inflate != null) {
            MmaFightNightItem mmaFightNightItem = (MmaFightNightItem) inflate;
            return new vh(this, new rvk(mmaFightNightItem, mmaFightNightItem, 2));
        }
        yhk.s("rootView");
        return null;
    }
}
