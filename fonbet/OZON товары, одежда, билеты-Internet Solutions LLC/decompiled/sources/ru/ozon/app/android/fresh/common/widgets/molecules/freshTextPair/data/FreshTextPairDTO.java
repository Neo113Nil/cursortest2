package ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.data;

import B0.C2454a;
import D3.g;
import Lh.a;
import Ns.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0018\u001a\u00020\u0006H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010!\u001a\u00020\u0006J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/data/FreshTextPairDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "ellipsizableText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "trailingText", "maxLines", "", "paddingLeft", "Lru/ozon/uni/atoms/data/common/Paddings;", "paddingRight", "paddingTop", "paddingBottom", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ILru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getEllipsizableText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTrailingText", "getMaxLines", "()I", "getPaddingLeft", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getPaddingRight", "getPaddingTop", "getPaddingBottom", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshTextPairDTO extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<FreshTextPairDTO> CREATOR = new Creator();

    @NotNull
    private final TextDTO ellipsizableText;
    private final int maxLines;

    @EnumNullFallback
    private final Paddings paddingBottom;

    @EnumNullFallback
    private final Paddings paddingLeft;

    @EnumNullFallback
    private final Paddings paddingRight;

    @EnumNullFallback
    private final Paddings paddingTop;

    @NotNull
    private final TextDTO trailingText;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FreshTextPairDTO> {
        @Override // android.os.Parcelable.Creator
        public final FreshTextPairDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreshTextPairDTO((TextDTO) parcel.readParcelable(FreshTextPairDTO.class.getClassLoader()), (TextDTO) parcel.readParcelable(FreshTextPairDTO.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : Paddings.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Paddings.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Paddings.valueOf(parcel.readString()), parcel.readInt() != 0 ? Paddings.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FreshTextPairDTO[] newArray(int i11) {
            return new FreshTextPairDTO[i11];
        }
    }

    public /* synthetic */ FreshTextPairDTO(TextDTO textDTO, TextDTO textDTO2, int i11, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, i11, (i12 & 8) != 0 ? Paddings.NONE : paddings, (i12 & 16) != 0 ? Paddings.NONE : paddings2, (i12 & 32) != 0 ? Paddings.NONE : paddings3, (i12 & 64) != 0 ? Paddings.NONE : paddings4);
    }

    public static /* synthetic */ FreshTextPairDTO copy$default(FreshTextPairDTO freshTextPairDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            textDTO = freshTextPairDTO.ellipsizableText;
        }
        if ((i12 & 2) != 0) {
            textDTO2 = freshTextPairDTO.trailingText;
        }
        if ((i12 & 4) != 0) {
            i11 = freshTextPairDTO.maxLines;
        }
        if ((i12 & 8) != 0) {
            paddings = freshTextPairDTO.paddingLeft;
        }
        if ((i12 & 16) != 0) {
            paddings2 = freshTextPairDTO.paddingRight;
        }
        if ((i12 & 32) != 0) {
            paddings3 = freshTextPairDTO.paddingTop;
        }
        if ((i12 & 64) != 0) {
            paddings4 = freshTextPairDTO.paddingBottom;
        }
        Paddings paddings5 = paddings3;
        Paddings paddings6 = paddings4;
        Paddings paddings7 = paddings2;
        int i13 = i11;
        return freshTextPairDTO.copy(textDTO, textDTO2, i13, paddings, paddings7, paddings5, paddings6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getEllipsizableText() {
        return this.ellipsizableText;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTrailingText() {
        return this.trailingText;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component4, reason: from getter */
    public final Paddings getPaddingLeft() {
        return this.paddingLeft;
    }

    /* renamed from: component5, reason: from getter */
    public final Paddings getPaddingRight() {
        return this.paddingRight;
    }

    /* renamed from: component6, reason: from getter */
    public final Paddings getPaddingTop() {
        return this.paddingTop;
    }

    /* renamed from: component7, reason: from getter */
    public final Paddings getPaddingBottom() {
        return this.paddingBottom;
    }

    @NotNull
    public final FreshTextPairDTO copy(@NotNull TextDTO ellipsizableText, @NotNull TextDTO trailingText, int maxLines, Paddings paddingLeft, Paddings paddingRight, Paddings paddingTop, Paddings paddingBottom) {
        Intrinsics.checkNotNullParameter(ellipsizableText, "ellipsizableText");
        Intrinsics.checkNotNullParameter(trailingText, "trailingText");
        return new FreshTextPairDTO(ellipsizableText, trailingText, maxLines, paddingLeft, paddingRight, paddingTop, paddingBottom);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshTextPairDTO)) {
            return false;
        }
        FreshTextPairDTO freshTextPairDTO = (FreshTextPairDTO) other;
        return Intrinsics.d(this.ellipsizableText, freshTextPairDTO.ellipsizableText) && Intrinsics.d(this.trailingText, freshTextPairDTO.trailingText) && this.maxLines == freshTextPairDTO.maxLines && this.paddingLeft == freshTextPairDTO.paddingLeft && this.paddingRight == freshTextPairDTO.paddingRight && this.paddingTop == freshTextPairDTO.paddingTop && this.paddingBottom == freshTextPairDTO.paddingBottom;
    }

    @NotNull
    public final TextDTO getEllipsizableText() {
        return this.ellipsizableText;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.freshTextPairAtomType;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final Paddings getPaddingBottom() {
        return this.paddingBottom;
    }

    public final Paddings getPaddingLeft() {
        return this.paddingLeft;
    }

    public final Paddings getPaddingRight() {
        return this.paddingRight;
    }

    public final Paddings getPaddingTop() {
        return this.paddingTop;
    }

    @NotNull
    public final TextDTO getTrailingText() {
        return this.trailingText;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.maxLines, b.a(this.trailingText, this.ellipsizableText.hashCode() * 31, 31), 31);
        Paddings paddings = this.paddingLeft;
        int hashCode = (a11 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Paddings paddings2 = this.paddingRight;
        int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        Paddings paddings3 = this.paddingTop;
        int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
        Paddings paddings4 = this.paddingBottom;
        return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.ellipsizableText;
        TextDTO textDTO2 = this.trailingText;
        int i11 = this.maxLines;
        Paddings paddings = this.paddingLeft;
        Paddings paddings2 = this.paddingRight;
        Paddings paddings3 = this.paddingTop;
        Paddings paddings4 = this.paddingBottom;
        StringBuilder g10 = g.g("FreshTextPairDTO(ellipsizableText=", textDTO, ", trailingText=", textDTO2, ", maxLines=");
        g10.append(i11);
        g10.append(", paddingLeft=");
        g10.append(paddings);
        g10.append(", paddingRight=");
        a.e(g10, paddings2, ", paddingTop=", paddings3, ", paddingBottom=");
        return D40.b.b(g10, paddings4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.ellipsizableText, flags);
        dest.writeParcelable(this.trailingText, flags);
        dest.writeInt(this.maxLines);
        Paddings paddings = this.paddingLeft;
        if (paddings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(paddings.name());
        }
        Paddings paddings2 = this.paddingRight;
        if (paddings2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(paddings2.name());
        }
        Paddings paddings3 = this.paddingTop;
        if (paddings3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(paddings3.name());
        }
        Paddings paddings4 = this.paddingBottom;
        if (paddings4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(paddings4.name());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshTextPairDTO(@NotNull TextDTO ellipsizableText, @NotNull TextDTO trailingText, int i11, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
        super(FreshTextPairAtomType.TEXT_PAIR, null, null, null, 12, null);
        Intrinsics.checkNotNullParameter(ellipsizableText, "ellipsizableText");
        Intrinsics.checkNotNullParameter(trailingText, "trailingText");
        this.ellipsizableText = ellipsizableText;
        this.trailingText = trailingText;
        this.maxLines = i11;
        this.paddingLeft = paddings;
        this.paddingRight = paddings2;
        this.paddingTop = paddings3;
        this.paddingBottom = paddings4;
    }
}
