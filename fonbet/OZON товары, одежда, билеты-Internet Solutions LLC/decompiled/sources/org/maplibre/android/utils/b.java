package org.maplibre.android.utils;

import Am.C2438a;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class b {
    public static String a(int i11) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("#.###");
        String format = decimalFormat.format(((i11 >> 24) & 255) / 255.0f);
        StringBuilder a11 = C2438a.a("rgba(", (i11 >> 16) & 255, ", ", ", ", (i11 >> 8) & 255);
        a11.append(i11 & 255);
        a11.append(", ");
        a11.append(format);
        a11.append(")");
        return a11.toString();
    }
}
