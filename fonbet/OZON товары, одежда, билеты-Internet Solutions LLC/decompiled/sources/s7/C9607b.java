package s7;

import androidx.annotation.NonNull;
import com.google.android.material.chip.Chip;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import s7.InterfaceC9612g;

/* renamed from: s7.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9607b<T extends InterfaceC9612g<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f98233a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f98234b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private a f98235c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f98236d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f98237e;

    /* renamed from: s7.b$a */
    public interface a {
        void a();
    }

    static void d(C9607b c9607b) {
        a aVar = c9607b.f98235c;
        if (aVar != null) {
            new HashSet(c9607b.f98234b);
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(@NonNull InterfaceC9612g<T> interfaceC9612g) {
        int id2 = interfaceC9612g.getId();
        HashSet hashSet = this.f98234b;
        if (hashSet.contains(Integer.valueOf(id2))) {
            return false;
        }
        InterfaceC9612g<T> interfaceC9612g2 = (InterfaceC9612g) this.f98233a.get(Integer.valueOf((!this.f98236d || hashSet.isEmpty()) ? -1 : ((Integer) hashSet.iterator().next()).intValue()));
        if (interfaceC9612g2 != null) {
            m(interfaceC9612g2, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id2));
        if (!interfaceC9612g.isChecked()) {
            interfaceC9612g.setChecked(true);
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(@NonNull InterfaceC9612g<T> interfaceC9612g, boolean z11) {
        int id2 = interfaceC9612g.getId();
        HashSet hashSet = this.f98234b;
        if (!hashSet.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z11 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id2))) {
            interfaceC9612g.setChecked(true);
            return false;
        }
        boolean remove = hashSet.remove(Integer.valueOf(id2));
        if (interfaceC9612g.isChecked()) {
            interfaceC9612g.setChecked(false);
        }
        return remove;
    }

    public final void e(Chip chip) {
        this.f98233a.put(Integer.valueOf(chip.getId()), chip);
        if (chip.isChecked()) {
            g(chip);
        }
        chip.o(new C9606a(this));
    }

    public final void f(int i11) {
        a aVar;
        InterfaceC9612g<T> interfaceC9612g = (InterfaceC9612g) this.f98233a.get(Integer.valueOf(i11));
        if (interfaceC9612g == null || !g(interfaceC9612g) || (aVar = this.f98235c) == null) {
            return;
        }
        new HashSet(this.f98234b);
        aVar.a();
    }

    public final boolean h() {
        return this.f98236d;
    }

    public final void i(Chip chip) {
        chip.o(null);
        this.f98233a.remove(Integer.valueOf(chip.getId()));
        this.f98234b.remove(Integer.valueOf(chip.getId()));
    }

    public final void j(a aVar) {
        this.f98235c = aVar;
    }

    public final void k(boolean z11) {
        this.f98237e = z11;
    }

    public final void l(boolean z11) {
        a aVar;
        if (this.f98236d != z11) {
            this.f98236d = z11;
            HashSet hashSet = this.f98234b;
            boolean isEmpty = hashSet.isEmpty();
            Iterator it = this.f98233a.values().iterator();
            while (it.hasNext()) {
                m((InterfaceC9612g) it.next(), false);
            }
            if (isEmpty || (aVar = this.f98235c) == null) {
                return;
            }
            new HashSet(hashSet);
            aVar.a();
        }
    }
}
