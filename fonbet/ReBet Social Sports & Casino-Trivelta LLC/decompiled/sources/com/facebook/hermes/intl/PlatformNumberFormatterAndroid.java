package com.facebook.hermes.intl;

import com.facebook.hermes.intl.IPlatformNumberFormatter;
import java.math.RoundingMode;
import java.text.AttributedCharacterIterator;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;

/* loaded from: classes2.dex */
public class PlatformNumberFormatterAndroid implements IPlatformNumberFormatter {
    private DecimalFormat mDecimalFormat;
    private Format mFinalFormat;
    private LocaleObjectAndroid mLocaleObject;
    private IPlatformNumberFormatter.Style mStyle;

    /* renamed from: com.facebook.hermes.intl.PlatformNumberFormatterAndroid$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$hermes$intl$IPlatformNumberFormatter$CurrencyDisplay;

        static {
            int[] iArr = new int[IPlatformNumberFormatter.CurrencyDisplay.values().length];
            $SwitchMap$com$facebook$hermes$intl$IPlatformNumberFormatter$CurrencyDisplay = iArr;
            try {
                iArr[IPlatformNumberFormatter.CurrencyDisplay.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformNumberFormatter$CurrencyDisplay[IPlatformNumberFormatter.CurrencyDisplay.CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformNumberFormatter$CurrencyDisplay[IPlatformNumberFormatter.CurrencyDisplay.SYMBOL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformNumberFormatter$CurrencyDisplay[IPlatformNumberFormatter.CurrencyDisplay.NARROWSYMBOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static int getCurrencyDigits(String str) {
        try {
            return Currency.getInstance(str).getDefaultFractionDigits();
        } catch (IllegalArgumentException unused) {
            throw new JSRangeErrorException("Invalid currency code !");
        }
    }

    private void initialize(DecimalFormat decimalFormat, ILocaleObject<?> iLocaleObject, IPlatformNumberFormatter.Style style) {
        this.mDecimalFormat = decimalFormat;
        this.mFinalFormat = decimalFormat;
        this.mLocaleObject = (LocaleObjectAndroid) iLocaleObject;
        this.mStyle = style;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public /* bridge */ /* synthetic */ IPlatformNumberFormatter configure(ILocaleObject iLocaleObject, String str, IPlatformNumberFormatter.Style style, IPlatformNumberFormatter.CurrencySign currencySign, IPlatformNumberFormatter.Notation notation, IPlatformNumberFormatter.CompactDisplay compactDisplay) {
        return configure((ILocaleObject<?>) iLocaleObject, str, style, currencySign, notation, compactDisplay);
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public String fieldToString(AttributedCharacterIterator.Attribute attribute, double d10) {
        return "literal";
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public String format(double d10) {
        return this.mFinalFormat.format(Double.valueOf(d10));
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public AttributedCharacterIterator formatToParts(double d10) {
        return this.mFinalFormat.formatToCharacterIterator(Double.valueOf(d10));
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public String[] getAvailableLocales() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : java.text.NumberFormat.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public String getDefaultNumberingSystem(ILocaleObject<?> iLocaleObject) {
        return "latn";
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public PlatformNumberFormatterAndroid setSignificantDigits(IPlatformNumberFormatter.RoundingType roundingType, int i10, int i11) {
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public PlatformNumberFormatterAndroid setUnits(String str, IPlatformNumberFormatter.UnitDisplay unitDisplay) {
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public PlatformNumberFormatterAndroid configure(ILocaleObject<?> iLocaleObject, String str, IPlatformNumberFormatter.Style style, IPlatformNumberFormatter.CurrencySign currencySign, IPlatformNumberFormatter.Notation notation, IPlatformNumberFormatter.CompactDisplay compactDisplay) {
        java.text.NumberFormat numberFormat = java.text.NumberFormat.getInstance((Locale) iLocaleObject.getLocale());
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        initialize((DecimalFormat) numberFormat, iLocaleObject, style);
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public PlatformNumberFormatterAndroid setCurrency(String str, IPlatformNumberFormatter.CurrencyDisplay currencyDisplay) {
        if (this.mStyle == IPlatformNumberFormatter.Style.CURRENCY) {
            Currency currency = Currency.getInstance(str);
            this.mDecimalFormat.setCurrency(currency);
            int i10 = AnonymousClass1.$SwitchMap$com$facebook$hermes$intl$IPlatformNumberFormatter$CurrencyDisplay[currencyDisplay.ordinal()];
            if (i10 == 1) {
                str = currency.getDisplayName(this.mLocaleObject.getLocale());
            } else if (i10 != 2) {
                str = currency.getSymbol(this.mLocaleObject.getLocale());
            }
            DecimalFormatSymbols decimalFormatSymbols = this.mDecimalFormat.getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol(str);
            this.mDecimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            this.mDecimalFormat.getDecimalFormatSymbols().setCurrencySymbol(str);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public PlatformNumberFormatterAndroid setFractionDigits(IPlatformNumberFormatter.RoundingType roundingType, int i10, int i11) {
        if (roundingType == IPlatformNumberFormatter.RoundingType.FRACTION_DIGITS) {
            if (i10 >= 0) {
                this.mDecimalFormat.setMinimumFractionDigits(i10);
            }
            if (i11 >= 0) {
                this.mDecimalFormat.setMaximumFractionDigits(i11);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public PlatformNumberFormatterAndroid setGrouping(boolean z10) {
        this.mDecimalFormat.setGroupingUsed(z10);
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public PlatformNumberFormatterAndroid setMinIntergerDigits(int i10) {
        if (i10 != -1) {
            this.mDecimalFormat.setMinimumIntegerDigits(i10);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public PlatformNumberFormatterAndroid setSignDisplay(IPlatformNumberFormatter.SignDisplay signDisplay) {
        if (signDisplay == IPlatformNumberFormatter.SignDisplay.NEVER) {
            this.mDecimalFormat.setPositivePrefix("");
            this.mDecimalFormat.setPositiveSuffix("");
            this.mDecimalFormat.setNegativePrefix("");
            this.mDecimalFormat.setNegativeSuffix("");
        }
        return this;
    }
}
