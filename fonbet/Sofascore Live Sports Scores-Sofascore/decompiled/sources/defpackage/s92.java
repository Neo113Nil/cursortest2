package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.ironsource.U3;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s92 {
    public final /* synthetic */ int a;

    public final Object a(Object obj, xvd xvdVar) {
        String authority;
        switch (this.a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (l.d(uri)) {
                    return null;
                }
                String scheme = uri.getScheme();
                if (scheme != null && !scheme.equals(U3.i.b)) {
                    return null;
                }
                String path = uri.getPath();
                if (!StringsKt.c0(path != null ? path : "", '/') || ((String) CollectionsKt.firstOrNull(uri.getPathSegments())) == null) {
                    return null;
                }
                if (!Intrinsics.c(uri.getScheme(), U3.i.b)) {
                    return new File(uri.toString());
                }
                String path2 = uri.getPath();
                if (path2 != null) {
                    return new File(path2);
                }
                return null;
            case 2:
                return ((jl9) obj).i;
            case 3:
                int intValue = ((Number) obj).intValue();
                Context context = xvdVar.a;
                try {
                    if (context.getResources().getResourceEntryName(intValue) == null) {
                        return null;
                    }
                    Uri parse = Uri.parse("android.resource://" + context.getPackageName() + '/' + intValue);
                    parse.getClass();
                    return parse;
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            case 4:
                Uri uri2 = (Uri) obj;
                if (!Intrinsics.c(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || StringsKt.R(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                String str = authority2 != null ? authority2 : "";
                Resources resourcesForApplication = xvdVar.a.getPackageManager().getResourcesForApplication(str);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), str);
                if (identifier == 0) {
                    hc5.f(dmi.m(uri2, "Invalid android.resource URI: "));
                    return null;
                }
                Uri parse2 = Uri.parse("android.resource://" + str + '/' + identifier);
                parse2.getClass();
                return parse2;
            default:
                Uri parse3 = Uri.parse((String) obj);
                parse3.getClass();
                return parse3;
        }
    }
}
