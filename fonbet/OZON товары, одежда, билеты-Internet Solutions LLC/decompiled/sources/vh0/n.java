package vh0;

import Zg0.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import cd.C5802a;
import dh0.C6200a;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f102968a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final o f102969b;

    public n(@NotNull Context context, @NotNull Zg0.j config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f102968a = context;
        this.f102969b = new o(context, config);
    }

    private final Bitmap a(String str, String str2) {
        try {
            URLConnection openConnection = new URL(str).openConnection();
            openConnection.setConnectTimeout(2000);
            openConnection.setReadTimeout(7000);
            InputStream inputStream = openConnection.getInputStream();
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                Vd0.b.a(inputStream, null);
                o oVar = this.f102969b;
                Intrinsics.f(decodeStream);
                oVar.b(decodeStream, str2);
                return decodeStream;
            } finally {
            }
        } catch (Exception e11) {
            Zg0.d b11 = C6200a.b();
            if (b11 instanceof d.b) {
                C6200a.c().a(C6200a.a("Failed to get bitmap from url because of " + e11), e11);
                ((d.b) b11).getClass();
            }
            return null;
        }
    }

    public final IconCompat b(String str) {
        if (str != null) {
            String str2 = !kotlin.text.h.K(str) ? str : null;
            if (str2 != null) {
                String path = new URL(str2).getPath();
                Intrinsics.f(path);
                Path path2 = Paths.get(path, new String[0]);
                Intrinsics.checkNotNullExpressionValue(path2, "get(...)");
                String a11 = C5802a.a(path2);
                if (kotlin.text.h.K(a11)) {
                    a11 = null;
                }
                if (a11 != null) {
                    try {
                        Bitmap a12 = this.f102969b.a(a11);
                        if (a12 == null) {
                            a12 = a(str, a11);
                        }
                        if (a12 != null) {
                            return IconCompat.c(Icon.createWithBitmap(a12), this.f102968a);
                        }
                    } catch (Exception e11) {
                        Zg0.d b11 = C6200a.b();
                        if (b11 instanceof d.b) {
                            C6200a.c().a(C6200a.a("Failed to create icon because of " + e11), e11);
                            ((d.b) b11).getClass();
                        }
                    }
                }
            }
        }
        return null;
    }
}
