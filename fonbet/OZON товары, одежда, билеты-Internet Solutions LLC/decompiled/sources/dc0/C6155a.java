package dc0;

import Sc.InterfaceC4008j;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: dc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6155a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6149M> f61530a;

    public C6155a(@NotNull InterfaceC4008j<C6149M> ozonIdNotifier) {
        Intrinsics.checkNotNullParameter(ozonIdNotifier, "ozonIdNotifier");
        this.f61530a = ozonIdNotifier;
    }

    public final void a() {
        this.f61530a.getValue().d();
    }

    public final void b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return;
        }
        this.f61530a.getValue().e(viewGroup);
    }
}
