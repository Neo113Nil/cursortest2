package ru.ozon.app.android.storefront.widgets.appOnboarding.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.appOnboarding.data.AppOnboardingDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$LogoImage;", "logoImageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageControls;", "pageControlsAdapter", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$SkipButton;", "skipButtonAdapter", "", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageItem;", "listOfPageItemAdapter", "nullableStringAdapter", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppOnboardingDTOJsonAdapter extends JsonAdapter<AppOnboardingDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<AppOnboardingDTO.PageItem>> listOfPageItemAdapter;

    @NotNull
    private final JsonAdapter<AppOnboardingDTO.LogoImage> logoImageAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<AppOnboardingDTO.PageControls> pageControlsAdapter;

    @NotNull
    private final JsonAdapter<AppOnboardingDTO.SkipButton> skipButtonAdapter;

    public AppOnboardingDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("logoImage", "pageControls", "skipButton", "pages", "shapeImage");
        M m11 = M.f71699a;
        this.logoImageAdapter = moshi.f(AppOnboardingDTO.LogoImage.class, m11, "logoImage");
        this.pageControlsAdapter = moshi.f(AppOnboardingDTO.PageControls.class, m11, "pageControls");
        this.skipButtonAdapter = moshi.f(AppOnboardingDTO.SkipButton.class, m11, "skipButton");
        this.listOfPageItemAdapter = moshi.f(D.e(List.class, AppOnboardingDTO.PageItem.class), m11, "pages");
        this.nullableStringAdapter = moshi.f(String.class, m11, "shapeImage");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(AppOnboardingDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AppOnboardingDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AppOnboardingDTO.LogoImage logoImage = null;
        AppOnboardingDTO.PageControls pageControls = null;
        AppOnboardingDTO.SkipButton skipButton = null;
        List<AppOnboardingDTO.PageItem> list = null;
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                logoImage = this.logoImageAdapter.fromJson(reader);
                if (logoImage == null) {
                    throw c.q("logoImage", "logoImage", reader);
                }
            } else if (v11 == 1) {
                pageControls = this.pageControlsAdapter.fromJson(reader);
                if (pageControls == null) {
                    throw c.q("pageControls", "pageControls", reader);
                }
            } else if (v11 == 2) {
                skipButton = this.skipButtonAdapter.fromJson(reader);
                if (skipButton == null) {
                    throw c.q("skipButton", "skipButton", reader);
                }
            } else if (v11 == 3) {
                list = this.listOfPageItemAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("pages", "pages", reader);
                }
            } else if (v11 == 4) {
                str = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (logoImage == null) {
            throw c.j("logoImage", "logoImage", reader);
        }
        if (pageControls == null) {
            throw c.j("pageControls", "pageControls", reader);
        }
        if (skipButton == null) {
            throw c.j("skipButton", "skipButton", reader);
        }
        if (list != null) {
            return new AppOnboardingDTO(logoImage, pageControls, skipButton, list, str);
        }
        throw c.j("pages", "pages", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AppOnboardingDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("logoImage");
        this.logoImageAdapter.mo44toJson(writer, (x) value.getLogoImage());
        writer.w("pageControls");
        this.pageControlsAdapter.mo44toJson(writer, (x) value.getPageControls());
        writer.w("skipButton");
        this.skipButtonAdapter.mo44toJson(writer, (x) value.getSkipButton());
        writer.w("pages");
        this.listOfPageItemAdapter.mo44toJson(writer, (x) value.getPages());
        writer.w("shapeImage");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getShapeImage());
        writer.p();
    }
}
