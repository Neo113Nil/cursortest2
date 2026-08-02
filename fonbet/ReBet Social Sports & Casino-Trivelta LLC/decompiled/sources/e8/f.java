package e8;

import T7.A;
import T7.C1665e;
import T7.C1682w;
import T7.Y;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.Profile;
import d8.AbstractC4021F;
import d8.AbstractC4022G;
import d8.AbstractC4023H;
import d8.EnumC4028d;
import d8.n;
import d8.w;
import d8.y;
import e8.f;
import e8.k;
import g6.AbstractC4348h;
import g6.AbstractC4353m;
import g6.C4331C;
import g6.InterfaceC4350j;
import g6.InterfaceC4354n;
import h6.C4470F;
import j.AbstractC5086b;
import j.InterfaceC5085a;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import n.AbstractC5596a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z6.AbstractC6931a;
import z6.AbstractC6932b;

/* loaded from: classes2.dex */
public abstract class f extends AbstractC4353m {

    /* renamed from: j, reason: collision with root package name */
    public boolean f45766j;

    /* renamed from: k, reason: collision with root package name */
    public String f45767k;

    /* renamed from: l, reason: collision with root package name */
    public String f45768l;

    /* renamed from: m, reason: collision with root package name */
    public final b f45769m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f45770n;

    /* renamed from: o, reason: collision with root package name */
    public k.c f45771o;

    /* renamed from: p, reason: collision with root package name */
    public d f45772p;

    /* renamed from: q, reason: collision with root package name */
    public long f45773q;

    /* renamed from: r, reason: collision with root package name */
    public k f45774r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC4348h f45775s;

    /* renamed from: t, reason: collision with root package name */
    public Lazy f45776t;

    /* renamed from: u, reason: collision with root package name */
    public Float f45777u;

    /* renamed from: v, reason: collision with root package name */
    public int f45778v;

    /* renamed from: w, reason: collision with root package name */
    public final String f45779w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4350j f45780x;

    /* renamed from: y, reason: collision with root package name */
    public AbstractC5086b f45781y;

    /* renamed from: z, reason: collision with root package name */
    public static final a f45765z = new a(null);

    /* renamed from: A, reason: collision with root package name */
    public static final String f45764A = f.class.getName();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public EnumC4028d f45782a = EnumC4028d.FRIENDS;

        /* renamed from: b, reason: collision with root package name */
        public List f45783b = CollectionsKt.emptyList();

        /* renamed from: c, reason: collision with root package name */
        public n f45784c = n.NATIVE_WITH_FALLBACK;

        /* renamed from: d, reason: collision with root package name */
        public String f45785d = "rerequest";

        /* renamed from: e, reason: collision with root package name */
        public y f45786e = y.FACEBOOK;

        /* renamed from: f, reason: collision with root package name */
        public boolean f45787f;

        /* renamed from: g, reason: collision with root package name */
        public String f45788g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f45789h;

        public final String a() {
            return this.f45785d;
        }

        public final EnumC4028d b() {
            return this.f45782a;
        }

        public final n c() {
            return this.f45784c;
        }

        public final y d() {
            return this.f45786e;
        }

        public final String e() {
            return this.f45788g;
        }

        public final List f() {
            return this.f45783b;
        }

        public final boolean g() {
            return this.f45789h;
        }

        public final boolean h() {
            return this.f45787f;
        }

        public final void i(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f45785d = str;
        }

        public final void j(EnumC4028d enumC4028d) {
            Intrinsics.checkNotNullParameter(enumC4028d, "<set-?>");
            this.f45782a = enumC4028d;
        }

        public final void k(n nVar) {
            Intrinsics.checkNotNullParameter(nVar, "<set-?>");
            this.f45784c = nVar;
        }

        public final void l(y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<set-?>");
            this.f45786e = yVar;
        }

        public final void m(String str) {
            this.f45788g = str;
        }

        public final void n(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f45783b = list;
        }

