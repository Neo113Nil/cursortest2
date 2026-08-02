package defpackage;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zaaa;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b3n implements PendingResult.StatusListener {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ zaaa b;

    public b3n(zaaa zaaaVar, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        Objects.requireNonNull(zaaaVar);
        this.b = zaaaVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
