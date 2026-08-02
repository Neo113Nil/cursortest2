package ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation;

import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.data.FaqAnswerExpandedInfo;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "saveLastTabsScrollPosition", "(I)V", "discardLastTabsScrollPosition", "getLastTabsScrollPosition", "()I", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/data/FaqAnswerExpandedInfo;", "faqExpandedInfo", "updateFaqExpandedInfoList", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/data/FaqAnswerExpandedInfo;)V", "discardFaqExpandedInfoData", "", "getFaqExpandedInfoList", "()Ljava/util/List;", "lastTabsScrollPosition", "I", "", "faqExpandedInfoList", "Ljava/util/List;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FaqViewModel extends w0 {

    @NotNull
    private List<FaqAnswerExpandedInfo> faqExpandedInfoList = new ArrayList();
    private int lastTabsScrollPosition;
    public static final int $stable = 8;

    public final void discardFaqExpandedInfoData() {
        this.faqExpandedInfoList.clear();
    }

    public final void discardLastTabsScrollPosition() {
        this.lastTabsScrollPosition = 0;
    }

    @NotNull
    public final List<FaqAnswerExpandedInfo> getFaqExpandedInfoList() {
        return this.faqExpandedInfoList;
    }

    public final int getLastTabsScrollPosition() {
        return this.lastTabsScrollPosition;
    }

    public final void saveLastTabsScrollPosition(int value) {
        this.lastTabsScrollPosition = value;
    }

    public final void updateFaqExpandedInfoList(@NotNull FaqAnswerExpandedInfo faqExpandedInfo) {
        Intrinsics.checkNotNullParameter(faqExpandedInfo, "faqExpandedInfo");
        if (!faqExpandedInfo.getIsExpanded()) {
            this.faqExpandedInfoList.remove(FaqAnswerExpandedInfo.copy$default(faqExpandedInfo, null, true, 1, null));
        } else {
            if (this.faqExpandedInfoList.contains(faqExpandedInfo)) {
                return;
            }
            this.faqExpandedInfoList.add(faqExpandedInfo);
        }
    }
}
