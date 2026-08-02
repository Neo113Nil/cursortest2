package h;

import Sc.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import g.C6601m;
import h.AbstractC6755a;
import h.C6756b;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: h.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6761g extends AbstractC6755a<C6601m, Uri> {

    /* renamed from: h.g$a */
    public static final class a {
        public static ResolveInfo a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
        }

        public static ResolveInfo b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public static String c(@NotNull f input) {
            Intrinsics.checkNotNullParameter(input, "input");
            if (input instanceof c) {
                return "image/*";
            }
            if (input instanceof e) {
                return "video/*";
            }
            if (input instanceof d) {
                ((d) input).getClass();
                return null;
            }
            if (input instanceof b) {
                return null;
            }
            throw new o();
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static boolean d() {
            int extensionVersion;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33) {
                return true;
            }
            if (i11 < 30) {
                return false;
            }
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            return extensionVersion >= 2;
        }
    }

    /* renamed from: h.g$b */
    /* loaded from: classes8.dex */
    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f64579a = new b();
    }

    /* renamed from: h.g$c */
    /* loaded from: classes8.dex */
    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f64580a = new c();
    }

    /* renamed from: h.g$d */
    /* loaded from: classes8.dex */
    public static final class d implements f {
    }

    /* renamed from: h.g$e */
    /* loaded from: classes8.dex */
    public static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f64581a = new e();
    }

    /* renamed from: h.g$f */
    /* loaded from: classes8.dex */
    public interface f {
    }

    @Override // h.AbstractC6755a
    public final Intent a(Context context, C6601m c6601m) {
        C6601m input = c6601m;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (a.d()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(a.c(input.a()));
            return intent;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        if (a.b(context) != null) {
            ResolveInfo b11 = a.b(context);
            if (b11 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = b11.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(a.c(input.a()));
            return intent2;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        if (a.a(context) == null) {
            Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent3.setType(a.c(input.a()));
            if (intent3.getType() == null) {
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent3;
        }
        ResolveInfo a11 = a.a(context);
        if (a11 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo2 = a11.activityInfo;
        Intent intent4 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
        intent4.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
        intent4.setType(a.c(input.a()));
        return intent4;
    }

    @Override // h.AbstractC6755a
    public final AbstractC6755a.C1046a<Uri> b(Context context, C6601m c6601m) {
        C6601m input = c6601m;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // h.AbstractC6755a
    public final Uri c(int i11, Intent intent) {
        if (i11 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        return data == null ? (Uri) C7714v.M(C6756b.a.a(intent)) : data;
    }
}
