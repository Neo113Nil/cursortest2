package ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data;

import B90.C2616s;
import De.C2859b;
import Ns.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006-"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "Landroid/os/Parcelable;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "cancel", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "confirm", "nextAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getCancel", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getConfirm", "getNextAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ConfirmingCancellationPopover implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ConfirmingCancellationPopover> CREATOR = new Creator();

    @NotNull
    private final ButtonV3DTO cancel;

    @NotNull
    private final ButtonV3DTO confirm;

    @NotNull
    private final ImageDTO image;
    private final AtomActionDTO nextAction;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConfirmingCancellationPopover> {
        @Override // android.os.Parcelable.Creator
        public final ConfirmingCancellationPopover createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConfirmingCancellationPopover((ImageDTO) parcel.readParcelable(ConfirmingCancellationPopover.class.getClassLoader()), (TextDTO) parcel.readParcelable(ConfirmingCancellationPopover.class.getClassLoader()), (TextDTO) parcel.readParcelable(ConfirmingCancellationPopover.class.getClassLoader()), (ButtonV3DTO) parcel.readParcelable(ConfirmingCancellationPopover.class.getClassLoader()), (ButtonV3DTO) parcel.readParcelable(ConfirmingCancellationPopover.class.getClassLoader()), (AtomActionDTO) parcel.readParcelable(ConfirmingCancellationPopover.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ConfirmingCancellationPopover[] newArray(int i11) {
            return new ConfirmingCancellationPopover[i11];
        }
    }

    public ConfirmingCancellationPopover(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ButtonV3DTO cancel, @NotNull ButtonV3DTO confirm, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(cancel, "cancel");
        Intrinsics.checkNotNullParameter(confirm, "confirm");
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.cancel = cancel;
        this.confirm = confirm;
        this.nextAction = atomActionDTO;
    }

    public static /* synthetic */ ConfirmingCancellationPopover copy$default(ConfirmingCancellationPopover confirmingCancellationPopover, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = confirmingCancellationPopover.image;
        }
        if ((i11 & 2) != 0) {
            textDTO = confirmingCancellationPopover.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = confirmingCancellationPopover.subtitle;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = confirmingCancellationPopover.cancel;
        }
        if ((i11 & 16) != 0) {
            buttonV3DTO2 = confirmingCancellationPopover.confirm;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = confirmingCancellationPopover.nextAction;
        }
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO2;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return confirmingCancellationPopover.copy(imageDTO, textDTO, textDTO2, buttonV3DTO, buttonV3DTO3, atomActionDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getCancel() {
        return this.cancel;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonV3DTO getConfirm() {
        return this.confirm;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getNextAction() {
        return this.nextAction;
    }

    @NotNull
    public final ConfirmingCancellationPopover copy(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ButtonV3DTO cancel, @NotNull ButtonV3DTO confirm, AtomActionDTO nextAction) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(cancel, "cancel");
        Intrinsics.checkNotNullParameter(confirm, "confirm");
        return new ConfirmingCancellationPopover(image, title, subtitle, cancel, confirm, nextAction);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmingCancellationPopover)) {
            return false;
        }
        ConfirmingCancellationPopover confirmingCancellationPopover = (ConfirmingCancellationPopover) other;
        return Intrinsics.d(this.image, confirmingCancellationPopover.image) && Intrinsics.d(this.title, confirmingCancellationPopover.title) && Intrinsics.d(this.subtitle, confirmingCancellationPopover.subtitle) && Intrinsics.d(this.cancel, confirmingCancellationPopover.cancel) && Intrinsics.d(this.confirm, confirmingCancellationPopover.confirm) && Intrinsics.d(this.nextAction, confirmingCancellationPopover.nextAction);
    }

    @NotNull
    public final ButtonV3DTO getCancel() {
        return this.cancel;
    }

    @NotNull
    public final ButtonV3DTO getConfirm() {
        return this.confirm;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final AtomActionDTO getNextAction() {
        return this.nextAction;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.confirm, C2859b.c(this.cancel, b.a(this.subtitle, b.a(this.title, this.image.hashCode() * 31, 31), 31), 31), 31);
        AtomActionDTO atomActionDTO = this.nextAction;
        return c11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        ButtonV3DTO buttonV3DTO = this.cancel;
        ButtonV3DTO buttonV3DTO2 = this.confirm;
        AtomActionDTO atomActionDTO = this.nextAction;
        StringBuilder d11 = C2616s.d("ConfirmingCancellationPopover(image=", imageDTO, ", title=", textDTO, ", subtitle=");
        d11.append(textDTO2);
        d11.append(", cancel=");
        d11.append(buttonV3DTO);
        d11.append(", confirm=");
        d11.append(buttonV3DTO2);
        d11.append(", nextAction=");
        d11.append(atomActionDTO);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.image, flags);
        dest.writeParcelable(this.title, flags);
        dest.writeParcelable(this.subtitle, flags);
        dest.writeParcelable(this.cancel, flags);
        dest.writeParcelable(this.confirm, flags);
        dest.writeParcelable(this.nextAction, flags);
    }

    public /* synthetic */ ConfirmingCancellationPopover(ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, AtomActionDTO atomActionDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageDTO, textDTO, textDTO2, buttonV3DTO, buttonV3DTO2, (i11 & 32) != 0 ? null : atomActionDTO);
    }
}
