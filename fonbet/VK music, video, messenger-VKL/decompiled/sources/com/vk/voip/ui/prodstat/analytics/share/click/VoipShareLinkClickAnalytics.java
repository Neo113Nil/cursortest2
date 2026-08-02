package com.vk.voip.ui.prodstat.analytics.share.click;

import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipShareClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.jdw0;
import xsna.mdw0;
import xsna.wew0;
import xsna.zrp;

/* compiled from: VoipShareLinkClickAnalytics.kt */
/* loaded from: classes11.dex */
public final class VoipShareLinkClickAnalytics extends wew0<b> implements jdw0.b {
    public static final a c = new a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoipShareLinkClickAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source CALLS_SERVICES;
        public static final Source CALLS_SERVICES_LONG_AGO;
        public static final Source IN_CALL;

        static {
            Source source = new Source("CALLS_SERVICES", 0);
            CALLS_SERVICES = source;
            Source source2 = new Source("CALLS_SERVICES_LONG_AGO", 1);
            CALLS_SERVICES_LONG_AGO = source2;
            Source source3 = new Source("IN_CALL", 2);
            IN_CALL = source3;
            Source[] sourceArr = {source, source2, source3};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        public Source() {
            throw null;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* compiled from: VoipShareLinkClickAnalytics.kt */
    public static final class a implements jdw0.a {
        @Override // xsna.jdw0.a
        public final boolean a(mdw0 mdw0Var) {
            return mdw0Var instanceof b;
        }
    }

    /* compiled from: VoipShareLinkClickAnalytics.kt */
    /* loaded from: classes7.dex */
    public interface b extends mdw0 {

        /* compiled from: VoipShareLinkClickAnalytics.kt */
        public static final class a implements b {
            public final Source a;

            public a(Source source) {
                this.a = source;
            }

            public final Source b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                aVar.getClass();
                return this.a == aVar.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Call(linkType=null, source=" + this.a + ')';
            }
        }
    }

    /* compiled from: VoipShareLinkClickAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CALLS_SERVICES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.CALLS_SERVICES_LONG_AGO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.IN_CALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.jdw0.b
    public final boolean a(mdw0 mdw0Var) {
        if (!(mdw0Var instanceof b)) {
            return false;
        }
        b((b) mdw0Var);
        return true;
    }

    @Override // xsna.kdw0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void b(b bVar) {
        MobileOfficialAppsCallsStat$TypeVoipShareClick.Source source;
        if (!(bVar instanceof b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        MobileOfficialAppsCallsStat$TypeVoipShareClick.EventType eventType = MobileOfficialAppsCallsStat$TypeVoipShareClick.EventType.SHARE_LINK_CLICK;
        int i = c.$EnumSwitchMapping$0[((b.a) bVar).b().ordinal()];
        if (i == 1) {
            source = MobileOfficialAppsCallsStat$TypeVoipShareClick.Source.CALLS_SERVICES;
        } else if (i == 2) {
            source = MobileOfficialAppsCallsStat$TypeVoipShareClick.Source.CALLS_SERVICES_LONG_AGO;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            source = MobileOfficialAppsCallsStat$TypeVoipShareClick.Source.IN_CALL;
        }
        wew0.c(this, null, null, new MobileOfficialAppsCallsStat$TypeVoipShareClick(eventType, source, null), 7);
    }
}
