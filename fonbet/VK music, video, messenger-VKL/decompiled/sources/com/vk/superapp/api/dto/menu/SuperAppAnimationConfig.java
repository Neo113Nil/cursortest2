package com.vk.superapp.api.dto.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: SuperAppAnimationConfig.kt */
/* loaded from: classes6.dex */
public final class SuperAppAnimationConfig {

    @pmi0("items")
    private final List<Animation> items;

    @pmi0("ttl")
    private final int ttl;

    public SuperAppAnimationConfig(List<Animation> list, int i) {
        this.items = list;
        this.ttl = i;
    }

    public final List<Animation> a() {
        return this.items;
    }

    public final int b() {
        return this.ttl;
    }

    public final boolean c() {
        Object obj;
        Iterator<T> it = this.items.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Animation) obj).b() == Action.SHAKE) {
                break;
            }
        }
        return obj != null;
    }

    public final SuperAppAnimationConfig d(SuperAppAnimationConfig superAppAnimationConfig) {
        String str;
        Object obj;
        Object obj2;
        ArrayList arrayList = new ArrayList();
        for (Animation animation : this.items) {
            Iterator<T> it = superAppAnimationConfig.items.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((Animation) obj).f(), animation.f())) {
                    break;
                }
            }
            Animation animation2 = (Animation) obj;
            String c = animation2 != null ? animation2.c() : null;
            Iterator<T> it2 = superAppAnimationConfig.items.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (epx.f(((Animation) obj2).g(), animation.g())) {
                    break;
                }
            }
            Animation animation3 = (Animation) obj2;
            if (animation3 != null) {
                str = animation3.d();
            }
            arrayList.add(Animation.a(animation, c, str));
        }
        return new SuperAppAnimationConfig(arrayList, this.ttl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppAnimationConfig)) {
            return false;
        }
        SuperAppAnimationConfig superAppAnimationConfig = (SuperAppAnimationConfig) obj;
        return epx.f(this.items, superAppAnimationConfig.items) && this.ttl == superAppAnimationConfig.ttl;
    }

    public final int hashCode() {
        return Integer.hashCode(this.ttl) + (this.items.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppAnimationConfig(items=");
        sb.append(this.items);
        sb.append(", ttl=");
        return vu5.b(sb, this.ttl, ')');
    }
}
