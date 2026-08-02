package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions;

import A00.a;
import G.g;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/AnswerStateUpdate;", "LA00/a$J$a;", "", "questionId", "answerId", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuestionId", "getAnswerId", "Z", "()Z", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AnswerStateUpdate implements a.J.InterfaceC0007a {

    @NotNull
    private final String answerId;
    private final boolean isSelected;

    @NotNull
    private final String questionId;

    public AnswerStateUpdate(@NotNull String questionId, @NotNull String answerId, boolean z11) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(answerId, "answerId");
        this.questionId = questionId;
        this.answerId = answerId;
        this.isSelected = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnswerStateUpdate)) {
            return false;
        }
        AnswerStateUpdate answerStateUpdate = (AnswerStateUpdate) other;
        return Intrinsics.d(this.questionId, answerStateUpdate.questionId) && Intrinsics.d(this.answerId, answerStateUpdate.answerId) && this.isSelected == answerStateUpdate.isSelected;
    }

    @NotNull
    public final String getAnswerId() {
        return this.answerId;
    }

    @NotNull
    public final String getQuestionId() {
        return this.questionId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + g.a(this.questionId.hashCode() * 31, 31, this.answerId);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        String str = this.questionId;
        String str2 = this.answerId;
        return Pk0.a.a(")", C3660k.d("AnswerStateUpdate(questionId=", str, ", answerId=", str2, ", isSelected="), this.isSelected);
    }
}
