package ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect;

import D40.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ComposerActionAndRedirectState;", "", "<init>", "()V", "Success", "Fail", "Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ComposerActionAndRedirectState$Fail;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ComposerActionAndRedirectState$Success;", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ComposerActionAndRedirectState {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ComposerActionAndRedirectState$Fail;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ComposerActionAndRedirectState;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Fail extends ComposerActionAndRedirectState {

        @NotNull
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fail(@NotNull Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Fail) && Intrinsics.d(this.throwable, ((Fail) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        @NotNull
        public String toString() {
            return a.c("Fail(throwable=", ")", this.throwable);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ComposerActionAndRedirectState$Success;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ComposerActionAndRedirectState;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ResponseRedirectAction;", "action", "<init>", "(Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ResponseRedirectAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ResponseRedirectAction;", "getAction", "()Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ResponseRedirectAction;", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends ComposerActionAndRedirectState {
        private final ResponseRedirectAction action;

        public Success(ResponseRedirectAction responseRedirectAction) {
            super(null);
            this.action = responseRedirectAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.d(this.action, ((Success) other).action);
        }

        public final ResponseRedirectAction getAction() {
            return this.action;
        }

        public int hashCode() {
            ResponseRedirectAction responseRedirectAction = this.action;
            if (responseRedirectAction == null) {
                return 0;
            }
            return responseRedirectAction.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(action=" + this.action + ")";
        }
    }

    public /* synthetic */ ComposerActionAndRedirectState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ComposerActionAndRedirectState() {
    }
}
