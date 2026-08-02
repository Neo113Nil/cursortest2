package e6;

import K1.G;
import T5.i;
import T5.k;
import V5.v;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.List;

/* renamed from: e6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6309g implements k<Uri, Drawable> {

    /* renamed from: b, reason: collision with root package name */
    public static final T5.h<Resources.Theme> f62024b = T5.h.d("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a, reason: collision with root package name */
    private final Context f62025a;

    public C6309g(Context context) {
        this.f62025a = context.getApplicationContext();
    }

    @Override // T5.k
    public final boolean a(@NonNull Uri uri, @NonNull i iVar) throws IOException {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // T5.k
    public final /* bridge */ /* synthetic */ v<Drawable> b(@NonNull Uri uri, int i11, int i12, @NonNull i iVar) throws IOException {
        return c(uri, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v c(@NonNull Uri uri, @NonNull i iVar) {
        Context createPackageContext;
        List<String> pathSegments;
        int parseInt;
        Drawable b11;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f62025a;
        if (!authority.equals(context.getPackageName())) {
            try {
                createPackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e11) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(G.b(uri, "Failed to obtain context or unrecognized Uri format for: "), e11);
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
                    throw new IllegalArgumentException(G.b(uri, "Failed to find resource id for: "));
                }
            } else {
                if (pathSegments.size() != 1) {
                    throw new IllegalArgumentException(G.b(uri, "Unrecognized Uri format: "));
                }
                try {
                    parseInt = Integer.parseInt(uri.getPathSegments().get(0));
                } catch (NumberFormatException e12) {
                    throw new IllegalArgumentException(G.b(uri, "Unrecognized Uri format: "), e12);
                }
            }
            Resources.Theme theme = !authority.equals(context.getPackageName()) ? (Resources.Theme) iVar.a(f62024b) : null;
            b11 = theme != null ? C6305c.b(context, createPackageContext, parseInt) : C6305c.a(context, parseInt, theme);
            if (b11 == null) {
                return new C6308f(b11);
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
        if (b11 == null) {
        }
    }
}
