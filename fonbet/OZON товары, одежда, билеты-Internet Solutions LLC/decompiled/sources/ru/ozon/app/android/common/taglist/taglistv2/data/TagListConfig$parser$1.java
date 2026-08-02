package ru.ozon.app.android.common.taglist.taglistv2.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/taglist/taglistv2/data/TagListDTO;", "paras", "", "state", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TagListConfig$parser$1 extends AbstractC7737t implements Function2<String, String, TagListDTO> {
    final /* synthetic */ TagListConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TagListConfig$parser$1(TagListConfig tagListConfig) {
        super(2);
        this.this$0 = tagListConfig;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TagListDTO invoke(String str, String str2) {
        JsonParser jsonParser;
        jsonParser = this.this$0.jsonDeserializer;
        Intrinsics.f(str2);
        return (TagListDTO) jsonParser.fromJson(str2, TagListDTO.class);
    }
}
