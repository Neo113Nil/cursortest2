package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideo;
import com.google.android.material.shape.i;
import i3.C4527h;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002$%B\u0011\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/facebook/share/model/ShareVideoContent;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/model/ShareVideoContent$a;", "", "builder", "<init>", "(Lcom/facebook/share/model/ShareVideoContent$a;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "g", "Ljava/lang/String;", C4527h.f48087o, "()Ljava/lang/String;", "contentDescription", i.f35755A, "contentTitle", "Lcom/facebook/share/model/SharePhoto;", "Lcom/facebook/share/model/SharePhoto;", "j", "()Lcom/facebook/share/model/SharePhoto;", "previewPhoto", "Lcom/facebook/share/model/ShareVideo;", "Lcom/facebook/share/model/ShareVideo;", "k", "()Lcom/facebook/share/model/ShareVideo;", "video", "a", "c", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ShareVideoContent extends ShareContent<ShareVideoContent, a> implements Parcelable {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final String contentDescription;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final String contentTitle;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final SharePhoto previewPhoto;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final ShareVideo video;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new b();

    public static final class a extends ShareContent.a {

        /* renamed from: g, reason: collision with root package name */
        public String f31552g;

        /* renamed from: h, reason: collision with root package name */
        public String f31553h;

        /* renamed from: i, reason: collision with root package name */
        public SharePhoto f31554i;

        /* renamed from: j, reason: collision with root package name */
        public ShareVideo f31555j;

        public ShareVideoContent n() {
            return new ShareVideoContent(this, null);
        }

        public final String o() {
            return this.f31552g;
        }

        public final String p() {
            return this.f31553h;
        }

        public final SharePhoto q() {
            return this.f31554i;
        }

        public final ShareVideo r() {
            return this.f31555j;
        }

        public final a s(String str) {
            this.f31552g = str;
            return this;
        }

        public final a t(String str) {
            this.f31553h = str;
            return this;
        }

        public final a u(SharePhoto sharePhoto) {
            this.f31554i = sharePhoto == null ? null : new SharePhoto.a().i(sharePhoto).d();
            return this;
        }

        public final a v(ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            this.f31555j = new ShareVideo.a().f(shareVideo).d();
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareVideoContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShareVideoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareVideoContent[] newArray(int i10) {
            return new ShareVideoContent[i10];
        }
    }

    public /* synthetic */ ShareVideoContent(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: h, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* renamed from: i, reason: from getter */
    public final String getContentTitle() {
        return this.contentTitle;
    }

    /* renamed from: j, reason: from getter */
    public final SharePhoto getPreviewPhoto() {
        return this.previewPhoto;
    }

    /* renamed from: k, reason: from getter */
    public final ShareVideo getVideo() {
        return this.video;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, flags);
        out.writeString(this.contentDescription);
        out.writeString(this.contentTitle);
        out.writeParcelable(this.previewPhoto, 0);
        out.writeParcelable(this.video, 0);
    }

    public ShareVideoContent(a aVar) {
        super(aVar);
        this.contentDescription = aVar.o();
        this.contentTitle = aVar.p();
        this.previewPhoto = aVar.q();
        this.video = aVar.r();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideoContent(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.contentDescription = parcel.readString();
        this.contentTitle = parcel.readString();
        SharePhoto.a j10 = new SharePhoto.a().j(parcel);
        this.previewPhoto = (j10.g() == null && j10.e() == null) ? null : j10.d();
        this.video = new ShareVideo.a().g(parcel).d();
    }
}
