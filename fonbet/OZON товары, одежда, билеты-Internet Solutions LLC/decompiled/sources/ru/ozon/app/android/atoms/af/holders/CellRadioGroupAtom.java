package ru.ozon.app.android.atoms.af.holders;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$layout;
import ru.ozon.app.android.atoms.data.deprecated.Cell;
import ru.ozon.app.android.atoms.data.deprecated.CellRadioGroup;
import ru.ozon.app.android.atoms.databinding.AtomCellRadioGroupBinding;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00030\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/CellRadioGroupAtom;", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/app/android/atoms/data/deprecated/CellRadioGroup;", "Lru/ozon/app/android/atoms/af/holders/CellRadioGroupAtom$Configuration;", "Landroid/view/View;", "view", "", "atomContext", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;)V", "configuration", "", "onConfigureView", "(Lru/ozon/app/android/atoms/af/holders/CellRadioGroupAtom$Configuration;)V", "item", "onBind", "(Lru/ozon/app/android/atoms/data/deprecated/CellRadioGroup;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "withAction", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/app/android/atoms/databinding/AtomCellRadioGroupBinding;", "binding", "Lru/ozon/app/android/atoms/databinding/AtomCellRadioGroupBinding;", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "defaultConfigurations", "Ljava/util/Map;", "getDefaultConfigurations", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "adapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Configuration", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellRadioGroupAtom extends Atom<CellRadioGroup, Configuration> {

    @NotNull
    private final AtomsAdapter adapter;

    @NotNull
    private final AtomCellRadioGroupBinding binding;

    @NotNull
    private final Map<Atom.ConfCondition, Configuration> defaultConfigurations;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u0016¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/CellRadioGroupAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Configuration implements Atom.AtomConfiguration {
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;

        public Configuration() {
            this(0, 0, 0, 0, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.paddingStart == configuration.paddingStart && this.paddingEnd == configuration.paddingEnd && this.paddingTop == configuration.paddingTop && this.paddingBottom == configuration.paddingBottom;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingBottom() {
            return this.paddingBottom;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingEnd() {
            return this.paddingEnd;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingStart() {
            return this.paddingStart;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingTop() {
            return this.paddingTop;
        }

        public int hashCode() {
            return Integer.hashCode(this.paddingBottom) + C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31);
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingBottom(int i11) {
            this.paddingBottom = i11;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingEnd(int i11) {
            this.paddingEnd = i11;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingStart(int i11) {
            this.paddingStart = i11;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingTop(int i11) {
            this.paddingTop = i11;
        }

        @NotNull
        public String toString() {
            return P.a(this.paddingTop, this.paddingBottom, ", paddingBottom=", ")", C2438a.a("Configuration(paddingStart=", this.paddingStart, ", paddingEnd=", ", paddingTop=", this.paddingEnd));
        }

        public Configuration(int i11, int i12, int i13, int i14) {
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
        }

        public /* synthetic */ Configuration(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? 16 : i11, (i15 & 2) != 0 ? 16 : i12, (i15 & 4) != 0 ? 8 : i13, (i15 & 8) != 0 ? 8 : i14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellRadioGroupAtom(@NotNull View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        AtomCellRadioGroupBinding bind = AtomCellRadioGroupBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.defaultConfigurations = U.i(new Pair(new Atom.ConfCondition(Cell.CellDefault.class, null, 2, null), new Configuration(0, 0, 0, 0, 15, null)));
        this.adapter = new AtomsAdapter(null, null, null, null, 15, null);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Map<Atom.ConfCondition, Configuration> getDefaultConfigurations() {
        return this.defaultConfigurations;
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Atom<CellRadioGroup, Configuration> withAction(Function1<? super AtomAction, Unit> onAction) {
        this.adapter.setOnAction(onAction);
        return super.withAction(onAction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull CellRadioGroup item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.titleTv.setText(item.getTitle());
        this.adapter.bind(getContext(), item.getRadioList());
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        getContainerView().setPadding(ResourceExtKt.toPx(configuration.getPaddingStart()), ResourceExtKt.toPx(configuration.getPaddingTop()), ResourceExtKt.toPx(configuration.getPaddingEnd()), ResourceExtKt.toPx(configuration.getPaddingBottom()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CellRadioGroupAtom(@NotNull Context context, String str) {
        this(r3, str);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, R$layout.atom_cell_radio_group, null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding.itemsVAL.setAdapter(this.adapter);
    }
}
