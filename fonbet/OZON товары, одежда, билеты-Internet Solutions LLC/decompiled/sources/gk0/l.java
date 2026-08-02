package gk0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.ConcurrentLinkedDeque;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.uikit.pool.precreation.ClientViewPoolImpl", f = "ClientViewPool.kt", l = {221}, m = "putViewIntoClientPool")
/* loaded from: classes7.dex */
final class l<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    View f64541d;

    /* renamed from: e, reason: collision with root package name */
    String f64542e;

    /* renamed from: f, reason: collision with root package name */
    ConcurrentLinkedDeque f64543f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f64544g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ e f64545h;

    /* renamed from: i, reason: collision with root package name */
    int f64546i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f64545h = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object o11;
        this.f64544g = obj;
        this.f64546i |= LinearLayoutManager.INVALID_OFFSET;
        o11 = this.f64545h.o(null, null, null, null, this);
        return o11;
    }
}
