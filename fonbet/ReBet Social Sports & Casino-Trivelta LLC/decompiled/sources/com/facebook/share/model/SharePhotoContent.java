package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import i3.C4527h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/facebook/share/model/SharePhotoContent;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/model/SharePhotoContent$a;", "builder", "<init>", "(Lcom/facebook/share/model/SharePhotoContent$a;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "Lcom/facebook/share/model/SharePhoto;", "g", "Ljava/util/List;", C4527h.f48087o, "()Ljava/util/List;", "photos", "a", "c", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SharePhotoContent extends ShareContent<SharePhotoContent, a> {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final List photos;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new b();

    public static final class a extends ShareContent.a {

        /* renamed from: g, reason: collision with root package name */
        public final List f31537g = new ArrayList();

        public final a n(SharePhoto sharePhoto) {
            if (sharePhoto != null) {
                this.f31537g.add(new SharePhoto.a().i(sharePhoto).d());
            }
            return this;
        }

        public final a o(List list) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    n((SharePhoto) it.next());
                }
            }
            return this;
        }

        public SharePhotoContent p() {
            return new SharePhotoContent(this, null);
        }

        public final List q() {
            return this.f31537g;
        }

        public a r(SharePhotoContent sharePhotoContent) {
            return sharePhotoContent == null ? this : ((a) super.g(sharePhotoContent)).o(sharePhotoContent.getPhotos());
        }

        public final a s(List list) {
            this.f31537g.clear();
            o(list);
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharePhotoContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SharePhotoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SharePhotoContent[] newArray(int i10) {
            return new SharePhotoContent[i10];
        }
    }

    public /* synthetic */ SharePhotoContent(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: h, reason: from getter */
    public final List getPhotos() {
        return this.photos;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, flags);
        SharePhoto.a.f31530g.b(out, flags, this.photos);
    }

    public SharePhotoContent(a aVar) {
        super(aVar);
        this.photos = CollectionsKt.toList(aVar.q());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhotoContent(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.photos = CollectionsKt.toList(SharePhoto.a.f31530g.a(parcel));
    }
}
