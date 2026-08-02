package pb;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.r;
import Sc.s;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: pb.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8892c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final PackageManager f80383a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f80384b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f80385c;

    /* renamed from: pb.c$a */
    static final class a extends AbstractC7737t implements Function0<Bundle> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            return C8892c.a(C8892c.this);
        }
    }

    public C8892c(@NotNull PackageManager packageManager, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f80383a = packageManager;
        this.f80384b = packageName;
        this.f80385c = k.b(new a());
    }

    public static final Bundle a(C8892c c8892c) {
        Object a11;
        PackageManager packageManager = c8892c.f80383a;
        try {
            r.Companion companion = r.INSTANCE;
            a11 = packageManager.getApplicationInfo(c8892c.f80384b, UserVerificationMethods.USER_VERIFY_PATTERN);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) a11;
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }

    public final String b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle = (Bundle) this.f80385c.getValue();
        if (bundle != null) {
            return bundle.getString(key);
        }
        return null;
    }
}
