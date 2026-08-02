package k00;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.debug.menu.data.cookie.X03ComposerDebugTokenCookieDelegate", f = "X03ComposerDebugTokenCookieDelegate.kt", l = {70, 71}, m = "removeCookie")
/* renamed from: k00.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C7449b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f70250d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f70251e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7451d f70252f;

    /* renamed from: g, reason: collision with root package name */
    int f70253g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7449b(C7451d c7451d, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f70252f = c7451d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f70251e = obj;
        this.f70253g |= LinearLayoutManager.INVALID_OFFSET;
        return C7451d.c(this.f70252f, this);
    }
}
