package sc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.id.nativeauth.crossApp.migration.data.KeyBindRepository", f = "KeyBindRepository.kt", l = {19}, m = "bindPublicKeys")
/* renamed from: sc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9657a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f98552d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b f98553e;

    /* renamed from: f, reason: collision with root package name */
    int f98554f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9657a(b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f98553e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f98552d = obj;
        this.f98554f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f98553e.a(null, null, this);
    }
}
