package com.facebook.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.U3;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.e1l;
import defpackage.wt3;
import defpackage.zhg;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class s0 extends Dialog {
    public static volatile int m;
    public String a;
    public String b;
    public o0 c;
    public e1l d;
    public ProgressDialog e;
    public ImageView f;
    public FrameLayout g;
    public final q0 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public WindowManager.LayoutParams l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(FragmentActivity fragmentActivity, String str, Bundle bundle, int i, o0 o0Var) {
        super(fragmentActivity, m);
        Uri a;
        h.k();
        this.b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = k0.x(fragmentActivity) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString(U3.i.d, "touch");
        bundle.putString("client_id", com.facebook.w.b());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"18.3.0"}, 1)));
        this.c = o0Var;
        if (str.equals("share") && bundle.containsKey(U3.i.I0)) {
            this.h = new q0(this, str, bundle);
            return;
        }
        if (r0.a[wt3.C(i)] == 1) {
            a = k0.a(k0.q(), bundle, "oauth/authorize");
        } else {
            a = k0.a(k0.o(), bundle, com.facebook.w.d() + "/dialog/" + str);
        }
        this.a = a.toString();
    }

    public static int a(int i, float f, int i2, int i3) {
        int i4 = (int) (i / f);
        return (int) (i * (i4 <= i2 ? 1.0d : i4 >= i3 ? 0.5d : (((i3 - i4) / (i3 - i2)) * 0.5d) + 0.5d));
    }

    public static final void b(FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = fragmentActivity.getPackageManager().getApplicationInfo(fragmentActivity.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) != null && m == 0) {
                int i = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i == 0) {
                    i = R.style.com_facebook_activity_theme;
                }
                m = i;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public Bundle c(String str) {
        Uri parse = Uri.parse(str);
        Bundle F = k0.F(parse.getQuery());
        F.putAll(k0.F(parse.getFragment()));
        return F;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.c == null || this.i) {
            return;
        }
        e(new com.facebook.s());
    }

    public final void d() {
        Object systemService = getContext().getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i < i2) {
            i = i2;
        }
        int min = Math.min(a(i3, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int min2 = Math.min(a(i, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(min, min2);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        e1l e1lVar = this.d;
        if (e1lVar != null) {
            e1lVar.stopLoading();
        }
        if (!this.j && (progressDialog = this.e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final void e(Exception exc) {
        if (this.c == null || this.i) {
            return;
        }
        this.i = true;
        com.facebook.q qVar = exc instanceof com.facebook.q ? (com.facebook.q) exc : new com.facebook.q(exc);
        o0 o0Var = this.c;
        if (o0Var != null) {
            o0Var.a(null, qVar);
        }
        dismiss();
    }

    public final void f(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        e1l e1lVar = new e1l(getContext());
        this.d = e1lVar;
        e1lVar.setVerticalScrollBarEnabled(false);
        e1l e1lVar2 = this.d;
        if (e1lVar2 != null) {
            e1lVar2.setHorizontalScrollBarEnabled(false);
        }
        e1l e1lVar3 = this.d;
        int i2 = 1;
        if (e1lVar3 != null) {
            e1lVar3.setWebViewClient(new zhg(this, i2));
        }
        e1l e1lVar4 = this.d;
        WebSettings settings = e1lVar4 != null ? e1lVar4.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        e1l e1lVar5 = this.d;
        if (e1lVar5 != null) {
            String str = this.a;
            if (str == null) {
                a70.r("Required value was null.");
                return;
            }
            e1lVar5.loadUrl(str);
        }
        e1l e1lVar6 = this.d;
        if (e1lVar6 != null) {
            e1lVar6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        e1l e1lVar7 = this.d;
        if (e1lVar7 != null) {
            e1lVar7.setVisibility(4);
        }
        e1l e1lVar8 = this.d;
        WebSettings settings2 = e1lVar8 != null ? e1lVar8.getSettings() : null;
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        e1l e1lVar9 = this.d;
        WebSettings settings3 = e1lVar9 != null ? e1lVar9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        e1l e1lVar10 = this.d;
        if (e1lVar10 != null) {
            e1lVar10.setFocusable(true);
        }
        e1l e1lVar11 = this.d;
        if (e1lVar11 != null) {
            e1lVar11.setFocusableInTouchMode(true);
        }
        e1l e1lVar12 = this.d;
        if (e1lVar12 != null) {
            e1lVar12.setOnTouchListener(new l0());
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.j = false;
        Context context = getContext();
        context.getClass();
        context.getClass();
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled() && (layoutParams = this.l) != null) {
            if ((layoutParams != null ? layoutParams.token : null) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.l;
                Objects.toString(layoutParams2 != null ? layoutParams2.token : null);
                com.facebook.w wVar = com.facebook.w.a;
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.internal.m0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    s0.this.cancel();
                }
            });
        }
        requestWindowFeature(1);
        this.g = new FrameLayout(getContext());
        d();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f = imageView;
        imageView.setOnClickListener(new n0(this, 0));
        Drawable drawable = getContext().getResources().getDrawable(2131231302);
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.a != null) {
            ImageView imageView4 = this.f;
            if (imageView4 == null) {
                a70.r("Required value was null.");
                return;
            }
            f((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            frameLayout.addView(this.f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.g;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
        } else {
            a70.r("Required value was null.");
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i == 4) {
            e1l e1lVar = this.d;
            if (e1lVar != null && e1lVar.canGoBack()) {
                e1l e1lVar2 = this.d;
                if (e1lVar2 != null) {
                    e1lVar2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        q0 q0Var = this.h;
        if (q0Var != null) {
            if ((q0Var != null ? q0Var.getStatus() : null) == AsyncTask.Status.PENDING) {
                if (q0Var != null) {
                    q0Var.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.e;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        d();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        q0 q0Var = this.h;
        if (q0Var != null) {
            q0Var.cancel(true);
            ProgressDialog progressDialog = this.e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        layoutParams.getClass();
        if (layoutParams.token == null) {
            this.l = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s0(Context context, String str) {
        super(context, r0);
        context.getClass();
        str.getClass();
        h.k();
        int i = m;
        if (i == 0) {
            h.k();
            i = m;
        }
        this.b = "fbconnect://success";
        this.a = str;
    }
}
