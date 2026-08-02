package org.maplibre.android.utils;

import android.graphics.Typeface;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import org.maplibre.android.log.Logger;

/* loaded from: classes10.dex */
public final class d {
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sans-serif");
        arrayList.add("serif");
        arrayList.add("monospace");
    }

    public static String a(String... strArr) {
        if (strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Typeface create = Typeface.create(Typeface.DEFAULT, 0);
            Field declaredField = Typeface.class.getDeclaredField("sSystemFontMap");
            declaredField.setAccessible(true);
            arrayList.addAll(((Map) declaredField.get(create)).keySet());
        } catch (Exception e11) {
            Logger.e("Mbgl-FontUtils", "Couldn't load fonts from Typeface", e11);
            org.maplibre.android.b.d("Couldn't load fonts from Typeface", e11);
        }
        for (String str : strArr) {
            if (arrayList.contains(str)) {
                return str;
            }
        }
        Logger.i("Mbgl-FontUtils", "Couldn't map font family for local ideograph, using sans-serif instead");
        return "sans-serif";
    }
}
