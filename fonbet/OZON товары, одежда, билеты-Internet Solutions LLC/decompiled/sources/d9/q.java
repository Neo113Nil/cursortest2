package d9;

import android.content.Context;
import c9.InterfaceC5771c;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzun;
import com.google.mlkit.common.sdkinternal.AbstractC5949e;

/* loaded from: classes.dex */
public final class q extends AbstractC5949e {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.h f61364a;

    public q(com.google.mlkit.common.sdkinternal.h hVar) {
        this.f61364a = hVar;
    }

    @Override // com.google.mlkit.common.sdkinternal.AbstractC5949e
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        InterfaceC5771c interfaceC5771c = (InterfaceC5771c) obj;
        zzuc zzb = zzun.zzb(interfaceC5771c.a());
        Context b11 = this.f61364a.b();
        return new C6105c(zzb, (GoogleApiAvailabilityLight.getInstance().getApkVersion(b11) >= 204700000 || interfaceC5771c.c()) ? new C6109g(b11, interfaceC5771c, zzb) : new C6110h(b11), interfaceC5771c);
    }
}
