package i6;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import i6.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    final HashMap f65885a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final p.b f65886b;

    final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5434v f65887a;

        a(AbstractC5434v abstractC5434v) {
            this.f65887a = abstractC5434v;
        }

        @Override // i6.m
        public final void onDestroy() {
            n.this.f65885a.remove(this.f65887a);
        }

        @Override // i6.m
        public final void onStart() {
        }

        @Override // i6.m
        public final void onStop() {
        }
    }

    private final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        private final G f65889a;

        b(G g10) {
            this.f65889a = g10;
        }

        private void b(G g10, HashSet hashSet) {
            List<ComponentCallbacksC5392m> r02 = g10.r0();
            int size = r02.size();
            for (int i11 = 0; i11 < size; i11++) {
                ComponentCallbacksC5392m componentCallbacksC5392m = r02.get(i11);
                b(componentCallbacksC5392m.getChildFragmentManager(), hashSet);
                AbstractC5434v lifecycle = componentCallbacksC5392m.getLifecycle();
                n nVar = n.this;
                nVar.getClass();
                p6.l.a();
                com.bumptech.glide.n nVar2 = (com.bumptech.glide.n) nVar.f65885a.get(lifecycle);
                if (nVar2 != null) {
                    hashSet.add(nVar2);
                }
            }
        }

        @Override // i6.q
        @NonNull
        public final Set<com.bumptech.glide.n> a() {
            HashSet hashSet = new HashSet();
            b(this.f65889a, hashSet);
            return hashSet;
        }
    }

    n(@NonNull p.b bVar) {
        this.f65886b = bVar;
    }

    final com.bumptech.glide.n a(Context context, com.bumptech.glide.c cVar, AbstractC5434v abstractC5434v, G g10, boolean z11) {
        p6.l.a();
        p6.l.a();
        HashMap hashMap = this.f65885a;
        com.bumptech.glide.n nVar = (com.bumptech.glide.n) hashMap.get(abstractC5434v);
        if (nVar != null) {
            return nVar;
        }
        l lVar = new l(abstractC5434v);
        com.bumptech.glide.n a11 = this.f65886b.a(cVar, lVar, new b(g10), context);
        hashMap.put(abstractC5434v, a11);
        lVar.b(new a(abstractC5434v));
        if (z11) {
            a11.onStart();
        }
        return a11;
    }
}
