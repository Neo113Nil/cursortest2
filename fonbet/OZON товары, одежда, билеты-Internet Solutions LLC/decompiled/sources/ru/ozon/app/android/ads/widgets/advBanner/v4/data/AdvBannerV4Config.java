package ru.ozon.app.android.ads.widgets.advBanner.v4.data;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.ads.widgets.advBanner.v4.data.AdvBannerV4DTO;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4ItemVO;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001d\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4Config;", "Lj20/a;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Landroid/content/Context;)V", "", "isInvalidDTO", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO;)Z", "Lj20/b;", "state", "parse", "(Lj20/b;)Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Landroid/content/Context;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4ImagePrefetcher;", "imagePrefetcher", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4ImagePrefetcher;", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvBannerV4Config implements InterfaceC7243a<AdvBannerV4DTO> {

    @NotNull
    private final Context context;

    @NotNull
    private final AdvBannerV4ImagePrefetcher imagePrefetcher;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final long[] supportedVersions;

    public AdvBannerV4Config(@NotNull JsonParser jsonDeserializer, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.jsonDeserializer = jsonDeserializer;
        this.context = context;
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        this.imagePrefetcher = new AdvBannerV4ImagePrefetcher(networkComponentApi.getFeatureService(), networkComponentApi.getFeatureChecker(), context, null, 8, null);
        this.supportedVersions = new long[]{4};
    }

    private final boolean isInvalidDTO(AdvBannerV4DTO advBannerV4DTO) {
        return advBannerV4DTO.getItems().isEmpty() || AdvBannerV4MapperKt.toDesignTypeVo(advBannerV4DTO.getDesignType()).getType() == AdvBannerV4ItemVO.DesignTypeVO.Type.UNKNOWN;
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        InterfaceC7243a.C1128a.a(c7244b);
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return M.f71699a;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return this.supportedVersions;
    }

    @Override // j20.InterfaceC7243a
    public AdvBannerV4DTO parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        AdvBannerV4DTO advBannerV4DTO = (AdvBannerV4DTO) this.jsonDeserializer.fromJson(state.b(), AdvBannerV4DTO.class);
        if (isInvalidDTO(advBannerV4DTO)) {
            return null;
        }
        AdvBannerV4ImagePrefetcher advBannerV4ImagePrefetcher = this.imagePrefetcher;
        List<AdvBannerV4DTO.ItemDTO> items = advBannerV4DTO.getItems();
        Double aspectRation = advBannerV4DTO.getAspectRation();
        advBannerV4ImagePrefetcher.prefetch(items, aspectRation != null ? Float.valueOf((float) aspectRation.doubleValue()) : null, state.a().c());
        return advBannerV4DTO;
    }
}
