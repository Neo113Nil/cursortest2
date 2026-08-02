package ru.ozon.app.android.scanit.scanit;

import B0.A0;
import B90.C2618u;
import Bc.i;
import T7.E;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.permission.extension.PermissionExtensionsKt;
import ru.ozon.app.android.scanit.scanit.domain.ScanItRequest;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/scanit/scanit/ScanItViewModel;", "Landroidx/lifecycle/w0;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/scanit/scanit/ScanItApi;", "restApi", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/scanit/scanit/ScanItApi;)V", "", "barcode", "", "requestDeeplinkByBarcode", "(Ljava/lang/String;)V", "checkPermissions", "()V", "markTutorialAsShown", "Landroid/content/Context;", "Lru/ozon/app/android/scanit/scanit/ScanItApi;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action;", "liveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroid/content/SharedPreferences;", "prefs", "Landroid/content/SharedPreferences;", "Companion", "Action", "scanit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScanItViewModel extends w0 {

    @NotNull
    private final Context context;

    @NotNull
    private final SingleLiveEvent<Action> liveData;

    @NotNull
    private final SharedPreferences prefs;

    @NotNull
    private final ScanItApi restApi;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action;", "", "<init>", "()V", "Progress", "ShowTutorial", "PermissionsGranted", "Success", "Error", "Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action$Error;", "Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action$PermissionsGranted;", "Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action$Progress;", "Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action$ShowTutorial;", "Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action$Success;", "scanit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action$Error;", "Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action;", "", "message", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMessage", "scanit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {
            private final int message;

            public Error(int i11) {
                super(null);
                this.message = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && this.message == ((Error) other).message;
            }

            public final int getMessage() {
                return this.message;
            }

            public int hashCode() {
                return Integer.hashCode(this.message);
            }

            @NotNull
            public String toString() {
                return E.a(this.message, "Error(message=", ")");
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action$PermissionsGranted;", "Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action;", "", "permissionsGranted", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getPermissionsGranted", "()Z", "scanit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PermissionsGranted extends Action {
            private final boolean permissionsGranted;

            public PermissionsGranted(boolean z11) {
                super(null);
                this.permissionsGranted = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PermissionsGranted) && this.permissionsGranted == ((PermissionsGranted) other).permissionsGranted;
            }

            public final boolean getPermissionsGranted() {
                return this.permissionsGranted;
            }

            public int hashCode() {
                return Boolean.hashCode(this.permissionsGranted);
            }

            @NotNull
            public String toString() {
                return C2618u.g("PermissionsGranted(permissionsGranted=", ")", this.permissionsGranted);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action$Progress;", "Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action;", "<init>", "()V", "scanit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Progress extends Action {

            @NotNull
            public static final Progress INSTANCE = new Progress();

            private Progress() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action$ShowTutorial;", "Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action;", "", "show", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShow", "()Z", "scanit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowTutorial extends Action {
            private final boolean show;

            public ShowTutorial(boolean z11) {
                super(null);
                this.show = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowTutorial) && this.show == ((ShowTutorial) other).show;
            }

            public final boolean getShow() {
                return this.show;
            }

            public int hashCode() {
                return Boolean.hashCode(this.show);
            }

            @NotNull
            public String toString() {
                return C2618u.g("ShowTutorial(show=", ")", this.show);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action$Success;", "Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "scanit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends Action {

            @NotNull
            private final String deeplink;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull String deeplink) {
                super(null);
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.deeplink = deeplink;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.deeplink, ((Success) other).deeplink);
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
                return A0.b("Success(deeplink=", this.deeplink, ")");
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public ScanItViewModel(@NotNull Context context, @NotNull ScanItApi restApi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(restApi, "restApi");
        this.context = context;
        this.restApi = restApi;
        SingleLiveEvent<Action> singleLiveEvent = new SingleLiveEvent<>();
        this.liveData = singleLiveEvent;
        SharedPreferences sharedPreferences = context.getSharedPreferences("scan_it_prefs", 0);
        singleLiveEvent.setValue(new Action.ShowTutorial(sharedPreferences.getBoolean("scan_it_shown", false)));
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "also(...)");
        this.prefs = sharedPreferences;
    }

    public final void checkPermissions() {
        this.liveData.setValue(new Action.PermissionsGranted(PermissionExtensionsKt.isPermissionGranted(this.context, "android.permission.CAMERA")));
    }

    @NotNull
    public final SingleLiveEvent<Action> getLiveData() {
        return this.liveData;
    }

    public final void markTutorialAsShown() {
        this.prefs.edit().putBoolean("scan_it_shown", true).apply();
    }

    public final void requestDeeplinkByBarcode(@NotNull String barcode) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b h11 = new i(this.restApi.scanIt(new ScanItRequest(barcode)).j(Mc.a.b()).g(C8125a.a()), new GH.a(ScanItViewModel$requestDeeplinkByBarcode$1.INSTANCE, 0)).h(new DM.i(new ScanItViewModel$requestDeeplinkByBarcode$2(this), 2), new GH.b(new ScanItViewModel$requestDeeplinkByBarcode$3(this), 0));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }
}
