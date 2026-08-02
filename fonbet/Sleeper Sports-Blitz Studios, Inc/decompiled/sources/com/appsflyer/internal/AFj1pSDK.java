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

/* loaded from: classes6.dex */
public final class AFj1pSDK {
    final Intent getRevenue;

    public AFj1pSDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getRevenue = intent;
    }

    public final <T extends Parcelable> T H_(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) getCurrencyIso4217Code(new Function0<T>() { // from class: com.appsflyer.internal.AFj1pSDK.5
            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: J_, reason: merged with bridge method [inline-methods] */
            public final Parcelable invoke() {
                return AFj1pSDK.this.getRevenue.getParcelableExtra(str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final String getRevenue(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) getCurrencyIso4217Code(new Function0<String>() { // from class: com.appsflyer.internal.AFj1pSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return AFj1pSDK.this.getRevenue.getStringExtra(str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final boolean getMonetizationNetwork(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) getCurrencyIso4217Code(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFj1pSDK.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AFj1pSDK.this.getRevenue.hasExtra(str));
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

    public final Intent I_(final String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) getCurrencyIso4217Code(new Function0<Intent>() { // from class: com.appsflyer.internal.AFj1pSDK.2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: K_, reason: merged with bridge method [inline-methods] */
            public final Intent invoke() {
                return AFj1pSDK.this.getRevenue.putExtra(str, j);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "Error while trying to write " + str + " extra to intent", null, true);
    }

    private final <T> T getCurrencyIso4217Code(Function0<? extends T> function0, String str, T t, boolean z) {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        Object obj;
        Object m13470constructorimpl3;
        synchronized (this.getRevenue) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AFj1pSDK aFj1pSDK = this;
                m13470constructorimpl = Result.m13470constructorimpl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(ConcurrentModificationException.class), Reflection.getOrCreateKotlinClass(ArrayIndexOutOfBoundsException.class)};
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
                }
                if (ArraysKt.contains(kClassArr, Reflection.getOrCreateKotlinClass(m13473exceptionOrNullimpl.getClass()))) {
                    if (z) {
                        obj = getCurrencyIso4217Code(function0, str, t, false);
                    } else {
                        AFLogger.afErrorLog(str, m13473exceptionOrNullimpl, false, false);
                        obj = t;
                    }
                    m13470constructorimpl2 = Result.m13470constructorimpl(obj);
                    m13470constructorimpl = m13470constructorimpl2;
                } else {
                    throw m13473exceptionOrNullimpl;
                }
            }
            KClass[] kClassArr2 = {Reflection.getOrCreateKotlinClass(RuntimeException.class)};
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl2 != null) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
                }
                if (ArraysKt.contains(kClassArr2, Reflection.getOrCreateKotlinClass(m13473exceptionOrNullimpl2.getClass()))) {
                    AFLogger.afErrorLog(str, m13473exceptionOrNullimpl2, false, false);
                    m13470constructorimpl3 = Result.m13470constructorimpl(t);
                    m13470constructorimpl = (T) m13470constructorimpl3;
                } else {
                    throw m13473exceptionOrNullimpl2;
                }
            }
            ResultKt.throwOnFailure(m13470constructorimpl);
        }
        return (T) m13470constructorimpl;
    }
}
