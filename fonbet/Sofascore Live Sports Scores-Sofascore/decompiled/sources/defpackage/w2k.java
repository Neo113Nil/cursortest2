package defpackage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w2k extends wp8 {
    public final List j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2k(List list, ViewPager2 viewPager2, AppCompatActivity appCompatActivity, v2k v2kVar) {
        super(appCompatActivity);
        puk k03Var;
        list.getClass();
        v2kVar.getClass();
        this.j = list;
        int size = list.size() - 1;
        viewPager2.setOffscreenPageLimit(size < 1 ? 1 : size);
        int ordinal = v2kVar.ordinal();
        if (ordinal == 0) {
            k03Var = new k03();
        } else if (ordinal == 1) {
            k03Var = new a99(24);
        } else {
            if (ordinal != 2) {
                zzl.b();
                throw null;
            }
            k03Var = new e2f(6);
        }
        viewPager2.setPageTransformer(k03Var);
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        return this.j.size();
    }

    @Override // defpackage.wp8
    public final Fragment q(int i) {
        return (Fragment) this.j.get(i);
    }
}
