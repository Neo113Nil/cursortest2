package ru.ozon.id.nativeauth.requestPhoneAccess.data;

import C.J;
import C.o0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001:\u000545678B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJJ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b%\u0010\u0016J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001f¨\u00069"}, d2 = {"Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO;", "Landroid/os/Parcelable;", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$TitleDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$PermissionDTO;", "permissions", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdButtonDTO;", "allowButton", "disallowButton", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdTextAtomDTO;", "help", "<init>", "(Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$TitleDTO;Ljava/util/List;Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdButtonDTO;Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdButtonDTO;Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdTextAtomDTO;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$TitleDTO;", "component2", "()Ljava/util/List;", "component3", "()Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdButtonDTO;", "component4", "component5", "()Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdTextAtomDTO;", "copy", "(Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$TitleDTO;Ljava/util/List;Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdButtonDTO;Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdButtonDTO;Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdTextAtomDTO;)Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$TitleDTO;", "getTitle", "Ljava/util/List;", "getPermissions", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdButtonDTO;", "getAllowButton", "getDisallowButton", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdTextAtomDTO;", "getHelp", "OzonIdButtonDTO", "OzonIdTextAtomDTO", "TitleDTO", "PermissionDTO", "a", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequestPhoneAccessDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RequestPhoneAccessDTO> CREATOR = new b();

    @NotNull
    private final OzonIdButtonDTO allowButton;

    @NotNull
    private final OzonIdButtonDTO disallowButton;

    @NotNull
    private final OzonIdTextAtomDTO help;
    private final List<PermissionDTO> permissions;

    @NotNull
    private final TitleDTO title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdTextAtomDTO;", "Landroid/os/Parcelable;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OzonIdTextAtomDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<OzonIdTextAtomDTO> CREATOR = new a();

        @NotNull
        private final OzonSpannableString text;

        public static final class a implements Parcelable.Creator<OzonIdTextAtomDTO> {
            @Override // android.os.Parcelable.Creator
            public final OzonIdTextAtomDTO createFromParcel(Parcel parcel) {
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
                return new OzonIdTextAtomDTO(ozonSpannableString);
            }

            @Override // android.os.Parcelable.Creator
            public final OzonIdTextAtomDTO[] newArray(int i11) {
                return new OzonIdTextAtomDTO[i11];
            }
        }

        public OzonIdTextAtomDTO(@NotNull OzonSpannableString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public static /* synthetic */ OzonIdTextAtomDTO copy$default(OzonIdTextAtomDTO ozonIdTextAtomDTO, OzonSpannableString ozonSpannableString, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = ozonIdTextAtomDTO.text;
            }
            return ozonIdTextAtomDTO.copy(ozonSpannableString);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        @NotNull
        public final OzonIdTextAtomDTO copy(@NotNull OzonSpannableString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new OzonIdTextAtomDTO(text);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OzonIdTextAtomDTO) && Intrinsics.d(this.text, ((OzonIdTextAtomDTO) other).text);
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
            return "OzonIdTextAtomDTO(text=" + ((Object) this.text) + ")";
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
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$PermissionDTO;", "Landroid/os/Parcelable;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "text", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdTextAtomDTO;", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdTextAtomDTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getText", "()Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdTextAtomDTO;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PermissionDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PermissionDTO> CREATOR = new a();

        @NotNull
        private final Icon icon;

        @NotNull
        private final OzonIdTextAtomDTO text;

        public static final class a implements Parcelable.Creator<PermissionDTO> {
            @Override // android.os.Parcelable.Creator
            public final PermissionDTO createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PermissionDTO((Icon) parcel.readParcelable(PermissionDTO.class.getClassLoader()), OzonIdTextAtomDTO.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final PermissionDTO[] newArray(int i11) {
                return new PermissionDTO[i11];
            }
        }

        public PermissionDTO(@NotNull Icon icon, @NotNull OzonIdTextAtomDTO text) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            this.icon = icon;
            this.text = text;
        }

        public static /* synthetic */ PermissionDTO copy$default(PermissionDTO permissionDTO, Icon icon, OzonIdTextAtomDTO ozonIdTextAtomDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = permissionDTO.icon;
            }
            if ((i11 & 2) != 0) {
                ozonIdTextAtomDTO = permissionDTO.text;
            }
            return permissionDTO.copy(icon, ozonIdTextAtomDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final OzonIdTextAtomDTO getText() {
            return this.text;
        }

        @NotNull
        public final PermissionDTO copy(@NotNull Icon icon, @NotNull OzonIdTextAtomDTO text) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            return new PermissionDTO(icon, text);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PermissionDTO)) {
                return false;
            }
            PermissionDTO permissionDTO = (PermissionDTO) other;
            return Intrinsics.d(this.icon, permissionDTO.icon) && Intrinsics.d(this.text, permissionDTO.text);
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final OzonIdTextAtomDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PermissionDTO(icon=" + this.icon + ", text=" + this.text + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.icon, flags);
            this.text.writeToParcel(dest, flags);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$TitleDTO;", "Landroid/os/Parcelable;", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdTextAtomDTO;", "text", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$a;", "alignment", "<init>", "(Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdTextAtomDTO;Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$a;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdTextAtomDTO;", "component2", "()Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$a;", "copy", "(Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdTextAtomDTO;Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$a;)Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$TitleDTO;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdTextAtomDTO;", "getText", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$a;", "getAlignment", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TitleDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TitleDTO> CREATOR = new a();

        @NotNull
        private final a alignment;

        @NotNull
        private final OzonIdTextAtomDTO text;

        public static final class a implements Parcelable.Creator<TitleDTO> {
            @Override // android.os.Parcelable.Creator
            public final TitleDTO createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TitleDTO(OzonIdTextAtomDTO.CREATOR.createFromParcel(parcel), a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final TitleDTO[] newArray(int i11) {
                return new TitleDTO[i11];
            }
        }

        public TitleDTO(@NotNull OzonIdTextAtomDTO text, @NotNull a alignment) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.text = text;
            this.alignment = alignment;
        }

        public static /* synthetic */ TitleDTO copy$default(TitleDTO titleDTO, OzonIdTextAtomDTO ozonIdTextAtomDTO, a aVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonIdTextAtomDTO = titleDTO.text;
            }
            if ((i11 & 2) != 0) {
                aVar = titleDTO.alignment;
            }
            return titleDTO.copy(ozonIdTextAtomDTO, aVar);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonIdTextAtomDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final a getAlignment() {
            return this.alignment;
        }

        @NotNull
        public final TitleDTO copy(@NotNull OzonIdTextAtomDTO text, @NotNull a alignment) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new TitleDTO(text, alignment);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleDTO)) {
                return false;
            }
            TitleDTO titleDTO = (TitleDTO) other;
            return Intrinsics.d(this.text, titleDTO.text) && this.alignment == titleDTO.alignment;
        }

        @NotNull
        public final a getAlignment() {
            return this.alignment;
        }

        @NotNull
        public final OzonIdTextAtomDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.alignment.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TitleDTO(text=" + this.text + ", alignment=" + this.alignment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.text.writeToParcel(dest, flags);
            dest.writeString(this.alignment.name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$a;", "", "<init>", "(Ljava/lang/String;I)V", "Left", "Center", "Right", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @i(name = "ALIGNMENT_LEFT")
        public static final a Left = new a("Left", 0);

        @i(name = "ALIGNMENT_CENTER")
        public static final a Center = new a("Center", 1);

        @i(name = "ALIGNMENT_RIGHT")
        public static final a Right = new a("Right", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{Left, Center, Right};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private a(String str, int i11) {
        }

        @NotNull
        public static Xc.a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static final class b implements Parcelable.Creator<RequestPhoneAccessDTO> {
        @Override // android.os.Parcelable.Creator
        public final RequestPhoneAccessDTO createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            TitleDTO createFromParcel = TitleDTO.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = Ak.b.b(PermissionDTO.CREATOR, parcel, arrayList2, i11, 1);
                }
                arrayList = arrayList2;
            }
            Parcelable.Creator<OzonIdButtonDTO> creator = OzonIdButtonDTO.CREATOR;
            return new RequestPhoneAccessDTO(createFromParcel, arrayList, creator.createFromParcel(parcel), creator.createFromParcel(parcel), OzonIdTextAtomDTO.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RequestPhoneAccessDTO[] newArray(int i11) {
            return new RequestPhoneAccessDTO[i11];
        }
    }

    public RequestPhoneAccessDTO(@NotNull TitleDTO title, List<PermissionDTO> list, @NotNull OzonIdButtonDTO allowButton, @NotNull OzonIdButtonDTO disallowButton, @NotNull OzonIdTextAtomDTO help) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(allowButton, "allowButton");
        Intrinsics.checkNotNullParameter(disallowButton, "disallowButton");
        Intrinsics.checkNotNullParameter(help, "help");
        this.title = title;
        this.permissions = list;
        this.allowButton = allowButton;
        this.disallowButton = disallowButton;
        this.help = help;
    }

    public static /* synthetic */ RequestPhoneAccessDTO copy$default(RequestPhoneAccessDTO requestPhoneAccessDTO, TitleDTO titleDTO, List list, OzonIdButtonDTO ozonIdButtonDTO, OzonIdButtonDTO ozonIdButtonDTO2, OzonIdTextAtomDTO ozonIdTextAtomDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            titleDTO = requestPhoneAccessDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = requestPhoneAccessDTO.permissions;
        }
        if ((i11 & 4) != 0) {
            ozonIdButtonDTO = requestPhoneAccessDTO.allowButton;
        }
        if ((i11 & 8) != 0) {
            ozonIdButtonDTO2 = requestPhoneAccessDTO.disallowButton;
        }
        if ((i11 & 16) != 0) {
            ozonIdTextAtomDTO = requestPhoneAccessDTO.help;
        }
        OzonIdTextAtomDTO ozonIdTextAtomDTO2 = ozonIdTextAtomDTO;
        OzonIdButtonDTO ozonIdButtonDTO3 = ozonIdButtonDTO;
        return requestPhoneAccessDTO.copy(titleDTO, list, ozonIdButtonDTO3, ozonIdButtonDTO2, ozonIdTextAtomDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TitleDTO getTitle() {
        return this.title;
    }

    public final List<PermissionDTO> component2() {
        return this.permissions;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final OzonIdButtonDTO getAllowButton() {
        return this.allowButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final OzonIdButtonDTO getDisallowButton() {
        return this.disallowButton;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final OzonIdTextAtomDTO getHelp() {
        return this.help;
    }

    @NotNull
    public final RequestPhoneAccessDTO copy(@NotNull TitleDTO title, List<PermissionDTO> permissions, @NotNull OzonIdButtonDTO allowButton, @NotNull OzonIdButtonDTO disallowButton, @NotNull OzonIdTextAtomDTO help) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(allowButton, "allowButton");
        Intrinsics.checkNotNullParameter(disallowButton, "disallowButton");
        Intrinsics.checkNotNullParameter(help, "help");
        return new RequestPhoneAccessDTO(title, permissions, allowButton, disallowButton, help);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestPhoneAccessDTO)) {
            return false;
        }
        RequestPhoneAccessDTO requestPhoneAccessDTO = (RequestPhoneAccessDTO) other;
        return Intrinsics.d(this.title, requestPhoneAccessDTO.title) && Intrinsics.d(this.permissions, requestPhoneAccessDTO.permissions) && Intrinsics.d(this.allowButton, requestPhoneAccessDTO.allowButton) && Intrinsics.d(this.disallowButton, requestPhoneAccessDTO.disallowButton) && Intrinsics.d(this.help, requestPhoneAccessDTO.help);
    }

    @NotNull
    public final OzonIdButtonDTO getAllowButton() {
        return this.allowButton;
    }

    @NotNull
    public final OzonIdButtonDTO getDisallowButton() {
        return this.disallowButton;
    }

    @NotNull
    public final OzonIdTextAtomDTO getHelp() {
        return this.help;
    }

    public final List<PermissionDTO> getPermissions() {
        return this.permissions;
    }

    @NotNull
    public final TitleDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        List<PermissionDTO> list = this.permissions;
        return this.help.hashCode() + ((this.disallowButton.hashCode() + ((this.allowButton.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "RequestPhoneAccessDTO(title=" + this.title + ", permissions=" + this.permissions + ", allowButton=" + this.allowButton + ", disallowButton=" + this.disallowButton + ", help=" + this.help + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.title.writeToParcel(dest, flags);
        List<PermissionDTO> list = this.permissions;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                ((PermissionDTO) c11.next()).writeToParcel(dest, flags);
            }
        }
        this.allowButton.writeToParcel(dest, flags);
        this.disallowButton.writeToParcel(dest, flags);
        this.help.writeToParcel(dest, flags);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdButtonDTO;", "Landroid/os/Parcelable;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingAction", "", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingAction", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OzonIdButtonDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<OzonIdButtonDTO> CREATOR = new a();
        private final AtomActionDTO action;

        @NotNull
        private final OzonSpannableString text;
        private final String trackingAction;

        public static final class a implements Parcelable.Creator<OzonIdButtonDTO> {
            @Override // android.os.Parcelable.Creator
            public final OzonIdButtonDTO createFromParcel(Parcel parcel) {
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
                return new OzonIdButtonDTO(ozonSpannableString, (AtomActionDTO) parcel.readParcelable(OzonIdButtonDTO.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OzonIdButtonDTO[] newArray(int i11) {
                return new OzonIdButtonDTO[i11];
            }
        }

        public OzonIdButtonDTO(@NotNull OzonSpannableString text, AtomActionDTO atomActionDTO, String str) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = atomActionDTO;
            this.trackingAction = str;
        }

        public static /* synthetic */ OzonIdButtonDTO copy$default(OzonIdButtonDTO ozonIdButtonDTO, OzonSpannableString ozonSpannableString, AtomActionDTO atomActionDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = ozonIdButtonDTO.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = ozonIdButtonDTO.action;
            }
            if ((i11 & 4) != 0) {
                str = ozonIdButtonDTO.trackingAction;
            }
            return ozonIdButtonDTO.copy(ozonSpannableString, atomActionDTO, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTrackingAction() {
            return this.trackingAction;
        }

        @NotNull
        public final OzonIdButtonDTO copy(@NotNull OzonSpannableString text, AtomActionDTO action, String trackingAction) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new OzonIdButtonDTO(text, action, trackingAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OzonIdButtonDTO)) {
                return false;
            }
            OzonIdButtonDTO ozonIdButtonDTO = (OzonIdButtonDTO) other;
            return Intrinsics.d(this.text, ozonIdButtonDTO.text) && Intrinsics.d(this.action, ozonIdButtonDTO.action) && Intrinsics.d(this.trackingAction, ozonIdButtonDTO.trackingAction);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public final String getTrackingAction() {
            return this.trackingAction;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.trackingAction;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            AtomActionDTO atomActionDTO = this.action;
            String str = this.trackingAction;
            StringBuilder sb2 = new StringBuilder("OzonIdButtonDTO(text=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingAction=");
            return o0.c(sb2, str, ")");
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
            dest.writeParcelable(this.action, flags);
            dest.writeString(this.trackingAction);
        }

        public /* synthetic */ OzonIdButtonDTO(OzonSpannableString ozonSpannableString, AtomActionDTO atomActionDTO, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, (i11 & 2) != 0 ? null : atomActionDTO, str);
        }
    }
}
