package k5;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: k5.y1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7588y1 extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70891e;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f70892f;

    C7588y1(@NonNull Context context) {
        super(Mm0.e.InstallationSource);
        this.f70891e = context;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        if (this.f70892f == null) {
            this.f70892f = this.f70891e.getPackageManager().getInstallerPackageName(this.f70891e.getPackageName());
            if (this.f70892f == null) {
                throw new C7571u0("pkg == null");
            }
        }
        return this.f70892f;
    }
}
