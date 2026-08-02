package com.sports.insider.data.repository.room.support.dp.impl;

import androidx.annotation.Keep;
import d9.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lc.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r4.k;
import rb.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lcom/sports/insider/data/repository/room/support/dp/impl/FrequentQuestionsTable;", "Llc/c;", "", "id", "", FrequentQuestionsTable.columnQuestion, FrequentQuestionsTable.columnAnswer, "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/sports/insider/data/repository/room/support/dp/impl/FrequentQuestionsTable;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "setId", "(I)V", "Ljava/lang/String;", "getQuestion", "setQuestion", "(Ljava/lang/String;)V", "getAnswer", "setAnswer", "Companion", "rb/a", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FrequentQuestionsTable implements c {

    @NotNull
    public static final a Companion = new a();

    @NotNull
    public static final String columnAnswer = "answer";

    @NotNull
    public static final String columnId = "id";

    @NotNull
    public static final String columnIdIndex = "index_frequent_questions_table_id";

    @NotNull
    public static final String columnQuestion = "question";

    @NotNull
    public static final String tableName = "frequent_questions_table";

    @NotNull
    private String answer;
    private int id;

    @NotNull
    private String question;

    public FrequentQuestionsTable(int i5, @NotNull String question, @NotNull String answer) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.id = i5;
        this.question = question;
        this.answer = answer;
    }

    public static /* synthetic */ FrequentQuestionsTable copy$default(FrequentQuestionsTable frequentQuestionsTable, int i5, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i5 = frequentQuestionsTable.id;
        }
        if ((i10 & 2) != 0) {
            str = frequentQuestionsTable.question;
        }
        if ((i10 & 4) != 0) {
            str2 = frequentQuestionsTable.answer;
        }
        return frequentQuestionsTable.copy(i5, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    @NotNull
    public final FrequentQuestionsTable copy(int id2, @NotNull String question, @NotNull String answer) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        return new FrequentQuestionsTable(id2, question, answer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrequentQuestionsTable)) {
            return false;
        }
        FrequentQuestionsTable frequentQuestionsTable = (FrequentQuestionsTable) other;
        return this.id == frequentQuestionsTable.id && Intrinsics.areEqual(this.question, frequentQuestionsTable.question) && Intrinsics.areEqual(this.answer, frequentQuestionsTable.answer);
    }

    @Override // lc.c
    @NotNull
    public String getAnswer() {
        return this.answer;
    }

    @Override // lc.c
    public int getId() {
        return this.id;
    }

    @Override // lc.c
    @NotNull
    public String getQuestion() {
        return this.question;
    }

    public int hashCode() {
        return this.answer.hashCode() + k.j(this.id * 31, 31, this.question);
    }

    public void setAnswer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.answer = str;
    }

    public void setId(int i5) {
        this.id = i5;
    }

    public void setQuestion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.question = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FrequentQuestionsTable(id=");
        sb2.append(this.id);
        sb2.append(", question=");
        sb2.append(this.question);
        sb2.append(", answer=");
        return e.k(sb2, this.answer, ')');
    }
}
