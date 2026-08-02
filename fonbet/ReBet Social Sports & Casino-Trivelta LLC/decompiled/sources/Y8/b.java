package Y8;

import U8.g;
import a9.AbstractC1926c;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.giphy.sdk.core.models.Image;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.enums.MediaType;
import com.giphy.sdk.core.models.enums.RenditionType;
import com.google.gson.Gson;
import com.google.gson.h;
import com.twilio.voice.EventKeys;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f14087a = new b();

    public final String a(Media media, RenditionType renditionType) {
        if (renditionType == null) {
            renditionType = RenditionType.downsized;
        }
        Image a10 = U8.d.f12144a.a(media, renditionType);
        if (a10 != null) {
            return a10.getGifUrl();
        }
        return null;
    }

    public final h b(Media media, RenditionType renditionType) {
        Intrinsics.checkNotNullParameter(media, "media");
        Gson gson = new Gson();
        HashMap hashMap = new HashMap();
        hashMap.put(StackTraceHelper.ID_KEY, media.getId());
        String a10 = a(media, renditionType);
        if (a10 == null) {
            a10 = "";
        }
        hashMap.put(EventKeys.URL, a10);
        hashMap.put(ViewProps.ASPECT_RATIO, Double.valueOf(g.c(media)));
        hashMap.put("isVideo", Boolean.valueOf(media.getType() == MediaType.video));
        hashMap.put("isDynamic", Boolean.valueOf(media.getIsDynamic()));
        hashMap.put(EventKeys.DATA, media);
        h B10 = gson.B(hashMap);
        Intrinsics.checkNotNullExpressionValue(B10, "toJsonTree(...)");
        return B10;
    }

    public final WritableMap c(Media media, RenditionType renditionType) {
        Intrinsics.checkNotNullParameter(media, "media");
        return AbstractC1926c.b(b(media, renditionType));
    }
}
