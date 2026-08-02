package xi0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.tracker.debug.menu.domain.tracker.init.ExternalConfigurationInstaller", f = "ExternalConfigurationInstaller.kt", l = {56}, m = "install")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    d f105584d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f105585e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d f105586f;

    /* renamed from: g, reason: collision with root package name */
    int f105587g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f105586f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f105585e = obj;
        this.f105587g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f105586f.b(this);
    }
}
