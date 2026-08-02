package l40;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.List;
import ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragment;
import ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;
import ze.u;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements OnFailureListener, OnBottomNavigationItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f72765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f72766b;

    public /* synthetic */ c(Object obj, Object obj2) {
        this.f72765a = obj;
        this.f72766b = obj2;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        d dVar = (d) this.f72765a;
        dVar.f72770d.M(dVar.j().name(), exc.getMessage());
        u uVar = (u) this.f72766b;
        if (uVar.g()) {
            return;
        }
        uVar.b(Boolean.FALSE);
        uVar.l(null);
    }

    @Override // ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener
    public boolean onItemSelectedItem(BottomMenuItem bottomMenuItem, BottomMenuItem bottomMenuItem2) {
        boolean bindBottomNavigation$lambda$5;
        bindBottomNavigation$lambda$5 = OzonFreshFragment.bindBottomNavigation$lambda$5((OzonFreshFragment) this.f72765a, (List) this.f72766b, bottomMenuItem, bottomMenuItem2);
        return bindBottomNavigation$lambda$5;
    }
}
