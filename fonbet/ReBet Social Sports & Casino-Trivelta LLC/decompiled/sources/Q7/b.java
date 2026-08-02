package Q7;

import B7.d;
import F7.c;
import H7.e;
import H7.j;
import H7.k;
import H7.p;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.util.f;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f9522c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Resources f9523a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f9524b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public b(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f9523a = resources;
        this.f9524b = new ConcurrentHashMap();
    }

    @Override // F7.c
    public e a(k encodedImage, int i10, p qualityInfo, d options) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(qualityInfo, "qualityInfo");
        Intrinsics.checkNotNullParameter(options, "options");
        try {
            String T12 = encodedImage.T1();
            if (T12 == null) {
                throw new IllegalStateException("No source in encoded image");
            }
            Drawable f10 = androidx.core.content.res.k.f(this.f9523a, b(T12), null);
            if (f10 != null) {
                return new j(f10);
            }
            return null;
        } catch (Throwable th2) {
            E6.a.n("XmlFormatDecoder", "Cannot decode xml", th2);
            return null;
        }
    }

    public final int b(String str) {
        Map map = this.f9524b;
        Object obj = map.get(str);
        if (obj == null) {
            Uri parse = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            obj = Integer.valueOf(c(parse));
            map.put(str, obj);
        }
        return ((Number) obj).intValue();
    }

    public final int c(Uri uri) {
        Integer intOrNull;
        if (!f.o(uri) && !f.q(uri)) {
            throw new IllegalStateException(("Unsupported uri " + uri).toString());
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        String str = (String) CollectionsKt.lastOrNull((List) pathSegments);
        if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
            return intOrNull.intValue();
        }
        throw new IllegalStateException(("Unable to read resource ID from " + uri.getPath()).toString());
    }
}
