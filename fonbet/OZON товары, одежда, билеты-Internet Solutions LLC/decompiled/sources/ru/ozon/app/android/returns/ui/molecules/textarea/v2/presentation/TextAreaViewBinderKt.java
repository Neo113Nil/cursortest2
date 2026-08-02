package ru.ozon.app.android.returns.ui.molecules.textarea.v2.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.textarea.v2.viewObject.RmsTextAreaV2VO;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"bind", "", "Lru/ozon/uni/android/textArea/TextAreaView;", "rmsTextArea", "Lru/ozon/app/android/returns/ui/molecules/textarea/v2/viewObject/RmsTextAreaV2VO;", "returns_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextAreaViewBinderKt {
    public static final void bind(@NotNull TextAreaView textAreaView, @NotNull RmsTextAreaV2VO rmsTextArea) {
        Intrinsics.checkNotNullParameter(textAreaView, "<this>");
        Intrinsics.checkNotNullParameter(rmsTextArea, "rmsTextArea");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = textAreaView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textAreaView.setCaptionColor(Integer.valueOf(styleParser.parseColor(context, rmsTextArea.getCaptionColorToken(), UniColors.TEXT_SECONDARY.getResId())));
        textAreaView.setMinLines(rmsTextArea.getMinRows());
        textAreaView.setMaxLines(rmsTextArea.getMaxRows());
        textAreaView.setStatus(rmsTextArea.getStatus());
        textAreaView.setHasCounter(rmsTextArea.getHasCounter());
        textAreaView.setMaxLength(rmsTextArea.getMaxCounterValue());
        textAreaView.setInputText(rmsTextArea.getValue());
        textAreaView.setLabel(rmsTextArea.getLabel());
        textAreaView.setCaption(rmsTextArea.getCaption());
    }
}
