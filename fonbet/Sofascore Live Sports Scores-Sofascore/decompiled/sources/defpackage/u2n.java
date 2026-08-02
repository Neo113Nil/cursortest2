package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.zaj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u2n extends zaj {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ LifecycleFragment b;

    public u2n(Intent intent, LifecycleFragment lifecycleFragment) {
        this.a = intent;
        this.b = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zaj
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
