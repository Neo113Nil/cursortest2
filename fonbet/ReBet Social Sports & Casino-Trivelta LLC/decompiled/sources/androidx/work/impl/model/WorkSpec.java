package androidx.work.impl.model;

import Q2.AbstractC1508t;
import Q2.C;
import Q2.C1493d;
import Q2.EnumC1490a;
import Q2.K;
import X9.m;
import androidx.work.OverwritingInputMerger;
import androidx.work.impl.model.WorkSpec;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.android.material.shape.i;
import i3.C4527h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import lb.C5444x;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import u.InterfaceC6482a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\bB\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u000368*Bõ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b#\u0010&B\u0019\b\u0016\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0000¢\u0006\u0004\b#\u0010)J\r\u0010*\u001a\u00020\u000b¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0019¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/J\u0082\u0002\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00104\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u00107R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u00107R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010ER\u0016\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bF\u0010>R\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bG\u0010>R\u0016\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bH\u0010>R\u0016\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bI\u0010>R\u0016\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010D\u001a\u0004\b@\u00103\"\u0004\bO\u0010PR\u001a\u0010\u001e\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010D\u001a\u0004\b<\u00103R\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bR\u0010>\u001a\u0004\b=\u0010+\"\u0004\bS\u0010TR\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bU\u0010D\u001a\u0004\b?\u00103\"\u0004\bV\u0010PR\u001a\u0010!\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010D\u001a\u0004\bA\u00103R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bX\u00107\u001a\u0004\bC\u0010/\"\u0004\bH\u0010YR\u0011\u0010Z\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bG\u0010-R\u0011\u0010[\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bF\u0010-¨\u0006]"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "", "", StackTraceHelper.ID_KEY, "LQ2/K$c;", "state", "workerClassName", "inputMergerClassName", "Landroidx/work/b;", "input", "output", "", "initialDelay", "intervalDuration", "flexDuration", "LQ2/d;", "constraints", "", "runAttemptCount", "LQ2/a;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "", "expedited", "LQ2/C;", "outOfQuotaPolicy", "periodCount", "generation", "nextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "stopReason", "traceTag", "<init>", "(Ljava/lang/String;LQ2/K$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLQ2/d;ILQ2/a;JJJJZLQ2/C;IIJIILjava/lang/String;)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Landroidx/work/impl/model/WorkSpec;)V", "c", "()J", "l", "()Z", "toString", "()Ljava/lang/String;", W9.d.f13160a, "(Ljava/lang/String;LQ2/K$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLQ2/d;ILQ2/a;JJJJZLQ2/C;IIJIILjava/lang/String;)Landroidx/work/impl/model/WorkSpec;", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", com.google.crypto.tink.integration.android.b.f37029b, "LQ2/K$c;", e.f29601m, "Landroidx/work/b;", "f", "g", "J", C4527h.f48087o, i.f35755A, "j", "LQ2/d;", "k", "I", "LQ2/a;", m.f13664a, "n", "o", "p", "q", "Z", "r", "LQ2/C;", "s", "setPeriodCount", "(I)V", "t", "u", "setNextScheduleTimeOverride", "(J)V", "v", "setNextScheduleTimeOverrideGeneration", "w", C5444x.f55808b, "(Ljava/lang/String;)V", "isPeriodic", "isBackedOff", "y", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWorkSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkSpec.kt\nandroidx/work/impl/model/WorkSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,463:1\n1549#2:464\n1620#2,3:465\n*S KotlinDebug\n*F\n+ 1 WorkSpec.kt\nandroidx/work/impl/model/WorkSpec\n*L\n402#1:464\n402#1:465,3\n*E\n"})
/* loaded from: classes.dex */
public final /* data */ class WorkSpec {

    /* renamed from: A, reason: collision with root package name */
    public static final InterfaceC6482a f23931A;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: z, reason: collision with root package name */
    public static final String f23933z;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public K.c state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String workerClassName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String inputMergerClassName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public androidx.work.b input;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public androidx.work.b output;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public long initialDelay;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public long intervalDuration;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public long flexDuration;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public C1493d constraints;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int runAttemptCount;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public EnumC1490a backoffPolicy;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public long backoffDelayDuration;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long lastEnqueueTime;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public long minimumRetentionDuration;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public long scheduleRequestedAt;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean expedited;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public C outOfQuotaPolicy;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public int periodCount;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final int generation;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public long nextScheduleTimeOverride;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public int nextScheduleTimeOverrideGeneration;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final int stopReason;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public String traceTag;

    /* renamed from: androidx.work.impl.model.WorkSpec$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(boolean z10, int i10, EnumC1490a backoffPolicy, long j10, long j11, int i11, boolean z11, long j12, long j13, long j14, long j15) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            if (j15 != LongCompanionObject.MAX_VALUE && z11) {
                return i11 == 0 ? j15 : RangesKt.coerceAtLeast(j15, 900000 + j11);
            }
            if (z10) {
                return RangesKt.coerceAtMost(backoffPolicy == EnumC1490a.LINEAR ? j10 * i10 : (long) Math.scalb(j10, i10 - 1), 18000000L) + j11;
            }
            if (!z11) {
                return j11 == -1 ? LongCompanionObject.MAX_VALUE : j11 + j12;
            }
            long j16 = i11 == 0 ? j11 + j12 : j11 + j14;
            return (j13 == j14 || i11 != 0) ? j16 : j16 + (j14 - j13);
        }

        public Companion() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f23958a;

        /* renamed from: b, reason: collision with root package name */
        public K.c f23959b;

        public b(String id2, K.c state) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f23958a = id2;
            this.f23959b = state;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f23958a, bVar.f23958a) && this.f23959b == bVar.f23959b;
        }

        public int hashCode() {
            return (this.f23958a.hashCode() * 31) + this.f23959b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f23958a + ", state=" + this.f23959b + ')';
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f23960a;

        /* renamed from: b, reason: collision with root package name */
        public final K.c f23961b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.work.b f23962c;

        /* renamed from: d, reason: collision with root package name */
        public final long f23963d;

        /* renamed from: e, reason: collision with root package name */
        public final long f23964e;

        /* renamed from: f, reason: collision with root package name */
        public final long f23965f;

        /* renamed from: g, reason: collision with root package name */
        public final C1493d f23966g;

        /* renamed from: h, reason: collision with root package name */
        public final int f23967h;

        /* renamed from: i, reason: collision with root package name */
        public EnumC1490a f23968i;

        /* renamed from: j, reason: collision with root package name */
        public long f23969j;

        /* renamed from: k, reason: collision with root package name */
        public long f23970k;

        /* renamed from: l, reason: collision with root package name */
        public int f23971l;

        /* renamed from: m, reason: collision with root package name */
        public final int f23972m;

        /* renamed from: n, reason: collision with root package name */
        public final long f23973n;

        /* renamed from: o, reason: collision with root package name */
        public final int f23974o;

        /* renamed from: p, reason: collision with root package name */
        public final List f23975p;

        /* renamed from: q, reason: collision with root package name */
        public final List f23976q;

        public c(String id2, K.c state, androidx.work.b output, long j10, long j11, long j12, C1493d constraints, int i10, EnumC1490a backoffPolicy, long j13, long j14, int i11, int i12, long j15, int i13, List tags, List progress) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.f23960a = id2;
            this.f23961b = state;
            this.f23962c = output;
            this.f23963d = j10;
            this.f23964e = j11;
            this.f23965f = j12;
            this.f23966g = constraints;
            this.f23967h = i10;
            this.f23968i = backoffPolicy;
            this.f23969j = j13;
            this.f23970k = j14;
            this.f23971l = i11;
            this.f23972m = i12;
            this.f23973n = j15;
            this.f23974o = i13;
            this.f23975p = tags;
            this.f23976q = progress;
        }

        public final long a() {
            return this.f23961b == K.c.ENQUEUED ? WorkSpec.INSTANCE.a(c(), this.f23967h, this.f23968i, this.f23969j, this.f23970k, this.f23971l, d(), this.f23963d, this.f23965f, this.f23964e, this.f23973n) : LongCompanionObject.MAX_VALUE;
        }

        public final K.b b() {
            long j10 = this.f23964e;
            if (j10 != 0) {
                return new K.b(j10, this.f23965f);
            }
            return null;
        }

        public final boolean c() {
            return this.f23961b == K.c.ENQUEUED && this.f23967h > 0;
        }

        public final boolean d() {
            return this.f23964e != 0;
        }

        public final K e() {
            androidx.work.b bVar = !this.f23976q.isEmpty() ? (androidx.work.b) this.f23976q.get(0) : androidx.work.b.f23770c;
            UUID fromString = UUID.fromString(this.f23960a);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(id)");
            return new K(fromString, this.f23961b, new HashSet(this.f23975p), this.f23962c, bVar, this.f23967h, this.f23972m, this.f23966g, this.f23963d, b(), a(), this.f23974o);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f23960a, cVar.f23960a) && this.f23961b == cVar.f23961b && Intrinsics.areEqual(this.f23962c, cVar.f23962c) && this.f23963d == cVar.f23963d && this.f23964e == cVar.f23964e && this.f23965f == cVar.f23965f && Intrinsics.areEqual(this.f23966g, cVar.f23966g) && this.f23967h == cVar.f23967h && this.f23968i == cVar.f23968i && this.f23969j == cVar.f23969j && this.f23970k == cVar.f23970k && this.f23971l == cVar.f23971l && this.f23972m == cVar.f23972m && this.f23973n == cVar.f23973n && this.f23974o == cVar.f23974o && Intrinsics.areEqual(this.f23975p, cVar.f23975p) && Intrinsics.areEqual(this.f23976q, cVar.f23976q);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.f23960a.hashCode() * 31) + this.f23961b.hashCode()) * 31) + this.f23962c.hashCode()) * 31) + Long.hashCode(this.f23963d)) * 31) + Long.hashCode(this.f23964e)) * 31) + Long.hashCode(this.f23965f)) * 31) + this.f23966g.hashCode()) * 31) + Integer.hashCode(this.f23967h)) * 31) + this.f23968i.hashCode()) * 31) + Long.hashCode(this.f23969j)) * 31) + Long.hashCode(this.f23970k)) * 31) + Integer.hashCode(this.f23971l)) * 31) + Integer.hashCode(this.f23972m)) * 31) + Long.hashCode(this.f23973n)) * 31) + Integer.hashCode(this.f23974o)) * 31) + this.f23975p.hashCode()) * 31) + this.f23976q.hashCode();
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.f23960a + ", state=" + this.f23961b + ", output=" + this.f23962c + ", initialDelay=" + this.f23963d + ", intervalDuration=" + this.f23964e + ", flexDuration=" + this.f23965f + ", constraints=" + this.f23966g + ", runAttemptCount=" + this.f23967h + ", backoffPolicy=" + this.f23968i + ", backoffDelayDuration=" + this.f23969j + ", lastEnqueueTime=" + this.f23970k + ", periodCount=" + this.f23971l + ", generation=" + this.f23972m + ", nextScheduleTimeOverride=" + this.f23973n + ", stopReason=" + this.f23974o + ", tags=" + this.f23975p + ", progress=" + this.f23976q + ')';
        }
    }

    static {
        String i10 = AbstractC1508t.i("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"WorkSpec\")");
        f23933z = i10;
        f23931A = new InterfaceC6482a() { // from class: X2.m
            @Override // u.InterfaceC6482a
            public final Object apply(Object obj) {
                List b10;
                b10 = WorkSpec.b((List) obj);
                return b10;
            }
        };
    }

    public WorkSpec(String id2, K.c state, String workerClassName, String inputMergerClassName, androidx.work.b input, androidx.work.b output, long j10, long j11, long j12, C1493d constraints, int i10, EnumC1490a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, C outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14, String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.id = id2;
        this.state = state;
        this.workerClassName = workerClassName;
        this.inputMergerClassName = inputMergerClassName;
        this.input = input;
        this.output = output;
        this.initialDelay = j10;
        this.intervalDuration = j11;
        this.flexDuration = j12;
        this.constraints = constraints;
        this.runAttemptCount = i10;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j13;
        this.lastEnqueueTime = j14;
        this.minimumRetentionDuration = j15;
        this.scheduleRequestedAt = j16;
        this.expedited = z10;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i11;
        this.generation = i12;
        this.nextScheduleTimeOverride = j17;
        this.nextScheduleTimeOverrideGeneration = i13;
        this.stopReason = i14;
        this.traceTag = str;
    }

    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).e());
        }
        return arrayList;
    }

    public static /* synthetic */ WorkSpec e(WorkSpec workSpec, String str, K.c cVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, C1493d c1493d, int i10, EnumC1490a enumC1490a, long j13, long j14, long j15, long j16, boolean z10, C c10, int i11, int i12, long j17, int i13, int i14, String str4, int i15, Object obj) {
        String str5;
        int i16;
        EnumC1490a enumC1490a2;
        long j18;
        long j19;
        long j20;
        long j21;
        C c11;
        int i17;
        int i18;
        long j22;
        K.c cVar2;
        int i19;
        boolean z11;
        String str6;
        String str7;
        androidx.work.b bVar3;
        androidx.work.b bVar4;
        long j23;
        long j24;
        long j25;
        C1493d c1493d2;
        int i20;
        String str8 = (i15 & 1) != 0 ? workSpec.id : str;
        K.c cVar3 = (i15 & 2) != 0 ? workSpec.state : cVar;
        String str9 = (i15 & 4) != 0 ? workSpec.workerClassName : str2;
        String str10 = (i15 & 8) != 0 ? workSpec.inputMergerClassName : str3;
        androidx.work.b bVar5 = (i15 & 16) != 0 ? workSpec.input : bVar;
        androidx.work.b bVar6 = (i15 & 32) != 0 ? workSpec.output : bVar2;
        long j26 = (i15 & 64) != 0 ? workSpec.initialDelay : j10;
        long j27 = (i15 & 128) != 0 ? workSpec.intervalDuration : j11;
        long j28 = (i15 & 256) != 0 ? workSpec.flexDuration : j12;
        C1493d c1493d3 = (i15 & 512) != 0 ? workSpec.constraints : c1493d;
        int i21 = (i15 & 1024) != 0 ? workSpec.runAttemptCount : i10;
        String str11 = str8;
        EnumC1490a enumC1490a3 = (i15 & 2048) != 0 ? workSpec.backoffPolicy : enumC1490a;
        K.c cVar4 = cVar3;
        long j29 = (i15 & 4096) != 0 ? workSpec.backoffDelayDuration : j13;
        long j30 = (i15 & 8192) != 0 ? workSpec.lastEnqueueTime : j14;
        long j31 = (i15 & 16384) != 0 ? workSpec.minimumRetentionDuration : j15;
        long j32 = (i15 & 32768) != 0 ? workSpec.scheduleRequestedAt : j16;
        boolean z12 = (i15 & PKIFailureInfo.notAuthorized) != 0 ? workSpec.expedited : z10;
        long j33 = j32;
        C c12 = (i15 & PKIFailureInfo.unsupportedVersion) != 0 ? workSpec.outOfQuotaPolicy : c10;
        int i22 = (i15 & PKIFailureInfo.transactionIdInUse) != 0 ? workSpec.periodCount : i11;
        C c13 = c12;
        int i23 = (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? workSpec.generation : i12;
        int i24 = i22;
        long j34 = (i15 & PKIFailureInfo.badCertTemplate) != 0 ? workSpec.nextScheduleTimeOverride : j17;
        int i25 = (i15 & PKIFailureInfo.badSenderNonce) != 0 ? workSpec.nextScheduleTimeOverrideGeneration : i13;
        int i26 = (i15 & 4194304) != 0 ? workSpec.stopReason : i14;
        if ((i15 & 8388608) != 0) {
            i16 = i25;
            str5 = workSpec.traceTag;
            j18 = j29;
            j19 = j30;
            j20 = j31;
            j21 = j33;
            c11 = c13;
            i17 = i24;
            i18 = i23;
            j22 = j34;
            cVar2 = cVar4;
            i19 = i26;
            z11 = z12;
            str6 = str9;
            str7 = str10;
            bVar3 = bVar5;
            bVar4 = bVar6;
            j23 = j26;
            j24 = j27;
            j25 = j28;
            c1493d2 = c1493d3;
            i20 = i21;
            enumC1490a2 = enumC1490a3;
        } else {
            str5 = str4;
            i16 = i25;
            enumC1490a2 = enumC1490a3;
            j18 = j29;
            j19 = j30;
            j20 = j31;
            j21 = j33;
            c11 = c13;
            i17 = i24;
            i18 = i23;
            j22 = j34;
            cVar2 = cVar4;
            i19 = i26;
            z11 = z12;
            str6 = str9;
            str7 = str10;
            bVar3 = bVar5;
            bVar4 = bVar6;
            j23 = j26;
            j24 = j27;
            j25 = j28;
            c1493d2 = c1493d3;
            i20 = i21;
        }
        return workSpec.d(str11, cVar2, str6, str7, bVar3, bVar4, j23, j24, j25, c1493d2, i20, enumC1490a2, j18, j19, j20, j21, z11, c11, i17, i18, j22, i16, i19, str5);
    }

    public final long c() {
        return INSTANCE.a(m(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, n(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    public final WorkSpec d(String id2, K.c state, String workerClassName, String inputMergerClassName, androidx.work.b input, androidx.work.b output, long initialDelay, long intervalDuration, long flexDuration, C1493d constraints, int runAttemptCount, EnumC1490a backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, long minimumRetentionDuration, long scheduleRequestedAt, boolean expedited, C outOfQuotaPolicy, int periodCount, int generation, long nextScheduleTimeOverride, int nextScheduleTimeOverrideGeneration, int stopReason, String traceTag) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new WorkSpec(id2, state, workerClassName, inputMergerClassName, input, output, initialDelay, intervalDuration, flexDuration, constraints, runAttemptCount, backoffPolicy, backoffDelayDuration, lastEnqueueTime, minimumRetentionDuration, scheduleRequestedAt, expedited, outOfQuotaPolicy, periodCount, generation, nextScheduleTimeOverride, nextScheduleTimeOverrideGeneration, stopReason, traceTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) other;
        return Intrinsics.areEqual(this.id, workSpec.id) && this.state == workSpec.state && Intrinsics.areEqual(this.workerClassName, workSpec.workerClassName) && Intrinsics.areEqual(this.inputMergerClassName, workSpec.inputMergerClassName) && Intrinsics.areEqual(this.input, workSpec.input) && Intrinsics.areEqual(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && Intrinsics.areEqual(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation && this.nextScheduleTimeOverride == workSpec.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == workSpec.nextScheduleTimeOverrideGeneration && this.stopReason == workSpec.stopReason && Intrinsics.areEqual(this.traceTag, workSpec.traceTag);
    }

    /* renamed from: f, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    /* renamed from: g, reason: from getter */
    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    /* renamed from: h, reason: from getter */
    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31) + this.inputMergerClassName.hashCode()) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Long.hashCode(this.minimumRetentionDuration)) * 31) + Long.hashCode(this.scheduleRequestedAt)) * 31) + Boolean.hashCode(this.expedited)) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.nextScheduleTimeOverrideGeneration)) * 31) + Integer.hashCode(this.stopReason)) * 31;
        String str = this.traceTag;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: i, reason: from getter */
    public final int getPeriodCount() {
        return this.periodCount;
    }

    /* renamed from: j, reason: from getter */
    public final int getStopReason() {
        return this.stopReason;
    }

    /* renamed from: k, reason: from getter */
    public final String getTraceTag() {
        return this.traceTag;
    }

    public final boolean l() {
        return !Intrinsics.areEqual(C1493d.f9267k, this.constraints);
    }

    public final boolean m() {
        return this.state == K.c.ENQUEUED && this.runAttemptCount > 0;
    }

    public final boolean n() {
        return this.intervalDuration != 0;
    }

    public final void o(String str) {
        this.traceTag = str;
    }

    public String toString() {
        return "{WorkSpec: " + this.id + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WorkSpec(String str, K.c cVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, C1493d c1493d, int i10, EnumC1490a enumC1490a, long j13, long j14, long j15, long j16, boolean z10, C c10, int i11, int i12, long j17, int i13, int i14, String str4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r4, str2, r6, (i15 & 16) != 0 ? androidx.work.b.f23770c : bVar, (i15 & 32) != 0 ? androidx.work.b.f23770c : bVar2, (i15 & 64) != 0 ? 0L : j10, (i15 & 128) != 0 ? 0L : j11, (i15 & 256) != 0 ? 0L : j12, (i15 & 512) != 0 ? C1493d.f9267k : c1493d, (i15 & 1024) != 0 ? 0 : i10, (i15 & 2048) != 0 ? EnumC1490a.EXPONENTIAL : enumC1490a, (i15 & 4096) != 0 ? 30000L : j13, (i15 & 8192) != 0 ? -1L : j14, (i15 & 16384) == 0 ? j15 : 0L, (32768 & i15) != 0 ? -1L : j16, (65536 & i15) != 0 ? false : z10, (131072 & i15) != 0 ? C.RUN_AS_NON_EXPEDITED_WORK_REQUEST : c10, (262144 & i15) != 0 ? 0 : i11, (524288 & i15) != 0 ? 0 : i12, (1048576 & i15) != 0 ? Long.MAX_VALUE : j17, (2097152 & i15) != 0 ? 0 : i13, (4194304 & i15) != 0 ? -256 : i14, (i15 & 8388608) != 0 ? null : str4);
        String str5;
        K.c cVar2 = (i15 & 2) != 0 ? K.c.ENQUEUED : cVar;
        if ((i15 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "OverwritingInputMerger::class.java.name");
            str5 = name;
        } else {
            str5 = str3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String id2, String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777210, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String newId, WorkSpec other) {
        this(newId, other.state, other.workerClassName, other.inputMergerClassName, new androidx.work.b(other.input), new androidx.work.b(other.output), other.initialDelay, other.intervalDuration, other.flexDuration, new C1493d(other.constraints), other.runAttemptCount, other.backoffPolicy, other.backoffDelayDuration, other.lastEnqueueTime, other.minimumRetentionDuration, other.scheduleRequestedAt, other.expedited, other.outOfQuotaPolicy, other.periodCount, 0, other.nextScheduleTimeOverride, other.nextScheduleTimeOverrideGeneration, other.stopReason, other.traceTag, PKIFailureInfo.signerNotTrusted, null);
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
    }
}
