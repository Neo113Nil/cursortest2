package od0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.id.switchUser.SwitchUserUseCase", f = "SwitchUserUseCase.kt", l = {42}, m = "execute")
/* renamed from: od0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8697c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C8696b f78088d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f78089e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C8696b f78090f;

    /* renamed from: g, reason: collision with root package name */
    int f78091g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8697c(C8696b c8696b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f78090f = c8696b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f78089e = obj;
        this.f78091g |= LinearLayoutManager.INVALID_OFFSET;
        return C8696b.a(this.f78090f, 0L, this);
    }
}
