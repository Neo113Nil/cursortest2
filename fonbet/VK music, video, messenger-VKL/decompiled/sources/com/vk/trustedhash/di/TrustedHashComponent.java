package com.vk.trustedhash.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.id.UserId;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.c8m;
import xsna.g8m;
import xsna.hsp0;
import xsna.jgp;
import xsna.pwj0;

/* compiled from: TrustedHashComponent.kt */
/* loaded from: classes11.dex */
public interface TrustedHashComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: TrustedHashComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final TrustedHashComponent STUB = new TrustedHashComponent() { // from class: com.vk.trustedhash.di.TrustedHashComponent$Companion$STUB$1
            public final a a = new a();

            @Override // com.vk.trustedhash.di.TrustedHashComponent
            public final hsp0 c() {
                return this.a;
            }

            /* compiled from: TrustedHashComponent.kt */
            public static final class a implements hsp0 {
                @Override // xsna.hsp0
                public final Map<UserId, String> a() {
                    return jgp.b;
                }

                @Override // xsna.hsp0
                public final List<String> getAll() {
                    return EmptyList.b;
                }

                @Override // xsna.hsp0
                public final void b() {
                }

                @Override // xsna.hsp0
                public final void c(UserId userId, String str) {
                }
            }
        };
        public static final a b = new a();

        /* compiled from: TrustedHashComponent.kt */
        public static final class a implements c8m<TrustedHashComponent, pwj0> {
            @Override // xsna.c8m
            public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
                return Companion.a.getSTUB();
            }
        }

        public final TrustedHashComponent getSTUB() {
            return STUB;
        }
    }

    hsp0 c();
}
