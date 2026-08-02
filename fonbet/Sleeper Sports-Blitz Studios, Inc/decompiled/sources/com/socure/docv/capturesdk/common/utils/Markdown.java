package com.socure.docv.capturesdk.common.utils;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: Markdown.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004J\u001d\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0019J/\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0002\b\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/Markdown;", "", "()V", "CHECKED_CAPS", "", "CHECKED_SMALL", "NOT_CHECKED", "linkColorResId", "", "Ljava/lang/Integer;", "onLinkClick", "Lkotlin/Function2;", "", "applySpan", "spannable", "Landroid/text/SpannableStringBuilder;", "matchResult", "Lkotlin/text/MatchResult;", "style", "parseMarkdownWithCheckboxes", "Lcom/socure/docv/capturesdk/common/utils/Markdown$MarkDownCheckBox;", "markdown", "renderMarkdown", "textView", "Landroid/widget/TextView;", "renderMarkdown$capturesdk_productionRelease", "setupMarkdown", "setupMarkdown$capturesdk_productionRelease", "ColoredUnderlineSpan", "MarkDownCheckBox", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Markdown {
    private static Integer linkColorResId;
    private static Function2<? super String, ? super String, Unit> onLinkClick;
    public static final Markdown INSTANCE = new Markdown();
    private static final String NOT_CHECKED = "- [ ]";
    private static final String CHECKED_CAPS = "- [X]";
    private static final String CHECKED_SMALL = "- [x]";

    private Markdown() {
    }

    public final void setupMarkdown$capturesdk_productionRelease(int linkColorResId2, Function2<? super String, ? super String, Unit> onLinkClick2) {
        Intrinsics.checkNotNullParameter(onLinkClick2, "onLinkClick");
        onLinkClick = onLinkClick2;
        linkColorResId = Integer.valueOf(linkColorResId2);
    }

    public final void renderMarkdown$capturesdk_productionRelease(final TextView textView, final String markdown) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(markdown, "markdown");
        textView.post(new Runnable() { // from class: com.socure.docv.capturesdk.common.utils.Markdown$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Markdown.renderMarkdown$lambda$4(markdown, textView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderMarkdown$lambda$4(String markdown, TextView textView) {
        Intrinsics.checkNotNullParameter(markdown, "$markdown");
        Intrinsics.checkNotNullParameter(textView, "$textView");
        String str = markdown;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Regex regex = new Regex("\\*\\*\\*\\s*(.*?)\\s*\\*\\*\\*");
        Regex regex2 = new Regex("\\*\\*\\s*(.*?)\\s*\\*\\*");
        Regex regex3 = new Regex("\\*\\s*(.*?)\\s*\\*");
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i = 0;
        Iterator it = Regex.findAll$default(regex, spannableStringBuilder2, 0, 2, null).iterator();
        while (it.hasNext()) {
            INSTANCE.applySpan(spannableStringBuilder, (MatchResult) it.next(), 3);
        }
        Iterator it2 = Regex.findAll$default(regex2, spannableStringBuilder2, 0, 2, null).iterator();
        while (it2.hasNext()) {
            INSTANCE.applySpan(spannableStringBuilder, (MatchResult) it2.next(), 1);
        }
        Iterator it3 = Regex.findAll$default(regex3, spannableStringBuilder2, 0, 2, null).iterator();
        while (it3.hasNext()) {
            INSTANCE.applySpan(spannableStringBuilder, (MatchResult) it3.next(), 2);
        }
        List<MatchResult> list = SequencesKt.toList(Regex.findAll$default(new Regex("\\[(.*?)\\]\\((.*?)\\)"), str, 0, 2, null));
        StringBuilder sb = new StringBuilder(markdown);
        ArrayList<Triple> arrayList = new ArrayList();
        for (MatchResult matchResult : list) {
            String value = matchResult.getValue();
            String str2 = matchResult.getGroupValues().get(1);
            String str3 = matchResult.getGroupValues().get(2);
            int indexOf = sb.indexOf(value, i);
            if (indexOf != -1) {
                sb.replace(indexOf, value.length() + indexOf, str2);
                arrayList.add(new Triple(str2, str3, Integer.valueOf(indexOf)));
                i = indexOf + str2.length();
                spannableStringBuilder = new SpannableStringBuilder(sb.toString());
            }
        }
        for (Triple triple : arrayList) {
            final String str4 = (String) triple.component1();
            final String str5 = (String) triple.component2();
            int intValue = ((Number) triple.component3()).intValue();
            int length = str4.length() + intValue;
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.socure.docv.capturesdk.common.utils.Markdown$renderMarkdown$1$4
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    Function2 function2;
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    function2 = Markdown.onLinkClick;
                    if (function2 != null) {
                        function2.invoke(str4, str5);
                    }
                }
            }, intValue, length, 33);
            Integer num = linkColorResId;
            if (num != null) {
                int intValue2 = num.intValue();
                spannableStringBuilder.setSpan(new ColoredUnderlineSpan(intValue2), intValue, length, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(intValue2), intValue, length, 33);
            }
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void applySpan(SpannableStringBuilder spannable, MatchResult matchResult, int style) {
        String value = matchResult.getValue();
        String obj = StringsKt.trim((CharSequence) matchResult.getGroupValues().get(1)).toString();
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannable, value, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return;
        }
        spannable.replace(indexOf$default, value.length() + indexOf$default, (CharSequence) obj);
        spannable.setSpan(new StyleSpan(style), indexOf$default, obj.length() + indexOf$default, 33);
    }

    public final MarkDownCheckBox parseMarkdownWithCheckboxes(String markdown) {
        Intrinsics.checkNotNullParameter(markdown, "markdown");
        MarkDownCheckBox markDownCheckBox = new MarkDownCheckBox("", false);
        for (String str : StringsKt.lines(markdown)) {
            String str2 = NOT_CHECKED;
            if (StringsKt.startsWith$default(str, str2, false, 2, (Object) null)) {
                markDownCheckBox.setChecked(false);
                markDownCheckBox.setText(StringsKt.trim((CharSequence) StringsKt.removePrefix(str, (CharSequence) str2)).toString());
            } else {
                String str3 = CHECKED_CAPS;
                if (StringsKt.startsWith$default(str, str3, false, 2, (Object) null)) {
                    markDownCheckBox.setChecked(true);
                    markDownCheckBox.setText(StringsKt.trim((CharSequence) StringsKt.removePrefix(str, (CharSequence) str3)).toString());
                } else {
                    String str4 = CHECKED_SMALL;
                    if (StringsKt.startsWith$default(str, str4, false, 2, (Object) null)) {
                        markDownCheckBox.setChecked(true);
                        markDownCheckBox.setText(StringsKt.trim((CharSequence) StringsKt.removePrefix(str, (CharSequence) str4)).toString());
                    } else {
                        markDownCheckBox.setText(str);
                        markDownCheckBox.setChecked(false);
                    }
                }
            }
        }
        return markDownCheckBox;
    }

    /* compiled from: Markdown.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/Markdown$ColoredUnderlineSpan;", "Landroid/text/style/UnderlineSpan;", "underlineColor", "", "(I)V", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ColoredUnderlineSpan extends UnderlineSpan {
        private final int underlineColor;

        public ColoredUnderlineSpan(int i) {
            this.underlineColor = i;
        }

        @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(this.underlineColor);
            ds.setUnderlineText(true);
        }
    }

    /* compiled from: Markdown.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/Markdown$MarkDownCheckBox;", "", "text", "", "isChecked", "", "(Ljava/lang/String;Z)V", "()Z", "setChecked", "(Z)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class MarkDownCheckBox {
        private boolean isChecked;
        private String text;

        public static /* synthetic */ MarkDownCheckBox copy$default(MarkDownCheckBox markDownCheckBox, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = markDownCheckBox.text;
            }
            if ((i & 2) != 0) {
                z = markDownCheckBox.isChecked;
            }
            return markDownCheckBox.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public final MarkDownCheckBox copy(String text, boolean isChecked) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new MarkDownCheckBox(text, isChecked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarkDownCheckBox)) {
                return false;
            }
            MarkDownCheckBox markDownCheckBox = (MarkDownCheckBox) other;
            return Intrinsics.areEqual(this.text, markDownCheckBox.text) && this.isChecked == markDownCheckBox.isChecked;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            boolean z = this.isChecked;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            return "MarkDownCheckBox(text=" + this.text + ", isChecked=" + this.isChecked + ")";
        }

        public MarkDownCheckBox(String text, boolean z) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.isChecked = z;
        }

        public final String getText() {
            return this.text;
        }

        public final void setText(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.text = str;
        }

        public final boolean isChecked() {
            return this.isChecked;
        }

        public final void setChecked(boolean z) {
            this.isChecked = z;
        }
    }
}
