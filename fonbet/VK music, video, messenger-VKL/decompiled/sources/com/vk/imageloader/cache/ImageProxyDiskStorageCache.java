package com.vk.imageloader.cache;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.clw;
import xsna.d370;
import xsna.e370;
import xsna.epx;
import xsna.ho8;
import xsna.j370;
import xsna.jgp;
import xsna.rw8;
import xsna.shy;
import xsna.tbn;
import xsna.u370;
import xsna.urd0;
import xsna.vbn;
import xsna.ww8;

/* compiled from: ImageProxyDiskStorageCache.kt */
/* loaded from: classes2.dex */
public final class ImageProxyDiskStorageCache extends vbn {
    public boolean p;
    public final LinkedHashMap q;
    public final LinkedHashMap r;
    public final b s;

    /* compiled from: ImageProxyDiskStorageCache.kt */
    public static final class ProxyCacheItem implements Serializable {
        private static final long serialVersionUID = 20180617104400L;
        private final String additionalParams;
        private final String basePath;
        private final int height;
        private final String resourceId;
        private final int width;

        public ProxyCacheItem(String str, int i, int i2, String str2, String str3) {
            this.resourceId = str;
            this.width = i;
            this.height = i2;
            this.basePath = str2;
            this.additionalParams = str3;
        }

