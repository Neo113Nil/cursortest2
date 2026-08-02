package ru.ozon.app.android.returns.listEmpty.presentation.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.R$drawable;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/util/ReturnsTextBlockHeaderBuilder;", "", "<init>", "()V", "createHeaderImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "createHeaderTextAtomView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnsTextBlockHeaderBuilder {

    @NotNull
    public static final ReturnsTextBlockHeaderBuilder INSTANCE = new ReturnsTextBlockHeaderBuilder();

    private ReturnsTextBlockHeaderBuilder() {
    }

    @NotNull
    public final AppCompatImageView createHeaderImageView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        appCompatImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        appCompatImageView.setBackgroundResource(R$drawable.text_block_image_background);
        ThemeExtKt.tint(appCompatImageView, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.layerFloor0)));
        return appCompatImageView;
    }

    @NotNull
    public final TextAtomView createHeaderTextAtomView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setId(View.generateViewId());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, UiExtKt.toPx(16, context), 0, 0);
        textAtomView.setLayoutParams(marginLayoutParams);
        textAtomView.setStyleOrDefault(Integer.valueOf(R$style.TextStyle_Body_L_Bold));
        return textAtomView;
    }
}
