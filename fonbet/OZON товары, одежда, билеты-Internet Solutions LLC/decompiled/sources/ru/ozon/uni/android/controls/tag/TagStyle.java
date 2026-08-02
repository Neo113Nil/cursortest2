package ru.ozon.uni.android.controls.tag;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u001d\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/controls/tag/TagStyle;", "", "enabled", "", "selected", "<init>", "(II)V", "getEnabled", "()I", "getSelected", "Default", "Custom", "Lru/ozon/uni/android/controls/tag/TagStyle$Custom;", "Lru/ozon/uni/android/controls/tag/TagStyle$Default;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class TagStyle {
    private final int enabled;
    private final int selected;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/controls/tag/TagStyle$Custom;", "Lru/ozon/uni/android/controls/tag/TagStyle;", "Lru/ozon/uni/android/controls/tag/CustomTagStyle;", "enabledCustom", "selectedCustom", "<init>", "(Lru/ozon/uni/android/controls/tag/CustomTagStyle;Lru/ozon/uni/android/controls/tag/CustomTagStyle;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/controls/tag/CustomTagStyle;", "getEnabledCustom", "()Lru/ozon/uni/android/controls/tag/CustomTagStyle;", "getSelectedCustom", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Custom extends TagStyle {
        private final CustomTagStyle enabledCustom;
        private final CustomTagStyle selectedCustom;

        public Custom(CustomTagStyle customTagStyle, CustomTagStyle customTagStyle2) {
            super(R$style.TagButtonView_Default, R$style.TagButtonView_Selected, null);
            this.enabledCustom = customTagStyle;
            this.selectedCustom = customTagStyle2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) other;
            return Intrinsics.d(this.enabledCustom, custom.enabledCustom) && Intrinsics.d(this.selectedCustom, custom.selectedCustom);
        }

        public final CustomTagStyle getEnabledCustom() {
            return this.enabledCustom;
        }

        public final CustomTagStyle getSelectedCustom() {
            return this.selectedCustom;
        }

        public int hashCode() {
            CustomTagStyle customTagStyle = this.enabledCustom;
            int hashCode = (customTagStyle == null ? 0 : customTagStyle.hashCode()) * 31;
            CustomTagStyle customTagStyle2 = this.selectedCustom;
            return hashCode + (customTagStyle2 != null ? customTagStyle2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Custom(enabledCustom=" + this.enabledCustom + ", selectedCustom=" + this.selectedCustom + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/android/controls/tag/TagStyle$Default;", "Lru/ozon/uni/android/controls/tag/TagStyle;", "<init>", "()V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default extends TagStyle {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
            super(R$style.TagButtonView_Default, R$style.TagButtonView_Selected, null);
        }
    }

    public /* synthetic */ TagStyle(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12);
    }

    public final int getEnabled() {
        return this.enabled;
    }

    public final int getSelected() {
        return this.selected;
    }

    private TagStyle(int i11, int i12) {
        this.enabled = i11;
        this.selected = i12;
    }
}
