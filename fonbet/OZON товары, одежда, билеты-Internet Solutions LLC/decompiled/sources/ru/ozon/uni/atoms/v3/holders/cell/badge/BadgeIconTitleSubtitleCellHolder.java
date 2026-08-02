package ru.ozon.uni.atoms.v3.holders.cell.badge;

import Bl.b;
import Sc.InterfaceC3999a;
import android.content.Context;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.badge.badgeIconTitleSubtitleCell.BadgeIconTitleSubtitleCellView;
import ru.ozon.uni.android.cell.badge.badgeIconTitleSubtitleCell.data.BadgeIconTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.badge.badgeIconTitleSubtitleCell.data.BadgeIconTitleSubtitleWrapperPresets;
import ru.ozon.uni.atoms.data.cell.BadgeIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/cell/badge/BadgeIconTitleSubtitleCellHolder;", "Lru/ozon/uni/atoms/v3/holders/cell/CellAtomHolder;", "Lru/ozon/uni/atoms/data/cell/BadgeIconTitleSubtitleCellDTO;", "Lru/ozon/uni/android/cell/badge/badgeIconTitleSubtitleCell/BadgeIconTitleSubtitleCellView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/cell/badge/badgeIconTitleSubtitleCell/BadgeIconTitleSubtitleCellView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgeIconTitleSubtitleCellHolder extends CellAtomHolder<BadgeIconTitleSubtitleCellDTO, BadgeIconTitleSubtitleCellView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeIconTitleSubtitleCellHolder(@NotNull BadgeIconTitleSubtitleCellView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BadgeIconTitleSubtitleCellHolder(@NotNull Context context, String str) {
        this(r0 == null ? new BadgeIconTitleSubtitleCellView(context, null, 0, 0, null, false, 62, null) : r0, str);
        Intrinsics.checkNotNullParameter(context, "context");
        BadgeIconTitleSubtitleCellView badgeIconTitleSubtitleCellView = (BadgeIconTitleSubtitleCellView) b.a(BadgeIconTitleSubtitleCellView.class, "type", q.f64554a, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull BadgeIconTitleSubtitleCellDTO item) {
        BadgeIconTitleSubtitleWrapperPreset centerEnd500Shape500TopStart500Default500;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((BadgeIconTitleSubtitleCellHolder) item);
        BadgeIconTitleSubtitleCellView badgeIconTitleSubtitleCellView = (BadgeIconTitleSubtitleCellView) getContainerView();
        BadgeIconTitleSubtitleCellDTO.BadgeIconTitleSubtitleCellPreset preset = item.getPreset();
        if (preset == null || (centerEnd500Shape500TopStart500Default500 = preset.getPreset()) == null) {
            centerEnd500Shape500TopStart500Default500 = BadgeIconTitleSubtitleWrapperPresets.INSTANCE.getCenterEnd500Shape500TopStart500Default500();
        }
        badgeIconTitleSubtitleCellView.setPreset(centerEnd500Shape500TopStart500Default500);
        BadgeIconTitleSubtitleCellHolderKt.bindCellData(badgeIconTitleSubtitleCellView, item.getTitle(), item.getSubtitle(), item.getIcon(), item.getBadge());
    }
}
