package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface W7<T> {
    T a(String str);

    void a(T t);

    void a(String str, T t);

    public static final class a implements W7<ISDemandOnlyInterstitialListener> {
        private V7 a = new V7();
        private final Map<String, V7> b = new HashMap();

        @Override // com.ironsource.W7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            V7 v7 = this.b.get(instanceId);
            return v7 != null ? v7 : this.a;
        }

        @Override // com.ironsource.W7
        public void a(ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.a.a(listener);
            Iterator<String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                V7 v7 = this.b.get(it.next());
                if (v7 != null) {
                    v7.a(listener);
                }
            }
        }

        @Override // com.ironsource.W7
        public void a(String instanceId, ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (this.b.containsKey(instanceId)) {
                V7 v7 = this.b.get(instanceId);
                if (v7 != null) {
                    v7.a(listener);
                    return;
                }
                return;
            }
            this.b.put(instanceId, new V7(listener));
        }
    }

    public static final class b implements W7<ISDemandOnlyRewardedVideoListener> {
        private Y7 a = new Y7();
        private final Map<String, Y7> b = new HashMap();

        @Override // com.ironsource.W7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Y7 y7 = this.b.get(instanceId);
            return y7 != null ? y7 : this.a;
        }

        @Override // com.ironsource.W7
        public void a(ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.a.a(listener);
            Iterator<String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                Y7 y7 = this.b.get(it.next());
                if (y7 != null) {
                    y7.a(listener);
                }
            }
        }

        @Override // com.ironsource.W7
        public void a(String instanceId, ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (this.b.containsKey(instanceId)) {
                Y7 y7 = this.b.get(instanceId);
                if (y7 != null) {
                    y7.a(listener);
                    return;
                }
                return;
            }
            this.b.put(instanceId, new Y7(listener));
        }
    }
}
