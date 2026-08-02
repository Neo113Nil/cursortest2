package nc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.crossApp.autologin.data.dto.InitAutologinRequestDto;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAutologinUseCase", f = "CrossAppAutologinUseCase.kt", l = {110, 115, 134}, m = "autologin")
/* renamed from: nc0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8499j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    q f76808d;

    /* renamed from: e, reason: collision with root package name */
    List f76809e;

    /* renamed from: f, reason: collision with root package name */
    InitAutologinRequestDto f76810f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f76811g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ q f76812h;

    /* renamed from: i, reason: collision with root package name */
    int f76813i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8499j(q qVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f76812h = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object h11;
        this.f76811g = obj;
        this.f76813i |= LinearLayoutManager.INVALID_OFFSET;
        h11 = this.f76812h.h(this);
        return h11;
    }
}
