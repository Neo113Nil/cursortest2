package I5;

import I5.LogEntry;
import Q5.SnapshotContext;
import Q5.b;
import Zh.InterfaceC1901b;
import di.C4087f;
import di.U0;
import i3.C4527h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0081\b\u0018\u0000 42\u00020\u0001:\u0002+\u001dB!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001d\u001a\u00020\u00002\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010 J*\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u0017¨\u00065"}, d2 = {"LI5/b;", "", "", "LI5/l;", "logs", "", "shouldSkipIpEnrichment", "<init>", "(Ljava/util/List;Z)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/util/List;ZLdi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", C4527h.f48087o, "(LI5/b;Lci/d;Lbi/f;)V", "f", "()Z", "Lkotlin/Function1;", "LQ5/h;", "beforeSend", "LO5/a;", "snapshotManager", com.google.crypto.tink.integration.android.b.f37029b, "(Lkotlin/jvm/functions/Function1;LO5/a;)LI5/b;", "g", "()LI5/b;", "c", "(Ljava/util/List;Z)LI5/b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", com.bumptech.glide.gifdecoder.e.f29601m, "()Ljava/util/List;", "getLogs$annotations", "()V", "Z", "getShouldSkipIpEnrichment", "getShouldSkipIpEnrichment$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoralogixLog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoralogixLog.kt\ncom/coralogix/android/sdk/internal/model/CoralogixLog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1611#2,9:80\n1863#2:89\n1864#2:91\n1620#2:92\n1557#2:94\n1628#2,3:95\n1557#2:98\n1628#2,3:99\n1#3:90\n1#3:93\n*S KotlinDebug\n*F\n+ 1 CoralogixLog.kt\ncom/coralogix/android/sdk/internal/model/CoralogixLog\n*L\n34#1:80,9\n34#1:89\n34#1:91\n34#1:92\n64#1:94\n64#1:95,3\n78#1:98\n78#1:99,3\n34#1:90\n*E\n"})
/* renamed from: I5.b, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class CoralogixLog {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final List logs;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean shouldSkipIpEnrichment;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers = {new C4087f(LogEntry.a.f5446a), null};

    /* renamed from: I5.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f5364a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CoralogixLog(int i10, List list, boolean z10, U0 u02) {
        this.logs = (i10 & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i10 & 2) == 0) {
            this.shouldSkipIpEnrichment = false;
        } else {
            this.shouldSkipIpEnrichment = z10;
        }
    }

    public static /* synthetic */ CoralogixLog d(CoralogixLog coralogixLog, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = coralogixLog.logs;
        }
        if ((i10 & 2) != 0) {
            z10 = coralogixLog.shouldSkipIpEnrichment;
        }
        return coralogixLog.c(list, z10);
    }

    public static final /* synthetic */ void h(CoralogixLog self, ci.d output, bi.f serialDesc) {
        InterfaceC1901b[] interfaceC1901bArr = $childSerializers;
        if (output.m(serialDesc, 0) || !Intrinsics.areEqual(self.logs, CollectionsKt.emptyList())) {
            output.B(serialDesc, 0, interfaceC1901bArr[0], self.logs);
        }
        if (output.m(serialDesc, 1) || self.shouldSkipIpEnrichment) {
            output.F(serialDesc, 1, self.shouldSkipIpEnrichment);
        }
    }

    public final CoralogixLog b(Function1 beforeSend, O5.a snapshotManager) {
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        if (beforeSend == null) {
            return this;
        }
        List list = this.logs;
        ArrayList<LogEntry> arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            LogEntry logEntry = null;
            if (!it.hasNext()) {
                break;
            }
            LogEntry logEntry2 = (LogEntry) it.next();
            CxRum data = logEntry2.getLogData().getData();
            Q5.b severity = data.getEventContext().getSeverity();
            Q5.h hVar = (Q5.h) beforeSend.invoke(data.f());
            if (hVar != null) {
                CxRum a10 = data.a(hVar);
                Q5.b severity2 = a10.getEventContext().getSeverity();
                b.e eVar = b.e.f9376b;
                if (Intrinsics.areEqual(severity, eVar) && !Intrinsics.areEqual(severity2, eVar)) {
                    i10--;
                } else if (!Intrinsics.areEqual(severity, eVar) && Intrinsics.areEqual(severity2, eVar)) {
                    i10++;
                }
                logEntry = LogEntry.b(logEntry2, null, null, null, logEntry2.getLogData().a(a10), 0L, null, null, 119, null);
            } else if (Intrinsics.areEqual(severity, b.e.f9376b)) {
                i10--;
            }
            if (logEntry != null) {
                arrayList.add(logEntry);
            }
        }
        if (i10 < 0) {
            int i11 = -i10;
            for (int i12 = 0; i12 < i11; i12++) {
                snapshotManager.b();
            }
        } else if (i10 > 0) {
            for (int i13 = 0; i13 < i10; i13++) {
                snapshotManager.e();
            }
        }
        if (i10 == 0) {
            return d(this, arrayList, false, 2, null);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (LogEntry logEntry3 : arrayList) {
            SnapshotContext snapshotContext = logEntry3.getLogData().getData().getSnapshotContext();
            if (snapshotContext != null) {
                logEntry3 = LogEntry.b(logEntry3, null, null, null, logEntry3.getLogData().a(CxRum.c(logEntry3.getLogData().getData(), null, null, null, null, null, null, null, null, null, 0L, null, null, null, false, null, null, null, SnapshotContext.b(snapshotContext, 0, Math.max(0, snapshotContext.getErrorCount() + i10), 0, 5, null), null, null, null, null, null, null, null, 33423359, null)), 0L, null, null, 119, null);
            }
            arrayList2.add(logEntry3);
        }
        return d(this, arrayList2, false, 2, null);
    }

    public final CoralogixLog c(List logs, boolean shouldSkipIpEnrichment) {
        Intrinsics.checkNotNullParameter(logs, "logs");
        return new CoralogixLog(logs, shouldSkipIpEnrichment);
    }

    /* renamed from: e, reason: from getter */
    public final List getLogs() {
        return this.logs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoralogixLog)) {
            return false;
        }
        CoralogixLog coralogixLog = (CoralogixLog) other;
        return Intrinsics.areEqual(this.logs, coralogixLog.logs) && this.shouldSkipIpEnrichment == coralogixLog.shouldSkipIpEnrichment;
    }

    public final boolean f() {
        return this.logs.isEmpty();
    }

    public final CoralogixLog g() {
        List list = this.logs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LogEntry) it.next()).d());
        }
        return d(this, arrayList, false, 2, null);
    }

    public int hashCode() {
        return (this.logs.hashCode() * 31) + Boolean.hashCode(this.shouldSkipIpEnrichment);
    }

    public String toString() {
        return "CoralogixLog(logs=" + this.logs + ", shouldSkipIpEnrichment=" + this.shouldSkipIpEnrichment + ")";
    }

    public CoralogixLog(List logs, boolean z10) {
        Intrinsics.checkNotNullParameter(logs, "logs");
        this.logs = logs;
        this.shouldSkipIpEnrichment = z10;
    }
}