        public final String d() {
            return this.additionalParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProxyCacheItem)) {
                return false;
            }
            ProxyCacheItem proxyCacheItem = (ProxyCacheItem) obj;
            return epx.f(this.resourceId, proxyCacheItem.resourceId) && this.width == proxyCacheItem.width && this.height == proxyCacheItem.height && epx.f(this.basePath, proxyCacheItem.basePath) && epx.f(this.additionalParams, proxyCacheItem.additionalParams);
        }

        public final String g() {
            return this.basePath;
        }

        public final int h() {
            return this.height;
        }

        public final int hashCode() {
            return this.additionalParams.hashCode() + urd0.a(shy.a(this.height, shy.a(this.width, this.resourceId.hashCode() * 31, 31), 31), 31, this.basePath);
        }

        public final String i() {
            return this.resourceId;
        }

        public final int j() {
            return this.width;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProxyCacheItem(resourceId=");
            sb.append(this.resourceId);
            sb.append(", width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", basePath=");
            sb.append(this.basePath);
            sb.append(", additionalParams=");
            return ho8.a(sb, this.additionalParams, ')');
        }
    }

    /* compiled from: ImageProxyDiskStorageCache.kt */
    public static final class a extends Exception {
    }

    /* compiled from: ImageProxyDiskStorageCache.kt */
    public static final class b {
        public final File a;
        public final File b;

        public b(File file) {
            this.a = new File(file, "proxy_cache_meta");
            this.b = new File(file, "proxy_cache_meta.temp");
        }

        public final void a(LinkedHashMap linkedHashMap) {
            File file = this.b;
            ArrayList v = c5g.v(linkedHashMap.values());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    try {
                        objectOutputStream.writeInt(v.size());
                        Iterator it = v.iterator();
                        while (it.hasNext()) {
                            objectOutputStream.writeObject((ProxyCacheItem) it.next());
                        }
                        file.renameTo(this.a);
                        objectOutputStream.close();
                        fileOutputStream.close();
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    com.vk.metrics.eventtracking.b.a.a(new a("Failed to store proxy meta", th));
                } finally {
                    file.delete();
                }
            }
        }
    }

    public ImageProxyDiskStorageCache(tbn tbnVar, u370 u370Var, vbn.b bVar, rw8 rw8Var, e370 e370Var, j370 j370Var, ExecutorService executorService, File file) {
        super(tbnVar, u370Var, bVar, rw8Var, e370Var, executorService);
        this.q = new LinkedHashMap();
        this.r = new LinkedHashMap();
        this.s = new b(file);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    @Override // xsna.vbn
    public final synchronized List<String> h(ww8 ww8Var) {
        ?? r0;
        if (!(ww8Var instanceof clw)) {
            return d370.y(ww8Var);
        }
        o();
        clw clwVar = (clw) ww8Var;
        Set set = (Set) this.q.get(clwVar.d + clwVar.e);
        if (set != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                ProxyCacheItem proxyCacheItem = (ProxyCacheItem) obj;
                clw clwVar2 = (clw) ww8Var;
                int i = clwVar2.b;
                int i2 = clwVar2.c;
                if ((i != proxyCacheItem.j() || i2 != proxyCacheItem.h()) && ((proxyCacheItem.j() != 0 || i != 0 || i2 > proxyCacheItem.h()) && (proxyCacheItem.h() != 0 || i2 != 0 || i > proxyCacheItem.j()))) {
                    if (proxyCacheItem.j() != 0 && proxyCacheItem.h() != 0 && i != 0 && i2 != 0 && i <= proxyCacheItem.j() && i2 <= proxyCacheItem.h()) {
                        float j = proxyCacheItem.j() / proxyCacheItem.h();
                        float f = i;
                        if (j - (f / f) < 1.0E-6f) {
                        }
                    }
                }
                arrayList.add(obj);
            }
            r0 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r0.add(((ProxyCacheItem) it.next()).i());
            }
        } else {
            r0 = EmptyList.b;
        }
        boolean isEmpty = r0.isEmpty();
        ArrayList arrayList2 = r0;
        if (isEmpty) {
            arrayList2 = d370.y(ww8Var);
        }
        return arrayList2;
    }

    @Override // xsna.vbn
    public final synchronized void k(String str) {
        Set set;
        try {
            o();
            String str2 = (String) this.r.remove(str);
            if (str2 != null && (set = (Set) this.q.get(str2)) != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (epx.f(((ProxyCacheItem) it.next()).i(), str)) {
                        it.remove();
                    }
                }
            }
            this.s.a(this.q);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.vbn
    public final synchronized void l(String str, ww8 ww8Var) {
        try {
            if (ww8Var instanceof clw) {
                o();
                clw clwVar = (clw) ww8Var;
                String str2 = clwVar.d + clwVar.e;
                clw clwVar2 = (clw) ww8Var;
                ProxyCacheItem proxyCacheItem = new ProxyCacheItem(str, clwVar2.b, clwVar2.c, clwVar2.d, clwVar2.e);
                LinkedHashMap linkedHashMap = this.q;
                Object obj = linkedHashMap.get(str2);
                if (obj == null) {
                    obj = new LinkedHashSet();
                    linkedHashMap.put(str2, obj);
                }
                ((Set) obj).add(proxyCacheItem);
                this.r.put(str, str2);
                this.s.a(this.q);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.vbn
    public final synchronized void m() {
        this.r.clear();
        this.q.clear();
        this.s.a.delete();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o() {
        if (this.p) {
            return;
        }
        File file = this.s.a;
        boolean exists = file.exists();
        jgp jgpVar = jgp.b;
        if (exists) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                    try {
                        int readInt = objectInputStream.readInt();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (int i = 0; i < readInt; i++) {
                            ProxyCacheItem proxyCacheItem = (ProxyCacheItem) objectInputStream.readObject();
                            String str = proxyCacheItem.g() + proxyCacheItem.d();
                            Object obj = linkedHashMap.get(str);
                            if (obj == null) {
                                obj = new LinkedHashSet();
                                linkedHashMap.put(str, obj);
                            }
                            ((Set) obj).add(proxyCacheItem);
                        }
                        objectInputStream.close();
                        fileInputStream.close();
                        jgpVar = linkedHashMap;
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                file.delete();
                com.vk.metrics.eventtracking.b.a.q(new a("Failed to restore proxy meta", th));
            }
        }
        for (Map.Entry entry : jgpVar.entrySet()) {
            String str2 = (String) entry.getKey();
            Set set = (Set) entry.getValue();
            LinkedHashMap linkedHashMap2 = this.q;
            Object obj2 = linkedHashMap2.get(str2);
            if (obj2 == null) {
                obj2 = new LinkedHashSet();
                linkedHashMap2.put(str2, obj2);
            }
            ((Set) obj2).addAll(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.r.put(((ProxyCacheItem) it.next()).i(), str2);
            }
        }
        this.p = true;
    }
}
