package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URI;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w48 extends ode {
    public static final l10 e = l10.c();
    public final wad c;
    public final Context d;

    public w48(wad wadVar, Context context) {
        this.d = context;
        this.c = wadVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // defpackage.ode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        URI create;
        wad wadVar = this.c;
        String url = wadVar.getUrl();
        boolean isEmpty = url == null ? true : url.trim().isEmpty();
        l10 l10Var = e;
        if (isEmpty) {
            l10Var.getClass();
            return false;
        }
        String url2 = wadVar.getUrl();
        if (url2 != null) {
            try {
                create = URI.create(url2);
            } catch (IllegalArgumentException | IllegalStateException e2) {
                l10Var.e("getResultUrl throws exception %s", e2.getMessage());
            }
            if (create != null) {
                l10Var.getClass();
                return false;
            }
            Context context = this.d;
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
            if (identifier != 0) {
                l10.c().getClass();
                if (o6a.e == null) {
                    o6a.e = resources.getStringArray(identifier);
                }
                String host = create.getHost();
                if (host != null) {
                    for (String str : o6a.e) {
                        if (!host.contains(str)) {
                        }
                    }
                    create.toString();
                    l10Var.getClass();
                    return false;
                }
            }
            String host2 = create.getHost();
            if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
                l10Var.getClass();
                return false;
            }
            String scheme = create.getScheme();
            if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme))) {
                l10Var.getClass();
                return false;
            }
            if (create.getUserInfo() != null) {
                l10Var.getClass();
                return false;
            }
            int port = create.getPort();
            if (port != -1 && port <= 0) {
                l10Var.getClass();
                return false;
            }
            tad l = wadVar.u() ? wadVar.l() : null;
            if (l == null || l == tad.HTTP_METHOD_UNKNOWN) {
                wadVar.l().toString();
                l10Var.getClass();
                return false;
            }
            if (wadVar.v() && wadVar.m() <= 0) {
                l10Var.getClass();
                return false;
            }
            if (wadVar.w() && wadVar.o() < 0) {
                l10Var.getClass();
                return false;
            }
            if (wadVar.x() && wadVar.p() < 0) {
                l10Var.getClass();
                return false;
            }
            if (!wadVar.t() || wadVar.j() <= 0) {
                l10Var.getClass();
                return false;
            }
            if (wadVar.y() && wadVar.q() < 0) {
                l10Var.getClass();
                return false;
            }
            if (wadVar.A() && wadVar.s() < 0) {
                l10Var.getClass();
                return false;
            }
            if (!wadVar.z() || wadVar.r() <= 0) {
                l10Var.getClass();
                return false;
            }
            if (wadVar.v()) {
                return true;
            }
            l10Var.getClass();
            return false;
        }
        create = null;
        if (create != null) {
        }
    }
}
