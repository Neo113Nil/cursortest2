package ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import H3.c;
import Nh.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h20.InterfaceC6786a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.network.networkhandler.ConnectionHandler;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.data.TranslateReviewResponse;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001$B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR&\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001c0\u00150\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR)\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001c0\u00150\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/network/networkhandler/ConnectionHandler;", "connectionHandler", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/network/networkhandler/ConnectionHandler;)V", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/data/TranslateReviewResponse;", "response", "", "itemId", "", "handleSuccess", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/data/TranslateReviewResponse;JLkotlin/coroutines/d;)Ljava/lang/Object;", "onCleared", "()V", "", "link", "", "params", "translate", "(Ljava/lang/String;Ljava/util/Map;J)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/network/networkhandler/ConnectionHandler;", "LAe/w0;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel$TranslateState;", "_translateStates", "LAe/w0;", "LAe/B0;", "translateStates", "LAe/B0;", "getTranslateStates", "()LAe/B0;", "TranslateState", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TranslateViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final Ae.w0<Map<Long, TranslateState>> _translateStates;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final ConnectionHandler connectionHandler;

    @NotNull
    private final B0<Map<Long, TranslateState>> translateStates;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel$TranslateState;", "", "<init>", "()V", "Loading", "NetworkError", "Success", "Error", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel$TranslateState$Error;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel$TranslateState$Loading;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel$TranslateState$NetworkError;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel$TranslateState$Success;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TranslateState {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel$TranslateState$Error;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel$TranslateState;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDTO", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends TranslateState {
            public static final int $stable = NotificationDTO.$stable;
            private final NotificationDTO notificationDTO;

            /* JADX WARN: Multi-variable type inference failed */
            public Error() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.d(this.notificationDTO, ((Error) other).notificationDTO);
            }

            public final NotificationDTO getNotificationDTO() {
                return this.notificationDTO;
            }

            public int hashCode() {
                NotificationDTO notificationDTO = this.notificationDTO;
                if (notificationDTO == null) {
                    return 0;
                }
                return notificationDTO.hashCode();
            }

            @NotNull
            public String toString() {
                return a.e("Error(notificationDTO=", ")", this.notificationDTO);
            }

            public Error(NotificationDTO notificationDTO) {
                super(null);
                this.notificationDTO = notificationDTO;
            }

            public /* synthetic */ Error(NotificationDTO notificationDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : notificationDTO);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel$TranslateState$Loading;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel$TranslateState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading extends TranslateState {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -865897627;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel$TranslateState$NetworkError;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel$TranslateState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NetworkError extends TranslateState {

            @NotNull
            public static final NetworkError INSTANCE = new NetworkError();

            private NetworkError() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NetworkError);
            }

            public int hashCode() {
                return 299308017;
            }

            @NotNull
            public String toString() {
                return "NetworkError";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel$TranslateState$Success;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel$TranslateState;", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BodySectionDTO;", "atoms", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAtoms", "()Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends TranslateState {

            @NotNull
            private final List<SingleReviewDTO.BodySectionDTO> atoms;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull List<SingleReviewDTO.BodySectionDTO> atoms) {
                super(null);
                Intrinsics.checkNotNullParameter(atoms, "atoms");
                this.atoms = atoms;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.atoms, ((Success) other).atoms);
            }

            @NotNull
            public final List<SingleReviewDTO.BodySectionDTO> getAtoms() {
                return this.atoms;
            }

            public int hashCode() {
                return this.atoms.hashCode();
            }

            @NotNull
            public String toString() {
                return c.a("Success(atoms=", ")", this.atoms);
            }
        }

        public /* synthetic */ TranslateState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TranslateState() {
        }
    }

    public TranslateViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull ConnectionHandler connectionHandler) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(connectionHandler, "connectionHandler");
        this.actionV2Repository = actionV2Repository;
        this.connectionHandler = connectionHandler;
        C0 b11 = E0.b(0, 0, null, 7);
        this._translateStates = b11;
        this.translateStates = C2399j.a(b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSuccess(TranslateReviewResponse translateReviewResponse, long j11, d<? super Unit> dVar) {
        List<SingleReviewDTO.BodySectionDTO> bodySections = translateReviewResponse.getBodySections();
        Object emit = this._translateStates.emit(U.i(!bodySections.isEmpty() ? new Pair(new Long(j11), new TranslateState.Success(bodySections)) : new Pair(new Long(j11), new TranslateState.Error(translateReviewResponse.getNotification()))), dVar);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    @NotNull
    public final B0<Map<Long, TranslateState>> getTranslateStates() {
        return this.translateStates;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
    }

    public final void translate(@NotNull String link, @NotNull Map<String, String> params, long itemId) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(params, "params");
        C10727i.c(x0.a(this), null, null, new TranslateViewModel$translate$1(this, itemId, params, link, null), 3);
    }
}
