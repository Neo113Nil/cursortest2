package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    private Context a;
    private String b;
    private int c;
    private float d;
    private float e;
    private int f;
    private int g;
    private View h;
    private List<CampaignEx> i;
    private int j;
    private boolean k;
    private List<String> l;
    private int m;
    private String n;
    private int o;
    private int p;
    private String q;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.video.dynview.c$c, reason: collision with other inner class name */
    public interface InterfaceC1322c {
        InterfaceC1322c a(float f);

        InterfaceC1322c a(int i);

        InterfaceC1322c a(Context context);

        InterfaceC1322c a(View view);

        InterfaceC1322c a(String str);

        InterfaceC1322c a(List<CampaignEx> list);

        InterfaceC1322c a(boolean z);

        InterfaceC1322c b(float f);

        InterfaceC1322c b(int i);

        InterfaceC1322c b(String str);

        c build();

        InterfaceC1322c c(int i);

        InterfaceC1322c c(String str);

        InterfaceC1322c d(int i);

        InterfaceC1322c e(int i);

        InterfaceC1322c f(int i);

        InterfaceC1322c fileDirs(List<String> list);

        InterfaceC1322c orientation(int i);
    }

    private c(b bVar) {
        this.e = bVar.e;
        this.d = bVar.d;
        this.f = bVar.f;
        this.g = bVar.g;
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
        this.n = bVar.n;
        this.o = bVar.o;
        this.p = bVar.p;
        this.q = bVar.q;
    }

    public static b a() {
        return new b();
    }

    public List<CampaignEx> b() {
        return this.i;
    }

    public Context c() {
        return this.a;
    }

    public List<String> d() {
        return this.l;
    }

    public int e() {
        return this.o;
    }

    public String f() {
        return this.b;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.f;
    }

    public View i() {
        return this.h;
    }

    public int j() {
        return this.g;
    }

    public float k() {
        return this.d;
    }

    public int l() {
        return this.j;
    }

    public float m() {
        return this.e;
    }

    public String n() {
        return this.q;
    }

    public int o() {
        return this.p;
    }

    public boolean p() {
        return this.k;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class b implements InterfaceC1322c {
        private Context a;
        private String b;
        private int c;
        private float d;
        private float e;
        private int f;
        private int g;
        private View h;
        private List<CampaignEx> i;
        private int j;
        private boolean k;
        private List<String> l;
        private int m;
        private String n;
        private int o;
        private int p = 1;
        private String q;

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c a(Context context) {
            this.a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public c build() {
            return new c(this);
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c fileDirs(List<String> list) {
            this.l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c orientation(int i) {
            this.f = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c b(int i) {
            this.c = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c c(String str) {
            this.b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c d(int i) {
            this.m = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c e(int i) {
            this.p = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c f(int i) {
            this.o = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c b(float f) {
            this.d = f;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c c(int i) {
            this.g = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c b(String str) {
            this.q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c a(float f) {
            this.e = f;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c a(View view) {
            this.h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c a(List<CampaignEx> list) {
            this.i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c a(int i) {
            this.j = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c a(boolean z) {
            this.k = z;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC1322c
        public InterfaceC1322c a(String str) {
            this.n = str;
            return this;
        }
    }
}
