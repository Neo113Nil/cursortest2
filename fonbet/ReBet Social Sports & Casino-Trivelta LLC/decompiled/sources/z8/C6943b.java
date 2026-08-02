package z8;

import android.content.Context;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import com.facebook.soloader.v;
import java.io.File;

/* renamed from: z8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6943b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f68629a;

    /* renamed from: b, reason: collision with root package name */
    public final C6942a f68630b;

    public C6943b(Context context, C6942a c6942a) {
        this.f68629a = context;
        this.f68630b = c6942a;
    }

    @Override // z8.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        String str = this.f68629a.getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            p.g("soloader.recovery.CheckBaseApkExists", "Base apk exists: " + str);
            return false;
        }
        StringBuilder sb2 = new StringBuilder("Base apk does not exist: ");
        sb2.append(str);
        sb2.append(". ");
        this.f68630b.b(sb2);
        throw new v(sb2.toString(), unsatisfiedLinkError);
    }
}
