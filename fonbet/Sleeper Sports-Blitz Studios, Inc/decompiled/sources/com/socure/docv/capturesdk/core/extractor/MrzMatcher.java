package com.socure.docv.capturesdk.core.extractor;

import android.util.Log;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.UtilsKt;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MrzMatcher.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002J2\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/socure/docv/capturesdk/core/extractor/MrzMatcher;", "", "()V", "patternLine1", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "patternLine2", "fixCountryInLine2", "", "text", "fixFirstLine", "index", "", "match", "Lkotlin/Pair;", "blockIndex", "blocks", "", "startsWithPk", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MrzMatcher {
    private final Pattern patternLine1 = Pattern.compile("(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{39})");
    private final Pattern patternLine2 = Pattern.compile("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([M|F|X|<]{1})([0-9]{6})([0-9]{1})([A-Z0-9<]{14})([0-9<]{1})([0-9]{1})");

    public final Pair<String, String> match(int blockIndex, List<String> blocks, boolean startsWithPk) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        LoggerKt.logPiiDebug("SDLT_MRZ_M", "matcher called at index: " + blockIndex);
        try {
            String clean = ExtractorUtilsKt.clean(blocks.get(blockIndex), 1, startsWithPk);
            Matcher matcher = this.patternLine1.matcher(fixFirstLine(StringsKt.indexOf$default((CharSequence) clean, "P<", 0, false, 6, (Object) null), clean));
            if (matcher.find()) {
                String group = matcher.group();
                LoggerKt.logPiiDebug("SDLT_MRZ_M", "Line 1 detected: " + group);
                StringBuilder sb = new StringBuilder();
                int size = blocks.size();
                for (int i = blockIndex + 1; i < size; i++) {
                    sb.append(ExtractorUtilsKt.clean(blocks.get(i), 2, false));
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
                String fixCountryInLine2 = fixCountryInLine2(sb2);
                LoggerKt.logPiiDebug("SDLT_MRZ_M", "Trying to match line 2 in remaining text: " + fixCountryInLine2);
                Matcher matcher2 = this.patternLine2.matcher(fixCountryInLine2);
                if (matcher2.find()) {
                    String group2 = matcher2.group();
                    LoggerKt.logPiiDebug("SDLT_MRZ_M", "Line 2 detected: " + group2);
                    return new Pair<>(group, group2);
                }
                LoggerKt.logE$default("SDLT_MRZ_M", "line2 was not detected", null, 4, null);
            } else {
                LoggerKt.logE$default("SDLT_MRZ_M", "Line 1 not detected", null, 4, null);
            }
        } catch (Exception e) {
            LoggerKt.logE$default("SDLT_MRZ_M", "Matcher exception stacktrace: " + Log.getStackTraceString(e), null, 4, null);
        }
        return null;
    }

    private final String fixFirstLine(int index, String text) {
        if (text.length() - index < 44) {
            LoggerKt.logE$default("SDLT_MRZ_M", "First line is still less than 44 after cleaning hence returning", null, 4, null);
            return text;
        }
        String substring = text.substring(index, 44);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String substring2 = text.substring(44);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return substring + substring2;
    }

    private final String fixCountryInLine2(String text) {
        String substring = text.substring(10, 13);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        LoggerKt.logPiiDebug("SDLT_MRZ_M", "Found country to fix: " + substring);
        String substring2 = text.substring(0, 10);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        String fixAlphabets = UtilsKt.fixAlphabets(substring);
        String substring3 = text.substring(13);
        Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
        return substring2 + fixAlphabets + substring3;
    }
}
