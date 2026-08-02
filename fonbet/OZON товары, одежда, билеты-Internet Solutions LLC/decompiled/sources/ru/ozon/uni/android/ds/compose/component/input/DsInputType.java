package ru.ozon.uni.android.ds.compose.component.input;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/input/DsInputType;", "", "Default", "Button", "Lru/ozon/uni/android/ds/compose/component/input/DsInputType$Button;", "Lru/ozon/uni/android/ds/compose/component/input/DsInputType$Default;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DsInputType {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/input/DsInputType$Button;", "Lru/ozon/uni/android/ds/compose/component/input/DsInputType;", "Lkotlin/Function0;", "", "onInputClick", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function0;", "getOnInputClick", "()Lkotlin/jvm/functions/Function0;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button implements DsInputType {
        public static final int $stable = 0;

        @NotNull
        private final Function0<Unit> onInputClick;

        public Button(@NotNull Function0<Unit> onInputClick) {
            Intrinsics.checkNotNullParameter(onInputClick, "onInputClick");
            this.onInputClick = onInputClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Button) && Intrinsics.d(this.onInputClick, ((Button) other).onInputClick);
        }

        @NotNull
        public final Function0<Unit> getOnInputClick() {
            return this.onInputClick;
        }

        public int hashCode() {
            return this.onInputClick.hashCode();
        }

        @NotNull
        public String toString() {
            return "Button(onInputClick=" + this.onInputClick + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/input/DsInputType$Default;", "Lru/ozon/uni/android/ds/compose/component/input/DsInputType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Default implements DsInputType {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Default);
        }

        public int hashCode() {
            return -1518756818;
        }

        @NotNull
        public String toString() {
            return "Default";
        }
    }
}
