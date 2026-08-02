package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import xsna.ai50;
import xsna.d0o0;

/* compiled from: CaptureStage.java */
/* loaded from: classes11.dex */
public interface g {

    /* compiled from: CaptureStage.java */
    public static final class a implements g {
        public final f a;

        public a() {
            HashSet hashSet = new HashSet();
            n z = n.z();
            ArrayList arrayList = new ArrayList();
            ai50 b = ai50.b();
            ArrayList arrayList2 = new ArrayList(hashSet);
            o y = o.y(z);
            d0o0 d0o0Var = d0o0.b;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : b.a.keySet()) {
                arrayMap.put(str, b.a(str));
            }
            this.a = new f(arrayList2, y, -1, arrayList, false, new d0o0(arrayMap));
        }

        @Override // androidx.camera.core.impl.g
        public final f a() {
            return this.a;
        }
    }

    f a();
}
