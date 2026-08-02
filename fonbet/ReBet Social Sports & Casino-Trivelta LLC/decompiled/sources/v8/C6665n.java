package v8;

import T7.Y;
import android.os.Bundle;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v8.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6665n {

    /* renamed from: a, reason: collision with root package name */
    public static final C6665n f67098a = new C6665n();

    public static final Bundle a(GameRequestContent gameRequestContent) {
        String obj;
        String lowerCase;
        String obj2;
        Intrinsics.checkNotNullParameter(gameRequestContent, "gameRequestContent");
        Bundle bundle = new Bundle();
        Y y10 = Y.f11042a;
        Y.s0(bundle, "message", gameRequestContent.getMessage());
        Y.q0(bundle, "to", gameRequestContent.getRecipients());
        Y.s0(bundle, "title", gameRequestContent.getTitle());
        Y.s0(bundle, EventKeys.DATA, gameRequestContent.getData());
        GameRequestContent.a actionType = gameRequestContent.getActionType();
        String str = null;
        if (actionType == null || (obj = actionType.toString()) == null) {
            lowerCase = null;
        } else {
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            lowerCase = obj.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        }
        Y.s0(bundle, "action_type", lowerCase);
        Y.s0(bundle, "object_id", gameRequestContent.getObjectId());
        GameRequestContent.e filters = gameRequestContent.getFilters();
        if (filters != null && (obj2 = filters.toString()) != null) {
            Locale ENGLISH2 = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH2, "ENGLISH");
            str = obj2.toLowerCase(ENGLISH2);
            Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toLowerCase(locale)");
        }
        Y.s0(bundle, "filters", str);
        Y.q0(bundle, "suggestions", gameRequestContent.getSuggestions());
        return bundle;
    }

    public static final Bundle b(ShareLinkContent shareLinkContent) {
        Intrinsics.checkNotNullParameter(shareLinkContent, "shareLinkContent");
        Bundle d10 = d(shareLinkContent);
        Y y10 = Y.f11042a;
        Y.t0(d10, "href", shareLinkContent.getContentUrl());
        Y.s0(d10, "quote", shareLinkContent.getQuote());
        return d10;
    }

    public static final Bundle c(SharePhotoContent sharePhotoContent) {
        Intrinsics.checkNotNullParameter(sharePhotoContent, "sharePhotoContent");
        Bundle d10 = d(sharePhotoContent);
        List photos = sharePhotoContent.getPhotos();
        if (photos == null) {
            photos = CollectionsKt.emptyList();
        }
        List list = photos;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((SharePhoto) it.next()).getImageUrl()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        d10.putStringArray("media", (String[]) array);
        return d10;
    }

    public static final Bundle d(ShareContent shareContent) {
        Intrinsics.checkNotNullParameter(shareContent, "shareContent");
        Bundle bundle = new Bundle();
        Y y10 = Y.f11042a;
        ShareHashtag shareHashtag = shareContent.getShareHashtag();
        Y.s0(bundle, "hashtag", shareHashtag == null ? null : shareHashtag.getHashtag());
        return bundle;
    }

    public static final Bundle e(ShareFeedContent shareFeedContent) {
        Intrinsics.checkNotNullParameter(shareFeedContent, "shareFeedContent");
        Bundle bundle = new Bundle();
        Y y10 = Y.f11042a;
        Y.s0(bundle, "to", shareFeedContent.getToId());
        Y.s0(bundle, "link", shareFeedContent.getLink());
        Y.s0(bundle, "picture", shareFeedContent.getPicture());
        Y.s0(bundle, "source", shareFeedContent.getMediaSource());
        Y.s0(bundle, "name", shareFeedContent.getLinkName());
        Y.s0(bundle, "caption", shareFeedContent.getLinkCaption());
        Y.s0(bundle, "description", shareFeedContent.getLinkDescription());
        return bundle;
    }

    public static final Bundle f(ShareLinkContent shareLinkContent) {
        Intrinsics.checkNotNullParameter(shareLinkContent, "shareLinkContent");
        Bundle bundle = new Bundle();
        Y y10 = Y.f11042a;
        Y.s0(bundle, "link", Y.P(shareLinkContent.getContentUrl()));
        Y.s0(bundle, "quote", shareLinkContent.getQuote());
        ShareHashtag shareHashtag = shareLinkContent.getShareHashtag();
        Y.s0(bundle, "hashtag", shareHashtag == null ? null : shareHashtag.getHashtag());
        return bundle;
    }
}
