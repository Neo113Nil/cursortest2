package ru.ozon.uni.atoms.v3.holders.controls.tag;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.controls.tag.TagButtonView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/v3/holders/controls/tag/TagButtonHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TagButtonHolderKt$bind$provider$1 extends AbstractC7737t implements Function0<TagButtonHolder> {
    final /* synthetic */ TagButtonView $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TagButtonHolderKt$bind$provider$1(TagButtonView tagButtonView) {
        super(0);
        this.$this_bind = tagButtonView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TagButtonHolder invoke() {
        return new TagButtonHolder(this.$this_bind, (String) null);
    }
}
