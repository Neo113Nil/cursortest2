package f10;

import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.composer.ui.widget.m;

/* renamed from: f10.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC6400a<I extends C7854a> {

    /* renamed from: a, reason: collision with root package name */
    private m f62434a;

    /* renamed from: f10.a$a, reason: collision with other inner class name */
    public interface InterfaceC0987a<I extends C7854a> {
    }

    public final InterfaceC0987a<? super I> a() {
        return this.f62434a;
    }

    public abstract void b(@NotNull d dVar);

    public abstract void c(@NotNull d dVar);

    @NotNull
    public abstract l d(@NotNull Object obj, @NotNull l20.b bVar);

    public final void e(@NotNull m decodingCallback) {
        Intrinsics.checkNotNullParameter(decodingCallback, "decodingCallback");
        this.f62434a = decodingCallback;
    }
}
