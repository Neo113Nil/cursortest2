package com.vk.ads.core;

import android.graphics.Rect;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ads.core.NewsFeedWatcher;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.toggle.features.FeedFeatures;
import defpackage.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.function.Function;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.asu0;
import xsna.atv0;
import xsna.bc60;
import xsna.bpn0;
import xsna.di60;
import xsna.dlv;
import xsna.fx6;
import xsna.gzs;
import xsna.ic3;
import xsna.izi0;
import xsna.jg30;
import xsna.nuj;
import xsna.pwc0;
import xsna.qi6;
import xsna.rwc0;
import xsna.tn0;
import xsna.u1c0;
import xsna.wd2;
import xsna.zrp;

/* compiled from: NewsFeedWatcher.kt */
/* loaded from: classes14.dex */
public class NewsFeedWatcher implements rwc0<pwc0> {
    public static final HashSet<Integer> l = izi0.d(17, Integer.valueOf(atv0.b));
    public final RecyclerView a;
    public final dlv b;
    public boolean c;
    public int i;
    public final LinkedHashSet d = new LinkedHashSet();
    public final bpn0 e = new bpn0(new nuj(this, 29));
    public final bpn0 h = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.b(24));
    public List<? extends u1c0> j = EmptyList.b;
    public final LinkedHashMap k = new LinkedHashMap();
    public final a f = new a();
    public final bc60 g = new View.OnLayoutChangeListener() { // from class: xsna.bc60
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            NewsFeedWatcher.this.d();
        }
    };

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsFeedWatcher.kt */
    public static final class ScrollDirection {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScrollDirection[] $VALUES;
        public static final a Companion;
        public static final ScrollDirection DOWN;
        public static final ScrollDirection UP;

        /* compiled from: NewsFeedWatcher.kt */
        public static final class a {
        }

        static {
            ScrollDirection scrollDirection = new ScrollDirection("UP", 0);
            UP = scrollDirection;
            ScrollDirection scrollDirection2 = new ScrollDirection("DOWN", 1);
            DOWN = scrollDirection2;
            ScrollDirection[] scrollDirectionArr = {scrollDirection, scrollDirection2};
            $VALUES = scrollDirectionArr;
            $ENTRIES = new asp(scrollDirectionArr);
            Companion = new a();
        }

        public ScrollDirection() {
            throw null;
        }

        public static ScrollDirection valueOf(String str) {
            return (ScrollDirection) Enum.valueOf(ScrollDirection.class, str);
        }

        public static ScrollDirection[] values() {
            return (ScrollDirection[]) $VALUES.clone();
        }
    }

    /* compiled from: NewsFeedWatcher.kt */
    public static final class a extends RecyclerView.t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            bpn0 bpn0Var = NewsFeedWatcher.this.h;
            if (i == 0) {
                Iterator it = ((List) bpn0Var.getValue()).iterator();
                while (it.hasNext()) {
                    ((gzs) it.next()).invoke();
                }
                ((List) bpn0Var.getValue()).clear();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ScrollDirection.Companion.getClass();
            if ((i2 < 0 ? ScrollDirection.UP : i2 > 0 ? ScrollDirection.DOWN : null) == null) {
                return;
            }
            Math.abs(i2);
            NewsFeedWatcher.this.d();
        }
    }

    /* compiled from: NewsFeedWatcher.kt */
    public static abstract class b {
    }

    /* compiled from: NewsFeedWatcher.kt */
    public static final class c extends b {
        public final NewsEntry a;
        public final u1c0 b;
        public final int c;
        public final Rect d;
        public final int e;
        public final int f;

        public c(NewsEntry newsEntry, u1c0 u1c0Var, int i, Rect rect, int i2, int i3) {
            this.a = newsEntry;
            this.b = u1c0Var;
            this.c = i;
            this.d = rect;
            this.e = i2;
            this.f = i3;
        }
    }

    /* compiled from: NewsFeedWatcher.kt */
    public static final class d extends b {
        public static final d a = new d();
    }

    /* compiled from: NewsFeedWatcher.kt */
    public static final class e {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final ArrayList<b> g;
        public final Map<NewsEntry, Integer> h;

        public e(int i, int i2, int i3, int i4, int i5, int i6, ArrayList arrayList, LinkedHashMap linkedHashMap) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = arrayList;
            this.h = linkedHashMap;
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [xsna.bc60] */
    public NewsFeedWatcher(RecyclerView recyclerView, dlv dlvVar) {
        this.a = recyclerView;
        this.b = dlvVar;
    }

    @Override // xsna.rwc0
    public final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        a aVar = this.f;
        RecyclerView recyclerView = this.a;
        recyclerView.addOnScrollListener(aVar);
        recyclerView.addOnLayoutChangeListener(this.g);
        jg30 jg30Var = (jg30) this;
        jg30Var.m.c().a0(asu0.a.d()).subscribe(jg30Var.n);
        jg30Var.d();
    }

    @Override // xsna.rwc0
    public final void b() {
        if (this.c) {
            this.c = false;
            a aVar = this.f;
            RecyclerView recyclerView = this.a;
            recyclerView.removeOnScrollListener(aVar);
            recyclerView.removeOnLayoutChangeListener(this.g);
            com.vk.ads.core.a aVar2 = (com.vk.ads.core.a) this.e.getValue();
            aVar2.getClass();
            try {
                aVar2.b.submit(new wd2(aVar2, 3));
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(th);
            }
            jg30 jg30Var = (jg30) this;
            jg30Var.n.dispose();
            NewsEntry b2 = jg30Var.m.b();
            if (b2 != null) {
                jg30Var.e(b2);
            }
        }
    }

    @Override // xsna.rwc0
    public final void c() {
        com.vk.ads.core.a aVar = (com.vk.ads.core.a) this.e.getValue();
        aVar.getClass();
        try {
            aVar.b.submit(new ic3(aVar, 4));
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
    }

    public final void d() {
        u1c0 J0;
        RecyclerView recyclerView = this.a;
        int childCount = recyclerView.getChildCount();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            LinkedHashMap linkedHashMap = this.k;
            if (i >= childCount) {
                final e eVar = new e(recyclerView.getLeft(), recyclerView.getTop(), recyclerView.getRight(), recyclerView.getBottom() - this.i, recyclerView.getHeight(), this.i, arrayList, linkedHashMap);
                final com.vk.ads.core.a aVar = (com.vk.ads.core.a) this.e.getValue();
                aVar.getClass();
                final long currentTimeMillis = System.currentTimeMillis();
                final long uptimeMillis = SystemClock.uptimeMillis();
                try {
                    aVar.b.submit(new Runnable() { // from class: xsna.ouk
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z;
                            Object obj;
                            com.vk.ads.core.a aVar2 = com.vk.ads.core.a.this;
                            mh50 mh50Var = aVar2.c;
                            Rect rect = mh50Var.a;
                            NewsFeedWatcher.e eVar2 = eVar;
                            rect.set(eVar2.a, eVar2.b, eVar2.c, eVar2.d);
                            aVar2.g = eVar2.e;
                            aVar2.e = eVar2.f;
                            aVar2.f = eVar2.h;
                            ArrayList<NewsFeedWatcher.b> arrayList2 = eVar2.g;
                            ArrayList<u1c0> arrayList3 = aVar2.d;
                            Iterator<NewsFeedWatcher.b> it = arrayList2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                NewsFeedWatcher.b next = it.next();
                                Object obj2 = null;
                                if (next instanceof NewsFeedWatcher.c) {
                                    Iterator<T> it2 = mh50Var.a().iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj = it2.next();
                                            if (epx.f(((kh50) obj).a, ((NewsFeedWatcher.c) next).a)) {
                                                break;
                                            }
                                        } else {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    kh50 kh50Var = (kh50) obj;
                                    if (kh50Var != null && kh50Var.b != ((NewsFeedWatcher.c) next).f) {
                                        try {
                                            aVar2.b.submit(new ew4(3, aVar2, kh50Var.a));
                                        } catch (Throwable th) {
                                            com.vk.metrics.eventtracking.b.a.a(th);
                                        }
                                        mh50Var.a().remove(kh50Var);
                                        kh50Var = null;
                                    }
                                    if (kh50Var == null) {
                                        NewsFeedWatcher.c cVar = (NewsFeedWatcher.c) next;
                                        NewsEntry newsEntry = cVar.a;
                                        int i2 = cVar.f;
                                        int i3 = cVar.b.k;
                                        Integer num = aVar2.f.get(newsEntry);
                                        kh50Var = new kh50(newsEntry, i2, i3, num != null ? num.intValue() : 0);
                                        mh50Var.a().add(kh50Var);
                                    }
                                    Iterator<T> it3 = kh50Var.f().iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        Object next2 = it3.next();
                                        if (epx.f(((gi50) next2).d, ((NewsFeedWatcher.c) next).b)) {
                                            obj2 = next2;
                                            break;
                                        }
                                    }
                                    gi50 gi50Var = (gi50) obj2;
                                    if (gi50Var != null) {
                                        NewsFeedWatcher.c cVar2 = (NewsFeedWatcher.c) next;
                                        gi50Var.a = cVar2.c;
                                        gi50Var.c = cVar2.d;
                                        gi50Var.d = cVar2.b;
                                    } else {
                                        NewsFeedWatcher.c cVar3 = (NewsFeedWatcher.c) next;
                                        kh50Var.f().add(new gi50(cVar3.c, cVar3.a, cVar3.d, cVar3.b, cVar3.e));
                                    }
                                    arrayList3.add(((NewsFeedWatcher.c) next).b);
                                } else {
                                    arrayList3.add(null);
                                }
                            }
                            for (kh50 kh50Var2 : mh50Var.a()) {
                                Rect rect2 = kh50Var2.h;
                                NewsEntry newsEntry2 = kh50Var2.a;
                                rect2.setEmpty();
                                kh50Var2.i = 0;
                                Iterator<T> it4 = kh50Var2.f().iterator();
                                while (true) {
                                    z = true;
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    gi50 gi50Var2 = (gi50) it4.next();
                                    rect2.union(gi50Var2.c);
                                    if (gi50Var2.c.height() == gi50Var2.e) {
                                        kh50Var2.i++;
                                    }
                                }
                                gi50 first = mh50Var.a().first().f().first();
                                gi50 last = mh50Var.a().last().f().last();
                                if ((epx.f(first.b, newsEntry2) || epx.f(last.b, newsEntry2)) && ((first.a - arrayList3.indexOf(first.d) != 0 || epx.f(last.b, newsEntry2)) && rect2.height() < (aVar2.g - aVar2.e) * 0.95f)) {
                                    z = false;
                                }
                                if (!kh50Var2.e) {
                                    kh50Var2.e = z;
                                }
                            }
                            Iterator<T> it5 = aVar2.a.iterator();
                            while (it5.hasNext()) {
                                ((kuc0) it5.next()).c(aVar2.c, currentTimeMillis, uptimeMillis);
                            }
                            SortedSet<kh50> a2 = mh50Var.a();
                            Iterator<T> it6 = a2.iterator();
                            while (it6.hasNext()) {
                                Iterator<gi50> it7 = ((kh50) it6.next()).f().iterator();
                                while (it7.hasNext()) {
                                    if (!arrayList3.contains(it7.next().d)) {
                                        it7.remove();
                                    }
                                }
                            }
                            a2.removeIf(new puk(new m4g(aVar2, 10), 0));
                            arrayList3.clear();
                        }
                    });
                    return;
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.a(th);
                    return;
                }
            }
            View childAt = recyclerView.getChildAt(i);
            RecyclerView.e0 findContainingViewHolder = recyclerView.findContainingViewHolder(childAt);
            if (findContainingViewHolder != null) {
                if (findContainingViewHolder instanceof qi6) {
                    qi6 qi6Var = (qi6) findContainingViewHolder;
                    NewsEntry t6 = qi6Var.t6();
                    if (t6 != null && (J0 = qi6Var.J0()) != null) {
                        Parcelable parcelable = J0.b;
                        if (!l.contains(Integer.valueOf(J0.c))) {
                            if (this.j.isEmpty()) {
                                dlv dlvVar = this.b;
                                if (dlvVar != null) {
                                    final tn0 tn0Var = new tn0(18, dlvVar, J0);
                                    linkedHashMap.computeIfAbsent(parcelable, new Function() { // from class: xsna.cc60
                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            return (Integer) tn0.this.invoke(obj);
                                        }
                                    });
                                }
                            } else {
                                linkedHashMap.computeIfAbsent(parcelable, new fx6(new o(27, this, J0), 2));
                            }
                        }
                        View view = findContainingViewHolder.itemView;
                        int layoutPosition = qi6Var.getLayoutPosition();
                        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
                        if (!di60.x(t6) || !com.vk.toggle.b.A.a(FeedFeatures.ADS_VISIBILITY_RECT_FIX)) {
                            recyclerView.getChildVisibleRect(view, rect, null);
                        } else if (!childAt.getGlobalVisibleRect(rect)) {
                            rect.setEmpty();
                        }
                        arrayList.add(new c(t6, J0, layoutPosition, rect, view.getHeight(), parcelable instanceof DeprecatedStatisticInterface ? ((DeprecatedStatisticInterface) parcelable).Wa() : 0));
                    }
                } else {
                    arrayList.add(d.a);
                }
            }
            i++;
        }
    }

    @Override // xsna.rwc0
    public final void setOffset(int i) {
        this.i = i;
    }
}
