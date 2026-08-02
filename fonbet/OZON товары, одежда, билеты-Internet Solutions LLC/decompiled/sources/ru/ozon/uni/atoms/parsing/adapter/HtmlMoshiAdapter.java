package ru.ozon.uni.atoms.parsing.adapter;

import androidx.core.text.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.h;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.UniGlobalConfig;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/parsing/adapter/HtmlMoshiAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "<init>", "()V", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HtmlMoshiAdapter extends JsonAdapter<OzonSpannableString> {
    public static final int $stable = 0;

    @Override // com.squareup.moshi.JsonAdapter
    @h
    public OzonSpannableString fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String nextString = reader.nextString();
        if (nextString != null) {
            return OzonHtmlParser.Companion.parseHtml$default(OzonHtmlParser.INSTANCE, nextString, 0, 2, null);
        }
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @C
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OzonSpannableString value) {
        String str;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value != null) {
            str = b.c(value);
            boolean removeExtraHtmlParsingNewLines = UniGlobalConfig.INSTANCE.getRemoveExtraHtmlParsingNewLines();
            Intrinsics.f(str);
            if (removeExtraHtmlParsingNewLines) {
                str = kotlin.text.h.U(str, "\n");
            }
        } else {
            str = null;
        }
        writer.v(str);
    }
}
