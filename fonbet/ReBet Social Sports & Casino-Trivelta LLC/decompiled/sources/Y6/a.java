package Y6;

import W6.c;
import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: b, reason: collision with root package name */
    public final b f14079b;

    /* renamed from: c, reason: collision with root package name */
    public long f14080c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f14081d = -1;

    public a(b bVar) {
        this.f14079b = bVar;
    }

    @Override // W6.c, W6.d
    public void onFinalImageSet(String id2, Object obj, Animatable animatable) {
        Intrinsics.checkNotNullParameter(id2, "id");
        long currentTimeMillis = System.currentTimeMillis();
        this.f14081d = currentTimeMillis;
        b bVar = this.f14079b;
        if (bVar != null) {
            bVar.a(currentTimeMillis - this.f14080c);
        }
    }

    @Override // W6.c, W6.d
    public void onSubmit(String id2, Object obj) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f14080c = System.currentTimeMillis();
    }
}
