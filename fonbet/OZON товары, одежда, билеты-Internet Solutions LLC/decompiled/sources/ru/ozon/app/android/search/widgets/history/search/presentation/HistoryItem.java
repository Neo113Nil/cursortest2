package ru.ozon.app.android.search.widgets.history.search.presentation;

import Bi.b;
import De.C2859b;
import F3.G;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;", "", "id", "", "<init>", "(J)V", "getId", "()J", "ButtonVO", "TagButtonVO", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem$ButtonVO;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem$TagButtonVO;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class HistoryItem {
    private final long id;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem$ButtonVO;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "shouldPrefetch", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Z", "getShouldPrefetch", "()Z", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonVO extends HistoryItem {

        @NotNull
        private final ButtonV3DTO button;
        private final long id;
        private final boolean shouldPrefetch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ButtonVO(long j11, @NotNull ButtonV3DTO button, boolean z11) {
            super(j11, null);
            Intrinsics.checkNotNullParameter(button, "button");
            this.id = j11;
            this.button = button;
            this.shouldPrefetch = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonVO)) {
                return false;
            }
            ButtonVO buttonVO = (ButtonVO) other;
            return this.id == buttonVO.id && Intrinsics.d(this.button, buttonVO.button) && this.shouldPrefetch == buttonVO.shouldPrefetch;
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @Override // ru.ozon.app.android.search.widgets.history.search.presentation.HistoryItem
        public long getId() {
            return this.id;
        }

        public final boolean getShouldPrefetch() {
            return this.shouldPrefetch;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldPrefetch) + C2859b.c(this.button, Long.hashCode(this.id) * 31, 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            ButtonV3DTO buttonV3DTO = this.button;
            return b.f(G.c("ButtonVO(id=", j11, ", button=", buttonV3DTO), ", shouldPrefetch=", this.shouldPrefetch, ")");
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem$TagButtonVO;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;", "", "id", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "tagButton", "", "shouldPrefetch", "<init>", "(JLru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Z)V", "isFilterTag", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getTagButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Z", "getShouldPrefetch", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TagButtonVO extends HistoryItem {
        private final long id;
        private final boolean shouldPrefetch;

        @NotNull
        private final TagButtonDTO tagButton;
        public static final int $stable = TagButtonDTO.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TagButtonVO(long j11, @NotNull TagButtonDTO tagButton, boolean z11) {
            super(j11, null);
            Intrinsics.checkNotNullParameter(tagButton, "tagButton");
            this.id = j11;
            this.tagButton = tagButton;
            this.shouldPrefetch = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TagButtonVO)) {
                return false;
            }
            TagButtonVO tagButtonVO = (TagButtonVO) other;
            return this.id == tagButtonVO.id && Intrinsics.d(this.tagButton, tagButtonVO.tagButton) && this.shouldPrefetch == tagButtonVO.shouldPrefetch;
        }

        @Override // ru.ozon.app.android.search.widgets.history.search.presentation.HistoryItem
        public long getId() {
            return this.id;
        }

        public final boolean getShouldPrefetch() {
            return this.shouldPrefetch;
        }

        @NotNull
        public final TagButtonDTO getTagButton() {
            return this.tagButton;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldPrefetch) + ((this.tagButton.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
        }

        public final boolean isFilterTag() {
            AtomActionDTO action;
            Map<String, String> params;
            CommonControlSettings common = this.tagButton.getCommon();
            return Intrinsics.d((common == null || (action = common.getAction()) == null || (params = action.getParams()) == null) ? null : params.get("historyType"), "filter");
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TagButtonDTO tagButtonDTO = this.tagButton;
            boolean z11 = this.shouldPrefetch;
            StringBuilder sb2 = new StringBuilder("TagButtonVO(id=");
            sb2.append(j11);
            sb2.append(", tagButton=");
            sb2.append(tagButtonDTO);
            return b.f(sb2, ", shouldPrefetch=", z11, ")");
        }
    }

    public /* synthetic */ HistoryItem(long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11);
    }

    public long getId() {
        return this.id;
    }

    private HistoryItem(long j11) {
        this.id = j11;
    }
}
