package com.vk.reefton;

import com.vk.reefton.dto.ReefRequestReason;
import com.vk.reefton.literx.sbjects.ReplaySubject;
import xsna.efz;
import xsna.epx;

/* compiled from: ReefSnapshotTrigger.kt */
/* loaded from: classes5.dex */
public final class d {
    public final ReplaySubject a = new ReplaySubject(new ReplaySubject.a());

    /* compiled from: ReefSnapshotTrigger.kt */
    public static final class a {
        public final Object a;
        public final ReefRequestReason b;
        public final long c;

        public a(Object obj, ReefRequestReason reefRequestReason, long j) {
            this.a = obj;
            this.b = reefRequestReason;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            Object obj = this.a;
            return Long.hashCode(this.c) + ((this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Trigger(caller=");
            sb.append(this.a);
            sb.append(", reason=");
            sb.append(this.b);
            sb.append(", timestamp=");
            return efz.b(this.c, ")", sb);
        }
    }

    public final void a(Object obj, ReefRequestReason reefRequestReason, long j) {
        this.a.onNext(new a(obj, reefRequestReason, j));
    }
}
