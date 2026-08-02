package ru.ozon.app.android.atoms.data.stock;

import B0.C2454a;
import D40.c;
import Kk.C3532b;
import Sc.InterfaceC3999a;
import T7.P;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001?Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010'\u001a\u00020\u0005H\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003J~\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00103J\u0006\u00104\u001a\u00020\u0005J\u0013\u00105\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\u0005HÖ\u0001J\t\u00109\u001a\u00020\tHÖ\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010!R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006@"}, d2 = {"Lru/ozon/app/android/atoms/data/stock/StockBar;", "Lru/ozon/uni/atoms/data/AtomDTO;", "theme", "Lru/ozon/app/android/atoms/data/stock/StockBar$StockBarTheme;", "percent", "", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textColor", "", "stockBarColor", "stockBarBackgroundColor", "stockBarBackgroundAlpha", "", "isFullWidth", "", "hasBorder", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/atoms/data/stock/StockBar$StockBarTheme;ILru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FZLjava/lang/Boolean;Lru/ozon/uni/atoms/data/TestInfo;)V", "getTheme", "()Lru/ozon/app/android/atoms/data/stock/StockBar$StockBarTheme;", "getPercent", "()I", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTextColor", "()Ljava/lang/String;", "getStockBarColor", "getStockBarBackgroundColor", "getStockBarBackgroundAlpha", "()F", "()Z", "getHasBorder", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lru/ozon/app/android/atoms/data/stock/StockBar$StockBarTheme;ILru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FZLjava/lang/Boolean;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/atoms/data/stock/StockBar;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "StockBarTheme", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StockBar extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<StockBar> CREATOR = new Creator();
    private final Boolean hasBorder;
    private final boolean isFullWidth;
    private final int percent;
    private final float stockBarBackgroundAlpha;
    private final String stockBarBackgroundColor;
    private final String stockBarColor;
    private final TestInfo testInfo;

    @NotNull
    private final OzonSpannableString text;
    private final String textColor;
    private final StockBarTheme theme;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<StockBar> {
        @Override // android.os.Parcelable.Creator
        public final StockBar createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean bool = null;
            StockBarTheme valueOf = parcel.readInt() == 0 ? null : StockBarTheme.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            float readFloat = parcel.readFloat();
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StockBar(valueOf, readInt, create, readString, readString2, readString3, readFloat, z11, bool, (TestInfo) parcel.readParcelable(StockBar.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StockBar[] newArray(int i11) {
            return new StockBar[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/atoms/data/stock/StockBar$StockBarTheme;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "THEME_TYPE_SMALL", "THEME_TYPE_MEDIUM", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StockBarTheme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StockBarTheme[] $VALUES;

        @NotNull
        private final String key;

        @i(name = "THEME_TYPE_SMALL")
        public static final StockBarTheme THEME_TYPE_SMALL = new StockBarTheme("THEME_TYPE_SMALL", 0, "THEME_TYPE_SMALL");

        @i(name = "THEME_TYPE_MEDIUM")
        public static final StockBarTheme THEME_TYPE_MEDIUM = new StockBarTheme("THEME_TYPE_MEDIUM", 1, "THEME_TYPE_MEDIUM");

        private static final /* synthetic */ StockBarTheme[] $values() {
            return new StockBarTheme[]{THEME_TYPE_SMALL, THEME_TYPE_MEDIUM};
        }

        static {
            StockBarTheme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private StockBarTheme(String str, int i11, String str2) {
            this.key = str2;
        }

        @NotNull
        public static a<StockBarTheme> getEntries() {
            return $ENTRIES;
        }

        public static StockBarTheme valueOf(String str) {
            return (StockBarTheme) Enum.valueOf(StockBarTheme.class, str);
        }

        public static StockBarTheme[] values() {
            return (StockBarTheme[]) $VALUES.clone();
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }
    }

    public /* synthetic */ StockBar(StockBarTheme stockBarTheme, int i11, OzonSpannableString ozonSpannableString, String str, String str2, String str3, float f7, boolean z11, Boolean bool, TestInfo testInfo, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? StockBarTheme.THEME_TYPE_MEDIUM : stockBarTheme, i11, ozonSpannableString, (i12 & 8) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue() : str, (i12 & 16) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_ACCENT_ALERT.getValue() : str2, (i12 & 32) != 0 ? StyleParser.OzColor.OZ_COLOR_GRAY_70.getValue() : str3, (i12 & 64) != 0 ? 1.0f : f7, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11, (i12 & 256) != 0 ? Boolean.FALSE : bool, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : testInfo);
    }

    public static /* synthetic */ StockBar copy$default(StockBar stockBar, StockBarTheme stockBarTheme, int i11, OzonSpannableString ozonSpannableString, String str, String str2, String str3, float f7, boolean z11, Boolean bool, TestInfo testInfo, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            stockBarTheme = stockBar.theme;
        }
        if ((i12 & 2) != 0) {
            i11 = stockBar.percent;
        }
        if ((i12 & 4) != 0) {
            ozonSpannableString = stockBar.text;
        }
        if ((i12 & 8) != 0) {
            str = stockBar.textColor;
        }
        if ((i12 & 16) != 0) {
            str2 = stockBar.stockBarColor;
        }
        if ((i12 & 32) != 0) {
            str3 = stockBar.stockBarBackgroundColor;
        }
        if ((i12 & 64) != 0) {
            f7 = stockBar.stockBarBackgroundAlpha;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z11 = stockBar.isFullWidth;
        }
        if ((i12 & 256) != 0) {
            bool = stockBar.hasBorder;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            testInfo = stockBar.testInfo;
        }
        Boolean bool2 = bool;
        TestInfo testInfo2 = testInfo;
        float f11 = f7;
        boolean z12 = z11;
        String str4 = str2;
        String str5 = str3;
        return stockBar.copy(stockBarTheme, i11, ozonSpannableString, str, str4, str5, f11, z12, bool2, testInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final StockBarTheme getTheme() {
        return this.theme;
    }

    /* renamed from: component10, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPercent() {
        return this.percent;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStockBarColor() {
        return this.stockBarColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStockBarBackgroundColor() {
        return this.stockBarBackgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final float getStockBarBackgroundAlpha() {
        return this.stockBarBackgroundAlpha;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsFullWidth() {
        return this.isFullWidth;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getHasBorder() {
        return this.hasBorder;
    }

    @NotNull
    public final StockBar copy(StockBarTheme theme, int percent, @NotNull OzonSpannableString text, String textColor, String stockBarColor, String stockBarBackgroundColor, float stockBarBackgroundAlpha, boolean isFullWidth, Boolean hasBorder, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new StockBar(theme, percent, text, textColor, stockBarColor, stockBarBackgroundColor, stockBarBackgroundAlpha, isFullWidth, hasBorder, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockBar)) {
            return false;
        }
        StockBar stockBar = (StockBar) other;
        return this.theme == stockBar.theme && this.percent == stockBar.percent && Intrinsics.d(this.text, stockBar.text) && Intrinsics.d(this.textColor, stockBar.textColor) && Intrinsics.d(this.stockBarColor, stockBar.stockBarColor) && Intrinsics.d(this.stockBarBackgroundColor, stockBar.stockBarBackgroundColor) && Float.compare(this.stockBarBackgroundAlpha, stockBar.stockBarBackgroundAlpha) == 0 && this.isFullWidth == stockBar.isFullWidth && Intrinsics.d(this.hasBorder, stockBar.hasBorder) && Intrinsics.d(this.testInfo, stockBar.testInfo);
    }

    public final Boolean getHasBorder() {
        return this.hasBorder;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_stock_bar;
    }

    public final int getPercent() {
        return this.percent;
    }

    public final float getStockBarBackgroundAlpha() {
        return this.stockBarBackgroundAlpha;
    }

    public final String getStockBarBackgroundColor() {
        return this.stockBarBackgroundColor;
    }

    public final String getStockBarColor() {
        return this.stockBarColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final OzonSpannableString getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final StockBarTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        StockBarTheme stockBarTheme = this.theme;
        int c11 = P.c(this.text, C2454a.a(this.percent, (stockBarTheme == null ? 0 : stockBarTheme.hashCode()) * 31, 31), 31);
        String str = this.textColor;
        int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stockBarColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stockBarBackgroundColor;
        int a11 = C3532b.a(Pk0.b.a(this.stockBarBackgroundAlpha, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.isFullWidth);
        Boolean bool = this.hasBorder;
        int hashCode3 = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode3 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    public final boolean isFullWidth() {
        return this.isFullWidth;
    }

    @NotNull
    public String toString() {
        StockBarTheme stockBarTheme = this.theme;
        int i11 = this.percent;
        OzonSpannableString ozonSpannableString = this.text;
        String str = this.textColor;
        String str2 = this.stockBarColor;
        String str3 = this.stockBarBackgroundColor;
        float f7 = this.stockBarBackgroundAlpha;
        boolean z11 = this.isFullWidth;
        Boolean bool = this.hasBorder;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("StockBar(theme=");
        sb2.append(stockBarTheme);
        sb2.append(", percent=");
        sb2.append(i11);
        sb2.append(", text=");
        HY.a.c(", textColor=", str, ", stockBarColor=", sb2, ozonSpannableString);
        Nh.a.h(sb2, str2, ", stockBarBackgroundColor=", str3, ", stockBarBackgroundAlpha=");
        sb2.append(f7);
        sb2.append(", isFullWidth=");
        sb2.append(z11);
        sb2.append(", hasBorder=");
        sb2.append(bool);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        StockBarTheme stockBarTheme = this.theme;
        if (stockBarTheme == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(stockBarTheme.name());
        }
        dest.writeInt(this.percent);
        OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
        dest.writeString(this.textColor);
        dest.writeString(this.stockBarColor);
        dest.writeString(this.stockBarBackgroundColor);
        dest.writeFloat(this.stockBarBackgroundAlpha);
        dest.writeInt(this.isFullWidth ? 1 : 0);
        Boolean bool = this.hasBorder;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        dest.writeParcelable(this.testInfo, flags);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockBar(StockBarTheme stockBarTheme, int i11, @NotNull OzonSpannableString text, String str, String str2, String str3, float f7, boolean z11, Boolean bool, TestInfo testInfo) {
        super(Type.STOCK_BAR, null, null, testInfo, 4, null);
        Intrinsics.checkNotNullParameter(text, "text");
        this.theme = stockBarTheme;
        this.percent = i11;
        this.text = text;
        this.textColor = str;
        this.stockBarColor = str2;
        this.stockBarBackgroundColor = str3;
        this.stockBarBackgroundAlpha = f7;
        this.isFullWidth = z11;
        this.hasBorder = bool;
        this.testInfo = testInfo;
    }
}
