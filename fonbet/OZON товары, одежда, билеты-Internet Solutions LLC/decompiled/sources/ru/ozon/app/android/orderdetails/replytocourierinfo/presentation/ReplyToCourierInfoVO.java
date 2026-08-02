package ru.ozon.app.android.orderdetails.replytocourierinfo.presentation;

import G.g;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orderdetails/replytocourierinfo/presentation/ReplyToCourierInfoVO;", "Ll20/c;", "", "id", "", "Lru/ozon/uni/atoms/data/AtomDTO;", CommentV3DTO.HEADER_FIELD_NAME, "description", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getHeader", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/AtomDTO;", "getDescription", "()Lru/ozon/uni/atoms/data/AtomDTO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReplyToCourierInfoVO implements c {

    @NotNull
    private final AtomDTO description;

    @NotNull
    private final List<AtomDTO> header;
    private final long id;

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyToCourierInfoVO(long j11, @NotNull List<? extends AtomDTO> header, @NotNull AtomDTO description) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = j11;
        this.header = header;
        this.description = description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplyToCourierInfoVO)) {
            return false;
        }
        ReplyToCourierInfoVO replyToCourierInfoVO = (ReplyToCourierInfoVO) other;
        return this.id == replyToCourierInfoVO.id && Intrinsics.d(this.header, replyToCourierInfoVO.header) && Intrinsics.d(this.description, replyToCourierInfoVO.description);
    }

    @NotNull
    public final AtomDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final List<AtomDTO> getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        return this.description.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.header);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<AtomDTO> list = this.header;
        AtomDTO atomDTO = this.description;
        StringBuilder b11 = b.b(j11, "ReplyToCourierInfoVO(id=", ", header=", list);
        b11.append(", description=");
        b11.append(atomDTO);
        b11.append(")");
        return b11.toString();
    }
}
