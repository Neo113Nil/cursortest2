package e2;

import android.util.Log;
import e2.AbstractC6263g;
import i2.C6998a;
import org.jetbrains.annotations.NotNull;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC6257a implements InterfaceC6277u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i2.f f61797a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f61798b;

    public AbstractC6257a(@NotNull i2.f fVar, int i11) {
        this.f61797a = fVar;
        String str = "top";
        if (i11 != 0) {
            if (i11 != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = "bottom";
            }
        }
        this.f61798b = str;
    }

    public final void b(@NotNull AbstractC6263g.a aVar, float f7, float f11) {
        int b11 = aVar.b();
        String str = "top";
        if (b11 != 0) {
            if (b11 != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = "bottom";
            }
        }
        C6998a c6998a = new C6998a(new char[0]);
        c6998a.i(i2.h.i(aVar.a().toString()));
        c6998a.i(i2.h.i(str));
        c6998a.i(new i2.e(f7));
        c6998a.i(new i2.e(f11));
        this.f61797a.A(this.f61798b, c6998a);
    }
}
