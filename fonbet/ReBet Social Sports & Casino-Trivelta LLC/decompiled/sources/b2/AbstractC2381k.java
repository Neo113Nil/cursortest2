package b2;

import b1.AbstractC2335D;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: b2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2381k {
    public static String a(androidx.media3.common.a aVar) {
        String str = aVar.f20543o;
        return AbstractC2335D.t(str) ? "video/mp4" : AbstractC2335D.o(str) ? "audio/mp4" : AbstractC2335D.q(str) ? Objects.equals(str, ClipboardModule.MIMETYPE_HEIC) ? ClipboardModule.MIMETYPE_HEIF : Objects.equals(str, "image/avif") ? "image/avif" : "application/mp4" : "application/mp4";
    }

    public static String b(List list) {
        Iterator it = list.iterator();
        boolean z10 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((w) it.next()).f24973a.f24954g.f20543o;
            if (AbstractC2335D.t(str2)) {
                return "video/mp4";
            }
            if (AbstractC2335D.o(str2)) {
                z10 = true;
            } else if (AbstractC2335D.q(str2)) {
                if (Objects.equals(str2, ClipboardModule.MIMETYPE_HEIC)) {
                    str = ClipboardModule.MIMETYPE_HEIF;
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z10 ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
