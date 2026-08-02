package ru.ozon.id.nativeauth.pageAgreementWithConditions.data;

import B0.A0;
import V.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002&'B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, d2 = {"Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTO;", "Landroid/os/Parcelable;", "action", "", "agreementBlock", "Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;", "hintButton", "Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTO$HintButton;", "notification", "Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTO$Notification;", "<init>", "(Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTO$HintButton;Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTO$Notification;)V", "getAction", "()Ljava/lang/String;", "getAgreementBlock", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;", "getHintButton", "()Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTO$HintButton;", "getNotification", "()Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTO$Notification;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Notification", "HintButton", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PageAgreementWithConditionsDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PageAgreementWithConditionsDTO> CREATOR = new a();

    @NotNull
    private final String action;

    @NotNull
    private final OtpDTO.AgreementSheet agreementBlock;

    @NotNull
    private final HintButton hintButton;

    @NotNull
    private final Notification notification;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTO$HintButton;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDeeplink", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HintButton implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HintButton> CREATOR = new a();

        @NotNull
        private final String deeplink;

        @NotNull
        private final String title;

        public static final class a implements Parcelable.Creator<HintButton> {
            @Override // android.os.Parcelable.Creator
            public final HintButton createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HintButton(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HintButton[] newArray(int i11) {
                return new HintButton[i11];
            }
        }

        public HintButton(@NotNull String title, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.title = title;
            this.deeplink = deeplink;
        }

        public static /* synthetic */ HintButton copy$default(HintButton hintButton, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = hintButton.title;
            }
            if ((i11 & 2) != 0) {
                str2 = hintButton.deeplink;
            }
            return hintButton.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final HintButton copy(@NotNull String title, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new HintButton(title, deeplink);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HintButton)) {
                return false;
            }
            HintButton hintButton = (HintButton) other;
            return Intrinsics.d(this.title, hintButton.title) && Intrinsics.d(this.deeplink, hintButton.deeplink);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.deeplink.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("HintButton(title=", this.title, ", deeplink=", this.deeplink, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.deeplink);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTO$Notification;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Notification implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Notification> CREATOR = new a();

        @NotNull
        private final String title;

        public static final class a implements Parcelable.Creator<Notification> {
            @Override // android.os.Parcelable.Creator
            public final Notification createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Notification(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Notification[] newArray(int i11) {
                return new Notification[i11];
            }
        }

        public Notification(@NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        public static /* synthetic */ Notification copy$default(Notification notification, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = notification.title;
            }
            return notification.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final Notification copy(@NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Notification(title);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Notification) && Intrinsics.d(this.title, ((Notification) other).title);
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Notification(title=", this.title, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
        }
    }

    public static final class a implements Parcelable.Creator<PageAgreementWithConditionsDTO> {
        @Override // android.os.Parcelable.Creator
        public final PageAgreementWithConditionsDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PageAgreementWithConditionsDTO(parcel.readString(), OtpDTO.AgreementSheet.CREATOR.createFromParcel(parcel), HintButton.CREATOR.createFromParcel(parcel), Notification.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PageAgreementWithConditionsDTO[] newArray(int i11) {
            return new PageAgreementWithConditionsDTO[i11];
        }
    }

    public PageAgreementWithConditionsDTO(@NotNull String action, @NotNull OtpDTO.AgreementSheet agreementBlock, @NotNull HintButton hintButton, @NotNull Notification notification) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(agreementBlock, "agreementBlock");
        Intrinsics.checkNotNullParameter(hintButton, "hintButton");
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.action = action;
        this.agreementBlock = agreementBlock;
        this.hintButton = hintButton;
        this.notification = notification;
    }

    public static /* synthetic */ PageAgreementWithConditionsDTO copy$default(PageAgreementWithConditionsDTO pageAgreementWithConditionsDTO, String str, OtpDTO.AgreementSheet agreementSheet, HintButton hintButton, Notification notification, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pageAgreementWithConditionsDTO.action;
        }
        if ((i11 & 2) != 0) {
            agreementSheet = pageAgreementWithConditionsDTO.agreementBlock;
        }
        if ((i11 & 4) != 0) {
            hintButton = pageAgreementWithConditionsDTO.hintButton;
        }
        if ((i11 & 8) != 0) {
            notification = pageAgreementWithConditionsDTO.notification;
        }
        return pageAgreementWithConditionsDTO.copy(str, agreementSheet, hintButton, notification);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final OtpDTO.AgreementSheet getAgreementBlock() {
        return this.agreementBlock;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final HintButton getHintButton() {
        return this.hintButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Notification getNotification() {
        return this.notification;
    }

    @NotNull
    public final PageAgreementWithConditionsDTO copy(@NotNull String action, @NotNull OtpDTO.AgreementSheet agreementBlock, @NotNull HintButton hintButton, @NotNull Notification notification) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(agreementBlock, "agreementBlock");
        Intrinsics.checkNotNullParameter(hintButton, "hintButton");
        Intrinsics.checkNotNullParameter(notification, "notification");
        return new PageAgreementWithConditionsDTO(action, agreementBlock, hintButton, notification);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageAgreementWithConditionsDTO)) {
            return false;
        }
        PageAgreementWithConditionsDTO pageAgreementWithConditionsDTO = (PageAgreementWithConditionsDTO) other;
        return Intrinsics.d(this.action, pageAgreementWithConditionsDTO.action) && Intrinsics.d(this.agreementBlock, pageAgreementWithConditionsDTO.agreementBlock) && Intrinsics.d(this.hintButton, pageAgreementWithConditionsDTO.hintButton) && Intrinsics.d(this.notification, pageAgreementWithConditionsDTO.notification);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final OtpDTO.AgreementSheet getAgreementBlock() {
        return this.agreementBlock;
    }

    @NotNull
    public final HintButton getHintButton() {
        return this.hintButton;
    }

    @NotNull
    public final Notification getNotification() {
        return this.notification;
    }

    public int hashCode() {
        return this.notification.hashCode() + ((this.hintButton.hashCode() + ((this.agreementBlock.hashCode() + (this.action.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "PageAgreementWithConditionsDTO(action=" + this.action + ", agreementBlock=" + this.agreementBlock + ", hintButton=" + this.hintButton + ", notification=" + this.notification + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.action);
        this.agreementBlock.writeToParcel(dest, flags);
        this.hintButton.writeToParcel(dest, flags);
        this.notification.writeToParcel(dest, flags);
    }
}
