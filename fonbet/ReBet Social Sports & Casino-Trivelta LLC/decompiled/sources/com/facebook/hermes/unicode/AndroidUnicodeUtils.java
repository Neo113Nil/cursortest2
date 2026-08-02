package com.facebook.hermes.unicode;

import h8.InterfaceC4488a;
import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;

@InterfaceC4488a
/* loaded from: classes2.dex */
public class AndroidUnicodeUtils {
    @InterfaceC4488a
    public static String convertToCase(String str, int i10, boolean z10) {
        Locale locale = z10 ? Locale.getDefault() : Locale.ENGLISH;
        if (i10 == 0) {
            return str.toUpperCase(locale);
        }
        if (i10 == 1) {
            return str.toLowerCase(locale);
        }
        throw new RuntimeException("Invalid target case");
    }

    @InterfaceC4488a
    public static String dateFormat(double d10, boolean z10, boolean z11) {
        DateFormat timeInstance;
        if (z10 && z11) {
            timeInstance = DateFormat.getDateTimeInstance(2, 2);
        } else if (z10) {
            timeInstance = DateFormat.getDateInstance(2);
        } else {
            if (!z11) {
                throw new RuntimeException("Bad dateFormat configuration");
            }
            timeInstance = DateFormat.getTimeInstance(2);
        }
        return timeInstance.format(Long.valueOf((long) d10)).toString();
    }

    @InterfaceC4488a
    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    @InterfaceC4488a
    public static String normalize(String str, int i10) {
        if (i10 == 0) {
            return Normalizer.normalize(str, Normalizer.Form.NFC);
        }
        if (i10 == 1) {
            return Normalizer.normalize(str, Normalizer.Form.NFD);
        }
        if (i10 == 2) {
            return Normalizer.normalize(str, Normalizer.Form.NFKC);
        }
        if (i10 == 3) {
            return Normalizer.normalize(str, Normalizer.Form.NFKD);
        }
        throw new RuntimeException("Invalid form");
    }
}
