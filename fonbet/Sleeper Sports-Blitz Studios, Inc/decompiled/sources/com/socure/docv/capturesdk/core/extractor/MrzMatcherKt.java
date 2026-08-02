package com.socure.docv.capturesdk.core.extractor;

import kotlin.Metadata;

/* compiled from: MrzMatcher.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"L2_COUNTRY_START", "", "PASSPORT_REGEX_LINE1", "", "PASSPORT_REGEX_LINE2", "TAG", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MrzMatcherKt {
    private static final int L2_COUNTRY_START = 10;
    private static final String PASSPORT_REGEX_LINE1 = "(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{39})";
    private static final String PASSPORT_REGEX_LINE2 = "([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([M|F|X|<]{1})([0-9]{6})([0-9]{1})([A-Z0-9<]{14})([0-9<]{1})([0-9]{1})";
    private static final String TAG = "SDLT_MRZ_M";
}
