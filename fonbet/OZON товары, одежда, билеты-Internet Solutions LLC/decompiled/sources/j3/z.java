package j3;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.media3.common.PlayerExtensionsKt", f = "PlayerExtensions.kt", l = {47, 49}, m = "listen")
/* loaded from: classes8.dex */
final class z extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f69360d;

    /* renamed from: e, reason: collision with root package name */
    int f69361e;

    z() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f69360d = obj;
        this.f69361e |= LinearLayoutManager.INVALID_OFFSET;
        return C7248D.b(null, null, this);
    }
}
