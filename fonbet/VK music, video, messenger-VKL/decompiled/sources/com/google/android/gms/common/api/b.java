package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.c;
import com.google.android.gms.internal.base.zar;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collection;
import java.util.Collections;
import xsna.anj;
import xsna.anz0;
import xsna.boz0;
import xsna.cnz0;
import xsna.d9u;
import xsna.dnz0;
import xsna.dq70;
import xsna.dy2;
import xsna.ehz;
import xsna.el3;
import xsna.enz0;
import xsna.eqf0;
import xsna.exc0;
import xsna.f5o0;
import xsna.fhz;
import xsna.grf0;
import xsna.hmz0;
import xsna.hnz0;
import xsna.joz0;
import xsna.jzk0;
import xsna.k5q0;
import xsna.mmz0;
import xsna.noz0;
import xsna.olc;
import xsna.olz0;
import xsna.qdg0;
import xsna.rd6;
import xsna.skz0;
import xsna.t94;
import xsna.tkz0;
import xsna.ty2;
import xsna.y570;
import xsna.ylj0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public abstract class b<O extends a.d> {

    @NonNull
    protected final d9u zaa;
    private final Context zab;

    @Nullable
    private final String zac;

    @Nullable
    private final t94 zad;
    private final com.google.android.gms.common.api.a zae;
    private final a.d zaf;
    private final ty2 zag;
    private final Looper zah;
    private final int zai;

    @Nullable
    private final UserHandle zaj;
    private final c zak;
    private final jzk0 zal;

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    public static class a {

        @NonNull
        public static final a c = new a(new dy2(), Looper.getMainLooper());

        @NonNull
        public final jzk0 a;

        @NonNull
        public final Looper b;

        public a(jzk0 jzk0Var, Looper looper) {
            this.a = jzk0Var;
            this.b = looper;
        }
    }

    public b(@NonNull Activity activity, @NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o, @NonNull a aVar2) {
        this(activity, activity, aVar, o, aVar2);
    }

    private final com.google.android.gms.common.api.internal.a zad(int i, @NonNull com.google.android.gms.common.api.internal.a aVar) {
        aVar.zak();
        d9u d9uVar = this.zaa;
        d9uVar.getClass();
        anz0 anz0Var = new anz0(new boz0(i, aVar), d9uVar.j.get(), this);
        zar zarVar = d9uVar.o;
        zarVar.sendMessage(zarVar.obtainMessage(4, anz0Var));
        return aVar;
    }

    private final Task zae(int i, @NonNull f5o0 f5o0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        jzk0 jzk0Var = this.zal;
        d9u d9uVar = this.zaa;
        d9uVar.getClass();
        d9uVar.c(taskCompletionSource, f5o0Var.c, this);
        anz0 anz0Var = new anz0(new joz0(i, f5o0Var, taskCompletionSource, jzk0Var), d9uVar.j.get(), this);
        zar zarVar = d9uVar.o;
        zarVar.sendMessage(zarVar.obtainMessage(4, anz0Var));
        return taskCompletionSource.getTask();
    }

    @NonNull
    public c asGoogleApiClient() {
        return this.zak;
    }

    @NonNull
    public olc.a createClientSettingsBuilder() {
        Account account;
        Collection collection;
        GoogleSignInAccount f;
        olc.a aVar = new olc.a();
        a.d dVar = this.zaf;
        boolean z = dVar instanceof a.d.b;
        if (!z || (f = ((a.d.b) dVar).f()) == null) {
            if (dVar instanceof a.d.InterfaceC0112a) {
                ((a.d.InterfaceC0112a) dVar).getClass();
            }
            account = null;
        } else {
            account = f.i();
        }
        aVar.a = account;
        if (z) {
            GoogleSignInAccount f2 = ((a.d.b) dVar).f();
            collection = f2 == null ? Collections.EMPTY_SET : f2.j();
        } else {
            collection = Collections.EMPTY_SET;
        }
        if (aVar.b == null) {
            aVar.b = new el3();
        }
        aVar.b.addAll(collection);
        Context context = this.zab;
        aVar.d = context.getClass().getName();
        aVar.c = context.getPackageName();
        return aVar;
    }

    @NonNull
    public Task<Boolean> disconnectService() {
        d9u d9uVar = this.zaa;
        d9uVar.getClass();
        tkz0 tkz0Var = new tkz0(getApiKey());
        zar zarVar = d9uVar.o;
        zarVar.sendMessage(zarVar.obtainMessage(14, tkz0Var));
        return tkz0Var.b().getTask();
    }

    @NonNull
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends qdg0, A>> T doBestEffortWrite(@NonNull T t) {
        zad(2, t);
        return t;
    }

    @NonNull
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends qdg0, A>> T doRead(@NonNull T t) {
        zad(0, t);
        return t;
    }

    @NonNull
    @Deprecated
    public <A extends a.b, T extends eqf0<A, ?>, U extends k5q0<A, ?>> Task<Void> doRegisterEventListener(@NonNull T t, @NonNull U u) {
        exc0.i(t);
        exc0.i(u);
        exc0.j(t.a(), "Listener has already been released.");
        exc0.j(u.a(), "Listener has already been released.");
        exc0.a("Listener registration and unregistration methods must be constructed with the same ListenerHolder.", dq70.b(t.a(), u.a()));
        return this.zaa.h(this, t, u, olz0.b);
    }

    @NonNull
    public Task<Boolean> doUnregisterEventListener(@NonNull ehz.a<?> aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    @NonNull
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends qdg0, A>> T doWrite(@NonNull T t) {
        zad(1, t);
        return t;
    }

    @Nullable
    public String getApiFallbackAttributionTag(@NonNull Context context) {
        return null;
    }

    @NonNull
    public final ty2<O> getApiKey() {
        return this.zag;
    }

    @NonNull
    public O getApiOptions() {
        return (O) this.zaf;
    }

    @NonNull
    public Context getApplicationContext() {
        return this.zab;
    }

    @Nullable
    public String getContextAttributionTag() {
        return this.zac;
    }

    @Nullable
    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    @NonNull
    public Looper getLooper() {
        return this.zah;
    }

    @NonNull
    public <L> ehz<L> registerListener(@NonNull L l, @NonNull String str) {
        return fhz.a(this.zah, l, str);
    }

    public final int zab() {
        return this.zai;
    }

    public final hnz0 zac(Context context, Handler handler) {
        olc.a createClientSettingsBuilder = createClientSettingsBuilder();
        return new hnz0(context, handler, new olc(createClientSettingsBuilder.a, createClientSettingsBuilder.b, null, createClientSettingsBuilder.c, createClientSettingsBuilder.d, ylj0.b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f zaf(Looper looper, hmz0 hmz0Var) {
        olc.a createClientSettingsBuilder = createClientSettingsBuilder();
        olc olcVar = new olc(createClientSettingsBuilder.a, createClientSettingsBuilder.b, null, createClientSettingsBuilder.c, createClientSettingsBuilder.d, ylj0.b);
        a.AbstractC0111a abstractC0111a = this.zae.a;
        exc0.i(abstractC0111a);
        a.f buildClient = abstractC0111a.buildClient(this.zab, looper, olcVar, (olc) this.zaf, (c.b) hmz0Var, (c.InterfaceC0114c) hmz0Var);
        UserHandle userHandle = this.zaj;
        if (userHandle != null && (buildClient instanceof rd6)) {
            ((rd6) buildClient).setUserHandle(userHandle);
        }
        t94 t94Var = this.zad;
        if (t94Var != null && (buildClient instanceof rd6)) {
            ((rd6) buildClient).setAttributionSourceWrapper(t94Var);
            return buildClient;
        }
        if (t94Var != null && (buildClient instanceof y570)) {
            ((y570) buildClient).getClass();
            return buildClient;
        }
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof rd6)) {
            ((rd6) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof y570)) {
            ((y570) buildClient).getClass();
        }
        return buildClient;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(@NonNull Activity activity, @NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o, @NonNull jzk0 jzk0Var) {
        this(activity, (com.google.android.gms.common.api.a) aVar, (a.d) o, new a(jzk0Var, r0));
        exc0.j(jzk0Var, "StatusExceptionMapper must not be null.");
        Looper mainLooper = activity.getMainLooper();
        exc0.j(mainLooper, "Looper must not be null.");
    }

    @NonNull
    public <TResult, A extends a.b> Task<TResult> doBestEffortWrite(@NonNull f5o0<A, TResult> f5o0Var) {
        return zae(2, f5o0Var);
    }

    @NonNull
    public <TResult, A extends a.b> Task<TResult> doRead(@NonNull f5o0<A, TResult> f5o0Var) {
        return zae(0, f5o0Var);
    }

    @NonNull
    public Task<Boolean> doUnregisterEventListener(@NonNull ehz.a<?> aVar, int i) {
        exc0.j(aVar, "Listener key cannot be null.");
        d9u d9uVar = this.zaa;
        d9uVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        d9uVar.c(taskCompletionSource, i, this);
        anz0 anz0Var = new anz0(new noz0(aVar, taskCompletionSource), d9uVar.j.get(), this);
        zar zarVar = d9uVar.o;
        zarVar.sendMessage(zarVar.obtainMessage(13, anz0Var));
        return taskCompletionSource.getTask();
    }

    @NonNull
    public <TResult, A extends a.b> Task<TResult> doWrite(@NonNull f5o0<A, TResult> f5o0Var) {
        return zae(1, f5o0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public b(@NonNull Context context, @NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o, @NonNull jzk0 jzk0Var) {
        this(context, aVar, o, new a(jzk0Var, Looper.getMainLooper()));
        exc0.j(jzk0Var, "StatusExceptionMapper must not be null.");
    }

    @NonNull
    public <A extends a.b> Task<Void> doRegisterEventListener(@NonNull grf0<A, ?> grf0Var) {
        exc0.i(grf0Var);
        cnz0 cnz0Var = grf0Var.a;
        exc0.j(cnz0Var.a(), "Listener has already been released.");
        dnz0 dnz0Var = grf0Var.b;
        exc0.j(dnz0Var.a(), "Listener has already been released.");
        return this.zaa.h(this, cnz0Var, dnz0Var, enz0.b);
    }

    private b(@NonNull Context context, @Nullable Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        String apiFallbackAttributionTag;
        t94 t94Var;
        AttributionSource attributionSource;
        exc0.j(context, "Null context is not permitted.");
        exc0.j(aVar, "Api must not be null.");
        exc0.j(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        exc0.j(applicationContext, "The provided context did not have an application context.");
        this.zab = applicationContext;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            apiFallbackAttributionTag = i >= 30 ? anj.b.a(context) : null;
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        if (i >= 31) {
            attributionSource = context.getAttributionSource();
            t94Var = new t94(attributionSource);
        } else {
            t94Var = null;
        }
        this.zad = t94Var;
        this.zae = aVar;
        this.zaf = dVar;
        this.zah = aVar2.b;
        this.zaj = null;
        ty2 ty2Var = new ty2(aVar, dVar, apiFallbackAttributionTag);
        this.zag = ty2Var;
        this.zak = new mmz0(this);
        d9u e = d9u.e(applicationContext);
        this.zaa = e;
        this.zai = e.i.getAndIncrement();
        this.zal = aVar2.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            skz0.e(activity, e, ty2Var);
        }
        zar zarVar = e.o;
        zarVar.sendMessage(zarVar.obtainMessage(7, this));
    }

    public b(@NonNull Context context, @NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o, @NonNull a aVar2) {
        this(context, null, aVar, o, aVar2);
    }
}
