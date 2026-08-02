package ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.core;

import Vg.c;
import d00.C6020f;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "deserializer", "Lkotlin/Function1;", "Lk20/g;", "LVg/c;", "customActionHandlersStore", "Ln20/i;", "commonDisclaimerV2Widget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lkotlin/jvm/functions/Function1;)Ln20/i;", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonDisclaimerV2ConfigKt {
    @NotNull
    public static final i commonDisclaimerV2Widget(@NotNull JsonParser deserializer, Function1<? super C7475g, ? extends c> function1) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return C6020f.a("common", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, new long[]{2}, new CommonDisclaimerV2ConfigKt$commonDisclaimerV2Widget$1(deserializer, function1));
    }
}
