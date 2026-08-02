package q5;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;
import q5.i;

@kotlin.coroutines.jvm.internal.e(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "intercept")
/* loaded from: classes8.dex */
final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C8986a f81673d;

    /* renamed from: e, reason: collision with root package name */
    i.a f81674e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f81675f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C8986a f81676g;

    /* renamed from: h, reason: collision with root package name */
    int f81677h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(C8986a c8986a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f81676g = c8986a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f81675f = obj;
        this.f81677h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f81676g.a(null, this);
    }
}
