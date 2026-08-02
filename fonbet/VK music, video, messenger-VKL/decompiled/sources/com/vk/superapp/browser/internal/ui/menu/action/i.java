package com.vk.superapp.browser.internal.ui.menu.action;

import com.vk.external.miniapp.net.app.WebApiApplication;
import xsna.bpn0;
import xsna.epx;
import xsna.re40;

/* compiled from: ActionMenuItem.kt */
/* loaded from: classes6.dex */
public abstract class i {

    /* compiled from: ActionMenuItem.kt */
    public static final class a extends i {
        public static final a a = new a();
    }

    /* compiled from: ActionMenuItem.kt */
    public static final class b extends i {
        public final WebApiApplication a;
        public final bpn0 b = new bpn0(new re40(this, 20));

        public b(WebApiApplication webApiApplication) {
            this.a = webApiApplication;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return (int) this.a.b;
        }

        public final String toString() {
            return "Recommendation(webApp=" + this.a + ')';
        }
    }
}
