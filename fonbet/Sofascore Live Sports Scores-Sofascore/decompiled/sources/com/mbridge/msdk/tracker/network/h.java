package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.w1l;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class h<T> extends t<T> {
    protected static final String B = "h";
    private boolean A;
    private final long w;
    private Map<String, String> x;
    private Map<String, String> y;
    private x z;

    public h(int i, String str, int i2, String str2, long j) {
        super(i, str, i2, str2);
        this.A = false;
        if (j > 0) {
            this.w = j;
        } else {
            this.w = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
    }

    public void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        Map map2 = this.x;
        if (map2 == null) {
            map2 = new HashMap();
            this.x = map2;
        }
        try {
            map2.putAll(map);
        } catch (Exception e) {
            w1l.v(e, new StringBuilder("addParams error: "), B);
        }
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map map = this.y;
        if (map == null) {
            map = new HashMap();
            this.y = map;
        }
        try {
            map.put(str, str2);
        } catch (Exception e) {
            w1l.v(e, new StringBuilder("addHeader error: "), B);
        }
    }

    public void d(boolean z) {
        this.A = z;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        Map map = this.y;
        if (map == null) {
            map = new HashMap();
            this.y = map;
        }
        map.put("Charset", C.UTF8_NAME);
        return this.y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> i() {
        Map<String, String> map = this.x;
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        this.x = hashMap;
        return hashMap;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public x o() {
        x xVar = this.z;
        if (xVar != null) {
            return xVar;
        }
        e eVar = new e(30000, this.w, 3);
        this.z = eVar;
        return eVar;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return this.A && com.mbridge.msdk.foundation.same.d.a(p(), t());
    }
}
