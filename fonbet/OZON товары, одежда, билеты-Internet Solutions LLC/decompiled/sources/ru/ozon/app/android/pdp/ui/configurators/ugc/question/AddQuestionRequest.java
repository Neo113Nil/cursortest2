package ru.ozon.app.android.pdp.ui.configurators.ugc.question;

import Bl.b;
import Kk.C3532b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/question/AddQuestionRequest;", "", "itemId", "", "isAnonymous", "", "text", "", "<init>", "(JZLjava/lang/String;)V", "getItemId", "()J", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddQuestionRequest {
    public static final int $stable = 0;
    private final boolean isAnonymous;
    private final long itemId;

    @NotNull
    private final String text;

    public AddQuestionRequest(@i(name = "itemID") long j11, boolean z11, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.itemId = j11;
        this.isAnonymous = z11;
        this.text = text;
    }

    public static /* synthetic */ AddQuestionRequest copy$default(AddQuestionRequest addQuestionRequest, long j11, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = addQuestionRequest.itemId;
        }
        if ((i11 & 2) != 0) {
            z11 = addQuestionRequest.isAnonymous;
        }
        if ((i11 & 4) != 0) {
            str = addQuestionRequest.text;
        }
        return addQuestionRequest.copy(j11, z11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getItemId() {
        return this.itemId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAnonymous() {
        return this.isAnonymous;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final AddQuestionRequest copy(@i(name = "itemID") long itemId, boolean isAnonymous, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new AddQuestionRequest(itemId, isAnonymous, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddQuestionRequest)) {
            return false;
        }
        AddQuestionRequest addQuestionRequest = (AddQuestionRequest) other;
        return this.itemId == addQuestionRequest.itemId && this.isAnonymous == addQuestionRequest.isAnonymous && Intrinsics.d(this.text, addQuestionRequest.text);
    }

    public final long getItemId() {
        return this.itemId;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + C3532b.a(Long.hashCode(this.itemId) * 31, 31, this.isAnonymous);
    }

    public final boolean isAnonymous() {
        return this.isAnonymous;
    }

    @NotNull
    public String toString() {
        return C6594f.a(", text=", this.text, ")", b.c(this.itemId, "AddQuestionRequest(itemId=", ", isAnonymous=", this.isAnonymous));
    }
}
