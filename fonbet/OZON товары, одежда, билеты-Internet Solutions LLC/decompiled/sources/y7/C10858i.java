package y7;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* renamed from: y7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10858i implements InterfaceC10852c {

    /* renamed from: a, reason: collision with root package name */
    private final float f106137a;

    public C10858i(float f7) {
        this.f106137a = f7;
    }

    @Override // y7.InterfaceC10852c
    public final float a(@NonNull RectF rectF) {
        return rectF.height() * this.f106137a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10858i) && this.f106137a == ((C10858i) obj).f106137a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f106137a)});
    }
}
