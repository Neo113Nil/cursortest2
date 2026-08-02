package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/ViewType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SECTION_TYPE_HEADER", "SECTION_TYPE_TEXT", "SECTION_TYPE_INPUT", "SECTION_TYPE_CELL_ICON", "SECTION_TYPE_CELL_CHECKBOX", "SECTION_TYPE_CELL_CHECKBOX_ICON", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ViewType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int value;
    public static final ViewType SECTION_TYPE_HEADER = new ViewType("SECTION_TYPE_HEADER", 0, 0);
    public static final ViewType SECTION_TYPE_TEXT = new ViewType("SECTION_TYPE_TEXT", 1, 1);
    public static final ViewType SECTION_TYPE_INPUT = new ViewType("SECTION_TYPE_INPUT", 2, 2);
    public static final ViewType SECTION_TYPE_CELL_ICON = new ViewType("SECTION_TYPE_CELL_ICON", 3, 3);
    public static final ViewType SECTION_TYPE_CELL_CHECKBOX = new ViewType("SECTION_TYPE_CELL_CHECKBOX", 4, 4);
    public static final ViewType SECTION_TYPE_CELL_CHECKBOX_ICON = new ViewType("SECTION_TYPE_CELL_CHECKBOX_ICON", 5, 5);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/ViewType$Companion;", "", "<init>", "()V", "valueOf", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/ViewType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ViewType valueOf(int value) {
            for (ViewType viewType : ViewType.values()) {
                if (viewType.getValue() == value) {
                    return viewType;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ViewType[] $values() {
        return new ViewType[]{SECTION_TYPE_HEADER, SECTION_TYPE_TEXT, SECTION_TYPE_INPUT, SECTION_TYPE_CELL_ICON, SECTION_TYPE_CELL_CHECKBOX, SECTION_TYPE_CELL_CHECKBOX_ICON};
    }

    static {
        ViewType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
    }

    private ViewType(String str, int i11, int i12) {
        this.value = i12;
    }

    public static ViewType valueOf(String str) {
        return (ViewType) Enum.valueOf(ViewType.class, str);
    }

    public static ViewType[] values() {
        return (ViewType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
