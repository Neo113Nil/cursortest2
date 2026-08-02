package td0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.wrappers.main.button.ButtonState;

/* renamed from: td0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9863c {
    public static final void a(@NotNull ButtonView buttonView, boolean z11) {
        Intrinsics.checkNotNullParameter(buttonView, "<this>");
        buttonView.setEnabled(z11);
        buttonView.setButtonState(z11 ? ButtonState.ENABLED : ButtonState.DISABLED);
    }
}
