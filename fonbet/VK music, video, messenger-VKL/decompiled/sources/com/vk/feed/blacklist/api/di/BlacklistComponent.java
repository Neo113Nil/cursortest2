package com.vk.feed.blacklist.api.di;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.completable.i;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import xsna.ee7;
import xsna.ie7;
import xsna.pwj0;
import xsna.u06;

/* compiled from: BlacklistComponent.kt */
/* loaded from: classes.dex */
public interface BlacklistComponent extends DiScopedComponent<pwj0> {
    public static final /* synthetic */ Companion Companion = Companion.a;

    /* compiled from: BlacklistComponent.kt */
    /* loaded from: classes18.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final BlacklistComponent STUB = new BlacklistComponent() { // from class: com.vk.feed.blacklist.api.di.BlacklistComponent$Companion$STUB$1

            /* compiled from: BlacklistComponent.kt */
            public static final class a implements ee7 {
                @Override // xsna.ee7
                public final io.reactivex.rxjava3.core.a a(UserId userId) {
                    return i.b;
                }

                @Override // xsna.ee7
                public final q<u06> b(int i, int i2) {
                    return g0.b;
                }

                @Override // xsna.ee7
                public final io.reactivex.rxjava3.core.a c(UserId userId) {
                    return i.b;
                }
            }

            @Override // com.vk.feed.blacklist.api.di.BlacklistComponent
            public final ie7 B5() {
                return new b();
            }

            @Override // com.vk.feed.blacklist.api.di.BlacklistComponent
            public final ee7 E3() {
                return new a();
            }

            /* compiled from: BlacklistComponent.kt */
            public static final class b implements ie7 {
                @Override // xsna.ie7
                public final void a(Context context) {
                }
            }
        };

        public final BlacklistComponent getSTUB() {
            return STUB;
        }
    }

    ie7 B5();

    ee7 E3();
}
