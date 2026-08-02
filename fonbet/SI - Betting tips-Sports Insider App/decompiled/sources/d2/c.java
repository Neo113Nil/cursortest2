package d2;

import androidx.appcompat.widget.c1;
import e.y;
import hg.d1;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.credentials.playservices.controllers.CreateRestoreCredential.a f8082a;

    /* renamed from: b, reason: collision with root package name */
    public final f f8083b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f8084c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f8085d;

    public c(androidx.credentials.playservices.controllers.CreateRestoreCredential.a onBackCompletedFallback) {
        Intrinsics.checkNotNullParameter(onBackCompletedFallback, "onBackCompletedFallback");
        this.f8082a = onBackCompletedFallback;
        this.f8083b = new f();
        new LinkedHashSet();
        this.f8084c = new LinkedHashSet();
        this.f8085d = new LinkedHashSet();
    }

    public static void a(c dispatcher, y handler) {
        dispatcher.getClass();
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (dispatcher.f8084c.add(handler)) {
            f fVar = dispatcher.f8083b;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(handler, "handler");
            if (handler.f8451e == null) {
                fVar.f8094e.addFirst(handler);
                handler.f8451e = dispatcher;
                fVar.b();
            } else {
                throw new IllegalArgumentException(("Handler '" + handler + "' is already registered with a dispatcher").toString());
            }
        }
    }

    public final void b(e input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.f8085d.add(input)) {
            this.f8083b.a(this, input, -1);
        }
    }

    public final void c(l input, int i5) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (i5 != 1 && i5 != 0) {
            throw new IllegalArgumentException(c1.i(i5, "Unsupported priority value: ").toString());
        }
        if (this.f8085d.add(input)) {
            this.f8083b.a(this, input, i5);
        }
    }

    public final void d(e input, b event) {
        Intrinsics.checkNotNullParameter(input, "input");
        f fVar = this.f8083b;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        if (fVar.f8096g != 0) {
            return;
        }
        y c2 = fVar.c(-1);
        fVar.f8095f = c2;
        fVar.f8096g = -1;
        fVar.f8097h = input;
        if (event != null) {
            if (c2 != null) {
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(event, "latestEvent");
                Intrinsics.checkNotNullParameter(event, "event");
                c2.f8452f.d(new e.a(event));
            }
            d1 d1Var = fVar.f8090a;
            h hVar = new h(event);
            d1Var.getClass();
            d1Var.k(null, hVar);
        }
    }
}
