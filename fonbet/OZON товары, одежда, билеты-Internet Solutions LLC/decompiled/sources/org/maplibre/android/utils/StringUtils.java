package org.maplibre.android.utils;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.text.Normalizer;

@Keep
/* loaded from: classes10.dex */
class StringUtils {
    StringUtils() {
    }

    @NonNull
    @Keep
    static String unaccent(@NonNull String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("(\\p{InCombiningDiacriticalMarks}|\\p{InCombiningDiacriticalMarksForSymbols}|\\p{InCombiningDiacriticalMarksSupplement})+", "");
    }
}
