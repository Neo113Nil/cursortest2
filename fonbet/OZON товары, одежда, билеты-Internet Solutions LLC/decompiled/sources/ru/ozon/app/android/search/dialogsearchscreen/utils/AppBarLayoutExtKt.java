package ru.ozon.app.android.search.dialogsearchscreen.utils;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.dialogsearchscreen.utils.AppBarLayoutExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/material/appbar/AppBarLayout;", "Lkotlin/Function0;", "", "callback", "onAlmostCompletelyExpanded", "(Lcom/google/android/material/appbar/AppBarLayout;Lkotlin/jvm/functions/Function0;)V", "", "currentOffset", "(Lcom/google/android/material/appbar/AppBarLayout;)I", "LISTENER_TAG", "I", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AppBarLayoutExtKt {
    private static final int LISTENER_TAG = R$id.appBarListenerTag;

    public static final int currentOffset(@NotNull AppBarLayout appBarLayout) {
        Intrinsics.checkNotNullParameter(appBarLayout, "<this>");
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        if (fVar == null) {
            return 0;
        }
        CoordinatorLayout.c c11 = fVar.c();
        AppBarLayout.Behavior behavior = c11 instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) c11 : null;
        if (behavior == null) {
            return 0;
        }
        return behavior.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.google.android.material.appbar.AppBarLayout$f, dI.a] */
    public static final void onAlmostCompletelyExpanded(@NotNull final AppBarLayout appBarLayout, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(appBarLayout, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i11 = LISTENER_TAG;
        Object tag = appBarLayout.getTag(i11);
        AppBarLayout.f fVar = tag instanceof AppBarLayout.f ? (AppBarLayout.f) tag : null;
        if (fVar != null) {
            appBarLayout.q(fVar);
        }
        final M m11 = new M();
        ?? r22 = new AppBarLayout.f() { // from class: dI.a
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void onOffsetChanged(AppBarLayout appBarLayout2, int i12) {
                AppBarLayoutExtKt.onAlmostCompletelyExpanded$lambda$1(AppBarLayout.this, m11, callback, appBarLayout2, i12);
            }
        };
        m11.f71787a = r22;
        appBarLayout.d(r22);
        appBarLayout.setTag(i11, m11.f71787a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAlmostCompletelyExpanded$lambda$1(AppBarLayout appBarLayout, M m11, Function0 function0, AppBarLayout appBarLayout2, int i11) {
        if (Math.abs(i11) <= 50) {
            appBarLayout.q((AppBarLayout.f) m11.f71787a);
            appBarLayout.setTag(LISTENER_TAG, null);
            function0.invoke();
        }
    }
}
