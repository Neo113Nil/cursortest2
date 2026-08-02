package com.facebook.hermes.intl;

import android.icu.lang.UCharacter;
import android.icu.util.ULocale;
import h8.InterfaceC4488a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@InterfaceC4488a
/* loaded from: classes2.dex */
public class Intl {
    private static List<String> canonicalizeLocaleList(List<String> list) {
        if (list.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str == null) {
                throw new JSRangeErrorException("Incorrect locale information provided");
            }
            if (str.isEmpty()) {
                throw new JSRangeErrorException("Incorrect locale information provided");
            }
            String canonicalizeLocaleId = LocaleIdentifier.canonicalizeLocaleId(str);
            if (!canonicalizeLocaleId.isEmpty() && !arrayList.contains(canonicalizeLocaleId)) {
                arrayList.add(canonicalizeLocaleId);
            }
        }
        return arrayList;
    }

    @InterfaceC4488a
    public static List<String> getCanonicalLocales(List<String> list) {
        return canonicalizeLocaleList(list);
    }

    @InterfaceC4488a
    public static String toLocaleLowerCase(List<String> list, String str) {
        return UCharacter.toLowerCase((ULocale) LocaleMatcher.bestFitMatch((String[]) list.toArray(new String[list.size()])).matchedLocale.getLocale(), str);
    }

    @InterfaceC4488a
    public static String toLocaleUpperCase(List<String> list, String str) {
        return UCharacter.toUpperCase((ULocale) LocaleMatcher.bestFitMatch((String[]) list.toArray(new String[list.size()])).matchedLocale.getLocale(), str);
    }
}
