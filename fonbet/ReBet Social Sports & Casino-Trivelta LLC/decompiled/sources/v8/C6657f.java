package v8;

import T7.Y;
import android.os.Bundle;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import g6.C4357q;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: v8.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6657f {

    /* renamed from: a, reason: collision with root package name */
    public static final C6657f f67077a = new C6657f();

    public static final Bundle g(UUID callId, ShareContent shareContent, boolean z10) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(shareContent, "shareContent");
        if (shareContent instanceof ShareLinkContent) {
            return f67077a.b((ShareLinkContent) shareContent, z10);
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            List i10 = C6663l.i(sharePhotoContent, callId);
            if (i10 == null) {
                i10 = CollectionsKt.emptyList();
            }
            return f67077a.d(sharePhotoContent, i10, z10);
        }
        if (shareContent instanceof ShareVideoContent) {
            ShareVideoContent shareVideoContent = (ShareVideoContent) shareContent;
            return f67077a.f(shareVideoContent, C6663l.o(shareVideoContent, callId), z10);
        }
        if (shareContent instanceof ShareMediaContent) {
            ShareMediaContent shareMediaContent = (ShareMediaContent) shareContent;
            List g10 = C6663l.g(shareMediaContent, callId);
            if (g10 == null) {
                g10 = CollectionsKt.emptyList();
            }
            return f67077a.c(shareMediaContent, g10, z10);
        }
        if (shareContent instanceof ShareCameraEffectContent) {
            ShareCameraEffectContent shareCameraEffectContent = (ShareCameraEffectContent) shareContent;
            return f67077a.a(shareCameraEffectContent, C6663l.m(shareCameraEffectContent, callId), z10);
        }
        if (!(shareContent instanceof ShareStoryContent)) {
            return null;
        }
        ShareStoryContent shareStoryContent = (ShareStoryContent) shareContent;
        return f67077a.e(shareStoryContent, C6663l.f(shareStoryContent, callId), C6663l.l(shareStoryContent, callId), z10);
    }

    public final Bundle a(ShareCameraEffectContent shareCameraEffectContent, Bundle bundle, boolean z10) {
        Bundle h10 = h(shareCameraEffectContent, z10);
        Y y10 = Y.f11042a;
        Y.s0(h10, "effect_id", shareCameraEffectContent.getEffectId());
        if (bundle != null) {
            h10.putBundle("effect_textures", bundle);
        }
        try {
            C6653b c6653b = C6653b.f67067a;
            JSONObject a10 = C6653b.a(shareCameraEffectContent.getArguments());
            if (a10 == null) {
                return h10;
            }
            Y.s0(h10, "effect_arguments", a10.toString());
            return h10;
        } catch (JSONException e10) {
            throw new C4357q(Intrinsics.stringPlus("Unable to create a JSON Object from the provided CameraEffectArguments: ", e10.getMessage()));
        }
    }

    public final Bundle b(ShareLinkContent shareLinkContent, boolean z10) {
        Bundle h10 = h(shareLinkContent, z10);
        Y y10 = Y.f11042a;
        Y.s0(h10, "QUOTE", shareLinkContent.getQuote());
        Y.t0(h10, "MESSENGER_LINK", shareLinkContent.getContentUrl());
        Y.t0(h10, "TARGET_DISPLAY", shareLinkContent.getContentUrl());
        return h10;
    }

    public final Bundle c(ShareMediaContent shareMediaContent, List list, boolean z10) {
        Bundle h10 = h(shareMediaContent, z10);
        h10.putParcelableArrayList("MEDIA", new ArrayList<>(list));
        return h10;
    }

    public final Bundle d(SharePhotoContent sharePhotoContent, List list, boolean z10) {
        Bundle h10 = h(sharePhotoContent, z10);
        h10.putStringArrayList("PHOTOS", new ArrayList<>(list));
        return h10;
    }

    public final Bundle e(ShareStoryContent shareStoryContent, Bundle bundle, Bundle bundle2, boolean z10) {
        Bundle h10 = h(shareStoryContent, z10);
        if (bundle != null) {
            h10.putParcelable("bg_asset", bundle);
        }
        if (bundle2 != null) {
            h10.putParcelable("interactive_asset_uri", bundle2);
        }
        List j10 = shareStoryContent.j();
        if (j10 != null && !j10.isEmpty()) {
            h10.putStringArrayList("top_background_color_list", new ArrayList<>(j10));
        }
        Y y10 = Y.f11042a;
        Y.s0(h10, "content_url", shareStoryContent.getAttributionLink());
        return h10;
    }

    public final Bundle f(ShareVideoContent shareVideoContent, String str, boolean z10) {
        Bundle h10 = h(shareVideoContent, z10);
        Y y10 = Y.f11042a;
        Y.s0(h10, "TITLE", shareVideoContent.getContentTitle());
        Y.s0(h10, "DESCRIPTION", shareVideoContent.getContentDescription());
        Y.s0(h10, "VIDEO", str);
        return h10;
    }

    public final Bundle h(ShareContent shareContent, boolean z10) {
        Bundle bundle = new Bundle();
        Y y10 = Y.f11042a;
        Y.t0(bundle, "LINK", shareContent.getContentUrl());
        Y.s0(bundle, "PLACE", shareContent.getPlaceId());
        Y.s0(bundle, "PAGE", shareContent.getPageId());
        Y.s0(bundle, "REF", shareContent.getRef());
        Y.s0(bundle, "REF", shareContent.getRef());
        bundle.putBoolean("DATA_FAILURES_FATAL", z10);
        List peopleIds = shareContent.getPeopleIds();
        if (peopleIds != null && !peopleIds.isEmpty()) {
            bundle.putStringArrayList("FRIENDS", new ArrayList<>(peopleIds));
        }
        ShareHashtag shareHashtag = shareContent.getShareHashtag();
        Y.s0(bundle, "HASHTAG", shareHashtag == null ? null : shareHashtag.getHashtag());
        return bundle;
    }
}
