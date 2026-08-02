package v4;

import androidx.media3.exoplayer.source.D;
import b1.z;
import h1.InterfaceC4411g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import q1.u;
import t4.C6441a;
import u4.InterfaceC6500f;

/* renamed from: v4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6636c implements InterfaceC6635b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f67018d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static volatile C6636c f67019e;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC6500f f67021b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f67020a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f67022c = new ArrayList();

    /* renamed from: v4.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6636c a() {
            C6636c c6636c;
            C6636c c6636c2 = C6636c.f67019e;
            if (c6636c2 != null) {
                return c6636c2;
            }
            synchronized (this) {
                c6636c = C6636c.f67019e;
                if (c6636c == null) {
                    c6636c = new C6636c();
                    C6636c.f67019e = c6636c;
                }
            }
            return c6636c;
        }

        public a() {
        }
    }

    @Override // v4.InterfaceC6635b
    public void a(String id2, Object player) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(player, "player");
        Iterator it = this.f67020a.iterator();
        while (it.hasNext()) {
            ((InterfaceC6635b) it.next()).a(id2, player);
        }
    }

    @Override // v4.InterfaceC6635b
    public void b(String id2, Object player) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(player, "player");
        Iterator it = this.f67020a.iterator();
        while (it.hasNext()) {
            ((InterfaceC6635b) it.next()).b(id2, player);
        }
    }

    public final InterfaceC6500f e() {
        return this.f67021b;
    }

    public final u f(r4.i source, u drmSessionManager) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(drmSessionManager, "drmSessionManager");
        Iterator it = this.f67020a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
        }
        return null;
    }

    public final InterfaceC4411g.a g(r4.i source, InterfaceC4411g.a mediaDataSourceFactory) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mediaDataSourceFactory, "mediaDataSourceFactory");
        Iterator it = this.f67020a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
        }
        return null;
    }

    public final z.c h(r4.i source, z.c mediaItemBuilder) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mediaItemBuilder, "mediaItemBuilder");
        Iterator it = this.f67020a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
        }
        return null;
    }

    public final D.a i(r4.i source, D.a mediaSourceFactory, InterfaceC4411g.a mediaDataSourceFactory) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mediaSourceFactory, "mediaSourceFactory");
        Intrinsics.checkNotNullParameter(mediaDataSourceFactory, "mediaDataSourceFactory");
        Iterator it = this.f67020a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
        }
        return null;
    }

    public final void j(Object newInstance) {
        Intrinsics.checkNotNullParameter(newInstance, "newInstance");
        if (this.f67022c.size() > 2) {
            C6441a.a("ReactNativeVideoManager", "multiple Video displayed ?");
        }
        this.f67022c.add(newInstance);
    }

    public final boolean k(r4.i source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Iterator it = this.f67020a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
        }
        return false;
    }

    public final void l(Object newInstance) {
        Intrinsics.checkNotNullParameter(newInstance, "newInstance");
        this.f67022c.remove(newInstance);
    }
}
