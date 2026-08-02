package x60;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.security.GetAppsBridgeInterface", f = "GetAppsBridgeInterface.kt", l = {77}, m = "getInstalledDangerApps")
/* renamed from: x60.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10670b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f105047d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f105048e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f105049f;

    /* renamed from: g, reason: collision with root package name */
    int f105050g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10670b(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f105049f = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f105048e = obj;
        this.f105050g |= LinearLayoutManager.INVALID_OFFSET;
        return e.f(this.f105049f, null, this);
    }
}
