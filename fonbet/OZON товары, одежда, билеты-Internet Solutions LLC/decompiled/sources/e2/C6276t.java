package e2;

import android.util.Log;
import i2.C7000c;
import org.jetbrains.annotations.NotNull;

/* renamed from: e2.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6276t {

    /* renamed from: a, reason: collision with root package name */
    private Z1.h f61855a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f61856b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f61857c;

    public C6276t(String str, String str2) {
        this.f61856b = str;
        this.f61857c = str2;
    }

    @NotNull
    public final C7000c a() {
        Z1.h hVar = this.f61855a;
        if (hVar != null) {
            return new i2.e(hVar.d());
        }
        String str = this.f61856b;
        if (str != null) {
            return i2.h.i(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + this.f61857c + ". Using WrapContent.");
        return i2.h.i("wrap");
    }

    public final boolean b() {
        return this.f61855a == null && this.f61856b == null;
    }

    public final void c(float f7) {
        this.f61855a = Z1.h.a(f7);
        this.f61856b = null;
    }
}
