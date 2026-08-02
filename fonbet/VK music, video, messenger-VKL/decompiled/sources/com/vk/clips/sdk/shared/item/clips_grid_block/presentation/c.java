package com.vk.clips.sdk.shared.item.clips_grid_block.presentation;

import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.HashSet;
import xsna.epx;
import xsna.k4b0;
import xsna.kih0;
import xsna.qi5;
import xsna.xl50;

/* compiled from: ClipsGridBlockPatch.kt */
/* loaded from: classes17.dex */
public interface c extends xl50 {

    /* compiled from: ClipsGridBlockPatch.kt */
    public interface a extends c {

        /* compiled from: ClipsGridBlockPatch.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.clips_grid_block.presentation.c$a$a, reason: collision with other inner class name */
        public static final class C0666a implements a {
            public static final C0666a b = new C0666a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0666a);
            }

            public final int hashCode() {
                return 1466410192;
            }

            public final String toString() {
                return "Focused";
            }
        }

        /* compiled from: ClipsGridBlockPatch.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -137447977;
            }

            public final String toString() {
                return "Unfocused";
            }
        }
    }

    /* compiled from: ClipsGridBlockPatch.kt */
    public interface b extends c {

        /* compiled from: ClipsGridBlockPatch.kt */
        public static final class a implements b {
            public final int b;
            public final kih0 c;

            public a(int i, kih0 kih0Var) {
                this.b = i;
                this.c = kih0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                return "Begin(index=" + this.b + ", autoPlay=" + this.c + ')';
            }
        }

        /* compiled from: ClipsGridBlockPatch.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.clips_grid_block.presentation.c$b$b, reason: collision with other inner class name */
        public static final class C0667b implements b {
            public static final C0667b b = new C0667b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0667b);
            }

            public final int hashCode() {
                return 340484002;
            }

            public final String toString() {
                return "End";
            }
        }
    }

    /* compiled from: ClipsGridBlockPatch.kt */
    /* renamed from: com.vk.clips.sdk.shared.item.clips_grid_block.presentation.c$c, reason: collision with other inner class name */
    public static final class C0668c implements c {
        public static final C0668c b = new C0668c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0668c);
        }

        public final int hashCode() {
            return -1651098629;
        }

        public final String toString() {
            return "HandleAnimationDidEnd";
        }
    }

    /* compiled from: ClipsGridBlockPatch.kt */
    public static final class d implements c {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1834608858;
        }

        public final String toString() {
            return "HandleNextPlayingClip";
        }
    }

    /* compiled from: ClipsGridBlockPatch.kt */
    public static final class e implements c {
        public final HashSet b;

        public e(HashSet hashSet) {
            this.b = hashSet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b.equals(((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "HandleUpdateErrorRecords(errorRecords=" + this.b + ')';
        }
    }

    /* compiled from: ClipsGridBlockPatch.kt */
    public static final class f implements c {
        public final qi5 b;
        public final k4b0 c;

        public f(qi5 qi5Var, k4b0 k4b0Var) {
            this.b = qi5Var;
            this.c = k4b0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.b.equals(fVar.b) && this.c.equals(fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.a.hashCode() * 31);
        }

        public final String toString() {
            return "HandleUpdatePlayerState(autoPlay=" + this.b + ", playerState=" + this.c + ')';
        }
    }

    /* compiled from: ClipsGridBlockPatch.kt */
    public interface g extends c {

        /* compiled from: ClipsGridBlockPatch.kt */
        public static final class a implements g {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -944692525;
            }

            public final String toString() {
                return "Start";
            }
        }

        /* compiled from: ClipsGridBlockPatch.kt */
        public static final class b implements g {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1216452465;
            }

            public final String toString() {
                return "Stop";
            }
        }
    }

    /* compiled from: ClipsGridBlockPatch.kt */
    public static final class h implements c {
        public final ArrayList b;

        public h(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b.equals(((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return j.b(')', new StringBuilder("UpdateClips(clipItems="), this.b);
        }
    }
}
