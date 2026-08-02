package ru.ozon.android.messenger.framework.presentation.common.screenshot;

import android.graphics.Canvas;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a extends View {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<View> f91135a;

    public final void a(@NotNull View viewToTakeSnapshotOf) {
        Intrinsics.checkNotNullParameter(viewToTakeSnapshotOf, "viewToTakeSnapshotOf");
        this.f91135a = new WeakReference<>(viewToTakeSnapshotOf);
    }

    @Override // android.view.View
    protected final void onDraw(@NotNull Canvas canvas) {
        View view;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        WeakReference<View> weakReference = this.f91135a;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.draw(canvas);
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        View view;
        View view2;
        WeakReference<View> weakReference = this.f91135a;
        int i13 = 0;
        int measuredWidth = (weakReference == null || (view2 = weakReference.get()) == null) ? 0 : view2.getMeasuredWidth();
        WeakReference<View> weakReference2 = this.f91135a;
        if (weakReference2 != null && (view = weakReference2.get()) != null) {
            i13 = view.getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, i13);
    }
}
