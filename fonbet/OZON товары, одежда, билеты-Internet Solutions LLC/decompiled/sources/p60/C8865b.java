package p60;

import H30.p;
import K1.G;
import U30.d;
import V.e;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.util.Base64OutputStream;
import g30.InterfaceC6618a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.open.common.models.OpenBridgeResultData;
import ru.ozon.fintech.settings.models.FeatureValue;
import xe.C10720e0;
import xe.C10727i;

/* renamed from: p60.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8865b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f80285a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f80286b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final U30.a f80287c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Q90.c f80288d;

    /* renamed from: p60.b$a */
    private static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f80289a;

        public a(Uri uri) {
            String message = "Ошибка при сжатии картинки с uri: " + uri;
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(message, "message");
            this.f80289a = message;
        }

        @Override // java.lang.Throwable
        @NotNull
        public final String getMessage() {
            return this.f80289a;
        }
    }

    /* renamed from: p60.b$b, reason: collision with other inner class name */
    private static final class C1347b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f80290a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f80291b;

        /* renamed from: c, reason: collision with root package name */
        private final long f80292c;

        public C1347b(@NotNull String name, @NotNull String mimeType, long j11) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.f80290a = name;
            this.f80291b = mimeType;
            this.f80292c = j11;
        }

        @NotNull
        public final String a() {
            return this.f80291b;
        }

        @NotNull
        public final String b() {
            return this.f80290a;
        }

        public final long c() {
            return this.f80292c;
        }
    }

    /* renamed from: p60.b$c */
    private static final class c extends Exception {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f80293a;

        public c(long j11) {
            String message = e.a("Размер файла (", p.a(j11), ") превысил максимальный (", p.a(104857600L), ")");
            Intrinsics.checkNotNullParameter(message, "message");
            this.f80293a = message;
        }

        @Override // java.lang.Throwable
        @NotNull
        public final String getMessage() {
            return this.f80293a;
        }
    }

    /* renamed from: p60.b$d */
    private static final class d extends Exception {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f80294a;

        public d(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f80294a = message;
        }

        @Override // java.lang.Throwable
        @NotNull
        public final String getMessage() {
            return this.f80294a;
        }
    }

    public C8865b(@NotNull Context context, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull U30.a fintechFileManager, @NotNull Q90.c featureToggles) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechFileManager, "fintechFileManager");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        this.f80285a = context;
        this.f80286b = fintechAnalyticInteractor;
        this.f80287c = fintechFileManager;
        this.f80288d = featureToggles;
    }

    public static final OpenBridgeResultData d(C8865b c8865b, Uri uri, FeatureValue featureValue) {
        Uri uri2;
        C1347b c1347b;
        Context context = c8865b.f80285a;
        ContentResolver contentResolver = context.getContentResolver();
        String scheme = uri.getScheme();
        if (scheme != null) {
            int hashCode = scheme.hashCode();
            if (hashCode == 3143036) {
                uri2 = uri;
                if (scheme.equals("file")) {
                    String path = uri2.getPath();
                    if (path == null) {
                        throw new IllegalArgumentException(G.b(uri2, "Неправильный uri: "));
                    }
                    File file = new File(path);
                    if (!file.exists()) {
                        throw new FileNotFoundException(Nk.a.b("Файл не найден, путь: ", file.getAbsolutePath()));
                    }
                    String f7 = c8865b.f(uri);
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    c1347b = new C1347b(name, f7, file.length());
                }
                throw new IllegalArgumentException(G.b(uri2, "Неизвестная URI схема uri: "));
            }
            if (hashCode == 951530617 && scheme.equals("content")) {
                Cursor query = contentResolver.query(uri, null, null, null, null);
                uri2 = uri;
                if (query == null) {
                    throw new FileNotFoundException(G.b(uri2, "Не удалось запросить URI: "));
                }
                try {
                    if (!query.moveToFirst()) {
                        throw new FileNotFoundException("Не удалось прочитать метаданные файла с URI: " + uri2);
                    }
                    String string = query.getString(query.getColumnIndexOrThrow("_display_name"));
                    long j11 = query.getLong(query.getColumnIndexOrThrow("_size"));
                    String type = contentResolver.getType(uri2);
                    if (type == null) {
                        type = c8865b.f(uri);
                    }
                    Intrinsics.f(string);
                    c1347b = new C1347b(h.o0(string, ".", string), type, j11);
                    query.close();
                } finally {
                }
            }
            long c11 = c1347b.c();
            if (c11 > 104857600) {
                throw new c(c11);
            }
            boolean e02 = h.e0(c1347b.a(), "image/", false);
            U30.a aVar = c8865b.f80287c;
            File h11 = aVar.h("base64");
            UUID randomUUID = UUID.randomUUID();
            d.a aVar2 = U30.d.Companion;
            String b11 = U30.d.TEXT.b();
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(b11, "<this>");
            String str = randomUUID + Nk.a.b(".", b11);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(h11, str));
            try {
                Base64OutputStream base64OutputStream = new Base64OutputStream(fileOutputStream, 2);
                try {
                    if (e02) {
                        ContentResolver contentResolver2 = context.getContentResolver();
                        Intrinsics.checkNotNullExpressionValue(contentResolver2, "getContentResolver(...)");
                        e(uri2, contentResolver2, c1347b.a(), featureValue, base64OutputStream);
                    } else {
                        ContentResolver contentResolver3 = context.getContentResolver();
                        Intrinsics.checkNotNullExpressionValue(contentResolver3, "getContentResolver(...)");
                        InputStream openInputStream = contentResolver3.openInputStream(uri2);
                        if (openInputStream != null) {
                            try {
                                aVar.q(openInputStream, base64OutputStream);
                                openInputStream.close();
                            } finally {
                            }
                        }
                    }
                    Unit unit = Unit.f71690a;
                    base64OutputStream.close();
                    fileOutputStream.close();
                    return new OpenBridgeResultData(str, c1347b.b(), c1347b.a(), null, 8, null);
                } finally {
                }
            } finally {
            }
        }
        uri2 = uri;
        throw new IllegalArgumentException(G.b(uri2, "Неизвестная URI схема uri: "));
    }

    private static void e(Uri uri, ContentResolver contentResolver, String str, FeatureValue featureValue, Base64OutputStream base64OutputStream) {
        InputStream openInputStream = contentResolver.openInputStream(uri);
        if (openInputStream == null) {
            throw new FileNotFoundException(G.b(uri, "Не найден файл с uri: "));
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
            if (decodeStream == null) {
                throw new IllegalArgumentException("Ошибка при декодинге в bitmap картинки: " + uri);
            }
            Bitmap.CompressFormat compressFormat = h.t(str, U30.d.PNG.b(), true) ? Bitmap.CompressFormat.PNG : h.t(str, U30.d.WEBP.b(), true) ? Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
            Integer num = null;
            try {
                String stringData = featureValue.getStringData();
                if (stringData != null) {
                    num = Integer.valueOf((int) (Float.parseFloat(stringData) * 100));
                }
            } catch (Exception unused) {
            }
            if (!decodeStream.compress(compressFormat, num != null ? num.intValue() : 80, base64OutputStream)) {
                throw new a(uri);
            }
            Unit unit = Unit.f71690a;
            openInputStream.close();
        } finally {
        }
    }

    private final String f(Uri uri) {
        String str;
        String scheme = uri.getScheme();
        String str2 = null;
        if (scheme != null) {
            str = scheme.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        if (Intrinsics.d(str, "content")) {
            str2 = this.f80285a.getContentResolver().getType(uri);
        } else if (Intrinsics.d(str, "file")) {
            d.a aVar = U30.d.Companion;
            String value = uri.toString();
            Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
            aVar.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            U30.d d11 = d.a.d(value);
            if (d11 != null) {
                str2 = d11.d();
            }
        }
        if (str2 != null) {
            return str2;
        }
        throw new d(G.b(uri, "Неизвестный MimeType uri: "));
    }

    public final Object g(@NotNull List list, @NotNull j jVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new C8866c(this, list, null), jVar);
    }
}
