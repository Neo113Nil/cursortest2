package K7;

import android.graphics.Bitmap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v implements InterfaceC1369j {

    /* renamed from: a, reason: collision with root package name */
    public final Set f6348a;

    public v() {
        Set b10 = D6.m.b();
        Intrinsics.checkNotNullExpressionValue(b10, "newIdentityHashSet(...)");
        this.f6348a = b10;
    }

    @Override // G6.f
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i10) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i10 / 2.0d), Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        this.f6348a.add(createBitmap);
        return createBitmap;
    }

    @Override // G6.f, H6.h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6348a.remove(value);
        value.recycle();
    }
}
