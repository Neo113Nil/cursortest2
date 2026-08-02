package com.swmansion.enriched.markdown.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Spannable;
import android.util.DisplayMetrics;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.swmansion.enriched.markdown.EnrichedMarkdownText;
import com.swmansion.enriched.markdown.spans.ImageSpan;
import com.swmansion.enriched.markdown.styles.StyleConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SelectionActionMode.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0006H\u0002\u001a\f\u0010\t\u001a\u00020\b*\u00020\u0006H\u0002\u001a\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u0006H\u0002\u001a\f\u0010\r\u001a\u00020\b*\u00020\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"MENU_ITEM_COPY_MARKDOWN", "", "MENU_ITEM_COPY_IMAGE_URL", "createSelectionActionModeCallback", "Landroid/view/ActionMode$Callback;", "textView", "Landroid/widget/TextView;", "copyWithHTML", "", "copyMarkdownToClipboard", "getImageUrlsInSelection", "", "", "copyImageUrlsToClipboard", "react-native-enriched-markdown_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SelectionActionModeKt {
    private static final int MENU_ITEM_COPY_IMAGE_URL = 1001;
    private static final int MENU_ITEM_COPY_MARKDOWN = 1000;

    public static final ActionMode.Callback createSelectionActionModeCallback(final TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        return new ActionMode.Callback() { // from class: com.swmansion.enriched.markdown.utils.SelectionActionModeKt$createSelectionActionModeCallback$1
            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                return true;
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(ActionMode mode) {
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                List imageUrlsInSelection;
                String str;
                if (menu == null) {
                    return false;
                }
                menu.removeItem(1000);
                menu.removeItem(1001);
                if (textView.getSelectionStart() >= 0 && textView.getSelectionEnd() > textView.getSelectionStart()) {
                    menu.add(0, 1000, 0, "Copy as Markdown");
                }
                imageUrlsInSelection = SelectionActionModeKt.getImageUrlsInSelection(textView);
                if (!imageUrlsInSelection.isEmpty()) {
                    if (imageUrlsInSelection.size() == 1) {
                        str = "Copy Image URL";
                    } else {
                        str = "Copy " + imageUrlsInSelection.size() + " Image URLs";
                    }
                    menu.add(0, 1001, 0, str);
                }
                return true;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                Integer valueOf = item != null ? Integer.valueOf(item.getItemId()) : null;
                if (valueOf != null && valueOf.intValue() == 16908321) {
                    SelectionActionModeKt.copyWithHTML(textView);
                    if (mode != null) {
                        mode.finish();
                    }
                    return true;
                }
                if (valueOf != null && valueOf.intValue() == 1000) {
                    SelectionActionModeKt.copyMarkdownToClipboard(textView);
                    if (mode != null) {
                        mode.finish();
                    }
                    return true;
                }
                if (valueOf == null || valueOf.intValue() != 1001) {
                    return false;
                }
                SelectionActionModeKt.copyImageUrlsToClipboard(textView);
                if (mode != null) {
                    mode.finish();
                }
                return true;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copyWithHTML(TextView textView) {
        int selectionStart = textView.getSelectionStart();
        int selectionEnd = textView.getSelectionEnd();
        if (selectionStart < 0 || selectionEnd < 0 || selectionStart >= selectionEnd) {
            return;
        }
        CharSequence text = textView.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        CharSequence subSequence = spannable.subSequence(selectionStart, selectionEnd);
        String obj = subSequence.toString();
        EnrichedMarkdownText enrichedMarkdownText = textView instanceof EnrichedMarkdownText ? (EnrichedMarkdownText) textView : null;
        StyleConfig markdownStyle = enrichedMarkdownText != null ? enrichedMarkdownText.getMarkdownStyle() : null;
        Object systemService = textView.getContext().getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        if (markdownStyle != null && (subSequence instanceof Spannable)) {
            DisplayMetrics displayMetrics = ((EnrichedMarkdownText) textView).getContext().getResources().getDisplayMetrics();
            clipboardManager.setPrimaryClip(ClipData.newHtmlText("EnrichedMarkdown", obj, HTMLGenerator.INSTANCE.generateHTML((Spannable) subSequence, markdownStyle, displayMetrics.scaledDensity, displayMetrics.density)));
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Text", obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copyMarkdownToClipboard(TextView textView) {
        String markdownForSelection = MarkdownExtractor.INSTANCE.getMarkdownForSelection(textView);
        if (markdownForSelection == null) {
            return;
        }
        Object systemService = textView.getContext().getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Markdown", markdownForSelection));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> getImageUrlsInSelection(TextView textView) {
        int selectionStart = textView.getSelectionStart();
        int selectionEnd = textView.getSelectionEnd();
        if (selectionStart < 0 || selectionEnd < 0 || selectionStart >= selectionEnd) {
            return CollectionsKt.emptyList();
        }
        CharSequence text = textView.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return CollectionsKt.emptyList();
        }
        Object[] spans = spannable.getSpans(selectionStart, selectionEnd, ImageSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            String imageUrl = ((ImageSpan) obj).getImageUrl();
            if (imageUrl != null) {
                arrayList.add(imageUrl);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            String str = (String) obj2;
            if (StringsKt.startsWith$default(str, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(str, "https://", false, 2, (Object) null)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copyImageUrlsToClipboard(TextView textView) {
        List<String> imageUrlsInSelection = getImageUrlsInSelection(textView);
        if (imageUrlsInSelection.isEmpty()) {
            return;
        }
        Object systemService = textView.getContext().getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Image URLs", CollectionsKt.joinToString$default(imageUrlsInSelection, "\n", null, null, 0, null, null, 62, null)));
    }
}
