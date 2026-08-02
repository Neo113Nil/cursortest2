package ru.ozon.app.android.pdp.widgets.tabs.data;

import Y9.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.pdp.widgets.tabs.data.PdpTabsDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001a¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO$Tab;", "listOfTabAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "stringAdapter", "Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO$TabTheme;", "tabThemeAdapter", "", "nullableIntAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpTabsDTOJsonAdapter extends JsonAdapter<PdpTabsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<PdpTabsDTO.Tab>> listOfTabAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<PdpTabsDTO.TabTheme> tabThemeAdapter;

    public PdpTabsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(DynamicElementDTO.TABS, "backgroundColor", "selectedTabGroupId", "tabTheme", "tabSelectedTheme", "tabBorderRadius", "trackingInfo");
        b e11 = D.e(List.class, PdpTabsDTO.Tab.class);
        M m11 = M.f71699a;
        this.listOfTabAdapter = moshi.f(e11, m11, DynamicElementDTO.TABS);
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.stringAdapter = moshi.f(String.class, m11, "selectedTabGroupId");
        this.tabThemeAdapter = moshi.f(PdpTabsDTO.TabTheme.class, m11, "tabTheme");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "tabBorderRadius");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(32, "GeneratedJsonAdapter(PdpTabsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PdpTabsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<PdpTabsDTO.Tab> list = null;
        String str = null;
        String str2 = null;
        PdpTabsDTO.TabTheme tabTheme = null;
        PdpTabsDTO.TabTheme tabTheme2 = null;
        Integer num = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfTabAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q(DynamicElementDTO.TABS, DynamicElementDTO.TABS, reader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("selectedTabGroupId", "selectedTabGroupId", reader);
                    }
                    break;
                case 3:
                    tabTheme = this.tabThemeAdapter.fromJson(reader);
                    if (tabTheme == null) {
                        throw c.q("tabTheme", "tabTheme", reader);
                    }
                    break;
                case 4:
                    tabTheme2 = this.tabThemeAdapter.fromJson(reader);
                    if (tabTheme2 == null) {
                        throw c.q("tabSelectedTheme", "tabSelectedTheme", reader);
                    }
                    break;
                case 5:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (list == null) {
            throw c.j(DynamicElementDTO.TABS, DynamicElementDTO.TABS, reader);
        }
        if (str2 == null) {
            throw c.j("selectedTabGroupId", "selectedTabGroupId", reader);
        }
        if (tabTheme == null) {
            throw c.j("tabTheme", "tabTheme", reader);
        }
        if (tabTheme2 != null) {
            return new PdpTabsDTO(list, str, str2, tabTheme, tabTheme2, num, map);
        }
        throw c.j("tabSelectedTheme", "tabSelectedTheme", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PdpTabsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(DynamicElementDTO.TABS);
        this.listOfTabAdapter.mo44toJson(writer, (x) value.getTabs());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("selectedTabGroupId");
        this.stringAdapter.mo44toJson(writer, (x) value.getSelectedTabGroupId());
        writer.w("tabTheme");
        this.tabThemeAdapter.mo44toJson(writer, (x) value.getTabTheme());
        writer.w("tabSelectedTheme");
        this.tabThemeAdapter.mo44toJson(writer, (x) value.getTabSelectedTheme());
        writer.w("tabBorderRadius");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getTabBorderRadius());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
