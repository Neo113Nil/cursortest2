package com.vk.voip.ui.di;

import com.vk.di.component.DiScopedComponent;
import xsna.fow0;
import xsna.pwj0;

/* compiled from: VoipFirstCallCacheComponent.kt */
/* loaded from: classes11.dex */
public interface VoipFirstCallCacheComponent extends DiScopedComponent<pwj0> {
    public static final a Companion = a.a;

    /* compiled from: VoipFirstCallCacheComponent.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final VoipFirstCallCacheStubComponent STUB = new VoipFirstCallCacheStubComponent();

        public final VoipFirstCallCacheStubComponent getSTUB() {
            return STUB;
        }
    }

    fow0 x8();
}
