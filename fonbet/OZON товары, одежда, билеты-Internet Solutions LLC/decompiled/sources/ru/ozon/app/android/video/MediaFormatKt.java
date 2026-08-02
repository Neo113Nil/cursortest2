package ru.ozon.app.android.video;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.f;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"extractMediaFormatFromUrl", "Lru/ozon/app/android/video/MediaFormat;", "", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaFormatKt {
    public static final MediaFormat extractMediaFormatFromUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Object obj = null;
        if (!h.K(str)) {
            String n02 = h.n0('#', str, str);
            String n03 = h.n0('?', n02, n02);
            String j02 = h.j0('/', n03, n03);
            Regex regex = new Regex("[a-zA-Zа-яА-ЯёЁ_0-9.\\-()%]+", f.IGNORE_CASE);
            if (j02.length() != 0 && regex.f(j02)) {
                String str2 = "." + h.j0('.', j02, j02);
                Intrinsics.checkNotNullExpressionValue(str2, "toString(...)");
                Iterator<E> it = MediaFormat.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (h.D(((MediaFormat) next).getExtension(), str2, true)) {
                        obj = next;
                        break;
                    }
                }
                return (MediaFormat) obj;
            }
        }
        return null;
    }
}
