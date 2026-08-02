package ru.ozon.app.android.atoms.af.holders;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j.C7232a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.R$drawable;
import ru.ozon.app.android.atoms.R$layout;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;
import ru.ozon.app.android.atoms.databinding.AtomAnnotationBinding;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.common.ImageLoader;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.deprecated.Annotation;

@InterfaceC3999a
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0002H\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/AnnotationAtom;", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/data/deprecated/Annotation;", "Lru/ozon/app/android/atoms/af/holders/AnnotationAtom$Configuration;", "view", "Landroid/view/View;", "atomContext", "", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "binding", "Lru/ozon/app/android/atoms/databinding/AtomAnnotationBinding;", "defaultConfigurations", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "getDefaultConfigurations", "()Ljava/util/Map;", "controlAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "currentTrackingInfo", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onConfigureView", "", "configuration", "onBind", "item", "Configuration", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnnotationAtom extends Atom<Annotation, Configuration> {

    @NotNull
    private final AtomAnnotationBinding binding;

    @NotNull
    private final AtomsAdapter controlAdapter;
    private Map<String, TokenizedTrackingInfo> currentTrackingInfo;

    @NotNull
    private final Map<Atom.ConfCondition, Configuration> defaultConfigurations;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "originChildAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.atoms.af.holders.AnnotationAtom$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
            invoke2(atomAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction originChildAction) {
            Intrinsics.checkNotNullParameter(originChildAction, "originChildAction");
            AtomAction atomAction = null;
            Object obj = AnnotationAtom.this.currentTrackingInfo != null ? originChildAction : null;
            if (obj != null) {
                AtomAction.CopyWithMutateTrackingInfo copyWithMutateTrackingInfo = obj instanceof AtomAction.CopyWithMutateTrackingInfo ? (AtomAction.CopyWithMutateTrackingInfo) obj : null;
                if (copyWithMutateTrackingInfo != null) {
                    atomAction = copyWithMutateTrackingInfo.mutateTrackingInfo(AnnotationAtom.this.currentTrackingInfo);
                }
            }
            AnnotationAtom annotationAtom = AnnotationAtom.this;
            if (atomAction != null) {
                originChildAction = atomAction;
            }
            annotationAtom.handleAction(originChildAction);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\"\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b&\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b(\u0010%¨\u0006)"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/AnnotationAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "defaultBackgroundDrawable", "defaultIconDrawable", "iconSize", "textStyle", "maxLines", "<init>", "(IIIIILjava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "getDefaultBackgroundDrawable", "Ljava/lang/Integer;", "getDefaultIconDrawable", "()Ljava/lang/Integer;", "getIconSize", "getTextStyle", "getMaxLines", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Configuration implements Atom.AtomConfiguration {
        private final int defaultBackgroundDrawable;
        private final Integer defaultIconDrawable;
        private final int iconSize;
        private final Integer maxLines;
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;
        private final Integer textStyle;

        public Configuration() {
            this(0, 0, 0, 0, 0, null, 0, null, null, 511, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.paddingStart == configuration.paddingStart && this.paddingEnd == configuration.paddingEnd && this.paddingTop == configuration.paddingTop && this.paddingBottom == configuration.paddingBottom && this.defaultBackgroundDrawable == configuration.defaultBackgroundDrawable && Intrinsics.d(this.defaultIconDrawable, configuration.defaultIconDrawable) && this.iconSize == configuration.iconSize && Intrinsics.d(this.textStyle, configuration.textStyle) && Intrinsics.d(this.maxLines, configuration.maxLines);
        }

        public final int getDefaultBackgroundDrawable() {
            return this.defaultBackgroundDrawable;
        }

        public final Integer getDefaultIconDrawable() {
            return this.defaultIconDrawable;
        }

        public final int getIconSize() {
            return this.iconSize;
        }

        public final Integer getMaxLines() {
            return this.maxLines;
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

        public final Integer getTextStyle() {
            return this.textStyle;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.defaultBackgroundDrawable, C2454a.a(this.paddingBottom, C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31), 31), 31);
            Integer num = this.defaultIconDrawable;
            int a12 = C2454a.a(this.iconSize, (a11 + (num == null ? 0 : num.hashCode())) * 31, 31);
            Integer num2 = this.textStyle;
            int hashCode = (a12 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.maxLines;
            return hashCode + (num3 != null ? num3.hashCode() : 0);
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
            int i15 = this.defaultBackgroundDrawable;
            Integer num = this.defaultIconDrawable;
            int i16 = this.iconSize;
            Integer num2 = this.textStyle;
            Integer num3 = this.maxLines;
            StringBuilder a11 = C2438a.a("Configuration(paddingStart=", i11, ", paddingEnd=", ", paddingTop=", i12);
            a.f(i13, i14, ", paddingBottom=", ", defaultBackgroundDrawable=", a11);
            a11.append(i15);
            a11.append(", defaultIconDrawable=");
            a11.append(num);
            a11.append(", iconSize=");
            a11.append(i16);
            a11.append(", textStyle=");
            a11.append(num2);
            a11.append(", maxLines=");
            return Ep.a.c(a11, num3, ")");
        }

        public Configuration(int i11, int i12, int i13, int i14, int i15, Integer num, int i16, Integer num2, Integer num3) {
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
            this.defaultBackgroundDrawable = i15;
            this.defaultIconDrawable = num;
            this.iconSize = i16;
            this.textStyle = num2;
            this.maxLines = num3;
        }

        public /* synthetic */ Configuration(int i11, int i12, int i13, int i14, int i15, Integer num, int i16, Integer num2, Integer num3, int i17, DefaultConstructorMarker defaultConstructorMarker) {
            this((i17 & 1) != 0 ? 16 : i11, (i17 & 2) != 0 ? 16 : i12, (i17 & 4) != 0 ? 0 : i13, (i17 & 8) != 0 ? 0 : i14, (i17 & 16) != 0 ? R$drawable.rect_annotation_semantic : i15, (i17 & 32) != 0 ? null : num, (i17 & 64) != 0 ? 24 : i16, (i17 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : num2, (i17 & 256) != 0 ? null : num3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationAtom(@NotNull View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        AtomAnnotationBinding bind = AtomAnnotationBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.defaultConfigurations = U.i(new Pair(new Atom.ConfCondition(Annotation.class, null, 2, null), new Configuration(0, 0, 0, 0, 0, null, 0, null, null, 511, null)));
        this.controlAdapter = new AtomsAdapter(null, null, null, null, 15, null);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Map<Atom.ConfCondition, Configuration> getDefaultConfigurations() {
        return this.defaultConfigurations;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull Annotation item) {
        List<? extends AtomDTO> list;
        Intrinsics.checkNotNullParameter(item, "item");
        this.currentTrackingInfo = item.getTrackingInfo();
        boolean z11 = (h.K(item.getImage()) && getCurrentConfiguration().getDefaultIconDrawable() == null) ? false : true;
        if (z11) {
            ImageView iconIv = this.binding.iconIv;
            Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
            ViewExtKt.show(iconIv);
            String image = item.getImage();
            if (h.K(image)) {
                image = null;
            }
            if (image != null) {
                ImageLoader imageLoader = AtomConfig.INSTANCE.getImageLoader();
                ImageView iconIv2 = this.binding.iconIv;
                Intrinsics.checkNotNullExpressionValue(iconIv2, "iconIv");
                imageLoader.load(iconIv2, image);
            } else {
                Integer defaultIconDrawable = getCurrentConfiguration().getDefaultIconDrawable();
                if (defaultIconDrawable != null) {
                    this.binding.iconIv.setImageDrawable(C7232a.a(getContext(), defaultIconDrawable.intValue()));
                }
            }
        } else {
            ImageView iconIv3 = this.binding.iconIv;
            Intrinsics.checkNotNullExpressionValue(iconIv3, "iconIv");
            ViewExtKt.gone(iconIv3);
        }
        this.binding.textTv.setText(item.getText());
        int parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getTextColor(), R$color.oz_semantic_text_primary);
        this.binding.textTv.setTextColor(parseColor);
        if (z11) {
            ImageView iconIv4 = this.binding.iconIv;
            Intrinsics.checkNotNullExpressionValue(iconIv4, "iconIv");
            ThemeExtKt.tint(iconIv4, Integer.valueOf(parseColor));
        }
        AtomsAdapter atomsAdapter = this.controlAdapter;
        Context context = getContext();
        AtomDTO control = item.getControl();
        if (control == null || (list = C7714v.a0(control)) == null) {
            list = K.f71697a;
        }
        atomsAdapter.bind(context, list);
        FrameAtomsLayout controlFAL = this.binding.controlFAL;
        Intrinsics.checkNotNullExpressionValue(controlFAL, "controlFAL");
        ViewExtKt.showOrGone(controlFAL, Boolean.valueOf(item.getControl() != null));
        this.binding.bgV.setBackgroundResource(getCurrentConfiguration().getDefaultBackgroundDrawable());
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        getContainerView().setPadding(ResourceExtKt.toPx(configuration.getPaddingStart()), ResourceExtKt.toPx(configuration.getPaddingTop()), ResourceExtKt.toPx(configuration.getPaddingEnd()), ResourceExtKt.toPx(configuration.getPaddingBottom()));
        ViewGroup.LayoutParams layoutParams = this.binding.iconIv.getLayoutParams();
        layoutParams.width = ResourceExtKt.toPx(configuration.getIconSize());
        layoutParams.height = ResourceExtKt.toPx(configuration.getIconSize());
        ViewGroup.LayoutParams layoutParams2 = this.binding.controlFAL.getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.LayoutParams layoutParams3 = this.binding.iconIv.getLayoutParams();
        Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int px = ResourceExtKt.toPx(configuration.getIconSize()) + ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart();
        ViewGroup.LayoutParams layoutParams4 = this.binding.textTv.getLayoutParams();
        Intrinsics.g(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart((((ViewGroup.MarginLayoutParams) layoutParams4).getMarginStart() + px) - ResourceExtKt.toPx(32));
        Integer maxLines = configuration.getMaxLines();
        if (maxLines != null) {
            this.binding.textTv.setMaxLines(maxLines.intValue());
        }
        Integer textStyle = configuration.getTextStyle();
        if (textStyle != null) {
            this.binding.textTv.setTextAppearance(textStyle.intValue());
        }
        getContainerView().requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnnotationAtom(@NotNull Context context, String str) {
        this(r3, str);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, R$layout.atom_annotation, null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding.controlFAL.setAdapter(this.controlAdapter);
        this.controlAdapter.setOnAction(new AnonymousClass1());
    }
}
