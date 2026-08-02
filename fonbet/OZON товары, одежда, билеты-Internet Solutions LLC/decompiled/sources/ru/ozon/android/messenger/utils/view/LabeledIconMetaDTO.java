package ru.ozon.android.messenger.utils.view;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0018¨\u0006*"}, d2 = {"Lru/ozon/android/messenger/utils/view/LabeledIconMetaDTO;", "Landroid/os/Parcelable;", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "label", "Lru/ozon/android/messenger/utils/view/d;", "iconPosition", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/android/messenger/utils/view/d;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/uni/atoms/data/button/Icon;", "component2", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component3", "()Lru/ozon/android/messenger/utils/view/d;", "copy", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/android/messenger/utils/view/d;)Lru/ozon/android/messenger/utils/view/LabeledIconMetaDTO;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getLabel", "Lru/ozon/android/messenger/utils/view/d;", "getIconPosition", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LabeledIconMetaDTO implements Parcelable {
    public static final int $stable = Icon.$stable;

    @NotNull
    public static final Parcelable.Creator<LabeledIconMetaDTO> CREATOR = new a();
    private final Icon icon;
    private final d iconPosition;
    private final TextDTO label;

    public static final class a implements Parcelable.Creator<LabeledIconMetaDTO> {
        @Override // android.os.Parcelable.Creator
        public final LabeledIconMetaDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LabeledIconMetaDTO((Icon) parcel.readParcelable(LabeledIconMetaDTO.class.getClassLoader()), (TextDTO) parcel.readParcelable(LabeledIconMetaDTO.class.getClassLoader()), parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final LabeledIconMetaDTO[] newArray(int i11) {
            return new LabeledIconMetaDTO[i11];
        }
    }

    public LabeledIconMetaDTO(Icon icon, TextDTO textDTO, d dVar) {
        this.icon = icon;
        this.label = textDTO;
        this.iconPosition = dVar;
    }

    public static /* synthetic */ LabeledIconMetaDTO copy$default(LabeledIconMetaDTO labeledIconMetaDTO, Icon icon, TextDTO textDTO, d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            icon = labeledIconMetaDTO.icon;
        }
        if ((i11 & 2) != 0) {
            textDTO = labeledIconMetaDTO.label;
        }
        if ((i11 & 4) != 0) {
            dVar = labeledIconMetaDTO.iconPosition;
        }
        return labeledIconMetaDTO.copy(icon, textDTO, dVar);
    }

    /* renamed from: component1, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final d getIconPosition() {
        return this.iconPosition;
    }

    @NotNull
    public final LabeledIconMetaDTO copy(Icon icon, TextDTO label, d iconPosition) {
        return new LabeledIconMetaDTO(icon, label, iconPosition);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabeledIconMetaDTO)) {
            return false;
        }
        LabeledIconMetaDTO labeledIconMetaDTO = (LabeledIconMetaDTO) other;
        return Intrinsics.d(this.icon, labeledIconMetaDTO.icon) && Intrinsics.d(this.label, labeledIconMetaDTO.label) && this.iconPosition == labeledIconMetaDTO.iconPosition;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final d getIconPosition() {
        return this.iconPosition;
    }

    public final TextDTO getLabel() {
        return this.label;
    }

    public int hashCode() {
        Icon icon = this.icon;
        int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        TextDTO textDTO = this.label;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        d dVar = this.iconPosition;
        return hashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LabeledIconMetaDTO(icon=" + this.icon + ", label=" + this.label + ", iconPosition=" + this.iconPosition + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.icon, flags);
        dest.writeParcelable(this.label, flags);
        d dVar = this.iconPosition;
        if (dVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dVar.name());
        }
    }
}
