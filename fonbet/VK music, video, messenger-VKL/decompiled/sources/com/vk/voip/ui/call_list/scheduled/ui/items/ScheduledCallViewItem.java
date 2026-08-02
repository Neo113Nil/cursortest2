package com.vk.voip.ui.call_list.scheduled.ui.items;

import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.a;
import java.util.Objects;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.l59;
import xsna.mvo0;
import xsna.qoy;
import xsna.urd0;
import xsna.x5h0;
import xsna.zrp;

/* compiled from: ScheduledCallViewItem.kt */
/* loaded from: classes7.dex */
public abstract class ScheduledCallViewItem implements l59 {

    /* compiled from: ScheduledCallViewItem.kt */
    public static final class ScheduledCall extends ScheduledCallViewItem {
        public final a b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final x5h0 f;
        public final BackgroundType g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ScheduledCallViewItem.kt */
        public static final class BackgroundType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ BackgroundType[] $VALUES;
            public static final BackgroundType CONTENT_COLOR;
            public static final BackgroundType CONTENT_COLOR_WITH_ROUNDED_BOTTOM;

            static {
                BackgroundType backgroundType = new BackgroundType("CONTENT_COLOR", 0);
                CONTENT_COLOR = backgroundType;
                BackgroundType backgroundType2 = new BackgroundType("CONTENT_COLOR_WITH_ROUNDED_BOTTOM", 1);
                CONTENT_COLOR_WITH_ROUNDED_BOTTOM = backgroundType2;
                BackgroundType[] backgroundTypeArr = {backgroundType, backgroundType2};
                $VALUES = backgroundTypeArr;
                $ENTRIES = new asp(backgroundTypeArr);
            }

            public BackgroundType() {
                throw null;
            }

            public static BackgroundType valueOf(String str) {
                return (BackgroundType) Enum.valueOf(BackgroundType.class, str);
            }

            public static BackgroundType[] values() {
                return (BackgroundType[]) $VALUES.clone();
            }
        }

        /* compiled from: ScheduledCallViewItem.kt */
        public static final class a {
            public final ImageList a;
            public final a.b.C1178a b;

            public a(ImageList imageList, a.b.C1178a c1178a) {
                this.a = imageList;
                this.b = c1178a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b.equals(aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.b.hashCode() * 31);
            }

            public final String toString() {
                return "Avatar(image=" + this.a + ", placeholderSource=" + this.b + ')';
            }
        }

        public ScheduledCall(a aVar, String str, boolean z, boolean z2, x5h0 x5h0Var) {
            BackgroundType backgroundType = BackgroundType.CONTENT_COLOR;
            this.b = aVar;
            this.c = str;
            this.d = z;
            this.e = z2;
            this.f = x5h0Var;
            this.g = backgroundType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScheduledCall)) {
                return false;
            }
            ScheduledCall scheduledCall = (ScheduledCall) obj;
            return epx.f(this.b, scheduledCall.b) && epx.f(this.c, scheduledCall.c) && this.d == scheduledCall.d && this.e == scheduledCall.e && epx.f(this.f, scheduledCall.f) && this.g == scheduledCall.g;
        }

        @Override // com.vk.voip.ui.call_list.scheduled.ui.items.ScheduledCallViewItem, xsna.hfz
        public final Number getItemId() {
            x5h0 x5h0Var = this.f;
            return Integer.valueOf(Objects.hash(x5h0Var.a, new mvo0(x5h0Var.g)));
        }

        public final int hashCode() {
            a aVar = this.b;
            return Boolean.hashCode(false) + ((this.g.hashCode() + ((this.f.hashCode() + qoy.b(qoy.b(urd0.a((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31);
        }

        public final String toString() {
            return "ScheduledCall(avatar=" + this.b + ", time=" + this.c + ", isRecurrent=" + this.d + ", canJoinCall=" + this.e + ", scheduledCall=" + this.f + ", backgroundType=" + this.g + ", isEduAccount=false)";
        }
    }

    /* compiled from: ScheduledCallViewItem.kt */
    public static final class a extends ScheduledCallViewItem {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("DateInterval(title="), this.b, ')');
        }
    }

    /* compiled from: ScheduledCallViewItem.kt */
    public static final class b extends ScheduledCallViewItem {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "NoScheduledCallStub(ongoingCount=0)";
        }
    }

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }
}
