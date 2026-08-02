package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l1g implements j1g {
    public static final ivd b = new ivd("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, ivd.e);
    public final Context a;

    public l1g(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.j1g
    public final boolean a(Object obj, uvd uvdVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // defpackage.j1g
    public final /* bridge */ /* synthetic */ e1g b(Object obj, int i, int i2, uvd uvdVar) {
        return c((Uri) obj, uvdVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e1g c(Uri uri, uvd uvdVar) {
        Context createPackageContext;
        List<String> pathSegments;
        int parseInt;
        Drawable E;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            ilg.f(uri, " is null or empty", "Package name for ");
            return null;
        }
        Context context = this.a;
        if (!authority.equals(context.getPackageName())) {
            try {
                createPackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(dmi.m(uri, "Failed to obtain context or unrecognized Uri format for: "), e);
                }
            }
            pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                List<String> pathSegments2 = uri.getPathSegments();
                String authority2 = uri.getAuthority();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                parseInt = createPackageContext.getResources().getIdentifier(str2, str, authority2);
                if (parseInt == 0) {
                    parseInt = Resources.getSystem().getIdentifier(str2, str, "android");
                }
                if (parseInt == 0) {
                    a70.p(dmi.m(uri, "Failed to find resource id for: "));
                    return null;
                }
            } else {
                if (pathSegments.size() != 1) {
                    a70.p(dmi.m(uri, "Unrecognized Uri format: "));
                    return null;
                }
                try {
                    parseInt = Integer.parseInt(uri.getPathSegments().get(0));
                } catch (NumberFormatException e2) {
                    throw new IllegalArgumentException(dmi.m(uri, "Unrecognized Uri format: "), e2);
                }
            }
            Resources.Theme theme = !authority.equals(context.getPackageName()) ? (Resources.Theme) uvdVar.c(b) : null;
            E = theme != null ? l6g.E(context, createPackageContext, parseInt, null) : l6g.E(context, context, parseInt, theme);
            if (E == null) {
                return new yx8(E, 1);
            }
            return null;
        }
        createPackageContext = context;
        pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 2) {
        }
        if (!authority.equals(context.getPackageName())) {
        }
        if (theme != null) {
        }
        if (E == null) {
        }
    }
}
