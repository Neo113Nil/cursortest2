package ru.ozon.uni.atoms.v3.holders.controls.button;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.controls.button.UncontainedButtonView;
import ru.ozon.uni.atoms.data.controls.button.ButtonColorSettingsKt;
import ru.ozon.uni.atoms.data.controls.button.UncontainedButtonDTO;
import ru.ozon.uni.atoms.v3.holders.cell.titleSubtitle.TitleSubtitleCellHolderKt;

@InterfaceC3999a
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0016\u0010\u000f\u001a\u00020\r*\u00020\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/controls/button/UncontainedButtonHolder;", "Lru/ozon/uni/atoms/v3/holders/controls/button/ButtonAtomHolder;", "Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;", "Lru/ozon/uni/android/controls/button/UncontainedButtonView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/controls/button/UncontainedButtonView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "applyStyle", "style", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UncontainedButtonHolder extends ButtonAtomHolder<UncontainedButtonDTO, UncontainedButtonView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UncontainedButtonHolder(@NotNull UncontainedButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final void applyStyle(UncontainedButtonView uncontainedButtonView, int i11) {
        TypedArray obtainStyledAttributes = uncontainedButtonView.getContext().obtainStyledAttributes(i11, R$styleable.UncontainedButtonView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        uncontainedButtonView.setTitleColorDefault$uni_release(obtainStyledAttributes.getColor(R$styleable.UncontainedButtonView_mainTextColor, uncontainedButtonView.getDefaultBackgroundColor()));
        uncontainedButtonView.setTitleColorActive$uni_release(obtainStyledAttributes.getColor(R$styleable.UncontainedButtonView_mainTextColorActive, uncontainedButtonView.getTitleColorDefault()));
        uncontainedButtonView.setTitleColorDisabled$uni_release(obtainStyledAttributes.getColor(R$styleable.UncontainedButtonView_mainTextColorDisabled, uncontainedButtonView.getTitleColorDefault()));
        uncontainedButtonView.setSubTitleColorDefault$uni_release(obtainStyledAttributes.getColor(R$styleable.UncontainedButtonView_addonTextColor, uncontainedButtonView.getTitleColorDefault()));
        uncontainedButtonView.setSubTitleColorActive$uni_release(obtainStyledAttributes.getColor(R$styleable.UncontainedButtonView_addonTextColorActive, uncontainedButtonView.getTitleColorDefault()));
        uncontainedButtonView.setSubTitleColorDisabled$uni_release(obtainStyledAttributes.getColor(R$styleable.UncontainedButtonView_addonTextColorDisabled, uncontainedButtonView.getTitleColorDefault()));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UncontainedButtonHolder(@NotNull Context context, String str) {
        this(new UncontainedButtonView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull UncontainedButtonDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((UncontainedButtonHolder) item);
        UncontainedButtonView uncontainedButtonView = (UncontainedButtonView) getContainerView();
        UncontainedButtonDTO.Preset size = item.getSize();
        if (size == null) {
            size = UncontainedButtonDTO.Preset.SIZE_400;
        }
        uncontainedButtonView.setPreset(size);
        applyStyle(uncontainedButtonView, ButtonColorSettingsKt.getStyleResource(item.getStyle()));
        TitleSubtitleCellHolderKt.bindTitle(uncontainedButtonView.getMainView(), item.getTitle());
        TitleSubtitleCellHolderKt.bindSubTitle(uncontainedButtonView.getMainView(), item.getSubtitle());
        Boolean isEnabled = item.isEnabled();
        uncontainedButtonView.setButtonState(mapState(isEnabled != null ? isEnabled.booleanValue() : true));
    }
}
