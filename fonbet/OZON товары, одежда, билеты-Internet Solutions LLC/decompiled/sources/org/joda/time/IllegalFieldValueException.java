package org.joda.time;

import E0.C2942q;

/* loaded from: classes6.dex */
public class IllegalFieldValueException extends IllegalArgumentException {
    private static final long serialVersionUID = 6305711765985447737L;
    private final DateTimeFieldType iDateTimeFieldType;
    private final DurationFieldType iDurationFieldType;
    private final String iFieldName;
    private final Number iLowerBound;
    private String iMessage;
    private final Number iNumberValue;
    private final String iStringValue;
    private final Number iUpperBound;

    public IllegalFieldValueException(DateTimeFieldType dateTimeFieldType, Integer num, Integer num2, Integer num3) {
        super(a(dateTimeFieldType.P(), null, num, num2, num3));
        this.iDateTimeFieldType = dateTimeFieldType;
        this.iDurationFieldType = null;
        this.iFieldName = dateTimeFieldType.P();
        this.iNumberValue = num;
        this.iStringValue = null;
        this.iLowerBound = num2;
        this.iUpperBound = num3;
        this.iMessage = super.getMessage();
    }

    private static String a(String str, String str2, Integer num, Integer num2, Integer num3) {
        StringBuilder sb2 = new StringBuilder("Value ");
        sb2.append(num);
        sb2.append(" for ");
        sb2.append(str);
        sb2.append(' ');
        if (num2 == null) {
            if (num3 == null) {
                sb2.append("is not supported");
            } else {
                sb2.append("must not be larger than ");
                sb2.append(num3);
            }
        } else if (num3 == null) {
            sb2.append("must not be smaller than ");
            sb2.append(num2);
        } else {
            sb2.append("must be in the range [");
            sb2.append(num2);
            sb2.append(',');
            sb2.append(num3);
            sb2.append(']');
        }
        if (str2 != null) {
            sb2.append(": ");
            sb2.append(str2);
        }
        return sb2.toString();
    }

    public final void b(String str) {
        if (this.iMessage == null) {
            this.iMessage = str;
        } else if (str != null) {
            StringBuilder e11 = C2942q.e(str, ": ");
            e11.append(this.iMessage);
            this.iMessage = e11.toString();
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.iMessage;
    }

    public IllegalFieldValueException(DateTimeFieldType dateTimeFieldType, Integer num, Integer num2, String str) {
        super(a(dateTimeFieldType.P(), str, num, 1, num2));
        this.iDateTimeFieldType = dateTimeFieldType;
        this.iDurationFieldType = null;
        this.iFieldName = dateTimeFieldType.P();
        this.iNumberValue = num;
        this.iStringValue = null;
        this.iLowerBound = 1;
        this.iUpperBound = num2;
        this.iMessage = super.getMessage();
    }

    public IllegalFieldValueException(DateTimeFieldType dateTimeFieldType, Integer num, String str) {
        super(a(dateTimeFieldType.P(), str, num, null, null));
        this.iDateTimeFieldType = dateTimeFieldType;
        this.iDurationFieldType = null;
        this.iFieldName = dateTimeFieldType.P();
        this.iNumberValue = num;
        this.iStringValue = null;
        this.iLowerBound = null;
        this.iUpperBound = null;
        this.iMessage = super.getMessage();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IllegalFieldValueException(DateTimeFieldType dateTimeFieldType, String str) {
        super(r1.toString());
        String P11 = dateTimeFieldType.P();
        StringBuffer stringBuffer = new StringBuffer("Value ");
        if (str == null) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append('\"');
            stringBuffer.append(str);
            stringBuffer.append('\"');
        }
        stringBuffer.append(" for ");
        stringBuffer.append(P11);
        stringBuffer.append(" is not supported");
        this.iDateTimeFieldType = dateTimeFieldType;
        this.iDurationFieldType = null;
        this.iFieldName = dateTimeFieldType.P();
        this.iStringValue = str;
        this.iNumberValue = null;
        this.iLowerBound = null;
        this.iUpperBound = null;
        this.iMessage = super.getMessage();
    }
}
