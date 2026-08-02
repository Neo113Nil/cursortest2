package k5;

import Ve.Sp;
import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class h3 implements Mm0.b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Context f70746a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final A1 f70747b = new A1();

    public h3(@NonNull Context context) {
        this.f70746a = context;
    }

    @Override // Mm0.b
    @NonNull
    public final m3 a(@NonNull Sp sp) {
        R2 a11 = L2.a();
        C7537l1 c7537l1 = (C7537l1) C7494a2.a();
        c7537l1.a();
        m3 m3Var = new m3(this.f70746a, sp, a11, new G0(c7537l1), this.f70747b);
        for (Object obj : m3Var.f70786e.values()) {
            if (obj instanceof InterfaceC7590z) {
                ((InterfaceC7590z) obj).o();
            }
        }
        return m3Var;
    }
}
