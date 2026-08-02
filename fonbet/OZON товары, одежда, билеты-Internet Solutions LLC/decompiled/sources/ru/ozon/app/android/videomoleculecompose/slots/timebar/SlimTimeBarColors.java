package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import I0.C3173b;
import N3.C3660k;
import Pk0.c;
import Sc.C;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarColors;", "", "Ll1/Z;", "played", "buffered", "unplayed", "scrubber", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getPlayed-0d7_KjU", "()J", "getBuffered-0d7_KjU", "getUnplayed-0d7_KjU", "getScrubber-0d7_KjU", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SlimTimeBarColors {
    private final long buffered;
    private final long played;
    private final long scrubber;
    private final long unplayed;

    public /* synthetic */ SlimTimeBarColors(long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlimTimeBarColors)) {
            return false;
        }
        SlimTimeBarColors slimTimeBarColors = (SlimTimeBarColors) other;
        return C7807Z.p(this.played, slimTimeBarColors.played) && C7807Z.p(this.buffered, slimTimeBarColors.buffered) && C7807Z.p(this.unplayed, slimTimeBarColors.unplayed) && C7807Z.p(this.scrubber, slimTimeBarColors.scrubber);
    }

    /* renamed from: getBuffered-0d7_KjU, reason: not valid java name and from getter */
    public final long getBuffered() {
        return this.buffered;
    }

    /* renamed from: getPlayed-0d7_KjU, reason: not valid java name and from getter */
    public final long getPlayed() {
        return this.played;
    }

    /* renamed from: getScrubber-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrubber() {
        return this.scrubber;
    }

    /* renamed from: getUnplayed-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnplayed() {
        return this.unplayed;
    }

    public int hashCode() {
        long j11 = this.played;
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Long.hashCode(this.scrubber) + c.a(c.a(Long.hashCode(j11) * 31, 31, this.buffered), 31, this.unplayed);
    }

    @NotNull
    public String toString() {
        String v11 = C7807Z.v(this.played);
        String v12 = C7807Z.v(this.buffered);
        return C3173b.c(C3660k.d("SlimTimeBarColors(played=", v11, ", buffered=", v12, ", unplayed="), C7807Z.v(this.unplayed), ", scrubber=", C7807Z.v(this.scrubber), ")");
    }

    private SlimTimeBarColors(long j11, long j12, long j13, long j14) {
        this.played = j11;
        this.buffered = j12;
        this.unplayed = j13;
        this.scrubber = j14;
    }
}
