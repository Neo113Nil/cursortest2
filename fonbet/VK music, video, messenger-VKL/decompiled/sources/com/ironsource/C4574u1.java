package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.car.app.hardware.common.CarZone;
import com.ironsource.C4492p8;
import com.ironsource.InterfaceC4610w1;
import com.ironsource.X3;
import com.ironsource.sdk.utils.Logger;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import xsna.b6l;
import xsna.epx;
import xsna.go9;
import xsna.gzg0;
import xsna.myc0;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zcl;

/* renamed from: com.ironsource.u1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4574u1 {
    public static final b a = new b(null);
    private static final String b = b.class.getName();

    /* renamed from: com.ironsource.u1$a */
    public static final class a {
        private final String a;
        private final C4492p8.e b;
        private final String c;
        private final JSONObject d;

        public a(String str, C4492p8.e eVar, String str2, JSONObject jSONObject) {
            this.a = str;
            this.b = eVar;
            this.c = str2;
            this.d = jSONObject;
        }

        public final String a() {
            return this.a;
        }

        public final C4492p8.e b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final JSONObject d() {
            return this.d;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d.toString(), aVar.d.toString());
        }

        public final String f() {
            return this.a;
        }

        public final JSONObject g() {
            return this.d;
        }

        public final C4492p8.e h() {
            return this.b;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public final JSONObject i() {
            return new JSONObject(this.d.toString()).put(X3.i.m, this.b).put("demandSourceName", this.c);
        }

        public String toString() {
            return "CallbackResult(name=" + this.a + ", productType=" + this.b + ", demandSourceName=" + this.c + ", params=" + this.d + ")";
        }

        public final a a(String str, C4492p8.e eVar, String str2, JSONObject jSONObject) {
            return new a(str, eVar, str2, jSONObject);
        }

        public static /* synthetic */ a a(a aVar, String str, C4492p8.e eVar, String str2, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                eVar = aVar.b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.c;
            }
            if ((i & 8) != 0) {
                jSONObject = aVar.d;
            }
            return aVar.a(str, eVar, str2, jSONObject);
        }
    }

    /* renamed from: com.ironsource.u1$b */
    public static final class b {
        public /* synthetic */ b(zcl zclVar) {
            this();
        }

        private b() {
        }
    }

    @b6l(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", f = "AndroidSandboxJSHandler.kt", l = {CarZone.CAR_ZONE_COLUMN_DRIVER}, m = "invokeSuspend")
    /* renamed from: com.ironsource.u1$c */
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int a;
        final /* synthetic */ MeasurementManager c;
        final /* synthetic */ Uri d;
        final /* synthetic */ MotionEvent e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, spj<? super c> spjVar) {
            super(2, spjVar);
            this.c = measurementManager;
            this.d = uri;
            this.e = motionEvent;
        }

        @Override // xsna.wzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return C4574u1.this.new c(this.c, this.d, this.e, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                kotlin.a.a(obj);
                C4574u1 c4574u1 = C4574u1.this;
                MeasurementManager measurementManager = this.c;
                Uri uri = this.d;
                MotionEvent motionEvent = this.e;
                this.a = 1;
                if (c4574u1.a(measurementManager, uri, motionEvent, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    @b6l(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", f = "AndroidSandboxJSHandler.kt", l = {60}, m = "invokeSuspend")
    /* renamed from: com.ironsource.u1$d */
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int a;
        final /* synthetic */ MeasurementManager c;
        final /* synthetic */ Uri d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MeasurementManager measurementManager, Uri uri, spj<? super d> spjVar) {
            super(2, spjVar);
            this.c = measurementManager;
            this.d = uri;
        }

        @Override // xsna.wzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return C4574u1.this.new d(this.c, this.d, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                kotlin.a.a(obj);
                C4574u1 c4574u1 = C4574u1.this;
                MeasurementManager measurementManager = this.c;
                Uri uri = this.d;
                this.a = 1;
                if (c4574u1.a(measurementManager, uri, null, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public final a a(Context context, InterfaceC4610w1 interfaceC4610w1) {
        if (interfaceC4610w1 instanceof InterfaceC4610w1.a) {
            return a(context, (InterfaceC4610w1.a) interfaceC4610w1);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final a a(Context context, InterfaceC4610w1.a aVar) {
        MeasurementManager a2 = C4412l0.a(context);
        if (a2 == null) {
            Logger.i(b, "could not obtain measurement manager");
            return a(aVar, "could not obtain measurement manager");
        }
        try {
            if (aVar instanceof InterfaceC4610w1.a.b) {
                return a(aVar, a2);
            }
            if (aVar instanceof InterfaceC4610w1.a.C0237a) {
                return a((InterfaceC4610w1.a.C0237a) aVar, a2);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            C4452n4.d().a(e);
            return a(aVar, go9.b("failed to handle attribution, message: ", e.getMessage()));
        }
    }

    private final a a(InterfaceC4610w1.a aVar, MeasurementManager measurementManager) {
        myc0.i(EmptyCoroutineContext.b, new d(measurementManager, Uri.parse(aVar.b()), null));
        return a(aVar);
    }

    private final a a(InterfaceC4610w1.a.C0237a c0237a, MeasurementManager measurementManager) {
        Uri parse = Uri.parse(c0237a.b());
        long uptimeMillis = SystemClock.uptimeMillis();
        myc0.i(EmptyCoroutineContext.b, new c(measurementManager, parse, MotionEvent.obtain(uptimeMillis, uptimeMillis, c0237a.n(), c0237a.o().c(), c0237a.o().d(), c0237a.p()), null));
        return a(c0237a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public final Object a(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, spj<? super s3q0> spjVar) {
        gzg0 gzg0Var = new gzg0(s7s0.c(spjVar));
        measurementManager.registerSource(uri, motionEvent, Executors.newSingleThreadExecutor(), C4592v1.a(gzg0Var));
        Object a2 = gzg0Var.a();
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : s3q0.a;
    }

    private final a a(InterfaceC4610w1.a aVar) {
        return new a(aVar.a(), aVar.d(), aVar.e(), new JSONObject().put("params", new JSONObject().put("type", aVar instanceof InterfaceC4610w1.a.C0237a ? "click" : "impression")));
    }

    private final a a(InterfaceC4610w1 interfaceC4610w1, String str) {
        return new a(interfaceC4610w1.c(), interfaceC4610w1.d(), interfaceC4610w1.e(), new JSONObject().put("params", new JSONObject().put("reason", str).put("type", interfaceC4610w1 instanceof InterfaceC4610w1.a.C0237a ? "click" : "impression")));
    }
}
