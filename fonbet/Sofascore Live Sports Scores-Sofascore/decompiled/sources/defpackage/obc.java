package defpackage;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class obc {
    public final nbc a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public Bundle s;
    public IntentSender t;
    public mac u;
    public final ArrayList k = new ArrayList();
    public int r = -1;
    public ArrayList v = new ArrayList();

    public obc(nbc nbcVar, String str, String str2, boolean z) {
        this.a = nbcVar;
        this.b = str;
        this.c = str2;
        this.h = z;
    }

    public static dbc b() {
        pbc.b();
        ebc ebcVar = pbc.c().e;
        if (ebcVar instanceof dbc) {
            return (dbc) ebcVar;
        }
        return null;
    }

    public final lbc a() {
        if (this instanceof lbc) {
            return (lbc) this;
        }
        return null;
    }

    public final gbc c() {
        pbc.b();
        return this.a.a;
    }

    public final boolean d() {
        pbc.b();
        obc obcVar = pbc.c().v;
        if (obcVar == null) {
            a70.r("There is no default route.  The media router has not yet been fully initialized.");
            return false;
        }
        if (obcVar == this || this.n == 3) {
            return true;
        }
        return TextUtils.equals(((ComponentName) c().b.b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean e() {
        return !this.v.isEmpty();
    }

    public final boolean f() {
        return this.u != null && this.g;
    }

    public final boolean g() {
        pbc.b();
        return pbc.c().h() == this;
    }

    public final boolean h(ibc ibcVar) {
        if (ibcVar == null) {
            a70.p("selector must not be null");
            return false;
        }
        pbc.b();
        ibcVar.a();
        if (!ibcVar.b.isEmpty()) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                IntentFilter intentFilter = (IntentFilter) it.next();
                if (intentFilter != null) {
                    Iterator it2 = ibcVar.b.iterator();
                    while (it2.hasNext()) {
                        if (intentFilter.hasCategory((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fc, code lost:
    
        if (r3.hasNext() == false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(mac macVar) {
        int i;
        obc obcVar;
        int countActions;
        if (this.u != macVar) {
            this.u = macVar;
            if (macVar != null) {
                Bundle bundle = macVar.a;
                if (Objects.equals(this.d, bundle.getString("name"))) {
                    i = 0;
                } else {
                    this.d = bundle.getString("name");
                    i = 1;
                }
                if (!Objects.equals(this.e, bundle.getString("status"))) {
                    this.e = bundle.getString("status");
                    i = 1;
                }
                Uri uri = this.f;
                String string = bundle.getString("iconUri");
                if (!Objects.equals(uri, string == null ? null : Uri.parse(string))) {
                    String string2 = bundle.getString("iconUri");
                    this.f = string2 == null ? null : Uri.parse(string2);
                    i = 1;
                }
                if (this.g != bundle.getBoolean("enabled", true)) {
                    this.g = bundle.getBoolean("enabled", true);
                    i = 1;
                }
                if (this.i != bundle.getInt("connectionState", 0)) {
                    this.i = bundle.getInt("connectionState", 0);
                    i = 1;
                }
                ArrayList b = macVar.b();
                ArrayList arrayList = this.k;
                if (arrayList != b) {
                    ListIterator listIterator = arrayList.listIterator();
                    ListIterator listIterator2 = b.listIterator();
                    loop0: while (listIterator.hasNext() && listIterator2.hasNext()) {
                        IntentFilter intentFilter = (IntentFilter) listIterator.next();
                        IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                        if (intentFilter != intentFilter2) {
                            if (intentFilter == null || intentFilter2 == null || (countActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                                break;
                            }
                            int i2 = 0;
                            while (true) {
                                if (i2 >= countActions) {
                                    int countCategories = intentFilter.countCategories();
                                    if (countCategories != intentFilter2.countCategories()) {
                                        break;
                                    }
                                    for (int i3 = 0; i3 < countCategories; i3++) {
                                        if (!intentFilter.getCategory(i3).equals(intentFilter2.getCategory(i3))) {
                                            break loop0;
                                        }
                                    }
                                } else {
                                    if (!intentFilter.getAction(i2).equals(intentFilter2.getAction(i2))) {
                                        break loop0;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                    if (!listIterator.hasNext()) {
                    }
                    arrayList.clear();
                    arrayList.addAll(macVar.b());
                    i = 1;
                }
                if (this.l != bundle.getInt("playbackType", 1)) {
                    this.l = bundle.getInt("playbackType", 1);
                    i = 1;
                }
                if (this.m != bundle.getInt("playbackStream", -1)) {
                    this.m = bundle.getInt("playbackStream", -1);
                    i = 1;
                }
                if (this.n != bundle.getInt("deviceType")) {
                    this.n = bundle.getInt("deviceType");
                    i = 1;
                }
                int i4 = 3;
                if (this.o != bundle.getInt("volumeHandling", 0)) {
                    this.o = bundle.getInt("volumeHandling", 0);
                    i = 3;
                }
                if (this.p != bundle.getInt("volume")) {
                    this.p = bundle.getInt("volume");
                    i = 3;
                }
                if (this.q != bundle.getInt("volumeMax")) {
                    this.q = bundle.getInt("volumeMax");
                } else {
                    i4 = i;
                }
                if (this.r != bundle.getInt("presentationDisplayId", -1)) {
                    this.r = bundle.getInt("presentationDisplayId", -1);
                    i4 |= 5;
                }
                if (!Objects.equals(this.s, bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS))) {
                    this.s = bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS);
                    i4 |= 1;
                }
                if (!Objects.equals(this.t, (IntentSender) bundle.getParcelable("settingsIntent"))) {
                    this.t = (IntentSender) bundle.getParcelable("settingsIntent");
                    i4 |= 1;
                }
                if (this.j != bundle.getBoolean("canDisconnect", false)) {
                    this.j = bundle.getBoolean("canDisconnect", false);
                    i4 |= 5;
                }
                ArrayList c = macVar.c();
                ArrayList arrayList2 = new ArrayList();
                boolean z = c.size() != this.v.size();
                if (!c.isEmpty()) {
                    yz8 c2 = pbc.c();
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        c2.getClass();
                        String str2 = (String) c2.k.get(new g7e(((ComponentName) this.a.d.b).flattenToShortString(), str));
                        Iterator it2 = c2.i.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obcVar = null;
                                break;
                            }
                            obcVar = (obc) it2.next();
                            if (obcVar.c.equals(str2)) {
                                break;
                            }
                        }
                        if (obcVar != null) {
                            arrayList2.add(obcVar);
                            if (!z && !this.v.contains(obcVar)) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    return i4;
                }
                this.v = arrayList2;
                return i4 | 1;
            }
        }
        return 0;
    }

    public final void j(int i) {
        pbc.b();
        yz8 c = pbc.c();
        int min = Math.min(this.q, Math.max(0, i));
        ebc g = c.g(this);
        if (g != null) {
            g.f(min);
        }
    }

    public final void k(int i) {
        ebc g;
        pbc.b();
        if (i == 0 || (g = pbc.c().g(this)) == null) {
            return;
        }
        g.i(i);
    }

    public final void l(boolean z) {
        pbc.b();
        pbc.c().k(this, 3, z);
    }

    public final boolean m(String str) {
        pbc.b();
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            if (((IntentFilter) it.next()).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", iconUri=");
        sb.append(this.f);
        sb.append(", enabled=");
        sb.append(this.g);
        sb.append(", isSystemRoute=");
        sb.append(this.h);
        sb.append(", connectionState=");
        sb.append(this.i);
        sb.append(", canDisconnect=");
        sb.append(this.j);
        sb.append(", playbackType=");
        sb.append(this.l);
        sb.append(", playbackStream=");
        sb.append(this.m);
        sb.append(", deviceType=");
        sb.append(this.n);
        sb.append(", volumeHandling=");
        sb.append(this.o);
        sb.append(", volume=");
        sb.append(this.p);
        sb.append(", volumeMax=");
        sb.append(this.q);
        sb.append(", presentationDisplayId=");
        sb.append(this.r);
        sb.append(", extras=");
        sb.append(this.s);
        sb.append(", settingsIntent=");
        sb.append(this.t);
        sb.append(", providerPackageName=");
        sb.append(((ComponentName) this.a.d.b).getPackageName());
        if (e()) {
            sb.append(", members=[");
            int size = this.v.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.v.get(i) != this) {
                    sb.append(((obc) this.v.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
