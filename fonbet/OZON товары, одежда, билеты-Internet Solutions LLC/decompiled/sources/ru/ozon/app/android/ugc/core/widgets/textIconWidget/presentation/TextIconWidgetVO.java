package ru.ozon.app.android.ugc.core.widgets.textIconWidget.presentation;

import B3.p;
import G.g;
import GR.b;
import Lh.a;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001:\u00012BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010\u0015R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/textIconWidget/presentation/TextIconWidgetVO;", "Ll20/c;", "", "id", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "atoms", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Landroidx/compose/foundation/layout/b$e;", "arrangement", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/presentation/TextIconWidgetVO$LayoutPaddingsVO;", "paddings", "", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/af/AtomAction;Landroidx/compose/foundation/layout/b$e;Lru/ozon/app/android/ugc/core/widgets/textIconWidget/presentation/TextIconWidgetVO$LayoutPaddingsVO;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getAtoms", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Landroidx/compose/foundation/layout/b$e;", "getArrangement", "()Landroidx/compose/foundation/layout/b$e;", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/presentation/TextIconWidgetVO$LayoutPaddingsVO;", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/textIconWidget/presentation/TextIconWidgetVO$LayoutPaddingsVO;", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "LayoutPaddingsVO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextIconWidgetVO implements c {
    private final AtomAction action;

    @NotNull
    private final C5179b.e arrangement;

    @NotNull
    private final List<AtomDTO> atoms;
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final LayoutPaddingsVO paddings;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/textIconWidget/presentation/TextIconWidgetVO$LayoutPaddingsVO;", "", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutPaddingsVO {

        @NotNull
        private final Paddings bottomPadding;

        @NotNull
        private final Paddings leftPadding;

        @NotNull
        private final Paddings rightPadding;

        @NotNull
        private final Paddings topPadding;

        public LayoutPaddingsVO(@NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding) {
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            this.topPadding = topPadding;
            this.bottomPadding = bottomPadding;
            this.leftPadding = leftPadding;
            this.rightPadding = rightPadding;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LayoutPaddingsVO)) {
                return false;
            }
            LayoutPaddingsVO layoutPaddingsVO = (LayoutPaddingsVO) other;
            return this.topPadding == layoutPaddingsVO.topPadding && this.bottomPadding == layoutPaddingsVO.bottomPadding && this.leftPadding == layoutPaddingsVO.leftPadding && this.rightPadding == layoutPaddingsVO.rightPadding;
        }

        @NotNull
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return this.rightPadding.hashCode() + b.b(this.leftPadding, b.b(this.bottomPadding, this.topPadding.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            return b.e(p.b("LayoutPaddingsVO(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding="), this.leftPadding, ", rightPadding=", this.rightPadding, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextIconWidgetVO(long j11, @NotNull List<? extends AtomDTO> atoms, AtomAction atomAction, @NotNull C5179b.e arrangement, @NotNull LayoutPaddingsVO paddings, String str, t tVar) {
        Intrinsics.checkNotNullParameter(atoms, "atoms");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.atoms = atoms;
        this.action = atomAction;
        this.arrangement = arrangement;
        this.paddings = paddings;
        this.backgroundColor = str;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextIconWidgetVO)) {
            return false;
        }
        TextIconWidgetVO textIconWidgetVO = (TextIconWidgetVO) other;
        return this.id == textIconWidgetVO.id && Intrinsics.d(this.atoms, textIconWidgetVO.atoms) && Intrinsics.d(this.action, textIconWidgetVO.action) && Intrinsics.d(this.arrangement, textIconWidgetVO.arrangement) && Intrinsics.d(this.paddings, textIconWidgetVO.paddings) && Intrinsics.d(this.backgroundColor, textIconWidgetVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, textIconWidgetVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final C5179b.e getArrangement() {
        return this.arrangement;
    }

    @NotNull
    public final List<AtomDTO> getAtoms() {
        return this.atoms;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final LayoutPaddingsVO getPaddings() {
        return this.paddings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.atoms);
        AtomAction atomAction = this.action;
        int hashCode = (this.paddings.hashCode() + ((this.arrangement.hashCode() + ((b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31)) * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<AtomDTO> list = this.atoms;
        AtomAction atomAction = this.action;
        C5179b.e eVar = this.arrangement;
        LayoutPaddingsVO layoutPaddingsVO = this.paddings;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = Lh.b.b(j11, "TextIconWidgetVO(id=", ", atoms=", list);
        b11.append(", action=");
        b11.append(atomAction);
        b11.append(", arrangement=");
        b11.append(eVar);
        b11.append(", paddings=");
        b11.append(layoutPaddingsVO);
        b11.append(", backgroundColor=");
        b11.append(str);
        return a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
