package t5;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;
import t5.InterfaceC9758c;

/* renamed from: t5.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9762g implements InterfaceC9764i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap<InterfaceC9758c.b, ArrayList<a>> f99187a = new LinkedHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private int f99188b;

    /* renamed from: t5.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f99189a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final WeakReference<Bitmap> f99190b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Map<String, Object> f99191c;

        /* renamed from: d, reason: collision with root package name */
        private final int f99192d;

        public a(int i11, @NotNull WeakReference<Bitmap> weakReference, @NotNull Map<String, ? extends Object> map, int i12) {
            this.f99189a = i11;
            this.f99190b = weakReference;
            this.f99191c = map;
            this.f99192d = i12;
        }

        @NotNull
        public final WeakReference<Bitmap> a() {
            return this.f99190b;
        }

        @NotNull
        public final Map<String, Object> b() {
            return this.f99191c;
        }

        public final int c() {
            return this.f99189a;
        }

        public final int d() {
            return this.f99192d;
        }
    }

    @Override // t5.InterfaceC9764i
    public final synchronized void a(int i11) {
        if (i11 >= 10 && i11 != 20) {
            d();
        }
    }

    @Override // t5.InterfaceC9764i
    public final synchronized InterfaceC9758c.C2178c b(@NotNull InterfaceC9758c.b bVar) {
        try {
            ArrayList<a> arrayList = this.f99187a.get(bVar);
            InterfaceC9758c.C2178c c2178c = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                a aVar = arrayList.get(i11);
                Bitmap bitmap = aVar.a().get();
                InterfaceC9758c.C2178c c2178c2 = bitmap != null ? new InterfaceC9758c.C2178c(bitmap, aVar.b()) : null;
                if (c2178c2 != null) {
                    c2178c = c2178c2;
                    break;
                }
                i11++;
            }
            int i12 = this.f99188b;
            this.f99188b = i12 + 1;
            if (i12 >= 10) {
                d();
            }
            return c2178c;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // t5.InterfaceC9764i
    public final synchronized void c(@NotNull InterfaceC9758c.b bVar, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i11) {
        try {
            LinkedHashMap<InterfaceC9758c.b, ArrayList<a>> linkedHashMap = this.f99187a;
            ArrayList<a> arrayList = linkedHashMap.get(bVar);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(bVar, arrayList);
            }
            ArrayList<a> arrayList2 = arrayList;
            int identityHashCode = System.identityHashCode(bitmap);
            a aVar = new a(identityHashCode, new WeakReference(bitmap), map, i11);
            int size = arrayList2.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    arrayList2.add(aVar);
                    break;
                }
                a aVar2 = arrayList2.get(i12);
                if (i11 < aVar2.d()) {
                    i12++;
                } else if (aVar2.c() == identityHashCode && aVar2.a().get() == bitmap) {
                    arrayList2.set(i12, aVar);
                } else {
                    arrayList2.add(i12, aVar);
                }
            }
            int i13 = this.f99188b;
            this.f99188b = i13 + 1;
            if (i13 >= 10) {
                d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d() {
        WeakReference<Bitmap> a11;
        this.f99188b = 0;
        Iterator<ArrayList<a>> it = this.f99187a.values().iterator();
        while (it.hasNext()) {
            ArrayList<a> next = it.next();
            if (next.size() <= 1) {
                a aVar = (a) C7714v.M(next);
                if (((aVar == null || (a11 = aVar.a()) == null) ? null : a11.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int i13 = i12 - i11;
                    if (next.get(i13).a().get() == null) {
                        next.remove(i13);
                        i11++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
