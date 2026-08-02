package m;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C;
import androidx.appcompat.widget.C2053h;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import androidx.core.content.res.k;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2106p0;
import androidx.core.view.AbstractC2114u;
import androidx.core.view.AbstractC2116v;
import androidx.core.view.C2102n0;
import androidx.core.view.F0;
import androidx.core.view.J;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.InterfaceC2193s;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.time.DurationKt;
import l.AbstractC5335a;
import l0.AbstractC5338c;
import n.AbstractC5596a;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: m.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C5486h extends AbstractC5484f implements e.a, LayoutInflater.Factory2 {

    /* renamed from: A, reason: collision with root package name */
    public boolean f55941A;

    /* renamed from: B, reason: collision with root package name */
    public ViewGroup f55942B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f55943C;

    /* renamed from: D, reason: collision with root package name */
    public View f55944D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f55945E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f55946F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f55947G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f55948H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f55949I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f55950J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f55951K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f55952L;

    /* renamed from: O, reason: collision with root package name */
    public s f55953O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f55954P;

    /* renamed from: P4, reason: collision with root package name */
    public OnBackInvokedCallback f55955P4;

    /* renamed from: R, reason: collision with root package name */
    public boolean f55956R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f55957T;

    /* renamed from: T1, reason: collision with root package name */
    public final Runnable f55958T1;

    /* renamed from: V, reason: collision with root package name */
    public boolean f55959V;

    /* renamed from: V1, reason: collision with root package name */
    public boolean f55960V1;

    /* renamed from: W, reason: collision with root package name */
    public Configuration f55961W;

    /* renamed from: X, reason: collision with root package name */
    public int f55962X;

    /* renamed from: Y, reason: collision with root package name */
    public int f55963Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f55964Z;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f55965b1;

    /* renamed from: b2, reason: collision with root package name */
    public Rect f55966b2;

    /* renamed from: g1, reason: collision with root package name */
    public p f55967g1;

    /* renamed from: g2, reason: collision with root package name */
    public Rect f55968g2;

    /* renamed from: j, reason: collision with root package name */
    public final Object f55969j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f55970k;

    /* renamed from: l, reason: collision with root package name */
    public Window f55971l;

    /* renamed from: m, reason: collision with root package name */
    public n f55972m;
    private s[] mPanels;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5482d f55973n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC5479a f55974o;

    /* renamed from: p, reason: collision with root package name */
    public MenuInflater f55975p;

    /* renamed from: p1, reason: collision with root package name */
    public p f55976p1;

    /* renamed from: p2, reason: collision with root package name */
    public m.t f55977p2;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f55978q;

    /* renamed from: r, reason: collision with root package name */
    public C f55979r;

    /* renamed from: s, reason: collision with root package name */
    public C0807h f55980s;

    /* renamed from: t, reason: collision with root package name */
    public t f55981t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.appcompat.view.b f55982u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f55983v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f55984w;

    /* renamed from: x, reason: collision with root package name */
    public Runnable f55985x;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f55986x1;

    /* renamed from: x2, reason: collision with root package name */
    public v f55987x2;

    /* renamed from: y, reason: collision with root package name */
    public C2102n0 f55988y;

    /* renamed from: y1, reason: collision with root package name */
    public int f55989y1;

    /* renamed from: y2, reason: collision with root package name */
    public OnBackInvokedDispatcher f55990y2;

    /* renamed from: z, reason: collision with root package name */
    public boolean f55991z;

    /* renamed from: Q4, reason: collision with root package name */
    public static final z.r f55938Q4 = new z.r();

    /* renamed from: R4, reason: collision with root package name */
    public static final boolean f55939R4 = false;
    private static final int[] sWindowBackgroundStyleable = {R.attr.windowBackground};

    /* renamed from: S4, reason: collision with root package name */
    public static final boolean f55940S4 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: m.h$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C5486h layoutInflaterFactory2C5486h = LayoutInflaterFactory2C5486h.this;
            if ((layoutInflaterFactory2C5486h.f55989y1 & 1) != 0) {
                layoutInflaterFactory2C5486h.l0(0);
            }
            LayoutInflaterFactory2C5486h layoutInflaterFactory2C5486h2 = LayoutInflaterFactory2C5486h.this;
            if ((layoutInflaterFactory2C5486h2.f55989y1 & 4096) != 0) {
                layoutInflaterFactory2C5486h2.l0(108);
            }
            LayoutInflaterFactory2C5486h layoutInflaterFactory2C5486h3 = LayoutInflaterFactory2C5486h.this;
            layoutInflaterFactory2C5486h3.f55986x1 = false;
            layoutInflaterFactory2C5486h3.f55989y1 = 0;
        }
    }

    /* renamed from: m.h$b */
    public class b implements J {
        public b() {
        }

        @Override // androidx.core.view.J
        public F0 f(View view, F0 f02) {
            int m10 = f02.m();
            int h12 = LayoutInflaterFactory2C5486h.this.h1(f02, null);
            if (m10 != h12) {
                f02 = f02.r(f02.k(), h12, f02.l(), f02.j());
            }
            return AbstractC2082d0.X(view, f02);
        }
    }

    /* renamed from: m.h$d */
    public class d implements Runnable {

        /* renamed from: m.h$d$a */
        public class a extends AbstractC2106p0 {
            public a() {
            }

            @Override // androidx.core.view.InterfaceC2104o0
            public void b(View view) {
                LayoutInflaterFactory2C5486h.this.f55983v.setAlpha(1.0f);
                LayoutInflaterFactory2C5486h.this.f55988y.g(null);
                LayoutInflaterFactory2C5486h.this.f55988y = null;
            }

            @Override // androidx.core.view.AbstractC2106p0, androidx.core.view.InterfaceC2104o0
            public void c(View view) {
                LayoutInflaterFactory2C5486h.this.f55983v.setVisibility(0);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C5486h layoutInflaterFactory2C5486h = LayoutInflaterFactory2C5486h.this;
            layoutInflaterFactory2C5486h.f55984w.showAtLocation(layoutInflaterFactory2C5486h.f55983v, 55, 0, 0);
            LayoutInflaterFactory2C5486h.this.m0();
            if (!LayoutInflaterFactory2C5486h.this.X0()) {
                LayoutInflaterFactory2C5486h.this.f55983v.setAlpha(1.0f);
                LayoutInflaterFactory2C5486h.this.f55983v.setVisibility(0);
            } else {
                LayoutInflaterFactory2C5486h.this.f55983v.setAlpha(0.0f);
                LayoutInflaterFactory2C5486h layoutInflaterFactory2C5486h2 = LayoutInflaterFactory2C5486h.this;
                layoutInflaterFactory2C5486h2.f55988y = AbstractC2082d0.f(layoutInflaterFactory2C5486h2.f55983v).b(1.0f);
                LayoutInflaterFactory2C5486h.this.f55988y.g(new a());
            }
        }
    }

    /* renamed from: m.h$e */
    public class e extends AbstractC2106p0 {
        public e() {
        }

        @Override // androidx.core.view.InterfaceC2104o0
        public void b(View view) {
            LayoutInflaterFactory2C5486h.this.f55983v.setAlpha(1.0f);
            LayoutInflaterFactory2C5486h.this.f55988y.g(null);
            LayoutInflaterFactory2C5486h.this.f55988y = null;
        }

        @Override // androidx.core.view.AbstractC2106p0, androidx.core.view.InterfaceC2104o0
        public void c(View view) {
            LayoutInflaterFactory2C5486h.this.f55983v.setVisibility(0);
            if (LayoutInflaterFactory2C5486h.this.f55983v.getParent() instanceof View) {
                AbstractC2082d0.i0((View) LayoutInflaterFactory2C5486h.this.f55983v.getParent());
            }
        }
    }

    /* renamed from: m.h$f */
    public class f implements InterfaceC5480b {
        public f() {
        }
    }

    /* renamed from: m.h$g */
    public interface g {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    /* renamed from: m.h$h, reason: collision with other inner class name */
    public final class C0807h implements i.a {
        public C0807h() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            LayoutInflaterFactory2C5486h.this.c0(eVar);
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback y02 = LayoutInflaterFactory2C5486h.this.y0();
            if (y02 == null) {
                return true;
            }
            y02.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: m.h$i */
    public class i implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public b.a f56000a;

        /* renamed from: m.h$i$a */
        public class a extends AbstractC2106p0 {
            public a() {
            }

            @Override // androidx.core.view.InterfaceC2104o0
            public void b(View view) {
                LayoutInflaterFactory2C5486h.this.f55983v.setVisibility(8);
                LayoutInflaterFactory2C5486h layoutInflaterFactory2C5486h = LayoutInflaterFactory2C5486h.this;
                PopupWindow popupWindow = layoutInflaterFactory2C5486h.f55984w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C5486h.f55983v.getParent() instanceof View) {
                    AbstractC2082d0.i0((View) LayoutInflaterFactory2C5486h.this.f55983v.getParent());
                }
                LayoutInflaterFactory2C5486h.this.f55983v.k();
                LayoutInflaterFactory2C5486h.this.f55988y.g(null);
                LayoutInflaterFactory2C5486h layoutInflaterFactory2C5486h2 = LayoutInflaterFactory2C5486h.this;
                layoutInflaterFactory2C5486h2.f55988y = null;
                AbstractC2082d0.i0(layoutInflaterFactory2C5486h2.f55942B);
            }
        }

        public i(b.a aVar) {
            this.f56000a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f56000a.a(bVar);
            LayoutInflaterFactory2C5486h layoutInflaterFactory2C5486h = LayoutInflaterFactory2C5486h.this;
            if (layoutInflaterFactory2C5486h.f55984w != null) {
                layoutInflaterFactory2C5486h.f55971l.getDecorView().removeCallbacks(LayoutInflaterFactory2C5486h.this.f55985x);
            }
            LayoutInflaterFactory2C5486h layoutInflaterFactory2C5486h2 = LayoutInflaterFactory2C5486h.this;
            if (layoutInflaterFactory2C5486h2.f55983v != null) {
                layoutInflaterFactory2C5486h2.m0();
                LayoutInflaterFactory2C5486h layoutInflaterFactory2C5486h3 = LayoutInflaterFactory2C5486h.this;
                layoutInflaterFactory2C5486h3.f55988y = AbstractC2082d0.f(layoutInflaterFactory2C5486h3.f55983v).b(0.0f);
                LayoutInflaterFactory2C5486h.this.f55988y.g(new a());
            }
            LayoutInflaterFactory2C5486h layoutInflaterFactory2C5486h4 = LayoutInflaterFactory2C5486h.this;
            InterfaceC5482d interfaceC5482d = layoutInflaterFactory2C5486h4.f55973n;
            if (interfaceC5482d != null) {
                interfaceC5482d.onSupportActionModeFinished(layoutInflaterFactory2C5486h4.f55982u);
            }
            LayoutInflaterFactory2C5486h layoutInflaterFactory2C5486h5 = LayoutInflaterFactory2C5486h.this;
            layoutInflaterFactory2C5486h5.f55982u = null;
            AbstractC2082d0.i0(layoutInflaterFactory2C5486h5.f55942B);
            LayoutInflaterFactory2C5486h.this.f1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f56000a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f56000a.c(bVar, menuItem);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, Menu menu) {
            AbstractC2082d0.i0(LayoutInflaterFactory2C5486h.this.f55942B);
            return this.f56000a.d(bVar, menu);
        }
    }

    /* renamed from: m.h$j */
    public static class j {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* renamed from: m.h$k */
    public static class k {
        public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static u0.i b(Configuration configuration) {
            return u0.i.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(u0.i iVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(iVar.g()));
        }

        public static void d(Configuration configuration, u0.i iVar) {
            configuration.setLocales(LocaleList.forLanguageTags(iVar.g()));
        }
    }

    /* renamed from: m.h$l */
    public static class l {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            i10 = configuration.colorMode;
            int i18 = i10 & 3;
            i11 = configuration2.colorMode;
            if (i18 != (i11 & 3)) {
                i16 = configuration3.colorMode;
                i17 = configuration2.colorMode;
                configuration3.colorMode = i16 | (i17 & 3);
            }
            i12 = configuration.colorMode;
            int i19 = i12 & 12;
            i13 = configuration2.colorMode;
            if (i19 != (i13 & 12)) {
                i14 = configuration3.colorMode;
                i15 = configuration2.colorMode;
                configuration3.colorMode = i14 | (i15 & 12);
            }
        }
    }

    /* renamed from: m.h$m */
    public static class m {
        public static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        public static OnBackInvokedCallback b(Object obj, final LayoutInflaterFactory2C5486h layoutInflaterFactory2C5486h) {
            Objects.requireNonNull(layoutInflaterFactory2C5486h);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: m.p
                public final void onBackInvoked() {
                    LayoutInflaterFactory2C5486h.this.G0();
                }
            };
            m.l.a(obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        public static void c(Object obj, Object obj2) {
            m.l.a(obj).unregisterOnBackInvokedCallback(m.k.a(obj2));
        }
    }

    /* renamed from: m.h$n */
    public class n extends androidx.appcompat.view.i {

        /* renamed from: b, reason: collision with root package name */
        public g f56003b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f56004c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f56005d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f56006e;

        public n(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f56005d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f56005d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f56004c = true;
                callback.onContentChanged();
            } finally {
                this.f56004c = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f56006e = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f56006e = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f56005d ? a().dispatchKeyEvent(keyEvent) : LayoutInflaterFactory2C5486h.this.k0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflaterFactory2C5486h.this.J0(keyEvent.getKeyCode(), keyEvent);
        }

        public void e(g gVar) {
            this.f56003b = gVar;
        }

        public final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(LayoutInflaterFactory2C5486h.this.f55970k, callback);
            androidx.appcompat.view.b S10 = LayoutInflaterFactory2C5486h.this.S(aVar);
            if (S10 != null) {
                return aVar.e(S10);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f56004c) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View onCreatePanelView;
            g gVar = this.f56003b;
            return (gVar == null || (onCreatePanelView = gVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : onCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            LayoutInflaterFactory2C5486h.this.M0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f56006e) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                LayoutInflaterFactory2C5486h.this.N0(i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.f0(true);
            }
            g gVar = this.f56003b;
            boolean z10 = gVar != null && gVar.a(i10);
            if (!z10) {
                z10 = super.onPreparePanel(i10, view, menu);
            }
            if (eVar != null) {
                eVar.f0(false);
            }
            return z10;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            s w02 = LayoutInflaterFactory2C5486h.this.w0(0, true);
            if (w02 == null || (eVar = w02.f56025j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (LayoutInflaterFactory2C5486h.this.E0() && i10 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* renamed from: m.h$o */
    public class o extends p {

        /* renamed from: c, reason: collision with root package name */
        public final PowerManager f56008c;

        public o(Context context) {
            super();
            this.f56008c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // m.LayoutInflaterFactory2C5486h.p
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // m.LayoutInflaterFactory2C5486h.p
        public int c() {
            return j.a(this.f56008c) ? 2 : 1;
        }

        @Override // m.LayoutInflaterFactory2C5486h.p
        public void d() {
            LayoutInflaterFactory2C5486h.this.f();
        }
    }

    /* renamed from: m.h$p */
    public abstract class p {

        /* renamed from: a, reason: collision with root package name */
        public BroadcastReceiver f56010a;

        /* renamed from: m.h$p$a */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        public p() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f56010a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C5486h.this.f55970k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f56010a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b10 = b();
            if (b10 == null || b10.countActions() == 0) {
                return;
            }
            if (this.f56010a == null) {
                this.f56010a = new a();
            }
            LayoutInflaterFactory2C5486h.this.f55970k.registerReceiver(this.f56010a, b10);
        }
    }

    /* renamed from: m.h$q */
    public class q extends p {

        /* renamed from: c, reason: collision with root package name */
        public final C5477A f56013c;

        public q(C5477A c5477a) {
            super();
            this.f56013c = c5477a;
        }

        @Override // m.LayoutInflaterFactory2C5486h.p
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // m.LayoutInflaterFactory2C5486h.p
        public int c() {
            return this.f56013c.d() ? 2 : 1;
        }

        @Override // m.LayoutInflaterFactory2C5486h.p
        public void d() {
            LayoutInflaterFactory2C5486h.this.f();
        }
    }

    /* renamed from: m.h$r */
    public class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        public final boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C5486h.this.k0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflaterFactory2C5486h.this.e0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(AbstractC5596a.b(getContext(), i10));
        }
    }

    /* renamed from: m.h$s */
    public static final class s {

        /* renamed from: a, reason: collision with root package name */
        public int f56016a;

        /* renamed from: b, reason: collision with root package name */
        public int f56017b;

        /* renamed from: c, reason: collision with root package name */
        public int f56018c;

        /* renamed from: d, reason: collision with root package name */
        public int f56019d;

        /* renamed from: e, reason: collision with root package name */
        public int f56020e;

        /* renamed from: f, reason: collision with root package name */
        public int f56021f;

        /* renamed from: g, reason: collision with root package name */
        public ViewGroup f56022g;

        /* renamed from: h, reason: collision with root package name */
        public View f56023h;

        /* renamed from: i, reason: collision with root package name */
        public View f56024i;

        /* renamed from: j, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f56025j;

        /* renamed from: k, reason: collision with root package name */
        public androidx.appcompat.view.menu.c f56026k;

        /* renamed from: l, reason: collision with root package name */
        public Context f56027l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f56028m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f56029n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f56030o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f56031p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f56032q = false;

        /* renamed from: r, reason: collision with root package name */
        public boolean f56033r;

        /* renamed from: s, reason: collision with root package name */
        public Bundle f56034s;

        public s(int i10) {
            this.f56016a = i10;
        }

        public androidx.appcompat.view.menu.j a(i.a aVar) {
            if (this.f56025j == null) {
                return null;
            }
            if (this.f56026k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f56027l, l.g.f55131j);
                this.f56026k = cVar;
                cVar.c(aVar);
                this.f56025j.b(this.f56026k);
            }
            return this.f56026k.l(this.f56022g);
        }

        public boolean b() {
            if (this.f56023h == null) {
                return false;
            }
            return this.f56024i != null || this.f56026k.k().getCount() > 0;
        }

        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f56025j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.R(this.f56026k);
            }
            this.f56025j = eVar;
            if (eVar == null || (cVar = this.f56026k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(AbstractC5335a.f54986a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(AbstractC5335a.f54973F, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            } else {
                newTheme.applyStyle(l.i.f55162f, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f56027l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(l.j.AppCompatTheme);
            this.f56017b = obtainStyledAttributes.getResourceId(l.j.f55341o0, 0);
            this.f56021f = obtainStyledAttributes.getResourceId(l.j.f55336n0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: m.h$t */
    public final class t implements i.a {
        public t() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e F10 = eVar.F();
            boolean z11 = F10 != eVar;
            LayoutInflaterFactory2C5486h layoutInflaterFactory2C5486h = LayoutInflaterFactory2C5486h.this;
            if (z11) {
                eVar = F10;
            }
            s p02 = layoutInflaterFactory2C5486h.p0(eVar);
            if (p02 != null) {
                if (!z11) {
                    LayoutInflaterFactory2C5486h.this.f0(p02, z10);
                } else {
                    LayoutInflaterFactory2C5486h.this.b0(p02.f56016a, p02, F10);
                    LayoutInflaterFactory2C5486h.this.f0(p02, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback y02;
            if (eVar != eVar.F()) {
                return true;
            }
            LayoutInflaterFactory2C5486h layoutInflaterFactory2C5486h = LayoutInflaterFactory2C5486h.this;
            if (!layoutInflaterFactory2C5486h.f55947G || (y02 = layoutInflaterFactory2C5486h.y0()) == null || LayoutInflaterFactory2C5486h.this.f55959V) {
                return true;
            }
            y02.onMenuOpened(108, eVar);
            return true;
        }
    }

    public LayoutInflaterFactory2C5486h(Activity activity, InterfaceC5482d interfaceC5482d) {
        this(activity, null, interfaceC5482d, activity);
    }

    public static Configuration q0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            k.a(configuration, configuration2, configuration3);
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            int i45 = configuration.densityDpi;
            int i46 = configuration2.densityDpi;
            if (i45 != i46) {
                configuration3.densityDpi = i46;
            }
        }
        return configuration3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // m.AbstractC5484f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A() {
        AbstractC5479a abstractC5479a;
        if (this.f55969j instanceof Activity) {
            AbstractC5484f.G(this);
        }
        if (this.f55986x1) {
            this.f55971l.getDecorView().removeCallbacks(this.f55958T1);
        }
        this.f55959V = true;
        if (this.f55962X != -100) {
            Object obj = this.f55969j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f55938Q4.put(this.f55969j.getClass().getName(), Integer.valueOf(this.f55962X));
                abstractC5479a = this.f55974o;
                if (abstractC5479a != null) {
                    abstractC5479a.n();
                }
                d0();
            }
        }
        f55938Q4.remove(this.f55969j.getClass().getName());
        abstractC5479a = this.f55974o;
        if (abstractC5479a != null) {
        }
        d0();
    }

    public final boolean A0(s sVar) {
        View view = sVar.f56024i;
        if (view != null) {
            sVar.f56023h = view;
            return true;
        }
        if (sVar.f56025j == null) {
            return false;
        }
        if (this.f55981t == null) {
            this.f55981t = new t();
        }
        View view2 = (View) sVar.a(this.f55981t);
        sVar.f56023h = view2;
        return view2 != null;
    }

    @Override // m.AbstractC5484f
    public void B(Bundle bundle) {
        n0();
    }

    public final boolean B0(s sVar) {
        sVar.d(r0());
        sVar.f56022g = new r(sVar.f56027l);
        sVar.f56018c = 81;
        return true;
    }

    @Override // m.AbstractC5484f
    public void C() {
        AbstractC5479a u10 = u();
        if (u10 != null) {
            u10.A(true);
        }
    }

    public final boolean C0(s sVar) {
        Resources.Theme theme;
        Context context = this.f55970k;
        int i10 = sVar.f56016a;
        if ((i10 == 0 || i10 == 108) && this.f55979r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(AbstractC5335a.f54989d, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(AbstractC5335a.f54990e, typedValue, true);
            } else {
                theme2.resolveAttribute(AbstractC5335a.f54990e, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.W(this);
        sVar.c(eVar);
        return true;
    }

    public final void D0(int i10) {
        this.f55989y1 = (1 << i10) | this.f55989y1;
        if (this.f55986x1) {
            return;
        }
        AbstractC2082d0.d0(this.f55971l.getDecorView(), this.f55958T1);
        this.f55986x1 = true;
    }

    @Override // m.AbstractC5484f
    public void E() {
        W(true, false);
    }

    public boolean E0() {
        return this.f55991z;
    }

    @Override // m.AbstractC5484f
    public void F() {
        AbstractC5479a u10 = u();
        if (u10 != null) {
            u10.A(false);
        }
    }

    public int F0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return u0(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return t0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    public boolean G0() {
        boolean z10 = this.f55954P;
        this.f55954P = false;
        s w02 = w0(0, false);
        if (w02 != null && w02.f56030o) {
            if (!z10) {
                f0(w02, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f55982u;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        AbstractC5479a u10 = u();
        return u10 != null && u10.g();
    }

    public boolean H0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f55954P = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            I0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // m.AbstractC5484f
    public boolean I(int i10) {
        int U02 = U0(i10);
        if (this.f55951K && U02 == 108) {
            return false;
        }
        if (this.f55947G && U02 == 1) {
            this.f55947G = false;
        }
        if (U02 == 1) {
            b1();
            this.f55951K = true;
            return true;
        }
        if (U02 == 2) {
            b1();
            this.f55945E = true;
            return true;
        }
        if (U02 == 5) {
            b1();
            this.f55946F = true;
            return true;
        }
        if (U02 == 10) {
            b1();
            this.f55949I = true;
            return true;
        }
        if (U02 == 108) {
            b1();
            this.f55947G = true;
            return true;
        }
        if (U02 != 109) {
            return this.f55971l.requestFeature(U02);
        }
        b1();
        this.f55948H = true;
        return true;
    }

    public final boolean I0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s w02 = w0(i10, true);
        if (w02.f56030o) {
            return false;
        }
        return S0(w02, keyEvent);
    }

    public boolean J0(int i10, KeyEvent keyEvent) {
        AbstractC5479a u10 = u();
        if (u10 != null && u10.o(i10, keyEvent)) {
            return true;
        }
        s sVar = this.f55953O;
        if (sVar != null && R0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            s sVar2 = this.f55953O;
            if (sVar2 != null) {
                sVar2.f56029n = true;
            }
            return true;
        }
        if (this.f55953O == null) {
            s w02 = w0(0, true);
            S0(w02, keyEvent);
            boolean R02 = R0(w02, keyEvent.getKeyCode(), keyEvent, 1);
            w02.f56028m = false;
            if (R02) {
                return true;
            }
        }
        return false;
    }

    @Override // m.AbstractC5484f
    public void K(int i10) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.f55942B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f55970k).inflate(i10, viewGroup);
        this.f55972m.c(this.f55971l.getCallback());
    }

    public boolean K0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                L0(0, keyEvent);
                return true;
            }
        } else if (G0()) {
            return true;
        }
        return false;
    }

    @Override // m.AbstractC5484f
    public void L(View view) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.f55942B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f55972m.c(this.f55971l.getCallback());
    }

    public final boolean L0(int i10, KeyEvent keyEvent) {
        boolean z10;
        C c10;
        if (this.f55982u != null) {
            return false;
        }
        boolean z11 = true;
        s w02 = w0(i10, true);
        if (i10 != 0 || (c10 = this.f55979r) == null || !c10.b() || ViewConfiguration.get(this.f55970k).hasPermanentMenuKey()) {
            boolean z12 = w02.f56030o;
            if (z12 || w02.f56029n) {
                f0(w02, true);
                z11 = z12;
            } else {
                if (w02.f56028m) {
                    if (w02.f56033r) {
                        w02.f56028m = false;
                        z10 = S0(w02, keyEvent);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        P0(w02, keyEvent);
                    }
                }
                z11 = false;
            }
        } else if (this.f55979r.f()) {
            z11 = this.f55979r.c();
        } else {
            if (!this.f55959V && S0(w02, keyEvent)) {
                z11 = this.f55979r.d();
            }
            z11 = false;
        }
        if (z11) {
            AudioManager audioManager = (AudioManager) this.f55970k.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return z11;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
        }
        return z11;
    }

    @Override // m.AbstractC5484f
    public void M(View view, ViewGroup.LayoutParams layoutParams) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.f55942B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f55972m.c(this.f55971l.getCallback());
    }

    public void M0(int i10) {
        AbstractC5479a u10;
        if (i10 != 108 || (u10 = u()) == null) {
            return;
        }
        u10.h(true);
    }

    public void N0(int i10) {
        if (i10 == 108) {
            AbstractC5479a u10 = u();
            if (u10 != null) {
                u10.h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            s w02 = w0(i10, true);
            if (w02.f56030o) {
                f0(w02, false);
            }
        }
    }

    @Override // m.AbstractC5484f
    public void O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.O(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f55990y2;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f55955P4) != null) {
            m.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f55955P4 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f55969j;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f55990y2 = m.a((Activity) this.f55969j);
                f1();
            }
        }
        this.f55990y2 = onBackInvokedDispatcher;
        f1();
    }

    @Override // m.AbstractC5484f
    public void P(Toolbar toolbar) {
        if (this.f55969j instanceof Activity) {
            AbstractC5479a u10 = u();
            if (u10 instanceof C5478B) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f55975p = null;
            if (u10 != null) {
                u10.n();
            }
            this.f55974o = null;
            if (toolbar != null) {
                y yVar = new y(toolbar, x0(), this.f55972m);
                this.f55974o = yVar;
                this.f55972m.e(yVar.f56056c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f55972m.e(null);
            }
            w();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(s sVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (sVar.f56030o || this.f55959V) {
            return;
        }
        if (sVar.f56016a == 0 && (this.f55970k.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback y02 = y0();
        if (y02 != null && !y02.onMenuOpened(sVar.f56016a, sVar.f56025j)) {
            f0(sVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f55970k.getSystemService("window");
        if (windowManager == null || !S0(sVar, keyEvent)) {
            return;
        }
        ViewGroup viewGroup = sVar.f56022g;
        if (viewGroup == null || sVar.f56032q) {
            if (viewGroup == null) {
                if (!B0(sVar) || sVar.f56022g == null) {
                    return;
                }
            } else if (sVar.f56032q && viewGroup.getChildCount() > 0) {
                sVar.f56022g.removeAllViews();
            }
            if (!A0(sVar) || !sVar.b()) {
                sVar.f56032q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = sVar.f56023h.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
            }
            sVar.f56022g.setBackgroundResource(sVar.f56017b);
            ViewParent parent = sVar.f56023h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(sVar.f56023h);
            }
            sVar.f56022g.addView(sVar.f56023h, layoutParams2);
            if (!sVar.f56023h.hasFocus()) {
                sVar.f56023h.requestFocus();
            }
        } else {
            View view = sVar.f56024i;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i10 = -1;
                sVar.f56029n = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i10, -2, sVar.f56019d, sVar.f56020e, RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_LOAD_SUCCESS, 8519680, -3);
                layoutParams3.gravity = sVar.f56018c;
                layoutParams3.windowAnimations = sVar.f56021f;
                windowManager.addView(sVar.f56022g, layoutParams3);
                sVar.f56030o = true;
                if (sVar.f56016a != 0) {
                    f1();
                    return;
                }
                return;
            }
        }
        i10 = -2;
        sVar.f56029n = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i10, -2, sVar.f56019d, sVar.f56020e, RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_LOAD_SUCCESS, 8519680, -3);
        layoutParams32.gravity = sVar.f56018c;
        layoutParams32.windowAnimations = sVar.f56021f;
        windowManager.addView(sVar.f56022g, layoutParams32);
        sVar.f56030o = true;
        if (sVar.f56016a != 0) {
        }
    }

    @Override // m.AbstractC5484f
    public void Q(int i10) {
        this.f55963Y = i10;
    }

    public final AbstractC5479a Q0() {
        return this.f55974o;
    }

    @Override // m.AbstractC5484f
    public final void R(CharSequence charSequence) {
        this.f55978q = charSequence;
        C c10 = this.f55979r;
        if (c10 != null) {
            c10.setWindowTitle(charSequence);
            return;
        }
        if (Q0() != null) {
            Q0().E(charSequence);
            return;
        }
        TextView textView = this.f55943C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean R0(s sVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f56028m || S0(sVar, keyEvent)) && (eVar = sVar.f56025j) != null) {
            z10 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f55979r == null) {
            f0(sVar, true);
        }
        return z10;
    }

    @Override // m.AbstractC5484f
    public androidx.appcompat.view.b S(b.a aVar) {
        InterfaceC5482d interfaceC5482d;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f55982u;
        if (bVar != null) {
            bVar.c();
        }
        i iVar = new i(aVar);
        AbstractC5479a u10 = u();
        if (u10 != null) {
            androidx.appcompat.view.b F10 = u10.F(iVar);
            this.f55982u = F10;
            if (F10 != null && (interfaceC5482d = this.f55973n) != null) {
                interfaceC5482d.onSupportActionModeStarted(F10);
            }
        }
        if (this.f55982u == null) {
            this.f55982u = a1(iVar);
        }
        f1();
        return this.f55982u;
    }

    public final boolean S0(s sVar, KeyEvent keyEvent) {
        C c10;
        C c11;
        C c12;
        if (this.f55959V) {
            return false;
        }
        if (sVar.f56028m) {
            return true;
        }
        s sVar2 = this.f55953O;
        if (sVar2 != null && sVar2 != sVar) {
            f0(sVar2, false);
        }
        Window.Callback y02 = y0();
        if (y02 != null) {
            sVar.f56024i = y02.onCreatePanelView(sVar.f56016a);
        }
        int i10 = sVar.f56016a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (c12 = this.f55979r) != null) {
            c12.g();
        }
        if (sVar.f56024i == null && (!z10 || !(Q0() instanceof y))) {
            androidx.appcompat.view.menu.e eVar = sVar.f56025j;
            if (eVar == null || sVar.f56033r) {
                if (eVar == null && (!C0(sVar) || sVar.f56025j == null)) {
                    return false;
                }
                if (z10 && this.f55979r != null) {
                    if (this.f55980s == null) {
                        this.f55980s = new C0807h();
                    }
                    this.f55979r.e(sVar.f56025j, this.f55980s);
                }
                sVar.f56025j.i0();
                if (!y02.onCreatePanelMenu(sVar.f56016a, sVar.f56025j)) {
                    sVar.c(null);
                    if (z10 && (c10 = this.f55979r) != null) {
                        c10.e(null, this.f55980s);
                    }
                    return false;
                }
                sVar.f56033r = false;
            }
            sVar.f56025j.i0();
            Bundle bundle = sVar.f56034s;
            if (bundle != null) {
                sVar.f56025j.S(bundle);
                sVar.f56034s = null;
            }
            if (!y02.onPreparePanel(0, sVar.f56024i, sVar.f56025j)) {
                if (z10 && (c11 = this.f55979r) != null) {
                    c11.e(null, this.f55980s);
                }
                sVar.f56025j.h0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.f56031p = z11;
            sVar.f56025j.setQwertyMode(z11);
            sVar.f56025j.h0();
        }
        sVar.f56028m = true;
        sVar.f56029n = false;
        this.f55953O = sVar;
        return true;
    }

    public final void T0(boolean z10) {
        C c10 = this.f55979r;
        if (c10 == null || !c10.b() || (ViewConfiguration.get(this.f55970k).hasPermanentMenuKey() && !this.f55979r.h())) {
            s w02 = w0(0, true);
            w02.f56032q = true;
            f0(w02, false);
            P0(w02, null);
            return;
        }
        Window.Callback y02 = y0();
        if (this.f55979r.f() && z10) {
            this.f55979r.c();
            if (this.f55959V) {
                return;
            }
            y02.onPanelClosed(108, w0(0, true).f56025j);
            return;
        }
        if (y02 == null || this.f55959V) {
            return;
        }
        if (this.f55986x1 && (this.f55989y1 & 1) != 0) {
            this.f55971l.getDecorView().removeCallbacks(this.f55958T1);
            this.f55958T1.run();
        }
        s w03 = w0(0, true);
        androidx.appcompat.view.menu.e eVar = w03.f56025j;
        if (eVar == null || w03.f56033r || !y02.onPreparePanel(0, w03.f56024i, eVar)) {
            return;
        }
        y02.onMenuOpened(108, w03.f56025j);
        this.f55979r.d();
    }

    public final int U0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    public final boolean V(boolean z10) {
        return W(z10, true);
    }

    public void V0(Configuration configuration, u0.i iVar) {
        k.d(configuration, iVar);
    }

    public final boolean W(boolean z10, boolean z11) {
        if (this.f55959V) {
            return false;
        }
        int a02 = a0();
        int F02 = F0(this.f55970k, a02);
        u0.i Z10 = Build.VERSION.SDK_INT < 33 ? Z(this.f55970k) : null;
        if (!z11 && Z10 != null) {
            Z10 = v0(this.f55970k.getResources().getConfiguration());
        }
        boolean e12 = e1(F02, Z10, z10);
        if (a02 == 0) {
            u0(this.f55970k).e();
        } else {
            p pVar = this.f55967g1;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (a02 == 3) {
            t0(this.f55970k).e();
            return e12;
        }
        p pVar2 = this.f55976p1;
        if (pVar2 != null) {
            pVar2.a();
        }
        return e12;
    }

    public void W0(u0.i iVar) {
        k.c(iVar);
    }

    public final void X() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f55942B.findViewById(R.id.content);
        View decorView = this.f55971l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f55970k.obtainStyledAttributes(l.j.AppCompatTheme);
        obtainStyledAttributes.getValue(l.j.f55379x0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(l.j.f55383y0, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(l.j.f55371v0)) {
            obtainStyledAttributes.getValue(l.j.f55371v0, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(l.j.f55375w0)) {
            obtainStyledAttributes.getValue(l.j.f55375w0, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(l.j.f55363t0)) {
            obtainStyledAttributes.getValue(l.j.f55363t0, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(l.j.f55367u0)) {
            obtainStyledAttributes.getValue(l.j.f55367u0, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final boolean X0() {
        ViewGroup viewGroup;
        return this.f55941A && (viewGroup = this.f55942B) != null && viewGroup.isLaidOut();
    }

    public final void Y(Window window) {
        if (this.f55971l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.f55972m = nVar;
        window.setCallback(nVar);
        a0 u10 = a0.u(this.f55970k, null, sWindowBackgroundStyleable);
        Drawable h10 = u10.h(0);
        if (h10 != null) {
            window.setBackgroundDrawable(h10);
        }
        u10.x();
        this.f55971l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f55990y2 != null) {
            return;
        }
        O(null);
    }

    public final boolean Y0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f55971l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public u0.i Z(Context context) {
        u0.i t10;
        if (Build.VERSION.SDK_INT >= 33 || (t10 = AbstractC5484f.t()) == null) {
            return null;
        }
        u0.i v02 = v0(context.getApplicationContext().getResources().getConfiguration());
        u0.i b10 = w.b(t10, v02);
        return b10.e() ? v02 : b10;
    }

    public boolean Z0() {
        if (this.f55990y2 == null) {
            return false;
        }
        s w02 = w0(0, false);
        return (w02 != null && w02.f56030o) || this.f55982u != null;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        s p02;
        Window.Callback y02 = y0();
        if (y02 == null || this.f55959V || (p02 = p0(eVar.F())) == null) {
            return false;
        }
        return y02.onMenuItemSelected(p02.f56016a, menuItem);
    }

    public final int a0() {
        int i10 = this.f55962X;
        return i10 != -100 ? i10 : AbstractC5484f.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public androidx.appcompat.view.b a1(b.a aVar) {
        androidx.appcompat.view.b bVar;
        Context context;
        androidx.appcompat.view.b bVar2;
        InterfaceC5482d interfaceC5482d;
        m0();
        androidx.appcompat.view.b bVar3 = this.f55982u;
        if (bVar3 != null) {
            bVar3.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        InterfaceC5482d interfaceC5482d2 = this.f55973n;
        if (interfaceC5482d2 != null && !this.f55959V) {
            try {
                bVar = interfaceC5482d2.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
            }
            if (bVar == null) {
                this.f55982u = bVar;
            } else {
                if (this.f55983v == null) {
                    if (this.f55950J) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = this.f55970k.getTheme();
                        theme.resolveAttribute(AbstractC5335a.f54989d, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = this.f55970k.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context = new androidx.appcompat.view.d(this.f55970k, 0);
                            context.getTheme().setTo(newTheme);
                        } else {
                            context = this.f55970k;
                        }
                        this.f55983v = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, AbstractC5335a.f54991f);
                        this.f55984w = popupWindow;
                        C0.i.b(popupWindow, 2);
                        this.f55984w.setContentView(this.f55983v);
                        this.f55984w.setWidth(-1);
                        context.getTheme().resolveAttribute(AbstractC5335a.f54987b, typedValue, true);
                        this.f55983v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f55984w.setHeight(-2);
                        this.f55985x = new d();
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.f55942B.findViewById(l.f.f55104i);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(r0()));
                            this.f55983v = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.f55983v != null) {
                    m0();
                    this.f55983v.k();
                    androidx.appcompat.view.e eVar = new androidx.appcompat.view.e(this.f55983v.getContext(), this.f55983v, aVar, this.f55984w == null);
                    if (aVar.b(eVar, eVar.e())) {
                        eVar.k();
                        this.f55983v.h(eVar);
                        this.f55982u = eVar;
                        if (X0()) {
                            this.f55983v.setAlpha(0.0f);
                            C2102n0 b10 = AbstractC2082d0.f(this.f55983v).b(1.0f);
                            this.f55988y = b10;
                            b10.g(new e());
                        } else {
                            this.f55983v.setAlpha(1.0f);
                            this.f55983v.setVisibility(0);
                            if (this.f55983v.getParent() instanceof View) {
                                AbstractC2082d0.i0((View) this.f55983v.getParent());
                            }
                        }
                        if (this.f55984w != null) {
                            this.f55971l.getDecorView().post(this.f55985x);
                        }
                    } else {
                        this.f55982u = null;
                    }
                }
            }
            bVar2 = this.f55982u;
            if (bVar2 != null && (interfaceC5482d = this.f55973n) != null) {
                interfaceC5482d.onSupportActionModeStarted(bVar2);
            }
            f1();
            return this.f55982u;
        }
        bVar = null;
        if (bVar == null) {
        }
        bVar2 = this.f55982u;
        if (bVar2 != null) {
            interfaceC5482d.onSupportActionModeStarted(bVar2);
        }
        f1();
        return this.f55982u;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        T0(true);
    }

    public void b0(int i10, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i10 >= 0) {
                s[] sVarArr = this.mPanels;
                if (i10 < sVarArr.length) {
                    sVar = sVarArr[i10];
                }
            }
            if (sVar != null) {
                menu = sVar.f56025j;
            }
        }
        if ((sVar == null || sVar.f56030o) && !this.f55959V) {
            this.f55972m.d(this.f55971l.getCallback(), i10, menu);
        }
    }

    public final void b1() {
        if (this.f55941A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public void c0(androidx.appcompat.view.menu.e eVar) {
        if (this.f55952L) {
            return;
        }
        this.f55952L = true;
        this.f55979r.j();
        Window.Callback y02 = y0();
        if (y02 != null && !this.f55959V) {
            y02.onPanelClosed(108, eVar);
        }
        this.f55952L = false;
    }

    public final AbstractActivityC5481c c1() {
        for (Context context = this.f55970k; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AbstractActivityC5481c) {
                return (AbstractActivityC5481c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public final void d0() {
        p pVar = this.f55967g1;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.f55976p1;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d1(Configuration configuration) {
        Activity activity = (Activity) this.f55969j;
        if (activity instanceof InterfaceC2193s) {
            if (((InterfaceC2193s) activity).getLifecycle().b().b(AbstractC2185j.b.f20392c)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f55957T || this.f55959V) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    @Override // m.AbstractC5484f
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        n0();
        ((ViewGroup) this.f55942B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f55972m.c(this.f55971l.getCallback());
    }

    public void e0(int i10) {
        f0(w0(i10, true), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e1(int i10, u0.i iVar, boolean z10) {
        boolean z11;
        Configuration g02 = g0(this.f55970k, i10, iVar, null, false);
        int s02 = s0(this.f55970k);
        Configuration configuration = this.f55961W;
        if (configuration == null) {
            configuration = this.f55970k.getResources().getConfiguration();
        }
        int i11 = configuration.uiMode & 48;
        int i12 = g02.uiMode & 48;
        u0.i v02 = v0(configuration);
        u0.i v03 = iVar == null ? null : v0(g02);
        int i13 = i11 != i12 ? 512 : 0;
        if (v03 != null && !v02.equals(v03)) {
            i13 |= 8196;
        }
        boolean z12 = true;
        if (((~s02) & i13) != 0 && z10 && this.f55956R && (f55940S4 || this.f55957T)) {
            Object obj = this.f55969j;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                if (Build.VERSION.SDK_INT >= 31 && (i13 & 8192) != 0) {
                    ((Activity) this.f55969j).getWindow().getDecorView().setLayoutDirection(g02.getLayoutDirection());
                }
                androidx.core.app.b.e((Activity) this.f55969j);
                z11 = true;
                if (!z11 || i13 == 0) {
                    z12 = z11;
                } else {
                    g1(i12, v03, (i13 & s02) == i13, null);
                }
                if (z12) {
                    Object obj2 = this.f55969j;
                    if (obj2 instanceof AbstractActivityC5481c) {
                        if ((i13 & 512) != 0) {
                            ((AbstractActivityC5481c) obj2).onNightModeChanged(i10);
                        }
                        if ((i13 & 4) != 0) {
                            ((AbstractActivityC5481c) this.f55969j).onLocalesChanged(iVar);
                        }
                    }
                }
                if (v03 != null) {
                    W0(v0(this.f55970k.getResources().getConfiguration()));
                }
                return z12;
            }
        }
        z11 = false;
        if (z11) {
        }
        z12 = z11;
        if (z12) {
        }
        if (v03 != null) {
        }
        return z12;
    }

    @Override // m.AbstractC5484f
    public boolean f() {
        return V(true);
    }

    public void f0(s sVar, boolean z10) {
        ViewGroup viewGroup;
        C c10;
        if (z10 && sVar.f56016a == 0 && (c10 = this.f55979r) != null && c10.f()) {
            c0(sVar.f56025j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f55970k.getSystemService("window");
        if (windowManager != null && sVar.f56030o && (viewGroup = sVar.f56022g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                b0(sVar.f56016a, sVar, null);
            }
        }
        sVar.f56028m = false;
        sVar.f56029n = false;
        sVar.f56030o = false;
        sVar.f56023h = null;
        sVar.f56032q = true;
        if (this.f55953O == sVar) {
            this.f55953O = null;
        }
        if (sVar.f56016a == 0) {
            f1();
        }
    }

    public void f1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean Z02 = Z0();
            if (Z02 && this.f55955P4 == null) {
                this.f55955P4 = m.b(this.f55990y2, this);
            } else {
                if (Z02 || (onBackInvokedCallback = this.f55955P4) == null) {
                    return;
                }
                m.c(this.f55990y2, onBackInvokedCallback);
                this.f55955P4 = null;
            }
        }
    }

    public final Configuration g0(Context context, int i10, u0.i iVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            V0(configuration2, iVar);
        }
        return configuration2;
    }

    public final void g1(int i10, u0.i iVar, boolean z10, Configuration configuration) {
        Resources resources = this.f55970k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (iVar != null) {
            V0(configuration2, iVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            x.a(resources);
        }
        int i11 = this.f55963Y;
        if (i11 != 0) {
            this.f55970k.setTheme(i11);
            this.f55970k.getTheme().applyStyle(this.f55963Y, true);
        }
        if (z10 && (this.f55969j instanceof Activity)) {
            d1(configuration2);
        }
    }

    public final ViewGroup h0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f55970k.obtainStyledAttributes(l.j.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(l.j.f55351q0)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(l.j.f55387z0, false)) {
            I(1);
        } else if (obtainStyledAttributes.getBoolean(l.j.f55351q0, false)) {
            I(108);
        }
        if (obtainStyledAttributes.getBoolean(l.j.f55355r0, false)) {
            I(109);
        }
        if (obtainStyledAttributes.getBoolean(l.j.f55359s0, false)) {
            I(10);
        }
        this.f55950J = obtainStyledAttributes.getBoolean(l.j.f55331m0, false);
        obtainStyledAttributes.recycle();
        o0();
        this.f55971l.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f55970k);
        if (this.f55951K) {
            viewGroup = this.f55949I ? (ViewGroup) from.inflate(l.g.f55136o, (ViewGroup) null) : (ViewGroup) from.inflate(l.g.f55135n, (ViewGroup) null);
        } else if (this.f55950J) {
            viewGroup = (ViewGroup) from.inflate(l.g.f55127f, (ViewGroup) null);
            this.f55948H = false;
            this.f55947G = false;
        } else if (this.f55947G) {
            TypedValue typedValue = new TypedValue();
            this.f55970k.getTheme().resolveAttribute(AbstractC5335a.f54989d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f55970k, typedValue.resourceId) : this.f55970k).inflate(l.g.f55137p, (ViewGroup) null);
            C c10 = (C) viewGroup.findViewById(l.f.f55112q);
            this.f55979r = c10;
            c10.setWindowCallback(y0());
            if (this.f55948H) {
                this.f55979r.i(109);
            }
            if (this.f55945E) {
                this.f55979r.i(2);
            }
            if (this.f55946F) {
                this.f55979r.i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f55947G + ", windowActionBarOverlay: " + this.f55948H + ", android:windowIsFloating: " + this.f55950J + ", windowActionModeOverlay: " + this.f55949I + ", windowNoTitle: " + this.f55951K + " }");
        }
        AbstractC2082d0.x0(viewGroup, new b());
        if (this.f55979r == null) {
            this.f55943C = (TextView) viewGroup.findViewById(l.f.f55092N);
        }
        l0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(l.f.f55097b);
        ViewGroup viewGroup2 = (ViewGroup) this.f55971l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f55971l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    public final int h1(F0 f02, Rect rect) {
        boolean z10;
        boolean z11;
        int m10 = f02 != null ? f02.m() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f55983v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f55983v.getLayoutParams();
            if (this.f55983v.isShown()) {
                if (this.f55966b2 == null) {
                    this.f55966b2 = new Rect();
                    this.f55968g2 = new Rect();
                }
                Rect rect2 = this.f55966b2;
                Rect rect3 = this.f55968g2;
                if (f02 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(f02.k(), f02.m(), f02.l(), f02.j());
                }
                l0.a(this.f55942B, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                F0 G10 = AbstractC2082d0.G(this.f55942B);
                int k10 = G10 == null ? 0 : G10.k();
                int l10 = G10 == null ? 0 : G10.l();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.f55944D != null) {
                    View view = this.f55944D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != k10 || marginLayoutParams2.rightMargin != l10) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = k10;
                            marginLayoutParams2.rightMargin = l10;
                            this.f55944D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f55970k);
                    this.f55944D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = k10;
                    layoutParams.rightMargin = l10;
                    this.f55942B.addView(this.f55944D, -1, layoutParams);
                }
                View view3 = this.f55944D;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    i1(this.f55944D);
                }
                if (!this.f55949I && r5) {
                    m10 = 0;
                }
                z10 = r5;
                r5 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r5 = false;
            }
            if (r5) {
                this.f55983v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f55944D;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return m10;
    }

    @Override // m.AbstractC5484f
    public Context i(Context context) {
        Context context2;
        this.f55956R = true;
        int F02 = F0(context, a0());
        if (AbstractC5484f.x(context)) {
            AbstractC5484f.U(context);
        }
        u0.i Z10 = Z(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(g0(context2, F02, Z10, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context2).a(g0(context2, F02, Z10, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f55940S4) {
            return super.i(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration g02 = g0(context2, F02, Z10, !configuration2.equals(configuration3) ? q0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context2, l.i.f55163g);
        dVar.a(g02);
        try {
            if (context2.getTheme() != null) {
                k.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.i(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View i0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        if (this.f55977p2 == null) {
            TypedArray obtainStyledAttributes = this.f55970k.obtainStyledAttributes(l.j.AppCompatTheme);
            String string = obtainStyledAttributes.getString(l.j.f55346p0);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f55977p2 = new m.t();
            } else {
                try {
                    this.f55977p2 = (m.t) this.f55970k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f55977p2 = new m.t();
                }
            }
        }
        boolean z11 = f55939R4;
        boolean z12 = false;
        if (z11) {
            if (this.f55987x2 == null) {
                this.f55987x2 = new v();
            }
            if (this.f55987x2.a(attributeSet)) {
                z10 = true;
                return this.f55977p2.r(view, str, context, attributeSet, z10, z11, true, k0.d());
            }
            if (!(attributeSet instanceof XmlPullParser)) {
                z12 = Y0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z12 = true;
            }
        }
        z10 = z12;
        return this.f55977p2.r(view, str, context, attributeSet, z10, z11, true, k0.d());
    }

    public final void i1(View view) {
        view.setBackgroundColor((AbstractC2082d0.L(view) & 8192) != 0 ? AbstractC5338c.getColor(this.f55970k, l.c.f55014b) : AbstractC5338c.getColor(this.f55970k, l.c.f55013a));
    }

    public void j0() {
        androidx.appcompat.view.menu.e eVar;
        C c10 = this.f55979r;
        if (c10 != null) {
            c10.j();
        }
        if (this.f55984w != null) {
            this.f55971l.getDecorView().removeCallbacks(this.f55985x);
            if (this.f55984w.isShowing()) {
                try {
                    this.f55984w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f55984w = null;
        }
        m0();
        s w02 = w0(0, false);
        if (w02 == null || (eVar = w02.f56025j) == null) {
            return;
        }
        eVar.close();
    }

    public boolean k0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f55969j;
        if (((obj instanceof AbstractC2114u.a) || (obj instanceof m.r)) && (decorView = this.f55971l.getDecorView()) != null && AbstractC2114u.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f55972m.b(this.f55971l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? H0(keyCode, keyEvent) : K0(keyCode, keyEvent);
    }

    @Override // m.AbstractC5484f
    public View l(int i10) {
        n0();
        return this.f55971l.findViewById(i10);
    }

    public void l0(int i10) {
        s w02;
        s w03 = w0(i10, true);
        if (w03.f56025j != null) {
            Bundle bundle = new Bundle();
            w03.f56025j.U(bundle);
            if (bundle.size() > 0) {
                w03.f56034s = bundle;
            }
            w03.f56025j.i0();
            w03.f56025j.clear();
        }
        w03.f56033r = true;
        w03.f56032q = true;
        if ((i10 != 108 && i10 != 0) || this.f55979r == null || (w02 = w0(0, false)) == null) {
            return;
        }
        w02.f56028m = false;
        S0(w02, null);
    }

    public void m0() {
        C2102n0 c2102n0 = this.f55988y;
        if (c2102n0 != null) {
            c2102n0.c();
        }
    }

    @Override // m.AbstractC5484f
    public Context n() {
        return this.f55970k;
    }

    public final void n0() {
        if (this.f55941A) {
            return;
        }
        this.f55942B = h0();
        CharSequence x02 = x0();
        if (!TextUtils.isEmpty(x02)) {
            C c10 = this.f55979r;
            if (c10 != null) {
                c10.setWindowTitle(x02);
            } else if (Q0() != null) {
                Q0().E(x02);
            } else {
                TextView textView = this.f55943C;
                if (textView != null) {
                    textView.setText(x02);
                }
            }
        }
        X();
        O0(this.f55942B);
        this.f55941A = true;
        s w02 = w0(0, false);
        if (this.f55959V) {
            return;
        }
        if (w02 == null || w02.f56025j == null) {
            D0(108);
        }
    }

    public final void o0() {
        if (this.f55971l == null) {
            Object obj = this.f55969j;
            if (obj instanceof Activity) {
                Y(((Activity) obj).getWindow());
            }
        }
        if (this.f55971l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return i0(view, str, context, attributeSet);
    }

    @Override // m.AbstractC5484f
    public final InterfaceC5480b p() {
        return new f();
    }

    public s p0(Menu menu) {
        s[] sVarArr = this.mPanels;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            s sVar = sVarArr[i10];
            if (sVar != null && sVar.f56025j == menu) {
                return sVar;
            }
        }
        return null;
    }

    @Override // m.AbstractC5484f
    public int q() {
        return this.f55962X;
    }

    public final Context r0() {
        AbstractC5479a u10 = u();
        Context j10 = u10 != null ? u10.j() : null;
        return j10 == null ? this.f55970k : j10;
    }

    @Override // m.AbstractC5484f
    public MenuInflater s() {
        if (this.f55975p == null) {
            z0();
            AbstractC5479a abstractC5479a = this.f55974o;
            this.f55975p = new androidx.appcompat.view.g(abstractC5479a != null ? abstractC5479a.j() : this.f55970k);
        }
        return this.f55975p;
    }

    public final int s0(Context context) {
        if (!this.f55965b1 && (this.f55969j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f55969j.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f55964Z = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.f55964Z = 0;
            }
        }
        this.f55965b1 = true;
        return this.f55964Z;
    }

    public final p t0(Context context) {
        if (this.f55976p1 == null) {
            this.f55976p1 = new o(context);
        }
        return this.f55976p1;
    }

    @Override // m.AbstractC5484f
    public AbstractC5479a u() {
        z0();
        return this.f55974o;
    }

    public final p u0(Context context) {
        if (this.f55967g1 == null) {
            this.f55967g1 = new q(C5477A.a(context));
        }
        return this.f55967g1;
    }

    @Override // m.AbstractC5484f
    public void v() {
        LayoutInflater from = LayoutInflater.from(this.f55970k);
        if (from.getFactory() == null) {
            AbstractC2116v.a(from, this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C5486h) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public u0.i v0(Configuration configuration) {
        return k.b(configuration);
    }

    @Override // m.AbstractC5484f
    public void w() {
        if (Q0() == null || u().l()) {
            return;
        }
        D0(0);
    }

    public s w0(int i10, boolean z10) {
        s[] sVarArr = this.mPanels;
        if (sVarArr == null || sVarArr.length <= i10) {
            s[] sVarArr2 = new s[i10 + 1];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.mPanels = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i10];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i10);
        sVarArr[i10] = sVar2;
        return sVar2;
    }

    public final CharSequence x0() {
        Object obj = this.f55969j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f55978q;
    }

    @Override // m.AbstractC5484f
    public void y(Configuration configuration) {
        AbstractC5479a u10;
        if (this.f55947G && this.f55941A && (u10 = u()) != null) {
            u10.m(configuration);
        }
        C2053h.b().g(this.f55970k);
        this.f55961W = new Configuration(this.f55970k.getResources().getConfiguration());
        W(false, false);
    }

    public final Window.Callback y0() {
        return this.f55971l.getCallback();
    }

    @Override // m.AbstractC5484f
    public void z(Bundle bundle) {
        String str;
        this.f55956R = true;
        V(false);
        o0();
        Object obj = this.f55969j;
        if (obj instanceof Activity) {
            try {
                str = androidx.core.app.j.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC5479a Q02 = Q0();
                if (Q02 == null) {
                    this.f55960V1 = true;
                } else {
                    Q02.s(true);
                }
            }
            AbstractC5484f.d(this);
        }
        this.f55961W = new Configuration(this.f55970k.getResources().getConfiguration());
        this.f55957T = true;
    }

    public final void z0() {
        n0();
        if (this.f55947G && this.f55974o == null) {
            Object obj = this.f55969j;
            if (obj instanceof Activity) {
                this.f55974o = new C5478B((Activity) this.f55969j, this.f55948H);
            } else if (obj instanceof Dialog) {
                this.f55974o = new C5478B((Dialog) this.f55969j);
            }
            AbstractC5479a abstractC5479a = this.f55974o;
            if (abstractC5479a != null) {
                abstractC5479a.s(this.f55960V1);
            }
        }
    }

    public LayoutInflaterFactory2C5486h(Dialog dialog, InterfaceC5482d interfaceC5482d) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC5482d, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public LayoutInflaterFactory2C5486h(Context context, Window window, InterfaceC5482d interfaceC5482d, Object obj) {
        AbstractActivityC5481c c12;
        this.f55988y = null;
        this.f55991z = true;
        this.f55962X = -100;
        this.f55958T1 = new a();
        this.f55970k = context;
        this.f55973n = interfaceC5482d;
        this.f55969j = obj;
        if (this.f55962X == -100 && (obj instanceof Dialog) && (c12 = c1()) != null) {
            this.f55962X = c12.getDelegate().q();
        }
        if (this.f55962X == -100) {
            z.r rVar = f55938Q4;
            Integer num = (Integer) rVar.get(obj.getClass().getName());
            if (num != null) {
                this.f55962X = num.intValue();
                rVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            Y(window);
        }
        C2053h.h();
    }

    /* renamed from: m.h$c */
    public class c implements ContentFrameLayout.a {
        public c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            LayoutInflaterFactory2C5486h.this.j0();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }
    }

    @Override // m.AbstractC5484f
    public void D(Bundle bundle) {
    }

    public void O0(ViewGroup viewGroup) {
    }
}
