package N8;

import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.enums.MediaType;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class j {
    public static final Boolean a(Media media) {
        String str;
        Intrinsics.checkNotNullParameter(media, "<this>");
        HashMap<String, String> userDictionary = media.getUserDictionary();
        if (userDictionary == null || (str = userDictionary.get("iek")) == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public static final Boolean b(Media media) {
        String str;
        Intrinsics.checkNotNullParameter(media, "<this>");
        HashMap<String, String> userDictionary = media.getUserDictionary();
        if (userDictionary == null || (str = userDictionary.get("itk")) == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public static final boolean c(Media media) {
        Intrinsics.checkNotNullParameter(media, "<this>");
        return media.getType() == MediaType.video;
    }

    public static final void d(Media media, Boolean bool) {
        Intrinsics.checkNotNullParameter(media, "<this>");
        HashMap<String, String> userDictionary = media.getUserDictionary();
        if (userDictionary == null) {
            userDictionary = new HashMap<>();
        }
        media.setUserDictionary(userDictionary);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            HashMap<String, String> userDictionary2 = media.getUserDictionary();
            if (userDictionary2 != null) {
                userDictionary2.put("iek", String.valueOf(booleanValue));
            }
        }
    }

    public static final void e(Media media, String str) {
        HashMap<String, String> userDictionary;
        Intrinsics.checkNotNullParameter(media, "<this>");
        HashMap<String, String> userDictionary2 = media.getUserDictionary();
        if (userDictionary2 == null) {
            userDictionary2 = new HashMap<>();
        }
        media.setUserDictionary(userDictionary2);
        if (str == null || (userDictionary = media.getUserDictionary()) == null) {
            return;
        }
        userDictionary.put("nck", str);
    }

    public static final void f(Media media, Boolean bool) {
        Intrinsics.checkNotNullParameter(media, "<this>");
        HashMap<String, String> userDictionary = media.getUserDictionary();
        if (userDictionary == null) {
            userDictionary = new HashMap<>();
        }
        media.setUserDictionary(userDictionary);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            HashMap<String, String> userDictionary2 = media.getUserDictionary();
            if (userDictionary2 != null) {
                userDictionary2.put("itk", String.valueOf(booleanValue));
            }
        }
    }
}
