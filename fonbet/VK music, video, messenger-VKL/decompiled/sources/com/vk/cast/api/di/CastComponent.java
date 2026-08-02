package com.vk.cast.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.ao8;
import xsna.b0a;
import xsna.j0a;
import xsna.nz9;
import xsna.pwj0;
import xsna.r8s0;
import xsna.sz9;
import xsna.w8f0;
import xsna.xz9;

/* compiled from: CastComponent.kt */
/* loaded from: classes16.dex */
public interface CastComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: CastComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final CastComponent STUB = new CastComponent() { // from class: com.vk.cast.api.di.CastComponent$Companion$STUB$1
            public final xz9 a = xz9.a.a.getSTUB();
            public final j0a b = j0a.a.a.getSTUB();
            public final nz9 c = nz9.a.a.getSTUB();
            public final b0a d = b0a.a.a.getSTUB();
            public final r8s0 e = r8s0.a.a.getSTUB();
            public final ao8 f;

            {
                sz9.a.a.getSTUB();
                w8f0.a.a.getSTUB();
                this.f = new ao8(14);
            }

            @Override // com.vk.cast.api.di.CastComponent
            public final xz9 L7() {
                return this.a;
            }

            @Override // com.vk.cast.api.di.CastComponent
            public final b0a Q4() {
                return this.d;
            }

            @Override // com.vk.cast.api.di.CastComponent
            public final r8s0 cd() {
                return this.e;
            }

            @Override // com.vk.cast.api.di.CastComponent
            public final nz9 n9() {
                return this.c;
            }

            @Override // com.vk.cast.api.di.CastComponent
            public final j0a o3() {
                return this.b;
            }

            @Override // com.vk.cast.api.di.CastComponent
            public final ao8 s2() {
                return this.f;
            }
        };

        public final CastComponent getSTUB() {
            return STUB;
        }
    }

    xz9 L7();

    b0a Q4();

    r8s0 cd();

    nz9 n9();

    j0a o3();

    ao8 s2();
}
