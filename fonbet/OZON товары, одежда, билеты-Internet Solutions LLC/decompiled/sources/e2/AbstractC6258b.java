package e2;

import android.util.Log;
import e2.AbstractC6263g;
import i2.C6998a;
import org.jetbrains.annotations.NotNull;

/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC6258b implements InterfaceC6255C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i2.f f61799a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f61800b;

    public AbstractC6258b(@NotNull i2.f fVar, int i11) {
        this.f61799a = fVar;
        String str = "start";
        if (i11 != -2) {
            if (i11 == -1) {
                str = "end";
            } else if (i11 == 0) {
                str = "left";
            } else if (i11 != 1) {
                Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
            } else {
                str = "right";
            }
        }
        this.f61800b = str;
    }

    public final void b(@NotNull AbstractC6263g.b bVar, float f7, float f11) {
        int b11 = bVar.b();
        String str = "start";
        if (b11 != -2) {
            if (b11 == -1) {
                str = "end";
            } else if (b11 == 0) {
                str = "left";
            } else if (b11 != 1) {
                Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
            } else {
                str = "right";
            }
        }
        C6998a c6998a = new C6998a(new char[0]);
        c6998a.i(i2.h.i(bVar.a().toString()));
        c6998a.i(i2.h.i(str));
        c6998a.i(new i2.e(f7));
        c6998a.i(new i2.e(f11));
        this.f61799a.A(this.f61800b, c6998a);
    }
}
