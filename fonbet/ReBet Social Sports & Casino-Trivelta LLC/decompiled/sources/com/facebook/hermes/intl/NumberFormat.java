package com.facebook.hermes.intl;

import com.facebook.hermes.intl.IPlatformNumberFormatter;
import com.facebook.hermes.intl.OptionHelpers;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.twilio.voice.EventKeys;
import h8.InterfaceC4488a;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@InterfaceC4488a
/* loaded from: classes2.dex */
public class NumberFormat {
    private static String[] s_sanctionedSimpleUnitIdentifiers = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};
    private IPlatformNumberFormatter.CompactDisplay mResolvedCompactDisplay;
    private IPlatformNumberFormatter.Style mResolvedStyle;
    private IPlatformNumberFormatter.UnitDisplay mResolvedUnitDisplay;
    private IPlatformNumberFormatter.RoundingType mRoundingType;
    private boolean mUseDefaultNumberSystem;
    private String mResolvedCurrency = null;
    private IPlatformNumberFormatter.CurrencyDisplay mResolvedCurrencyDisplay = IPlatformNumberFormatter.CurrencyDisplay.SYMBOL;
    private IPlatformNumberFormatter.CurrencySign mResolvedCurrencySign = IPlatformNumberFormatter.CurrencySign.STANDARD;
    private String mResolvedUnit = null;
    private boolean mGroupingUsed = true;
    private int mResolvedMinimumIntegerDigits = -1;
    private int mResolvedMinimumFractionDigits = -1;
    private int mResolvedMaximumFractionDigits = -1;
    private int mResolvedMinimumSignificantDigits = -1;
    private int mResolvedMaximumSignificantDigits = -1;
    private IPlatformNumberFormatter.SignDisplay mResolvedSignDisplay = IPlatformNumberFormatter.SignDisplay.AUTO;
    private String mResolvedNumberingSystem = null;
    private IPlatformNumberFormatter.Notation mResolvedNotation = null;
    private ILocaleObject<?> mResolvedLocaleObject = null;
    private ILocaleObject<?> mResolvedLocaleObjectForResolvedOptions = null;
    private IPlatformNumberFormatter mPlatformNumberFormatter = new PlatformNumberFormatterICU();

    @InterfaceC4488a
    public NumberFormat(List<String> list, Map<String, Object> map) {
        initializeNumberFormat(list, map);
        this.mPlatformNumberFormatter.configure(this.mResolvedLocaleObject, this.mUseDefaultNumberSystem ? "" : this.mResolvedNumberingSystem, this.mResolvedStyle, this.mResolvedCurrencySign, this.mResolvedNotation, this.mResolvedCompactDisplay).setCurrency(this.mResolvedCurrency, this.mResolvedCurrencyDisplay).setGrouping(this.mGroupingUsed).setMinIntergerDigits(this.mResolvedMinimumIntegerDigits).setSignificantDigits(this.mRoundingType, this.mResolvedMinimumSignificantDigits, this.mResolvedMaximumSignificantDigits).setFractionDigits(this.mRoundingType, this.mResolvedMinimumFractionDigits, this.mResolvedMaximumFractionDigits).setSignDisplay(this.mResolvedSignDisplay).setUnits(this.mResolvedUnit, this.mResolvedUnitDisplay);
    }

    private void initializeNumberFormat(List<String> list, Map<String, Object> map) {
        Object newNumber;
        Object newNumber2;
        Object newObject = JSObjects.newObject();
        OptionHelpers.OptionType optionType = OptionHelpers.OptionType.STRING;
        JSObjects.Put(newObject, Constants.LOCALEMATCHER, OptionHelpers.GetOption(map, Constants.LOCALEMATCHER, optionType, Constants.LOCALEMATCHER_POSSIBLE_VALUES, Constants.LOCALEMATCHER_BESTFIT));
        Object GetOption = OptionHelpers.GetOption(map, "numberingSystem", optionType, JSObjects.Undefined(), JSObjects.Undefined());
        if (!JSObjects.isUndefined(GetOption) && !isLocaleIdType(JSObjects.getJavaString(GetOption))) {
            throw new JSRangeErrorException("Invalid numbering system !");
        }
        JSObjects.Put(newObject, "nu", GetOption);
        HashMap<String, Object> resolveLocale = LocaleResolver.resolveLocale(list, newObject, Collections.singletonList("nu"));
        ILocaleObject<?> iLocaleObject = (ILocaleObject) JSObjects.getJavaMap(resolveLocale).get(Constants.LOCALE);
        this.mResolvedLocaleObject = iLocaleObject;
        this.mResolvedLocaleObjectForResolvedOptions = iLocaleObject.cloneObject();
        Object Get = JSObjects.Get(resolveLocale, "nu");
        if (JSObjects.isNull(Get)) {
            this.mUseDefaultNumberSystem = true;
            this.mResolvedNumberingSystem = this.mPlatformNumberFormatter.getDefaultNumberingSystem(this.mResolvedLocaleObject);
        } else {
            this.mUseDefaultNumberSystem = false;
            this.mResolvedNumberingSystem = JSObjects.getJavaString(Get);
        }
        setNumberFormatUnitOptions(map);
        if (this.mResolvedStyle == IPlatformNumberFormatter.Style.CURRENCY) {
            double currencyDigits = PlatformNumberFormatterICU.getCurrencyDigits(this.mResolvedCurrency);
            newNumber = JSObjects.newNumber(currencyDigits);
            newNumber2 = JSObjects.newNumber(currencyDigits);
        } else {
            newNumber = JSObjects.newNumber(0.0d);
            newNumber2 = this.mResolvedStyle == IPlatformNumberFormatter.Style.PERCENT ? JSObjects.newNumber(0.0d) : JSObjects.newNumber(3.0d);
        }
        this.mResolvedNotation = (IPlatformNumberFormatter.Notation) OptionHelpers.searchEnum(IPlatformNumberFormatter.Notation.class, JSObjects.getJavaString(OptionHelpers.GetOption(map, "notation", optionType, new String[]{Constants.COLLATION_STANDARD, "scientific", "engineering", "compact"}, Constants.COLLATION_STANDARD)));
        setNumberFormatDigitOptions(map, newNumber, newNumber2);
        Object GetOption2 = OptionHelpers.GetOption(map, "compactDisplay", optionType, new String[]{"short", "long"}, "short");
        if (this.mResolvedNotation == IPlatformNumberFormatter.Notation.COMPACT) {
            this.mResolvedCompactDisplay = (IPlatformNumberFormatter.CompactDisplay) OptionHelpers.searchEnum(IPlatformNumberFormatter.CompactDisplay.class, JSObjects.getJavaString(GetOption2));
        }
        this.mGroupingUsed = JSObjects.getJavaBoolean(OptionHelpers.GetOption(map, "useGrouping", OptionHelpers.OptionType.BOOLEAN, JSObjects.Undefined(), JSObjects.newBoolean(true)));
        this.mResolvedSignDisplay = (IPlatformNumberFormatter.SignDisplay) OptionHelpers.searchEnum(IPlatformNumberFormatter.SignDisplay.class, JSObjects.getJavaString(OptionHelpers.GetOption(map, "signDisplay", optionType, new String[]{"auto", ReactScrollViewHelper.OVER_SCROLL_NEVER, ReactScrollViewHelper.OVER_SCROLL_ALWAYS, "exceptZero"}, "auto")));
    }

    private boolean isLocaleIdType(String str) {
        return IntlTextUtils.isUnicodeExtensionKeyTypeItem(str, 0, str.length() - 1);
    }

    private boolean isSanctionedSimpleUnitIdentifier(String str) {
        return Arrays.binarySearch(s_sanctionedSimpleUnitIdentifiers, str) >= 0;
    }

    private boolean isWellFormedCurrencyCode(String str) {
        return normalizeCurrencyCode(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    private boolean isWellFormedUnitIdentifier(String str) {
        if (isSanctionedSimpleUnitIdentifier(str)) {
            return true;
        }
        int indexOf = str.indexOf("-per-");
        return indexOf >= 0 && str.indexOf("-per-", indexOf + 1) < 0 && isSanctionedSimpleUnitIdentifier(str.substring(0, indexOf)) && isSanctionedSimpleUnitIdentifier(str.substring(indexOf + 5));
    }

    private String normalizeCurrencyCode(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < 'a' || charAt > 'z') {
                sb2.append(charAt);
            } else {
                sb2.append((char) (charAt - ' '));
            }
        }
        return sb2.toString();
    }

    private void setNumberFormatDigitOptions(Map<String, Object> map, Object obj, Object obj2) {
        Object GetNumberOption = OptionHelpers.GetNumberOption(map, "minimumIntegerDigits", JSObjects.newNumber(1.0d), JSObjects.newNumber(21.0d), JSObjects.newNumber(1.0d));
        Object Get = JSObjects.Get(map, "minimumFractionDigits");
        Object Get2 = JSObjects.Get(map, "maximumFractionDigits");
        Object Get3 = JSObjects.Get(map, "minimumSignificantDigits");
        Object Get4 = JSObjects.Get(map, "maximumSignificantDigits");
        this.mResolvedMinimumIntegerDigits = (int) Math.floor(JSObjects.getJavaDouble(GetNumberOption));
        if (!JSObjects.isUndefined(Get3) || !JSObjects.isUndefined(Get4)) {
            this.mRoundingType = IPlatformNumberFormatter.RoundingType.SIGNIFICANT_DIGITS;
            Object DefaultNumberOption = OptionHelpers.DefaultNumberOption("minimumSignificantDigits", Get3, JSObjects.newNumber(1.0d), JSObjects.newNumber(21.0d), JSObjects.newNumber(1.0d));
            Object DefaultNumberOption2 = OptionHelpers.DefaultNumberOption("maximumSignificantDigits", Get4, DefaultNumberOption, JSObjects.newNumber(21.0d), JSObjects.newNumber(21.0d));
            this.mResolvedMinimumSignificantDigits = (int) Math.floor(JSObjects.getJavaDouble(DefaultNumberOption));
            this.mResolvedMaximumSignificantDigits = (int) Math.floor(JSObjects.getJavaDouble(DefaultNumberOption2));
            return;
        }
        if (JSObjects.isUndefined(Get) && JSObjects.isUndefined(Get2)) {
            IPlatformNumberFormatter.Notation notation = this.mResolvedNotation;
            if (notation == IPlatformNumberFormatter.Notation.COMPACT) {
                this.mRoundingType = IPlatformNumberFormatter.RoundingType.COMPACT_ROUNDING;
                return;
            }
            if (notation == IPlatformNumberFormatter.Notation.ENGINEERING) {
                this.mRoundingType = IPlatformNumberFormatter.RoundingType.FRACTION_DIGITS;
                this.mResolvedMaximumFractionDigits = 5;
                return;
            } else {
                this.mRoundingType = IPlatformNumberFormatter.RoundingType.FRACTION_DIGITS;
                this.mResolvedMinimumFractionDigits = (int) Math.floor(JSObjects.getJavaDouble(obj));
                this.mResolvedMaximumFractionDigits = (int) Math.floor(JSObjects.getJavaDouble(obj2));
                return;
            }
        }
        this.mRoundingType = IPlatformNumberFormatter.RoundingType.FRACTION_DIGITS;
        Object DefaultNumberOption3 = OptionHelpers.DefaultNumberOption("minimumFractionDigits", Get, JSObjects.newNumber(0.0d), JSObjects.newNumber(20.0d), JSObjects.Undefined());
        Object DefaultNumberOption4 = OptionHelpers.DefaultNumberOption("maximumFractionDigits", Get2, JSObjects.newNumber(0.0d), JSObjects.newNumber(20.0d), JSObjects.Undefined());
        if (JSObjects.isUndefined(DefaultNumberOption3)) {
            DefaultNumberOption3 = JSObjects.newNumber(Math.min(JSObjects.getJavaDouble(obj), JSObjects.getJavaDouble(DefaultNumberOption4)));
        } else if (JSObjects.isUndefined(DefaultNumberOption4)) {
            DefaultNumberOption4 = JSObjects.newNumber(Math.max(JSObjects.getJavaDouble(obj2), JSObjects.getJavaDouble(DefaultNumberOption3)));
        } else if (JSObjects.getJavaDouble(DefaultNumberOption3) > JSObjects.getJavaDouble(DefaultNumberOption4)) {
            throw new JSRangeErrorException("minimumFractionDigits is greater than maximumFractionDigits");
        }
        this.mResolvedMinimumFractionDigits = (int) Math.floor(JSObjects.getJavaDouble(DefaultNumberOption3));
        this.mResolvedMaximumFractionDigits = (int) Math.floor(JSObjects.getJavaDouble(DefaultNumberOption4));
    }

    private void setNumberFormatUnitOptions(Map<String, Object> map) {
        OptionHelpers.OptionType optionType = OptionHelpers.OptionType.STRING;
        this.mResolvedStyle = (IPlatformNumberFormatter.Style) OptionHelpers.searchEnum(IPlatformNumberFormatter.Style.class, JSObjects.getJavaString(OptionHelpers.GetOption(map, "style", optionType, new String[]{"decimal", "percent", "currency", "unit"}, "decimal")));
        Object GetOption = OptionHelpers.GetOption(map, "currency", optionType, JSObjects.Undefined(), JSObjects.Undefined());
        if (JSObjects.isUndefined(GetOption)) {
            if (this.mResolvedStyle == IPlatformNumberFormatter.Style.CURRENCY) {
                throw new JSRangeErrorException("Expected currency style !");
            }
        } else if (!isWellFormedCurrencyCode(JSObjects.getJavaString(GetOption))) {
            throw new JSRangeErrorException("Malformed currency code !");
        }
        Object GetOption2 = OptionHelpers.GetOption(map, "currencyDisplay", optionType, new String[]{"symbol", "narrowSymbol", EventKeys.ERROR_CODE, "name"}, "symbol");
        Object GetOption3 = OptionHelpers.GetOption(map, "currencySign", optionType, new String[]{"accounting", Constants.COLLATION_STANDARD}, Constants.COLLATION_STANDARD);
        Object GetOption4 = OptionHelpers.GetOption(map, "unit", optionType, JSObjects.Undefined(), JSObjects.Undefined());
        if (JSObjects.isUndefined(GetOption4)) {
            if (this.mResolvedStyle == IPlatformNumberFormatter.Style.UNIT) {
                throw new JSRangeErrorException("Expected unit !");
            }
        } else if (!isWellFormedUnitIdentifier(JSObjects.getJavaString(GetOption4))) {
            throw new JSRangeErrorException("Malformed unit identifier !");
        }
        Object GetOption5 = OptionHelpers.GetOption(map, "unitDisplay", optionType, new String[]{"long", "short", "narrow"}, "short");
        IPlatformNumberFormatter.Style style = this.mResolvedStyle;
        if (style == IPlatformNumberFormatter.Style.CURRENCY) {
            this.mResolvedCurrency = normalizeCurrencyCode(JSObjects.getJavaString(GetOption));
            this.mResolvedCurrencyDisplay = (IPlatformNumberFormatter.CurrencyDisplay) OptionHelpers.searchEnum(IPlatformNumberFormatter.CurrencyDisplay.class, JSObjects.getJavaString(GetOption2));
            this.mResolvedCurrencySign = (IPlatformNumberFormatter.CurrencySign) OptionHelpers.searchEnum(IPlatformNumberFormatter.CurrencySign.class, JSObjects.getJavaString(GetOption3));
        } else if (style == IPlatformNumberFormatter.Style.UNIT) {
            this.mResolvedUnit = JSObjects.getJavaString(GetOption4);
            this.mResolvedUnitDisplay = (IPlatformNumberFormatter.UnitDisplay) OptionHelpers.searchEnum(IPlatformNumberFormatter.UnitDisplay.class, JSObjects.getJavaString(GetOption5));
        }
    }

    @InterfaceC4488a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String javaString = JSObjects.getJavaString(OptionHelpers.GetOption(map, Constants.LOCALEMATCHER, OptionHelpers.OptionType.STRING, Constants.LOCALEMATCHER_POSSIBLE_VALUES, Constants.LOCALEMATCHER_BESTFIT));
        String[] strArr = new String[list.size()];
        return javaString.equals(Constants.LOCALEMATCHER_BESTFIT) ? Arrays.asList(LocaleMatcher.bestFitSupportedLocales((String[]) list.toArray(strArr))) : Arrays.asList(LocaleMatcher.lookupSupportedLocales((String[]) list.toArray(strArr)));
    }

    @InterfaceC4488a
    public String format(double d10) {
        return this.mPlatformNumberFormatter.format(d10);
    }

    @InterfaceC4488a
    public List<Map<String, String>> formatToParts(double d10) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator formatToParts = this.mPlatformNumberFormatter.formatToParts(d10);
        StringBuilder sb2 = new StringBuilder();
        for (char first = formatToParts.first(); first != 65535; first = formatToParts.next()) {
            sb2.append(first);
            if (formatToParts.getIndex() + 1 == formatToParts.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = formatToParts.getAttributes().keySet().iterator();
                String fieldToString = it.hasNext() ? this.mPlatformNumberFormatter.fieldToString(it.next(), d10) : "literal";
                String sb3 = sb2.toString();
                sb2.setLength(0);
                HashMap hashMap = new HashMap();
                hashMap.put("type", fieldToString);
                hashMap.put(EventKeys.VALUE_KEY, sb3);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    @InterfaceC4488a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Constants.LOCALE, this.mResolvedLocaleObjectForResolvedOptions.toCanonicalTag());
        linkedHashMap.put("numberingSystem", this.mResolvedNumberingSystem);
        linkedHashMap.put("style", this.mResolvedStyle.toString());
        IPlatformNumberFormatter.Style style = this.mResolvedStyle;
        if (style == IPlatformNumberFormatter.Style.CURRENCY) {
            linkedHashMap.put("currency", this.mResolvedCurrency);
            linkedHashMap.put("currencyDisplay", this.mResolvedCurrencyDisplay.toString());
            linkedHashMap.put("currencySign", this.mResolvedCurrencySign.toString());
        } else if (style == IPlatformNumberFormatter.Style.UNIT) {
            linkedHashMap.put("unit", this.mResolvedUnit);
            linkedHashMap.put("unitDisplay", this.mResolvedUnitDisplay.toString());
        }
        int i10 = this.mResolvedMinimumIntegerDigits;
        if (i10 != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i10));
        }
        IPlatformNumberFormatter.RoundingType roundingType = this.mRoundingType;
        if (roundingType == IPlatformNumberFormatter.RoundingType.SIGNIFICANT_DIGITS) {
            int i11 = this.mResolvedMaximumSignificantDigits;
            if (i11 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i11));
            }
            int i12 = this.mResolvedMinimumSignificantDigits;
            if (i12 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i12));
            }
        } else if (roundingType == IPlatformNumberFormatter.RoundingType.FRACTION_DIGITS) {
            int i13 = this.mResolvedMinimumFractionDigits;
            if (i13 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i13));
            }
            int i14 = this.mResolvedMaximumFractionDigits;
            if (i14 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i14));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.mGroupingUsed));
        linkedHashMap.put("notation", this.mResolvedNotation.toString());
        if (this.mResolvedNotation == IPlatformNumberFormatter.Notation.COMPACT) {
            linkedHashMap.put("compactDisplay", this.mResolvedCompactDisplay.toString());
        }
        linkedHashMap.put("signDisplay", this.mResolvedSignDisplay.toString());
        return linkedHashMap;
    }
}
