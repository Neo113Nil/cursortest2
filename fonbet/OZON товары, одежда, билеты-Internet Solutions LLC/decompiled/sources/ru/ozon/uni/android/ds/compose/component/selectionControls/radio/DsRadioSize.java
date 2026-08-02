package ru.ozon.uni.android.ds.compose.component.selectionControls.radio;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/selectionControls/radio/DsRadioSize;", "", "Lru/ozon/uni/core/models/UniIconToken;", "iconToken", "LZ1/h;", "iconPadding", "margin", "dpSize", "iconSize", "<init>", "(Lru/ozon/uni/core/models/UniIconToken;FFFF)V", "Lru/ozon/uni/core/models/UniIconToken;", "getIconToken$uni_release", "()Lru/ozon/uni/core/models/UniIconToken;", "F", "getIconPadding-D9Ej5fM$uni_release", "()F", "getMargin-D9Ej5fM$uni_release", "getDpSize-D9Ej5fM$uni_release", "getIconSize-D9Ej5fM$uni_release", "innerSize", "getInnerSize-D9Ej5fM$uni_release", "Size500", "Size600", "Lru/ozon/uni/android/ds/compose/component/selectionControls/radio/DsRadioSize$Size500;", "Lru/ozon/uni/android/ds/compose/component/selectionControls/radio/DsRadioSize$Size600;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class DsRadioSize {
    private final float dpSize;
    private final float iconPadding;
    private final float iconSize;

    @NotNull
    private final UniIconToken iconToken;
    private final float innerSize;
    private final float margin;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/selectionControls/radio/DsRadioSize$Size500;", "Lru/ozon/uni/android/ds/compose/component/selectionControls/radio/DsRadioSize;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Size500 extends DsRadioSize {

        @NotNull
        public static final Size500 INSTANCE = new Size500();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Size500() {
            super(r2, r0.m1847getDp2D9Ej5fM(), r0.m1847getDp2D9Ej5fM(), r0.m1850getDp24D9Ej5fM(), r0.m1845getDp16D9Ej5fM(), null);
            UniIconToken ic_s_radio_dot_filled = UniTheme.INSTANCE.getIconTokens().getIc_s_radio_dot_filled();
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Size500);
        }

        public int hashCode() {
            return 921630814;
        }

        @NotNull
        public String toString() {
            return "Size500";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/selectionControls/radio/DsRadioSize$Size600;", "Lru/ozon/uni/android/ds/compose/component/selectionControls/radio/DsRadioSize;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class Size600 extends DsRadioSize {

        @NotNull
        public static final Size600 INSTANCE = new Size600();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Size600() {
            super(r2, r0.m1839getDp1D9Ej5fM(), r0.m1852getDp3D9Ej5fM(), r0.m1853getDp32D9Ej5fM(), r0.m1850getDp24D9Ej5fM(), null);
            UniIconToken ic_m_radio_dot_filled = UniTheme.INSTANCE.getIconTokens().getIc_m_radio_dot_filled();
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Size600);
        }

        public int hashCode() {
            return 921631775;
        }

        @NotNull
        public String toString() {
            return "Size600";
        }
    }

    public /* synthetic */ DsRadioSize(UniIconToken uniIconToken, float f7, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(uniIconToken, f7, f11, f12, f13);
    }

    /* renamed from: getDpSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getDpSize() {
        return this.dpSize;
    }

    /* renamed from: getIconPadding-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getIconPadding() {
        return this.iconPadding;
    }

    /* renamed from: getIconSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    @NotNull
    /* renamed from: getIconToken$uni_release, reason: from getter */
    public final UniIconToken getIconToken() {
        return this.iconToken;
    }

    /* renamed from: getInnerSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getInnerSize() {
        return this.innerSize;
    }

    /* renamed from: getMargin-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getMargin() {
        return this.margin;
    }

    private DsRadioSize(UniIconToken uniIconToken, float f7, float f11, float f12, float f13) {
        this.iconToken = uniIconToken;
        this.iconPadding = f7;
        this.margin = f11;
        this.dpSize = f12;
        this.iconSize = f13;
        this.innerSize = f12 - (f11 * 2);
    }
}
