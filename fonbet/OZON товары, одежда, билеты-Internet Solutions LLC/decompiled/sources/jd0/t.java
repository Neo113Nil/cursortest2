package jd0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.web.WebViewCookieSynchronizer", f = "WebViewCookieSynchronizer.kt", l = {110}, m = "syncCookies")
/* loaded from: classes3.dex */
final class t extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    r f69812d;

    /* renamed from: e, reason: collision with root package name */
    String f69813e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f69814f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ r f69815g;

    /* renamed from: h, reason: collision with root package name */
    int f69816h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(r rVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f69815g = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f69814f = obj;
        this.f69816h |= LinearLayoutManager.INVALID_OFFSET;
        return r.e(this.f69815g, this);
    }
}
