package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.results.sharemodal.BaseSharePageFragment;
import com.sofascore.results.sharemodal.match.fragment.BaseShareMatchPageFragment;
import java.util.ArrayList;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qdh extends wp8 {
    public final ArrayList j;

    public qdh(Fragment fragment) {
        super(fragment);
        this.j = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        return this.j.size();
    }

    @Override // defpackage.wp8
    public final Fragment q(int i) {
        return (BaseSharePageFragment) this.j.get(i);
    }

    public final void v(BaseShareMatchPageFragment baseShareMatchPageFragment) {
        ArrayList arrayList = this.j;
        arrayList.add(baseShareMatchPageFragment);
        notifyItemInserted(b.i(arrayList));
    }
}
