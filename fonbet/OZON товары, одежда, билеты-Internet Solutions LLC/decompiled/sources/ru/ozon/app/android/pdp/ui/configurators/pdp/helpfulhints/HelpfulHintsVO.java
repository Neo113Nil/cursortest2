package ru.ozon.app.android.pdp.ui.configurators.pdp.helpfulhints;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001eB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "sku", "", "seconds", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "notification", "Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO$NotificationBehavior;", "notificationBehaviour", "<init>", "(JLjava/lang/String;ILru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO$NotificationBehavior;)V", "J", "getId", "()J", "Ljava/lang/String;", "getSku", "()Ljava/lang/String;", "I", "getSeconds", "()I", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO$NotificationBehavior;", "getNotificationBehaviour", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO$NotificationBehavior;", "NotificationBehavior", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HelpfulHintsVO implements c {
    public static final int $stable = NotificationAtom.NotificationWithIcon.$stable;
    private final long id;

    @NotNull
    private final NotificationAtom.NotificationWithIcon notification;

    @NotNull
    private final NotificationBehavior notificationBehaviour;
    private final int seconds;

    @NotNull
    private final String sku;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO$NotificationBehavior;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ADD_TO_FAV", "ADD_TO_CART", "ORDER_DONE_LITE", "CUSTOM", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotificationBehavior {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ NotificationBehavior[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private final String value;
        public static final NotificationBehavior ADD_TO_FAV = new NotificationBehavior("ADD_TO_FAV", 0, "addToFav");
        public static final NotificationBehavior ADD_TO_CART = new NotificationBehavior("ADD_TO_CART", 1, "addToCart");
        public static final NotificationBehavior ORDER_DONE_LITE = new NotificationBehavior("ORDER_DONE_LITE", 2, "orderDone");
        public static final NotificationBehavior CUSTOM = new NotificationBehavior("CUSTOM", 3, "custom");

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO$NotificationBehavior$Companion;", "", "<init>", "()V", "stringToVoBehavior", "Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO$NotificationBehavior;", "notificationBehaviour", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final NotificationBehavior stringToVoBehavior(@NotNull String notificationBehaviour) {
                NotificationBehavior notificationBehavior;
                Intrinsics.checkNotNullParameter(notificationBehaviour, "notificationBehaviour");
                NotificationBehavior[] values = NotificationBehavior.values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        notificationBehavior = null;
                        break;
                    }
                    notificationBehavior = values[i11];
                    if (h.D(notificationBehavior.getValue(), notificationBehaviour, true)) {
                        break;
                    }
                    i11++;
                }
                return notificationBehavior == null ? NotificationBehavior.CUSTOM : notificationBehavior;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ NotificationBehavior[] $values() {
            return new NotificationBehavior[]{ADD_TO_FAV, ADD_TO_CART, ORDER_DONE_LITE, CUSTOM};
        }

        static {
            NotificationBehavior[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
            INSTANCE = new Companion(null);
        }

        private NotificationBehavior(String str, int i11, String str2) {
            this.value = str2;
        }

        public static NotificationBehavior valueOf(String str) {
            return (NotificationBehavior) Enum.valueOf(NotificationBehavior.class, str);
        }

        public static NotificationBehavior[] values() {
            return (NotificationBehavior[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public HelpfulHintsVO(long j11, @NotNull String sku, int i11, @NotNull NotificationAtom.NotificationWithIcon notification, @NotNull NotificationBehavior notificationBehaviour) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(notificationBehaviour, "notificationBehaviour");
        this.id = j11;
        this.sku = sku;
        this.seconds = i11;
        this.notification = notification;
        this.notificationBehaviour = notificationBehaviour;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final NotificationAtom.NotificationWithIcon getNotification() {
        return this.notification;
    }

    @NotNull
    public final NotificationBehavior getNotificationBehaviour() {
        return this.notificationBehaviour;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
