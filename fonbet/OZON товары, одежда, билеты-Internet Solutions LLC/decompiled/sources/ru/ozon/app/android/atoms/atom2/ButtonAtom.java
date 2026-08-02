package ru.ozon.app.android.atoms.atom2;

import Am.C2438a;
import B0.C2454a;
import DG.a;
import J0.P;
import Sc.InterfaceC3999a;
import Sc.o;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.d;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.R$attr;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.R$style;
import ru.ozon.app.android.atoms.R$styleable;
import ru.ozon.app.android.atoms.af.extensions.AttrsExtensionKt;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.deprecated.Button;

@InterfaceC3999a
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 k2\u00020\u0001:\u0003klmB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,J!\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u00100J-\u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204022\u0006\u0010)\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u00106J!\u00108\u001a\u0002042\u0006\u0010)\u001a\u00020\u00022\b\b\u0001\u00107\u001a\u00020\u0006H\u0003¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010\u0012J\u000f\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0004\b;\u0010<J#\u0010?\u001a\u00020\u000e2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e0=H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u000eH\u0002¢\u0006\u0004\bA\u0010\u0012J#\u0010C\u001a\u00020B*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\bC\u0010DR*\u0010G\u001a\u00020E2\u0006\u0010F\u001a\u00020E8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR0\u0010N\u001a\u0010\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u000e\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010@R.\u0010T\u001a\u0004\u0018\u00010S2\b\u0010F\u001a\u0004\u0018\u00010S8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R$\u0010e\u001a\u00020B2\u0006\u0010F\u001a\u00020B8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR(\u0010j\u001a\u0004\u0018\u00010\u00182\b\u0010F\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\bh\u0010i¨\u0006n"}, d2 = {"Lru/ozon/app/android/atoms/atom2/ButtonAtom;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isEnabled", "()Z", "enabled", "", "setEnabled", "(Z)V", "onAttachedToWindow", "()V", "Lru/ozon/uni/atoms/data/deprecated/Button;", "dto", "bind", "(Lru/ozon/uni/atoms/data/deprecated/Button;)V", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "sendViewAnalytics", "(Ljava/util/Map;)Lkotlin/Unit;", "Lru/ozon/uni/atoms/data/deprecated/Button$Style;", "style", "convertStyle", "(Lru/ozon/uni/atoms/data/deprecated/Button$Style;)I", "constructUI", "(Lru/ozon/uni/atoms/data/deprecated/Button$Style;)V", "Lru/ozon/app/android/atoms/atom2/ButtonAtom$ViewContainer;", "vc", "Landroid/view/ViewGroup;", "innerContainer", "attachViews", "(Lru/ozon/app/android/atoms/atom2/ButtonAtom$ViewContainer;Landroid/view/ViewGroup;)V", "buttonContextWrapper", "Landroid/widget/LinearLayout;", "constructInnerContainer", "(Landroid/content/Context;)Landroid/widget/LinearLayout;", "buttonStyleRes", "Landroid/widget/TextView;", "constructTitle", "(Landroid/content/Context;I)Landroid/widget/TextView;", "constructSubtitle", "Lkotlin/Pair;", "Landroid/widget/ImageView;", "Landroid/view/ViewGroup$LayoutParams;", "constructIcon", "(Landroid/content/Context;I)Lkotlin/Pair;", "iconStyleAttr", "createIconLp", "(Landroid/content/Context;I)Landroid/view/ViewGroup$LayoutParams;", "fixWidth", "fixedWidth", "()I", "Lkotlin/Function1;", "block", "updateUI", "(Lkotlin/jvm/functions/Function1;)V", "applyConfig", "", "underlineIfNeeded", "(Ljava/lang/String;Landroid/content/Context;Lru/ozon/uni/atoms/data/deprecated/Button$Style;)Ljava/lang/CharSequence;", "Lru/ozon/app/android/atoms/atom2/ButtonAtom$Configuration;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "configuration", "Lru/ozon/app/android/atoms/atom2/ButtonAtom$Configuration;", "getConfiguration", "()Lru/ozon/app/android/atoms/atom2/ButtonAtom$Configuration;", "setConfiguration", "(Lru/ozon/app/android/atoms/atom2/ButtonAtom$Configuration;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "setAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "setTrackingInfo", "(Ljava/util/Map;)V", "currentViewContainer", "Lru/ozon/app/android/atoms/atom2/ButtonAtom$ViewContainer;", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "getSubtext", "()Ljava/lang/String;", "setSubtext", "(Ljava/lang/String;)V", "subtext", "Companion", "Configuration", "ViewContainer", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonAtom extends FrameLayout {
    private AtomActionDTO action;

    @NotNull
    private Configuration configuration;
    private ViewContainer currentViewContainer;
    private Function1<? super AtomAction, Unit> onAction;
    private Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "typedAttrs", "Landroid/content/res/TypedArray;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.atoms.atom2.ButtonAtom$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<TypedArray, Unit> {
        final /* synthetic */ I $attrEnabled;
        final /* synthetic */ M<Button.Style> $attrStyle;
        final /* synthetic */ M<String> $attrSubtext;
        final /* synthetic */ M<String> $attrText;
        final /* synthetic */ ButtonAtom this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(M<String> m11, ButtonAtom buttonAtom, M<Button.Style> m12, M<String> m13, I i11) {
            super(1);
            this.$attrText = m11;
            this.this$0 = buttonAtom;
            this.$attrStyle = m12;
            this.$attrSubtext = m13;
            this.$attrEnabled = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TypedArray typedArray) {
            invoke2(typedArray);
            return Unit.f71690a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TypedArray typedAttrs) {
            T t2;
            Intrinsics.checkNotNullParameter(typedAttrs, "typedAttrs");
            switch (typedAttrs.getInt(R$styleable.ButtonAtom_bStyle, -1)) {
                case 0:
                    t2 = Button.Style.PRIMARY;
                    break;
                case 1:
                    t2 = Button.Style.SECONDARY;
                    break;
                case 2:
                    t2 = Button.Style.TERTIARY;
                    break;
                case 3:
                    t2 = Button.Style.DANGER;
                    break;
                case 4:
                    t2 = Button.Style.IMPORTANT;
                    break;
                case 5:
                    t2 = Button.Style.PRIMARY_SMALL;
                    break;
                case 6:
                    t2 = Button.Style.SECONDARY_SMALL;
                    break;
                case 7:
                    t2 = Button.Style.TERTIARY_SMALL;
                    break;
                case 8:
                    t2 = Button.Style.DANGER_SMALL;
                    break;
                case 9:
                    t2 = Button.Style.IMPORTANT_SMALL;
                    break;
                case 10:
                    t2 = Button.Style.GET;
                    break;
                case 11:
                    t2 = Button.Style.GET_ALT;
                    break;
                case 12:
                    t2 = Button.Style.BORDERLESS;
                    break;
                case 13:
                    t2 = Button.Style.BORDERLESS_SMALL;
                    break;
                case 14:
                    t2 = Button.Style.NATIVE_PAY;
                    break;
                case 15:
                    t2 = Button.Style.NATIVE_PAY_SMALL;
                    break;
                case 16:
                    t2 = Button.Style.FAST_PAY;
                    break;
                case 17:
                    t2 = Button.Style.FAST_PAY_SMALL;
                    break;
                case 18:
                    t2 = Button.Style.PRIMARY_GREEN;
                    break;
                case 19:
                    t2 = Button.Style.PRIMARY_GREEN_SMALL;
                    break;
                default:
                    t2 = 0;
                    break;
            }
            if (t2 != 0) {
                this.$attrStyle.f71787a = t2;
            }
            M<String> m11 = this.$attrText;
            String string = typedAttrs.getString(R$styleable.ButtonAtom_text);
            String str = string;
            if (string == null) {
                str = this.this$0.isInEditMode() ? this.$attrStyle.f71787a.getKey() : "";
            }
            m11.f71787a = str;
            this.$attrSubtext.f71787a = typedAttrs.getString(R$styleable.ButtonAtom_subtext);
            I i11 = this.$attrEnabled;
            i11.f71783a = typedAttrs.getBoolean(R$styleable.ButtonAtom_android_enabled, i11.f71783a);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u0016¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/atoms/atom2/ButtonAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            this((i15 & 1) != 0 ? 16 : i11, (i15 & 2) != 0 ? 16 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/atoms/atom2/ButtonAtom$ViewContainer;", "", "style", "Lru/ozon/uni/atoms/data/deprecated/Button$Style;", "container", "Landroid/view/ViewGroup;", "titleView", "Landroid/widget/TextView;", "subtitleView", "subtitleVisibility", "", "iconView", "Landroid/widget/ImageView;", "iconLp", "Landroid/view/ViewGroup$LayoutParams;", "<init>", "(Lru/ozon/uni/atoms/data/deprecated/Button$Style;Landroid/view/ViewGroup;Landroid/widget/TextView;Landroid/widget/TextView;ZLandroid/widget/ImageView;Landroid/view/ViewGroup$LayoutParams;)V", "getStyle", "()Lru/ozon/uni/atoms/data/deprecated/Button$Style;", "getContainer", "()Landroid/view/ViewGroup;", "getTitleView", "()Landroid/widget/TextView;", "getSubtitleView", "getSubtitleVisibility", "()Z", "getIconView", "()Landroid/widget/ImageView;", "getIconLp", "()Landroid/view/ViewGroup$LayoutParams;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ViewContainer {

        @NotNull
        private final ViewGroup container;

        @NotNull
        private final ViewGroup.LayoutParams iconLp;

        @NotNull
        private final ImageView iconView;

        @NotNull
        private final Button.Style style;

        @NotNull
        private final TextView subtitleView;
        private final boolean subtitleVisibility;

        @NotNull
        private final TextView titleView;

        public ViewContainer(@NotNull Button.Style style, @NotNull ViewGroup container, @NotNull TextView titleView, @NotNull TextView subtitleView, boolean z11, @NotNull ImageView iconView, @NotNull ViewGroup.LayoutParams iconLp) {
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(titleView, "titleView");
            Intrinsics.checkNotNullParameter(subtitleView, "subtitleView");
            Intrinsics.checkNotNullParameter(iconView, "iconView");
            Intrinsics.checkNotNullParameter(iconLp, "iconLp");
            this.style = style;
            this.container = container;
            this.titleView = titleView;
            this.subtitleView = subtitleView;
            this.subtitleVisibility = z11;
            this.iconView = iconView;
            this.iconLp = iconLp;
        }

        @NotNull
        public final ViewGroup getContainer() {
            return this.container;
        }

        @NotNull
        public final ViewGroup.LayoutParams getIconLp() {
            return this.iconLp;
        }

        @NotNull
        public final ImageView getIconView() {
            return this.iconView;
        }

        @NotNull
        public final Button.Style getStyle() {
            return this.style;
        }

        @NotNull
        public final TextView getSubtitleView() {
            return this.subtitleView;
        }

        public final boolean getSubtitleVisibility() {
            return this.subtitleVisibility;
        }

        @NotNull
        public final TextView getTitleView() {
            return this.titleView;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Button.Style.values().length];
            try {
                iArr[Button.Style.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Button.Style.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Button.Style.TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Button.Style.DANGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Button.Style.IMPORTANT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Button.Style.PRIMARY_SMALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Button.Style.SECONDARY_SMALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Button.Style.TERTIARY_SMALL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Button.Style.DANGER_SMALL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Button.Style.IMPORTANT_SMALL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Button.Style.GET.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Button.Style.GET_ALT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Button.Style.BORDERLESS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Button.Style.BORDERLESS_SMALL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Button.Style.NATIVE_PAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Button.Style.NATIVE_PAY_SMALL.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Button.Style.FAST_PAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Button.Style.FAST_PAY_SMALL.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Button.Style.PRIMARY_GREEN.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Button.Style.PRIMARY_GREEN_SMALL.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonAtom(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ButtonAtom buttonAtom, View view) {
        AtomAction atomAction;
        Function1<? super AtomAction, Unit> function1;
        AtomActionDTO atomActionDTO = buttonAtom.action;
        if (atomActionDTO != null) {
            if (!buttonAtom.isEnabled()) {
                atomActionDTO = null;
            }
            if (atomActionDTO == null || (atomAction = AtomActionMapperKt.toAtomAction(atomActionDTO, buttonAtom.trackingInfo)) == null || (function1 = buttonAtom.onAction) == null) {
                return;
            }
            function1.invoke(atomAction);
        }
    }

    private final void applyConfig() {
        int paddingStart = this.configuration.getPaddingStart();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(paddingStart, context);
        int paddingTop = this.configuration.getPaddingTop();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px2 = ResourceExtKt.toPx(paddingTop, context2);
        int paddingEnd = this.configuration.getPaddingEnd();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px3 = ResourceExtKt.toPx(paddingEnd, context3);
        int paddingBottom = this.configuration.getPaddingBottom();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        setPadding(px, px2, px3, ResourceExtKt.toPx(paddingBottom, context4));
    }

    private final void attachViews(ViewContainer vc2, ViewGroup innerContainer) {
        removeAllViews();
        innerContainer.addView(vc2.getIconView(), vc2.getIconLp());
        innerContainer.addView(vc2.getTitleView(), new LinearLayout.LayoutParams(fixedWidth(), -2));
        innerContainer.addView(vc2.getSubtitleView(), new LinearLayout.LayoutParams(fixedWidth(), -2));
        addView(innerContainer, new FrameLayout.LayoutParams(fixedWidth(), -2));
    }

    private final Pair<ImageView, ViewGroup.LayoutParams> constructIcon(Context buttonContextWrapper, int buttonStyleRes) {
        K k11 = new K();
        k11.f71785a = R$style.O2Button_Icon_Invisible;
        Resources.Theme theme = buttonContextWrapper.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        AttrsExtensionKt.obtain(theme, buttonStyleRes, new int[]{R$attr.atomButtonIconStyle}, new ButtonAtom$constructIcon$1(k11));
        ImageView imageView = new ImageView(new d(getContext(), k11.f71785a), null, 0);
        imageView.setId(R$id.buttonAtomIconIv);
        return new Pair<>(imageView, createIconLp(buttonContextWrapper, k11.f71785a));
    }

    private final LinearLayout constructInnerContainer(Context buttonContextWrapper) {
        LinearLayout linearLayout = new LinearLayout(buttonContextWrapper, null, 0);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    private final TextView constructSubtitle(Context buttonContextWrapper, int buttonStyleRes) {
        K k11 = new K();
        k11.f71785a = R$style.O2Button_Subtitle_Invisible;
        Resources.Theme theme = buttonContextWrapper.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        AttrsExtensionKt.obtain(theme, buttonStyleRes, new int[]{R$attr.atomButtonSubtitleStyle}, new ButtonAtom$constructSubtitle$1(k11));
        AppCompatTextView appCompatTextView = new AppCompatTextView(new d(getContext(), k11.f71785a), null, 0);
        appCompatTextView.setId(R$id.buttonAtomSubtitleTv);
        return appCompatTextView;
    }

    private final TextView constructTitle(Context buttonContextWrapper, int buttonStyleRes) {
        K k11 = new K();
        k11.f71785a = R$style.O2Button_Title_Invisible;
        Resources.Theme theme = buttonContextWrapper.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        AttrsExtensionKt.obtain(theme, buttonStyleRes, new int[]{R$attr.atomButtonTitleStyle}, new ButtonAtom$constructTitle$1(k11));
        AppCompatTextView appCompatTextView = new AppCompatTextView(new d(getContext(), k11.f71785a), null, 0);
        appCompatTextView.setId(R$id.buttonAtomTitleTv);
        return appCompatTextView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r1 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void constructUI(Button.Style style) {
        ViewContainer viewContainer;
        ViewContainer viewContainer2 = this.currentViewContainer;
        if (viewContainer2 == null) {
            viewContainer2 = null;
        } else if (viewContainer2 == null) {
            Intrinsics.n("currentViewContainer");
            throw null;
        }
        if (viewContainer2 != null) {
            viewContainer = viewContainer2.getStyle() == style ? viewContainer2 : null;
        }
        int convertStyle = convertStyle(style);
        d dVar = new d(getContext(), convertStyle);
        LinearLayout constructInnerContainer = constructInnerContainer(dVar);
        TextView constructTitle = constructTitle(dVar, convertStyle);
        TextView constructSubtitle = constructSubtitle(dVar, convertStyle);
        boolean z11 = constructSubtitle.getVisibility() == 0;
        Pair<ImageView, ViewGroup.LayoutParams> constructIcon = constructIcon(dVar, convertStyle);
        ViewContainer viewContainer3 = new ViewContainer(style, constructInnerContainer, constructTitle, constructSubtitle, z11, constructIcon.a(), constructIcon.b());
        attachViews(viewContainer3, constructInnerContainer);
        viewContainer = viewContainer3;
        this.currentViewContainer = viewContainer;
    }

    private final int convertStyle(Button.Style style) {
        switch (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
            case -1:
                return R$style.O2Button_L_Primary;
            case 0:
            default:
                throw new o();
            case 1:
                return R$style.O2Button_L_Primary;
            case 2:
                return R$style.O2Button_L_Secondary;
            case 3:
                return R$style.O2Button_L_Tertiary;
            case 4:
                return R$style.O2Button_L_Danger;
            case 5:
                return R$style.O2Button_L_Important;
            case 6:
                return R$style.O2Button_S_Primary;
            case 7:
                return R$style.O2Button_S_Secondary;
            case 8:
                return R$style.O2Button_S_Tertiary;
            case 9:
                return R$style.O2Button_S_Danger;
            case 10:
                return R$style.O2Button_S_Important;
            case 11:
                return R$style.O2Button_Get;
            case 12:
                return R$style.O2Button_Get_Alt;
            case 13:
                return R$style.O2Button_L_Borderless;
            case 14:
                return R$style.O2Button_S_Borderless;
            case 15:
                return R$style.O2Button_L_NativePay;
            case 16:
                return R$style.O2Button_S_NativePay;
            case 17:
                return R$style.O2Button_L_FastPay;
            case 18:
                return R$style.O2Button_S_FastPay;
            case 19:
                return R$style.O2Button_L_PrimaryGreen;
            case 20:
                return R$style.O2Button_S_PrimaryGreen;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ResourceType"})
    private final ViewGroup.LayoutParams createIconLp(Context buttonContextWrapper, int iconStyleAttr) {
        M m11 = new M();
        Resources.Theme theme = buttonContextWrapper.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        AttrsExtensionKt.obtain(theme, iconStyleAttr, new int[]{R.attr.layout_width, R.attr.layout_height}, new ButtonAtom$createIconLp$1(m11));
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) m11.f71787a;
        return layoutParams == null ? new FrameLayout.LayoutParams(-2, -2) : layoutParams;
    }

    private final void fixWidth() {
        ViewContainer viewContainer = this.currentViewContainer;
        if (viewContainer == null) {
            Intrinsics.n("currentViewContainer");
            throw null;
        }
        viewContainer.getContainer().getLayoutParams().width = fixedWidth();
        ViewContainer viewContainer2 = this.currentViewContainer;
        if (viewContainer2 == null) {
            Intrinsics.n("currentViewContainer");
            throw null;
        }
        viewContainer2.getTitleView().getLayoutParams().width = fixedWidth();
        ViewContainer viewContainer3 = this.currentViewContainer;
        if (viewContainer3 == null) {
            Intrinsics.n("currentViewContainer");
            throw null;
        }
        viewContainer3.getSubtitleView().getLayoutParams().width = fixedWidth();
    }

    private final int fixedWidth() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Integer valueOf = layoutParams != null ? Integer.valueOf(layoutParams.width) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            return -1;
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            return layoutParams2.width;
        }
        return -2;
    }

    private final CharSequence underlineIfNeeded(String str, Context context, Button.Style style) {
        Button.Style[] elements = {Button.Style.BORDERLESS, Button.Style.BORDERLESS_SMALL};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        if (!UniGlobalConfigKt.getUnderlineLinksFlag(context) || !j02.contains(style)) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
        return spannableString;
    }

    private final void updateUI(Function1<? super ViewContainer, Unit> block) {
        ViewContainer viewContainer = this.currentViewContainer;
        if (viewContainer != null) {
            block.invoke(viewContainer);
        } else {
            Intrinsics.n("currentViewContainer");
            throw null;
        }
    }

    public final void bind(@NotNull Button dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        constructUI(dto.getStyle());
        String text = dto.getText();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setText(underlineIfNeeded(text, context, dto.getStyle()));
        setSubtext(dto.getSubtext());
        setAction(dto.getAction());
        this.trackingInfo = dto.getTrackingInfo();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        if (trackingInfo != null) {
            sendViewAnalytics(trackingInfo);
        }
    }

    @Override // android.view.View
    public boolean isEnabled() {
        ViewContainer viewContainer = this.currentViewContainer;
        if (viewContainer != null) {
            return viewContainer.getContainer().isEnabled();
        }
        Intrinsics.n("currentViewContainer");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        fixWidth();
        super.onAttachedToWindow();
    }

    public final Unit sendViewAnalytics(@NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        Function1<? super AtomAction, Unit> function1 = this.onAction;
        if (function1 == null) {
            return null;
        }
        function1.invoke(new AtomAction.ViewAction(trackingInfo, null, 2, null));
        return Unit.f71690a;
    }

    public final void setAction(AtomActionDTO atomActionDTO) {
        this.action = atomActionDTO;
        setEnabled(atomActionDTO != null);
    }

    public final void setConfiguration(@NotNull Configuration value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.configuration = value;
        applyConfig();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        updateUI(new ButtonAtom$setEnabled$1(enabled));
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
    }

    public final void setSubtext(String str) {
        updateUI(new ButtonAtom$subtext$1(str));
    }

    public final void setText(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        updateUI(new ButtonAtom$text$1(value));
    }

    public /* synthetic */ ButtonAtom(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, ru.ozon.uni.atoms.data.deprecated.Button$Style] */
    public ButtonAtom(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.configuration = new Configuration(0, 0, 0, 0, 15, null);
        M m11 = new M();
        m11.f71787a = Button.INSTANCE.getDefaultStyle();
        M m12 = new M();
        m12.f71787a = "";
        M m13 = new M();
        m13.f71787a = "";
        I i12 = new I();
        i12.f71783a = true;
        if (attributeSet != null) {
            int[] ButtonAtom = R$styleable.ButtonAtom;
            Intrinsics.checkNotNullExpressionValue(ButtonAtom, "ButtonAtom");
            AttrsExtensionKt.obtain(attributeSet, context, ButtonAtom, i11, new AnonymousClass1(m12, this, m11, m13, i12));
        }
        constructUI((Button.Style) m11.f71787a);
        setOnClickListener(new a(this, 4));
        setAction(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, null, null, 14, null));
        setText((CharSequence) m12.f71787a);
        setSubtext((String) m13.f71787a);
        setEnabled(i12.f71783a);
        if (UniGlobalConfigKt.getRoundCornersFlag(context)) {
            setClipToOutline(true);
            setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.atoms.atom2.ButtonAtom$3$1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(outline, "outline");
                    outline.setRoundRect(ButtonAtom.this.getPaddingStart(), ButtonAtom.this.getPaddingTop(), view.getWidth() - ButtonAtom.this.getPaddingEnd(), view.getHeight() - ButtonAtom.this.getPaddingBottom(), ResourceExtKt.toPxF(99));
                }
            });
        }
    }
}
