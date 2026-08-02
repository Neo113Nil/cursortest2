package v50;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v50.p;

/* loaded from: classes3.dex */
public final class t implements p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t f102407a = new t();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final HashMap<p.a, p.b> f102408b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f102409c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Handler f102410d = new Handler(Looper.getMainLooper(), new s());

    public static boolean g(Message msg) {
        WeakReference<p.a> d11;
        p.a aVar;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what != 0) {
            return false;
        }
        Object obj = msg.obj;
        if (!(obj instanceof p.b)) {
            return true;
        }
        p.b bVar = (p.b) obj;
        synchronized (f102409c) {
            if (bVar != null) {
                try {
                    bVar.f();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (bVar != null && (d11 = bVar.d()) != null && (aVar = d11.get()) != null) {
                f102410d.removeCallbacksAndMessages(aVar);
                aVar.dismiss();
            }
        }
        return true;
    }

    private static void l(p.b bVar) {
        Handler handler = f102410d;
        handler.removeCallbacksAndMessages(bVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, bVar), (bVar != null ? Integer.valueOf(bVar.c()) : 4000L).longValue());
    }

    @Override // v50.p
    public final void a(@NotNull j snack, int i11) {
        Intrinsics.checkNotNullParameter(snack, "snack");
        synchronized (f102409c) {
            f102408b.put(snack, new p.b(snack, i11));
            snack.show();
            Unit unit = Unit.f71690a;
        }
    }

    @Override // v50.p
    public final void b(@NotNull j snack) {
        Intrinsics.checkNotNullParameter(snack, "snack");
        synchronized (f102409c) {
            p.b bVar = f102408b.get(snack);
            if (bVar != null) {
                bVar.g(false);
                l(bVar);
                Unit unit = Unit.f71690a;
            }
        }
    }

    @Override // v50.p
    public final void c(@NotNull j snack) {
        Intrinsics.checkNotNullParameter(snack, "snack");
        p.b bVar = f102408b.get(snack);
        if (bVar != null) {
            bVar.f();
            f102410d.removeCallbacksAndMessages(bVar);
        }
    }

    @Override // v50.p
    public final void d(@NotNull j snack) {
        Intrinsics.checkNotNullParameter(snack, "snack");
        synchronized (f102409c) {
            l(f102408b.get(snack));
            Unit unit = Unit.f71690a;
        }
    }

    @Override // v50.p
    public final void e(@NotNull j snack) {
        Intrinsics.checkNotNullParameter(snack, "snack");
        synchronized (f102409c) {
            try {
                HashMap<p.a, p.b> hashMap = f102408b;
                p.b bVar = hashMap.get(snack);
                if (bVar != null) {
                    bVar.g(false);
                    f102410d.removeCallbacksAndMessages(bVar);
                }
                hashMap.remove(snack);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v50.p
    public final void f(@NotNull j snack) {
        Intrinsics.checkNotNullParameter(snack, "snack");
        synchronized (f102409c) {
            p.b bVar = f102408b.get(snack);
            if (bVar != null) {
                bVar.g(true);
                f102410d.removeCallbacksAndMessages(bVar);
                Unit unit = Unit.f71690a;
            }
        }
    }

    public final void h() {
        for (Map.Entry<p.a, p.b> entry : f102408b.entrySet()) {
            p.a key = entry.getKey();
            if (!entry.getValue().a()) {
                key.dismiss();
            }
        }
    }

    @NotNull
    public final Set<String> i() {
        Set<p.a> keySet = f102408b.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            String id2 = ((p.a) it.next()).getId();
            if (id2 != null) {
                arrayList.add(id2);
            }
        }
        return C7714v.Y0(arrayList);
    }

    public final p.a j(String str) {
        Object obj;
        HashMap<p.a, p.b> hashMap = f102408b;
        Set<p.a> keySet = hashMap.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        Iterator<T> it = keySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((p.a) obj).getId(), str) && str != null) {
                break;
            }
        }
        p.a aVar = (p.a) obj;
        p.b bVar = hashMap.get(aVar);
        if (bVar != null ? bVar.a() : false) {
            return null;
        }
        return aVar;
    }

    public final void k(@NotNull p.a snack) {
        Intrinsics.checkNotNullParameter(snack, "snack");
        synchronized (f102409c) {
            p.b bVar = f102408b.get(snack);
            if (bVar != null) {
                f102410d.removeCallbacksAndMessages(bVar);
                l(bVar);
                Unit unit = Unit.f71690a;
            }
        }
    }
}
