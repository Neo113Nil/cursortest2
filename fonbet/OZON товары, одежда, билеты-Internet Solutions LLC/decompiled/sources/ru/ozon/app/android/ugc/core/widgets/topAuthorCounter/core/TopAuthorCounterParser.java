package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core;

import Tc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopAuthorCounterDTO;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopContainerDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/core/TopAuthorCounterParser;", "", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "invoke", "", "jsonState", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopAuthorCounterParser {

    @NotNull
    private final JsonParser jsonDeserializer;

    public TopAuthorCounterParser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    @NotNull
    public final List<Object> invoke(@NotNull String jsonState) {
        List<Object> content;
        Intrinsics.checkNotNullParameter(jsonState, "jsonState");
        TopAuthorCounterDTO topAuthorCounterDTO = (TopAuthorCounterDTO) this.jsonDeserializer.fromJson(jsonState, TopAuthorCounterDTO.class);
        b builder = C7714v.B();
        TopContainerDTO topContainer = topAuthorCounterDTO.getTopContainer();
        if (topContainer != null && (content = topContainer.getContent()) != null) {
            builder.addAll(content);
        }
        builder.add(topAuthorCounterDTO);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
