package com.socure.docv.capturesdk.core.parser;

import android.text.TextUtils;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.core.extractor.ExtractorUtilsKt;
import com.socure.docv.capturesdk.core.extractor.model.ExtractedBarcode;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BarcodeParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/socure/docv/capturesdk/core/parser/BarcodeParser;", "Lcom/socure/docv/capturesdk/core/parser/IParser;", "()V", "read", "Lcom/socure/docv/capturesdk/core/extractor/model/ExtractedBarcode;", "data", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BarcodeParser implements IParser {
    @Override // com.socure.docv.capturesdk.core.parser.IParser
    public ExtractedBarcode read(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        LoggerKt.logPiiDebug(BarcodeParserKt.TAG, "read: " + data);
        HashMap hashMap = new HashMap();
        for (String str : StringsKt.split$default((CharSequence) data, new String[]{BarcodeFields.DATA_SEPARATOR.getMvaKey()}, false, 0, 6, (Object) null)) {
            if (str.length() >= 3) {
                if (str.length() > 4) {
                    String substring = str.substring(0, 5);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    if (Intrinsics.areEqual(substring, BarcodeFields.FORMAT.getMvaKey())) {
                        String obj = StringsKt.trim((CharSequence) StringsKt.substringAfter$default(str, BarcodeFields.DRIVER_LICENSE_NUMBER.getMvaKey(), (String) null, 2, (Object) null)).toString();
                        if (obj.length() < str.length() && TextUtils.isEmpty((CharSequence) hashMap.get(BarcodeFields.DRIVER_LICENSE_NUMBER.getMvaKey()))) {
                            hashMap.put(BarcodeFields.DRIVER_LICENSE_NUMBER.getMvaKey(), obj);
                        }
                    }
                }
                String substring2 = str.substring(0, 3);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                String substring3 = str.substring(3);
                Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                String obj2 = StringsKt.trim((CharSequence) substring3).toString();
                if (!Intrinsics.areEqual(substring2, BarcodeFields.DRIVER_LICENSE_NUMBER.getMvaKey()) || !TextUtils.isEmpty(obj2)) {
                    hashMap.put(substring2, obj2);
                }
            } else {
                if (Intrinsics.areEqual(BarcodeFields.COMPLIANCE_INDICATOR.getMvaKey(), str)) {
                    LoggerKt.logD(BarcodeParserKt.TAG, "Complaint doc");
                }
                LoggerKt.logE$default(BarcodeParserKt.TAG, "Garbage line found: " + str, null, 4, null);
            }
        }
        ExtractedBarcode extractedBarcode = new ExtractedBarcode();
        extractedBarcode.setFirstName((String) hashMap.get(BarcodeFields.FIRST_NAME.getMvaKey()));
        extractedBarcode.setLastName((String) hashMap.get(BarcodeFields.LAST_NAME.getMvaKey()));
        extractedBarcode.setDob(ExtractorUtilsKt.formattedDate((String) hashMap.get(BarcodeFields.BIRTH_DATE.getMvaKey())));
        extractedBarcode.setDocumentNumber((String) hashMap.get(BarcodeFields.DRIVER_LICENSE_NUMBER.getMvaKey()));
        extractedBarcode.setFullName((String) hashMap.get(BarcodeFields.DRIVER_LICENSE_NAME.getMvaKey()));
        extractedBarcode.setExpirationDate(ExtractorUtilsKt.formattedDate((String) hashMap.get(BarcodeFields.EXPIRATION_DATE.getMvaKey())));
        extractedBarcode.setEyeColor$capturesdk_productionRelease((String) hashMap.get(BarcodeFields.EYE_COLOR.getMvaKey()));
        extractedBarcode.setSex$capturesdk_productionRelease((String) hashMap.get(BarcodeFields.SEX.getMvaKey()));
        extractedBarcode.setHeightIn$capturesdk_productionRelease((String) hashMap.get(BarcodeFields.HEIGHT_IN.getMvaKey()));
        extractedBarcode.setHeightCm$capturesdk_productionRelease((String) hashMap.get(BarcodeFields.HEIGHT_CM.getMvaKey()));
        extractedBarcode.setState((String) hashMap.get(BarcodeFields.STATE.getMvaKey()));
        extractedBarcode.setAddress((String) hashMap.get(BarcodeFields.STREET_ADDRESS.getMvaKey()));
        extractedBarcode.setAddress2$capturesdk_productionRelease((String) hashMap.get(BarcodeFields.STREET_ADDRESS_TWO.getMvaKey()));
        extractedBarcode.setPostalCode((String) hashMap.get(BarcodeFields.POSTAL_CODE.getMvaKey()));
        extractedBarcode.setCity((String) hashMap.get(BarcodeFields.CITY.getMvaKey()));
        extractedBarcode.setIssueDate(ExtractorUtilsKt.formattedDate((String) hashMap.get(BarcodeFields.ISSUE_DATE.getMvaKey())));
        extractedBarcode.setFormattedDob(ExtractorUtilsKt.formattedDate((String) hashMap.get(BarcodeFields.BIRTH_DATE.getMvaKey())));
        extractedBarcode.setCountry((String) hashMap.get(BarcodeFields.COUNTRY.getMvaKey()));
        return extractedBarcode;
    }
}
