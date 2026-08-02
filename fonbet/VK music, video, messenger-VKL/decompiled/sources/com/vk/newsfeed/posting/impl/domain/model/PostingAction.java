package com.vk.newsfeed.posting.impl.domain.model;

import android.location.Location;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Publisher;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Signer;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.api.analytics.PostingAttachmentInfo;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageCropResult;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadUpdate;
import com.vk.newsfeed.posting.impl.domain.request.ParsedAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingGroupInfo;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.RestorePostingStateMeta;
import com.vk.newsfeed.posting.mentions.model.PostMentionProfile;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import defpackage.q0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.alb0;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.gp;
import xsna.ho8;
import xsna.kj50;
import xsna.lq;
import xsna.ms9;
import xsna.nr;
import xsna.qoy;
import xsna.shy;
import xsna.tq;
import xsna.uqi;
import xsna.vu5;
import xsna.zcl;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public interface PostingAction extends kj50, Parcelable {

    /* compiled from: PostingAction.kt */
    public static final class AddWaitingAction implements PostingAction {
        public static final Parcelable.Creator<AddWaitingAction> CREATOR = new a();
        public final PostingAction b;
        public final WaitingActionTrigger c;

        /* compiled from: PostingAction.kt */
        public static final class a implements Parcelable.Creator<AddWaitingAction> {
            @Override // android.os.Parcelable.Creator
            public final AddWaitingAction createFromParcel(Parcel parcel) {
                return new AddWaitingAction((PostingAction) parcel.readParcelable(AddWaitingAction.class.getClassLoader()), WaitingActionTrigger.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final AddWaitingAction[] newArray(int i) {
                return new AddWaitingAction[i];
            }
        }

        public AddWaitingAction(PostingAction postingAction, WaitingActionTrigger waitingActionTrigger) {
            this.b = postingAction;
            this.c = waitingActionTrigger;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddWaitingAction)) {
                return false;
            }
            AddWaitingAction addWaitingAction = (AddWaitingAction) obj;
            return epx.f(this.b, addWaitingAction.b) && this.c == addWaitingAction.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "AddWaitingAction(action=" + this.b + ", trigger=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c.name());
        }
    }

    /* compiled from: PostingAction.kt */
    public static final class ComposableAction implements PostingAction {
        public static final Parcelable.Creator<ComposableAction> CREATOR = new a();
        public final List<PostingAction> b;

        /* compiled from: PostingAction.kt */
        public static final class a implements Parcelable.Creator<ComposableAction> {
            @Override // android.os.Parcelable.Creator
            public final ComposableAction createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(ComposableAction.class, parcel, arrayList, i, 1);
                }
                return new ComposableAction(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ComposableAction[] newArray(int i) {
                return new ComposableAction[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ComposableAction(List<? extends PostingAction> list) {
            this.b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ComposableAction) && epx.f(this.b, ((ComposableAction) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("ComposableAction(actions="), this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.b);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
        }
    }

    /* compiled from: PostingAction.kt */
    public interface Fetch extends PostingAction {

        /* compiled from: PostingAction.kt */
        public static final class CheckEditPostRules implements Fetch {
            public static final Parcelable.Creator<CheckEditPostRules> CREATOR = new a();
            public final WallOwner b;
            public final Publisher c;
            public final Signer d;
            public final PostEditableData e;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<CheckEditPostRules> {
                @Override // android.os.Parcelable.Creator
                public final CheckEditPostRules createFromParcel(Parcel parcel) {
                    return new CheckEditPostRules(WallOwner.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Publisher.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Signer.CREATOR.createFromParcel(parcel) : null, PostEditableData.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final CheckEditPostRules[] newArray(int i) {
                    return new CheckEditPostRules[i];
                }
            }

            public CheckEditPostRules(WallOwner wallOwner, Publisher publisher, Signer signer, PostEditableData postEditableData) {
                this.b = wallOwner;
                this.c = publisher;
                this.d = signer;
                this.e = postEditableData;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CheckEditPostRules)) {
                    return false;
                }
                CheckEditPostRules checkEditPostRules = (CheckEditPostRules) obj;
                return epx.f(this.b, checkEditPostRules.b) && epx.f(this.c, checkEditPostRules.c) && epx.f(this.d, checkEditPostRules.d) && epx.f(this.e, checkEditPostRules.e);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                Publisher publisher = this.c;
                int hashCode2 = (hashCode + (publisher == null ? 0 : publisher.hashCode())) * 31;
                Signer signer = this.d;
                return this.e.hashCode() + ((hashCode2 + (signer != null ? signer.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "CheckEditPostRules(owner=" + this.b + ", publisher=" + this.c + ", signer=" + this.d + ", editableData=" + this.e + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Serializer.StreamParcelable.a.a(this.b, parcel);
                Publisher publisher = this.c;
                if (publisher == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    Serializer.StreamParcelable.a.a(publisher, parcel);
                }
                Signer signer = this.d;
                if (signer == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    Serializer.StreamParcelable.a.a(signer, parcel);
                }
                this.e.writeToParcel(parcel, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class ErrorCheckEditPostRules implements Fetch {
            public static final Parcelable.Creator<ErrorCheckEditPostRules> CREATOR = new a();
            public final WallOwner b;
            public final Publisher c;
            public final Signer d;
            public final PostEditableData e;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<ErrorCheckEditPostRules> {
                @Override // android.os.Parcelable.Creator
                public final ErrorCheckEditPostRules createFromParcel(Parcel parcel) {
                    return new ErrorCheckEditPostRules(WallOwner.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Publisher.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Signer.CREATOR.createFromParcel(parcel) : null, PostEditableData.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final ErrorCheckEditPostRules[] newArray(int i) {
                    return new ErrorCheckEditPostRules[i];
                }
            }

            public ErrorCheckEditPostRules(WallOwner wallOwner, Publisher publisher, Signer signer, PostEditableData postEditableData) {
                this.b = wallOwner;
                this.c = publisher;
                this.d = signer;
                this.e = postEditableData;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ErrorCheckEditPostRules)) {
                    return false;
                }
                ErrorCheckEditPostRules errorCheckEditPostRules = (ErrorCheckEditPostRules) obj;
                return epx.f(this.b, errorCheckEditPostRules.b) && epx.f(this.c, errorCheckEditPostRules.c) && epx.f(this.d, errorCheckEditPostRules.d) && epx.f(this.e, errorCheckEditPostRules.e);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                Publisher publisher = this.c;
                int hashCode2 = (hashCode + (publisher == null ? 0 : publisher.hashCode())) * 31;
                Signer signer = this.d;
                return this.e.hashCode() + ((hashCode2 + (signer != null ? signer.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "ErrorCheckEditPostRules(owner=" + this.b + ", publisher=" + this.c + ", signer=" + this.d + ", editableData=" + this.e + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Serializer.StreamParcelable.a.a(this.b, parcel);
                Publisher publisher = this.c;
                if (publisher == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    Serializer.StreamParcelable.a.a(publisher, parcel);
                }
                Signer signer = this.d;
                if (signer == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    Serializer.StreamParcelable.a.a(signer, parcel);
                }
                this.e.writeToParcel(parcel, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class LoadHints implements Fetch {
            public static final Parcelable.Creator<LoadHints> CREATOR = new a();
            public final PostingSettings b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<LoadHints> {
                @Override // android.os.Parcelable.Creator
                public final LoadHints createFromParcel(Parcel parcel) {
                    return new LoadHints(PostingSettings.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final LoadHints[] newArray(int i) {
                    return new LoadHints[i];
                }
            }

            public LoadHints(PostingSettings postingSettings) {
                this.b = postingSettings;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadHints) && epx.f(this.b, ((LoadHints) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "LoadHints(settings=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Serializer.StreamParcelable.a.a(this.b, parcel);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class LoadLocalMedia implements Fetch {
            public static final LoadLocalMedia b = new LoadLocalMedia();
            public static final Parcelable.Creator<LoadLocalMedia> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<LoadLocalMedia> {
                @Override // android.os.Parcelable.Creator
                public final LoadLocalMedia createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return LoadLocalMedia.b;
                }

                @Override // android.os.Parcelable.Creator
                public final LoadLocalMedia[] newArray(int i) {
                    return new LoadLocalMedia[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadLocalMedia);
            }

            public final int hashCode() {
                return -2108424121;
            }

            public final String toString() {
                return "LoadLocalMedia";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class LoadPermissions implements Fetch {
            public static final LoadPermissions b = new LoadPermissions();
            public static final Parcelable.Creator<LoadPermissions> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<LoadPermissions> {
                @Override // android.os.Parcelable.Creator
                public final LoadPermissions createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return LoadPermissions.b;
                }

                @Override // android.os.Parcelable.Creator
                public final LoadPermissions[] newArray(int i) {
                    return new LoadPermissions[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadPermissions);
            }

            public final int hashCode() {
                return -1034018506;
            }

            public final String toString() {
                return "LoadPermissions";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class LoadPhotoTags implements Fetch {
            public static final Parcelable.Creator<LoadPhotoTags> CREATOR = new a();
            public final List<PhotoTagRequestParam> b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<LoadPhotoTags> {
                @Override // android.os.Parcelable.Creator
                public final LoadPhotoTags createFromParcel(Parcel parcel) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(PhotoTagRequestParam.CREATOR, parcel, arrayList, i, 1);
                    }
                    return new LoadPhotoTags(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final LoadPhotoTags[] newArray(int i) {
                    return new LoadPhotoTags[i];
                }
            }

            public LoadPhotoTags(List<PhotoTagRequestParam> list) {
                this.b = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadPhotoTags) && epx.f(this.b, ((LoadPhotoTags) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("LoadPhotoTags(params="), this.b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Iterator a2 = ao.a(parcel, this.b);
                while (a2.hasNext()) {
                    ((PhotoTagRequestParam) a2.next()).writeToParcel(parcel, i);
                }
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class LoadPlaces implements Fetch {
            public static final LoadPlaces b = new LoadPlaces();
            public static final Parcelable.Creator<LoadPlaces> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<LoadPlaces> {
                @Override // android.os.Parcelable.Creator
                public final LoadPlaces createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return LoadPlaces.b;
                }

                @Override // android.os.Parcelable.Creator
                public final LoadPlaces[] newArray(int i) {
                    return new LoadPlaces[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadPlaces);
            }

            public final int hashCode() {
                return 403862618;
            }

            public final String toString() {
                return "LoadPlaces";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class LoadPlacesByLocation implements Fetch {
            public static final Parcelable.Creator<LoadPlacesByLocation> CREATOR = new a();
            public final Location b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<LoadPlacesByLocation> {
                @Override // android.os.Parcelable.Creator
                public final LoadPlacesByLocation createFromParcel(Parcel parcel) {
                    return new LoadPlacesByLocation((Location) parcel.readParcelable(LoadPlacesByLocation.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final LoadPlacesByLocation[] newArray(int i) {
                    return new LoadPlacesByLocation[i];
                }
            }

            public LoadPlacesByLocation(Location location) {
                this.b = location;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadPlacesByLocation) && epx.f(this.b, ((LoadPlacesByLocation) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "LoadPlacesByLocation(location=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class LoadSettings implements Fetch {
            public static final Parcelable.Creator<LoadSettings> CREATOR = new a();
            public final UserId b;
            public final Integer c;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<LoadSettings> {
                @Override // android.os.Parcelable.Creator
                public final LoadSettings createFromParcel(Parcel parcel) {
                    return new LoadSettings((UserId) parcel.readParcelable(LoadSettings.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final LoadSettings[] newArray(int i) {
                    return new LoadSettings[i];
                }
            }

            public LoadSettings(UserId userId, Integer num) {
                this.b = userId;
                this.c = num;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadSettings)) {
                    return false;
                }
                LoadSettings loadSettings = (LoadSettings) obj;
                return epx.f(this.b, loadSettings.b) && epx.f(this.c, loadSettings.c);
            }

            public final int hashCode() {
                int hashCode = Long.hashCode(this.b.b) * 31;
                Integer num = this.c;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LoadSettings(authorId=");
                sb.append(this.b);
                sb.append(", postId=");
                return uqi.b(sb, this.c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                Integer num = this.c;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    nr.a(parcel, 1, num);
                }
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class LoadSettingsRemoteOnly implements Fetch {
            public static final Parcelable.Creator<LoadSettingsRemoteOnly> CREATOR = new a();
            public final UserId b;
            public final Integer c;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<LoadSettingsRemoteOnly> {
                @Override // android.os.Parcelable.Creator
                public final LoadSettingsRemoteOnly createFromParcel(Parcel parcel) {
                    return new LoadSettingsRemoteOnly((UserId) parcel.readParcelable(LoadSettingsRemoteOnly.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final LoadSettingsRemoteOnly[] newArray(int i) {
                    return new LoadSettingsRemoteOnly[i];
                }
            }

            public LoadSettingsRemoteOnly(UserId userId, Integer num) {
                this.b = userId;
                this.c = num;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadSettingsRemoteOnly)) {
                    return false;
                }
                LoadSettingsRemoteOnly loadSettingsRemoteOnly = (LoadSettingsRemoteOnly) obj;
                return epx.f(this.b, loadSettingsRemoteOnly.b) && epx.f(this.c, loadSettingsRemoteOnly.c);
            }

            public final int hashCode() {
                int hashCode = Long.hashCode(this.b.b) * 31;
                Integer num = this.c;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LoadSettingsRemoteOnly(authorId=");
                sb.append(this.b);
                sb.append(", postId=");
                return uqi.b(sb, this.c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                Integer num = this.c;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    nr.a(parcel, 1, num);
                }
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class LoadedGroupsInfo implements Fetch {
            public static final Parcelable.Creator<LoadedGroupsInfo> CREATOR = new a();
            public final List<PostingGroupInfo> b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<LoadedGroupsInfo> {
                @Override // android.os.Parcelable.Creator
                public final LoadedGroupsInfo createFromParcel(Parcel parcel) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(PostingGroupInfo.CREATOR, parcel, arrayList, i, 1);
                    }
                    return new LoadedGroupsInfo(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final LoadedGroupsInfo[] newArray(int i) {
                    return new LoadedGroupsInfo[i];
                }
            }

            public LoadedGroupsInfo() {
                this(null, 1, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadedGroupsInfo) && epx.f(this.b, ((LoadedGroupsInfo) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("LoadedGroupsInfo(loadResult="), this.b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Iterator a2 = ao.a(parcel, this.b);
                while (a2.hasNext()) {
                    ((PostingGroupInfo) a2.next()).writeToParcel(parcel, i);
                }
            }

            public LoadedGroupsInfo(List list, int i, zcl zclVar) {
                this((i & 1) != 0 ? EmptyList.b : list);
            }

            public LoadedGroupsInfo(List<PostingGroupInfo> list) {
                this.b = list;
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class LoadedLocalSettings implements Fetch {
            public static final Parcelable.Creator<LoadedLocalSettings> CREATOR = new a();
            public final PostingSettings b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<LoadedLocalSettings> {
                @Override // android.os.Parcelable.Creator
                public final LoadedLocalSettings createFromParcel(Parcel parcel) {
                    return new LoadedLocalSettings(parcel.readInt() == 0 ? null : PostingSettings.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final LoadedLocalSettings[] newArray(int i) {
                    return new LoadedLocalSettings[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public LoadedLocalSettings() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadedLocalSettings) && epx.f(this.b, ((LoadedLocalSettings) obj).b);
            }

            public final int hashCode() {
                PostingSettings postingSettings = this.b;
                if (postingSettings == null) {
                    return 0;
                }
                return postingSettings.hashCode();
            }

            public final String toString() {
                return "LoadedLocalSettings(loadResult=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                PostingSettings postingSettings = this.b;
                if (postingSettings == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    Serializer.StreamParcelable.a.a(postingSettings, parcel);
                }
            }

            public LoadedLocalSettings(PostingSettings postingSettings) {
                this.b = postingSettings;
            }

            public /* synthetic */ LoadedLocalSettings(PostingSettings postingSettings, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : postingSettings);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class SaveLastKnownGeo implements Fetch {
            public static final Parcelable.Creator<SaveLastKnownGeo> CREATOR = new a();
            public final Location b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SaveLastKnownGeo> {
                @Override // android.os.Parcelable.Creator
                public final SaveLastKnownGeo createFromParcel(Parcel parcel) {
                    return new SaveLastKnownGeo((Location) parcel.readParcelable(SaveLastKnownGeo.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final SaveLastKnownGeo[] newArray(int i) {
                    return new SaveLastKnownGeo[i];
                }
            }

            public SaveLastKnownGeo(Location location) {
                this.b = location;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SaveLastKnownGeo) && epx.f(this.b, ((SaveLastKnownGeo) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "SaveLastKnownGeo(location=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class SetIsWaitingExplicit implements Fetch {
            public static final Parcelable.Creator<SetIsWaitingExplicit> CREATOR = new a();
            public final boolean b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SetIsWaitingExplicit> {
                @Override // android.os.Parcelable.Creator
                public final SetIsWaitingExplicit createFromParcel(Parcel parcel) {
                    return new SetIsWaitingExplicit(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final SetIsWaitingExplicit[] newArray(int i) {
                    return new SetIsWaitingExplicit[i];
                }
            }

            public SetIsWaitingExplicit(boolean z) {
                this.b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SetIsWaitingExplicit) && this.b == ((SetIsWaitingExplicit) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("SetIsWaitingExplicit(isExplicit="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b ? 1 : 0);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class SettingsLoadingState implements Fetch {
            public static final Parcelable.Creator<SettingsLoadingState> CREATOR = new a();
            public final LoadingState b;
            public final PostingSettings c;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SettingsLoadingState> {
                @Override // android.os.Parcelable.Creator
                public final SettingsLoadingState createFromParcel(Parcel parcel) {
                    return new SettingsLoadingState(LoadingState.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PostingSettings.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final SettingsLoadingState[] newArray(int i) {
                    return new SettingsLoadingState[i];
                }
            }

            public SettingsLoadingState(LoadingState loadingState, PostingSettings postingSettings) {
                this.b = loadingState;
                this.c = postingSettings;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SettingsLoadingState)) {
                    return false;
                }
                SettingsLoadingState settingsLoadingState = (SettingsLoadingState) obj;
                return this.b == settingsLoadingState.b && epx.f(this.c, settingsLoadingState.c);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                PostingSettings postingSettings = this.c;
                return hashCode + (postingSettings == null ? 0 : postingSettings.hashCode());
            }

            public final String toString() {
                return "SettingsLoadingState(state=" + this.b + ", loadResult=" + this.c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                this.b.writeToParcel(parcel, i);
                PostingSettings postingSettings = this.c;
                if (postingSettings == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    Serializer.StreamParcelable.a.a(postingSettings, parcel);
                }
            }

            public /* synthetic */ SettingsLoadingState(LoadingState loadingState, PostingSettings postingSettings, int i, zcl zclVar) {
                this(loadingState, (i & 2) != 0 ? null : postingSettings);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class WaitingCheckEditPostRules implements Fetch {
            public static final Parcelable.Creator<WaitingCheckEditPostRules> CREATOR = new a();
            public final CheckEditPostRules b;
            public final ErrorCheckEditPostRules c;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<WaitingCheckEditPostRules> {
                @Override // android.os.Parcelable.Creator
                public final WaitingCheckEditPostRules createFromParcel(Parcel parcel) {
                    return new WaitingCheckEditPostRules(CheckEditPostRules.CREATOR.createFromParcel(parcel), ErrorCheckEditPostRules.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final WaitingCheckEditPostRules[] newArray(int i) {
                    return new WaitingCheckEditPostRules[i];
                }
            }

            public WaitingCheckEditPostRules(CheckEditPostRules checkEditPostRules, ErrorCheckEditPostRules errorCheckEditPostRules) {
                this.b = checkEditPostRules;
                this.c = errorCheckEditPostRules;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WaitingCheckEditPostRules)) {
                    return false;
                }
                WaitingCheckEditPostRules waitingCheckEditPostRules = (WaitingCheckEditPostRules) obj;
                return epx.f(this.b, waitingCheckEditPostRules.b) && epx.f(this.c, waitingCheckEditPostRules.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "WaitingCheckEditPostRules(action=" + this.b + ", errorAction=" + this.c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                this.b.writeToParcel(parcel, i);
                this.c.writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: PostingAction.kt */
    public interface Hints extends PostingAction {

        /* compiled from: PostingAction.kt */
        public static final class DonutPrivacyOnboardingShowed implements Hints {
            public static final DonutPrivacyOnboardingShowed b = new DonutPrivacyOnboardingShowed();
            public static final Parcelable.Creator<DonutPrivacyOnboardingShowed> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<DonutPrivacyOnboardingShowed> {
                @Override // android.os.Parcelable.Creator
                public final DonutPrivacyOnboardingShowed createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return DonutPrivacyOnboardingShowed.b;
                }

                @Override // android.os.Parcelable.Creator
                public final DonutPrivacyOnboardingShowed[] newArray(int i) {
                    return new DonutPrivacyOnboardingShowed[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DonutPrivacyOnboardingShowed);
            }

            public final int hashCode() {
                return 695274291;
            }

            public final String toString() {
                return "DonutPrivacyOnboardingShowed";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class LoadRemoteDraftOnboardingHint implements Hints {
            public static final LoadRemoteDraftOnboardingHint b = new LoadRemoteDraftOnboardingHint();
            public static final Parcelable.Creator<LoadRemoteDraftOnboardingHint> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<LoadRemoteDraftOnboardingHint> {
                @Override // android.os.Parcelable.Creator
                public final LoadRemoteDraftOnboardingHint createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return LoadRemoteDraftOnboardingHint.b;
                }

                @Override // android.os.Parcelable.Creator
                public final LoadRemoteDraftOnboardingHint[] newArray(int i) {
                    return new LoadRemoteDraftOnboardingHint[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadRemoteDraftOnboardingHint);
            }

            public final int hashCode() {
                return 525653729;
            }

            public final String toString() {
                return "LoadRemoteDraftOnboardingHint";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RemoveBcProductsPostingOnboardingHint implements Hints {
            public static final RemoveBcProductsPostingOnboardingHint b = new RemoveBcProductsPostingOnboardingHint();
            public static final Parcelable.Creator<RemoveBcProductsPostingOnboardingHint> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RemoveBcProductsPostingOnboardingHint> {
                @Override // android.os.Parcelable.Creator
                public final RemoveBcProductsPostingOnboardingHint createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return RemoveBcProductsPostingOnboardingHint.b;
                }

                @Override // android.os.Parcelable.Creator
                public final RemoveBcProductsPostingOnboardingHint[] newArray(int i) {
                    return new RemoveBcProductsPostingOnboardingHint[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RemoveBcProductsPostingOnboardingHint);
            }

            public final int hashCode() {
                return 396473413;
            }

            public final String toString() {
                return "RemoveBcProductsPostingOnboardingHint";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RemoveCoauthorsOnboardingHint implements Hints {
            public static final RemoveCoauthorsOnboardingHint b = new RemoveCoauthorsOnboardingHint();
            public static final Parcelable.Creator<RemoveCoauthorsOnboardingHint> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RemoveCoauthorsOnboardingHint> {
                @Override // android.os.Parcelable.Creator
                public final RemoveCoauthorsOnboardingHint createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return RemoveCoauthorsOnboardingHint.b;
                }

                @Override // android.os.Parcelable.Creator
                public final RemoveCoauthorsOnboardingHint[] newArray(int i) {
                    return new RemoveCoauthorsOnboardingHint[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RemoveCoauthorsOnboardingHint);
            }

            public final int hashCode() {
                return -316883036;
            }

            public final String toString() {
                return "RemoveCoauthorsOnboardingHint";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RemoveDonutOnboardingHint implements Hints {
            public static final RemoveDonutOnboardingHint b = new RemoveDonutOnboardingHint();
            public static final Parcelable.Creator<RemoveDonutOnboardingHint> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RemoveDonutOnboardingHint> {
                @Override // android.os.Parcelable.Creator
                public final RemoveDonutOnboardingHint createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return RemoveDonutOnboardingHint.b;
                }

                @Override // android.os.Parcelable.Creator
                public final RemoveDonutOnboardingHint[] newArray(int i) {
                    return new RemoveDonutOnboardingHint[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RemoveDonutOnboardingHint);
            }

            public final int hashCode() {
                return 656157930;
            }

            public final String toString() {
                return "RemoveDonutOnboardingHint";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RemoveMusicSnippetOnboardingHint implements Hints {
            public static final RemoveMusicSnippetOnboardingHint b = new RemoveMusicSnippetOnboardingHint();
            public static final Parcelable.Creator<RemoveMusicSnippetOnboardingHint> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RemoveMusicSnippetOnboardingHint> {
                @Override // android.os.Parcelable.Creator
                public final RemoveMusicSnippetOnboardingHint createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return RemoveMusicSnippetOnboardingHint.b;
                }

                @Override // android.os.Parcelable.Creator
                public final RemoveMusicSnippetOnboardingHint[] newArray(int i) {
                    return new RemoveMusicSnippetOnboardingHint[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RemoveMusicSnippetOnboardingHint);
            }

            public final int hashCode() {
                return -337370124;
            }

            public final String toString() {
                return "RemoveMusicSnippetOnboardingHint";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RemoveNextStepButtonHint implements Hints {
            public static final RemoveNextStepButtonHint b = new RemoveNextStepButtonHint();
            public static final Parcelable.Creator<RemoveNextStepButtonHint> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RemoveNextStepButtonHint> {
                @Override // android.os.Parcelable.Creator
                public final RemoveNextStepButtonHint createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return RemoveNextStepButtonHint.b;
                }

                @Override // android.os.Parcelable.Creator
                public final RemoveNextStepButtonHint[] newArray(int i) {
                    return new RemoveNextStepButtonHint[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RemoveNextStepButtonHint);
            }

            public final int hashCode() {
                return 1062866930;
            }

            public final String toString() {
                return "RemoveNextStepButtonHint";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RemoveProductsActionOnboardingHint implements Hints {
            public static final RemoveProductsActionOnboardingHint b = new RemoveProductsActionOnboardingHint();
            public static final Parcelable.Creator<RemoveProductsActionOnboardingHint> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RemoveProductsActionOnboardingHint> {
                @Override // android.os.Parcelable.Creator
                public final RemoveProductsActionOnboardingHint createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return RemoveProductsActionOnboardingHint.b;
                }

                @Override // android.os.Parcelable.Creator
                public final RemoveProductsActionOnboardingHint[] newArray(int i) {
                    return new RemoveProductsActionOnboardingHint[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RemoveProductsActionOnboardingHint);
            }

            public final int hashCode() {
                return -515558538;
            }

            public final String toString() {
                return "RemoveProductsActionOnboardingHint";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RemoveRemoteDraftOnboardingHint implements Hints {
            public static final RemoveRemoteDraftOnboardingHint b = new RemoveRemoteDraftOnboardingHint();
            public static final Parcelable.Creator<RemoveRemoteDraftOnboardingHint> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RemoveRemoteDraftOnboardingHint> {
                @Override // android.os.Parcelable.Creator
                public final RemoveRemoteDraftOnboardingHint createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return RemoveRemoteDraftOnboardingHint.b;
                }

                @Override // android.os.Parcelable.Creator
                public final RemoveRemoteDraftOnboardingHint[] newArray(int i) {
                    return new RemoveRemoteDraftOnboardingHint[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RemoveRemoteDraftOnboardingHint);
            }

            public final int hashCode() {
                return 1340896899;
            }

            public final String toString() {
                return "RemoveRemoteDraftOnboardingHint";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RemoveVkTicketOnboardingHint implements Hints {
            public static final RemoveVkTicketOnboardingHint b = new RemoveVkTicketOnboardingHint();
            public static final Parcelable.Creator<RemoveVkTicketOnboardingHint> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RemoveVkTicketOnboardingHint> {
                @Override // android.os.Parcelable.Creator
                public final RemoveVkTicketOnboardingHint createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return RemoveVkTicketOnboardingHint.b;
                }

                @Override // android.os.Parcelable.Creator
                public final RemoveVkTicketOnboardingHint[] newArray(int i) {
                    return new RemoveVkTicketOnboardingHint[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RemoveVkTicketOnboardingHint);
            }

            public final int hashCode() {
                return -1524529123;
            }

            public final String toString() {
                return "RemoveVkTicketOnboardingHint";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RepostToStoryOnboardingShowed implements Hints {
            public static final RepostToStoryOnboardingShowed b = new RepostToStoryOnboardingShowed();
            public static final Parcelable.Creator<RepostToStoryOnboardingShowed> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RepostToStoryOnboardingShowed> {
                @Override // android.os.Parcelable.Creator
                public final RepostToStoryOnboardingShowed createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return RepostToStoryOnboardingShowed.b;
                }

                @Override // android.os.Parcelable.Creator
                public final RepostToStoryOnboardingShowed[] newArray(int i) {
                    return new RepostToStoryOnboardingShowed[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RepostToStoryOnboardingShowed);
            }

            public final int hashCode() {
                return -467675416;
            }

            public final String toString() {
                return "RepostToStoryOnboardingShowed";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: PostingAction.kt */
    public interface Init extends PostingAction {

        /* compiled from: PostingAction.kt */
        public static final class EditPost implements Init {
            public static final Parcelable.Creator<EditPost> CREATOR = new a();
            public final WallOwner b;
            public final Publisher c;
            public final Signer d;
            public final PostEditableData e;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<EditPost> {
                @Override // android.os.Parcelable.Creator
                public final EditPost createFromParcel(Parcel parcel) {
                    return new EditPost(WallOwner.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Publisher.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Signer.CREATOR.createFromParcel(parcel) : null, PostEditableData.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final EditPost[] newArray(int i) {
                    return new EditPost[i];
                }
            }

            public EditPost(WallOwner wallOwner, Publisher publisher, Signer signer, PostEditableData postEditableData) {
                this.b = wallOwner;
                this.c = publisher;
                this.d = signer;
                this.e = postEditableData;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EditPost)) {
                    return false;
                }
                EditPost editPost = (EditPost) obj;
                return epx.f(this.b, editPost.b) && epx.f(this.c, editPost.c) && epx.f(this.d, editPost.d) && epx.f(this.e, editPost.e);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                Publisher publisher = this.c;
                int hashCode2 = (hashCode + (publisher == null ? 0 : publisher.hashCode())) * 31;
                Signer signer = this.d;
                return this.e.hashCode() + ((hashCode2 + (signer != null ? signer.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "EditPost(owner=" + this.b + ", publisher=" + this.c + ", signer=" + this.d + ", editableData=" + this.e + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Serializer.StreamParcelable.a.a(this.b, parcel);
                Publisher publisher = this.c;
                if (publisher == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    Serializer.StreamParcelable.a.a(publisher, parcel);
                }
                Signer signer = this.d;
                if (signer == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    Serializer.StreamParcelable.a.a(signer, parcel);
                }
                this.e.writeToParcel(parcel, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class EditRemoteDraft implements Init {
            public static final Parcelable.Creator<EditRemoteDraft> CREATOR = new a();
            public final WallOwner b;
            public final Publisher c;
            public final Signer d;
            public final PostEditableData e;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<EditRemoteDraft> {
                @Override // android.os.Parcelable.Creator
                public final EditRemoteDraft createFromParcel(Parcel parcel) {
                    return new EditRemoteDraft(WallOwner.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Publisher.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Signer.CREATOR.createFromParcel(parcel) : null, PostEditableData.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final EditRemoteDraft[] newArray(int i) {
                    return new EditRemoteDraft[i];
                }
            }

            public EditRemoteDraft(WallOwner wallOwner, Publisher publisher, Signer signer, PostEditableData postEditableData) {
                this.b = wallOwner;
                this.c = publisher;
                this.d = signer;
                this.e = postEditableData;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EditRemoteDraft)) {
                    return false;
                }
                EditRemoteDraft editRemoteDraft = (EditRemoteDraft) obj;
                return epx.f(this.b, editRemoteDraft.b) && epx.f(this.c, editRemoteDraft.c) && epx.f(this.d, editRemoteDraft.d) && epx.f(this.e, editRemoteDraft.e);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                Publisher publisher = this.c;
                int hashCode2 = (hashCode + (publisher == null ? 0 : publisher.hashCode())) * 31;
                Signer signer = this.d;
                return this.e.hashCode() + ((hashCode2 + (signer != null ? signer.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "EditRemoteDraft(owner=" + this.b + ", publisher=" + this.c + ", signer=" + this.d + ", editableData=" + this.e + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Serializer.StreamParcelable.a.a(this.b, parcel);
                Publisher publisher = this.c;
                if (publisher == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    Serializer.StreamParcelable.a.a(publisher, parcel);
                }
                Signer signer = this.d;
                if (signer == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    Serializer.StreamParcelable.a.a(signer, parcel);
                }
                this.e.writeToParcel(parcel, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class LoadLocalDraft implements Init {
            public static final Parcelable.Creator<LoadLocalDraft> CREATOR = new a();
            public final WallOwner b;
            public final long c;
            public final boolean d;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<LoadLocalDraft> {
                @Override // android.os.Parcelable.Creator
                public final LoadLocalDraft createFromParcel(Parcel parcel) {
                    return new LoadLocalDraft(WallOwner.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final LoadLocalDraft[] newArray(int i) {
                    return new LoadLocalDraft[i];
                }
            }

            public LoadLocalDraft(WallOwner wallOwner, long j, boolean z) {
                this.b = wallOwner;
                this.c = j;
                this.d = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadLocalDraft)) {
                    return false;
                }
                LoadLocalDraft loadLocalDraft = (LoadLocalDraft) obj;
                return epx.f(this.b, loadLocalDraft.b) && this.c == loadLocalDraft.c && this.d == loadLocalDraft.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + bh10.a(this.b.hashCode() * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LoadLocalDraft(owner=");
                sb.append(this.b);
                sb.append(", draftId=");
                sb.append(this.c);
                sb.append(", isSignChangeAllowed=");
                return q0.a(sb, this.d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Serializer.StreamParcelable.a.a(this.b, parcel);
                parcel.writeLong(this.c);
                parcel.writeInt(this.d ? 1 : 0);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class NewPost implements Init {
            public static final Parcelable.Creator<NewPost> CREATOR = new a();
            public final WallOwner b;
            public final PostEditableData c;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<NewPost> {
                @Override // android.os.Parcelable.Creator
                public final NewPost createFromParcel(Parcel parcel) {
                    return new NewPost(WallOwner.CREATOR.createFromParcel(parcel), PostEditableData.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final NewPost[] newArray(int i) {
                    return new NewPost[i];
                }
            }

            public NewPost(WallOwner wallOwner, PostEditableData postEditableData) {
                this.b = wallOwner;
                this.c = postEditableData;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NewPost)) {
                    return false;
                }
                NewPost newPost = (NewPost) obj;
                return epx.f(this.b, newPost.b) && epx.f(this.c, newPost.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "NewPost(owner=" + this.b + ", preFilledData=" + this.c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Serializer.StreamParcelable.a.a(this.b, parcel);
                this.c.writeToParcel(parcel, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RestoreState implements Init {
            public static final Parcelable.Creator<RestoreState> CREATOR = new a();
            public final PostingState b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RestoreState> {
                @Override // android.os.Parcelable.Creator
                public final RestoreState createFromParcel(Parcel parcel) {
                    return new RestoreState((PostingState) parcel.readParcelable(RestoreState.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final RestoreState[] newArray(int i) {
                    return new RestoreState[i];
                }
            }

            public RestoreState(PostingState postingState) {
                this.b = postingState;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RestoreState) && epx.f(this.b, ((RestoreState) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "RestoreState(state=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RestoreStateFromDisk implements Init {
            public static final Parcelable.Creator<RestoreStateFromDisk> CREATOR = new a();
            public final RestorePostingStateMeta b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RestoreStateFromDisk> {
                @Override // android.os.Parcelable.Creator
                public final RestoreStateFromDisk createFromParcel(Parcel parcel) {
                    return new RestoreStateFromDisk(RestorePostingStateMeta.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final RestoreStateFromDisk[] newArray(int i) {
                    return new RestoreStateFromDisk[i];
                }
            }

            public RestoreStateFromDisk(RestorePostingStateMeta restorePostingStateMeta) {
                this.b = restorePostingStateMeta;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RestoreStateFromDisk) && epx.f(this.b, ((RestoreStateFromDisk) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "RestoreStateFromDisk(meta=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                this.b.writeToParcel(parcel, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RestoreStateLoaded implements Init {
            public static final Parcelable.Creator<RestoreStateLoaded> CREATOR = new a();
            public final PostingState b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RestoreStateLoaded> {
                @Override // android.os.Parcelable.Creator
                public final RestoreStateLoaded createFromParcel(Parcel parcel) {
                    return new RestoreStateLoaded((PostingState) parcel.readParcelable(RestoreStateLoaded.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final RestoreStateLoaded[] newArray(int i) {
                    return new RestoreStateLoaded[i];
                }
            }

            public RestoreStateLoaded(PostingState postingState) {
                this.b = postingState;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RestoreStateLoaded) && epx.f(this.b, ((RestoreStateLoaded) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "RestoreStateLoaded(state=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }
    }

    /* compiled from: PostingAction.kt */
    public interface LocalDraft extends PostingAction {

        /* compiled from: PostingAction.kt */
        public static final class RemoveDraft implements LocalDraft {
            public static final RemoveDraft b = new RemoveDraft();
            public static final Parcelable.Creator<RemoveDraft> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RemoveDraft> {
                @Override // android.os.Parcelable.Creator
                public final RemoveDraft createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return RemoveDraft.b;
                }

                @Override // android.os.Parcelable.Creator
                public final RemoveDraft[] newArray(int i) {
                    return new RemoveDraft[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RemoveDraft);
            }

            public final int hashCode() {
                return -1891843303;
            }

            public final String toString() {
                return "RemoveDraft";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class SaveDraft implements LocalDraft {
            public static final SaveDraft b = new SaveDraft();
            public static final Parcelable.Creator<SaveDraft> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SaveDraft> {
                @Override // android.os.Parcelable.Creator
                public final SaveDraft createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return SaveDraft.b;
                }

                @Override // android.os.Parcelable.Creator
                public final SaveDraft[] newArray(int i) {
                    return new SaveDraft[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SaveDraft);
            }

            public final int hashCode() {
                return 470344896;
            }

            public final String toString() {
                return "SaveDraft";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: PostingAction.kt */
    public interface MediaPicker extends PostingAction {

        /* compiled from: PostingAction.kt */
        public static final class AddAttachFromUri implements MediaPicker {
            public static final Parcelable.Creator<AddAttachFromUri> CREATOR = new a();
            public final Uri b;
            public final boolean c;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<AddAttachFromUri> {
                @Override // android.os.Parcelable.Creator
                public final AddAttachFromUri createFromParcel(Parcel parcel) {
                    return new AddAttachFromUri((Uri) parcel.readParcelable(AddAttachFromUri.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final AddAttachFromUri[] newArray(int i) {
                    return new AddAttachFromUri[i];
                }
            }

            public AddAttachFromUri(Uri uri, boolean z) {
                this.b = uri;
                this.c = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AddAttachFromUri)) {
                    return false;
                }
                AddAttachFromUri addAttachFromUri = (AddAttachFromUri) obj;
                return epx.f(this.b, addAttachFromUri.b) && this.c == addAttachFromUri.c;
            }

            public final int hashCode() {
                Uri uri = this.b;
                return Boolean.hashCode(this.c) + ((uri == null ? 0 : uri.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AddAttachFromUri(uri=");
                sb.append(this.b);
                sb.append(", isVideo=");
                return q0.a(sb, this.c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                parcel.writeInt(this.c ? 1 : 0);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class CameraClosed implements MediaPicker {
            public static final Parcelable.Creator<CameraClosed> CREATOR = new a();
            public final Uri b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<CameraClosed> {
                @Override // android.os.Parcelable.Creator
                public final CameraClosed createFromParcel(Parcel parcel) {
                    return new CameraClosed((Uri) parcel.readParcelable(CameraClosed.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final CameraClosed[] newArray(int i) {
                    return new CameraClosed[i];
                }
            }

            public CameraClosed(Uri uri) {
                this.b = uri;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CameraClosed) && epx.f(this.b, ((CameraClosed) obj).b);
            }

            public final int hashCode() {
                Uri uri = this.b;
                if (uri == null) {
                    return 0;
                }
                return uri.hashCode();
            }

            public final String toString() {
                return alb0.b(new StringBuilder("CameraClosed(uri="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class LoadLocalMediaPage implements MediaPicker {
            public static final Parcelable.Creator<LoadLocalMediaPage> CREATOR = new a();
            public final MediaPickerPageLoadType b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<LoadLocalMediaPage> {
                @Override // android.os.Parcelable.Creator
                public final LoadLocalMediaPage createFromParcel(Parcel parcel) {
                    return new LoadLocalMediaPage(MediaPickerPageLoadType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final LoadLocalMediaPage[] newArray(int i) {
                    return new LoadLocalMediaPage[i];
                }
            }

            public LoadLocalMediaPage(MediaPickerPageLoadType mediaPickerPageLoadType) {
                this.b = mediaPickerPageLoadType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadLocalMediaPage) && this.b == ((LoadLocalMediaPage) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "LoadLocalMediaPage(loadType=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b.name());
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class OnSheetTransitionFinished implements MediaPicker {
            public static final Parcelable.Creator<OnSheetTransitionFinished> CREATOR = new a();
            public final MediaPickerState.SheetState b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<OnSheetTransitionFinished> {
                @Override // android.os.Parcelable.Creator
                public final OnSheetTransitionFinished createFromParcel(Parcel parcel) {
                    return new OnSheetTransitionFinished(MediaPickerState.SheetState.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final OnSheetTransitionFinished[] newArray(int i) {
                    return new OnSheetTransitionFinished[i];
                }
            }

            public OnSheetTransitionFinished(MediaPickerState.SheetState sheetState) {
                this.b = sheetState;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnSheetTransitionFinished) && this.b == ((OnSheetTransitionFinished) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OnSheetTransitionFinished(state=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b.name());
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class OpenCamera implements MediaPicker {
            public static final OpenCamera b = new OpenCamera();
            public static final Parcelable.Creator<OpenCamera> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<OpenCamera> {
                @Override // android.os.Parcelable.Creator
                public final OpenCamera createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return OpenCamera.b;
                }

                @Override // android.os.Parcelable.Creator
                public final OpenCamera[] newArray(int i) {
                    return new OpenCamera[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenCamera);
            }

            public final int hashCode() {
                return 1657111743;
            }

            public final String toString() {
                return "OpenCamera";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class PageViewCreated implements MediaPicker {
            public static final PageViewCreated b = new PageViewCreated();
            public static final Parcelable.Creator<PageViewCreated> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<PageViewCreated> {
                @Override // android.os.Parcelable.Creator
                public final PageViewCreated createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return PageViewCreated.b;
                }

                @Override // android.os.Parcelable.Creator
                public final PageViewCreated[] newArray(int i) {
                    return new PageViewCreated[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PageViewCreated);
            }

            public final int hashCode() {
                return -1827697212;
            }

            public final String toString() {
                return "PageViewCreated";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class ReplaceAttachFromUri implements MediaPicker {
            public static final Parcelable.Creator<ReplaceAttachFromUri> CREATOR = new a();
            public final MediaStoreEntry b;
            public final Uri c;
            public final boolean d;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<ReplaceAttachFromUri> {
                @Override // android.os.Parcelable.Creator
                public final ReplaceAttachFromUri createFromParcel(Parcel parcel) {
                    return new ReplaceAttachFromUri((MediaStoreEntry) parcel.readParcelable(ReplaceAttachFromUri.class.getClassLoader()), (Uri) parcel.readParcelable(ReplaceAttachFromUri.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final ReplaceAttachFromUri[] newArray(int i) {
                    return new ReplaceAttachFromUri[i];
                }
            }

            public ReplaceAttachFromUri(MediaStoreEntry mediaStoreEntry, Uri uri, boolean z) {
                this.b = mediaStoreEntry;
                this.c = uri;
                this.d = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ReplaceAttachFromUri)) {
                    return false;
                }
                ReplaceAttachFromUri replaceAttachFromUri = (ReplaceAttachFromUri) obj;
                return epx.f(this.b, replaceAttachFromUri.b) && epx.f(this.c, replaceAttachFromUri.c) && this.d == replaceAttachFromUri.d;
            }

            public final int hashCode() {
                MediaStoreEntry mediaStoreEntry = this.b;
                int hashCode = (mediaStoreEntry == null ? 0 : mediaStoreEntry.hashCode()) * 31;
                Uri uri = this.c;
                return Boolean.hashCode(this.d) + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ReplaceAttachFromUri(oldEntry=");
                sb.append(this.b);
                sb.append(", newUri=");
                sb.append(this.c);
                sb.append(", isVideo=");
                return q0.a(sb, this.d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                parcel.writeParcelable(this.c, i);
                parcel.writeInt(this.d ? 1 : 0);
            }
        }

        /* compiled from: PostingAction.kt */
        public interface Selection extends MediaPicker {

            /* compiled from: PostingAction.kt */
            public static final class AddLocalMediaItemSelection implements Selection {
                public static final Parcelable.Creator<AddLocalMediaItemSelection> CREATOR = new a();
                public final MediaPickerSelectedItem.LocalMedia b;
                public final long c;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<AddLocalMediaItemSelection> {
                    @Override // android.os.Parcelable.Creator
                    public final AddLocalMediaItemSelection createFromParcel(Parcel parcel) {
                        return new AddLocalMediaItemSelection(MediaPickerSelectedItem.LocalMedia.CREATOR.createFromParcel(parcel), parcel.readLong());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final AddLocalMediaItemSelection[] newArray(int i) {
                        return new AddLocalMediaItemSelection[i];
                    }
                }

                public AddLocalMediaItemSelection(MediaPickerSelectedItem.LocalMedia localMedia, long j) {
                    this.b = localMedia;
                    this.c = j;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AddLocalMediaItemSelection)) {
                        return false;
                    }
                    AddLocalMediaItemSelection addLocalMediaItemSelection = (AddLocalMediaItemSelection) obj;
                    return epx.f(this.b, addLocalMediaItemSelection.b) && this.c == addLocalMediaItemSelection.c;
                }

                public final int hashCode() {
                    return Long.hashCode(this.c) + (this.b.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("AddLocalMediaItemSelection(item=");
                    sb.append(this.b);
                    sb.append(", elapsedTime=");
                    return vu5.a(')', this.c, sb);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    this.b.writeToParcel(parcel, i);
                    parcel.writeLong(this.c);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class AddVkPhotoItemSelection implements Selection {
                public static final Parcelable.Creator<AddVkPhotoItemSelection> CREATOR = new a();
                public final MediaPickerSelectedItem.VkPhoto b;
                public final long c;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<AddVkPhotoItemSelection> {
                    @Override // android.os.Parcelable.Creator
                    public final AddVkPhotoItemSelection createFromParcel(Parcel parcel) {
                        return new AddVkPhotoItemSelection(MediaPickerSelectedItem.VkPhoto.CREATOR.createFromParcel(parcel), parcel.readLong());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final AddVkPhotoItemSelection[] newArray(int i) {
                        return new AddVkPhotoItemSelection[i];
                    }
                }

                public AddVkPhotoItemSelection(MediaPickerSelectedItem.VkPhoto vkPhoto, long j) {
                    this.b = vkPhoto;
                    this.c = j;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AddVkPhotoItemSelection)) {
                        return false;
                    }
                    AddVkPhotoItemSelection addVkPhotoItemSelection = (AddVkPhotoItemSelection) obj;
                    return epx.f(this.b, addVkPhotoItemSelection.b) && this.c == addVkPhotoItemSelection.c;
                }

                public final int hashCode() {
                    return Long.hashCode(this.c) + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("AddVkPhotoItemSelection(item=");
                    sb.append(this.b);
                    sb.append(", elapsedTime=");
                    return vu5.a(')', this.c, sb);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    this.b.writeToParcel(parcel, i);
                    parcel.writeLong(this.c);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class ForceRemoveAttachFromSelected implements Selection {
                public static final Parcelable.Creator<ForceRemoveAttachFromSelected> CREATOR = new a();
                public final Attachment b;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<ForceRemoveAttachFromSelected> {
                    @Override // android.os.Parcelable.Creator
                    public final ForceRemoveAttachFromSelected createFromParcel(Parcel parcel) {
                        return new ForceRemoveAttachFromSelected((Attachment) parcel.readParcelable(ForceRemoveAttachFromSelected.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ForceRemoveAttachFromSelected[] newArray(int i) {
                        return new ForceRemoveAttachFromSelected[i];
                    }
                }

                public ForceRemoveAttachFromSelected(Attachment attachment) {
                    this.b = attachment;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ForceRemoveAttachFromSelected) && epx.f(this.b, ((ForceRemoveAttachFromSelected) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "ForceRemoveAttachFromSelected(attachment=" + this.b + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeParcelable(this.b, i);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class ForceRemoveFromSelected implements Selection {
                public static final Parcelable.Creator<ForceRemoveFromSelected> CREATOR = new a();
                public final MediaPickerSelectedItem b;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<ForceRemoveFromSelected> {
                    @Override // android.os.Parcelable.Creator
                    public final ForceRemoveFromSelected createFromParcel(Parcel parcel) {
                        return new ForceRemoveFromSelected((MediaPickerSelectedItem) parcel.readParcelable(ForceRemoveFromSelected.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ForceRemoveFromSelected[] newArray(int i) {
                        return new ForceRemoveFromSelected[i];
                    }
                }

                public ForceRemoveFromSelected(MediaPickerSelectedItem mediaPickerSelectedItem) {
                    this.b = mediaPickerSelectedItem;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ForceRemoveFromSelected) && epx.f(this.b, ((ForceRemoveFromSelected) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "ForceRemoveFromSelected(item=" + this.b + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeParcelable(this.b, i);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class ForceToggleLocalMediaItemSelection implements Selection {
                public static final Parcelable.Creator<ForceToggleLocalMediaItemSelection> CREATOR = new a();
                public final MediaPickerSelectedItem.LocalMedia b;
                public final long c;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<ForceToggleLocalMediaItemSelection> {
                    @Override // android.os.Parcelable.Creator
                    public final ForceToggleLocalMediaItemSelection createFromParcel(Parcel parcel) {
                        return new ForceToggleLocalMediaItemSelection(MediaPickerSelectedItem.LocalMedia.CREATOR.createFromParcel(parcel), parcel.readLong());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ForceToggleLocalMediaItemSelection[] newArray(int i) {
                        return new ForceToggleLocalMediaItemSelection[i];
                    }
                }

                public ForceToggleLocalMediaItemSelection(MediaPickerSelectedItem.LocalMedia localMedia, long j) {
                    this.b = localMedia;
                    this.c = j;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ForceToggleLocalMediaItemSelection)) {
                        return false;
                    }
                    ForceToggleLocalMediaItemSelection forceToggleLocalMediaItemSelection = (ForceToggleLocalMediaItemSelection) obj;
                    return epx.f(this.b, forceToggleLocalMediaItemSelection.b) && this.c == forceToggleLocalMediaItemSelection.c;
                }

                public final int hashCode() {
                    return Long.hashCode(this.c) + (this.b.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ForceToggleLocalMediaItemSelection(item=");
                    sb.append(this.b);
                    sb.append(", elapsedTime=");
                    return vu5.a(')', this.c, sb);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    this.b.writeToParcel(parcel, i);
                    parcel.writeLong(this.c);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class ForceToggleVkPhotoItemSelection implements Selection {
                public static final Parcelable.Creator<ForceToggleVkPhotoItemSelection> CREATOR = new a();
                public final MediaPickerSelectedItem.VkPhoto b;
                public final long c;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<ForceToggleVkPhotoItemSelection> {
                    @Override // android.os.Parcelable.Creator
                    public final ForceToggleVkPhotoItemSelection createFromParcel(Parcel parcel) {
                        return new ForceToggleVkPhotoItemSelection(MediaPickerSelectedItem.VkPhoto.CREATOR.createFromParcel(parcel), parcel.readLong());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ForceToggleVkPhotoItemSelection[] newArray(int i) {
                        return new ForceToggleVkPhotoItemSelection[i];
                    }
                }

                public ForceToggleVkPhotoItemSelection(MediaPickerSelectedItem.VkPhoto vkPhoto, long j) {
                    this.b = vkPhoto;
                    this.c = j;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ForceToggleVkPhotoItemSelection)) {
                        return false;
                    }
                    ForceToggleVkPhotoItemSelection forceToggleVkPhotoItemSelection = (ForceToggleVkPhotoItemSelection) obj;
                    return epx.f(this.b, forceToggleVkPhotoItemSelection.b) && this.c == forceToggleVkPhotoItemSelection.c;
                }

                public final int hashCode() {
                    return Long.hashCode(this.c) + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ForceToggleVkPhotoItemSelection(item=");
                    sb.append(this.b);
                    sb.append(", elapsedTime=");
                    return vu5.a(')', this.c, sb);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    this.b.writeToParcel(parcel, i);
                    parcel.writeLong(this.c);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class RemoveAttach implements Selection {
                public static final Parcelable.Creator<RemoveAttach> CREATOR = new a();
                public final Attachment b;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<RemoveAttach> {
                    @Override // android.os.Parcelable.Creator
                    public final RemoveAttach createFromParcel(Parcel parcel) {
                        return new RemoveAttach((Attachment) parcel.readParcelable(RemoveAttach.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final RemoveAttach[] newArray(int i) {
                        return new RemoveAttach[i];
                    }
                }

                public RemoveAttach(Attachment attachment) {
                    this.b = attachment;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof RemoveAttach) && epx.f(this.b, ((RemoveAttach) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "RemoveAttach(attachment=" + this.b + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeParcelable(this.b, i);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class RemoveAttachFromSelected implements Selection {
                public static final Parcelable.Creator<RemoveAttachFromSelected> CREATOR = new a();
                public final Attachment b;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<RemoveAttachFromSelected> {
                    @Override // android.os.Parcelable.Creator
                    public final RemoveAttachFromSelected createFromParcel(Parcel parcel) {
                        return new RemoveAttachFromSelected((Attachment) parcel.readParcelable(RemoveAttachFromSelected.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final RemoveAttachFromSelected[] newArray(int i) {
                        return new RemoveAttachFromSelected[i];
                    }
                }

                public RemoveAttachFromSelected(Attachment attachment) {
                    this.b = attachment;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof RemoveAttachFromSelected) && epx.f(this.b, ((RemoveAttachFromSelected) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "RemoveAttachFromSelected(attachment=" + this.b + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeParcelable(this.b, i);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class RemoveFromSelected implements Selection {
                public static final Parcelable.Creator<RemoveFromSelected> CREATOR = new a();
                public final MediaPickerSelectedItem b;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<RemoveFromSelected> {
                    @Override // android.os.Parcelable.Creator
                    public final RemoveFromSelected createFromParcel(Parcel parcel) {
                        return new RemoveFromSelected((MediaPickerSelectedItem) parcel.readParcelable(RemoveFromSelected.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final RemoveFromSelected[] newArray(int i) {
                        return new RemoveFromSelected[i];
                    }
                }

                public RemoveFromSelected(MediaPickerSelectedItem mediaPickerSelectedItem) {
                    this.b = mediaPickerSelectedItem;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof RemoveFromSelected) && epx.f(this.b, ((RemoveFromSelected) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "RemoveFromSelected(item=" + this.b + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeParcelable(this.b, i);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class ToggleLocalMediaItemSelection implements Selection {
                public static final Parcelable.Creator<ToggleLocalMediaItemSelection> CREATOR = new a();
                public final MediaPickerSelectedItem.LocalMedia b;
                public final long c;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<ToggleLocalMediaItemSelection> {
                    @Override // android.os.Parcelable.Creator
                    public final ToggleLocalMediaItemSelection createFromParcel(Parcel parcel) {
                        return new ToggleLocalMediaItemSelection(MediaPickerSelectedItem.LocalMedia.CREATOR.createFromParcel(parcel), parcel.readLong());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ToggleLocalMediaItemSelection[] newArray(int i) {
                        return new ToggleLocalMediaItemSelection[i];
                    }
                }

                public ToggleLocalMediaItemSelection(MediaPickerSelectedItem.LocalMedia localMedia, long j) {
                    this.b = localMedia;
                    this.c = j;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ToggleLocalMediaItemSelection)) {
                        return false;
                    }
                    ToggleLocalMediaItemSelection toggleLocalMediaItemSelection = (ToggleLocalMediaItemSelection) obj;
                    return epx.f(this.b, toggleLocalMediaItemSelection.b) && this.c == toggleLocalMediaItemSelection.c;
                }

                public final int hashCode() {
                    return Long.hashCode(this.c) + (this.b.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ToggleLocalMediaItemSelection(item=");
                    sb.append(this.b);
                    sb.append(", elapsedTime=");
                    return vu5.a(')', this.c, sb);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    this.b.writeToParcel(parcel, i);
                    parcel.writeLong(this.c);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class ToggleVkPhotoItemSelection implements Selection {
                public static final Parcelable.Creator<ToggleVkPhotoItemSelection> CREATOR = new a();
                public final MediaPickerSelectedItem.VkPhoto b;
                public final long c;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<ToggleVkPhotoItemSelection> {
                    @Override // android.os.Parcelable.Creator
                    public final ToggleVkPhotoItemSelection createFromParcel(Parcel parcel) {
                        return new ToggleVkPhotoItemSelection(MediaPickerSelectedItem.VkPhoto.CREATOR.createFromParcel(parcel), parcel.readLong());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ToggleVkPhotoItemSelection[] newArray(int i) {
                        return new ToggleVkPhotoItemSelection[i];
                    }
                }

                public ToggleVkPhotoItemSelection(MediaPickerSelectedItem.VkPhoto vkPhoto, long j) {
                    this.b = vkPhoto;
                    this.c = j;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ToggleVkPhotoItemSelection)) {
                        return false;
                    }
                    ToggleVkPhotoItemSelection toggleVkPhotoItemSelection = (ToggleVkPhotoItemSelection) obj;
                    return epx.f(this.b, toggleVkPhotoItemSelection.b) && this.c == toggleVkPhotoItemSelection.c;
                }

                public final int hashCode() {
                    return Long.hashCode(this.c) + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ToggleVkPhotoItemSelection(item=");
                    sb.append(this.b);
                    sb.append(", elapsedTime=");
                    return vu5.a(')', this.c, sb);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    this.b.writeToParcel(parcel, i);
                    parcel.writeLong(this.c);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class ToggleVkVideoItemSelection implements Selection {
                public static final Parcelable.Creator<ToggleVkVideoItemSelection> CREATOR = new a();
                public final MediaPickerSelectedItem.VkVideo b;
                public final long c;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<ToggleVkVideoItemSelection> {
                    @Override // android.os.Parcelable.Creator
                    public final ToggleVkVideoItemSelection createFromParcel(Parcel parcel) {
                        return new ToggleVkVideoItemSelection(MediaPickerSelectedItem.VkVideo.CREATOR.createFromParcel(parcel), parcel.readLong());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ToggleVkVideoItemSelection[] newArray(int i) {
                        return new ToggleVkVideoItemSelection[i];
                    }
                }

                public ToggleVkVideoItemSelection(MediaPickerSelectedItem.VkVideo vkVideo, long j) {
                    this.b = vkVideo;
                    this.c = j;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ToggleVkVideoItemSelection)) {
                        return false;
                    }
                    ToggleVkVideoItemSelection toggleVkVideoItemSelection = (ToggleVkVideoItemSelection) obj;
                    return epx.f(this.b, toggleVkVideoItemSelection.b) && this.c == toggleVkVideoItemSelection.c;
                }

                public final int hashCode() {
                    return Long.hashCode(this.c) + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ToggleVkVideoItemSelection(item=");
                    sb.append(this.b);
                    sb.append(", elapsedTime=");
                    return vu5.a(')', this.c, sb);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    this.b.writeToParcel(parcel, i);
                    parcel.writeLong(this.c);
                }
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class SheetStateChanged implements MediaPicker {
            public static final Parcelable.Creator<SheetStateChanged> CREATOR = new a();
            public final MediaPickerState.SheetState b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SheetStateChanged> {
                @Override // android.os.Parcelable.Creator
                public final SheetStateChanged createFromParcel(Parcel parcel) {
                    return new SheetStateChanged(MediaPickerState.SheetState.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final SheetStateChanged[] newArray(int i) {
                    return new SheetStateChanged[i];
                }
            }

            public SheetStateChanged(MediaPickerState.SheetState sheetState) {
                this.b = sheetState;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SheetStateChanged) && this.b == ((SheetStateChanged) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "SheetStateChanged(currentState=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b.name());
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class SheetTransition implements MediaPicker {
            public static final Parcelable.Creator<SheetTransition> CREATOR = new a();
            public final MediaPickerState.SheetState b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SheetTransition> {
                @Override // android.os.Parcelable.Creator
                public final SheetTransition createFromParcel(Parcel parcel) {
                    return new SheetTransition(MediaPickerState.SheetState.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final SheetTransition[] newArray(int i) {
                    return new SheetTransition[i];
                }
            }

            public SheetTransition(MediaPickerState.SheetState sheetState) {
                this.b = sheetState;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SheetTransition) && this.b == ((SheetTransition) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "SheetTransition(to=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b.name());
            }
        }
    }

    /* compiled from: PostingAction.kt */
    public interface Mentions extends PostingAction {

        /* compiled from: PostingAction.kt */
        public static final class CloseMentionBottomSheet implements Mentions {
            public static final CloseMentionBottomSheet b = new CloseMentionBottomSheet();
            public static final Parcelable.Creator<CloseMentionBottomSheet> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<CloseMentionBottomSheet> {
                @Override // android.os.Parcelable.Creator
                public final CloseMentionBottomSheet createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return CloseMentionBottomSheet.b;
                }

                @Override // android.os.Parcelable.Creator
                public final CloseMentionBottomSheet[] newArray(int i) {
                    return new CloseMentionBottomSheet[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CloseMentionBottomSheet);
            }

            public final int hashCode() {
                return -1357534671;
            }

            public final String toString() {
                return "CloseMentionBottomSheet";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class LoadMentionById implements Mentions {
            public static final Parcelable.Creator<LoadMentionById> CREATOR = new a();
            public final UserId b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<LoadMentionById> {
                @Override // android.os.Parcelable.Creator
                public final LoadMentionById createFromParcel(Parcel parcel) {
                    return new LoadMentionById((UserId) parcel.readParcelable(LoadMentionById.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final LoadMentionById[] newArray(int i) {
                    return new LoadMentionById[i];
                }
            }

            public LoadMentionById(UserId userId) {
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
                return (obj instanceof LoadMentionById) && epx.f(this.b, ((LoadMentionById) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("LoadMentionById(profileId="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class LoadMentions implements Mentions {
            public static final Parcelable.Creator<LoadMentions> CREATOR = new a();
            public final String b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<LoadMentions> {
                @Override // android.os.Parcelable.Creator
                public final LoadMentions createFromParcel(Parcel parcel) {
                    return new LoadMentions(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final LoadMentions[] newArray(int i) {
                    return new LoadMentions[i];
                }
            }

            public LoadMentions(String str) {
                this.b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadMentions) && epx.f(this.b, ((LoadMentions) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("LoadMentions(query="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class MentionSelected implements Mentions {
            public static final Parcelable.Creator<MentionSelected> CREATOR = new a();
            public final PostMentionProfile b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<MentionSelected> {
                @Override // android.os.Parcelable.Creator
                public final MentionSelected createFromParcel(Parcel parcel) {
                    return new MentionSelected(PostMentionProfile.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final MentionSelected[] newArray(int i) {
                    return new MentionSelected[i];
                }
            }

            public MentionSelected(PostMentionProfile postMentionProfile) {
                this.b = postMentionProfile;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MentionSelected) && epx.f(this.b, ((MentionSelected) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "MentionSelected(profile=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                this.b.writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: PostingAction.kt */
    public interface Navigation extends PostingAction {

        /* compiled from: PostingAction.kt */
        public static final class Back implements Navigation {
            public static final Back b = new Back();
            public static final Parcelable.Creator<Back> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<Back> {
                @Override // android.os.Parcelable.Creator
                public final Back createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Back.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Back[] newArray(int i) {
                    return new Back[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Back);
            }

            public final int hashCode() {
                return -1394824595;
            }

            public final String toString() {
                return "Back";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class BackPressed implements Navigation {
            public static final BackPressed b = new BackPressed();
            public static final Parcelable.Creator<BackPressed> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<BackPressed> {
                @Override // android.os.Parcelable.Creator
                public final BackPressed createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return BackPressed.b;
                }

                @Override // android.os.Parcelable.Creator
                public final BackPressed[] newArray(int i) {
                    return new BackPressed[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof BackPressed);
            }

            public final int hashCode() {
                return 1989178613;
            }

            public final String toString() {
                return "BackPressed";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class CheckRedirect implements Navigation {
            public static final Parcelable.Creator<CheckRedirect> CREATOR = new a();
            public final PostingStepScreen b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<CheckRedirect> {
                @Override // android.os.Parcelable.Creator
                public final CheckRedirect createFromParcel(Parcel parcel) {
                    return new CheckRedirect((PostingStepScreen) parcel.readParcelable(CheckRedirect.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final CheckRedirect[] newArray(int i) {
                    return new CheckRedirect[i];
                }
            }

            public CheckRedirect(PostingStepScreen postingStepScreen) {
                this.b = postingStepScreen;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CheckRedirect) && epx.f(this.b, ((CheckRedirect) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "CheckRedirect(nextStepTypeWithoutRedirect=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class Close implements Navigation {
            public static final Parcelable.Creator<Close> CREATOR = new a();
            public final boolean b;
            public final boolean c;
            public final boolean d;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<Close> {
                @Override // android.os.Parcelable.Creator
                public final Close createFromParcel(Parcel parcel) {
                    return new Close(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Close[] newArray(int i) {
                    return new Close[i];
                }
            }

            public Close() {
                this(false, false, false, 7, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Close)) {
                    return false;
                }
                Close close = (Close) obj;
                return this.b == close.b && this.c == close.c && this.d == close.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Close(withConfirm=");
                sb.append(this.b);
                sb.append(", isInterruptFlow=");
                sb.append(this.c);
                sb.append(", goToOriginFeed=");
                return q0.a(sb, this.d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b ? 1 : 0);
                parcel.writeInt(this.c ? 1 : 0);
                parcel.writeInt(this.d ? 1 : 0);
            }

            public Close(boolean z, boolean z2, boolean z3) {
                this.b = z;
                this.c = z2;
                this.d = z3;
            }

            public /* synthetic */ Close(boolean z, boolean z2, boolean z3, int i, zcl zclVar) {
                this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? false : z3);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class CloseInCurrentStep implements Navigation {
            public static final CloseInCurrentStep b = new CloseInCurrentStep();
            public static final Parcelable.Creator<CloseInCurrentStep> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<CloseInCurrentStep> {
                @Override // android.os.Parcelable.Creator
                public final CloseInCurrentStep createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return CloseInCurrentStep.b;
                }

                @Override // android.os.Parcelable.Creator
                public final CloseInCurrentStep[] newArray(int i) {
                    return new CloseInCurrentStep[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CloseInCurrentStep);
            }

            public final int hashCode() {
                return -2049344146;
            }

            public final String toString() {
                return "CloseInCurrentStep";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class NextStep implements Navigation {
            public static final NextStep b = new NextStep();
            public static final Parcelable.Creator<NextStep> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<NextStep> {
                @Override // android.os.Parcelable.Creator
                public final NextStep createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return NextStep.b;
                }

                @Override // android.os.Parcelable.Creator
                public final NextStep[] newArray(int i) {
                    return new NextStep[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NextStep);
            }

            public final int hashCode() {
                return 387630821;
            }

            public final String toString() {
                return "NextStep";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class OpenActionButtonsList implements Navigation {
            public static final Parcelable.Creator<OpenActionButtonsList> CREATOR = new a();
            public final List<ActionButton> b;
            public final ActionButton c;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<OpenActionButtonsList> {
                @Override // android.os.Parcelable.Creator
                public final OpenActionButtonsList createFromParcel(Parcel parcel) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(ActionButton.CREATOR, parcel, arrayList, i, 1);
                    }
                    return new OpenActionButtonsList(arrayList, parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final OpenActionButtonsList[] newArray(int i) {
                    return new OpenActionButtonsList[i];
                }
            }

            public OpenActionButtonsList(List<ActionButton> list, ActionButton actionButton) {
                this.b = list;
                this.c = actionButton;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenActionButtonsList)) {
                    return false;
                }
                OpenActionButtonsList openActionButtonsList = (OpenActionButtonsList) obj;
                return epx.f(this.b, openActionButtonsList.b) && epx.f(this.c, openActionButtonsList.c);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                ActionButton actionButton = this.c;
                return hashCode + (actionButton == null ? 0 : actionButton.hashCode());
            }

            public final String toString() {
                return "OpenActionButtonsList(availableActions=" + this.b + ", selected=" + this.c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Iterator a2 = ao.a(parcel, this.b);
                while (a2.hasNext()) {
                    ((ActionButton) a2.next()).writeToParcel(parcel, i);
                }
                ActionButton actionButton = this.c;
                if (actionButton == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    actionButton.writeToParcel(parcel, i);
                }
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class OpenClipsPublication implements Navigation {
            public static final OpenClipsPublication b = new OpenClipsPublication();
            public static final Parcelable.Creator<OpenClipsPublication> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<OpenClipsPublication> {
                @Override // android.os.Parcelable.Creator
                public final OpenClipsPublication createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return OpenClipsPublication.b;
                }

                @Override // android.os.Parcelable.Creator
                public final OpenClipsPublication[] newArray(int i) {
                    return new OpenClipsPublication[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenClipsPublication);
            }

            public final int hashCode() {
                return 1827417849;
            }

            public final String toString() {
                return "OpenClipsPublication";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class OpenCropPhotoEditor implements Navigation {
            public static final Parcelable.Creator<OpenCropPhotoEditor> CREATOR = new a();
            public final PhotoDto b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<OpenCropPhotoEditor> {
                @Override // android.os.Parcelable.Creator
                public final OpenCropPhotoEditor createFromParcel(Parcel parcel) {
                    return new OpenCropPhotoEditor(PhotoDto.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final OpenCropPhotoEditor[] newArray(int i) {
                    return new OpenCropPhotoEditor[i];
                }
            }

            public OpenCropPhotoEditor(PhotoDto photoDto) {
                this.b = photoDto;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenCropPhotoEditor) && epx.f(this.b, ((OpenCropPhotoEditor) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OpenCropPhotoEditor(photo=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                this.b.writeToParcel(parcel, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class OpenDonutTeaserModal implements Navigation {
            public static final OpenDonutTeaserModal b = new OpenDonutTeaserModal();
            public static final Parcelable.Creator<OpenDonutTeaserModal> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<OpenDonutTeaserModal> {
                @Override // android.os.Parcelable.Creator
                public final OpenDonutTeaserModal createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return OpenDonutTeaserModal.b;
                }

                @Override // android.os.Parcelable.Creator
                public final OpenDonutTeaserModal[] newArray(int i) {
                    return new OpenDonutTeaserModal[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenDonutTeaserModal);
            }

            public final int hashCode() {
                return 208214443;
            }

            public final String toString() {
                return "OpenDonutTeaserModal";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class OpenDraftsList implements Navigation {
            public static final OpenDraftsList b = new OpenDraftsList();
            public static final Parcelable.Creator<OpenDraftsList> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<OpenDraftsList> {
                @Override // android.os.Parcelable.Creator
                public final OpenDraftsList createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return OpenDraftsList.b;
                }

                @Override // android.os.Parcelable.Creator
                public final OpenDraftsList[] newArray(int i) {
                    return new OpenDraftsList[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenDraftsList);
            }

            public final int hashCode() {
                return -194626912;
            }

            public final String toString() {
                return "OpenDraftsList";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class OpenInCurrentStep implements Navigation {
            public static final Parcelable.Creator<OpenInCurrentStep> CREATOR = new a();
            public final PostingStepScreen b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<OpenInCurrentStep> {
                @Override // android.os.Parcelable.Creator
                public final OpenInCurrentStep createFromParcel(Parcel parcel) {
                    return new OpenInCurrentStep((PostingStepScreen) parcel.readParcelable(OpenInCurrentStep.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final OpenInCurrentStep[] newArray(int i) {
                    return new OpenInCurrentStep[i];
                }
            }

            public OpenInCurrentStep(PostingStepScreen postingStepScreen) {
                this.b = postingStepScreen;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenInCurrentStep) && epx.f(this.b, ((OpenInCurrentStep) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OpenInCurrentStep(screen=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class OpenLocalPhotoVideoViewer implements Navigation {
            public static final Parcelable.Creator<OpenLocalPhotoVideoViewer> CREATOR = new a();
            public final MediaStoreEntry b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<OpenLocalPhotoVideoViewer> {
                @Override // android.os.Parcelable.Creator
                public final OpenLocalPhotoVideoViewer createFromParcel(Parcel parcel) {
                    return new OpenLocalPhotoVideoViewer((MediaStoreEntry) parcel.readParcelable(OpenLocalPhotoVideoViewer.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final OpenLocalPhotoVideoViewer[] newArray(int i) {
                    return new OpenLocalPhotoVideoViewer[i];
                }
            }

            public OpenLocalPhotoVideoViewer(MediaStoreEntry mediaStoreEntry) {
                this.b = mediaStoreEntry;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenLocalPhotoVideoViewer) && epx.f(this.b, ((OpenLocalPhotoVideoViewer) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OpenLocalPhotoVideoViewer(entryToOpen=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class OpenMiniPreviewPhotoVideoViewer implements Navigation {
            public static final Parcelable.Creator<OpenMiniPreviewPhotoVideoViewer> CREATOR = new a();
            public final MediaPickerSelectedItem b;
            public final int c;
            public final List<MediaPickerSelectedItem> d;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<OpenMiniPreviewPhotoVideoViewer> {
                @Override // android.os.Parcelable.Creator
                public final OpenMiniPreviewPhotoVideoViewer createFromParcel(Parcel parcel) {
                    MediaPickerSelectedItem mediaPickerSelectedItem = (MediaPickerSelectedItem) parcel.readParcelable(OpenMiniPreviewPhotoVideoViewer.class.getClassLoader());
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = bo.b(OpenMiniPreviewPhotoVideoViewer.class, parcel, arrayList, i, 1);
                    }
                    return new OpenMiniPreviewPhotoVideoViewer(mediaPickerSelectedItem, readInt, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final OpenMiniPreviewPhotoVideoViewer[] newArray(int i) {
                    return new OpenMiniPreviewPhotoVideoViewer[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public OpenMiniPreviewPhotoVideoViewer(MediaPickerSelectedItem mediaPickerSelectedItem, int i, List<? extends MediaPickerSelectedItem> list) {
                this.b = mediaPickerSelectedItem;
                this.c = i;
                this.d = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenMiniPreviewPhotoVideoViewer)) {
                    return false;
                }
                OpenMiniPreviewPhotoVideoViewer openMiniPreviewPhotoVideoViewer = (OpenMiniPreviewPhotoVideoViewer) obj;
                return epx.f(this.b, openMiniPreviewPhotoVideoViewer.b) && this.c == openMiniPreviewPhotoVideoViewer.c && epx.f(this.d, openMiniPreviewPhotoVideoViewer.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenMiniPreviewPhotoVideoViewer(selectedItem=");
                sb.append(this.b);
                sb.append(", indexToOpen=");
                sb.append(this.c);
                sb.append(", allItems=");
                return ms9.a(')', sb, this.d);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                parcel.writeInt(this.c);
                Iterator a2 = ao.a(parcel, this.d);
                while (a2.hasNext()) {
                    parcel.writeParcelable((Parcelable) a2.next(), i);
                }
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class OpenPhotoVideoViewer implements Navigation {
            public static final Parcelable.Creator<OpenPhotoVideoViewer> CREATOR = new a();
            public final PostingAttachment b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<OpenPhotoVideoViewer> {
                @Override // android.os.Parcelable.Creator
                public final OpenPhotoVideoViewer createFromParcel(Parcel parcel) {
                    return new OpenPhotoVideoViewer((PostingAttachment) parcel.readParcelable(OpenPhotoVideoViewer.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final OpenPhotoVideoViewer[] newArray(int i) {
                    return new OpenPhotoVideoViewer[i];
                }
            }

            public OpenPhotoVideoViewer(PostingAttachment postingAttachment) {
                this.b = postingAttachment;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenPhotoVideoViewer) && epx.f(this.b, ((OpenPhotoVideoViewer) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OpenPhotoVideoViewer(postingAttachment=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class OpenVkPhotoEditor implements Navigation {
            public static final Parcelable.Creator<OpenVkPhotoEditor> CREATOR = new a();
            public final MediaPickerEntry b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<OpenVkPhotoEditor> {
                @Override // android.os.Parcelable.Creator
                public final OpenVkPhotoEditor createFromParcel(Parcel parcel) {
                    return new OpenVkPhotoEditor((MediaPickerEntry) parcel.readParcelable(OpenVkPhotoEditor.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final OpenVkPhotoEditor[] newArray(int i) {
                    return new OpenVkPhotoEditor[i];
                }
            }

            public OpenVkPhotoEditor(MediaPickerEntry mediaPickerEntry) {
                this.b = mediaPickerEntry;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenVkPhotoEditor) && epx.f(this.b, ((OpenVkPhotoEditor) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OpenVkPhotoEditor(entry=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class OpenVkPhotoViewer implements Navigation {
            public static final Parcelable.Creator<OpenVkPhotoViewer> CREATOR = new a();
            public final Photo b;
            public final int c;
            public final List<Photo> d;
            public final List<Pair<Integer, Photo>> e;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<OpenVkPhotoViewer> {
                @Override // android.os.Parcelable.Creator
                public final OpenVkPhotoViewer createFromParcel(Parcel parcel) {
                    Photo photo = (Photo) parcel.readParcelable(OpenVkPhotoViewer.class.getClassLoader());
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = bo.b(OpenVkPhotoViewer.class, parcel, arrayList, i, 1);
                    }
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt3);
                    for (int i2 = 0; i2 != readInt3; i2++) {
                        arrayList2.add(parcel.readSerializable());
                    }
                    return new OpenVkPhotoViewer(photo, readInt, arrayList, arrayList2);
                }

                @Override // android.os.Parcelable.Creator
                public final OpenVkPhotoViewer[] newArray(int i) {
                    return new OpenVkPhotoViewer[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public OpenVkPhotoViewer(Photo photo, int i, List<? extends Photo> list, List<? extends Pair<Integer, ? extends Photo>> list2) {
                this.b = photo;
                this.c = i;
                this.d = list;
                this.e = list2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenVkPhotoViewer)) {
                    return false;
                }
                OpenVkPhotoViewer openVkPhotoViewer = (OpenVkPhotoViewer) obj;
                return epx.f(this.b, openVkPhotoViewer.b) && this.c == openVkPhotoViewer.c && epx.f(this.d, openVkPhotoViewer.d) && epx.f(this.e, openVkPhotoViewer.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + fw3.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenVkPhotoViewer(photoToOpen=");
                sb.append(this.b);
                sb.append(", indexInPicker=");
                sb.append(this.c);
                sb.append(", allPhotos=");
                sb.append(this.d);
                sb.append(", selectedPhotos=");
                return ms9.a(')', sb, this.e);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                parcel.writeInt(this.c);
                Iterator a2 = ao.a(parcel, this.d);
                while (a2.hasNext()) {
                    parcel.writeParcelable((Parcelable) a2.next(), i);
                }
                Iterator a3 = ao.a(parcel, this.e);
                while (a3.hasNext()) {
                    parcel.writeSerializable((Serializable) a3.next());
                }
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class OpenVkVideoPrivacyPolicy implements Navigation {
            public static final OpenVkVideoPrivacyPolicy b = new OpenVkVideoPrivacyPolicy();
            public static final Parcelable.Creator<OpenVkVideoPrivacyPolicy> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<OpenVkVideoPrivacyPolicy> {
                @Override // android.os.Parcelable.Creator
                public final OpenVkVideoPrivacyPolicy createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return OpenVkVideoPrivacyPolicy.b;
                }

                @Override // android.os.Parcelable.Creator
                public final OpenVkVideoPrivacyPolicy[] newArray(int i) {
                    return new OpenVkVideoPrivacyPolicy[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenVkVideoPrivacyPolicy);
            }

            public final int hashCode() {
                return -550778460;
            }

            public final String toString() {
                return "OpenVkVideoPrivacyPolicy";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class OpenVkVideoViewer implements Navigation {
            public static final Parcelable.Creator<OpenVkVideoViewer> CREATOR = new a();
            public final VideoFile b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<OpenVkVideoViewer> {
                @Override // android.os.Parcelable.Creator
                public final OpenVkVideoViewer createFromParcel(Parcel parcel) {
                    return new OpenVkVideoViewer((VideoFile) parcel.readParcelable(OpenVkVideoViewer.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final OpenVkVideoViewer[] newArray(int i) {
                    return new OpenVkVideoViewer[i];
                }
            }

            public OpenVkVideoViewer(VideoFile videoFile) {
                this.b = videoFile;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenVkVideoViewer) && epx.f(this.b, ((OpenVkVideoViewer) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return lq.a(new StringBuilder("OpenVkVideoViewer(video="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RedirectFailed implements Navigation {
            public static final Parcelable.Creator<RedirectFailed> CREATOR = new a();
            public final PostingStepScreen b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RedirectFailed> {
                @Override // android.os.Parcelable.Creator
                public final RedirectFailed createFromParcel(Parcel parcel) {
                    return new RedirectFailed((PostingStepScreen) parcel.readParcelable(RedirectFailed.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final RedirectFailed[] newArray(int i) {
                    return new RedirectFailed[i];
                }
            }

            public RedirectFailed(PostingStepScreen postingStepScreen) {
                this.b = postingStepScreen;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RedirectFailed) && epx.f(this.b, ((RedirectFailed) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "RedirectFailed(nextStepType=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class ReturnFromClipsPublication implements Navigation {
            public static final Parcelable.Creator<ReturnFromClipsPublication> CREATOR = new a();
            public final boolean b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<ReturnFromClipsPublication> {
                @Override // android.os.Parcelable.Creator
                public final ReturnFromClipsPublication createFromParcel(Parcel parcel) {
                    return new ReturnFromClipsPublication(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final ReturnFromClipsPublication[] newArray(int i) {
                    return new ReturnFromClipsPublication[i];
                }
            }

            public ReturnFromClipsPublication(boolean z) {
                this.b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ReturnFromClipsPublication) && this.b == ((ReturnFromClipsPublication) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("ReturnFromClipsPublication(success="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b ? 1 : 0);
            }
        }
    }

    /* compiled from: PostingAction.kt */
    public static final class NetworkStateChanged implements PostingAction {
        public static final Parcelable.Creator<NetworkStateChanged> CREATOR = new a();
        public final boolean b;

        /* compiled from: PostingAction.kt */
        public static final class a implements Parcelable.Creator<NetworkStateChanged> {
            @Override // android.os.Parcelable.Creator
            public final NetworkStateChanged createFromParcel(Parcel parcel) {
                return new NetworkStateChanged(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final NetworkStateChanged[] newArray(int i) {
                return new NetworkStateChanged[i];
            }
        }

        public NetworkStateChanged(boolean z) {
            this.b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkStateChanged) && this.b == ((NetworkStateChanged) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("NetworkStateChanged(isNetworkAvailable="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    /* compiled from: PostingAction.kt */
    public interface Permissions extends PostingAction {

        /* compiled from: PostingAction.kt */
        public static final class Grant implements Permissions {
            public static final Parcelable.Creator<Grant> CREATOR = new a();
            public final PermissionType b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<Grant> {
                @Override // android.os.Parcelable.Creator
                public final Grant createFromParcel(Parcel parcel) {
                    return new Grant(PermissionType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Grant[] newArray(int i) {
                    return new Grant[i];
                }
            }

            public Grant(PermissionType permissionType) {
                this.b = permissionType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Grant) && this.b == ((Grant) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Grant(permissionType=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b.name());
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class PermissionGranted implements Permissions {
            public static final Parcelable.Creator<PermissionGranted> CREATOR = new a();
            public final PermissionType b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<PermissionGranted> {
                @Override // android.os.Parcelable.Creator
                public final PermissionGranted createFromParcel(Parcel parcel) {
                    return new PermissionGranted(PermissionType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final PermissionGranted[] newArray(int i) {
                    return new PermissionGranted[i];
                }
            }

            public PermissionGranted(PermissionType permissionType) {
                this.b = permissionType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PermissionGranted) && this.b == ((PermissionGranted) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "PermissionGranted(permissionType=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b.name());
            }
        }
    }

    /* compiled from: PostingAction.kt */
    public interface Publish extends PostingAction {

        /* compiled from: PostingAction.kt */
        public static final class DraftClicked implements Publish {
            public static final DraftClicked b = new DraftClicked();
            public static final Parcelable.Creator<DraftClicked> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<DraftClicked> {
                @Override // android.os.Parcelable.Creator
                public final DraftClicked createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return DraftClicked.b;
                }

                @Override // android.os.Parcelable.Creator
                public final DraftClicked[] newArray(int i) {
                    return new DraftClicked[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DraftClicked);
            }

            public final int hashCode() {
                return 2033812377;
            }

            public final String toString() {
                return "DraftClicked";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class PublishPost implements Publish {
            public static final PublishPost b = new PublishPost();
            public static final Parcelable.Creator<PublishPost> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<PublishPost> {
                @Override // android.os.Parcelable.Creator
                public final PublishPost createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return PublishPost.b;
                }

                @Override // android.os.Parcelable.Creator
                public final PublishPost[] newArray(int i) {
                    return new PublishPost[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PublishPost);
            }

            public final int hashCode() {
                return -1048610916;
            }

            public final String toString() {
                return "PublishPost";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class PublishPostClicked implements Publish {
            public static final PublishPostClicked b = new PublishPostClicked();
            public static final Parcelable.Creator<PublishPostClicked> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<PublishPostClicked> {
                @Override // android.os.Parcelable.Creator
                public final PublishPostClicked createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return PublishPostClicked.b;
                }

                @Override // android.os.Parcelable.Creator
                public final PublishPostClicked[] newArray(int i) {
                    return new PublishPostClicked[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PublishPostClicked);
            }

            public final int hashCode() {
                return -248043285;
            }

            public final String toString() {
                return "PublishPostClicked";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class PublishStoryRepost implements Publish {
            public static final Parcelable.Creator<PublishStoryRepost> CREATOR = new a();
            public final Post b;
            public final StoryRepostData c;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<PublishStoryRepost> {
                @Override // android.os.Parcelable.Creator
                public final PublishStoryRepost createFromParcel(Parcel parcel) {
                    return new PublishStoryRepost((Post) parcel.readParcelable(PublishStoryRepost.class.getClassLoader()), StoryRepostData.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final PublishStoryRepost[] newArray(int i) {
                    return new PublishStoryRepost[i];
                }
            }

            public PublishStoryRepost(Post post, StoryRepostData storyRepostData) {
                this.b = post;
                this.c = storyRepostData;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PublishStoryRepost)) {
                    return false;
                }
                PublishStoryRepost publishStoryRepost = (PublishStoryRepost) obj;
                return epx.f(this.b, publishStoryRepost.b) && epx.f(this.c, publishStoryRepost.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "PublishStoryRepost(post=" + this.b + ", storyRepostData=" + this.c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                this.c.writeToParcel(parcel, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class SaveDraft implements Publish {
            public static final Parcelable.Creator<SaveDraft> CREATOR = new a();
            public final boolean b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SaveDraft> {
                @Override // android.os.Parcelable.Creator
                public final SaveDraft createFromParcel(Parcel parcel) {
                    return new SaveDraft(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final SaveDraft[] newArray(int i) {
                    return new SaveDraft[i];
                }
            }

            public SaveDraft(boolean z) {
                this.b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SaveDraft) && this.b == ((SaveDraft) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("SaveDraft(showLoading="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b ? 1 : 0);
            }
        }
    }

    /* compiled from: PostingAction.kt */
    public static final class ShowModalBackToStep1 implements PostingAction {
        public static final ShowModalBackToStep1 b = new ShowModalBackToStep1();
        public static final Parcelable.Creator<ShowModalBackToStep1> CREATOR = new a();

        /* compiled from: PostingAction.kt */
        public static final class a implements Parcelable.Creator<ShowModalBackToStep1> {
            @Override // android.os.Parcelable.Creator
            public final ShowModalBackToStep1 createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ShowModalBackToStep1.b;
            }

            @Override // android.os.Parcelable.Creator
            public final ShowModalBackToStep1[] newArray(int i) {
                return new ShowModalBackToStep1[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowModalBackToStep1);
        }

        public final int hashCode() {
            return -2033133529;
        }

        public final String toString() {
            return "ShowModalBackToStep1";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PostingAction.kt */
    public interface Stats extends PostingAction {

        /* compiled from: PostingAction.kt */
        public static final class SendAttachPhoto implements Stats {
            public static final Parcelable.Creator<SendAttachPhoto> CREATOR = new a();
            public final PostingAttachmentInfo b;
            public final int c;
            public final int d;
            public final Uri e;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SendAttachPhoto> {
                @Override // android.os.Parcelable.Creator
                public final SendAttachPhoto createFromParcel(Parcel parcel) {
                    return new SendAttachPhoto((PostingAttachmentInfo) parcel.readParcelable(SendAttachPhoto.class.getClassLoader()), parcel.readInt(), parcel.readInt(), (Uri) parcel.readParcelable(SendAttachPhoto.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final SendAttachPhoto[] newArray(int i) {
                    return new SendAttachPhoto[i];
                }
            }

            public SendAttachPhoto(PostingAttachmentInfo postingAttachmentInfo, int i, int i2, Uri uri) {
                this.b = postingAttachmentInfo;
                this.c = i;
                this.d = i2;
                this.e = uri;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SendAttachPhoto)) {
                    return false;
                }
                SendAttachPhoto sendAttachPhoto = (SendAttachPhoto) obj;
                return epx.f(this.b, sendAttachPhoto.b) && this.c == sendAttachPhoto.c && this.d == sendAttachPhoto.d && epx.f(this.e, sendAttachPhoto.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SendAttachPhoto(info=");
                sb.append(this.b);
                sb.append(", originalWidth=");
                sb.append(this.c);
                sb.append(", originalHeight=");
                sb.append(this.d);
                sb.append(", uri=");
                return alb0.b(sb, this.e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                parcel.writeInt(this.c);
                parcel.writeInt(this.d);
                parcel.writeParcelable(this.e, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class SendAttachPhotoVk implements Stats {
            public static final Parcelable.Creator<SendAttachPhotoVk> CREATOR = new a();
            public final PostingAttachmentInfo b;
            public final Integer c;
            public final Integer d;
            public final Photo e;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SendAttachPhotoVk> {
                @Override // android.os.Parcelable.Creator
                public final SendAttachPhotoVk createFromParcel(Parcel parcel) {
                    return new SendAttachPhotoVk((PostingAttachmentInfo) parcel.readParcelable(SendAttachPhotoVk.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (Photo) parcel.readParcelable(SendAttachPhotoVk.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final SendAttachPhotoVk[] newArray(int i) {
                    return new SendAttachPhotoVk[i];
                }
            }

            public SendAttachPhotoVk(PostingAttachmentInfo postingAttachmentInfo, Integer num, Integer num2, Photo photo) {
                this.b = postingAttachmentInfo;
                this.c = num;
                this.d = num2;
                this.e = photo;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SendAttachPhotoVk)) {
                    return false;
                }
                SendAttachPhotoVk sendAttachPhotoVk = (SendAttachPhotoVk) obj;
                return epx.f(this.b, sendAttachPhotoVk.b) && epx.f(this.c, sendAttachPhotoVk.c) && epx.f(this.d, sendAttachPhotoVk.d) && epx.f(this.e, sendAttachPhotoVk.e);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                Integer num = this.c;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.d;
                return this.e.hashCode() + ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SendAttachPhotoVk(info=");
                sb.append(this.b);
                sb.append(", originalWidth=");
                sb.append(this.c);
                sb.append(", originalHeight=");
                sb.append(this.d);
                sb.append(", photo=");
                return tq.c(sb, this.e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                Integer num = this.c;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    nr.a(parcel, 1, num);
                }
                Integer num2 = this.d;
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    nr.a(parcel, 1, num2);
                }
                parcel.writeParcelable(this.e, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class SendRemoveTag implements Stats {
            public static final Parcelable.Creator<SendRemoveTag> CREATOR = new a();
            public final Photo b;
            public final PhotoTag c;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SendRemoveTag> {
                @Override // android.os.Parcelable.Creator
                public final SendRemoveTag createFromParcel(Parcel parcel) {
                    return new SendRemoveTag((Photo) parcel.readParcelable(SendRemoveTag.class.getClassLoader()), PhotoTag.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final SendRemoveTag[] newArray(int i) {
                    return new SendRemoveTag[i];
                }
            }

            public SendRemoveTag(Photo photo, PhotoTag photoTag) {
                this.b = photo;
                this.c = photoTag;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SendRemoveTag)) {
                    return false;
                }
                SendRemoveTag sendRemoveTag = (SendRemoveTag) obj;
                return epx.f(this.b, sendRemoveTag.b) && epx.f(this.c, sendRemoveTag.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "SendRemoveTag(photo=" + this.b + ", tag=" + this.c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                this.c.writeToParcel(parcel, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class SendWaitingAnalytics implements Stats {
            public static final SendWaitingAnalytics b = new SendWaitingAnalytics();
            public static final Parcelable.Creator<SendWaitingAnalytics> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SendWaitingAnalytics> {
                @Override // android.os.Parcelable.Creator
                public final SendWaitingAnalytics createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return SendWaitingAnalytics.b;
                }

                @Override // android.os.Parcelable.Creator
                public final SendWaitingAnalytics[] newArray(int i) {
                    return new SendWaitingAnalytics[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SendWaitingAnalytics);
            }

            public final int hashCode() {
                return -1987725276;
            }

            public final String toString() {
                return "SendWaitingAnalytics";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: PostingAction.kt */
    public interface TechStats extends PostingAction {
    }

    /* compiled from: PostingAction.kt */
    public interface Tooltips extends PostingAction {

        /* compiled from: PostingAction.kt */
        public static final class BusinessOnboardingTooltipShowed implements Tooltips {
            public static final BusinessOnboardingTooltipShowed b = new BusinessOnboardingTooltipShowed();
            public static final Parcelable.Creator<BusinessOnboardingTooltipShowed> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<BusinessOnboardingTooltipShowed> {
                @Override // android.os.Parcelable.Creator
                public final BusinessOnboardingTooltipShowed createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return BusinessOnboardingTooltipShowed.b;
                }

                @Override // android.os.Parcelable.Creator
                public final BusinessOnboardingTooltipShowed[] newArray(int i) {
                    return new BusinessOnboardingTooltipShowed[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof BusinessOnboardingTooltipShowed);
            }

            public final int hashCode() {
                return 679826042;
            }

            public final String toString() {
                return "BusinessOnboardingTooltipShowed";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: PostingAction.kt */
    public interface Upload extends PostingAction {

        /* compiled from: PostingAction.kt */
        public static final class Update implements Upload {
            public static final Parcelable.Creator<Update> CREATOR = new a();
            public final UploadUpdate b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<Update> {
                @Override // android.os.Parcelable.Creator
                public final Update createFromParcel(Parcel parcel) {
                    return new Update((UploadUpdate) parcel.readParcelable(Update.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Update[] newArray(int i) {
                    return new Update[i];
                }
            }

            public Update(UploadUpdate uploadUpdate) {
                this.b = uploadUpdate;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Update) && epx.f(this.b, ((Update) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Update(update=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class UploadRetry implements Upload {
            public static final Parcelable.Creator<UploadRetry> CREATOR = new a();
            public final UploadDto b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<UploadRetry> {
                @Override // android.os.Parcelable.Creator
                public final UploadRetry createFromParcel(Parcel parcel) {
                    return new UploadRetry((UploadDto) parcel.readParcelable(UploadRetry.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final UploadRetry[] newArray(int i) {
                    return new UploadRetry[i];
                }
            }

            public UploadRetry(UploadDto uploadDto) {
                this.b = uploadDto;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UploadRetry) && epx.f(this.b, ((UploadRetry) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "UploadRetry(uploadDto=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class UploadRetryAttachment implements Upload {
            public static final Parcelable.Creator<UploadRetryAttachment> CREATOR = new a();
            public final Attachment b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<UploadRetryAttachment> {
                @Override // android.os.Parcelable.Creator
                public final UploadRetryAttachment createFromParcel(Parcel parcel) {
                    return new UploadRetryAttachment((Attachment) parcel.readParcelable(UploadRetryAttachment.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final UploadRetryAttachment[] newArray(int i) {
                    return new UploadRetryAttachment[i];
                }
            }

            public UploadRetryAttachment(Attachment attachment) {
                this.b = attachment;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UploadRetryAttachment) && epx.f(this.b, ((UploadRetryAttachment) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "UploadRetryAttachment(attachment=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class UploadStart implements Upload {
            public static final Parcelable.Creator<UploadStart> CREATOR = new a();
            public final UploadDto b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<UploadStart> {
                @Override // android.os.Parcelable.Creator
                public final UploadStart createFromParcel(Parcel parcel) {
                    return new UploadStart((UploadDto) parcel.readParcelable(UploadStart.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final UploadStart[] newArray(int i) {
                    return new UploadStart[i];
                }
            }

            public UploadStart(UploadDto uploadDto) {
                this.b = uploadDto;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UploadStart) && epx.f(this.b, ((UploadStart) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "UploadStart(uploadDto=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }
    }

    /* compiled from: PostingAction.kt */
    public interface Editing extends PostingAction {

        /* compiled from: PostingAction.kt */
        public interface Attach extends Editing {

            /* compiled from: PostingAction.kt */
            public static final class RemoveFile implements Attach {
                public static final RemoveFile b = new RemoveFile();
                public static final Parcelable.Creator<RemoveFile> CREATOR = new a();

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<RemoveFile> {
                    @Override // android.os.Parcelable.Creator
                    public final RemoveFile createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return RemoveFile.b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final RemoveFile[] newArray(int i) {
                        return new RemoveFile[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof RemoveFile);
                }

                public final int hashCode() {
                    return -190445729;
                }

                public final String toString() {
                    return "RemoveFile";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class RemoveMusic implements Attach {
                public static final RemoveMusic b = new RemoveMusic();
                public static final Parcelable.Creator<RemoveMusic> CREATOR = new a();

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<RemoveMusic> {
                    @Override // android.os.Parcelable.Creator
                    public final RemoveMusic createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return RemoveMusic.b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final RemoveMusic[] newArray(int i) {
                        return new RemoveMusic[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof RemoveMusic);
                }

                public final int hashCode() {
                    return -1602021214;
                }

                public final String toString() {
                    return "RemoveMusic";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class RemovePlace implements Attach {
                public static final RemovePlace b = new RemovePlace();
                public static final Parcelable.Creator<RemovePlace> CREATOR = new a();

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<RemovePlace> {
                    @Override // android.os.Parcelable.Creator
                    public final RemovePlace createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return RemovePlace.b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final RemovePlace[] newArray(int i) {
                        return new RemovePlace[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof RemovePlace);
                }

                public final int hashCode() {
                    return -1599536252;
                }

                public final String toString() {
                    return "RemovePlace";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class RemovePoll implements Attach {
                public static final RemovePoll b = new RemovePoll();
                public static final Parcelable.Creator<RemovePoll> CREATOR = new a();

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<RemovePoll> {
                    @Override // android.os.Parcelable.Creator
                    public final RemovePoll createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return RemovePoll.b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final RemovePoll[] newArray(int i) {
                        return new RemovePoll[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof RemovePoll);
                }

                public final int hashCode() {
                    return -190142046;
                }

                public final String toString() {
                    return "RemovePoll";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class SetFile implements Attach {
                public static final Parcelable.Creator<SetFile> CREATOR = new a();
                public final FileDto b;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<SetFile> {
                    @Override // android.os.Parcelable.Creator
                    public final SetFile createFromParcel(Parcel parcel) {
                        return new SetFile((FileDto) parcel.readParcelable(SetFile.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final SetFile[] newArray(int i) {
                        return new SetFile[i];
                    }
                }

                public SetFile(FileDto fileDto) {
                    this.b = fileDto;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SetFile) && epx.f(this.b, ((SetFile) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "SetFile(file=" + this.b + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeParcelable(this.b, i);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class SetMusicPlaylist implements Attach {
                public static final Parcelable.Creator<SetMusicPlaylist> CREATOR = new a();
                public final MusicDto b;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<SetMusicPlaylist> {
                    @Override // android.os.Parcelable.Creator
                    public final SetMusicPlaylist createFromParcel(Parcel parcel) {
                        return new SetMusicPlaylist(MusicDto.CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final SetMusicPlaylist[] newArray(int i) {
                        return new SetMusicPlaylist[i];
                    }
                }

                public SetMusicPlaylist(MusicDto musicDto) {
                    this.b = musicDto;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SetMusicPlaylist) && epx.f(this.b, ((SetMusicPlaylist) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "SetMusicPlaylist(playlist=" + this.b + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    this.b.writeToParcel(parcel, i);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class SetMusicSnippet implements Attach {
                public static final Parcelable.Creator<SetMusicSnippet> CREATOR = new a();
                public final MusicDto b;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<SetMusicSnippet> {
                    @Override // android.os.Parcelable.Creator
                    public final SetMusicSnippet createFromParcel(Parcel parcel) {
                        return new SetMusicSnippet(MusicDto.CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final SetMusicSnippet[] newArray(int i) {
                        return new SetMusicSnippet[i];
                    }
                }

                public SetMusicSnippet(MusicDto musicDto) {
                    this.b = musicDto;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SetMusicSnippet) && epx.f(this.b, ((SetMusicSnippet) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "SetMusicSnippet(snippet=" + this.b + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    this.b.writeToParcel(parcel, i);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class SetMusicTracks implements Attach {
                public static final Parcelable.Creator<SetMusicTracks> CREATOR = new a();
                public final List<MusicDto> b;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<SetMusicTracks> {
                    @Override // android.os.Parcelable.Creator
                    public final SetMusicTracks createFromParcel(Parcel parcel) {
                        int readInt = parcel.readInt();
                        ArrayList arrayList = new ArrayList(readInt);
                        int i = 0;
                        while (i != readInt) {
                            i = en.a(MusicDto.CREATOR, parcel, arrayList, i, 1);
                        }
                        return new SetMusicTracks(arrayList);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final SetMusicTracks[] newArray(int i) {
                        return new SetMusicTracks[i];
                    }
                }

                public SetMusicTracks(List<MusicDto> list) {
                    this.b = list;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SetMusicTracks) && epx.f(this.b, ((SetMusicTracks) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ms9.a(')', new StringBuilder("SetMusicTracks(tracks="), this.b);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    Iterator a2 = ao.a(parcel, this.b);
                    while (a2.hasNext()) {
                        ((MusicDto) a2.next()).writeToParcel(parcel, i);
                    }
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class SetPlace implements Attach {
                public static final Parcelable.Creator<SetPlace> CREATOR = new a();
                public final PostingPlaceDto b;
                public final boolean c;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<SetPlace> {
                    @Override // android.os.Parcelable.Creator
                    public final SetPlace createFromParcel(Parcel parcel) {
                        return new SetPlace(PostingPlaceDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final SetPlace[] newArray(int i) {
                        return new SetPlace[i];
                    }
                }

                public SetPlace(PostingPlaceDto postingPlaceDto, boolean z) {
                    this.b = postingPlaceDto;
                    this.c = z;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SetPlace)) {
                        return false;
                    }
                    SetPlace setPlace = (SetPlace) obj;
                    return epx.f(this.b, setPlace.b) && this.c == setPlace.c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("SetPlace(place=");
                    sb.append(this.b);
                    sb.append(", isRecommended=");
                    return q0.a(sb, this.c, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    this.b.writeToParcel(parcel, i);
                    parcel.writeInt(this.c ? 1 : 0);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class SetPoll implements Attach {
                public static final Parcelable.Creator<SetPoll> CREATOR = new a();
                public final PostingPollDto b;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<SetPoll> {
                    @Override // android.os.Parcelable.Creator
                    public final SetPoll createFromParcel(Parcel parcel) {
                        return new SetPoll(PostingPollDto.CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final SetPoll[] newArray(int i) {
                        return new SetPoll[i];
                    }
                }

                public SetPoll(PostingPollDto postingPollDto) {
                    this.b = postingPollDto;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SetPoll) && epx.f(this.b, ((SetPoll) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "SetPoll(poll=" + this.b + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    this.b.writeToParcel(parcel, i);
                }
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class CoauthorsSelected implements Editing {
            public static final Parcelable.Creator<CoauthorsSelected> CREATOR = new a();
            public final List<CoauthorDto> b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<CoauthorsSelected> {
                @Override // android.os.Parcelable.Creator
                public final CoauthorsSelected createFromParcel(Parcel parcel) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(CoauthorDto.CREATOR, parcel, arrayList, i, 1);
                    }
                    return new CoauthorsSelected(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final CoauthorsSelected[] newArray(int i) {
                    return new CoauthorsSelected[i];
                }
            }

            public CoauthorsSelected(List<CoauthorDto> list) {
                this.b = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CoauthorsSelected) && epx.f(this.b, ((CoauthorsSelected) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("CoauthorsSelected(coauthors="), this.b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Iterator a2 = ao.a(parcel, this.b);
                while (a2.hasNext()) {
                    ((CoauthorDto) a2.next()).writeToParcel(parcel, i);
                }
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class CropEditorResult implements Editing {
            public static final Parcelable.Creator<CropEditorResult> CREATOR = new a();
            public final ImageCropResult b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<CropEditorResult> {
                @Override // android.os.Parcelable.Creator
                public final CropEditorResult createFromParcel(Parcel parcel) {
                    return new CropEditorResult(ImageCropResult.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final CropEditorResult[] newArray(int i) {
                    return new CropEditorResult[i];
                }
            }

            public CropEditorResult(ImageCropResult imageCropResult) {
                this.b = imageCropResult;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CropEditorResult) && epx.f(this.b, ((CropEditorResult) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "CropEditorResult(cropResult=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                this.b.writeToParcel(parcel, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class DonutTeaserTextChanged implements Editing {
            public static final Parcelable.Creator<DonutTeaserTextChanged> CREATOR = new a();
            public final String b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<DonutTeaserTextChanged> {
                @Override // android.os.Parcelable.Creator
                public final DonutTeaserTextChanged createFromParcel(Parcel parcel) {
                    return new DonutTeaserTextChanged(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final DonutTeaserTextChanged[] newArray(int i) {
                    return new DonutTeaserTextChanged[i];
                }
            }

            public DonutTeaserTextChanged(String str) {
                this.b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DonutTeaserTextChanged) && epx.f(this.b, ((DonutTeaserTextChanged) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("DonutTeaserTextChanged(donutTeaserText="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class EnableAuthorSign implements Editing {
            public static final Parcelable.Creator<EnableAuthorSign> CREATOR = new a();
            public final boolean b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<EnableAuthorSign> {
                @Override // android.os.Parcelable.Creator
                public final EnableAuthorSign createFromParcel(Parcel parcel) {
                    return new EnableAuthorSign(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final EnableAuthorSign[] newArray(int i) {
                    return new EnableAuthorSign[i];
                }
            }

            public EnableAuthorSign(boolean z) {
                this.b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EnableAuthorSign) && this.b == ((EnableAuthorSign) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("EnableAuthorSign(isEnabled="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b ? 1 : 0);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class EnableStoryRepost implements Editing {
            public static final Parcelable.Creator<EnableStoryRepost> CREATOR = new a();
            public final boolean b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<EnableStoryRepost> {
                @Override // android.os.Parcelable.Creator
                public final EnableStoryRepost createFromParcel(Parcel parcel) {
                    return new EnableStoryRepost(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final EnableStoryRepost[] newArray(int i) {
                    return new EnableStoryRepost[i];
                }
            }

            public EnableStoryRepost(boolean z) {
                this.b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EnableStoryRepost) && this.b == ((EnableStoryRepost) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("EnableStoryRepost(isEnabled="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b ? 1 : 0);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class HideStoryRepostSwitchOnboarding implements Editing {
            public static final HideStoryRepostSwitchOnboarding b = new HideStoryRepostSwitchOnboarding();
            public static final Parcelable.Creator<HideStoryRepostSwitchOnboarding> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<HideStoryRepostSwitchOnboarding> {
                @Override // android.os.Parcelable.Creator
                public final HideStoryRepostSwitchOnboarding createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return HideStoryRepostSwitchOnboarding.b;
                }

                @Override // android.os.Parcelable.Creator
                public final HideStoryRepostSwitchOnboarding[] newArray(int i) {
                    return new HideStoryRepostSwitchOnboarding[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof HideStoryRepostSwitchOnboarding);
            }

            public final int hashCode() {
                return 722814443;
            }

            public final String toString() {
                return "HideStoryRepostSwitchOnboarding";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class MakeProfileOpen implements Editing {
            public static final MakeProfileOpen b = new MakeProfileOpen();
            public static final Parcelable.Creator<MakeProfileOpen> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<MakeProfileOpen> {
                @Override // android.os.Parcelable.Creator
                public final MakeProfileOpen createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return MakeProfileOpen.b;
                }

                @Override // android.os.Parcelable.Creator
                public final MakeProfileOpen[] newArray(int i) {
                    return new MakeProfileOpen[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof MakeProfileOpen);
            }

            public final int hashCode() {
                return 2057834011;
            }

            public final String toString() {
                return "MakeProfileOpen";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class MovePhotoVideo implements Editing {
            public static final Parcelable.Creator<MovePhotoVideo> CREATOR = new a();
            public final int b;
            public final int c;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<MovePhotoVideo> {
                @Override // android.os.Parcelable.Creator
                public final MovePhotoVideo createFromParcel(Parcel parcel) {
                    return new MovePhotoVideo(parcel.readInt(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final MovePhotoVideo[] newArray(int i) {
                    return new MovePhotoVideo[i];
                }
            }

            public MovePhotoVideo(int i, int i2) {
                this.b = i;
                this.c = i2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MovePhotoVideo)) {
                    return false;
                }
                MovePhotoVideo movePhotoVideo = (MovePhotoVideo) obj;
                return this.b == movePhotoVideo.b && this.c == movePhotoVideo.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MovePhotoVideo(fromPosition=");
                sb.append(this.b);
                sb.append(", toPosition=");
                return vu5.b(sb, this.c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
                parcel.writeInt(this.c);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class PrivacySelectedPrivacyTypeChanged implements Editing {
            public static final Parcelable.Creator<PrivacySelectedPrivacyTypeChanged> CREATOR = new a();
            public final PrivacyPostType b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<PrivacySelectedPrivacyTypeChanged> {
                @Override // android.os.Parcelable.Creator
                public final PrivacySelectedPrivacyTypeChanged createFromParcel(Parcel parcel) {
                    return new PrivacySelectedPrivacyTypeChanged((PrivacyPostType) parcel.readParcelable(PrivacySelectedPrivacyTypeChanged.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final PrivacySelectedPrivacyTypeChanged[] newArray(int i) {
                    return new PrivacySelectedPrivacyTypeChanged[i];
                }
            }

            public PrivacySelectedPrivacyTypeChanged(PrivacyPostType privacyPostType) {
                this.b = privacyPostType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PrivacySelectedPrivacyTypeChanged) && epx.f(this.b, ((PrivacySelectedPrivacyTypeChanged) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "PrivacySelectedPrivacyTypeChanged(currentType=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class PrivacySettingsChanged implements Editing {
            public static final Parcelable.Creator<PrivacySettingsChanged> CREATOR = new a();
            public final PostPrivacyData b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<PrivacySettingsChanged> {
                @Override // android.os.Parcelable.Creator
                public final PrivacySettingsChanged createFromParcel(Parcel parcel) {
                    return new PrivacySettingsChanged(PostPrivacyData.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final PrivacySettingsChanged[] newArray(int i) {
                    return new PrivacySettingsChanged[i];
                }
            }

            public PrivacySettingsChanged(PostPrivacyData postPrivacyData) {
                this.b = postPrivacyData;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PrivacySettingsChanged) && epx.f(this.b, ((PrivacySettingsChanged) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "PrivacySettingsChanged(privacyData=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                this.b.writeToParcel(parcel, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RememberActionButton implements Editing {
            public static final RememberActionButton b = new RememberActionButton();
            public static final Parcelable.Creator<RememberActionButton> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RememberActionButton> {
                @Override // android.os.Parcelable.Creator
                public final RememberActionButton createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return RememberActionButton.b;
                }

                @Override // android.os.Parcelable.Creator
                public final RememberActionButton[] newArray(int i) {
                    return new RememberActionButton[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RememberActionButton);
            }

            public final int hashCode() {
                return -1329487713;
            }

            public final String toString() {
                return "RememberActionButton";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RemoveCoauthors implements Editing {
            public static final RemoveCoauthors b = new RemoveCoauthors();
            public static final Parcelable.Creator<RemoveCoauthors> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RemoveCoauthors> {
                @Override // android.os.Parcelable.Creator
                public final RemoveCoauthors createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return RemoveCoauthors.b;
                }

                @Override // android.os.Parcelable.Creator
                public final RemoveCoauthors[] newArray(int i) {
                    return new RemoveCoauthors[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RemoveCoauthors);
            }

            public final int hashCode() {
                return 868651918;
            }

            public final String toString() {
                return "RemoveCoauthors";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RemoveCustomDonutTeaser implements Editing {
            public static final RemoveCustomDonutTeaser b = new RemoveCustomDonutTeaser();
            public static final Parcelable.Creator<RemoveCustomDonutTeaser> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RemoveCustomDonutTeaser> {
                @Override // android.os.Parcelable.Creator
                public final RemoveCustomDonutTeaser createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return RemoveCustomDonutTeaser.b;
                }

                @Override // android.os.Parcelable.Creator
                public final RemoveCustomDonutTeaser[] newArray(int i) {
                    return new RemoveCustomDonutTeaser[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RemoveCustomDonutTeaser);
            }

            public final int hashCode() {
                return 286336787;
            }

            public final String toString() {
                return "RemoveCustomDonutTeaser";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RemovePhotoTag implements Editing {
            public static final RemovePhotoTag b = new RemovePhotoTag();
            public static final Parcelable.Creator<RemovePhotoTag> CREATOR = new a();

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RemovePhotoTag> {
                @Override // android.os.Parcelable.Creator
                public final RemovePhotoTag createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return RemovePhotoTag.b;
                }

                @Override // android.os.Parcelable.Creator
                public final RemovePhotoTag[] newArray(int i) {
                    return new RemovePhotoTag[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RemovePhotoTag);
            }

            public final int hashCode() {
                return -1277954922;
            }

            public final String toString() {
                return "RemovePhotoTag";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RemovePhotoTags implements Editing {
            public static final Parcelable.Creator<RemovePhotoTags> CREATOR = new a();
            public final List<PhotoTag> b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RemovePhotoTags> {
                @Override // android.os.Parcelable.Creator
                public final RemovePhotoTags createFromParcel(Parcel parcel) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(PhotoTag.CREATOR, parcel, arrayList, i, 1);
                    }
                    return new RemovePhotoTags(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final RemovePhotoTags[] newArray(int i) {
                    return new RemovePhotoTags[i];
                }
            }

            public RemovePhotoTags(List<PhotoTag> list) {
                this.b = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RemovePhotoTags) && epx.f(this.b, ((RemovePhotoTags) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("RemovePhotoTags(tags="), this.b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Iterator a2 = ao.a(parcel, this.b);
                while (a2.hasNext()) {
                    ((PhotoTag) a2.next()).writeToParcel(parcel, i);
                }
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class RemoveTagsForPhoto implements Editing {
            public static final Parcelable.Creator<RemoveTagsForPhoto> CREATOR = new a();
            public final int b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<RemoveTagsForPhoto> {
                @Override // android.os.Parcelable.Creator
                public final RemoveTagsForPhoto createFromParcel(Parcel parcel) {
                    return new RemoveTagsForPhoto(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final RemoveTagsForPhoto[] newArray(int i) {
                    return new RemoveTagsForPhoto[i];
                }
            }

            public RemoveTagsForPhoto(int i) {
                this.b = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RemoveTagsForPhoto) && this.b == ((RemoveTagsForPhoto) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("RemoveTagsForPhoto(id="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class SelectVkTicketMiniAppActionButton implements Editing {
            public static final Parcelable.Creator<SelectVkTicketMiniAppActionButton> CREATOR = new a();
            public final ActionButton b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SelectVkTicketMiniAppActionButton> {
                @Override // android.os.Parcelable.Creator
                public final SelectVkTicketMiniAppActionButton createFromParcel(Parcel parcel) {
                    return new SelectVkTicketMiniAppActionButton(parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final SelectVkTicketMiniAppActionButton[] newArray(int i) {
                    return new SelectVkTicketMiniAppActionButton[i];
                }
            }

            public SelectVkTicketMiniAppActionButton(ActionButton actionButton) {
                this.b = actionButton;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SelectVkTicketMiniAppActionButton) && epx.f(this.b, ((SelectVkTicketMiniAppActionButton) obj).b);
            }

            public final int hashCode() {
                ActionButton actionButton = this.b;
                if (actionButton == null) {
                    return 0;
                }
                return actionButton.hashCode();
            }

            public final String toString() {
                return "SelectVkTicketMiniAppActionButton(action=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                ActionButton actionButton = this.b;
                if (actionButton == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    actionButton.writeToParcel(parcel, i);
                }
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class SetActionButton implements Editing {
            public static final Parcelable.Creator<SetActionButton> CREATOR = new a();
            public final ActionButton b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SetActionButton> {
                @Override // android.os.Parcelable.Creator
                public final SetActionButton createFromParcel(Parcel parcel) {
                    return new SetActionButton(parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final SetActionButton[] newArray(int i) {
                    return new SetActionButton[i];
                }
            }

            public SetActionButton(ActionButton actionButton) {
                this.b = actionButton;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SetActionButton) && epx.f(this.b, ((SetActionButton) obj).b);
            }

            public final int hashCode() {
                ActionButton actionButton = this.b;
                if (actionButton == null) {
                    return 0;
                }
                return actionButton.hashCode();
            }

            public final String toString() {
                return "SetActionButton(action=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                ActionButton actionButton = this.b;
                if (actionButton == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    actionButton.writeToParcel(parcel, i);
                }
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class SetPhotoVideoCropData implements Editing {
            public static final Parcelable.Creator<SetPhotoVideoCropData> CREATOR = new a();
            public final PhotoVideoAttachmentsCropData b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SetPhotoVideoCropData> {
                @Override // android.os.Parcelable.Creator
                public final SetPhotoVideoCropData createFromParcel(Parcel parcel) {
                    return new SetPhotoVideoCropData(PhotoVideoAttachmentsCropData.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final SetPhotoVideoCropData[] newArray(int i) {
                    return new SetPhotoVideoCropData[i];
                }
            }

            public SetPhotoVideoCropData(PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData) {
                this.b = photoVideoAttachmentsCropData;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SetPhotoVideoCropData) && epx.f(this.b, ((SetPhotoVideoCropData) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "SetPhotoVideoCropData(cropData=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                this.b.writeToParcel(parcel, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class SetPhotoVideoDisplayMode implements Editing {
            public static final Parcelable.Creator<SetPhotoVideoDisplayMode> CREATOR = new a();
            public final PhotoVideoDisplayMode b;
            public final boolean c;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SetPhotoVideoDisplayMode> {
                @Override // android.os.Parcelable.Creator
                public final SetPhotoVideoDisplayMode createFromParcel(Parcel parcel) {
                    return new SetPhotoVideoDisplayMode(PhotoVideoDisplayMode.valueOf(parcel.readString()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final SetPhotoVideoDisplayMode[] newArray(int i) {
                    return new SetPhotoVideoDisplayMode[i];
                }
            }

            public SetPhotoVideoDisplayMode(PhotoVideoDisplayMode photoVideoDisplayMode, boolean z) {
                this.b = photoVideoDisplayMode;
                this.c = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetPhotoVideoDisplayMode)) {
                    return false;
                }
                SetPhotoVideoDisplayMode setPhotoVideoDisplayMode = (SetPhotoVideoDisplayMode) obj;
                return this.b == setPhotoVideoDisplayMode.b && this.c == setPhotoVideoDisplayMode.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SetPhotoVideoDisplayMode(displayMode=");
                sb.append(this.b);
                sb.append(", isUserIntent=");
                return q0.a(sb, this.c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b.name());
                parcel.writeInt(this.c ? 1 : 0);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class SetPostponePublish implements Editing {
            public static final Parcelable.Creator<SetPostponePublish> CREATOR = new a();
            public final Date b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<SetPostponePublish> {
                @Override // android.os.Parcelable.Creator
                public final SetPostponePublish createFromParcel(Parcel parcel) {
                    return new SetPostponePublish((Date) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final SetPostponePublish[] newArray(int i) {
                    return new SetPostponePublish[i];
                }
            }

            public SetPostponePublish(Date date) {
                this.b = date;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SetPostponePublish) && epx.f(this.b, ((SetPostponePublish) obj).b);
            }

            public final int hashCode() {
                Date date = this.b;
                if (date == null) {
                    return 0;
                }
                return date.hashCode();
            }

            public final String toString() {
                return "SetPostponePublish(date=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeSerializable(this.b);
            }
        }

        /* compiled from: PostingAction.kt */
        public interface Text extends Editing {

            /* compiled from: PostingAction.kt */
            public static final class Changed implements Text {
                public static final Parcelable.Creator<Changed> CREATOR = new a();
                public final String b;
                public final boolean c;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<Changed> {
                    @Override // android.os.Parcelable.Creator
                    public final Changed createFromParcel(Parcel parcel) {
                        return new Changed(parcel.readString(), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Changed[] newArray(int i) {
                        return new Changed[i];
                    }
                }

                public Changed(String str, boolean z) {
                    this.b = str;
                    this.c = z;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Changed)) {
                        return false;
                    }
                    Changed changed = (Changed) obj;
                    return epx.f(this.b, changed.b) && this.c == changed.c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Changed(text=");
                    sb.append(this.b);
                    sb.append(", isChangedByUser=");
                    return q0.a(sb, this.c, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeString(this.b);
                    parcel.writeInt(this.c ? 1 : 0);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class ParseLinks implements Text {
                public static final Parcelable.Creator<ParseLinks> CREATOR = new a();
                public final List<String> b;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<ParseLinks> {
                    @Override // android.os.Parcelable.Creator
                    public final ParseLinks createFromParcel(Parcel parcel) {
                        return new ParseLinks(parcel.createStringArrayList());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ParseLinks[] newArray(int i) {
                        return new ParseLinks[i];
                    }
                }

                public ParseLinks(List<String> list) {
                    this.b = list;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ParseLinks) && epx.f(this.b, ((ParseLinks) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ms9.a(')', new StringBuilder("ParseLinks(urls="), this.b);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeStringList(this.b);
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class ParsedAttachmentsByLinks implements Text {
                public static final Parcelable.Creator<ParsedAttachmentsByLinks> CREATOR = new a();
                public final List<ParsedAttachment> b;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<ParsedAttachmentsByLinks> {
                    @Override // android.os.Parcelable.Creator
                    public final ParsedAttachmentsByLinks createFromParcel(Parcel parcel) {
                        int readInt = parcel.readInt();
                        ArrayList arrayList = new ArrayList(readInt);
                        int i = 0;
                        while (i != readInt) {
                            i = en.a(ParsedAttachment.CREATOR, parcel, arrayList, i, 1);
                        }
                        return new ParsedAttachmentsByLinks(arrayList);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ParsedAttachmentsByLinks[] newArray(int i) {
                        return new ParsedAttachmentsByLinks[i];
                    }
                }

                public ParsedAttachmentsByLinks(List<ParsedAttachment> list) {
                    this.b = list;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ParsedAttachmentsByLinks) && epx.f(this.b, ((ParsedAttachmentsByLinks) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ms9.a(')', new StringBuilder("ParsedAttachmentsByLinks(attachments="), this.b);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    Iterator a2 = ao.a(parcel, this.b);
                    while (a2.hasNext()) {
                        ((ParsedAttachment) a2.next()).writeToParcel(parcel, i);
                    }
                }
            }

            /* compiled from: PostingAction.kt */
            public static final class RemoveLinks implements Text {
                public static final Parcelable.Creator<RemoveLinks> CREATOR = new a();
                public final List<String> b;

                /* compiled from: PostingAction.kt */
                public static final class a implements Parcelable.Creator<RemoveLinks> {
                    @Override // android.os.Parcelable.Creator
                    public final RemoveLinks createFromParcel(Parcel parcel) {
                        return new RemoveLinks(parcel.createStringArrayList());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final RemoveLinks[] newArray(int i) {
                        return new RemoveLinks[i];
                    }
                }

                public RemoveLinks(List<String> list) {
                    this.b = list;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof RemoveLinks) && epx.f(this.b, ((RemoveLinks) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ms9.a(')', new StringBuilder("RemoveLinks(urls="), this.b);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeStringList(this.b);
                }
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class UpdatePhoto implements Editing {
            public static final Parcelable.Creator<UpdatePhoto> CREATOR = new a();
            public final Photo b;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<UpdatePhoto> {
                @Override // android.os.Parcelable.Creator
                public final UpdatePhoto createFromParcel(Parcel parcel) {
                    return new UpdatePhoto((Photo) parcel.readParcelable(UpdatePhoto.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final UpdatePhoto[] newArray(int i) {
                    return new UpdatePhoto[i];
                }
            }

            public UpdatePhoto(Photo photo) {
                this.b = photo;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdatePhoto) && epx.f(this.b, ((UpdatePhoto) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return tq.c(new StringBuilder("UpdatePhoto(photo="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: PostingAction.kt */
        public static final class AdditionalSettingsChanged implements Editing {
            public static final Parcelable.Creator<AdditionalSettingsChanged> CREATOR = new a();
            public final AdditionalSettingsConfiguration b;
            public final boolean c;
            public final UUID d;

            /* compiled from: PostingAction.kt */
            public static final class a implements Parcelable.Creator<AdditionalSettingsChanged> {
                @Override // android.os.Parcelable.Creator
                public final AdditionalSettingsChanged createFromParcel(Parcel parcel) {
                    return new AdditionalSettingsChanged(AdditionalSettingsConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (UUID) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final AdditionalSettingsChanged[] newArray(int i) {
                    return new AdditionalSettingsChanged[i];
                }
            }

            public AdditionalSettingsChanged(AdditionalSettingsConfiguration additionalSettingsConfiguration, boolean z, UUID uuid) {
                this.b = additionalSettingsConfiguration;
                this.c = z;
                this.d = uuid;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AdditionalSettingsChanged)) {
                    return false;
                }
                AdditionalSettingsChanged additionalSettingsChanged = (AdditionalSettingsChanged) obj;
                return epx.f(this.b, additionalSettingsChanged.b) && this.c == additionalSettingsChanged.c && epx.f(this.d, additionalSettingsChanged.d);
            }

            public final int hashCode() {
                int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
                UUID uuid = this.d;
                return b + (uuid == null ? 0 : uuid.hashCode());
            }

            public final String toString() {
                return "AdditionalSettingsChanged(configuration=" + this.b + ", isCommentChangeAvailable=" + this.c + ", screenUniqueId=" + this.d + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                this.b.writeToParcel(parcel, i);
                parcel.writeInt(this.c ? 1 : 0);
                parcel.writeSerializable(this.d);
            }

            public /* synthetic */ AdditionalSettingsChanged(AdditionalSettingsConfiguration additionalSettingsConfiguration, boolean z, UUID uuid, int i, zcl zclVar) {
                this(additionalSettingsConfiguration, z, (i & 4) != 0 ? null : uuid);
            }
        }
    }

    /* compiled from: PostingAction.kt */
    public static final class ShowMessage implements PostingAction {
        public static final Parcelable.Creator<ShowMessage> CREATOR = new a();
        public final PostingUserMessage b;
        public final PostingAction c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final Window h;

        /* compiled from: PostingAction.kt */
        public static final class a implements Parcelable.Creator<ShowMessage> {
            @Override // android.os.Parcelable.Creator
            public final ShowMessage createFromParcel(Parcel parcel) {
                return new ShowMessage((PostingUserMessage) parcel.readParcelable(ShowMessage.class.getClassLoader()), (PostingAction) parcel.readParcelable(ShowMessage.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Window) parcel.readValue(ShowMessage.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ShowMessage[] newArray(int i) {
                return new ShowMessage[i];
            }
        }

        public ShowMessage(PostingUserMessage postingUserMessage, PostingAction postingAction, int i, int i2, int i3, int i4, Window window) {
            this.b = postingUserMessage;
            this.c = postingAction;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = window;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowMessage)) {
                return false;
            }
            ShowMessage showMessage = (ShowMessage) obj;
            return epx.f(this.b, showMessage.b) && epx.f(this.c, showMessage.c) && this.d == showMessage.d && this.e == showMessage.e && this.f == showMessage.f && this.g == showMessage.g && epx.f(this.h, showMessage.h);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            PostingAction postingAction = this.c;
            int a2 = shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, (hashCode + (postingAction == null ? 0 : postingAction.hashCode())) * 31, 31), 31), 31), 31);
            Window window = this.h;
            return a2 + (window != null ? window.hashCode() : 0);
        }

        public final String toString() {
            return "ShowMessage(message=" + this.b + ", originalAction=" + this.c + ", insetTop=" + this.d + ", insetBottom=" + this.e + ", insetLeft=" + this.f + ", insetRight=" + this.g + ", customWindow=" + this.h + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeValue(this.h);
        }

        public /* synthetic */ ShowMessage(PostingUserMessage postingUserMessage, PostingAction postingAction, int i, int i2, int i3, int i4, Window window, int i5, zcl zclVar) {
            this(postingUserMessage, (i5 & 2) != 0 ? null : postingAction, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4, (i5 & 64) != 0 ? null : window);
        }
    }
}
