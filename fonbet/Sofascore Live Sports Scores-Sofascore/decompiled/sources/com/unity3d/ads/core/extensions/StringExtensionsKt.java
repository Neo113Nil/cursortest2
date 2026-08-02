package com.unity3d.ads.core.extensions;

import defpackage.gc2;
import defpackage.q1f;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"getSHA256Hash", "", "guessMimeType", "VERSION_REGEX", "Lkotlin/text/Regex;", "compareVersion", "", "other", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StringExtensionsKt {

    @NotNull
    private static final Regex VERSION_REGEX = new Regex("[0-9.]+");

    public static final int compareVersion(@NotNull String str, @NotNull String str2) {
        List split$default;
        List split$default2;
        Integer intOrNull;
        Integer intOrNull2;
        str.getClass();
        str2.getClass();
        if (str.length() == 0 || str2.length() == 0) {
            return -1;
        }
        String V = StringsKt.V(StringsKt.V(str, "v"), "V");
        String V2 = StringsKt.V(StringsKt.V(str2, "v"), "V");
        Regex regex = VERSION_REGEX;
        if (!regex.f(V) || !regex.f(V2) || StringsKt.J(V, "..", false) || StringsKt.J(V2, "..", false)) {
            return -1;
        }
        split$default = StringsKt__StringsKt.split$default(V, new String[]{"."}, false, 0, 6, null);
        split$default2 = StringsKt__StringsKt.split$default(V2, new String[]{"."}, false, 0, 6, null);
        int max = Math.max(split$default.size(), split$default2.size());
        for (int i = 0; i < max; i++) {
            String str3 = (String) CollectionsKt.a0(i, split$default);
            int intValue = (str3 == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue();
            String str4 = (String) CollectionsKt.a0(i, split$default2);
            int intValue2 = (str4 == null || (intOrNull = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull.intValue();
            if (intValue != intValue2) {
                return Intrinsics.d(intValue, intValue2);
            }
        }
        return 0;
    }

    @NotNull
    public static final String getSHA256Hash(@NotNull String str) {
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] copyOf = Arrays.copyOf(bytes, bytes.length);
        gc2 gc2Var = gc2.d;
        String i = q1f.r(copyOf).g("SHA-256").i();
        i.getClass();
        return i;
    }

    @Nullable
    public static final String guessMimeType(@NotNull String str) {
        str.getClass();
        return URLConnection.guessContentTypeFromName(str);
    }
}
