package com.vk.voip.ui.push;

import com.vk.dto.common.id.UserId;
import xsna.bpn0;
import xsna.j6i;

/* compiled from: IncomingPushFilterImpl.kt */
/* loaded from: classes11.dex */
public final class a {
    public final bpn0 a;
    public final C2070a b;
    public final b c;

    /* compiled from: IncomingPushFilterImpl.kt */
    /* renamed from: com.vk.voip.ui.push.a$a, reason: collision with other inner class name */
    public static final class C2070a {
        public final boolean a(UserId userId) {
            return j6i.a().i().i(userId);
        }
    }

    /* compiled from: IncomingPushFilterImpl.kt */
    public static final class b {
    }

    public a(bpn0 bpn0Var) {
        C2070a c2070a = new C2070a();
        b bVar = new b();
        this.a = bpn0Var;
        this.b = c2070a;
        this.c = bVar;
    }
}
