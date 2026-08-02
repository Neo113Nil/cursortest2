package v8;

import T7.C1661a;
import T7.C1665e;
import T7.K;
import T7.M;
import T7.Y;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.twilio.voice.EventKeys;
import g6.C4331C;
import g6.C4357q;
import g6.C4358s;
import g6.EnumC4340L;
import g6.InterfaceC4350j;
import g6.InterfaceC4354n;
import h6.C4470F;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import u8.C6530b;

/* renamed from: v8.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6663l {

    /* renamed from: a, reason: collision with root package name */
    public static final C6663l f67094a = new C6663l();

    /* renamed from: v8.l$a */
    public static final class a extends AbstractC6658g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4354n f67095b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4354n interfaceC4354n) {
            super(interfaceC4354n);
            this.f67095b = interfaceC4354n;
        }

        @Override // v8.AbstractC6658g
        public void a(C1661a appCall) {
            Intrinsics.checkNotNullParameter(appCall, "appCall");
            C6663l c6663l = C6663l.f67094a;
            C6663l.q(this.f67095b);
        }

        @Override // v8.AbstractC6658g
        public void b(C1661a appCall, C4357q error) {
            Intrinsics.checkNotNullParameter(appCall, "appCall");
            Intrinsics.checkNotNullParameter(error, "error");
            C6663l c6663l = C6663l.f67094a;
            C6663l.r(this.f67095b, error);
        }

        @Override // v8.AbstractC6658g
        public void c(C1661a appCall, Bundle bundle) {
            Intrinsics.checkNotNullParameter(appCall, "appCall");
            if (bundle != null) {
                String h10 = C6663l.h(bundle);
                if (h10 == null || StringsKt.equals("post", h10, true)) {
                    C6663l.s(this.f67095b, C6663l.j(bundle));
                } else if (StringsKt.equals("cancel", h10, true)) {
                    C6663l.q(this.f67095b);
                } else {
                    C6663l.r(this.f67095b, new C4357q("UnknownError"));
                }
            }
        }
    }

    public static final Bundle f(ShareStoryContent shareStoryContent, UUID appCallId) {
        Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        Bundle bundle = null;
        if (shareStoryContent != null && shareStoryContent.getBackgroundAsset() != null) {
            ShareMedia backgroundAsset = shareStoryContent.getBackgroundAsset();
            K.a e10 = f67094a.e(appCallId, backgroundAsset);
            if (e10 == null) {
                return null;
            }
            bundle = new Bundle();
            bundle.putString("type", backgroundAsset.getMediaType().name());
            bundle.putString("uri", e10.b());
            String n10 = n(e10.e());
            if (n10 != null) {
                Y.s0(bundle, "extension", n10);
            }
            K k10 = K.f10999a;
            K.a(CollectionsKt.listOf(e10));
        }
        return bundle;
    }

    public static final List g(ShareMediaContent shareMediaContent, UUID appCallId) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        List<ShareMedia> media = shareMediaContent == null ? null : shareMediaContent.getMedia();
        if (media == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ShareMedia shareMedia : media) {
            K.a e10 = f67094a.e(appCallId, shareMedia);
            if (e10 == null) {
                bundle = null;
            } else {
                arrayList.add(e10);
                bundle = new Bundle();
                bundle.putString("type", shareMedia.getMediaType().name());
                bundle.putString("uri", e10.b());
            }
            if (bundle != null) {
                arrayList2.add(bundle);
            }
        }
        K.a(arrayList);
        return arrayList2;
    }

    public static final String h(Bundle result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return result.containsKey("completionGesture") ? result.getString("completionGesture") : result.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
    }

    public static final List i(SharePhotoContent sharePhotoContent, UUID appCallId) {
        Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        List photos = sharePhotoContent == null ? null : sharePhotoContent.getPhotos();
        if (photos == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = photos.iterator();
        while (it.hasNext()) {
            K.a e10 = f67094a.e(appCallId, (SharePhoto) it.next());
            if (e10 != null) {
                arrayList.add(e10);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((K.a) it2.next()).b());
        }
        K.a(arrayList);
        return arrayList2;
    }

    public static final String j(Bundle result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return result.containsKey("postId") ? result.getString("postId") : result.containsKey("com.facebook.platform.extra.POST_ID") ? result.getString("com.facebook.platform.extra.POST_ID") : result.getString("post_id");
    }

    public static final AbstractC6658g k(InterfaceC4354n interfaceC4354n) {
        return new a(interfaceC4354n);
    }

    public static final Bundle l(ShareStoryContent shareStoryContent, UUID appCallId) {
        Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        if (shareStoryContent == null || shareStoryContent.getStickerAsset() == null) {
            return null;
        }
        new ArrayList().add(shareStoryContent.getStickerAsset());
        K.a e10 = f67094a.e(appCallId, shareStoryContent.getStickerAsset());
        if (e10 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("uri", e10.b());
        String n10 = n(e10.e());
        if (n10 != null) {
            Y.s0(bundle, "extension", n10);
        }
        K k10 = K.f10999a;
        K.a(CollectionsKt.listOf(e10));
        return bundle;
    }

    public static final Bundle m(ShareCameraEffectContent shareCameraEffectContent, UUID appCallId) {
        Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        CameraEffectTextures textures = shareCameraEffectContent == null ? null : shareCameraEffectContent.getTextures();
        if (textures == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (String str : textures.d()) {
            K.a d10 = f67094a.d(appCallId, textures.c(str), textures.b(str));
            if (d10 != null) {
                arrayList.add(d10);
                bundle.putString(str, d10.b());
            }
        }
        K.a(arrayList);
        return bundle;
    }

    public static final String n(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) uri2, '.', 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return null;
        }
        String substring = uri2.substring(lastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final String o(ShareVideoContent shareVideoContent, UUID appCallId) {
        ShareVideo video;
        Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        Uri localUrl = (shareVideoContent == null || (video = shareVideoContent.getVideo()) == null) ? null : video.getLocalUrl();
        if (localUrl == null) {
            return null;
        }
        K.a e10 = K.e(appCallId, localUrl);
        K.a(CollectionsKt.listOf(e10));
        return e10.b();
    }

    public static final boolean p(int i10, int i11, Intent intent, AbstractC6658g abstractC6658g) {
        C1661a c10 = f67094a.c(i10, i11, intent);
        if (c10 == null) {
            return false;
        }
        K k10 = K.f10999a;
        K.c(c10.c());
        if (abstractC6658g == null) {
            return true;
        }
        C4357q t10 = intent != null ? M.t(M.s(intent)) : null;
        if (t10 == null) {
            abstractC6658g.c(c10, intent != null ? M.A(intent) : null);
        } else if (t10 instanceof C4358s) {
            abstractC6658g.a(c10);
        } else {
            abstractC6658g.b(c10, t10);
        }
        return true;
    }

    public static final void q(InterfaceC4354n interfaceC4354n) {
        f67094a.t("cancelled", null);
        if (interfaceC4354n == null) {
            return;
        }
        interfaceC4354n.onCancel();
    }

    public static final void r(InterfaceC4354n interfaceC4354n, C4357q ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        f67094a.t("error", ex.getMessage());
        if (interfaceC4354n == null) {
            return;
        }
        interfaceC4354n.a(ex);
    }

    public static final void s(InterfaceC4354n interfaceC4354n, String str) {
        f67094a.t("succeeded", null);
        if (interfaceC4354n == null) {
            return;
        }
        interfaceC4354n.onSuccess(new C6530b(str));
    }

    public static final GraphRequest u(AccessToken accessToken, Uri imageUri, GraphRequest.b bVar) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        String path = imageUri.getPath();
        if (Y.b0(imageUri) && path != null) {
            return v(accessToken, new File(path), bVar);
        }
        if (!Y.Y(imageUri)) {
            throw new C4357q("The image Uri must be either a file:// or content:// Uri");
        }
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(imageUri, ClipboardModule.MIMETYPE_PNG);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, EnumC4340L.POST, bVar, null, 32, null);
    }

    public static final GraphRequest v(AccessToken accessToken, File file, GraphRequest.b bVar) {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), ClipboardModule.MIMETYPE_PNG);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, EnumC4340L.POST, bVar, null, 32, null);
    }

    public static final void w(final int i10, InterfaceC4350j interfaceC4350j, final InterfaceC4354n interfaceC4354n) {
        if (!(interfaceC4350j instanceof C1665e)) {
            throw new C4357q("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((C1665e) interfaceC4350j).c(i10, new C1665e.a() { // from class: v8.j
            @Override // T7.C1665e.a
            public final boolean a(int i11, Intent intent) {
                boolean x10;
                x10 = C6663l.x(i10, interfaceC4354n, i11, intent);
                return x10;
            }
        });
    }

    public static final boolean x(int i10, InterfaceC4354n interfaceC4354n, int i11, Intent intent) {
        return p(i10, i11, intent, k(interfaceC4354n));
    }

    public static final void y(final int i10) {
        C1665e.f11105b.c(i10, new C1665e.a() { // from class: v8.k
            @Override // T7.C1665e.a
            public final boolean a(int i11, Intent intent) {
                boolean z10;
                z10 = C6663l.z(i10, i11, intent);
                return z10;
            }
        });
    }

    public static final boolean z(int i10, int i11, Intent intent) {
        return p(i10, i11, intent, k(null));
    }

    public final C1661a c(int i10, int i11, Intent intent) {
        UUID r10 = M.r(intent);
        if (r10 == null) {
            return null;
        }
        return C1661a.f11054d.b(r10, i10);
    }

    public final K.a d(UUID uuid, Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            return K.d(uuid, bitmap);
        }
        if (uri != null) {
            return K.e(uuid, uri);
        }
        return null;
    }

    public final K.a e(UUID uuid, ShareMedia shareMedia) {
        Uri uri;
        Bitmap bitmap;
        if (shareMedia instanceof SharePhoto) {
            SharePhoto sharePhoto = (SharePhoto) shareMedia;
            bitmap = sharePhoto.getBitmap();
            uri = sharePhoto.getImageUrl();
        } else if (shareMedia instanceof ShareVideo) {
            uri = ((ShareVideo) shareMedia).getLocalUrl();
            bitmap = null;
        } else {
            uri = null;
            bitmap = null;
        }
        return d(uuid, uri, bitmap);
    }

    public final void t(String str, String str2) {
        C4470F c4470f = new C4470F(C4331C.l());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundle.putString(EventKeys.ERROR_MESSAGE_KEY, str2);
        }
        c4470f.g("fb_share_dialog_result", bundle);
    }
}
