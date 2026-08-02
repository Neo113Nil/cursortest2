package ru.ozon.app.android.common.actionHandlers.removeSuggestion;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/removeSuggestion/RemoveHistorySuggestionRequest;", "", "context", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RemoveHistorySuggestionRequest {

    @NotNull
    private final String context;

    @NotNull
    private final String text;

    public RemoveHistorySuggestionRequest(@NotNull String context, @NotNull String text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        this.context = context;
        this.text = text;
    }

    public static /* synthetic */ RemoveHistorySuggestionRequest copy$default(RemoveHistorySuggestionRequest removeHistorySuggestionRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = removeHistorySuggestionRequest.context;
        }
        if ((i11 & 2) != 0) {
            str2 = removeHistorySuggestionRequest.text;
        }
        return removeHistorySuggestionRequest.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final RemoveHistorySuggestionRequest copy(@NotNull String context, @NotNull String text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        return new RemoveHistorySuggestionRequest(context, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoveHistorySuggestionRequest)) {
            return false;
        }
        RemoveHistorySuggestionRequest removeHistorySuggestionRequest = (RemoveHistorySuggestionRequest) other;
        return Intrinsics.d(this.context, removeHistorySuggestionRequest.context) && Intrinsics.d(this.text, removeHistorySuggestionRequest.text);
    }

    @NotNull
    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.context.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("RemoveHistorySuggestionRequest(context=", this.context, ", text=", this.text, ")");
    }
}
