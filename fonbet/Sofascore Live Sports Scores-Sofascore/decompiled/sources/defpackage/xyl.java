package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xyl extends WebView {
    public static final a f = new a(null);
    public String a;
    public boolean b;
    public boolean c;
    public Function0 d;
    public final ldm e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyl(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.e = new ldm();
        try {
            setBackgroundColor(0);
            setLayerType(1, null);
            WebSettings settings = getSettings();
            settings.setJavaScriptEnabled(true);
            setScrollBarStyle(0);
            settings.setCacheMode(-1);
            settings.setMixedContentMode(0);
            settings.setSupportMultipleWindows(false);
            setWebViewClient(new qql(this));
            setWebChromeClient(new zul());
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static void loadAndInitialize$default(xyl xylVar, String str, Function0 function0, int i, Object obj) {
        uul uulVar;
        if ((i & 1) != 0) {
            str = null;
        }
        xylVar.getClass();
        function0.getClass();
        f.getClass();
        tul tulVar = jdm.d;
        String str2 = (tulVar == null || (uulVar = tulVar.a) == null) ? null : uulVar.j;
        if (str2 != null) {
            String str3 = StringsKt.R(str2) ? null : str2;
            if (str3 == null) {
                return;
            }
            xylVar.e.getClass();
            xylVar.d = function0;
            xylVar.removeJavascriptInterface("appInterface");
            xylVar.addJavascriptInterface(new p8m(xylVar), "appInterface");
            xylVar.a = str != null ? dmi.j(')', "javascript:safeInitAsync(", str) : "javascript:safeInitAsync()";
            xylVar.loadUrl(str3);
        }
    }

    public final void a() {
        if (this.b) {
            this.b = false;
            clearAnimation();
            setVisibility(4);
        }
    }

    public final void b(double d) {
        evaluateJavascript("updateCaptionsTime(" + d + ");", null);
    }

    public final void c(String str) {
        evaluateJavascript("javascript:loadCaptions('" + str + "')", null);
    }

    public final void d() {
        if (this.b) {
            return;
        }
        this.b = true;
        setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.blaze_anim_fade_in);
        loadAnimation.setDuration(250L);
        startAnimation(loadAnimation);
        this.e.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void setCurrentlyShowing(boolean z) {
        this.b = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xyl(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ xyl(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xyl(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
