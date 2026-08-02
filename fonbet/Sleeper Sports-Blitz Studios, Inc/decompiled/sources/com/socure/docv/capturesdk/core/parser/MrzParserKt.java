package com.socure.docv.capturesdk.core.parser;

import kotlin.Metadata;

/* compiled from: MrzParser.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"COUNTRY_CODE_LEN", "", "DATE_LEN", "DOC_NUM_SEC_LEN", "FILLER", "", "L1_COUNTRY_CODE_START", "OPT_DATA_LEN", "PASSPORT_DATE_FORMAT", "RAW_NAME_PATTERN", "RAW_NAME_START", "SEX_FEMALE", "SEX_LEN", "SEX_MALE", "SEX_UNSPECIFIED", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MrzParserKt {
    public static final int COUNTRY_CODE_LEN = 3;
    private static final int DATE_LEN = 6;
    private static final int DOC_NUM_SEC_LEN = 9;
    public static final String FILLER = "<";
    public static final int L1_COUNTRY_CODE_START = 2;
    private static final int OPT_DATA_LEN = 14;
    private static final String PASSPORT_DATE_FORMAT = "yyMMdd";
    public static final String RAW_NAME_PATTERN = "(.*[A-Z])";
    public static final int RAW_NAME_START = 5;
    private static final String SEX_FEMALE = "FEMALE";
    private static final int SEX_LEN = 1;
    private static final String SEX_MALE = "MALE";
    private static final String SEX_UNSPECIFIED = "unspecified";
}
