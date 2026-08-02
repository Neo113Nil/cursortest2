package ru.ozon.app.android.abtool.utils;

import B0.C2454a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\bJ\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n*\u0004\u0018\u00010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\b*\b\u0012\u0004\u0012\u00020\b0\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/abtool/utils/AbVariantUtils;", "", "<init>", "()V", "variantsRegex", "Lkotlin/text/Regex;", "isValidVariants", "", "", "splitToSet", "", "toVariantsHeader", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbVariantUtils {

    @NotNull
    public static final AbVariantUtils INSTANCE = new AbVariantUtils();

    @NotNull
    private static final Regex variantsRegex = new Regex("^\\s*[1-9]\\d{0,9}(\\s*,\\s*[1-9]\\d{0,9})*\\s*,?\\s*$");

    private AbVariantUtils() {
    }

    public final boolean isValidVariants(String str) {
        if (str == null || h.K(str)) {
            return true;
        }
        return variantsRegex.f(str);
    }

    @NotNull
    public final Set<String> splitToSet(String str) {
        if (str == null || h.K(str)) {
            return M.f71699a;
        }
        List l11 = h.l(str, new char[]{','}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : l11) {
            if (!h.K((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2454a.g((String) it.next(), arrayList2);
        }
        return C7714v.Y0(arrayList2);
    }

    public final String toVariantsHeader(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        if (set.isEmpty()) {
            set = null;
        }
        if (set != null) {
            return C7714v.V(set, ",", null, null, null, 62);
        }
        return null;
    }
}
