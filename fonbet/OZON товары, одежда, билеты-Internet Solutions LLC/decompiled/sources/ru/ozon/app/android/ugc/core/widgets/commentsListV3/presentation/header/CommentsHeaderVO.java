package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.header;

import B0.C2454a;
import Ns.b;
import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJB\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "countText", "", "count", "", "emptyStateAvailable", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;IZ)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;IZ)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCountText", "I", "getCount", "Z", "getEmptyStateAvailable", "()Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommentsHeaderVO implements c {
    private final int count;

    @NotNull
    private final TextDTO countText;
    private final boolean emptyStateAvailable;
    private final long id;

    @NotNull
    private final TextDTO title;

    public CommentsHeaderVO(long j11, @NotNull TextDTO title, @NotNull TextDTO countText, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(countText, "countText");
        this.id = j11;
        this.title = title;
        this.countText = countText;
        this.count = i11;
        this.emptyStateAvailable = z11;
    }

    public static /* synthetic */ CommentsHeaderVO copy$default(CommentsHeaderVO commentsHeaderVO, long j11, TextDTO textDTO, TextDTO textDTO2, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = commentsHeaderVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            textDTO = commentsHeaderVO.title;
        }
        TextDTO textDTO3 = textDTO;
        if ((i12 & 4) != 0) {
            textDTO2 = commentsHeaderVO.countText;
        }
        TextDTO textDTO4 = textDTO2;
        if ((i12 & 8) != 0) {
            i11 = commentsHeaderVO.count;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            z11 = commentsHeaderVO.emptyStateAvailable;
        }
        return commentsHeaderVO.copy(j12, textDTO3, textDTO4, i13, z11);
    }

    @NotNull
    public final CommentsHeaderVO copy(long id2, @NotNull TextDTO title, @NotNull TextDTO countText, int count, boolean emptyStateAvailable) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(countText, "countText");
        return new CommentsHeaderVO(id2, title, countText, count, emptyStateAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentsHeaderVO)) {
            return false;
        }
        CommentsHeaderVO commentsHeaderVO = (CommentsHeaderVO) other;
        return this.id == commentsHeaderVO.id && Intrinsics.d(this.title, commentsHeaderVO.title) && Intrinsics.d(this.countText, commentsHeaderVO.countText) && this.count == commentsHeaderVO.count && this.emptyStateAvailable == commentsHeaderVO.emptyStateAvailable;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final TextDTO getCountText() {
        return this.countText;
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
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Boolean.hashCode(this.emptyStateAvailable) + C2454a.a(this.count, b.a(this.countText, b.a(this.title, Long.hashCode(this.id) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.countText;
        int i11 = this.count;
        boolean z11 = this.emptyStateAvailable;
        StringBuilder b11 = a.b("CommentsHeaderVO(id=", j11, ", title=", textDTO);
        b11.append(", countText=");
        b11.append(textDTO2);
        b11.append(", count=");
        b11.append(i11);
        return Bi.b.f(b11, ", emptyStateAvailable=", z11, ")");
    }
}
