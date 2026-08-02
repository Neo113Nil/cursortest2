package F6;

import D6.g;
import android.webkit.MimeTypeMap;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final MimeTypeMap f3569a = MimeTypeMap.getSingleton();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3570b = g.of(ClipboardModule.MIMETYPE_HEIF, "heif", ClipboardModule.MIMETYPE_HEIC, "heic");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f3571c = g.of("heif", ClipboardModule.MIMETYPE_HEIF, "heic", ClipboardModule.MIMETYPE_HEIC);

    public static String a(String str) {
        String str2 = (String) f3571c.get(str);
        return str2 != null ? str2 : f3569a.getMimeTypeFromExtension(str);
    }
}
