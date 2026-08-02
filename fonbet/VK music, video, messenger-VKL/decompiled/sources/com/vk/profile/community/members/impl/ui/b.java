package com.vk.profile.community.members.impl.ui;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.ho8;
import xsna.pk50;

/* compiled from: MembersEvent.kt */
/* loaded from: classes5.dex */
public interface b extends pk50 {

    /* compiled from: MembersEvent.kt */
    public static final class a implements b {
        public final String a;

        public a(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("OpenUrl(url="), this.a, ')');
        }
    }

    /* compiled from: MembersEvent.kt */
    /* renamed from: com.vk.profile.community.members.impl.ui.b$b, reason: collision with other inner class name */
    public static final class C1633b implements b {
        public final UserId a;

        public C1633b(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1633b) && epx.f(this.a, ((C1633b) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenUserProfile(userId="), this.a, ')');
        }
    }
}
