package k00;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.debug.menu.data.cookie.X03ComposerDebugTokenCookieDelegate", f = "X03ComposerDebugTokenCookieDelegate.kt", l = {49, 50}, m = "setCookie")
/* renamed from: k00.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7452e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f70263d;

    /* renamed from: e, reason: collision with root package name */
    Object f70264e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f70265f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C7451d f70266g;

    /* renamed from: h, reason: collision with root package name */
    int f70267h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7452e(C7451d c7451d, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f70266g = c7451d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f70265f = obj;
        this.f70267h |= LinearLayoutManager.INVALID_OFFSET;
        return C7451d.d(this.f70266g, null, this);
    }
}
