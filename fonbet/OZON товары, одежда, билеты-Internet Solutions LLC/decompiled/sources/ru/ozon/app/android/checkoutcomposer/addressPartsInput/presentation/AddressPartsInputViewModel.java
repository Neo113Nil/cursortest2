package ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation;

import B90.C2618u;
import D40.a;
import DM.f;
import DM.g;
import Kk.c;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.data.AddressPartsInputRepository;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 &2\u00020\u0001:\u0003&'(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\"\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0 8F¢\u0006\u0006\u001a\u0004\b$\u0010\"¨\u0006)"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/AddressPartsInputRepository;", "addressPartsInputRepository", "<init>", "(Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/AddressPartsInputRepository;)V", "", "link", "", "dismiss", "", "saveAddressParts", "(Ljava/lang/String;Z)V", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/AddressPartsInputRepository;", "fieldName", "Ljava/lang/String;", "getFieldName", "()Ljava/lang/String;", "setFieldName", "(Ljava/lang/String;)V", "input", "getInput", "setInput", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$State;", "mutableState", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$WidgetState;", "mutableWidgetState", "Lnc/b;", "disposable", "Lnc/b;", "Landroidx/lifecycle/P;", "getState", "()Landroidx/lifecycle/P;", "state", "getWidgetState", "widgetState", "Companion", "State", "WidgetState", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressPartsInputViewModel extends w0 {

    @NotNull
    private final AddressPartsInputRepository addressPartsInputRepository;
    private InterfaceC8487b disposable;

    @NotNull
    private String fieldName;

    @NotNull
    private String input;

    @NotNull
    private final SingleLiveEvent<State> mutableState;

    @NotNull
    private final SingleLiveEvent<WidgetState> mutableWidgetState;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$State;", "", "Action", "Error", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$State$Action;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$State$Error;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$State$Action;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$State;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Action implements State {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction action;

            public Action(@NotNull AtomAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Action) && Intrinsics.d(this.action, ((Action) other).action);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("Action(action=", ")", this.action);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$State$Error;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$State;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements State {

            @NotNull
            private final Throwable error;

            public Error(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.d(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @NotNull
            public String toString() {
                return a.c("Error(error=", ")", this.error);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$WidgetState;", "", "Dismiss", "Loading", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$WidgetState$Dismiss;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$WidgetState$Loading;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface WidgetState {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$WidgetState$Dismiss;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$WidgetState;", "<init>", "()V", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Dismiss implements WidgetState {

            @NotNull
            public static final Dismiss INSTANCE = new Dismiss();

            private Dismiss() {
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$WidgetState$Loading;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$WidgetState;", "", "isLoading", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading implements WidgetState {
            private final boolean isLoading;

            public Loading(boolean z11) {
                this.isLoading = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && this.isLoading == ((Loading) other).isLoading;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isLoading);
            }

            /* renamed from: isLoading, reason: from getter */
            public final boolean getIsLoading() {
                return this.isLoading;
            }

            @NotNull
            public String toString() {
                return C2618u.g("Loading(isLoading=", ")", this.isLoading);
            }
        }
    }

    public AddressPartsInputViewModel(@NotNull AddressPartsInputRepository addressPartsInputRepository) {
        Intrinsics.checkNotNullParameter(addressPartsInputRepository, "addressPartsInputRepository");
        this.addressPartsInputRepository = addressPartsInputRepository;
        this.fieldName = "";
        this.input = "";
        this.mutableState = new SingleLiveEvent<>();
        this.mutableWidgetState = new SingleLiveEvent<>();
    }

    @NotNull
    public final P<State> getState() {
        return this.mutableState;
    }

    @NotNull
    public final P<WidgetState> getWidgetState() {
        return this.mutableWidgetState;
    }

    public final void saveAddressParts(String link, boolean dismiss) {
        List m11;
        this.mutableWidgetState.postValue(new WidgetState.Loading(true));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = "";
        if (link != null && (m11 = h.m(link, new String[]{"?", "&"}, 0, 6)) != null) {
            int i11 = 0;
            for (Object obj : m11) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                String str2 = (String) obj;
                if (i11 == 0) {
                    str = str2;
                } else {
                    List m12 = h.m(str2, new String[]{"="}, 0, 6);
                    linkedHashMap.put(C7714v.K(m12), C7714v.X(m12));
                }
                i11 = i12;
            }
        }
        this.disposable = this.addressPartsInputRepository.updateAddressParts(str, linkedHashMap, this.fieldName, this.input).g(Mc.a.b()).j(C8125a.a()).h(new f(new AddressPartsInputViewModel$saveAddressParts$2(dismiss, this), 3), new g(new AddressPartsInputViewModel$saveAddressParts$3(this), 2));
    }

    public final void setFieldName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fieldName = str;
    }

    public final void setInput(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.input = str;
    }
}
