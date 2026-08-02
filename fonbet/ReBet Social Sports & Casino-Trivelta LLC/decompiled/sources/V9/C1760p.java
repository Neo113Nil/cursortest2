package V9;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.location.zzb;

/* renamed from: V9.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1760p {

    /* renamed from: a, reason: collision with root package name */
    public long f12846a = Long.MIN_VALUE;

    public final C1760p a(long j10) {
        AbstractC3191o.b(j10 >= 0, "intervalMillis can't be negative.");
        this.f12846a = j10;
        return this;
    }

    public final zzb b() {
        AbstractC3191o.q(this.f12846a != Long.MIN_VALUE, "Must set intervalMillis.");
        return new zzb(this.f12846a, true, null, null, null, false, null, 0L, null);
    }
}
