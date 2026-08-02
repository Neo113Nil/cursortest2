package Aa;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.view.menu.e f358a;

    /* renamed from: c, reason: collision with root package name */
    public int f360c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f361d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f362e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final List f359b = new ArrayList();

    public g(androidx.appcompat.view.menu.e eVar) {
        this.f358a = eVar;
        f();
    }

    public int a() {
        return this.f360c;
    }

    public MenuItem b(int i10) {
        return (MenuItem) this.f359b.get(i10);
    }

    public int c() {
        return this.f361d;
    }

    public int d() {
        return this.f362e;
    }

    public boolean e(MenuItem menuItem, androidx.appcompat.view.menu.i iVar, int i10) {
        return this.f358a.P(menuItem, iVar, i10);
    }

    public void f() {
        this.f359b.clear();
        this.f360c = 0;
        this.f361d = 0;
        this.f362e = 0;
        for (int i10 = 0; i10 < this.f358a.size(); i10++) {
            MenuItem item = this.f358a.getItem(i10);
            if (item.hasSubMenu()) {
                if (!this.f359b.isEmpty()) {
                    if (!(this.f359b.get(r3.size() - 1) instanceof a) && item.isVisible()) {
                        this.f359b.add(new a());
                    }
                }
                this.f359b.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i11 = 0; i11 < subMenu.size(); i11++) {
                    MenuItem item2 = subMenu.getItem(i11);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    this.f359b.add(item2);
                    this.f360c++;
                    if (item2.isVisible()) {
                        this.f361d++;
                    }
                }
                this.f359b.add(new a());
            } else {
                this.f359b.add(item);
                this.f360c++;
                if (item.isVisible()) {
                    this.f361d++;
                    this.f362e++;
                }
            }
        }
        if (this.f359b.isEmpty()) {
            return;
        }
        if (this.f359b.get(r0.size() - 1) instanceof a) {
            this.f359b.remove(r0.size() - 1);
        }
    }

    public int g() {
        return this.f359b.size();
    }
}
