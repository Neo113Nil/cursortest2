package ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.core;

import Tc.b;
import j20.C7244b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTOKt;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/core/StatusWidgetParser;", "Lkotlin/Function1;", "Lj20/b;", "", "Lru/ozon/android/composerCommonViewKit/parsing/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "jsonParser", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "state", "", "invoke", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StatusWidgetParser implements Function1<C7244b, Object> {

    @NotNull
    private final JsonParser jsonParser;

    public StatusWidgetParser(@NotNull JsonParser jsonParser) {
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        this.jsonParser = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public List<Object> invoke(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        b builder = C7714v.B();
        StatusWidgetDTO statusWidgetDTO = (StatusWidgetDTO) this.jsonParser.fromJson(state.b(), StatusWidgetDTO.class);
        builder.add(StatusWidgetDTOKt.extractEmptyStateV2TopPartModel(statusWidgetDTO));
        builder.add(StatusWidgetDTOKt.extractEmptyStateV2ButtonsModel(statusWidgetDTO));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
