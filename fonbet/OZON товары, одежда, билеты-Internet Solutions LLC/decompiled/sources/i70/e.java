package i70;

import Am.C2438a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.ui.input.InputView;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements InterfaceC6511n {
    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InputView input = (InputView) obj;
        View bottomContainer = (View) obj2;
        ScrollView scrollView = (ScrollView) obj3;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(bottomContainer, "bottomContainer");
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(bottomContainer, "bottomContainer");
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        int[] iArr = new int[2];
        input.getLocationOnScreen(iArr);
        int i11 = iArr[1];
        int height = input.getHeight();
        ViewGroup.LayoutParams layoutParams = input.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i12 = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
        int[] iArr2 = new int[2];
        bottomContainer.getLocationOnScreen(iArr2);
        int i13 = iArr2[1];
        int i14 = ((i11 + height) + i12) - i13;
        StringBuilder a11 = C2438a.a("notFitted=", i14, " inputTop=", " inputHeight=", i11);
        a11.append(height);
        a11.append(" bottomContainerTop=");
        a11.append(i13);
        L80.a.a("OFFKEY", a11.toString());
        if (i14 > 0) {
            scrollView.smoothScrollBy(0, i14);
        }
        return Unit.f71690a;
    }
}
