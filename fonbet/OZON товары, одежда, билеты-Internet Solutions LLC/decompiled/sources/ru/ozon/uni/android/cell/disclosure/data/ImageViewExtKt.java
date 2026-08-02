package ru.ozon.uni.android.cell.disclosure.data;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"withDisclosureViewPreset", "Landroidx/appcompat/widget/AppCompatImageView;", "preset", "Lru/ozon/uni/android/cell/disclosure/data/DisclosureAddonWrapperPreset;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageViewExtKt {
    @NotNull
    public static final AppCompatImageView withDisclosureViewPreset(@NotNull AppCompatImageView appCompatImageView, @NotNull DisclosureAddonWrapperPreset preset) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "<this>");
        Intrinsics.checkNotNullParameter(preset, "preset");
        int px = UiExtKt.toPx(preset.getImageSize());
        appCompatImageView.setImageResource(R$drawable.ic_m_chevron_right);
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(px, px));
        return appCompatImageView;
    }
}
