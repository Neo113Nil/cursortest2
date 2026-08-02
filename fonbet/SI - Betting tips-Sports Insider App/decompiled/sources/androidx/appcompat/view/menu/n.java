package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.core.view.a1;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.sentry.android.core.w0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class n implements Menu {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private l mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private p mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<p> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<z>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<p> mItems = new ArrayList<>();
    private ArrayList<p> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<p> mActionItems = new ArrayList<>();
    private ArrayList<p> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    public n(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        c(true);
    }

    public final void a(int i5, boolean z5) {
        if (i5 < 0 || i5 >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i5);
        if (z5) {
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i5, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i5);
        }
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i15 < 0 ? intent : intentArr[i15]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i5, i10, i11, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = intent3;
            }
        }
        return size;
    }

    public MenuItem addInternal(int i5, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i13 < iArr.length) {
                int i14 = (iArr[i13] << 16) | (65535 & i11);
                p pVar = new p(this, i5, i10, i11, i14, charSequence, this.mDefaultShowAsAction);
                ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
                if (contextMenuInfo != null) {
                    pVar.D = contextMenuInfo;
                }
                ArrayList<p> arrayList = this.mItems;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size < 0) {
                        i12 = 0;
                        break;
                    }
                    if (arrayList.get(size).f520d <= i14) {
                        i12 = size + 1;
                        break;
                    }
                    size--;
                }
                arrayList.add(i12, pVar);
                onItemsChanged(true);
                return pVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public void addMenuPresenter(z zVar) {
        addMenuPresenter(zVar, this.mContext);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(int i5, CharSequence charSequence, int i10, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i5 > 0) {
                this.mHeaderTitle = resources.getText(i5);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i10 > 0) {
                this.mHeaderIcon = getContext().getDrawable(i10);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    public final void c(boolean z5) {
        boolean z7;
        boolean z10 = false;
        if (z5 && this.mResources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(this.mContext);
            Context context = this.mContext;
            Method method = a1.f1281a;
            if (Build.VERSION.SDK_INT >= 28) {
                z7 = androidx.core.view.k.r(viewConfiguration);
            } else {
                Resources resources = context.getResources();
                int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", ConstantDeviceInfo.APP_PLATFORM);
                z7 = identifier != 0 && resources.getBoolean(identifier);
            }
            if (z7) {
                z10 = true;
            }
        }
        this.mShortcutsVisible = z10;
    }

    public void changeMenuMode() {
        l lVar = this.mCallback;
        if (lVar != null) {
            lVar.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        p pVar = this.mExpandedItem;
        if (pVar != null) {
            collapseItemActionView(pVar);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    public final void close(boolean z5) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        Iterator<WeakReference<z>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<z> next = it.next();
            z zVar = next.get();
            if (zVar == null) {
                this.mPresenters.remove(next);
            } else {
                zVar.onCloseMenu(this, z5);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(p pVar) {
        boolean z5 = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == pVar) {
            stopDispatchingItemsChanged();
            Iterator<WeakReference<z>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference<z> next = it.next();
                z zVar = next.get();
                if (zVar == null) {
                    this.mPresenters.remove(next);
                } else {
                    z5 = zVar.collapseItemActionView(this, pVar);
                    if (z5) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (z5) {
                this.mExpandedItem = null;
            }
        }
        return z5;
    }

    public boolean dispatchMenuItemSelected(@NonNull n nVar, @NonNull MenuItem menuItem) {
        l lVar = this.mCallback;
        return lVar != null && lVar.onMenuItemSelected(nVar, menuItem);
    }

    public boolean expandItemActionView(p pVar) {
        boolean z5 = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<z>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<z> next = it.next();
            z zVar = next.get();
            if (zVar == null) {
                this.mPresenters.remove(next);
            } else {
                z5 = zVar.expandItemActionView(this, pVar);
                if (z5) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (z5) {
            this.mExpandedItem = pVar;
        }
        return z5;
    }

    public int findGroupIndex(int i5) {
        return findGroupIndex(i5, 0);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i5) {
        MenuItem findItem;
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.mItems.get(i10);
            if (pVar.f517a == i5) {
                return pVar;
            }
            if (pVar.hasSubMenu() && (findItem = pVar.f530o.findItem(i5)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i5) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.mItems.get(i10).f517a == i5) {
                return i10;
            }
        }
        return -1;
    }

    public p findItemWithShortcutForKey(int i5, KeyEvent keyEvent) {
        ArrayList<p> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i5, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean isQwertyMode = isQwertyMode();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = arrayList.get(i10);
            char c2 = isQwertyMode ? pVar.j : pVar.f524h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (isQwertyMode && c2 == '\b' && i5 == 67))) {
                return pVar;
            }
        }
        return null;
    }

    public void findItemsWithShortcutForKey(List<p> list, int i5, KeyEvent keyEvent) {
        boolean isQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i5 == 67) {
            int size = this.mItems.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar = this.mItems.get(i10);
                if (pVar.hasSubMenu()) {
                    pVar.f530o.findItemsWithShortcutForKey(list, i5, keyEvent);
                }
                char c2 = isQwertyMode ? pVar.j : pVar.f524h;
                if ((modifiers & 69647) == ((isQwertyMode ? pVar.f526k : pVar.f525i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (isQwertyMode && c2 == '\b' && i5 == 67)) && pVar.isEnabled()) {
                        list.add(pVar);
                    }
                }
            }
        }
    }

    public void flagActionItems() {
        ArrayList<p> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            Iterator<WeakReference<z>> it = this.mPresenters.iterator();
            boolean z5 = false;
            while (it.hasNext()) {
                WeakReference<z> next = it.next();
                z zVar = next.get();
                if (zVar == null) {
                    this.mPresenters.remove(next);
                } else {
                    z5 |= zVar.flagActionItems();
                }
            }
            if (z5) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i5 = 0; i5 < size; i5++) {
                    p pVar = visibleItems.get(i5);
                    if ((pVar.f538x & 32) == 32) {
                        this.mActionItems.add(pVar);
                    } else {
                        this.mNonActionItems.add(pVar);
                    }
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList<p> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public p getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i5) {
        return this.mItems.get(i5);
    }

    public ArrayList<p> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    @NonNull
    public ArrayList<p> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i5 = 0; i5 < size; i5++) {
            p pVar = this.mItems.get(i5);
            if (pVar.isVisible()) {
                this.mVisibleItems.add(pVar);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (this.mItems.get(i5).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isDispatchingItemsChanged() {
        return !this.mPreventDispatchingItemsChanged;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i5, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i5, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public void onItemActionRequestChanged(p pVar) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemVisibleChanged(p pVar) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z5) {
        if (this.mPreventDispatchingItemsChanged) {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (z5) {
                this.mStructureChangedWhileDispatchPrevented = true;
                return;
            }
            return;
        }
        if (z5) {
            this.mIsVisibleItemsStale = true;
            this.mIsActionItemsStale = true;
        }
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<z>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<z> next = it.next();
            z zVar = next.get();
            if (zVar == null) {
                this.mPresenters.remove(next);
            } else {
                zVar.updateMenuView(z5);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i5, int i10) {
        return performItemAction(findItem(i5), i10);
    }

    public boolean performItemAction(MenuItem menuItem, int i5) {
        return performItemAction(menuItem, null, i5);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i5, KeyEvent keyEvent, int i10) {
        p findItemWithShortcutForKey = findItemWithShortcutForKey(i5, keyEvent);
        boolean performItemAction = findItemWithShortcutForKey != null ? performItemAction(findItemWithShortcutForKey, i10) : false;
        if ((i10 & 2) != 0) {
            close(true);
        }
        return performItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i5) {
        int findGroupIndex = findGroupIndex(i5);
        if (findGroupIndex >= 0) {
            int size = this.mItems.size() - findGroupIndex;
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i10 >= size || this.mItems.get(findGroupIndex).f518b != i5) {
                    break;
                }
                a(findGroupIndex, false);
                i10 = i11;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i5) {
        a(findItemIndex(i5), true);
    }

    public void removeItemAt(int i5) {
        a(i5, true);
    }

    public void removeMenuPresenter(z zVar) {
        Iterator<WeakReference<z>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<z> next = it.next();
            z zVar2 = next.get();
            if (zVar2 == null || zVar2 == zVar) {
                this.mPresenters.remove(next);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = getItem(i5);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((f0) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i10 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i10 <= 0 || (findItem = findItem(i10)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void restorePresenterStates(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        Iterator<WeakReference<z>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<z> next = it.next();
            z zVar = next.get();
            if (zVar == null) {
                this.mPresenters.remove(next);
            } else {
                int id2 = zVar.getId();
                if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    zVar.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = getItem(i5);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((f0) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        Parcelable onSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<z>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<z> next = it.next();
            z zVar = next.get();
            if (zVar == null) {
                this.mPresenters.remove(next);
            } else {
                int id2 = zVar.getId();
                if (id2 > 0 && (onSaveInstanceState = zVar.onSaveInstanceState()) != null) {
                    sparseArray.put(id2, onSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    public void setCallback(l lVar) {
        this.mCallback = lVar;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public n setDefaultShowAsAction(int i5) {
        this.mDefaultShowAsAction = i5;
        return this;
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i5 = 0; i5 < size; i5++) {
            p pVar = this.mItems.get(i5);
            if (pVar.f518b == groupId && (pVar.f538x & 4) != 0 && pVar.isCheckable()) {
                boolean z5 = pVar == menuItem;
                int i10 = pVar.f538x;
                int i11 = (z5 ? 2 : 0) | (i10 & (-3));
                pVar.f538x = i11;
                if (i10 != i11) {
                    pVar.f529n.onItemsChanged(false);
                }
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i5, boolean z5, boolean z7) {
        int size = this.mItems.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.mItems.get(i10);
            if (pVar.f518b == i5) {
                pVar.f(z7);
                pVar.setCheckable(z5);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z5) {
        this.mGroupDividerEnabled = z5;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i5, boolean z5) {
        int size = this.mItems.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.mItems.get(i10);
            if (pVar.f518b == i5) {
                pVar.setEnabled(z5);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i5, boolean z5) {
        int size = this.mItems.size();
        boolean z7 = false;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.mItems.get(i10);
            if (pVar.f518b == i5) {
                int i11 = pVar.f538x;
                int i12 = (i11 & (-9)) | (z5 ? 0 : 8);
                pVar.f538x = i12;
                if (i11 != i12) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            onItemsChanged(true);
        }
    }

    public n setHeaderIconInt(Drawable drawable) {
        b(0, null, 0, drawable, null);
        return this;
    }

    public n setHeaderTitleInt(CharSequence charSequence) {
        b(0, charSequence, 0, null, null);
        return this;
    }

    public n setHeaderViewInt(View view) {
        b(0, null, 0, null, view);
        return this;
    }

    public void setOptionalIconsVisible(boolean z5) {
        this.mOptionalIconsVisible = z5;
    }

    public void setOverrideVisibleItems(boolean z5) {
        this.mOverrideVisibleItems = z5;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z5) {
        this.mQwertyMode = z5;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z5) {
        if (this.mShortcutsVisible == z5) {
            return;
        }
        c(z5);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    @Override // android.view.Menu
    public MenuItem add(int i5) {
        return addInternal(0, 0, 0, this.mResources.getString(i5));
    }

    public void addMenuPresenter(z zVar, Context context) {
        this.mPresenters.add(new WeakReference<>(zVar));
        zVar.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i5) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i5));
    }

    public int findGroupIndex(int i5, int i10) {
        int size = size();
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < size) {
            if (this.mItems.get(i10).f518b == i5) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean performItemAction(MenuItem menuItem, z zVar, int i5) {
        boolean z5;
        p pVar = (p) menuItem;
        if (pVar == null || !pVar.isEnabled()) {
            return false;
        }
        n nVar = pVar.f529n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = pVar.f531p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(pVar)) && !nVar.dispatchMenuItemSelected(nVar, pVar)) {
            if (pVar.f523g != null) {
                try {
                    nVar.getContext().startActivity(pVar.f523g);
                } catch (ActivityNotFoundException e7) {
                    w0.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e7);
                }
            }
            q qVar = pVar.A;
            if (qVar == null || !qVar.f542b.onPerformDefaultAction()) {
                z5 = false;
                q qVar2 = pVar.A;
                boolean z7 = qVar2 == null && qVar2.f542b.hasSubMenu();
                if (!pVar.e()) {
                    z5 |= pVar.expandActionView();
                    if (z5) {
                        close(true);
                    }
                } else if (pVar.hasSubMenu() || z7) {
                    if ((i5 & 4) == 0) {
                        close(false);
                    }
                    if (!pVar.hasSubMenu()) {
                        f0 f0Var = new f0(getContext(), this, pVar);
                        pVar.f530o = f0Var;
                        f0Var.setHeaderTitle(pVar.f521e);
                    }
                    f0 f0Var2 = pVar.f530o;
                    if (z7) {
                        qVar2.f542b.onPrepareSubMenu(f0Var2);
                    }
                    if (!this.mPresenters.isEmpty()) {
                        r0 = zVar != null ? zVar.onSubMenuSelected(f0Var2) : false;
                        Iterator<WeakReference<z>> it = this.mPresenters.iterator();
                        while (it.hasNext()) {
                            WeakReference<z> next = it.next();
                            z zVar2 = next.get();
                            if (zVar2 == null) {
                                this.mPresenters.remove(next);
                            } else if (!r0) {
                                r0 = zVar2.onSubMenuSelected(f0Var2);
                            }
                        }
                    }
                    z5 |= r0;
                    if (!z5) {
                        close(true);
                    }
                } else if ((i5 & 1) == 0) {
                    close(true);
                }
                return z5;
            }
        }
        z5 = true;
        q qVar22 = pVar.A;
        if (qVar22 == null) {
        }
        if (!pVar.e()) {
        }
        return z5;
    }

    public n setHeaderIconInt(int i5) {
        b(0, null, i5, null, null);
        return this;
    }

    public n setHeaderTitleInt(int i5) {
        b(i5, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i5, int i10, int i11, CharSequence charSequence) {
        return addInternal(i5, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i5, int i10, int i11, CharSequence charSequence) {
        p pVar = (p) addInternal(i5, i10, i11, charSequence);
        f0 f0Var = new f0(this.mContext, this, pVar);
        pVar.f530o = f0Var;
        f0Var.setHeaderTitle(pVar.f521e);
        return f0Var;
    }

    @Override // android.view.Menu
    public MenuItem add(int i5, int i10, int i11, int i12) {
        return addInternal(i5, i10, i11, this.mResources.getString(i12));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i5, int i10, int i11, int i12) {
        return addSubMenu(i5, i10, i11, this.mResources.getString(i12));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }

    public n getRootMenu() {
        return this;
    }
}
