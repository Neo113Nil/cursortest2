package com.facebook.share.model;

import W9.d;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.share.model.ShareMedia;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+\u0014B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010%\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b\u001d\u0010$R\u001a\u0010)\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b\u0012\u0010(¨\u0006,"}, d2 = {"Lcom/facebook/share/model/SharePhoto;", "Lcom/facebook/share/model/ShareMedia;", "Lcom/facebook/share/model/SharePhoto$a;", "builder", "<init>", "(Lcom/facebook/share/model/SharePhoto$a;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/graphics/Bitmap;", com.google.crypto.tink.integration.android.b.f37029b, "Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "bitmap", "Landroid/net/Uri;", "Landroid/net/Uri;", e.f29601m, "()Landroid/net/Uri;", "imageUrl", "", d.f13160a, "Z", "f", "()Z", "userGenerated", "", "Ljava/lang/String;", "()Ljava/lang/String;", "caption", "Lcom/facebook/share/model/ShareMedia$b;", "Lcom/facebook/share/model/ShareMedia$b;", "()Lcom/facebook/share/model/ShareMedia$b;", "mediaType", "g", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SharePhoto extends ShareMedia<SharePhoto, a> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Bitmap bitmap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Uri imageUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean userGenerated;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String caption;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final ShareMedia.b mediaType;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<SharePhoto> CREATOR = new b();

    public static final class a extends ShareMedia.a {

        /* renamed from: g, reason: collision with root package name */
        public static final C0486a f31530g = new C0486a(null);

        /* renamed from: c, reason: collision with root package name */
        public Bitmap f31531c;

        /* renamed from: d, reason: collision with root package name */
        public Uri f31532d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f31533e;

        /* renamed from: f, reason: collision with root package name */
        public String f31534f;

        /* renamed from: com.facebook.share.model.SharePhoto$a$a, reason: collision with other inner class name */
        public static final class C0486a {
            public /* synthetic */ C0486a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List a(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                List a10 = ShareMedia.a.f31518b.a(parcel);
                ArrayList arrayList = new ArrayList();
                for (Object obj : a10) {
                    if (obj instanceof SharePhoto) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            public final void b(Parcel out, int i10, List photos) {
                Intrinsics.checkNotNullParameter(out, "out");
                Intrinsics.checkNotNullParameter(photos, "photos");
                Object[] array = photos.toArray(new SharePhoto[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                out.writeParcelableArray((SharePhoto[]) array, i10);
            }

            public C0486a() {
            }
        }

        public SharePhoto d() {
            return new SharePhoto(this, null);
        }

        public final Bitmap e() {
            return this.f31531c;
        }

        public final String f() {
            return this.f31534f;
        }

        public final Uri g() {
            return this.f31532d;
        }

        public final boolean h() {
            return this.f31533e;
        }

        public a i(SharePhoto sharePhoto) {
            return sharePhoto == null ? this : ((a) super.b(sharePhoto)).k(sharePhoto.getBitmap()).m(sharePhoto.getImageUrl()).n(sharePhoto.getUserGenerated()).l(sharePhoto.getCaption());
        }

        public final a j(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return i((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        public final a k(Bitmap bitmap) {
            this.f31531c = bitmap;
            return this;
        }

        public final a l(String str) {
            this.f31534f = str;
            return this;
        }

        public final a m(Uri uri) {
            this.f31532d = uri;
            return this;
        }

        public final a n(boolean z10) {
            this.f31533e = z10;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharePhoto createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new SharePhoto(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SharePhoto[] newArray(int i10) {
            return new SharePhoto[i10];
        }
    }

    public /* synthetic */ SharePhoto(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareMedia
    /* renamed from: b, reason: from getter */
    public ShareMedia.b getMediaType() {
        return this.mediaType;
    }

    /* renamed from: c, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* renamed from: d, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final Uri getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getUserGenerated() {
        return this.userGenerated;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, flags);
        out.writeParcelable(this.bitmap, 0);
        out.writeParcelable(this.imageUrl, 0);
        out.writeByte(this.userGenerated ? (byte) 1 : (byte) 0);
        out.writeString(this.caption);
    }

    public SharePhoto(a aVar) {
        super(aVar);
        this.mediaType = ShareMedia.b.PHOTO;
        this.bitmap = aVar.e();
        this.imageUrl = aVar.g();
        this.userGenerated = aVar.h();
        this.caption = aVar.f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhoto(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.mediaType = ShareMedia.b.PHOTO;
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.userGenerated = parcel.readByte() != 0;
        this.caption = parcel.readString();
    }
}
