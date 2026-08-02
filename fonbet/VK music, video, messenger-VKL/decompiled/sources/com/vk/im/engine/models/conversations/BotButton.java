package com.vk.im.engine.models.conversations;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.conversations.ButtonColor;
import com.vk.im.engine.models.conversations.ButtonType;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.eq;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: BotKeyboard.kt */
/* loaded from: classes2.dex */
public abstract class BotButton extends Serializer.StreamParcelableAdapter {
    public final ButtonType b;
    public final String c;
    public int d;
    public final boolean e;
    public final Peer f;

    /* compiled from: BotKeyboard.kt */
    public interface a {
        boolean Ga(Object obj);

        boolean r2();

        void setLoading(boolean z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BotButton(ButtonType buttonType, String str, int i, boolean z, Peer peer, int i2, zcl zclVar) {
        this(buttonType, r2, r3, r4, peer, null);
        String str2 = (i2 & 2) != 0 ? "" : str;
        int i3 = (i2 & 4) != 0 ? 1 : i;
        boolean z2 = (i2 & 8) != 0 ? false : z;
        if ((i2 & 16) != 0) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.Unknown.e;
        }
    }

    public Peer Ab() {
        return this.f;
    }

    public boolean Bb() {
        return this.e;
    }

    public String Cb() {
        return this.c;
    }

    public void Db(int i) {
        this.d = i;
    }

    public abstract BotButton zb();

