package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vie extends gbc {
    public static final ArrayList s;
    public static final ArrayList t;
    public final yz8 i;
    public final MediaRouter j;
    public final tbc k;
    public final ubc l;
    public final MediaRouter.RouteCategory m;
    public int n;
    public boolean o;
    public boolean p;
    public final ArrayList q;
    public final ArrayList r;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        s = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        t = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public vie(Context context, yz8 yz8Var) {
        super(context, new yia(new ComponentName("android", vie.class.getName()), 4));
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.i = yz8Var;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.j = mediaRouter;
        this.k = new tbc(this);
        this.l = new ubc();
        this.m = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        v();
    }

    public static yie p(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof yie) {
            return (yie) tag;
        }
        return null;
    }

    public static void w(yie yieVar) {
        MediaRouter.UserRouteInfo userRouteInfo = yieVar.b;
        obc obcVar = yieVar.a;
        userRouteInfo.setName(obcVar.d);
        userRouteInfo.setPlaybackType(obcVar.l);
        userRouteInfo.setPlaybackStream(obcVar.m);
        userRouteInfo.setVolume(obcVar.p);
        userRouteInfo.setVolumeMax(obcVar.q);
        userRouteInfo.setVolumeHandling((!obcVar.e() || pbc.g()) ? obcVar.o : 0);
        userRouteInfo.setDescription(obcVar.e);
    }

    @Override // defpackage.gbc
    public final ebc d(String str) {
        int m = m(str);
        if (m >= 0) {
            return new wie(((xie) this.q.get(m)).a);
        }
        return null;
    }

    @Override // defpackage.gbc
    public final void h(oac oacVar) {
        boolean z;
        int i = 0;
        if (oacVar != null) {
            oacVar.a();
            ArrayList c = oacVar.b.c();
            int size = c.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) c.get(i);
                i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                i++;
            }
            z = oacVar.b();
            i = i2;
        } else {
            z = false;
        }
        if (this.n == i && this.o == z) {
            return;
        }
        this.n = i;
        this.o = z;
        v();
    }

    public final boolean k(MediaRouter.RouteInfo routeInfo) {
        String j;
        if (p(routeInfo) != null || l(routeInfo) >= 0) {
            return false;
        }
        String format = this.j.getDefaultRoute() == routeInfo ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(o(routeInfo).hashCode()));
        if (m(format) >= 0) {
            int i = 2;
            while (true) {
                Locale locale = Locale.US;
                j = mz1.j(i, format, "_");
                if (m(j) < 0) {
                    break;
                }
                i++;
            }
            format = j;
        }
        xie xieVar = new xie(routeInfo, format);
        u(xieVar);
        this.q.add(xieVar);
        return true;
    }

    public final int l(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((xie) arrayList.get(i)).a == routeInfo) {
                return i;
            }
        }
        return -1;
    }

    public final int m(String str) {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((xie) arrayList.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int n(obc obcVar) {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((yie) arrayList.get(i)).a == obcVar) {
                return i;
            }
        }
        return -1;
    }

    public final String o(MediaRouter.RouteInfo routeInfo) {
        Context context = this.a;
        CharSequence name = routeInfo.getName(context);
        if (!TextUtils.isEmpty(name)) {
            return name.toString();
        }
        if ((routeInfo.getSupportedTypes() & 8388608) != 0) {
            return "";
        }
        int deviceType = routeInfo.getDeviceType();
        return context.getString(deviceType != 1 ? deviceType != 2 ? deviceType != 3 ? R.string.mr_route_name_unknown : R.string.mr_route_name_bluetooth : R.string.mr_route_name_speaker : R.string.mr_route_name_tv);
    }

    public final void q(obc obcVar) {
        gbc c = obcVar.c();
        MediaRouter mediaRouter = this.j;
        if (c == this) {
            int l = l(mediaRouter.getSelectedRoute(8388611));
            if (l < 0 || !((xie) this.q.get(l)).b.equals(obcVar.b)) {
                return;
            }
            obcVar.l(false);
            return;
        }
        MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.m);
        yie yieVar = new yie(obcVar, createUserRoute);
        createUserRoute.setTag(yieVar);
        createUserRoute.setVolumeCallback(this.l);
        w(yieVar);
        this.r.add(yieVar);
        mediaRouter.addUserRoute(createUserRoute);
    }

    public final void r(obc obcVar) {
        int n;
        if (obcVar.c() == this || (n = n(obcVar)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((yie) this.r.remove(n)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.j.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void s(obc obcVar) {
        if (obcVar.g()) {
            gbc c = obcVar.c();
            MediaRouter mediaRouter = this.j;
            if (c != this) {
                int n = n(obcVar);
                if (n >= 0) {
                    mediaRouter.selectRoute(8388611, ((yie) this.r.get(n)).b);
                    return;
                }
                return;
            }
            int m = m(obcVar.b);
            if (m >= 0) {
                mediaRouter.selectRoute(8388611, ((xie) this.q.get(m)).a);
            }
        }
    }

    public final void t() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.q;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            mac macVar = ((xie) arrayList2.get(i)).c;
            if (macVar == null) {
                a70.p("route must not be null");
                return;
            } else {
                if (arrayList.contains(macVar)) {
                    a70.p("route descriptor already added");
                    return;
                }
                arrayList.add(macVar);
            }
        }
        i(new hbc(arrayList, false));
    }

    public final void u(xie xieVar) {
        String str = xieVar.b;
        MediaRouter.RouteInfo routeInfo = xieVar.a;
        g7h g7hVar = new g7h(str, o(routeInfo));
        Bundle bundle = (Bundle) g7hVar.b;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            g7hVar.e(s);
        }
        if ((supportedTypes & 2) != 0) {
            g7hVar.e(t);
        }
        bundle.putInt("playbackType", routeInfo.getPlaybackType());
        bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle.putInt("volume", routeInfo.getVolume());
        bundle.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
        bundle.putBoolean("isSystemRoute", (supportedTypes & 8388608) == 0);
        if (!routeInfo.isEnabled()) {
            bundle.putBoolean("enabled", false);
        }
        if (routeInfo.isConnecting()) {
            bundle.putInt("connectionState", 1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            bundle.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            bundle.putString("status", description.toString());
        }
        bundle.putInt("deviceType", routeInfo.getDeviceType());
        xieVar.c = g7hVar.k();
    }

    public final void v() {
        boolean z = this.p;
        tbc tbcVar = this.k;
        MediaRouter mediaRouter = this.j;
        if (z) {
            mediaRouter.removeCallback(tbcVar);
        }
        this.p = true;
        mediaRouter.addCallback(this.n, tbcVar, (this.o ? 1 : 0) | 2);
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z2 = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z2 |= k((MediaRouter.RouteInfo) it.next());
        }
        if (z2) {
            t();
        }
    }
}
