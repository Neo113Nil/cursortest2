package ru.ozon.app.android.tabbar.ui;

import android.view.View;
import android.widget.LinearLayout;
import gd.InterfaceC6712a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ru/ozon/app/android/tabbar/ui/OzonBottomNavigationView$getTabs$1$iterator$1", "", "Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;", "", "hasNext", "()Z", "next", "()Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;", "", "index", "I", "getIndex", "()I", "setIndex", "(I)V", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonBottomNavigationView$getTabs$1$iterator$1 implements Iterator<BaseOzonBottomTabView>, InterfaceC6712a {
    private int index;
    final /* synthetic */ OzonBottomNavigationView this$0;

    OzonBottomNavigationView$getTabs$1$iterator$1(OzonBottomNavigationView ozonBottomNavigationView) {
        this.this$0 = ozonBottomNavigationView;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        LinearLayout linearLayout;
        int i11 = this.index;
        linearLayout = this.this$0.tabsContainer;
        return i11 < linearLayout.getChildCount();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public BaseOzonBottomTabView next() {
        LinearLayout linearLayout;
        linearLayout = this.this$0.tabsContainer;
        int i11 = this.index;
        this.index = i11 + 1;
        View childAt = linearLayout.getChildAt(i11);
        Intrinsics.g(childAt, "null cannot be cast to non-null type ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView");
        return (BaseOzonBottomTabView) childAt;
    }
}
