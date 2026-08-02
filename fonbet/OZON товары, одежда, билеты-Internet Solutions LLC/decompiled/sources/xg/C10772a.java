package xg;

import Ag.C2428a;
import P4.f;
import android.content.Context;
import android.content.SharedPreferences;
import bd.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: xg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10772a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f105559a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile String f105560b;

    @NotNull
    public static final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = f105560b;
        if (str != null) {
            return str;
        }
        synchronized (f105559a) {
            String str2 = f105560b;
            if (str2 != null) {
                return str2;
            }
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            String b11 = b(applicationContext);
            f105560b = b11;
            return b11;
        }
    }

    private static final String b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("tracer", 0);
        String str = null;
        String string = sharedPreferences.getString("device_id", null);
        String str2 = string == null ? "00000000-0000-0000-0000-000000000000" : string;
        try {
            File filesDir = context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(filesDir, "context.filesDir");
            File m11 = h.m(filesDir, "tracer");
            C2428a.a(m11);
            File m12 = h.m(m11, "device_id.txt");
            if (m12.exists()) {
                try {
                    String obj = kotlin.text.h.z0(h.l(m12)).toString();
                    if (obj.length() > 0) {
                        str = obj;
                    }
                } catch (IOException unused) {
                }
            }
            if (str != null) {
                return str;
            }
            String b11 = string == null ? f.b("randomUUID().toString()") : string;
            FileOutputStream fileOutputStream = new FileOutputStream(m12);
            try {
                byte[] bytes = b11.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.getFD().sync();
                Unit unit = Unit.f71690a;
                fileOutputStream.close();
                if (string != null) {
                    sharedPreferences.edit().remove("device_id").apply();
                }
                return b11;
            } finally {
            }
        } catch (IOException unused2) {
            return str2;
        }
    }
}
