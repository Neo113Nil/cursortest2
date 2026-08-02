package ru.ozon.app.android.geo.map;

import androidx.lifecycle.P;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.utils.BottomSheetActionParams;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/geo/map/DetailsSheetManager;", "", "Li10/h$c;", "pageRef", "Lru/ozon/app/android/geo/map/utils/BottomSheetActionParams;", "params", "", "show", "(Li10/h$c;Lru/ozon/app/android/geo/map/utils/BottomSheetActionParams;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/geo/map/DetailsSheetManager$Action;", "getAction", "()Landroidx/lifecycle/P;", "action", "Action", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DetailsSheetManager {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/geo/map/DetailsSheetManager$Action;", "", "<init>", "()V", "Open", "Lru/ozon/app/android/geo/map/DetailsSheetManager$Action$Open;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/geo/map/DetailsSheetManager$Action$Open;", "Lru/ozon/app/android/geo/map/DetailsSheetManager$Action;", "Li10/h$c;", "pageRef", "Lru/ozon/app/android/geo/map/utils/BottomSheetActionParams;", "params", "<init>", "(Li10/h$c;Lru/ozon/app/android/geo/map/utils/BottomSheetActionParams;)V", "Li10/h$c;", "getPageRef", "()Li10/h$c;", "Lru/ozon/app/android/geo/map/utils/BottomSheetActionParams;", "getParams", "()Lru/ozon/app/android/geo/map/utils/BottomSheetActionParams;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Open extends Action {

            @NotNull
            private final h.c pageRef;

            @NotNull
            private final BottomSheetActionParams params;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Open(@NotNull h.c pageRef, @NotNull BottomSheetActionParams params) {
                super(null);
                Intrinsics.checkNotNullParameter(pageRef, "pageRef");
                Intrinsics.checkNotNullParameter(params, "params");
                this.pageRef = pageRef;
                this.params = params;
            }

            @NotNull
            public final h.c getPageRef() {
                return this.pageRef;
            }

            @NotNull
            public final BottomSheetActionParams getParams() {
                return this.params;
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @NotNull
    P<Action> getAction();

    void show(@NotNull h.c pageRef, @NotNull BottomSheetActionParams params);
}
