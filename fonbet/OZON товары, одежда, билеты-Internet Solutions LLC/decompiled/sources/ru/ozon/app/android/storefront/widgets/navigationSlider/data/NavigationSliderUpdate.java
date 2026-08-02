package ru.ozon.app.android.storefront.widgets.navigationSlider.data;

import A00.a;
import T7.E;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/data/NavigationSliderUpdate;", "LA00/a$J$a;", "<init>", "()V", "UpdateCurrentPage", "Lru/ozon/app/android/storefront/widgets/navigationSlider/data/NavigationSliderUpdate$UpdateCurrentPage;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class NavigationSliderUpdate implements a.J.InterfaceC0007a {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/data/NavigationSliderUpdate$UpdateCurrentPage;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/data/NavigationSliderUpdate;", "", "currentPage", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCurrentPage", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateCurrentPage extends NavigationSliderUpdate {
        private final int currentPage;

        public UpdateCurrentPage(int i11) {
            super(null);
            this.currentPage = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateCurrentPage) && this.currentPage == ((UpdateCurrentPage) other).currentPage;
        }

        public final int getCurrentPage() {
            return this.currentPage;
        }

        public int hashCode() {
            return Integer.hashCode(this.currentPage);
        }

        @NotNull
        public String toString() {
            return E.a(this.currentPage, "UpdateCurrentPage(currentPage=", ")");
        }
    }

    public /* synthetic */ NavigationSliderUpdate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NavigationSliderUpdate() {
    }
}
