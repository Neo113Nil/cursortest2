package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.delegates.BlazePlayerContainerTabsDelegate;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.moments.container.tabs.models.BlazeMomentsContainerTabItem;
import com.blaze.blazesdk.style.players.tabs.BlazePlayerTabsStyle;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g9m extends ouk {
    public final /* synthetic */ zgm a;
    public final /* synthetic */ fsf b;

    public g9m(zgm zgmVar, fsf fsfVar) {
        this.a = zgmVar;
        this.b = fsfVar;
    }

    @Override // defpackage.ouk
    public final void a(int i) {
        zgm zgmVar = this.a;
        if (i != 0) {
            if (i == 1 || i == 2) {
                zgmVar.i = true;
                return;
            }
            return;
        }
        zgmVar.i = false;
        zgmVar.c.b.setUserInputEnabled(true);
        Function0 function0 = (Function0) this.b.a;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // defpackage.ouk
    public final void c(int i) {
        ViewPager2 viewPager2 = this.a.c.b;
        viewPager2.getClass();
        if (evl.n(viewPager2)) {
            d(i);
        } else {
            fsf fsfVar = this.b;
            fsfVar.a = new hp5(this, i, fsfVar, 11);
        }
    }

    public final void d(int i) {
        BlazePlayerTabsStyle tabsStyle;
        yim tabsViewModel;
        List tabItems;
        List tabItems2;
        String containerId;
        yim tabsViewModel2;
        zgm zgmVar = this.a;
        tabsStyle = zgmVar.getTabsStyle();
        if (tabsStyle == null) {
            return;
        }
        zgmVar.n(tabsStyle);
        zgmVar.j(i);
        tabsViewModel = zgmVar.getTabsViewModel();
        if (tabsViewModel.c != null) {
            eum eumVar = zgmVar.c;
            TabLayout tabLayout = eumVar.c;
            tabLayout.getClass();
            tabLayout.setVisibility(0);
            View view = eumVar.d;
            view.getClass();
            view.setVisibility(0);
            if (!zgmVar.i) {
                eumVar.b.setUserInputEnabled(true);
            }
        }
        tabItems = zgmVar.getTabItems();
        BlazeMomentsContainerTabItem blazeMomentsContainerTabItem = (BlazeMomentsContainerTabItem) CollectionsKt.a0(i, tabItems);
        if (blazeMomentsContainerTabItem != null && (containerId = blazeMomentsContainerTabItem.getContainerId()) != null) {
            tabsViewModel2 = zgmVar.getTabsViewModel();
            tabsViewModel2.getClass();
            tabsViewModel2.c = containerId;
        }
        tabItems2 = zgmVar.getTabItems();
        BlazeMomentsContainerTabItem blazeMomentsContainerTabItem2 = (BlazeMomentsContainerTabItem) CollectionsKt.a0(i, tabItems2);
        String containerId2 = blazeMomentsContainerTabItem2 != null ? blazeMomentsContainerTabItem2.getContainerId() : null;
        BlazePlayerContainerTabsDelegate blazePlayerContainerTabsDelegate = zgmVar.g;
        if (blazePlayerContainerTabsDelegate != null) {
            BlazePlayerType blazePlayerType = BlazePlayerType.MOMENTS;
            crl crlVar = zgmVar.k;
            blazePlayerContainerTabsDelegate.onTabSelected(blazePlayerType, crlVar != null ? ((brl) crlVar).a.getSourceIdForTabsDelegate(containerId2) : null, i);
        }
    }
}
