package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Objects;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hqm {
    public static final hqm a = new hqm();

    public static Uri a(Uri uri, String str) {
        str.getClass();
        uri.getClass();
        if (c.v(str, "http", true)) {
            if (c.v(str, "HTTP://", true)) {
                str = c.t(str, "HTTP://", "http://", true);
            } else if (c.v(str, "HTTPS://", true)) {
                str = c.t(str, "HTTPS://", "https://", true);
            }
            return Uri.parse(str);
        }
        if (c.v(str, "/", false)) {
            Uri build = new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getEncodedAuthority()).encodedPath(str).build();
            build.getClass();
            return build;
        }
        String path = uri.getPath();
        if (path != null) {
            int T = StringsKt.T("/", path, 6);
            if (T != -1) {
                path = path.substring(0, T);
            }
        } else {
            path = "";
        }
        Uri build2 = new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getEncodedAuthority()).encodedPath(path + '/' + str).build();
        build2.getClass();
        return build2;
    }

    public static void b(Uri uri, pe2 pe2Var, Long l, Long l2, String str) {
        uri.getClass();
        pe2Var.getClass();
        boolean z = (l == null || l2 == null) ? false : true;
        if (z) {
            Objects.toString(uri);
        } else {
            Objects.toString(uri);
        }
        new jf2(pe2Var.createDataSource(), new xe4(uri, 0L, 1, null, Collections.EMPTY_MAP, l != null ? l.longValue() : 0L, l2 != null ? l2.longValue() : -1L, str != null ? str : null, 0)).a();
        if (z) {
            Objects.toString(uri);
        } else {
            Objects.toString(uri);
        }
    }

    public static /* synthetic */ void downloadSegment$default(hqm hqmVar, Uri uri, pe2 pe2Var, Long l, Long l2, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            l2 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        hqmVar.getClass();
        b(uri, pe2Var, l, l2, str);
    }
}
