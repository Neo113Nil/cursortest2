package ru.ozon.app.android.atoms.data.price;

import C.J;
import De.C2859b;
import Pk0.h;
import Sc.InterfaceC3999a;
import T7.P;
import V.e;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002GHB©\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010+\u001a\u00020,H\u0016J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u00ad\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0006\u0010;\u001a\u00020,J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020,HÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001J\u0016\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006I"}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceWithTitle;", "Lru/ozon/uni/atoms/data/AtomDTO;", "theme", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle$ThemeType;", "backgroundColor", "", "price", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "priceSubtitle", "priceColor", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleColor", "strikethroughTitleColor", "subtitle", "subtitleColor", "gradientBackgroundColor", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle$GradientColor;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/atoms/data/price/PriceWithTitle$ThemeType;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/price/PriceWithTitle$GradientColor;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getTheme", "()Lru/ozon/app/android/atoms/data/price/PriceWithTitle$ThemeType;", "getBackgroundColor", "()Ljava/lang/String;", "getPrice", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getPriceSubtitle", "getPriceColor", "getTitle", "getTitleColor", "getStrikethroughTitleColor", "getSubtitle", "getSubtitleColor", "getGradientBackgroundColor", "()Lru/ozon/app/android/atoms/data/price/PriceWithTitle$GradientColor;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ThemeType", "GradientColor", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PriceWithTitle extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<PriceWithTitle> CREATOR = new Creator();
    private final String backgroundColor;
    private final GradientColor gradientBackgroundColor;

    @NotNull
    private final OzonSpannableString price;
    private final String priceColor;
    private final OzonSpannableString priceSubtitle;
    private final String strikethroughTitleColor;
    private final OzonSpannableString subtitle;
    private final String subtitleColor;
    private final TestInfo testInfo;

    @NotNull
    private final ThemeType theme;
    private final OzonSpannableString title;
    private final String titleColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<PriceWithTitle> {
        @Override // android.os.Parcelable.Creator
        public final PriceWithTitle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ThemeType valueOf = ThemeType.valueOf(parcel.readString());
            String readString = parcel.readString();
            OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
            OzonSpannableString create = ozonSpannableStringParceler.create(parcel);
            OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel);
            String readString2 = parcel.readString();
            OzonSpannableString create3 = ozonSpannableStringParceler.create(parcel);
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            OzonSpannableString create4 = ozonSpannableStringParceler.create(parcel);
            String readString5 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            GradientColor createFromParcel = parcel.readInt() == 0 ? null : GradientColor.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    int i12 = readInt;
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    i11 = C2859b.a(PriceWithTitle.class, parcel, linkedHashMap3, parcel.readString(), i11, 1);
                    linkedHashMap2 = linkedHashMap3;
                    readInt = i12;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new PriceWithTitle(valueOf, readString, create, create2, readString2, create3, readString3, readString4, create4, readString5, createFromParcel, linkedHashMap, (TestInfo) parcel.readParcelable(PriceWithTitle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PriceWithTitle[] newArray(int i11) {
            return new PriceWithTitle[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceWithTitle$GradientColor;", "Landroid/os/Parcelable;", "startColor", "", "endColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStartColor", "()Ljava/lang/String;", "getEndColor", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class GradientColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GradientColor> CREATOR = new Creator();

        @NotNull
        private final String endColor;

        @NotNull
        private final String startColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GradientColor> {
            @Override // android.os.Parcelable.Creator
            public final GradientColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GradientColor(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GradientColor[] newArray(int i11) {
                return new GradientColor[i11];
            }
        }

        public GradientColor(@NotNull String startColor, @NotNull String endColor) {
            Intrinsics.checkNotNullParameter(startColor, "startColor");
            Intrinsics.checkNotNullParameter(endColor, "endColor");
            this.startColor = startColor;
            this.endColor = endColor;
        }

        public static /* synthetic */ GradientColor copy$default(GradientColor gradientColor, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = gradientColor.startColor;
            }
            if ((i11 & 2) != 0) {
                str2 = gradientColor.endColor;
            }
            return gradientColor.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getStartColor() {
            return this.startColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getEndColor() {
            return this.endColor;
        }

        @NotNull
        public final GradientColor copy(@NotNull String startColor, @NotNull String endColor) {
            Intrinsics.checkNotNullParameter(startColor, "startColor");
            Intrinsics.checkNotNullParameter(endColor, "endColor");
            return new GradientColor(startColor, endColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GradientColor)) {
                return false;
            }
            GradientColor gradientColor = (GradientColor) other;
            return Intrinsics.d(this.startColor, gradientColor.startColor) && Intrinsics.d(this.endColor, gradientColor.endColor);
        }

        @NotNull
        public final String getEndColor() {
            return this.endColor;
        }

        @NotNull
        public final String getStartColor() {
            return this.startColor;
        }

        public int hashCode() {
            return this.endColor.hashCode() + (this.startColor.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("GradientColor(startColor=", this.startColor, ", endColor=", this.endColor, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.startColor);
            dest.writeString(this.endColor);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceWithTitle$ThemeType;", "", "priceStyle", "", "titleStyle", "priceSubtitle", "subTitleStyle", "cornerRadius", "", "<init>", "(Ljava/lang/String;IIIIIF)V", "getPriceStyle", "()I", "getTitleStyle", "getPriceSubtitle", "getSubTitleStyle", "getCornerRadius", "()F", "THEME_TYPE_SMALL", "STYLE_TYPE_SMALL_MEDIUM", "THEME_TYPE_MEDIUM", "THEME_TYPE_MEDIUM_LARGE", "THEME_TYPE_LARGE", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class ThemeType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ThemeType[] $VALUES;

        @i(name = "STYLE_TYPE_SMALL_MEDIUM")
        public static final ThemeType STYLE_TYPE_SMALL_MEDIUM;

        @i(name = "STYLE_TYPE_LARGE")
        public static final ThemeType THEME_TYPE_LARGE;

        @i(name = "STYLE_TYPE_MEDIUM")
        public static final ThemeType THEME_TYPE_MEDIUM;

        @i(name = "STYLE_TYPE_MEDIUM_LARGE")
        public static final ThemeType THEME_TYPE_MEDIUM_LARGE;

        @i(name = "STYLE_TYPE_SMALL")
        public static final ThemeType THEME_TYPE_SMALL;
        private final float cornerRadius;
        private final int priceStyle;
        private final int priceSubtitle;
        private final int subTitleStyle;
        private final int titleStyle;

        private static final /* synthetic */ ThemeType[] $values() {
            return new ThemeType[]{THEME_TYPE_SMALL, STYLE_TYPE_SMALL_MEDIUM, THEME_TYPE_MEDIUM, THEME_TYPE_MEDIUM_LARGE, THEME_TYPE_LARGE};
        }

        static {
            int i11 = R$style.TextStyle_Caption_Bold;
            int i12 = R$style.TextStyle_Caption;
            THEME_TYPE_SMALL = new ThemeType("THEME_TYPE_SMALL", 0, i11, i12, i12, i12, ResourceExtKt.toPxF(4));
            int i13 = R$style.TextStyle_Body_M_Bold;
            int i14 = R$style.TextStyle_Caption;
            STYLE_TYPE_SMALL_MEDIUM = new ThemeType("STYLE_TYPE_SMALL_MEDIUM", 1, i13, i14, i14, i14, ResourceExtKt.toPxF(4));
            int i15 = R$style.TextStyle_Body_L_Bold;
            int i16 = R$style.TextStyle_Caption;
            THEME_TYPE_MEDIUM = new ThemeType("THEME_TYPE_MEDIUM", 2, i15, i16, i16, i16, ResourceExtKt.toPxF(4));
            int i17 = R$style.TextStyle_Head_L;
            int i18 = R$style.TextStyle_Body_M;
            THEME_TYPE_MEDIUM_LARGE = new ThemeType("THEME_TYPE_MEDIUM_LARGE", 3, i17, i18, i18, R$style.TextStyle_Caption, ResourceExtKt.toPxF(6));
            int i19 = R$style.TextStyle_Head_XL;
            int i21 = R$style.TextStyle_Body_M;
            THEME_TYPE_LARGE = new ThemeType("THEME_TYPE_LARGE", 4, i19, i21, i21, R$style.TextStyle_Caption, ResourceExtKt.toPxF(8));
            ThemeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ThemeType(String str, int i11, int i12, int i13, int i14, int i15, float f7) {
            this.priceStyle = i12;
            this.titleStyle = i13;
            this.priceSubtitle = i14;
            this.subTitleStyle = i15;
            this.cornerRadius = f7;
        }

        @NotNull
        public static a<ThemeType> getEntries() {
            return $ENTRIES;
        }

        public static ThemeType valueOf(String str) {
            return (ThemeType) Enum.valueOf(ThemeType.class, str);
        }

        public static ThemeType[] values() {
            return (ThemeType[]) $VALUES.clone();
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        public final int getPriceStyle() {
            return this.priceStyle;
        }

        public final int getPriceSubtitle() {
            return this.priceSubtitle;
        }

        public final int getSubTitleStyle() {
            return this.subTitleStyle;
        }

        public final int getTitleStyle() {
            return this.titleStyle;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PriceWithTitle(ru.ozon.app.android.atoms.data.price.PriceWithTitle.ThemeType r17, java.lang.String r18, ru.ozon.uni.atoms.utils.OzonSpannableString r19, ru.ozon.uni.atoms.utils.OzonSpannableString r20, java.lang.String r21, ru.ozon.uni.atoms.utils.OzonSpannableString r22, java.lang.String r23, java.lang.String r24, ru.ozon.uni.atoms.utils.OzonSpannableString r25, java.lang.String r26, ru.ozon.app.android.atoms.data.price.PriceWithTitle.GradientColor r27, java.util.Map r28, ru.ozon.uni.atoms.data.TestInfo r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 1
            if (r1 == 0) goto La
            ru.ozon.app.android.atoms.data.price.PriceWithTitle$ThemeType r1 = ru.ozon.app.android.atoms.data.price.PriceWithTitle.ThemeType.THEME_TYPE_MEDIUM
            r3 = r1
            goto Lc
        La:
            r3 = r17
        Lc:
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L13
            r4 = r2
            goto L15
        L13:
            r4 = r18
        L15:
            r1 = r0 & 8
            if (r1 == 0) goto L1b
            r6 = r2
            goto L1d
        L1b:
            r6 = r20
        L1d:
            r1 = r0 & 16
            if (r1 == 0) goto L23
            r7 = r2
            goto L25
        L23:
            r7 = r21
        L25:
            r1 = r0 & 32
            if (r1 == 0) goto L2b
            r8 = r2
            goto L2d
        L2b:
            r8 = r22
        L2d:
            r1 = r0 & 64
            if (r1 == 0) goto L33
            r9 = r2
            goto L35
        L33:
            r9 = r23
        L35:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L3b
            r10 = r2
            goto L3d
        L3b:
            r10 = r24
        L3d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L43
            r11 = r2
            goto L45
        L43:
            r11 = r25
        L45:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L4b
            r12 = r2
            goto L4d
        L4b:
            r12 = r26
        L4d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L53
            r13 = r2
            goto L55
        L53:
            r13 = r27
        L55:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L5b
            r14 = r2
            goto L5d
        L5b:
            r14 = r28
        L5d:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L67
            r15 = r2
            r5 = r19
            r2 = r16
            goto L6d
        L67:
            r15 = r29
            r2 = r16
            r5 = r19
        L6d:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.price.PriceWithTitle.<init>(ru.ozon.app.android.atoms.data.price.PriceWithTitle$ThemeType, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.price.PriceWithTitle$GradientColor, java.util.Map, ru.ozon.uni.atoms.data.TestInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ PriceWithTitle copy$default(PriceWithTitle priceWithTitle, ThemeType themeType, String str, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str2, OzonSpannableString ozonSpannableString3, String str3, String str4, OzonSpannableString ozonSpannableString4, String str5, GradientColor gradientColor, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            themeType = priceWithTitle.theme;
        }
        return priceWithTitle.copy(themeType, (i11 & 2) != 0 ? priceWithTitle.backgroundColor : str, (i11 & 4) != 0 ? priceWithTitle.price : ozonSpannableString, (i11 & 8) != 0 ? priceWithTitle.priceSubtitle : ozonSpannableString2, (i11 & 16) != 0 ? priceWithTitle.priceColor : str2, (i11 & 32) != 0 ? priceWithTitle.title : ozonSpannableString3, (i11 & 64) != 0 ? priceWithTitle.titleColor : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? priceWithTitle.strikethroughTitleColor : str4, (i11 & 256) != 0 ? priceWithTitle.subtitle : ozonSpannableString4, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? priceWithTitle.subtitleColor : str5, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? priceWithTitle.gradientBackgroundColor : gradientColor, (i11 & 2048) != 0 ? priceWithTitle.trackingInfo : map, (i11 & 4096) != 0 ? priceWithTitle.testInfo : testInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ThemeType getTheme() {
        return this.theme;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    /* renamed from: component11, reason: from getter */
    public final GradientColor getGradientBackgroundColor() {
        return this.gradientBackgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.trackingInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final OzonSpannableString getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final OzonSpannableString getPriceSubtitle() {
        return this.priceSubtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPriceColor() {
        return this.priceColor;
    }

    /* renamed from: component6, reason: from getter */
    public final OzonSpannableString getTitle() {
        return this.title;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTitleColor() {
        return this.titleColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStrikethroughTitleColor() {
        return this.strikethroughTitleColor;
    }

    /* renamed from: component9, reason: from getter */
    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final PriceWithTitle copy(@NotNull ThemeType theme, String backgroundColor, @NotNull OzonSpannableString price, OzonSpannableString priceSubtitle, String priceColor, OzonSpannableString title, String titleColor, String strikethroughTitleColor, OzonSpannableString subtitle, String subtitleColor, GradientColor gradientBackgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(price, "price");
        return new PriceWithTitle(theme, backgroundColor, price, priceSubtitle, priceColor, title, titleColor, strikethroughTitleColor, subtitle, subtitleColor, gradientBackgroundColor, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceWithTitle)) {
            return false;
        }
        PriceWithTitle priceWithTitle = (PriceWithTitle) other;
        return this.theme == priceWithTitle.theme && Intrinsics.d(this.backgroundColor, priceWithTitle.backgroundColor) && Intrinsics.d(this.price, priceWithTitle.price) && Intrinsics.d(this.priceSubtitle, priceWithTitle.priceSubtitle) && Intrinsics.d(this.priceColor, priceWithTitle.priceColor) && Intrinsics.d(this.title, priceWithTitle.title) && Intrinsics.d(this.titleColor, priceWithTitle.titleColor) && Intrinsics.d(this.strikethroughTitleColor, priceWithTitle.strikethroughTitleColor) && Intrinsics.d(this.subtitle, priceWithTitle.subtitle) && Intrinsics.d(this.subtitleColor, priceWithTitle.subtitleColor) && Intrinsics.d(this.gradientBackgroundColor, priceWithTitle.gradientBackgroundColor) && Intrinsics.d(this.trackingInfo, priceWithTitle.trackingInfo) && Intrinsics.d(this.testInfo, priceWithTitle.testInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final GradientColor getGradientBackgroundColor() {
        return this.gradientBackgroundColor;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_price_with_title;
    }

    @NotNull
    public final OzonSpannableString getPrice() {
        return this.price;
    }

    public final String getPriceColor() {
        return this.priceColor;
    }

    public final OzonSpannableString getPriceSubtitle() {
        return this.priceSubtitle;
    }

    public final String getStrikethroughTitleColor() {
        return this.strikethroughTitleColor;
    }

    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final ThemeType getTheme() {
        return this.theme;
    }

    public final OzonSpannableString getTitle() {
        return this.title;
    }

    public final String getTitleColor() {
        return this.titleColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.theme.hashCode() * 31;
        String str = this.backgroundColor;
        int c11 = P.c(this.price, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        OzonSpannableString ozonSpannableString = this.priceSubtitle;
        int hashCode2 = (c11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        String str2 = this.priceColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OzonSpannableString ozonSpannableString2 = this.title;
        int hashCode4 = (hashCode3 + (ozonSpannableString2 == null ? 0 : ozonSpannableString2.hashCode())) * 31;
        String str3 = this.titleColor;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.strikethroughTitleColor;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        OzonSpannableString ozonSpannableString3 = this.subtitle;
        int hashCode7 = (hashCode6 + (ozonSpannableString3 == null ? 0 : ozonSpannableString3.hashCode())) * 31;
        String str5 = this.subtitleColor;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        GradientColor gradientColor = this.gradientBackgroundColor;
        int hashCode9 = (hashCode8 + (gradientColor == null ? 0 : gradientColor.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode10 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ThemeType themeType = this.theme;
        String str = this.backgroundColor;
        OzonSpannableString ozonSpannableString = this.price;
        OzonSpannableString ozonSpannableString2 = this.priceSubtitle;
        String str2 = this.priceColor;
        OzonSpannableString ozonSpannableString3 = this.title;
        String str3 = this.titleColor;
        String str4 = this.strikethroughTitleColor;
        OzonSpannableString ozonSpannableString4 = this.subtitle;
        String str5 = this.subtitleColor;
        GradientColor gradientColor = this.gradientBackgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("PriceWithTitle(theme=");
        sb2.append(themeType);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", price=");
        sb2.append((Object) ozonSpannableString);
        sb2.append(", priceSubtitle=");
        sb2.append((Object) ozonSpannableString2);
        sb2.append(", priceColor=");
        B6.b.c(str2, ", title=", ", titleColor=", sb2, ozonSpannableString3);
        Nh.a.h(sb2, str3, ", strikethroughTitleColor=", str4, ", subtitle=");
        HY.a.c(", subtitleColor=", str5, ", gradientBackgroundColor=", sb2, ozonSpannableString4);
        sb2.append(gradientColor);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", testInfo=");
        return h.c(sb2, testInfo, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.theme.name());
        dest.writeString(this.backgroundColor);
        OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
        ozonSpannableStringParceler.write(this.price, dest, flags);
        ozonSpannableStringParceler.write(this.priceSubtitle, dest, flags);
        dest.writeString(this.priceColor);
        ozonSpannableStringParceler.write(this.title, dest, flags);
        dest.writeString(this.titleColor);
        dest.writeString(this.strikethroughTitleColor);
        ozonSpannableStringParceler.write(this.subtitle, dest, flags);
        dest.writeString(this.subtitleColor);
        GradientColor gradientColor = this.gradientBackgroundColor;
        if (gradientColor == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            gradientColor.writeToParcel(dest, flags);
        }
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        dest.writeParcelable(this.testInfo, flags);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceWithTitle(@NotNull ThemeType theme, String str, @NotNull OzonSpannableString price, OzonSpannableString ozonSpannableString, String str2, OzonSpannableString ozonSpannableString2, String str3, String str4, OzonSpannableString ozonSpannableString3, String str5, GradientColor gradientColor, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(Type.PRICE_WITH_TITLE, null, map, testInfo);
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(price, "price");
        this.theme = theme;
        this.backgroundColor = str;
        this.price = price;
        this.priceSubtitle = ozonSpannableString;
        this.priceColor = str2;
        this.title = ozonSpannableString2;
        this.titleColor = str3;
        this.strikethroughTitleColor = str4;
        this.subtitle = ozonSpannableString3;
        this.subtitleColor = str5;
        this.gradientBackgroundColor = gradientColor;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
