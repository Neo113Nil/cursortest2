package com.vk.voip.ui.calls.presentation.feature.handler;

import com.vk.toggle.features.VoipFeatures;
import io.reactivex.rxjava3.core.b0;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.v;
import kotlin.NoWhenBranchMatchedException;
import xsna.a1w;
import xsna.a9b;
import xsna.asp;
import xsna.b630;
import xsna.cim0;
import xsna.fpw0;
import xsna.iow0;
import xsna.pue;
import xsna.rkw0;
import xsna.she;
import xsna.ukv0;
import xsna.xim0;
import xsna.xx40;
import xsna.zrp;

/* compiled from: VoipCallServiceBannerHandler.kt */
/* loaded from: classes7.dex */
public final class VoipCallServiceBannerHandler {
    public final a1w a;
    public final cim0 b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final com.vk.voip.ui.calls.presentation.feature.handler.a d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoipCallServiceBannerHandler.kt */
    public static final class Restrict {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Restrict[] $VALUES;
        public static final Restrict CHANNEL_GROUP_SYSTEM;
        public static final Restrict CHANNEL_SYSTEM;
        public static final Restrict GLOBAL_SYSTEM;
        public static final Restrict NOT_RESTRICT;

        static {
            Restrict restrict = new Restrict("NOT_RESTRICT", 0);
            NOT_RESTRICT = restrict;
            Restrict restrict2 = new Restrict("GLOBAL_SYSTEM", 1);
            GLOBAL_SYSTEM = restrict2;
            Restrict restrict3 = new Restrict("CHANNEL_GROUP_SYSTEM", 2);
            CHANNEL_GROUP_SYSTEM = restrict3;
            Restrict restrict4 = new Restrict("CHANNEL_SYSTEM", 3);
            CHANNEL_SYSTEM = restrict4;
            Restrict[] restrictArr = {restrict, restrict2, restrict3, restrict4};
            $VALUES = restrictArr;
            $ENTRIES = new asp(restrictArr);
        }

        public Restrict() {
            throw null;
        }

        public static Restrict valueOf(String str) {
            return (Restrict) Enum.valueOf(Restrict.class, str);
        }

        public static Restrict[] values() {
            return (Restrict[]) $VALUES.clone();
        }
    }

    /* compiled from: VoipCallServiceBannerHandler.kt */
    public interface a {

        /* compiled from: VoipCallServiceBannerHandler.kt */
        /* renamed from: com.vk.voip.ui.calls.presentation.feature.handler.VoipCallServiceBannerHandler$a$a, reason: collision with other inner class name */
        public static final class C2038a implements a {
            public static final C2038a a = new C2038a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2038a);
            }

            public final int hashCode() {
                return -396856973;
            }

            public final String toString() {
                return "AllowIncomingCall";
            }
        }

        /* compiled from: VoipCallServiceBannerHandler.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1458399854;
            }

            public final String toString() {
                return "None";
            }
        }

        /* compiled from: VoipCallServiceBannerHandler.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1952776088;
            }

            public final String toString() {
                return "SyncContacts";
            }
        }
    }

    /* compiled from: VoipCallServiceBannerHandler.kt */
    public interface b {

        /* compiled from: VoipCallServiceBannerHandler.kt */
        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 18425206;
            }

            public final String toString() {
                return "SystemPushSettingsUpdate";
            }
        }
    }

    /* compiled from: VoipCallServiceBannerHandler.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Restrict.values().length];
            try {
                iArr[Restrict.GLOBAL_SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Restrict.CHANNEL_GROUP_SYSTEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Restrict.CHANNEL_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Restrict.NOT_RESTRICT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VoipCallServiceBannerHandler(a1w a1wVar, cim0 cim0Var) {
        this.a = a1wVar;
        this.b = cim0Var;
        com.vk.voip.ui.calls.presentation.feature.handler.a aVar = new com.vk.voip.ui.calls.presentation.feature.handler.a(this);
        this.d = aVar;
        a1wVar.r().f.a(aVar);
    }

    public final void a(a.C2038a c2038a, boolean z) {
        if (c2038a == null) {
            throw new NoWhenBranchMatchedException();
        }
        io.reactivex.rxjava3.disposables.b bVar = this.c;
        if (!z) {
            bVar.b(io.reactivex.rxjava3.kotlin.c.h(new v(new she(this, 4)), null, new ukv0(this, 3), 1));
        } else {
            bVar.b(io.reactivex.rxjava3.kotlin.c.h(this.a.C(this, new fpw0()), null, new xim0(this, 18), 1));
        }
    }

    public final x<a> b() {
        b0 B;
        VoipFeatures voipFeatures = VoipFeatures.INCOMING_CALL_PUSH_BANNER;
        voipFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(voipFeatures);
        a1w a1wVar = this.a;
        if (a2) {
            B = x.B(new v(new she(this, 4)), a1wVar.C(this, new iow0()), new xx40(new pue(8), 19));
        } else {
            B = x.k(Boolean.FALSE);
        }
        return x.B(B, a1wVar.C(this, new rkw0()), new b630(new a9b(10), 23));
    }
}
