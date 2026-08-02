package ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation;

import Am.C2438a;
import B0.C2454a;
import El.C2971a;
import G.g;
import J0.P;
import Pk0.b;
import TY.a;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b$\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002BCBk\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b7\u0010\u001cR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b8\u0010\u001cR\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010?\u001a\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$PaddingsVO;", "paddings", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$CornersVO;", "cornerRadius", "", "stickyRoundingColor", "tintColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightIconButton", "", "shouldSkipStickyAnimation", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$PaddingsVO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$CornersVO;Ljava/lang/String;Ljava/lang/String;LWZ/t;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$PaddingsVO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$CornersVO;", "getCornerRadius", "()Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$CornersVO;", "Ljava/lang/String;", "getStickyRoundingColor", "getTintColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Z", "getShouldSkipStickyAnimation", "()Z", "PaddingsVO", "CornersVO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FakeSearchVO implements c {

    @NotNull
    private final AtomAction action;

    @NotNull
    private final CornersVO cornerRadius;

    @NotNull
    private final IconDTO icon;
    private final long id;

    @NotNull
    private final PaddingsVO paddings;
    private final IconButtonV3DTO rightIconButton;
    private final boolean shouldSkipStickyAnimation;

    @NotNull
    private final String stickyRoundingColor;
    private final String tintColor;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$CornersVO;", "", "", "top", "bottom", "topSticky", "bottomSticky", "<init>", "(FFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getTop", "()F", "getBottom", "getTopSticky", "getBottomSticky", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CornersVO {
        private final float bottom;
        private final float bottomSticky;
        private final float top;
        private final float topSticky;

        public CornersVO(float f7, float f11, float f12, float f13) {
            this.top = f7;
            this.bottom = f11;
            this.topSticky = f12;
            this.bottomSticky = f13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CornersVO)) {
                return false;
            }
            CornersVO cornersVO = (CornersVO) other;
            return Float.compare(this.top, cornersVO.top) == 0 && Float.compare(this.bottom, cornersVO.bottom) == 0 && Float.compare(this.topSticky, cornersVO.topSticky) == 0 && Float.compare(this.bottomSticky, cornersVO.bottomSticky) == 0;
        }

        public final float getBottom() {
            return this.bottom;
        }

        public final float getBottomSticky() {
            return this.bottomSticky;
        }

        public final float getTop() {
            return this.top;
        }

        public final float getTopSticky() {
            return this.topSticky;
        }

        public int hashCode() {
            return Float.hashCode(this.bottomSticky) + b.a(this.topSticky, b.a(this.bottom, Float.hashCode(this.top) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "CornersVO(top=" + this.top + ", bottom=" + this.bottom + ", topSticky=" + this.topSticky + ", bottomSticky=" + this.bottomSticky + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$PaddingsVO;", "", "", "top", "bottom", "horizontal", "horizontalSticky", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getHorizontal", "getHorizontalSticky", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsVO {
        private final int bottom;
        private final int horizontal;
        private final int horizontalSticky;
        private final int top;

        public PaddingsVO(int i11, int i12, int i13, int i14) {
            this.top = i11;
            this.bottom = i12;
            this.horizontal = i13;
            this.horizontalSticky = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsVO)) {
                return false;
            }
            PaddingsVO paddingsVO = (PaddingsVO) other;
            return this.top == paddingsVO.top && this.bottom == paddingsVO.bottom && this.horizontal == paddingsVO.horizontal && this.horizontalSticky == paddingsVO.horizontalSticky;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getHorizontal() {
            return this.horizontal;
        }

        public final int getHorizontalSticky() {
            return this.horizontalSticky;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.horizontalSticky) + C2454a.a(this.horizontal, C2454a.a(this.bottom, Integer.hashCode(this.top) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.horizontal, this.horizontalSticky, ", horizontalSticky=", ")", C2438a.a("PaddingsVO(top=", this.top, ", bottom=", ", horizontal=", this.bottom));
        }
    }

    public FakeSearchVO(long j11, @NotNull TextDTO title, @NotNull IconDTO icon, @NotNull PaddingsVO paddings, @NotNull AtomAction action, @NotNull CornersVO cornerRadius, @NotNull String stickyRoundingColor, String str, t tVar, IconButtonV3DTO iconButtonV3DTO, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(stickyRoundingColor, "stickyRoundingColor");
        this.id = j11;
        this.title = title;
        this.icon = icon;
        this.paddings = paddings;
        this.action = action;
        this.cornerRadius = cornerRadius;
        this.stickyRoundingColor = stickyRoundingColor;
        this.tintColor = str;
        this.tokenizedEvent = tVar;
        this.rightIconButton = iconButtonV3DTO;
        this.shouldSkipStickyAnimation = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FakeSearchVO)) {
            return false;
        }
        FakeSearchVO fakeSearchVO = (FakeSearchVO) other;
        return this.id == fakeSearchVO.id && Intrinsics.d(this.title, fakeSearchVO.title) && Intrinsics.d(this.icon, fakeSearchVO.icon) && Intrinsics.d(this.paddings, fakeSearchVO.paddings) && Intrinsics.d(this.action, fakeSearchVO.action) && Intrinsics.d(this.cornerRadius, fakeSearchVO.cornerRadius) && Intrinsics.d(this.stickyRoundingColor, fakeSearchVO.stickyRoundingColor) && Intrinsics.d(this.tintColor, fakeSearchVO.tintColor) && Intrinsics.d(this.tokenizedEvent, fakeSearchVO.tokenizedEvent) && Intrinsics.d(this.rightIconButton, fakeSearchVO.rightIconButton) && this.shouldSkipStickyAnimation == fakeSearchVO.shouldSkipStickyAnimation;
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final CornersVO getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final PaddingsVO getPaddings() {
        return this.paddings;
    }

    public final IconButtonV3DTO getRightIconButton() {
        return this.rightIconButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShouldSkipStickyAnimation() {
        return this.shouldSkipStickyAnimation;
    }

    @NotNull
    public final String getStickyRoundingColor() {
        return this.stickyRoundingColor;
    }

    public final String getTintColor() {
        return this.tintColor;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a((this.cornerRadius.hashCode() + C4598rp.a(this.action, (this.paddings.hashCode() + C2971a.a(this.icon, Ns.b.a(this.title, Long.hashCode(this.id) * 31, 31), 31)) * 31, 31)) * 31, 31, this.stickyRoundingColor);
        String str = this.tintColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.rightIconButton;
        return Boolean.hashCode(this.shouldSkipStickyAnimation) + ((hashCode2 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        IconDTO iconDTO = this.icon;
        PaddingsVO paddingsVO = this.paddings;
        AtomAction atomAction = this.action;
        CornersVO cornersVO = this.cornerRadius;
        String str = this.stickyRoundingColor;
        String str2 = this.tintColor;
        t tVar = this.tokenizedEvent;
        IconButtonV3DTO iconButtonV3DTO = this.rightIconButton;
        boolean z11 = this.shouldSkipStickyAnimation;
        StringBuilder b11 = a.b("FakeSearchVO(id=", j11, ", title=", textDTO);
        b11.append(", icon=");
        b11.append(iconDTO);
        b11.append(", paddings=");
        b11.append(paddingsVO);
        b11.append(", action=");
        b11.append(atomAction);
        b11.append(", cornerRadius=");
        b11.append(cornersVO);
        Nh.a.h(b11, ", stickyRoundingColor=", str, ", tintColor=", str2);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", rightIconButton=");
        b11.append(iconButtonV3DTO);
        return Bi.b.f(b11, ", shouldSkipStickyAnimation=", z11, ")");
    }
}
