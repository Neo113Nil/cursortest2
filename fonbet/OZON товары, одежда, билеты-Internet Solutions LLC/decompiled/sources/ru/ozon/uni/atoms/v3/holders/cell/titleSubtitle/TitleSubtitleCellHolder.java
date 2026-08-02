package ru.ozon.uni.atoms.v3.holders.cell.titleSubtitle;

import Sc.InterfaceC3999a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPresets;
import ru.ozon.uni.atoms.data.cell.TitleSubtitleCellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/cell/titleSubtitle/TitleSubtitleCellHolder;", "Lru/ozon/uni/atoms/v3/holders/cell/CellAtomHolder;", "Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TitleSubtitleCellHolder extends CellAtomHolder<TitleSubtitleCellDTO, TitleSubtitleCellView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleSubtitleCellHolder(@NotNull TitleSubtitleCellView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TitleSubtitleCellHolder(@NotNull Context context, String str) {
        this(new TitleSubtitleCellView(context, null, 0, 0, null, false, 62, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull TitleSubtitleCellDTO item) {
        TitleSubtitleWrapperPreset default500;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((TitleSubtitleCellHolder) item);
        TitleSubtitleCellView titleSubtitleCellView = (TitleSubtitleCellView) getContainerView();
        TitleSubtitleCellDTO.TitleSubtitleCellPreset preset = item.getPreset();
        if (preset == null || (default500 = preset.getPreset()) == null) {
            default500 = TitleSubtitleWrapperPresets.INSTANCE.getDefault500();
        }
        titleSubtitleCellView.setPreset(default500);
        TitleSubtitleCellHolderKt.bindCellData(titleSubtitleCellView, item.getTitle(), item.getSubtitle());
    }
}
