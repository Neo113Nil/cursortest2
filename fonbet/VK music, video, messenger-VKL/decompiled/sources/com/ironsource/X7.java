package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes13.dex */
public interface X7<T> {
    T a(String str);

    void a(T t);

    void a(String str, T t);

    public static final class a implements X7<ISDemandOnlyInterstitialListener> {
        private W7 a = new W7();
        private final Map<String, W7> b = new HashMap();

        @Override // com.ironsource.X7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(String str) {
            W7 w7 = this.b.get(str);
            return w7 != null ? w7 : this.a;
        }

        @Override // com.ironsource.X7
        public void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a.a(iSDemandOnlyInterstitialListener);
            Iterator<String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                W7 w7 = this.b.get(it.next());
                if (w7 != null) {
                    w7.a(iSDemandOnlyInterstitialListener);
                }
            }
        }

        @Override // com.ironsource.X7
        public void a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            if (this.b.containsKey(str)) {
                W7 w7 = this.b.get(str);
                if (w7 != null) {
                    w7.a(iSDemandOnlyInterstitialListener);
                    return;
                }
                return;
            }
            this.b.put(str, new W7(iSDemandOnlyInterstitialListener));
        }
    }

    public static final class b implements X7<ISDemandOnlyRewardedVideoListener> {
        private Z7 a = new Z7();
        private final Map<String, Z7> b = new HashMap();

        @Override // com.ironsource.X7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(String str) {
            Z7 z7 = this.b.get(str);
            return z7 != null ? z7 : this.a;
        }

        @Override // com.ironsource.X7
        public void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.a.a(iSDemandOnlyRewardedVideoListener);
            Iterator<String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                Z7 z7 = this.b.get(it.next());
                if (z7 != null) {
                    z7.a(iSDemandOnlyRewardedVideoListener);
                }
            }
        }

        @Override // com.ironsource.X7
        public void a(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            if (this.b.containsKey(str)) {
                Z7 z7 = this.b.get(str);
                if (z7 != null) {
                    z7.a(iSDemandOnlyRewardedVideoListener);
                    return;
                }
                return;
            }
            this.b.put(str, new Z7(iSDemandOnlyRewardedVideoListener));
        }
    }
}
