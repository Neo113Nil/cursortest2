package ru.ozon.uni.atoms.af.layout;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.FrameAtomsDecorator;
import ru.ozon.uni.atoms.af.HorizontalAtomsDecorator;
import ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/atoms/af/layout/DefaultAtomDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "Lru/ozon/uni/atoms/af/HorizontalAtomsDecorator;", "Lru/ozon/uni/atoms/af/FrameAtomsDecorator;", "Lru/ozon/uni/atoms/af/HorizontalFlexAtomsDecorator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultAtomDecorator extends AtomDecorator implements VerticalAtomsDecorator, HorizontalAtomsDecorator, FrameAtomsDecorator, HorizontalFlexAtomsDecorator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAtomDecorator(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
    public int horizontalDividerDrawable() {
        return HorizontalFlexAtomsDecorator.DefaultImpls.horizontalDividerDrawable(this);
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
    public int justifyContent() {
        return HorizontalFlexAtomsDecorator.DefaultImpls.justifyContent(this);
    }

    @Override // ru.ozon.uni.atoms.af.FrameAtomsDecorator
    @NotNull
    public FrameLayout.LayoutParams modifyFrameLayoutParams(@NotNull FrameLayout.LayoutParams layoutParams, @NotNull AtomDTO atomDTO, int i11, boolean z11) {
        return FrameAtomsDecorator.DefaultImpls.modifyFrameLayoutParams(this, layoutParams, atomDTO, i11, z11);
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalAtomsDecorator
    @NotNull
    public LinearLayout.LayoutParams modifyHorizontalLayoutParams(@NotNull LinearLayout.LayoutParams layoutParams, @NotNull AtomDTO atomDTO, int i11, boolean z11) {
        return HorizontalAtomsDecorator.DefaultImpls.modifyHorizontalLayoutParams(this, layoutParams, atomDTO, i11, z11);
    }

    @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
    @NotNull
    public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams layoutParams, @NotNull AtomDTO atomDTO, int i11, boolean z11) {
        return VerticalAtomsDecorator.DefaultImpls.modifyVerticalLayoutParams(this, layoutParams, atomDTO, i11, z11);
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
    public int showDividerHorizontal() {
        return HorizontalFlexAtomsDecorator.DefaultImpls.showDividerHorizontal(this);
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
    public int showDividerVertical() {
        return HorizontalFlexAtomsDecorator.DefaultImpls.showDividerVertical(this);
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
    @NotNull
    public FlexboxLayout.a modifyVerticalLayoutParams(@NotNull FlexboxLayout.a aVar, @NotNull AtomDTO atomDTO, int i11, boolean z11) {
        return HorizontalFlexAtomsDecorator.DefaultImpls.modifyVerticalLayoutParams(this, aVar, atomDTO, i11, z11);
    }
}
