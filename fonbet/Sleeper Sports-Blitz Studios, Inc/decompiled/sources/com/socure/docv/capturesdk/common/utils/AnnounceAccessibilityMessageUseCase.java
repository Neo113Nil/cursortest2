package com.socure.docv.capturesdk.common.utils;

import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: AnnounceAccessibilityMessageUseCase.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ+\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", "", "()V", "_lastAnnouncementTimestamp", "", "lastAnnouncementTimestamp", "getLastAnnouncementTimestamp", "()J", "cleanup", "", "invoke", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "message", "", "interrupt", "", "(Landroid/view/View;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isViewVisible", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AnnounceAccessibilityMessageUseCase {
    private long _lastAnnouncementTimestamp;

    public final void cleanup() {
    }

    /* renamed from: getLastAnnouncementTimestamp, reason: from getter */
    public final long get_lastAnnouncementTimestamp() {
        return this._lastAnnouncementTimestamp;
    }

    public static /* synthetic */ Object invoke$default(AnnounceAccessibilityMessageUseCase announceAccessibilityMessageUseCase, View view, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return announceAccessibilityMessageUseCase.invoke(view, str, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(View view, String str, boolean z, Continuation<? super Unit> continuation) {
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            AnnounceAccessibilityMessageUseCase announceAccessibilityMessageUseCase = this;
            LoggerKt.logDetailed("AnnounceAccessibilityMessageUseCase", "AnnounceAccessibilityMessageUseCase called with message: " + str + ", interrupt: " + z);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        if (System.currentTimeMillis() - this._lastAnnouncementTimestamp <= 3000 && !z) {
            LoggerKt.logDetailed("AnnounceAccessibilityMessageUseCase", "announcement skipped - " + str);
            m13470constructorimpl = Result.m13470constructorimpl(Unit.INSTANCE);
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                LoggerKt.logE("AnnounceAccessibilityMessageUseCase", "Error announcing accessibility message", m13473exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
        if (isViewVisible(view)) {
            LoggerKt.logDetailed("AnnounceAccessibilityMessageUseCase", "Announcing message: " + str);
            view.announceForAccessibility(str);
            this._lastAnnouncementTimestamp = System.currentTimeMillis();
        } else {
            LoggerKt.logDetailed("AnnounceAccessibilityMessageUseCase", "View is not visible, skipping message announcement - " + str);
        }
        m13470constructorimpl = Result.m13470constructorimpl(Unit.INSTANCE);
        m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
        if (m13473exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    private final boolean isViewVisible(View view) {
        boolean isAttachedToWindow = view.isAttachedToWindow();
        boolean z = view.getVisibility() == 0;
        boolean z2 = view.getWindowVisibility() == 0;
        boolean z3 = isAttachedToWindow && z && z2;
        LoggerKt.logDetailed("AnnounceAccessibilityMessageUseCase", "isViewVisible check - attached: " + isAttachedToWindow + ", visible: " + z + ", windowVisible: " + z2 + ", result: " + z3);
        return z3;
    }
}
