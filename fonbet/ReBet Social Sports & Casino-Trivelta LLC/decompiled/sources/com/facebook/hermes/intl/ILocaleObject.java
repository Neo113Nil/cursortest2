package com.facebook.hermes.intl;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public interface ILocaleObject<T> {
    ILocaleObject<T> cloneObject();

    T getLocale();

    T getLocaleWithoutExtensions();

    ArrayList<String> getUnicodeExtensions(String str);

    HashMap<String, String> getUnicodeExtensions();

    void setUnicodeExtensions(String str, ArrayList<String> arrayList);

    String toCanonicalTag();

    String toCanonicalTagWithoutExtensions();
}
