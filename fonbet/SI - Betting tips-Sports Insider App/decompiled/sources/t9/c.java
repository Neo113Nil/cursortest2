package t9;

import android.graphics.RectF;
import com.logrocket.core.f;
import com.logrocket.core.graphics.n;
import com.logrocket.core.p;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicBoolean f23780k = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    public static final ConcurrentHashMap f23781l = new ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicBoolean f23782m = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23783a;

    /* renamed from: b, reason: collision with root package name */
    public final ba.d f23784b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f23785c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f23786d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f23787e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f23788f;

    /* renamed from: g, reason: collision with root package name */
    public final n f23789g;

    /* renamed from: h, reason: collision with root package name */
    public Stack f23790h;

    /* renamed from: i, reason: collision with root package name */
    public int f23791i;
    public int j;

    public c(f fVar, n nVar) {
        Throwable th2;
        ba.d dVar = new ba.d(c.class.getSimpleName());
        this.f23784b = dVar;
        this.f23787e = new ArrayList();
        this.f23788f = new LinkedList();
        this.f23790h = new Stack();
        this.f23791i = 0;
        this.j = 0;
        boolean z5 = fVar.f6436m;
        this.f23783a = z5 && b.f23756a == null;
        this.f23785c = fVar.f6427c;
        this.f23786d = fVar.f6428d;
        this.f23789g = nVar;
        if (!z5 || (th2 = b.f23756a) == null) {
            return;
        }
        dVar.e("LogRocket Jetpack Compose view capture is not supported", th2);
        p.a(String.format("%s. Reason: %s", "LogRocket Jetpack Compose view capture is not supported", th2));
    }

    public final void a(e eVar, boolean z5) {
        Object obj = eVar.f23795a;
        d dVar = eVar.f23798d;
        RectF b10 = b.b(obj);
        int identityHashCode = System.identityHashCode(obj);
        int i5 = this.f23791i;
        int i10 = this.j;
        n nVar = this.f23789g;
        if (!nVar.f6575i && !nVar.j) {
            nVar.f6578m.put(Integer.valueOf(identityHashCode), dVar);
            nVar.b(identityHashCode, dVar, Math.round(b10.left) + i5, Math.round(b10.top) + i10, Math.round(b10.width()), Math.round(b10.height()));
        }
        this.f23790h.push(new e(obj, dVar, false, z5));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean booleanValue;
        Object[] objArr;
        while (!this.f23790h.isEmpty()) {
            e eVar = (e) this.f23790h.pop();
            d dVar = eVar.f23798d;
            Object obj = eVar.f23795a;
            LinkedList linkedList = this.f23788f;
            if (dVar != null) {
                if (!eVar.f23796b) {
                    this.f23789g.f(System.identityHashCode(obj));
                } else if (!linkedList.isEmpty()) {
                    linkedList.pop();
                }
                booleanValue = false;
            } else {
                Field field = b.f23766l;
                Method method = b.f23779z;
                booleanValue = (method == null ? Boolean.valueOf(field.getBoolean(obj)) : Boolean.valueOf(field.getBoolean(method.invoke(obj, null)))).booleanValue();
            }
            if (booleanValue) {
                d c2 = b.c(obj, this.f23785c, this.f23786d);
                eVar.f23798d = c2;
                boolean z5 = c2.f23794f;
                boolean z7 = !z5 && (eVar.f23796b || c2.f23793e);
                eVar.f23796b = z7;
                boolean z10 = !z7 && (z5 || eVar.f23797c);
                if (z5) {
                    while (!linkedList.isEmpty()) {
                        e eVar2 = (e) linkedList.removeLast();
                        b.a(eVar2.f23795a, true);
                        a(eVar2, true);
                    }
                }
                if (eVar.f23796b) {
                    b.a(obj, false);
                    this.f23787e.add(obj);
                    linkedList.push(eVar);
                    this.f23790h.push(eVar);
                } else {
                    a(eVar, z10);
                }
                String str = c2.f23792d;
                Boolean valueOf = Boolean.valueOf(z10);
                ConcurrentHashMap concurrentHashMap = f23781l;
                Boolean bool = (Boolean) concurrentHashMap.get(str);
                if (bool == null) {
                    if (concurrentHashMap.size() < 1000) {
                        concurrentHashMap.put(str, valueOf);
                    } else {
                        AtomicBoolean atomicBoolean = f23782m;
                        if (!atomicBoolean.get()) {
                            p.a("No longer registering new allow listed text for this frame due to hitting max limit");
                            atomicBoolean.set(true);
                        }
                    }
                } else if (bool.booleanValue() && !z10) {
                    concurrentHashMap.put(str, Boolean.FALSE);
                }
                Object invoke = b.f23774u.invoke(obj, null);
                if (invoke != null) {
                    Object obj2 = b.f23771r.get(invoke);
                    if (obj2 instanceof Object[]) {
                        objArr = (Object[]) obj2;
                        for (Object obj3 : objArr) {
                            if (obj3 != null) {
                                this.f23790h.push(new e(obj3, null, eVar.f23796b, z10));
                            }
                        }
                    }
                }
                objArr = new Object[0];
                while (r5 < r2) {
                }
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.f23787e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                try {
                    b.a(next, true);
                } catch (Throwable th2) {
                    this.f23784b.e("Failed to place node", th2);
                }
            }
        }
        arrayList.clear();
        this.f23788f.clear();
        this.f23790h.clear();
    }
}
