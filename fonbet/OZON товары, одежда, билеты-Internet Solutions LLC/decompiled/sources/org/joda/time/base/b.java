package org.joda.time.base;

import java.io.IOException;
import org.joda.convert.ToString;
import org.joda.time.format.h;

/* loaded from: classes10.dex */
public abstract class b implements org.joda.time.g {
    protected b() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(org.joda.time.g gVar) {
        long millis = ((BaseDuration) this).getMillis();
        long millis2 = gVar.getMillis();
        if (millis < millis2) {
            return -1;
        }
        return millis > millis2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof org.joda.time.g) && ((BaseDuration) this).getMillis() == ((org.joda.time.g) obj).getMillis();
    }

    public final int hashCode() {
        long millis = ((BaseDuration) this).getMillis();
        return (int) (millis ^ (millis >>> 32));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r2.insert(3, "0");
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    @ToString
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        long millis = ((BaseDuration) this).getMillis();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        boolean z11 = millis < 0;
        int i11 = h.f79290b;
        int i12 = (int) millis;
        try {
            if (i12 == millis) {
                h.c(stringBuffer, i12);
            } else {
                stringBuffer.append((CharSequence) Long.toString(millis));
            }
        } catch (IOException unused) {
        }
        if (stringBuffer.length() >= (!z11 ? 7 : 6)) {
            if (!z11) {
            }
            stringBuffer.insert(2, "0");
            if (stringBuffer.length() >= (!z11 ? 7 : 6)) {
                if ((millis / 1000) * 1000 == millis) {
                    stringBuffer.setLength(stringBuffer.length() - 3);
                } else {
                    stringBuffer.insert(stringBuffer.length() - 3, ".");
                }
                stringBuffer.append('S');
                return stringBuffer.toString();
            }
        }
    }
}
