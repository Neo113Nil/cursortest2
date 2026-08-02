package com.sofascore.results.service;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.sofascore.model.chat.DbChatMessage;
import defpackage.a70;
import defpackage.cs2;
import defpackage.jdb;
import defpackage.lu3;
import defpackage.or2;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sofascore/results/service/ChatMessageWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lcs2;", "chatMessageRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcs2;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessageWorker extends AbstractRetryCoroutineWorker {
    public final cs2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull cs2 cs2Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        cs2Var.getClass();
        this.b = cs2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r0 == r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        if (r0 == r3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        or2 or2Var;
        int i;
        if (rq3Var instanceof or2) {
            or2Var = (or2) rq3Var;
            int i2 = or2Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                or2Var.t = i2 - Integer.MIN_VALUE;
                Object obj = or2Var.r;
                lu3 lu3Var = lu3.a;
                i = or2Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    String e = getInputData().e("ACTION");
                    boolean c = Intrinsics.c(e, "CHAT_VOTE_CAST_ACTION");
                    cs2 cs2Var = this.b;
                    if (c) {
                        int a = getInputData().a("EVENT_ID", -1);
                        long c2 = getInputData().c("MESSAGE_TIMESTAMP", -1L);
                        long c3 = getInputData().c("VOTE_TIMESTAMP", -1L);
                        or2Var.t = 1;
                        Object b = cs2Var.b(new DbChatMessage(a, c2, c3, 0L), or2Var);
                        if (b != lu3Var) {
                            b = Unit.a;
                        }
                    } else if (Intrinsics.c(e, "CHAT_REPORT_CAST_ACTION")) {
                        int a2 = getInputData().a("EVENT_ID", -1);
                        long c4 = getInputData().c("MESSAGE_TIMESTAMP", -1L);
                        long c5 = getInputData().c("REPORT_TIMESTAMP", -1L);
                        or2Var.t = 2;
                        Object a3 = cs2Var.a(new DbChatMessage(a2, c4, 0L, c5), or2Var);
                        if (a3 != lu3Var) {
                            a3 = Unit.a;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return jdb.a();
            }
        }
        or2Var = new or2(this, (sq3) rq3Var);
        Object obj2 = or2Var.r;
        lu3 lu3Var2 = lu3.a;
        i = or2Var.t;
        if (i != 0) {
        }
        return jdb.a();
    }
}
