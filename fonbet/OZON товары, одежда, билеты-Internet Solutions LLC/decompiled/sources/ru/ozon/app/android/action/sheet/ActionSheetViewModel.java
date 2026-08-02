package ru.ozon.app.android.action.sheet;

import androidx.lifecycle.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0018J+\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R&\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00150\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/action/sheet/ActionSheetViewModel;", "", "", "currentPageUrl", "actionPath", "Lru/ozon/app/android/action/sheet/AnalyticsInfo;", "analyticsInfo", "", "bindInitialRemote", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/action/sheet/AnalyticsInfo;)V", "Lru/ozon/app/android/action/sheet/ActionSheetVO;", "actionSheet", "bindInitialLocal", "(Lru/ozon/app/android/action/sheet/ActionSheetVO;)V", "refresh", "()V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/action/sheet/ActionSheetViewModel$ScreenState;", "getScreenState", "()Landroidx/lifecycle/P;", "screenState", "", "getAnalyticIsLoaded", "analyticIsLoaded", "ScreenState", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ActionSheetViewModel {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/action/sheet/ActionSheetViewModel$ScreenState;", "", "<init>", "()V", "Loading", "Failure", "Content", "Lru/ozon/app/android/action/sheet/ActionSheetViewModel$ScreenState$Content;", "Lru/ozon/app/android/action/sheet/ActionSheetViewModel$ScreenState$Failure;", "Lru/ozon/app/android/action/sheet/ActionSheetViewModel$ScreenState$Loading;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ScreenState {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/action/sheet/ActionSheetViewModel$ScreenState$Content;", "Lru/ozon/app/android/action/sheet/ActionSheetViewModel$ScreenState;", "Lru/ozon/app/android/action/sheet/ActionSheetVO;", "actionSheetVO", "<init>", "(Lru/ozon/app/android/action/sheet/ActionSheetVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/action/sheet/ActionSheetVO;", "getActionSheetVO", "()Lru/ozon/app/android/action/sheet/ActionSheetVO;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Content extends ScreenState {

            @NotNull
            private final ActionSheetVO actionSheetVO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Content(@NotNull ActionSheetVO actionSheetVO) {
                super(null);
                Intrinsics.checkNotNullParameter(actionSheetVO, "actionSheetVO");
                this.actionSheetVO = actionSheetVO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Content) && Intrinsics.d(this.actionSheetVO, ((Content) other).actionSheetVO);
            }

            @NotNull
            public final ActionSheetVO getActionSheetVO() {
                return this.actionSheetVO;
            }

            public int hashCode() {
                return this.actionSheetVO.hashCode();
            }

            @NotNull
            public String toString() {
                return "Content(actionSheetVO=" + this.actionSheetVO + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/action/sheet/ActionSheetViewModel$ScreenState$Failure;", "Lru/ozon/app/android/action/sheet/ActionSheetViewModel$ScreenState;", "<init>", "()V", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Failure extends ScreenState {

            @NotNull
            public static final Failure INSTANCE = new Failure();

            private Failure() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/action/sheet/ActionSheetViewModel$ScreenState$Loading;", "Lru/ozon/app/android/action/sheet/ActionSheetViewModel$ScreenState;", "<init>", "()V", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Loading extends ScreenState {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        public /* synthetic */ ScreenState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ScreenState() {
        }
    }

    void bindInitialLocal(@NotNull ActionSheetVO actionSheet);

    void bindInitialRemote(String currentPageUrl, @NotNull String actionPath, AnalyticsInfo analyticsInfo);

    @NotNull
    P<Map<String, String>> getAnalyticIsLoaded();

    @NotNull
    P<ScreenState> getScreenState();

    void refresh();
}
