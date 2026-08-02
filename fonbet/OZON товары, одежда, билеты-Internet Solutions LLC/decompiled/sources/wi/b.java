package wi;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vi.C10322b;

/* loaded from: classes10.dex */
public final class b extends RecyclerView.C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10322b f104570a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull C10322b view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f104570a = view;
    }

    public final void bind(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f104570a.b(title);
    }
}
