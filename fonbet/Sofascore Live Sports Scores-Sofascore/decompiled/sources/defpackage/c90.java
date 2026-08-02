package defpackage;

import android.R;
import android.app.Application;
import android.app.Dialog;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteAction;
import android.app.job.JobParameters;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.TypefaceSpan;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.Window;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.drawable.IconCompat;
import com.adsbynimbus.render.mraid.Host;
import com.unity3d.ads.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class c90 {
    public static String a;

    public static int A(Notification.Action action) {
        return action.getSemanticAction();
    }

    public static PrecomputedText.Params B(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static int C(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri D(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static ClassLoader E() {
        return WebView.getWebViewClassLoader();
    }

    public static boolean F(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasCapability(i);
    }

    public static boolean G(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasTransport(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String H() {
        String processName;
        String str;
        if (TextUtils.isEmpty(a)) {
            String str2 = null;
            if (Build.VERSION.SDK_INT >= 28) {
                try {
                    processName = Application.getProcessName();
                } catch (Throwable unused) {
                }
                a = processName;
                if (TextUtils.isEmpty(processName)) {
                    str = a;
                } else {
                    try {
                        Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                        declaredMethod.setAccessible(true);
                        Object invoke = declaredMethod.invoke(null, null);
                        if (invoke instanceof String) {
                            str2 = (String) invoke;
                        }
                    } catch (Throwable unused2) {
                    }
                    a = str2;
                    str = !TextUtils.isEmpty(str2) ? a : a;
                }
            }
            processName = null;
            a = processName;
            if (TextUtils.isEmpty(processName)) {
            }
        } else {
            str = a;
        }
        return (TextUtils.isEmpty(str) || !str.contains(":")) ? str : str.replace(":", "_");
    }

    public static void I(View view) {
        view.resetPivot();
    }

    public static byte J(dib dibVar) {
        return Character.getDirectionality(Character.codePointAt(DecimalFormatSymbols.getInstance(dibVar.a).getDigitStrings()[0], 0));
    }

    public static int K(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int L(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int M(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int N(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static void O(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void P(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    public static void Q(int i, View view) {
        view.setOutlineAmbientShadowColor(i);
    }

    public static void R(int i, View view) {
        view.setOutlineSpotShadowColor(i);
    }

    public static void S(Notification.Action.Builder builder, int i) {
        builder.setSemanticAction(i);
    }

    public static final void T(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    public static boolean U(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static Person V(nfe nfeVar) {
        Person.Builder name = new Person.Builder().setName(nfeVar.a);
        IconCompat iconCompat = nfeVar.b;
        return name.setIcon(iconCompat != null ? n9e.L(iconCompat, null) : null).setUri(nfeVar.c).setKey(nfeVar.d).setBot(nfeVar.e).setImportant(nfeVar.f).build();
    }

    public static void a(Menu menu, int i, Context context, TextClassification textClassification, int i2) {
        if (i2 < 0) {
            MenuItem add = menu.add(R.id.textAssist, R.id.textAssist, i, textClassification.getLabel());
            add.setShowAsAction(2);
            add.setIcon(textClassification.getIcon());
            add.setOnMenuItemClickListener(new q30(r0, context, textClassification));
            return;
        }
        r0 = i2 != 0 ? 0 : 1;
        final RemoteAction remoteAction = textClassification.getActions().get(i2);
        MenuItem add2 = menu.add(R.id.textAssist, r0 != 0 ? 16908353 : 0, i, remoteAction.getTitle());
        add2.setShowAsAction(r0 == 0 ? 0 : 2);
        if (r0 != 0 || remoteAction.shouldShowIcon()) {
            add2.setIcon(remoteAction.getIcon().loadDrawable(context));
        }
        add2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ffj
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                PendingIntent actionIntent = remoteAction.getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    q9.D(actionIntent);
                    return true;
                }
                actionIntent.send();
                return true;
            }
        });
    }

    public static void b(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static final void c(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(xdi xdiVar) {
        Host n = xdiVar.n();
        lcd lcdVar = xdiVar.l;
        u2g u2gVar = null;
        if (Intrinsics.c(n.State, BuildConfig.FLAVOR)) {
            WebView webView = (WebView) lcdVar.findViewById(com.sofascore.results.R.id.nimbus_web_view);
            if (webView != null) {
                StringBuilder sb = new StringBuilder();
                t33.h("hidden", sb);
                t33.e("hidden", sb);
                webView.evaluateJavascript(sb.toString(), null);
            }
            xdiVar.a();
            return;
        }
        try {
            p2g p2gVar = w2g.b;
            if (Intrinsics.c(xdiVar.n().State, "expanded")) {
                ViewParent parent = lcdVar.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(lcdVar);
                }
                View findViewById = lcdVar.findViewById(com.sofascore.results.R.id.nimbus_close);
                if (findViewById != null) {
                    lcdVar.removeView(findViewById);
                }
                Object tag = lcdVar.getTag(com.sofascore.results.R.id.placeholder);
                View view = tag instanceof View ? (View) tag : null;
                if (view != null) {
                    lcdVar.setLayoutParams(view.getLayoutParams());
                    ViewParent parent2 = view.getParent();
                    parent2.getClass();
                    ViewGroup viewGroup2 = (ViewGroup) parent2;
                    viewGroup2.removeView(view);
                    viewGroup2.addView(lcdVar);
                }
                Object tag2 = lcdVar.getTag(com.sofascore.results.R.id.expand_container);
                Dialog dialog = tag2 instanceof Dialog ? (Dialog) tag2 : null;
                if (dialog != null) {
                    dialog.dismiss();
                }
                lcdVar.setTag(com.sofascore.results.R.id.expand_container, null);
            }
            WebView webView2 = (WebView) lcdVar.findViewById(com.sofascore.results.R.id.nimbus_web_view);
            if (webView2 != 0) {
                webView2.addOnLayoutChangeListener(new ns3(webView2, xdiVar));
                DisplayMetrics displayMetrics = webView2.getResources().getDisplayMetrics();
                ViewGroup.LayoutParams layoutParams = webView2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                displayMetrics.getClass();
                layoutParams.width = iz8.s(displayMetrics, xdiVar.n().DefaultPosition.a);
                layoutParams.height = iz8.s(displayMetrics, xdiVar.n().DefaultPosition.b);
                webView2.setLayoutParams(layoutParams);
                u2gVar = webView2;
            }
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (w2g.a(u2gVar) != null) {
            xdiVar.a();
        }
    }

    public static Typeface e(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static Handler f(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler g(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler h(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Bitmap i(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    public static nad j(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException unused) {
                rik o = rik.o();
                int i2 = nad.b;
                int i3 = nad.b;
                o.getClass();
            }
        }
        int[] iArr3 = pd0.j;
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr3[i4];
            if (!ph0.s(i5, iArr)) {
                try {
                    builder.removeCapability(i5);
                } catch (IllegalArgumentException unused2) {
                    rik o2 = rik.o();
                    int i6 = nad.b;
                    int i7 = nad.b;
                    o2.getClass();
                }
            }
        }
        for (int i8 : iArr2) {
            builder.addTransportType(i8);
        }
        NetworkRequest build = builder.build();
        build.getClass();
        return new nad(build);
    }

    public static TextClassifier k(Context context, u2h u2hVar) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int ordinal = u2hVar.ordinal();
        if (ordinal == 0) {
            str = "edittext";
        } else {
            if (ordinal != 1) {
                zzl.b();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static TypefaceSpan l(Typeface typeface) {
        return new TypefaceSpan(typeface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(xdi xdiVar) {
        u2g u2gVar;
        Host n = xdiVar.n();
        lcd lcdVar = xdiVar.l;
        try {
            p2g p2gVar = w2g.b;
            DisplayMetrics displayMetrics = lcdVar.getResources().getDisplayMetrics();
            displayMetrics.getClass();
            int s = iz8.s(displayMetrics, n.ExpandProperties.a);
            int s2 = iz8.s(displayMetrics, n.ExpandProperties.b);
            ViewParent parent = lcdVar.getParent();
            parent.getClass();
            ViewGroup viewGroup = (ViewGroup) parent;
            View view = new View(lcdVar.getContext());
            view.setLayoutParams(lcdVar.getLayoutParams());
            viewGroup.addView(view);
            lcdVar.setTag(com.sofascore.results.R.id.placeholder, view);
            viewGroup.removeView(lcdVar);
            Dialog dialog = new Dialog(lcdVar.getContext(), com.sofascore.results.R.style.NimbusContainer);
            dialog.setCancelable(false);
            Window window = dialog.getWindow();
            int i = 1;
            if (window != null) {
                ad2 ad2Var = oc3.a;
                if (Build.VERSION.SDK_INT >= 28) {
                    window.getAttributes().layoutInDisplayCutoutMode = 1;
                }
                bea.L(window, false);
                bal j = bsk.j(window.getDecorView());
                if (j != null) {
                    j.b(true);
                    j.c();
                    j.a(519);
                }
            }
            dialog.setContentView(lcdVar, new ViewGroup.LayoutParams(-1, -1));
            lcdVar.setTag(com.sofascore.results.R.id.expand_container, dialog);
            ImageButton imageButton = new ImageButton(lcdVar.getContext());
            int a2 = lcdVar.a(8);
            imageButton.setId(com.sofascore.results.R.id.nimbus_close);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388613);
            layoutParams.setMargins(a2, a2, a2, a2);
            imageButton.setLayoutParams(layoutParams);
            String str = gcd.a;
            imageButton.setImageResource(R.drawable.ic_menu_close_clear_cancel);
            imageButton.setContentDescription(imageButton.getContext().getString(com.sofascore.results.R.string.nimbus_dismiss));
            imageButton.setPadding(a2, a2, a2, a2);
            imageButton.setOnClickListener(new s0(xdiVar, 29));
            lcdVar.addView(imageButton);
            lcdVar.setScaleX(1.0f);
            lcdVar.setScaleY(1.0f);
            WebView webView = (WebView) lcdVar.findViewById(com.sofascore.results.R.id.nimbus_web_view);
            if (webView != null) {
                webView.addOnLayoutChangeListener(new v03(webView, i, n));
                ViewGroup.LayoutParams layoutParams2 = webView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.width = s;
                layoutParams2.height = s2;
                webView.setLayoutParams(layoutParams2);
            }
            dialog.show();
            u2gVar = lcdVar;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a3 = w2g.a(u2gVar);
        if (a3 != null) {
            cjb.a(a3.getMessage());
            WebView webView2 = (WebView) lcdVar.findViewById(com.sofascore.results.R.id.nimbus_web_view);
            if (webView2 != null) {
                StringBuilder sb = new StringBuilder();
                t33.b("error expanding ad", sb);
                webView2.evaluateJavascript(sb.toString(), null);
            }
        }
    }

    public static List n(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static final DisplayCutout o(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
            return null;
        } catch (Exception e) {
            if (!(e instanceof ClassNotFoundException) && !(e instanceof NoSuchMethodException) && !(e instanceof NoSuchFieldException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException) && !(e instanceof InstantiationException)) {
                throw e;
            }
            u02.h7.getClass();
            return null;
        }
    }

    public static String[] p(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long q(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static Executor r(Context context) {
        return context.getMainExecutor();
    }

    public static Network s(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }

    public static String t() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static int u(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String v(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int w(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int x(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int y(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int z(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
