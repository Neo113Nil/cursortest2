package com.vk.network.eventhub.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.network.eventhub.api.ConnectionState;
import com.vk.network.eventhub.api.Message;
import xsna.d6a;
import xsna.gzs;
import xsna.osx0;
import xsna.ozp;
import xsna.pwj0;
import xsna.qzp;
import xsna.s3q0;
import xsna.wzp;
import xsna.xoi0;
import xsna.yni0;
import xsna.yzp;

/* compiled from: EventHubComponent.kt */
/* loaded from: classes3.dex */
public interface EventHubComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: EventHubComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final EventHubComponent$Companion$STUB$1 STUB = new EventHubComponent() { // from class: com.vk.network.eventhub.api.di.EventHubComponent$Companion$STUB$1
            @Override // com.vk.network.eventhub.api.di.EventHubComponent
            public final wzp A5() {
                return new b();
            }

            @Override // com.vk.network.eventhub.api.di.EventHubComponent
            public final qzp c9() {
                return new a();
            }

            @Override // com.vk.network.eventhub.api.di.EventHubComponent
            public final yzp getReporter() {
                return new c();
            }

            /* compiled from: EventHubComponent.kt */
            public static final class a implements qzp {
                @Override // xsna.osx0
                public final ConnectionState b() {
                    return ConnectionState.DISCONNECTED;
                }

                @Override // xsna.qzp
                public final void d() {
                }

                @Override // xsna.qzp
                public final void g() {
                }

                @Override // xsna.osx0
                public final void a(osx0.a aVar) {
                }

                @Override // xsna.qzp
                public final void c(gzs<s3q0> gzsVar) {
                }

                @Override // xsna.qzp
                public final void e(Message.b bVar) {
                }

                @Override // xsna.qzp
                public final void f(Message message) {
                }

                @Override // xsna.osx0
                public final void h(osx0.a aVar) {
                }

                @Override // xsna.qzp
                public final void j(ozp ozpVar) {
                }

                @Override // xsna.qzp
                public final void i(yni0 yni0Var, d6a d6aVar) {
                }
            }

            /* compiled from: EventHubComponent.kt */
            public static final class b implements wzp {
                @Override // xsna.wzp
                public final void a() {
                }

                @Override // xsna.wzp
                public final void b(ozp ozpVar) {
                }

                @Override // xsna.wzp
                public final void c(xoi0 xoi0Var) {
                }
            }

            /* compiled from: EventHubComponent.kt */
            public static final class c implements yzp {
                @Override // xsna.yzp
                public final String a() {
                    return null;
                }

                @Override // xsna.yzp
                public final void b() {
                }
            }
        };
    }

    wzp A5();

    qzp c9();

    yzp getReporter();
}
