package jc0;

import B0.C2454a;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: jc0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7346i {
    public static boolean a(@NotNull String link) {
        List m11;
        Intrinsics.checkNotNullParameter(link, "link");
        String host = Uri.parse(link).getHost();
        if (host != null) {
            String d11 = C7339b.d();
            if (d11 == null || d11.length() == 0) {
                return b(host, C7339b.a());
            }
            String d12 = C7339b.d();
            if (d12 != null && (m11 = kotlin.text.h.m(d12, new String[]{","}, 0, 6)) != null) {
                List list = m11;
                ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C2454a.g((String) it.next(), arrayList);
                }
                Set Y02 = C7714v.Y0(arrayList);
                if (Y02 != null) {
                    return b(host, Y02);
                }
            }
        }
        return false;
    }

    private static boolean b(String str, Set set) {
        Set<String> set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            for (String str2 : set2) {
                if (str.equals(str2)) {
                    return true;
                }
                if (kotlin.text.h.A(str, "." + str2, false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
