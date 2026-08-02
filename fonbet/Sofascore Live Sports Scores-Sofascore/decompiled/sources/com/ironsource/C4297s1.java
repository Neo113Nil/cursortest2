package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.ironsource.C4197m8;
import com.ironsource.InterfaceC4333u1;
import com.ironsource.U3;
import com.ironsource.sdk.utils.Logger;
import defpackage.a70;
import defpackage.dmi;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.ndd;
import defpackage.ok3;
import defpackage.oog;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.z9a;
import defpackage.zzl;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.s1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4297s1 {

    @NotNull
    public static final b a = new b(null);

    @NotNull
    private static final String b = b.class.getName();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @il4(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", f = "AndroidSandboxJSHandler.kt", l = {80}, m = "invokeSuspend")
    /* renamed from: com.ironsource.s1$c */
    public static final class c extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
        int a;
        final /* synthetic */ MeasurementManager c;
        final /* synthetic */ Uri d;
        final /* synthetic */ MotionEvent e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, rq3<? super c> rq3Var) {
            super(2, rq3Var);
            this.c = measurementManager;
            this.d = uri;
            this.e = motionEvent;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull ku3 ku3Var, @Nullable rq3<? super Unit> rq3Var) {
            return ((c) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        @NotNull
        public final rq3<Unit> create(@Nullable Object obj, @NotNull rq3<?> rq3Var) {
            return C4297s1.this.new c(this.c, this.d, this.e, rq3Var);
        }

        @Override // defpackage.h21
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            lu3 lu3Var = lu3.a;
            int i = this.a;
            if (i == 0) {
                y6a.M(obj);
                C4297s1 c4297s1 = C4297s1.this;
                MeasurementManager measurementManager = this.c;
                Uri uri = this.d;
                uri.getClass();
                MotionEvent motionEvent = this.e;
                this.a = 1;
                if (c4297s1.a(measurementManager, uri, motionEvent, this) == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            return Unit.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @il4(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", f = "AndroidSandboxJSHandler.kt", l = {60}, m = "invokeSuspend")
    /* renamed from: com.ironsource.s1$d */
    public static final class d extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
        int a;
        final /* synthetic */ MeasurementManager c;
        final /* synthetic */ Uri d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MeasurementManager measurementManager, Uri uri, rq3<? super d> rq3Var) {
            super(2, rq3Var);
            this.c = measurementManager;
            this.d = uri;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull ku3 ku3Var, @Nullable rq3<? super Unit> rq3Var) {
            return ((d) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        @NotNull
        public final rq3<Unit> create(@Nullable Object obj, @NotNull rq3<?> rq3Var) {
            return C4297s1.this.new d(this.c, this.d, rq3Var);
        }

        @Override // defpackage.h21
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            lu3 lu3Var = lu3.a;
            int i = this.a;
            if (i == 0) {
                y6a.M(obj);
                C4297s1 c4297s1 = C4297s1.this;
                MeasurementManager measurementManager = this.c;
                Uri uri = this.d;
                uri.getClass();
                this.a = 1;
                if (c4297s1.a(measurementManager, uri, null, this) == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            return Unit.a;
        }
    }

    private final a a(Context context, InterfaceC4333u1.a aVar) {
        MeasurementManager a2 = C4171l0.a(context);
        if (a2 == null) {
            Logger.i(b, "could not obtain measurement manager");
            return a(aVar, "could not obtain measurement manager");
        }
        try {
            if (aVar instanceof InterfaceC4333u1.a.b) {
                return a(aVar, a2);
            }
            if (aVar instanceof InterfaceC4333u1.a.C1219a) {
                return a((InterfaceC4333u1.a.C1219a) aVar, a2);
            }
            throw new ndd();
        } catch (Exception e) {
            C4157k4.d().a(e);
            return a(aVar, dmi.q("failed to handle attribution, message: ", e.getMessage()));
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.s1$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.s1$a */
    public static final class a {

        @NotNull
        private final String a;

        @NotNull
        private final C4197m8.e b;

        @NotNull
        private final String c;

        @NotNull
        private final JSONObject d;

        public a(@NotNull String str, @NotNull C4197m8.e eVar, @NotNull String str2, @NotNull JSONObject jSONObject) {
            str.getClass();
            eVar.getClass();
            str2.getClass();
            jSONObject.getClass();
            this.a = str;
            this.b = eVar;
            this.c = str2;
            this.d = jSONObject;
        }

        public static /* synthetic */ a a(a aVar, String str, C4197m8.e eVar, String str2, JSONObject jSONObject, int i, Object obj) {
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

        @NotNull
        public final C4197m8.e b() {
            return this.b;
        }

        @NotNull
        public final String c() {
            return this.c;
        }

        @NotNull
        public final JSONObject d() {
            return this.d;
        }

        @NotNull
        public final String e() {
            return this.c;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            a aVar = (a) obj;
            return Intrinsics.c(this.a, aVar.a) && this.b == aVar.b && Intrinsics.c(this.c, aVar.c) && Intrinsics.c(this.d.toString(), aVar.d.toString());
        }

        @NotNull
        public final String f() {
            return this.a;
        }

        @NotNull
        public final JSONObject g() {
            return this.d;
        }

        @NotNull
        public final C4197m8.e h() {
            return this.b;
        }

        public int hashCode() {
            return super.hashCode();
        }

        @NotNull
        public final JSONObject i() {
            JSONObject put = new JSONObject(this.d.toString()).put(U3.i.m, this.b).put("demandSourceName", this.c);
            put.getClass();
            return put;
        }

        @NotNull
        public String toString() {
            return "CallbackResult(name=" + this.a + ", productType=" + this.b + ", demandSourceName=" + this.c + ", params=" + this.d + ")";
        }

        @NotNull
        public final a a(@NotNull String str, @NotNull C4197m8.e eVar, @NotNull String str2, @NotNull JSONObject jSONObject) {
            str.getClass();
            eVar.getClass();
            str2.getClass();
            jSONObject.getClass();
            return new a(str, eVar, str2, jSONObject);
        }

        @NotNull
        public final String a() {
            return this.a;
        }
    }

    @NotNull
    public final a a(@NotNull Context context, @NotNull InterfaceC4333u1 interfaceC4333u1) {
        context.getClass();
        interfaceC4333u1.getClass();
        if (interfaceC4333u1 instanceof InterfaceC4333u1.a) {
            return a(context, (InterfaceC4333u1.a) interfaceC4333u1);
        }
        zzl.b();
        return null;
    }

    private final a a(InterfaceC4333u1.a aVar, MeasurementManager measurementManager) {
        ok3.J(new d(measurementManager, Uri.parse(aVar.b()), null));
        return a(aVar);
    }

    private final a a(InterfaceC4333u1.a.C1219a c1219a, MeasurementManager measurementManager) {
        Uri parse = Uri.parse(c1219a.b());
        long uptimeMillis = SystemClock.uptimeMillis();
        ok3.J(new c(measurementManager, parse, MotionEvent.obtain(uptimeMillis, uptimeMillis, c1219a.n(), c1219a.o().c(), c1219a.o().d(), c1219a.p()), null));
        return a(c1219a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, rq3<? super Unit> rq3Var) {
        oog oogVar = new oog(z9a.b(rq3Var));
        measurementManager.registerSource(uri, motionEvent, Executors.newSingleThreadExecutor(), C4315t1.a(oogVar));
        Object b2 = oogVar.b();
        return b2 == lu3.a ? b2 : Unit.a;
    }

    private final a a(InterfaceC4333u1.a aVar) {
        JSONObject put = new JSONObject().put("params", new JSONObject().put("type", aVar instanceof InterfaceC4333u1.a.C1219a ? "click" : "impression"));
        String a2 = aVar.a();
        C4197m8.e d2 = aVar.d();
        String e = aVar.e();
        put.getClass();
        return new a(a2, d2, e, put);
    }

    private final a a(InterfaceC4333u1 interfaceC4333u1, String str) {
        JSONObject put = new JSONObject().put("reason", str).put("type", interfaceC4333u1 instanceof InterfaceC4333u1.a.C1219a ? "click" : "impression");
        String c2 = interfaceC4333u1.c();
        C4197m8.e d2 = interfaceC4333u1.d();
        String e = interfaceC4333u1.e();
        JSONObject put2 = new JSONObject().put("params", put);
        put2.getClass();
        return new a(c2, d2, e, put2);
    }
}
