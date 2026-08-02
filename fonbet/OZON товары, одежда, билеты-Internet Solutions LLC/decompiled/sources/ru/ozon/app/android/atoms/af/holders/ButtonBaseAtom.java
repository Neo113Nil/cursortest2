package ru.ozon.app.android.atoms.af.holders;

import Am.C2438a;
import Aw.ViewOnClickListenerC2448a;
import B0.C2454a;
import Ek.a;
import J0.P;
import Kk.C3532b;
import Sc.InterfaceC3999a;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.data.deprecated.CommonButton;
import ru.ozon.app.android.atoms.databinding.AtomButtonBorderlessBinding;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@InterfaceC3999a
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003:\u0002\u0013\u0014B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/ButtonBaseAtom;", "BaseDTO", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton;", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/app/android/atoms/af/holders/ButtonBaseAtom$Configuration;", "view", "Landroid/view/View;", "atomContext", "", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "binding", "Lru/ozon/app/android/atoms/databinding/AtomButtonBorderlessBinding;", "onConfigureView", "", "configuration", "onBind", "item", "(Lru/ozon/app/android/atoms/data/deprecated/CommonButton;)V", "Configuration", "InnerPaddings", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ButtonBaseAtom<BaseDTO extends CommonButton> extends Atom<BaseDTO, Configuration> {

    @NotNull
    private final AtomButtonBorderlessBinding binding;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b$\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/atoms/af/holders/ButtonBaseAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "", "hideBackground", "minimumHeight", "Lru/ozon/app/android/atoms/af/holders/ButtonBaseAtom$InnerPaddings;", "innerPaddings", "<init>", "(IIIIZILru/ozon/app/android/atoms/af/holders/ButtonBaseAtom$InnerPaddings;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "Z", "getHideBackground", "()Z", "getMinimumHeight", "Lru/ozon/app/android/atoms/af/holders/ButtonBaseAtom$InnerPaddings;", "getInnerPaddings", "()Lru/ozon/app/android/atoms/af/holders/ButtonBaseAtom$InnerPaddings;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class Configuration implements Atom.AtomConfiguration {
        private final boolean hideBackground;
        private final InnerPaddings innerPaddings;
        private final int minimumHeight;
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;

        public Configuration() {
            this(0, 0, 0, 0, false, 0, null, 127, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.paddingStart == configuration.paddingStart && this.paddingEnd == configuration.paddingEnd && this.paddingTop == configuration.paddingTop && this.paddingBottom == configuration.paddingBottom && this.hideBackground == configuration.hideBackground && this.minimumHeight == configuration.minimumHeight && Intrinsics.d(this.innerPaddings, configuration.innerPaddings);
        }

        public final boolean getHideBackground() {
            return this.hideBackground;
        }

        public final InnerPaddings getInnerPaddings() {
            return this.innerPaddings;
        }

        public final int getMinimumHeight() {
            return this.minimumHeight;
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
            int a11 = C2454a.a(this.minimumHeight, C3532b.a(C2454a.a(this.paddingBottom, C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31), 31), 31, this.hideBackground), 31);
            InnerPaddings innerPaddings = this.innerPaddings;
            return a11 + (innerPaddings == null ? 0 : innerPaddings.hashCode());
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
            int i11 = this.paddingStart;
            int i12 = this.paddingEnd;
            int i13 = this.paddingTop;
            int i14 = this.paddingBottom;
            boolean z11 = this.hideBackground;
            int i15 = this.minimumHeight;
            InnerPaddings innerPaddings = this.innerPaddings;
            StringBuilder a11 = C2438a.a("Configuration(paddingStart=", i11, ", paddingEnd=", ", paddingTop=", i12);
            a.f(i13, i14, ", paddingBottom=", ", hideBackground=", a11);
            a11.append(z11);
            a11.append(", minimumHeight=");
            a11.append(i15);
            a11.append(", innerPaddings=");
            a11.append(innerPaddings);
            a11.append(")");
            return a11.toString();
        }

        public Configuration(int i11, int i12, int i13, int i14, boolean z11, int i15, InnerPaddings innerPaddings) {
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
            this.hideBackground = z11;
            this.minimumHeight = i15;
            this.innerPaddings = innerPaddings;
        }

        public /* synthetic */ Configuration(int i11, int i12, int i13, int i14, boolean z11, int i15, InnerPaddings innerPaddings, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? 16 : i11, (i16 & 2) != 0 ? 16 : i12, (i16 & 4) != 0 ? 0 : i13, (i16 & 8) != 0 ? 0 : i14, (i16 & 16) != 0 ? false : z11, (i16 & 32) != 0 ? -1 : i15, (i16 & 64) != 0 ? null : innerPaddings);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/ButtonBaseAtom$InnerPaddings;", "", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "getPaddingEnd", "getPaddingTop", "getPaddingBottom", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class InnerPaddings {
        private final int paddingBottom;
        private final int paddingEnd;
        private final int paddingStart;
        private final int paddingTop;

        public InnerPaddings() {
            this(0, 0, 0, 0, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InnerPaddings)) {
                return false;
            }
            InnerPaddings innerPaddings = (InnerPaddings) other;
            return this.paddingStart == innerPaddings.paddingStart && this.paddingEnd == innerPaddings.paddingEnd && this.paddingTop == innerPaddings.paddingTop && this.paddingBottom == innerPaddings.paddingBottom;
        }

        public final int getPaddingBottom() {
            return this.paddingBottom;
        }

        public final int getPaddingEnd() {
            return this.paddingEnd;
        }

        public final int getPaddingStart() {
            return this.paddingStart;
        }

        public final int getPaddingTop() {
            return this.paddingTop;
        }

        public int hashCode() {
            return Integer.hashCode(this.paddingBottom) + C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.paddingTop, this.paddingBottom, ", paddingBottom=", ")", C2438a.a("InnerPaddings(paddingStart=", this.paddingStart, ", paddingEnd=", ", paddingTop=", this.paddingEnd));
        }

        public InnerPaddings(int i11, int i12, int i13, int i14) {
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
        }

        public /* synthetic */ InnerPaddings(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? 16 : i11, (i15 & 2) != 0 ? 16 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonBaseAtom(@NotNull View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        AtomButtonBorderlessBinding bind = AtomButtonBorderlessBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.buttonTv.setOnClickListener(new ViewOnClickListenerC2448a(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(ButtonBaseAtom buttonBaseAtom, View view) {
        AtomAction atomAction$default;
        CommonButton commonButton = (CommonButton) buttonBaseAtom.getData();
        AtomActionDTO action = commonButton.getAction();
        if (action == null || (atomAction$default = AtomActionMapperKt.toAtomAction$default(action, commonButton, commonButton.getTrackingInfo(), null, 4, null)) == null) {
            return;
        }
        buttonBaseAtom.handleAction(atomAction$default);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull BaseDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) getContainerView().findViewById(R$id.buttonTv);
        textView.setText(item.getText());
        if (item.getAction() == null) {
            ViewExtKt.disable(textView);
        } else {
            ViewExtKt.enable(textView);
        }
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        getContainerView().setPadding(ResourceExtKt.toPx(configuration.getPaddingStart()), ResourceExtKt.toPx(configuration.getPaddingTop()), ResourceExtKt.toPx(configuration.getPaddingEnd()), ResourceExtKt.toPx(configuration.getPaddingBottom()));
        if (configuration.getHideBackground()) {
            this.binding.buttonTv.setBackground(null);
        }
        if (configuration.getMinimumHeight() != -1) {
            this.binding.buttonTv.setMinHeight(ResourceExtKt.toPx(configuration.getMinimumHeight()));
            this.binding.buttonTv.setMinimumHeight(ResourceExtKt.toPx(configuration.getMinimumHeight()));
        }
        InnerPaddings innerPaddings = configuration.getInnerPaddings();
        if (innerPaddings != null) {
            this.binding.buttonTv.setPadding(ResourceExtKt.toPx(innerPaddings.getPaddingStart()), ResourceExtKt.toPx(innerPaddings.getPaddingTop()), ResourceExtKt.toPx(innerPaddings.getPaddingEnd()), ResourceExtKt.toPx(innerPaddings.getPaddingBottom()));
        }
    }
}
