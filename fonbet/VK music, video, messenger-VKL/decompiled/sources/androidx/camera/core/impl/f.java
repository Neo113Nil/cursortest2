package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Config;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.ai50;
import xsna.d0o0;
import xsna.gg9;
import xsna.t640;

/* compiled from: CaptureConfig.java */
/* loaded from: classes11.dex */
public final class f {
    public static final androidx.camera.core.impl.a g = Config.a.a(Integer.TYPE, "camerax.core.captureConfig.rotation");
    public static final androidx.camera.core.impl.a h = Config.a.a(Integer.class, "camerax.core.captureConfig.jpegQuality");
    public final ArrayList a;
    public final o b;
    public final int c;
    public final List<gg9> d;
    public final boolean e;

    @NonNull
    public final d0o0 f;

    /* compiled from: CaptureConfig.java */
    public interface b {
        void a(@NonNull u<?> uVar, @NonNull a aVar);
    }

    public f(ArrayList arrayList, o oVar, int i, ArrayList arrayList2, boolean z, @NonNull d0o0 d0o0Var) {
        this.a = arrayList;
        this.b = oVar;
        this.c = i;
        this.d = Collections.unmodifiableList(arrayList2);
        this.e = z;
        this.f = d0o0Var;
    }

    /* compiled from: CaptureConfig.java */
    public static final class a {
        public final HashSet a;
        public n b;
        public int c;
        public final ArrayList d;
        public boolean e;
        public final ai50 f;

        public a() {
            this.a = new HashSet();
            this.b = n.z();
            this.c = -1;
            this.d = new ArrayList();
            this.e = false;
            this.f = ai50.b();
        }

        public final void a(@NonNull Collection<gg9> collection) {
            Iterator<gg9> it = collection.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }

        public final void b(@NonNull gg9 gg9Var) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(gg9Var)) {
                throw new IllegalArgumentException("duplicate camera capture callback");
            }
            arrayList.add(gg9Var);
        }

        public final void c(@NonNull Config config) {
            Object obj;
            for (Config.a<?> aVar : config.e()) {
                n nVar = this.b;
                nVar.getClass();
                try {
                    obj = nVar.f(aVar);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Object f = config.f(aVar);
                if (obj instanceof t640) {
                    t640 t640Var = (t640) f;
                    t640Var.getClass();
                    ((t640) obj).a.addAll(Collections.unmodifiableList(new ArrayList(t640Var.a)));
                } else {
                    if (f instanceof t640) {
                        f = ((t640) f).clone();
                    }
                    this.b.B(aVar, config.h(aVar), f);
                }
            }
        }

        @NonNull
        public final f d() {
            ArrayList arrayList = new ArrayList(this.a);
            o y = o.y(this.b);
            int i = this.c;
            boolean z = this.e;
            d0o0 d0o0Var = d0o0.b;
            ArrayMap arrayMap = new ArrayMap();
            ai50 ai50Var = this.f;
            for (String str : ai50Var.a.keySet()) {
                arrayMap.put(str, ai50Var.a(str));
            }
            return new f(arrayList, y, i, this.d, z, new d0o0(arrayMap));
        }

        public a(f fVar) {
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            this.b = n.z();
            this.c = -1;
            ArrayList arrayList = new ArrayList();
            this.d = arrayList;
            this.e = false;
            this.f = ai50.b();
            hashSet.addAll(fVar.a);
            this.b = n.A(fVar.b);
            this.c = fVar.c;
            arrayList.addAll(fVar.d);
            this.e = fVar.e;
            d0o0 d0o0Var = fVar.f;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : d0o0Var.a.keySet()) {
                arrayMap.put(str, d0o0Var.a(str));
            }
            this.f = new ai50(arrayMap);
        }
    }
}
