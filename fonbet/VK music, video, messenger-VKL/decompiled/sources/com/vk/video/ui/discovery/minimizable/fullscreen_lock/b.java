package com.vk.video.ui.discovery.minimizable.fullscreen_lock;

import defpackage.q0;
import xsna.epx;
import xsna.qoy;

/* compiled from: FullscreenLockPatchArgs.kt */
/* loaded from: classes7.dex */
public interface b {

    /* compiled from: FullscreenLockPatchArgs.kt */
    public static final class a implements b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1276050636;
        }

        public final String toString() {
            return "AnimateToUnlock";
        }
    }

    /* compiled from: FullscreenLockPatchArgs.kt */
    /* renamed from: com.vk.video.ui.discovery.minimizable.fullscreen_lock.b$b, reason: collision with other inner class name */
    public static final class C1987b implements b {
        public final FullscreenLockArgs a;
        public final FullscreenOrientationLockType b;
        public final boolean c;

        public C1987b(FullscreenLockArgs fullscreenLockArgs, FullscreenOrientationLockType fullscreenOrientationLockType, boolean z) {
            this.a = fullscreenLockArgs;
            this.b = fullscreenOrientationLockType;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1987b)) {
                return false;
            }
            C1987b c1987b = (C1987b) obj;
            return epx.f(this.a, c1987b.a) && this.b == c1987b.b && this.c == c1987b.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Lock(args=");
            sb.append(this.a);
            sb.append(", fullscreenOrientationLockType=");
            sb.append(this.b);
            sb.append(", isSilentMode=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: FullscreenLockPatchArgs.kt */
    public static final class c implements b {
        public final FullscreenLockArgs a;
        public final boolean b;
        public final boolean c;

        public c(FullscreenLockArgs fullscreenLockArgs, boolean z, boolean z2) {
            this.a = fullscreenLockArgs;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TemporarilyUnlock(lastLockArgs=");
            sb.append(this.a);
            sb.append(", isOrientationLocked=");
            sb.append(this.b);
            sb.append(", isLockAfterMessageNeeded=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: FullscreenLockPatchArgs.kt */
    public static final class d implements b {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 277158040;
        }

        public final String toString() {
            return "Unlock";
        }
    }
}
