package com.unity3d.ironsourceads.internal.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4144j9;
import com.ironsource.C4157k4;
import com.ironsource.C4355v5;
import com.ironsource.EnumC4180l9;
import com.ironsource.EnumC4373w5;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4081g;
import com.ironsource.InterfaceC4099h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.k;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import com.unity3d.ironsourceads.internal.services.a;
import defpackage.dmi;
import defpackage.ndd;
import defpackage.tub;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b implements com.unity3d.ironsourceads.internal.services.a {

    @NotNull
    private final InterfaceC4081g a;

    @NotNull
    private final InterfaceC4099h b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4180l9.values().length];
            try {
                iArr[EnumC4180l9.DIRECT_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4180l9.APP_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public b(@NotNull InterfaceC4081g interfaceC4081g, @NotNull InterfaceC4099h interfaceC4099h) {
        interfaceC4081g.getClass();
        interfaceC4099h.getClass();
        this.a = interfaceC4081g;
        this.b = interfaceC4099h;
    }

    private final a.AbstractC1347a b(Activity activity, Intent intent) {
        activity.startActivityForResult(intent, 794006778);
        a(this, EnumC4373w5.INLINE_STORE_LAUNCHED, EnumC4180l9.DIRECT_INTENT, null, 4, null);
        return a.AbstractC1347a.b.a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    @NotNull
    public a.AbstractC1347a a(@NotNull Context context, @NotNull C4144j9 c4144j9) {
        b bVar;
        context.getClass();
        c4144j9.getClass();
        try {
            bVar = this;
        } catch (Exception e) {
            e = e;
            bVar = this;
        }
        try {
            a(bVar, EnumC4373w5.INLINE_STORE_REQUESTED, c4144j9.g(), null, 4, null);
            if (TextUtils.isEmpty(c4144j9.h())) {
                bVar.a(EnumC4373w5.INLINE_STORE_FAILED, c4144j9.g(), tub.i(new Pair("reason", "storeUrl is empty")));
                return new a.AbstractC1347a.C1348a("storeUrl is empty");
            }
            if (!(context instanceof Activity)) {
                bVar.a(EnumC4373w5.INLINE_STORE_FAILED, c4144j9.g(), tub.i(new Pair("reason", "context is not an Activity")));
                return new a.AbstractC1347a.C1348a("context is not an Activity");
            }
            Intent a2 = bVar.a(c4144j9);
            if (!bVar.a(context, a2)) {
                bVar.a(EnumC4373w5.INLINE_STORE_FAILED, c4144j9.g(), tub.i(new Pair("reason", "Failed to resolve for packageManager")));
                return new a.AbstractC1347a.C1348a("Failed to resolve for packageManager");
            }
            int i = a.a[c4144j9.g().ordinal()];
            if (i == 1) {
                return bVar.b((Activity) context, a2);
            }
            if (i == 2) {
                return bVar.a((Activity) context, a2);
            }
            throw new ndd();
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            C4157k4.d().a(exc);
            String q = dmi.q("Failed to open inline store: ", exc.getMessage());
            IronLog.INTERNAL.error(exc.toString());
            bVar.a(EnumC4373w5.INLINE_STORE_FAILED, c4144j9.g(), tub.i(new Pair("reason", q)));
            return new a.AbstractC1347a.C1348a(q);
        }
    }

    public b() {
        this(new k.a(), new k.b());
    }

    private final Intent a(C4144j9 c4144j9) {
        Intent a2 = this.a.a();
        a2.setPackage(c4144j9.f());
        a2.setData(Uri.parse(c4144j9.h()));
        JSONObject e = c4144j9.e();
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

    private final boolean a(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private final a.AbstractC1347a a(Activity activity, Intent intent) {
        activity.startActivity(new InlineStoreActivity.b(this.b).a(intent).a(activity));
        a(this, EnumC4373w5.INLINE_STORE_ACTIVITY_LAUNCHED, EnumC4180l9.APP_ACTIVITY, null, 4, null);
        return a.AbstractC1347a.b.a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    @NotNull
    public a.AbstractC1347a a(@NotNull Context context, @NotNull EnumC4180l9 enumC4180l9) {
        Intent intent;
        context.getClass();
        enumC4180l9.getClass();
        try {
            a(this, EnumC4373w5.INLINE_STORE_DESTROY_REQUESTED, enumC4180l9, null, 4, null);
            if (!(context instanceof Activity)) {
                a(EnumC4373w5.INLINE_STORE_DESTROY_FAILED, enumC4180l9, tub.i(new Pair("reason", "context is not an Activity")));
                return new a.AbstractC1347a.C1348a("context is not an Activity");
            }
            int i = a.a[enumC4180l9.ordinal()];
            if (i == 1) {
                intent = new Intent(context, (Class<?>) ControllerActivity.class);
            } else if (i == 2) {
                intent = new Intent(context, (Class<?>) InlineStoreActivity.class);
            } else {
                throw new ndd();
            }
            intent.addFlags(603979776);
            intent.putExtra("destroy_inline_store", true);
            context.startActivity(intent);
            a(this, EnumC4373w5.INLINE_STORE_DESTROY_LAUNCHED, enumC4180l9, null, 4, null);
            return a.AbstractC1347a.b.a;
        } catch (Exception e) {
            C4157k4.d().a(e);
            String q = dmi.q("Failed to destroy inline store: ", e.getMessage());
            IronLog.INTERNAL.error(e.toString());
            a(EnumC4373w5.INLINE_STORE_DESTROY_FAILED, enumC4180l9, tub.i(new Pair("reason", q)));
            return new a.AbstractC1347a.C1348a(q);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(b bVar, EnumC4373w5 enumC4373w5, EnumC4180l9 enumC4180l9, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        bVar.a(enumC4373w5, enumC4180l9, map);
    }

    private final void a(EnumC4373w5 enumC4373w5, EnumC4180l9 enumC4180l9, Map<String, Object> map) {
        try {
            map.put(IronSourceConstants.EVENTS_EXT1, "strategy:" + enumC4180l9.b());
            Ib.v.d().q().a(new C4355v5(enumC4373w5, new JSONObject(tub.p(map))));
        } catch (Exception e) {
            C4157k4.d().a(e);
        }
    }
}
