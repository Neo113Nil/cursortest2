package y7;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* renamed from: y7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10850a implements InterfaceC10852c {

    /* renamed from: a, reason: collision with root package name */
    private final float f106092a;

    public C10850a(float f7) {
        this.f106092a = f7;
    }

    @Override // y7.InterfaceC10852c
    public final float a(@NonNull RectF rectF) {
        return this.f106092a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10850a) && this.f106092a == ((C10850a) obj).f106092a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f106092a)});
    }
}
