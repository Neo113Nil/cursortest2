package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;
import defpackage.q0;
import xsna.epx;
import xsna.gp;
import xsna.qoy;

/* compiled from: NavigationState.kt */
/* loaded from: classes4.dex */
public interface PostingStepScreen extends Parcelable {

    /* compiled from: NavigationState.kt */
    public static final class AdditionalSettingsScreen implements PostingStepScreen {
        public static final AdditionalSettingsScreen b = new AdditionalSettingsScreen();
        public static final Parcelable.Creator<AdditionalSettingsScreen> CREATOR = new a();

        /* compiled from: NavigationState.kt */
        public static final class a implements Parcelable.Creator<AdditionalSettingsScreen> {
            @Override // android.os.Parcelable.Creator
            public final AdditionalSettingsScreen createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AdditionalSettingsScreen.b;
            }

            @Override // android.os.Parcelable.Creator
            public final AdditionalSettingsScreen[] newArray(int i) {
                return new AdditionalSettingsScreen[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AdditionalSettingsScreen);
        }

        public final int hashCode() {
            return 1142502984;
        }

        public final String toString() {
            return "AdditionalSettingsScreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NavigationState.kt */
    public static final class AttachmentPickers implements PostingStepScreen {
        public static final AttachmentPickers b = new AttachmentPickers();
        public static final Parcelable.Creator<AttachmentPickers> CREATOR = new a();

        /* compiled from: NavigationState.kt */
        public static final class a implements Parcelable.Creator<AttachmentPickers> {
            @Override // android.os.Parcelable.Creator
            public final AttachmentPickers createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AttachmentPickers.b;
            }

            @Override // android.os.Parcelable.Creator
            public final AttachmentPickers[] newArray(int i) {
                return new AttachmentPickers[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AttachmentPickers);
        }

        public final int hashCode() {
            return 907858800;
        }

        public final String toString() {
            return "AttachmentPickers";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NavigationState.kt */
    public static final class CoAuthorsPicker implements PostingStepScreen {
        public static final CoAuthorsPicker b = new CoAuthorsPicker();
        public static final Parcelable.Creator<CoAuthorsPicker> CREATOR = new a();

        /* compiled from: NavigationState.kt */
        public static final class a implements Parcelable.Creator<CoAuthorsPicker> {
            @Override // android.os.Parcelable.Creator
            public final CoAuthorsPicker createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CoAuthorsPicker.b;
            }

            @Override // android.os.Parcelable.Creator
            public final CoAuthorsPicker[] newArray(int i) {
                return new CoAuthorsPicker[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CoAuthorsPicker);
        }

        public final int hashCode() {
            return 844705240;
        }

        public final String toString() {
            return "CoAuthorsPicker";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NavigationState.kt */
    public static final class FilePicker implements PostingStepScreen {
        public static final FilePicker b = new FilePicker();
        public static final Parcelable.Creator<FilePicker> CREATOR = new a();

        /* compiled from: NavigationState.kt */
        public static final class a implements Parcelable.Creator<FilePicker> {
            @Override // android.os.Parcelable.Creator
            public final FilePicker createFromParcel(Parcel parcel) {
                parcel.readInt();
                return FilePicker.b;
            }

            @Override // android.os.Parcelable.Creator
            public final FilePicker[] newArray(int i) {
                return new FilePicker[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FilePicker);
        }

        public final int hashCode() {
            return 291689596;
        }

        public final String toString() {
            return "FilePicker";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NavigationState.kt */
    public static final class MusicPicker implements PostingStepScreen {
        public static final MusicPicker b = new MusicPicker();
        public static final Parcelable.Creator<MusicPicker> CREATOR = new a();

        /* compiled from: NavigationState.kt */
        public static final class a implements Parcelable.Creator<MusicPicker> {
            @Override // android.os.Parcelable.Creator
            public final MusicPicker createFromParcel(Parcel parcel) {
                parcel.readInt();
                return MusicPicker.b;
            }

            @Override // android.os.Parcelable.Creator
            public final MusicPicker[] newArray(int i) {
                return new MusicPicker[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MusicPicker);
        }

        public final int hashCode() {
            return 281798145;
        }

        public final String toString() {
            return "MusicPicker";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NavigationState.kt */
    public static final class NotificationDataLossDialog implements PostingStepScreen {
        public static final NotificationDataLossDialog b = new NotificationDataLossDialog();
        public static final Parcelable.Creator<NotificationDataLossDialog> CREATOR = new a();

        /* compiled from: NavigationState.kt */
        public static final class a implements Parcelable.Creator<NotificationDataLossDialog> {
            @Override // android.os.Parcelable.Creator
            public final NotificationDataLossDialog createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NotificationDataLossDialog.b;
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationDataLossDialog[] newArray(int i) {
                return new NotificationDataLossDialog[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotificationDataLossDialog);
        }

        public final int hashCode() {
            return -1728824654;
        }

        public final String toString() {
            return "NotificationDataLossDialog";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NavigationState.kt */
    public static final class PlacePicker implements PostingStepScreen {
        public static final PlacePicker b = new PlacePicker();
        public static final Parcelable.Creator<PlacePicker> CREATOR = new a();

        /* compiled from: NavigationState.kt */
        public static final class a implements Parcelable.Creator<PlacePicker> {
            @Override // android.os.Parcelable.Creator
            public final PlacePicker createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PlacePicker.b;
            }

            @Override // android.os.Parcelable.Creator
            public final PlacePicker[] newArray(int i) {
                return new PlacePicker[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PlacePicker);
        }

        public final int hashCode() {
            return -962945181;
        }

        public final String toString() {
            return "PlacePicker";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NavigationState.kt */
    public static final class PollEditor implements PostingStepScreen {
        public static final Parcelable.Creator<PollEditor> CREATOR = new a();
        public final PostingPollDto b;
        public final PostingPollDto c;
        public final PollEditorMode d;
        public final PollEditorUiConfig e;

        /* compiled from: NavigationState.kt */
        public static final class a implements Parcelable.Creator<PollEditor> {
            @Override // android.os.Parcelable.Creator
            public final PollEditor createFromParcel(Parcel parcel) {
                Parcelable.Creator<PostingPollDto> creator = PostingPollDto.CREATOR;
                return new PollEditor(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), (PollEditorMode) parcel.readParcelable(PollEditor.class.getClassLoader()), PollEditorUiConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final PollEditor[] newArray(int i) {
                return new PollEditor[i];
            }
        }

        public PollEditor(PostingPollDto postingPollDto, PostingPollDto postingPollDto2, PollEditorMode pollEditorMode, PollEditorUiConfig pollEditorUiConfig) {
            this.b = postingPollDto;
            this.c = postingPollDto2;
            this.d = pollEditorMode;
            this.e = pollEditorUiConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PollEditor)) {
                return false;
            }
            PollEditor pollEditor = (PollEditor) obj;
            return epx.f(this.b, pollEditor.b) && epx.f(this.c, pollEditor.c) && epx.f(this.d, pollEditor.d) && epx.f(this.e, pollEditor.e);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            PostingPollDto postingPollDto = this.c;
            return this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (postingPollDto == null ? 0 : postingPollDto.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "PollEditor(poll=" + this.b + ", lastSavedPoll=" + this.c + ", mode=" + this.d + ", config=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            PostingPollDto postingPollDto = this.c;
            if (postingPollDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                postingPollDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.d, i);
            this.e.writeToParcel(parcel, i);
        }
    }

    /* compiled from: NavigationState.kt */
    public static final class PostTextInput implements PostingStepScreen {
        public static final PostTextInput b = new PostTextInput();
        public static final Parcelable.Creator<PostTextInput> CREATOR = new a();

        /* compiled from: NavigationState.kt */
        public static final class a implements Parcelable.Creator<PostTextInput> {
            @Override // android.os.Parcelable.Creator
            public final PostTextInput createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PostTextInput.b;
            }

            @Override // android.os.Parcelable.Creator
            public final PostTextInput[] newArray(int i) {
                return new PostTextInput[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PostTextInput);
        }

        public final int hashCode() {
            return 873234763;
        }

        public final String toString() {
            return "PostTextInput";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NavigationState.kt */
    public static final class PrivacySettingsBottomSheet implements PostingStepScreen {
        public static final PrivacySettingsBottomSheet b = new PrivacySettingsBottomSheet();
        public static final Parcelable.Creator<PrivacySettingsBottomSheet> CREATOR = new a();

        /* compiled from: NavigationState.kt */
        public static final class a implements Parcelable.Creator<PrivacySettingsBottomSheet> {
            @Override // android.os.Parcelable.Creator
            public final PrivacySettingsBottomSheet createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PrivacySettingsBottomSheet.b;
            }

            @Override // android.os.Parcelable.Creator
            public final PrivacySettingsBottomSheet[] newArray(int i) {
                return new PrivacySettingsBottomSheet[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrivacySettingsBottomSheet);
        }

        public final int hashCode() {
            return 702494843;
        }

        public final String toString() {
            return "PrivacySettingsBottomSheet";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NavigationState.kt */
    public static final class ProductsPicker implements PostingStepScreen {
        public static final ProductsPicker b = new ProductsPicker();
        public static final Parcelable.Creator<ProductsPicker> CREATOR = new a();

        /* compiled from: NavigationState.kt */
        public static final class a implements Parcelable.Creator<ProductsPicker> {
            @Override // android.os.Parcelable.Creator
            public final ProductsPicker createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ProductsPicker.b;
            }

            @Override // android.os.Parcelable.Creator
            public final ProductsPicker[] newArray(int i) {
                return new ProductsPicker[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductsPicker);
        }

        public final int hashCode() {
            return 941893988;
        }

        public final String toString() {
            return "ProductsPicker";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NavigationState.kt */
    public static final class RemovePollAlert implements PostingStepScreen {
        public static final Parcelable.Creator<RemovePollAlert> CREATOR = new a();
        public final PostingPollDto b;
        public final PollEditorMode c;
        public final boolean d;
        public final boolean e;

        /* compiled from: NavigationState.kt */
        public static final class a implements Parcelable.Creator<RemovePollAlert> {
            @Override // android.os.Parcelable.Creator
            public final RemovePollAlert createFromParcel(Parcel parcel) {
                return new RemovePollAlert(PostingPollDto.CREATOR.createFromParcel(parcel), (PollEditorMode) parcel.readParcelable(RemovePollAlert.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final RemovePollAlert[] newArray(int i) {
                return new RemovePollAlert[i];
            }
        }

        public RemovePollAlert(PostingPollDto postingPollDto, PollEditorMode pollEditorMode, boolean z, boolean z2) {
            this.b = postingPollDto;
            this.c = pollEditorMode;
            this.d = z;
            this.e = z2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemovePollAlert)) {
                return false;
            }
            RemovePollAlert removePollAlert = (RemovePollAlert) obj;
            return epx.f(this.b, removePollAlert.b) && epx.f(this.c, removePollAlert.c) && this.d == removePollAlert.d && this.e == removePollAlert.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemovePollAlert(poll=");
            sb.append(this.b);
            sb.append(", mode=");
            sb.append(this.c);
            sb.append(", shouldCloseModalOnRemove=");
            sb.append(this.d);
            sb.append(", shouldReopenModalOnCancel=");
            return q0.a(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeInt(this.e ? 1 : 0);
        }
    }

    /* compiled from: NavigationState.kt */
    public static final class VkPhotoAlbum implements PostingStepScreen {
        public static final Parcelable.Creator<VkPhotoAlbum> CREATOR = new a();
        public final PhotoAlbum b;

        /* compiled from: NavigationState.kt */
        public static final class a implements Parcelable.Creator<VkPhotoAlbum> {
            @Override // android.os.Parcelable.Creator
            public final VkPhotoAlbum createFromParcel(Parcel parcel) {
                return new VkPhotoAlbum((PhotoAlbum) parcel.readParcelable(VkPhotoAlbum.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final VkPhotoAlbum[] newArray(int i) {
                return new VkPhotoAlbum[i];
            }
        }

        public VkPhotoAlbum(PhotoAlbum photoAlbum) {
            this.b = photoAlbum;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VkPhotoAlbum) && epx.f(this.b, ((VkPhotoAlbum) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "VkPhotoAlbum(album=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: NavigationState.kt */
    public static final class VkPhotoAlbumsList implements PostingStepScreen {
        public static final Parcelable.Creator<VkPhotoAlbumsList> CREATOR = new a();
        public final UserId b;

        /* compiled from: NavigationState.kt */
        public static final class a implements Parcelable.Creator<VkPhotoAlbumsList> {
            @Override // android.os.Parcelable.Creator
            public final VkPhotoAlbumsList createFromParcel(Parcel parcel) {
                return new VkPhotoAlbumsList((UserId) parcel.readParcelable(VkPhotoAlbumsList.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final VkPhotoAlbumsList[] newArray(int i) {
                return new VkPhotoAlbumsList[i];
            }
        }

        public VkPhotoAlbumsList(UserId userId) {
            this.b = userId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VkPhotoAlbumsList) && epx.f(this.b, ((VkPhotoAlbumsList) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("VkPhotoAlbumsList(uid="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }
}