        public final void o(boolean z10) {
            this.f45789h = z10;
        }
    }

    public class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f45790a;

        public c(f this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f45790a = this$0;
        }

        public static final void g(w loginManager, DialogInterface dialogInterface, int i10) {
            if (Y7.a.d(c.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(loginManager, "$loginManager");
                loginManager.x();
            } catch (Throwable th2) {
                Y7.a.b(th2, c.class);
            }
        }

        public w b() {
            if (Y7.a.d(this)) {
                return null;
            }
            try {
                w c10 = w.f45121j.c();
                c10.G(this.f45790a.getDefaultAudience());
                c10.J(this.f45790a.getLoginBehavior());
                c10.K(c());
                c10.F(this.f45790a.getAuthType());
                c10.I(d());
                c10.N(this.f45790a.getShouldSkipAccountDeduplication());
                c10.L(this.f45790a.getMessengerPageId());
                c10.M(this.f45790a.getResetMessengerState());
                return c10;
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
                return null;
            }
        }

        public final y c() {
            if (Y7.a.d(this)) {
                return null;
            }
            try {
                return y.FACEBOOK;
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
                return null;
            }
        }

        public final boolean d() {
            Y7.a.d(this);
            return false;
        }

        public final void e() {
            if (Y7.a.d(this)) {
                return;
            }
            try {
                w b10 = b();
                AbstractC5086b abstractC5086b = this.f45790a.f45781y;
                if (abstractC5086b != null) {
                    w.c cVar = (w.c) abstractC5086b.a();
                    InterfaceC4350j callbackManager = this.f45790a.getCallbackManager();
                    if (callbackManager == null) {
                        callbackManager = new C1665e();
                    }
                    cVar.c(callbackManager);
                    abstractC5086b.b(this.f45790a.getProperties().f());
                    return;
                }
                if (this.f45790a.getFragment() != null) {
                    Fragment fragment = this.f45790a.getFragment();
                    if (fragment == null) {
                        return;
                    }
                    f fVar = this.f45790a;
                    b10.w(fragment, fVar.getProperties().f(), fVar.getLoggerID());
                    return;
                }
                if (this.f45790a.getNativeFragment() == null) {
                    b10.u(this.f45790a.getActivity(), this.f45790a.getProperties().f(), this.f45790a.getLoggerID());
                    return;
                }
                android.app.Fragment nativeFragment = this.f45790a.getNativeFragment();
                if (nativeFragment == null) {
                    return;
                }
                f fVar2 = this.f45790a;
                b10.v(nativeFragment, fVar2.getProperties().f(), fVar2.getLoggerID());
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
            }
        }

        public final void f(Context context) {
            String string;
            if (Y7.a.d(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                final w b10 = b();
                if (!this.f45790a.f45766j) {
                    b10.x();
                    return;
                }
                String string2 = this.f45790a.getResources().getString(AbstractC4021F.f45040d);
                Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.com_facebook_loginview_log_out_action)");
                String string3 = this.f45790a.getResources().getString(AbstractC4021F.f45037a);
                Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.com_facebook_loginview_cancel_action)");
                Profile b11 = Profile.INSTANCE.b();
                if ((b11 == null ? null : b11.getName()) != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String string4 = this.f45790a.getResources().getString(AbstractC4021F.f45042f);
                    Intrinsics.checkNotNullExpressionValue(string4, "resources.getString(R.string.com_facebook_loginview_logged_in_as)");
                    string = String.format(string4, Arrays.copyOf(new Object[]{b11.getName()}, 1));
                    Intrinsics.checkNotNullExpressionValue(string, "java.lang.String.format(format, *args)");
                } else {
                    string = this.f45790a.getResources().getString(AbstractC4021F.f45043g);
                    Intrinsics.checkNotNullExpressionValue(string, "{\n          resources.getString(R.string.com_facebook_loginview_logged_in_using_facebook)\n        }");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new DialogInterface.OnClickListener() { // from class: e8.g
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        f.c.g(w.this, dialogInterface, i10);
                    }
                }).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
                builder.create().show();
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v10) {
            if (Y7.a.d(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(v10, "v");
                this.f45790a.b(v10);
                AccessToken.Companion companion = AccessToken.INSTANCE;
                AccessToken e10 = companion.e();
                boolean g10 = companion.g();
                if (g10) {
                    Context context = this.f45790a.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    f(context);
                } else {
                    e();
                }
                C4470F c4470f = new C4470F(this.f45790a.getContext());
                Bundle bundle = new Bundle();
                bundle.putInt("logging_in", e10 != null ? 0 : 1);
                bundle.putInt("access_token_expired", g10 ? 1 : 0);
                c4470f.g("fb_login_view_usage", bundle);
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 e8.f$d, still in use, count: 1, list:
      (r0v0 e8.f$d) from 0x0032: SPUT (r0v0 e8.f$d) (LINE:51) e8.f.d.d e8.f$d
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class d {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);


        /* renamed from: d, reason: collision with root package name */
        public static final d f45792d = new d("automatic", 0);

        /* renamed from: a, reason: collision with root package name */
        public final String f45796a;

        /* renamed from: b, reason: collision with root package name */
        public final int f45797b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f45791c = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(int i10) {
                for (d dVar : d.values()) {
                    if (dVar.c() == i10) {
                        return dVar;
                    }
                }
                return null;
            }

            public final d b() {
                return d.f45792d;
            }

            public a() {
            }
        }

        static {
        }

        public d(String str, int i10) {
            this.f45796a = str;
            this.f45797b = i10;
        }

        public static d valueOf(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (d) Enum.valueOf(d.class, value);
        }

        public static d[] values() {
            d[] dVarArr = $VALUES;
            return (d[]) Arrays.copyOf(dVarArr, dVarArr.length);
        }

        public final int c() {
            return this.f45797b;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f45796a;
        }
    }

    public /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.AUTOMATIC.ordinal()] = 1;
            iArr[d.DISPLAY_ALWAYS.ordinal()] = 2;
            iArr[d.NEVER_DISPLAY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: e8.f$f, reason: collision with other inner class name */
    public static final class C0665f extends AbstractC4348h {
        public C0665f() {
        }

        @Override // g6.AbstractC4348h
        public void d(AccessToken accessToken, AccessToken accessToken2) {
            f.this.F();
            f.this.D();
        }
    }

    public static final class g extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final g f45799d = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w invoke() {
            return w.f45121j.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i10, int i11, String analyticsButtonCreatedEventName, String analyticsButtonTappedEventName) {
        super(context, attributeSet, i10, i11, analyticsButtonCreatedEventName, analyticsButtonTappedEventName);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyticsButtonCreatedEventName, "analyticsButtonCreatedEventName");
        Intrinsics.checkNotNullParameter(analyticsButtonTappedEventName, "analyticsButtonTappedEventName");
        this.f45769m = new b();
        this.f45771o = k.c.BLUE;
        this.f45772p = d.f45791c.b();
        this.f45773q = 6000L;
        this.f45776t = LazyKt.lazy(g.f45799d);
        this.f45778v = 255;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f45779w = uuid;
    }

    public static final void u(String appId, final f this$0) {
        Intrinsics.checkNotNullParameter(appId, "$appId");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final C1682w q10 = A.q(appId, false);
        this$0.getActivity().runOnUiThread(new Runnable() { // from class: e8.e
            @Override // java.lang.Runnable
            public final void run() {
                f.v(f.this, q10);
            }
        });
    }

    public static final void v(f this$0, C1682w c1682w) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H(c1682w);
    }

    public final void B(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            d.a aVar = d.f45791c;
            this.f45772p = aVar.b();
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC4023H.com_facebook_login_view, i10, i11);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context\n            .theme\n            .obtainStyledAttributes(\n                attrs, R.styleable.com_facebook_login_view, defStyleAttr, defStyleRes)");
            try {
                this.f45766j = obtainStyledAttributes.getBoolean(AbstractC4023H.f45046a, true);
                setLoginText(obtainStyledAttributes.getString(AbstractC4023H.f45049d));
                setLogoutText(obtainStyledAttributes.getString(AbstractC4023H.f45050e));
                d a10 = aVar.a(obtainStyledAttributes.getInt(AbstractC4023H.f45051f, aVar.b().c()));
                if (a10 == null) {
                    a10 = aVar.b();
                }
                this.f45772p = a10;
                if (obtainStyledAttributes.hasValue(AbstractC4023H.f45047b)) {
                    this.f45777u = Float.valueOf(obtainStyledAttributes.getDimension(AbstractC4023H.f45047b, 0.0f));
                }
                int integer = obtainStyledAttributes.getInteger(AbstractC4023H.f45048c, 255);
                this.f45778v = integer;
                int max = Math.max(0, integer);
                this.f45778v = max;
                this.f45778v = Math.min(255, max);
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            Y7.a.b(th3, this);
        }
    }

    public final void C(InterfaceC4350j callbackManager, InterfaceC4354n callback) {
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((w) this.f45776t.getValue()).C(callbackManager, callback);
        InterfaceC4350j interfaceC4350j = this.f45780x;
        if (interfaceC4350j == null) {
            this.f45780x = callbackManager;
        } else if (interfaceC4350j != callbackManager) {
            Log.w(f45764A, "You're registering a callback on the one Facebook login button with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    public final void D() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(AbstractC5596a.b(getContext(), AbstractC6932b.f68598a), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        r2 = ((android.graphics.drawable.StateListDrawable) r1).getStateCount();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E() {
        int stateCount;
        Drawable stateDrawable;
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Float f10 = this.f45777u;
            if (f10 == null) {
                return;
            }
            float floatValue = f10.floatValue();
            Drawable background = getBackground();
            if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable) && stateCount > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    stateDrawable = ((StateListDrawable) background).getStateDrawable(i10);
                    GradientDrawable gradientDrawable = stateDrawable instanceof GradientDrawable ? (GradientDrawable) stateDrawable : null;
                    if (gradientDrawable != null) {
                        gradientDrawable.setCornerRadius(floatValue);
                    }
                    if (i11 >= stateCount) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setCornerRadius(floatValue);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void F() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode() && AccessToken.INSTANCE.g()) {
                String str = this.f45768l;
                if (str == null) {
                    str = resources.getString(AbstractC4021F.f45041e);
                }
                setText(str);
                return;
            }
            String str2 = this.f45767k;
            if (str2 != null) {
                setText(str2);
                return;
            }
            String string = resources.getString(getLoginButtonContinueLabel());
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(loginButtonContinueLabel)");
            int width = getWidth();
            if (width != 0 && z(string) > width) {
                string = resources.getString(AbstractC4021F.f45038b);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.com_facebook_loginview_log_in_button)");
            }
            setText(string);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void G() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            getBackground().setAlpha(this.f45778v);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void H(C1682w c1682w) {
        if (Y7.a.d(this) || c1682w == null) {
            return;
        }
        try {
            if (c1682w.i() && getVisibility() == 0) {
                x(c1682w.h());
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // g6.AbstractC4353m
    public void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            super.c(context, attributeSet, i10, i11);
            setInternalOnClickListener(getNewLoginClickListener());
            B(context, attributeSet, i10, i11);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(AbstractC6931a.f68597a));
                setLoginText("Continue with Facebook");
            } else {
                this.f45775s = new C0665f();
            }
            F();
            E();
            G();
            D();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @NotNull
    public final String getAuthType() {
        return this.f45769m.a();
    }

    @Nullable
    public final InterfaceC4350j getCallbackManager() {
        return this.f45780x;
    }

    @NotNull
    public final EnumC4028d getDefaultAudience() {
        return this.f45769m.b();
    }

    @Override // g6.AbstractC4353m
    public int getDefaultRequestCode() {
        if (Y7.a.d(this)) {
            return 0;
        }
        try {
            return C1665e.c.Login.b();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return 0;
        }
    }

    @Override // g6.AbstractC4353m
    public int getDefaultStyleResource() {
        return AbstractC4022G.f45045a;
    }

    @NotNull
    public final String getLoggerID() {
        return this.f45779w;
    }

    @NotNull
    public final n getLoginBehavior() {
        return this.f45769m.c();
    }

    public final int getLoginButtonContinueLabel() {
        return AbstractC4021F.f45039c;
    }

    @NotNull
    public final Lazy<w> getLoginManagerLazy() {
        return this.f45776t;
    }

    @NotNull
    public final y getLoginTargetApp() {
        return this.f45769m.d();
    }

    @Nullable
    public final String getLoginText() {
        return this.f45767k;
    }

    @Nullable
    public final String getLogoutText() {
        return this.f45768l;
    }

    @Nullable
    public final String getMessengerPageId() {
        return this.f45769m.e();
    }

    @NotNull
    public c getNewLoginClickListener() {
        return new c(this);
    }

    @NotNull
    public final List<String> getPermissions() {
        return this.f45769m.f();
    }

    @NotNull
    public final b getProperties() {
        return this.f45769m;
    }

    public final boolean getResetMessengerState() {
        return this.f45769m.g();
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.f45769m.h();
    }

    public final long getToolTipDisplayTime() {
        return this.f45773q;
    }

    @NotNull
    public final d getToolTipMode() {
        return this.f45772p;
    }

    @NotNull
    public final k.c getToolTipStyle() {
        return this.f45771o;
    }

    @Override // g6.AbstractC4353m, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (getContext() instanceof j.e) {
                Object context = getContext();
                if (context == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                }
                this.f45781y = ((j.e) context).getActivityResultRegistry().m("facebook-login", ((w) this.f45776t.getValue()).i(this.f45780x, this.f45779w), new InterfaceC5085a() { // from class: e8.d
                    @Override // j.InterfaceC5085a
                    public final void a(Object obj) {
                        f.A((InterfaceC4350j.a) obj);
                    }
                });
            }
            AbstractC4348h abstractC4348h = this.f45775s;
            if (abstractC4348h != null && abstractC4348h.c()) {
                abstractC4348h.e();
                F();
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            AbstractC5086b abstractC5086b = this.f45781y;
            if (abstractC5086b != null) {
                abstractC5086b.d();
            }
            AbstractC4348h abstractC4348h = this.f45775s;
            if (abstractC4348h != null) {
                abstractC4348h.f();
            }
            w();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // g6.AbstractC4353m, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            super.onDraw(canvas);
            if (this.f45770n || isInEditMode()) {
                return;
            }
            this.f45770n = true;
            t();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            F();
        } catch (Throwable th3) {
            th = th3;
            Y7.a.b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int y10 = y(i10);
            String str = this.f45768l;
            if (str == null) {
                str = resources.getString(AbstractC4021F.f45041e);
                Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.com_facebook_loginview_log_out_button)");
            }
            setMeasuredDimension(View.resolveSize(Math.max(y10, z(str)), i10), compoundPaddingTop);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View changedView, int i10) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(changedView, "changedView");
            super.onVisibilityChanged(changedView, i10);
            if (i10 != 0) {
                w();
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void setAuthType(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f45769m.i(value);
    }

    public final void setDefaultAudience(@NotNull EnumC4028d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f45769m.j(value);
    }

    public final void setLoginBehavior(@NotNull n value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f45769m.k(value);
    }

    public final void setLoginManagerLazy(@NotNull Lazy<? extends w> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.f45776t = lazy;
    }

    public final void setLoginTargetApp(@NotNull y value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f45769m.l(value);
    }

    public final void setLoginText(@Nullable String str) {
        this.f45767k = str;
        F();
    }

    public final void setLogoutText(@Nullable String str) {
        this.f45768l = str;
        F();
    }

    public final void setMessengerPageId(@Nullable String str) {
        this.f45769m.m(str);
    }

    public final void setPermissions(@NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f45769m.n(CollectionsKt.listOfNotNull(Arrays.copyOf(permissions, permissions.length)));
    }

    @Deprecated(message = "Use setPermissions instead", replaceWith = @ReplaceWith(expression = "setPermissions", imports = {}))
    public final void setPublishPermissions(@NotNull List<String> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f45769m.n(permissions);
    }

    @Deprecated(message = "Use setPermissions instead", replaceWith = @ReplaceWith(expression = "setPermissions", imports = {}))
    public final void setReadPermissions(@NotNull List<String> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f45769m.n(permissions);
    }

    public final void setResetMessengerState(boolean z10) {
        this.f45769m.o(z10);
    }

    public final void setToolTipDisplayTime(long j10) {
        this.f45773q = j10;
    }

    public final void setToolTipMode(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f45772p = dVar;
    }

    public final void setToolTipStyle(@NotNull k.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f45771o = cVar;
    }

    public final void t() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            int i10 = e.$EnumSwitchMapping$0[this.f45772p.ordinal()];
            if (i10 == 1) {
                Y y10 = Y.f11042a;
                final String J10 = Y.J(getContext());
                C4331C.t().execute(new Runnable() { // from class: e8.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.u(J10, this);
                    }
                });
            } else {
                if (i10 != 2) {
                    return;
                }
                String string = getResources().getString(AbstractC4021F.f45044h);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.com_facebook_tooltip_default)");
                x(string);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void w() {
        k kVar = this.f45774r;
        if (kVar != null) {
            kVar.d();
        }
        this.f45774r = null;
    }

    public final void x(String str) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            k kVar = new k(str, this);
            kVar.h(this.f45771o);
            kVar.g(this.f45773q);
            kVar.i();
            this.f45774r = kVar;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final int y(int i10) {
        if (Y7.a.d(this)) {
            return 0;
        }
        try {
            Resources resources = getResources();
            String str = this.f45767k;
            if (str == null) {
                str = resources.getString(AbstractC4021F.f45039c);
                int z10 = z(str);
                if (View.resolveSize(z10, i10) < z10) {
                    str = resources.getString(AbstractC4021F.f45038b);
                }
            }
            return z(str);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return 0;
        }
    }

    public final int z(String str) {
        if (Y7.a.d(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + f(str) + getCompoundPaddingRight();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return 0;
        }
    }

    public final void setPermissions(@NotNull List<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f45769m.n(value);
    }

    @Deprecated(message = "Use setPermissions instead", replaceWith = @ReplaceWith(expression = "setPermissions", imports = {}))
    public final void setPublishPermissions(@NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f45769m.n(CollectionsKt.listOfNotNull(Arrays.copyOf(permissions, permissions.length)));
    }

    @Deprecated(message = "Use setPermissions instead", replaceWith = @ReplaceWith(expression = "setPermissions", imports = {}))
    public final void setReadPermissions(@NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f45769m.n(CollectionsKt.listOfNotNull(Arrays.copyOf(permissions, permissions.length)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        this(context, null, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void A(InterfaceC4350j.a aVar) {
    }
}
