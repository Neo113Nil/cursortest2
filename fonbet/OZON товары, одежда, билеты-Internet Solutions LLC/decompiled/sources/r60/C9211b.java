package r60;

import Sc.C4001c;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.J;

/* renamed from: r60.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9211b extends kotlin.coroutines.a implements J {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9212c f83189a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9211b(J.a aVar, C9212c c9212c) {
        super(aVar);
        this.f83189a = c9212c;
    }

    @Override // xe.J
    public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        L80.a.b("OpenFilePicker", C4001c.b(th2));
        this.f83189a.f83197i = null;
    }
}
