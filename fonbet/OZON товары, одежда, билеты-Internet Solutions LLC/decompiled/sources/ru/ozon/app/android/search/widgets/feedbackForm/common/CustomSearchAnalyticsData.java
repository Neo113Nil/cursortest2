package ru.ozon.app.android.search.widgets.feedbackForm.common;

import Ul.C4070a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/common/CustomSearchAnalyticsData;", "", "", "actionName", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "selectCellTitle", "optionText", "", "params", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionName", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSelectCellTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getOptionText", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CustomSearchAnalyticsData {
    private final String actionName;
    private final String optionText;
    private final Map<String, String> params;
    private final OzonSpannableString selectCellTitle;

    public CustomSearchAnalyticsData(String str, OzonSpannableString ozonSpannableString, String str2, Map<String, String> map) {
        this.actionName = str;
        this.selectCellTitle = ozonSpannableString;
        this.optionText = str2;
        this.params = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomSearchAnalyticsData)) {
            return false;
        }
        CustomSearchAnalyticsData customSearchAnalyticsData = (CustomSearchAnalyticsData) other;
        return Intrinsics.d(this.actionName, customSearchAnalyticsData.actionName) && Intrinsics.d(this.selectCellTitle, customSearchAnalyticsData.selectCellTitle) && Intrinsics.d(this.optionText, customSearchAnalyticsData.optionText) && Intrinsics.d(this.params, customSearchAnalyticsData.params);
    }

    public final String getActionName() {
        return this.actionName;
    }

    public final String getOptionText() {
        return this.optionText;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final OzonSpannableString getSelectCellTitle() {
        return this.selectCellTitle;
    }

    public int hashCode() {
        String str = this.actionName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OzonSpannableString ozonSpannableString = this.selectCellTitle;
        int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        String str2 = this.optionText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.params;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.actionName;
        OzonSpannableString ozonSpannableString = this.selectCellTitle;
        String str2 = this.optionText;
        Map<String, String> map = this.params;
        StringBuilder sb2 = new StringBuilder("CustomSearchAnalyticsData(actionName=");
        sb2.append(str);
        sb2.append(", selectCellTitle=");
        sb2.append((Object) ozonSpannableString);
        sb2.append(", optionText=");
        return C4070a.a(sb2, str2, ", params=", map, ")");
    }
}
