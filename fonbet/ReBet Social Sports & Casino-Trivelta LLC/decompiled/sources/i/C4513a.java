package i;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4513a {

    /* renamed from: a, reason: collision with root package name */
    public final Set f47911a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public volatile Context f47912b;

    public final void a(InterfaceC4514b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.f47912b;
        if (context != null) {
            listener.a(context);
        }
        this.f47911a.add(listener);
    }

    public final void b() {
        this.f47912b = null;
    }

    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47912b = context;
        Iterator it = this.f47911a.iterator();
        while (it.hasNext()) {
            ((InterfaceC4514b) it.next()).a(context);
        }
    }

    public final Context d() {
        return this.f47912b;
    }

    public final void e(InterfaceC4514b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47911a.remove(listener);
    }
}
