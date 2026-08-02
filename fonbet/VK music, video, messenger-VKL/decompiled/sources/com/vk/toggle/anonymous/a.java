package com.vk.toggle.anonymous;

import android.text.TextUtils;
import com.vk.core.apps.BuildInfo;
import com.vk.toggle.b;
import com.vk.toggle.internal.ToggleManager;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.bpn0;
import xsna.eu2;
import xsna.fu2;
import xsna.gzs;
import xsna.i0q0;

/* compiled from: AnonymousFeatureManager.kt */
/* loaded from: classes11.dex */
public final class a extends ToggleManager {
    public static final bpn0 C = new bpn0(new eu2(0));
    public final boolean A;
    public final gzs<Boolean> B;

    public a(boolean z, gzs<Boolean> gzsVar) {
        super("anonymous");
        this.A = z;
        this.B = gzsVar;
    }

    @Override // com.vk.toggle.internal.ToggleManager, xsna.r0p0
    public final boolean a(b.a aVar) {
        if (this.B.invoke().booleanValue() && !BuildInfo.m() && !((List) C.getValue()).contains(aVar)) {
            i0q0.f(new fu2(aVar, 0));
        }
        return super.a(aVar);
    }

    @Override // com.vk.toggle.internal.ToggleManager
    public final synchronized void l(ToggleManager.b bVar) {
        try {
            if (TextUtils.isEmpty(bVar.d)) {
                super.l(ToggleManager.b.a(bVar, 503));
            } else {
                super.l(ToggleManager.b.a(bVar, ApiInvocationException.ErrorCodes.IDS_BLOCKED));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void y(boolean z) {
        if (c()) {
            if (this.A || !z) {
                x();
            }
        }
    }
}
