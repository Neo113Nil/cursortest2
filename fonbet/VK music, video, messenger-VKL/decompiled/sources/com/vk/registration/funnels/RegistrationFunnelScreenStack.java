package com.vk.registration.funnels;

import com.vk.core.serialize.Serializer;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import defpackage.q0;
import java.util.ListIterator;
import xsna.j5g;
import xsna.sk3;
import xsna.zcl;

/* compiled from: RegistrationFunnelScreenStack.kt */
/* loaded from: classes.dex */
public final class RegistrationFunnelScreenStack extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<RegistrationFunnelScreenStack> CREATOR = new a();
    public final sk3<RegistrationFunnelScreen> b;

    /* compiled from: RegistrationFunnelScreenStack.kt */
    public static final class RegistrationFunnelScreen extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<RegistrationFunnelScreen> CREATOR = new a();
        public final SchemeStatSak$EventScreen b;
        public final boolean c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<RegistrationFunnelScreen> {
            @Override // com.vk.core.serialize.Serializer.c
            public final RegistrationFunnelScreen a(Serializer serializer) {
                return new RegistrationFunnelScreen(SchemeStatSak$EventScreen.values()[serializer.u()], serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RegistrationFunnelScreen[i];
            }
        }

        public RegistrationFunnelScreen(SchemeStatSak$EventScreen schemeStatSak$EventScreen, boolean z) {
            this.b = schemeStatSak$EventScreen;
            this.c = z;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b.ordinal());
            serializer.L(this.c ? (byte) 1 : (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationFunnelScreen)) {
                return false;
            }
            RegistrationFunnelScreen registrationFunnelScreen = (RegistrationFunnelScreen) obj;
            return this.b == registrationFunnelScreen.b && this.c == registrationFunnelScreen.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RegistrationFunnelScreen(screen=");
            sb.append(this.b);
            sb.append(", skipWhenReturningBack=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<RegistrationFunnelScreenStack> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RegistrationFunnelScreenStack a(Serializer serializer) {
            return new RegistrationFunnelScreenStack(new sk3(serializer.k(RegistrationFunnelScreen.class)), null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RegistrationFunnelScreenStack[i];
        }
    }

    public /* synthetic */ RegistrationFunnelScreenStack(sk3 sk3Var, zcl zclVar) {
        this(sk3Var);
    }

    public final SchemeStatSak$EventScreen Ab() {
        sk3<RegistrationFunnelScreen> sk3Var = this.b;
        if (sk3Var.size() < 2) {
            return null;
        }
        for (int size = sk3Var.size() - 2; -1 < size; size--) {
            RegistrationFunnelScreen registrationFunnelScreen = (RegistrationFunnelScreen) j5g.b0(size, sk3Var);
            if (registrationFunnelScreen != null && !registrationFunnelScreen.c) {
                return registrationFunnelScreen.b;
            }
        }
        return null;
    }

    public final void Bb(SchemeStatSak$EventScreen schemeStatSak$EventScreen, boolean z) {
        int i;
        if (schemeStatSak$EventScreen == null || zb() == schemeStatSak$EventScreen) {
            return;
        }
        sk3<RegistrationFunnelScreen> sk3Var = this.b;
        ListIterator<RegistrationFunnelScreen> listIterator = sk3Var.listIterator(sk3Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            RegistrationFunnelScreen previous = listIterator.previous();
            if (previous.b == schemeStatSak$EventScreen && !previous.c) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i == -1) {
            sk3Var.addLast(new RegistrationFunnelScreen(schemeStatSak$EventScreen, z));
            return;
        }
        int size = sk3Var.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                sk3Var.m();
            }
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
    }

    public final SchemeStatSak$EventScreen zb() {
        RegistrationFunnelScreen g = this.b.g();
        if (g != null) {
            return g.b;
        }
        return null;
    }

    public RegistrationFunnelScreenStack(sk3<RegistrationFunnelScreen> sk3Var) {
        this.b = sk3Var;
    }

    public RegistrationFunnelScreenStack() {
        this(new sk3());
    }
}
