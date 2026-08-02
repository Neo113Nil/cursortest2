package ru.ozon.uni.atoms.data.dsCell;

import C.J;
import C.o0;
import D3.h;
import D40.c;
import D40.d;
import Ds.C2880a;
import Kk.C3532b;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.common.HTMLTagSupport;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\b89:;<=>?B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001f\u001a\u00020 H\u0016J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003JC\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0006\u0010,\u001a\u00020 J\u0013\u0010-\u001a\u00020\u001b2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020 HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u001b¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR$\u0010\"\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010%¨\u0006@"}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/common/HTMLTagSupport;", "Landroid/os/Parcelable;", "centerBlock", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$CenterBlock;", "settings", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$Settings;", "leftBlock", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$LeftBlock;", "rightBlock", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$RightBlock;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO$CenterBlock;Lru/ozon/uni/atoms/data/dsCell/CellDTO$Settings;Lru/ozon/uni/atoms/data/dsCell/CellDTO$LeftBlock;Lru/ozon/uni/atoms/data/dsCell/CellDTO$RightBlock;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getCenterBlock", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO$CenterBlock;", "getSettings", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO$Settings;", "getLeftBlock", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO$LeftBlock;", "getRightBlock", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO$RightBlock;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "isDisabled", "", "isDisabled$annotations", "()V", "()Z", "getItemType", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "tagSupported", "getTagSupported", "setTagSupported", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ContainerBlockDTO", "AddonBlockDTO", "BlockAlignment", "LeftBlock", "CenterBlock", "RightBlock", "Settings", "CellText", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CellDTO extends AtomDTO implements HTMLTagSupport, Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CellDTO> CREATOR = new Creator();

    @NotNull
    private final CenterBlock centerBlock;
    private final CommonControlSettings common;
    private final boolean isDisabled;
    private final LeftBlock leftBlock;
    private final RightBlock rightBlock;
    private final Settings settings;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellDTO$AddonBlockDTO;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$BlockAlignment;", "getAlignment", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO$BlockAlignment;", "alignment", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getHorizontalSpaceBetween", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "horizontalSpaceBetween", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AddonBlockDTO {
        BlockAlignment getAlignment();

        CommonCellSettings.LayoutPadding getHorizontalSpaceBetween();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellDTO$BlockAlignment;", "", "alignment", "Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;)V", "getAlignment", "()Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;", "ALIGNMENT_INVALID", "ALIGNMENT_TOP", "ALIGNMENT_CENTER", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BlockAlignment {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BlockAlignment[] $VALUES;
        public static final BlockAlignment ALIGNMENT_CENTER;
        public static final BlockAlignment ALIGNMENT_INVALID;
        public static final BlockAlignment ALIGNMENT_TOP;

        @NotNull
        private final CellView.AddonBlock.Alignment alignment;

        private static final /* synthetic */ BlockAlignment[] $values() {
            return new BlockAlignment[]{ALIGNMENT_INVALID, ALIGNMENT_TOP, ALIGNMENT_CENTER};
        }

        static {
            CellView.AddonBlock.Alignment alignment = CellView.AddonBlock.Alignment.ALIGNMENT_CENTER;
            ALIGNMENT_INVALID = new BlockAlignment("ALIGNMENT_INVALID", 0, alignment);
            ALIGNMENT_TOP = new BlockAlignment("ALIGNMENT_TOP", 1, CellView.AddonBlock.Alignment.ALIGNMENT_TOP);
            ALIGNMENT_CENTER = new BlockAlignment("ALIGNMENT_CENTER", 2, alignment);
            BlockAlignment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BlockAlignment(String str, int i11, CellView.AddonBlock.Alignment alignment) {
            this.alignment = alignment;
        }

        @NotNull
        public static a<BlockAlignment> getEntries() {
            return $ENTRIES;
        }

        public static BlockAlignment valueOf(String str) {
            return (BlockAlignment) Enum.valueOf(BlockAlignment.class, str);
        }

        public static BlockAlignment[] values() {
            return (BlockAlignment[]) $VALUES.clone();
        }

        @NotNull
        public final CellView.AddonBlock.Alignment getAlignment() {
            return this.alignment;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellDTO$ContainerBlockDTO;", "", "isEmpty", "", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ContainerBlockDTO {
        /* renamed from: isEmpty */
        boolean getIsEmpty();
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CellDTO> {
        @Override // android.os.Parcelable.Creator
        public final CellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CellDTO(CenterBlock.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Settings.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LeftBlock.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RightBlock.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CellDTO[] newArray(int i11) {
            return new CellDTO[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Bg\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003Ji\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0006\u00103\u001a\u000204J\u0013\u00105\u001a\u00020'2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000204HÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000204R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0019R\u001a\u0010&\u001a\u00020'X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010)¨\u0006@"}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellDTO$LeftBlock;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$ContainerBlockDTO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$AddonBlockDTO;", "Landroid/os/Parcelable;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "alignment", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$BlockAlignment;", "topPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "rightPadding", "horizontalSpaceBetween", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "control", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/dsCell/CellDTO$BlockAlignment;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/AtomDTO;)V", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getAlignment", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO$BlockAlignment;", "getTopPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getRightPadding", "getHorizontalSpaceBetween", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getControl", "()Lru/ozon/uni/atoms/data/AtomDTO;", "paddingToCenter", "getPaddingToCenter$annotations", "()V", "getPaddingToCenter", "isEmpty", "", "isEmpty$annotations", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LeftBlock implements ContainerBlockDTO, AddonBlockDTO, Parcelable {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<LeftBlock> CREATOR = new Creator();

        @EnumNullFallback
        private final BlockAlignment alignment;
        private final CommonControlSettings common;
        private final AtomDTO control;
        private final CommonCellSettings.LayoutPadding horizontalSpaceBetween;
        private final IconDTO icon;
        private final ImageDTO image;
        private final boolean isEmpty;
        private final CommonCellSettings.LayoutPadding paddingToCenter;
        private final CommonCellSettings.LayoutPadding rightPadding;
        private final CommonCellSettings.LayoutPadding topPadding;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LeftBlock> {
            @Override // android.os.Parcelable.Creator
            public final LeftBlock createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LeftBlock(parcel.readInt() == 0 ? null : CommonControlSettings.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BlockAlignment.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : IconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ImageDTO.CREATOR.createFromParcel(parcel) : null, (AtomDTO) parcel.readParcelable(LeftBlock.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final LeftBlock[] newArray(int i11) {
                return new LeftBlock[i11];
            }
        }

        public LeftBlock() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        public static /* synthetic */ LeftBlock copy$default(LeftBlock leftBlock, CommonControlSettings commonControlSettings, BlockAlignment blockAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, IconDTO iconDTO, ImageDTO imageDTO, AtomDTO atomDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                commonControlSettings = leftBlock.common;
            }
            if ((i11 & 2) != 0) {
                blockAlignment = leftBlock.alignment;
            }
            if ((i11 & 4) != 0) {
                layoutPadding = leftBlock.topPadding;
            }
            if ((i11 & 8) != 0) {
                layoutPadding2 = leftBlock.rightPadding;
            }
            if ((i11 & 16) != 0) {
                layoutPadding3 = leftBlock.horizontalSpaceBetween;
            }
            if ((i11 & 32) != 0) {
                iconDTO = leftBlock.icon;
            }
            if ((i11 & 64) != 0) {
                imageDTO = leftBlock.image;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                atomDTO = leftBlock.control;
            }
            ImageDTO imageDTO2 = imageDTO;
            AtomDTO atomDTO2 = atomDTO;
            CommonCellSettings.LayoutPadding layoutPadding4 = layoutPadding3;
            IconDTO iconDTO2 = iconDTO;
            return leftBlock.copy(commonControlSettings, blockAlignment, layoutPadding, layoutPadding2, layoutPadding4, iconDTO2, imageDTO2, atomDTO2);
        }

        public static /* synthetic */ void getPaddingToCenter$annotations() {
        }

        public static /* synthetic */ void isEmpty$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component2, reason: from getter */
        public final BlockAlignment getAlignment() {
            return this.alignment;
        }

        /* renamed from: component3, reason: from getter */
        public final CommonCellSettings.LayoutPadding getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonCellSettings.LayoutPadding getRightPadding() {
            return this.rightPadding;
        }

        /* renamed from: component5, reason: from getter */
        public final CommonCellSettings.LayoutPadding getHorizontalSpaceBetween() {
            return this.horizontalSpaceBetween;
        }

        /* renamed from: component6, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component7, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        /* renamed from: component8, reason: from getter */
        public final AtomDTO getControl() {
            return this.control;
        }

        @NotNull
        public final LeftBlock copy(CommonControlSettings common, BlockAlignment alignment, CommonCellSettings.LayoutPadding topPadding, CommonCellSettings.LayoutPadding rightPadding, CommonCellSettings.LayoutPadding horizontalSpaceBetween, IconDTO icon, ImageDTO image, @CellControlAtom AtomDTO control) {
            return new LeftBlock(common, alignment, topPadding, rightPadding, horizontalSpaceBetween, icon, image, control);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeftBlock)) {
                return false;
            }
            LeftBlock leftBlock = (LeftBlock) other;
            return Intrinsics.d(this.common, leftBlock.common) && this.alignment == leftBlock.alignment && this.topPadding == leftBlock.topPadding && this.rightPadding == leftBlock.rightPadding && this.horizontalSpaceBetween == leftBlock.horizontalSpaceBetween && Intrinsics.d(this.icon, leftBlock.icon) && Intrinsics.d(this.image, leftBlock.image) && Intrinsics.d(this.control, leftBlock.control);
        }

        @Override // ru.ozon.uni.atoms.data.dsCell.CellDTO.AddonBlockDTO
        public BlockAlignment getAlignment() {
            return this.alignment;
        }

        public CommonControlSettings getCommon() {
            return this.common;
        }

        public final AtomDTO getControl() {
            return this.control;
        }

        @Override // ru.ozon.uni.atoms.data.dsCell.CellDTO.AddonBlockDTO
        public CommonCellSettings.LayoutPadding getHorizontalSpaceBetween() {
            return this.horizontalSpaceBetween;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public final ImageDTO getImage() {
            return this.image;
        }

        public CommonCellSettings.LayoutPadding getPaddingToCenter() {
            return this.paddingToCenter;
        }

        public final CommonCellSettings.LayoutPadding getRightPadding() {
            return this.rightPadding;
        }

        public CommonCellSettings.LayoutPadding getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            CommonControlSettings commonControlSettings = this.common;
            int hashCode = (commonControlSettings == null ? 0 : commonControlSettings.hashCode()) * 31;
            BlockAlignment blockAlignment = this.alignment;
            int hashCode2 = (hashCode + (blockAlignment == null ? 0 : blockAlignment.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding = this.topPadding;
            int hashCode3 = (hashCode2 + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding2 = this.rightPadding;
            int hashCode4 = (hashCode3 + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding3 = this.horizontalSpaceBetween;
            int hashCode5 = (hashCode4 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode6 = (hashCode5 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            ImageDTO imageDTO = this.image;
            int hashCode7 = (hashCode6 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            AtomDTO atomDTO = this.control;
            return hashCode7 + (atomDTO != null ? atomDTO.hashCode() : 0);
        }

        @Override // ru.ozon.uni.atoms.data.dsCell.CellDTO.ContainerBlockDTO
        /* renamed from: isEmpty, reason: from getter */
        public boolean getIsEmpty() {
            return this.isEmpty;
        }

        @NotNull
        public String toString() {
            CommonControlSettings commonControlSettings = this.common;
            BlockAlignment blockAlignment = this.alignment;
            CommonCellSettings.LayoutPadding layoutPadding = this.topPadding;
            CommonCellSettings.LayoutPadding layoutPadding2 = this.rightPadding;
            CommonCellSettings.LayoutPadding layoutPadding3 = this.horizontalSpaceBetween;
            IconDTO iconDTO = this.icon;
            ImageDTO imageDTO = this.image;
            AtomDTO atomDTO = this.control;
            StringBuilder sb2 = new StringBuilder("LeftBlock(common=");
            sb2.append(commonControlSettings);
            sb2.append(", alignment=");
            sb2.append(blockAlignment);
            sb2.append(", topPadding=");
            Ep.a.f(sb2, layoutPadding, ", rightPadding=", layoutPadding2, ", horizontalSpaceBetween=");
            sb2.append(layoutPadding3);
            sb2.append(", icon=");
            sb2.append(iconDTO);
            sb2.append(", image=");
            sb2.append(imageDTO);
            sb2.append(", control=");
            sb2.append(atomDTO);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            CommonControlSettings commonControlSettings = this.common;
            if (commonControlSettings == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                commonControlSettings.writeToParcel(dest, flags);
            }
            BlockAlignment blockAlignment = this.alignment;
            if (blockAlignment == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(blockAlignment.name());
            }
            CommonCellSettings.LayoutPadding layoutPadding = this.topPadding;
            if (layoutPadding == null) {
                dest.writeInt(0);
            } else {
                d.d(dest, 1, layoutPadding);
            }
            CommonCellSettings.LayoutPadding layoutPadding2 = this.rightPadding;
            if (layoutPadding2 == null) {
                dest.writeInt(0);
            } else {
                d.d(dest, 1, layoutPadding2);
            }
            CommonCellSettings.LayoutPadding layoutPadding3 = this.horizontalSpaceBetween;
            if (layoutPadding3 == null) {
                dest.writeInt(0);
            } else {
                d.d(dest, 1, layoutPadding3);
            }
            IconDTO iconDTO = this.icon;
            if (iconDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                iconDTO.writeToParcel(dest, flags);
            }
            ImageDTO imageDTO = this.image;
            if (imageDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                imageDTO.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.control, flags);
        }

        public LeftBlock(CommonControlSettings commonControlSettings, BlockAlignment blockAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, IconDTO iconDTO, ImageDTO imageDTO, @CellControlAtom AtomDTO atomDTO) {
            this.common = commonControlSettings;
            this.alignment = blockAlignment;
            this.topPadding = layoutPadding;
            this.rightPadding = layoutPadding2;
            this.horizontalSpaceBetween = layoutPadding3;
            this.icon = iconDTO;
            this.image = imageDTO;
            this.control = atomDTO;
            this.paddingToCenter = layoutPadding2;
            this.isEmpty = iconDTO == null && imageDTO == null && atomDTO == null;
        }

        public /* synthetic */ LeftBlock(CommonControlSettings commonControlSettings, BlockAlignment blockAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, IconDTO iconDTO, ImageDTO imageDTO, AtomDTO atomDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : commonControlSettings, (i11 & 2) != 0 ? BlockAlignment.ALIGNMENT_CENTER : blockAlignment, (i11 & 4) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding, (i11 & 8) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding2, (i11 & 16) != 0 ? CommonCellSettings.LayoutPadding.PADDING_350 : layoutPadding3, (i11 & 32) != 0 ? null : iconDTO, (i11 & 64) != 0 ? null : imageDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : atomDTO);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0097\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0099\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0006\u0010G\u001a\u00020HJ\u0013\u0010I\u001a\u0002072\b\u0010J\u001a\u0004\u0018\u00010KHÖ\u0003J\t\u0010L\u001a\u00020HHÖ\u0001J\t\u0010M\u001a\u00020NHÖ\u0001J\u0016\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020HR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u00104\u001a\u0004\b5\u0010!R\u001a\u00106\u001a\u000207X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u00104\u001a\u0004\b6\u00109¨\u0006T"}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellDTO$RightBlock;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$ContainerBlockDTO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$AddonBlockDTO;", "Landroid/os/Parcelable;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "alignment", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$BlockAlignment;", "topPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "leftPadding", "horizontalSpaceBetween", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "indicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "control", "Lru/ozon/uni/atoms/data/AtomDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/dsCell/CellDTO$BlockAlignment;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getAlignment", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO$BlockAlignment;", "getTopPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getLeftPadding", "getHorizontalSpaceBetween", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getControl", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "paddingToCenter", "getPaddingToCenter$annotations", "()V", "getPaddingToCenter", "isEmpty", "", "isEmpty$annotations", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RightBlock implements ContainerBlockDTO, AddonBlockDTO, Parcelable {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<RightBlock> CREATOR = new Creator();
        private final BlockAlignment alignment;
        private final BadgeDTO badge;
        private final ButtonV3DTO button;
        private final CommonControlSettings common;
        private final AtomDTO control;
        private final CommonCellSettings.LayoutPadding horizontalSpaceBetween;
        private final IconDTO icon;
        private final ImageDTO image;
        private final IndicatorDTO indicator;
        private final boolean isEmpty;
        private final CommonCellSettings.LayoutPadding leftPadding;
        private final CommonCellSettings.LayoutPadding paddingToCenter;
        private final PriceDTO price;
        private final CommonCellSettings.LayoutPadding topPadding;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RightBlock> {
            @Override // android.os.Parcelable.Creator
            public final RightBlock createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RightBlock(parcel.readInt() == 0 ? null : CommonControlSettings.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BlockAlignment.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : BadgeDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IndicatorDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ButtonV3DTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ImageDTO.CREATOR.createFromParcel(parcel), (AtomDTO) parcel.readParcelable(RightBlock.class.getClassLoader()), parcel.readInt() != 0 ? PriceDTO.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final RightBlock[] newArray(int i11) {
                return new RightBlock[i11];
            }
        }

        public RightBlock() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        }

        public static /* synthetic */ RightBlock copy$default(RightBlock rightBlock, CommonControlSettings commonControlSettings, BlockAlignment blockAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, BadgeDTO badgeDTO, IndicatorDTO indicatorDTO, IconDTO iconDTO, ButtonV3DTO buttonV3DTO, ImageDTO imageDTO, AtomDTO atomDTO, PriceDTO priceDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                commonControlSettings = rightBlock.common;
            }
            if ((i11 & 2) != 0) {
                blockAlignment = rightBlock.alignment;
            }
            if ((i11 & 4) != 0) {
                layoutPadding = rightBlock.topPadding;
            }
            if ((i11 & 8) != 0) {
                layoutPadding2 = rightBlock.leftPadding;
            }
            if ((i11 & 16) != 0) {
                layoutPadding3 = rightBlock.horizontalSpaceBetween;
            }
            if ((i11 & 32) != 0) {
                badgeDTO = rightBlock.badge;
            }
            if ((i11 & 64) != 0) {
                indicatorDTO = rightBlock.indicator;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                iconDTO = rightBlock.icon;
            }
            if ((i11 & 256) != 0) {
                buttonV3DTO = rightBlock.button;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                imageDTO = rightBlock.image;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                atomDTO = rightBlock.control;
            }
            if ((i11 & 2048) != 0) {
                priceDTO = rightBlock.price;
            }
            AtomDTO atomDTO2 = atomDTO;
            PriceDTO priceDTO2 = priceDTO;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            ImageDTO imageDTO2 = imageDTO;
            IndicatorDTO indicatorDTO2 = indicatorDTO;
            IconDTO iconDTO2 = iconDTO;
            CommonCellSettings.LayoutPadding layoutPadding4 = layoutPadding3;
            BadgeDTO badgeDTO2 = badgeDTO;
            return rightBlock.copy(commonControlSettings, blockAlignment, layoutPadding, layoutPadding2, layoutPadding4, badgeDTO2, indicatorDTO2, iconDTO2, buttonV3DTO2, imageDTO2, atomDTO2, priceDTO2);
        }

        public static /* synthetic */ void getPaddingToCenter$annotations() {
        }

        public static /* synthetic */ void isEmpty$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component10, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        /* renamed from: component11, reason: from getter */
        public final AtomDTO getControl() {
            return this.control;
        }

        /* renamed from: component12, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component2, reason: from getter */
        public final BlockAlignment getAlignment() {
            return this.alignment;
        }

        /* renamed from: component3, reason: from getter */
        public final CommonCellSettings.LayoutPadding getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonCellSettings.LayoutPadding getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component5, reason: from getter */
        public final CommonCellSettings.LayoutPadding getHorizontalSpaceBetween() {
            return this.horizontalSpaceBetween;
        }

        /* renamed from: component6, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component7, reason: from getter */
        public final IndicatorDTO getIndicator() {
            return this.indicator;
        }

        /* renamed from: component8, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component9, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        public final RightBlock copy(CommonControlSettings common, BlockAlignment alignment, CommonCellSettings.LayoutPadding topPadding, CommonCellSettings.LayoutPadding leftPadding, CommonCellSettings.LayoutPadding horizontalSpaceBetween, BadgeDTO badge, IndicatorDTO indicator, IconDTO icon, ButtonV3DTO button, ImageDTO image, @CellControlAtom AtomDTO control, PriceDTO price) {
            return new RightBlock(common, alignment, topPadding, leftPadding, horizontalSpaceBetween, badge, indicator, icon, button, image, control, price);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RightBlock)) {
                return false;
            }
            RightBlock rightBlock = (RightBlock) other;
            return Intrinsics.d(this.common, rightBlock.common) && this.alignment == rightBlock.alignment && this.topPadding == rightBlock.topPadding && this.leftPadding == rightBlock.leftPadding && this.horizontalSpaceBetween == rightBlock.horizontalSpaceBetween && Intrinsics.d(this.badge, rightBlock.badge) && Intrinsics.d(this.indicator, rightBlock.indicator) && Intrinsics.d(this.icon, rightBlock.icon) && Intrinsics.d(this.button, rightBlock.button) && Intrinsics.d(this.image, rightBlock.image) && Intrinsics.d(this.control, rightBlock.control) && Intrinsics.d(this.price, rightBlock.price);
        }

        @Override // ru.ozon.uni.atoms.data.dsCell.CellDTO.AddonBlockDTO
        public BlockAlignment getAlignment() {
            return this.alignment;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public CommonControlSettings getCommon() {
            return this.common;
        }

        public final AtomDTO getControl() {
            return this.control;
        }

        @Override // ru.ozon.uni.atoms.data.dsCell.CellDTO.AddonBlockDTO
        public CommonCellSettings.LayoutPadding getHorizontalSpaceBetween() {
            return this.horizontalSpaceBetween;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public final ImageDTO getImage() {
            return this.image;
        }

        public final IndicatorDTO getIndicator() {
            return this.indicator;
        }

        public final CommonCellSettings.LayoutPadding getLeftPadding() {
            return this.leftPadding;
        }

        public CommonCellSettings.LayoutPadding getPaddingToCenter() {
            return this.paddingToCenter;
        }

        public final PriceDTO getPrice() {
            return this.price;
        }

        public CommonCellSettings.LayoutPadding getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            CommonControlSettings commonControlSettings = this.common;
            int hashCode = (commonControlSettings == null ? 0 : commonControlSettings.hashCode()) * 31;
            BlockAlignment blockAlignment = this.alignment;
            int hashCode2 = (hashCode + (blockAlignment == null ? 0 : blockAlignment.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding = this.topPadding;
            int hashCode3 = (hashCode2 + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding2 = this.leftPadding;
            int hashCode4 = (hashCode3 + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding3 = this.horizontalSpaceBetween;
            int hashCode5 = (hashCode4 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode6 = (hashCode5 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            IndicatorDTO indicatorDTO = this.indicator;
            int hashCode7 = (hashCode6 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode8 = (hashCode7 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.button;
            int hashCode9 = (hashCode8 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            ImageDTO imageDTO = this.image;
            int hashCode10 = (hashCode9 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            AtomDTO atomDTO = this.control;
            int hashCode11 = (hashCode10 + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
            PriceDTO priceDTO = this.price;
            return hashCode11 + (priceDTO != null ? priceDTO.hashCode() : 0);
        }

        @Override // ru.ozon.uni.atoms.data.dsCell.CellDTO.ContainerBlockDTO
        /* renamed from: isEmpty, reason: from getter */
        public boolean getIsEmpty() {
            return this.isEmpty;
        }

        @NotNull
        public String toString() {
            CommonControlSettings commonControlSettings = this.common;
            BlockAlignment blockAlignment = this.alignment;
            CommonCellSettings.LayoutPadding layoutPadding = this.topPadding;
            CommonCellSettings.LayoutPadding layoutPadding2 = this.leftPadding;
            CommonCellSettings.LayoutPadding layoutPadding3 = this.horizontalSpaceBetween;
            BadgeDTO badgeDTO = this.badge;
            IndicatorDTO indicatorDTO = this.indicator;
            IconDTO iconDTO = this.icon;
            ButtonV3DTO buttonV3DTO = this.button;
            ImageDTO imageDTO = this.image;
            AtomDTO atomDTO = this.control;
            PriceDTO priceDTO = this.price;
            StringBuilder sb2 = new StringBuilder("RightBlock(common=");
            sb2.append(commonControlSettings);
            sb2.append(", alignment=");
            sb2.append(blockAlignment);
            sb2.append(", topPadding=");
            Ep.a.f(sb2, layoutPadding, ", leftPadding=", layoutPadding2, ", horizontalSpaceBetween=");
            sb2.append(layoutPadding3);
            sb2.append(", badge=");
            sb2.append(badgeDTO);
            sb2.append(", indicator=");
            sb2.append(indicatorDTO);
            sb2.append(", icon=");
            sb2.append(iconDTO);
            sb2.append(", button=");
            sb2.append(buttonV3DTO);
            sb2.append(", image=");
            sb2.append(imageDTO);
            sb2.append(", control=");
            sb2.append(atomDTO);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            CommonControlSettings commonControlSettings = this.common;
            if (commonControlSettings == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                commonControlSettings.writeToParcel(dest, flags);
            }
            BlockAlignment blockAlignment = this.alignment;
            if (blockAlignment == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(blockAlignment.name());
            }
            CommonCellSettings.LayoutPadding layoutPadding = this.topPadding;
            if (layoutPadding == null) {
                dest.writeInt(0);
            } else {
                d.d(dest, 1, layoutPadding);
            }
            CommonCellSettings.LayoutPadding layoutPadding2 = this.leftPadding;
            if (layoutPadding2 == null) {
                dest.writeInt(0);
            } else {
                d.d(dest, 1, layoutPadding2);
            }
            CommonCellSettings.LayoutPadding layoutPadding3 = this.horizontalSpaceBetween;
            if (layoutPadding3 == null) {
                dest.writeInt(0);
            } else {
                d.d(dest, 1, layoutPadding3);
            }
            BadgeDTO badgeDTO = this.badge;
            if (badgeDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                badgeDTO.writeToParcel(dest, flags);
            }
            IndicatorDTO indicatorDTO = this.indicator;
            if (indicatorDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                indicatorDTO.writeToParcel(dest, flags);
            }
            IconDTO iconDTO = this.icon;
            if (iconDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                iconDTO.writeToParcel(dest, flags);
            }
            ButtonV3DTO buttonV3DTO = this.button;
            if (buttonV3DTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonV3DTO.writeToParcel(dest, flags);
            }
            ImageDTO imageDTO = this.image;
            if (imageDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                imageDTO.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.control, flags);
            PriceDTO priceDTO = this.price;
            if (priceDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                priceDTO.writeToParcel(dest, flags);
            }
        }

        public RightBlock(CommonControlSettings commonControlSettings, BlockAlignment blockAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, BadgeDTO badgeDTO, IndicatorDTO indicatorDTO, IconDTO iconDTO, ButtonV3DTO buttonV3DTO, ImageDTO imageDTO, @CellControlAtom AtomDTO atomDTO, PriceDTO priceDTO) {
            this.common = commonControlSettings;
            this.alignment = blockAlignment;
            this.topPadding = layoutPadding;
            this.leftPadding = layoutPadding2;
            this.horizontalSpaceBetween = layoutPadding3;
            this.badge = badgeDTO;
            this.indicator = indicatorDTO;
            this.icon = iconDTO;
            this.button = buttonV3DTO;
            this.image = imageDTO;
            this.control = atomDTO;
            this.price = priceDTO;
            this.paddingToCenter = layoutPadding2;
            this.isEmpty = badgeDTO == null && indicatorDTO == null && iconDTO == null && buttonV3DTO == null && imageDTO == null && atomDTO == null && priceDTO == null;
        }

        public /* synthetic */ RightBlock(CommonControlSettings commonControlSettings, BlockAlignment blockAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, BadgeDTO badgeDTO, IndicatorDTO indicatorDTO, IconDTO iconDTO, ButtonV3DTO buttonV3DTO, ImageDTO imageDTO, AtomDTO atomDTO, PriceDTO priceDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : commonControlSettings, (i11 & 2) != 0 ? BlockAlignment.ALIGNMENT_CENTER : blockAlignment, (i11 & 4) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding, (i11 & 8) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding2, (i11 & 16) != 0 ? CommonCellSettings.LayoutPadding.PADDING_300 : layoutPadding3, (i11 & 32) != 0 ? null : badgeDTO, (i11 & 64) != 0 ? null : indicatorDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : iconDTO, (i11 & 256) != 0 ? null : buttonV3DTO, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : imageDTO, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : atomDTO, (i11 & 2048) != 0 ? null : priceDTO);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0092\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010-J\u0006\u0010.\u001a\u00020/J\u0013\u00100\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020/HÖ\u0001J\t\u00104\u001a\u00020\u000bHÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020/R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\t\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u000f\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001c¨\u0006:"}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellDTO$Settings;", "Landroid/os/Parcelable;", "topPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "bottomPadding", "leftPadding", "rightPadding", "disableSeparator", "", "isDisabled", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "backgroundHoverColor", "isAutoToggleDisabled", "separatorColor", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottomPadding", "getLeftPadding", "getRightPadding", "getDisableSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBackgroundHoverColor", "getSeparatorColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/uni/atoms/data/dsCell/CellDTO$Settings;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Settings implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new Creator();
        private final String backgroundColor;
        private final String backgroundHoverColor;
        private final CommonCellSettings.LayoutPadding bottomPadding;
        private final CornerRadius cornerRadius;
        private final Boolean disableSeparator;
        private final transient Boolean isAutoToggleDisabled;
        private final Boolean isDisabled;
        private final CommonCellSettings.LayoutPadding leftPadding;
        private final CommonCellSettings.LayoutPadding rightPadding;
        private final String separatorColor;
        private final CommonCellSettings.LayoutPadding topPadding;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Settings> {
            @Override // android.os.Parcelable.Creator
            public final Settings createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Boolean bool = null;
                CommonCellSettings.LayoutPadding valueOf3 = parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
                CommonCellSettings.LayoutPadding valueOf4 = parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
                CommonCellSettings.LayoutPadding valueOf5 = parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
                CommonCellSettings.LayoutPadding valueOf6 = parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString = parcel.readString();
                CornerRadius valueOf7 = parcel.readInt() == 0 ? null : CornerRadius.valueOf(parcel.readString());
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Settings(valueOf3, valueOf4, valueOf5, valueOf6, valueOf, valueOf2, readString, valueOf7, readString2, bool, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Settings[] newArray(int i11) {
                return new Settings[i11];
            }
        }

        public Settings() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public static /* synthetic */ Settings copy$default(Settings settings, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, Boolean bool, Boolean bool2, String str, CornerRadius cornerRadius, String str2, Boolean bool3, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                layoutPadding = settings.topPadding;
            }
            if ((i11 & 2) != 0) {
                layoutPadding2 = settings.bottomPadding;
            }
            if ((i11 & 4) != 0) {
                layoutPadding3 = settings.leftPadding;
            }
            if ((i11 & 8) != 0) {
                layoutPadding4 = settings.rightPadding;
            }
            if ((i11 & 16) != 0) {
                bool = settings.disableSeparator;
            }
            if ((i11 & 32) != 0) {
                bool2 = settings.isDisabled;
            }
            if ((i11 & 64) != 0) {
                str = settings.backgroundColor;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                cornerRadius = settings.cornerRadius;
            }
            if ((i11 & 256) != 0) {
                str2 = settings.backgroundHoverColor;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                bool3 = settings.isAutoToggleDisabled;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                str3 = settings.separatorColor;
            }
            Boolean bool4 = bool3;
            String str4 = str3;
            CornerRadius cornerRadius2 = cornerRadius;
            String str5 = str2;
            Boolean bool5 = bool2;
            String str6 = str;
            Boolean bool6 = bool;
            CommonCellSettings.LayoutPadding layoutPadding5 = layoutPadding3;
            return settings.copy(layoutPadding, layoutPadding2, layoutPadding5, layoutPadding4, bool6, bool5, str6, cornerRadius2, str5, bool4, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final CommonCellSettings.LayoutPadding getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component10, reason: from getter */
        public final Boolean getIsAutoToggleDisabled() {
            return this.isAutoToggleDisabled;
        }

        /* renamed from: component11, reason: from getter */
        public final String getSeparatorColor() {
            return this.separatorColor;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonCellSettings.LayoutPadding getBottomPadding() {
            return this.bottomPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final CommonCellSettings.LayoutPadding getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonCellSettings.LayoutPadding getRightPadding() {
            return this.rightPadding;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getDisableSeparator() {
            return this.disableSeparator;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getIsDisabled() {
            return this.isDisabled;
        }

        /* renamed from: component7, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component8, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: component9, reason: from getter */
        public final String getBackgroundHoverColor() {
            return this.backgroundHoverColor;
        }

        @NotNull
        public final Settings copy(CommonCellSettings.LayoutPadding topPadding, CommonCellSettings.LayoutPadding bottomPadding, CommonCellSettings.LayoutPadding leftPadding, CommonCellSettings.LayoutPadding rightPadding, Boolean disableSeparator, Boolean isDisabled, String backgroundColor, CornerRadius cornerRadius, String backgroundHoverColor, Boolean isAutoToggleDisabled, String separatorColor) {
            return new Settings(topPadding, bottomPadding, leftPadding, rightPadding, disableSeparator, isDisabled, backgroundColor, cornerRadius, backgroundHoverColor, isAutoToggleDisabled, separatorColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) other;
            return this.topPadding == settings.topPadding && this.bottomPadding == settings.bottomPadding && this.leftPadding == settings.leftPadding && this.rightPadding == settings.rightPadding && Intrinsics.d(this.disableSeparator, settings.disableSeparator) && Intrinsics.d(this.isDisabled, settings.isDisabled) && Intrinsics.d(this.backgroundColor, settings.backgroundColor) && this.cornerRadius == settings.cornerRadius && Intrinsics.d(this.backgroundHoverColor, settings.backgroundHoverColor) && Intrinsics.d(this.isAutoToggleDisabled, settings.isAutoToggleDisabled) && Intrinsics.d(this.separatorColor, settings.separatorColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBackgroundHoverColor() {
            return this.backgroundHoverColor;
        }

        public final CommonCellSettings.LayoutPadding getBottomPadding() {
            return this.bottomPadding;
        }

        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final Boolean getDisableSeparator() {
            return this.disableSeparator;
        }

        public final CommonCellSettings.LayoutPadding getLeftPadding() {
            return this.leftPadding;
        }

        public final CommonCellSettings.LayoutPadding getRightPadding() {
            return this.rightPadding;
        }

        public final String getSeparatorColor() {
            return this.separatorColor;
        }

        public final CommonCellSettings.LayoutPadding getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            CommonCellSettings.LayoutPadding layoutPadding = this.topPadding;
            int hashCode = (layoutPadding == null ? 0 : layoutPadding.hashCode()) * 31;
            CommonCellSettings.LayoutPadding layoutPadding2 = this.bottomPadding;
            int hashCode2 = (hashCode + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding3 = this.leftPadding;
            int hashCode3 = (hashCode2 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding4 = this.rightPadding;
            int hashCode4 = (hashCode3 + (layoutPadding4 == null ? 0 : layoutPadding4.hashCode())) * 31;
            Boolean bool = this.disableSeparator;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isDisabled;
            int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            CornerRadius cornerRadius = this.cornerRadius;
            int hashCode8 = (hashCode7 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
            String str2 = this.backgroundHoverColor;
            int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool3 = this.isAutoToggleDisabled;
            int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str3 = this.separatorColor;
            return hashCode10 + (str3 != null ? str3.hashCode() : 0);
        }

        public final Boolean isAutoToggleDisabled() {
            return this.isAutoToggleDisabled;
        }

        public final Boolean isDisabled() {
            return this.isDisabled;
        }

        @NotNull
        public String toString() {
            CommonCellSettings.LayoutPadding layoutPadding = this.topPadding;
            CommonCellSettings.LayoutPadding layoutPadding2 = this.bottomPadding;
            CommonCellSettings.LayoutPadding layoutPadding3 = this.leftPadding;
            CommonCellSettings.LayoutPadding layoutPadding4 = this.rightPadding;
            Boolean bool = this.disableSeparator;
            Boolean bool2 = this.isDisabled;
            String str = this.backgroundColor;
            CornerRadius cornerRadius = this.cornerRadius;
            String str2 = this.backgroundHoverColor;
            Boolean bool3 = this.isAutoToggleDisabled;
            String str3 = this.separatorColor;
            StringBuilder sb2 = new StringBuilder("Settings(topPadding=");
            sb2.append(layoutPadding);
            sb2.append(", bottomPadding=");
            sb2.append(layoutPadding2);
            sb2.append(", leftPadding=");
            Ep.a.f(sb2, layoutPadding3, ", rightPadding=", layoutPadding4, ", disableSeparator=");
            h.h(sb2, bool, ", isDisabled=", bool2, ", backgroundColor=");
            sb2.append(str);
            sb2.append(", cornerRadius=");
            sb2.append(cornerRadius);
            sb2.append(", backgroundHoverColor=");
            Sh.a.d(bool3, str2, ", isAutoToggleDisabled=", ", separatorColor=", sb2);
            return o0.c(sb2, str3, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            CommonCellSettings.LayoutPadding layoutPadding = this.topPadding;
            if (layoutPadding == null) {
                dest.writeInt(0);
            } else {
                d.d(dest, 1, layoutPadding);
            }
            CommonCellSettings.LayoutPadding layoutPadding2 = this.bottomPadding;
            if (layoutPadding2 == null) {
                dest.writeInt(0);
            } else {
                d.d(dest, 1, layoutPadding2);
            }
            CommonCellSettings.LayoutPadding layoutPadding3 = this.leftPadding;
            if (layoutPadding3 == null) {
                dest.writeInt(0);
            } else {
                d.d(dest, 1, layoutPadding3);
            }
            CommonCellSettings.LayoutPadding layoutPadding4 = this.rightPadding;
            if (layoutPadding4 == null) {
                dest.writeInt(0);
            } else {
                d.d(dest, 1, layoutPadding4);
            }
            Boolean bool = this.disableSeparator;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool);
            }
            Boolean bool2 = this.isDisabled;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool2);
            }
            dest.writeString(this.backgroundColor);
            CornerRadius cornerRadius = this.cornerRadius;
            if (cornerRadius == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cornerRadius.name());
            }
            dest.writeString(this.backgroundHoverColor);
            Boolean bool3 = this.isAutoToggleDisabled;
            if (bool3 == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool3);
            }
            dest.writeString(this.separatorColor);
        }

        public Settings(CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, Boolean bool, Boolean bool2, String str, CornerRadius cornerRadius, String str2, Boolean bool3, String str3) {
            this.topPadding = layoutPadding;
            this.bottomPadding = layoutPadding2;
            this.leftPadding = layoutPadding3;
            this.rightPadding = layoutPadding4;
            this.disableSeparator = bool;
            this.isDisabled = bool2;
            this.backgroundColor = str;
            this.cornerRadius = cornerRadius;
            this.backgroundHoverColor = str2;
            this.isAutoToggleDisabled = bool3;
            this.separatorColor = str3;
        }

        public /* synthetic */ Settings(CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, Boolean bool, Boolean bool2, String str, CornerRadius cornerRadius, String str2, Boolean bool3, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding, (i11 & 2) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding2, (i11 & 4) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding3, (i11 & 8) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding4, (i11 & 16) != 0 ? Boolean.FALSE : bool, (i11 & 32) != 0 ? Boolean.FALSE : bool2, (i11 & 64) != 0 ? null : str, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i11 & 256) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? Boolean.FALSE : bool3, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? UniColors.GRAPHIC_NEUTRAL.getToken() : str3);
        }
    }

    public /* synthetic */ CellDTO(CenterBlock centerBlock, Settings settings, LeftBlock leftBlock, RightBlock rightBlock, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(centerBlock, (i11 & 2) != 0 ? null : settings, (i11 & 4) != 0 ? null : leftBlock, (i11 & 8) != 0 ? null : rightBlock, (i11 & 16) != 0 ? null : commonControlSettings);
    }

    public static /* synthetic */ CellDTO copy$default(CellDTO cellDTO, CenterBlock centerBlock, Settings settings, LeftBlock leftBlock, RightBlock rightBlock, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            centerBlock = cellDTO.centerBlock;
        }
        if ((i11 & 2) != 0) {
            settings = cellDTO.settings;
        }
        if ((i11 & 4) != 0) {
            leftBlock = cellDTO.leftBlock;
        }
        if ((i11 & 8) != 0) {
            rightBlock = cellDTO.rightBlock;
        }
        if ((i11 & 16) != 0) {
            commonControlSettings = cellDTO.common;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        LeftBlock leftBlock2 = leftBlock;
        return cellDTO.copy(centerBlock, settings, leftBlock2, rightBlock, commonControlSettings2);
    }

    public static /* synthetic */ void isDisabled$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CenterBlock getCenterBlock() {
        return this.centerBlock;
    }

    /* renamed from: component2, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    /* renamed from: component3, reason: from getter */
    public final LeftBlock getLeftBlock() {
        return this.leftBlock;
    }

    /* renamed from: component4, reason: from getter */
    public final RightBlock getRightBlock() {
        return this.rightBlock;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final CellDTO copy(@NotNull CenterBlock centerBlock, Settings settings, LeftBlock leftBlock, RightBlock rightBlock, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(centerBlock, "centerBlock");
        return new CellDTO(centerBlock, settings, leftBlock, rightBlock, common);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellDTO)) {
            return false;
        }
        CellDTO cellDTO = (CellDTO) other;
        return Intrinsics.d(this.centerBlock, cellDTO.centerBlock) && Intrinsics.d(this.settings, cellDTO.settings) && Intrinsics.d(this.leftBlock, cellDTO.leftBlock) && Intrinsics.d(this.rightBlock, cellDTO.rightBlock) && Intrinsics.d(this.common, cellDTO.common);
    }

    @NotNull
    public final CenterBlock getCenterBlock() {
        return this.centerBlock;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.cell;
    }

    public final LeftBlock getLeftBlock() {
        return this.leftBlock;
    }

    public final RightBlock getRightBlock() {
        return this.rightBlock;
    }

    public final Settings getSettings() {
        return this.settings;
    }

    public boolean getTagSupported() {
        return this.centerBlock.getTitle().getTagSupported();
    }

    public int hashCode() {
        int hashCode = this.centerBlock.hashCode() * 31;
        Settings settings = this.settings;
        int hashCode2 = (hashCode + (settings == null ? 0 : settings.hashCode())) * 31;
        LeftBlock leftBlock = this.leftBlock;
        int hashCode3 = (hashCode2 + (leftBlock == null ? 0 : leftBlock.hashCode())) * 31;
        RightBlock rightBlock = this.rightBlock;
        int hashCode4 = (hashCode3 + (rightBlock == null ? 0 : rightBlock.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode4 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    /* renamed from: isDisabled, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    @Override // ru.ozon.uni.atoms.common.HTMLTagSupport
    public void setTagSupported(boolean z11) {
        CenterBlock centerBlock = this.centerBlock;
        centerBlock.getTitle().setTagSupported(z11);
        CellText subtitle = centerBlock.getSubtitle();
        if (subtitle != null) {
            subtitle.setTagSupported(z11);
        }
    }

    @NotNull
    public String toString() {
        CenterBlock centerBlock = this.centerBlock;
        Settings settings = this.settings;
        LeftBlock leftBlock = this.leftBlock;
        RightBlock rightBlock = this.rightBlock;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder sb2 = new StringBuilder("CellDTO(centerBlock=");
        sb2.append(centerBlock);
        sb2.append(", settings=");
        sb2.append(settings);
        sb2.append(", leftBlock=");
        sb2.append(leftBlock);
        sb2.append(", rightBlock=");
        sb2.append(rightBlock);
        sb2.append(", common=");
        return Ak.b.g(sb2, commonControlSettings, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.centerBlock.writeToParcel(dest, flags);
        Settings settings = this.settings;
        if (settings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            settings.writeToParcel(dest, flags);
        }
        LeftBlock leftBlock = this.leftBlock;
        if (leftBlock == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            leftBlock.writeToParcel(dest, flags);
        }
        RightBlock rightBlock = this.rightBlock;
        if (rightBlock == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rightBlock.writeToParcel(dest, flags);
        }
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellDTO(@NotNull CenterBlock centerBlock, Settings settings, LeftBlock leftBlock, RightBlock rightBlock, CommonControlSettings commonControlSettings) {
        super(DsAtomsType.CELL, null, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        Boolean isDisabled;
        Intrinsics.checkNotNullParameter(centerBlock, "centerBlock");
        this.centerBlock = centerBlock;
        this.settings = settings;
        this.leftBlock = leftBlock;
        this.rightBlock = rightBlock;
        this.common = commonControlSettings;
        this.isDisabled = (settings == null || (isDisabled = settings.isDisabled()) == null) ? false : isDisabled.booleanValue();
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011BI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003JR\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020\u000bJ\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellDTO$CellText;", "Lru/ozon/uni/atoms/common/HTMLTagSupport;", "Landroid/os/Parcelable;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textColor", "", "typographyToken", "tagSupported", "", "maxLines", "", "truncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTextColor", "()Ljava/lang/String;", "getTypographyToken", "getTagSupported", "()Z", "setTagSupported", "(Z)V", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)Lru/ozon/uni/atoms/data/dsCell/CellDTO$CellText;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CellText implements HTMLTagSupport, Parcelable {
        public static final int MAX_LINES_UNLIMITED = 0;
        private final Integer maxLines;
        private transient boolean tagSupported;

        @NotNull
        private final OzonSpannableString text;
        private final String textColor;
        private final CommonAtomLabelDTO.TruncatingMode truncatingMode;
        private final String typographyToken;
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<CellText> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CellText> {
            @Override // android.os.Parcelable.Creator
            public final CellText createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CellText(OzonSpannableStringParceler.INSTANCE.create(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? CommonAtomLabelDTO.TruncatingMode.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final CellText[] newArray(int i11) {
                return new CellText[i11];
            }
        }

        public CellText(@NotNull OzonSpannableString text, String str, String str2, boolean z11, Integer num, CommonAtomLabelDTO.TruncatingMode truncatingMode) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.textColor = str;
            this.typographyToken = str2;
            this.tagSupported = z11;
            this.maxLines = num;
            this.truncatingMode = truncatingMode;
        }

        public static /* synthetic */ CellText copy$default(CellText cellText, OzonSpannableString ozonSpannableString, String str, String str2, boolean z11, Integer num, CommonAtomLabelDTO.TruncatingMode truncatingMode, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = cellText.text;
            }
            if ((i11 & 2) != 0) {
                str = cellText.textColor;
            }
            if ((i11 & 4) != 0) {
                str2 = cellText.typographyToken;
            }
            if ((i11 & 8) != 0) {
                z11 = cellText.tagSupported;
            }
            if ((i11 & 16) != 0) {
                num = cellText.maxLines;
            }
            if ((i11 & 32) != 0) {
                truncatingMode = cellText.truncatingMode;
            }
            Integer num2 = num;
            CommonAtomLabelDTO.TruncatingMode truncatingMode2 = truncatingMode;
            return cellText.copy(ozonSpannableString, str, str2, z11, num2, truncatingMode2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
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
        public final boolean getTagSupported() {
            return this.tagSupported;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getMaxLines() {
            return this.maxLines;
        }

        /* renamed from: component6, reason: from getter */
        public final CommonAtomLabelDTO.TruncatingMode getTruncatingMode() {
            return this.truncatingMode;
        }

        @NotNull
        public final CellText copy(@NotNull OzonSpannableString text, String textColor, String typographyToken, boolean tagSupported, Integer maxLines, CommonAtomLabelDTO.TruncatingMode truncatingMode) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new CellText(text, textColor, typographyToken, tagSupported, maxLines, truncatingMode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellText)) {
                return false;
            }
            CellText cellText = (CellText) other;
            return Intrinsics.d(this.text, cellText.text) && Intrinsics.d(this.textColor, cellText.textColor) && Intrinsics.d(this.typographyToken, cellText.typographyToken) && this.tagSupported == cellText.tagSupported && Intrinsics.d(this.maxLines, cellText.maxLines) && this.truncatingMode == cellText.truncatingMode;
        }

        public final Integer getMaxLines() {
            return this.maxLines;
        }

        public boolean getTagSupported() {
            return this.tagSupported;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public final CommonAtomLabelDTO.TruncatingMode getTruncatingMode() {
            return this.truncatingMode;
        }

        public final String getTypographyToken() {
            return this.typographyToken;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.textColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.typographyToken;
            int a11 = C3532b.a((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.tagSupported);
            Integer num = this.maxLines;
            int hashCode3 = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            CommonAtomLabelDTO.TruncatingMode truncatingMode = this.truncatingMode;
            return hashCode3 + (truncatingMode != null ? truncatingMode.hashCode() : 0);
        }

        @Override // ru.ozon.uni.atoms.common.HTMLTagSupport
        public void setTagSupported(boolean z11) {
            this.tagSupported = z11;
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            String str = this.textColor;
            String str2 = this.typographyToken;
            boolean z11 = this.tagSupported;
            Integer num = this.maxLines;
            CommonAtomLabelDTO.TruncatingMode truncatingMode = this.truncatingMode;
            StringBuilder f7 = GR.b.f("CellText(text=", ozonSpannableString, ", textColor=", str, ", typographyToken=");
            C2880a.c(str2, ", tagSupported=", ", maxLines=", f7, z11);
            f7.append(num);
            f7.append(", truncatingMode=");
            f7.append(truncatingMode);
            f7.append(")");
            return f7.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            dest.writeString(this.textColor);
            dest.writeString(this.typographyToken);
            dest.writeInt(this.tagSupported ? 1 : 0);
            Integer num = this.maxLines;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            CommonAtomLabelDTO.TruncatingMode truncatingMode = this.truncatingMode;
            if (truncatingMode == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(truncatingMode.name());
            }
        }

        public /* synthetic */ CellText(OzonSpannableString ozonSpannableString, String str, String str2, boolean z11, Integer num, CommonAtomLabelDTO.TruncatingMode truncatingMode, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? 0 : num, (i11 & 32) != 0 ? CommonAtomLabelDTO.TruncatingMode.TAIL : truncatingMode);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010 \u001a\u00020\u0004HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\rHÆ\u0003JU\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\rHÆ\u0001J\u0006\u0010'\u001a\u00020(J\u0013\u0010)\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020(HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020(R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u00064"}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellDTO$CenterBlock;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$ContainerBlockDTO;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsCell/CellDTO$CellText;", "subtitle", "titleSpaceBetween", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "titleBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "titleIcon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "badgeList", "", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO$CellText;Lru/ozon/uni/atoms/data/dsCell/CellDTO$CellText;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO$CellText;", "getSubtitle", "getTitleSpaceBetween", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getTitleBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTitleIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getBadgeList", "()Ljava/util/List;", "isEmpty", "", "isEmpty$annotations", "()V", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CenterBlock implements ContainerBlockDTO, Parcelable {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<CenterBlock> CREATOR = new Creator();
        private final List<BadgeDTO> badgeList;
        private final boolean isEmpty;
        private final CellText subtitle;

        @NotNull
        private final CellText title;
        private final BadgeDTO titleBadge;
        private final CommonAtomIconDTO titleIcon;
        private final CommonCellSettings.LayoutPadding titleSpaceBetween;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CenterBlock> {
            @Override // android.os.Parcelable.Creator
            public final CenterBlock createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable.Creator<CellText> creator = CellText.CREATOR;
                CellText createFromParcel = creator.createFromParcel(parcel);
                ArrayList arrayList = null;
                CellText createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                CommonCellSettings.LayoutPadding valueOf = parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
                BadgeDTO createFromParcel3 = parcel.readInt() == 0 ? null : BadgeDTO.CREATOR.createFromParcel(parcel);
                CommonAtomIconDTO createFromParcel4 = parcel.readInt() == 0 ? null : CommonAtomIconDTO.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = Ak.b.b(BadgeDTO.CREATOR, parcel, arrayList, i11, 1);
                    }
                }
                return new CenterBlock(createFromParcel, createFromParcel2, valueOf, createFromParcel3, createFromParcel4, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final CenterBlock[] newArray(int i11) {
                return new CenterBlock[i11];
            }
        }

        public CenterBlock(@NotNull CellText title, CellText cellText, CommonCellSettings.LayoutPadding layoutPadding, BadgeDTO badgeDTO, CommonAtomIconDTO commonAtomIconDTO, List<BadgeDTO> list) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = cellText;
            this.titleSpaceBetween = layoutPadding;
            this.titleBadge = badgeDTO;
            this.titleIcon = commonAtomIconDTO;
            this.badgeList = list;
        }

        public static /* synthetic */ CenterBlock copy$default(CenterBlock centerBlock, CellText cellText, CellText cellText2, CommonCellSettings.LayoutPadding layoutPadding, BadgeDTO badgeDTO, CommonAtomIconDTO commonAtomIconDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellText = centerBlock.title;
            }
            if ((i11 & 2) != 0) {
                cellText2 = centerBlock.subtitle;
            }
            if ((i11 & 4) != 0) {
                layoutPadding = centerBlock.titleSpaceBetween;
            }
            if ((i11 & 8) != 0) {
                badgeDTO = centerBlock.titleBadge;
            }
            if ((i11 & 16) != 0) {
                commonAtomIconDTO = centerBlock.titleIcon;
            }
            if ((i11 & 32) != 0) {
                list = centerBlock.badgeList;
            }
            CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
            List list2 = list;
            return centerBlock.copy(cellText, cellText2, layoutPadding, badgeDTO, commonAtomIconDTO2, list2);
        }

        public static /* synthetic */ void isEmpty$annotations() {
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellText getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final CellText getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final CommonCellSettings.LayoutPadding getTitleSpaceBetween() {
            return this.titleSpaceBetween;
        }

        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getTitleBadge() {
            return this.titleBadge;
        }

        /* renamed from: component5, reason: from getter */
        public final CommonAtomIconDTO getTitleIcon() {
            return this.titleIcon;
        }

        public final List<BadgeDTO> component6() {
            return this.badgeList;
        }

        @NotNull
        public final CenterBlock copy(@NotNull CellText title, CellText subtitle, CommonCellSettings.LayoutPadding titleSpaceBetween, BadgeDTO titleBadge, CommonAtomIconDTO titleIcon, List<BadgeDTO> badgeList) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new CenterBlock(title, subtitle, titleSpaceBetween, titleBadge, titleIcon, badgeList);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CenterBlock)) {
                return false;
            }
            CenterBlock centerBlock = (CenterBlock) other;
            return Intrinsics.d(this.title, centerBlock.title) && Intrinsics.d(this.subtitle, centerBlock.subtitle) && this.titleSpaceBetween == centerBlock.titleSpaceBetween && Intrinsics.d(this.titleBadge, centerBlock.titleBadge) && Intrinsics.d(this.titleIcon, centerBlock.titleIcon) && Intrinsics.d(this.badgeList, centerBlock.badgeList);
        }

        public final List<BadgeDTO> getBadgeList() {
            return this.badgeList;
        }

        public final CellText getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final CellText getTitle() {
            return this.title;
        }

        public final BadgeDTO getTitleBadge() {
            return this.titleBadge;
        }

        public final CommonAtomIconDTO getTitleIcon() {
            return this.titleIcon;
        }

        public final CommonCellSettings.LayoutPadding getTitleSpaceBetween() {
            return this.titleSpaceBetween;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            CellText cellText = this.subtitle;
            int hashCode2 = (hashCode + (cellText == null ? 0 : cellText.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding = this.titleSpaceBetween;
            int hashCode3 = (hashCode2 + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
            BadgeDTO badgeDTO = this.titleBadge;
            int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            CommonAtomIconDTO commonAtomIconDTO = this.titleIcon;
            int hashCode5 = (hashCode4 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
            List<BadgeDTO> list = this.badgeList;
            return hashCode5 + (list != null ? list.hashCode() : 0);
        }

        @Override // ru.ozon.uni.atoms.data.dsCell.CellDTO.ContainerBlockDTO
        /* renamed from: isEmpty, reason: from getter */
        public boolean getIsEmpty() {
            return this.isEmpty;
        }

        @NotNull
        public String toString() {
            return "CenterBlock(title=" + this.title + ", subtitle=" + this.subtitle + ", titleSpaceBetween=" + this.titleSpaceBetween + ", titleBadge=" + this.titleBadge + ", titleIcon=" + this.titleIcon + ", badgeList=" + this.badgeList + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.title.writeToParcel(dest, flags);
            CellText cellText = this.subtitle;
            if (cellText == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cellText.writeToParcel(dest, flags);
            }
            CommonCellSettings.LayoutPadding layoutPadding = this.titleSpaceBetween;
            if (layoutPadding == null) {
                dest.writeInt(0);
            } else {
                d.d(dest, 1, layoutPadding);
            }
            BadgeDTO badgeDTO = this.titleBadge;
            if (badgeDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                badgeDTO.writeToParcel(dest, flags);
            }
            CommonAtomIconDTO commonAtomIconDTO = this.titleIcon;
            if (commonAtomIconDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                commonAtomIconDTO.writeToParcel(dest, flags);
            }
            List<BadgeDTO> list = this.badgeList;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                ((BadgeDTO) c11.next()).writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ CenterBlock(CellText cellText, CellText cellText2, CommonCellSettings.LayoutPadding layoutPadding, BadgeDTO badgeDTO, CommonAtomIconDTO commonAtomIconDTO, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(cellText, (i11 & 2) != 0 ? null : cellText2, (i11 & 4) != 0 ? CommonCellSettings.LayoutPadding.PADDING_100 : layoutPadding, (i11 & 8) != 0 ? null : badgeDTO, (i11 & 16) != 0 ? null : commonAtomIconDTO, (i11 & 32) != 0 ? null : list);
        }
    }
}
