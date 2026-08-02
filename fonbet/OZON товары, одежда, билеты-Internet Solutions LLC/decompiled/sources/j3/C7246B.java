package j3;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.media3.common.PlayerExtensionsKt", f = "PlayerExtensions.kt", l = {112}, m = "listenImpl")
/* renamed from: j3.B, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7246B extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f68925d;

    /* renamed from: e, reason: collision with root package name */
    Function2 f68926e;

    /* renamed from: f, reason: collision with root package name */
    kotlin.jvm.internal.M f68927f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f68928g;

    /* renamed from: h, reason: collision with root package name */
    int f68929h;

    C7246B() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a c11;
        this.f68928g = obj;
        this.f68929h |= LinearLayoutManager.INVALID_OFFSET;
        c11 = C7248D.c(null, null, this);
        return c11;
    }
}
