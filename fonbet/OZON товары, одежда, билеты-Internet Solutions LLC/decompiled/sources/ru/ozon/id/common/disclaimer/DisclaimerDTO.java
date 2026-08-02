package ru.ozon.id.common.disclaimer;

import Ak.b;
import C.J;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002'(B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, d2 = {"Lru/ozon/id/common/disclaimer/DisclaimerDTO;", "Landroid/os/Parcelable;", "body", "Lru/ozon/id/common/disclaimer/DisclaimerDTO$DisclaimerBodyDTO;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "backgroundColor", "", "buttons", "", "Lru/ozon/id/common/disclaimer/DisclaimerDTO$DisclaimerButtonDTO;", "<init>", "(Lru/ozon/id/common/disclaimer/DisclaimerDTO$DisclaimerBodyDTO;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Ljava/util/List;)V", "getBody", "()Lru/ozon/id/common/disclaimer/DisclaimerDTO$DisclaimerBodyDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getBackgroundColor", "()Ljava/lang/String;", "getButtons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DisclaimerBodyDTO", "DisclaimerButtonDTO", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DisclaimerDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DisclaimerDTO> CREATOR = new a();
    private final String backgroundColor;

    @NotNull
    private final DisclaimerBodyDTO body;
    private final List<DisclaimerButtonDTO> buttons;
    private final Icon icon;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lru/ozon/id/common/disclaimer/DisclaimerDTO$DisclaimerBodyDTO;", "Landroid/os/Parcelable;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DisclaimerBodyDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DisclaimerBodyDTO> CREATOR = new a();

        @NotNull
        private final OzonSpannableString text;

        public static final class a implements Parcelable.Creator<DisclaimerBodyDTO> {
            @Override // android.os.Parcelable.Creator
            public final DisclaimerBodyDTO createFromParcel(Parcel parcel) {
                OzonSpannableString ozonSpannableString;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    ozonSpannableString = null;
                } else {
                    String readString = parcel.readString();
                    if (readString == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(h.A0(OzonHtmlParser.INSTANCE.parseHtml(readString, 63), '\n'));
                }
                return new DisclaimerBodyDTO(ozonSpannableString);
            }

            @Override // android.os.Parcelable.Creator
            public final DisclaimerBodyDTO[] newArray(int i11) {
                return new DisclaimerBodyDTO[i11];
            }
        }

        public DisclaimerBodyDTO(@NotNull OzonSpannableString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public static /* synthetic */ DisclaimerBodyDTO copy$default(DisclaimerBodyDTO disclaimerBodyDTO, OzonSpannableString ozonSpannableString, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = disclaimerBodyDTO.text;
            }
            return disclaimerBodyDTO.copy(ozonSpannableString);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        @NotNull
        public final DisclaimerBodyDTO copy(@NotNull OzonSpannableString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new DisclaimerBodyDTO(text);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisclaimerBodyDTO) && Intrinsics.d(this.text, ((DisclaimerBodyDTO) other).text);
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return "DisclaimerBodyDTO(text=" + ((Object) this.text) + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableString ozonSpannableString = this.text;
            Intrinsics.checkNotNullParameter(dest, "parcel");
            if (ozonSpannableString == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(Html.toHtml(ozonSpannableString, 1));
            }
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/id/common/disclaimer/DisclaimerDTO$DisclaimerButtonDTO;", "Landroid/os/Parcelable;", "text", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DisclaimerButtonDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DisclaimerButtonDTO> CREATOR = new a();
        private final AtomActionDTO action;

        @NotNull
        private final String text;

        public static final class a implements Parcelable.Creator<DisclaimerButtonDTO> {
            @Override // android.os.Parcelable.Creator
            public final DisclaimerButtonDTO createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DisclaimerButtonDTO(parcel.readString(), (AtomActionDTO) parcel.readParcelable(DisclaimerButtonDTO.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final DisclaimerButtonDTO[] newArray(int i11) {
                return new DisclaimerButtonDTO[i11];
            }
        }

        public DisclaimerButtonDTO(@NotNull String text, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ DisclaimerButtonDTO copy$default(DisclaimerButtonDTO disclaimerButtonDTO, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = disclaimerButtonDTO.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = disclaimerButtonDTO.action;
            }
            return disclaimerButtonDTO.copy(str, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final DisclaimerButtonDTO copy(@NotNull String text, AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new DisclaimerButtonDTO(text, action);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisclaimerButtonDTO)) {
                return false;
            }
            DisclaimerButtonDTO disclaimerButtonDTO = (DisclaimerButtonDTO) other;
            return Intrinsics.d(this.text, disclaimerButtonDTO.text) && Intrinsics.d(this.action, disclaimerButtonDTO.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            return hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "DisclaimerButtonDTO(text=" + this.text + ", action=" + this.action + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            dest.writeParcelable(this.action, flags);
        }
    }

    public static final class a implements Parcelable.Creator<DisclaimerDTO> {
        @Override // android.os.Parcelable.Creator
        public final DisclaimerDTO createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            DisclaimerBodyDTO createFromParcel = DisclaimerBodyDTO.CREATOR.createFromParcel(parcel);
            Icon icon = (Icon) parcel.readParcelable(DisclaimerDTO.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = b.b(DisclaimerButtonDTO.CREATOR, parcel, arrayList2, i11, 1);
                }
                arrayList = arrayList2;
            }
            return new DisclaimerDTO(createFromParcel, icon, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DisclaimerDTO[] newArray(int i11) {
            return new DisclaimerDTO[i11];
        }
    }

    public DisclaimerDTO(@NotNull DisclaimerBodyDTO body, Icon icon, String str, List<DisclaimerButtonDTO> list) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.body = body;
        this.icon = icon;
        this.backgroundColor = str;
        this.buttons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisclaimerDTO copy$default(DisclaimerDTO disclaimerDTO, DisclaimerBodyDTO disclaimerBodyDTO, Icon icon, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclaimerBodyDTO = disclaimerDTO.body;
        }
        if ((i11 & 2) != 0) {
            icon = disclaimerDTO.icon;
        }
        if ((i11 & 4) != 0) {
            str = disclaimerDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            list = disclaimerDTO.buttons;
        }
        return disclaimerDTO.copy(disclaimerBodyDTO, icon, str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DisclaimerBodyDTO getBody() {
        return this.body;
    }

    /* renamed from: component2, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<DisclaimerButtonDTO> component4() {
        return this.buttons;
    }

    @NotNull
    public final DisclaimerDTO copy(@NotNull DisclaimerBodyDTO body, Icon icon, String backgroundColor, List<DisclaimerButtonDTO> buttons) {
        Intrinsics.checkNotNullParameter(body, "body");
        return new DisclaimerDTO(body, icon, backgroundColor, buttons);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerDTO)) {
            return false;
        }
        DisclaimerDTO disclaimerDTO = (DisclaimerDTO) other;
        return Intrinsics.d(this.body, disclaimerDTO.body) && Intrinsics.d(this.icon, disclaimerDTO.icon) && Intrinsics.d(this.backgroundColor, disclaimerDTO.backgroundColor) && Intrinsics.d(this.buttons, disclaimerDTO.buttons);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final DisclaimerBodyDTO getBody() {
        return this.body;
    }

    public final List<DisclaimerButtonDTO> getButtons() {
        return this.buttons;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public int hashCode() {
        int hashCode = this.body.hashCode() * 31;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<DisclaimerButtonDTO> list = this.buttons;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DisclaimerDTO(body=" + this.body + ", icon=" + this.icon + ", backgroundColor=" + this.backgroundColor + ", buttons=" + this.buttons + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.body.writeToParcel(dest, flags);
        dest.writeParcelable(this.icon, flags);
        dest.writeString(this.backgroundColor);
        List<DisclaimerButtonDTO> list = this.buttons;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator c11 = J.c(dest, 1, list);
        while (c11.hasNext()) {
            ((DisclaimerButtonDTO) c11.next()).writeToParcel(dest, flags);
        }
    }
}
