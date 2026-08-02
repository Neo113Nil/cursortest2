package zh0;

import Ih0.m;
import Ih0.n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ph0.f;

/* renamed from: zh0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C11123a implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f109064a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f109065b;

    public C11123a(@NotNull m sendPushStatusInteractor, @NotNull ArrayList unfinishedActionsTrackers) {
        Intrinsics.checkNotNullParameter(sendPushStatusInteractor, "sendPushStatusInteractor");
        Intrinsics.checkNotNullParameter(unfinishedActionsTrackers, "unfinishedActionsTrackers");
        this.f109064a = sendPushStatusInteractor;
        this.f109065b = unfinishedActionsTrackers;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f109064a.e(n.APP_LAUNCH);
        Iterator it = this.f109065b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
    }
}
