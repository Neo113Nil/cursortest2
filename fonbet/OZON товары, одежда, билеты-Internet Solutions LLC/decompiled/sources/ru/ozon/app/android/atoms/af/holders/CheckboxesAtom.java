package ru.ozon.app.android.atoms.af.holders;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import Kk.C3532b;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$layout;
import ru.ozon.app.android.atoms.data.deprecated.Checkboxes;
import ru.ozon.app.android.atoms.databinding.AtomCheckboxesBinding;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002%&B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00030\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/CheckboxesAtom;", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/app/android/atoms/data/deprecated/Checkboxes;", "Lru/ozon/app/android/atoms/af/holders/CheckboxesAtom$Configuration;", "Landroid/view/View;", "view", "", "atomContext", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;)V", "configuration", "", "onConfigureView", "(Lru/ozon/app/android/atoms/af/holders/CheckboxesAtom$Configuration;)V", "item", "onBind", "(Lru/ozon/app/android/atoms/data/deprecated/Checkboxes;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "withAction", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/app/android/atoms/databinding/AtomCheckboxesBinding;", "binding", "Lru/ozon/app/android/atoms/databinding/AtomCheckboxesBinding;", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "defaultConfigurations", "Ljava/util/Map;", "getDefaultConfigurations", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "adapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "ItemsDecorator", "Configuration", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckboxesAtom extends Atom<Checkboxes, Configuration> {

    @NotNull
    private final AtomsAdapter adapter;

    @NotNull
    private final AtomCheckboxesBinding binding;

    @NotNull
    private final Map<Atom.ConfCondition, Configuration> defaultConfigurations;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/CheckboxesAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "", "topSeparator", "titleStyle", "<init>", "(IIIIZLjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "Z", "getTopSeparator", "()Z", "Ljava/lang/Integer;", "getTitleStyle", "()Ljava/lang/Integer;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Configuration implements Atom.AtomConfiguration {
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;
        private final Integer titleStyle;
        private final boolean topSeparator;

        public Configuration() {
            this(0, 0, 0, 0, false, null, 63, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.paddingStart == configuration.paddingStart && this.paddingEnd == configuration.paddingEnd && this.paddingTop == configuration.paddingTop && this.paddingBottom == configuration.paddingBottom && this.topSeparator == configuration.topSeparator && Intrinsics.d(this.titleStyle, configuration.titleStyle);
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

        public final Integer getTitleStyle() {
            return this.titleStyle;
        }

        public final boolean getTopSeparator() {
            return this.topSeparator;
        }

        public int hashCode() {
            int a11 = C3532b.a(C2454a.a(this.paddingBottom, C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31), 31), 31, this.topSeparator);
            Integer num = this.titleStyle;
            return a11 + (num == null ? 0 : num.hashCode());
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
            boolean z11 = this.topSeparator;
            Integer num = this.titleStyle;
            StringBuilder a11 = C2438a.a("Configuration(paddingStart=", i11, ", paddingEnd=", ", paddingTop=", i12);
            a.f(i13, i14, ", paddingBottom=", ", topSeparator=", a11);
            a11.append(z11);
            a11.append(", titleStyle=");
            a11.append(num);
            a11.append(")");
            return a11.toString();
        }

        public Configuration(int i11, int i12, int i13, int i14, boolean z11, Integer num) {
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
            this.topSeparator = z11;
            this.titleStyle = num;
        }

        public /* synthetic */ Configuration(int i11, int i12, int i13, int i14, boolean z11, Integer num, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? 16 : i11, (i15 & 2) != 0 ? 16 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14, (i15 & 16) != 0 ? false : z11, (i15 & 32) != 0 ? null : num);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/CheckboxesAtom$ItemsDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp1", "", "dp16", "paint", "Landroid/graphics/Paint;", "decorate", "", "canvas", "Landroid/graphics/Canvas;", "bounds", "Landroid/graphics/Rect;", "position", "last", "", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ItemsDecorator extends AtomDecorator implements VerticalAtomsDecorator {
        private final int dp1;
        private final int dp16;

        @NotNull
        private final Paint paint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemsDecorator(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            int px = toPx(1);
            this.dp1 = px;
            this.dp16 = toPx(16);
            Paint paint = new Paint(1);
            paint.setColor(g.b(context.getResources(), R$color.oz_semantic_separator, context.getTheme()));
            paint.setStrokeWidth(px);
            this.paint = paint;
        }

        @Override // ru.ozon.uni.atoms.af.AtomDecorator, ru.ozon.uni.atoms.af.CommonAtomDecorator
        public void decorate(@NotNull Canvas canvas, @NotNull Rect bounds, int position, boolean last) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            if (last) {
                return;
            }
            int i11 = bounds.bottom;
            int i12 = this.dp1;
            canvas.drawLine(bounds.left + this.dp16, i11 - i12, bounds.right, i11 - i12, this.paint);
        }

        @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
        @NotNull
        public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams layoutParams, @NotNull AtomDTO atomDTO, int i11, boolean z11) {
            return VerticalAtomsDecorator.DefaultImpls.modifyVerticalLayoutParams(this, layoutParams, atomDTO, i11, z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxesAtom(@NotNull View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        AtomCheckboxesBinding bind = AtomCheckboxesBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.defaultConfigurations = U.i(new Pair(new Atom.ConfCondition(Checkboxes.class, null, 2, null), new Configuration(0, 0, 0, 0, false, null, 63, null)));
        this.adapter = new AtomsAdapter(null, null, null, null, 15, null);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Map<Atom.ConfCondition, Configuration> getDefaultConfigurations() {
        return this.defaultConfigurations;
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Atom<Checkboxes, Configuration> withAction(Function1<? super AtomAction, Unit> onAction) {
        this.adapter.setOnAction(onAction);
        return super.withAction(onAction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull Checkboxes item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = this.binding.titleTv;
        Intrinsics.f(textView);
        OzonSpannableString text = item.getText();
        ViewExtKt.showOrGone(textView, Boolean.valueOf(!(text == null || h.K(text))));
        textView.setText(item.getText());
        this.adapter.bind(getContext(), item.getItems());
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        getContainerView().setPadding(0, 0, 0, ResourceExtKt.toPx(configuration.getPaddingBottom()));
        AtomCheckboxesBinding atomCheckboxesBinding = this.binding;
        View separatorV = atomCheckboxesBinding.separatorV;
        Intrinsics.checkNotNullExpressionValue(separatorV, "separatorV");
        ViewExtKt.showOrGone(separatorV, Boolean.valueOf(configuration.getTopSeparator()));
        atomCheckboxesBinding.contentTopSpace.getLayoutParams().height = ResourceExtKt.toPx(configuration.getPaddingTop());
        atomCheckboxesBinding.contentStartSpace.getLayoutParams().width = ResourceExtKt.toPx(configuration.getPaddingStart());
        atomCheckboxesBinding.contentEndSpace.getLayoutParams().width = ResourceExtKt.toPx(configuration.getPaddingEnd());
        Integer titleStyle = configuration.getTitleStyle();
        if (titleStyle != null) {
            atomCheckboxesBinding.titleTv.setTextAppearance(titleStyle.intValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckboxesAtom(@NotNull Context context, String str) {
        this(r0, str);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, R$layout.atom_checkboxes, null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding.itemsVAL.setAdapter(this.adapter);
        this.binding.itemsVAL.setDecorator(new ItemsDecorator(context));
    }
}
