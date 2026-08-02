package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.footer;

import B0.C2454a;
import Sh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "EmptyState", "State", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterVO$EmptyState;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterVO$State;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FiltersFooterVO extends c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull FiltersFooterVO filtersFooterVO) {
            return null;
        }

        public static int getViewItemKey(@NotNull FiltersFooterVO filtersFooterVO) {
            return filtersFooterVO.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterVO$EmptyState;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterVO;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmptyState implements FiltersFooterVO {
        private final long id;

        public EmptyState(long j11) {
            this.id = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EmptyState) && this.id == ((EmptyState) other).id;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            return Long.hashCode(this.id);
        }

        @NotNull
        public String toString() {
            return b.b(this.id, "EmptyState(id=", ")");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\n\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterVO$State;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterVO;", "", "id", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "", "buttonsMargin", "", "isSingleSection", "<init>", "(JLjava/util/List;IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "I", "getButtonsMargin", "Z", "()Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class State implements FiltersFooterVO {
        private final List<ButtonV3DTO> buttons;
        private final int buttonsMargin;
        private final long id;
        private final boolean isSingleSection;

        public State(long j11, List<ButtonV3DTO> list, int i11, boolean z11) {
            this.id = j11;
            this.buttons = list;
            this.buttonsMargin = i11;
            this.isSingleSection = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return this.id == state.id && Intrinsics.d(this.buttons, state.buttons) && this.buttonsMargin == state.buttonsMargin && this.isSingleSection == state.isSingleSection;
        }

        public final List<ButtonV3DTO> getButtons() {
            return this.buttons;
        }

        public final int getButtonsMargin() {
            return this.buttonsMargin;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            List<ButtonV3DTO> list = this.buttons;
            return Boolean.hashCode(this.isSingleSection) + C2454a.a(this.buttonsMargin, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        }

        /* renamed from: isSingleSection, reason: from getter */
        public final boolean getIsSingleSection() {
            return this.isSingleSection;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            List<ButtonV3DTO> list = this.buttons;
            int i11 = this.buttonsMargin;
            boolean z11 = this.isSingleSection;
            StringBuilder b11 = Lh.b.b(j11, "State(id=", ", buttons=", list);
            b11.append(", buttonsMargin=");
            b11.append(i11);
            b11.append(", isSingleSection=");
            b11.append(z11);
            b11.append(")");
            return b11.toString();
        }
    }
}
