package r5;

import A5.k;
import android.content.res.Configuration;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import v5.C10239m;

/* renamed from: r5.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9173c implements InterfaceC9172b<Uri> {
    @Override // r5.InterfaceC9172b
    public final String a(Uri uri, C10239m c10239m) {
        Uri uri2 = uri;
        if (!Intrinsics.d(uri2.getScheme(), "android.resource")) {
            return uri2.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri2);
        sb2.append('-');
        Configuration configuration = c10239m.f().getResources().getConfiguration();
        int i11 = k.f430d;
        sb2.append(configuration.uiMode & 48);
        return sb2.toString();
    }
}
