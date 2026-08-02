package ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core;

import Tg.a;
import Vg.c;
import d00.C6020f;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "deserializer", "Lkotlin/Function1;", "Lk20/g;", "LVg/c;", "customActionHandlersStore", "LTg/a;", "actionNavigator", "Ln20/i;", "commonButtonStackWidget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ln20/i;", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonStackConfigKt {
    @NotNull
    public static final i commonButtonStackWidget(@NotNull JsonParser deserializer, Function1<? super C7475g, ? extends c> function1, @NotNull Function1<? super C7475g, ? extends a> actionNavigator) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(actionNavigator, "actionNavigator");
        return C6020f.a("common", "buttonStack", ButtonStackConfig.INSTANCE.getSupportedVersions(), new ButtonStackConfigKt$commonButtonStackWidget$2(deserializer, actionNavigator, function1));
    }
}
