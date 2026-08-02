package ru.ozon.uni.android.ds.compose.component.selectionControls.checkbox;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u001a\u001bBA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxSize;", "", "Lru/ozon/uni/core/models/UniIconToken;", "selectedIconToken", "indeterminateIconToken", "LZ1/h;", "iconPadding", "margin", "dpSize", "iconSize", "cornerRadius", "<init>", "(Lru/ozon/uni/core/models/UniIconToken;Lru/ozon/uni/core/models/UniIconToken;FFFFF)V", "Lru/ozon/uni/core/models/UniIconToken;", "getSelectedIconToken$uni_release", "()Lru/ozon/uni/core/models/UniIconToken;", "getIndeterminateIconToken$uni_release", "F", "getIconPadding-D9Ej5fM$uni_release", "()F", "getMargin-D9Ej5fM$uni_release", "getDpSize-D9Ej5fM$uni_release", "getIconSize-D9Ej5fM$uni_release", "getCornerRadius-D9Ej5fM$uni_release", "innerSize", "getInnerSize-D9Ej5fM$uni_release", "Size500", "Size600", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxSize$Size500;", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxSize$Size600;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DsCheckboxSize {
    private final float cornerRadius;
    private final float dpSize;
    private final float iconPadding;
    private final float iconSize;

    @NotNull
    private final UniIconToken indeterminateIconToken;
    private final float innerSize;
    private final float margin;

    @NotNull
    private final UniIconToken selectedIconToken;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxSize$Size500;", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxSize;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Size500 extends DsCheckboxSize {

        @NotNull
        public static final Size500 INSTANCE = new Size500();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Size500() {
            super(r3, r4, r0.m1847getDp2D9Ej5fM(), r0.m1847getDp2D9Ej5fM(), r0.m1850getDp24D9Ej5fM(), r0.m1845getDp16D9Ej5fM(), r0.m1859getDp6D9Ej5fM(), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
            UniIconToken ic_s_check_filled = uniTheme.getIconTokens().getIc_s_check_filled();
            UniIconToken ic_s_dash_filled = uniTheme.getIconTokens().getIc_s_dash_filled();
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Size500);
        }

        public int hashCode() {
            return 665128674;
        }

        @NotNull
        public String toString() {
            return "Size500";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxSize$Size600;", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxSize;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Size600 extends DsCheckboxSize {

        @NotNull
        public static final Size600 INSTANCE = new Size600();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Size600() {
            super(r3, r4, r0.m1839getDp1D9Ej5fM(), r0.m1852getDp3D9Ej5fM(), r0.m1853getDp32D9Ej5fM(), r0.m1850getDp24D9Ej5fM(), r0.m1861getDp8D9Ej5fM(), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
            UniIconToken ic_m_check_filled = uniTheme.getIconTokens().getIc_m_check_filled();
            UniIconToken ic_m_dash_filled = uniTheme.getIconTokens().getIc_m_dash_filled();
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Size600);
        }

        public int hashCode() {
            return 665129635;
        }

        @NotNull
        public String toString() {
            return "Size600";
        }
    }

    public /* synthetic */ DsCheckboxSize(UniIconToken uniIconToken, UniIconToken uniIconToken2, float f7, float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(uniIconToken, uniIconToken2, f7, f11, f12, f13, f14);
    }

    /* renamed from: getCornerRadius-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
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
    /* renamed from: getIndeterminateIconToken$uni_release, reason: from getter */
    public final UniIconToken getIndeterminateIconToken() {
        return this.indeterminateIconToken;
    }

    /* renamed from: getInnerSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getInnerSize() {
        return this.innerSize;
    }

    /* renamed from: getMargin-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getMargin() {
        return this.margin;
    }

    @NotNull
    /* renamed from: getSelectedIconToken$uni_release, reason: from getter */
    public final UniIconToken getSelectedIconToken() {
        return this.selectedIconToken;
    }

    private DsCheckboxSize(UniIconToken uniIconToken, UniIconToken uniIconToken2, float f7, float f11, float f12, float f13, float f14) {
        this.selectedIconToken = uniIconToken;
        this.indeterminateIconToken = uniIconToken2;
        this.iconPadding = f7;
        this.margin = f11;
        this.dpSize = f12;
        this.iconSize = f13;
        this.cornerRadius = f14;
        this.innerSize = f12 - (f11 * 2);
    }
}
