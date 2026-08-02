package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Source;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationUiState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "", "Empty", "TeammatePresence", "MediaInput", "GifSearch", "InlineSources", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$Empty;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$GifSearch;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$InlineSources;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$MediaInput;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$TeammatePresence;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface BottomSheetState {

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$Empty;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Empty implements BottomSheetState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Empty)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1704299409;
        }

        public String toString() {
            return "Empty";
        }

        private Empty() {
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$TeammatePresence;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TeammatePresence implements BottomSheetState {
        public static final int $stable = 0;
        public static final TeammatePresence INSTANCE = new TeammatePresence();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TeammatePresence)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 298154395;
        }

        public String toString() {
            return "TeammatePresence";
        }

        private TeammatePresence() {
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$MediaInput;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MediaInput implements BottomSheetState {
        public static final int $stable = 0;
        public static final MediaInput INSTANCE = new MediaInput();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MediaInput)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1100907420;
        }

        public String toString() {
            return "MediaInput";
        }

        private MediaInput() {
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$GifSearch;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "gifs", "", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "<init>", "(Ljava/util/List;)V", "getGifs", "()Ljava/util/List;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GifSearch implements BottomSheetState {
        public static final int $stable = 8;
        private final List<Block> gifs;

        /* JADX WARN: Multi-variable type inference failed */
        public GifSearch(List<? extends Block> gifs) {
            Intrinsics.checkNotNullParameter(gifs, "gifs");
            this.gifs = gifs;
        }

        public final List<Block> getGifs() {
            return this.gifs;
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$InlineSources;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "selectedSources", "", "Lio/intercom/android/sdk/models/InlineSource;", "sources", "Lio/intercom/android/sdk/models/Source;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getSelectedSources", "()Ljava/util/List;", "getSources", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InlineSources implements BottomSheetState {
        public static final int $stable = 8;
        private final List<InlineSource> selectedSources;
        private final List<Source> sources;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InlineSources copy$default(InlineSources inlineSources, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = inlineSources.selectedSources;
            }
            if ((i & 2) != 0) {
                list2 = inlineSources.sources;
            }
            return inlineSources.copy(list, list2);
        }

        public final List<InlineSource> component1() {
            return this.selectedSources;
        }

        public final List<Source> component2() {
            return this.sources;
        }

        public final InlineSources copy(List<InlineSource> selectedSources, List<Source> sources) {
            Intrinsics.checkNotNullParameter(selectedSources, "selectedSources");
            Intrinsics.checkNotNullParameter(sources, "sources");
            return new InlineSources(selectedSources, sources);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InlineSources)) {
                return false;
            }
            InlineSources inlineSources = (InlineSources) other;
            return Intrinsics.areEqual(this.selectedSources, inlineSources.selectedSources) && Intrinsics.areEqual(this.sources, inlineSources.sources);
        }

        public int hashCode() {
            return (this.selectedSources.hashCode() * 31) + this.sources.hashCode();
        }

        public String toString() {
            return "InlineSources(selectedSources=" + this.selectedSources + ", sources=" + this.sources + ')';
        }

        public InlineSources(List<InlineSource> selectedSources, List<Source> sources) {
            Intrinsics.checkNotNullParameter(selectedSources, "selectedSources");
            Intrinsics.checkNotNullParameter(sources, "sources");
            this.selectedSources = selectedSources;
            this.sources = sources;
        }

        public final List<InlineSource> getSelectedSources() {
            return this.selectedSources;
        }

        public final List<Source> getSources() {
            return this.sources;
        }
    }
}
