package y;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: d, reason: collision with root package name */
    public final n f25492d;

    /* renamed from: f, reason: collision with root package name */
    public int f25494f;

    /* renamed from: g, reason: collision with root package name */
    public int f25495g;

    /* renamed from: a, reason: collision with root package name */
    public n f25489a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25490b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25491c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f25493e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f25496h = 1;

    /* renamed from: i, reason: collision with root package name */
    public f f25497i = null;
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f25498k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f25499l = new ArrayList();

    public e(n nVar) {
        this.f25492d = nVar;
    }

    @Override // y.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f25499l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((e) it.next()).j) {
                return;
            }
        }
        this.f25491c = true;
        n nVar = this.f25489a;
        if (nVar != null) {
            nVar.a(this);
        }
        if (this.f25490b) {
            this.f25492d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        e eVar = null;
        int i5 = 0;
        while (it2.hasNext()) {
            e eVar2 = (e) it2.next();
            if (!(eVar2 instanceof f)) {
                i5++;
                eVar = eVar2;
            }
        }
        if (eVar != null && i5 == 1 && eVar.j) {
            f fVar = this.f25497i;
            if (fVar != null) {
                if (!fVar.j) {
                    return;
                } else {
                    this.f25494f = this.f25496h * fVar.f25495g;
                }
            }
            d(eVar.f25495g + this.f25494f);
        }
        n nVar2 = this.f25489a;
        if (nVar2 != null) {
            nVar2.a(this);
        }
    }

    public final void b(n nVar) {
        this.f25498k.add(nVar);
        if (this.j) {
            nVar.a(nVar);
        }
    }

    public final void c() {
        this.f25499l.clear();
        this.f25498k.clear();
        this.j = false;
        this.f25495g = 0;
        this.f25491c = false;
        this.f25490b = false;
    }

    public void d(int i5) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f25495g = i5;
        Iterator it = this.f25498k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25492d.f25514b.f25307h0);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        switch (this.f25493e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append("(");
        sb2.append(this.j ? Integer.valueOf(this.f25495g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f25499l.size());
        sb2.append(":d=");
        sb2.append(this.f25498k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
