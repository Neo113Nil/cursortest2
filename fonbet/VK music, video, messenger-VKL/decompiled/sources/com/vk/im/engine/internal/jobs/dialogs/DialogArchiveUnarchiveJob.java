package com.vk.im.engine.internal.jobs.dialogs;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.instantjobs.InstantJob;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.w2;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.asu0;
import xsna.b5w;
import xsna.bz2;
import xsna.d480;
import xsna.eo3;
import xsna.f40;
import xsna.ij20;
import xsna.q680;
import xsna.r680;
import xsna.sa30;
import xsna.sxp;
import xsna.u4w;
import xsna.u6x;
import xsna.w2w;
import xsna.zrp;

/* compiled from: DialogArchiveUnarchiveJob.kt */
/* loaded from: classes.dex */
public abstract class DialogArchiveUnarchiveJob extends u4w {
    public final Peer c;
    public final Action d;
    public io.reactivex.rxjava3.disposables.c e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogArchiveUnarchiveJob.kt */
    /* loaded from: classes2.dex */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action ARCHIVE;
        public static final Action UNARCHIVE;
        private final boolean archivedState;
        private final String method;

        static {
            Action action = new Action("ARCHIVE", 0, "messages.archiveConversation", true);
            ARCHIVE = action;
            Action action2 = new Action("UNARCHIVE", 1, "messages.unarchiveConversation", false);
            UNARCHIVE = action2;
            Action[] actionArr = {action, action2};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        public Action(String str, int i, String str2, boolean z) {
            this.method = str2;
            this.archivedState = z;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }

        public final boolean h() {
            return this.archivedState;
        }

        public final String i() {
            return this.method;
        }
    }

    /* compiled from: DialogArchiveUnarchiveJob.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Action.values().length];
            try {
                iArr[Action.ARCHIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Action.UNARCHIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DialogArchiveUnarchiveJob(Peer peer, Action action) {
        this.c = peer;
        this.d = action;
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        boolean z = th instanceof VKApiExecutionException;
        Action action = this.d;
        if (z) {
            VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
            boolean z2 = vKApiExecutionException.s() == 964 && action == Action.ARCHIVE;
            if ((vKApiExecutionException.s() == 965 && action == Action.UNARCHIVE) || z2) {
                return;
            }
        }
        Peer peer = this.c;
        long j = peer.b;
        Action action2 = Action.ARCHIVE;
        if (action == action2) {
            action2 = Action.UNARCHIVE;
        }
        w2wVar.b1(this, new b(j, action2));
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        this.e = null;
        w2wVar.S0().u(this, OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
        w2wVar.e1(this, new d480(this, peer, th));
        w2wVar.e1(this, new r680(this, Collections.singleton(b5w.a.b(peer.b))));
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        sxp r680Var;
        Peer peer = this.c;
        long j = peer.b;
        long j2 = peer.b;
        Action action = this.d;
        w2wVar.b1(this, new b(j, action));
        w2wVar.S0().u(this, OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
        int i = a.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            r680Var = new r680(this, Collections.singleton(b5w.a.b(j2)));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            r680Var = new q680(this);
        }
        w2wVar.e1(this, r680Var);
        w2 B0 = q.B0(500L, TimeUnit.MILLISECONDS);
        asu0.a.getClass();
        this.e = B0.r0(asu0.p()).subscribe(new f40(new eo3(action, this, w2wVar, 4), 15));
        ij20.a aVar2 = new ij20.a();
        aVar2.d = bz2.m();
        aVar2.c = action.i();
        aVar2.f.put("peer_id", Long.valueOf(j2).toString());
        aVar2.i = true;
        bz2.h(new ij20(aVar2));
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return sa30.q(this.c.b);
    }
}
