package ru.ozon.app.android.session.userSocialsMobile.presentation.item;

import Ak.C2436a;
import G.g;
import Nh.a;
import Sh.b;
import androidx.lifecycle.P;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0018\u0019J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel;", "", "", "voId", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;", "confirmationData", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "clickAction", "", "onUnbindButtonClicked", "(JLru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "", "unbindRequestBody", "link", "onUnbindDialogButtonClicked", "(JLjava/lang/String;Ljava/lang/String;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$Action;", "getAction", "()Landroidx/lifecycle/P;", "action", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction;", "getSingleAction", "singleAction", "Action", "SingleAction", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface UserSocialsMobileItemViewModel {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$Action;", "", "voId", "", "<init>", "(J)V", "getVoId", "()J", "ShowLoader", "HideLoader", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$Action$HideLoader;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$Action$ShowLoader;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {
        private final long voId;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$Action$HideLoader;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$Action;", "", "voId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getVoId", "()J", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HideLoader extends Action {
            private final long voId;

            public HideLoader(long j11) {
                super(j11, null);
                this.voId = j11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HideLoader) && this.voId == ((HideLoader) other).voId;
            }

            @Override // ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewModel.Action
            public long getVoId() {
                return this.voId;
            }

            public int hashCode() {
                return Long.hashCode(this.voId);
            }

            @NotNull
            public String toString() {
                return b.b(this.voId, "HideLoader(voId=", ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$Action$ShowLoader;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$Action;", "", "voId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getVoId", "()J", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowLoader extends Action {
            private final long voId;

            public ShowLoader(long j11) {
                super(j11, null);
                this.voId = j11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowLoader) && this.voId == ((ShowLoader) other).voId;
            }

            @Override // ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewModel.Action
            public long getVoId() {
                return this.voId;
            }

            public int hashCode() {
                return Long.hashCode(this.voId);
            }

            @NotNull
            public String toString() {
                return b.b(this.voId, "ShowLoader(voId=", ")");
            }
        }

        public /* synthetic */ Action(long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11);
        }

        public long getVoId() {
            return this.voId;
        }

        private Action(long j11) {
            this.voId = j11;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction;", "", "voId", "", "<init>", "(J)V", "getVoId", "()J", "ShowConfirmationDialog", "ShowSuccessMessage", "ShowErrorMessage", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction$ShowConfirmationDialog;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction$ShowErrorMessage;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction$ShowSuccessMessage;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SingleAction {
        private final long voId;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001d\u0010\f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction$ShowConfirmationDialog;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction;", "", "voId", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;", "confirmationData", "", "link", "unbindRequestBody", "<init>", "(JLru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getVoId", "()J", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;", "getConfirmationData", "()Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;", "Ljava/lang/String;", "getLink", "getUnbindRequestBody", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowConfirmationDialog extends SingleAction {

            @NotNull
            private final UserSocialsMobileItemVO.UnbindButtonVO.ConfirmationDataVO confirmationData;

            @NotNull
            private final String link;

            @NotNull
            private final String unbindRequestBody;
            private final long voId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowConfirmationDialog(long j11, @NotNull UserSocialsMobileItemVO.UnbindButtonVO.ConfirmationDataVO confirmationData, @NotNull String link, @NotNull String unbindRequestBody) {
                super(j11, null);
                Intrinsics.checkNotNullParameter(confirmationData, "confirmationData");
                Intrinsics.checkNotNullParameter(link, "link");
                Intrinsics.checkNotNullParameter(unbindRequestBody, "unbindRequestBody");
                this.voId = j11;
                this.confirmationData = confirmationData;
                this.link = link;
                this.unbindRequestBody = unbindRequestBody;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowConfirmationDialog)) {
                    return false;
                }
                ShowConfirmationDialog showConfirmationDialog = (ShowConfirmationDialog) other;
                return this.voId == showConfirmationDialog.voId && Intrinsics.d(this.confirmationData, showConfirmationDialog.confirmationData) && Intrinsics.d(this.link, showConfirmationDialog.link) && Intrinsics.d(this.unbindRequestBody, showConfirmationDialog.unbindRequestBody);
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final String getUnbindRequestBody() {
                return this.unbindRequestBody;
            }

            @Override // ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewModel.SingleAction
            public long getVoId() {
                return this.voId;
            }

            public int hashCode() {
                return this.unbindRequestBody.hashCode() + g.a((this.confirmationData.hashCode() + (Long.hashCode(this.voId) * 31)) * 31, 31, this.link);
            }

            @NotNull
            public String toString() {
                long j11 = this.voId;
                UserSocialsMobileItemVO.UnbindButtonVO.ConfirmationDataVO confirmationDataVO = this.confirmationData;
                String str = this.link;
                String str2 = this.unbindRequestBody;
                StringBuilder sb2 = new StringBuilder("ShowConfirmationDialog(voId=");
                sb2.append(j11);
                sb2.append(", confirmationData=");
                sb2.append(confirmationDataVO);
                a.h(sb2, ", link=", str, ", unbindRequestBody=", str2);
                sb2.append(")");
                return sb2.toString();
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction$ShowErrorMessage;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction;", "", "voId", "", "throwable", "<init>", "(JLjava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getVoId", "()J", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowErrorMessage extends SingleAction {

            @NotNull
            private final Throwable throwable;
            private final long voId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowErrorMessage(long j11, @NotNull Throwable throwable) {
                super(j11, null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.voId = j11;
                this.throwable = throwable;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowErrorMessage)) {
                    return false;
                }
                ShowErrorMessage showErrorMessage = (ShowErrorMessage) other;
                return this.voId == showErrorMessage.voId && Intrinsics.d(this.throwable, showErrorMessage.throwable);
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @Override // ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewModel.SingleAction
            public long getVoId() {
                return this.voId;
            }

            public int hashCode() {
                return this.throwable.hashCode() + (Long.hashCode(this.voId) * 31);
            }

            @NotNull
            public String toString() {
                return "ShowErrorMessage(voId=" + this.voId + ", throwable=" + this.throwable + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction$ShowSuccessMessage;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction;", "", "voId", "", "message", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getVoId", "()J", "Ljava/lang/String;", "getMessage", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowSuccessMessage extends SingleAction {

            @NotNull
            private final String message;
            private final long voId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowSuccessMessage(long j11, @NotNull String message) {
                super(j11, null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.voId = j11;
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowSuccessMessage)) {
                    return false;
                }
                ShowSuccessMessage showSuccessMessage = (ShowSuccessMessage) other;
                return this.voId == showSuccessMessage.voId && Intrinsics.d(this.message, showSuccessMessage.message);
            }

            @NotNull
            public final String getMessage() {
                return this.message;
            }

            @Override // ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewModel.SingleAction
            public long getVoId() {
                return this.voId;
            }

            public int hashCode() {
                return this.message.hashCode() + (Long.hashCode(this.voId) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder c11 = C2436a.c(this.voId, "ShowSuccessMessage(voId=", ", message=", this.message);
                c11.append(")");
                return c11.toString();
            }
        }

        public /* synthetic */ SingleAction(long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11);
        }

        public long getVoId() {
            return this.voId;
        }

        private SingleAction(long j11) {
            this.voId = j11;
        }
    }

    @NotNull
    P<Action> getAction();

    @NotNull
    P<SingleAction> getSingleAction();

    void onUnbindButtonClicked(long voId, @NotNull UserSocialsMobileItemVO.UnbindButtonVO.ConfirmationDataVO confirmationData, @NotNull AtomAction.Click clickAction);

    void onUnbindDialogButtonClicked(long voId, @NotNull String unbindRequestBody, @NotNull String link);
}
