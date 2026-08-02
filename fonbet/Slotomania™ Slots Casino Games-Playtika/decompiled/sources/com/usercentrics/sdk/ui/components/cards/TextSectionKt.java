package com.usercentrics.sdk.ui.components.cards;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayout;
import com.usercentrics.sdk.ui.R;
import com.usercentrics.sdk.ui.accessibility.AccessibilityUIKt;
import com.usercentrics.sdk.ui.components.UCTextView;
import com.usercentrics.sdk.ui.components.links.UCLink;
import com.usercentrics.sdk.ui.components.links.UCLinkPMLegacy;
import com.usercentrics.sdk.ui.extensions.ContextExtensionsKt;
import com.usercentrics.sdk.ui.extensions.NumberExtensionsKt;
import com.usercentrics.sdk.ui.theme.UCColorPalette;
import com.usercentrics.sdk.ui.theme.UCThemeData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TextSection.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¨\u0006\n"}, d2 = {"buildTextSectionView", "Landroid/view/View;", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "theme", "Lcom/usercentrics/sdk/ui/theme/UCThemeData;", "textSectionPM", "Lcom/usercentrics/sdk/ui/components/cards/UCContentTextSectionPM;", "usercentrics-ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextSectionKt {
    public static final View buildTextSectionView(Context context, ViewGroup parent, UCThemeData theme, UCContentTextSectionPM textSectionPM) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(textSectionPM, "textSectionPM");
        UCColorPalette colorPalette = theme.getColorPalette();
        View inflate = ContextExtensionsKt.getInflater(context).inflate(R.layout.uc_card_section_entry, parent, false);
        UCTextView uCTextView = (UCTextView) inflate.findViewById(R.id.ucCardSectionEntryTitle);
        String title = textSectionPM.getTitle();
        if (title == null || StringsKt.isBlank(title)) {
            uCTextView.setVisibility(8);
        } else {
            uCTextView.setText(title);
            Intrinsics.checkNotNull(uCTextView);
            UCTextView.styleBody$default(uCTextView, theme, false, false, true, 6, null);
        }
        UCTextView uCTextView2 = (UCTextView) inflate.findViewById(R.id.ucCardSectionEntryDescription);
        String description = textSectionPM.getDescription();
        if (description == null || StringsKt.isBlank(description)) {
            uCTextView2.setVisibility(8);
        } else {
            uCTextView2.setVisibility(0);
            uCTextView2.setText(textSectionPM.getDescription());
            Intrinsics.checkNotNull(uCTextView2);
            UCTextView.styleBody$default(uCTextView2, theme, false, false, false, 14, null);
        }
        FlexboxLayout flexboxLayout = (FlexboxLayout) inflate.findViewById(R.id.ucCardSectionEntryFlexbox);
        UCLinkPMLegacy link = textSectionPM.getLink();
        if (link != null) {
            UCLink uCLink = new UCLink(context);
            uCLink.styleMedium(theme);
            uCLink.bindLegacy(link);
            UCLink uCLink2 = uCLink;
            flexboxLayout.addView(uCLink2);
            AccessibilityUIKt.createAccessibilityLinkOrButton(uCLink2);
        }
        for (String str : textSectionPM.getTags()) {
            View inflate2 = ContextExtensionsKt.getInflater(context).inflate(R.layout.uc_tag, (ViewGroup) flexboxLayout, false);
            Intrinsics.checkNotNull(inflate2, "null cannot be cast to non-null type com.usercentrics.sdk.ui.components.UCTextView");
            UCTextView uCTextView3 = (UCTextView) inflate2;
            uCTextView3.setText(str);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(NumberExtensionsKt.dpToPx(2, context));
            gradientDrawable.setStroke(NumberExtensionsKt.dpToPx(1, context), colorPalette.getTabsBorderColor());
            Integer layerBackgroundColor = colorPalette.getLayerBackgroundColor();
            if (layerBackgroundColor != null) {
                gradientDrawable.setColor(layerBackgroundColor.intValue());
            }
            uCTextView3.setBackground(gradientDrawable);
            UCTextView.styleBody$default(uCTextView3, theme, false, false, false, 14, null);
            flexboxLayout.addView(uCTextView3);
        }
        Intrinsics.checkNotNull(inflate);
        return inflate;
    }
}
