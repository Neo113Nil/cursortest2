package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.B1;
import defpackage.ih2;
import defpackage.is8;
import defpackage.vvf;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrx extends zzsy {
    public final Context a;
    public String d;
    public final Object c = new Object();
    public final zzsd b = new zzsd();

    public zzrx(zzrw zzrwVar) {
        this.a = zzrwVar.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final InputStream a(Uri uri) {
        if (h(uri)) {
            throw new zzsg("Android backend cannot perform remote operations without a remote backend");
        }
        File a = zzsc.a(g(uri));
        return new zzsl(new FileInputStream(a), a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010f  */
    @Override // com.google.android.gms.internal.measurement.zzsx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final File b(Uri uri) {
        File externalFilesDir;
        Account account;
        String str;
        if (h(uri)) {
            is8.e("operation is not permitted in other authorities.");
            return null;
        }
        Context context = this.a;
        if (!uri.getScheme().equals("android")) {
            throw new zzsi("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new zzsi("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str2 = (String) arrayList.get(0);
        switch (str2.hashCode()) {
            case -1820761141:
                if (str2.equals(B1.e)) {
                    externalFilesDir = context.getExternalFilesDir(null);
                    File file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!zzky.b(context)) {
                        synchronized (this.c) {
                            try {
                                str = this.d;
                                if (str == null) {
                                    str = zzry.a(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.d = str;
                                }
                            } finally {
                            }
                        }
                        if (!file.getAbsolutePath().startsWith(str)) {
                            throw new zzsg("Cannot access credential-protected data from direct boot");
                        }
                    }
                    return file;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str2.equals("cache")) {
                    externalFilesDir = context.getCacheDir();
                    File file2 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!zzky.b(context)) {
                    }
                    return file2;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str2.equals("files")) {
                    externalFilesDir = zzry.a(context);
                    File file22 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!zzky.b(context)) {
                    }
                    return file22;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str2.equals("managed")) {
                    File file3 = new File(zzry.a(context), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            String str3 = (String) arrayList.get(2);
                            Account account2 = zzrv.a;
                            if ("shared".equals(str3)) {
                                account = zzrv.a;
                            } else {
                                int indexOf = str3.indexOf(58);
                                zzsq.a(indexOf >= 0, "Malformed account", new Object[0]);
                                account = new Account(str3.substring(indexOf + 1), str3.substring(0, indexOf));
                            }
                            if (!zzrv.a.equals(account)) {
                                throw new zzsi("AccountManager cannot be null");
                            }
                        } catch (IllegalArgumentException e) {
                            throw new zzsi(e);
                        }
                    }
                    externalFilesDir = file3;
                    File file222 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!zzky.b(context)) {
                    }
                    return file222;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str2.equals("directboot-cache")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                    File file2222 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!zzky.b(context)) {
                    }
                    return file2222;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str2.equals("directboot-files")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                    File file22222 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!zzky.b(context)) {
                    }
                    return file22222;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzsy
    public final zzsd f() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.zzsy
    public final Uri g(Uri uri) {
        if (h(uri)) {
            throw new zzsi("Operation across authorities is not allowed.");
        }
        File b = b(uri);
        zzsb zzsbVar = new zzsb(0);
        String absolutePath = b.getAbsolutePath();
        Uri.Builder builder = zzsbVar.a;
        builder.path(absolutePath);
        vvf g = zzsbVar.b.g();
        Pattern pattern = zzsp.a;
        return builder.encodedFragment(g.isEmpty() ? null : "transform=".concat(new ih2("+").e(g))).build();
    }

    public final boolean h(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final String zzc() {
        return "android";
    }
}
