package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public final class ListenerHolder<L> {
    public final HandlerExecutor a;
    public volatile ListenerKey b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public static final class ListenerKey<L> {
        public final Object a;
        public final String b;

        public ListenerKey(Object obj, String str) {
            this.a = obj;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.a == listenerKey.a && this.b.equals(listenerKey.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface Notifier<L> {
        void a(Object obj);

        void b();
    }

    public ListenerHolder(Looper looper, Object obj, String str) {
        this.a = new HandlerExecutor(looper);
        Preconditions.j(obj, "Listener must not be null");
        Preconditions.f(str);
        this.b = new ListenerKey(obj, str);
    }
}
