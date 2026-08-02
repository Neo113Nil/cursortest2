package com.unity3d.ironsourceads.internal.services;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4385j9;
import com.ironsource.C4452n4;
import com.ironsource.C4632x5;
import com.ironsource.EnumC4421l9;
import com.ironsource.EnumC4650y5;
import com.ironsource.InterfaceC4322g;
import com.ironsource.InterfaceC4340h;
import com.ironsource.Kb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.k;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import com.unity3d.ironsourceads.internal.services.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.go9;
import xsna.pn00;

/* loaded from: classes14.dex */
public final class b implements com.unity3d.ironsourceads.internal.services.a {
    private final InterfaceC4322g a;
    private final InterfaceC4340h b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4421l9.values().length];
            try {
                iArr[EnumC4421l9.DIRECT_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4421l9.APP_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public b(InterfaceC4322g interfaceC4322g, InterfaceC4340h interfaceC4340h) {
        this.a = interfaceC4322g;
        this.b = interfaceC4340h;
    }

    private final a.AbstractC0369a b(Activity activity, Intent intent) {
        activity.startActivityForResult(intent, 794006778);
        a(this, EnumC4650y5.INLINE_STORE_LAUNCHED, EnumC4421l9.DIRECT_INTENT, null, 4, null);
        return a.AbstractC0369a.b.a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    public a.AbstractC0369a a(Context context, C4385j9 c4385j9) {
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            a(this, EnumC4650y5.INLINE_STORE_REQUESTED, c4385j9.g(), null, 4, null);
            if (TextUtils.isEmpty(c4385j9.h())) {
                a(EnumC4650y5.INLINE_STORE_FAILED, c4385j9.g(), pn00.m(new Pair("reason", "storeUrl is empty")));
                return new a.AbstractC0369a.C0370a("storeUrl is empty");
            }
            if (!(context instanceof Activity)) {
                a(EnumC4650y5.INLINE_STORE_FAILED, c4385j9.g(), pn00.m(new Pair("reason", "context is not an Activity")));
                return new a.AbstractC0369a.C0370a("context is not an Activity");
            }
            Intent a2 = a(c4385j9);
            if (!a(context, a2)) {
                a(EnumC4650y5.INLINE_STORE_FAILED, c4385j9.g(), pn00.m(new Pair("reason", "Failed to resolve for packageManager")));
                return new a.AbstractC0369a.C0370a("Failed to resolve for packageManager");
            }
            int i = a.a[c4385j9.g().ordinal()];
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
            C4452n4.d().a(exc);
            String b = go9.b("Failed to open inline store: ", exc.getMessage());
            IronLog.INTERNAL.error(exc.toString());
            a(EnumC4650y5.INLINE_STORE_FAILED, c4385j9.g(), pn00.m(new Pair("reason", b)));
            return new a.AbstractC0369a.C0370a(b);
        }
    }

    public b() {
        this(new k.a(), new k.b());
    }

    private final Intent a(C4385j9 c4385j9) {
        Intent a2 = this.a.a();
        a2.setPackage(c4385j9.f());
        a2.setData(Uri.parse(c4385j9.h()));
        JSONObject e = c4385j9.e();
        if (e != null) {
            Iterator<String> keys = e.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = e.get(next);
                if (obj instanceof String) {
                    a2.putExtra(next, (String) obj);
                } else if (obj instanceof Boolean) {
                    a2.putExtra(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    a2.putExtra(next, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    a2.putExtra(next, ((Number) obj).longValue());
                } else if (obj instanceof Float) {
                    a2.putExtra(next, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    a2.putExtra(next, ((Number) obj).doubleValue());
                } else {
                    a2.putExtra(next, obj.toString());
                }
            }
        }
        return a2;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private final boolean a(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private final a.AbstractC0369a a(Activity activity, Intent intent) {
        activity.startActivity(new InlineStoreActivity.b(this.b).a(intent).a(activity));
        a(this, EnumC4650y5.INLINE_STORE_ACTIVITY_LAUNCHED, EnumC4421l9.APP_ACTIVITY, null, 4, null);
        return a.AbstractC0369a.b.a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    public a.AbstractC0369a a(Context context, EnumC4421l9 enumC4421l9) {
        Intent intent;
        try {
            a(this, EnumC4650y5.INLINE_STORE_DESTROY_REQUESTED, enumC4421l9, null, 4, null);
            if (!(context instanceof Activity)) {
                a(EnumC4650y5.INLINE_STORE_DESTROY_FAILED, enumC4421l9, pn00.m(new Pair("reason", "context is not an Activity")));
                return new a.AbstractC0369a.C0370a("context is not an Activity");
            }
            int i = a.a[enumC4421l9.ordinal()];
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
            context.startActivity(intent);
            a(this, EnumC4650y5.INLINE_STORE_DESTROY_LAUNCHED, enumC4421l9, null, 4, null);
            return a.AbstractC0369a.b.a;
        } catch (Exception e) {
            C4452n4.d().a(e);
            String b = go9.b("Failed to destroy inline store: ", e.getMessage());
            IronLog.INTERNAL.error(e.toString());
            a(EnumC4650y5.INLINE_STORE_DESTROY_FAILED, enumC4421l9, pn00.m(new Pair("reason", b)));
            return new a.AbstractC0369a.C0370a(b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(b bVar, EnumC4650y5 enumC4650y5, EnumC4421l9 enumC4421l9, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        bVar.a(enumC4650y5, enumC4421l9, map);
    }

    private final void a(EnumC4650y5 enumC4650y5, EnumC4421l9 enumC4421l9, Map<String, Object> map) {
        try {
            map.put(IronSourceConstants.EVENTS_EXT1, "strategy:" + enumC4421l9.b());
            Kb.u.d().q().a(new C4632x5(enumC4650y5, new JSONObject(pn00.t(map))));
        } catch (Exception e) {
            C4452n4.d().a(e);
        }
    }
}
