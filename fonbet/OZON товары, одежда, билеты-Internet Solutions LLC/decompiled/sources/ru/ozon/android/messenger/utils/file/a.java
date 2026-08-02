package ru.ozon.android.messenger.utils.file;

import Gc.g;
import We.E;
import We.G;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.B;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.f;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1723a f91925a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f91926b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final e f91927c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final g f91928d = new g();

    /* renamed from: ru.ozon.android.messenger.utils.file.a$a, reason: collision with other inner class name */
    public static final class C1723a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f91929a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final E f91930b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.framework.core.d f91931c;

        /* renamed from: d, reason: collision with root package name */
        private G f91932d;

        /* renamed from: e, reason: collision with root package name */
        private String f91933e;

        /* renamed from: f, reason: collision with root package name */
        private String f91934f;

        /* renamed from: g, reason: collision with root package name */
        private String f91935g;

        public C1723a(@NotNull Context context, @NotNull E okHttpClient, @NotNull ru.ozon.android.messenger.framework.core.d references) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(references, "references");
            this.f91929a = context;
            this.f91930b = okHttpClient;
            this.f91931c = references;
        }

        @NotNull
        public final a a() {
            if (this.f91932d == null) {
                throw new NullPointerException("during the construction of the [FileDownloaderApi], the [download] method params is null");
            }
            this.f91935g = Environment.DIRECTORY_DOWNLOADS;
            return new a(this, this.f91931c);
        }

        @NotNull
        public final void b(@NotNull String name, @NotNull String url, @NotNull String mimeType, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.f91934f = mimeType;
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(mimeType);
            if (extensionFromMimeType == null) {
                extensionFromMimeType = h.k0(name, ".", name);
            }
            String o02 = h.o0(name, ".", name);
            Intrinsics.checkNotNullParameter(o02, "<this>");
            if (o02.length() > 130) {
                o02 = o02.substring(0, 130);
                Intrinsics.checkNotNullExpressionValue(o02, "substring(...)");
            }
            this.f91933e = o02 + "_" + str + "." + extensionFromMimeType;
            G.a aVar = new G.a();
            aVar.k(url);
            this.f91932d = aVar.b();
        }

        @NotNull
        public final Context c() {
            return this.f91929a;
        }

        public final String d() {
            return this.f91935g;
        }

        public final String e() {
            return this.f91934f;
        }

        public final String f() {
            return this.f91933e;
        }

        @NotNull
        public final E g() {
            return this.f91930b;
        }

        public final G h() {
            return this.f91932d;
        }
    }

    public a(C1723a c1723a, ru.ozon.android.messenger.framework.core.d dVar) {
        this.f91925a = c1723a;
        this.f91926b = f.b(new c(dVar));
        this.f91927c = new e(c1723a.d(), c1723a.f(), c1723a.c(), c1723a.e());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final B c(a aVar) {
        return (B) aVar.f91926b.getValue();
    }

    private final void e() {
        e eVar = this.f91927c;
        if (eVar.c()) {
            eVar.d();
            return;
        }
        C1723a c1723a = this.f91925a;
        G h11 = c1723a.h();
        if (h11 != null) {
            c1723a.g().a(h11).E0(new b(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(@NotNull ComponentCallbacksC5392m fragment, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(id2, "fileId");
        if (Build.VERSION.SDK_INT >= 30) {
            e();
            return;
        }
        this.f91928d.getClass();
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (androidx.core.content.a.checkSelfPermission(fragment.requireActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            e();
            return;
        }
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(id2, "id");
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            arguments.putString("M_FILE_ID_KEY", id2);
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter("REQUEST_PERMISSION", "tag");
        ((ru.ozon.android.messenger.framework.presentation.common.launcher.a) fragment).g("REQUEST_PERMISSION").a("android.permission.WRITE_EXTERNAL_STORAGE");
    }
}
