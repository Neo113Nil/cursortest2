package ru.ozon.app.android.ugc.core.widgets.listreviews.core;

import Tc.b;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.core.widgets.listreviews.data.ListReviewsDTO;
import ru.ozon.app.android.ugc.core.widgets.listreviews.data.SortsWrapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.SingleReviewDTOMappersKt;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 #2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001#B\u0013\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J)\u0010\u0014\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00030\r2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00030\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/core/ListReviewsParser;", "Lj20/a;", "", "", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO;", "dto", "parseDto", "(Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO;)Ljava/util/List;", "", "", "addSort", "(Ljava/util/List;Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO;)V", "addMoreReviews", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO;", "reviews", "addReviewsWithSeparators", "(Ljava/util/List;Ljava/util/List;)V", "addSeparators", "(Ljava/util/List;)V", "Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "getSeparatorDTO", "()Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "getIslandSeparatorDTO", "()Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "Lj20/b;", "state", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ListReviewsParser implements InterfaceC7243a<List<? extends Object>> {

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/core/ListReviewsParser$Companion;", "", "<init>", "()V", "SECTION_TOP_PADDING", "", "BETWEEN_SECTIONS_PADDING", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ListReviewsParser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final void addMoreReviews(List<Object> list, ListReviewsDTO listReviewsDTO) {
        ListReviewsDTO.MoreReviews moreReviews = listReviewsDTO.getMoreReviews();
        if (moreReviews != null) {
            list.add(moreReviews);
        }
    }

    private final void addReviewsWithSeparators(List<Object> list, List<SingleReviewDTO> list2) {
        if (list2 != null) {
            int i11 = 0;
            for (Object obj : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                list.add(SingleReviewDTOMappersKt.toSubDTOList((SingleReviewDTO) obj));
                if (i11 != C7714v.P(list2)) {
                    addSeparators(list);
                }
                i11 = i12;
            }
        }
    }

    private final void addSeparators(List<Object> list) {
        list.add(getIslandSeparatorDTO());
        list.add(getSeparatorDTO());
    }

    private final void addSort(List<Object> list, ListReviewsDTO listReviewsDTO) {
        List<ListReviewsDTO.Sort> sort = listReviewsDTO.getSort();
        if (sort != null) {
            list.add(new SortsWrapper(sort, false, 2, null));
        }
    }

    private final IslandSeparatorDTO getIslandSeparatorDTO() {
        return new IslandSeparatorDTO(4, UniColors.LAYER_FLOOR_0.getToken(), IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS, null, null, null);
    }

    private final SeparatorDTO getSeparatorDTO() {
        return new SeparatorDTO(null, 16, UniColors.LAYER_FLOOR_1.getToken());
    }

    private final List<Object> parseDto(ListReviewsDTO dto) {
        b builder = C7714v.B();
        addSort(builder, dto);
        addReviewsWithSeparators(builder, dto.getReviews());
        addMoreReviews(builder, dto);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
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
        return j.b();
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return parseDto((ListReviewsDTO) this.jsonDeserializer.fromJson(state.b(), ListReviewsDTO.class));
    }
}
