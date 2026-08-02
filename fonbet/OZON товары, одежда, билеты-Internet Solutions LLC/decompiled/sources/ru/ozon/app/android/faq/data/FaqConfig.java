package ru.ozon.app.android.faq.data;

import Tc.b;
import android.app.Application;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.faq.data.model.FaqWidgetDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0016B\u001d\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/faq/data/FaqConfig;", "Lj20/a;", "", "", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "Landroid/app/Application;", "application", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Landroid/app/Application;)V", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "createBeginIslandSeparator", "()Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "createBetweenIslandSeparator", "createSpacer", "Lj20/b;", "state", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Landroid/app/Application;", "Companion", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FaqConfig implements InterfaceC7243a<List<? extends Object>> {

    @NotNull
    private final Application application;

    @NotNull
    private final JsonParser deserializer;

    public FaqConfig(@NotNull JsonParser deserializer, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(application, "application");
        this.deserializer = deserializer;
        this.application = application;
    }

    private final IslandSeparatorDTO createBeginIslandSeparator() {
        return new IslandSeparatorDTO(Integer.valueOf(AppTokensProvider.IslandSeparatorHeight.INSTANCE.between()), UniColors.LAYER_FLOOR_0.getToken(), IslandSeparatorDTO.Configuration.SECTION_BEGIN, null, null, null);
    }

    private final IslandSeparatorDTO createBetweenIslandSeparator() {
        return new IslandSeparatorDTO(Integer.valueOf(AppTokensProvider.IslandSeparatorHeight.INSTANCE.between()), UniColors.LAYER_FLOOR_0.getToken(), IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS, null, null, null);
    }

    private final IslandSeparatorDTO createSpacer() {
        return new IslandSeparatorDTO(4, UniColors.LAYER_FLOOR_1.getToken(), IslandSeparatorDTO.Configuration.WITHOUT_CORNERS, null, null, null);
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
        FaqWidgetDTO faqWidgetDTO = (FaqWidgetDTO) this.deserializer.fromJson(state.b(), FaqWidgetDTO.class);
        boolean isSelect = AppTokensProvider.INSTANCE.isSelect(this.application);
        b builder = C7714v.B();
        if (isSelect) {
            builder.add(createBeginIslandSeparator());
        }
        List<FaqWidgetDTO.Topic> topics = faqWidgetDTO.getTopics();
        if (topics != null) {
            int i11 = 0;
            for (Object obj : topics) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                builder.add((FaqWidgetDTO.Topic) obj);
                if (isSelect) {
                    builder.add(createSpacer());
                    if (i11 != C7714v.P(faqWidgetDTO.getTopics())) {
                        builder.add(createBetweenIslandSeparator());
                    }
                }
                i11 = i12;
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
