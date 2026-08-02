package ru.ozon.app.android.gallery.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.gallery.databinding.ActivityGalleryBinding;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class GalleryView$bindItems$1$3 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ ActivityGalleryBinding $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryView$bindItems$1$3(ActivityGalleryBinding activityGalleryBinding) {
        super(1);
        this.$this_with = activityGalleryBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        this.$this_with.viewPager.setCurrentItem(i11, true);
    }
}
