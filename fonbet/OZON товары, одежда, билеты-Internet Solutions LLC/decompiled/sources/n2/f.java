package n2;

import java.util.ArrayList;
import java.util.Iterator;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import spay.sdk.domain.model.FraudMonInfo;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    p f76319d;

    /* renamed from: f, reason: collision with root package name */
    int f76321f;

    /* renamed from: g, reason: collision with root package name */
    public int f76322g;

    /* renamed from: a, reason: collision with root package name */
    public p f76316a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f76317b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f76318c = false;

    /* renamed from: e, reason: collision with root package name */
    a f76320e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f76323h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f76324i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f76325j = false;

    /* renamed from: k, reason: collision with root package name */
    ArrayList f76326k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    ArrayList f76327l = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes8.dex */
    static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a BASELINE;
        public static final a BOTTOM;
        public static final a HORIZONTAL_DIMENSION;
        public static final a LEFT;
        public static final a RIGHT;
        public static final a TOP;
        public static final a UNKNOWN;
        public static final a VERTICAL_DIMENSION;

        static {
            a aVar = new a(FraudMonInfo.UNKNOWN, 0);
            UNKNOWN = aVar;
            a aVar2 = new a("HORIZONTAL_DIMENSION", 1);
            HORIZONTAL_DIMENSION = aVar2;
            a aVar3 = new a("VERTICAL_DIMENSION", 2);
            VERTICAL_DIMENSION = aVar3;
            a aVar4 = new a("LEFT", 3);
            LEFT = aVar4;
            a aVar5 = new a("RIGHT", 4);
            RIGHT = aVar5;
            a aVar6 = new a("TOP", 5);
            TOP = aVar6;
            a aVar7 = new a("BOTTOM", 6);
            BOTTOM = aVar7;
            a aVar8 = new a("BASELINE", 7);
            BASELINE = aVar8;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
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

    public f(p pVar) {
        this.f76319d = pVar;
    }

    @Override // n2.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f76327l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f76325j) {
                return;
            }
        }
        this.f76318c = true;
        p pVar = this.f76316a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f76317b) {
            this.f76319d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i11 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i11++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i11 == 1 && fVar.f76325j) {
            g gVar = this.f76324i;
            if (gVar != null) {
                if (!gVar.f76325j) {
                    return;
                } else {
                    this.f76321f = this.f76323h * gVar.f76322g;
                }
            }
            d(fVar.f76322g + this.f76321f);
        }
        p pVar2 = this.f76316a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(p pVar) {
        this.f76326k.add(pVar);
        if (this.f76325j) {
            pVar.a(pVar);
        }
    }

    public final void c() {
        this.f76327l.clear();
        this.f76326k.clear();
        this.f76325j = false;
        this.f76322g = 0;
        this.f76318c = false;
        this.f76317b = false;
    }

    public void d(int i11) {
        if (this.f76325j) {
            return;
        }
        this.f76325j = true;
        this.f76322g = i11;
        Iterator it = this.f76326k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f76319d.f76344b.s());
        sb2.append(ProductContainerDTO.RATIO_DELIMITER);
        sb2.append(this.f76320e);
        sb2.append("(");
        sb2.append(this.f76325j ? Integer.valueOf(this.f76322g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f76327l.size());
        sb2.append(":d=");
        sb2.append(this.f76326k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
