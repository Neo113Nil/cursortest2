package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation;

import Ae.InterfaceC2395h;
import B0.A0;
import C.o0;
import G.g;
import N3.C3660k;
import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0002\f\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$ViewIntent;", "viewIntent", "", "onViewIntent", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$ViewIntent;)V", "LAe/h;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent;", "getSingleEvent", "()LAe/h;", "singleEvent", "ViewIntent", "SingleEvent", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AddEdoViewModelV2 {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent;", "", "SuccessRefresh", "ShowLoader", "ShowError", "GetInputAfterButtonClick", "SuccessRedirect", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent$GetInputAfterButtonClick;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent$ShowError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent$ShowLoader;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent$SuccessRedirect;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent$SuccessRefresh;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface SingleEvent {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent$GetInputAfterButtonClick;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent;", "", "actionName", "clientId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionName", "getClientId", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class GetInputAfterButtonClick implements SingleEvent {

            @NotNull
            private final String actionName;

            @NotNull
            private final String clientId;

            public GetInputAfterButtonClick(@NotNull String actionName, @NotNull String clientId) {
                Intrinsics.checkNotNullParameter(actionName, "actionName");
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                this.actionName = actionName;
                this.clientId = clientId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetInputAfterButtonClick)) {
                    return false;
                }
                GetInputAfterButtonClick getInputAfterButtonClick = (GetInputAfterButtonClick) other;
                return Intrinsics.d(this.actionName, getInputAfterButtonClick.actionName) && Intrinsics.d(this.clientId, getInputAfterButtonClick.clientId);
            }

            @NotNull
            public final String getActionName() {
                return this.actionName;
            }

            @NotNull
            public final String getClientId() {
                return this.clientId;
            }

            public int hashCode() {
                return this.clientId.hashCode() + (this.actionName.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("GetInputAfterButtonClick(actionName=", this.actionName, ", clientId=", this.clientId, ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent$ShowError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getErrorMessage", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowError implements SingleEvent {
            private final String errorMessage;

            /* JADX WARN: Multi-variable type inference failed */
            public ShowError() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowError) && Intrinsics.d(this.errorMessage, ((ShowError) other).errorMessage);
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public int hashCode() {
                String str = this.errorMessage;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("ShowError(errorMessage=", this.errorMessage, ")");
            }

            public ShowError(String str) {
                this.errorMessage = str;
            }

            public /* synthetic */ ShowError(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent$ShowLoader;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowLoader implements SingleEvent {

            @NotNull
            public static final ShowLoader INSTANCE = new ShowLoader();

            private ShowLoader() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowLoader);
            }

            public int hashCode() {
                return 272236882;
            }

            @NotNull
            public String toString() {
                return "ShowLoader";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent$SuccessRedirect;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SuccessRedirect implements SingleEvent {

            @NotNull
            private final String deeplink;

            public SuccessRedirect(@NotNull String deeplink) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.deeplink = deeplink;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SuccessRedirect) && Intrinsics.d(this.deeplink, ((SuccessRedirect) other).deeplink);
            }

            @NotNull
            public final String getDeeplink() {
                return this.deeplink;
            }

            public int hashCode() {
                return this.deeplink.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("SuccessRedirect(deeplink=", this.deeplink, ")");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent$SuccessRefresh;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SuccessRefresh implements SingleEvent {

            @NotNull
            public static final SuccessRefresh INSTANCE = new SuccessRefresh();

            private SuccessRefresh() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof SuccessRefresh);
            }

            public int hashCode() {
                return 1438231610;
            }

            @NotNull
            public String toString() {
                return "SuccessRefresh";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$ViewIntent;", "", "OnContinueButtonClick", "AddEdo", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$ViewIntent$AddEdo;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$ViewIntent$OnContinueButtonClick;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ViewIntent {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$ViewIntent$AddEdo;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$ViewIntent;", "", "actionName", "clientId", "edoId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionName", "getClientId", "getEdoId", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AddEdo implements ViewIntent {

            @NotNull
            private final String actionName;

            @NotNull
            private final String clientId;

            @NotNull
            private final String edoId;

            public AddEdo(@NotNull String actionName, @NotNull String clientId, @NotNull String edoId) {
                Intrinsics.checkNotNullParameter(actionName, "actionName");
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                Intrinsics.checkNotNullParameter(edoId, "edoId");
                this.actionName = actionName;
                this.clientId = clientId;
                this.edoId = edoId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddEdo)) {
                    return false;
                }
                AddEdo addEdo = (AddEdo) other;
                return Intrinsics.d(this.actionName, addEdo.actionName) && Intrinsics.d(this.clientId, addEdo.clientId) && Intrinsics.d(this.edoId, addEdo.edoId);
            }

            @NotNull
            public final String getActionName() {
                return this.actionName;
            }

            @NotNull
            public final String getClientId() {
                return this.clientId;
            }

            @NotNull
            public final String getEdoId() {
                return this.edoId;
            }

            public int hashCode() {
                return this.edoId.hashCode() + g.a(this.actionName.hashCode() * 31, 31, this.clientId);
            }

            @NotNull
            public String toString() {
                String str = this.actionName;
                String str2 = this.clientId;
                return o0.c(C3660k.d("AddEdo(actionName=", str, ", clientId=", str2, ", edoId="), this.edoId, ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$ViewIntent$OnContinueButtonClick;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$ViewIntent;", "", "actionName", "clientId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionName", "getClientId", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnContinueButtonClick implements ViewIntent {

            @NotNull
            private final String actionName;

            @NotNull
            private final String clientId;

            public OnContinueButtonClick(@NotNull String actionName, @NotNull String clientId) {
                Intrinsics.checkNotNullParameter(actionName, "actionName");
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                this.actionName = actionName;
                this.clientId = clientId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnContinueButtonClick)) {
                    return false;
                }
                OnContinueButtonClick onContinueButtonClick = (OnContinueButtonClick) other;
                return Intrinsics.d(this.actionName, onContinueButtonClick.actionName) && Intrinsics.d(this.clientId, onContinueButtonClick.clientId);
            }

            @NotNull
            public final String getActionName() {
                return this.actionName;
            }

            @NotNull
            public final String getClientId() {
                return this.clientId;
            }

            public int hashCode() {
                return this.clientId.hashCode() + (this.actionName.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("OnContinueButtonClick(actionName=", this.actionName, ", clientId=", this.clientId, ")");
            }
        }
    }

    @NotNull
    InterfaceC2395h<SingleEvent> getSingleEvent();

    void onViewIntent(@NotNull ViewIntent viewIntent);
}
