package yd0;

import Jb0.z;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import td0.q;

/* renamed from: yd0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10886a {

    /* renamed from: a, reason: collision with root package name */
    private z f106576a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f106577b;

    public C10886a(@NotNull z binding, boolean z11) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f106576a = binding;
        this.f106577b = z11;
        LoaderView loaderView = binding.f14576b;
        Intrinsics.checkNotNullExpressionValue(loaderView, "loaderView");
        loaderView.setVisibility(z11 ? 0 : 8);
        View shadowLoadingView = binding.f14577c;
        Intrinsics.checkNotNullExpressionValue(shadowLoadingView, "shadowLoadingView");
        shadowLoadingView.setVisibility(z11 ? 0 : 8);
    }

    public final void a() {
        this.f106576a = null;
    }

    public final void b(boolean z11) {
        z zVar = this.f106576a;
        if (zVar == null || z11 == this.f106577b) {
            return;
        }
        this.f106577b = z11;
        View shadowLoadingView = zVar.f14577c;
        LoaderView loaderView = zVar.f14576b;
        if (z11) {
            Intrinsics.checkNotNullExpressionValue(loaderView, "loaderView");
            q.a(loaderView, 2, 300L);
            Intrinsics.checkNotNullExpressionValue(shadowLoadingView, "shadowLoadingView");
            q.a(shadowLoadingView, 2, 100L);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(loaderView, "loaderView");
        q.b(1, loaderView);
        Intrinsics.checkNotNullExpressionValue(shadowLoadingView, "shadowLoadingView");
        q.b(1, shadowLoadingView);
    }
}
