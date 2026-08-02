package v8;

import T7.Y;
import T7.Z;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import g6.C4331C;
import g6.C4357q;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: v8.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6659h {

    /* renamed from: a, reason: collision with root package name */
    public static final C6659h f67079a = new C6659h();

    /* renamed from: b, reason: collision with root package name */
    public static final c f67080b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final c f67081c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final c f67082d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final c f67083e = new b();

    /* renamed from: v8.h$a */
    public static final class a extends c {
        @Override // v8.C6659h.c
        public void b(ShareLinkContent linkContent) {
            Intrinsics.checkNotNullParameter(linkContent, "linkContent");
            Y y10 = Y.f11042a;
            if (!Y.d0(linkContent.getQuote())) {
                throw new C4357q("Cannot share link content with quote using the share api");
            }
        }

        @Override // v8.C6659h.c
        public void d(ShareMediaContent mediaContent) {
            Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
            throw new C4357q("Cannot share ShareMediaContent using the share api");
        }

        @Override // v8.C6659h.c
        public void e(SharePhoto photo) {
            Intrinsics.checkNotNullParameter(photo, "photo");
            C6659h.f67079a.v(photo, this);
        }

        @Override // v8.C6659h.c
        public void i(ShareVideoContent videoContent) {
            Intrinsics.checkNotNullParameter(videoContent, "videoContent");
            Y y10 = Y.f11042a;
            if (!Y.d0(videoContent.getPlaceId())) {
                throw new C4357q("Cannot share video content with place IDs using the share api");
            }
            if (!Y.e0(videoContent.getPeopleIds())) {
                throw new C4357q("Cannot share video content with people IDs using the share api");
            }
            if (!Y.d0(videoContent.getRef())) {
                throw new C4357q("Cannot share video content with referrer URL using the share api");
            }
        }
    }

    /* renamed from: v8.h$b */
    public static final class b extends c {
        @Override // v8.C6659h.c
        public void g(ShareStoryContent shareStoryContent) {
            C6659h.f67079a.y(shareStoryContent, this);
        }
    }

    /* renamed from: v8.h$c */
    public static class c {
        public void a(ShareCameraEffectContent cameraEffectContent) {
            Intrinsics.checkNotNullParameter(cameraEffectContent, "cameraEffectContent");
            C6659h.f67079a.l(cameraEffectContent);
        }

        public void b(ShareLinkContent linkContent) {
            Intrinsics.checkNotNullParameter(linkContent, "linkContent");
            C6659h.f67079a.q(linkContent, this);
        }

        public void c(ShareMedia medium) {
            Intrinsics.checkNotNullParameter(medium, "medium");
            C6659h.s(medium, this);
        }

        public void d(ShareMediaContent mediaContent) {
            Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
            C6659h.f67079a.r(mediaContent, this);
        }

        public void e(SharePhoto photo) {
            Intrinsics.checkNotNullParameter(photo, "photo");
            C6659h.f67079a.w(photo, this);
        }

        public void f(SharePhotoContent photoContent) {
            Intrinsics.checkNotNullParameter(photoContent, "photoContent");
            C6659h.f67079a.u(photoContent, this);
        }

        public void g(ShareStoryContent shareStoryContent) {
            C6659h.f67079a.y(shareStoryContent, this);
        }

        public void h(ShareVideo shareVideo) {
            C6659h.f67079a.z(shareVideo, this);
        }

        public void i(ShareVideoContent videoContent) {
            Intrinsics.checkNotNullParameter(videoContent, "videoContent");
            C6659h.f67079a.A(videoContent, this);
        }
    }

    /* renamed from: v8.h$d */
    public static final class d extends c {
        @Override // v8.C6659h.c
        public void d(ShareMediaContent mediaContent) {
            Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
            throw new C4357q("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // v8.C6659h.c
        public void e(SharePhoto photo) {
            Intrinsics.checkNotNullParameter(photo, "photo");
            C6659h.f67079a.x(photo, this);
        }

        @Override // v8.C6659h.c
        public void i(ShareVideoContent videoContent) {
            Intrinsics.checkNotNullParameter(videoContent, "videoContent");
            throw new C4357q("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    public static final void m(ShareContent shareContent) {
        f67079a.k(shareContent, f67081c);
    }

    public static final void n(ShareContent shareContent) {
        f67079a.k(shareContent, f67081c);
    }

    public static final void o(ShareContent shareContent) {
        f67079a.k(shareContent, f67083e);
    }

    public static final void p(ShareContent shareContent) {
        f67079a.k(shareContent, f67080b);
    }

    public static final void s(ShareMedia medium, c validator) {
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(validator, "validator");
        if (medium instanceof SharePhoto) {
            validator.e((SharePhoto) medium);
        } else {
            if (medium instanceof ShareVideo) {
                validator.h((ShareVideo) medium);
                return;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "Invalid media type: %s", Arrays.copyOf(new Object[]{medium.getClass().getSimpleName()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            throw new C4357q(format);
        }
    }

    public final void A(ShareVideoContent shareVideoContent, c cVar) {
        cVar.h(shareVideoContent.getVideo());
        SharePhoto previewPhoto = shareVideoContent.getPreviewPhoto();
        if (previewPhoto != null) {
            cVar.e(previewPhoto);
        }
    }

    public final void k(ShareContent shareContent, c cVar) {
        if (shareContent == null) {
            throw new C4357q("Must provide non-null content to share");
        }
        if (shareContent instanceof ShareLinkContent) {
            cVar.b((ShareLinkContent) shareContent);
            return;
        }
        if (shareContent instanceof SharePhotoContent) {
            cVar.f((SharePhotoContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareVideoContent) {
            cVar.i((ShareVideoContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareMediaContent) {
            cVar.d((ShareMediaContent) shareContent);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            cVar.a((ShareCameraEffectContent) shareContent);
        } else if (shareContent instanceof ShareStoryContent) {
            cVar.g((ShareStoryContent) shareContent);
        }
    }

    public final void l(ShareCameraEffectContent shareCameraEffectContent) {
        if (Y.d0(shareCameraEffectContent.getEffectId())) {
            throw new C4357q("Must specify a non-empty effectId");
        }
    }

    public final void q(ShareLinkContent shareLinkContent, c cVar) {
        Uri contentUrl = shareLinkContent.getContentUrl();
        if (contentUrl != null && !Y.f0(contentUrl)) {
            throw new C4357q("Content Url must be an http:// or https:// url");
        }
    }

    public final void r(ShareMediaContent shareMediaContent, c cVar) {
        List media = shareMediaContent.getMedia();
        if (media == null || media.isEmpty()) {
            throw new C4357q("Must specify at least one medium in ShareMediaContent.");
        }
        if (media.size() <= 6) {
            Iterator it = media.iterator();
            while (it.hasNext()) {
                cVar.c((ShareMedia) it.next());
            }
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "Cannot add more than %d media.", Arrays.copyOf(new Object[]{6}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            throw new C4357q(format);
        }
    }

    public final void t(SharePhoto sharePhoto) {
        if (sharePhoto == null) {
            throw new C4357q("Cannot share a null SharePhoto");
        }
        Bitmap bitmap = sharePhoto.getBitmap();
        Uri imageUrl = sharePhoto.getImageUrl();
        if (bitmap == null && imageUrl == null) {
            throw new C4357q("SharePhoto does not have a Bitmap or ImageUrl specified");
        }
    }

    public final void u(SharePhotoContent sharePhotoContent, c cVar) {
        List photos = sharePhotoContent.getPhotos();
        if (photos == null || photos.isEmpty()) {
            throw new C4357q("Must specify at least one Photo in SharePhotoContent.");
        }
        if (photos.size() <= 6) {
            Iterator it = photos.iterator();
            while (it.hasNext()) {
                cVar.e((SharePhoto) it.next());
            }
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "Cannot add more than %d photos.", Arrays.copyOf(new Object[]{6}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            throw new C4357q(format);
        }
    }

    public final void v(SharePhoto sharePhoto, c cVar) {
        t(sharePhoto);
        Bitmap bitmap = sharePhoto.getBitmap();
        Uri imageUrl = sharePhoto.getImageUrl();
        if (bitmap == null && Y.f0(imageUrl)) {
            throw new C4357q("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
        }
    }

    public final void w(SharePhoto sharePhoto, c cVar) {
        v(sharePhoto, cVar);
        if (sharePhoto.getBitmap() == null) {
            Y y10 = Y.f11042a;
            if (Y.f0(sharePhoto.getImageUrl())) {
                return;
            }
        }
        Z z10 = Z.f11052a;
        Z.d(C4331C.l());
    }

    public final void x(SharePhoto sharePhoto, c cVar) {
        t(sharePhoto);
    }

    public final void y(ShareStoryContent shareStoryContent, c cVar) {
        if (shareStoryContent == null || (shareStoryContent.getBackgroundAsset() == null && shareStoryContent.getStickerAsset() == null)) {
            throw new C4357q("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (shareStoryContent.getBackgroundAsset() != null) {
            cVar.c(shareStoryContent.getBackgroundAsset());
        }
        if (shareStoryContent.getStickerAsset() != null) {
            cVar.e(shareStoryContent.getStickerAsset());
        }
    }

    public final void z(ShareVideo shareVideo, c cVar) {
        if (shareVideo == null) {
            throw new C4357q("Cannot share a null ShareVideo");
        }
        Uri localUrl = shareVideo.getLocalUrl();
        if (localUrl == null) {
            throw new C4357q("ShareVideo does not have a LocalUrl specified");
        }
        if (!Y.Y(localUrl) && !Y.b0(localUrl)) {
            throw new C4357q("ShareVideo must reference a video that is on the device");
        }
    }
}
