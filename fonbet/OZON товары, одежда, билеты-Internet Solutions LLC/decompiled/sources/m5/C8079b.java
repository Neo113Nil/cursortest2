package m5;

import android.graphics.drawable.Drawable;
import coil.compose.AsyncImagePainter;
import org.jetbrains.annotations.NotNull;
import x5.InterfaceC10658b;

/* renamed from: m5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8079b implements InterfaceC10658b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AsyncImagePainter f74441a;

    public C8079b(AsyncImagePainter asyncImagePainter) {
        this.f74441a = asyncImagePainter;
    }

    @Override // x5.InterfaceC10658b
    public final void a(@NotNull Drawable drawable) {
    }

    @Override // x5.InterfaceC10658b
    public final void b(Drawable drawable) {
        AsyncImagePainter asyncImagePainter = this.f74441a;
        asyncImagePainter.t(new AsyncImagePainter.State.Loading(drawable == null ? null : asyncImagePainter.s(drawable)));
    }

    @Override // x5.InterfaceC10658b
    public final void c(Drawable drawable) {
    }
}
