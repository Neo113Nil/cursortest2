package ru.ozon.app.android.atoms.af.holders;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.content.a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.switchmaterial.SwitchMaterial;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$layout;
import ru.ozon.app.android.atoms.af.holders.CellBaseAtom;
import ru.ozon.app.android.atoms.af.holders.CellToggleAtom;
import ru.ozon.app.android.atoms.data.deprecated.Cell;
import ru.ozon.app.android.atoms.databinding.AtomCellToggleBinding;
import ru.ozon.app.android.uikit.R$color;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0014J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/CellToggleAtom;", "Lru/ozon/app/android/atoms/af/holders/CellBaseAtom;", "Lru/ozon/app/android/atoms/data/deprecated/Cell$CellToggle;", "view", "Landroid/view/View;", "atomContext", "", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "binding", "Lru/ozon/app/android/atoms/databinding/AtomCellToggleBinding;", "defaultConfigurations", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "Lru/ozon/app/android/atoms/af/holders/CellBaseAtom$Configuration;", "getDefaultConfigurations", "()Ljava/util/Map;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "onBind", "", "item", "setSelectColors", "isSelect", "", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellToggleAtom extends CellBaseAtom<Cell.CellToggle> {

    @NotNull
    private final AtomCellToggleBinding binding;

    @NotNull
    private final Map<Atom.ConfCondition, CellBaseAtom.Configuration> defaultConfigurations;

    @NotNull
    private final CompoundButton.OnCheckedChangeListener listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellToggleAtom(@NotNull View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        AtomCellToggleBinding bind = AtomCellToggleBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.defaultConfigurations = U.i(new Pair(new Atom.ConfCondition(Cell.CellToggle.class, null, 2, null), new CellBaseAtom.Configuration(0, 0, 0, 0, null, 31, null)));
        this.listener = new CompoundButton.OnCheckedChangeListener() { // from class: Pl.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                CellToggleAtom.listener$lambda$2(CellToggleAtom.this, compoundButton, z11);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void listener$lambda$2(CellToggleAtom cellToggleAtom, CompoundButton compoundButton, boolean z11) {
        AtomAction atomAction;
        Cell.CellToggle cellToggle = (Cell.CellToggle) cellToggleAtom.getData();
        AtomActionDTO action = cellToggle.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, cellToggle.getTrackingInfo())) == null) {
            return;
        }
        cellToggleAtom.handleAction(atomAction);
    }

    private final void setSelectColors(boolean isSelect) {
        if (isSelect) {
            SwitchMaterial switchMaterial = this.binding.toggleS;
            switchMaterial.o(a.getColorStateList(switchMaterial.getContext(), R$color.switch_track_tint_select));
            switchMaterial.n(a.getColorStateList(switchMaterial.getContext(), R$color.switch_thumb_tint_select));
        }
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Map<Atom.ConfCondition, CellBaseAtom.Configuration> getDefaultConfigurations() {
        return this.defaultConfigurations;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull Cell.CellToggle item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = this.binding.titleTv;
        textView.setText(item.getTitle());
        textView.setEnabled(item.getAction() != null);
        TextView subtitleTv = this.binding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        TextViewExtKt.setTextOrGone(subtitleTv, item.getSubtitle());
        setSelectColors(item.isSelect());
        SwitchMaterial switchMaterial = this.binding.toggleS;
        switchMaterial.setOnCheckedChangeListener(null);
        switchMaterial.setChecked(item.isSelected());
        switchMaterial.setOnCheckedChangeListener(this.listener);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CellToggleAtom(@NotNull Context context, String str) {
        this(r3, str);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, R$layout.atom_cell_toggle, null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding.toggleS.setOnCheckedChangeListener(this.listener);
    }
}
