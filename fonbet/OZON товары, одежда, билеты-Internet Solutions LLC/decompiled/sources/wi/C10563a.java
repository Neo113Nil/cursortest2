package wi;

import Au.e;
import Hi.j;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vi.C10321a;

/* renamed from: wi.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10563a extends RecyclerView.C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10321a f104568a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<j, Unit> f104569b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10563a(@NotNull C10321a view, @NotNull Function1<? super j, Unit> onAlbumSelected) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAlbumSelected, "onAlbumSelected");
        this.f104568a = view;
        this.f104569b = onAlbumSelected;
    }

    public static void e(C10563a c10563a, j jVar) {
        c10563a.f104569b.invoke(jVar);
    }

    public final void f(@NotNull j album) {
        Intrinsics.checkNotNullParameter(album, "album");
        C10321a c10321a = this.f104568a;
        c10321a.b(album);
        c10321a.setOnClickListener(new e(5, this, album));
    }
}
