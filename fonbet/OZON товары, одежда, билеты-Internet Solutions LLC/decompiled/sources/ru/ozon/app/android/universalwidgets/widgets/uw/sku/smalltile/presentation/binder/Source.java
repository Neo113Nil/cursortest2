package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/Source;", "", "MessengerBlock", "ComposerWidget", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/Source$ComposerWidget;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/Source$MessengerBlock;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface Source {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/Source$ComposerWidget;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/Source;", "", "widgetId", "<init>", "(Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getWidgetId", "()Ljava/lang/Long;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ComposerWidget implements Source {
        private final Long widgetId;

        public ComposerWidget(Long l11) {
            this.widgetId = l11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ComposerWidget) && Intrinsics.d(this.widgetId, ((ComposerWidget) other).widgetId);
        }

        public final Long getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            Long l11 = this.widgetId;
            if (l11 == null) {
                return 0;
            }
            return l11.hashCode();
        }

        @NotNull
        public String toString() {
            return "ComposerWidget(widgetId=" + this.widgetId + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/Source$MessengerBlock;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/Source;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MessengerBlock implements Source {

        @NotNull
        public static final MessengerBlock INSTANCE = new MessengerBlock();

        private MessengerBlock() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MessengerBlock);
        }

        public int hashCode() {
            return -1197268277;
        }

        @NotNull
        public String toString() {
            return "MessengerBlock";
        }
    }
}
