package f;

import android.content.Context;
import androidx.activity.ActivityC5043j;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6388a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArraySet f62405a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private volatile ActivityC5043j f62406b;

    public final void a(@NotNull InterfaceC6389b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ActivityC5043j activityC5043j = this.f62406b;
        if (activityC5043j != null) {
            listener.a(activityC5043j);
        }
        this.f62405a.add(listener);
    }

    public final void b() {
        this.f62406b = null;
    }

    public final void c(@NotNull ActivityC5043j context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f62406b = context;
        Iterator it = this.f62405a.iterator();
        while (it.hasNext()) {
            ((InterfaceC6389b) it.next()).a(context);
        }
    }

    public final Context d() {
        return this.f62406b;
    }

    public final void e(@NotNull InterfaceC6389b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f62405a.remove(listener);
    }
}
