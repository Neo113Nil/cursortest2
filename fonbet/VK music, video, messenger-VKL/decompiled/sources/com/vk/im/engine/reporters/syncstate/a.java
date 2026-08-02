package com.vk.im.engine.reporters.syncstate;

import android.os.Handler;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.reporters.syncstate.ImSyncStateStatReporter;
import com.vk.im.engine.reporters.syncstate.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.a1w;
import xsna.fr;
import xsna.fs2;
import xsna.gs2;
import xsna.hod;
import xsna.j8;
import xsna.ry3;
import xsna.wzf;

/* compiled from: ImSyncStateStatReporterImpl.kt */
/* loaded from: classes2.dex */
public final class a implements ImSyncStateStatReporter {
    public final a1w a;
    public final c b;
    public final d c;
    public final LongPollType d;
    public final ImSyncStateStatReporter.Target e;

    /* compiled from: ImSyncStateStatReporterImpl.kt */
    /* renamed from: com.vk.im.engine.reporters.syncstate.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1127a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImSyncStateStatReporter.State.values().length];
            try {
                iArr[ImSyncStateStatReporter.State.ABSENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImSyncStateStatReporter.State.NETWORKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImSyncStateStatReporter.State.UPDATING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImSyncStateStatReporter.State.AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(a1w a1wVar, fr frVar, c cVar, d dVar, LongPollType longPollType, ImSyncStateStatReporter.Target target) {
        this.a = a1wVar;
        this.b = cVar;
        this.c = dVar;
        this.d = longPollType;
        this.e = target;
    }

    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.engine.reporters.syncstate.ImSyncStateStatReporter
    public final void a(ImSyncStateStatReporter.State state) {
        int i = C1127a.$EnumSwitchMapping$0[state.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                c cVar = this.b;
                ImSyncStateStatReporter.Target target = this.e;
                wzf wzfVar = new wzf(this, 25);
                c.a aVar = (c.a) cVar.b.get(target);
                if (aVar == null) {
                    aVar = new c.a(target, new LinkedHashSet(), new ry3(cVar, target, wzfVar, 8));
                }
                cVar.b.put(target, aVar);
                synchronized (aVar) {
                    aVar.b.add(new e(state, System.currentTimeMillis()));
                }
                ((Handler) cVar.a.getValue()).postDelayed(new hod(aVar.c, 13), 5000L);
                return;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            c cVar2 = this.b;
            c.a aVar2 = (c.a) cVar2.b.remove(this.e);
            if (aVar2 != null) {
                ((Handler) cVar2.a.getValue()).removeCallbacks(new gs2(aVar2.c, 15));
            } else {
                aVar2 = null;
            }
            Set set = aVar2 != null ? aVar2.b : EmptySet.b;
            if (set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (it.hasNext()) {
                long j = ((e) next).b;
                do {
                    Object next2 = it.next();
                    long j2 = ((e) next2).b;
                    if (j > j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it.hasNext());
            }
            ((j8) this.c).f((int) (System.currentTimeMillis() - ((e) next).b), set, this.a.p().a(this.d), this.e);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.engine.reporters.syncstate.ImSyncStateStatReporter
    public final void shutdown() {
        c cVar = this.b;
        Iterator it = cVar.b.values().iterator();
        while (it.hasNext()) {
            ((Handler) cVar.a.getValue()).removeCallbacks(new fs2(((c.a) it.next()).c, 11));
        }
    }
}
