package ru.ozon.app.android.tabbar.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 _2\u00020\u0001:\u0001_BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\u0012\u0010\u001b\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\u0012\u0010\u001e\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0016J\u0012\u0010 \u001a\u00020\u00012\b\u0010!\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010#\u001a\u00020\u00012\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\n\u0010&\u001a\u0004\u0018\u00010%H\u0016J\u0018\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0016H\u0016J\u0010\u0010*\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u0016H\u0016J\b\u0010+\u001a\u00020\u0016H\u0016J\u0010\u0010,\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0016H\u0016J\b\u0010-\u001a\u00020\u0016H\u0016J\u0010\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0014H\u0016J\b\u00100\u001a\u00020\u0014H\u0016J\u0010\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0014H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0014H\u0016J\b\u00105\u001a\u00020\u0014H\u0016J\u0010\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u00020\u0014H\u0016J\b\u00108\u001a\u00020\u0014H\u0016J\b\u00109\u001a\u00020\u0014H\u0016J\b\u0010:\u001a\u00020;H\u0016J\u0012\u0010<\u001a\u00020\u00012\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010?\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0007H\u0016J\u0010\u0010D\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u0007H\u0016J\u0012\u0010E\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\u0010\u0010E\u001a\u00020\u00012\u0006\u0010H\u001a\u00020\u0007H\u0016J\n\u0010I\u001a\u0004\u0018\u00010GH\u0016J\u0012\u0010J\u001a\u00020\u00012\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\b\u0010M\u001a\u00020LH\u0016J\b\u0010N\u001a\u00020\u0014H\u0016J\b\u0010O\u001a\u00020\u0014H\u0016J\b\u0010P\u001a\u00020\u0014H\u0016J\u0012\u0010Q\u001a\u00020\u00012\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0012\u0010T\u001a\u00020\u00012\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\n\u0010W\u001a\u0004\u0018\u00010VH\u0016J\u0012\u0010X\u001a\u00020\u00012\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\n\u0010[\u001a\u0004\u0018\u00010ZH\u0016J\u000e\u0010\\\u001a\u00020B2\u0006\u00102\u001a\u00020\u0014J\r\u0010]\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010^R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lru/ozon/app/android/tabbar/ui/OzonMenuItem;", "Landroid/view/MenuItem;", "context", "Landroid/content/Context;", "menu", "Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationMenu;", "groupId", "", "itemId", "order", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "animation", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationMenu;IIILjava/lang/CharSequence;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "iconResId", "isChecked", "", "numericShortcut", "", "alphabeticShortcut", "getItemId", "getGroupId", "getOrder", "setTitle", "titleRes", "getTitle", "setTitleCondensed", "getTitleCondensed", "setIcon", "icon", "getIcon", "setIntent", "intent", "Landroid/content/Intent;", "getIntent", "setShortcut", "numericChar", "alphaChar", "setNumericShortcut", "getNumericShortcut", "setAlphabeticShortcut", "getAlphabeticShortcut", "setCheckable", "checkable", "isCheckable", "setChecked", "checked", "setVisible", "shown", "isVisible", "setEnabled", "enabled", "isEnabled", "hasSubMenu", "getSubMenu", "Landroid/view/SubMenu;", "setOnMenuItemClickListener", "clickListener", "Landroid/view/MenuItem$OnMenuItemClickListener;", "getMenuInfo", "Landroid/view/ContextMenu$ContextMenuInfo;", "setShowAsAction", "", "actionEnum", "setShowAsActionFlags", "setActionView", "view", "Landroid/view/View;", "resId", "getActionView", "setActionProvider", "actionProvider", "Landroid/view/ActionProvider;", "getActionProvider", "expandActionView", "collapseActionView", "isActionViewExpanded", "setOnActionExpandListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/MenuItem$OnActionExpandListener;", "setIconTintList", "iconTintList", "Landroid/content/res/ColorStateList;", "getIconTintList", "setIconTintMode", "tintMode", "Landroid/graphics/PorterDuff$Mode;", "getIconTintMode", "setCheckedInt", "getAnimation", "()Ljava/lang/Integer;", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonMenuItem implements MenuItem {
    private char alphabeticShortcut;
    private final Integer animation;

    @NotNull
    private final Context context;
    private final int groupId;
    private Drawable iconDrawable;
    private int iconResId;
    private boolean isChecked;
    private final int itemId;

    @NotNull
    private final OzonBottomNavigationMenu menu;
    private char numericShortcut;
    private final int order;

    @NotNull
    private CharSequence title;

    public OzonMenuItem(@NotNull Context context, @NotNull OzonBottomNavigationMenu menu, int i11, int i12, int i13, @NotNull CharSequence title, Integer num) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(title, "title");
        this.context = context;
        this.menu = menu;
        this.groupId = i11;
        this.itemId = i12;
        this.order = i13;
        this.title = title;
        this.animation = num;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    @NotNull
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.alphabeticShortcut;
    }

    public final Integer getAnimation() {
        return this.animation;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.groupId;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.iconDrawable;
        if (drawable != null) {
            return drawable;
        }
        int i11 = this.iconResId;
        if (i11 == 0) {
            return null;
        }
        Drawable a11 = C7232a.a(this.context, i11);
        this.iconResId = 0;
        this.iconDrawable = a11;
        return a11;
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return null;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return null;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return null;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.itemId;
    }

    @Override // android.view.MenuItem
    @NotNull
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.numericShortcut;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.order;
    }

    @Override // android.view.MenuItem
    @NotNull
    public SubMenu getSubMenu() {
        throw new UnsupportedOperationException("Sub menu is not supported in bottom navigation menu.");
    }

    @Override // android.view.MenuItem
    @NotNull
    public CharSequence getTitle() {
        return this.title;
    }

    @Override // android.view.MenuItem
    @NotNull
    public CharSequence getTitleCondensed() {
        return this.title;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return true;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.isChecked;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return true;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return true;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setActionView(int resId) {
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setAlphabeticShortcut(char alphaChar) {
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setCheckable(boolean checkable) {
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setChecked(boolean checked) {
        if (checked && this.menu.getIsCheckableExclusive()) {
            this.menu.setExclusiveItemChecked(this);
            return this;
        }
        setCheckedInt(checked);
        return this;
    }

    public final void setCheckedInt(boolean checked) {
        this.isChecked = checked;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setEnabled(boolean enabled) {
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setIcon(Drawable icon) {
        this.iconResId = 0;
        this.iconDrawable = icon;
        this.menu.onItemChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setIconTintList(ColorStateList iconTintList) {
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setIconTintMode(PorterDuff.Mode tintMode) {
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setIntent(Intent intent) {
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setNumericShortcut(char numericChar) {
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener clickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setShortcut(char numericChar, char alphaChar) {
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int actionEnum) {
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setShowAsActionFlags(int actionEnum) {
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setTitle(CharSequence title) {
        if (title == null) {
            title = "";
        }
        this.title = title;
        this.menu.onItemChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setTitleCondensed(CharSequence title) {
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setVisible(boolean shown) {
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setActionView(View view) {
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setTitle(int titleRes) {
        this.title = this.context.getString(titleRes);
        this.menu.onItemChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    @NotNull
    public MenuItem setIcon(int iconResId) {
        this.iconDrawable = null;
        this.iconResId = iconResId;
        this.menu.onItemChanged(this);
        return this;
    }
}
