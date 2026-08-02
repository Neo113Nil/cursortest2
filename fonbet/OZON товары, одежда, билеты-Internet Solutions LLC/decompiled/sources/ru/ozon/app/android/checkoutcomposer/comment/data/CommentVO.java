package ru.ozon.app.android.checkoutcomposer.comment.data;

import G.g;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/comment/data/CommentVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "info", "input", "Lru/ozon/uni/atoms/data/deprecated/Button;", "button", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/deprecated/Button;)V", "copy", "(JLjava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/deprecated/Button;)Lru/ozon/app/android/checkoutcomposer/comment/data/CommentVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getInfo", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/AtomDTO;", "getInput", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/data/deprecated/Button;", "getButton", "()Lru/ozon/uni/atoms/data/deprecated/Button;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CommentVO implements c {

    @NotNull
    private final Button button;
    private final long id;

    @NotNull
    private final List<AtomDTO> info;

    @NotNull
    private final AtomDTO input;

    /* JADX WARN: Multi-variable type inference failed */
    public CommentVO(long j11, @NotNull List<? extends AtomDTO> info, @NotNull AtomDTO input, @NotNull Button button) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.info = info;
        this.input = input;
        this.button = button;
    }

    public static /* synthetic */ CommentVO copy$default(CommentVO commentVO, long j11, List list, AtomDTO atomDTO, Button button, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = commentVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = commentVO.info;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            atomDTO = commentVO.input;
        }
        AtomDTO atomDTO2 = atomDTO;
        if ((i11 & 8) != 0) {
            button = commentVO.button;
        }
        return commentVO.copy(j12, list2, atomDTO2, button);
    }

    @NotNull
    public final CommentVO copy(long id2, @NotNull List<? extends AtomDTO> info, @NotNull AtomDTO input, @NotNull Button button) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(button, "button");
        return new CommentVO(id2, info, input, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentVO)) {
            return false;
        }
        CommentVO commentVO = (CommentVO) other;
        return this.id == commentVO.id && Intrinsics.d(this.info, commentVO.info) && Intrinsics.d(this.input, commentVO.input) && Intrinsics.d(this.button, commentVO.button);
    }

    @NotNull
    public final Button getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<AtomDTO> getInfo() {
        return this.info;
    }

    @NotNull
    public final AtomDTO getInput() {
        return this.input;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.button.hashCode() + ((this.input.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.info)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<AtomDTO> list = this.info;
        AtomDTO atomDTO = this.input;
        Button button = this.button;
        StringBuilder b11 = b.b(j11, "CommentVO(id=", ", info=", list);
        b11.append(", input=");
        b11.append(atomDTO);
        b11.append(", button=");
        b11.append(button);
        b11.append(")");
        return b11.toString();
    }
}
