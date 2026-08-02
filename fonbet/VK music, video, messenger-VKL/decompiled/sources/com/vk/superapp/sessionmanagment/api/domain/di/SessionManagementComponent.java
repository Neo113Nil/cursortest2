package com.vk.superapp.sessionmanagment.api.domain.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ayi0;
import xsna.fkq0;
import xsna.j5g;
import xsna.mui0;
import xsna.pwj0;
import xsna.sxi0;
import xsna.usi0;

/* compiled from: SessionManagementComponent.kt */
/* loaded from: classes11.dex */
public interface SessionManagementComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: SessionManagementComponent.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final SessionManagementComponent STUB = new SessionManagementComponent() { // from class: com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent$Companion$STUB$1
            @Override // com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent
            public final sxi0 B2() {
                return new b();
            }

            @Override // com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent
            public final mui0 J2() {
                return new a();
            }

            /* compiled from: SessionManagementComponent.kt */
            public static final class a implements mui0 {
                @Override // xsna.mui0
                public final UserId a() {
                    return UserId.d;
                }

                @Override // xsna.mui0
                public final boolean b() {
                    return fkq0.c(a());
                }

                @Override // xsna.mui0
                public final ArrayList d() {
                    return mui0.a.b(this);
                }

                @Override // xsna.mui0
                public final ArrayList e() {
                    return mui0.a.a(this);
                }

                @Override // xsna.mui0
                public final List<usi0> g() {
                    return EmptyList.b;
                }

                @Override // xsna.mui0
                public final usi0.a i() {
                    return (usi0.a) j5g.a0(mui0.a.a(this));
                }

                @Override // xsna.mui0
                public final void c() {
                }

                @Override // xsna.mui0
                public final void f(ayi0 ayi0Var) {
                }

                @Override // xsna.mui0
                public final void k(ayi0 ayi0Var) {
                }
            }

            /* compiled from: SessionManagementComponent.kt */
            public static final class b implements sxi0 {
                @Override // xsna.sxi0
                public final void h(usi0.a aVar) {
                }

                @Override // xsna.sxi0
                public final void l(usi0 usi0Var) {
                }

                @Override // xsna.sxi0
                public final void j(usi0.a aVar, usi0.a aVar2) {
                }
            }
        };

        public final SessionManagementComponent getSTUB() {
            return STUB;
        }
    }

    sxi0 B2();

    mui0 J2();
}
