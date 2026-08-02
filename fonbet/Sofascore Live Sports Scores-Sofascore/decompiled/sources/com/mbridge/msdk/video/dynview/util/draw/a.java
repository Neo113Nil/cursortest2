package com.mbridge.msdk.video.dynview.util.draw;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.shape.a;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private static volatile a d;
    private View a;
    private Bitmap b;
    private Bitmap c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a, reason: collision with other inner class name */
    public class RunnableC1329a implements Runnable {
        final /* synthetic */ Bitmap a;
        final /* synthetic */ int b;
        final /* synthetic */ float c;
        final /* synthetic */ float d;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a$a, reason: collision with other inner class name */
        public class RunnableC1330a implements Runnable {
            final /* synthetic */ a.b a;

            public RunnableC1330a(a.b bVar) {
                this.a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.a == null || this.a.build() == null) {
                    return;
                }
                a.this.a.setBackground(this.a.build());
            }
        }

        public RunnableC1329a(Bitmap bitmap, int i, float f, float f2) {
            this.a = bitmap;
            this.b = i;
            this.c = f;
            this.d = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap a = a0.a(this.a, 10);
                Bitmap a2 = a0.a(this.a, 10);
                a.b a3 = com.mbridge.msdk.video.dynview.shape.a.a();
                a3.orientation(this.b).b(a).a(a2);
                int i = this.b;
                float f = this.c;
                if (i == 2) {
                    float f2 = this.d;
                    if (f > f2) {
                        a3.b(f).a(this.d);
                    } else {
                        a3.b(f2).a(this.c);
                    }
                } else {
                    a3.b(f).a(this.d);
                }
                if (a.this.a != null) {
                    a.this.a.post(new RunnableC1330a(a3));
                }
            } catch (Exception e) {
                q0.b("ChoiceOneDrawBitBg", e.getMessage());
            }
        }
    }

    private a() {
    }

    public void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.b() == null || cVar.b().size() < 2) {
            return;
        }
        this.a = view;
        int h = cVar.h();
        float m = cVar.m();
        float k = cVar.k();
        try {
            List<CampaignEx> b = cVar.b();
            String md5 = b.get(0) != null ? SameMD5.getMD5(b.get(0).getImageUrl()) : "";
            String md52 = b.get(1) != null ? SameMD5.getMD5(b.get(1).getImageUrl()) : "";
            Bitmap bitmap = null;
            Bitmap bitmap2 = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            if (!TextUtils.isEmpty(md52) && map.containsKey(md52)) {
                bitmap = map.get(md52);
            }
            Bitmap bitmap3 = bitmap;
            if (bitmap2 == null || bitmap2.isRecycled() || bitmap3 == null || bitmap3.isRecycled()) {
                return;
            }
            a(h, m, k, bitmap2, bitmap3);
        } catch (Exception e) {
            q0.b("ChoiceOneDrawBitBg", e.getMessage());
        }
    }

    public void b() {
        if (this.a != null) {
            this.a = null;
        }
        Bitmap bitmap = this.b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.b.recycle();
            this.b = null;
        }
        Bitmap bitmap2 = this.c;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.c.recycle();
        this.c = null;
    }

    public static a a() {
        a aVar;
        if (d == null) {
            synchronized (a.class) {
                try {
                    if (d == null) {
                        d = new a();
                    }
                    aVar = d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }
        return d;
    }

    private synchronized void a(int i, float f, float f2, Bitmap bitmap, Bitmap bitmap2) {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC1329a(bitmap, i, f, f2));
        } catch (Exception e) {
            q0.a("ChoiceOneDrawBitBg", e.getMessage());
        }
    }
}
