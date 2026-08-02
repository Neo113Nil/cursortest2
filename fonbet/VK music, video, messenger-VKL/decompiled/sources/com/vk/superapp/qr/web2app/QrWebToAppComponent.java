package com.vk.superapp.qr.web2app;

import com.vk.di.component.DiScopedComponent;
import xsna.bpn0;
import xsna.bu0;
import xsna.cu1;
import xsna.koe0;
import xsna.noe0;
import xsna.pwj0;

/* compiled from: QrWebToAppComponent.kt */
/* loaded from: classes11.dex */
public interface QrWebToAppComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: QrWebToAppComponent.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public static a a() {
            return new a();
        }

        public final QrWebToAppComponent getSTUB() {
            return new QrWebToAppComponent() { // from class: com.vk.superapp.qr.web2app.QrWebToAppComponent$Companion$STUB$1
                public final bpn0 a = new bpn0(new cu1(26));
                public final bpn0 b = new bpn0(new bu0(27));

                @Override // com.vk.superapp.qr.web2app.QrWebToAppComponent
                public final noe0 c() {
                    return (noe0) this.b.getValue();
                }

                @Override // com.vk.superapp.qr.web2app.QrWebToAppComponent
                public final koe0 getHandler() {
                    return (koe0) this.a.getValue();
                }
            };
        }
    }

    noe0 c();

    koe0 getHandler();
}
