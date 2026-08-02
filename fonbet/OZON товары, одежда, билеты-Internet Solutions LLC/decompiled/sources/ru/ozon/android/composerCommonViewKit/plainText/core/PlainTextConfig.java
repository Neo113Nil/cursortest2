package ru.ozon.android.composerCommonViewKit.plainText.core;

import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.composerCommonViewKit.plainText.data.PlainTextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR*\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u000bj\b\u0012\u0004\u0012\u00020\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/android/composerCommonViewKit/plainText/core/PlainTextConfig;", "Lj20/a;", "Lru/ozon/android/composerCommonViewKit/plainText/data/PlainTextDTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "state", "parse", "(Lj20/b;)Lru/ozon/android/composerCommonViewKit/plainText/data/PlainTextDTO;", "Lkotlin/Function1;", "Lru/ozon/android/composerCommonViewKit/parsing/WidgetParser;", "parser", "Lkotlin/jvm/functions/Function1;", "Companion", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlainTextConfig implements InterfaceC7243a<PlainTextDTO> {

    @NotNull
    private final Function1<C7244b, PlainTextDTO> parser;

    public PlainTextConfig(@NotNull final JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.parser = new Function1<C7244b, PlainTextDTO>() { // from class: ru.ozon.android.composerCommonViewKit.plainText.core.PlainTextConfig$special$$inlined$getDefaultWidgetParser$1
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, ru.ozon.android.composerCommonViewKit.plainText.data.PlainTextDTO] */
            @Override // kotlin.jvm.functions.Function1
            public PlainTextDTO invoke(C7244b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return JsonParser.this.fromJson(state.b(), PlainTextDTO.class);
            }
        };
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
    public PlainTextDTO parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return this.parser.invoke(state);
    }
}
