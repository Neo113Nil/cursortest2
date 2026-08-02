package hd0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.OzonIdTracker", f = "OzonIdTracker.kt", l = {42, 43}, m = "trackUserIdDeSyncInternal")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    b f65321d;

    /* renamed from: e, reason: collision with root package name */
    boolean f65322e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f65323f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ b f65324g;

    /* renamed from: h, reason: collision with root package name */
    int f65325h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f65324g = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f65323f = obj;
        this.f65325h |= LinearLayoutManager.INVALID_OFFSET;
        return b.c(this.f65324g, false, this);
    }
}
