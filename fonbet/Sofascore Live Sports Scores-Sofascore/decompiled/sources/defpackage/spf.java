package defpackage;

import android.graphics.Bitmap;
import coil.memory.MemoryCache$Key;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class spf implements d0l {
    public final LinkedHashMap a;
    public int b;

    public spf(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void a() {
        this.b = 0;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                rpf rpfVar = (rpf) CollectionsKt.firstOrNull(arrayList);
                if ((rpfVar != null ? (Bitmap) rpfVar.b.get() : null) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((rpf) arrayList.get(i3)).b.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // defpackage.d0l
    public synchronized void b(int i) {
        if (i >= 10 && i != 20) {
            a();
        }
    }

    public void c() {
        int i = this.b;
        this.b = i + 1;
        if (i >= 10) {
            this.b = 0;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    qpf qpfVar = (qpf) CollectionsKt.firstOrNull(arrayList);
                    if ((qpfVar != null ? (nr9) qpfVar.a.get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((qpf) arrayList.get(i4)).a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // defpackage.d0l
    public synchronized pec d(MemoryCache$Key memoryCache$Key) {
        try {
            ArrayList arrayList = (ArrayList) this.a.get(memoryCache$Key);
            pec pecVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                rpf rpfVar = (rpf) arrayList.get(i);
                Bitmap bitmap = (Bitmap) rpfVar.b.get();
                pec pecVar2 = bitmap != null ? new pec(bitmap, rpfVar.c) : null;
                if (pecVar2 != null) {
                    pecVar = pecVar2;
                    break;
                }
                i++;
            }
            int i2 = this.b;
            this.b = i2 + 1;
            if (i2 >= 10) {
                a();
            }
            return pecVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void e(nec necVar, nr9 nr9Var, Map map, long j) {
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(necVar);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(necVar, obj);
        }
        ArrayList arrayList = (ArrayList) obj;
        qpf qpfVar = new qpf(new WeakReference(nr9Var), map, j);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                qpf qpfVar2 = (qpf) arrayList.get(i);
                if (j < qpfVar2.c) {
                    i++;
                } else if (qpfVar2.a.get() == nr9Var) {
                    arrayList.set(i, qpfVar);
                } else {
                    arrayList.add(i, qpfVar);
                }
            }
        } else {
            arrayList.add(qpfVar);
        }
        c();
    }

    @Override // defpackage.d0l
    public synchronized void g(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = this.a;
            Object obj = linkedHashMap.get(memoryCache$Key);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(memoryCache$Key, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            rpf rpfVar = new rpf(identityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList.add(rpfVar);
                    break;
                }
                rpf rpfVar2 = (rpf) arrayList.get(i2);
                if (i < rpfVar2.d) {
                    i2++;
                } else if (rpfVar2.a == identityHashCode && rpfVar2.b.get() == bitmap) {
                    arrayList.set(i2, rpfVar);
                } else {
                    arrayList.add(i2, rpfVar);
                }
            }
            int i3 = this.b;
            this.b = i3 + 1;
            if (i3 >= 10) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
