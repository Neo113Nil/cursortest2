package io.sentry.android.core;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import io.sentry.AbstractC4772k2;
import io.sentry.C4748f3;
import io.sentry.C4778l3;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4740e0;
import io.sentry.android.core.j1;
import java.lang.ref.WeakReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class p1 extends AlertDialog {

    /* renamed from: a, reason: collision with root package name */
    public boolean f51209a;

    /* renamed from: b, reason: collision with root package name */
    public io.sentry.protocol.u f51210b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.protocol.u f51211c;

    /* renamed from: d, reason: collision with root package name */
    public DialogInterface.OnDismissListener f51212d;

    /* renamed from: e, reason: collision with root package name */
    public final C4748f3 f51213e;

    /* renamed from: f, reason: collision with root package name */
    public j1 f51214f;

    /* renamed from: g, reason: collision with root package name */
    public Application.ActivityLifecycleCallbacks f51215g;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public io.sentry.protocol.u f51216a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f51217b;

        /* renamed from: c, reason: collision with root package name */
        public final int f51218c;

        public a(Context context) {
            this(context, 0);
        }

        public p1 a() {
            return new p1(this.f51217b, this.f51218c, this.f51216a, null, null);
        }

        public a(Context context, int i10) {
            this(context, i10, null);
        }

        public a(Context context, int i10, b bVar) {
            this.f51217b = context;
            this.f51218c = i10;
        }
    }

    public interface b {
        void a(Context context, C4748f3 c4748f3);
    }

    public class c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f51219a;

        public c(WeakReference weakReference) {
            this.f51219a = weakReference;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity == this.f51219a.get()) {
                p1.this.l();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (activity != this.f51219a.get() || p1.this.f51214f == null) {
                return;
            }
            p1.this.f51214f.f();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity != this.f51219a.get() || p1.this.f51214f == null) {
                return;
            }
            p1.this.f51214f.e(activity, p1.this.k(this.f51219a));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public p1(Context context, int i10, io.sentry.protocol.u uVar, b bVar, C4748f3.b bVar2) {
        super(context, i10);
        this.f51209a = false;
        this.f51211c = uVar;
        C4748f3 c4748f3 = new C4748f3(AbstractC4772k2.p().i().getFeedbackOptions());
        this.f51213e = c4748f3;
        if (bVar != null) {
            bVar.a(context, c4748f3);
        }
        if (bVar2 != null) {
            bVar2.a(c4748f3);
        }
        C4778l3.d().a("UserFeedbackWidget");
        j(context);
    }

    public static /* synthetic */ void b(p1 p1Var, EditText editText, EditText editText2, EditText editText3, C4748f3 c4748f3, TextView textView, TextView textView2, TextView textView3, View view) {
        p1Var.getClass();
        String trim = editText.getText().toString().trim();
        String trim2 = editText2.getText().toString().trim();
        String trim3 = editText3.getText().toString().trim();
        if (trim.isEmpty() && c4748f3.q()) {
            editText.setError(textView.getText());
            return;
        }
        if (trim2.isEmpty() && c4748f3.p()) {
            editText2.setError(textView2.getText());
            return;
        }
        if (trim3.isEmpty()) {
            editText3.setError(textView3.getText());
            return;
        }
        io.sentry.protocol.i iVar = new io.sentry.protocol.i(trim3);
        iVar.m(trim);
        iVar.k(trim2);
        io.sentry.protocol.u uVar = p1Var.f51211c;
        if (uVar != null) {
            iVar.j(uVar);
        }
        io.sentry.protocol.u uVar2 = p1Var.f51210b;
        if (uVar2 != null) {
            iVar.n(uVar2);
        }
        if (AbstractC4772k2.l().b(iVar).equals(io.sentry.protocol.u.f52477c)) {
            c4748f3.l();
        } else {
            Toast.makeText(p1Var.getContext(), c4748f3.o(), 0).show();
            c4748f3.m();
        }
        p1Var.cancel();
    }

    public static /* synthetic */ void c(final p1 p1Var, WeakReference weakReference) {
        p1Var.getClass();
        final Activity activity = (Activity) weakReference.get();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.o1
            @Override // java.lang.Runnable
            public final void run() {
                p1.e(p1.this, activity);
            }
        });
    }

    public static /* synthetic */ void d(p1 p1Var, Runnable runnable, DialogInterface dialogInterface) {
        p1Var.getClass();
        runnable.run();
        p1Var.f51210b = null;
        DialogInterface.OnDismissListener onDismissListener = p1Var.f51212d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public static /* synthetic */ void e(p1 p1Var, Activity activity) {
        p1Var.getClass();
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        p1Var.show();
    }

    public static Activity i(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public final void j(Context context) {
        Activity i10;
        C4748f3 feedbackOptions = AbstractC4772k2.p().i().getFeedbackOptions();
        if (!this.f51213e.v() || feedbackOptions.v() || (i10 = i(context)) == null) {
            return;
        }
        this.f51214f = new j1(AbstractC4772k2.p().i().getLogger());
        WeakReference weakReference = new WeakReference(i10);
        this.f51214f.e(i10, k(weakReference));
        Application application = i10.getApplication();
        c cVar = new c(weakReference);
        this.f51215g = cVar;
        application.registerActivityLifecycleCallbacks(cVar);
    }

    public final j1.a k(final WeakReference weakReference) {
        return new j1.a() { // from class: io.sentry.android.core.k1
            @Override // io.sentry.android.core.j1.a
            public final void onShake() {
                p1.c(p1.this, weakReference);
            }
        };
    }

    public final void l() {
        j1 j1Var = this.f51214f;
        if (j1Var != null) {
            j1Var.b();
            this.f51214f = null;
        }
        if (this.f51215g != null) {
            Activity i10 = i(getContext());
            if (i10 != null) {
                i10.getApplication().unregisterActivityLifecycleCallbacks(this.f51215g);
            }
            this.f51215g = null;
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        io.sentry.protocol.F user;
        super.onCreate(bundle);
        setContentView(T0.f50840a);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(PKIFailureInfo.unsupportedVersion);
        }
        setCancelable(this.f51209a);
        final C4748f3 c4748f3 = this.f51213e;
        TextView textView = (TextView) findViewById(S0.f50782g);
        ImageView imageView = (ImageView) findViewById(S0.f50781f);
        final TextView textView2 = (TextView) findViewById(S0.f50785j);
        final EditText editText = (EditText) findViewById(S0.f50780e);
        final TextView textView3 = (TextView) findViewById(S0.f50784i);
        final EditText editText2 = (EditText) findViewById(S0.f50779d);
        final TextView textView4 = (TextView) findViewById(S0.f50783h);
        final EditText editText3 = (EditText) findViewById(S0.f50778c);
        Button button = (Button) findViewById(S0.f50777b);
        Button button2 = (Button) findViewById(S0.f50776a);
        if (c4748f3.r()) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        if (c4748f3.t() || c4748f3.q()) {
            textView2.setVisibility(0);
            editText.setVisibility(0);
            textView2.setText(c4748f3.h());
            editText.setHint(c4748f3.i());
            if (c4748f3.q()) {
                textView2.append(c4748f3.e());
            }
        } else {
            textView2.setVisibility(8);
            editText.setVisibility(8);
        }
        if (c4748f3.s() || c4748f3.p()) {
            textView3.setVisibility(0);
            editText2.setVisibility(0);
            textView3.setText(c4748f3.b());
            editText2.setHint(c4748f3.c());
            if (c4748f3.p()) {
                textView3.append(c4748f3.e());
            }
        } else {
            textView3.setVisibility(8);
            editText2.setVisibility(8);
        }
        if (c4748f3.u() && (user = AbstractC4772k2.p().y().getUser()) != null) {
            editText.setText(user.k());
            editText2.setText(user.h());
        }
        textView4.setText(c4748f3.f());
        textView4.append(c4748f3.e());
        editText3.setHint(c4748f3.g());
        textView.setText(c4748f3.d());
        button.setText(c4748f3.n());
        button.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p1.b(p1.this, editText, editText2, editText3, c4748f3, textView2, textView3, textView4, view);
            }
        });
        button2.setText(c4748f3.a());
        button2.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p1.this.cancel();
            }
        });
        setOnDismissListener(this.f51212d);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        EditText editText = (EditText) findViewById(S0.f50778c);
        editText.getText().clear();
        editText.setError(null);
        F3 i10 = AbstractC4772k2.p().i();
        Runnable k10 = i10.getFeedbackOptions().k();
        if (k10 != null) {
            k10.run();
        }
        i10.getReplayController().A0(Boolean.FALSE);
        this.f51210b = i10.getReplayController().r();
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        this.f51209a = z10;
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f51212d = onDismissListener;
        final Runnable j10 = AbstractC4772k2.p().i().getFeedbackOptions().j();
        if (j10 != null) {
            super.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: io.sentry.android.core.n1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    p1.d(p1.this, j10, dialogInterface);
                }
            });
        } else {
            super.setOnDismissListener(this.f51212d);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        InterfaceC4740e0 p10 = AbstractC4772k2.p();
        F3 i10 = p10.i();
        if (p10.isEnabled() && i10.isEnabled()) {
            super.show();
        } else {
            i10.getLogger().c(EnumC4788n3.WARNING, "Sentry is disabled. Feedback dialog won't be shown.", new Object[0]);
        }
    }
}
