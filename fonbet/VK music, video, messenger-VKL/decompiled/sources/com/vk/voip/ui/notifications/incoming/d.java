package com.vk.voip.ui.notifications.incoming;

import android.content.Context;
import com.vk.voip.ui.notifications.incoming.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a7p0;
import xsna.ctw0;
import xsna.epx;
import xsna.gzs;
import xsna.kdw0;
import xsna.m2j;
import xsna.mdw0;
import xsna.n7w;
import xsna.nsw;
import xsna.pdh0;
import xsna.psw;
import xsna.qmj0;
import xsna.sfg;
import xsna.xsw;
import xsna.z24;

/* compiled from: IncomingCallNotifierInitializer.kt */
/* loaded from: classes7.dex */
public final class d {
    public final Context a;

    /* compiled from: IncomingCallNotifierInitializer.kt */
    public static final class a {
        public final ctw0 a;
        public final a7p0 b;
        public final qmj0 c;
        public final pdh0 d;
        public final nsw e;
        public final psw f;
        public final z24 g;

        public a(ctw0 ctw0Var, a7p0 a7p0Var, qmj0 qmj0Var, pdh0 pdh0Var, nsw nswVar, psw pswVar, z24 z24Var) {
            this.a = ctw0Var;
            this.b = a7p0Var;
            this.c = qmj0Var;
            this.d = pdh0Var;
            this.e = nswVar;
            this.f = pswVar;
            this.g = z24Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g.equals(aVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Params(notificationsConfig=" + this.a + ", acceptIncoming=" + this.b + ", declineOrHang=" + this.c + ", contentIntentProvider=" + this.d + ", incomingCallActions=" + this.e + ", actionsProcessor=" + this.f + ", getOpponentIcon=" + this.g + ')';
        }
    }

    /* compiled from: IncomingCallNotifierInitializer.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<CharSequence> {
        @Override // xsna.gzs
        public final CharSequence invoke() {
            return ((ctw0) this.receiver).c();
        }
    }

    /* compiled from: IncomingCallNotifierInitializer.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<CharSequence> {
        @Override // xsna.gzs
        public final CharSequence invoke() {
            return ((ctw0) this.receiver).b();
        }
    }

    public d(Context context) {
        this.a = context;
    }

    public final com.vk.voip.ui.notifications.incoming.b a(a aVar, kdw0<mdw0> kdw0Var) {
        ctw0 ctw0Var = aVar.a;
        ctw0Var.getClass();
        return new com.vk.voip.ui.notifications.incoming.b(this.a, new b.c(242341, new b(0, ctw0Var, ctw0.class, "getTitleForAudioCall", "getTitleForAudioCall()Ljava/lang/CharSequence;", 0), new c(0, ctw0Var, ctw0.class, "getTitleForVideoCall", "getTitleForVideoCall()Ljava/lang/CharSequence;", 0), new n7w(aVar, 2)), ctw0Var.a(), new b.a(new xsw(aVar, 0), new sfg(aVar, 26), new m2j(aVar, 20)), aVar.e, aVar.f, kdw0Var);
    }
}
