package ru.ozon.android.messenger.framework.presentation.common.screen;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class g extends BottomSheetBehavior.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<View, Unit> f91110a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<View, Unit> f91111b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<View, Unit> f91112c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<View, Unit> f91113d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<View, Unit> f91114e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<View, Unit> f91115f;

    public g(Function1 stateDraggingCallback) {
        b stateExpandedCallback = b.f91047b;
        Intrinsics.checkNotNullParameter(stateExpandedCallback, "stateExpandedCallback");
        c stateCollapsedCallback = c.f91048b;
        Intrinsics.checkNotNullParameter(stateCollapsedCallback, "stateCollapsedCallback");
        Intrinsics.checkNotNullParameter(stateDraggingCallback, "stateDraggingCallback");
        d stateSettlingCallback = d.f91107b;
        Intrinsics.checkNotNullParameter(stateSettlingCallback, "stateSettlingCallback");
        e stateHiddenCallback = e.f91108b;
        Intrinsics.checkNotNullParameter(stateHiddenCallback, "stateHiddenCallback");
        f stateHalfExpandedCallback = f.f91109b;
        Intrinsics.checkNotNullParameter(stateHalfExpandedCallback, "stateHalfExpandedCallback");
        this.f91110a = stateExpandedCallback;
        this.f91111b = stateCollapsedCallback;
        this.f91112c = stateDraggingCallback;
        this.f91113d = stateSettlingCallback;
        this.f91114e = stateHiddenCallback;
        this.f91115f = stateHalfExpandedCallback;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void onSlide(@NotNull View bottomSheet, float f7) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void onStateChanged(@NotNull View bottomSheet, int i11) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        switch (i11) {
            case 1:
                this.f91112c.invoke(bottomSheet);
                break;
            case 2:
                this.f91113d.invoke(bottomSheet);
                break;
            case 3:
                this.f91110a.invoke(bottomSheet);
                break;
            case 4:
                this.f91111b.invoke(bottomSheet);
                break;
            case 5:
                this.f91114e.invoke(bottomSheet);
                break;
            case 6:
                this.f91115f.invoke(bottomSheet);
                break;
        }
    }
}
