package ru.ozon.uni.android.controls.chip;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.wrappers.main.chip.ChipWrapper;
import ru.ozon.uni.android.wrappers.mainaddon.data.LayoutPadding;
import ru.ozon.uni.atoms.data.controls.chip.IconChipDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001*B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/uni/android/controls/chip/IconChipView;", "Lru/ozon/uni/android/wrappers/main/chip/ChipWrapper;", "Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "onChipEnabled", "()V", "onChipDisabled", "onChipPressed", "onChipSelected", "icon", "setIconGraphic", "(I)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/controls/chip/IconChipDTO$IconChipSize;", "size", "Lru/ozon/uni/atoms/data/controls/chip/IconChipDTO$IconChipSize;", "getSize", "()Lru/ozon/uni/atoms/data/controls/chip/IconChipDTO$IconChipSize;", "setSize", "(Lru/ozon/uni/atoms/data/controls/chip/IconChipDTO$IconChipSize;)V", "mainView", "Lru/ozon/uni/android/atom/icon/IconView;", "getMainView", "()Lru/ozon/uni/android/atom/icon/IconView;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconChipView extends ChipWrapper<IconView> implements AtomView, AtomLocatableView {

    @NotNull
    private String locatorTag;

    @NotNull
    private final IconView mainView;

    @NotNull
    private IconChipDTO.IconChipSize size;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/android/controls/chip/IconChipView$Companion;", "", "<init>", "()V", "ICON_CHIP_LOCATOR_TAG", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ IconChipView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.Chip_AspectPrimary : i12);
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @Override // ru.ozon.uni.android.wrappers.main.chip.ChipWrapper
    public void onChipDisabled() {
    }

    @Override // ru.ozon.uni.android.wrappers.main.chip.ChipWrapper
    public void onChipEnabled() {
    }

    @Override // ru.ozon.uni.android.wrappers.main.chip.ChipWrapper
    public void onChipPressed() {
    }

    @Override // ru.ozon.uni.android.wrappers.main.chip.ChipWrapper
    public void onChipSelected() {
    }

    public final void setIconGraphic(int icon) {
        getMainView().setGraphic(Integer.valueOf(icon));
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    public final void setSize(@NotNull IconChipDTO.IconChipSize value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.size = value;
        getMainView().setShape(this.size.getIconSettings().getIconShape());
        getMainView().setSize(this.size.getIconSettings().getIconSize());
        setSettings(this.size.getSettings());
        setPadding(new LayoutPadding.all(this.size.getSettings().getPaddingLeft().getPadding()));
    }

    @Override // ru.ozon.uni.android.wrappers.main.chip.ChipWrapper
    @NotNull
    public IconView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconChipView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "iconChip";
        IconChipDTO.IconChipSize iconChipSize = IconChipDTO.IconChipSize.SIZE_500;
        this.size = iconChipSize;
        IconView iconView = new IconView(context, attributeSet, i11);
        iconView.setShape(this.size.getIconSettings().getIconShape());
        iconView.setSize(this.size.getIconSettings().getIconSize());
        this.mainView = iconView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IconChipView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setSize(((IconChipDTO.IconChipSize[]) IconChipDTO.IconChipSize.getEntries().toArray(new IconChipDTO.IconChipSize[0]))[obtainStyledAttributes.getInt(R$styleable.IconChipView_chipSize, iconChipSize.ordinal())]);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.IconChipView_graphic, -1);
        if (resourceId != -1) {
            setIconGraphic(resourceId);
        }
        obtainStyledAttributes.recycle();
        ChipWrapper.setView$default(this, false, 1, null);
        setContentDescription(getLocatorTag());
    }
}
