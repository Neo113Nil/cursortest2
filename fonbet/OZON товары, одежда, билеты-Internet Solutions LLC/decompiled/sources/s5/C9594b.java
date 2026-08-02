package s5;

import A5.k;
import android.net.Uri;
import java.io.File;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import v5.C10239m;

/* renamed from: s5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9594b implements InterfaceC9596d<Uri, File> {
    @Override // s5.InterfaceC9596d
    public final File a(Uri uri, C10239m c10239m) {
        Uri uri2 = uri;
        if (k.f(uri2)) {
            return null;
        }
        String scheme = uri2.getScheme();
        if (scheme != null && !scheme.equals("file")) {
            return null;
        }
        String path = uri2.getPath();
        if (path == null) {
            path = "";
        }
        if (!h.f0(path, '/') || ((String) C7714v.M(uri2.getPathSegments())) == null) {
            return null;
        }
        if (!Intrinsics.d(uri2.getScheme(), "file")) {
            return new File(uri2.toString());
        }
        String path2 = uri2.getPath();
        if (path2 != null) {
            return new File(path2);
        }
        return null;
    }
}
