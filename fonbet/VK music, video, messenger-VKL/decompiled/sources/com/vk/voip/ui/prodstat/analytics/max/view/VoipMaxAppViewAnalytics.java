package com.vk.voip.ui.prodstat.analytics.max.view;

import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vk.voip.ui.prodstat.analytics.base.common.VoipCallTypeAnalytics;
import io.reactivex.rxjava3.kotlin.c;
import io.reactivex.rxjava3.subjects.f;
import java.util.concurrent.TimeUnit;
import xsna.asp;
import xsna.jdw0;
import xsna.mdw0;
import xsna.vk6;
import xsna.xew0;
import xsna.z8l0;
import xsna.zrp;

/* compiled from: VoipMaxAppViewAnalytics.kt */
/* loaded from: classes11.dex */
public final class VoipMaxAppViewAnalytics extends xew0<Event> implements jdw0.b {
    public static final a d = new a();
    public final f<Event> c;

    /* compiled from: VoipMaxAppViewAnalytics.kt */
    /* loaded from: classes7.dex */
    public interface Event extends mdw0 {

        /* compiled from: VoipMaxAppViewAnalytics.kt */
        public static final class ShowCallButton implements Event {
            public final VoipCallTypeAnalytics a;
            public final Source b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: VoipMaxAppViewAnalytics.kt */
            public static final class Source {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Source[] $VALUES;
                public static final Source CALLS_SERVICES_OTHER;
                public static final Source FRIENDS_LIST;
                public static final Source HISTORY_FRIENDS_LIST_SERVICES_OTHER;
                public static final Source IM_PROFILE;
                public static final Source PROFILE;

                static {
                    Source source = new Source("CALLS_SERVICES_OTHER", 0);
                    CALLS_SERVICES_OTHER = source;
                    Source source2 = new Source("IM_PROFILE", 1);
                    IM_PROFILE = source2;
                    Source source3 = new Source("HISTORY_FRIENDS_LIST_SERVICES_OTHER", 2);
                    HISTORY_FRIENDS_LIST_SERVICES_OTHER = source3;
                    Source source4 = new Source("FRIENDS_LIST", 3);
                    FRIENDS_LIST = source4;
                    Source source5 = new Source("PROFILE", 4);
                    PROFILE = source5;
                    Source[] sourceArr = {source, source2, source3, source4, source5};
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

            public ShowCallButton(VoipCallTypeAnalytics voipCallTypeAnalytics, Source source) {
                this.a = voipCallTypeAnalytics;
                this.b = source;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowCallButton)) {
                    return false;
                }
                ShowCallButton showCallButton = (ShowCallButton) obj;
                return this.a == showCallButton.a && this.b == showCallButton.b;
            }

            public final int hashCode() {
                VoipCallTypeAnalytics voipCallTypeAnalytics = this.a;
                return this.b.hashCode() + ((voipCallTypeAnalytics == null ? 0 : voipCallTypeAnalytics.hashCode()) * 31);
            }

            public final String toString() {
                return "ShowCallButton(callType=" + this.a + ", source=" + this.b + ')';
            }
        }
    }

    /* compiled from: VoipMaxAppViewAnalytics.kt */
    public static final class a implements jdw0.a {
        @Override // xsna.jdw0.a
        public final boolean a(mdw0 mdw0Var) {
            return mdw0Var instanceof Event;
        }
    }

    /* compiled from: VoipMaxAppViewAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Event.ShowCallButton.Source.values().length];
            try {
                iArr[Event.ShowCallButton.Source.CALLS_SERVICES_OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Event.ShowCallButton.Source.IM_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Event.ShowCallButton.Source.HISTORY_FRIENDS_LIST_SERVICES_OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Event.ShowCallButton.Source.FRIENDS_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Event.ShowCallButton.Source.PROFILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VoipMaxAppViewAnalytics(vk6<SchemeStat$TypeView> vk6Var) {
        super(vk6Var);
        f<Event> fVar = new f<>();
        this.c = fVar;
        c.f(3, fVar.y(1L, TimeUnit.SECONDS), null, null, new z8l0(this, 18));
    }

    @Override // xsna.jdw0.b
    public final boolean a(mdw0 mdw0Var) {
        if (!(mdw0Var instanceof Event)) {
            return false;
        }
        this.c.onNext((Event) mdw0Var);
        return true;
    }

    @Override // xsna.kdw0
    public final void b(mdw0 mdw0Var) {
        this.c.onNext((Event) mdw0Var);
    }
}
