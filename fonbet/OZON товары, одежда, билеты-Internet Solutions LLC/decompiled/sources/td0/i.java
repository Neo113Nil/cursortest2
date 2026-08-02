package td0;

import androidx.fragment.app.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i {
    private static Db0.g a(String str) {
        List m11 = kotlin.text.h.m(str, new String[]{"."}, 0, 6);
        ArrayList arrayList = new ArrayList(C7714v.z(m11, 10));
        Iterator it = m11.iterator();
        while (it.hasNext()) {
            Integer w02 = kotlin.text.h.w0((String) it.next());
            arrayList.add(Integer.valueOf(w02 != null ? w02.intValue() : 0));
        }
        return new Db0.g(((Number) (arrayList.size() > 0 ? arrayList.get(0) : r2)).intValue(), ((Number) (1 < arrayList.size() ? arrayList.get(1) : r2)).intValue(), ((Number) (2 < arrayList.size() ? arrayList.get(2) : 0)).intValue());
    }

    public static Db0.g b(@NotNull r context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String str2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName;
            if (str2 != null && !kotlin.text.h.K(str2) && (str = (String) C7714v.M(kotlin.text.h.m(kotlin.text.h.z0(str2).toString(), new String[]{" "}, 0, 6))) != null) {
                return a(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
