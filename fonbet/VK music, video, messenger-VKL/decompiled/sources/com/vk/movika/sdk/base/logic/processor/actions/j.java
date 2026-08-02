package com.vk.movika.sdk.base.logic.processor.actions;

import com.vk.movika.sdk.base.model.actions.a;
import com.vk.movika.sdk.base.model.k;
import com.vk.movika.sdk.base.model.s;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.fpf0;
import xsna.msy;
import xsna.n23;
import xsna.rfc;

/* loaded from: classes3.dex */
public abstract class j<T extends com.vk.movika.sdk.base.model.actions.a> implements com.vk.movika.sdk.base.logic.processor.g {
    public final rfc a;

    public static final class a<T> {
        public final com.vk.movika.sdk.base.logic.e a;
        public final com.vk.movika.sdk.base.model.actions.a b;
        public final k c;
        public final s d;
        public final boolean e;
        public final Object f;
        public final Object g;
        public final Object h;
        public final Object i;

        public a(com.vk.movika.sdk.base.logic.e eVar, com.vk.movika.sdk.base.model.actions.a aVar, k kVar, s sVar, boolean z) {
            this.a = eVar;
            this.b = aVar;
            this.c = kVar;
            this.d = sVar;
            this.e = z;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            int i = 0;
            this.f = msy.a(lazyThreadSafetyMode, new f(this, i));
            this.g = msy.a(lazyThreadSafetyMode, new g(this, i));
            this.h = msy.a(lazyThreadSafetyMode, new h(this, i));
            this.i = msy.a(lazyThreadSafetyMode, new i(this, i));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b.equals(aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StateScope(state=");
            sb.append(this.a);
            sb.append(", action=");
            sb.append(this.b);
            sb.append(", blame=");
            sb.append(this.c);
            sb.append(", manifest=");
            sb.append(this.d);
            sb.append(", isAuto=");
            return n23.b(sb, this.e, ")");
        }
    }

    public j(rfc rfcVar) {
        this.a = rfcVar;
    }

    @Override // com.vk.movika.sdk.base.logic.processor.g
    public final List<com.vk.movika.sdk.base.logic.processor.e> a(com.vk.movika.sdk.base.logic.e eVar, com.vk.movika.sdk.base.model.actions.a aVar, k kVar, s sVar, boolean z) {
        com.vk.movika.sdk.base.model.actions.a aVar2;
        if (fpf0.a(aVar.getClass()).equals(this.a)) {
            try {
                aVar2 = aVar;
            } catch (ClassCastException unused) {
                aVar2 = aVar;
            }
            try {
                return b(new a<>(eVar, aVar2, kVar, sVar, z));
            } catch (ClassCastException unused2) {
                com.vk.movika.sdk.utils.c.d(this, null, new e(0, this, aVar2));
                return EmptyList.b;
            }
        }
        return EmptyList.b;
    }

    public abstract List<com.vk.movika.sdk.base.logic.processor.e> b(a<T> aVar);
}
