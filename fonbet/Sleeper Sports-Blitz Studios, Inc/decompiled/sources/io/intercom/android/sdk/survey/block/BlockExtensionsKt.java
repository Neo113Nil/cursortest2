package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.media3.extractor.WavUtil;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BlockExtensions.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003\u001a\u001e\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0000\u001a$\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010"}, d2 = {"getTextAlign", "Landroidx/compose/ui/text/style/TextAlign;", "Lio/intercom/android/sdk/blocks/lib/BlockAlignment;", "(Lio/intercom/android/sdk/blocks/lib/BlockAlignment;)I", "toAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "", "context", "Landroid/content/Context;", "urlSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "appendStringWithLink", "", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "source", "Landroid/text/Spanned;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BlockExtensionsKt {
    public static final int getTextAlign(BlockAlignment blockAlignment) {
        Intrinsics.checkNotNullParameter(blockAlignment, "<this>");
        int gravity = blockAlignment.getGravity();
        if (gravity == 1) {
            return TextAlign.INSTANCE.m8654getCentere0LSkKk();
        }
        if (gravity == 8388611) {
            return TextAlign.INSTANCE.m8659getStarte0LSkKk();
        }
        if (gravity == 8388613) {
            return TextAlign.INSTANCE.m8655getEnde0LSkKk();
        }
        return TextAlign.INSTANCE.m8659getStarte0LSkKk();
    }

    public static final AnnotatedString toAnnotatedString(CharSequence charSequence, Context context, SpanStyle urlSpanStyle) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(urlSpanStyle, "urlSpanStyle");
        if (charSequence instanceof Spanned) {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            Spanned spanned = (Spanned) charSequence;
            StyleSpan[] styleSpanArr = (StyleSpan[]) spanned.getSpans(0, spanned.length(), StyleSpan.class);
            UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) spanned.getSpans(0, spanned.length(), UnderlineSpan.class);
            StrikethroughSpan[] strikethroughSpanArr = (StrikethroughSpan[]) spanned.getSpans(0, spanned.length(), StrikethroughSpan.class);
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spanned.getSpans(0, spanned.length(), ForegroundColorSpan.class);
            appendStringWithLink(builder, urlSpanStyle, context, spanned);
            for (StyleSpan styleSpan : styleSpanArr) {
                int spanStart = spanned.getSpanStart(styleSpan);
                int spanEnd = spanned.getSpanEnd(styleSpan);
                int style = styleSpan.getStyle();
                if (style == 1) {
                    builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null), spanStart, spanEnd);
                } else if (style == 2) {
                    builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m8342boximpl(FontStyle.INSTANCE.m8351getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (DefaultConstructorMarker) null), spanStart, spanEnd);
                } else if (style == 3) {
                    builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), FontStyle.m8342boximpl(FontStyle.INSTANCE.m8351getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (DefaultConstructorMarker) null), spanStart, spanEnd);
                }
            }
            for (UnderlineSpan underlineSpan : underlineSpanArr) {
                builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), spanned.getSpanStart(underlineSpan), spanned.getSpanEnd(underlineSpan));
            }
            for (StrikethroughSpan strikethroughSpan : strikethroughSpanArr) {
                builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getLineThrough(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), spanned.getSpanStart(strikethroughSpan), spanned.getSpanEnd(strikethroughSpan));
            }
            for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                builder.addStyle(new SpanStyle(ColorKt.Color(foregroundColorSpan.getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (DefaultConstructorMarker) null), spanned.getSpanStart(foregroundColorSpan), spanned.getSpanEnd(foregroundColorSpan));
            }
            return builder.toAnnotatedString();
        }
        AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
        builder2.append(builder2.toString());
        return builder2.toAnnotatedString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendStringWithLink$lambda$8$lambda$6(URLSpan urlSpan, Context context, LinkAnnotation it) {
        Intrinsics.checkNotNullParameter(urlSpan, "$urlSpan");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(it, "it");
        String url = urlSpan.getURL();
        Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
        if (StringsKt.isBlank(url)) {
            return;
        }
        LinkOpener.handleUrl(urlSpan.getURL(), context, Injector.get().getApi());
    }

    private static final void appendStringWithLink(AnnotatedString.Builder builder, SpanStyle spanStyle, final Context context, Spanned spanned) {
        int i = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        int i2 = 0;
        while (i < length) {
            final URLSpan uRLSpan = uRLSpanArr[i];
            LinkAnnotation.Clickable clickable = new LinkAnnotation.Clickable("url", new TextLinkStyles(spanStyle, null, null, null, 14, null), new LinkInteractionListener() { // from class: io.intercom.android.sdk.survey.block.BlockExtensionsKt$$ExternalSyntheticLambda0
                @Override // androidx.compose.ui.text.LinkInteractionListener
                public final void onClick(LinkAnnotation linkAnnotation) {
                    BlockExtensionsKt.appendStringWithLink$lambda$8$lambda$6(uRLSpan, context, linkAnnotation);
                }
            });
            int spanStart = spanned.getSpanStart(uRLSpan);
            int spanEnd = spanned.getSpanEnd(uRLSpan);
            if (spanStart > i2) {
                builder.append(spanned.subSequence(i2, spanStart).toString());
            }
            int pushLink = builder.pushLink(clickable);
            try {
                builder.append(spanned.subSequence(spanStart, spanEnd).toString());
                Unit unit = Unit.INSTANCE;
                builder.pop(pushLink);
                i++;
                i2 = spanEnd;
            } catch (Throwable th) {
                builder.pop(pushLink);
                throw th;
            }
        }
        if (i2 < spanned.length()) {
            builder.append(spanned.subSequence(i2, spanned.length()).toString());
        }
    }
}
