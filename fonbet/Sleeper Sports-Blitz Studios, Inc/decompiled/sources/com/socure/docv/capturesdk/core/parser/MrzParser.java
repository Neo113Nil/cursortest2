package com.socure.docv.capturesdk.core.parser;

import android.text.TextUtils;
import com.google.firebase.ktx.BuildConfig;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.core.extractor.model.ExtractedMrz;
import io.branch.indexing.ContentDiscoveryManifest;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: MrzParser.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¨\u0006\u0015"}, d2 = {"Lcom/socure/docv/capturesdk/core/parser/MrzParser;", "", "()V", "cleanFillers", "", "text", "formattedDate", "dob", "getCompositeText", "secondLine", "getInt", "", "ch", "", "parse", "Lcom/socure/docv/capturesdk/core/extractor/model/ExtractedMrz;", "mrzLines", "Lkotlin/Pair;", "validate", "", ContentDiscoveryManifest.CONTENT_DISCOVER_KEY, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MrzParser {
    public final ExtractedMrz parse(Pair<String, String> mrzLines) {
        String surname;
        Intrinsics.checkNotNullParameter(mrzLines, "mrzLines");
        String str = null;
        if (mrzLines.getFirst().length() != 44 || mrzLines.getSecond().length() != 44) {
            LoggerKt.logE$default(BarcodeParserKt.TAG, "Invalid line lengths", null, 4, null);
            return null;
        }
        ExtractedMrz extractedMrz = new ExtractedMrz();
        String substring = mrzLines.getFirst().substring(2, 5);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        extractedMrz.setIssuingCountry(substring);
        String substring2 = mrzLines.getFirst().substring(5);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        LoggerKt.logPiiDebug(BarcodeParserKt.TAG, "namePart: " + substring2);
        Matcher matcher = Pattern.compile(MrzParserKt.RAW_NAME_PATTERN).matcher(substring2);
        String group = matcher.find() ? matcher.group() : null;
        LoggerKt.logPiiDebug(BarcodeParserKt.TAG, "countryCode: " + substring + " | rawName: " + group);
        if (group != null) {
            List split$default = StringsKt.split$default((CharSequence) group, new String[]{"<<"}, false, 0, 6, (Object) null);
            LoggerKt.logD(BarcodeParserKt.TAG, "names: " + CollectionsKt.joinToString$default(split$default, ", ", null, null, 0, null, null, 62, null));
            int i = 0;
            for (Object obj : split$default) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str2 = (String) obj;
                if (i == 0) {
                    String str3 = str2;
                    if (StringsKt.contains$default((CharSequence) str3, (CharSequence) MrzParserKt.FILLER, false, 2, (Object) null)) {
                        str2 = CollectionsKt.joinToString$default(StringsKt.split$default((CharSequence) str3, new String[]{MrzParserKt.FILLER}, false, 0, 6, (Object) null), " ", null, null, 0, null, null, 62, null);
                    }
                    extractedMrz.setSurname(str2);
                } else if (i == 1) {
                    String str4 = str2;
                    if (StringsKt.contains$default((CharSequence) str4, (CharSequence) MrzParserKt.FILLER, false, 2, (Object) null)) {
                        str2 = CollectionsKt.joinToString$default(StringsKt.split$default((CharSequence) str4, new String[]{MrzParserKt.FILLER}, false, 0, 6, (Object) null), " ", null, null, 0, null, null, 62, null);
                    }
                    extractedMrz.setFirstName(str2);
                }
                i = i2;
            }
            if (!TextUtils.isEmpty(extractedMrz.getFirstName()) && !TextUtils.isEmpty(extractedMrz.getSurname())) {
                surname = extractedMrz.getFirstName() + " " + extractedMrz.getSurname();
            } else if (!TextUtils.isEmpty(extractedMrz.getFirstName())) {
                surname = extractedMrz.getFirstName();
            } else {
                surname = !TextUtils.isEmpty(extractedMrz.getSurname()) ? extractedMrz.getSurname() : null;
            }
            extractedMrz.setFullName(surname);
            LoggerKt.logPiiDebug(BarcodeParserKt.TAG, "Name: first: " + extractedMrz.getFirstName() + " | surname: " + extractedMrz.getSurname());
        }
        String substring3 = mrzLines.getSecond().substring(0, 9);
        Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
        extractedMrz.setDocumentNumber(cleanFillers(substring3));
        String substring4 = mrzLines.getSecond().substring(9, 10);
        Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
        extractedMrz.setValidDocumentNumber(Boolean.valueOf(validate(substring3, substring4)));
        String substring5 = mrzLines.getSecond().substring(10, 13);
        Intrinsics.checkNotNullExpressionValue(substring5, "substring(...)");
        if (TextUtils.isEmpty(extractedMrz.getIssuingCountry())) {
            extractedMrz.setIssuingCountry(substring5);
        }
        extractedMrz.setNationality(extractedMrz.getIssuingCountry());
        String substring6 = mrzLines.getSecond().substring(13, 19);
        Intrinsics.checkNotNullExpressionValue(substring6, "substring(...)");
        extractedMrz.setDob(formattedDate(cleanFillers(substring6)));
        String substring7 = mrzLines.getSecond().substring(19, 20);
        Intrinsics.checkNotNullExpressionValue(substring7, "substring(...)");
        extractedMrz.setValidDateOfBirth(Boolean.valueOf(validate(substring6, substring7)));
        String substring8 = mrzLines.getSecond().substring(20, 21);
        Intrinsics.checkNotNullExpressionValue(substring8, "substring(...)");
        int hashCode = substring8.hashCode();
        if (hashCode != 60) {
            if (hashCode != 70) {
                if (hashCode == 77 && substring8.equals("M")) {
                    str = "MALE";
                }
            } else if (substring8.equals("F")) {
                str = "FEMALE";
            }
        } else if (substring8.equals(MrzParserKt.FILLER)) {
            str = BuildConfig.VERSION_NAME;
        }
        extractedMrz.setSex(str);
        String substring9 = mrzLines.getSecond().substring(21, 27);
        Intrinsics.checkNotNullExpressionValue(substring9, "substring(...)");
        extractedMrz.setExpirationDate(formattedDate(cleanFillers(substring9)));
        String substring10 = mrzLines.getSecond().substring(27, 28);
        Intrinsics.checkNotNullExpressionValue(substring10, "substring(...)");
        extractedMrz.setValidExpirationDate(Boolean.valueOf(validate(substring9, substring10)));
        String substring11 = mrzLines.getSecond().substring(28, 42);
        Intrinsics.checkNotNullExpressionValue(substring11, "substring(...)");
        extractedMrz.setPersonalNumber$capturesdk_productionRelease(cleanFillers(substring11));
        String substring12 = mrzLines.getSecond().substring(42, 43);
        Intrinsics.checkNotNullExpressionValue(substring12, "substring(...)");
        extractedMrz.setPersonalNumberValid$capturesdk_productionRelease(Boolean.valueOf(validate(substring11, substring12)));
        String substring13 = mrzLines.getSecond().substring(43);
        Intrinsics.checkNotNullExpressionValue(substring13, "substring(...)");
        extractedMrz.setValidComposite(Boolean.valueOf(validate(getCompositeText(mrzLines.getSecond()), substring13)));
        LoggerKt.logPiiDebug(BarcodeParserKt.TAG, "runningStartIndex: 43 | docNum: " + substring3 + " | docNumberCheckDigit: " + substring4 + " | countryCodeL2: " + substring5 + " | dob: " + substring6 + " | dobCheckDigit: " + substring7 + " | sex: " + substring8 + " | doe: " + substring9 + " | doeCheckDigit: " + substring10 + " | optionalData: " + substring11 + " | optDataCheckDigit: " + substring12 + " | overallCheckDigit: " + substring13 + " | ");
        return extractedMrz;
    }

    private final String cleanFillers(String text) {
        LoggerKt.logD(BarcodeParserKt.TAG, "cleanFillers: " + text);
        int indexOf$default = StringsKt.indexOf$default((CharSequence) text, MrzParserKt.FILLER, 0, false, 6, (Object) null);
        if (indexOf$default >= 0) {
            text = text.substring(0, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(text, "substring(...)");
        }
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        return text;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean validate(String text, String cd) {
        int i;
        int i2;
        if (Character.isDigit(cd.charAt(0))) {
            i = Integer.parseInt(cd);
        } else {
            i = Intrinsics.areEqual(cd, MrzParserKt.FILLER) ? 0 : -1;
        }
        if (i < 0) {
            return false;
        }
        int length = text.length();
        int i3 = 0;
        int i4 = 1;
        for (int i5 = 0; i5 < length; i5++) {
            if (i4 == 1) {
                i2 = getInt(text.charAt(i5)) * 7;
            } else if (i4 != 2) {
                if (i4 == 3) {
                    i2 = getInt(text.charAt(i5));
                }
                i4 = i4 != 3 ? 1 : i4 + 1;
            } else {
                i2 = getInt(text.charAt(i5)) * 3;
            }
            i3 += i2;
            if (i4 != 3) {
            }
        }
        return i == i3 % 10;
    }

    private final int getInt(char ch) {
        if (ch == '<') {
            return 0;
        }
        return Character.isDigit(ch) ? CharsKt.digitToInt(ch) : ch - '7';
    }

    private final String formattedDate(String dob) {
        if (dob != null) {
            return Utils.getFormattedDate$capturesdk_productionRelease$default(Utils.INSTANCE, dob, "yyMMdd", null, 4, null);
        }
        return null;
    }

    private final String getCompositeText(String secondLine) {
        StringBuilder sb = new StringBuilder();
        String substring = secondLine.substring(0, 10);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        sb.append(substring);
        String substring2 = secondLine.substring(13, 20);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb.append(substring2);
        String substring3 = secondLine.substring(21, 43);
        Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
        sb.append(substring3);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder()\n        …r\n            .toString()");
        return sb2;
    }
}
