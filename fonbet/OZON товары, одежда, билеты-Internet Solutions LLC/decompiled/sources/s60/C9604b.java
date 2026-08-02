package s60;

import Sc.C4001c;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.J;

/* renamed from: s60.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9604b extends kotlin.coroutines.a implements J {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9605c f98221a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9604b(J.a aVar, C9605c c9605c) {
        super(aVar);
        this.f98221a = c9605c;
    }

    @Override // xe.J
    public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        L80.a.b("OpenGallery", C4001c.b(th2));
        this.f98221a.f98229h = null;
    }
}
