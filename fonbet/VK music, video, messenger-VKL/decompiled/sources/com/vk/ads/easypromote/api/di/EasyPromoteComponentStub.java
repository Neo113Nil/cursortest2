package com.vk.ads.easypromote.api.di;

import android.content.Context;
import com.vk.ads.easypromote.api.domain.model.EasyPromoteSettings;
import xsna.hwo;
import xsna.kwo;

/* compiled from: EasyPromoteComponentStub.kt */
/* loaded from: classes14.dex */
public final class EasyPromoteComponentStub implements EasyPromoteComponent {
    @Override // com.vk.ads.easypromote.api.di.EasyPromoteComponent
    public final kwo X() {
        return new b();
    }

    @Override // com.vk.ads.easypromote.api.di.EasyPromoteComponent
    public final hwo a() {
        return new a();
    }

    /* compiled from: EasyPromoteComponentStub.kt */
    public static final class a implements hwo {
        @Override // xsna.hwo
        public final void a(Context context) {
        }
    }

    /* compiled from: EasyPromoteComponentStub.kt */
    public static final class b implements kwo {
        @Override // xsna.kwo
        public final EasyPromoteSettings b() {
            return new EasyPromoteSettings(0, 0, null, false);
        }

        @Override // xsna.kwo
        public final void a(EasyPromoteSettings easyPromoteSettings) {
        }
    }
}
