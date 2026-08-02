package ru.ozon.app.android.storefront.data.tiles.labellist;

import N3.C3660k;
import Pk0.h;
import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB+\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO;", "", "items", "", "Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem;", "verticalIndents", "Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$VerticalIndents;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$VerticalIndents;Lru/ozon/uni/atoms/data/TestInfo;)V", "getItems", "()Ljava/util/List;", "getVerticalIndents", "()Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$VerticalIndents;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LabelItem", "VerticalIndents", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LabelListDTO {

    @NotNull
    private final List<LabelItem> items;
    private final TestInfo testInfo;
    private final VerticalIndents verticalIndents;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem;", "", "Text", "Icon", "Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem$Icon;", "Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem$Text;", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface LabelItem {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem$Icon;", "Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem;", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "iconSize", "Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem$Icon$IconSize;", "leftPadding", "", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem$Icon$IconSize;Ljava/lang/Integer;)V", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getIconSize", "()Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem$Icon$IconSize;", "getLeftPadding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem$Icon$IconSize;Ljava/lang/Integer;)Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem$Icon;", "equals", "", "other", "", "hashCode", "toString", "", "IconSize", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Icon implements LabelItem {

            @NotNull
            private final CommonAtomIconDTO icon;
            private final IconSize iconSize;
            private final Integer leftPadding;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem$Icon$IconSize;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SIZE_DEFAULT", "SIZE_16", "SIZE_20", "SIZE_24", "SIZE_28", "SIZE_32", "SIZE_36", "SIZE_40", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class IconSize {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ IconSize[] $VALUES;
                private final int value;
                public static final IconSize SIZE_DEFAULT = new IconSize("SIZE_DEFAULT", 0, 0);
                public static final IconSize SIZE_16 = new IconSize("SIZE_16", 1, 16);
                public static final IconSize SIZE_20 = new IconSize("SIZE_20", 2, 20);
                public static final IconSize SIZE_24 = new IconSize("SIZE_24", 3, 24);
                public static final IconSize SIZE_28 = new IconSize("SIZE_28", 4, 28);
                public static final IconSize SIZE_32 = new IconSize("SIZE_32", 5, 32);
                public static final IconSize SIZE_36 = new IconSize("SIZE_36", 6, 36);
                public static final IconSize SIZE_40 = new IconSize("SIZE_40", 7, 40);

                private static final /* synthetic */ IconSize[] $values() {
                    return new IconSize[]{SIZE_DEFAULT, SIZE_16, SIZE_20, SIZE_24, SIZE_28, SIZE_32, SIZE_36, SIZE_40};
                }

                static {
                    IconSize[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private IconSize(String str, int i11, int i12) {
                    this.value = i12;
                }

                public static IconSize valueOf(String str) {
                    return (IconSize) Enum.valueOf(IconSize.class, str);
                }

                public static IconSize[] values() {
                    return (IconSize[]) $VALUES.clone();
                }

                public final int getValue() {
                    return this.value;
                }
            }

            public Icon(@NotNull CommonAtomIconDTO icon, IconSize iconSize, Integer num) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
                this.iconSize = iconSize;
                this.leftPadding = num;
            }

            public static /* synthetic */ Icon copy$default(Icon icon, CommonAtomIconDTO commonAtomIconDTO, IconSize iconSize, Integer num, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    commonAtomIconDTO = icon.icon;
                }
                if ((i11 & 2) != 0) {
                    iconSize = icon.iconSize;
                }
                if ((i11 & 4) != 0) {
                    num = icon.leftPadding;
                }
                return icon.copy(commonAtomIconDTO, iconSize, num);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final CommonAtomIconDTO getIcon() {
                return this.icon;
            }

            /* renamed from: component2, reason: from getter */
            public final IconSize getIconSize() {
                return this.iconSize;
            }

            /* renamed from: component3, reason: from getter */
            public final Integer getLeftPadding() {
                return this.leftPadding;
            }

            @NotNull
            public final Icon copy(@NotNull CommonAtomIconDTO icon, IconSize iconSize, Integer leftPadding) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                return new Icon(icon, iconSize, leftPadding);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) other;
                return Intrinsics.d(this.icon, icon.icon) && this.iconSize == icon.iconSize && Intrinsics.d(this.leftPadding, icon.leftPadding);
            }

            @NotNull
            public final CommonAtomIconDTO getIcon() {
                return this.icon;
            }

            public final IconSize getIconSize() {
                return this.iconSize;
            }

            public Integer getLeftPadding() {
                return this.leftPadding;
            }

            public int hashCode() {
                int hashCode = this.icon.hashCode() * 31;
                IconSize iconSize = this.iconSize;
                int hashCode2 = (hashCode + (iconSize == null ? 0 : iconSize.hashCode())) * 31;
                Integer num = this.leftPadding;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                CommonAtomIconDTO commonAtomIconDTO = this.icon;
                IconSize iconSize = this.iconSize;
                Integer num = this.leftPadding;
                StringBuilder sb2 = new StringBuilder("Icon(icon=");
                sb2.append(commonAtomIconDTO);
                sb2.append(", iconSize=");
                sb2.append(iconSize);
                sb2.append(", leftPadding=");
                return Ep.a.c(sb2, num, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ<\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem$Text;", "Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem;", "text", "", "textColor", "typographyToken", "leftPadding", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getText", "()Ljava/lang/String;", "getTextColor", "getTypographyToken", "getLeftPadding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem$Text;", "equals", "", "other", "", "hashCode", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Text implements LabelItem {
            private final Integer leftPadding;

            @NotNull
            private final String text;
            private final String textColor;
            private final String typographyToken;

            public Text(@NotNull String text, String str, String str2, Integer num) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.textColor = str;
                this.typographyToken = str2;
                this.leftPadding = num;
            }

            public static /* synthetic */ Text copy$default(Text text, String str, String str2, String str3, Integer num, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = text.text;
                }
                if ((i11 & 2) != 0) {
                    str2 = text.textColor;
                }
                if ((i11 & 4) != 0) {
                    str3 = text.typographyToken;
                }
                if ((i11 & 8) != 0) {
                    num = text.leftPadding;
                }
                return text.copy(str, str2, str3, num);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTextColor() {
                return this.textColor;
            }

            /* renamed from: component3, reason: from getter */
            public final String getTypographyToken() {
                return this.typographyToken;
            }

            /* renamed from: component4, reason: from getter */
            public final Integer getLeftPadding() {
                return this.leftPadding;
            }

            @NotNull
            public final Text copy(@NotNull String text, String textColor, String typographyToken, Integer leftPadding) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Text(text, textColor, typographyToken, leftPadding);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Text)) {
                    return false;
                }
                Text text = (Text) other;
                return Intrinsics.d(this.text, text.text) && Intrinsics.d(this.textColor, text.textColor) && Intrinsics.d(this.typographyToken, text.typographyToken) && Intrinsics.d(this.leftPadding, text.leftPadding);
            }

            public Integer getLeftPadding() {
                return this.leftPadding;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public final String getTextColor() {
                return this.textColor;
            }

            public final String getTypographyToken() {
                return this.typographyToken;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                String str = this.textColor;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.typographyToken;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.leftPadding;
                return hashCode3 + (num != null ? num.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.text;
                String str2 = this.textColor;
                String str3 = this.typographyToken;
                Integer num = this.leftPadding;
                StringBuilder d11 = C3660k.d("Text(text=", str, ", textColor=", str2, ", typographyToken=");
                d11.append(str3);
                d11.append(", leftPadding=");
                d11.append(num);
                d11.append(")");
                return d11.toString();
            }
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$VerticalIndents;", "", "top", "", "bottom", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTop", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBottom", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$VerticalIndents;", "equals", "", "other", "hashCode", "toString", "", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VerticalIndents {
        private final Integer bottom;
        private final Integer top;

        public VerticalIndents(Integer num, Integer num2) {
            this.top = num;
            this.bottom = num2;
        }

        public static /* synthetic */ VerticalIndents copy$default(VerticalIndents verticalIndents, Integer num, Integer num2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = verticalIndents.top;
            }
            if ((i11 & 2) != 0) {
                num2 = verticalIndents.bottom;
            }
            return verticalIndents.copy(num, num2);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getTop() {
            return this.top;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getBottom() {
            return this.bottom;
        }

        @NotNull
        public final VerticalIndents copy(Integer top, Integer bottom) {
            return new VerticalIndents(top, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerticalIndents)) {
                return false;
            }
            VerticalIndents verticalIndents = (VerticalIndents) other;
            return Intrinsics.d(this.top, verticalIndents.top) && Intrinsics.d(this.bottom, verticalIndents.bottom);
        }

        public final Integer getBottom() {
            return this.bottom;
        }

        public final Integer getTop() {
            return this.top;
        }

        public int hashCode() {
            Integer num = this.top;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.bottom;
            return hashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "VerticalIndents(top=" + this.top + ", bottom=" + this.bottom + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LabelListDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = LabelItem.Text.class), @ProtoOneOfSignature(name = "icon", type = LabelItem.Icon.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends LabelItem> items, VerticalIndents verticalIndents, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.verticalIndents = verticalIndents;
        this.testInfo = testInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LabelListDTO copy$default(LabelListDTO labelListDTO, List list, VerticalIndents verticalIndents, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = labelListDTO.items;
        }
        if ((i11 & 2) != 0) {
            verticalIndents = labelListDTO.verticalIndents;
        }
        if ((i11 & 4) != 0) {
            testInfo = labelListDTO.testInfo;
        }
        return labelListDTO.copy(list, verticalIndents, testInfo);
    }

    @NotNull
    public final List<LabelItem> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final VerticalIndents getVerticalIndents() {
        return this.verticalIndents;
    }

    /* renamed from: component3, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final LabelListDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = LabelItem.Text.class), @ProtoOneOfSignature(name = "icon", type = LabelItem.Icon.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends LabelItem> items, VerticalIndents verticalIndents, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new LabelListDTO(items, verticalIndents, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelListDTO)) {
            return false;
        }
        LabelListDTO labelListDTO = (LabelListDTO) other;
        return Intrinsics.d(this.items, labelListDTO.items) && Intrinsics.d(this.verticalIndents, labelListDTO.verticalIndents) && Intrinsics.d(this.testInfo, labelListDTO.testInfo);
    }

    @NotNull
    public final List<LabelItem> getItems() {
        return this.items;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final VerticalIndents getVerticalIndents() {
        return this.verticalIndents;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        VerticalIndents verticalIndents = this.verticalIndents;
        int hashCode2 = (hashCode + (verticalIndents == null ? 0 : verticalIndents.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<LabelItem> list = this.items;
        VerticalIndents verticalIndents = this.verticalIndents;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("LabelListDTO(items=");
        sb2.append(list);
        sb2.append(", verticalIndents=");
        sb2.append(verticalIndents);
        sb2.append(", testInfo=");
        return h.c(sb2, testInfo, ")");
    }
}
