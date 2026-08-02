package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes5.dex */
public final class AFj1pSDK {
    final Intent getCurrencyIso4217Code;

    public AFj1pSDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getCurrencyIso4217Code = intent;
    }

    public final <T extends Parcelable> T F_(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) getRevenue(new Function0<T>() { // from class: com.appsflyer.internal.AFj1pSDK.4
            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: H_, reason: merged with bridge method [inline-methods] */
            public final Parcelable invoke() {
                return AFj1pSDK.this.getCurrencyIso4217Code.getParcelableExtra(str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final String getRevenue(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) getRevenue(new Function0<String>() { // from class: com.appsflyer.internal.AFj1pSDK.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return AFj1pSDK.this.getCurrencyIso4217Code.getStringExtra(str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final boolean AFAdRevenueData(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) getRevenue(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFj1pSDK.3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AFj1pSDK.this.getCurrencyIso4217Code.hasExtra(str));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Intent G_(final String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) getRevenue(new Function0<Intent>() { // from class: com.appsflyer.internal.AFj1pSDK.2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: I_, reason: merged with bridge method [inline-methods] */
            public final Intent invoke() {
                return AFj1pSDK.this.getCurrencyIso4217Code.putExtra(str, j);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "Error while trying to write " + str + " extra to intent", null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    private final <T> T getRevenue(Function0<? extends T> function0, String str, T t, boolean z) {
        T t2;
        ?? m11180constructorimpl;
        Object obj;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AFj1pSDK aFj1pSDK = this;
                t2 = Result.m11180constructorimpl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                t2 = Result.m11180constructorimpl(ResultKt.createFailure(th));
            }
            KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(ConcurrentModificationException.class), Reflection.getOrCreateKotlinClass(ArrayIndexOutOfBoundsException.class)};
            Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(t2);
            T t3 = t2;
            if (m11183exceptionOrNullimpl != null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th2));
                }
                if (ArraysKt.contains(kClassArr, Reflection.getOrCreateKotlinClass(m11183exceptionOrNullimpl.getClass()))) {
                    if (z) {
                        obj = getRevenue(function0, str, t, false);
                    } else {
                        AFLogger.afErrorLog(str, m11183exceptionOrNullimpl, false, false);
                        obj = t;
                    }
                    m11180constructorimpl = Result.m11180constructorimpl(obj);
                    t3 = m11180constructorimpl;
                } else {
                    throw m11183exceptionOrNullimpl;
                }
            }
            Throwable m11183exceptionOrNullimpl2 = Result.m11183exceptionOrNullimpl(t3);
            if (m11183exceptionOrNullimpl2 == null) {
                t = t3;
            } else {
                AFLogger.afErrorLog(str, m11183exceptionOrNullimpl2, false, false);
            }
        }
        return t;
    }
}
