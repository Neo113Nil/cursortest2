package androidx.car.app.messaging.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.messaging.model.ConversationCallbackDelegateImpl;
import androidx.car.app.messaging.model.IConversationCallback;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;
import xsna.grj;
import xsna.hrj;
import xsna.q580;

/* loaded from: classes11.dex */
class ConversationCallbackDelegateImpl implements hrj {

    @Nullable
    private final IConversationCallback mConversationCallbackBinder;

    public static class ConversationCallbackStub extends IConversationCallback.Stub {

        @NonNull
        private final grj mConversationCallback;

        public ConversationCallbackStub(@NonNull grj grjVar) {
            this.mConversationCallback = grjVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onMarkAsRead$0() throws BundlerException {
            this.mConversationCallback.getClass();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onTextReply$1(String str) throws BundlerException {
            this.mConversationCallback.getClass();
            return null;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onMarkAsRead(@NonNull IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onMarkAsRead", new RemoteUtils.a() { // from class: androidx.car.app.messaging.model.b
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onMarkAsRead$0;
                    lambda$onMarkAsRead$0 = ConversationCallbackDelegateImpl.ConversationCallbackStub.this.lambda$onMarkAsRead$0();
                    return lambda$onMarkAsRead$0;
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(@NonNull IOnDoneCallback iOnDoneCallback, @NonNull final String str) {
            RemoteUtils.b(iOnDoneCallback, "onReply", new RemoteUtils.a() { // from class: androidx.car.app.messaging.model.a
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onTextReply$1;
                    lambda$onTextReply$1 = ConversationCallbackDelegateImpl.ConversationCallbackStub.this.lambda$onTextReply$1(str);
                    return lambda$onTextReply$1;
                }
            });
        }
    }

    public ConversationCallbackDelegateImpl(@NonNull grj grjVar) {
        this.mConversationCallbackBinder = new ConversationCallbackStub(grjVar);
    }

    public void sendMarkAsRead(@NonNull q580 q580Var) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onMarkAsRead(RemoteUtils.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendTextReply(@NonNull String str, @NonNull q580 q580Var) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onTextReply(RemoteUtils.a(), str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }
}
