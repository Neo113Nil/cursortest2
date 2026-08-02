package dc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.account.CurrentUserDataInteractor", f = "CurrentUserDataInteractor.kt", l = {11}, m = "getUserId")
/* renamed from: dc0.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6175u extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f61583d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6176v f61584e;

    /* renamed from: f, reason: collision with root package name */
    int f61585f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6175u(C6176v c6176v, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f61584e = c6176v;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f61583d = obj;
        this.f61585f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f61584e.c(this);
    }
}
