package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC3124d;
import com.google.android.gms.common.api.internal.AbstractC3150q;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.AbstractC3167z;
import com.google.android.gms.common.api.internal.AbstractServiceConnectionC3144n;
import com.google.android.gms.common.api.internal.C3118a;
import com.google.android.gms.common.api.internal.C3120b;
import com.google.android.gms.common.api.internal.C3130g;
import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.common.api.internal.C3142m;
import com.google.android.gms.common.api.internal.C3147o0;
import com.google.android.gms.common.api.internal.C3156t0;
import com.google.android.gms.common.api.internal.E;
import com.google.android.gms.common.api.internal.InterfaceC3159v;
import com.google.android.gms.common.api.internal.O0;
import com.google.android.gms.common.internal.AbstractC3179c;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.C3180d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;

/* loaded from: classes2.dex */
public abstract class e {

    @NonNull
    protected final C3130g zaa;
    private final Context zab;
    private final String zac;
    private final C3117a zad;
    private final C3117a.d zae;
    private final C3120b zaf;
    private final Looper zag;
    private final int zah;
    private final f zai;
    private final InterfaceC3159v zaj;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f32290c = new C0490a().a();

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC3159v f32291a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f32292b;

        /* renamed from: com.google.android.gms.common.api.e$a$a, reason: collision with other inner class name */
        public static class C0490a {

            /* renamed from: a, reason: collision with root package name */
            public InterfaceC3159v f32293a;

