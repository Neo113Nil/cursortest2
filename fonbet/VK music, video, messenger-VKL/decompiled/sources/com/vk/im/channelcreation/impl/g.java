package com.vk.im.channelcreation.impl;

import xsna.epx;
import xsna.ho8;
import xsna.kj50;

/* compiled from: ChannelCreationViewAction.kt */
/* loaded from: classes2.dex */
public abstract class g implements kj50 {

    /* compiled from: ChannelCreationViewAction.kt */
    public static final class a extends g {
        public static final a b = new a();
    }

    /* compiled from: ChannelCreationViewAction.kt */
    public static final class b extends g {
        public static final b b = new b();
    }

    /* compiled from: ChannelCreationViewAction.kt */
    public static final class c extends g {
        public static final c b = new c();
    }

    /* compiled from: ChannelCreationViewAction.kt */
    public static final class d extends g {
        public static final d b = new d();
    }

    /* compiled from: ChannelCreationViewAction.kt */
    public static final class e extends g {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnChannelNameChanged(newName="), this.b, ')');
        }
    }

    /* compiled from: ChannelCreationViewAction.kt */
    public static final class f extends g {
        public static final f b = new f();
    }

    /* compiled from: ChannelCreationViewAction.kt */
    /* renamed from: com.vk.im.channelcreation.impl.g$g, reason: collision with other inner class name */
    public static final class C1096g extends g {
        public static final C1096g b = new C1096g();
    }

    /* compiled from: ChannelCreationViewAction.kt */
    public static final class h extends g {
        public static final h b = new h();
    }

    /* compiled from: ChannelCreationViewAction.kt */
    public static final class i extends g {
        public static final i b = new i();
    }

    /* compiled from: ChannelCreationViewAction.kt */
    public static final class j extends g {
        public static final j b = new j();
    }

    /* compiled from: ChannelCreationViewAction.kt */
    public static final class k extends g {
        public static final k b = new k();
    }

    /* compiled from: ChannelCreationViewAction.kt */
    public static final class l extends g {
        public static final l b = new l();
    }

    /* compiled from: ChannelCreationViewAction.kt */
    public static final class m extends g {
        public static final m b = new m();
    }

    /* compiled from: ChannelCreationViewAction.kt */
    public static final class n extends g {
        public final String b;

        public n(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnSelectAvatarResult(newAvatar="), this.b, ')');
        }
    }

    /* compiled from: ChannelCreationViewAction.kt */
    public static final class o extends g {
        public static final o b = new o();
    }
}
