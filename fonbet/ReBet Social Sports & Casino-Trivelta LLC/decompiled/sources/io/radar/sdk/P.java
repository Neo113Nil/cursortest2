package io.radar.sdk;

import V9.AbstractC1745a;
import V9.InterfaceC1747c;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import io.radar.sdk.C4589c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;

/* loaded from: classes3.dex */
public final class P {

    /* renamed from: e, reason: collision with root package name */
    public static final a f49775e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static boolean f49776f;

    /* renamed from: a, reason: collision with root package name */
    public final Context f49777a;

    /* renamed from: b, reason: collision with root package name */
    public final List f49778b;

    /* renamed from: c, reason: collision with root package name */
    public final ActivityTransitionRequest f49779c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1747c f49780d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4589c.EnumC4590a a(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 3 ? i10 != 7 ? i10 != 8 ? C4589c.EnumC4590a.UNKNOWN : C4589c.EnumC4590a.RUN : C4589c.EnumC4590a.FOOT : C4589c.EnumC4590a.STATIONARY : C4589c.EnumC4590a.BIKE : C4589c.EnumC4590a.CAR;
        }

        public a() {
        }
    }

    public P(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49777a = context;
        ArrayList arrayList = new ArrayList();
        this.f49778b = arrayList;
        arrayList.add(new ActivityTransition.a().c(0).b(0).a());
        arrayList.add(new ActivityTransition.a().c(1).b(0).a());
        arrayList.add(new ActivityTransition.a().c(8).b(0).a());
        arrayList.add(new ActivityTransition.a().c(3).b(0).a());
        arrayList.add(new ActivityTransition.a().c(7).b(0).a());
        this.f49779c = new ActivityTransitionRequest(arrayList);
        InterfaceC1747c a10 = AbstractC1745a.a(context);
        Intrinsics.checkNotNullExpressionValue(a10, "getClient(context)");
        this.f49780d = a10;
    }

    public static final void d(Void r62) {
        f49776f = true;
        G0.b(C4589c.f49918a.y(), "Activity updates started", null, null, 6, null);
    }

    public static final void e(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        G0.d(C4589c.f49918a.y(), "Activity updates failed to start", null, null, 6, null);
    }

    public final Object c() {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (Build.VERSION.SDK_INT < 29 || AbstractC5338c.checkSelfPermission(this.f49777a, "android.permission.ACTIVITY_RECOGNITION") != 0) {
                G0.b(C4589c.f49918a.y(), "Permission for activity recognition not granted", null, null, 6, null);
            } else if (f49776f) {
                G0.b(C4589c.f49918a.y(), "Activity updates already started", null, null, 6, null);
            } else {
                G0.b(C4589c.f49918a.y(), "trying to start activity updates", null, null, 6, null);
                Task requestActivityTransitionUpdates = this.f49780d.requestActivityTransitionUpdates(this.f49779c, RadarLocationReceiver.INSTANCE.b(this.f49777a));
                Intrinsics.checkNotNullExpressionValue(requestActivityTransitionUpdates, "activityClient.requestAc…nt(context)\n            )");
                requestActivityTransitionUpdates.addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.N
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        P.d((Void) obj);
                    }
                });
                requestActivityTransitionUpdates.addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.O
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        P.e(exc);
                    }
                });
            }
            return Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public final void f() {
        if (f49776f) {
            this.f49780d.removeActivityUpdates(RadarLocationReceiver.INSTANCE.b(this.f49777a));
            f49776f = false;
        }
    }
}
