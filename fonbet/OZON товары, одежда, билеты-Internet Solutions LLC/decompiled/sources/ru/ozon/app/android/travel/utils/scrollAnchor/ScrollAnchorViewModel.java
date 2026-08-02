package ru.ozon.app.android.travel.utils.scrollAnchor;

import Ae.B0;
import Ae.C2399j;
import Ae.E0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "LAe/B0;", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate;", "scrollUpdate", "()LAe/B0;", "", "sendScrollUpdate", "(Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate;)V", "LAe/w0;", "scrollUpdateFlow", "LAe/w0;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScrollAnchorViewModel extends w0 {

    @NotNull
    private final Ae.w0<ScrollUpdate> scrollUpdateFlow = E0.b(0, 0, null, 7);

    @NotNull
    public final B0<ScrollUpdate> scrollUpdate() {
        return C2399j.a(this.scrollUpdateFlow);
    }

    public final void sendScrollUpdate(@NotNull ScrollUpdate scrollUpdate) {
        Intrinsics.checkNotNullParameter(scrollUpdate, "scrollUpdate");
        C10727i.c(x0.a(this), null, null, new ScrollAnchorViewModel$sendScrollUpdate$1(this, scrollUpdate, null), 3);
    }
}
