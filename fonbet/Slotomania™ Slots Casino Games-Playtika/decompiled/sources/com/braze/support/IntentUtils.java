package com.braze.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.List;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\b\u0010\u0013\u001a\u00020\u0004H\u0007J\b\u0010\u0014\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/braze/support/IntentUtils;", "", "()V", "REQUEST_CODE_MAX", "", "REQUEST_CODE_MIN", "random", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "random$delegate", "Lkotlin/Lazy;", "addComponentAndSendBroadcast", "", "context", "Landroid/content/Context;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "getImmutablePendingIntentFlags", "getMutablePendingIntentFlags", "getRequestCode", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IntentUtils {
    private static final int REQUEST_CODE_MAX = 1073741823;
    private static final int REQUEST_CODE_MIN = 100000;
    public static final IntentUtils INSTANCE = new IntentUtils();

    /* renamed from: random$delegate, reason: from kotlin metadata */
    private static final Lazy random = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) b.b);

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ ComponentName b;
        final /* synthetic */ Intent c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ComponentName componentName, Intent intent) {
            super(0);
            this.b = componentName;
            this.c = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Sent intent with component " + this.b + " and explicit intent " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/Random;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/util/Random;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<Random> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Random invoke() {
            return new Random();
        }
    }

    private IntentUtils() {
    }

    @JvmStatic
    public static final void addComponentAndSendBroadcast(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        List<ResolveInfo> queryBroadcastReceivers = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryBroadcastReceivers(intent, PackageManager.ResolveInfoFlags.of(0L)) : context.getPackageManager().queryBroadcastReceivers(intent, 0);
        Intrinsics.checkNotNullExpressionValue(queryBroadcastReceivers, "if (Build.VERSION.SDK_IN…vers(intent, 0)\n        }");
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setComponent(componentName);
            context.sendBroadcast(intent2);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.V, (Throwable) null, new a(componentName, intent2), 2, (Object) null);
        }
    }

    @JvmStatic
    public static final int getImmutablePendingIntentFlags() {
        return AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    }

    @JvmStatic
    public static final int getMutablePendingIntentFlags() {
        return Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    private final Random getRandom() {
        return (Random) random.getValue();
    }

    @JvmStatic
    public static final int getRequestCode() {
        return INSTANCE.getRandom().nextInt(1073741823) + 100000;
    }
}
