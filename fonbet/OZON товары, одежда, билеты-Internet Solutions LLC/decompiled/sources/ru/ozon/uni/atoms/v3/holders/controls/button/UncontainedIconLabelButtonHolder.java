package ru.ozon.uni.atoms.v3.holders.controls.button;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.controls.button.UncontainedIconLabelButtonView;
import ru.ozon.uni.atoms.data.controls.button.ButtonColorSettingsKt;
import ru.ozon.uni.atoms.data.controls.button.IconSide;
import ru.ozon.uni.atoms.data.controls.button.UncontainedIconLabelButtonDTO;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureTitleSubtitleCellHolderKt;

@InterfaceC3999a
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0016\u0010\u000f\u001a\u00020\r*\u00020\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/controls/button/UncontainedIconLabelButtonHolder;", "Lru/ozon/uni/atoms/v3/holders/controls/button/ButtonAtomHolder;", "Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "Lru/ozon/uni/android/controls/button/UncontainedIconLabelButtonView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/controls/button/UncontainedIconLabelButtonView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "applyStyle", "style", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UncontainedIconLabelButtonHolder extends ButtonAtomHolder<UncontainedIconLabelButtonDTO, UncontainedIconLabelButtonView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UncontainedIconLabelButtonHolder(@NotNull UncontainedIconLabelButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final void applyStyle(UncontainedIconLabelButtonView uncontainedIconLabelButtonView, int i11) {
        TypedArray obtainStyledAttributes = uncontainedIconLabelButtonView.getContext().obtainStyledAttributes(i11, R$styleable.UncontainedIconLabelButtonView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        uncontainedIconLabelButtonView.setTitleColorDefault$uni_release(obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_mainTextColor, uncontainedIconLabelButtonView.getDefaultBackgroundColor()));
        uncontainedIconLabelButtonView.setTitleColorActive$uni_release(obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_mainTextColorActive, uncontainedIconLabelButtonView.getTitleColorDefault()));
        uncontainedIconLabelButtonView.setTitleColorDisabled$uni_release(obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_mainTextColorDisabled, uncontainedIconLabelButtonView.getTitleColorDefault()));
        uncontainedIconLabelButtonView.setSubTitleColorDefault$uni_release(obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_addonTextColor, uncontainedIconLabelButtonView.getTitleColorDefault()));
        uncontainedIconLabelButtonView.setSubTitleColorActive$uni_release(obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_addonTextColorActive, uncontainedIconLabelButtonView.getTitleColorDefault()));
        uncontainedIconLabelButtonView.setSubTitleColorDisabled$uni_release(obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_addonTextColorDisabled, uncontainedIconLabelButtonView.getTitleColorDefault()));
        uncontainedIconLabelButtonView.setIconColor$uni_release(obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_disclosureIconColor, -1));
        uncontainedIconLabelButtonView.setIconColorDisabled$uni_release(obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_disclosureIconColorDisabled, uncontainedIconLabelButtonView.getIconColor()));
        uncontainedIconLabelButtonView.setIconColorActive$uni_release(obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_disclosureIconColorActive, uncontainedIconLabelButtonView.getIconColor()));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UncontainedIconLabelButtonHolder(@NotNull Context context, String str) {
        this(new UncontainedIconLabelButtonView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull UncontainedIconLabelButtonDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((UncontainedIconLabelButtonHolder) item);
        UncontainedIconLabelButtonView uncontainedIconLabelButtonView = (UncontainedIconLabelButtonView) getContainerView();
        IconSide iconSide = item.getIconSide();
        if (iconSide == null) {
            iconSide = IconSide.END;
        }
        uncontainedIconLabelButtonView.setIconSide(iconSide);
        UncontainedIconLabelButtonDTO.Preset preset = item.getPreset();
        if (preset == null) {
            preset = UncontainedIconLabelButtonDTO.Preset.SIZE_400;
        }
        uncontainedIconLabelButtonView.setPreset(preset);
        applyStyle(uncontainedIconLabelButtonView, ButtonColorSettingsKt.getStyleResource(item.getStyle()));
        DisclosureTitleSubtitleCellHolderKt.bindCellData(uncontainedIconLabelButtonView.getMainView(), item.getTitle(), item.getSubtitle(), item.getIcon());
        Boolean isEnabled = item.isEnabled();
        uncontainedIconLabelButtonView.setButtonState(mapState(isEnabled != null ? isEnabled.booleanValue() : true));
    }
}
