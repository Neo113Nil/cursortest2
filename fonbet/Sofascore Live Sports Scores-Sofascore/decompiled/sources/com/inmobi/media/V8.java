package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import defpackage.a70;
import defpackage.aal;
import defpackage.bea;
import defpackage.bka;
import defpackage.joa;
import defpackage.pea;
import defpackage.t4f;
import defpackage.w1l;
import defpackage.wzb;
import defpackage.y9l;
import defpackage.z9l;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class V8 implements Wf {
    public final WeakReference a;
    public C b;
    public C3930z7 c;
    public RelativeLayout d;
    public Y5 e;
    public Tf f;
    public float g;
    public InterfaceC3880x9 h;
    public final U8 i;
    public final T8 j;

    public V8(InMobiAdActivity inMobiAdActivity) {
        inMobiAdActivity.getClass();
        this.a = new WeakReference(inMobiAdActivity);
        this.f = Uf.a(R5.g());
        this.g = 1.0f;
        this.i = new U8(this);
        this.j = new T8(this);
    }

    public final void a(Intent intent, SparseArray sparseArray) {
        Y5 y5;
        Window window;
        intent.getClass();
        sparseArray.getClass();
        if (!intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            Activity activity = (Activity) this.a.get();
            if (activity instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity).b();
                return;
            }
            return;
        }
        C c = (C) sparseArray.get(intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
        if (c == null) {
            Activity activity2 = (Activity) this.a.get();
            if (activity2 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity2).b();
                return;
            }
            return;
        }
        int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 0);
        if (intExtra == 0) {
            B fullScreenEventsListener = ((GestureDetectorOnGestureListenerC3889xi) c).getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                ((C3708qi) fullScreenEventsListener).a();
            }
            Activity activity3 = (Activity) this.a.get();
            if (activity3 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity3).b();
                return;
            }
            return;
        }
        if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (this.a.get() instanceof InMobiAdActivity)) {
            Object obj = this.a.get();
            obj.getClass();
            if (!((InMobiAdActivity) obj).g) {
                Object obj2 = this.a.get();
                obj2.getClass();
                ((InMobiAdActivity) obj2).g = true;
                if (!(c instanceof GestureDetectorOnGestureListenerC3889xi) ? false : ((GestureDetectorOnGestureListenerC3889xi) c).X0) {
                    InterfaceC3880x9 interfaceC3880x9 = this.h;
                    if (interfaceC3880x9 != null) {
                        ((C3906y9) interfaceC3880x9).a("InMobiActivityViewHandler", "showInImmersiveMode");
                    }
                    Object obj3 = this.a.get();
                    InMobiAdActivity inMobiAdActivity = obj3 instanceof InMobiAdActivity ? (InMobiAdActivity) obj3 : null;
                    if (inMobiAdActivity != null && (window = inMobiAdActivity.getWindow()) != null) {
                        F5.a.getClass();
                        if (F5.t()) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            attributes.layoutInDisplayCutoutMode = 3;
                            window.setAttributes(attributes);
                            bea.L(window, false);
                        } else if (F5.r()) {
                            WindowManager.LayoutParams attributes2 = window.getAttributes();
                            attributes2.layoutInDisplayCutoutMode = 1;
                            window.setAttributes(attributes2);
                            bea.L(window, false);
                        }
                        if (F5.t()) {
                            bka bkaVar = new bka(window.getDecorView());
                            int i = Build.VERSION.SDK_INT;
                            pea aalVar = i >= 35 ? new aal(window, bkaVar) : i >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar);
                            aalVar.D();
                            aalVar.x(519);
                            aalVar.x(128);
                        } else if (F5.w()) {
                            window.getDecorView().setSystemUiVisibility(5638);
                        }
                    }
                } else {
                    Activity activity4 = (Activity) this.a.get();
                    if (activity4 != null) {
                        try {
                            activity4.requestWindowFeature(1);
                            activity4.getWindow().setFlags(1024, 1024);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if ((200 == intExtra && !"html".equals(((GestureDetectorOnGestureListenerC3889xi) c).getMarkupType())) || ((202 == intExtra && !"htmlUrl".equals(((GestureDetectorOnGestureListenerC3889xi) c).getMarkupType())) || (201 == intExtra && !"inmobiJson".equals(((GestureDetectorOnGestureListenerC3889xi) c).getMarkupType())))) {
            B fullScreenEventsListener2 = ((GestureDetectorOnGestureListenerC3889xi) c).getFullScreenEventsListener();
            if (fullScreenEventsListener2 != null) {
                ((C3708qi) fullScreenEventsListener2).a();
            }
            Activity activity5 = (Activity) this.a.get();
            if (activity5 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity5).b();
                return;
            }
            return;
        }
        try {
            this.b = c;
            ((GestureDetectorOnGestureListenerC3889xi) c).setFullScreenActivityContext((Activity) this.a.get());
            a();
            Activity activity6 = (Activity) this.a.get();
            if (activity6 != null) {
                RelativeLayout relativeLayout = new RelativeLayout(activity6);
                relativeLayout.setId(65534);
                this.d = relativeLayout;
            }
            a(c);
            C3930z7 c3930z7 = this.c;
            if (c3930z7 != null) {
                c3930z7.d();
            }
            Activity activity7 = (Activity) this.a.get();
            if (activity7 != null) {
                FrameLayout frameLayout = (FrameLayout) activity7.findViewById(R.id.content);
                RelativeLayout relativeLayout2 = frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null;
                RelativeLayout relativeLayout3 = this.d;
                if (relativeLayout3 != null && relativeLayout2 != null) {
                    RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout2.findViewById(65534);
                    if (relativeLayout4 != null) {
                        relativeLayout2.removeView(relativeLayout4);
                    }
                    relativeLayout2.addView(relativeLayout3);
                    C3930z7 c3930z72 = this.c;
                    if (c3930z72 != null) {
                        c3930z72.c();
                    }
                }
            }
            if (c instanceof GestureDetectorOnGestureListenerC3889xi) {
                ((GestureDetectorOnGestureListenerC3889xi) c).setEmbeddedBrowserJsCallbacks(this.j);
            }
            if (!(c instanceof GestureDetectorOnGestureListenerC3889xi) || (y5 = this.e) == null) {
                return;
            }
            y5.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC3889xi) c).getListener());
        } catch (Exception e) {
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) c;
            gestureDetectorOnGestureListenerC3889xi.setFullScreenActivityContext(null);
            B fullScreenEventsListener3 = gestureDetectorOnGestureListenerC3889xi.getFullScreenEventsListener();
            if (fullScreenEventsListener3 != null) {
                ((C3708qi) fullScreenEventsListener3).a();
            }
            Activity activity8 = (Activity) this.a.get();
            if (activity8 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity8).b();
            }
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        T5 d;
        boolean b;
        Activity activity;
        if (this.e == null) {
            return;
        }
        C c = this.b;
        if (c != null) {
            if ((!(c instanceof GestureDetectorOnGestureListenerC3889xi) ? false : ((GestureDetectorOnGestureListenerC3889xi) c).X0) || ((activity = (Activity) this.a.get()) != null && N3.a(activity))) {
                d = R5.h();
                float f = d.a;
                float f2 = d.c;
                float f3 = f * f2;
                float f4 = d.b * f2;
                b = Uf.b(this.f);
                float f5 = this.g;
                if (b) {
                    a(-1, wzb.b((1.0f - f5) * f4));
                    return;
                } else {
                    a(wzb.b((1.0f - f5) * f3), -1);
                    return;
                }
            }
        }
        d = R5.d();
        float f6 = d.a;
        float f22 = d.c;
        float f32 = f6 * f22;
        float f42 = d.b * f22;
        b = Uf.b(this.f);
        float f52 = this.g;
        if (b) {
        }
    }

    public final void c() {
        try {
            Y5 y5 = this.e;
            if (y5 != null) {
                ViewParent parent = y5.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(y5);
                }
                ViewParent parent2 = y5.getParent();
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.post(new t4f(y5, 21));
                }
            }
            Y5 y52 = this.e;
            if (y52 != null) {
                C3360d6 c3360d6 = y52.c;
                if (c3360d6 != null) {
                    c3360d6.destroy();
                }
                y52.c = null;
                y52.d = null;
                y52.e = null;
                Wo wo = y52.g;
                if (wo != null) {
                    wo.a();
                }
                y52.removeAllViews();
            }
            this.e = null;
            GestureDetectorOnGestureListenerC3889xi.g1.getClass();
            a(C3372di.a("IN_CUSTOM_EXPAND", "onClose"));
        } catch (Exception unused) {
        }
    }

    public final void b(Tf tf) {
        Objects.toString(tf);
        this.f = tf;
    }

    public final void a() {
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        if ((frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null) != null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setId(65519);
        relativeLayout.setBackgroundColor(0);
        frameLayout.removeAllViews();
        frameLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void a(C c) {
        RelativeLayout relativeLayout;
        if (((Activity) this.a.get()) == null || (relativeLayout = this.d) == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) c;
        String markupType = gestureDetectorOnGestureListenerC3889xi.getMarkupType();
        if (!Intrinsics.c(markupType, "html") && !Intrinsics.c(markupType, "htmlUrl")) {
            a70.p("InMobiActivityViewHandler: Unknown Markup type");
            return;
        }
        C3930z7 c3930z7 = new C3930z7(this.a, gestureDetectorOnGestureListenerC3889xi, relativeLayout);
        this.c = c3930z7;
        c3930z7.a(this.f);
        c3930z7.c = this.g;
        c3930z7.d = gestureDetectorOnGestureListenerC3889xi.X0;
    }

    public final void a(JSONObject jSONObject) {
        jSONObject.getClass();
        C c = this.b;
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = c instanceof GestureDetectorOnGestureListenerC3889xi ? (GestureDetectorOnGestureListenerC3889xi) c : null;
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            gestureDetectorOnGestureListenerC3889xi.c(jSONObject);
        }
    }

    @Override // com.inmobi.media.Wf
    public final void a(Tf tf) {
        tf.getClass();
        if (((Activity) this.a.get()) == null) {
            return;
        }
        C3930z7 c3930z7 = this.c;
        if (c3930z7 != null) {
            c3930z7.a(tf);
        }
        Tf tf2 = this.f;
        if (tf2 != tf && Uf.b(tf2) != Uf.b(tf)) {
            b(tf);
            C3930z7 c3930z72 = this.c;
            if (c3930z72 != null) {
                c3930z72.c();
            }
            b();
            return;
        }
        b(tf);
    }

    public static final void a(V8 v8) {
        v8.g = 1.0f;
        C3930z7 c3930z7 = v8.c;
        if (c3930z7 != null) {
            c3930z7.c = 1.0f;
            c3930z7.c();
        }
        Y5 y5 = v8.e;
        if (y5 != null) {
            y5.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        }
        v8.c();
    }

    public static final void a(Y5 y5) {
        y5.getParent().requestLayout();
    }

    public final void a(int i, int i2) {
        RelativeLayout.LayoutParams c;
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            return;
        }
        Uf.b(this.f);
        if (Uf.b(this.f)) {
            c = w1l.c(i, i2, 11);
        } else {
            c = w1l.c(i, i2, 12);
        }
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(R.id.content)).findViewById(65519);
        relativeLayout.getClass();
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(65518);
        Y5 y5 = this.e;
        if (relativeLayout2 != null) {
            if (y5 != null) {
                y5.setLayoutParams(c);
            }
        } else if (y5 != null) {
            relativeLayout.addView(y5, c);
        }
    }
}
