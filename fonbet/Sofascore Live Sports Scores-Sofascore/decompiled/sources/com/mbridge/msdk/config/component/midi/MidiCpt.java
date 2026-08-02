package com.mbridge.msdk.config.component.midi;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.midi.MidiCpt;
import com.mbridge.msdk.config.component.midi.monitor.c;
import com.mbridge.msdk.config.dynamic.baseview.cusview.CusPlayerView;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.bf3;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MidiCpt extends com.mbridge.msdk.config.component.base.a implements com.mbridge.msdk.config.component.vc.inter.a, d {
    private com.mbridge.msdk.config.component.midi.model.a h;
    private CusPlayerView i;
    private com.mbridge.msdk.config.dynamic.baseview.video.a j;
    private com.mbridge.msdk.config.component.midi.monitor.a k;
    private com.mbridge.msdk.config.component.midi.monitor.b l;
    private c m;
    private String q;
    private int n = 0;
    private int o = 0;
    private int p = 0;
    private boolean r = false;

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), str);
        b("904008", hashMap);
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        CusPlayerView cusPlayerView = this.i;
        if (cusPlayerView == null || this.h == null) {
            q0.b("MidiCpt", "check mute params is null");
            return;
        }
        if ((cusPlayerView.isSilent() ? "1" : "0").equals(this.h.f())) {
            return;
        }
        boolean equals = "0".equals(this.h.f());
        CusPlayerView cusPlayerView2 = this.i;
        if (equals) {
            cusPlayerView2.openSound();
        } else {
            cusPlayerView2.closeSound();
        }
        b("904006", i());
    }

    private void h() {
        CusPlayerView cusPlayerView = this.i;
        if (cusPlayerView != null) {
            cusPlayerView.stop();
        }
        b("904009", i());
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> i() {
        HashMap hashMap = new HashMap();
        if (this.i == null) {
            q0.b("MidiCpt", "mbPlayerView is null in createProgressEventData");
            return hashMap;
        }
        int i = this.o;
        if (i == 0) {
            i = (int) Math.ceil(r1.getCurPosition() / 1000.0d);
        }
        int i2 = this.p;
        if (i2 == 0) {
            i2 = this.i.getDuration();
        }
        int i3 = this.n;
        if (i3 == 0) {
            i3 = a(i, i2);
        }
        hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("percent"), Integer.valueOf(i3));
        hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(NotificationCompat.CATEGORY_PROGRESS), Integer.valueOf(i));
        hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("122"), this.i.isSilent() ? "1" : "0");
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        com.mbridge.msdk.config.component.midi.model.a aVar = this.h;
        if (aVar == null) {
            c("PlayerModel is null");
            return;
        }
        CusPlayerView cusPlayerView = this.i;
        if (cusPlayerView == null) {
            cusPlayerView = aVar.d();
            this.i = cusPlayerView;
        }
        if (cusPlayerView == null) {
            c("PlayerWidget is null");
            return;
        }
        String b2 = this.h.b();
        if (TextUtils.isEmpty(b2)) {
            c("Command is empty");
            return;
        }
        try {
            if (com.mbridge.msdk.config.component.common.util.c.c("315").equals(b2)) {
                this.r = true;
                n();
                return;
            }
            if (com.mbridge.msdk.config.component.common.util.c.c("307").equals(b2)) {
                this.r = false;
                h();
                return;
            }
            if (com.mbridge.msdk.config.component.common.util.c.c("316").equals(b2)) {
                c cVar = this.m;
                if (cVar != null) {
                    cVar.h();
                }
                this.r = false;
                m();
                return;
            }
            if (com.mbridge.msdk.config.component.common.util.c.c("335").equals(b2)) {
                this.r = true;
                p();
            } else {
                q0.b("MidiCpt", "Unknown command: " + b2);
            }
        } catch (Exception e) {
            q0.b("MidiCpt", "Error executing player action: " + b2, e);
            c(bf3.j(e, new StringBuilder("Error executing player action: ")));
        }
    }

    private void k() {
        com.mbridge.msdk.config.component.midi.model.a aVar;
        com.mbridge.msdk.config.component.midi.model.a aVar2;
        if (this.l == null && (aVar2 = this.h) != null && aVar2.c() == 1) {
            this.l = new com.mbridge.msdk.config.component.midi.monitor.b();
        }
        if (this.m != null || (aVar = this.h) == null) {
            return;
        }
        this.m = new c(aVar.g(), this.h.j());
    }

    private void l() {
        if (this.k == null) {
            this.k = new a();
        }
        if (this.j == null) {
            this.j = new b();
        }
    }

    private void m() {
        CusPlayerView cusPlayerView = this.i;
        if (cusPlayerView != null) {
            cusPlayerView.pause();
        }
        b("904003", i());
    }

    private void n() {
        if (this.h == null || this.i == null) {
            c("play params is null");
            return;
        }
        if (TextUtils.isEmpty(this.q)) {
            c("Video URL is empty");
            return;
        }
        if (!TextUtils.isEmpty(this.h.e())) {
            try {
                this.i.setMixWithOtherAudio(Integer.valueOf(this.h.e()).intValue());
            } catch (NumberFormatException e) {
                q0.b("MidiCpt", "Invalid mixWithOtherAudio value: " + this.h.e(), e);
            }
        }
        if (this.i.getCurPosition() > 1) {
            p();
            return;
        }
        int a2 = this.h.a();
        if (a2 >= 0) {
            this.i.initBufferIngParam(a2);
        }
        CusPlayerView cusPlayerView = this.i;
        String str = this.q;
        cusPlayerView.initVFPData(str, str, this.j);
        this.i.setVideoGravity(this.h.i());
        this.i.playVideo();
        b("904004", i());
    }

    private void p() {
        CusPlayerView cusPlayerView = this.i;
        if (cusPlayerView != null) {
            cusPlayerView.resumeStart();
            c cVar = this.m;
            if (cVar != null && cVar.e()) {
                this.m.h();
            }
        }
        b("904004", i());
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = map.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
                if (obj instanceof Map) {
                    Object obj2 = ((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.c("116"));
                    if (obj2 instanceof String) {
                        String valueOf = String.valueOf(obj2);
                        if (!TextUtils.isEmpty(valueOf)) {
                            return valueOf.equals(this.h.j());
                        }
                    }
                }
            } catch (Throwable th) {
                q0.b("MidiCpt", th.getMessage());
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f = "904001";
        this.h = new com.mbridge.msdk.config.component.midi.model.a(map);
        try {
            ViewGroup e = e();
            if (e != null) {
                if (TextUtils.isEmpty(this.h.h())) {
                    this.i = (CusPlayerView) com.mbridge.msdk.config.dynamic.utils.d.a(e, CusPlayerView.class);
                } else {
                    this.i = (CusPlayerView) e().findViewWithTag(this.h.h());
                }
            }
            CusPlayerView cusPlayerView = this.i;
            if (cusPlayerView != null) {
                this.h.a(cusPlayerView);
            } else {
                q0.b("MidiCpt", "Failed to get CusPlayerView from root view");
            }
        } catch (Exception e2) {
            q0.b("MidiCpt", "Error getting CusPlayerView", e2);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            q0.b("MidiCpt", "execute " + this);
            l();
            c cVar = this.m;
            if (cVar != null) {
                cVar.a(this.k);
                this.m.g();
            } else {
                c("TimeOutPlayerMonitor is null");
            }
        } catch (Exception e) {
            q0.b("MidiCpt", "Error in execute", e);
            c(bf3.j(e, new StringBuilder("Error in execute: ")));
        }
        a("904011", (HashMap<String, Object>) null);
    }

    public void o() {
        try {
            CusPlayerView cusPlayerView = this.i;
            if (cusPlayerView != null) {
                cusPlayerView.stop();
                this.i.release();
                this.i = null;
            }
            c cVar = this.m;
            if (cVar != null) {
                cVar.b();
                this.m = null;
            }
            if (this.l != null) {
                this.l = null;
            }
            if (this.h != null) {
                this.h = null;
            }
            this.j = null;
            this.k = null;
        } catch (Exception e) {
            q0.b("MidiCpt", "Error in release", e);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements com.mbridge.msdk.config.component.midi.monitor.a {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(String str) {
            MidiCpt.this.q = str;
            MidiCpt.this.j();
            MidiCpt.this.g();
        }

        @Override // com.mbridge.msdk.config.component.midi.monitor.a
        public void a(String str) {
            MidiCpt.this.a("904010", str);
        }

        @Override // com.mbridge.msdk.config.component.midi.monitor.a
        public void b(final String str) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.midi.a
                @Override // java.lang.Runnable
                public final void run() {
                    MidiCpt.a.this.c(str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        com.mbridge.msdk.config.component.midi.model.a aVar = this.h;
        if (aVar == null) {
            q0.b("MidiCpt", "playerModel is null, cannot parse event config");
        } else {
            aVar.b(map);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i, int i2) {
        return (int) ((i / i2) * 100.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Map<String, Object> i = i();
        i.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), str2);
        i.put(com.mbridge.msdk.config.component.common.util.c.c("code"), "4001");
        b(str, i);
        o();
    }

    @Override // com.mbridge.msdk.config.component.vc.inter.a
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            q0.b("MidiCpt", "eventName is null");
            return;
        }
        str.getClass();
        if (!str.equals("onStop")) {
            if (str.equals(U3.i.u0) && this.r) {
                p();
                return;
            }
            return;
        }
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, Map<String, Object> map) {
        a(a(str, map));
        com.mbridge.msdk.config.component.midi.monitor.b bVar = this.l;
        if (bVar != null) {
            bVar.a(str, this.d);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements com.mbridge.msdk.config.dynamic.baseview.video.a {
        public b() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void a(long j, long j2) {
            MidiCpt.this.o = Math.toIntExact(j);
            MidiCpt.this.p = Math.toIntExact(j2);
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.n = midiCpt.a(midiCpt.o, MidiCpt.this.p);
            HashMap hashMap = new HashMap();
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("percent"), Integer.valueOf(MidiCpt.this.n));
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(NotificationCompat.CATEGORY_PROGRESS), Long.valueOf(j));
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("122"), MidiCpt.this.i.isSilent() ? "1" : "0");
            MidiCpt.this.b("904005", hashMap);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onBufferingEnd() {
            q0.b("BufferState", "缓冲结束");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onBufferingStart() {
            q0.b("BufferState", "开始缓冲");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onBufferingTimeOut(String str) {
            q0.b("BufferState", "缓冲超时");
            MidiCpt.this.a("904010", str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onPlayCompleted() {
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.b("904007", (Map<String, Object>) midiCpt.i());
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onPlayError(String str) {
            MidiCpt.this.c(str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void a(long j) {
            if (MidiCpt.this.m != null) {
                MidiCpt.this.m.f();
            }
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.b("904002", (Map<String, Object>) midiCpt.i());
        }
    }
}
