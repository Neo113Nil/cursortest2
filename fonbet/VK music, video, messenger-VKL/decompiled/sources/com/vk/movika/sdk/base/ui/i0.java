package com.vk.movika.sdk.base.ui;

import com.vk.movika.sdk.base.ui.i0;
import com.vk.movika.sdk.player.base.components.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import xsna.e43;
import xsna.g5g;
import xsna.j5g;
import xsna.msy;
import xsna.s3q0;

/* loaded from: classes3.dex */
public final class i0 implements com.vk.movika.sdk.player.base.components.b {
    public static final a Companion = new a();
    public final p0 a;
    public final com.vk.movika.sdk.utils.i<String, com.vk.movika.sdk.player.base.model.a> b = new com.vk.movika.sdk.utils.i<>();
    public final HashMap<String, b> c = new HashMap<>();
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new g0(0));

    public static final class a {
    }

    public final class b {
        public com.vk.movika.sdk.common.a a = null;
        public final ArrayList b;

        public b(ArrayList arrayList) {
            this.b = arrayList;
        }
    }

    public static final class c implements b.a {
        public final /* synthetic */ b a;
        public final /* synthetic */ i0 b;
        public final /* synthetic */ String c;

        public c(b bVar, i0 i0Var, String str) {
            this.a = bVar;
            this.b = i0Var;
            this.c = str;
        }

        @Override // com.vk.movika.sdk.player.base.components.b.a
        public final void a(com.vk.movika.sdk.player.base.model.a aVar) {
            Iterator it = j5g.O0(this.a.b).iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(aVar);
            }
            com.vk.movika.sdk.utils.i<String, com.vk.movika.sdk.player.base.model.a> iVar = this.b.b;
            String str = this.c;
            synchronized (iVar) {
                try {
                    Set<String> keySet = iVar.a.keySet();
                    if (iVar.b.size() >= 256) {
                        if (keySet.contains(str)) {
                            iVar.b.remove(str);
                            iVar.a.remove(str);
                        } else {
                            iVar.a.remove(g5g.I(iVar.b));
                        }
                    }
                    iVar.a.put(str, aVar);
                    if (iVar.b.contains(str)) {
                        iVar.a(str);
                    } else {
                        iVar.b.add(0, str);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.b.c.remove(this.c);
        }

        @Override // com.vk.movika.sdk.player.base.components.b.a
        public final void b(com.vk.movika.sdk.player.base.model.a aVar, RuntimeException runtimeException) {
            Iterator it = j5g.O0(this.a.b).iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).b(aVar, runtimeException);
            }
            this.b.c.remove(this.c);
        }
    }

    public i0(p0 p0Var) {
        this.a = p0Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.movika.sdk.player.base.components.b
    public final com.vk.movika.sdk.common.a a(com.vk.movika.sdk.player.base.model.a aVar, b.a aVar2) {
        final String str = aVar.a;
        com.vk.movika.sdk.utils.i<String, com.vk.movika.sdk.player.base.model.a> iVar = this.b;
        boolean containsKey = iVar.a.containsKey(str);
        ?? r3 = this.d;
        if (containsKey) {
            iVar.a(str);
            com.vk.movika.sdk.player.base.model.a aVar3 = iVar.a.get(str);
            if (aVar3 != null) {
                aVar2.a(aVar3);
                return (com.vk.movika.sdk.common.a) r3.getValue();
            }
        }
        HashMap<String, b> hashMap = this.c;
        b bVar = hashMap.get(str);
        if (bVar != null) {
            bVar.b.add(aVar2);
            return (com.vk.movika.sdk.common.a) r3.getValue();
        }
        b bVar2 = new b(e43.o(aVar2));
        c cVar = new c(bVar2, this, str);
        hashMap.put(str, bVar2);
        bVar2.a = ((v0) this.a.c).d.e.a(aVar, cVar);
        return new com.vk.movika.sdk.common.a() { // from class: com.vk.movika.sdk.base.ui.h0
            @Override // com.vk.movika.sdk.common.a
            public final void cancel() {
                com.vk.movika.sdk.common.a aVar4;
                i0.b remove = i0.this.c.remove(str);
                if (remove == null || (aVar4 = remove.a) == null) {
                    return;
                }
                aVar4.cancel();
            }
        };
    }
}
