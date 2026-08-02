package t8;

import android.net.Uri;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.twilio.voice.EventKeys;
import g6.EnumC4347g;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: t8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6451e {
    public static WritableMap a(AccessToken accessToken) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("accessToken", accessToken.getToken());
        createMap.putString("applicationID", accessToken.getApplicationId());
        createMap.putString("userID", accessToken.getUserId());
        createMap.putArray("permissions", Arguments.fromJavaArgs((Object[]) q(accessToken.getPermissions())));
        createMap.putArray("declinedPermissions", Arguments.fromJavaArgs((Object[]) q(accessToken.getDeclinedPermissions())));
        createMap.putArray("expiredPermissions", Arguments.fromJavaArgs((Object[]) q(accessToken.getExpiredPermissions())));
        createMap.putString("accessTokenSource", accessToken.getSource().name());
        createMap.putDouble("expirationTime", accessToken.getExpires().getTime());
        createMap.putDouble("lastRefreshTime", accessToken.getLastRefresh().getTime());
        createMap.putDouble("dataAccessExpirationTime", accessToken.getDataAccessExpirationTime().getTime());
        return createMap;
    }

    public static void b(ShareContent.a aVar, ReadableMap readableMap) {
        if (readableMap.hasKey("commonParameters")) {
            ReadableMap map = readableMap.getMap("commonParameters");
            aVar.j(map.hasKey("peopleIds") ? p(map.getArray("peopleIds")) : null);
            aVar.k(k(map, "placeId"));
            aVar.l(k(map, "ref"));
            if (map.hasKey("hashtag")) {
                aVar.m(new ShareHashtag.a().e(map.getString("hashtag")).a());
            }
        }
    }

    public static AccessToken c(ReadableMap readableMap) {
        String string = readableMap.getString("accessToken");
        String string2 = readableMap.getString("applicationID");
        String string3 = readableMap.getString("userID");
        Date date = null;
        List p10 = (!readableMap.hasKey("permissions") || readableMap.isNull("permissions")) ? null : p(readableMap.getArray("permissions"));
        List p11 = (!readableMap.hasKey("declinedPermissions") || readableMap.isNull("declinedPermissions")) ? null : p(readableMap.getArray("declinedPermissions"));
        List p12 = (!readableMap.hasKey("expiredPermissions") || readableMap.isNull("expiredPermissions")) ? null : p(readableMap.getArray("expiredPermissions"));
        EnumC4347g valueOf = (!readableMap.hasKey("accessTokenSource") || readableMap.isNull("accessTokenSource")) ? null : EnumC4347g.valueOf(readableMap.getString("accessTokenSource"));
        Date date2 = (!readableMap.hasKey("expirationTime") || readableMap.isNull("expirationTime")) ? null : new Date((long) readableMap.getDouble("expirationTime"));
        Date date3 = (!readableMap.hasKey("lastRefreshTime") || readableMap.isNull("lastRefreshTime")) ? null : new Date((long) readableMap.getDouble("lastRefreshTime"));
        if (readableMap.hasKey("dataAccessExpirationTime") && !readableMap.isNull("dataAccessExpirationTime")) {
            date = new Date((long) readableMap.getDouble("dataAccessExpirationTime"));
        }
        return new AccessToken(string, string2, string3, p10, p11, p12, valueOf, date2, date3, date);
    }

    public static GameRequestContent d(ReadableMap readableMap) {
        GameRequestContent.b bVar = new GameRequestContent.b();
        String k10 = k(readableMap, "actionType");
        if (k10 != null) {
            bVar.k(GameRequestContent.a.valueOf(k10.toUpperCase(Locale.ROOT)));
        }
        String k11 = k(readableMap, "filters");
        if (k11 != null) {
            bVar.m(GameRequestContent.e.valueOf(k11.toUpperCase(Locale.ROOT)));
        }
        bVar.n(readableMap.getString("message"));
        if (readableMap.hasKey("recipients")) {
            bVar.p(p(readableMap.getArray("recipients")));
        }
        bVar.r(k(readableMap, "title"));
        bVar.l(k(readableMap, EventKeys.DATA));
        bVar.o(k(readableMap, "objectId"));
        if (readableMap.hasKey("suggestions")) {
            bVar.q(p(readableMap.getArray("suggestions")));
        }
        return bVar.a();
    }

    public static ShareContent e(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        String string = readableMap.getString("contentType");
        if (string.equals("link")) {
            return f(readableMap);
        }
        if (string.equals("photo")) {
            return h(readableMap);
        }
        if (string.equals("video")) {
            return j(readableMap);
        }
        return null;
    }

    public static ShareLinkContent f(ReadableMap readableMap) {
        ShareLinkContent.a aVar = new ShareLinkContent.a();
        aVar.h(Uri.parse(readableMap.getString("contentUrl")));
        aVar.p(k(readableMap, "quote"));
        b(aVar, readableMap);
        return aVar.n();
    }

    public static SharePhoto g(ReadableMap readableMap) {
        SharePhoto.a aVar = new SharePhoto.a();
        aVar.m(Uri.parse(readableMap.getString("imageUrl")));
        aVar.l(k(readableMap, "caption"));
        if (readableMap.hasKey("userGenerated")) {
            aVar.n(readableMap.getBoolean("userGenerated"));
        }
        return aVar.d();
    }

    public static SharePhotoContent h(ReadableMap readableMap) {
        SharePhotoContent.a aVar = new SharePhotoContent.a();
        aVar.s(o(readableMap.getArray("photos")));
        String k10 = k(readableMap, "contentUrl");
        aVar.h(k10 != null ? Uri.parse(k10) : null);
        b(aVar, readableMap);
        return aVar.p();
    }

    public static ShareVideo i(ReadableMap readableMap) {
        ShareVideo.a aVar = new ShareVideo.a();
        if (readableMap.hasKey("localUrl")) {
            aVar.h(Uri.parse(readableMap.getString("localUrl")));
        }
        return aVar.d();
    }

    public static ShareContent j(ReadableMap readableMap) {
        ShareVideoContent.a aVar = new ShareVideoContent.a();
        String k10 = k(readableMap, "contentUrl");
        aVar.h(k10 != null ? Uri.parse(k10) : null);
        aVar.s(k(readableMap, "contentDescription"));
        aVar.t(k(readableMap, "contentTitle"));
        if (readableMap.hasKey("previewPhoto")) {
            aVar.u(g(readableMap.getMap("previewPhoto")));
        }
        if (readableMap.hasKey("video")) {
            aVar.v(i(readableMap.getMap("video")));
        }
        b(aVar, readableMap);
        return aVar.n();
    }

    public static String k(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str)) {
            return readableMap.getString(str);
        }
        return null;
    }

    public static WritableArray l(List list) {
        WritableArray createArray = Arguments.createArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            createArray.pushString((String) it.next());
        }
        return createArray;
    }

    public static WritableMap m(Profile profile) {
        WritableMap createMap = Arguments.createMap();
        n(createMap, "name", profile.getName());
        n(createMap, "firstName", profile.getFirstName());
        n(createMap, "lastName", profile.getLastName());
        n(createMap, "middleName", profile.getMiddleName());
        n(createMap, "imageURL", profile.i(100, 100).toString());
        n(createMap, "linkURL", profile.getLinkUri().toString());
        n(createMap, "userID", profile.getCom.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String());
        return createMap;
    }

    public static void n(WritableMap writableMap, String str, String str2) {
        if (str2 == null) {
            writableMap.putNull(str);
        } else {
            writableMap.putString(str, str2);
        }
    }

    public static List o(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            arrayList.add(g(readableArray.getMap(i10)));
        }
        return arrayList;
    }

    public static List p(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            arrayList.add(readableArray.getString(i10));
        }
        return arrayList;
    }

    public static String[] q(Set set) {
        String[] strArr = new String[set.size()];
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            strArr[i10] = (String) it.next();
            i10++;
        }
        return strArr;
    }
}
