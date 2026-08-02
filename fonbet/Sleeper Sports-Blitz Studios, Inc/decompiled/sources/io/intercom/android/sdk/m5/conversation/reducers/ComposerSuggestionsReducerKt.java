package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.models.ComposerSuggestions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposerSuggestionsReducer.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\"\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"reduceComposerSuggestions", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "composerSuggestions", "Lio/intercom/android/sdk/models/ComposerSuggestions;", "replySuggestions", "", "Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;", "getReplySuggestions", "(Lio/intercom/android/sdk/models/ComposerSuggestions;)Ljava/util/List;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposerSuggestionsReducerKt {
    public static final ContentRow reduceComposerSuggestions(ComposerSuggestions composerSuggestions) {
        Intrinsics.checkNotNullParameter(composerSuggestions, "composerSuggestions");
        if (composerSuggestions.getSuggestions().isEmpty()) {
            return null;
        }
        return new ContentRow.ComposerSuggestionRow(getReplySuggestions(composerSuggestions));
    }

    private static final List<ReplySuggestion> getReplySuggestions(ComposerSuggestions composerSuggestions) {
        List<ComposerSuggestions.Suggestion> suggestions = composerSuggestions.getSuggestions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(suggestions, 10));
        for (ComposerSuggestions.Suggestion suggestion : suggestions) {
            arrayList.add(new ReplySuggestion(suggestion.getUuid(), suggestion.getText()));
        }
        return arrayList;
    }
}
