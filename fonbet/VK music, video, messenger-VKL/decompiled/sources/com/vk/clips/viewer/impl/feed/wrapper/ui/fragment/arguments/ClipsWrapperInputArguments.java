package com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments;

import android.os.Bundle;
import android.os.Parcelable;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.serialize.Serializer;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.bb;
import xsna.cb;
import xsna.dof;
import xsna.e4;
import xsna.eb;
import xsna.epx;
import xsna.eu1;
import xsna.ey0;
import xsna.g620;
import xsna.gy0;
import xsna.hh1;
import xsna.il1;
import xsna.m4;
import xsna.msy;
import xsna.pce;
import xsna.pkd;
import xsna.pn00;
import xsna.pu;
import xsna.q;
import xsna.rdi;
import xsna.trf;
import xsna.wqf;

/* compiled from: ClipsWrapperInputArguments.kt */
/* loaded from: classes17.dex */
public final class ClipsWrapperInputArguments {
    public static final a r = new a();
    public final ClipsWrapperFragment.h a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;

    /* compiled from: ClipsWrapperInputArguments.kt */
    public static final class a {
        public static ClipFeedOpenAction a(Bundle bundle) {
            ClipFeedOpenAction clipFeedOpenAction;
            if (bundle == null || !bundle.containsKey("ClipsWrapperFragment.open_action") || (clipFeedOpenAction = (ClipFeedOpenAction) bundle.getParcelable("ClipsWrapperFragment.open_action")) == null) {
                return null;
            }
            bundle.remove("ClipsWrapperFragment.open_action");
            return clipFeedOpenAction;
        }

        public static int b(List list, Bundle bundle) {
            if (bundle != null) {
                int i = bundle.getInt("ClipsWrapperFragment.init_tab", -1);
                Integer valueOf = Integer.valueOf(i);
                if (i < 0 || i >= list.size()) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    return valueOf.intValue();
                }
            }
            return -1;
        }

        public static List c(Bundle bundle) {
            ArrayList parcelableArrayList;
            List x;
            if (bundle == null || (parcelableArrayList = bundle.getParcelableArrayList("ClipsWrapperFragment.params")) == null || (x = rdi.x(parcelableArrayList)) == null) {
                pkd f = g620.f();
                String i = FullSourceJoinApi.EntryServiceType.CLIPS.i();
                return f.p(i != null ? new ClipFeedTab.WithPayload.Payload(pn00.i(new Pair("entry_service", i))) : null);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = x.iterator();
            while (it.hasNext()) {
                ClipFeedTab clipFeedTab = ((ClipsWrapperTab) it.next()).b;
                if (clipFeedTab != null) {
                    arrayList.add(clipFeedTab);
                }
            }
            return arrayList;
        }

        public static String d(Bundle bundle) {
            String string;
            return (bundle == null || (string = bundle.getString("ClipsWrapperFragment.clips_wrapper_id_param")) == null) ? UUID.randomUUID().toString() : string;
        }

        public static void e(Bundle bundle, ArrayList arrayList) {
            ConcurrentHashMap<String, ClipFeedTab> concurrentHashMap = ClipsWrapperTab.d;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new ClipsWrapperTab((ClipFeedTab) it.next()));
            }
            bundle.putParcelableArrayList("ClipsWrapperFragment.params", arrayList2);
        }
    }

    public ClipsWrapperInputArguments(ClipsWrapperFragment.h hVar) {
        this.a = hVar;
        bb bbVar = new bb(this, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, bbVar);
        this.c = msy.a(lazyThreadSafetyMode, new m4(this, 27));
        this.d = msy.a(lazyThreadSafetyMode, new pu(this, 29));
        this.e = msy.a(lazyThreadSafetyMode, new hh1(this, 21));
        this.f = msy.a(lazyThreadSafetyMode, new cb(this, 24));
        this.g = msy.a(lazyThreadSafetyMode, new ey0(this, 20));
        this.h = msy.a(lazyThreadSafetyMode, new eb(this, 23));
        this.i = msy.a(lazyThreadSafetyMode, new e4(this, 22));
        int i = 29;
        this.j = msy.a(lazyThreadSafetyMode, new il1(this, i));
        this.k = msy.a(lazyThreadSafetyMode, new gy0(this, i));
        int i2 = 28;
        this.l = msy.a(lazyThreadSafetyMode, new eu1(this, i2));
        this.m = msy.a(lazyThreadSafetyMode, new q(this, i2));
        this.n = msy.a(lazyThreadSafetyMode, new wqf(this, 1));
        this.o = msy.a(lazyThreadSafetyMode, new trf(this, 0));
        this.p = msy.a(lazyThreadSafetyMode, new pce(this, 6));
        this.q = msy.a(lazyThreadSafetyMode, new dof(this, 2));
    }

    public final Bundle a() {
        return (Bundle) this.a.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int b() {
        return ((Number) this.g.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final List<ClipFeedTab> c() {
        return (List) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final String d() {
        return (String) this.o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean e() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    /* compiled from: ClipsWrapperInputArguments.kt */
    public static final class ClipsWrapperTab extends Serializer.StreamParcelableAdapter {
        public final ClipFeedTab b;
        public final boolean c;
        public static final ConcurrentHashMap<String, ClipFeedTab> d = new ConcurrentHashMap<>();
        public static final Serializer.c<ClipsWrapperTab> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ClipsWrapperTab> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ClipsWrapperTab a(Serializer serializer) {
                ClipFeedTab remove;
                if (serializer.m()) {
                    remove = (ClipFeedTab) serializer.A(ClipFeedTab.class.getClassLoader());
                } else {
                    String H = serializer.H();
                    if (H == null) {
                        H = "";
                    }
                    remove = ClipsWrapperTab.d.remove(H);
                }
                return new ClipsWrapperTab(remove);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClipsWrapperTab[i];
            }
        }

        public ClipsWrapperTab(ClipFeedTab clipFeedTab, boolean z) {
            this.b = clipFeedTab;
            this.c = z;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            boolean z = this.c;
            ClipFeedTab clipFeedTab = this.b;
            byte b = (z || clipFeedTab == null) ? (byte) 0 : (byte) 1;
            serializer.L(b);
            if (b != 0) {
                serializer.e0(clipFeedTab);
                return;
            }
            String uuid = UUID.randomUUID().toString();
            serializer.j0(uuid);
            d.put(uuid, clipFeedTab);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClipsWrapperTab)) {
                return false;
            }
            ClipsWrapperTab clipsWrapperTab = (ClipsWrapperTab) obj;
            return epx.f(this.b, clipsWrapperTab.b) && this.c == clipsWrapperTab.c;
        }

        public final int hashCode() {
            ClipFeedTab clipFeedTab = this.b;
            return Boolean.hashCode(this.c) + ((clipFeedTab == null ? 0 : clipFeedTab.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipsWrapperTab(tab=");
            sb.append(this.b);
            sb.append(", isTransientTab=");
            return q0.a(sb, this.c, ')');
        }

        public ClipsWrapperTab(ClipFeedTab clipFeedTab) {
            this(clipFeedTab, clipFeedTab instanceof ClipFeedTab.c);
        }
    }
}
