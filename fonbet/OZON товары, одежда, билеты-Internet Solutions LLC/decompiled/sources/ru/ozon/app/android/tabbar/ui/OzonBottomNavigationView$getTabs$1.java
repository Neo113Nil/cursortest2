package ru.ozon.app.android.tabbar.ui;

import gd.InterfaceC6712a;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0002\u0000\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0003\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"ru/ozon/app/android/tabbar/ui/OzonBottomNavigationView$getTabs$1", "", "Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;", "iterator", "ru/ozon/app/android/tabbar/ui/OzonBottomNavigationView$getTabs$1$iterator$1", "()Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationView$getTabs$1$iterator$1;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonBottomNavigationView$getTabs$1 implements Iterable<BaseOzonBottomTabView>, InterfaceC6712a {
    final /* synthetic */ OzonBottomNavigationView this$0;

    OzonBottomNavigationView$getTabs$1(OzonBottomNavigationView ozonBottomNavigationView) {
        this.this$0 = ozonBottomNavigationView;
    }

    @Override // java.lang.Iterable
    public Iterator<BaseOzonBottomTabView> iterator() {
        return new OzonBottomNavigationView$getTabs$1$iterator$1(this.this$0);
    }
}
