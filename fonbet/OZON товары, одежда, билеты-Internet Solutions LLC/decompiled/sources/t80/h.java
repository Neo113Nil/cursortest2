package t80;

import Ae.O0;
import Ae.x0;
import K30.a;
import Sc.o;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import o40.InterfaceC8640a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.screenstate.ScreenState;

/* loaded from: classes3.dex */
public final class h extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC8640a f99277a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private K30.a f99278b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private x0<e> f99279c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x0<ScreenState> f99280d;

    public h(@NotNull Application application, @NotNull InterfaceC8640a forceUpdateInteractor) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(forceUpdateInteractor, "forceUpdateInteractor");
        this.f99277a = forceUpdateInteractor;
        this.f99278b = a.c.f15170a;
        this.f99279c = O0.a(null);
        this.f99280d = O0.a(null);
        handleState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleState() {
        ScreenState.Progress progress;
        K30.a aVar = this.f99278b;
        if (aVar instanceof a.c) {
            progress = new ScreenState.Progress(0L, null, 3, null);
        } else {
            progress = null;
            if (!(aVar instanceof a.b) && !(aVar instanceof a.C0294a)) {
                throw new o();
            }
        }
        this.f99280d.setValue(progress);
    }

    @NotNull
    public final x0<ScreenState> g0() {
        return this.f99280d;
    }

    @NotNull
    public final x0<e> getViewState() {
        return this.f99279c;
    }
}
