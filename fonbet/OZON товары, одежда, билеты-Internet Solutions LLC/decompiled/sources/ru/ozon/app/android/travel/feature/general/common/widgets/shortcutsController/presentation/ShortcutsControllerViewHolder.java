package ru.ozon.app.android.travel.feature.general.common.widgets.shortcutsController.presentation;

import android.content.Context;
import android.content.pm.ShortcutManager;
import android.view.View;
import androidx.lifecycle.K;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/shortcutsController/presentation/ShortcutsControllerViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/shortcutsController/presentation/ShortcutsControllerVO;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "hide", "", "updateTravelShortcutsState", "(Landroid/content/Context;Z)V", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/shortcutsController/presentation/ShortcutsControllerVO;)V", "Landroid/content/Context;", "Lxe/J;", "coroutineExceptionHandler", "Lxe/J;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShortcutsControllerViewHolder extends AbstractC6065b<ShortcutsControllerVO> {

    @NotNull
    private final Context context;

    @NotNull
    private final J coroutineExceptionHandler;
    private final View metricView;
    public static final int $stable = 8;

    public ShortcutsControllerViewHolder(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.coroutineExceptionHandler = new ShortcutsControllerViewHolder$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
    }

    private final void updateTravelShortcutsState(Context context, boolean hide) {
        C10727i.c(K.a(this), this.coroutineExceptionHandler, null, new ShortcutsControllerViewHolder$updateTravelShortcutsState$1(hide, (ShortcutManager) context.getSystemService(ShortcutManager.class), C7714v.a0("hotels"), null), 2);
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ShortcutsControllerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        updateTravelShortcutsState(this.context, item.getHideShortcuts());
    }
}
