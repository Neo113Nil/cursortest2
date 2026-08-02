package com.vk.channels.impl.post_settings;

import com.vk.dto.common.id.UserId;
import java.util.Date;
import xsna.epx;
import xsna.gp;
import xsna.oq;
import xsna.pp80;
import xsna.yn50;

/* compiled from: PostSettingsViewEvent.kt */
/* loaded from: classes16.dex */
public abstract class g implements yn50 {

    /* compiled from: PostSettingsViewEvent.kt */
    public static final class a extends g {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1025081002;
        }

        public final String toString() {
            return "ShowAddedAdvertisingSnackBar";
        }
    }

    /* compiled from: PostSettingsViewEvent.kt */
    public static final class b extends g {
        public final Date a;

        public b(Date date) {
            this.a = date;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowDelayedSendPopup(initialDate=" + this.a + ')';
        }
    }

    /* compiled from: PostSettingsViewEvent.kt */
    public static final class c extends g {
        public final Throwable a;

        public c(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("ShowError(throwable="), this.a, ')');
        }
    }

    /* compiled from: PostSettingsViewEvent.kt */
    public static final class d extends g {
        public final UserId a;
        public final UserId b;

        public d(UserId userId, UserId userId2) {
            this.a = userId;
            this.b = userId2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowMonetization(ownerId=");
            sb.append(this.a);
            sb.append(", channelId=");
            return gp.b(sb, this.b, ')');
        }
    }

    /* compiled from: PostSettingsViewEvent.kt */
    public static final class e extends g {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -2134268540;
        }

        public final String toString() {
            return "ShowRemoveAdvertisingSnackBar";
        }
    }

    /* compiled from: PostSettingsViewEvent.kt */
    public static final class f extends g {
        public final pp80 a;

        public f(pp80 pp80Var) {
            this.a = pp80Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowVisibleToDonsPopup(setting=" + this.a + ')';
        }
    }
}
