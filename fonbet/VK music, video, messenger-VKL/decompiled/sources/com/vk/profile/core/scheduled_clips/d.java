package com.vk.profile.core.scheduled_clips;

import com.vk.dto.common.ClipVideoFile;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import xsna.epx;
import xsna.xl50;

/* compiled from: CommunityScheduledClipsGridPatch.kt */
/* loaded from: classes5.dex */
public interface d extends xl50 {

    /* compiled from: CommunityScheduledClipsGridPatch.kt */
    public static final class a implements d {
        public static final a b = new a();
    }

    /* compiled from: CommunityScheduledClipsGridPatch.kt */
    public static final class b implements d {
        public static final b b = new b();
    }

    /* compiled from: CommunityScheduledClipsGridPatch.kt */
    public static final class c implements d {
        public final ArrayList b;

        public c(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b.equals(((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return j.b(')', new StringBuilder("Loaded(clips="), this.b);
        }
    }

    /* compiled from: CommunityScheduledClipsGridPatch.kt */
    /* renamed from: com.vk.profile.core.scheduled_clips.d$d, reason: collision with other inner class name */
    public static final class C1643d implements d {
        public static final C1643d b = new C1643d();
    }

    /* compiled from: CommunityScheduledClipsGridPatch.kt */
    public static final class e implements d {
        public final ClipVideoFile b;

        public e(ClipVideoFile clipVideoFile) {
            this.b = clipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Overlay(clip=" + this.b + ')';
        }
    }
}
