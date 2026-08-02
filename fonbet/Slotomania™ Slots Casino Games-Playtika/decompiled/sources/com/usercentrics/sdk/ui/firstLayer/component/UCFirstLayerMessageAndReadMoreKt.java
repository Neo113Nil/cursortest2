package com.usercentrics.sdk.ui.firstLayer.component;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.usercentrics.sdk.SectionAlignment;
import com.usercentrics.sdk.ui.R;
import com.usercentrics.sdk.ui.accessibility.AccessibilityUIKt;
import com.usercentrics.sdk.ui.components.UCTextView;
import com.usercentrics.sdk.ui.firstLayer.UCFirstLayerViewModel;
import com.usercentrics.sdk.ui.theme.UCThemeData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UCFirstLayerMessageAndReadMore.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u000b\u001a\u00020\u0005*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a$\u0010\f\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\r"}, d2 = {"setMessageView", "", "viewModel", "Lcom/usercentrics/sdk/ui/firstLayer/UCFirstLayerViewModel;", "messageView", "Lcom/usercentrics/sdk/ui/components/UCTextView;", "updateMessageView", "addMessageAndReadMoreButton", "Landroidx/appcompat/widget/LinearLayoutCompat;", "theme", "Lcom/usercentrics/sdk/ui/theme/UCThemeData;", "createMessageView", "createOrRemoveReadMoreView", "usercentrics-ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UCFirstLayerMessageAndReadMoreKt {
    public static final void addMessageAndReadMoreButton(LinearLayoutCompat linearLayoutCompat, UCThemeData theme, UCFirstLayerViewModel viewModel) {
        Intrinsics.checkNotNullParameter(linearLayoutCompat, "<this>");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        createOrRemoveReadMoreView(linearLayoutCompat, theme, viewModel, createMessageView(linearLayoutCompat, theme, viewModel));
    }

    private static final UCTextView createMessageView(LinearLayoutCompat linearLayoutCompat, UCThemeData uCThemeData, UCFirstLayerViewModel uCFirstLayerViewModel) {
        Context context = linearLayoutCompat.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UCTextView uCTextView = new UCTextView(context);
        uCTextView.setHtmlText(uCFirstLayerViewModel.getMessage().getText(), uCFirstLayerViewModel.getMessage().getCustomUnderlineLink(), new UCFirstLayerMessageAndReadMoreKt$createMessageView$messageView$1$1(uCFirstLayerViewModel));
        UCTextView.styleBody$default(uCTextView, uCThemeData, false, false, false, 14, null);
        uCTextView.setMovementMethod(LinkMovementMethod.getInstance());
        setMessageView(uCFirstLayerViewModel, uCTextView);
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-1, -2);
        int dimensionPixelOffset = linearLayoutCompat.getResources().getDimensionPixelOffset(R.dimen.ucFirstLayerInnerPadding);
        layoutParams.setMarginStart(dimensionPixelOffset);
        layoutParams.setMarginEnd(dimensionPixelOffset);
        linearLayoutCompat.addView(uCTextView, layoutParams);
        return uCTextView;
    }

    private static final void updateMessageView(UCFirstLayerViewModel uCFirstLayerViewModel, UCTextView uCTextView) {
        uCTextView.setHtmlText(uCFirstLayerViewModel.getMessage().getText(), uCFirstLayerViewModel.getMessage().getCustomUnderlineLink(), new UCFirstLayerMessageAndReadMoreKt$updateMessageView$1(uCFirstLayerViewModel));
        setMessageView(uCFirstLayerViewModel, uCTextView);
    }

    private static final void createOrRemoveReadMoreView(final LinearLayoutCompat linearLayoutCompat, UCThemeData uCThemeData, final UCFirstLayerViewModel uCFirstLayerViewModel, final UCTextView uCTextView) {
        String readMore = uCFirstLayerViewModel.getReadMore();
        if (readMore == null) {
            return;
        }
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-1, -2);
        int dimensionPixelOffset = linearLayoutCompat.getResources().getDimensionPixelOffset(R.dimen.ucFirstLayerInnerPadding);
        layoutParams.setMarginStart(dimensionPixelOffset);
        layoutParams.setMarginEnd(dimensionPixelOffset);
        Context context = linearLayoutCompat.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final UCTextView uCTextView2 = new UCTextView(context);
        UCTextView uCTextView3 = uCTextView2;
        linearLayoutCompat.addView(uCTextView3, layoutParams);
        uCTextView2.setText(readMore);
        UCTextView.styleSmall$default(uCTextView2, uCThemeData, true, false, false, true, 12, null);
        AccessibilityUIKt.createAccessibilityLinkOrButton(uCTextView3);
        uCTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.usercentrics.sdk.ui.firstLayer.component.UCFirstLayerMessageAndReadMoreKt$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UCFirstLayerMessageAndReadMoreKt.createOrRemoveReadMoreView$lambda$4(UCFirstLayerViewModel.this, linearLayoutCompat, uCTextView2, uCTextView, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createOrRemoveReadMoreView$lambda$4(UCFirstLayerViewModel viewModel, LinearLayoutCompat this_createOrRemoveReadMoreView, UCTextView readMoreView, UCTextView messageView, View view) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(this_createOrRemoveReadMoreView, "$this_createOrRemoveReadMoreView");
        Intrinsics.checkNotNullParameter(readMoreView, "$readMoreView");
        Intrinsics.checkNotNullParameter(messageView, "$messageView");
        viewModel.onReadMoreClick();
        this_createOrRemoveReadMoreView.removeView(readMoreView);
        updateMessageView(viewModel, messageView);
    }

    private static final void setMessageView(UCFirstLayerViewModel uCFirstLayerViewModel, UCTextView uCTextView) {
        SectionAlignment customAlignment = uCFirstLayerViewModel.getMessage().getCustomAlignment();
        if (customAlignment != null) {
            uCTextView.setGravity(SectionAlignment.INSTANCE.toGravity$usercentrics_ui_release(customAlignment));
        }
        Typeface customFont = uCFirstLayerViewModel.getMessage().getCustomFont();
        if (customFont != null) {
            uCTextView.setTypeface(customFont);
        }
        Float customTextSizeInSp = uCFirstLayerViewModel.getMessage().getCustomTextSizeInSp();
        if (customTextSizeInSp != null) {
            uCTextView.setTextSize(2, customTextSizeInSp.floatValue());
        }
        Integer customTextColor = uCFirstLayerViewModel.getMessage().getCustomTextColor();
        if (customTextColor != null) {
            uCTextView.setTextColor(customTextColor.intValue());
        }
        Integer customLinkTextColor = uCFirstLayerViewModel.getMessage().getCustomLinkTextColor();
        if (customLinkTextColor != null) {
            uCTextView.setLinkTextColor(customLinkTextColor.intValue());
        }
    }
}
