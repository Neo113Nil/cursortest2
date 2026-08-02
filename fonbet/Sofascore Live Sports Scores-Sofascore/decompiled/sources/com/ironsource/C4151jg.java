package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.jg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4151jg {
    private final E0 a;

    public C4151jg(E0 e0) {
        this.a = e0;
    }

    public void a(Map<String, Object> map, long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.a.a(B0.INSTANCE_COLLECT_TOKEN_FAILED, hashMap);
    }

    public void b(Map<String, Object> map, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.a.a(B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, hashMap);
    }

    public void b(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.a.a(B0.INSTANCE_COLLECT_TOKEN, hashMap);
    }

    public void b(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.a.a(B0.COLLECT_TOKENS_COMPLETED, hashMap);
    }

    public void a() {
        a(new HashMap());
    }

    public void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, "timeout=" + j);
        a(hashMap);
    }

    public void a(Map<String, Object> map) {
        this.a.a(B0.COLLECT_TOKEN, map);
    }

    public void a(Map<String, Object> map, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.a.a(B0.INSTANCE_COLLECT_TOKEN_SUCCESS, hashMap);
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.a.a(B0.COLLECT_TOKENS_FAILED, hashMap);
    }
}
