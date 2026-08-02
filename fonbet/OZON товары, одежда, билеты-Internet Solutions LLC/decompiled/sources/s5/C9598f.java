package s5;

import K1.G;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import v5.C10239m;

/* renamed from: s5.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9598f implements InterfaceC9596d<Uri, Uri> {
    @Override // s5.InterfaceC9596d
    public final Uri a(Uri uri, C10239m c10239m) {
        String authority;
        Uri uri2 = uri;
        if (!Intrinsics.d(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || h.K(authority) || uri2.getPathSegments().size() != 2) {
            return null;
        }
        String authority2 = uri2.getAuthority();
        if (authority2 == null) {
            authority2 = "";
        }
        Resources resourcesForApplication = c10239m.f().getPackageManager().getResourcesForApplication(authority2);
        List<String> pathSegments = uri2.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
        if (identifier == 0) {
            throw new IllegalStateException(G.b(uri2, "Invalid android.resource URI: ").toString());
        }
        Uri parse = Uri.parse("android.resource://" + authority2 + '/' + identifier);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        return parse;
    }
}
