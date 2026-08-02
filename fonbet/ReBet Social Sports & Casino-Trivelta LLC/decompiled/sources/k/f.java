package k;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import k.AbstractC5140a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class f extends AbstractC5140a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f53998d = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ResolveInfo a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public final String b(InterfaceC0781f input) {
            Intrinsics.checkNotNullParameter(input, "input");
            if (input instanceof d) {
                return "image/*";
            }
            if (input instanceof e) {
                return "video/*";
            }
            if (input instanceof c) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final boolean c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return a(context) != null;
        }

        public final boolean d() {
            int extensionVersion;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                return true;
            }
            if (i10 >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
                if (extensionVersion >= 2) {
                    return true;
                }
            }
            return false;
        }

        public a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f53999a = new a();

            /* renamed from: b, reason: collision with root package name */
            public static final int f54000b = 1;

            public a() {
                super(null);
            }

            @Override // k.f.b
            public int a() {
                return f54000b;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int a();

        public b() {
        }
    }

    public static final class c implements InterfaceC0781f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f54001a = new c();
    }

    public static final class d implements InterfaceC0781f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f54002a = new d();
    }

    public static final class e implements InterfaceC0781f {

        /* renamed from: a, reason: collision with root package name */
        public static final e f54003a = new e();
    }

    /* renamed from: k.f$f, reason: collision with other inner class name */
    public interface InterfaceC0781f {
    }

    @Override // k.AbstractC5140a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, j.f input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        a aVar = f53998d;
        if (aVar.d()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.b(input.d()));
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.b().a());
            if (input.e()) {
                intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.a());
            }
            return intent;
        }
        if (!aVar.c(context)) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(aVar.b(input.d()));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo a10 = aVar.a(context);
        if (a10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = a10.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(aVar.b(input.d()));
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", input.b().a());
        if (input.e()) {
            intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR", input.a());
        }
        return intent3;
    }

    @Override // k.AbstractC5140a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC5140a.C0780a getSynchronousResult(Context context, j.f input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // k.AbstractC5140a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Uri parseResult(int i10, Intent intent) {
        if (i10 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        return data == null ? (Uri) CollectionsKt.firstOrNull(C5141b.f53995d.a(intent)) : data;
    }
}
