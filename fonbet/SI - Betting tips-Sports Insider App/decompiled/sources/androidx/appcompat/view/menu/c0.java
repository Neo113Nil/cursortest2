package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.app.h0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class c0 extends h0 implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final n f447c;

    public c0(Context context, n nVar) {
        super(context);
        if (nVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f447c = nVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return f(this.f447c.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i5, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f447c.addIntentOptions(i5, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = f(menuItemArr2[i13]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f447c.addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        s.n nVar = (s.n) this.f258b;
        if (nVar != null) {
            nVar.clear();
        }
        this.f447c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f447c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i5) {
        return f(this.f447c.findItem(i5));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i5) {
        return f(this.f447c.getItem(i5));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f447c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i5, KeyEvent keyEvent) {
        return this.f447c.isShortcutKey(i5, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i5, int i10) {
        return this.f447c.performIdentifierAction(i5, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i5, KeyEvent keyEvent, int i10) {
        return this.f447c.performShortcut(i5, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i5) {
        if (((s.n) this.f258b) != null) {
            int i10 = 0;
            while (true) {
                s.n nVar = (s.n) this.f258b;
                if (i10 >= nVar.f22575c) {
                    break;
                }
                if (((i0.a) nVar.g(i10)).getGroupId() == i5) {
                    ((s.n) this.f258b).h(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f447c.removeGroup(i5);
    }

    @Override // android.view.Menu
    public final void removeItem(int i5) {
        if (((s.n) this.f258b) != null) {
            int i10 = 0;
            while (true) {
                s.n nVar = (s.n) this.f258b;
                if (i10 >= nVar.f22575c) {
                    break;
                }
                if (((i0.a) nVar.g(i10)).getItemId() == i5) {
                    ((s.n) this.f258b).h(i10);
                    break;
                }
                i10++;
            }
        }
        this.f447c.removeItem(i5);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i5, boolean z5, boolean z7) {
        this.f447c.setGroupCheckable(i5, z5, z7);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i5, boolean z5) {
        this.f447c.setGroupEnabled(i5, z5);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i5, boolean z5) {
        this.f447c.setGroupVisible(i5, z5);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z5) {
        this.f447c.setQwertyMode(z5);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f447c.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5) {
        return f(this.f447c.add(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5) {
        return this.f447c.addSubMenu(i5);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5, int i10, int i11, CharSequence charSequence) {
        return f(this.f447c.add(i5, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5, int i10, int i11, CharSequence charSequence) {
        return this.f447c.addSubMenu(i5, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5, int i10, int i11, int i12) {
        return f(this.f447c.add(i5, i10, i11, i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5, int i10, int i11, int i12) {
        return this.f447c.addSubMenu(i5, i10, i11, i12);
    }
}
