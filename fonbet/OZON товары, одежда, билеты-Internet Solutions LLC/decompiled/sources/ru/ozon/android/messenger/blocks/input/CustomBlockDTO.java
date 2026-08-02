package ru.ozon.android.messenger.blocks.input;

import C.J;
import De.C2859b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.view.LabeledIconMetaDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bk\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003J}\u0010)\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0006\u0010*\u001a\u00020+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020+HÖ\u0001J\t\u00101\u001a\u00020\u0004HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00067"}, d2 = {"Lru/ozon/android/messenger/blocks/input/CustomBlockDTO;", "Landroid/os/Parcelable;", "payload", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "backgroundColor", "image", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "labeledIcon", "Lru/ozon/android/messenger/utils/view/LabeledIconMetaDTO;", "trackingInfo", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "removeIcon", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Ljava/util/Map;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/android/messenger/utils/view/LabeledIconMetaDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getPayload", "()Ljava/util/Map;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBackgroundColor", "()Ljava/lang/String;", "getImage", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getLabeledIcon", "()Lru/ozon/android/messenger/utils/view/LabeledIconMetaDTO;", "getTrackingInfo", "getRemoveIcon", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CustomBlockDTO implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CustomBlockDTO> CREATOR = new a();
    private final String backgroundColor;
    private final IconDTO image;
    private final LabeledIconMetaDTO labeledIcon;

    @NotNull
    private final Map<String, String> payload;
    private final IconButtonV3DTO removeIcon;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public static final class a implements Parcelable.Creator<CustomBlockDTO> {
        @Override // android.os.Parcelable.Creator
        public final CustomBlockDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = B6.b.a(parcel, linkedHashMap, parcel.readString(), i11, 1);
            }
            TextDTO textDTO = (TextDTO) parcel.readParcelable(CustomBlockDTO.class.getClassLoader());
            TextDTO textDTO2 = (TextDTO) parcel.readParcelable(CustomBlockDTO.class.getClassLoader());
            String readString = parcel.readString();
            IconDTO iconDTO = (IconDTO) parcel.readParcelable(CustomBlockDTO.class.getClassLoader());
            LinkedHashMap linkedHashMap2 = null;
            LabeledIconMetaDTO createFromParcel = parcel.readInt() == 0 ? null : LabeledIconMetaDTO.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = C2859b.a(CustomBlockDTO.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
            }
            return new CustomBlockDTO(linkedHashMap, textDTO, textDTO2, readString, iconDTO, createFromParcel, linkedHashMap2, (IconButtonV3DTO) parcel.readParcelable(CustomBlockDTO.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CustomBlockDTO[] newArray(int i11) {
            return new CustomBlockDTO[i11];
        }
    }

    public CustomBlockDTO(@NotNull Map<String, String> payload, @NotNull TextDTO title, TextDTO textDTO, String str, IconDTO iconDTO, LabeledIconMetaDTO labeledIconMetaDTO, Map<String, TokenizedTrackingInfo> map, IconButtonV3DTO iconButtonV3DTO) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(title, "title");
        this.payload = payload;
        this.title = title;
        this.subtitle = textDTO;
        this.backgroundColor = str;
        this.image = iconDTO;
        this.labeledIcon = labeledIconMetaDTO;
        this.trackingInfo = map;
        this.removeIcon = iconButtonV3DTO;
    }

    public static /* synthetic */ CustomBlockDTO copy$default(CustomBlockDTO customBlockDTO, Map map, TextDTO textDTO, TextDTO textDTO2, String str, IconDTO iconDTO, LabeledIconMetaDTO labeledIconMetaDTO, Map map2, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = customBlockDTO.payload;
        }
        if ((i11 & 2) != 0) {
            textDTO = customBlockDTO.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = customBlockDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            str = customBlockDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            iconDTO = customBlockDTO.image;
        }
        if ((i11 & 32) != 0) {
            labeledIconMetaDTO = customBlockDTO.labeledIcon;
        }
        if ((i11 & 64) != 0) {
            map2 = customBlockDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            iconButtonV3DTO = customBlockDTO.removeIcon;
        }
        Map map3 = map2;
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        IconDTO iconDTO2 = iconDTO;
        LabeledIconMetaDTO labeledIconMetaDTO2 = labeledIconMetaDTO;
        return customBlockDTO.copy(map, textDTO, textDTO2, str, iconDTO2, labeledIconMetaDTO2, map3, iconButtonV3DTO2);
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.payload;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final IconDTO getImage() {
        return this.image;
    }

    /* renamed from: component6, reason: from getter */
    public final LabeledIconMetaDTO getLabeledIcon() {
        return this.labeledIcon;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final IconButtonV3DTO getRemoveIcon() {
        return this.removeIcon;
    }

    @NotNull
    public final CustomBlockDTO copy(@NotNull Map<String, String> payload, @NotNull TextDTO title, TextDTO subtitle, String backgroundColor, IconDTO image, LabeledIconMetaDTO labeledIcon, Map<String, TokenizedTrackingInfo> trackingInfo, IconButtonV3DTO removeIcon) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(title, "title");
        return new CustomBlockDTO(payload, title, subtitle, backgroundColor, image, labeledIcon, trackingInfo, removeIcon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomBlockDTO)) {
            return false;
        }
        CustomBlockDTO customBlockDTO = (CustomBlockDTO) other;
        return Intrinsics.d(this.payload, customBlockDTO.payload) && Intrinsics.d(this.title, customBlockDTO.title) && Intrinsics.d(this.subtitle, customBlockDTO.subtitle) && Intrinsics.d(this.backgroundColor, customBlockDTO.backgroundColor) && Intrinsics.d(this.image, customBlockDTO.image) && Intrinsics.d(this.labeledIcon, customBlockDTO.labeledIcon) && Intrinsics.d(this.trackingInfo, customBlockDTO.trackingInfo) && Intrinsics.d(this.removeIcon, customBlockDTO.removeIcon);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final IconDTO getImage() {
        return this.image;
    }

    public final LabeledIconMetaDTO getLabeledIcon() {
        return this.labeledIcon;
    }

    @NotNull
    public final Map<String, String> getPayload() {
        return this.payload;
    }

    public final IconButtonV3DTO getRemoveIcon() {
        return this.removeIcon;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = Ns.b.a(this.title, this.payload.hashCode() * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        IconDTO iconDTO = this.image;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        LabeledIconMetaDTO labeledIconMetaDTO = this.labeledIcon;
        int hashCode4 = (hashCode3 + (labeledIconMetaDTO == null ? 0 : labeledIconMetaDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.removeIcon;
        return hashCode5 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CustomBlockDTO(payload=" + this.payload + ", title=" + this.title + ", subtitle=" + this.subtitle + ", backgroundColor=" + this.backgroundColor + ", image=" + this.image + ", labeledIcon=" + this.labeledIcon + ", trackingInfo=" + this.trackingInfo + ", removeIcon=" + this.removeIcon + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Map<String, String> map = this.payload;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
        dest.writeParcelable(this.title, flags);
        dest.writeParcelable(this.subtitle, flags);
        dest.writeString(this.backgroundColor);
        dest.writeParcelable(this.image, flags);
        LabeledIconMetaDTO labeledIconMetaDTO = this.labeledIcon;
        if (labeledIconMetaDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            labeledIconMetaDTO.writeToParcel(dest, flags);
        }
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        if (map2 == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map2, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry2 = (Map.Entry) e11.next();
                dest.writeString((String) entry2.getKey());
                dest.writeParcelable((Parcelable) entry2.getValue(), flags);
            }
        }
        dest.writeParcelable(this.removeIcon, flags);
    }
}
