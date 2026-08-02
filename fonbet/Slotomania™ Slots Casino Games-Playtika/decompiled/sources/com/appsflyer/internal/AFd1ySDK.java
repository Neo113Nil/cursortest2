package com.appsflyer.internal;

import java.util.ArrayList;
import kotlin.ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public final class AFd1ySDK {
    private static String getMonetizationNetwork(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(th, "");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            if (!StringsKt.startsWith$default(className, "com.appsflyer", false, 2, (Object) null)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        String str = th + "\n" + CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, new Function1<StackTraceElement, CharSequence>() { // from class: com.appsflyer.internal.AFd1ySDK.2
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(StackTraceElement stackTraceElement2) {
                Intrinsics.checkNotNullParameter(stackTraceElement2, "");
                return "at " + stackTraceElement2;
            }
        }, 30, null);
        Intrinsics.checkNotNullParameter(str, "");
        return AFd1pSDK.getCurrencyIso4217Code(str, "SHA-256");
    }

    public static final AFc1cSDK getCurrencyIso4217Code(Throwable th, String str) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        String name = th.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return new AFc1cSDK(name + ": " + str, getMonetizationNetwork(th), ExceptionsKt.stackTraceToString(th), 0, 8, null);
    }
}
