package ru.ozon.fintech.analytic.worker;

import B0.A0;
import Sc.s;
import We.C;
import We.J;
import We.K;
import android.content.Context;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/fintech/analytic/worker/MobileHealthSendWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MobileHealthSendWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileHealthSendWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    public static final Pair d(MobileHealthSendWorker mobileHealthSendWorker, String str) {
        c.b b11;
        MatchGroup b12;
        c.b b13;
        MatchGroup b14;
        mobileHealthSendWorker.getClass();
        Regex regex = new Regex("\"domain\"\\s*:\\s*\"([^\"]+)\"");
        Regex regex2 = new Regex("\"name\"\\s*:\\s*\"([^\"]+)\"");
        MatchResult b15 = regex.b(0, str);
        String str2 = null;
        String f71945a = (b15 == null || (b13 = b15.b()) == null || (b14 = b13.b(1)) == null) ? null : b14.getF71945a();
        MatchResult b16 = regex2.b(0, str);
        if (b16 != null && (b11 = b16.b()) != null && (b12 = b11.b(1)) != null) {
            str2 = b12.getF71945a();
        }
        return new Pair(f71945a, str2);
    }

    public static final /* synthetic */ Object g(MobileHealthSendWorker mobileHealthSendWorker, j30.c cVar, String str, String str2, String str3, kotlin.coroutines.d dVar) {
        mobileHealthSendWorker.getClass();
        return i(cVar, str, str2, str3, dVar);
    }

    public static final J h(MobileHealthSendWorker mobileHealthSendWorker, ArrayList arrayList) {
        mobileHealthSendWorker.getClass();
        String b11 = A0.b("{ \"events\": ", C7714v.V(arrayList, ",", "[", "]", null, 56), " }");
        K.Companion companion = K.INSTANCE;
        C.f33536g.getClass();
        C a11 = C.a.a("application/json");
        companion.getClass();
        return K.Companion.b(b11, a11);
    }

    private static Object i(j30.c cVar, String str, String str2, String str3, kotlin.coroutines.d dVar) {
        Object n11 = j30.c.n(cVar, str3, str2, str, dVar);
        return n11 == Wc.a.COROUTINE_SUSPENDED ? n11 : Unit.f71690a;
    }

    static /* synthetic */ Object j(MobileHealthSendWorker mobileHealthSendWorker, j30.c cVar, String str, String str2, kotlin.coroutines.d dVar) {
        mobileHealthSendWorker.getClass();
        return i(cVar, str, str2, null, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f94930f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f94930f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f94928d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f94930f;
                if (i11 != 0) {
                    s.b(obj);
                    Log.d("MobileHealthSendWorker", "start MobileHealthSendWorker");
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    He.b bVar = He.b.f10879b;
                    d dVar = new d(this, null);
                    cVar2.f94930f = 1;
                    obj = C10727i.f(bVar, dVar, cVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f94928d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f94930f;
        if (i11 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }
}
