package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface U7<T> {
    T a(@NotNull String str);

    void a(T t);

    void a(@NotNull String str, T t);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements U7<ISDemandOnlyInterstitialListener> {

        @NotNull
        private T7 a = new T7();

        @NotNull
        private final Map<String, T7> b = new HashMap();

        @Override // com.ironsource.U7
        public void a(@NotNull ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            iSDemandOnlyInterstitialListener.getClass();
            this.a.a(iSDemandOnlyInterstitialListener);
            Iterator<String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                T7 t7 = this.b.get(it.next());
                if (t7 != null) {
                    t7.a(iSDemandOnlyInterstitialListener);
                }
            }
        }

        @Override // com.ironsource.U7
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(@NotNull String str) {
            str.getClass();
            T7 t7 = this.b.get(str);
            return t7 != null ? t7 : this.a;
        }

        @Override // com.ironsource.U7
        public void a(@NotNull String str, @NotNull ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            str.getClass();
            iSDemandOnlyInterstitialListener.getClass();
            boolean containsKey = this.b.containsKey(str);
            Map<String, T7> map = this.b;
            if (containsKey) {
                T7 t7 = map.get(str);
                if (t7 != null) {
                    t7.a(iSDemandOnlyInterstitialListener);
                    return;
                }
                return;
            }
            map.put(str, new T7(iSDemandOnlyInterstitialListener));
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements U7<ISDemandOnlyRewardedVideoListener> {

        @NotNull
        private W7 a = new W7();

        @NotNull
        private final Map<String, W7> b = new HashMap();

        @Override // com.ironsource.U7
        public void a(@NotNull ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            iSDemandOnlyRewardedVideoListener.getClass();
            this.a.a(iSDemandOnlyRewardedVideoListener);
            Iterator<String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                W7 w7 = this.b.get(it.next());
                if (w7 != null) {
                    w7.a(iSDemandOnlyRewardedVideoListener);
                }
            }
        }

        @Override // com.ironsource.U7
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(@NotNull String str) {
            str.getClass();
            W7 w7 = this.b.get(str);
            return w7 != null ? w7 : this.a;
        }

        @Override // com.ironsource.U7
        public void a(@NotNull String str, @NotNull ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            str.getClass();
            iSDemandOnlyRewardedVideoListener.getClass();
            boolean containsKey = this.b.containsKey(str);
            Map<String, W7> map = this.b;
            if (containsKey) {
                W7 w7 = map.get(str);
                if (w7 != null) {
                    w7.a(iSDemandOnlyRewardedVideoListener);
                    return;
                }
                return;
            }
            map.put(str, new W7(iSDemandOnlyRewardedVideoListener));
        }
    }
}
