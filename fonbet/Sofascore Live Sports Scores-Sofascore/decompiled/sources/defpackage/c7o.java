package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData;
import com.google.ads.interactivemedia.v3.impl.data.BoundingRectData;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c7o implements orn {
    public final qrn a;
    public final String b;
    public final View c;
    public final b7p g;
    public Activity e = null;
    public gt7 d = null;
    public boolean f = false;

    public c7o(String str, qrn qrnVar, ViewGroup viewGroup, b7p b7pVar) {
        this.b = str;
        this.a = qrnVar;
        this.c = viewGroup;
        this.g = b7pVar;
    }

    public static BoundingRectData d(BoundingRectData boundingRectData, float f) {
        BoundingRectData.Builder builder = BoundingRectData.builder();
        builder.left((int) Math.ceil(boundingRectData.left() / f));
        builder.top((int) Math.ceil(boundingRectData.top() / f));
        builder.height((int) Math.ceil(boundingRectData.height() / f));
        builder.width((int) Math.ceil(boundingRectData.width() / f));
        return builder.build();
    }

    @Override // defpackage.orn
    public final void b(lda ldaVar) {
        JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) ldaVar.b;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType = ldaVar.d;
        if (javaScriptMsgData == null) {
            int length = String.valueOf(javaScriptMessage$MsgType).length();
            new StringBuilder(String.valueOf(this.b).length() + length + 43 + 13);
        } else {
            if (javaScriptMessage$MsgType.ordinal() != 37) {
                return;
            }
            mha.I(e(javaScriptMsgData.queryId(), javaScriptMsgData.eventId(), ""), new c0l((Object) this, (Object) JavaScriptMessage$MsgType.viewability, false, 7), this.g);
        }
    }

    public final void c() {
        gt7 gt7Var;
        Context applicationContext = this.c.getContext().getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null || (gt7Var = this.d) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(gt7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [irb] */
    public final e7p e(String str, String str2, String str3) {
        ddb ddbVar;
        BoundingRectData.Builder builder = BoundingRectData.builder();
        View view = this.c;
        BoundingRectData d = d(builder.locationOnScreenOfView(view).build(), view.getContext().getResources().getDisplayMetrics().density);
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        IBinder windowToken = view.getWindowToken();
        if (!globalVisibleRect || windowToken == null || !view.isShown()) {
            rect.set(0, 0, 0, 0);
        }
        BoundingRectData.Builder builder2 = BoundingRectData.builder();
        builder2.left(rect.left);
        builder2.top(rect.top);
        builder2.height(rect.height());
        builder2.width(rect.width());
        BoundingRectData d2 = d(builder2.build(), view.getContext().getResources().getDisplayMetrics().density);
        boolean z = (view.getGlobalVisibleRect(new Rect()) && view.isShown()) ? false : true;
        long currentTimeMillis = System.currentTimeMillis();
        final ActivityMonitorData.Builder builder3 = ActivityMonitorData.builder();
        builder3.queryId(str);
        builder3.eventId(str2);
        builder3.appState(str3);
        builder3.nativeTime(currentTimeMillis);
        builder3.nativeViewHidden(z);
        builder3.nativeViewBounds(d);
        builder3.nativeViewVisibleBounds(d2);
        AudioManager audioManager = (AudioManager) view.getContext().getSystemService("audio");
        q7p q7pVar = q7p.a;
        b7p b7pVar = this.g;
        if (audioManager == null) {
            ddbVar = new e8p(Double.valueOf(0.0d));
        } else {
            ddb b = b7pVar.b(new v35(audioManager, 10));
            m6p m6pVar = new m6p();
            b.getClass();
            m6pVar.i = b;
            m6pVar.j = Throwable.class;
            m6pVar.k = vqn.a;
            b.addListener(m6pVar, b7pVar == q7pVar ? b7pVar : new irb(b7pVar, m6pVar, 4));
            ddbVar = m6pVar;
        }
        x1p x1pVar = new x1p() { // from class: yxn
            @Override // defpackage.x1p
            public final /* synthetic */ Object apply(Object obj) {
                double doubleValue = ((Double) obj).doubleValue();
                ActivityMonitorData.Builder builder4 = ActivityMonitorData.Builder.this;
                builder4.nativeVolume(doubleValue);
                return builder4.build();
            }
        };
        int i = f7p.k;
        e7p e7pVar = new e7p(ddbVar, x1pVar);
        if (b7pVar != q7pVar) {
            b7pVar = new irb(b7pVar, e7pVar, 4);
        }
        ddbVar.addListener(e7pVar, b7pVar);
        return e7pVar;
    }
}
