package ru.ozon.app.android.pdp.ui.configurators.ugc.question;

import Ak.C2436a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/question/AddAnswerRequest;", "", "questionId", "", "text", "", "<init>", "(JLjava/lang/String;)V", "getQuestionId", "()J", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddAnswerRequest {
    public static final int $stable = 0;
    private final long questionId;

    @NotNull
    private final String text;

    public AddAnswerRequest(@i(name = "questionID") long j11, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.questionId = j11;
        this.text = text;
    }

    public static /* synthetic */ AddAnswerRequest copy$default(AddAnswerRequest addAnswerRequest, long j11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = addAnswerRequest.questionId;
        }
        if ((i11 & 2) != 0) {
            str = addAnswerRequest.text;
        }
        return addAnswerRequest.copy(j11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getQuestionId() {
        return this.questionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final AddAnswerRequest copy(@i(name = "questionID") long questionId, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new AddAnswerRequest(questionId, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddAnswerRequest)) {
            return false;
        }
        AddAnswerRequest addAnswerRequest = (AddAnswerRequest) other;
        return this.questionId == addAnswerRequest.questionId && Intrinsics.d(this.text, addAnswerRequest.text);
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (Long.hashCode(this.questionId) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder c11 = C2436a.c(this.questionId, "AddAnswerRequest(questionId=", ", text=", this.text);
        c11.append(")");
        return c11.toString();
    }
}
