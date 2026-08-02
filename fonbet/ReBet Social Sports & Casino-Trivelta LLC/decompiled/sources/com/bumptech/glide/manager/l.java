package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC2185j;
import com.bumptech.glide.manager.n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Map f30101a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final n.b f30102b;

    public class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC2185j f30103a;

        public a(AbstractC2185j abstractC2185j) {
            this.f30103a = abstractC2185j;
        }

        @Override // com.bumptech.glide.manager.k
        public void a() {
            l.this.f30101a.remove(this.f30103a);
        }

        @Override // com.bumptech.glide.manager.k
        public void b() {
        }

        @Override // com.bumptech.glide.manager.k
        public void d() {
        }
    }

    public final class b implements o {

        /* renamed from: a, reason: collision with root package name */
        public final FragmentManager f30105a;

        public b(FragmentManager fragmentManager) {
            this.f30105a = fragmentManager;
        }

        @Override // com.bumptech.glide.manager.o
        public Set a() {
            HashSet hashSet = new HashSet();
            b(this.f30105a, hashSet);
            return hashSet;
        }

        public final void b(FragmentManager fragmentManager, Set set) {
            List C02 = fragmentManager.C0();
            int size = C02.size();
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = (Fragment) C02.get(i10);
                b(fragment.getChildFragmentManager(), set);
                com.bumptech.glide.m a10 = l.this.a(fragment.getLifecycle());
                if (a10 != null) {
                    set.add(a10);
                }
            }
        }
    }

    public l(n.b bVar) {
        this.f30102b = bVar;
    }

    public com.bumptech.glide.m a(AbstractC2185j abstractC2185j) {
        com.bumptech.glide.util.l.b();
        return (com.bumptech.glide.m) this.f30101a.get(abstractC2185j);
    }

    public com.bumptech.glide.m b(Context context, com.bumptech.glide.c cVar, AbstractC2185j abstractC2185j, FragmentManager fragmentManager, boolean z10) {
        com.bumptech.glide.util.l.b();
        com.bumptech.glide.m a10 = a(abstractC2185j);
        if (a10 != null) {
            return a10;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(abstractC2185j);
        com.bumptech.glide.m a11 = this.f30102b.a(cVar, lifecycleLifecycle, new b(fragmentManager), context);
        this.f30101a.put(abstractC2185j, a11);
        lifecycleLifecycle.b(new a(abstractC2185j));
        if (z10) {
            a11.d();
        }
        return a11;
    }
}
