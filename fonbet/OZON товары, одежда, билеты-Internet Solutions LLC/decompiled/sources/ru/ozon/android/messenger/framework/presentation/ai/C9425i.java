package ru.ozon.android.messenger.framework.presentation.ai;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.common.SquircleLinearLayout;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9425i extends AbstractC7737t implements InterfaceC6511n<Integer, Integer, Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9413c f89616b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f89617c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f89618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9425i(C9413c c9413c, int i11, boolean z11) {
        super(3);
        this.f89616b = c9413c;
        this.f89617c = i11;
        this.f89618d = z11;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(Integer num, Integer num2, Boolean bool) {
        androidx.fragment.app.r activity;
        View currentFocus;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        boolean booleanValue = bool.booleanValue();
        C9413c c9413c = this.f89616b;
        ConstraintLayout constraintLayout = C9413c.y(c9413c).getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ru.ozon.android.messenger.utils.view.s.g(constraintLayout, 0, 0, 0, intValue, 7);
        int min = Math.min(intValue2, this.f89617c);
        SquircleLinearLayout bottomContainerLl = C9413c.y(c9413c).bottomContainerLl;
        Intrinsics.checkNotNullExpressionValue(bottomContainerLl, "bottomContainerLl");
        ru.ozon.android.messenger.utils.view.s.g(bottomContainerLl, 0, 0, 0, min, 7);
        LinearLayout middleContainerLl = C9413c.y(c9413c).middleContainerLl;
        Intrinsics.checkNotNullExpressionValue(middleContainerLl, "middleContainerLl");
        ru.ozon.android.messenger.utils.view.s.g(middleContainerLl, 0, 0, 0, min, 7);
        if (this.f89618d && booleanValue && (activity = c9413c.getActivity()) != null && (currentFocus = activity.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
        }
        C9413c.y(c9413c).getConstraintLayout().getLocationInWindow(new int[2]);
        return Unit.f71690a;
    }
}
