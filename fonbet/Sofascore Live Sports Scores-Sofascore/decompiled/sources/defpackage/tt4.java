package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import com.ironsource.U3;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tt4 extends btj {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final SparseArray N;
    public final SparseBooleanArray O;

    public tt4(Context context) {
        Point point;
        Point point2;
        String[] split;
        DisplayManager displayManager;
        CaptioningManager captioningManager;
        int i = lik.a;
        if (i >= 19 && ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.t = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.s = hv9.z(i >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        Display display = (i < 17 || (displayManager = (DisplayManager) context.getSystemService(U3.i.d)) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && lik.x(context)) {
            String s = i < 28 ? lik.s("sys.display-size") : lik.s("vendor.display-size");
            if (!TextUtils.isEmpty(s)) {
                try {
                    split = s.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point2 = new Point(parseInt, parseInt2);
                        c(point2.x, point2.y);
                        this.N = new SparseArray();
                        this.O = new SparseBooleanArray();
                        d();
                    }
                }
                m6k.B();
            }
            if ("Sony".equals(lik.c) && lik.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                point2 = point;
                c(point2.x, point2.y);
                this.N = new SparseArray();
                this.O = new SparseBooleanArray();
                d();
            }
        }
        point = new Point();
        if (i >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else if (i >= 17) {
            display.getRealSize(point);
        } else {
            display.getSize(point);
        }
        point2 = point;
        c(point2.x, point2.y);
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        d();
    }

    @Override // defpackage.btj
    public final btj c(int i, int i2) {
        super.c(i, i2);
        return this;
    }

    public final void d() {
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
    }

    public final void e(int i) {
        this.z.remove(Integer.valueOf(i));
    }

    public tt4(vt4 vt4Var) {
        b(vt4Var);
        this.A = vt4Var.A;
        this.B = vt4Var.B;
        this.C = vt4Var.C;
        this.D = vt4Var.D;
        this.E = vt4Var.E;
        this.F = vt4Var.F;
        this.G = vt4Var.G;
        this.H = vt4Var.H;
        this.I = vt4Var.I;
        this.J = vt4Var.J;
        this.K = vt4Var.K;
        this.L = vt4Var.L;
        this.M = vt4Var.M;
        SparseArray sparseArray = vt4Var.N;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.N = sparseArray2;
        this.O = vt4Var.O.clone();
    }

    public tt4() {
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        d();
    }
}
