package defpackage;

import android.view.View;
import com.facebook.w;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import kotlin.text.c;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class auk implements View.OnClickListener {
    public static final HashSet e = new HashSet();
    public final View.OnClickListener a;
    public final WeakReference b;
    public final WeakReference c;
    public final String d;

    public auk(View view, View view2, String str) {
        this.a = xsk.f(view);
        this.b = new WeakReference(view2);
        this.c = new WeakReference(view);
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        this.d = c.r(lowerCase, "activity", "", false);
    }

    public final void a() {
        auk aukVar;
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            View view = (View) this.b.get();
            View view2 = (View) this.c.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String d = gmi.d(view2);
                String b = v3f.b(view2, d);
                if (b != null && !cga.M(b, d)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, gmi.b(view, view2));
                    jSONObject.put("screenname", this.d);
                    if (!set.contains(this)) {
                        try {
                            aukVar = this;
                        } catch (Throwable th) {
                            th = th;
                            aukVar = this;
                        }
                        try {
                            w.c().execute(new kx0(jSONObject, d, aukVar, b, 14));
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                cw3.a(aukVar, th);
                            } catch (Throwable th3) {
                                th = th3;
                                cw3.a(aukVar, th);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th4) {
            th = th4;
            aukVar = this;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (set.contains(this)) {
                return;
            }
            try {
                view.getClass();
                View.OnClickListener onClickListener = this.a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                a();
            } catch (Throwable th) {
                cw3.a(this, th);
            }
        } catch (Throwable th2) {
            cw3.a(this, th2);
        }
    }
}
