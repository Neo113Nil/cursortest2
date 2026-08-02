package ru.ozon.app.android.search.widgets.commonTapTags;

import A00.a;
import Ak.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/widgets/commonTapTags/SuggestedTapTagClickKey;", "LA00/a$J$a;", "", "suggestedTag", "", "shouldOverrideExistingText", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSuggestedTag", "Z", "getShouldOverrideExistingText", "()Z", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SuggestedTapTagClickKey implements a.J.InterfaceC0007a {
    private final boolean shouldOverrideExistingText;

    @NotNull
    private final String suggestedTag;

    public SuggestedTapTagClickKey(@NotNull String suggestedTag, boolean z11) {
        Intrinsics.checkNotNullParameter(suggestedTag, "suggestedTag");
        this.suggestedTag = suggestedTag;
        this.shouldOverrideExistingText = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestedTapTagClickKey)) {
            return false;
        }
        SuggestedTapTagClickKey suggestedTapTagClickKey = (SuggestedTapTagClickKey) other;
        return Intrinsics.d(this.suggestedTag, suggestedTapTagClickKey.suggestedTag) && this.shouldOverrideExistingText == suggestedTapTagClickKey.shouldOverrideExistingText;
    }

    public final boolean getShouldOverrideExistingText() {
        return this.shouldOverrideExistingText;
    }

    @NotNull
    public final String getSuggestedTag() {
        return this.suggestedTag;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldOverrideExistingText) + (this.suggestedTag.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return b.f("SuggestedTapTagClickKey(suggestedTag=", this.suggestedTag, ", shouldOverrideExistingText=", ")", this.shouldOverrideExistingText);
    }
}
