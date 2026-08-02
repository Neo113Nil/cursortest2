package com.vk.translate.impl.models;

import java.io.Serializable;
import xsna.epx;
import xsna.ho8;

/* compiled from: LanguageModel.kt */
/* loaded from: classes6.dex */
public final class LanguageModel implements Serializable {
    private final SupportedTranslateLanguage supportedTranslateLanguage;
    private final String uiTitle;

    public LanguageModel(SupportedTranslateLanguage supportedTranslateLanguage, String str) {
        this.supportedTranslateLanguage = supportedTranslateLanguage;
        this.uiTitle = str;
    }

    public final SupportedTranslateLanguage d() {
        return this.supportedTranslateLanguage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageModel)) {
            return false;
        }
        LanguageModel languageModel = (LanguageModel) obj;
        return epx.f(this.supportedTranslateLanguage, languageModel.supportedTranslateLanguage) && epx.f(this.uiTitle, languageModel.uiTitle);
    }

    public final String g() {
        return this.uiTitle;
    }

    public final int hashCode() {
        return this.uiTitle.hashCode() + (this.supportedTranslateLanguage.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LanguageModel(supportedTranslateLanguage=");
        sb.append(this.supportedTranslateLanguage);
        sb.append(", uiTitle=");
        return ho8.a(sb, this.uiTitle, ')');
    }
}
