package ru.ozon.app.android.courieronmap.presentation.viewmodel;

import androidx.lifecycle.P;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.courieronmap.presentation.vo.CourierOnMapVO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\u0010J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel;", "", "Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;", "data", "", "bind", "(Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;)V", "updateLocation", "()V", "onResume", "onPause", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel$Action;", "getAction", "()Landroidx/lifecycle/P;", "action", "Action", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CourierOnMapViewModel {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel$Action;", "", "<init>", "()V", "UpdateWidget", "UpdateCourierInfo", "SendAnalytics", "Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel$Action$SendAnalytics;", "Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel$Action$UpdateCourierInfo;", "Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel$Action$UpdateWidget;", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel$Action$SendAnalytics;", "Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel$Action;", "data", "Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;", "<init>", "(Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;)V", "getData", "()Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SendAnalytics extends Action {

            @NotNull
            private final CourierOnMapVO data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendAnalytics(@NotNull CourierOnMapVO data) {
                super(null);
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
            }

            @NotNull
            public final CourierOnMapVO getData() {
                return this.data;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel$Action$UpdateCourierInfo;", "Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel$Action;", "data", "Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;", "<init>", "(Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;)V", "getData", "()Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UpdateCourierInfo extends Action {

            @NotNull
            private final CourierOnMapVO data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateCourierInfo(@NotNull CourierOnMapVO data) {
                super(null);
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
            }

            @NotNull
            public final CourierOnMapVO getData() {
                return this.data;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel$Action$UpdateWidget;", "Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel$Action;", "<init>", "()V", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UpdateWidget extends Action {

            @NotNull
            public static final UpdateWidget INSTANCE = new UpdateWidget();

            private UpdateWidget() {
                super(null);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    void bind(CourierOnMapVO data);

    @NotNull
    P<Action> getAction();

    void onPause();

    void onResume();

    void updateLocation();
}
