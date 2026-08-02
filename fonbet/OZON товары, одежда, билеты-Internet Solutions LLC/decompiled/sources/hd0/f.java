package hd0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.sso2.Sso2MobileConfigResponseDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2MobileConfigInteractor", f = "Sso2MobileConfigInteractor.kt", l = {135}, m = "isTimeToCall")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f65343d;

    /* renamed from: e, reason: collision with root package name */
    Sso2MobileConfigResponseDTO f65344e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f65345f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e f65346g;

    /* renamed from: h, reason: collision with root package name */
    int f65347h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f65346g = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object f7;
        this.f65345f = obj;
        this.f65347h |= LinearLayoutManager.INVALID_OFFSET;
        f7 = this.f65346g.f(null, this);
        return f7;
    }
}
