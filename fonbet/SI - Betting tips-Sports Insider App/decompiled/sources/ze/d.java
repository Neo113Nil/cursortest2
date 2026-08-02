package ze;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends c3.a {

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f25932b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f25933c = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f25934d;

    /* renamed from: e, reason: collision with root package name */
    public HashSet f25935e;

    @Override // c3.a
    public final void a(c3.h hVar, Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            hVar.removeView(cVar.f25928a);
            cVar.f25929b = false;
        }
    }

    @Override // c3.a
    public final int b() {
        return this.f25934d.size();
    }

    @Override // c3.a
    public final void c(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            SparseArray g10 = bundle.containsKey("d") ? Build.VERSION.SDK_INT >= 34 ? h.b.g(bundle, "d") : bundle.getSparseParcelableArray("d") : null;
            if (g10 == null) {
                g10 = new SparseArray();
            }
            this.f25933c = g10;
        }
    }

    public final void e(int i5) {
        Iterator it = this.f25935e.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            if (((c) next).f25931d == i5) {
                return;
            }
        }
    }
}
