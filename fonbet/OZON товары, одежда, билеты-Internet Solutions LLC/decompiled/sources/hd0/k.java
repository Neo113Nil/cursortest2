package hd0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2MobileConfigRepository", f = "Sso2MobileConfigRepository.kt", l = {32}, m = "getLastAppVersion")
/* loaded from: classes3.dex */
final class k extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    i f65372d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f65373e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f65374f;

    /* renamed from: g, reason: collision with root package name */
    int f65375g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f65374f = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f65373e = obj;
        this.f65375g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f65374f.g(this);
    }
}
