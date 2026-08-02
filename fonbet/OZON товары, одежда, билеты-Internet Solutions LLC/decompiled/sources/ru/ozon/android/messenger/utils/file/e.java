package ru.ozon.android.messenger.utils.file;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.widget.Toast;
import androidx.appcompat.app.g;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.f;
import ru.ozon.app.android.messenger.R$string;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f91940a;

    /* renamed from: b, reason: collision with root package name */
    private final String f91941b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f91942c;

    /* renamed from: d, reason: collision with root package name */
    private final String f91943d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f91944e;

    static final class a extends AbstractC7737t implements Function0<File> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            e eVar = e.this;
            return new File(Environment.getExternalStoragePublicDirectory(eVar.f91940a) + "/" + eVar.f91941b);
        }
    }

    public e(String str, String str2, @NotNull Context context, String str3) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f91940a = str;
        this.f91941b = str2;
        this.f91942c = context;
        this.f91943d = str3;
        this.f91944e = f.b(new a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final boolean c() {
        return ((File) this.f91944e.getValue()).exists();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final void d() {
        Uri uri;
        Resources resources;
        File file = (File) this.f91944e.getValue();
        Context context = this.f91942c;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        g a11 = ru.ozon.android.messenger.utils.c.a(context);
        String str = null;
        if (a11 != null) {
            uri = FileProvider.d(a11, context.getPackageName() + ".fileprovider", file);
        } else {
            uri = null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, Intent.normalizeMimeType(this.f91943d));
        intent.setFlags(268435457);
        try {
            g a12 = ru.ozon.android.messenger.utils.c.a(context);
            if (a12 != null) {
                a12.startActivity(intent);
                Unit unit = Unit.f71690a;
            }
        } catch (ActivityNotFoundException unused) {
            g a13 = ru.ozon.android.messenger.utils.c.a(context);
            g a14 = ru.ozon.android.messenger.utils.c.a(context);
            if (a14 != null && (resources = a14.getResources()) != null) {
                str = resources.getString(R$string.messenger_error_not_found_app_to_open_file, this.f91941b);
            }
            Toast.makeText(a13, str, 0).show();
            Unit unit2 = Unit.f71690a;
        }
    }
}
