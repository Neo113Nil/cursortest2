package ru.ozon.fintech.features.cbottombase.models.widgets.v2;

import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextItemDTO;", "Landroid/os/Parcelable;", "text", "", "textStyle", "textColor", "maxLines", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getText", "()Ljava/lang/String;", "getTextStyle", "getTextColor", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextItemDTO;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextItemDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TextItemDTO> CREATOR = new a();

    @i(name = "maxLines")
    private final Integer maxLines;

    @i(name = "text")
    private final String text;

    @i(name = "textColor")
    private final String textColor;

    @i(name = "textStyle")
    private final String textStyle;

    public static final class a implements Parcelable.Creator<TextItemDTO> {
        @Override // android.os.Parcelable.Creator
        public final TextItemDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TextItemDTO(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final TextItemDTO[] newArray(int i11) {
            return new TextItemDTO[i11];
        }
    }

    public TextItemDTO(String str, String str2, String str3, Integer num) {
        this.text = str;
        this.textStyle = str2;
        this.textColor = str3;
        this.maxLines = num;
    }

    public static /* synthetic */ TextItemDTO copy$default(TextItemDTO textItemDTO, String str, String str2, String str3, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = textItemDTO.text;
        }
        if ((i11 & 2) != 0) {
            str2 = textItemDTO.textStyle;
        }
        if ((i11 & 4) != 0) {
            str3 = textItemDTO.textColor;
        }
        if ((i11 & 8) != 0) {
            num = textItemDTO.maxLines;
        }
        return textItemDTO.copy(str, str2, str3, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getMaxLines() {
        return this.maxLines;
    }

    @NotNull
    public final TextItemDTO copy(String text, String textStyle, String textColor, Integer maxLines) {
        return new TextItemDTO(text, textStyle, textColor, maxLines);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextItemDTO)) {
            return false;
        }
        TextItemDTO textItemDTO = (TextItemDTO) other;
        return Intrinsics.d(this.text, textItemDTO.text) && Intrinsics.d(this.textStyle, textItemDTO.textStyle) && Intrinsics.d(this.textColor, textItemDTO.textColor) && Intrinsics.d(this.maxLines, textItemDTO.maxLines);
    }

    public final Integer getMaxLines() {
        return this.maxLines;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.textStyle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.maxLines;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.textStyle;
        String str3 = this.textColor;
        Integer num = this.maxLines;
        StringBuilder d11 = C3660k.d("TextItemDTO(text=", str, ", textStyle=", str2, ", textColor=");
        d11.append(str3);
        d11.append(", maxLines=");
        d11.append(num);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        dest.writeString(this.textStyle);
        dest.writeString(this.textColor);
        Integer num = this.maxLines;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
    }

    public /* synthetic */ TextItemDTO(String str, String str2, String str3, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? StyleParser.TextStyle.BODY_M.getStyleName() : str2, (i11 & 4) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue() : str3, (i11 & 8) != 0 ? null : num);
    }
}
