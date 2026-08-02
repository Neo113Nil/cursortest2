package defpackage;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.internal.zzao;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class guo implements ListenerHolder.Notifier {
    public final /* synthetic */ zzao a;

    public guo(zzao zzaoVar) {
        this.a = zzaoVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((CapabilityApi.CapabilityListener) obj).b(this.a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void b() {
    }
}
