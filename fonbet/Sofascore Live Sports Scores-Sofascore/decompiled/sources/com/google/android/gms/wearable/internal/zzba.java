package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.c;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzba implements ChannelApi.ChannelListener {
    public final c a;

    public zzba(c cVar) {
        this.a = cVar;
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void a(Channel channel, int i, int i2) {
        if (channel == null) {
            yhk.s("channel must not be null");
        } else {
            this.a.a.getClass();
        }
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void c(Channel channel, int i, int i2) {
        if (channel == null) {
            yhk.s("channel must not be null");
        } else {
            this.a.a.getClass();
        }
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void d(Channel channel) {
        if (channel == null) {
            yhk.s("channel must not be null");
        } else {
            this.a.a.getClass();
        }
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void e(Channel channel, int i, int i2) {
        if (channel == null) {
            yhk.s("channel must not be null");
        } else {
            this.a.a.getClass();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzba.class == obj.getClass() && this.a == ((zzba) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
