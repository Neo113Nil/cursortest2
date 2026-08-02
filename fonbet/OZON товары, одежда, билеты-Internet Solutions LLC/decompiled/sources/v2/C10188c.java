package v2;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.graphics.g;
import v2.C10191f;

/* renamed from: v2.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10188c {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final g.a f101680a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final Handler f101681b;

    C10188c(@NonNull g.a aVar, @NonNull Handler handler) {
        this.f101680a = aVar;
        this.f101681b = handler;
    }

    final void a(@NonNull C10191f.b bVar) {
        int i11 = bVar.f101698b;
        Handler handler = this.f101681b;
        g.a aVar = this.f101680a;
        if (i11 == 0) {
            handler.post(new RunnableC10186a(aVar, bVar.f101697a));
        } else {
            handler.post(new RunnableC10187b(aVar, i11));
        }
    }
}
