package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.playcore_hsdp.zzg;
import com.google.android.play.core.hsdp.service.HsdpLoadingPanelContainer;
import com.google.android.play.core.hsdp.service.HsdpShimActivity;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pqg implements gg9 {
    public boolean a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;

    public pqg(Context context, zzg zzgVar, zzg zzgVar2, boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        if (z3 && (context instanceof Activity)) {
            z4 = true;
        }
        l2a l2aVar = context instanceof Activity ? new l2a((Activity) context) : null;
        this.h = null;
        this.d = context;
        this.e = zzgVar;
        this.f = zzgVar2;
        this.a = z;
        this.b = z2;
        this.c = z4;
        this.g = l2aVar;
    }

    public static void f(String str, eg9 eg9Var, Map map, d2o d2oVar, Activity activity) {
        int F = rha.F(activity, activity.getResources().getConfiguration().screenWidthDp);
        int G = rha.G(activity);
        y0p y0pVar = (y0p) d2oVar;
        Activity activity2 = y0pVar.b;
        String packageName = activity2.getPackageName();
        IBinder windowToken = activity2.getWindow().getDecorView().getWindowToken();
        if (windowToken == null) {
            a70.r("Window token is null, cannot open HPOA service.");
            return;
        }
        kto ktoVar = new kto(y0pVar, str, packageName, windowToken, F, G, eg9Var, map);
        i1k i1kVar = y0pVar.a;
        if (i1kVar == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("appId", str);
        bundle.putString("callerId", packageName);
        bundle.putBinder("windowToken", windowToken);
        i1kVar.k(new jgo(2, y0pVar, bundle, ktoVar));
    }

    public void a(String str) {
        rfn rfnVar = (rfn) ((v3p) ((zzg) this.f).zza());
        if (((okn) rfnVar.c.get(str)) != null) {
            Bundle bundle = new Bundle();
            bundle.putString("callingPackage", rfnVar.a.getPackageName());
            bundle.putString("targetPackage", str);
            bundle.putString("sdkVersion", "2.0.0");
            bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
            rfnVar.b.k(new jyo(rfnVar, bundle, false, 8));
        }
        d();
    }

    public void b(String str, String str2, eg9 eg9Var, Map map, boolean z) {
        zzg zzgVar = (zzg) this.e;
        Context context = (Context) this.d;
        Intent X = hda.X(str, str2, context.getPackageName(), map);
        if (!this.b) {
            Activity activity = (Activity) context;
            if (((l2a) this.g) == null) {
                a70.r("hsdpLoadingPanel cannot be null when using activity-based HSDP.");
                return;
            }
            X.addFlags(536870912);
            X.addFlags(262144);
            if (activity.getPackageManager().resolveActivity(X, C.DEFAULT_BUFFER_SEGMENT_SIZE) != null) {
                e();
                activity.startActivityForResult(X, 0);
                eg9Var.onDeepLinkStarted();
                f(str, eg9Var, map, (d2o) zzgVar.zza(), activity);
                return;
            }
            if (this.a) {
                f(str, eg9Var, map, (d2o) zzgVar.zza(), activity);
                return;
            } else {
                activity.startActivityForResult(hda.V(str, str2, map), 0);
                return;
            }
        }
        Uri data = X.getData();
        if (data == null) {
            Bundle bundle = new Bundle();
            bundle.putString("errorMessage", "Deeplink URL is null.");
            eg9Var.onError(bundle);
            return;
        }
        String uri = data.toString();
        if (context instanceof Activity) {
            zzg zzgVar2 = (zzg) this.f;
            Activity activity2 = (Activity) context;
            ako akoVar = (ako) ((IInterface) ((rfn) ((v3p) zzgVar2.zza())).b.k);
            if (akoVar == null || !akoVar.asBinder().isBinderAlive()) {
                e();
            }
            ((rfn) ((v3p) zzgVar2.zza())).a(str, uri, activity2.getWindow().getDecorView().getWindowToken(), rha.F(activity2, activity2.getResources().getConfiguration().screenWidthDp), rha.G(activity2), z, !this.c ? new phn(this, eg9Var, activity2, str, str2, map) : new bjn(this, eg9Var, activity2, str, str2, map));
            return;
        }
        Intent intent = new Intent(context, (Class<?>) HsdpShimActivity.class);
        intent.putExtra("target_package_name", str);
        intent.putExtra(Payload.RFR, str2);
        intent.putExtra("auto_trigger", z);
        intent.putExtra("deeplink_url", uri);
        if (map != null) {
            Bundle bundle2 = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                bundle2.putString((String) entry.getKey(), (String) entry.getValue());
            }
            intent.putExtra("extra_query_params_bundle", bundle2);
        }
        intent.addFlags(262144);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public void c() {
        qqg qqgVar = (qqg) this.d;
        if (qqgVar.getLifecycle().b() != e6b.b) {
            a70.r("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.a) {
                a70.r("SavedStateRegistry was already attached.");
                return;
            }
            ((e6g) this.e).invoke();
            qqgVar.getLifecycle().a(new ga(this, 5));
            this.a = true;
        }
    }

    public void d() {
        if (this.c) {
            Context context = (Context) this.d;
            l2a l2aVar = (l2a) this.g;
            Activity activity = (Activity) context;
            if (l2aVar == null) {
                a70.r("hsdpLoadingPanel cannot be null when loading panel is enabled.");
                return;
            }
            View view = (View) l2aVar.d;
            if (view != null) {
                ((Activity) l2aVar.b).runOnUiThread(new wjn(0, l2aVar, view));
            }
            if (((tgn) this.h) != null) {
                activity.getApplication().unregisterActivityLifecycleCallbacks((tgn) this.h);
                this.h = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e() {
        View inflate;
        Resources resources;
        int identifier;
        Drawable drawable;
        boolean z;
        if (this.c) {
            Context context = (Context) this.d;
            l2a l2aVar = (l2a) this.g;
            Activity activity = (Activity) context;
            if (l2aVar == null) {
                a70.r("hsdpLoadingPanel cannot be null when enabling loading panel.");
                return;
            }
            if (((View) l2aVar.d) == null) {
                if (((tgn) this.h) != null) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks((tgn) this.h);
                }
                this.h = new tgn(this, activity);
                activity.getApplication().registerActivityLifecycleCallbacks((tgn) this.h);
                Activity activity2 = (Activity) l2aVar.b;
                if (((View) l2aVar.d) == null && (inflate = LayoutInflater.from(activity2).inflate(R.layout.sdk_loading_panel, (ViewGroup) null)) != null) {
                    l2aVar.d = inflate;
                    ((HsdpLoadingPanelContainer) inflate).setOnConfigurationChangedListener(new f2n(l2aVar, 10));
                    View findViewById = inflate.findViewById(R.id.hsdp_service_prism_with_loading_indicator);
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                    try {
                        resources = activity2.getPackageManager().getResourcesForApplication("com.android.vending");
                    } catch (Exception unused) {
                        resources = null;
                    }
                    ImageView imageView = (ImageView) inflate.findViewById(R.id.play_prism);
                    if (imageView != null) {
                        if (resources != null) {
                            try {
                                int identifier2 = resources.getIdentifier("product_logo_play_prism_color_24", "drawable", "com.android.vending");
                                if (identifier2 != 0) {
                                    imageView.setImageDrawable(resources.getDrawable(identifier2, activity2.getTheme()));
                                }
                            } catch (RuntimeException unused2) {
                            }
                        }
                        try {
                            imageView.setImageResource(R.drawable.logo_play_prism_24dp);
                        } catch (RuntimeException unused3) {
                            l2aVar.d = null;
                            return;
                        }
                    }
                    ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.sdk_dismiss_button);
                    if (imageButton != null) {
                        int color = activity2.getColor(l2aVar.L() ? R.color.dismiss_icon_grey_500 : R.color.dismiss_icon_grey_700);
                        if (resources != null) {
                            try {
                                int identifier3 = resources.getIdentifier(l2aVar.L() ? "grey_500" : "grey_700", "color", "com.android.vending");
                                if (identifier3 != 0) {
                                    color = resources.getColor(identifier3, activity2.getTheme());
                                }
                                identifier = resources.getIdentifier("gs_close_rond100_vd_theme_24", "drawable", "com.android.vending");
                            } catch (RuntimeException unused4) {
                            }
                            if (identifier != 0) {
                                drawable = resources.getDrawable(identifier, activity2.getTheme());
                                z = true;
                                if (drawable == null) {
                                    drawable = td4.d0(android.R.drawable.ic_menu_close_clear_cancel, activity2);
                                    z = false;
                                }
                                if (drawable != null) {
                                    l2aVar.d = null;
                                    return;
                                }
                                drawable.setTint(color);
                                imageButton.setImageDrawable(drawable);
                                imageButton.setOnClickListener(new cb(l2aVar));
                                "Successfully loaded and tinted dismiss icon from ".concat(true != z ? "local resources." : "com.android.vending.");
                            }
                        }
                        drawable = null;
                        z = false;
                        if (drawable == null) {
                        }
                        if (drawable != null) {
                        }
                    }
                    FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.content_frame);
                    if (frameLayout != null) {
                        GradientDrawable b = w1l.b(0);
                        b.setCornerRadii(new float[]{rha.F(activity2, 28), rha.F(activity2, 28), rha.F(activity2, 28), rha.F(activity2, 28), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT});
                        b.setColor(activity2.getColor(l2aVar.L() ? R.color.background_dark : R.color.background_light));
                        frameLayout.setBackground(b);
                        frameLayout.setClipToOutline(true);
                    }
                    View findViewById2 = inflate.findViewById(R.id.placeholder_loading);
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(0);
                    }
                    try {
                        rha.G(activity2);
                        activity2.getResources().getDimensionPixelSize(R.dimen.sdk_hsdp_loading_ui_height);
                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2, 40, -3);
                        layoutParams.height = Math.min(activity2.getResources().getDimensionPixelSize(R.dimen.sdk_hsdp_loading_ui_height), (int) (rha.G(activity2) * 0.6f));
                        if (activity2.getResources().getConfiguration().screenWidthDp > 640) {
                            layoutParams.width = rha.F(activity2, 640);
                        }
                        layoutParams.gravity = 81;
                        ((WindowManager) l2aVar.c).addView(inflate, layoutParams);
                        inflate.getWidth();
                        inflate.getHeight();
                        FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(R.id.content_frame);
                        if (frameLayout2 != null) {
                            frameLayout2.getWidth();
                            frameLayout2.getHeight();
                        }
                    } catch (RuntimeException unused5) {
                        l2aVar.d = null;
                    }
                }
            }
        }
    }

    public pqg(qqg qqgVar, e6g e6gVar) {
        this.d = qqgVar;
        this.e = e6gVar;
        this.f = new haf(3);
        this.g = new LinkedHashMap();
        this.c = true;
    }
}
