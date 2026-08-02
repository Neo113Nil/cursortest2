package ru.ozon.app.android.bank.widgets.cbottom.core;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.p;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.io.ByteArrayInputStream;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.bank.widgets.cbottom.data.CbottomWidgetDTO;
import sf.G;
import sf.z;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\u0019B\u0015\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R4\u0010\u0017\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetConfig;", "Lj20/a;", "Lru/ozon/app/android/bank/widgets/cbottom/data/CbottomWidgetDTO;", "Lru/ozon/composer/network/widget/config/StateConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "Lru/ozon/composer/network/widget/config/WidgetParsedState;", "state", "parse", "(Lj20/b;)Lru/ozon/app/android/bank/widgets/cbottom/data/CbottomWidgetDTO;", "Lcom/squareup/moshi/Moshi;", "moshi$delegate", "LSc/j;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "moshi", "Lkotlin/Function2;", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "parser", "Lkotlin/jvm/functions/Function2;", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CbottomWidgetConfig implements InterfaceC7243a<CbottomWidgetDTO> {

    /* renamed from: moshi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j moshi;

    @NotNull
    private final Function2<String, String, CbottomWidgetDTO> parser;

    public CbottomWidgetConfig(@NotNull final JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.moshi = k.a(n.NONE, CbottomWidgetConfig$moshi$2.INSTANCE);
        this.parser = new Function2<String, String, CbottomWidgetDTO>() { // from class: ru.ozon.app.android.bank.widgets.cbottom.core.CbottomWidgetConfig$special$$inlined$getDefaultWidgetParser$1
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ru.ozon.app.android.bank.widgets.cbottom.data.CbottomWidgetDTO] */
            @Override // kotlin.jvm.functions.Function2
            public CbottomWidgetDTO invoke(String params, String state) {
                JsonParser jsonParser = JsonParser.this;
                if (state != null) {
                    return jsonParser.fromJson(state, CbottomWidgetDTO.class);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        };
    }

    private final Moshi getMoshi() {
        return (Moshi) this.moshi.getValue();
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
    public CbottomWidgetDTO parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        byte[] bytes = state.b().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        G source = z.d(z.k(new ByteArrayInputStream(bytes)));
        Intrinsics.checkNotNullParameter(source, "source");
        p pVar = new p(source);
        pVar.beginObject();
        String str = null;
        while (pVar.hasNext()) {
            if (Intrinsics.d(pVar.nextName(), "widgets")) {
                str = getMoshi().c(Object.class).toJson(pVar.t());
            } else {
                pVar.skipValue();
            }
        }
        pVar.endObject();
        return CbottomWidgetDTO.copy$default(this.parser.invoke(null, state.b()), str, null, null, null, null, null, 62, null);
    }
}
