package ru.ozon.app.android.tabbar.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 K2\u00020\u0001:\u0001KB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J(\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J(\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0018H\u0016J*\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J(\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0016Je\u0010\"\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010$2\u0010\u0010%\u001a\f\u0012\u0006\b\u0001\u0012\u00020'\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020\u00182\u0010\u0010*\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010&H\u0016¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0010\u0010.\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\b\u0010/\u001a\u00020-H\u0016J \u00100\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u0010H\u0016J\u0018\u00103\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u0010H\u0016J\u0018\u00105\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u0010H\u0016J\b\u00107\u001a\u00020\u0010H\u0016J\u0010\u00108\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u00109\u001a\u00020\u0018H\u0016J\u0010\u0010:\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u0018H\u0016J\b\u0010<\u001a\u00020-H\u0016J\"\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u00182\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010)\u001a\u00020\u0018H\u0016J\u001a\u0010A\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u00182\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0018\u0010B\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0018H\u0016J\u0010\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020\u0010H\u0016J\u000e\u0010E\u001a\u00020-2\u0006\u0010F\u001a\u00020\u0014J5\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010G\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010HJ\u000e\u0010I\u001a\u00020-2\u0006\u0010J\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006L"}, d2 = {"Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationMenu;", "Landroid/view/Menu;", "context", "Landroid/content/Context;", "menuView", "Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationView;", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationView;)V", "items", "", "Lru/ozon/app/android/tabbar/ui/OzonMenuItem;", "ozonMenuItems", "", "getOzonMenuItems", "()Ljava/util/List;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isCheckableExclusive", "()Z", ProductAction.ACTION_ADD, "Landroid/view/MenuItem;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "titleResId", "", "groupId", "itemId", "order", "group", "id", "categoryOrder", "addSubMenu", "Landroid/view/SubMenu;", "titleRes", "addIntentOptions", "caller", "Landroid/content/ComponentName;", "specifics", "", "Landroid/content/Intent;", "intent", "flags", "outSpecificItems", "(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I", "removeItem", "", "removeGroup", "clear", "setGroupCheckable", "checkable", "exclusive", "setGroupVisible", "visible", "setGroupEnabled", "enabled", "hasVisibleItems", "findItem", "size", "getItem", "index", "close", "performShortcut", "keyCode", "event", "Landroid/view/KeyEvent;", "isShortcutKey", "performIdentifierAction", "setQwertyMode", "isQwerty", "setExclusiveItemChecked", "menuItem", "animation", "(IIILjava/lang/CharSequence;Ljava/lang/Integer;)Landroid/view/MenuItem;", "onItemChanged", "item", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonBottomNavigationMenu implements Menu {

    @NotNull
    private final Context context;
    private boolean isCheckableExclusive;

    @NotNull
    private final List<OzonMenuItem> items;

    @NotNull
    private final OzonBottomNavigationView menuView;

    @NotNull
    private final List<OzonMenuItem> ozonMenuItems;

    public OzonBottomNavigationMenu(@NotNull Context context, @NotNull OzonBottomNavigationView menuView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(menuView, "menuView");
        this.context = context;
        this.menuView = menuView;
        ArrayList arrayList = new ArrayList();
        this.items = arrayList;
        this.ozonMenuItems = arrayList;
        this.isCheckableExclusive = true;
    }

    @Override // android.view.Menu
    @NotNull
    public MenuItem add(@NotNull CharSequence title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return add(0, 0, 0, title);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int group, int id2, int categoryOrder, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
        throw new UnsupportedOperationException("OzonBottomNavigationMenu does not support intent options");
    }

    @Override // android.view.Menu
    @NotNull
    public SubMenu addSubMenu(CharSequence title) {
        throw new UnsupportedOperationException("OzonBottomNavigationMenu does not support submenus");
    }

    @Override // android.view.Menu
    public void clear() {
        this.items.clear();
        this.menuView.clear();
    }

    @Override // android.view.Menu
    public void close() {
        throw new UnsupportedOperationException("OzonBottomNavigationMenu isn't closable");
    }

    @Override // android.view.Menu
    @NotNull
    public MenuItem findItem(int id2) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.Menu
    @NotNull
    public MenuItem getItem(int index) {
        return this.items.get(index);
    }

    @NotNull
    public final List<OzonMenuItem> getOzonMenuItems() {
        return this.ozonMenuItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: isCheckableExclusive, reason: from getter */
    public final boolean getIsCheckableExclusive() {
        return this.isCheckableExclusive;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        throw new UnsupportedOperationException();
    }

    public final void onItemChanged(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.menuView.onItemChanged(item);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int id2, int flags) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.Menu
    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.Menu
    public void removeGroup(int group) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.Menu
    public void removeItem(int itemId) {
        throw new UnsupportedOperationException();
    }

    public final void setExclusiveItemChecked(@NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        for (OzonMenuItem ozonMenuItem : this.items) {
            ozonMenuItem.setCheckedInt(Intrinsics.d(ozonMenuItem, menuItem));
        }
        this.menuView.onCheckChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        this.isCheckableExclusive = exclusive;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int group, boolean enabled) {
    }

    @Override // android.view.Menu
    public void setGroupVisible(int group, boolean visible) {
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean isQwerty) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.Menu
    public int size() {
        return this.items.size();
    }

    @Override // android.view.Menu
    @NotNull
    public MenuItem add(int titleResId) {
        String string = this.context.getString(titleResId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return add(0, 0, 0, string);
    }

    @Override // android.view.Menu
    @NotNull
    public SubMenu addSubMenu(int titleRes) {
        throw new UnsupportedOperationException("OzonBottomNavigationMenu does not support submenus");
    }

    @Override // android.view.Menu
    @NotNull
    public MenuItem add(int groupId, int itemId, int order, @NotNull CharSequence title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return add(groupId, itemId, order, title, null);
    }

    @Override // android.view.Menu
    @NotNull
    public SubMenu addSubMenu(int group, int id2, int categoryOrder, CharSequence title) {
        throw new UnsupportedOperationException("OzonBottomNavigationMenu does not support submenus");
    }

    @Override // android.view.Menu
    @NotNull
    public MenuItem add(int group, int id2, int categoryOrder, int titleResId) {
        String string = this.context.getString(titleResId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return add(group, id2, categoryOrder, string);
    }

    @Override // android.view.Menu
    @NotNull
    public SubMenu addSubMenu(int group, int id2, int categoryOrder, int titleResId) {
        throw new UnsupportedOperationException("OzonBottomNavigationMenu does not support submenus");
    }

    @NotNull
    public final MenuItem add(int groupId, int itemId, int order, @NotNull CharSequence title, Integer animation) {
        Intrinsics.checkNotNullParameter(title, "title");
        if (this.items.size() < 6) {
            OzonMenuItem ozonMenuItem = new OzonMenuItem(this.context, this, groupId, itemId, order, title, animation);
            this.items.add(ozonMenuItem);
            return ozonMenuItem;
        }
        throw new IllegalArgumentException("Limit of items is exceed. Max count is 6");
    }
}
