package com.google.android.gms.analytics;

import Fj.c;
import N3.C3660k;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

@VisibleForTesting
/* loaded from: classes9.dex */
public class StandardExceptionParser implements ExceptionParser {
    private final TreeSet<String> zza = new TreeSet<>();

    public StandardExceptionParser(@RecentlyNonNull Context context, @RecentlyNonNull Collection<String> collection) {
        setIncludedPackages(context, collection);
    }

    @RecentlyNullable
    protected StackTraceElement getBestStackTraceElement(@RecentlyNonNull Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        if (stackTrace == null || (stackTrace.length) == 0) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Iterator<String> it = this.zza.iterator();
            while (it.hasNext()) {
                if (className.startsWith(it.next())) {
                    return stackTraceElement;
                }
            }
        }
        return stackTrace[0];
    }

    @RecentlyNonNull
    protected Throwable getCause(@RecentlyNonNull Throwable th2) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        return th2;
    }

    @Override // com.google.android.gms.analytics.ExceptionParser
    @RecentlyNonNull
    public String getDescription(String str, @RecentlyNonNull Throwable th2) {
        return getDescription(getCause(th2), getBestStackTraceElement(getCause(th2)), str);
    }

    public void setIncludedPackages(@RecentlyNonNull Context context, @RecentlyNonNull Collection<String> collection) {
        this.zza.clear();
        HashSet hashSet = new HashSet();
        if (collection != null) {
            hashSet.addAll(collection);
        }
        if (context != null) {
            hashSet.add(context.getApplicationContext().getPackageName());
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator<String> it2 = this.zza.iterator();
            boolean z11 = true;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                if (str.startsWith(next)) {
                    z11 = false;
                } else if (next.startsWith(str)) {
                    this.zza.remove(next);
                }
            }
            if (z11) {
                this.zza.add(str);
            }
        }
    }

    @RecentlyNonNull
    protected String getDescription(@RecentlyNonNull Throwable th2, StackTraceElement stackTraceElement, String str) {
        int length;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(th2.getClass().getSimpleName());
        if (stackTraceElement != null) {
            String[] split = stackTraceElement.getClassName().split("\\.");
            String str2 = (split == null || (length = split.length) <= 0) ? "unknown" : split[length - 1];
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            StringBuilder d11 = C3660k.d(" (@", str2, ProductContainerDTO.RATIO_DELIMITER, methodName, ProductContainerDTO.RATIO_DELIMITER);
            d11.append(lineNumber);
            d11.append(")");
            sb2.append(d11.toString());
        }
        if (str != null) {
            c.f(" {", str, "}", sb2);
        }
        return sb2.toString();
    }
}
