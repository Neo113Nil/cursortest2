package com.vk.translate.impl.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import xsna.epx;
import xsna.ms9;

/* compiled from: SupportedTranslateLanguage.kt */
/* loaded from: classes6.dex */
public final class SupportedTranslateLanguage implements Serializable {
    private final String languageCode;
    private final Locale locale;
    private final List<String> supportedTranslationPairs;

    public SupportedTranslateLanguage(String str, Locale locale, ArrayList arrayList) {
        this.languageCode = str;
        this.locale = locale;
        this.supportedTranslationPairs = arrayList;
    }

    public final String d() {
        return this.languageCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportedTranslateLanguage)) {
            return false;
        }
        SupportedTranslateLanguage supportedTranslateLanguage = (SupportedTranslateLanguage) obj;
        return epx.f(this.languageCode, supportedTranslateLanguage.languageCode) && epx.f(this.locale, supportedTranslateLanguage.locale) && epx.f(this.supportedTranslationPairs, supportedTranslateLanguage.supportedTranslationPairs);
    }

    public final Locale g() {
        return this.locale;
    }

    public final List<String> h() {
        return this.supportedTranslationPairs;
    }

    public final int hashCode() {
        return this.supportedTranslationPairs.hashCode() + ((this.locale.hashCode() + (this.languageCode.hashCode() * 31)) * 31);
    }

    public final boolean i(SupportedTranslateLanguage supportedTranslateLanguage) {
        List<String> list = this.supportedTranslationPairs;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (epx.f((String) it.next(), supportedTranslateLanguage.languageCode)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SupportedTranslateLanguage(languageCode=");
        sb.append(this.languageCode);
        sb.append(", locale=");
        sb.append(this.locale);
        sb.append(", supportedTranslationPairs=");
        return ms9.a(')', sb, this.supportedTranslationPairs);
    }
}
