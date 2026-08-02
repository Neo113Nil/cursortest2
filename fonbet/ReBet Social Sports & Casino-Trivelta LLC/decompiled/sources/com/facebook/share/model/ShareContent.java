package com.facebook.share.model;

import W9.d;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.a;
import com.facebook.share.model.ShareHashtag;
import com.google.crypto.tink.integration.android.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u0001\u0018B\u001d\b\u0014\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0014\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001f\u0010 \u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010$\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010%\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u001c\u0010#R\u0019\u0010'\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b&\u0010#R\u0019\u0010,\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+¨\u0006-"}, d2 = {"Lcom/facebook/share/model/ShareContent;", "M", "Lcom/facebook/share/model/ShareContent$a;", "B", "", "builder", "<init>", "(Lcom/facebook/share/model/ShareContent$a;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "", "g", "(Landroid/os/Parcel;)Ljava/util/List;", "", "describeContents", "()I", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/net/Uri;", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "contentUrl", b.f37029b, "Ljava/util/List;", "c", "()Ljava/util/List;", "peopleIds", "Ljava/lang/String;", d.f13160a, "()Ljava/lang/String;", "placeId", "pageId", e.f29601m, "ref", "Lcom/facebook/share/model/ShareHashtag;", "f", "Lcom/facebook/share/model/ShareHashtag;", "()Lcom/facebook/share/model/ShareHashtag;", "shareHashtag", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ShareContent<M extends ShareContent<M, B>, B extends a> implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Uri contentUrl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final List peopleIds;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String placeId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String pageId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String ref;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final ShareHashtag shareHashtag;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public Uri f31505a;

        /* renamed from: b, reason: collision with root package name */
        public List f31506b;

        /* renamed from: c, reason: collision with root package name */
        public String f31507c;

        /* renamed from: d, reason: collision with root package name */
        public String f31508d;

        /* renamed from: e, reason: collision with root package name */
        public String f31509e;

        /* renamed from: f, reason: collision with root package name */
        public ShareHashtag f31510f;

        public final Uri a() {
            return this.f31505a;
        }

        public final ShareHashtag b() {
            return this.f31510f;
        }

        public final String c() {
            return this.f31508d;
        }

        public final List d() {
            return this.f31506b;
        }

        public final String e() {
            return this.f31507c;
        }

        public final String f() {
            return this.f31509e;
        }

        public a g(ShareContent shareContent) {
            return shareContent == null ? this : h(shareContent.getContentUrl()).j(shareContent.getPeopleIds()).k(shareContent.getPlaceId()).i(shareContent.getPageId()).l(shareContent.getRef()).m(shareContent.getShareHashtag());
        }

        public final a h(Uri uri) {
            this.f31505a = uri;
            return this;
        }

        public final a i(String str) {
            this.f31508d = str;
            return this;
        }

        public final a j(List list) {
            this.f31506b = list == null ? null : Collections.unmodifiableList(list);
            return this;
        }

        public final a k(String str) {
            this.f31507c = str;
            return this;
        }

        public final a l(String str) {
            this.f31509e = str;
            return this;
        }

        public final a m(ShareHashtag shareHashtag) {
            this.f31510f = shareHashtag;
            return this;
        }
    }

    public ShareContent(a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.contentUrl = builder.a();
        this.peopleIds = builder.d();
        this.placeId = builder.e();
        this.pageId = builder.c();
        this.ref = builder.f();
        this.shareHashtag = builder.b();
    }

    private final List g(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a, reason: from getter */
    public final Uri getContentUrl() {
        return this.contentUrl;
    }

    /* renamed from: b, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* renamed from: c, reason: from getter */
    public final List getPeopleIds() {
        return this.peopleIds;
    }

    /* renamed from: d, reason: from getter */
    public final String getPlaceId() {
        return this.placeId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* renamed from: f, reason: from getter */
    public final ShareHashtag getShareHashtag() {
        return this.shareHashtag;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.contentUrl, 0);
        out.writeStringList(this.peopleIds);
        out.writeString(this.placeId);
        out.writeString(this.pageId);
        out.writeString(this.ref);
        out.writeParcelable(this.shareHashtag, 0);
    }

    public ShareContent(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.contentUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.peopleIds = g(parcel);
        this.placeId = parcel.readString();
        this.pageId = parcel.readString();
        this.ref = parcel.readString();
        this.shareHashtag = new ShareHashtag.a().d(parcel).a();
    }
}
