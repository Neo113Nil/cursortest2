package ru.ozon.app.android.pdp.ui.configurators.ugc.data;

import Lm0.a;
import Sc.o;
import Sh.b;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import xe.C10727i;
import z00.g;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModel;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ProductReviewRepository;", "productReviewRepository", "<init>", "(Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ProductReviewRepository;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "id", "", "onSuccess", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;J)V", "", "exception", "onFailure", "(Ljava/lang/Throwable;Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;J)V", "", "actionName", "", "params", "proceedComposerAction", "(JLru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ProductReviewRepository;", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action;", "actionLiveData", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "getActionLiveData", "()Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Action", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CallApiViewModelImpl extends w0 implements CallApiViewModel {

    @NotNull
    private final BroadcastSingleLiveEvent<Action> actionLiveData;

    @NotNull
    private final AuthStateStorage authStateStorage;

    @NotNull
    private final ProductReviewRepository productReviewRepository;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action;", "", "id", "", "<init>", "(J)V", "getId", "()J", "Auth", "LocalChange", "Refresh", "Report", "Error", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action$Auth;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action$Error;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action$LocalChange;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action$Refresh;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action$Report;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {
        private final long id;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action$Auth;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Auth extends Action {
            private final long id;

            public Auth(long j11) {
                super(j11, null);
                this.id = j11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Auth) && this.id == ((Auth) other).id;
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModelImpl.Action
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                return Long.hashCode(this.id);
            }

            @NotNull
            public String toString() {
                return b.b(this.id, "Auth(id=", ")");
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0007\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action$Error;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action;", "", "id", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "isNetworkError", "<init>", "(JLru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;", "getActionType", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;", "Z", "()Z", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {

            @NotNull
            private final ActionType actionType;
            private final long id;
            private final boolean isNetworkError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(long j11, @NotNull ActionType actionType, boolean z11) {
                super(j11, null);
                Intrinsics.checkNotNullParameter(actionType, "actionType");
                this.id = j11;
                this.actionType = actionType;
                this.isNetworkError = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return this.id == error.id && this.actionType == error.actionType && this.isNetworkError == error.isNetworkError;
            }

            @NotNull
            public final ActionType getActionType() {
                return this.actionType;
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModelImpl.Action
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isNetworkError) + ((this.actionType.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
            }

            /* renamed from: isNetworkError, reason: from getter */
            public final boolean getIsNetworkError() {
                return this.isNetworkError;
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                ActionType actionType = this.actionType;
                boolean z11 = this.isNetworkError;
                StringBuilder sb2 = new StringBuilder("Error(id=");
                sb2.append(j11);
                sb2.append(", actionType=");
                sb2.append(actionType);
                return Bi.b.f(sb2, ", isNetworkError=", z11, ")");
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action$LocalChange;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action;", "", "id", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "<init>", "(JLru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;", "getActionType", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocalChange extends Action {

            @NotNull
            private final ActionType actionType;
            private final long id;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LocalChange(long j11, @NotNull ActionType actionType) {
                super(j11, null);
                Intrinsics.checkNotNullParameter(actionType, "actionType");
                this.id = j11;
                this.actionType = actionType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LocalChange)) {
                    return false;
                }
                LocalChange localChange = (LocalChange) other;
                return this.id == localChange.id && this.actionType == localChange.actionType;
            }

            @NotNull
            public final ActionType getActionType() {
                return this.actionType;
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModelImpl.Action
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                return this.actionType.hashCode() + (Long.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return "LocalChange(id=" + this.id + ", actionType=" + this.actionType + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action$Refresh;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Refresh extends Action {
            private final long id;

            public Refresh(long j11) {
                super(j11, null);
                this.id = j11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Refresh) && this.id == ((Refresh) other).id;
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModelImpl.Action
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                return Long.hashCode(this.id);
            }

            @NotNull
            public String toString() {
                return b.b(this.id, "Refresh(id=", ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action$Report;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Report extends Action {
            private final long id;

            public Report(long j11) {
                super(j11, null);
                this.id = j11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Report) && this.id == ((Report) other).id;
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModelImpl.Action
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                return Long.hashCode(this.id);
            }

            @NotNull
            public String toString() {
                return b.b(this.id, "Report(id=", ")");
            }
        }

        public /* synthetic */ Action(long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11);
        }

        public long getId() {
            return this.id;
        }

        private Action(long j11) {
            this.id = j11;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                iArr[ActionType.LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionType.DISLIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActionType.VOTE_QUESTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActionType.REFRESH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ActionType.REPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ActionType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CallApiViewModelImpl(@NotNull AuthStateStorage authStateStorage, @NotNull ProductReviewRepository productReviewRepository) {
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        Intrinsics.checkNotNullParameter(productReviewRepository, "productReviewRepository");
        this.authStateStorage = authStateStorage;
        this.productReviewRepository = productReviewRepository;
        this.actionLiveData = new BroadcastSingleLiveEvent<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFailure(Throwable exception, ActionType actionType, long id2) {
        a.f17149a.e(exception);
        getActionLiveData().postValue(new Action.Error(id2, actionType, g.c(exception)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuccess(ActionType actionType, long id2) {
        Unit unit;
        switch (WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                getActionLiveData().setValue(new Action.LocalChange(id2, actionType));
                unit = Unit.f71690a;
                break;
            case 4:
                getActionLiveData().setValue(new Action.Refresh(id2));
                unit = Unit.f71690a;
                break;
            case 5:
                getActionLiveData().setValue(new Action.Report(id2));
                unit = Unit.f71690a;
                break;
            case 6:
                getActionLiveData().setValue(new Action.Error(id2, actionType, false));
                unit = Unit.f71690a;
                break;
            default:
                throw new o();
        }
        WhenExtKt.getExhaustive(unit);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModel
    public void proceedComposerAction(long id2, @NotNull ActionType actionType, @NotNull String actionName, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        if (this.authStateStorage.isAuthenticated()) {
            C10727i.c(x0.a(this), null, null, new CallApiViewModelImpl$proceedComposerAction$1(this, actionName, params, actionType, id2, null), 3);
        } else {
            getActionLiveData().setValue(new Action.Auth(id2));
        }
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModel
    @NotNull
    public BroadcastSingleLiveEvent<Action> getActionLiveData() {
        return this.actionLiveData;
    }
}
