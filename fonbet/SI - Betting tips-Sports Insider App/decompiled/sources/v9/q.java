package v9;

import com.logrocket.protobuf.x;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import xg.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class q extends b {

    /* renamed from: d, reason: collision with root package name */
    public int f24535d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f24536e;

    public q(String str, boolean z5, HashMap hashMap, int i5, List list, List list2) {
        v.f.d(1);
        this.f24469a = str;
        this.f24470b = z5;
        this.f24536e = hashMap;
        this.f24535d = i5;
        this.f24471c = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x024e, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i5, int i10, Object obj) {
        f fVar;
        ArrayList<List> arrayList;
        String str;
        boolean a7;
        ArrayList arrayList2 = new ArrayList();
        f fVar2 = h.f24493a;
        switch (g.f24491a[v.f.d(i10)]) {
            case 1:
                fVar = h.f24493a;
                break;
            case 2:
                fVar = h.f24494b;
                break;
            case 3:
                fVar = h.f24495c;
                break;
            case 4:
                fVar = h.f24496d;
                break;
            case 5:
                fVar = h.f24497e;
                break;
            case 6:
                fVar = h.f24498f;
                break;
            case 7:
                fVar = h.f24499g;
                break;
            case 8:
                fVar = h.f24500h;
                break;
            default:
                fVar = null;
                break;
        }
        if (fVar != null) {
            Iterator<E> it = fVar.iterator();
            while (it.hasNext()) {
                n nVar = (n) this.f24536e.get((j) it.next());
                if (nVar != null) {
                    arrayList2.add(nVar);
                }
            }
        }
        int i11 = this.f24535d;
        if (i5 == i11 && !arrayList2.isEmpty() && obj != null) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                boolean z5 = true;
                if (it2.hasNext()) {
                    n nVar2 = (n) it2.next();
                    String str2 = "";
                    if (i11 == 4 && (obj instanceof x)) {
                        x xVar = (x) obj;
                        List a10 = nVar2.a();
                        j jVar = nVar2.f24525a;
                        int i12 = nVar2.f24526b;
                        if (i12 == 1) {
                            a7 = true;
                        } else {
                            int i13 = g.f24491a[v.f.d(i10)];
                            if (i13 == 1) {
                                throw new ClassCastException();
                            }
                            if (i13 == 2) {
                                throw new ClassCastException();
                            }
                            if (i13 == 3) {
                                zg.h hVar = (zg.h) xVar;
                                int i14 = g.f24492b[jVar.ordinal()];
                                if (i14 != 5) {
                                    if (i14 == 6) {
                                        try {
                                            str = new JSONArray(((zg.i) hVar.f6816b).s().q()).getString(0);
                                        } catch (JSONException unused) {
                                        }
                                    }
                                    str = "";
                                } else {
                                    switch (((zg.i) hVar.f6816b).t()) {
                                        case 1:
                                            str = "DEBUG";
                                            break;
                                        case 2:
                                            str = "INFO";
                                            break;
                                        case 3:
                                            str = "LOG";
                                            break;
                                        case 4:
                                            str = "WARN";
                                            break;
                                        case 5:
                                            str = "ERROR";
                                            break;
                                        case 6:
                                            str = "UNRECOGNIZED";
                                            break;
                                        default:
                                            throw null;
                                    }
                                }
                            } else {
                                if (i13 == 6) {
                                    throw new ClassCastException();
                                }
                                if (i13 == 7) {
                                    throw new ClassCastException();
                                }
                                if (i13 == 8) {
                                    xg.b bVar = (xg.b) xVar;
                                    if (jVar == j.f24517r) {
                                        str = "https://" + ((xg.c) bVar.f6816b).t() + "/" + ((xg.c) bVar.f6816b).s();
                                    }
                                }
                                str = "";
                            }
                            a7 = h.a(str, a10, i12);
                        }
                        if (!a7) {
                        }
                    }
                    if (i11 == 1) {
                        if (obj instanceof com.logrocket.core.graphics.o) {
                            com.logrocket.core.graphics.o oVar = (com.logrocket.core.graphics.o) obj;
                            List a11 = nVar2.a();
                            int i15 = nVar2.f24526b;
                            if (i15 != 1) {
                                int i16 = g.f24492b[nVar2.f24525a.ordinal()];
                                if (i16 == 1) {
                                    str2 = oVar.b();
                                } else if (i16 == 2) {
                                    str2 = oVar.f6582a;
                                } else if (i16 == 3) {
                                    str2 = oVar.c();
                                } else if (i16 == 4) {
                                    str2 = oVar.a();
                                }
                                return h.a(str2, a11, i15);
                            }
                        }
                    } else if (i11 == 2 && (obj instanceof String)) {
                        if (nVar2.f24526b == 2) {
                            return h.a((String) obj, nVar2.a(), 3);
                        }
                        String str3 = (String) obj;
                        List a12 = nVar2.a();
                        int i17 = nVar2.f24526b;
                        if (i17 != 1) {
                            return h.a(str3, a12, i17);
                        }
                    } else if (i11 == 3 && (obj instanceof xg.q)) {
                        xg.q qVar = (xg.q) obj;
                        if (nVar2.f24525a == j.f24515o) {
                            String A = ((t) qVar.f6816b).A();
                            if (!A.isEmpty()) {
                                Iterator it3 = nVar2.a().iterator();
                                while (it3.hasNext()) {
                                    if (io.sentry.config.a.A(nVar2.f24526b, A, (String) it3.next())) {
                                        if (z5) {
                                        }
                                    }
                                }
                            }
                            z5 = false;
                            if (z5) {
                            }
                        } else {
                            switch (nVar2.f24527c) {
                                case 0:
                                    arrayList = nVar2.f24528d;
                                    break;
                                default:
                                    arrayList = new ArrayList();
                                    break;
                            }
                            for (List<o> list : arrayList) {
                                List unmodifiableList = DesugarCollections.unmodifiableList(((t) qVar.f6816b).z());
                                int size = unmodifiableList.size() - 1;
                                for (o oVar2 : list) {
                                    if (!oVar2.f24532d) {
                                        while (true) {
                                            if (size < 0) {
                                                size = -1;
                                            } else if (!k2.x.b((xg.p) unmodifiableList.get(size), oVar2)) {
                                                size--;
                                            }
                                        }
                                        if (size < 0) {
                                            break;
                                        }
                                        size--;
                                    } else if (size >= 0) {
                                        int i18 = size - 1;
                                        if (!k2.x.b((xg.p) unmodifiableList.get(size), oVar2)) {
                                            break;
                                        }
                                        size = i18;
                                    }
                                }
                                if (z5) {
                                }
                            }
                            z5 = false;
                            if (z5) {
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
