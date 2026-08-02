package wc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.action.ActionAuthRepositoryImpl", f = "ActionAuthRepositoryImpl.kt", l = {211}, m = "addDeviceId")
/* renamed from: wc0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10501b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Map f104102d;

    /* renamed from: e, reason: collision with root package name */
    String f104103e;

    /* renamed from: f, reason: collision with root package name */
    Map f104104f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f104105g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C10503d f104106h;

    /* renamed from: i, reason: collision with root package name */
    int f104107i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10501b(C10503d c10503d, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f104106h = c10503d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object q11;
        this.f104105g = obj;
        this.f104107i |= LinearLayoutManager.INVALID_OFFSET;
        q11 = this.f104106h.q(null, this);
        return q11;
    }
}
