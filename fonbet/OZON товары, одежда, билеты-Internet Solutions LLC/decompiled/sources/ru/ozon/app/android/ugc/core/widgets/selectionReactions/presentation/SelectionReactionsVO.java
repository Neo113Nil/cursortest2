package ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation;

import B6.b;
import Kk.C3532b;
import Nh.a;
import Ve.C4636t5;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001:\u0003-./BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010Jf\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b(\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b)\u0010\u0014R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsVO;", "reactions", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "", "backgroundColor", "strokeColor", "scrollGradientColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsVO;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LWZ/t;)V", "copy", "(JLru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsVO;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LWZ/t;)Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsVO;", "getReactions", "()Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsVO;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Ljava/lang/String;", "getBackgroundColor", "getStrokeColor", "getScrollGradientColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ReactionsVO", "ReactionsBlockVO", "ReactionsControlVO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectionReactionsVO implements c {
    private final String backgroundColor;
    private final CornerRadius cornerRadius;
    private final long id;

    @NotNull
    private final ReactionsVO reactions;
    private final String scrollGradientColor;
    private final String strokeColor;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;", "", "", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsControlVO;", "controls", "", "buttonsHeight", "<init>", "(Ljava/util/List;I)V", "copy", "(Ljava/util/List;I)Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getControls", "()Ljava/util/List;", "I", "getButtonsHeight", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReactionsBlockVO {
        private final int buttonsHeight;

        @NotNull
        private final List<ReactionsControlVO> controls;

        public ReactionsBlockVO(@NotNull List<ReactionsControlVO> controls, int i11) {
            Intrinsics.checkNotNullParameter(controls, "controls");
            this.controls = controls;
            this.buttonsHeight = i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ReactionsBlockVO copy$default(ReactionsBlockVO reactionsBlockVO, List list, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = reactionsBlockVO.controls;
            }
            if ((i12 & 2) != 0) {
                i11 = reactionsBlockVO.buttonsHeight;
            }
            return reactionsBlockVO.copy(list, i11);
        }

        @NotNull
        public final ReactionsBlockVO copy(@NotNull List<ReactionsControlVO> controls, int buttonsHeight) {
            Intrinsics.checkNotNullParameter(controls, "controls");
            return new ReactionsBlockVO(controls, buttonsHeight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReactionsBlockVO)) {
                return false;
            }
            ReactionsBlockVO reactionsBlockVO = (ReactionsBlockVO) other;
            return Intrinsics.d(this.controls, reactionsBlockVO.controls) && this.buttonsHeight == reactionsBlockVO.buttonsHeight;
        }

        public final int getButtonsHeight() {
            return this.buttonsHeight;
        }

        @NotNull
        public final List<ReactionsControlVO> getControls() {
            return this.controls;
        }

        public int hashCode() {
            return Integer.hashCode(this.buttonsHeight) + (this.controls.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ReactionsBlockVO(controls=" + this.controls + ", buttonsHeight=" + this.buttonsHeight + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001d¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsControlVO;", "", "", "key", "", "isSelected", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "normal", "selected", "Lru/ozon/uni/atoms/af/AtomAction;", "longTapAction", "<init>", "(Ljava/lang/String;ZLru/ozon/uni/atoms/data/controls/button/ButtonsDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "copy", "(Ljava/lang/String;ZLru/ozon/uni/atoms/data/controls/button/ButtonsDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsControlVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Z", "()Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "getNormal", "()Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "getSelected", "Lru/ozon/uni/atoms/af/AtomAction;", "getLongTapAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getDto", "dto", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReactionsControlVO {
        public static final int $stable;
        private final boolean isSelected;

        @NotNull
        private final String key;
        private final AtomAction longTapAction;

        @NotNull
        private final ButtonsDTO normal;
        private final ButtonsDTO selected;

        static {
            int i11 = AtomAction.$stable;
            int i12 = ButtonsDTO.$stable;
            $stable = i11 | i12 | i12;
        }

        public ReactionsControlVO(@NotNull String key, boolean z11, @NotNull ButtonsDTO normal, ButtonsDTO buttonsDTO, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(normal, "normal");
            this.key = key;
            this.isSelected = z11;
            this.normal = normal;
            this.selected = buttonsDTO;
            this.longTapAction = atomAction;
        }

        public static /* synthetic */ ReactionsControlVO copy$default(ReactionsControlVO reactionsControlVO, String str, boolean z11, ButtonsDTO buttonsDTO, ButtonsDTO buttonsDTO2, AtomAction atomAction, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = reactionsControlVO.key;
            }
            if ((i11 & 2) != 0) {
                z11 = reactionsControlVO.isSelected;
            }
            if ((i11 & 4) != 0) {
                buttonsDTO = reactionsControlVO.normal;
            }
            if ((i11 & 8) != 0) {
                buttonsDTO2 = reactionsControlVO.selected;
            }
            if ((i11 & 16) != 0) {
                atomAction = reactionsControlVO.longTapAction;
            }
            AtomAction atomAction2 = atomAction;
            ButtonsDTO buttonsDTO3 = buttonsDTO;
            return reactionsControlVO.copy(str, z11, buttonsDTO3, buttonsDTO2, atomAction2);
        }

        @NotNull
        public final ReactionsControlVO copy(@NotNull String key, boolean isSelected, @NotNull ButtonsDTO normal, ButtonsDTO selected, AtomAction longTapAction) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(normal, "normal");
            return new ReactionsControlVO(key, isSelected, normal, selected, longTapAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReactionsControlVO)) {
                return false;
            }
            ReactionsControlVO reactionsControlVO = (ReactionsControlVO) other;
            return Intrinsics.d(this.key, reactionsControlVO.key) && this.isSelected == reactionsControlVO.isSelected && Intrinsics.d(this.normal, reactionsControlVO.normal) && Intrinsics.d(this.selected, reactionsControlVO.selected) && Intrinsics.d(this.longTapAction, reactionsControlVO.longTapAction);
        }

        @NotNull
        public final ButtonsDTO getDto() {
            ButtonsDTO buttonsDTO = this.selected;
            if (buttonsDTO != null) {
                if (!this.isSelected) {
                    buttonsDTO = null;
                }
                if (buttonsDTO != null) {
                    return buttonsDTO;
                }
            }
            return this.normal;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        public final AtomAction getLongTapAction() {
            return this.longTapAction;
        }

        @NotNull
        public final ButtonsDTO getNormal() {
            return this.normal;
        }

        public int hashCode() {
            int hashCode = (this.normal.hashCode() + C3532b.a(this.key.hashCode() * 31, 31, this.isSelected)) * 31;
            ButtonsDTO buttonsDTO = this.selected;
            int hashCode2 = (hashCode + (buttonsDTO == null ? 0 : buttonsDTO.hashCode())) * 31;
            AtomAction atomAction = this.longTapAction;
            return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.key;
            boolean z11 = this.isSelected;
            ButtonsDTO buttonsDTO = this.normal;
            ButtonsDTO buttonsDTO2 = this.selected;
            AtomAction atomAction = this.longTapAction;
            StringBuilder b11 = C4636t5.b("ReactionsControlVO(key=", str, ", isSelected=", ", normal=", z11);
            b11.append(buttonsDTO);
            b11.append(", selected=");
            b11.append(buttonsDTO2);
            b11.append(", longTapAction=");
            return b.b(b11, atomAction, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsVO;", "", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;", "leftBlock", "rightBlock", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;)V", "copy", "(Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;)Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;", "getLeftBlock", "()Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;", "getRightBlock", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReactionsVO {
        private final ReactionsBlockVO leftBlock;
        private final ReactionsBlockVO rightBlock;

        public ReactionsVO(ReactionsBlockVO reactionsBlockVO, ReactionsBlockVO reactionsBlockVO2) {
            this.leftBlock = reactionsBlockVO;
            this.rightBlock = reactionsBlockVO2;
        }

        @NotNull
        public final ReactionsVO copy(ReactionsBlockVO leftBlock, ReactionsBlockVO rightBlock) {
            return new ReactionsVO(leftBlock, rightBlock);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReactionsVO)) {
                return false;
            }
            ReactionsVO reactionsVO = (ReactionsVO) other;
            return Intrinsics.d(this.leftBlock, reactionsVO.leftBlock) && Intrinsics.d(this.rightBlock, reactionsVO.rightBlock);
        }

        public final ReactionsBlockVO getLeftBlock() {
            return this.leftBlock;
        }

        public final ReactionsBlockVO getRightBlock() {
            return this.rightBlock;
        }

        public int hashCode() {
            ReactionsBlockVO reactionsBlockVO = this.leftBlock;
            int hashCode = (reactionsBlockVO == null ? 0 : reactionsBlockVO.hashCode()) * 31;
            ReactionsBlockVO reactionsBlockVO2 = this.rightBlock;
            return hashCode + (reactionsBlockVO2 != null ? reactionsBlockVO2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ReactionsVO(leftBlock=" + this.leftBlock + ", rightBlock=" + this.rightBlock + ")";
        }
    }

    public SelectionReactionsVO(long j11, @NotNull ReactionsVO reactions, CornerRadius cornerRadius, String str, String str2, String str3, t tVar) {
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        this.id = j11;
        this.reactions = reactions;
        this.cornerRadius = cornerRadius;
        this.backgroundColor = str;
        this.strokeColor = str2;
        this.scrollGradientColor = str3;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ SelectionReactionsVO copy$default(SelectionReactionsVO selectionReactionsVO, long j11, ReactionsVO reactionsVO, CornerRadius cornerRadius, String str, String str2, String str3, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = selectionReactionsVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            reactionsVO = selectionReactionsVO.reactions;
        }
        ReactionsVO reactionsVO2 = reactionsVO;
        if ((i11 & 4) != 0) {
            cornerRadius = selectionReactionsVO.cornerRadius;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        if ((i11 & 8) != 0) {
            str = selectionReactionsVO.backgroundColor;
        }
        String str4 = str;
        if ((i11 & 16) != 0) {
            str2 = selectionReactionsVO.strokeColor;
        }
        return selectionReactionsVO.copy(j12, reactionsVO2, cornerRadius2, str4, str2, (i11 & 32) != 0 ? selectionReactionsVO.scrollGradientColor : str3, (i11 & 64) != 0 ? selectionReactionsVO.tokenizedEvent : tVar);
    }

    @NotNull
    public final SelectionReactionsVO copy(long id2, @NotNull ReactionsVO reactions, CornerRadius cornerRadius, String backgroundColor, String strokeColor, String scrollGradientColor, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        return new SelectionReactionsVO(id2, reactions, cornerRadius, backgroundColor, strokeColor, scrollGradientColor, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionReactionsVO)) {
            return false;
        }
        SelectionReactionsVO selectionReactionsVO = (SelectionReactionsVO) other;
        return this.id == selectionReactionsVO.id && Intrinsics.d(this.reactions, selectionReactionsVO.reactions) && this.cornerRadius == selectionReactionsVO.cornerRadius && Intrinsics.d(this.backgroundColor, selectionReactionsVO.backgroundColor) && Intrinsics.d(this.strokeColor, selectionReactionsVO.strokeColor) && Intrinsics.d(this.scrollGradientColor, selectionReactionsVO.scrollGradientColor) && Intrinsics.d(this.tokenizedEvent, selectionReactionsVO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ReactionsVO getReactions() {
        return this.reactions;
    }

    public final String getScrollGradientColor() {
        return this.scrollGradientColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getStrokeColor() {
        return this.strokeColor;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.reactions.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode2 = (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.strokeColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scrollGradientColor;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode5 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ReactionsVO reactionsVO = this.reactions;
        CornerRadius cornerRadius = this.cornerRadius;
        String str = this.backgroundColor;
        String str2 = this.strokeColor;
        String str3 = this.scrollGradientColor;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("SelectionReactionsVO(id=");
        sb2.append(j11);
        sb2.append(", reactions=");
        sb2.append(reactionsVO);
        sb2.append(", cornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        a.h(sb2, ", strokeColor=", str2, ", scrollGradientColor=", str3);
        return Lh.a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
