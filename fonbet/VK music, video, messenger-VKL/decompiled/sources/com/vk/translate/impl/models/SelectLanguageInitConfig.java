package com.vk.translate.impl.models;

import java.io.Serializable;
import xsna.epx;

/* compiled from: SelectLanguageInitConfig.kt */
/* loaded from: classes6.dex */
public abstract class SelectLanguageInitConfig implements Serializable {

    /* compiled from: SelectLanguageInitConfig.kt */
    public static final class Empty extends SelectLanguageInitConfig {
        public static final Empty b = new Empty();

        private Empty() {
            super(0);
        }
    }

    /* compiled from: SelectLanguageInitConfig.kt */
    public static final class WithLanguages extends SelectLanguageInitConfig {
        private final LanguageModel originalLanguage;
        private final LanguageModel translationLanguage;

        public WithLanguages(LanguageModel languageModel, LanguageModel languageModel2) {
            super(0);
            this.originalLanguage = languageModel;
            this.translationLanguage = languageModel2;
        }

        public final LanguageModel d() {
            return this.originalLanguage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithLanguages)) {
                return false;
            }
            WithLanguages withLanguages = (WithLanguages) obj;
            return epx.f(this.originalLanguage, withLanguages.originalLanguage) && epx.f(this.translationLanguage, withLanguages.translationLanguage);
        }

        public final LanguageModel g() {
            return this.translationLanguage;
        }

        public final int hashCode() {
            return this.translationLanguage.hashCode() + (this.originalLanguage.hashCode() * 31);
        }

        public final String toString() {
            return "WithLanguages(originalLanguage=" + this.originalLanguage + ", translationLanguage=" + this.translationLanguage + ')';
        }
    }

    public /* synthetic */ SelectLanguageInitConfig(int i) {
        this();
    }

    private SelectLanguageInitConfig() {
    }
}
