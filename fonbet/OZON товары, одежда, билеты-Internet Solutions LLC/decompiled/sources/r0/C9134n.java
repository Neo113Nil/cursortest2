package r0;

import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarVisibility;

/* renamed from: r0.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9134n<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.H<T> f82631a = new androidx.collection.H<>();

    public final void a(OziNotificationBarVisibility oziNotificationBarVisibility, float f7) {
        this.f82631a.g(oziNotificationBarVisibility, f7);
    }

    @NotNull
    public final androidx.collection.H<T> b() {
        return this.f82631a;
    }
}
