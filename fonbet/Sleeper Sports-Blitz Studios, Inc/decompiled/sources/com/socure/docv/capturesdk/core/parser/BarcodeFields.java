package com.socure.docv.capturesdk.core.parser;

import kotlin.Metadata;

/* compiled from: BarcodeFields.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, d2 = {"Lcom/socure/docv/capturesdk/core/parser/BarcodeFields;", "", "mvaKey", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMvaKey", "()Ljava/lang/String;", "FIRST_NAME", "LAST_NAME", "BIRTH_DATE", "DRIVER_LICENSE_NUMBER", "DRIVER_LICENSE_NAME", "EXPIRATION_DATE", "SUFFIX", "GIVEN_NAME", "MIDDLE_NAME", "FIRST_NAME_TRUNCATION", "MIDDLE_NAME_TRUNCATION", "LAST_NAME_TRUNCATION", "LAST_NAME_ALIAS", "GIVEN_NAME_ALIAS", "STREET_ADDRESS", "STREET_ADDRESS_TWO", "CITY", "STATE", "COUNTRY", "POSTAL_CODE", "UNIQUE_DOCUMENT_ID", "ISSUE_DATE", "EYE_COLOR", "SEX", "HEIGHT_IN", "HEIGHT_CM", "COMPLIANCE_INDICATOR", "DATA_SEPARATOR", "FORMAT", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum BarcodeFields {
    FIRST_NAME("DAC"),
    LAST_NAME("DCS"),
    BIRTH_DATE("DBB"),
    DRIVER_LICENSE_NUMBER("DAQ"),
    DRIVER_LICENSE_NAME("DAA"),
    EXPIRATION_DATE("DBA"),
    SUFFIX("DBS"),
    GIVEN_NAME("DCT"),
    MIDDLE_NAME("DAD"),
    FIRST_NAME_TRUNCATION("DDF"),
    MIDDLE_NAME_TRUNCATION("DDG"),
    LAST_NAME_TRUNCATION("DDE"),
    LAST_NAME_ALIAS("DBN"),
    GIVEN_NAME_ALIAS("DBG"),
    STREET_ADDRESS("DAG"),
    STREET_ADDRESS_TWO("DAH"),
    CITY("DAI"),
    STATE("DAJ"),
    COUNTRY("DCG"),
    POSTAL_CODE("DAK"),
    UNIQUE_DOCUMENT_ID("DCF"),
    ISSUE_DATE("DBD"),
    EYE_COLOR("DAY"),
    SEX("DBC"),
    HEIGHT_IN("DAU"),
    HEIGHT_CM("DAV"),
    COMPLIANCE_INDICATOR("@"),
    DATA_SEPARATOR("\n"),
    FORMAT("ANSI ");

    private final String mvaKey;

    BarcodeFields(String str) {
        this.mvaKey = str;
    }

    public final String getMvaKey() {
        return this.mvaKey;
    }
}
