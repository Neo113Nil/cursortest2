package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z9c extends gbc {
    public final MediaRouter2 i;
    public final j0l j;
    public final ArrayMap k;
    public final MediaRouter2$RouteCallback l;
    public final y9c m;
    public final u9c n;
    public final ip0 o;
    public boolean p;
    public ArrayList q;
    public final ArrayMap r;
    public String s;

    public z9c(Context context, j0l j0lVar) {
        super(context, null);
        this.k = new ArrayMap();
        this.m = new y9c(this);
        this.n = new u9c(this);
        this.q = new ArrayList();
        this.r = new ArrayMap();
        this.i = MediaRouter2.getInstance(context);
        this.j = j0lVar;
        this.o = new ip0(new Handler(Looper.getMainLooper()), 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.l = new x9c(this, 1);
        } else {
            this.l = new x9c(this, 0);
        }
    }

    public static Messenger k(MediaRouter2.RoutingController routingController) {
        Bundle controlHints = routingController.getControlHints();
        if (controlHints == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    public static String m(ebc ebcVar) {
        MediaRouter2.RoutingController routingController;
        if ((ebcVar instanceof v9c) && (routingController = ((v9c) ebcVar).g) != null) {
            return routingController.getId();
        }
        return null;
    }

    @Override // defpackage.gbc
    public final dbc a(String str, fbc fbcVar) {
        Iterator it = this.k.entrySet().iterator();
        while (it.hasNext()) {
            v9c v9cVar = (v9c) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, v9cVar.f)) {
                return v9cVar;
            }
        }
        return null;
    }

    @Override // defpackage.gbc
    public final ebc d(String str) {
        return new w9c((String) this.r.get(str), null);
    }

    @Override // defpackage.gbc
    public final ebc g(String str, String str2) {
        String str3 = (String) this.r.get(str);
        for (v9c v9cVar : this.k.values()) {
            if (TextUtils.equals(str2, v9cVar.p())) {
                return new w9c(str3, v9cVar);
            }
        }
        return new w9c(str3, null);
    }

    @Override // defpackage.gbc
    public final void h(oac oacVar) {
        ArrayList<String> arrayList;
        ibc ibcVar;
        RouteDiscoveryPreference build;
        String str;
        int i = pbc.c == null ? 0 : pbc.c().B;
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.l;
        u9c u9cVar = this.n;
        y9c y9cVar = this.m;
        if (i <= 0) {
            this.i.unregisterRouteCallback(mediaRouter2$RouteCallback);
            this.i.unregisterTransferCallback(y9cVar);
            this.i.unregisterControllerCallback(u9cVar);
            return;
        }
        sbc sbcVar = pbc.c().u;
        boolean z = sbcVar == null ? false : sbcVar.c;
        if (oacVar == null) {
            oacVar = new oac(ibc.c, false);
        }
        oacVar.a();
        ArrayList c = oacVar.b.c();
        if (!z) {
            c.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!c.contains("android.media.intent.category.LIVE_AUDIO")) {
            c.add("android.media.intent.category.LIVE_AUDIO");
        }
        if (c.isEmpty()) {
            arrayList = null;
        } else {
            Iterator it = c.iterator();
            arrayList = null;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 == null) {
                    a70.p("category must not be null");
                    return;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                ArrayList<String> arrayList2 = arrayList;
                if (!arrayList.contains(str2)) {
                    arrayList2.add(str2);
                }
                arrayList = arrayList2;
            }
        }
        if (arrayList == null) {
            ibcVar = ibc.c;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList);
            ibcVar = new ibc(bundle, arrayList);
        }
        boolean b = oacVar.b();
        if (ibcVar == null) {
            a70.p("selector must not be null");
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("selector", ibcVar.a);
        bundle2.putBoolean("activeScan", b);
        MediaRouter2 mediaRouter2 = this.i;
        ibcVar.a();
        if (ibcVar.b.contains(null)) {
            fx.d();
            build = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        } else {
            boolean z2 = bundle2.getBoolean("activeScan");
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ibcVar.c().iterator();
            while (it2.hasNext()) {
                str = (String) it2.next();
                str.getClass();
                switch (str) {
                    case "android.media.intent.category.REMOTE_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_PLAYBACK";
                        break;
                    case "android.media.intent.category.LIVE_AUDIO":
                        str = "android.media.route.feature.LIVE_AUDIO";
                        break;
                    case "android.media.intent.category.LIVE_VIDEO":
                        str = "android.media.route.feature.LIVE_VIDEO";
                        break;
                    case "android.media.intent.category.REMOTE_AUDIO_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
                        break;
                    case "android.media.intent.category.REMOTE_VIDEO_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
                        break;
                }
                arrayList3.add(str);
            }
            build = new RouteDiscoveryPreference.Builder(arrayList3, z2).build();
        }
        ip0 ip0Var = this.o;
        mediaRouter2.registerRouteCallback(ip0Var, mediaRouter2$RouteCallback, build);
        this.i.registerTransferCallback(ip0Var, y9cVar);
        this.i.registerControllerCallback(ip0Var, u9cVar);
    }

    public final MediaRoute2Info l(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            MediaRoute2Info d = i3c.d(it.next());
            if (TextUtils.equals(d.getId(), str)) {
                return d;
            }
        }
        return null;
    }

    public final void n() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator<MediaRoute2Info> it = this.i.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info d = i3c.d(it.next());
            if (d != null && !arraySet.contains(d) && !d.isSystemRoute()) {
                if (this.p) {
                    if (!d.getId().startsWith(this.a.getPackageName() + "/")) {
                    }
                }
                arraySet.add(d);
                arrayList.add(d);
            }
        }
        if (arrayList.equals(this.q)) {
            return;
        }
        this.q = arrayList;
        ArrayMap arrayMap = this.r;
        arrayMap.clear();
        Iterator it2 = this.q.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info d2 = i3c.d(it2.next());
            Bundle extras = d2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                d2.toString();
            } else {
                arrayMap.put(d2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = this.q.iterator();
        while (it3.hasNext()) {
            mac s = y9.s(i3c.d(it3.next()));
            if (s != null) {
                arrayList2.add(s);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                mac macVar = (mac) it4.next();
                if (macVar == null) {
                    a70.p("route must not be null");
                    return;
                } else {
                    if (arrayList3.contains(macVar)) {
                        a70.p("route descriptor already added");
                        return;
                    }
                    arrayList3.add(macVar);
                }
            }
        }
        i(new hbc(arrayList3, true));
    }

    public final void o(MediaRouter2.RoutingController routingController) {
        g7h g7hVar;
        v9c v9cVar = (v9c) this.k.get(routingController);
        if (v9cVar == null) {
            Objects.toString(routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            routingController.toString();
            return;
        }
        ArrayList d = y9.d(selectedRoutes);
        mac s = y9.s(i3c.d(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.a.getString(R.string.mr_dialog_default_group_name);
        mac macVar = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    macVar = new mac(bundle);
                }
            } catch (Exception unused) {
            }
        }
        if (macVar == null) {
            g7hVar = new g7h(routingController.getId(), string);
            Bundle bundle2 = (Bundle) g7hVar.b;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            g7hVar = new g7h(macVar);
        }
        Bundle bundle3 = (Bundle) g7hVar.b;
        bundle3.putInt("volume", routingController.getVolume());
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        ((ArrayList) g7hVar.d).clear();
        g7hVar.e(s.b());
        ((ArrayList) g7hVar.c).clear();
        g7hVar.f(d);
        mac k = g7hVar.k();
        ArrayList d2 = y9.d(routingController.getSelectableRoutes());
        ArrayList d3 = y9.d(routingController.getDeselectableRoutes());
        hbc hbcVar = this.g;
        if (hbcVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<mac> list = hbcVar.b;
        if (!list.isEmpty()) {
            for (mac macVar2 : list) {
                String d4 = macVar2.d();
                arrayList.add(new cbc(macVar2, d.contains(d4) ? 3 : 1, d3.contains(d4), d2.contains(d4), true));
            }
        }
        v9cVar.o = k;
        v9cVar.l(k, arrayList);
    }

    public final void p(String str) {
        MediaRoute2Info l = l(str);
        if (l == null) {
            return;
        }
        if (TextUtils.equals(this.s, str)) {
            l.toString();
        } else {
            this.s = str;
            this.i.transferTo(l);
        }
    }
}
