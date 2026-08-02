package ru.ozon.app.android.ugc.view.text.clickable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/view/text/clickable/ClickableTextVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/af/AtomAction;", "textAction", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getTextAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ClickableTextVO {
    public static final int $stable = AtomAction.$stable;

    @NotNull
    private final TextDTO text;
    private final AtomAction textAction;

    public ClickableTextVO(@NotNull TextDTO text, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.textAction = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickableTextVO)) {
            return false;
        }
        ClickableTextVO clickableTextVO = (ClickableTextVO) other;
        return Intrinsics.d(this.text, clickableTextVO.text) && Intrinsics.d(this.textAction, clickableTextVO.textAction);
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public final AtomAction getTextAction() {
        return this.textAction;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        AtomAction atomAction = this.textAction;
        return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
    }

    @NotNull
    public String toString() {
        return "ClickableTextVO(text=" + this.text + ", textAction=" + this.textAction + ")";
    }
}
