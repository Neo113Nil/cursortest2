package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzclx;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a16 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public a16(lgh lghVar, Activity activity) {
        this.a = 5;
        lghVar.getClass();
        this.b = lghVar;
        this.c = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        g6b t;
        int i = this.a;
        IBinder iBinder = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                view.getClass();
                break;
            case 1:
                view.getClass();
                ((t79) obj2).removeOnAttachStateChangeListener(this);
                sea.v((t79) obj, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 2:
                view.getClass();
                ((lxa) obj2).removeOnAttachStateChangeListener(this);
                lxa lxaVar = (lxa) obj;
                g6b t2 = qea.t(lxaVar);
                if (t2 != null) {
                    zsk zskVar = new zsk(t2, 30);
                    zskVar.b(lxaVar, new ps4(lxaVar, 7), null);
                    lxaVar.n = zskVar;
                    break;
                }
                break;
            case 3:
                view.getClass();
                ((h6b) obj2).removeOnAttachStateChangeListener(this);
                h6b h6bVar = (h6b) obj;
                g6b t3 = qea.t(h6bVar);
                if (t3 != null) {
                    t3.a(h6bVar);
                    h6bVar.j(t3);
                    break;
                }
                break;
            case 4:
                view.getClass();
                ((View) obj2).removeOnAttachStateChangeListener(this);
                view.post(new a8p(15, view, (RecyclerView) obj));
                break;
            case 5:
                view.getClass();
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) obj).get();
                if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (activity != null && iBinder != null) {
                    ((lgh) obj2).c(iBinder, activity);
                    break;
                }
                break;
            case 6:
                ((ViewGroup) obj2).addView((nqi) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
            case 7:
                view.getClass();
                ((lmj) obj2).removeOnAttachStateChangeListener(this);
                lmj lmjVar = (lmj) obj;
                g6b t4 = qea.t(lmjVar);
                if (t4 != null) {
                    zsk zskVar2 = new zsk(t4, 30);
                    zskVar2.b(lmjVar, new ps4(lmjVar, 12), null);
                    lmjVar.s = zskVar2;
                    break;
                }
                break;
            case 8:
                view.getClass();
                ((TypeHeaderView) obj2).removeOnAttachStateChangeListener(this);
                TypeHeaderView typeHeaderView = (TypeHeaderView) obj;
                Pair pair = typeHeaderView.j;
                boolean booleanValue = ((Boolean) pair.a).booleanValue();
                boolean booleanValue2 = ((Boolean) pair.b).booleanValue();
                if (booleanValue || booleanValue2) {
                    sea.v(typeHeaderView.getRoot(), booleanValue, booleanValue2, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    break;
                }
            case 9:
                view.getClass();
                ((eqk) obj2).removeOnAttachStateChangeListener(this);
                eqk eqkVar = (eqk) obj;
                YouTubePlayerView youTubePlayerView = eqkVar.m;
                if (youTubePlayerView != null && (t = qea.t(eqkVar)) != null) {
                    t.a(youTubePlayerView);
                    break;
                }
                break;
            case 10:
                a3 a3Var = (a3) obj2;
                u6b w = qha.w(a3Var);
                if (w == null) {
                    r3a.c("View tree for " + a3Var + " has no ViewTreeLifecycleOwner");
                    pvd.x();
                    break;
                } else {
                    ((fsf) obj).a = tba.F(a3Var, w.getLifecycle());
                    a3Var.removeOnAttachStateChangeListener(this);
                    break;
                }
            case 11:
                break;
            default:
                ((zzclx) obj).N(view, (zzcef) obj2, 10);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                view.getClass();
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((b16) obj).a();
                break;
            case 1:
                view.getClass();
                break;
            case 2:
                view.getClass();
                break;
            case 3:
                view.getClass();
                break;
            case 4:
                view.getClass();
                break;
            case 5:
                view.getClass();
                break;
            case 6:
                ((ViewGroup) obj2).addView((nqi) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
            case 7:
                view.getClass();
                break;
            case 8:
                view.getClass();
                break;
            case 9:
                view.getClass();
                break;
            case 11:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((kqf) obj).A();
                break;
        }
    }

    public a16(zzclx zzclxVar, zzcef zzcefVar) {
        this.a = 12;
        this.b = zzcefVar;
        this.c = zzclxVar;
    }

    public /* synthetic */ a16(View view, int i, Object obj) {
        this.a = i;
        this.b = view;
        this.c = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
