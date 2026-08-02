package ga;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.AbstractC3414b;
import com.google.android.gms.wallet.PaymentData;

/* renamed from: ga.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4369c extends AbstractC4368b {
    @Override // ga.AbstractC4368b
    public C4367a e(int i10, Intent intent) {
        if (i10 != 1) {
            return super.e(i10, intent);
        }
        Status a10 = AbstractC3414b.a(intent);
        if (a10 == null) {
            a10 = Status.f32277h;
        }
        return new C4367a(a10);
    }

    @Override // ga.AbstractC4368b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public PaymentData f(Intent intent) {
        return PaymentData.g(intent);
    }

    @Override // k.AbstractC5140a
    public final /* bridge */ /* synthetic */ Object parseResult(int i10, Intent intent) {
        return e(i10, intent);
    }
}
