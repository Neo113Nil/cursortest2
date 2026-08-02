package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.google.gson.Gson;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m0m extends WebView {
    public static final /* synthetic */ int e = 0;
    public String a;
    public String b;
    public cim c;
    public final ldm d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0m(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.d = new ldm();
        try {
            setBackgroundColor(0);
            setLayerType(1, null);
            setFocusable(true);
            setFocusableInTouchMode(true);
            getSettings().setJavaScriptEnabled(true);
            setScrollBarStyle(0);
            getSettings().setCacheMode(-1);
            getSettings().setMixedContentMode(0);
            getSettings().setSupportMultipleWindows(false);
            setWebViewClient(new lsl(this));
            setWebChromeClient(new jwl());
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static final void a(m0m m0mVar, Function0 function0) {
        String str = m0mVar.a;
        if (Intrinsics.c(str, str)) {
            evl.dispatchOnMain$default(BlazeSDK.INSTANCE, null, new c4m(function0, null), 1, null);
        }
    }

    public final void b(String str, String str2, String str3, String str4, String str5, cim cimVar) {
        w1l.y(str, str2, str3, str4);
        this.d.getClass();
        this.a = str;
        this.c = cimVar;
        removeJavascriptInterface("appInterface");
        addJavascriptInterface(new pcm(this.a, this), "appInterface");
        String str6 = "'" + str5 + '\'';
        if (str5 == null) {
            str6 = null;
        }
        String str7 = (String) vym.b.get(str);
        if (str7 != null) {
            str3 = str7;
        }
        String json = new Gson().toJson(BlazeSDK.INSTANCE.getHostingAppContext().getContext());
        StringBuilder s = mz1.s("javascript:initInteractionAsync(", str3, ", ", str4, ", ");
        s.append(str6);
        s.append(", ");
        s.append(json);
        s.append(')');
        this.b = s.toString();
        loadUrl(str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0m(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ m0m(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0m(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
