package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections;

import Ak.C2436a;
import Kk.C3532b;
import Sh.b;
import TY.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "EmptyState", "State", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO$EmptyState;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO$State;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FiltersSectionVO extends c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull FiltersSectionVO filtersSectionVO) {
            return null;
        }

        public static int getViewItemKey(@NotNull FiltersSectionVO filtersSectionVO) {
            return filtersSectionVO.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO$EmptyState;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmptyState implements FiltersSectionVO {
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

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u00011Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b'\u0010&R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b\u000f\u0010.R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b/\u0010.R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b0\u0010.R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b\u0012\u0010.R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b\u0013\u0010.¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO$State;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "control", "component", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "", "backgroundColor", "", "isSingleSection", "hasTopSeparator", "hasBottomSeparator", "isFirstSection", "isLastSection", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Object;Ljava/lang/Object;LWZ/t;Ljava/lang/String;ZZZZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/Object;", "getControl", "()Ljava/lang/Object;", "getComponent", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Ljava/lang/String;", "getBackgroundColor", "Z", "()Z", "getHasTopSeparator", "getHasBottomSeparator", "ToggleControlVO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class State implements FiltersSectionVO {
        private final String backgroundColor;
        private final Object component;
        private final Object control;
        private final boolean hasBottomSeparator;
        private final boolean hasTopSeparator;
        private final long id;
        private final boolean isFirstSection;
        private final boolean isLastSection;
        private final boolean isSingleSection;
        private final TextDTO title;
        private final t viewEvent;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO$State$ToggleControlVO;", "", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "toggle", "Lru/ozon/uni/atoms/af/AtomAction;", "toggleAction", "Lru/ozon/uni/atoms/data/text/TextDTO;", "label", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "getToggle", "()Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getToggleAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ToggleControlVO {
            public static final int $stable = AtomAction.$stable | ToggleDTO.$stable;
            private final TextDTO label;

            @NotNull
            private final ToggleDTO toggle;
            private final AtomAction toggleAction;

            public ToggleControlVO(@NotNull ToggleDTO toggle, AtomAction atomAction, TextDTO textDTO) {
                Intrinsics.checkNotNullParameter(toggle, "toggle");
                this.toggle = toggle;
                this.toggleAction = atomAction;
                this.label = textDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ToggleControlVO)) {
                    return false;
                }
                ToggleControlVO toggleControlVO = (ToggleControlVO) other;
                return Intrinsics.d(this.toggle, toggleControlVO.toggle) && Intrinsics.d(this.toggleAction, toggleControlVO.toggleAction) && Intrinsics.d(this.label, toggleControlVO.label);
            }

            public final TextDTO getLabel() {
                return this.label;
            }

            @NotNull
            public final ToggleDTO getToggle() {
                return this.toggle;
            }

            public final AtomAction getToggleAction() {
                return this.toggleAction;
            }

            public int hashCode() {
                int hashCode = this.toggle.hashCode() * 31;
                AtomAction atomAction = this.toggleAction;
                int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                TextDTO textDTO = this.label;
                return hashCode2 + (textDTO != null ? textDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                ToggleDTO toggleDTO = this.toggle;
                AtomAction atomAction = this.toggleAction;
                TextDTO textDTO = this.label;
                StringBuilder sb2 = new StringBuilder("ToggleControlVO(toggle=");
                sb2.append(toggleDTO);
                sb2.append(", toggleAction=");
                sb2.append(atomAction);
                sb2.append(", label=");
                return Tl.b.e(sb2, textDTO, ")");
            }
        }

        public State(long j11, TextDTO textDTO, Object obj, Object obj2, t tVar, String str, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            this.id = j11;
            this.title = textDTO;
            this.control = obj;
            this.component = obj2;
            this.viewEvent = tVar;
            this.backgroundColor = str;
            this.isSingleSection = z11;
            this.hasTopSeparator = z12;
            this.hasBottomSeparator = z13;
            this.isFirstSection = z14;
            this.isLastSection = z15;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return this.id == state.id && Intrinsics.d(this.title, state.title) && Intrinsics.d(this.control, state.control) && Intrinsics.d(this.component, state.component) && Intrinsics.d(this.viewEvent, state.viewEvent) && Intrinsics.d(this.backgroundColor, state.backgroundColor) && this.isSingleSection == state.isSingleSection && this.hasTopSeparator == state.hasTopSeparator && this.hasBottomSeparator == state.hasBottomSeparator && this.isFirstSection == state.isFirstSection && this.isLastSection == state.isLastSection;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Object getComponent() {
            return this.component;
        }

        public final Object getControl() {
            return this.control;
        }

        public final boolean getHasBottomSeparator() {
            return this.hasBottomSeparator;
        }

        public final boolean getHasTopSeparator() {
            return this.hasTopSeparator;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getViewEvent() {
            return this.viewEvent;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            TextDTO textDTO = this.title;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            Object obj = this.control;
            int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.component;
            int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            t tVar = this.viewEvent;
            int hashCode5 = (hashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            String str = this.backgroundColor;
            return Boolean.hashCode(this.isLastSection) + C3532b.a(C3532b.a(C3532b.a(C3532b.a((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.isSingleSection), 31, this.hasTopSeparator), 31, this.hasBottomSeparator), 31, this.isFirstSection);
        }

        /* renamed from: isFirstSection, reason: from getter */
        public final boolean getIsFirstSection() {
            return this.isFirstSection;
        }

        /* renamed from: isLastSection, reason: from getter */
        public final boolean getIsLastSection() {
            return this.isLastSection;
        }

        /* renamed from: isSingleSection, reason: from getter */
        public final boolean getIsSingleSection() {
            return this.isSingleSection;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextDTO textDTO = this.title;
            Object obj = this.control;
            Object obj2 = this.component;
            t tVar = this.viewEvent;
            String str = this.backgroundColor;
            boolean z11 = this.isSingleSection;
            boolean z12 = this.hasTopSeparator;
            boolean z13 = this.hasBottomSeparator;
            boolean z14 = this.isFirstSection;
            boolean z15 = this.isLastSection;
            StringBuilder b11 = a.b("State(id=", j11, ", title=", textDTO);
            b11.append(", control=");
            b11.append(obj);
            b11.append(", component=");
            b11.append(obj2);
            b11.append(", viewEvent=");
            b11.append(tVar);
            b11.append(", backgroundColor=");
            b11.append(str);
            C2436a.e(", isSingleSection=", ", hasTopSeparator=", b11, z11, z12);
            C2436a.e(", hasBottomSeparator=", ", isFirstSection=", b11, z13, z14);
            return Bi.b.f(b11, ", isLastSection=", z15, ")");
        }
    }
}
