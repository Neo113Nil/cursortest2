package h6;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: h6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6818f {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f65029a = new ArrayList();

    /* renamed from: h6.f$a */
    private static final class a<Z, R> {

        /* renamed from: a, reason: collision with root package name */
        final Class<Z> f65030a;

        /* renamed from: b, reason: collision with root package name */
        final Class<R> f65031b;

        /* renamed from: c, reason: collision with root package name */
        final InterfaceC6817e<Z, R> f65032c;

        a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull InterfaceC6817e<Z, R> interfaceC6817e) {
            this.f65030a = cls;
            this.f65031b = cls2;
            this.f65032c = interfaceC6817e;
        }
    }

    @NonNull
    public final synchronized <Z, R> InterfaceC6817e<Z, R> a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C6819g.b();
        }
        Iterator it = this.f65029a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f65030a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f65031b)) {
                return aVar.f65032c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    public final synchronized ArrayList b(@NonNull Class cls, @NonNull Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f65029a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if ((aVar.f65030a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f65031b)) && !arrayList.contains(aVar.f65031b)) {
                arrayList.add(aVar.f65031b);
            }
        }
        return arrayList;
    }

    public final synchronized <Z, R> void c(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull InterfaceC6817e<Z, R> interfaceC6817e) {
        this.f65029a.add(new a(cls, cls2, interfaceC6817e));
    }
}
