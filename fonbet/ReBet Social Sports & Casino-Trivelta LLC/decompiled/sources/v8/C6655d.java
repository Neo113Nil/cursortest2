package v8;

import T7.Y;
import android.os.Bundle;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhotoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6655d {

    /* renamed from: a, reason: collision with root package name */
    public static final C6655d f67069a = new C6655d();

    public static final Bundle c(UUID callId, ShareContent shareContent, boolean z10) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(shareContent, "shareContent");
        if (shareContent instanceof ShareLinkContent) {
            return f67069a.a((ShareLinkContent) shareContent, z10);
        }
        if (!(shareContent instanceof SharePhotoContent)) {
            return null;
        }
        SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
        List i10 = C6663l.i(sharePhotoContent, callId);
        if (i10 == null) {
            i10 = CollectionsKt.emptyList();
        }
        return f67069a.b(sharePhotoContent, i10, z10);
    }

    public final Bundle a(ShareLinkContent shareLinkContent, boolean z10) {
        return d(shareLinkContent, z10);
    }

    public final Bundle b(SharePhotoContent sharePhotoContent, List list, boolean z10) {
        Bundle d10 = d(sharePhotoContent, z10);
        d10.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList<>(list));
        return d10;
    }

    public final Bundle d(ShareContent shareContent, boolean z10) {
        Bundle bundle = new Bundle();
        Y y10 = Y.f11042a;
        Y.t0(bundle, "com.facebook.platform.extra.LINK", shareContent.getContentUrl());
        Y.s0(bundle, "com.facebook.platform.extra.PLACE", shareContent.getPlaceId());
        Y.s0(bundle, "com.facebook.platform.extra.REF", shareContent.getRef());
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z10);
        List peopleIds = shareContent.getPeopleIds();
        if (peopleIds != null && !peopleIds.isEmpty()) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList<>(peopleIds));
        }
        return bundle;
    }
}
