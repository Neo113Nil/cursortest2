package com.vk.channels.impl.channel_screen.footer;

import com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet;
import xsna.epx;
import xsna.yn50;

/* compiled from: ChannelFooterViewEvent.kt */
/* loaded from: classes16.dex */
public abstract class j implements yn50 {

    /* compiled from: ChannelFooterViewEvent.kt */
    public static final class a extends j {
        public final BanReasonBottomSheet.Params a;

        public a(BanReasonBottomSheet.Params params) {
            this.a = params;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowBanReasonInfo(params=" + this.a + ')';
        }
    }

    /* compiled from: ChannelFooterViewEvent.kt */
    public static final class b extends j {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1988316435;
        }

        public final String toString() {
            return "ShowChannelUnarchived";
        }
    }

    /* compiled from: ChannelFooterViewEvent.kt */
    public static final class c extends j {
        public final ChannelJoiningError a;

        public c(ChannelJoiningError channelJoiningError) {
            this.a = channelJoiningError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowJoinToChannelError(channelJoiningError=" + this.a + ')';
        }
    }

    /* compiled from: ChannelFooterViewEvent.kt */
    public static final class d extends j {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1227296720;
        }

        public final String toString() {
            return "ShowJoinToChannelSuccess";
        }
    }

    /* compiled from: ChannelFooterViewEvent.kt */
    public static final class e extends j {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -817354951;
        }

        public final String toString() {
            return "ShowNotificationsDisabled";
        }
    }

    /* compiled from: ChannelFooterViewEvent.kt */
    public static final class f extends j {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -120679708;
        }

        public final String toString() {
            return "ShowNotificationsEnabled";
        }
    }
}
