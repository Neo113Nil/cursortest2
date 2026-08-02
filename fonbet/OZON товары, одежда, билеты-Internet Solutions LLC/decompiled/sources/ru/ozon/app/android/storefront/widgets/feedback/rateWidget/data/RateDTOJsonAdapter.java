package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.data;

import Ak.b;
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
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.data.RateDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO$NavBar;", "navBarAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO$PageHeader;", "nullablePageHeaderAdapter", "", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateSectionDTO;", "listOfRateSectionDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateDTOJsonAdapter extends JsonAdapter<RateDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<RateSectionDTO>> listOfRateSectionDTOAdapter;

    @NotNull
    private final JsonAdapter<RateDTO.NavBar> navBarAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<RateDTO.PageHeader> nullablePageHeaderAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    public RateDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("navbar", "pageHeader", "sections", "nextPageButton", "nextPageButtonDescription", "trackingInfo");
        M m11 = M.f71699a;
        this.navBarAdapter = moshi.f(RateDTO.NavBar.class, m11, "navbar");
        this.nullablePageHeaderAdapter = moshi.f(RateDTO.PageHeader.class, m11, "pageHeader");
        this.listOfRateSectionDTOAdapter = moshi.f(D.e(List.class, RateSectionDTO.class), m11, "sections");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "nextPageButton");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "nextPageButtonDescription");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(29, "GeneratedJsonAdapter(RateDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RateDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        RateDTO.NavBar navBar = null;
        RateDTO.PageHeader pageHeader = null;
        List<RateSectionDTO> list = null;
        ButtonV3Atom.LargeButton largeButton = null;
        TextAtom textAtom = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    navBar = this.navBarAdapter.fromJson(reader);
                    if (navBar == null) {
                        throw c.q("navbar", "navbar", reader);
                    }
                    break;
                case 1:
                    pageHeader = this.nullablePageHeaderAdapter.fromJson(reader);
                    break;
                case 2:
                    list = this.listOfRateSectionDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("sections", "sections", reader);
                    }
                    break;
                case 3:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("nextPageButton", "nextPageButton", reader);
                    }
                    break;
                case 4:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (navBar == null) {
            throw c.j("navbar", "navbar", reader);
        }
        if (list == null) {
            throw c.j("sections", "sections", reader);
        }
        if (largeButton != null) {
            return new RateDTO(navBar, pageHeader, list, largeButton, textAtom, map);
        }
        throw c.j("nextPageButton", "nextPageButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RateDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("navbar");
        this.navBarAdapter.mo44toJson(writer, (x) value.getNavbar());
        writer.w("pageHeader");
        this.nullablePageHeaderAdapter.mo44toJson(writer, (x) value.getPageHeader());
        writer.w("sections");
        this.listOfRateSectionDTOAdapter.mo44toJson(writer, (x) value.getSections());
        writer.w("nextPageButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getNextPageButton());
        writer.w("nextPageButtonDescription");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getNextPageButtonDescription());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
