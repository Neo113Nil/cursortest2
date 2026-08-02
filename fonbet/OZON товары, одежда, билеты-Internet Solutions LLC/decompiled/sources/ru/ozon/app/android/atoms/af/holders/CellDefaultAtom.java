package ru.ozon.app.android.atoms.af.holders;

import Cw.ViewOnClickListenerC2787a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$layout;
import ru.ozon.app.android.atoms.af.holders.CellBaseAtom;
import ru.ozon.app.android.atoms.data.deprecated.Cell;
import ru.ozon.app.android.atoms.databinding.AtomCellDefaultBinding;
import ru.ozon.app.android.atoms.extensions.ClickableCiewKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.common.ImageLoader;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/CellDefaultAtom;", "Lru/ozon/app/android/atoms/af/holders/CellBaseAtom;", "Lru/ozon/app/android/atoms/data/deprecated/Cell$CellDefault;", "view", "Landroid/view/View;", "atomContext", "", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "binding", "Lru/ozon/app/android/atoms/databinding/AtomCellDefaultBinding;", "defaultConfigurations", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "Lru/ozon/app/android/atoms/af/holders/CellBaseAtom$Configuration;", "getDefaultConfigurations", "()Ljava/util/Map;", "onBind", "", "item", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellDefaultAtom extends CellBaseAtom<Cell.CellDefault> {

    @NotNull
    private final AtomCellDefaultBinding binding;

    @NotNull
    private final Map<Atom.ConfCondition, CellBaseAtom.Configuration> defaultConfigurations;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CellDefaultAtom(@NotNull View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        AtomCellDefaultBinding bind = AtomCellDefaultBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.defaultConfigurations = U.i(new Pair(new Atom.ConfCondition(Cell.CellDefault.class, null, 2, 0 == true ? 1 : 0), new CellBaseAtom.Configuration(0, 0, 0, 0, null, 31, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$2(CellDefaultAtom cellDefaultAtom, View view) {
        AtomAction atomAction$default;
        Cell.CellDefault cellDefault = (Cell.CellDefault) cellDefaultAtom.getData();
        AtomActionDTO action = cellDefault.getAction();
        if (action == null || (atomAction$default = AtomActionMapperKt.toAtomAction$default(action, cellDefault, cellDefault.getTrackingInfo(), null, 4, null)) == null) {
            return;
        }
        cellDefaultAtom.handleAction(atomAction$default);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Map<Atom.ConfCondition, CellBaseAtom.Configuration> getDefaultConfigurations() {
        return this.defaultConfigurations;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull Cell.CellDefault item) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(item, "item");
        AtomCellDefaultBinding atomCellDefaultBinding = this.binding;
        ConstraintLayout cellDefaultCl = atomCellDefaultBinding.cellDefaultCl;
        Intrinsics.checkNotNullExpressionValue(cellDefaultCl, "cellDefaultCl");
        ClickableCiewKt.switchClickable(cellDefaultCl, item.getAction() != null);
        atomCellDefaultBinding.titleTv.setText(item.getTitle());
        TextView subtitleTv = atomCellDefaultBinding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        TextViewExtKt.setTextOrGone(subtitleTv, item.getSubtitle());
        ImageView imageIv = atomCellDefaultBinding.imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
        ViewExtKt.showOrGone(imageIv, Boolean.valueOf((item.getImage() == null && getCurrentConfiguration().getDefaultIcon() == null) ? false : true));
        atomCellDefaultBinding.titleTv.setEnabled(item.getAction() != null);
        String image = item.getImage();
        if (image != null) {
            ImageLoader imageLoader = AtomConfig.INSTANCE.getImageLoader();
            ImageView imageIv2 = atomCellDefaultBinding.imageIv;
            Intrinsics.checkNotNullExpressionValue(imageIv2, "imageIv");
            imageLoader.load(imageIv2, image);
            return;
        }
        Integer defaultIcon = getCurrentConfiguration().getDefaultIcon();
        if (defaultIcon != null && (drawable = getContext().getDrawable(defaultIcon.intValue())) != null) {
            atomCellDefaultBinding.imageIv.setImageDrawable(drawable);
        } else {
            atomCellDefaultBinding.imageIv.setImageDrawable(null);
            Unit unit = Unit.f71690a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CellDefaultAtom(@NotNull Context context, String str) {
        this(r3, str);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, R$layout.atom_cell_default, null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding.cellDefaultCl.setOnClickListener(new ViewOnClickListenerC2787a(this, 2));
    }
}
