package fJ;

import ru.ozon.app.android.select.feature.entry.OzonSelectActivity;
import ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;
import ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabNavigationFragment;
import w2.C10411b;
import w2.C10416g;
import xZ.C10683b;

/* renamed from: fJ.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C6477d implements C10411b.d, OnBottomNavigationItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f63016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f63017b;

    public /* synthetic */ C6477d(Object obj, Object obj2) {
        this.f63016a = obj;
        this.f63017b = obj2;
    }

    @Override // w2.C10411b.d
    public void b(C10416g c10416g) {
        OzonSelectActivity.setupSplashExitListener$lambda$5((OzonSelectActivity) this.f63016a, (C10683b) this.f63017b, c10416g);
    }

    @Override // ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener
    public boolean onItemSelectedItem(BottomMenuItem bottomMenuItem, BottomMenuItem bottomMenuItem2) {
        boolean configureBottomNavigationController$lambda$5$lambda$4;
        configureBottomNavigationController$lambda$5$lambda$4 = TravelTabNavigationFragment.configureBottomNavigationController$lambda$5$lambda$4((RemoteTabConfig) this.f63016a, (TravelTabNavigationFragment) this.f63017b, bottomMenuItem, bottomMenuItem2);
        return configureBottomNavigationController$lambda$5$lambda$4;
    }
}
