package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$style;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/utils/TapToContinueTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "inputText", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class TapToContinueTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapToContinueTextView(@NotNull Context context, @NotNull String inputText) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.b(0, -2));
        TextViewExtKt.applyStyle(this, context, R$style.Text_SemiBold);
        setText(inputText);
        setTextAlignment(4);
        setTextColor(-1);
        setTextSize(2, 17.0f);
        setLineSpacing(0.0f, 1.21f);
        setLetterSpacing(0.0f);
        setContentDescription(inputText);
    }
}
