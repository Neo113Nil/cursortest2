package ru.ozon.app.android.fresh.main.widgets.customCell.presentation;

import Am.C2438a;
import B0.C2454a;
import D3.h;
import K00.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.customCell.data.CustomCellDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00016BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/customCell/presentation/CustomCellVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock;", "block", "Lru/ozon/app/android/fresh/main/widgets/customCell/presentation/CustomCellVO$PaddingsVO;", "spacers", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "backgroundColor", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$CustomBackground;", "contentColor", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock;Lru/ozon/app/android/fresh/main/widgets/customCell/presentation/CustomCellVO$PaddingsVO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$CustomBackground;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock;", "getBlock", "()Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock;", "Lru/ozon/app/android/fresh/main/widgets/customCell/presentation/CustomCellVO$PaddingsVO;", "getSpacers", "()Lru/ozon/app/android/fresh/main/widgets/customCell/presentation/CustomCellVO$PaddingsVO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$CustomBackground;", "getContentColor", "()Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$CustomBackground;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "PaddingsVO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CustomCellVO implements c {
    private final AtomAction action;
    private final String backgroundColor;
    private final CustomCellDTO.RightBlock block;

    @NotNull
    private final CellDTO cell;

    @NotNull
    private final CustomCellDTO.CustomBackground contentColor;
    private final long id;

    @NotNull
    private final PaddingsVO spacers;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/customCell/presentation/CustomCellVO$PaddingsVO;", "", "", "horizontal", "top", "bottom", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHorizontal", "getTop", "getBottom", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsVO {
        private final int bottom;
        private final int horizontal;
        private final int top;

        public PaddingsVO(int i11, int i12, int i13) {
            this.horizontal = i11;
            this.top = i12;
            this.bottom = i13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsVO)) {
                return false;
            }
            PaddingsVO paddingsVO = (PaddingsVO) other;
            return this.horizontal == paddingsVO.horizontal && this.top == paddingsVO.top && this.bottom == paddingsVO.bottom;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getHorizontal() {
            return this.horizontal;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottom) + C2454a.a(this.top, Integer.hashCode(this.horizontal) * 31, 31);
        }

        @NotNull
        public String toString() {
            return b.e(this.bottom, ")", C2438a.a("PaddingsVO(horizontal=", this.horizontal, ", top=", ", bottom=", this.top));
        }
    }

    public CustomCellVO(long j11, @NotNull CellDTO cell, CustomCellDTO.RightBlock rightBlock, @NotNull PaddingsVO spacers, AtomAction atomAction, String str, @NotNull CustomCellDTO.CustomBackground contentColor, t tVar) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        this.id = j11;
        this.cell = cell;
        this.block = rightBlock;
        this.spacers = spacers;
        this.action = atomAction;
        this.backgroundColor = str;
        this.contentColor = contentColor;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomCellVO)) {
            return false;
        }
        CustomCellVO customCellVO = (CustomCellVO) other;
        return this.id == customCellVO.id && Intrinsics.d(this.cell, customCellVO.cell) && Intrinsics.d(this.block, customCellVO.block) && Intrinsics.d(this.spacers, customCellVO.spacers) && Intrinsics.d(this.action, customCellVO.action) && Intrinsics.d(this.backgroundColor, customCellVO.backgroundColor) && Intrinsics.d(this.contentColor, customCellVO.contentColor) && Intrinsics.d(this.tokenizedEvent, customCellVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CustomCellDTO.RightBlock getBlock() {
        return this.block;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final CustomCellDTO.CustomBackground getContentColor() {
        return this.contentColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final PaddingsVO getSpacers() {
        return this.spacers;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = Bi.b.c(this.cell, Long.hashCode(this.id) * 31, 31);
        CustomCellDTO.RightBlock rightBlock = this.block;
        int hashCode = (this.spacers.hashCode() + ((c11 + (rightBlock == null ? 0 : rightBlock.hashCode())) * 31)) * 31;
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (this.contentColor.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.cell;
        CustomCellDTO.RightBlock rightBlock = this.block;
        PaddingsVO paddingsVO = this.spacers;
        AtomAction atomAction = this.action;
        String str = this.backgroundColor;
        CustomCellDTO.CustomBackground customBackground = this.contentColor;
        t tVar = this.tokenizedEvent;
        StringBuilder e11 = h.e("CustomCellVO(id=", j11, ", cell=", cellDTO);
        e11.append(", block=");
        e11.append(rightBlock);
        e11.append(", spacers=");
        e11.append(paddingsVO);
        e11.append(", action=");
        e11.append(atomAction);
        e11.append(", backgroundColor=");
        e11.append(str);
        e11.append(", contentColor=");
        e11.append(customBackground);
        e11.append(", tokenizedEvent=");
        e11.append(tVar);
        e11.append(")");
        return e11.toString();
    }
}
