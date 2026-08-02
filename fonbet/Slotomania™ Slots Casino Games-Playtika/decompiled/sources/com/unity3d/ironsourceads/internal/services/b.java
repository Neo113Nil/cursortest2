package com.unity3d.ironsourceads.internal.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C2472i9;
import com.ironsource.C2556n4;
import com.ironsource.C2736x5;
import com.ironsource.EnumC2507k9;
import com.ironsource.EnumC2754y5;
import com.ironsource.InterfaceC2426g;
import com.ironsource.InterfaceC2444h;
import com.ironsource.Jb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.k;
import com.safedk.android.utils.Logger;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import com.unity3d.ironsourceads.internal.services.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b implements com.unity3d.ironsourceads.internal.services.a {
    private final InterfaceC2426g a;
    private final InterfaceC2444h b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC2507k9.values().length];
            try {
                iArr[EnumC2507k9.DIRECT_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2507k9.APP_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public b(InterfaceC2426g actionIntentFactory, InterfaceC2444h activityIntentFactory) {
        Intrinsics.checkNotNullParameter(actionIntentFactory, "actionIntentFactory");
        Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
        this.a = actionIntentFactory;
        this.b = activityIntentFactory;
    }

    private final a.AbstractC0392a b(Activity activity, Intent intent) {
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, intent, 794006778);
        a(this, EnumC2754y5.INLINE_STORE_LAUNCHED, EnumC2507k9.DIRECT_INTENT, null, 4, null);
        return a.AbstractC0392a.b.a;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    public a.AbstractC0392a a(Context context, C2472i9 request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            a(this, EnumC2754y5.INLINE_STORE_REQUESTED, request.g(), null, 4, null);
            if (TextUtils.isEmpty(request.h())) {
                a(EnumC2754y5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", "storeUrl is empty")));
                return new a.AbstractC0392a.C0393a("storeUrl is empty");
            }
            if (!(context instanceof Activity)) {
                a(EnumC2754y5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", "context is not an Activity")));
                return new a.AbstractC0392a.C0393a("context is not an Activity");
            }
            Intent a2 = a(request);
            if (!a(context, a2)) {
                a(EnumC2754y5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", "Failed to resolve for packageManager")));
                return new a.AbstractC0392a.C0393a("Failed to resolve for packageManager");
            }
            int i = a.a[request.g().ordinal()];
            if (i == 1) {
                return b((Activity) context, a2);
            }
            if (i == 2) {
                return a((Activity) context, a2);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            C2556n4.d().a(exc);
            String str = "Failed to open inline store: " + exc.getMessage();
            IronLog.INTERNAL.error(exc.toString());
            a(EnumC2754y5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", str)));
            return new a.AbstractC0392a.C0393a(str);
        }
    }

    public b() {
        this(new k.a(), new k.b());
    }

    private final Intent a(C2472i9 c2472i9) {
        Intent a2 = this.a.a();
        a2.setPackage(c2472i9.f());
        a2.setData(Uri.parse(c2472i9.h()));
        JSONObject e = c2472i9.e();
        if (e != null) {
            Iterator<String> keys = e.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object value = e.get(next);
                if (value instanceof String) {
                    a2.putExtra(next, (String) value);
                } else if (value instanceof Boolean) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    a2.putExtra(next, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    a2.putExtra(next, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    a2.putExtra(next, ((Number) value).longValue());
                } else if (value instanceof Float) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    a2.putExtra(next, ((Number) value).floatValue());
                } else if (value instanceof Double) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    a2.putExtra(next, ((Number) value).doubleValue());
                } else {
                    a2.putExtra(next, value.toString());
                }
            }
        }
        return a2;
    }

    private final boolean a(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private final a.AbstractC0392a a(Activity activity, Intent intent) {
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, new InlineStoreActivity.b(this.b).a(intent).a(activity));
        a(this, EnumC2754y5.INLINE_STORE_ACTIVITY_LAUNCHED, EnumC2507k9.APP_ACTIVITY, null, 4, null);
        return a.AbstractC0392a.b.a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    public a.AbstractC0392a a(Context context, EnumC2507k9 strategy) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        try {
            a(this, EnumC2754y5.INLINE_STORE_DESTROY_REQUESTED, strategy, null, 4, null);
            if (!(context instanceof Activity)) {
                a(EnumC2754y5.INLINE_STORE_DESTROY_FAILED, strategy, MapsKt.mutableMapOf(TuplesKt.to("reason", "context is not an Activity")));
                return new a.AbstractC0392a.C0393a("context is not an Activity");
            }
            int i = a.a[strategy.ordinal()];
            if (i == 1) {
                intent = new Intent(context, (Class<?>) ControllerActivity.class);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                intent = new Intent(context, (Class<?>) InlineStoreActivity.class);
            }
            intent.addFlags(603979776);
            intent.putExtra("destroy_inline_store", true);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            a(this, EnumC2754y5.INLINE_STORE_DESTROY_LAUNCHED, strategy, null, 4, null);
            return a.AbstractC0392a.b.a;
        } catch (Exception e) {
            C2556n4.d().a(e);
            String str = "Failed to destroy inline store: " + e.getMessage();
            IronLog.INTERNAL.error(e.toString());
            a(EnumC2754y5.INLINE_STORE_DESTROY_FAILED, strategy, MapsKt.mutableMapOf(TuplesKt.to("reason", str)));
            return new a.AbstractC0392a.C0393a(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a(b bVar, EnumC2754y5 enumC2754y5, EnumC2507k9 enumC2507k9, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        bVar.a(enumC2754y5, enumC2507k9, map);
    }

    private final void a(EnumC2754y5 enumC2754y5, EnumC2507k9 enumC2507k9, Map<String, Object> map) {
        try {
            map.put(IronSourceConstants.EVENTS_EXT1, "strategy:" + enumC2507k9.b());
            Jb.u.d().q().a(new C2736x5(enumC2754y5, new JSONObject(MapsKt.toMap(map))));
        } catch (Exception e) {
            C2556n4.d().a(e);
        }
    }
}
