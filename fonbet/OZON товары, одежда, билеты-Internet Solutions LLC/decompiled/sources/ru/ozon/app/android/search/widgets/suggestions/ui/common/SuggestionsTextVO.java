package ru.ozon.app.android.search.widgets.suggestions.ui.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsTextVO;", "", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", "<init>", "(Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SuggestionsTextVO {
    public static final int $stable = OzonSpannableString.$stable | TestInfo.$stable;
    private final TestInfo testInfo;
    private final OzonSpannableString text;

    public SuggestionsTextVO(TestInfo testInfo, OzonSpannableString ozonSpannableString) {
        this.testInfo = testInfo;
        this.text = ozonSpannableString;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestionsTextVO)) {
            return false;
        }
        SuggestionsTextVO suggestionsTextVO = (SuggestionsTextVO) other;
        return Intrinsics.d(this.testInfo, suggestionsTextVO.testInfo) && Intrinsics.d(this.text, suggestionsTextVO.text);
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final OzonSpannableString getText() {
        return this.text;
    }

    public int hashCode() {
        TestInfo testInfo = this.testInfo;
        int hashCode = (testInfo == null ? 0 : testInfo.hashCode()) * 31;
        OzonSpannableString ozonSpannableString = this.text;
        return hashCode + (ozonSpannableString != null ? ozonSpannableString.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SuggestionsTextVO(testInfo=" + this.testInfo + ", text=" + ((Object) this.text) + ")";
    }
}
