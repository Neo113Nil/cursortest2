package androidx.core.view;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements e, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1309a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1310b;

    /* renamed from: c, reason: collision with root package name */
    public int f1311c;

    /* renamed from: d, reason: collision with root package name */
    public int f1312d;

    /* renamed from: e, reason: collision with root package name */
    public Comparable f1313e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1314f;

    public /* synthetic */ f() {
        this.f1309a = 0;
    }

    public static String h(h8.g gVar) {
        gVar.a();
        h8.i iVar = gVar.f10403c;
        String str = iVar.f10419e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.f10416b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    @Override // androidx.core.view.g
    public ClipData a() {
        return (ClipData) this.f1310b;
    }

    @Override // androidx.core.view.e
    public void b(Uri uri) {
        this.f1313e = uri;
    }

    @Override // androidx.core.view.e
    public h build() {
        return new h(new f(this));
    }

    @Override // androidx.core.view.e
    public void c(int i5) {
        this.f1312d = i5;
    }

    @Override // androidx.core.view.g
    public int d() {
        return this.f1312d;
    }

    @Override // androidx.core.view.g
    public ContentInfo e() {
        return null;
    }

    public synchronized String f() {
        try {
            if (((String) this.f1313e) == null) {
                k();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.f1313e;
    }

    public synchronized String g() {
        try {
            if (((String) this.f1314f) == null) {
                k();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.f1314f;
    }

    @Override // androidx.core.view.g
    public int getSource() {
        return this.f1311c;
    }

    public PackageInfo i(String str) {
        try {
            return ((Context) this.f1310b).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e7) {
            io.sentry.android.core.w0.m("FirebaseMessaging", "Failed to find package " + e7);
            return null;
        }
    }

    public boolean j() {
        int i5;
        synchronized (this) {
            i5 = this.f1312d;
            if (i5 == 0) {
                PackageManager packageManager = ((Context) this.f1310b).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    io.sentry.android.core.w0.d("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i5 = 0;
                } else {
                    if (!q6.b.e()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f1312d = 1;
                            i5 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        io.sentry.android.core.w0.m("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (q6.b.e()) {
                            this.f1312d = 2;
                        } else {
                            this.f1312d = 1;
                        }
                        i5 = this.f1312d;
                    } else {
                        this.f1312d = 2;
                        i5 = 2;
                    }
                }
            }
        }
        return i5 != 0;
    }

    public synchronized void k() {
        PackageInfo i5 = i(((Context) this.f1310b).getPackageName());
        if (i5 != null) {
            this.f1313e = Integer.toString(i5.versionCode);
            this.f1314f = i5.versionName;
        }
    }

    @Override // androidx.core.view.e
    public void setExtras(Bundle bundle) {
        this.f1314f = bundle;
    }

    public String toString() {
        String str;
        switch (this.f1309a) {
            case 1:
                Uri uri = (Uri) this.f1313e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(((ClipData) this.f1310b).getDescription());
                sb2.append(", source=");
                int i5 = this.f1311c;
                sb2.append(i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? String.valueOf(i5) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb2.append(", flags=");
                int i10 = this.f1312d;
                sb2.append((i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return d9.e.l(sb2, ((Bundle) this.f1314f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public f(Context context) {
        this.f1309a = 2;
        this.f1312d = 0;
        this.f1310b = context;
    }

    public f(f fVar) {
        this.f1309a = 1;
        ClipData clipData = (ClipData) fVar.f1310b;
        clipData.getClass();
        this.f1310b = clipData;
        int i5 = fVar.f1311c;
        if (i5 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i5 <= 5) {
            this.f1311c = i5;
            int i10 = fVar.f1312d;
            if ((i10 & 1) == i10) {
                this.f1312d = i10;
                this.f1313e = (Uri) fVar.f1313e;
                this.f1314f = (Bundle) fVar.f1314f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
