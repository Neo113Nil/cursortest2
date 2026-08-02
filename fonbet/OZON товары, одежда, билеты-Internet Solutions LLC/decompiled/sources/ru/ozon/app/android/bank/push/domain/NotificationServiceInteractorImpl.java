package ru.ozon.app.android.bank.push.domain;

import Ib.a;
import Sc.InterfaceC4008j;
import Sc.k;
import com.squareup.moshi.Moshi;
import eh0.c;
import fh0.C6568c;
import h90.k;
import k90.AbstractC7611a;
import k90.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.lib.FintechCoreLib;
import ru.ozon.fintech.notifications.models.NotificationOtpBody;
import ru.ozon.fintech.notifications.models.NotificationSecureBody;
import xe.C10727i;
import xe.J;
import xe.M;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/bank/push/domain/NotificationServiceInteractorImpl;", "Lru/ozon/app/android/bank/push/domain/NotificationServiceInteractor;", "Lru/ozon/app/android/bank/push/domain/NotificationToPushModelMapper;", "notificationMapper", "LIb/a;", "Lru/ozon/fintech/lib/FintechCoreLib;", "fintechCoreLib", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lru/ozon/app/android/bank/push/domain/NotificationToPushModelMapper;LIb/a;Lcom/squareup/moshi/Moshi;)V", "Lfh0/c;", "Lk90/b;", "toFintechRemoteMessage", "(Lfh0/c;)Lk90/b;", "pushModel", "", "shouldInterceptMessage", "(Lfh0/c;)Z", "Leh0/c;", "handleNotificationPushModel", "(Lfh0/c;)Leh0/c;", "Lru/ozon/app/android/bank/push/domain/NotificationToPushModelMapper;", "LIb/a;", "Lcom/squareup/moshi/Moshi;", "Lxe/J;", "coroutineExceptionHandler", "Lxe/J;", "Lxe/M;", "coroutinesScope$delegate", "LSc/j;", "getCoroutinesScope", "()Lxe/M;", "coroutinesScope", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NotificationServiceInteractorImpl implements NotificationServiceInteractor {

    @NotNull
    private final J coroutineExceptionHandler;

    /* renamed from: coroutinesScope$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j coroutinesScope;

    @NotNull
    private final a<FintechCoreLib> fintechCoreLib;

    @NotNull
    private final Moshi moshi;

    @NotNull
    private final NotificationToPushModelMapper notificationMapper;

    public NotificationServiceInteractorImpl(@NotNull NotificationToPushModelMapper notificationMapper, @NotNull a<FintechCoreLib> fintechCoreLib, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(notificationMapper, "notificationMapper");
        Intrinsics.checkNotNullParameter(fintechCoreLib, "fintechCoreLib");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.notificationMapper = notificationMapper;
        this.fintechCoreLib = fintechCoreLib;
        this.moshi = moshi;
        this.coroutineExceptionHandler = new NotificationServiceInteractorImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.coroutinesScope = k.b(new NotificationServiceInteractorImpl$coroutinesScope$2(this));
    }

    private final M getCoroutinesScope() {
        return (M) this.coroutinesScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b toFintechRemoteMessage(C6568c c6568c) {
        return new b(c6568c.m(), c6568c.f());
    }

    @Override // ru.ozon.app.android.bank.push.domain.NotificationServiceInteractor
    @NotNull
    public c handleNotificationPushModel(@NotNull C6568c pushModel) {
        C6568c map;
        Intrinsics.checkNotNullParameter(pushModel, "pushModel");
        k.a aVar = (k.a) C10727i.d(getCoroutinesScope().getCoroutineContext(), new NotificationServiceInteractorImpl$handleNotificationPushModel$notificationData$1(this, pushModel, null));
        if (!aVar.a()) {
            return new c.a(pushModel);
        }
        AbstractC7611a b11 = aVar.b();
        if (b11 != null && (map = this.notificationMapper.map(pushModel, b11)) != null) {
            pushModel = map;
        }
        return new c.b(pushModel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r3.length() != 0) goto L28;
     */
    @Override // ru.ozon.app.android.bank.push.domain.NotificationServiceInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean shouldInterceptMessage(@NotNull C6568c pushModel) {
        NotificationSecureBody notificationSecureBody;
        Intrinsics.checkNotNullParameter(pushModel, "pushModel");
        b remoteMessage = toFintechRemoteMessage(pushModel);
        Moshi moshi = this.moshi;
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        String str = remoteMessage.a().get("extra");
        if (str == null || str.length() == 0 || !h.t(str, "fintech_secure_push_id", false)) {
            NotificationOtpBody notificationOtpBody = null;
            if (str != null) {
                try {
                    notificationSecureBody = (NotificationSecureBody) moshi.c(NotificationSecureBody.class).fromJson(str);
                } catch (Throwable unused) {
                    notificationSecureBody = null;
                }
                if (notificationSecureBody != null) {
                    if (Intrinsics.d(notificationSecureBody.getType(), "finance")) {
                        String id2 = notificationSecureBody.getId();
                        if (id2 != null) {
                        }
                    }
                }
            }
            if (str == null) {
                return false;
            }
            try {
                notificationOtpBody = (NotificationOtpBody) moshi.c(NotificationOtpBody.class).fromJson(str);
            } catch (Throwable unused2) {
            }
            if (notificationOtpBody == null || !Intrinsics.d(notificationOtpBody.getType(), "finance_encrypted")) {
                return false;
            }
        }
        return true;
    }
}
