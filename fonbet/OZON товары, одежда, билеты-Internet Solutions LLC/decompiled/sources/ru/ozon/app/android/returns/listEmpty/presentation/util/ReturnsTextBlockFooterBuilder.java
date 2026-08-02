package ru.ozon.app.android.returns.listEmpty.presentation.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/util/ReturnsTextBlockFooterBuilder;", "", "<init>", "()V", "createLargeButtonView", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "context", "Landroid/content/Context;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnsTextBlockFooterBuilder {

    @NotNull
    public static final ReturnsTextBlockFooterBuilder INSTANCE = new ReturnsTextBlockFooterBuilder();

    private ReturnsTextBlockFooterBuilder() {
    }

    @NotNull
    public final LargeButtonView createLargeButtonView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LargeButtonView largeButtonView = new LargeButtonView(context, null, 0, R$style.LargeButton_Secondary, 6, null);
        largeButtonView.setId(View.generateViewId());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, UiExtKt.toPx(16, context), 0, 0);
        largeButtonView.setLayoutParams(marginLayoutParams);
        ViewExtKt.gone(largeButtonView);
        return largeButtonView;
    }
}
