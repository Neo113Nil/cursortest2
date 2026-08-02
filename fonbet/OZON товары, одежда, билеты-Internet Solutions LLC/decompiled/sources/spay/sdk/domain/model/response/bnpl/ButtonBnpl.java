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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;", "Landroid/os/Parcelable;", "activeButtonLogo", "", "inactiveButtonLogo", CommentV3DTO.HEADER_FIELD_NAME, "content", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActiveButtonLogo", "()Ljava/lang/String;", "getContent", "getHeader", "getInactiveButtonLogo", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ButtonBnpl implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ButtonBnpl> CREATOR = new Creator();

    @NotNull
    private final String activeButtonLogo;

    @NotNull
    private final String content;

    @NotNull
    private final String header;

    @NotNull
    private final String inactiveButtonLogo;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ButtonBnpl> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ButtonBnpl createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ButtonBnpl(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ButtonBnpl[] newArray(int i11) {
            return new ButtonBnpl[i11];
        }
    }

    public ButtonBnpl(@NotNull String activeButtonLogo, @NotNull String inactiveButtonLogo, @NotNull String header, @NotNull String content) {
        Intrinsics.checkNotNullParameter(activeButtonLogo, "activeButtonLogo");
        Intrinsics.checkNotNullParameter(inactiveButtonLogo, "inactiveButtonLogo");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(content, "content");
        this.activeButtonLogo = activeButtonLogo;
        this.inactiveButtonLogo = inactiveButtonLogo;
        this.header = header;
        this.content = content;
    }

    public static /* synthetic */ ButtonBnpl copy$default(ButtonBnpl buttonBnpl, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = buttonBnpl.activeButtonLogo;
        }
        if ((i11 & 2) != 0) {
            str2 = buttonBnpl.inactiveButtonLogo;
        }
        if ((i11 & 4) != 0) {
            str3 = buttonBnpl.header;
        }
        if ((i11 & 8) != 0) {
            str4 = buttonBnpl.content;
        }
        return buttonBnpl.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getActiveButtonLogo() {
        return this.activeButtonLogo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getInactiveButtonLogo() {
        return this.inactiveButtonLogo;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final ButtonBnpl copy(@NotNull String activeButtonLogo, @NotNull String inactiveButtonLogo, @NotNull String header, @NotNull String content) {
        Intrinsics.checkNotNullParameter(activeButtonLogo, "activeButtonLogo");
        Intrinsics.checkNotNullParameter(inactiveButtonLogo, "inactiveButtonLogo");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(content, "content");
        return new ButtonBnpl(activeButtonLogo, inactiveButtonLogo, header, content);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonBnpl)) {
            return false;
        }
        ButtonBnpl buttonBnpl = (ButtonBnpl) other;
        return Intrinsics.d(this.activeButtonLogo, buttonBnpl.activeButtonLogo) && Intrinsics.d(this.inactiveButtonLogo, buttonBnpl.inactiveButtonLogo) && Intrinsics.d(this.header, buttonBnpl.header) && Intrinsics.d(this.content, buttonBnpl.content);
    }

    @NotNull
    public final String getActiveButtonLogo() {
        return this.activeButtonLogo;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getHeader() {
        return this.header;
    }

    @NotNull
    public final String getInactiveButtonLogo() {
        return this.inactiveButtonLogo;
    }

    public int hashCode() {
        return this.content.hashCode() + a.b0(a.b0(this.activeButtonLogo.hashCode() * 31, this.inactiveButtonLogo), this.header);
    }

    @NotNull
    public String toString() {
        String str = this.activeButtonLogo;
        String str2 = this.inactiveButtonLogo;
        return C3173b.c(C3660k.d("ButtonBnpl(activeButtonLogo=", str, ", inactiveButtonLogo=", str2, ", header="), this.header, ", content=", this.content, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.activeButtonLogo);
        parcel.writeString(this.inactiveButtonLogo);
        parcel.writeString(this.header);
        parcel.writeString(this.content);
    }
}
