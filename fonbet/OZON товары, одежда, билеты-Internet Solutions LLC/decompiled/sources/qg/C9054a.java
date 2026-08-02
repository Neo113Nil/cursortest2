package qg;

import Sc.s;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import og.AbstractC8733a;
import og.C8734b;
import org.jetbrains.annotations.NotNull;
import pg.C8925a;
import pg.C8926b;
import rg.C9268a;
import t6.C9772g;
import v6.C10260d;
import v6.C10261e;
import v6.C10262f;
import v6.ServiceConnectionC10259c;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* renamed from: qg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9054a {

    @e(c = "ru.nspk.mirpay.sdk.api.configuration.provider.MirPayAppStoresProvider$appStores$2", f = "MirPayAppStoresProvider.kt", l = {24}, m = "invokeSuspend")
    /* renamed from: qg.a$a, reason: collision with other inner class name */
    static final class C1392a extends j implements Function2<M, d<? super List<? extends C8926b>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f82083d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f82084e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1392a(Context context, d<? super C1392a> dVar) {
            super(2, dVar);
            this.f82084e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C1392a(this.f82084e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super List<? extends C8926b>> dVar) {
            return ((C1392a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f82083d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            this.f82083d = 1;
            Serializable a11 = C9054a.a(this.f82084e, this);
            return a11 == aVar ? aVar : a11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(Context context, c cVar) {
        C9055b c9055b;
        int i11;
        C9268a c9268a;
        ServiceConnectionC10259c serviceConnectionC10259c;
        if (cVar instanceof C9055b) {
            c9055b = (C9055b) cVar;
            int i12 = c9055b.f82087f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9055b.f82087f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9055b.f82086e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9055b.f82087f;
                if (i11 != 0) {
                    s.b(obj);
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    C9268a c9268a2 = new C9268a(applicationContext);
                    c9055b.f82085d = c9268a2;
                    c9055b.f82087f = 1;
                    Object b11 = c9268a2.b(c9055b);
                    if (b11 == aVar) {
                        return aVar;
                    }
                    obj = b11;
                    c9268a = c9268a2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9268a = c9055b.f82085d;
                    s.b(obj);
                }
                serviceConnectionC10259c = (ServiceConnectionC10259c) obj;
                if (serviceConnectionC10259c != null) {
                    int i13 = AbstractC8733a.f78319a;
                    throw AbstractC8733a.d.a(2, null);
                }
                try {
                    try {
                        C10262f d11 = serviceConnectionC10259c.d(C10261e.a(C10260d.a.APP_STORES));
                        C10262f.a c11 = d11.c();
                        Intrinsics.checkNotNullExpressionValue(c11, "getResultType(...)");
                        C8734b.a(c11);
                        String a11 = d11.a();
                        Intrinsics.checkNotNullExpressionValue(a11, "getData(...)");
                        return C8925a.a(a11);
                    } catch (Exception e11) {
                        if (!(e11 instanceof C9772g) && !(e11 instanceof w6.c)) {
                            throw e11;
                        }
                        int i14 = AbstractC8733a.f78319a;
                        throw AbstractC8733a.d.a(1, e11);
                    }
                } finally {
                    c9268a.c(serviceConnectionC10259c);
                }
            }
        }
        c9055b = new C9055b(cVar);
        Object obj2 = c9055b.f82086e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9055b.f82087f;
        if (i11 != 0) {
        }
        serviceConnectionC10259c = (ServiceConnectionC10259c) obj2;
        if (serviceConnectionC10259c != null) {
        }
    }

    public static Object b(@NotNull Context context, @NotNull d dVar) throws AbstractC8733a {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new C1392a(context, null), dVar);
    }
}
