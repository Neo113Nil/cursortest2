package x1;

import android.view.MotionEvent;
import androidx.collection.C5153w;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* renamed from: x1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10633h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5153w<x> f104876a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final z f104877b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f104878c;

    public C10633h(@NotNull C5153w<x> c5153w, @NotNull z zVar) {
        this.f104876a = c5153w;
        this.f104877b = zVar;
    }

    public final boolean a(long j11) {
        Object obj;
        ArrayList arrayList = (ArrayList) this.f104877b.b();
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            if (w.c(((C10625A) obj).d(), j11)) {
                break;
            }
            i11++;
        }
        C10625A c10625a = (C10625A) obj;
        if (c10625a != null) {
            return c10625a.a();
        }
        return false;
    }

    @NotNull
    public final C5153w<x> b() {
        return this.f104876a;
    }

    @NotNull
    public final MotionEvent c() {
        return this.f104877b.a();
    }

    public final boolean d() {
        return this.f104878c;
    }

    public final void e(boolean z11) {
        this.f104878c = z11;
    }
}
