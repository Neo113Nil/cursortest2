package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.b0;
import androidx.appcompat.view.menu.f0;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.y;
import androidx.appcompat.view.menu.z;
import androidx.core.view.k2;
import androidx.core.view.z0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d2;
import androidx.recyclerview.widget.f2;
import androidx.recyclerview.widget.x0;
import c4.k;
import com.google.android.material.R;
import java.util.ArrayList;
import q0.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class NavigationMenuPresenter implements z {
    public static final int NO_TEXT_APPEARANCE_SET = 0;
    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HEADER = "android:menu:header";
    private static final String STATE_HIERARCHY = "android:menu:list";
    NavigationMenuAdapter adapter;
    private y callback;
    int dividerInsetEnd;
    int dividerInsetStart;
    boolean hasCustomItemIconSize;
    LinearLayout headerLayout;
    ColorStateList iconTintList;

    /* renamed from: id, reason: collision with root package name */
    private int f5915id;
    Drawable itemBackground;
    RippleDrawable itemForeground;
    int itemHorizontalPadding;
    int itemIconPadding;
    int itemIconSize;
    private int itemMaxLines;
    int itemVerticalPadding;
    LayoutInflater layoutInflater;
    n menu;
    private NavigationMenuView menuView;
    int paddingSeparator;
    private int paddingTopDefault;
    ColorStateList subheaderColor;
    int subheaderInsetEnd;
    int subheaderInsetStart;
    ColorStateList textColor;
    int subheaderTextAppearance = 0;
    int textAppearance = 0;
    boolean textAppearanceActiveBoldEnabled = true;
    boolean isBehindStatusBar = true;
    private int overScrollMode = -1;
    final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.internal.NavigationMenuPresenter.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z5 = true;
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            p itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean performItemAction = navigationMenuPresenter.menu.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && performItemAction) {
                NavigationMenuPresenter.this.adapter.setCheckedItem(itemData);
            } else {
                z5 = false;
            }
            NavigationMenuPresenter.this.setUpdateSuspended(false);
            if (z5) {
                NavigationMenuPresenter.this.updateMenuView(false);
            }
        }
    };

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public class NavigationMenuAdapter extends x0 {
        private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private p checkedItem;
        private final ArrayList<NavigationMenuItem> items = new ArrayList<>();
        private boolean updateSuspended;

        public NavigationMenuAdapter() {
            prepareMenuItems();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int adjustItemPositionForA11yDelegate(int i5) {
            int i10 = i5;
            for (int i11 = 0; i11 < i5; i11++) {
                if (NavigationMenuPresenter.this.adapter.getItemViewType(i11) == 2 || NavigationMenuPresenter.this.adapter.getItemViewType(i11) == 3) {
                    i10--;
                }
            }
            return i10;
        }

        private void appendTransparentIconIfMissing(int i5, int i10) {
            while (i5 < i10) {
                ((NavigationMenuTextItem) this.items.get(i5)).needsEmptyIcon = true;
                i5++;
            }
        }

        private void prepareMenuItems() {
            if (this.updateSuspended) {
                return;
            }
            this.updateSuspended = true;
            this.items.clear();
            this.items.add(new NavigationMenuHeaderItem());
            int size = NavigationMenuPresenter.this.menu.getVisibleItems().size();
            int i5 = -1;
            boolean z5 = false;
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                p pVar = NavigationMenuPresenter.this.menu.getVisibleItems().get(i11);
                if (pVar.isChecked()) {
                    setCheckedItem(pVar);
                }
                if (pVar.isCheckable()) {
                    pVar.f(false);
                }
                if (pVar.hasSubMenu()) {
                    f0 f0Var = pVar.f530o;
                    if (f0Var.hasVisibleItems()) {
                        if (i11 != 0) {
                            this.items.add(new NavigationMenuSeparatorItem(NavigationMenuPresenter.this.paddingSeparator, 0));
                        }
                        this.items.add(new NavigationMenuTextItem(pVar));
                        int size2 = this.items.size();
                        int size3 = f0Var.size();
                        boolean z7 = false;
                        for (int i12 = 0; i12 < size3; i12++) {
                            p pVar2 = (p) f0Var.getItem(i12);
                            if (pVar2.isVisible()) {
                                if (!z7 && pVar2.getIcon() != null) {
                                    z7 = true;
                                }
                                if (pVar2.isCheckable()) {
                                    pVar2.f(false);
                                }
                                if (pVar2.isChecked()) {
                                    setCheckedItem(pVar2);
                                }
                                this.items.add(new NavigationMenuTextItem(pVar2));
                            }
                        }
                        if (z7) {
                            appendTransparentIconIfMissing(size2, this.items.size());
                        }
                    }
                } else {
                    int i13 = pVar.f518b;
                    if (i13 != i5) {
                        i10 = this.items.size();
                        z5 = pVar.getIcon() != null;
                        if (i11 != 0) {
                            i10++;
                            ArrayList<NavigationMenuItem> arrayList = this.items;
                            int i14 = NavigationMenuPresenter.this.paddingSeparator;
                            arrayList.add(new NavigationMenuSeparatorItem(i14, i14));
                        }
                    } else if (!z5 && pVar.getIcon() != null) {
                        appendTransparentIconIfMissing(i10, this.items.size());
                        z5 = true;
                    }
                    NavigationMenuTextItem navigationMenuTextItem = new NavigationMenuTextItem(pVar);
                    navigationMenuTextItem.needsEmptyIcon = z5;
                    this.items.add(navigationMenuTextItem);
                    i5 = i13;
                }
            }
            this.updateSuspended = false;
        }

        private void setAccessibilityDelegate(View view, final int i5, final boolean z5) {
            z0.o(view, new androidx.core.view.b() { // from class: com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.1
                @Override // androidx.core.view.b
                public void onInitializeAccessibilityNodeInfo(@NonNull View view2, @NonNull c cVar) {
                    super.onInitializeAccessibilityNodeInfo(view2, cVar);
                    cVar.k(k.a(NavigationMenuAdapter.this.adjustItemPositionForA11yDelegate(i5), 1, 1, 1, z5, view2.isSelected()));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateAllDividerMenuItems() {
            for (int i5 = 0; i5 < this.items.size(); i5++) {
                if (this.items.get(i5) instanceof NavigationMenuSeparatorItem) {
                    notifyItemChanged(i5);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateAllSubHeaderMenuItems() {
            for (int i5 = 0; i5 < this.items.size(); i5++) {
                if ((this.items.get(i5) instanceof NavigationMenuTextItem) && getItemViewType(i5) == 1) {
                    notifyItemChanged(i5);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateAllTextMenuItems() {
            for (int i5 = 0; i5 < this.items.size(); i5++) {
                if ((this.items.get(i5) instanceof NavigationMenuTextItem) && getItemViewType(i5) == 0) {
                    notifyItemChanged(i5);
                }
            }
        }

        @NonNull
        public Bundle createInstanceState() {
            Bundle bundle = new Bundle();
            p pVar = this.checkedItem;
            if (pVar != null) {
                bundle.putInt(STATE_CHECKED_ITEM, pVar.f517a);
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.items.size();
            for (int i5 = 0; i5 < size; i5++) {
                NavigationMenuItem navigationMenuItem = this.items.get(i5);
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    p menuItem = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                    View actionView = menuItem != null ? menuItem.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItem.f517a, parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(STATE_ACTION_VIEWS, sparseArray);
            return bundle;
        }

        public p getCheckedItem() {
            return this.checkedItem;
        }

        @Override // androidx.recyclerview.widget.x0
        public int getItemCount() {
            return this.items.size();
        }

        @Override // androidx.recyclerview.widget.x0
        public long getItemId(int i5) {
            return i5;
        }

        @Override // androidx.recyclerview.widget.x0
        public int getItemViewType(int i5) {
            NavigationMenuItem navigationMenuItem = this.items.get(i5);
            if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof NavigationMenuTextItem) {
                return ((NavigationMenuTextItem) navigationMenuItem).getMenuItem().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public int getRowCount() {
            int i5 = 0;
            for (int i10 = 0; i10 < NavigationMenuPresenter.this.adapter.getItemCount(); i10++) {
                int itemViewType = NavigationMenuPresenter.this.adapter.getItemViewType(i10);
                if (itemViewType == 0 || itemViewType == 1) {
                    i5++;
                }
            }
            return i5;
        }

        public void restoreInstanceState(@NonNull Bundle bundle) {
            p menuItem;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            p menuItem2;
            int i5 = bundle.getInt(STATE_CHECKED_ITEM, 0);
            if (i5 != 0) {
                this.updateSuspended = true;
                int size = this.items.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    NavigationMenuItem navigationMenuItem = this.items.get(i10);
                    if ((navigationMenuItem instanceof NavigationMenuTextItem) && (menuItem2 = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem()) != null && menuItem2.f517a == i5) {
                        setCheckedItem(menuItem2);
                        break;
                    }
                    i10++;
                }
                this.updateSuspended = false;
                prepareMenuItems();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(STATE_ACTION_VIEWS);
            if (sparseParcelableArray != null) {
                int size2 = this.items.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    NavigationMenuItem navigationMenuItem2 = this.items.get(i11);
                    if ((navigationMenuItem2 instanceof NavigationMenuTextItem) && (menuItem = ((NavigationMenuTextItem) navigationMenuItem2).getMenuItem()) != null && (actionView = menuItem.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(menuItem.f517a)) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void setCheckedItem(@NonNull p pVar) {
            if (this.checkedItem == pVar || !pVar.isCheckable()) {
                return;
            }
            p pVar2 = this.checkedItem;
            if (pVar2 != null) {
                pVar2.setChecked(false);
            }
            this.checkedItem = pVar;
            pVar.setChecked(true);
        }

        public void setUpdateSuspended(boolean z5) {
            this.updateSuspended = z5;
        }

        public void update() {
            int size = this.items.size();
            prepareMenuItems();
            notifyDataSetChanged();
            if (size == this.items.size()) {
                notifyItemRangeChanged(0, this.items.size());
            }
        }

        @Override // androidx.recyclerview.widget.x0
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i5) {
            int itemViewType = getItemViewType(i5);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) this.items.get(i5);
                    viewHolder.itemView.setPaddingRelative(NavigationMenuPresenter.this.dividerInsetStart, navigationMenuSeparatorItem.getPaddingTop(), NavigationMenuPresenter.this.dividerInsetEnd, navigationMenuSeparatorItem.getPaddingBottom());
                    return;
                }
                TextView textView = (TextView) viewHolder.itemView;
                textView.setText(((NavigationMenuTextItem) this.items.get(i5)).getMenuItem().f521e);
                textView.setTextAppearance(NavigationMenuPresenter.this.subheaderTextAppearance);
                textView.setPaddingRelative(NavigationMenuPresenter.this.subheaderInsetStart, textView.getPaddingTop(), NavigationMenuPresenter.this.subheaderInsetEnd, textView.getPaddingBottom());
                ColorStateList colorStateList = NavigationMenuPresenter.this.subheaderColor;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                setAccessibilityDelegate(textView, i5, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
            navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.iconTintList);
            navigationMenuItemView.setTextAppearance(NavigationMenuPresenter.this.textAppearance);
            ColorStateList colorStateList2 = NavigationMenuPresenter.this.textColor;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = NavigationMenuPresenter.this.itemBackground;
            navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = NavigationMenuPresenter.this.itemForeground;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            NavigationMenuTextItem navigationMenuTextItem = (NavigationMenuTextItem) this.items.get(i5);
            navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.needsEmptyIcon);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int i10 = navigationMenuPresenter.itemHorizontalPadding;
            int i11 = navigationMenuPresenter.itemVerticalPadding;
            navigationMenuItemView.setPadding(i10, i11, i10, i11);
            navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.itemIconPadding);
            NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
            if (navigationMenuPresenter2.hasCustomItemIconSize) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter2.itemIconSize);
            }
            navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.itemMaxLines);
            navigationMenuItemView.initialize(navigationMenuTextItem.getMenuItem(), NavigationMenuPresenter.this.textAppearanceActiveBoldEnabled);
            setAccessibilityDelegate(navigationMenuItemView, i5, false);
        }

        @Override // androidx.recyclerview.widget.x0
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i5) {
            if (i5 == 0) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                return new NormalViewHolder(navigationMenuPresenter.layoutInflater, viewGroup, navigationMenuPresenter.onClickListener);
            }
            if (i5 == 1) {
                return new SubheaderViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i5 == 2) {
                return new SeparatorViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i5 != 3) {
                return null;
            }
            return new HeaderViewHolder(NavigationMenuPresenter.this.headerLayout);
        }

        @Override // androidx.recyclerview.widget.x0
        public void onViewRecycled(ViewHolder viewHolder) {
            if (viewHolder instanceof NormalViewHolder) {
                ((NavigationMenuItemView) viewHolder.itemView).recycle();
            }
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class NavigationMenuHeaderItem implements NavigationMenuItem {
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public interface NavigationMenuItem {
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class NavigationMenuSeparatorItem implements NavigationMenuItem {
        private final int paddingBottom;
        private final int paddingTop;

        public NavigationMenuSeparatorItem(int i5, int i10) {
            this.paddingTop = i5;
            this.paddingBottom = i10;
        }

        public int getPaddingBottom() {
            return this.paddingBottom;
        }

        public int getPaddingTop() {
            return this.paddingTop;
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class NavigationMenuTextItem implements NavigationMenuItem {
        private final p menuItem;
        boolean needsEmptyIcon;

        public NavigationMenuTextItem(p pVar) {
            this.menuItem = pVar;
        }

        public p getMenuItem() {
            return this.menuItem;
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public class NavigationMenuViewAccessibilityDelegate extends f2 {
        public NavigationMenuViewAccessibilityDelegate(@NonNull RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.f2, androidx.core.view.b
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            cVar.f21914a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(NavigationMenuPresenter.this.adapter.getRowCount(), 1, false));
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static abstract class ViewHolder extends d2 {
        public ViewHolder(View view) {
            super(view);
        }
    }

    private boolean hasHeader() {
        return getHeaderCount() > 0;
    }

    private void updateAllDividerMenuItems() {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.updateAllDividerMenuItems();
        }
    }

    private void updateAllSubHeaderMenuItems() {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.updateAllSubHeaderMenuItems();
        }
    }

    private void updateAllTextMenuItems() {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.updateAllTextMenuItems();
        }
    }

    private void updateTopPadding() {
        int i5 = (hasHeader() || !this.isBehindStatusBar) ? 0 : this.paddingTopDefault;
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, i5, 0, navigationMenuView.getPaddingBottom());
    }

    public void addHeaderView(@NonNull View view) {
        this.headerLayout.addView(view);
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.z
    public boolean collapseItemActionView(n nVar, p pVar) {
        return false;
    }

    public void dispatchApplyWindowInsets(@NonNull k2 k2Var) {
        int d10 = k2Var.d();
        if (this.paddingTopDefault != d10) {
            this.paddingTopDefault = d10;
            updateTopPadding();
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, k2Var.a());
        z0.b(this.headerLayout, k2Var);
    }

    @Override // androidx.appcompat.view.menu.z
    public boolean expandItemActionView(n nVar, p pVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.z
    public boolean flagActionItems() {
        return false;
    }

    public p getCheckedItem() {
        return this.adapter.getCheckedItem();
    }

    public int getDividerInsetEnd() {
        return this.dividerInsetEnd;
    }

    public int getDividerInsetStart() {
        return this.dividerInsetStart;
    }

    public int getHeaderCount() {
        return this.headerLayout.getChildCount();
    }

    public View getHeaderView(int i5) {
        return this.headerLayout.getChildAt(i5);
    }

    @Override // androidx.appcompat.view.menu.z
    public int getId() {
        return this.f5915id;
    }

    public Drawable getItemBackground() {
        return this.itemBackground;
    }

    public int getItemHorizontalPadding() {
        return this.itemHorizontalPadding;
    }

    public int getItemIconPadding() {
        return this.itemIconPadding;
    }

    public int getItemMaxLines() {
        return this.itemMaxLines;
    }

    public ColorStateList getItemTextColor() {
        return this.textColor;
    }

    public ColorStateList getItemTintList() {
        return this.iconTintList;
    }

    public int getItemVerticalPadding() {
        return this.itemVerticalPadding;
    }

    public b0 getMenuView(ViewGroup viewGroup) {
        if (this.menuView == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.layoutInflater.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.menuView = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new NavigationMenuViewAccessibilityDelegate(this.menuView));
            if (this.adapter == null) {
                NavigationMenuAdapter navigationMenuAdapter = new NavigationMenuAdapter();
                this.adapter = navigationMenuAdapter;
                navigationMenuAdapter.setHasStableIds(true);
            }
            int i5 = this.overScrollMode;
            if (i5 != -1) {
                this.menuView.setOverScrollMode(i5);
            }
            LinearLayout linearLayout = (LinearLayout) this.layoutInflater.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.menuView, false);
            this.headerLayout = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            this.menuView.setAdapter(this.adapter);
        }
        return this.menuView;
    }

    public int getSubheaderInsetEnd() {
        return this.subheaderInsetEnd;
    }

    public int getSubheaderInsetStart() {
        return this.subheaderInsetStart;
    }

    public View inflateHeaderView(int i5) {
        View inflate = this.layoutInflater.inflate(i5, (ViewGroup) this.headerLayout, false);
        addHeaderView(inflate);
        return inflate;
    }

    @Override // androidx.appcompat.view.menu.z
    public void initForMenu(@NonNull Context context, @NonNull n nVar) {
        this.layoutInflater = LayoutInflater.from(context);
        this.menu = nVar;
        this.paddingSeparator = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public boolean isBehindStatusBar() {
        return this.isBehindStatusBar;
    }

    @Override // androidx.appcompat.view.menu.z
    public void onCloseMenu(n nVar, boolean z5) {
        y yVar = this.callback;
        if (yVar != null) {
            yVar.onCloseMenu(nVar, z5);
        }
    }

    @Override // androidx.appcompat.view.menu.z
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(STATE_HIERARCHY);
            if (sparseParcelableArray != null) {
                this.menuView.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(STATE_ADAPTER);
            if (bundle2 != null) {
                this.adapter.restoreInstanceState(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(STATE_HEADER);
            if (sparseParcelableArray2 != null) {
                this.headerLayout.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.z
    @NonNull
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.menuView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.menuView.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(STATE_HIERARCHY, sparseArray);
        }
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            bundle.putBundle(STATE_ADAPTER, navigationMenuAdapter.createInstanceState());
        }
        if (this.headerLayout != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.headerLayout.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(STATE_HEADER, sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.z
    public boolean onSubMenuSelected(f0 f0Var) {
        return false;
    }

    public void removeHeaderView(@NonNull View view) {
        this.headerLayout.removeView(view);
        if (hasHeader()) {
            return;
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, this.paddingTopDefault, 0, navigationMenuView.getPaddingBottom());
    }

    public void setBehindStatusBar(boolean z5) {
        if (this.isBehindStatusBar != z5) {
            this.isBehindStatusBar = z5;
            updateTopPadding();
        }
    }

    @Override // androidx.appcompat.view.menu.z
    public void setCallback(y yVar) {
        this.callback = yVar;
    }

    public void setCheckedItem(@NonNull p pVar) {
        this.adapter.setCheckedItem(pVar);
    }

    public void setDividerInsetEnd(int i5) {
        this.dividerInsetEnd = i5;
        updateAllDividerMenuItems();
    }

    public void setDividerInsetStart(int i5) {
        this.dividerInsetStart = i5;
        updateAllDividerMenuItems();
    }

    public void setId(int i5) {
        this.f5915id = i5;
    }

    public void setItemBackground(Drawable drawable) {
        this.itemBackground = drawable;
        updateAllTextMenuItems();
    }

    public void setItemForeground(RippleDrawable rippleDrawable) {
        this.itemForeground = rippleDrawable;
        updateAllTextMenuItems();
    }

    public void setItemHorizontalPadding(int i5) {
        this.itemHorizontalPadding = i5;
        updateAllTextMenuItems();
    }

    public void setItemIconPadding(int i5) {
        this.itemIconPadding = i5;
        updateAllTextMenuItems();
    }

    public void setItemIconSize(int i5) {
        if (this.itemIconSize != i5) {
            this.itemIconSize = i5;
            this.hasCustomItemIconSize = true;
            updateAllTextMenuItems();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        updateAllTextMenuItems();
    }

    public void setItemMaxLines(int i5) {
        this.itemMaxLines = i5;
        updateAllTextMenuItems();
    }

    public void setItemTextAppearance(int i5) {
        this.textAppearance = i5;
        updateAllTextMenuItems();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z5) {
        this.textAppearanceActiveBoldEnabled = z5;
        updateAllTextMenuItems();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.textColor = colorStateList;
        updateAllTextMenuItems();
    }

    public void setItemVerticalPadding(int i5) {
        this.itemVerticalPadding = i5;
        updateAllTextMenuItems();
    }

    public void setOverScrollMode(int i5) {
        this.overScrollMode = i5;
        NavigationMenuView navigationMenuView = this.menuView;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i5);
        }
    }

    public void setSubheaderColor(ColorStateList colorStateList) {
        this.subheaderColor = colorStateList;
        updateAllSubHeaderMenuItems();
    }

    public void setSubheaderInsetEnd(int i5) {
        this.subheaderInsetEnd = i5;
        updateAllSubHeaderMenuItems();
    }

    public void setSubheaderInsetStart(int i5) {
        this.subheaderInsetStart = i5;
        updateAllSubHeaderMenuItems();
    }

    public void setSubheaderTextAppearance(int i5) {
        this.subheaderTextAppearance = i5;
        updateAllSubHeaderMenuItems();
    }

    public void setUpdateSuspended(boolean z5) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.setUpdateSuspended(z5);
        }
    }

    @Override // androidx.appcompat.view.menu.z
    public void updateMenuView(boolean z5) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.update();
        }
    }
}
