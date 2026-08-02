package com.braze.support;

import android.content.Context;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/braze/support/PackageUtils;", "", "()V", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "", "getResourcePackageName", "context", "Landroid/content/Context;", "setResourcePackageName", "", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PackageUtils {
    public static final PackageUtils INSTANCE = new PackageUtils();
    private static String packageName;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Package name may not be blank";
        }
    }

    private PackageUtils() {
    }

    @JvmStatic
    public static final String getResourcePackageName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = packageName;
        if (str != null) {
            return str;
        }
        String packageName2 = context.getPackageName();
        packageName = packageName2;
        return packageName2 == null ? "unknown.package" : packageName2;
    }

    @JvmStatic
    public static final void setResourcePackageName(String packageName2) {
        Intrinsics.checkNotNullParameter(packageName2, "packageName");
        if (StringsKt.isBlank(packageName2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
        } else {
            packageName = packageName2;
        }
    }
}
