package m2;

import androidx.recyclerview.widget.LinearLayoutManager;
import f2.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n2.o;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    private int f74086b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f74087c;

    /* renamed from: d, reason: collision with root package name */
    public final e f74088d;

    /* renamed from: e, reason: collision with root package name */
    public final a f74089e;

    /* renamed from: f, reason: collision with root package name */
    public d f74090f;

    /* renamed from: i, reason: collision with root package name */
    f2.h f74093i;

    /* renamed from: a, reason: collision with root package name */
    private HashSet<d> f74085a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f74091g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f74092h = LinearLayoutManager.INVALID_OFFSET;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a BASELINE;
        public static final a BOTTOM;
        public static final a CENTER;
        public static final a CENTER_X;
        public static final a CENTER_Y;
        public static final a LEFT;
        public static final a NONE;
        public static final a RIGHT;
        public static final a TOP;

        static {
            a aVar = new a("NONE", 0);
            NONE = aVar;
            a aVar2 = new a("LEFT", 1);
            LEFT = aVar2;
            a aVar3 = new a("TOP", 2);
            TOP = aVar3;
            a aVar4 = new a("RIGHT", 3);
            RIGHT = aVar4;
            a aVar5 = new a("BOTTOM", 4);
            BOTTOM = aVar5;
            a aVar6 = new a("BASELINE", 5);
            BASELINE = aVar6;
            a aVar7 = new a("CENTER", 6);
            CENTER = aVar7;
            a aVar8 = new a("CENTER_X", 7);
            CENTER_X = aVar8;
            a aVar9 = new a("CENTER_Y", 8);
            CENTER_Y = aVar9;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public d(e eVar, a aVar) {
        this.f74088d = eVar;
        this.f74089e = aVar;
    }

    public final void a(d dVar, int i11) {
        b(dVar, i11, LinearLayoutManager.INVALID_OFFSET, false);
    }

    public final boolean b(d dVar, int i11, int i12, boolean z11) {
        if (dVar == null) {
            n();
            return true;
        }
        if (!z11 && !m(dVar)) {
            return false;
        }
        this.f74090f = dVar;
        if (dVar.f74085a == null) {
            dVar.f74085a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f74090f.f74085a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f74091g = i11;
        this.f74092h = i12;
        return true;
    }

    public final void c(int i11, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f74085a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                n2.i.a(it.next().f74088d, i11, arrayList, oVar);
            }
        }
    }

    public final HashSet<d> d() {
        return this.f74085a;
    }

    public final int e() {
        if (this.f74087c) {
            return this.f74086b;
        }
        return 0;
    }

    public final int f() {
        d dVar;
        if (this.f74088d.M() == 8) {
            return 0;
        }
        return (this.f74092h == Integer.MIN_VALUE || (dVar = this.f74090f) == null || dVar.f74088d.M() != 8) ? this.f74091g : this.f74092h;
    }

    public final d g() {
        a aVar = this.f74089e;
        int ordinal = aVar.ordinal();
        e eVar = this.f74088d;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return eVar.f74106M;
            case 2:
                return eVar.f74107N;
            case 3:
                return eVar.f74104K;
            case 4:
                return eVar.f74105L;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final f2.h h() {
        return this.f74093i;
    }

    public final boolean i() {
        HashSet<d> hashSet = this.f74085a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().g().l()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        HashSet<d> hashSet = this.f74085a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean k() {
        return this.f74087c;
    }

    public final boolean l() {
        return this.f74090f != null;
    }

    public final boolean m(d dVar) {
        if (dVar == null) {
            return false;
        }
        a aVar = this.f74089e;
        e eVar = dVar.f74088d;
        a aVar2 = dVar.f74089e;
        if (aVar2 == aVar) {
            return aVar != a.BASELINE || (eVar.Q() && this.f74088d.Q());
        }
        switch (aVar.ordinal()) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z11 = aVar2 == a.LEFT || aVar2 == a.RIGHT;
                return eVar instanceof h ? z11 || aVar2 == a.CENTER_X : z11;
            case 2:
            case 4:
                boolean z12 = aVar2 == a.TOP || aVar2 == a.BOTTOM;
                return eVar instanceof h ? z12 || aVar2 == a.CENTER_Y : z12;
            case 5:
                return (aVar2 == a.LEFT || aVar2 == a.RIGHT) ? false : true;
            case 6:
                return (aVar2 == a.BASELINE || aVar2 == a.CENTER_X || aVar2 == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final void n() {
        HashSet<d> hashSet;
        d dVar = this.f74090f;
        if (dVar != null && (hashSet = dVar.f74085a) != null) {
            hashSet.remove(this);
            if (this.f74090f.f74085a.size() == 0) {
                this.f74090f.f74085a = null;
            }
        }
        this.f74085a = null;
        this.f74090f = null;
        this.f74091g = 0;
        this.f74092h = LinearLayoutManager.INVALID_OFFSET;
        this.f74087c = false;
        this.f74086b = 0;
    }

    public final void o() {
        this.f74087c = false;
        this.f74086b = 0;
    }

    public final void p() {
        f2.h hVar = this.f74093i;
        if (hVar == null) {
            this.f74093i = new f2.h(h.a.UNRESTRICTED);
        } else {
            hVar.c();
        }
    }

    public final void q(int i11) {
        this.f74086b = i11;
        this.f74087c = true;
    }

    public final String toString() {
        return this.f74088d.s() + ProductContainerDTO.RATIO_DELIMITER + this.f74089e.toString();
    }
}
