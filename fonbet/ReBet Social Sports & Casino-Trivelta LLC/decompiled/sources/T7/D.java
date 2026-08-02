package T7;

import android.net.Uri;
import g6.C4331C;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes2.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10982a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri a(String str, int i10, int i11, String str2) {
            Z.n(str, "userId");
            int max = Math.max(i10, 0);
            int max2 = Math.max(i11, 0);
            if (!((max == 0 && max2 == 0) ? false : true)) {
                throw new IllegalArgumentException("Either width or height must be greater than 0");
            }
            Uri.Builder buildUpon = Uri.parse(P.h()).buildUpon();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%s/%s/picture", Arrays.copyOf(new Object[]{C4331C.w(), str}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            Uri.Builder path = buildUpon.path(format);
            if (max2 != 0) {
                path.appendQueryParameter("height", String.valueOf(max2));
            }
            if (max != 0) {
                path.appendQueryParameter("width", String.valueOf(max));
            }
            path.appendQueryParameter("migration_overrides", "{october_2012:true}");
            if (!Y.d0(str2)) {
                path.appendQueryParameter("access_token", str2);
            } else if (!Y.d0(C4331C.r()) && !Y.d0(C4331C.m())) {
                path.appendQueryParameter("access_token", C4331C.m() + '|' + C4331C.r());
            }
            Uri build = path.build();
            Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
            return build;
        }

        public a() {
        }
    }
}
