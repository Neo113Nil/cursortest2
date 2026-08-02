package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import xsna.ai50;
import xsna.d0o0;
import xsna.gg9;

/* compiled from: SessionConfig.java */
/* loaded from: classes11.dex */
public final class r {
    public final ArrayList a;
    public final List<CameraDevice.StateCallback> b;
    public final List<CameraCaptureSession.StateCallback> c;
    public final List<gg9> d;
    public final List<c> e;
    public final f f;

    /* compiled from: SessionConfig.java */
    public static class a {
        public final HashSet a = new HashSet();
        public final f.a b = new f.a();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();
        public final ArrayList e = new ArrayList();
        public final ArrayList f = new ArrayList();
    }

    /* compiled from: SessionConfig.java */
    public static class b extends a {
        @NonNull
        public static b c(@NonNull u<?> uVar) {
            d u = uVar.u();
            if (u != null) {
                b bVar = new b();
                u.a(uVar, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + uVar.i(uVar.toString()));
        }

        public final void a(@NonNull DeferrableSurface deferrableSurface) {
            this.a.add(deferrableSurface);
            this.b.a.add(deferrableSurface);
        }

        @NonNull
        public final r b() {
            return new r(new ArrayList(this.a), this.c, this.d, this.f, this.e, this.b.d());
        }
    }

    /* compiled from: SessionConfig.java */
    public interface c {
        void onError();
    }

    /* compiled from: SessionConfig.java */
    public interface d {
        void a(@NonNull u<?> uVar, @NonNull b bVar);
    }

    /* compiled from: SessionConfig.java */
    public static final class e extends a {
        public boolean g = true;
        public boolean h = false;

        public final void a(@NonNull r rVar) {
            f fVar = rVar.f;
            int i = fVar.c;
            f.a aVar = this.b;
            if (i != -1) {
                if (!this.h) {
                    aVar.c = i;
                    this.h = true;
                } else if (aVar.c != i) {
                    this.g = false;
                }
            }
            d0o0 d0o0Var = fVar.f;
            ai50 ai50Var = aVar.f;
            HashSet hashSet = aVar.a;
            ai50Var.a.putAll((Map) d0o0Var.a);
            this.c.addAll(rVar.b);
            this.d.addAll(rVar.c);
            aVar.a(fVar.d);
            this.f.addAll(rVar.d);
            this.e.addAll(rVar.e);
            List unmodifiableList = Collections.unmodifiableList(rVar.a);
            HashSet hashSet2 = this.a;
            hashSet2.addAll(unmodifiableList);
            hashSet.addAll(Collections.unmodifiableList(fVar.a));
            if (!hashSet2.containsAll(hashSet)) {
                this.g = false;
            }
            aVar.c(fVar.b);
        }

        @NonNull
        public final r b() {
            if (!this.g) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            return new r(new ArrayList(this.a), this.c, this.d, this.f, this.e, this.b.d());
        }
    }

    public r(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, f fVar) {
        this.a = arrayList;
        this.b = Collections.unmodifiableList(arrayList2);
        this.c = Collections.unmodifiableList(arrayList3);
        this.d = Collections.unmodifiableList(arrayList4);
        this.e = Collections.unmodifiableList(arrayList5);
        this.f = fVar;
    }

    @NonNull
    public static r a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        ArrayList arrayList5 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        n z = n.z();
        ArrayList arrayList6 = new ArrayList();
        ai50 b2 = ai50.b();
        ArrayList arrayList7 = new ArrayList(hashSet);
        o y = o.y(z);
        d0o0 d0o0Var = d0o0.b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : b2.a.keySet()) {
            arrayMap.put(str, b2.a(str));
        }
        return new r(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, new f(arrayList7, y, -1, arrayList6, false, new d0o0(arrayMap)));
    }
}