    /* compiled from: BotKeyboard.kt */
    public static final class Location extends BotButton {
        public static final Serializer.c<Location> CREATOR = new a();
        public final ButtonType g;
        public final String h;
        public int i;
        public final boolean j;
        public final Peer k;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Location> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Location a(Serializer serializer) {
                return new Location(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Location[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Location(ButtonType buttonType, String str, int i, boolean z, Peer peer, int i2, zcl zclVar) {
            this(buttonType, r2, r3, r4, peer);
            String str2 = (i2 & 2) != 0 ? "" : str;
            int i3 = (i2 & 4) != 0 ? 1 : i;
            boolean z2 = (i2 & 8) != 0 ? false : z;
            if ((i2 & 16) != 0) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                peer = Peer.Unknown.e;
            }
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final Peer Ab() {
            return this.k;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final boolean Bb() {
            return this.j;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final String Cb() {
            return this.h;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final void Db(int i) {
            this.i = i;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.g.h());
            serializer.j0(this.h);
            serializer.S(this.i);
            serializer.L(this.j ? (byte) 1 : (byte) 0);
            serializer.i0(this.k);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            return this.g == location.g && epx.f(this.h, location.h) && this.i == location.i && this.j == location.j && epx.f(this.k, location.k);
        }

        public final int hashCode() {
            return Long.hashCode(this.k.b) + qoy.b(shy.a(this.i, urd0.a(this.g.hashCode() * 31, 31, this.h), 31), 31, this.j);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Location(type=");
            sb.append(this.g);
            sb.append(", payload=");
            sb.append(this.h);
            sb.append(", span=");
            sb.append(this.i);
            sb.append(", inline=");
            sb.append(this.j);
            sb.append(", author=");
            return eq.a(sb, this.k, ')');
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final BotButton zb() {
            return new Location(this.g, this.h, this.i, this.j, this.k);
        }

        public Location(ButtonType buttonType, String str, int i, boolean z, Peer peer) {
            super(buttonType, str, i, z, peer, null);
            this.g = buttonType;
            this.h = str;
            this.i = i;
            this.j = z;
            this.k = peer;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Location(Serializer serializer) {
            this(ButtonType.a.a(r1), serializer.H(), serializer.u(), serializer.m(), (Peer) serializer.G(Peer.class.getClassLoader()));
            ButtonType.a aVar = ButtonType.Companion;
            int u = serializer.u();
            aVar.getClass();
        }
    }

    /* compiled from: BotKeyboard.kt */
    public static final class VkApps extends BotButton {
        public static final Serializer.c<VkApps> CREATOR = new a();
        public final ButtonType g;
        public final String h;
        public int i;
        public final int j;
        public final String k;
        public final String l;
        public final String m;
        public final boolean n;
        public final Peer o;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<VkApps> {
            @Override // com.vk.core.serialize.Serializer.c
            public final VkApps a(Serializer serializer) {
                return new VkApps(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VkApps[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public VkApps(ButtonType buttonType, String str, int i, int i2, String str2, String str3, String str4, boolean z, Peer peer, int i3, zcl zclVar) {
            this(buttonType, r2, r3, i2, r5, r6, r7, r8, r9);
            Peer peer2;
            String str5 = (i3 & 2) != 0 ? "" : str;
            int i4 = (i3 & 4) != 0 ? 1 : i;
            String str6 = (i3 & 16) != 0 ? null : str2;
            String str7 = (i3 & 32) != 0 ? null : str3;
            String str8 = (i3 & 64) != 0 ? null : str4;
            boolean z2 = (i3 & 128) != 0 ? false : z;
            if ((i3 & 256) != 0) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                peer2 = Peer.Unknown.e;
            } else {
                peer2 = peer;
            }
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final Peer Ab() {
            return this.o;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final boolean Bb() {
            return this.n;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final String Cb() {
            return this.h;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final void Db(int i) {
            this.i = i;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.g.h());
            serializer.j0(this.h);
            serializer.S(this.i);
            serializer.S(this.j);
            serializer.j0(this.k);
            serializer.j0(this.l);
            serializer.j0(this.m);
            serializer.L(this.n ? (byte) 1 : (byte) 0);
            serializer.i0(this.o);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkApps)) {
                return false;
            }
            VkApps vkApps = (VkApps) obj;
            return this.g == vkApps.g && epx.f(this.h, vkApps.h) && this.i == vkApps.i && this.j == vkApps.j && epx.f(this.k, vkApps.k) && epx.f(this.l, vkApps.l) && epx.f(this.m, vkApps.m) && this.n == vkApps.n && epx.f(this.o, vkApps.o);
        }

        public final int hashCode() {
            int a2 = shy.a(this.j, shy.a(this.i, urd0.a(this.g.hashCode() * 31, 31, this.h), 31), 31);
            String str = this.k;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.l;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.m;
            return Long.hashCode(this.o.b) + qoy.b((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.n);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkApps(type=");
            sb.append(this.g);
            sb.append(", payload=");
            sb.append(this.h);
            sb.append(", span=");
            sb.append(this.i);
            sb.append(", appId=");
            sb.append(this.j);
            sb.append(", appOwnerId=");
            sb.append(this.k);
            sb.append(", hash=");
            sb.append(this.l);
            sb.append(", label=");
            sb.append(this.m);
            sb.append(", inline=");
            sb.append(this.n);
            sb.append(", author=");
            return eq.a(sb, this.o, ')');
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final BotButton zb() {
            return new VkApps(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }

        public VkApps(ButtonType buttonType, String str, int i, int i2, String str2, String str3, String str4, boolean z, Peer peer) {
            super(buttonType, str, i, z, peer, null);
            this.g = buttonType;
            this.h = str;
            this.i = i;
            this.j = i2;
            this.k = str2;
            this.l = str3;
            this.m = str4;
            this.n = z;
            this.o = peer;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public VkApps(Serializer serializer) {
            this(ButtonType.a.a(r1), serializer.H(), serializer.u(), serializer.u(), serializer.H(), serializer.H(), serializer.H(), serializer.m(), (Peer) serializer.G(Peer.class.getClassLoader()));
            ButtonType.a aVar = ButtonType.Companion;
            int u = serializer.u();
            aVar.getClass();
        }
    }

    /* compiled from: BotKeyboard.kt */
    public static final class VkPay extends BotButton {
        public static final Serializer.c<VkPay> CREATOR = new a();
        public final ButtonType g;
        public final String h;
        public int i;
        public final String j;
        public final boolean k;
        public final Peer l;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<VkPay> {
            @Override // com.vk.core.serialize.Serializer.c
            public final VkPay a(Serializer serializer) {
                return new VkPay(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VkPay[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public VkPay(ButtonType buttonType, String str, int i, String str2, boolean z, Peer peer, int i2, zcl zclVar) {
            this(buttonType, r2, r3, str2, r5, peer);
            String str3 = (i2 & 2) != 0 ? "" : str;
            int i3 = (i2 & 4) != 0 ? 1 : i;
            boolean z2 = (i2 & 16) != 0 ? false : z;
            if ((i2 & 32) != 0) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                peer = Peer.Unknown.e;
            }
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final Peer Ab() {
            return this.l;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final boolean Bb() {
            return this.k;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final String Cb() {
            return this.h;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final void Db(int i) {
            this.i = i;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.g.h());
            serializer.j0(this.h);
            serializer.S(this.i);
            serializer.j0(this.j);
            serializer.L(this.k ? (byte) 1 : (byte) 0);
            serializer.i0(this.l);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkPay)) {
                return false;
            }
            VkPay vkPay = (VkPay) obj;
            return this.g == vkPay.g && epx.f(this.h, vkPay.h) && this.i == vkPay.i && epx.f(this.j, vkPay.j) && this.k == vkPay.k && epx.f(this.l, vkPay.l);
        }

        public final int hashCode() {
            return Long.hashCode(this.l.b) + qoy.b(urd0.a(shy.a(this.i, urd0.a(this.g.hashCode() * 31, 31, this.h), 31), 31, this.j), 31, this.k);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkPay(type=");
            sb.append(this.g);
            sb.append(", payload=");
            sb.append(this.h);
            sb.append(", span=");
            sb.append(this.i);
            sb.append(", hash=");
            sb.append(this.j);
            sb.append(", inline=");
            sb.append(this.k);
            sb.append(", author=");
            return eq.a(sb, this.l, ')');
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final BotButton zb() {
            return new VkPay(this.g, this.h, this.i, this.j, this.k, this.l);
        }

        public VkPay(ButtonType buttonType, String str, int i, String str2, boolean z, Peer peer) {
            super(buttonType, str, i, z, peer, null);
            this.g = buttonType;
            this.h = str;
            this.i = i;
            this.j = str2;
            this.k = z;
            this.l = peer;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public VkPay(Serializer serializer) {
            this(ButtonType.a.a(r1), serializer.H(), serializer.u(), serializer.H(), serializer.m(), (Peer) serializer.G(Peer.class.getClassLoader()));
            ButtonType.a aVar = ButtonType.Companion;
            int u = serializer.u();
            aVar.getClass();
        }
    }

    /* compiled from: BotKeyboard.kt */
    public static final class Callback extends BotButton implements a {
        public static final Serializer.c<Callback> CREATOR = new a();
        public final ButtonType g;
        public final String h;
        public int i;
        public final boolean j;
        public final Peer k;
        public final String l;
        public final ButtonColor m;
        public boolean n;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Callback> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Callback a(Serializer serializer) {
                return new Callback(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Callback[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Callback(ButtonType buttonType, String str, int i, boolean z, Peer peer, String str2, ButtonColor buttonColor, boolean z2, int i2, zcl zclVar) {
            this(buttonType, str, i, z, peer, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? ButtonColor.DEFAULT : buttonColor, (i2 & 128) != 0 ? false : z2);
            str = (i2 & 2) != 0 ? "" : str;
            i = (i2 & 4) != 0 ? 1 : i;
            z = (i2 & 8) != 0 ? false : z;
            if ((i2 & 16) != 0) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                peer = Peer.Unknown.e;
            }
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final Peer Ab() {
            return this.k;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final boolean Bb() {
            return this.j;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final String Cb() {
            return this.h;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final void Db(int i) {
            this.i = i;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton.a
        public final boolean Ga(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Callback.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            Callback callback = (Callback) obj;
            return this.g == callback.g && epx.f(this.h, callback.h) && this.i == callback.i && this.j == callback.j && epx.f(this.k, callback.k) && epx.f(this.l, callback.l) && this.m == callback.m;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.g.h());
            serializer.j0(this.h);
            serializer.S(this.i);
            serializer.L(this.j ? (byte) 1 : (byte) 0);
            serializer.i0(this.k);
            serializer.j0(this.l);
            serializer.S(this.m.h());
            serializer.L(this.n ? (byte) 1 : (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Callback)) {
                return false;
            }
            Callback callback = (Callback) obj;
            return this.g == callback.g && epx.f(this.h, callback.h) && this.i == callback.i && this.j == callback.j && epx.f(this.k, callback.k) && epx.f(this.l, callback.l) && this.m == callback.m && this.n == callback.n;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.n) + ((this.m.hashCode() + urd0.a(bh10.a(qoy.b(shy.a(this.i, urd0.a(this.g.hashCode() * 31, 31, this.h), 31), 31, this.j), 31, this.k.b), 31, this.l)) * 31);
        }

        @Override // com.vk.im.engine.models.conversations.BotButton.a
        public final boolean r2() {
            return this.n;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton.a
        public final void setLoading(boolean z) {
            this.n = z;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Callback(type=");
            sb.append(this.g);
            sb.append(", payload=");
            sb.append(this.h);
            sb.append(", span=");
            sb.append(this.i);
            sb.append(", inline=");
            sb.append(this.j);
            sb.append(", author=");
            sb.append(this.k);
            sb.append(", label=");
            sb.append(this.l);
            sb.append(", color=");
            sb.append(this.m);
            sb.append(", isLoading=");
            return q0.a(sb, this.n, ')');
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final BotButton zb() {
            return new Callback(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
        }

        public Callback(ButtonType buttonType, String str, int i, boolean z, Peer peer, String str2, ButtonColor buttonColor, boolean z2) {
            super(buttonType, str, i, z, peer, null);
            this.g = buttonType;
            this.h = str;
            this.i = i;
            this.j = z;
            this.k = peer;
            this.l = str2;
            this.m = buttonColor;
            this.n = z2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Callback(Serializer serializer) {
            this(r3, r4, r5, r6, r7, r8, ButtonColor.a.a(r1), serializer.m());
            ButtonType.a aVar = ButtonType.Companion;
            int u = serializer.u();
            aVar.getClass();
            ButtonType a2 = ButtonType.a.a(u);
            String H = serializer.H();
            int u2 = serializer.u();
            boolean m = serializer.m();
            Peer peer = (Peer) serializer.G(Peer.class.getClassLoader());
            String H2 = serializer.H();
            ButtonColor.a aVar2 = ButtonColor.Companion;
            int u3 = serializer.u();
            aVar2.getClass();
        }
    }

    /* compiled from: BotKeyboard.kt */
    public static final class Link extends BotButton {
        public static final Serializer.c<Link> CREATOR = new a();
        public final ButtonType g;
        public final String h;
        public int i;
        public final String j;
        public final String k;
        public final ButtonColor l;
        public final boolean m;
        public final Peer n;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Link> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Link a(Serializer serializer) {
                return new Link(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Link[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Link(ButtonType buttonType, String str, int i, String str2, String str3, ButtonColor buttonColor, boolean z, Peer peer, int i2, zcl zclVar) {
            this(buttonType, str, i, str2, str3, buttonColor, z, peer);
            str = (i2 & 2) != 0 ? "" : str;
            i = (i2 & 4) != 0 ? 1 : i;
            str2 = (i2 & 8) != 0 ? "" : str2;
            str3 = (i2 & 16) != 0 ? "" : str3;
            buttonColor = (i2 & 32) != 0 ? ButtonColor.DEFAULT : buttonColor;
            z = (i2 & 64) != 0 ? false : z;
            if ((i2 & 128) != 0) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                peer = Peer.Unknown.e;
            }
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final Peer Ab() {
            return this.n;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final boolean Bb() {
            return this.m;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final String Cb() {
            return this.h;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final void Db(int i) {
            this.i = i;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.g.h());
            serializer.j0(this.h);
            serializer.S(this.i);
            serializer.j0(this.j);
            serializer.j0(this.k);
            serializer.S(this.l.h());
            serializer.L(this.m ? (byte) 1 : (byte) 0);
            serializer.i0(this.n);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Link)) {
                return false;
            }
            Link link = (Link) obj;
            return this.g == link.g && epx.f(this.h, link.h) && this.i == link.i && epx.f(this.j, link.j) && epx.f(this.k, link.k) && this.l == link.l && this.m == link.m && epx.f(this.n, link.n);
        }

        public final int hashCode() {
            return Long.hashCode(this.n.b) + qoy.b((this.l.hashCode() + urd0.a(urd0.a(shy.a(this.i, urd0.a(this.g.hashCode() * 31, 31, this.h), 31), 31, this.j), 31, this.k)) * 31, 31, this.m);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Link(type=");
            sb.append(this.g);
            sb.append(", payload=");
            sb.append(this.h);
            sb.append(", span=");
            sb.append(this.i);
            sb.append(", text=");
            sb.append(this.j);
            sb.append(", link=");
            sb.append(this.k);
            sb.append(", color=");
            sb.append(this.l);
            sb.append(", inline=");
            sb.append(this.m);
            sb.append(", author=");
            return eq.a(sb, this.n, ')');
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final BotButton zb() {
            return new Link(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
        }

        public Link(ButtonType buttonType, String str, int i, String str2, String str3, ButtonColor buttonColor, boolean z, Peer peer) {
            super(buttonType, str, i, z, peer, null);
            this.g = buttonType;
            this.h = str;
            this.i = i;
            this.j = str2;
            this.k = str3;
            this.l = buttonColor;
            this.m = z;
            this.n = peer;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Link(Serializer serializer) {
            this(r3, r4, r5, r6, r7, ButtonColor.a.a(r1), serializer.m(), (Peer) serializer.G(Peer.class.getClassLoader()));
            ButtonType.a aVar = ButtonType.Companion;
            int u = serializer.u();
            aVar.getClass();
            ButtonType a2 = ButtonType.a.a(u);
            String H = serializer.H();
            int u2 = serializer.u();
            String H2 = serializer.H();
            String H3 = serializer.H();
            ButtonColor.a aVar2 = ButtonColor.Companion;
            int u3 = serializer.u();
            aVar2.getClass();
        }
    }

    /* compiled from: BotKeyboard.kt */
    public static final class ModalView extends BotButton {
        public static final Serializer.c<ModalView> CREATOR = new a();
        public final ButtonType g;
        public final String h;
        public int i;
        public final String j;
        public final String k;
        public final ButtonColor l;
        public final boolean m;
        public final Peer n;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ModalView> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ModalView a(Serializer serializer) {
                return new ModalView(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ModalView[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ModalView(ButtonType buttonType, String str, int i, String str2, String str3, ButtonColor buttonColor, boolean z, Peer peer, int i2, zcl zclVar) {
            this(buttonType, str, i, str2, str3, buttonColor, z, peer);
            str = (i2 & 2) != 0 ? "" : str;
            i = (i2 & 4) != 0 ? 1 : i;
            str2 = (i2 & 8) != 0 ? "" : str2;
            str3 = (i2 & 16) != 0 ? "" : str3;
            buttonColor = (i2 & 32) != 0 ? ButtonColor.DEFAULT : buttonColor;
            z = (i2 & 64) != 0 ? false : z;
            if ((i2 & 128) != 0) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                peer = Peer.Unknown.e;
            }
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final Peer Ab() {
            return this.n;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final boolean Bb() {
            return this.m;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final String Cb() {
            return this.h;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final void Db(int i) {
            this.i = i;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.g.h());
            serializer.j0(this.h);
            serializer.S(this.i);
            serializer.j0(this.j);
            serializer.j0(this.k);
            serializer.S(this.l.h());
            serializer.L(this.m ? (byte) 1 : (byte) 0);
            serializer.i0(this.n);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModalView)) {
                return false;
            }
            ModalView modalView = (ModalView) obj;
            return this.g == modalView.g && epx.f(this.h, modalView.h) && this.i == modalView.i && epx.f(this.j, modalView.j) && epx.f(this.k, modalView.k) && this.l == modalView.l && this.m == modalView.m && epx.f(this.n, modalView.n);
        }

        public final int hashCode() {
            return Long.hashCode(this.n.b) + qoy.b((this.l.hashCode() + urd0.a(urd0.a(shy.a(this.i, urd0.a(this.g.hashCode() * 31, 31, this.h), 31), 31, this.j), 31, this.k)) * 31, 31, this.m);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ModalView(type=");
            sb.append(this.g);
            sb.append(", payload=");
            sb.append(this.h);
            sb.append(", span=");
            sb.append(this.i);
            sb.append(", text=");
            sb.append(this.j);
            sb.append(", link=");
            sb.append(this.k);
            sb.append(", color=");
            sb.append(this.l);
            sb.append(", inline=");
            sb.append(this.m);
            sb.append(", author=");
            return eq.a(sb, this.n, ')');
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final BotButton zb() {
            return new ModalView(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
        }

        public ModalView(ButtonType buttonType, String str, int i, String str2, String str3, ButtonColor buttonColor, boolean z, Peer peer) {
            super(buttonType, str, i, z, peer, null);
            this.g = buttonType;
            this.h = str;
            this.i = i;
            this.j = str2;
            this.k = str3;
            this.l = buttonColor;
            this.m = z;
            this.n = peer;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ModalView(Serializer serializer) {
            this(r3, r4, r5, r6, r7, ButtonColor.a.a(r1), serializer.m(), (Peer) serializer.G(Peer.class.getClassLoader()));
            ButtonType.a aVar = ButtonType.Companion;
            int u = serializer.u();
            aVar.getClass();
            ButtonType a2 = ButtonType.a.a(u);
            String H = serializer.H();
            int u2 = serializer.u();
            String H2 = serializer.H();
            String H3 = serializer.H();
            ButtonColor.a aVar2 = ButtonColor.Companion;
            int u3 = serializer.u();
            aVar2.getClass();
        }
    }

    /* compiled from: BotKeyboard.kt */
    public static final class Text extends BotButton {
        public static final Serializer.c<Text> CREATOR = new a();
        public final ButtonType g;
        public final String h;
        public int i;
        public final String j;
        public final ButtonColor k;
        public final boolean l;
        public final Peer m;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Text> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Text a(Serializer serializer) {
                return new Text(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Text[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Text(ButtonType buttonType, String str, int i, String str2, ButtonColor buttonColor, boolean z, Peer peer, int i2, zcl zclVar) {
            this(buttonType, str, i, str2, buttonColor, z, peer);
            str = (i2 & 2) != 0 ? "" : str;
            i = (i2 & 4) != 0 ? 1 : i;
            str2 = (i2 & 8) != 0 ? "" : str2;
            buttonColor = (i2 & 16) != 0 ? ButtonColor.DEFAULT : buttonColor;
            z = (i2 & 32) != 0 ? false : z;
            if ((i2 & 64) != 0) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                peer = Peer.Unknown.e;
            }
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final Peer Ab() {
            return this.m;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final boolean Bb() {
            return this.l;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final String Cb() {
            return this.h;
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final void Db(int i) {
            this.i = i;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.g.h());
            serializer.j0(this.h);
            serializer.S(this.i);
            serializer.j0(this.j);
            serializer.S(this.k.h());
            serializer.L(this.l ? (byte) 1 : (byte) 0);
            serializer.i0(this.m);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return this.g == text.g && epx.f(this.h, text.h) && this.i == text.i && epx.f(this.j, text.j) && this.k == text.k && this.l == text.l && epx.f(this.m, text.m);
        }

        public final int hashCode() {
            return Long.hashCode(this.m.b) + qoy.b((this.k.hashCode() + urd0.a(shy.a(this.i, urd0.a(this.g.hashCode() * 31, 31, this.h), 31), 31, this.j)) * 31, 31, this.l);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Text(type=");
            sb.append(this.g);
            sb.append(", payload=");
            sb.append(this.h);
            sb.append(", span=");
            sb.append(this.i);
            sb.append(", text=");
            sb.append(this.j);
            sb.append(", color=");
            sb.append(this.k);
            sb.append(", inline=");
            sb.append(this.l);
            sb.append(", author=");
            return eq.a(sb, this.m, ')');
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final BotButton zb() {
            return new Text(this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }

        public Text(ButtonType buttonType, String str, int i, String str2, ButtonColor buttonColor, boolean z, Peer peer) {
            super(buttonType, str, i, z, peer, null);
            this.g = buttonType;
            this.h = str;
            this.i = i;
            this.j = str2;
            this.k = buttonColor;
            this.l = z;
            this.m = peer;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Text(Serializer serializer) {
            this(r3, r4, r5, r6, ButtonColor.a.a(r1), serializer.m(), (Peer) serializer.G(Peer.class.getClassLoader()));
            ButtonType.a aVar = ButtonType.Companion;
            int u = serializer.u();
            aVar.getClass();
            ButtonType a2 = ButtonType.a.a(u);
            String H = serializer.H();
            int u2 = serializer.u();
            String H2 = serializer.H();
            ButtonColor.a aVar2 = ButtonColor.Companion;
            int u3 = serializer.u();
            aVar2.getClass();
        }
    }

    public BotButton(ButtonType buttonType, String str, int i, boolean z, Peer peer, zcl zclVar) {
        this.b = buttonType;
        this.c = str;
        this.d = i;
        this.e = z;
        this.f = peer;
    }

    /* compiled from: BotKeyboard.kt */
    public static final class Unsupported extends BotButton {
        public static final Unsupported g = new Unsupported();
        public static final Serializer.c<Unsupported> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Unsupported> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Unsupported a(Serializer serializer) {
                serializer.u();
                serializer.H();
                serializer.u();
                return Unsupported.g;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unsupported[i];
            }
        }

        public Unsupported() {
            super(ButtonType.UNSUPPORTED, "", 1, false, null, 24, null);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b.h());
            serializer.j0(this.c);
            serializer.S(this.d);
        }

        public final boolean equals(Object obj) {
            return obj instanceof Unsupported;
        }

        public final int hashCode() {
            return Unsupported.class.hashCode();
        }

        @Override // com.vk.im.engine.models.conversations.BotButton
        public final BotButton zb() {
            return this;
        }
    }
}
