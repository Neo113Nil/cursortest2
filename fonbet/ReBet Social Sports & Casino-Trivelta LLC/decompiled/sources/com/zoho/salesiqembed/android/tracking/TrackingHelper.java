package com.zoho.salesiqembed.android.tracking;

import Ph.AbstractC1459k;
import Ph.P;
import com.zoho.livechat.android.modules.triggers.domain.entities.Trigger;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import com.zoho.salesiqembed.android.tracking.UTSUtil;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;
import org.jetbrains.annotations.NotNull;
import td.C6461a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/zoho/salesiqembed/android/tracking/TrackingHelper;", "", "<init>", "()V", "", "title", "", "updatePageTitle", "(Ljava/lang/String;)V", "actionName", "performCustomAction", "INTELLIGENT_TRIGGER", "Ljava/lang/String;", "INVOKE_JS_API", "LPh/P;", "getAppScope", "()LPh/P;", "appScope", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrackingHelper {

    @NotNull
    public static final TrackingHelper INSTANCE = new TrackingHelper();

    @NotNull
    public static final String INTELLIGENT_TRIGGER = "intelligent_trigger";

    @NotNull
    public static final String INVOKE_JS_API = "invoke_js_api";

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44633n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f44634o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.f44634o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f44634o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44633n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (UTSUtil.isTrackingEnabled()) {
                    UTSUtil.performCustomAction(this.f44634o);
                    if (UTSUtil.hasTriggerBeenRequested()) {
                        Tf.b bVar = Tf.b.f11754a;
                        Rf.a aVar = Rf.a.PerformedCustomAction;
                        Trigger A10 = Tf.b.A(bVar, aVar, this.f44634o, null, 4, null);
                        if (A10 != null) {
                            A10.getAction();
                        }
                        if ((A10 != null ? A10.getParams() : null) != null) {
                            A10.getAction();
                            Trigger.Type type = Trigger.Type.SendChatInvite;
                            if (type == null || A10.getType() == type) {
                                ArrayList<String> allOpenChatIds = LiveChatUtil.getAllOpenChatIds();
                                Intrinsics.checkNotNullExpressionValue(allOpenChatIds, "getAllOpenChatIds(...)");
                                if (!allOpenChatIds.isEmpty()) {
                                    return Unit.INSTANCE;
                                }
                            }
                            Tf.b.K(aVar, LiveChatUtil.getLanguage(), false, this.f44634o, null, null, ZohoSalesIQ.m.a(Uf.j.n()), false, false, 432, null);
                        }
                        if (A10 == null) {
                            String str = this.f44634o;
                            String a10 = ZohoSalesIQ.m.a(Uf.j.n());
                            String language = LiveChatUtil.getLanguage();
                            this.f44633n = 1;
                            if (Tf.b.F(bVar, aVar, str, null, null, a10, language, false, false, false, false, false, this, 1920, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        C5582a K10 = Tf.b.K(Rf.a.PerformedCustomAction, LiveChatUtil.getLanguage(), false, this.f44634o, null, null, ZohoSalesIQ.m.a(Uf.j.n()), true, false, 304, null);
                        String str2 = this.f44634o;
                        if (K10.d()) {
                            UTSUtil.updateBotTriggeredActionsList(TrackingHelper.INVOKE_JS_API, UTSUtil.ActionState.Updated, CollectionsKt.listOf(str2));
                        }
                    }
                } else {
                    Tf.b.K(Rf.a.PerformedCustomAction, LiveChatUtil.getLanguage(), false, this.f44634o, null, null, ZohoSalesIQ.m.a(Uf.j.n()), false, false, 432, null);
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44635n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f44636o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation continuation) {
            super(2, continuation);
            this.f44636o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f44636o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean isEmpty;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44635n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (UTSUtil.isTrackingEnabled()) {
                    UTSUtil.updatePageTitle(this.f44636o);
                } else {
                    Tf.b bVar = Tf.b.f11754a;
                    Rf.a aVar = Rf.a.AccessedAnyPageOnApp;
                    Trigger A10 = Tf.b.A(bVar, aVar, null, null, 6, null);
                    if (A10 != null) {
                        A10.getAction();
                    }
                    if (Trigger.Type.InvokeJSApi != null) {
                        if (A10 != null) {
                            A10.getAction();
                        }
                        Trigger.Type type = Trigger.Type.SendChatInvite;
                        if (type != null) {
                            if ((A10 != null ? A10.getType() : null) != type) {
                                if (A10 != null) {
                                    isEmpty = LiveChatUtil.getAllOpenChatIds().isEmpty();
                                    if (isEmpty) {
                                        String language = LiveChatUtil.getLanguage();
                                        String str = this.f44636o;
                                        this.f44635n = 1;
                                        if (Tf.b.F(bVar, aVar, null, null, null, str, language, false, false, false, false, false, this, 1920, null) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                }
                            }
                        }
                        isEmpty = LiveChatUtil.getAllOpenChatIds().isEmpty();
                        if (isEmpty) {
                        }
                    }
                    isEmpty = true;
                    if (isEmpty) {
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private TrackingHelper() {
    }

    private final P getAppScope() {
        return C6461a.f65810a.e();
    }

    @JvmStatic
    public static final void performCustomAction(@NotNull String actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        AbstractC1459k.d(INSTANCE.getAppScope(), null, null, new a(actionName, null), 3, null);
    }

    @JvmStatic
    public static final void updatePageTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        AbstractC1459k.d(INSTANCE.getAppScope(), null, null, new b(title, null), 3, null);
    }
}
