package ru.ozon.android.messenger.utils.file;

import G.g;
import Hj.C3143a;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import bd.C5652b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.DecimalFormat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.R$array;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f91939a;

    public d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f91939a = context;
    }

    private static String f(String str) {
        String q02 = h.q0(UserVerificationMethods.USER_VERIFY_PATTERN, h.G0(h.z0(new Regex("\\.{2,}").replace(C3143a.g("[<>:\"|?*]", C3143a.g("[\"\\\\]", C3143a.g("[\\x00-\\x1F\\x7F]", C3143a.g("[/\\\\]", str, "_"), "_"), "_"), "_"), "_")).toString(), '.', '_'));
        return (h.K(q02) || q02.equals(".") || q02.equals("..")) ? "file" : q02;
    }

    public final File a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String b11 = b(uri);
        if (b11 != null) {
            Context context = this.f91939a;
            File file = new File(context.getCacheDir(), b11);
            try {
                if (file.exists()) {
                    return file;
                }
                file.createNewFile();
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            C5652b.a(openInputStream, fileOutputStream);
                            fileOutputStream.close();
                            openInputStream.close();
                            return file;
                        } finally {
                        }
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                Lm0.a.f17149a.e(th2);
                return null;
            }
        }
        return null;
    }

    public final String b(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Cursor query = this.f91939a.getContentResolver().query(uri, null, null, null, null);
        String str = null;
        if (query == null) {
            return null;
        }
        try {
            query.moveToFirst();
            int columnIndex = query.getColumnIndex("_display_name");
            Integer valueOf = columnIndex != -1 ? Integer.valueOf(columnIndex) : null;
            if (valueOf != null) {
                String string = query.getString(valueOf.intValue());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                str = f(string);
            }
            query.close();
            return str;
        } finally {
        }
    }

    @NotNull
    public final String c(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        int i11 = R$array.messenger_file_extensions;
        Context context = this.f91939a;
        Intrinsics.checkNotNullParameter(context, "<this>");
        String[] stringArray = ru.ozon.android.messenger.framework.data.a.c(context).getResources().getStringArray(i11);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        long length = file.length();
        if (length <= 0) {
            return Nk.a.b("0 ", stringArray[1]);
        }
        double d11 = length;
        int log10 = (int) (Math.log10(d11) / Math.log10(1024.0d));
        return g.c(new DecimalFormat("#,##0.#").format(d11 / Math.pow(1024.0d, log10)), " ", stringArray[log10]);
    }

    public final boolean d(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Cursor query = this.f91939a.getContentResolver().query(uri, null, null, null, null);
        if (query == null) {
            return false;
        }
        try {
            query.moveToFirst();
            int columnIndex = query.getColumnIndex("_size");
            Integer valueOf = columnIndex != -1 ? Integer.valueOf(columnIndex) : null;
            String string = valueOf != null ? query.getString(valueOf.intValue()) : null;
            query.close();
            return string != null && Long.parseLong(string) == 0;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Vd0.b.a(query, th2);
                throw th3;
            }
        }
    }

    public final boolean e(@NotNull Uri uri, long j11) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Cursor query = this.f91939a.getContentResolver().query(uri, null, null, null, null);
        if (query == null) {
            return false;
        }
        try {
            query.moveToFirst();
            int columnIndex = query.getColumnIndex("_size");
            Integer valueOf = columnIndex != -1 ? Integer.valueOf(columnIndex) : null;
            String string = valueOf != null ? query.getString(valueOf.intValue()) : null;
            query.close();
            return string != null && Long.parseLong(string) < j11;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Vd0.b.a(query, th2);
                throw th3;
            }
        }
    }
}
