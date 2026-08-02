package ru.ozon.uni.atoms.v3.holders.controls.button;

import Sc.InterfaceC3999a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.button.DataButtonView;
import ru.ozon.uni.atoms.data.controls.button.ButtonColorSettingsKt;
import ru.ozon.uni.atoms.data.controls.button.DataButtonDTO;
import ru.ozon.uni.atoms.v3.holders.cell.dataCell.DataTitleSubtitleCellHolderKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/controls/button/DataButtonHolder;", "Lru/ozon/uni/atoms/v3/holders/controls/button/ButtonAtomHolder;", "Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO;", "Lru/ozon/uni/android/controls/button/DataButtonView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/controls/button/DataButtonView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataButtonHolder extends ButtonAtomHolder<DataButtonDTO, DataButtonView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataButtonHolder(@NotNull DataButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataButtonHolder(@NotNull Context context, String str) {
        this(new DataButtonView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull DataButtonDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((DataButtonHolder) item);
        DataButtonView dataButtonView = (DataButtonView) getContainerView();
        Boolean isContentCentered = item.isContentCentered();
        dataButtonView.setContentCentered(isContentCentered != null ? isContentCentered.booleanValue() : true);
        DataButtonDTO.Preset preset = item.getPreset();
        if (preset == null) {
            preset = DataButtonDTO.Preset.SIZE_500;
        }
        dataButtonView.setPreset(preset);
        dataButtonView.applyStyle$uni_release(ButtonColorSettingsKt.getStyleResource(item.getStyle()));
        DataTitleSubtitleCellHolderKt.bindCellData(dataButtonView.getMainView(), item.getTitle(), item.getSubtitle(), item.getData());
        Boolean isEnabled = item.isEnabled();
        dataButtonView.setButtonState(mapState(isEnabled != null ? isEnabled.booleanValue() : true));
    }
}
