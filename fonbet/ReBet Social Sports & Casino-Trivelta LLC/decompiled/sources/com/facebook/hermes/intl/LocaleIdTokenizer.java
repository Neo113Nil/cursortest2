package com.facebook.hermes.intl;

/* loaded from: classes2.dex */
class LocaleIdTokenizer {
    private CharSequence mLocaleIdBuffer;
    int mCurrentSubtagStart = 0;
    int mCurrentSubtagEnd = -1;

    public class LocaleIdSubtag {
        private CharSequence mLocaleIdBuffer;
        private int mSubtagEnd;
        private int mSubtagStart;

        public LocaleIdSubtag(CharSequence charSequence, int i10, int i11) {
            this.mLocaleIdBuffer = charSequence;
            this.mSubtagStart = i10;
            this.mSubtagEnd = i11;
        }

        public boolean isExtensionSingleton() {
            return IntlTextUtils.isExtensionSingleton(this.mLocaleIdBuffer, this.mSubtagStart, this.mSubtagEnd);
        }

        public boolean isOtherExtension() {
            return IntlTextUtils.isOtherExtension(this.mLocaleIdBuffer, this.mSubtagStart, this.mSubtagEnd);
        }

        public boolean isPrivateUseExtension() {
            return IntlTextUtils.isPrivateUseExtension(this.mLocaleIdBuffer, this.mSubtagStart, this.mSubtagEnd);
        }

        public boolean isTranformedExtensionTKey() {
            return IntlTextUtils.isTranformedExtensionTKey(this.mLocaleIdBuffer, this.mSubtagStart, this.mSubtagEnd);
        }

        public boolean isTranformedExtensionTValueItem() {
            return IntlTextUtils.isTranformedExtensionTValueItem(this.mLocaleIdBuffer, this.mSubtagStart, this.mSubtagEnd);
        }

        public boolean isUnicodeExtensionAttribute() {
            return IntlTextUtils.isUnicodeExtensionAttribute(this.mLocaleIdBuffer, this.mSubtagStart, this.mSubtagEnd);
        }

        public boolean isUnicodeExtensionKey() {
            return IntlTextUtils.isUnicodeExtensionKey(this.mLocaleIdBuffer, this.mSubtagStart, this.mSubtagEnd);
        }

        public boolean isUnicodeExtensionKeyTypeItem() {
            return IntlTextUtils.isUnicodeExtensionKeyTypeItem(this.mLocaleIdBuffer, this.mSubtagStart, this.mSubtagEnd);
        }

        public boolean isUnicodeLanguageSubtag() {
            return IntlTextUtils.isUnicodeLanguageSubtag(this.mLocaleIdBuffer, this.mSubtagStart, this.mSubtagEnd);
        }

        public boolean isUnicodeRegionSubtag() {
            return IntlTextUtils.isUnicodeRegionSubtag(this.mLocaleIdBuffer, this.mSubtagStart, this.mSubtagEnd);
        }

        public boolean isUnicodeScriptSubtag() {
            return IntlTextUtils.isUnicodeScriptSubtag(this.mLocaleIdBuffer, this.mSubtagStart, this.mSubtagEnd);
        }

        public boolean isUnicodeVariantSubtag() {
            return IntlTextUtils.isUnicodeVariantSubtag(this.mLocaleIdBuffer, this.mSubtagStart, this.mSubtagEnd);
        }

        public void reset() {
            this.mLocaleIdBuffer = "";
            this.mSubtagStart = 0;
            this.mSubtagEnd = 0;
        }

        public String toLowerString() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = this.mSubtagStart; i10 <= this.mSubtagEnd; i10++) {
                stringBuffer.append(Character.toLowerCase(this.mLocaleIdBuffer.charAt(i10)));
            }
            return stringBuffer.toString();
        }

        public String toString() {
            return this.mLocaleIdBuffer.subSequence(this.mSubtagStart, this.mSubtagEnd + 1).toString();
        }

        public String toTitleString() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = this.mSubtagStart; i10 <= this.mSubtagEnd; i10++) {
                if (i10 == this.mSubtagStart) {
                    stringBuffer.append(Character.toUpperCase(this.mLocaleIdBuffer.charAt(i10)));
                } else {
                    stringBuffer.append(Character.toLowerCase(this.mLocaleIdBuffer.charAt(i10)));
                }
            }
            return stringBuffer.toString();
        }

        public String toUpperString() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = this.mSubtagStart; i10 <= this.mSubtagEnd; i10++) {
                stringBuffer.append(Character.toUpperCase(this.mLocaleIdBuffer.charAt(i10)));
            }
            return stringBuffer.toString();
        }
    }

    public class LocaleIdSubtagIterationFailed extends Exception {
        public LocaleIdSubtagIterationFailed() {
        }
    }

    public LocaleIdTokenizer(CharSequence charSequence) {
        this.mLocaleIdBuffer = charSequence;
    }

    private static boolean isSubtagSeparator(char c10) {
        return c10 == '-';
    }

    public boolean hasMoreSubtags() {
        return this.mLocaleIdBuffer.length() > 0 && this.mCurrentSubtagEnd < this.mLocaleIdBuffer.length() - 1;
    }

    public LocaleIdSubtag nextSubtag() {
        if (!hasMoreSubtags()) {
            throw new LocaleIdSubtagIterationFailed();
        }
        int i10 = this.mCurrentSubtagEnd;
        if (i10 >= this.mCurrentSubtagStart) {
            if (!isSubtagSeparator(this.mLocaleIdBuffer.charAt(i10 + 1))) {
                throw new LocaleIdSubtagIterationFailed();
            }
            if (this.mCurrentSubtagEnd + 2 == this.mLocaleIdBuffer.length()) {
                throw new LocaleIdSubtagIterationFailed();
            }
            this.mCurrentSubtagStart = this.mCurrentSubtagEnd + 2;
        }
        this.mCurrentSubtagEnd = this.mCurrentSubtagStart;
        while (this.mCurrentSubtagEnd < this.mLocaleIdBuffer.length() && !isSubtagSeparator(this.mLocaleIdBuffer.charAt(this.mCurrentSubtagEnd))) {
            this.mCurrentSubtagEnd++;
        }
        int i11 = this.mCurrentSubtagEnd;
        int i12 = this.mCurrentSubtagStart;
        if (i11 <= i12) {
            throw new LocaleIdSubtagIterationFailed();
        }
        int i13 = i11 - 1;
        this.mCurrentSubtagEnd = i13;
        return new LocaleIdSubtag(this.mLocaleIdBuffer, i12, i13);
    }
}
