package y7;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* renamed from: y7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10851b implements InterfaceC10852c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10852c f106093a;

    /* renamed from: b, reason: collision with root package name */
    private final float f106094b;

    public C10851b(float f7, @NonNull InterfaceC10852c interfaceC10852c) {
        while (interfaceC10852c instanceof C10851b) {
            interfaceC10852c = ((C10851b) interfaceC10852c).f106093a;
            f7 += ((C10851b) interfaceC10852c).f106094b;
        }
        this.f106093a = interfaceC10852c;
        this.f106094b = f7;
    }

    @Override // y7.InterfaceC10852c
    public final float a(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f106093a.a(rectF) + this.f106094b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10851b)) {
            return false;
        }
        C10851b c10851b = (C10851b) obj;
        return this.f106093a.equals(c10851b.f106093a) && this.f106094b == c10851b.f106094b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f106093a, Float.valueOf(this.f106094b)});
    }
}
