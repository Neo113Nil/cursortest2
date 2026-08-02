package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class fum {
    private static int pcc;
    private static final LinkedHashMap<String, SoftReference<pcc>> sf = new LinkedHashMap<String, SoftReference<pcc>>(pcc, 0.75f, true) { // from class: com.bytedance.sdk.openadsdk.utils.fum.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, SoftReference<pcc>> entry) {
            pcc pccVar;
            com.bytedance.sdk.component.vy.qf qfVar;
            if (size() <= fum.pcc) {
                return false;
            }
            SoftReference<pcc> value = entry.getValue();
            if (value == null || (pccVar = value.get()) == null || (qfVar = pccVar.pcc) == null) {
                return true;
            }
            try {
                com.bytedance.sdk.component.utils.mk.pcc(qfVar);
                return true;
            } catch (Throwable unused) {
                entry.getKey();
                return true;
            }
        }
    };

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        com.bytedance.sdk.component.vy.qf pcc;
        Bundle sf;

        public pcc(com.bytedance.sdk.component.vy.qf qfVar, Bundle bundle) {
            this.pcc = qfVar;
            this.sf = bundle;
        }
    }

    public static void pcc(String str, com.bytedance.sdk.component.vy.qf qfVar, Bundle bundle) {
        if (pcc <= 0 || TextUtils.isEmpty(str) || qfVar == null) {
            return;
        }
        LinkedHashMap<String, SoftReference<pcc>> linkedHashMap = sf;
        synchronized (linkedHashMap) {
            try {
                pcc(qfVar.getWebView());
                pcc(qfVar, qfVar.getContext());
                synchronized (linkedHashMap) {
                    linkedHashMap.put(str, new SoftReference<>(new pcc(qfVar, bundle)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        linkedHashMap.size();
    }

    private static void sf() {
        pcc pccVar;
        com.bytedance.sdk.component.vy.qf qfVar;
        synchronized (sf) {
            while (true) {
                LinkedHashMap<String, SoftReference<pcc>> linkedHashMap = sf;
                if (linkedHashMap.size() > pcc) {
                    SoftReference<pcc> remove = linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                    if (remove != null && (pccVar = remove.get()) != null && (qfVar = pccVar.pcc) != null) {
                        try {
                            com.bytedance.sdk.component.utils.mk.pcc(qfVar);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (ofVar == null) {
            pcc = 0;
        } else {
            pcc = Math.max(0, ofVar.qf());
        }
        sf();
    }

    public static com.bytedance.sdk.component.vy.qf pcc(Context context, String str) {
        com.bytedance.sdk.component.vy.qf qfVar;
        if (pcc <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<pcc>> linkedHashMap = sf;
        synchronized (linkedHashMap) {
            try {
                SoftReference<pcc> remove = linkedHashMap.remove(str);
                if (remove == null) {
                    return null;
                }
                pcc pccVar = remove.get();
                if (pccVar != null && (qfVar = pccVar.pcc) != null) {
                    pcc(qfVar, context);
                    return pccVar.pcc;
                }
                return null;
            } finally {
            }
        }
    }

    public static Bundle pcc(String str) {
        if (pcc <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<pcc>> linkedHashMap = sf;
        synchronized (linkedHashMap) {
            try {
                SoftReference<pcc> softReference = linkedHashMap.get(str);
                if (softReference == null) {
                    return null;
                }
                pcc pccVar = softReference.get();
                return pccVar != null ? pccVar.sf : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void pcc(com.bytedance.sdk.component.vy.qf qfVar, Context context) {
        if (qfVar == null || context == null) {
            return;
        }
        try {
            if (qfVar.getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) qfVar.getContext()).setBaseContext(context.getApplicationContext());
            }
        } catch (ClassCastException unused) {
        }
        ViewGroup viewGroup = (ViewGroup) qfVar.getParent();
        if (viewGroup != null) {
            try {
                viewGroup.removeView(qfVar);
            } catch (Throwable unused2) {
            }
        }
    }

    private static void pcc(WebView webView) {
        if (webView != null && pcc > 0) {
            try {
                webView.evaluateJavascript("[].forEach.call(document.querySelectorAll('audio,video'), function(audio) { try { audio.pause(); } catch(e) {} })", null);
            } catch (Throwable unused) {
            }
        }
    }
}
