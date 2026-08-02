package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC2077b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l0.AbstractC5338c;
import q0.InterfaceMenuC6087a;

/* loaded from: classes.dex */
public class e implements InterfaceMenuC6087a {
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f16700a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f16701b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16702c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16703d;

    /* renamed from: e, reason: collision with root package name */
    public a f16704e;

    /* renamed from: m, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f16712m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f16713n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f16714o;

    /* renamed from: p, reason: collision with root package name */
    public View f16715p;

    /* renamed from: x, reason: collision with root package name */
    public g f16723x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f16725z;

    /* renamed from: l, reason: collision with root package name */
    public int f16711l = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16716q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16717r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16718s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16719t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16720u = false;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f16721v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public CopyOnWriteArrayList f16722w = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    public boolean f16724y = false;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f16705f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f16706g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f16707h = true;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f16708i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f16709j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f16710k = true;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean b(g gVar);
    }

    public e(Context context) {
        this.f16700a = context;
        this.f16701b = context.getResources();
        g0(true);
    }

    public static int D(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int p(ArrayList arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((g) arrayList.get(size)).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public View A() {
        return this.f16715p;
    }

    public ArrayList B() {
        t();
        return this.f16709j;
    }

    public boolean C() {
        return this.f16719t;
    }

    public Resources E() {
        return this.f16701b;
    }

    public e F() {
        return this;
    }

    public ArrayList G() {
        if (!this.f16707h) {
            return this.f16706g;
        }
        this.f16706g.clear();
        int size = this.f16705f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f16705f.get(i10);
            if (gVar.isVisible()) {
                this.f16706g.add(gVar);
            }
        }
        this.f16707h = false;
        this.f16710k = true;
        return this.f16706g;
    }

    public boolean H() {
        return !this.f16716q;
    }

    public boolean I() {
        return this.f16724y;
    }

    public boolean J() {
        return this.f16702c;
    }

    public boolean K() {
        return this.f16703d;
    }

    public void L(g gVar) {
        this.f16710k = true;
        N(true);
    }

    public void M(g gVar) {
        this.f16707h = true;
        N(true);
    }

    public void N(boolean z10) {
        if (this.f16716q) {
            this.f16717r = true;
            if (z10) {
                this.f16718s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f16707h = true;
            this.f16710k = true;
        }
        i(z10);
    }

    public boolean O(MenuItem menuItem, int i10) {
        return P(menuItem, null, i10);
    }

    public boolean P(MenuItem menuItem, i iVar, int i10) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k10 = gVar.k();
        AbstractC2077b a10 = gVar.a();
        boolean z10 = a10 != null && a10.a();
        if (gVar.j()) {
            boolean expandActionView = gVar.expandActionView() | k10;
            if (expandActionView) {
                e(true);
            }
            return expandActionView;
        }
        if (!gVar.hasSubMenu() && !z10) {
            if ((i10 & 1) == 0) {
                e(true);
            }
            return k10;
        }
        if ((i10 & 4) == 0) {
            e(false);
        }
        if (!gVar.hasSubMenu()) {
            gVar.x(new l(w(), this, gVar));
        }
        l lVar = (l) gVar.getSubMenu();
        if (z10) {
            a10.e(lVar);
        }
        boolean l10 = l(lVar, iVar) | k10;
        if (!l10) {
            e(true);
        }
        return l10;
    }

    public final void Q(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f16705f.size()) {
            return;
        }
        this.f16705f.remove(i10);
        if (z10) {
            N(true);
        }
    }

    public void R(i iVar) {
        Iterator it = this.f16722w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            i iVar2 = (i) weakReference.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f16722w.remove(weakReference);
            }
        }
    }

    public void S(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(v());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).S(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void T(Bundle bundle) {
        j(bundle);
    }

    public void U(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).U(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void V(Bundle bundle) {
        k(bundle);
    }

    public void W(a aVar) {
        this.f16704e = aVar;
    }

    public e X(int i10) {
        this.f16711l = i10;
        return this;
    }

    public void Y(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f16705f.size();
        i0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f16705f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        h0();
    }

    public e Z(int i10) {
        b0(0, null, i10, null, null);
        return this;
    }

    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int D10 = D(i12);
        g g10 = g(i10, i11, i12, D10, charSequence, this.f16711l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f16712m;
        if (contextMenuInfo != null) {
            g10.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f16705f;
        arrayList.add(p(arrayList, D10), g10);
        N(true);
        return g10;
    }

    public e a0(Drawable drawable) {
        b0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f16700a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(i iVar) {
        c(iVar, this.f16700a);
    }

    public final void b0(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources E10 = E();
        if (view != null) {
            this.f16715p = view;
            this.f16713n = null;
            this.f16714o = null;
        } else {
            if (i10 > 0) {
                this.f16713n = E10.getText(i10);
            } else if (charSequence != null) {
                this.f16713n = charSequence;
            }
            if (i11 > 0) {
                this.f16714o = AbstractC5338c.getDrawable(w(), i11);
            } else if (drawable != null) {
                this.f16714o = drawable;
            }
            this.f16715p = null;
        }
        N(false);
    }

    public void c(i iVar, Context context) {
        this.f16722w.add(new WeakReference(iVar));
        iVar.j(context, this);
        this.f16710k = true;
    }

    public e c0(int i10) {
        b0(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f16723x;
        if (gVar != null) {
            f(gVar);
        }
        this.f16705f.clear();
        N(true);
    }

    public void clearHeader() {
        this.f16714o = null;
        this.f16713n = null;
        this.f16715p = null;
        N(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f16704e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public e d0(CharSequence charSequence) {
        b0(0, charSequence, 0, null, null);
        return this;
    }

    public final void e(boolean z10) {
        if (this.f16720u) {
            return;
        }
        this.f16720u = true;
        Iterator it = this.f16722w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            i iVar = (i) weakReference.get();
            if (iVar == null) {
                this.f16722w.remove(weakReference);
            } else {
                iVar.a(this, z10);
            }
        }
        this.f16720u = false;
    }

    public e e0(View view) {
        b0(0, null, 0, null, view);
        return this;
    }

    public boolean f(g gVar) {
        boolean z10 = false;
        if (!this.f16722w.isEmpty() && this.f16723x == gVar) {
            i0();
            Iterator it = this.f16722w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                i iVar = (i) weakReference.get();
                if (iVar == null) {
                    this.f16722w.remove(weakReference);
                } else {
                    z10 = iVar.i(this, gVar);
                    if (z10) {
                        break;
                    }
                }
            }
            h0();
            if (z10) {
                this.f16723x = null;
            }
        }
        return z10;
    }

    public void f0(boolean z10) {
        this.f16725z = z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f16705f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (androidx.core.view.AbstractC2088g0.l(android.view.ViewConfiguration.get(r2.f16700a), r2.f16700a) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(boolean z10) {
        boolean z11;
        if (z10) {
            z11 = true;
            if (this.f16701b.getConfiguration().keyboard != 1) {
            }
        }
        z11 = false;
        this.f16703d = z11;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return (MenuItem) this.f16705f.get(i10);
    }

    public boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f16704e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public void h0() {
        this.f16716q = false;
        if (this.f16717r) {
            this.f16717r = false;
            N(this.f16718s);
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f16725z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((g) this.f16705f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z10) {
        if (this.f16722w.isEmpty()) {
            return;
        }
        i0();
        Iterator it = this.f16722w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            i iVar = (i) weakReference.get();
            if (iVar == null) {
                this.f16722w.remove(weakReference);
            } else {
                iVar.g(z10);
            }
        }
        h0();
    }

    public void i0() {
        if (this.f16716q) {
            return;
        }
        this.f16716q = true;
        this.f16717r = false;
        this.f16718s = false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return r(i10, keyEvent) != null;
    }

    public final void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f16722w.isEmpty()) {
            return;
        }
        Iterator it = this.f16722w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            i iVar = (i) weakReference.get();
            if (iVar == null) {
                this.f16722w.remove(weakReference);
            } else {
                int id2 = iVar.getId();
                if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    iVar.d(parcelable);
                }
            }
        }
    }

    public final void k(Bundle bundle) {
        Parcelable f10;
        if (this.f16722w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = this.f16722w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            i iVar = (i) weakReference.get();
            if (iVar == null) {
                this.f16722w.remove(weakReference);
            } else {
                int id2 = iVar.getId();
                if (id2 > 0 && (f10 = iVar.f()) != null) {
                    sparseArray.put(id2, f10);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public final boolean l(l lVar, i iVar) {
        if (this.f16722w.isEmpty()) {
            return false;
        }
        boolean e10 = iVar != null ? iVar.e(lVar) : false;
        Iterator it = this.f16722w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            i iVar2 = (i) weakReference.get();
            if (iVar2 == null) {
                this.f16722w.remove(weakReference);
            } else if (!e10) {
                e10 = iVar2.e(lVar);
            }
        }
        return e10;
    }

    public boolean m(g gVar) {
        boolean z10 = false;
        if (this.f16722w.isEmpty()) {
            return false;
        }
        i0();
        Iterator it = this.f16722w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            i iVar = (i) weakReference.get();
            if (iVar == null) {
                this.f16722w.remove(weakReference);
            } else {
                z10 = iVar.b(this, gVar);
                if (z10) {
                    break;
                }
            }
        }
        h0();
        if (z10) {
            this.f16723x = gVar;
        }
        return z10;
    }

    public int n(int i10) {
        return o(i10, 0);
    }

    public int o(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (((g) this.f16705f.get(i11)).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return O(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g r10 = r(i10, keyEvent);
        boolean O10 = r10 != null ? O(r10, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return O10;
    }

    public int q(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((g) this.f16705f.get(i11)).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g r(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f16721v;
        arrayList.clear();
        s(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        boolean J10 = J();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) arrayList.get(i11);
            char alphabeticShortcut = J10 ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (J10 && alphabeticShortcut == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int n10 = n(i10);
        if (n10 >= 0) {
            int size = this.f16705f.size() - n10;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || ((g) this.f16705f.get(n10)).getGroupId() != i10) {
                    break;
                }
                Q(n10, false);
                i11 = i12;
            }
            N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        Q(q(i10), true);
    }

    public void s(List list, int i10, KeyEvent keyEvent) {
        boolean J10 = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f16705f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = (g) this.f16705f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).s(list, i10, keyEvent);
                }
                char alphabeticShortcut = J10 ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((J10 ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (J10 && alphabeticShortcut == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f16705f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f16705f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f16724y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f16705f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f16705f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f16705f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f16705f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f16702c = z10;
        N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f16705f.size();
    }

    public void t() {
        ArrayList G10 = G();
        if (this.f16710k) {
            Iterator it = this.f16722w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                i iVar = (i) weakReference.get();
                if (iVar == null) {
                    this.f16722w.remove(weakReference);
                } else {
                    z10 |= iVar.h();
                }
            }
            if (z10) {
                this.f16708i.clear();
                this.f16709j.clear();
                int size = G10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = (g) G10.get(i10);
                    if (gVar.l()) {
                        this.f16708i.add(gVar);
                    } else {
                        this.f16709j.add(gVar);
                    }
                }
            } else {
                this.f16708i.clear();
                this.f16709j.clear();
                this.f16709j.addAll(G());
            }
            this.f16710k = false;
        }
    }

    public ArrayList u() {
        t();
        return this.f16708i;
    }

    public String v() {
        return "android:menu:actionviewstates";
    }

    public Context w() {
        return this.f16700a;
    }

    public g x() {
        return this.f16723x;
    }

    public Drawable y() {
        return this.f16714o;
    }

    public CharSequence z() {
        return this.f16713n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f16701b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f16701b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        l lVar = new l(this.f16700a, this, gVar);
        gVar.x(lVar);
        return lVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f16701b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f16701b.getString(i13));
    }
}
