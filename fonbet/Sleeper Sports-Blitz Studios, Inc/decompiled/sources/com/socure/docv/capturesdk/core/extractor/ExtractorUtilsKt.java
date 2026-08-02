package com.socure.docv.capturesdk.core.extractor;

import android.util.Log;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.face.Face;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.common.utils.UtilsKt;
import com.socure.docv.capturesdk.core.extractor.model.ExtractedBarcode;
import com.socure.docv.capturesdk.core.extractor.model.ExtractedMrz;
import com.socure.docv.capturesdk.core.parser.BarcodeParser;
import com.socure.docv.capturesdk.core.parser.MrzParser;
import com.socure.docv.capturesdk.core.parser.MrzParserKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: ExtractorUtils.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u001c\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0000\u001a\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0018H\u0000\u001a\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000\u001a\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010 \u001a\u00020\u0013H\u0000\u001a\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\"2\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u001e\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00062\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018H\u0000\u001a$\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\f0\"2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010)H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"PASSPORT_RELAXED_REGEX_LINE1", "", "TAG", "addTrailingFillersInFirstLine", "text", "area", "", OptionalModuleUtils.FACE, "Lcom/google/mlkit/vision/face/Face;", "clean", "lineIndex", "startsWithPk", "", "compareFields", "f1", "f2", "formattedDate", "dob", "getBarcodeData", "Lcom/socure/docv/capturesdk/core/extractor/model/ExtractedBarcode;", "barcode", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "getExtractedBarcode", "barcodes", "", "getFinalFace", "faces", "getRotationAngle", "", "angle", "isNextBetter", "prev", "next", "possibleMrzFirstLine", "Lkotlin/Pair;", "possibleSecondLine", "blockIndex", "blocks", "validateTextBlocks", "Lcom/socure/docv/capturesdk/core/extractor/model/ExtractedMrz;", "textBlocks", "", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExtractorUtilsKt {
    private static final String PASSPORT_RELAXED_REGEX_LINE1 = "(P<)([A-Z]{3})([A-Z]+)(<<)([A-Z]+)(<+)";
    private static final String TAG = "SDLT_EU";

    public static final boolean isNextBetter(ExtractedBarcode extractedBarcode, ExtractedBarcode next) {
        Unit unit;
        int i;
        Intrinsics.checkNotNullParameter(next, "next");
        if (extractedBarcode != null) {
            i = compareFields(extractedBarcode.getFirstName(), next.getFirstName()) + compareFields(extractedBarcode.getLastName(), next.getLastName()) + compareFields(extractedBarcode.getDob(), next.getDob()) + compareFields(extractedBarcode.getDocumentNumber(), next.getDocumentNumber()) + compareFields(extractedBarcode.getFullName(), next.getFullName()) + compareFields(extractedBarcode.getExpirationDate(), next.getExpirationDate());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
            i = 0;
        }
        if (unit == null) {
            i = 1;
        }
        return i > 0;
    }

    public static final int compareFields(String str, String str2) {
        if (str != null || str2 == null) {
            return (str2 != null ? str2.length() : 0) > (str != null ? str.length() : 0) ? 1 : 0;
        }
        return 1;
    }

    public static final String formattedDate(String str) {
        if (str != null) {
            return Utils.getFormattedDate$capturesdk_productionRelease$default(Utils.INSTANCE, str, null, null, 6, null);
        }
        return null;
    }

    public static final String clean(String text, int i, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        String upperCase = UtilsKt.fixSpecialChars(new Regex("\\s+").replace(text, "")).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (i != 1) {
            return upperCase;
        }
        String fixAlphabets = UtilsKt.fixAlphabets(upperCase);
        if (z) {
            LoggerKt.logD(TAG, "started with PK and ended with filler hence changing it to P<");
            fixAlphabets = StringsKt.replaceRange((CharSequence) fixAlphabets, 1, 2, (CharSequence) MrzParserKt.FILLER).toString();
        }
        return addTrailingFillersInFirstLine(fixAlphabets);
    }

    public static final String addTrailingFillersInFirstLine(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Matcher matcher = Pattern.compile(PASSPORT_RELAXED_REGEX_LINE1).matcher(text);
        int length = 44 - text.length();
        if (!matcher.find() || length <= 0) {
            return text;
        }
        LoggerKt.logD(TAG, "First line fell short of <, so adding " + length + " of them");
        return text + StringsKt.repeat(MrzParserKt.FILLER, length);
    }

    public static final ExtractedBarcode getExtractedBarcode(List<? extends Barcode> barcodes) {
        ExtractedBarcode extractedBarcode;
        Intrinsics.checkNotNullParameter(barcodes, "barcodes");
        BarcodeParser barcodeParser = new BarcodeParser();
        ExtractedBarcode extractedBarcode2 = null;
        for (Barcode barcode : barcodes) {
            LoggerKt.logPiiDebug(TAG, "Raw value of barcode: " + barcode.getRawValue());
            int valueType = barcode.getValueType();
            if (valueType == 12 || valueType == 2048) {
                LoggerKt.logD(TAG, "Barcode format found PDF417, or DRIVER_LICENSE : " + barcode.getValueType());
                extractedBarcode = getBarcodeData(barcode);
                if (extractedBarcode != null && isNextBetter(extractedBarcode2, extractedBarcode)) {
                    extractedBarcode2 = extractedBarcode;
                }
            } else {
                LoggerKt.logD(TAG, "Some other barcode type found " + barcode.getValueType());
                String textData = barcode.getRawValue();
                if (textData != null) {
                    Intrinsics.checkNotNullExpressionValue(textData, "textData");
                    extractedBarcode = barcodeParser.read(textData);
                    if (isNextBetter(extractedBarcode2, extractedBarcode)) {
                        extractedBarcode2 = extractedBarcode;
                    }
                }
            }
        }
        return extractedBarcode2;
    }

    public static final ExtractedBarcode getBarcodeData(Barcode barcode) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        Barcode.DriverLicense driverLicense = barcode.getDriverLicense();
        if (driverLicense == null) {
            return null;
        }
        LoggerKt.logPiiDebug(TAG, "DL being parsed is: " + driverLicense);
        ExtractedBarcode extractedBarcode = new ExtractedBarcode();
        extractedBarcode.setFirstName(driverLicense.getFirstName());
        extractedBarcode.setLastName(driverLicense.getLastName());
        extractedBarcode.setDob(driverLicense.getBirthDate());
        extractedBarcode.setDocumentNumber(driverLicense.getLicenseNumber());
        extractedBarcode.setFullName(driverLicense.getFirstName() + " " + driverLicense.getMiddleName() + " " + driverLicense.getLastName());
        extractedBarcode.setExpirationDate(driverLicense.getExpiryDate());
        extractedBarcode.setSex$capturesdk_productionRelease(driverLicense.getGender());
        extractedBarcode.setState(driverLicense.getAddressState());
        extractedBarcode.setAddress(driverLicense.getAddressStreet());
        extractedBarcode.setAddress2$capturesdk_productionRelease(driverLicense.getAddressCity());
        extractedBarcode.setPostalCode(driverLicense.getAddressZip());
        extractedBarcode.setCity(driverLicense.getAddressCity());
        extractedBarcode.setIssueDate(driverLicense.getIssueDate());
        extractedBarcode.setFormattedDob(formattedDate(driverLicense.getBirthDate()));
        extractedBarcode.setCountry(driverLicense.getIssuingCountry());
        return extractedBarcode;
    }

    public static final Face getFinalFace(List<? extends Face> faces) {
        Unit unit;
        Intrinsics.checkNotNullParameter(faces, "faces");
        Face face = null;
        for (Face face2 : faces) {
            int area = area(face2);
            LoggerKt.logD(TAG, "Face data: " + face2 + " | Face area: " + area + " | z rotation: " + face2.getHeadEulerAngleZ());
            if (face != null) {
                if (area(face) <= area) {
                    face = face2;
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                face = face2;
            }
        }
        return face;
    }

    private static final int area(Face face) {
        return Math.abs(face.getBoundingBox().width() * face.getBoundingBox().height());
    }

    public static final float getRotationAngle(float f) {
        float abs = Math.abs(f);
        if (abs < 75.0f || abs > 105.0f) {
            return 0.0f;
        }
        return (f < 0.0f ? -1.0f : 1.0f) * 90.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.socure.docv.capturesdk.core.extractor.model.ExtractedMrz] */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final Pair<ExtractedMrz, Boolean> validateTextBlocks(List<String> textBlocks) {
        ?? r5;
        int i;
        Intrinsics.checkNotNullParameter(textBlocks, "textBlocks");
        MrzMatcher mrzMatcher = new MrzMatcher();
        ArrayList<String> arrayList = new ArrayList();
        Iterator it = textBlocks.iterator();
        while (true) {
            r5 = 0;
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (StringsKt.contains$default((CharSequence) next, (CharSequence) "\n", false, 2, (Object) null)) {
                arrayList.add(next);
            }
        }
        for (String str : arrayList) {
            int indexOf = textBlocks.indexOf(str);
            List split$default = StringsKt.split$default((CharSequence) str, new String[]{"\n"}, false, 0, 6, (Object) null);
            textBlocks.remove(str);
            textBlocks.addAll(indexOf, split$default);
        }
        int size = textBlocks.size();
        boolean z = false;
        while (i < size) {
            String str2 = textBlocks.get(i);
            try {
                Pair<Boolean, Boolean> possibleMrzFirstLine = possibleMrzFirstLine(str2);
                if (possibleMrzFirstLine.getFirst().booleanValue()) {
                    LoggerKt.logPiiDebug(TAG, "Block index: " + i + " | Block text: " + str2);
                    Pair<String, String> match = mrzMatcher.match(i, textBlocks, possibleMrzFirstLine.getSecond().booleanValue());
                    if (match != null) {
                        LoggerKt.logPiiDebug(TAG, "MRZ matched - line1: " + ((Object) match.getFirst()) + " || line2: " + ((Object) match.getSecond()));
                        try {
                            r5 = new MrzParser().parse(match);
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            LoggerKt.logE$default(TAG, "Ex validateTextBlocks: " + Log.getStackTraceString(th), r5, 4, r5);
                            i++;
                            r5 = r5;
                        }
                    } else if (possibleSecondLine(i, textBlocks)) {
                        LoggerKt.logD(TAG, "First line was detected, however lines couldn't be parsed, but there is a possibility of second line");
                    } else {
                        continue;
                    }
                    z = true;
                    break;
                }
                continue;
            } catch (Throwable th2) {
                th = th2;
            }
            i++;
            r5 = r5;
        }
        LoggerKt.logD(TAG, "MRZ was " + (r5 == 0 ? "not" : "") + " parsed; Mrz was " + (z ? "" : "not") + " found");
        return new Pair<>(r5, Boolean.valueOf(z));
    }

    public static final Pair<Boolean, Boolean> possibleMrzFirstLine(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String upperCase = new Regex("\\s+").replace(text, "").toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String fixAlphabets = UtilsKt.fixAlphabets(upperCase);
        LoggerKt.logPiiDebug(TAG, "Checking for possible first line on: " + fixAlphabets);
        boolean startsWithPkEndsWithFiller = UtilsKt.startsWithPkEndsWithFiller(fixAlphabets);
        boolean z = fixAlphabets.length() > 30 && (StringsKt.contains((CharSequence) fixAlphabets, (CharSequence) "P<", true) || startsWithPkEndsWithFiller);
        if (!z) {
            z = StringsKt.contains((CharSequence) clean(text, -1, false), (CharSequence) "<<", true);
        }
        return new Pair<>(Boolean.valueOf(z), Boolean.valueOf(startsWithPkEndsWithFiller));
    }

    public static final boolean possibleSecondLine(int i, List<String> blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        StringBuilder sb = new StringBuilder();
        int size = blocks.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            sb.append(clean(blocks.get(i2), 2, false));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return StringsKt.contains((CharSequence) sb2, (CharSequence) "<<", true);
    }
}
