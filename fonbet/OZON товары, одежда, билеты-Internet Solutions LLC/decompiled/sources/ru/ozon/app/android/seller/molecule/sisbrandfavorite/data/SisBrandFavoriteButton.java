package ru.ozon.app.android.seller.molecule.sisbrandfavorite.data;

import Pk0.c;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "", "isFavorite", "", "id", "", "moleculeType", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton$MoleculeType;", "favoriteButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "unfavoriteButton", "<init>", "(ZJLru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton$MoleculeType;Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;)V", "()Z", "setFavorite", "(Z)V", "getId", "()J", "getMoleculeType", "()Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton$MoleculeType;", "getFavoriteButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "getUnfavoriteButton", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "MoleculeType", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SisBrandFavoriteButton {

    @NotNull
    private final ButtonsDTO favoriteButton;
    private final long id;
    private boolean isFavorite;

    @NotNull
    private final MoleculeType moleculeType;

    @NotNull
    private final ButtonsDTO unfavoriteButton;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton$MoleculeType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "BRAND", "SELLER", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MoleculeType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ MoleculeType[] $VALUES;

        @i(name = "BRAND")
        public static final MoleculeType BRAND = new MoleculeType("BRAND", 0, "brand");

        @i(name = "SELLER")
        public static final MoleculeType SELLER = new MoleculeType("SELLER", 1, "seller");

        @NotNull
        private final String type;

        private static final /* synthetic */ MoleculeType[] $values() {
            return new MoleculeType[]{BRAND, SELLER};
        }

        static {
            MoleculeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private MoleculeType(String str, int i11, String str2) {
            this.type = str2;
        }

        public static MoleculeType valueOf(String str) {
            return (MoleculeType) Enum.valueOf(MoleculeType.class, str);
        }

        public static MoleculeType[] values() {
            return (MoleculeType[]) $VALUES.clone();
        }

        @NotNull
        public final String getType() {
            return this.type;
        }
    }

    public SisBrandFavoriteButton(boolean z11, long j11, @NotNull MoleculeType moleculeType, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") ButtonsDTO favoriteButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") ButtonsDTO unfavoriteButton) {
        Intrinsics.checkNotNullParameter(moleculeType, "moleculeType");
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        Intrinsics.checkNotNullParameter(unfavoriteButton, "unfavoriteButton");
        this.isFavorite = z11;
        this.id = j11;
        this.moleculeType = moleculeType;
        this.favoriteButton = favoriteButton;
        this.unfavoriteButton = unfavoriteButton;
    }

    public static /* synthetic */ SisBrandFavoriteButton copy$default(SisBrandFavoriteButton sisBrandFavoriteButton, boolean z11, long j11, MoleculeType moleculeType, ButtonsDTO buttonsDTO, ButtonsDTO buttonsDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = sisBrandFavoriteButton.isFavorite;
        }
        if ((i11 & 2) != 0) {
            j11 = sisBrandFavoriteButton.id;
        }
        if ((i11 & 4) != 0) {
            moleculeType = sisBrandFavoriteButton.moleculeType;
        }
        if ((i11 & 8) != 0) {
            buttonsDTO = sisBrandFavoriteButton.favoriteButton;
        }
        if ((i11 & 16) != 0) {
            buttonsDTO2 = sisBrandFavoriteButton.unfavoriteButton;
        }
        ButtonsDTO buttonsDTO3 = buttonsDTO2;
        MoleculeType moleculeType2 = moleculeType;
        return sisBrandFavoriteButton.copy(z11, j11, moleculeType2, buttonsDTO, buttonsDTO3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final MoleculeType getMoleculeType() {
        return this.moleculeType;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonsDTO getFavoriteButton() {
        return this.favoriteButton;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonsDTO getUnfavoriteButton() {
        return this.unfavoriteButton;
    }

    @NotNull
    public final SisBrandFavoriteButton copy(boolean isFavorite, long id2, @NotNull MoleculeType moleculeType, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") ButtonsDTO favoriteButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") ButtonsDTO unfavoriteButton) {
        Intrinsics.checkNotNullParameter(moleculeType, "moleculeType");
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        Intrinsics.checkNotNullParameter(unfavoriteButton, "unfavoriteButton");
        return new SisBrandFavoriteButton(isFavorite, id2, moleculeType, favoriteButton, unfavoriteButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SisBrandFavoriteButton)) {
            return false;
        }
        SisBrandFavoriteButton sisBrandFavoriteButton = (SisBrandFavoriteButton) other;
        return this.isFavorite == sisBrandFavoriteButton.isFavorite && this.id == sisBrandFavoriteButton.id && this.moleculeType == sisBrandFavoriteButton.moleculeType && Intrinsics.d(this.favoriteButton, sisBrandFavoriteButton.favoriteButton) && Intrinsics.d(this.unfavoriteButton, sisBrandFavoriteButton.unfavoriteButton);
    }

    @NotNull
    public final ButtonsDTO getFavoriteButton() {
        return this.favoriteButton;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final MoleculeType getMoleculeType() {
        return this.moleculeType;
    }

    @NotNull
    public final ButtonsDTO getUnfavoriteButton() {
        return this.unfavoriteButton;
    }

    public int hashCode() {
        return this.unfavoriteButton.hashCode() + ((this.favoriteButton.hashCode() + ((this.moleculeType.hashCode() + c.a(Boolean.hashCode(this.isFavorite) * 31, 31, this.id)) * 31)) * 31);
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final void setFavorite(boolean z11) {
        this.isFavorite = z11;
    }

    @NotNull
    public String toString() {
        return "SisBrandFavoriteButton(isFavorite=" + this.isFavorite + ", id=" + this.id + ", moleculeType=" + this.moleculeType + ", favoriteButton=" + this.favoriteButton + ", unfavoriteButton=" + this.unfavoriteButton + ")";
    }

    public /* synthetic */ SisBrandFavoriteButton(boolean z11, long j11, MoleculeType moleculeType, ButtonsDTO buttonsDTO, ButtonsDTO buttonsDTO2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, j11, moleculeType, buttonsDTO, buttonsDTO2);
    }
}
