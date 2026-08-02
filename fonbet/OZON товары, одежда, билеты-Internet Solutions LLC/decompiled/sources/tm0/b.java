package tm0;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StatFs;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qm0.C9085a;
import spay.sdk.domain.model.FraudMonInfo;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f99573a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9085a f99574b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f99575c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f99576d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f99577e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f99578f;

    static final class a extends AbstractC7737t implements Function0<String> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            b.this.getClass();
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr == null || strArr.length == 0) {
                return FraudMonInfo.UNKNOWN;
            }
            String str = strArr[0];
            Intrinsics.checkNotNullExpressionValue(str, "abis[0]");
            return str;
        }
    }

    /* renamed from: tm0.b$b, reason: collision with other inner class name */
    static final class C2192b extends AbstractC7737t implements Function0<String> {
        C2192b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return b.c(b.this);
        }
    }

    static final class c extends AbstractC7737t implements Function0<String> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return b.a(b.this);
        }
    }

    static final class d extends AbstractC7737t implements Function0<String> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return b.b(b.this);
        }
    }

    public b(@NotNull Context context, @NotNull C9085a settings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f99573a = context;
        this.f99574b = settings;
        this.f99575c = k.b(new c());
        this.f99576d = k.b(new d());
        this.f99577e = k.b(new a());
        this.f99578f = k.b(new C2192b());
    }

    public static final String a(b bVar) {
        DisplayMetrics displayMetrics = bVar.f99573a.getResources().getDisplayMetrics();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(displayMetrics.heightPixels);
        sb2.append('x');
        sb2.append(displayMetrics.widthPixels);
        return sb2.toString();
    }

    public static final String b(b bVar) {
        bVar.getClass();
        try {
            File externalFilesDir = bVar.f99573a.getExternalFilesDir(null);
            long totalBytes = new StatFs(externalFilesDir != null ? externalFilesDir.getPath() : null).getTotalBytes();
            return totalBytes <= -1 ? FraudMonInfo.UNKNOWN : String.valueOf(totalBytes);
        } catch (Exception unused) {
            return FraudMonInfo.UNKNOWN;
        }
    }

    public static final String c(b bVar) {
        Context context = bVar.f99573a;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i11 = applicationInfo.labelRes;
        if (i11 == 0) {
            return applicationInfo.nonLocalizedLabel.toString();
        }
        String string = context.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringId)");
        return string;
    }

    @NotNull
    public final wm0.d d() {
        String a11 = this.f99574b.a();
        String locale = Locale.getDefault().toString();
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        String MANUFACTURER = Build.MANUFACTURER;
        String MODEL = Build.MODEL;
        String str = (String) this.f99575c.getValue();
        String str2 = (String) this.f99576d.getValue();
        String str3 = (String) this.f99577e.getValue();
        String str4 = (String) this.f99578f.getValue();
        Intrinsics.checkNotNullExpressionValue(locale, "toString()");
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return new wm0.d(a11, valueOf, locale, str, str2, str3, str4, 4096);
    }
}
