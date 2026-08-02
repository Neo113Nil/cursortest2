package com.facebook.hermes.intl;

import android.icu.util.ULocale;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class LocaleObjectICU implements ILocaleObject<ULocale> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean mIsDirty;
    private ULocale m_icuLocale;
    private ULocale.Builder m_icuLocaleBuilder;

    private LocaleObjectICU(ULocale uLocale) {
        this.m_icuLocaleBuilder = null;
        this.mIsDirty = false;
        this.m_icuLocale = uLocale;
    }

    public static ILocaleObject<ULocale> createDefault() {
        return new LocaleObjectICU(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public static ILocaleObject<ULocale> createFromLocaleId(String str) {
        return new LocaleObjectICU(str);
    }

    public static ILocaleObject<ULocale> createFromULocale(ULocale uLocale) {
        return new LocaleObjectICU(uLocale);
    }

    private void ensureNotDirty() {
        if (this.mIsDirty) {
            try {
                this.m_icuLocale = this.m_icuLocaleBuilder.build();
                this.mIsDirty = false;
            } catch (RuntimeException e10) {
                throw new JSRangeErrorException(e10.getMessage());
            }
        }
    }

    @Override // com.facebook.hermes.intl.ILocaleObject
    public ILocaleObject<ULocale> cloneObject() {
        ensureNotDirty();
        return new LocaleObjectICU(this.m_icuLocale);
    }

    @Override // com.facebook.hermes.intl.ILocaleObject
    public ArrayList<String> getUnicodeExtensions(String str) {
        ensureNotDirty();
        String CanonicalKeyToICUKey = UnicodeExtensionKeys.CanonicalKeyToICUKey(str);
        ArrayList<String> arrayList = new ArrayList<>();
        String keywordValue = this.m_icuLocale.getKeywordValue(CanonicalKeyToICUKey);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    @Override // com.facebook.hermes.intl.ILocaleObject
    public void setUnicodeExtensions(String str, ArrayList<String> arrayList) {
        ensureNotDirty();
        if (this.m_icuLocaleBuilder == null) {
            this.m_icuLocaleBuilder = new ULocale.Builder().setLocale(this.m_icuLocale);
        }
        try {
            this.m_icuLocaleBuilder.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.mIsDirty = true;
        } catch (RuntimeException e10) {
            throw new JSRangeErrorException(e10.getMessage());
        }
    }

    @Override // com.facebook.hermes.intl.ILocaleObject
    public String toCanonicalTag() {
        return getLocale().toLanguageTag();
    }

    @Override // com.facebook.hermes.intl.ILocaleObject
    public String toCanonicalTagWithoutExtensions() {
        return getLocaleWithoutExtensions().toLanguageTag();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.hermes.intl.ILocaleObject
    public ULocale getLocale() {
        ensureNotDirty();
        return this.m_icuLocale;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.hermes.intl.ILocaleObject
    public ULocale getLocaleWithoutExtensions() {
        ensureNotDirty();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.m_icuLocale);
        builder.clearExtensions();
        return builder.build();
    }

    private LocaleObjectICU(String str) {
        this.m_icuLocale = null;
        this.m_icuLocaleBuilder = null;
        this.mIsDirty = false;
        ULocale.Builder builder = new ULocale.Builder();
        this.m_icuLocaleBuilder = builder;
        try {
            builder.setLanguageTag(str);
            this.mIsDirty = true;
        } catch (RuntimeException e10) {
            throw new JSRangeErrorException(e10.getMessage());
        }
    }

    @Override // com.facebook.hermes.intl.ILocaleObject
    public HashMap<String, String> getUnicodeExtensions() {
        ensureNotDirty();
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keywords = this.m_icuLocale.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                hashMap.put(UnicodeExtensionKeys.ICUKeyToCanonicalKey(next), this.m_icuLocale.getKeywordValue(next));
            }
        }
        return hashMap;
    }
}