            /* renamed from: b, reason: collision with root package name */
            public Looper f32294b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.f32293a == null) {
                    this.f32293a = new C3118a();
                }
                if (this.f32294b == null) {
                    this.f32294b = Looper.getMainLooper();
                }
                return new a(this.f32293a, this.f32294b);
            }

            public C0490a b(Looper looper) {
                AbstractC3191o.n(looper, "Looper must not be null.");
                this.f32294b = looper;
                return this;
            }

            public C0490a c(InterfaceC3159v interfaceC3159v) {
                AbstractC3191o.n(interfaceC3159v, "StatusExceptionMapper must not be null.");
                this.f32293a = interfaceC3159v;
                return this;
            }
        }

        public a(InterfaceC3159v interfaceC3159v, Account account, Looper looper) {
            this.f32291a = interfaceC3159v;
            this.f32292b = looper;
        }
    }

    public e(Activity activity, C3117a c3117a, C3117a.d dVar, a aVar) {
        this(activity, activity, c3117a, dVar, aVar);
    }

    @NonNull
    public f asGoogleApiClient() {
        return this.zai;
    }

    public final AbstractC3124d b(int i10, AbstractC3124d abstractC3124d) {
        abstractC3124d.zak();
        this.zaa.D(this, i10, abstractC3124d);
        return abstractC3124d;
    }

    public final Task c(int i10, AbstractC3163x abstractC3163x) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.E(this, i10, abstractC3163x, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    @NonNull
    public C3180d.a createClientSettingsBuilder() {
        C3180d.a aVar = new C3180d.a();
        C3117a.d dVar = this.zae;
        aVar.d(dVar instanceof C3117a.d.InterfaceC0489a ? ((C3117a.d.InterfaceC0489a) dVar).getAccount() : null);
        aVar.c(Collections.EMPTY_SET);
        aVar.e(this.zab.getClass().getName());
        aVar.b(this.zab.getPackageName());
        return aVar;
    }

    @NonNull
    public Task<Boolean> disconnectService() {
        return this.zaa.w(this);
    }

    @NonNull
    public <A extends C3117a.b, T extends AbstractC3124d> T doBestEffortWrite(@NonNull T t10) {
        b(2, t10);
        return t10;
    }

    @NonNull
    public <A extends C3117a.b, T extends AbstractC3124d> T doRead(@NonNull T t10) {
        b(0, t10);
        return t10;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends C3117a.b, T extends AbstractC3150q, U extends AbstractC3167z> Task<Void> doRegisterEventListener(@NonNull T t10, @NonNull U u10) {
        AbstractC3191o.m(t10);
        AbstractC3191o.m(u10);
        AbstractC3191o.n(t10.b(), "Listener has already been released.");
        AbstractC3191o.n(u10.a(), "Listener has already been released.");
        AbstractC3191o.b(AbstractC3189m.b(t10.b(), u10.a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.x(this, t10, u10, new Runnable() { // from class: com.google.android.gms.common.api.s
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(@NonNull C3140l.a aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    @NonNull
    public <A extends C3117a.b, T extends AbstractC3124d> T doWrite(@NonNull T t10) {
        b(1, t10);
        return t10;
    }

    public String getApiFallbackAttributionTag(@NonNull Context context) {
        return null;
    }

    @NonNull
    public final C3120b getApiKey() {
        return this.zaf;
    }

    @NonNull
    public C3117a.d getApiOptions() {
        return this.zae;
    }

    @NonNull
    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    @NonNull
    public Looper getLooper() {
        return this.zag;
    }

    @NonNull
    public <L> C3140l registerListener(@NonNull L l10, @NonNull String str) {
        return C3142m.a(l10, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C3117a.f zab(Looper looper, C3147o0 c3147o0) {
        C3180d a10 = createClientSettingsBuilder().a();
        C3117a.f buildClient = ((C3117a.AbstractC0488a) AbstractC3191o.m(this.zad.a())).buildClient(this.zab, looper, a10, (Object) this.zae, (f.b) c3147o0, (f.c) c3147o0);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof AbstractC3179c)) {
            ((AbstractC3179c) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(buildClient instanceof AbstractServiceConnectionC3144n)) {
            return buildClient;
        }
        android.support.v4.media.session.b.a(buildClient);
        throw null;
    }

    public final O0 zac(Context context, Handler handler) {
        return new O0(context, handler, createClientSettingsBuilder().a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Activity activity, C3117a c3117a, C3117a.d dVar, InterfaceC3159v interfaceC3159v) {
        this(activity, c3117a, dVar, r0.a());
        a.C0490a c0490a = new a.C0490a();
        c0490a.c(interfaceC3159v);
        c0490a.b(activity.getMainLooper());
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends C3117a.b> Task<TResult> doBestEffortWrite(@NonNull AbstractC3163x abstractC3163x) {
        return c(2, abstractC3163x);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends C3117a.b> Task<TResult> doRead(@NonNull AbstractC3163x abstractC3163x) {
        return c(0, abstractC3163x);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(@NonNull C3140l.a aVar, int i10) {
        AbstractC3191o.n(aVar, "Listener key cannot be null.");
        return this.zaa.y(this, aVar, i10);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends C3117a.b> Task<TResult> doWrite(@NonNull AbstractC3163x abstractC3163x) {
        return c(1, abstractC3163x);
    }

    public e(Context context, Activity activity, C3117a c3117a, C3117a.d dVar, a aVar) {
        String apiFallbackAttributionTag;
        AbstractC3191o.n(context, "Null context is not permitted.");
        AbstractC3191o.n(c3117a, "Api must not be null.");
        AbstractC3191o.n(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) AbstractC3191o.n(context.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            apiFallbackAttributionTag = context.getAttributionTag();
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        this.zad = c3117a;
        this.zae = dVar;
        this.zag = aVar.f32292b;
        C3120b a10 = C3120b.a(c3117a, dVar, apiFallbackAttributionTag);
        this.zaf = a10;
        this.zai = new C3156t0(this);
        C3130g u10 = C3130g.u(context2);
        this.zaa = u10;
        this.zah = u10.l();
        this.zaj = aVar.f32291a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            E.j(activity, u10, a10);
        }
        u10.I(this);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <A extends C3117a.b> Task<Void> doRegisterEventListener(@NonNull com.google.android.gms.common.api.internal.r rVar) {
        AbstractC3191o.m(rVar);
        AbstractC3191o.n(rVar.f32563a.b(), "Listener has already been released.");
        AbstractC3191o.n(rVar.f32564b.a(), "Listener has already been released.");
        return this.zaa.x(this, rVar.f32563a, rVar.f32564b, rVar.f32565c);
    }

    public e(Context context, C3117a c3117a, C3117a.d dVar, a aVar) {
        this(context, null, c3117a, dVar, aVar);
    }
}
