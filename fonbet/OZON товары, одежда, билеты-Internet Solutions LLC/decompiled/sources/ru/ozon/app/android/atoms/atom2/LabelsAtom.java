package ru.ozon.app.android.atoms.atom2;

import Am.C2438a;
import B0.C2454a;
import Dy.ViewOnClickListenerC2883a;
import Ef0.c;
import Ek.a;
import Sc.InterfaceC3999a;
import Sc.o;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$drawable;
import ru.ozon.app.android.atoms.data.deprecated.Labels;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;

@InterfaceC3999a
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002+,B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR0\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R&\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lru/ozon/app/android/atoms/atom2/LabelsAtom;", "Lcom/google/android/flexbox/FlexboxLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/atoms/data/deprecated/Labels$LabelType;", "labelType", "Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;", "configuration", "Lru/ozon/app/android/atoms/atom2/LabelsAtom$Element;", "createElement", "(Lru/ozon/app/android/atoms/data/deprecated/Labels$LabelType;Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;)Lru/ozon/app/android/atoms/atom2/LabelsAtom$Element;", "", "clearUnusedElements", "()V", "applyConfig", "Lru/ozon/app/android/atoms/data/deprecated/Labels;", "dto", "bind", "(Lru/ozon/app/android/atoms/data/deprecated/Labels;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;", "getConfiguration", "()Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;", "setConfiguration", "(Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "", "", "cache", "Ljava/util/Map;", "Element", "Configuration", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LabelsAtom extends FlexboxLayout {

    @NotNull
    private final Map<Labels.LabelType, List<Element>> cache;

    @NotNull
    private Configuration configuration;
    private Function1<? super AtomAction, Unit> onAction;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b#\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b(\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "textStyle", "iconSize", "forceTintColor", "forceBackgroundColor", "forceTextColor", "<init>", "(IIIIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "getTextStyle", "getIconSize", "Ljava/lang/Integer;", "getForceTintColor", "()Ljava/lang/Integer;", "getForceBackgroundColor", "getForceTextColor", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Configuration implements Atom.AtomConfiguration {
        private final Integer forceBackgroundColor;
        private final Integer forceTextColor;
        private final Integer forceTintColor;
        private final int iconSize;
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;
        private final int textStyle;

        public Configuration() {
            this(0, 0, 0, 0, 0, 0, null, null, null, 511, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.paddingStart == configuration.paddingStart && this.paddingEnd == configuration.paddingEnd && this.paddingTop == configuration.paddingTop && this.paddingBottom == configuration.paddingBottom && this.textStyle == configuration.textStyle && this.iconSize == configuration.iconSize && Intrinsics.d(this.forceTintColor, configuration.forceTintColor) && Intrinsics.d(this.forceBackgroundColor, configuration.forceBackgroundColor) && Intrinsics.d(this.forceTextColor, configuration.forceTextColor);
        }

        public final Integer getForceBackgroundColor() {
            return this.forceBackgroundColor;
        }

        public final Integer getForceTextColor() {
            return this.forceTextColor;
        }

        public final Integer getForceTintColor() {
            return this.forceTintColor;
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
            int a11 = C2454a.a(this.iconSize, C2454a.a(this.textStyle, C2454a.a(this.paddingBottom, C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31), 31), 31), 31);
            Integer num = this.forceTintColor;
            int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.forceBackgroundColor;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.forceTextColor;
            return hashCode2 + (num3 != null ? num3.hashCode() : 0);
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
            int i15 = this.textStyle;
            int i16 = this.iconSize;
            Integer num = this.forceTintColor;
            Integer num2 = this.forceBackgroundColor;
            Integer num3 = this.forceTextColor;
            StringBuilder a11 = C2438a.a("Configuration(paddingStart=", i11, ", paddingEnd=", ", paddingTop=", i12);
            a.f(i13, i14, ", paddingBottom=", ", textStyle=", a11);
            a.f(i15, i16, ", iconSize=", ", forceTintColor=", a11);
            c.e(a11, num, ", forceBackgroundColor=", num2, ", forceTextColor=");
            return Ep.a.c(a11, num3, ")");
        }

        public Configuration(int i11, int i12, int i13, int i14, int i15, int i16, Integer num, Integer num2, Integer num3) {
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
            this.textStyle = i15;
            this.iconSize = i16;
            this.forceTintColor = num;
            this.forceBackgroundColor = num2;
            this.forceTextColor = num3;
        }

        public /* synthetic */ Configuration(int i11, int i12, int i13, int i14, int i15, int i16, Integer num, Integer num2, Integer num3, int i17, DefaultConstructorMarker defaultConstructorMarker) {
            this((i17 & 1) != 0 ? 16 : i11, (i17 & 2) != 0 ? 16 : i12, (i17 & 4) != 0 ? 0 : i13, (i17 & 8) != 0 ? 0 : i14, (i17 & 16) != 0 ? R$style.TextStyle_Caption : i15, (i17 & 32) != 0 ? 12 : i16, (i17 & 64) != 0 ? null : num, (i17 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : num2, (i17 & 256) != 0 ? null : num3);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u00020\u000f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0002\u001a\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/atoms/atom2/LabelsAtom$Element;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/atoms/data/deprecated/Labels$Label;", "data", "", "bind", "(Landroid/content/Context;Lru/ozon/app/android/atoms/data/deprecated/Labels$Label;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "", "isTaken", "()Z", "setTaken", "(Z)V", "Lcom/google/android/flexbox/FlexboxLayout$a;", "getLayoutParams", "()Lcom/google/android/flexbox/FlexboxLayout$a;", "layoutParams", "TextLabel", "IconLabel", "Lru/ozon/app/android/atoms/atom2/LabelsAtom$Element$IconLabel;", "Lru/ozon/app/android/atoms/atom2/LabelsAtom$Element$TextLabel;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Element {

        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0007\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/atoms/atom2/LabelsAtom$Element$IconLabel;", "Lru/ozon/app/android/atoms/atom2/LabelsAtom$Element;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;", "currentConfig", "", "isTaken", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;ZLkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/atoms/data/deprecated/Labels$Label;", "data", "bind", "(Landroid/content/Context;Lru/ozon/app/android/atoms/data/deprecated/Labels$Label;)V", "Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;", "getCurrentConfig", "()Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;", "Z", "()Z", "setTaken", "(Z)V", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "", "icHPadding", "I", "icVPadding", "icSize", "Landroid/widget/ImageView;", "view", "Landroid/widget/ImageView;", "getView", "()Landroid/widget/ImageView;", "Lcom/google/android/flexbox/FlexboxLayout$a;", "layoutParams", "Lcom/google/android/flexbox/FlexboxLayout$a;", "getLayoutParams", "()Lcom/google/android/flexbox/FlexboxLayout$a;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IconLabel extends Element {

            @NotNull
            private final Configuration currentConfig;
            private final int icHPadding;
            private final int icSize;
            private final int icVPadding;
            private boolean isTaken;

            @NotNull
            private final FlexboxLayout.a layoutParams;

            @NotNull
            private final Function1<AtomAction, Unit> onAction;

            @NotNull
            private final ImageView view;

            public /* synthetic */ IconLabel(Context context, Configuration configuration, boolean z11, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(context, configuration, (i11 & 4) != 0 ? false : z11, function1);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void bind$lambda$2(Labels.Label label, IconLabel iconLabel, View view) {
                AtomAction atomAction;
                AtomActionDTO action = label.getAction();
                if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, label.getTrackingInfo())) == null) {
                    return;
                }
                iconLabel.getOnAction().invoke(atomAction);
            }

            @Override // ru.ozon.app.android.atoms.atom2.LabelsAtom.Element
            public void bind(@NotNull Context context, @NotNull Labels.Label data) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(data, "data");
                AtomConfig.INSTANCE.getImageLoader().load(getView(), data.getImage());
                ImageView view = getView();
                StyleParser styleParser = StyleParser.INSTANCE;
                String tintColor = data.getTintColor();
                Integer forceTintColor = getCurrentConfig().getForceTintColor();
                view.setImageTintList(ColorStateList.valueOf(styleParser.parseColor(context, tintColor, forceTintColor != null ? forceTintColor.intValue() : R$color.oz_black)));
                Drawable background = getView().getBackground();
                String backgroundColor = data.getBackgroundColor();
                Integer forceBackgroundColor = getCurrentConfig().getForceBackgroundColor();
                background.setColorFilter(styleParser.parseColor(context, backgroundColor, forceBackgroundColor != null ? forceBackgroundColor.intValue() : R.color.transparent), PorterDuff.Mode.SRC_IN);
                getView().setOnClickListener(new IW.a(3, data, this));
            }

            @NotNull
            public Configuration getCurrentConfig() {
                return this.currentConfig;
            }

            @Override // ru.ozon.app.android.atoms.atom2.LabelsAtom.Element
            @NotNull
            public FlexboxLayout.a getLayoutParams() {
                return this.layoutParams;
            }

            @NotNull
            public Function1<AtomAction, Unit> getOnAction() {
                return this.onAction;
            }

            @Override // ru.ozon.app.android.atoms.atom2.LabelsAtom.Element
            /* renamed from: isTaken, reason: from getter */
            public boolean getIsTaken() {
                return this.isTaken;
            }

            @Override // ru.ozon.app.android.atoms.atom2.LabelsAtom.Element
            public void setTaken(boolean z11) {
                this.isTaken = z11;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public IconLabel(@NotNull Context context, @NotNull Configuration currentConfig, boolean z11, @NotNull Function1<? super AtomAction, Unit> onAction) {
                super(null);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(currentConfig, "currentConfig");
                Intrinsics.checkNotNullParameter(onAction, "onAction");
                this.currentConfig = currentConfig;
                this.isTaken = z11;
                this.onAction = onAction;
                int px = ResourceExtKt.toPx(6, context);
                this.icHPadding = px;
                int px2 = ResourceExtKt.toPx(4, context);
                this.icVPadding = px2;
                int px3 = ResourceExtKt.toPx(12, context);
                this.icSize = px3;
                this.view = new ImageView(context);
                this.layoutParams = new FlexboxLayout.a((px * 2) + px3, (px2 * 2) + px3);
                ImageView view = getView();
                view.setPadding(px, px2, px, px2);
                view.setBackground(androidx.core.content.a.getDrawable(context, R$drawable.rect_round_white1));
                view.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }

            @Override // ru.ozon.app.android.atoms.atom2.LabelsAtom.Element
            @NotNull
            public ImageView getView() {
                return this.view;
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u0007\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/atoms/atom2/LabelsAtom$Element$TextLabel;", "Lru/ozon/app/android/atoms/atom2/LabelsAtom$Element;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;", "currentConfig", "", "isTaken", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lcom/google/android/flexbox/FlexboxLayout$a;", "layoutParams", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;ZLkotlin/jvm/functions/Function1;Lcom/google/android/flexbox/FlexboxLayout$a;)V", "", "backgroundColor", "getHorizontalPadding", "(I)I", "Lru/ozon/app/android/atoms/data/deprecated/Labels$Label;", "data", "bind", "(Landroid/content/Context;Lru/ozon/app/android/atoms/data/deprecated/Labels$Label;)V", "Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;", "getCurrentConfig", "()Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;", "Z", "()Z", "setTaken", "(Z)V", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "Lcom/google/android/flexbox/FlexboxLayout$a;", "getLayoutParams", "()Lcom/google/android/flexbox/FlexboxLayout$a;", "dp8", "I", "dp2", "Landroid/widget/TextView;", "view", "Landroid/widget/TextView;", "getView", "()Landroid/widget/TextView;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class TextLabel extends Element {

            @NotNull
            private final Configuration currentConfig;
            private final int dp2;
            private final int dp8;
            private boolean isTaken;

            @NotNull
            private final FlexboxLayout.a layoutParams;

            @NotNull
            private final Function1<AtomAction, Unit> onAction;

            @NotNull
            private final TextView view;

            public /* synthetic */ TextLabel(Context context, Configuration configuration, boolean z11, Function1 function1, FlexboxLayout.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(context, configuration, (i11 & 4) != 0 ? false : z11, function1, (i11 & 16) != 0 ? new FlexboxLayout.a(-2, -2) : aVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void bind$lambda$2(Labels.Label label, TextLabel textLabel, View view) {
                AtomAction atomAction;
                AtomActionDTO action = label.getAction();
                if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, label.getTrackingInfo())) == null) {
                    return;
                }
                textLabel.getOnAction().invoke(atomAction);
            }

            private final int getHorizontalPadding(int backgroundColor) {
                if (backgroundColor == 0) {
                    return 0;
                }
                return this.dp8;
            }

            @Override // ru.ozon.app.android.atoms.atom2.LabelsAtom.Element
            public void bind(@NotNull Context context, @NotNull Labels.Label data) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(data, "data");
                getView().setText(data.getText());
                getView().setTextAppearance(data.isBold() ? R$style.TextStyle_Caption_Bold : R$style.TextStyle_Caption);
                TextView view = getView();
                StyleParser styleParser = StyleParser.INSTANCE;
                String textColor = data.getTextColor();
                Integer forceTextColor = getCurrentConfig().getForceTextColor();
                view.setTextColor(styleParser.parseColor(context, textColor, forceTextColor != null ? forceTextColor.intValue() : R$color.oz_black));
                String backgroundColor = data.getBackgroundColor();
                Integer forceBackgroundColor = getCurrentConfig().getForceBackgroundColor();
                int parseColor = styleParser.parseColor(context, backgroundColor, forceBackgroundColor != null ? forceBackgroundColor.intValue() : R.color.transparent);
                getView().getBackground().setColorFilter(parseColor, PorterDuff.Mode.SRC_IN);
                int horizontalPadding = getHorizontalPadding(parseColor);
                TextView view2 = getView();
                int i11 = this.dp2;
                view2.setPadding(horizontalPadding, i11, horizontalPadding, i11);
                getView().setOnClickListener(new ViewOnClickListenerC2883a(6, data, this));
                TextView view3 = getView();
                TestInfo testInfo = data.getTestInfo();
                view3.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
            }

            @NotNull
            public Configuration getCurrentConfig() {
                return this.currentConfig;
            }

            @Override // ru.ozon.app.android.atoms.atom2.LabelsAtom.Element
            @NotNull
            public FlexboxLayout.a getLayoutParams() {
                return this.layoutParams;
            }

            @NotNull
            public Function1<AtomAction, Unit> getOnAction() {
                return this.onAction;
            }

            @Override // ru.ozon.app.android.atoms.atom2.LabelsAtom.Element
            /* renamed from: isTaken, reason: from getter */
            public boolean getIsTaken() {
                return this.isTaken;
            }

            @Override // ru.ozon.app.android.atoms.atom2.LabelsAtom.Element
            public void setTaken(boolean z11) {
                this.isTaken = z11;
            }

            @Override // ru.ozon.app.android.atoms.atom2.LabelsAtom.Element
            @NotNull
            public TextView getView() {
                return this.view;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public TextLabel(@NotNull Context context, @NotNull Configuration currentConfig, boolean z11, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull FlexboxLayout.a layoutParams) {
                super(null);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(currentConfig, "currentConfig");
                Intrinsics.checkNotNullParameter(onAction, "onAction");
                Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
                this.currentConfig = currentConfig;
                this.isTaken = z11;
                this.onAction = onAction;
                this.layoutParams = layoutParams;
                this.dp8 = ResourceExtKt.toPx(8, context);
                this.dp2 = ResourceExtKt.toPx(2, context);
                this.view = new AppCompatTextView(context);
                TextView view = getView();
                view.setBackground(androidx.core.content.a.getDrawable(context, R$drawable.rect_round_white1));
                view.setIncludeFontPadding(false);
                view.setMaxLines(1);
                view.setEllipsize(TextUtils.TruncateAt.END);
            }
        }

        public /* synthetic */ Element(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract void bind(@NotNull Context context, @NotNull Labels.Label data);

        @NotNull
        public abstract FlexboxLayout.a getLayoutParams();

        @NotNull
        public abstract View getView();

        /* renamed from: isTaken */
        public abstract boolean getIsTaken();

        public abstract void setTaken(boolean z11);

        private Element() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Labels.LabelType.values().length];
            try {
                iArr[Labels.LabelType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Labels.LabelType.ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ LabelsAtom(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
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

    private final void clearUnusedElements() {
        Iterator<Map.Entry<Labels.LabelType, List<Element>>> it = this.cache.entrySet().iterator();
        while (it.hasNext()) {
            List<Element> value = it.next().getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (((Element) obj).getIsTaken()) {
                    arrayList.add(obj);
                }
            }
            if (Intrinsics.d(value, arrayList)) {
                arrayList = null;
            }
            if (arrayList != null) {
                value.clear();
                value.addAll(arrayList);
            }
        }
    }

    private final Element createElement(Labels.LabelType labelType, Configuration configuration) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[labelType.ordinal()];
        if (i11 == 1) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new Element.TextLabel(context, configuration, false, new LabelsAtom$createElement$1(this), null, 20, null);
        }
        if (i11 != 2) {
            throw new o();
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new Element.IconLabel(context2, configuration, false, new LabelsAtom$createElement$2(this), 4, null);
    }

    public final void bind(@NotNull Labels dto) {
        Object obj;
        Labels.LabelType labelType;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Iterator<Map.Entry<Labels.LabelType, List<Element>>> it = this.cache.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                ((Element) it2.next()).setTaken(false);
            }
        }
        ArrayList<Element> arrayList = new ArrayList();
        for (Labels.Label label : dto.getItems()) {
            Labels.LabelType[] values = Labels.LabelType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                obj = null;
                if (i11 >= length) {
                    labelType = null;
                    break;
                }
                labelType = values[i11];
                if (Intrinsics.d(labelType.getKey(), label.getType())) {
                    break;
                } else {
                    i11++;
                }
            }
            if (labelType != null) {
                Map<Labels.LabelType, List<Element>> map = this.cache;
                List<Element> list = map.get(labelType);
                if (list == null) {
                    list = new ArrayList<>();
                    map.put(labelType, list);
                }
                List<Element> list2 = list;
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (!((Element) next).getIsTaken()) {
                        obj = next;
                        break;
                    }
                }
                Element element = (Element) obj;
                if (element == null) {
                    element = createElement(labelType, this.configuration);
                    list2.add(element);
                }
                element.setTaken(true);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                element.bind(context, label);
                arrayList.add(element);
            }
        }
        clearUnusedElements();
        removeAllViews();
        for (Element element2 : arrayList) {
            addView(element2.getView(), element2.getLayoutParams());
        }
    }

    public final Function1<AtomAction, Unit> getOnAction() {
        return this.onAction;
    }

    public final void setConfiguration(@NotNull Configuration value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.configuration = value;
        this.cache.clear();
        applyConfig();
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelsAtom(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.configuration = new Configuration(0, 0, 0, 0, 0, 0, null, null, null, 511, null);
        this.cache = new LinkedHashMap();
        setFlexDirection(0);
        setFlexWrap(1);
        setJustifyContent(0);
        setShowDivider(2);
        setDividerDrawable(androidx.core.content.a.getDrawable(context, R$drawable.space_flexbox_atom_layout));
        applyConfig();
        if (isInEditMode()) {
            String str = null;
            TestInfo testInfo = null;
            Map map = null;
            bind(new Labels(str, testInfo, map, C7714v.a0(new Labels.Label("text", "Надпись 1", false, null, "ozgreenui", "ozyellowbrand", "ozgreenui", null, null, null, 908, null)), 7, null));
        }
    }
}
