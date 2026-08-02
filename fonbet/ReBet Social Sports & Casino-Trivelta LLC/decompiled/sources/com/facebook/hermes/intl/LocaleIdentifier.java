package com.facebook.hermes.intl;

import com.facebook.hermes.intl.LocaleIdTokenizer;
import com.facebook.hermes.intl.ParsedLocaleIdentifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class LocaleIdentifier {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static void addVariantSubtag(String str, ParsedLocaleIdentifier.ParsedLanguageIdentifier parsedLanguageIdentifier) {
        ArrayList<String> arrayList = parsedLanguageIdentifier.variantSubtagList;
        if (arrayList == null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            parsedLanguageIdentifier.variantSubtagList = arrayList2;
            arrayList2.add(str);
        } else {
            if (Collections.binarySearch(arrayList, str) >= 0) {
                throw new JSRangeErrorException("Duplicate variant");
            }
            parsedLanguageIdentifier.variantSubtagList.add((r0 * (-1)) - 1, str);
        }
    }

    public static String canonicalizeLocaleId(String str) {
        return LocaleObject.createFromLocaleId(str).toCanonicalTag();
    }

    public static boolean handleExtensions(CharSequence charSequence, LocaleIdTokenizer localeIdTokenizer, LocaleIdTokenizer.LocaleIdSubtag localeIdSubtag, boolean z10, ParsedLocaleIdentifier parsedLocaleIdentifier) {
        if (z10 && localeIdSubtag.isTranformedExtensionTKey()) {
            parseTransformedExtensionFields(charSequence, localeIdTokenizer, localeIdSubtag, parsedLocaleIdentifier);
            return true;
        }
        if (!localeIdSubtag.isExtensionSingleton()) {
            return false;
        }
        if (z10) {
            throw new JSRangeErrorException(String.format("Extension singletons in transformed extension language tag: %s", charSequence));
        }
        parseExtensions(charSequence, localeIdSubtag, localeIdTokenizer, parsedLocaleIdentifier);
        return true;
    }

    public static void parseExtensions(CharSequence charSequence, LocaleIdTokenizer.LocaleIdSubtag localeIdSubtag, LocaleIdTokenizer localeIdTokenizer, ParsedLocaleIdentifier parsedLocaleIdentifier) {
        if (!localeIdTokenizer.hasMoreSubtags()) {
            throw new JSRangeErrorException("Extension sequence expected.");
        }
        char charAt = localeIdSubtag.toString().charAt(0);
        if (charAt == 'u') {
            parseUnicodeExtensions(charSequence, localeIdTokenizer, parsedLocaleIdentifier);
            return;
        }
        if (charAt == 't') {
            parseTransformedExtensions(charSequence, localeIdTokenizer, parsedLocaleIdentifier);
        } else if (charAt == 'x') {
            parsePrivateUseExtensions(charSequence, localeIdTokenizer, parsedLocaleIdentifier);
        } else {
            parseOtherExtensions(charSequence, localeIdTokenizer, parsedLocaleIdentifier, charAt);
        }
    }

    public static void parseLanguageId(CharSequence charSequence, LocaleIdTokenizer localeIdTokenizer, LocaleIdTokenizer.LocaleIdSubtag localeIdSubtag, boolean z10, ParsedLocaleIdentifier parsedLocaleIdentifier) {
        ParsedLocaleIdentifier.ParsedLanguageIdentifier parsedLanguageIdentifier = new ParsedLocaleIdentifier.ParsedLanguageIdentifier();
        if (z10) {
            parsedLocaleIdentifier.transformedLanguageIdentifier = parsedLanguageIdentifier;
        } else {
            parsedLocaleIdentifier.languageIdentifier = parsedLanguageIdentifier;
        }
        try {
            if (!localeIdSubtag.isUnicodeLanguageSubtag()) {
                throw new JSRangeErrorException(String.format("Language subtag expected at %s: %s", localeIdSubtag.toString(), charSequence));
            }
            parsedLanguageIdentifier.languageSubtag = localeIdSubtag.toLowerString();
            if (localeIdTokenizer.hasMoreSubtags()) {
                LocaleIdTokenizer.LocaleIdSubtag nextSubtag = localeIdTokenizer.nextSubtag();
                if (handleExtensions(charSequence, localeIdTokenizer, nextSubtag, z10, parsedLocaleIdentifier)) {
                    return;
                }
                if (nextSubtag.isUnicodeScriptSubtag()) {
                    parsedLanguageIdentifier.scriptSubtag = nextSubtag.toTitleString();
                    if (!localeIdTokenizer.hasMoreSubtags()) {
                        return;
                    } else {
                        nextSubtag = localeIdTokenizer.nextSubtag();
                    }
                }
                if (nextSubtag.isUnicodeRegionSubtag()) {
                    parsedLanguageIdentifier.regionSubtag = nextSubtag.toUpperString();
                    if (!localeIdTokenizer.hasMoreSubtags()) {
                        return;
                    } else {
                        nextSubtag = localeIdTokenizer.nextSubtag();
                    }
                }
                while (!handleExtensions(charSequence, localeIdTokenizer, nextSubtag, z10, parsedLocaleIdentifier)) {
                    if (!nextSubtag.isUnicodeVariantSubtag()) {
                        throw new JSRangeErrorException(String.format("Unknown token [%s] found in locale id: %s", nextSubtag.toString(), charSequence));
                    }
                    addVariantSubtag(nextSubtag.toString(), parsedLanguageIdentifier);
                    if (!localeIdTokenizer.hasMoreSubtags()) {
                        return;
                    } else {
                        nextSubtag = localeIdTokenizer.nextSubtag();
                    }
                }
            }
        } catch (LocaleIdTokenizer.LocaleIdSubtagIterationFailed unused) {
            throw new JSRangeErrorException(String.format("Locale Identifier subtag iteration failed: %s", charSequence));
        }
    }

    public static ParsedLocaleIdentifier parseLocaleId(String str, LocaleIdTokenizer localeIdTokenizer) {
        ParsedLocaleIdentifier parsedLocaleIdentifier = new ParsedLocaleIdentifier();
        try {
            if (!localeIdTokenizer.hasMoreSubtags()) {
                throw new JSRangeErrorException(String.format("Language subtag not found: %s", str));
            }
            parseLanguageId(str, localeIdTokenizer, localeIdTokenizer.nextSubtag(), false, parsedLocaleIdentifier);
            return parsedLocaleIdentifier;
        } catch (LocaleIdTokenizer.LocaleIdSubtagIterationFailed unused) {
            throw new JSRangeErrorException(String.format("Locale Identifier subtag iteration failed: %s", str));
        }
    }

    public static void parseOtherExtensions(CharSequence charSequence, LocaleIdTokenizer localeIdTokenizer, ParsedLocaleIdentifier parsedLocaleIdentifier, char c10) {
        if (!localeIdTokenizer.hasMoreSubtags()) {
            throw new JSRangeErrorException("Extension sequence expected.");
        }
        LocaleIdTokenizer.LocaleIdSubtag nextSubtag = localeIdTokenizer.nextSubtag();
        if (parsedLocaleIdentifier.otherExtensionsMap == null) {
            parsedLocaleIdentifier.otherExtensionsMap = new TreeMap<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        parsedLocaleIdentifier.otherExtensionsMap.put(Character.valueOf(c10), arrayList);
        while (nextSubtag.isOtherExtension()) {
            arrayList.add(nextSubtag.toString());
            if (!localeIdTokenizer.hasMoreSubtags()) {
                return;
            } else {
                nextSubtag = localeIdTokenizer.nextSubtag();
            }
        }
        if (!nextSubtag.isExtensionSingleton()) {
            throw new JSRangeErrorException("Malformed sequence expected.");
        }
        parseExtensions(charSequence, nextSubtag, localeIdTokenizer, parsedLocaleIdentifier);
    }

    public static void parsePrivateUseExtensions(CharSequence charSequence, LocaleIdTokenizer localeIdTokenizer, ParsedLocaleIdentifier parsedLocaleIdentifier) {
        if (!localeIdTokenizer.hasMoreSubtags()) {
            throw new JSRangeErrorException("Extension sequence expected.");
        }
        LocaleIdTokenizer.LocaleIdSubtag nextSubtag = localeIdTokenizer.nextSubtag();
        if (parsedLocaleIdentifier.puExtensions == null) {
            parsedLocaleIdentifier.puExtensions = new ArrayList<>();
        }
        while (nextSubtag.isPrivateUseExtension()) {
            parsedLocaleIdentifier.puExtensions.add(nextSubtag.toString());
            if (!localeIdTokenizer.hasMoreSubtags()) {
                return;
            } else {
                nextSubtag = localeIdTokenizer.nextSubtag();
            }
        }
        throw new JSRangeErrorException("Tokens are not expected after pu extension.");
    }

    public static void parseTransformedExtensionFields(CharSequence charSequence, LocaleIdTokenizer localeIdTokenizer, LocaleIdTokenizer.LocaleIdSubtag localeIdSubtag, ParsedLocaleIdentifier parsedLocaleIdentifier) {
        if (localeIdSubtag.isTranformedExtensionTKey()) {
            TreeMap<String, ArrayList<String>> treeMap = parsedLocaleIdentifier.transformedExtensionFields;
            if (treeMap != null) {
                throw new JSRangeErrorException(String.format("Duplicate transformed extension sequence in [%s]", charSequence));
            }
            if (treeMap == null) {
                parsedLocaleIdentifier.transformedExtensionFields = new TreeMap<>();
            }
            do {
                String localeIdSubtag2 = localeIdSubtag.toString();
                ArrayList<String> arrayList = new ArrayList<>();
                parsedLocaleIdentifier.transformedExtensionFields.put(localeIdSubtag2, arrayList);
                if (!localeIdTokenizer.hasMoreSubtags()) {
                    throw new JSRangeErrorException(String.format("Malformated transformed key in : %s", charSequence));
                }
                localeIdSubtag = localeIdTokenizer.nextSubtag();
                while (localeIdSubtag.isTranformedExtensionTValueItem()) {
                    arrayList.add(localeIdSubtag.toString());
                    if (!localeIdTokenizer.hasMoreSubtags()) {
                        return;
                    } else {
                        localeIdSubtag = localeIdTokenizer.nextSubtag();
                    }
                }
            } while (localeIdSubtag.isTranformedExtensionTKey());
        }
        if (!localeIdSubtag.isExtensionSingleton()) {
            throw new JSRangeErrorException("Malformed extension sequence.");
        }
        parseExtensions(charSequence, localeIdSubtag, localeIdTokenizer, parsedLocaleIdentifier);
    }

    public static void parseTransformedExtensions(CharSequence charSequence, LocaleIdTokenizer localeIdTokenizer, ParsedLocaleIdentifier parsedLocaleIdentifier) {
        if (!localeIdTokenizer.hasMoreSubtags()) {
            throw new JSRangeErrorException("Extension sequence expected.");
        }
        LocaleIdTokenizer.LocaleIdSubtag nextSubtag = localeIdTokenizer.nextSubtag();
        if (nextSubtag.isUnicodeLanguageSubtag()) {
            parseLanguageId(charSequence, localeIdTokenizer, nextSubtag, true, parsedLocaleIdentifier);
        } else {
            if (!nextSubtag.isTranformedExtensionTKey()) {
                throw new JSRangeErrorException(String.format("Unexpected token [%s] in transformed extension sequence [%s]", nextSubtag.toString(), charSequence));
            }
            parseTransformedExtensionFields(charSequence, localeIdTokenizer, nextSubtag, parsedLocaleIdentifier);
        }
    }

    public static void parseUnicodeExtensions(CharSequence charSequence, LocaleIdTokenizer localeIdTokenizer, ParsedLocaleIdentifier parsedLocaleIdentifier) {
        if (!localeIdTokenizer.hasMoreSubtags()) {
            throw new JSRangeErrorException("Extension sequence expected.");
        }
        LocaleIdTokenizer.LocaleIdSubtag nextSubtag = localeIdTokenizer.nextSubtag();
        if (parsedLocaleIdentifier.unicodeExtensionAttributes != null || parsedLocaleIdentifier.unicodeExtensionKeywords != null) {
            throw new JSRangeErrorException(String.format("Duplicate unicode extension sequence in [%s]", charSequence));
        }
        while (nextSubtag.isUnicodeExtensionAttribute()) {
            if (parsedLocaleIdentifier.unicodeExtensionAttributes == null) {
                parsedLocaleIdentifier.unicodeExtensionAttributes = new ArrayList<>();
            }
            parsedLocaleIdentifier.unicodeExtensionAttributes.add(nextSubtag.toString());
            if (!localeIdTokenizer.hasMoreSubtags()) {
                return;
            } else {
                nextSubtag = localeIdTokenizer.nextSubtag();
            }
        }
        if (nextSubtag.isUnicodeExtensionKey()) {
            if (parsedLocaleIdentifier.unicodeExtensionKeywords == null) {
                parsedLocaleIdentifier.unicodeExtensionKeywords = new TreeMap<>();
            }
            do {
                String localeIdSubtag = nextSubtag.toString();
                ArrayList<String> arrayList = new ArrayList<>();
                parsedLocaleIdentifier.unicodeExtensionKeywords.put(localeIdSubtag, arrayList);
                if (!localeIdTokenizer.hasMoreSubtags()) {
                    return;
                }
                nextSubtag = localeIdTokenizer.nextSubtag();
                while (nextSubtag.isUnicodeExtensionKeyTypeItem()) {
                    arrayList.add(nextSubtag.toString());
                    if (!localeIdTokenizer.hasMoreSubtags()) {
                        return;
                    } else {
                        nextSubtag = localeIdTokenizer.nextSubtag();
                    }
                }
            } while (nextSubtag.isUnicodeExtensionKey());
        }
        if (!nextSubtag.isExtensionSingleton()) {
            throw new JSRangeErrorException("Malformed sequence expected.");
        }
        parseExtensions(charSequence, nextSubtag, localeIdTokenizer, parsedLocaleIdentifier);
    }

    public static void replaceLanguageSubtagIfNeeded(StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        if (LanguageTagsGenerated.languageAliasKeys2 == null) {
            return;
        }
        if (stringBuffer.length() == 2) {
            strArr = LanguageTagsGenerated.languageAliasKeys2;
            strArr2 = LanguageTagsGenerated.languageAliasReplacements2;
            strArr3 = LanguageTagsGenerated.complexLanguageAliasKeys2;
            strArr4 = LanguageTagsGenerated.complexLanguageAliasReplacementsLanguage2;
            strArr5 = LanguageTagsGenerated.complexLanguageAliasReplacementsScript2;
            strArr6 = LanguageTagsGenerated.complexLanguageAliasReplacementsRegion2;
        } else {
            strArr = LanguageTagsGenerated.languageAliasKeys3;
            strArr2 = LanguageTagsGenerated.languageAliasReplacements3;
            strArr3 = LanguageTagsGenerated.complexLanguageAliasKeys3;
            strArr4 = LanguageTagsGenerated.complexLanguageAliasReplacementsLanguage3;
            strArr5 = LanguageTagsGenerated.complexLanguageAliasReplacementsScript3;
            strArr6 = LanguageTagsGenerated.complexLanguageAliasReplacementsRegion3;
        }
        int binarySearch = Arrays.binarySearch(strArr, stringBuffer.toString());
        if (binarySearch >= 0) {
            stringBuffer.delete(0, stringBuffer.length());
            stringBuffer.append(strArr2[binarySearch]);
            return;
        }
        int binarySearch2 = Arrays.binarySearch(strArr3, stringBuffer.toString());
        if (binarySearch2 >= 0) {
            String str = strArr4[binarySearch2];
            String str2 = strArr5[binarySearch2];
            String str3 = strArr6[binarySearch2];
            stringBuffer.delete(0, stringBuffer.length());
            stringBuffer.append(str);
            if (stringBuffer2.length() == 0 && str2 != null) {
                stringBuffer2.append(str2);
            }
            if (stringBuffer3.length() != 0 || str3 == null) {
                return;
            }
            stringBuffer3.append(str3);
        }
    }

    public static String replaceRegionSubtagIfNeeded(StringBuffer stringBuffer) {
        if (LanguageTagsGenerated.regionAliasKeys2 == null) {
            return stringBuffer.toString();
        }
        if (stringBuffer.length() == 2) {
            int binarySearch = Arrays.binarySearch(LanguageTagsGenerated.regionAliasKeys2, stringBuffer.toString());
            return binarySearch >= 0 ? LanguageTagsGenerated.regionAliasReplacements2[binarySearch] : stringBuffer.toString();
        }
        int binarySearch2 = Arrays.binarySearch(LanguageTagsGenerated.regionAliasKeys3, stringBuffer.toString());
        return binarySearch2 >= 0 ? LanguageTagsGenerated.regionAliasReplacements3[binarySearch2] : stringBuffer.toString();
    }

    public static ParsedLocaleIdentifier parseLocaleId(String str) {
        int binarySearch;
        String[] strArr = LanguageTagsGenerated.regularGrandfatheredKeys;
        if (strArr != null && (binarySearch = Arrays.binarySearch(strArr, str.toString())) >= 0) {
            str = LanguageTagsGenerated.regularGrandfatheredReplacements[binarySearch];
        }
        String lowerCase = str.toLowerCase();
        return parseLocaleId(lowerCase, new LocaleIdTokenizer(lowerCase));
    }
}
