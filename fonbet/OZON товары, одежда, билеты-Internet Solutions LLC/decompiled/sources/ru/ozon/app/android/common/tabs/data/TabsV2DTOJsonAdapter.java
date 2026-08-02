package ru.ozon.app.android.common.tabs.data;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.common.tabs.data.TabsV2DTO;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/common/tabs/data/TabsV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/common/tabs/data/TabsV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/common/tabs/data/TabsV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/common/tabs/data/TabsV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/tabs/Tabs;", "nullableTabsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "nullableTabsDTOAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/common/tabs/data/TabsV2DTO$OnBoarding;", "nullableOnBoardingAdapter", "Lru/ozon/app/android/common/tabs/data/TabsV2DTO$CommonOnBoarding;", "nullableCommonOnBoardingAdapter", "nullableStringAdapter", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TabsV2DTOJsonAdapter extends JsonAdapter<TabsV2DTO> {

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<TabsV2DTO.CommonOnBoarding> nullableCommonOnBoardingAdapter;

    @NotNull
    private final JsonAdapter<TabsV2DTO.OnBoarding> nullableOnBoardingAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<Tabs> nullableTabsAdapter;

    @NotNull
    private final JsonAdapter<TabsDTO> nullableTabsDTOAdapter;

    @NotNull
    private final n.a options;

    public TabsV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(DynamicElementDTO.TABS, "dsTabs", "isSticky", "onboarding", "commonOnboarding", "backgroundColor");
        M m11 = M.f71699a;
        this.nullableTabsAdapter = moshi.f(Tabs.class, m11, DynamicElementDTO.TABS);
        this.nullableTabsDTOAdapter = moshi.f(TabsDTO.class, m11, "dsTabs");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isSticky");
        this.nullableOnBoardingAdapter = moshi.f(TabsV2DTO.OnBoarding.class, m11, "onboarding");
        this.nullableCommonOnBoardingAdapter = moshi.f(TabsV2DTO.CommonOnBoarding.class, m11, "commonOnboarding");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
    }

    @NotNull
    public String toString() {
        return b.c(31, "GeneratedJsonAdapter(TabsV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TabsV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Tabs tabs = null;
        TabsDTO tabsDTO = null;
        Boolean bool = null;
        TabsV2DTO.OnBoarding onBoarding = null;
        TabsV2DTO.CommonOnBoarding commonOnBoarding = null;
        String str = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    tabs = this.nullableTabsAdapter.fromJson(reader);
                    break;
                case 1:
                    tabsDTO = this.nullableTabsDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 3:
                    onBoarding = this.nullableOnBoardingAdapter.fromJson(reader);
                    break;
                case 4:
                    commonOnBoarding = this.nullableCommonOnBoardingAdapter.fromJson(reader);
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new TabsV2DTO(tabs, tabsDTO, bool, onBoarding, commonOnBoarding, str);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TabsV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(DynamicElementDTO.TABS);
        this.nullableTabsAdapter.mo44toJson(writer, (x) value.getTabs());
        writer.w("dsTabs");
        this.nullableTabsDTOAdapter.mo44toJson(writer, (x) value.getDsTabs());
        writer.w("isSticky");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getIsSticky());
        writer.w("onboarding");
        this.nullableOnBoardingAdapter.mo44toJson(writer, (x) value.getOnboarding());
        writer.w("commonOnboarding");
        this.nullableCommonOnBoardingAdapter.mo44toJson(writer, (x) value.getCommonOnboarding());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.p();
    }
}
