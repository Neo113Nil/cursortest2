package com.vk.sharing.core.cancellation;

import com.vk.core.serialize.Serializer;
import com.vk.sharing.api.dto.Target;
import xsna.bh10;
import xsna.epx;
import xsna.thq;
import xsna.urd0;

/* compiled from: TargetSharingTask.kt */
/* loaded from: classes5.dex */
public final class TargetSharingTask extends Serializer.StreamParcelableAdapter implements Runnable {
    public static final Serializer.c<TargetSharingTask> CREATOR = new a();
    public final long b;
    public final Target c;
    public final String d;
    public final Integer e;
    public final long f;
    public final Runnable g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<TargetSharingTask> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TargetSharingTask a(Serializer serializer) {
            return new TargetSharingTask(serializer.w(), (Target) serializer.A(Target.class.getClassLoader()), serializer.H(), serializer.v());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TargetSharingTask[i];
        }
    }

    public TargetSharingTask(long j, Target target, String str, Integer num, long j2, Runnable runnable) {
        this.b = j;
        this.c = target;
        this.d = str;
        this.e = num;
        this.f = j2;
        this.g = runnable;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.V(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetSharingTask)) {
            return false;
        }
        TargetSharingTask targetSharingTask = (TargetSharingTask) obj;
        return this.b == targetSharingTask.b && epx.f(this.c, targetSharingTask.c) && epx.f(this.d, targetSharingTask.d) && epx.f(this.e, targetSharingTask.e) && this.f == targetSharingTask.f && epx.f(this.g, targetSharingTask.g);
    }

    public final int hashCode() {
        int a2 = urd0.a((this.c.hashCode() + (Long.hashCode(this.b) * 31)) * 31, 31, this.d);
        Integer num = this.e;
        return this.g.hashCode() + bh10.a((a2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.run();
    }

    public final String toString() {
        return "TargetSharingTask(timestamp=" + this.b + ", target=" + this.c + ", message=" + this.d + ", position=" + this.e + ", duration=" + this.f + ", delegate=" + this.g + ')';
    }

    public TargetSharingTask(long j, Target target, String str, Integer num, Runnable runnable) {
        this(j, target, str, num, 3500L, runnable);
    }

    public TargetSharingTask(long j, Target target, String str, Integer num) {
        this(j, target, str, num, 3500L, new thq(2));
    }
}
