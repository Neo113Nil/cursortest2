package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Ak.C2436a;
import G.g;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListInputVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "inputPlaceholder", "inputAnswerPlaceholder", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getInputPlaceholder", "getInputAnswerPlaceholder", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommentsListInputVO implements c {
    private final long id;

    @NotNull
    private final String inputAnswerPlaceholder;

    @NotNull
    private final String inputPlaceholder;

    public CommentsListInputVO(long j11, @NotNull String inputPlaceholder, @NotNull String inputAnswerPlaceholder) {
        Intrinsics.checkNotNullParameter(inputPlaceholder, "inputPlaceholder");
        Intrinsics.checkNotNullParameter(inputAnswerPlaceholder, "inputAnswerPlaceholder");
        this.id = j11;
        this.inputPlaceholder = inputPlaceholder;
        this.inputAnswerPlaceholder = inputAnswerPlaceholder;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentsListInputVO)) {
            return false;
        }
        CommentsListInputVO commentsListInputVO = (CommentsListInputVO) other;
        return this.id == commentsListInputVO.id && Intrinsics.d(this.inputPlaceholder, commentsListInputVO.inputPlaceholder) && Intrinsics.d(this.inputAnswerPlaceholder, commentsListInputVO.inputAnswerPlaceholder);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getInputAnswerPlaceholder() {
        return this.inputAnswerPlaceholder;
    }

    @NotNull
    public final String getInputPlaceholder() {
        return this.inputPlaceholder;
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
        return this.inputAnswerPlaceholder.hashCode() + g.a(Long.hashCode(this.id) * 31, 31, this.inputPlaceholder);
    }

    @NotNull
    public String toString() {
        return C6594f.a(", inputAnswerPlaceholder=", this.inputAnswerPlaceholder, ")", C2436a.c(this.id, "CommentsListInputVO(id=", ", inputPlaceholder=", this.inputPlaceholder));
    }
}
