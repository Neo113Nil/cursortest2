package spay.sdk.domain.model.response.bnpl;

import I0.C3173b;
import Lf.a;
import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006%"}, d2 = {"Lspay/sdk/domain/model/response/bnpl/ButtonBnplParts;", "Landroid/os/Parcelable;", "buttonLogo", "", "buttonLogoInactive", CommentV3DTO.HEADER_FIELD_NAME, "headerInactive", "content", "contentInactive", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonLogo", "()Ljava/lang/String;", "getButtonLogoInactive", "getContent", "getContentInactive", "getHeader", "getHeaderInactive", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ButtonBnplParts implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ButtonBnplParts> CREATOR = new Creator();

    @NotNull
    private final String buttonLogo;

    @NotNull
    private final String buttonLogoInactive;

    @NotNull
    private final String content;

    @NotNull
    private final String contentInactive;

    @NotNull
    private final String header;

    @NotNull
    private final String headerInactive;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ButtonBnplParts> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ButtonBnplParts createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ButtonBnplParts(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ButtonBnplParts[] newArray(int i11) {
            return new ButtonBnplParts[i11];
        }
    }

    public ButtonBnplParts(@NotNull String buttonLogo, @NotNull String buttonLogoInactive, @NotNull String header, @NotNull String headerInactive, @NotNull String content, @NotNull String contentInactive) {
        Intrinsics.checkNotNullParameter(buttonLogo, "buttonLogo");
        Intrinsics.checkNotNullParameter(buttonLogoInactive, "buttonLogoInactive");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(headerInactive, "headerInactive");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contentInactive, "contentInactive");
        this.buttonLogo = buttonLogo;
        this.buttonLogoInactive = buttonLogoInactive;
        this.header = header;
        this.headerInactive = headerInactive;
        this.content = content;
        this.contentInactive = contentInactive;
    }

    public static /* synthetic */ ButtonBnplParts copy$default(ButtonBnplParts buttonBnplParts, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = buttonBnplParts.buttonLogo;
        }
        if ((i11 & 2) != 0) {
            str2 = buttonBnplParts.buttonLogoInactive;
        }
        if ((i11 & 4) != 0) {
            str3 = buttonBnplParts.header;
        }
        if ((i11 & 8) != 0) {
            str4 = buttonBnplParts.headerInactive;
        }
        if ((i11 & 16) != 0) {
            str5 = buttonBnplParts.content;
        }
        if ((i11 & 32) != 0) {
            str6 = buttonBnplParts.contentInactive;
        }
        String str7 = str5;
        String str8 = str6;
        return buttonBnplParts.copy(str, str2, str3, str4, str7, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getButtonLogo() {
        return this.buttonLogo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getButtonLogoInactive() {
        return this.buttonLogoInactive;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getHeaderInactive() {
        return this.headerInactive;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getContentInactive() {
        return this.contentInactive;
    }

    @NotNull
    public final ButtonBnplParts copy(@NotNull String buttonLogo, @NotNull String buttonLogoInactive, @NotNull String header, @NotNull String headerInactive, @NotNull String content, @NotNull String contentInactive) {
        Intrinsics.checkNotNullParameter(buttonLogo, "buttonLogo");
        Intrinsics.checkNotNullParameter(buttonLogoInactive, "buttonLogoInactive");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(headerInactive, "headerInactive");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contentInactive, "contentInactive");
        return new ButtonBnplParts(buttonLogo, buttonLogoInactive, header, headerInactive, content, contentInactive);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonBnplParts)) {
            return false;
        }
        ButtonBnplParts buttonBnplParts = (ButtonBnplParts) other;
        return Intrinsics.d(this.buttonLogo, buttonBnplParts.buttonLogo) && Intrinsics.d(this.buttonLogoInactive, buttonBnplParts.buttonLogoInactive) && Intrinsics.d(this.header, buttonBnplParts.header) && Intrinsics.d(this.headerInactive, buttonBnplParts.headerInactive) && Intrinsics.d(this.content, buttonBnplParts.content) && Intrinsics.d(this.contentInactive, buttonBnplParts.contentInactive);
    }

    @NotNull
    public final String getButtonLogo() {
        return this.buttonLogo;
    }

    @NotNull
    public final String getButtonLogoInactive() {
        return this.buttonLogoInactive;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getContentInactive() {
        return this.contentInactive;
    }

    @NotNull
    public final String getHeader() {
        return this.header;
    }

    @NotNull
    public final String getHeaderInactive() {
        return this.headerInactive;
    }

    public int hashCode() {
        return this.contentInactive.hashCode() + a.b0(a.b0(a.b0(a.b0(this.buttonLogo.hashCode() * 31, this.buttonLogoInactive), this.header), this.headerInactive), this.content);
    }

    @NotNull
    public String toString() {
        String str = this.buttonLogo;
        String str2 = this.buttonLogoInactive;
        String str3 = this.header;
        String str4 = this.headerInactive;
        String str5 = this.content;
        String str6 = this.contentInactive;
        StringBuilder d11 = C3660k.d("ButtonBnplParts(buttonLogo=", str, ", buttonLogoInactive=", str2, ", header=");
        Nh.a.h(d11, str3, ", headerInactive=", str4, ", content=");
        return C3173b.c(d11, str5, ", contentInactive=", str6, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.buttonLogo);
        parcel.writeString(this.buttonLogoInactive);
        parcel.writeString(this.header);
        parcel.writeString(this.headerInactive);
        parcel.writeString(this.content);
        parcel.writeString(this.contentInactive);
    }
}
