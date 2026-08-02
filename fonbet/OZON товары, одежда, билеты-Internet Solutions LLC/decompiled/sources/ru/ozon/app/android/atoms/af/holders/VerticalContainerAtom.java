package ru.ozon.app.android.atoms.af.holders;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import Sc.InterfaceC3999a;
import Sc.o;
import T7.E;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$layout;
import ru.ozon.app.android.atoms.data.deprecated.VerticalContainer;
import ru.ozon.app.android.atoms.databinding.AtomVerticalContainerBinding;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.CommonAtomDecorator;
import ru.ozon.uni.atoms.af.HasNested;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.af.layout.DecorateHelper;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002%&B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\rJH\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u001e\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001e0\u00110\u00112\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020 \u0018\u00010\u0011H\u0016J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0003H\u0016J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u0002H\u0014R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom;", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/app/android/atoms/data/deprecated/VerticalContainer;", "Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration;", "Lru/ozon/uni/atoms/af/HasNested;", "view", "Landroid/view/View;", "atomContext", "", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "binding", "Lru/ozon/app/android/atoms/databinding/AtomVerticalContainerBinding;", "defaultConfigurations", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "getDefaultConfigurations", "()Ljava/util/Map;", "adapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "decorator", "Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$ItemsDecorator;", "nestedDecorator", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "setNestedConfigs", "", "nestedConfigs", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "nestedDecorators", "Lru/ozon/uni/atoms/af/AtomDecorator;", "onConfigureView", "configuration", "onBind", "item", "Configuration", "ItemsDecorator", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VerticalContainerAtom extends Atom<VerticalContainer, Configuration> implements HasNested {
    private AtomsAdapter adapter;

    @NotNull
    private final AtomVerticalContainerBinding binding;
    private ItemsDecorator decorator;

    @NotNull
    private final Map<Atom.ConfCondition, Configuration> defaultConfigurations;
    private VerticalAtomsDecorator nestedDecorator;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(BO\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b$\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode;", "widthMode", "horizontalChildGravity", "backgroundColor", "<init>", "(IIIILru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode;ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode;", "getWidthMode", "()Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode;", "getHorizontalChildGravity", "Ljava/lang/Integer;", "getBackgroundColor", "()Ljava/lang/Integer;", "WidthMode", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Configuration implements Atom.AtomConfiguration {
        private final Integer backgroundColor;
        private final int horizontalChildGravity;
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;

        @NotNull
        private final WidthMode widthMode;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode;", "", "<init>", "()V", "Wrap", "Parent", "Fixed", "Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode$Fixed;", "Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode$Parent;", "Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode$Wrap;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class WidthMode {

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode$Fixed;", "Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "width", "I", "getWidth", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Fixed extends WidthMode {
                private final int width;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Fixed) && this.width == ((Fixed) other).width;
                }

                public final int getWidth() {
                    return this.width;
                }

                public int hashCode() {
                    return Integer.hashCode(this.width);
                }

                @NotNull
                public String toString() {
                    return E.a(this.width, "Fixed(width=", ")");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode$Parent;", "Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode;", "<init>", "()V", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Parent extends WidthMode {

                @NotNull
                public static final Parent INSTANCE = new Parent();

                private Parent() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode$Wrap;", "Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode;", "<init>", "()V", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Wrap extends WidthMode {

                @NotNull
                public static final Wrap INSTANCE = new Wrap();

                private Wrap() {
                    super(null);
                }
            }

            public /* synthetic */ WidthMode(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private WidthMode() {
            }
        }

        public Configuration() {
            this(0, 0, 0, 0, null, 0, null, 127, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.paddingStart == configuration.paddingStart && this.paddingEnd == configuration.paddingEnd && this.paddingTop == configuration.paddingTop && this.paddingBottom == configuration.paddingBottom && Intrinsics.d(this.widthMode, configuration.widthMode) && this.horizontalChildGravity == configuration.horizontalChildGravity && Intrinsics.d(this.backgroundColor, configuration.backgroundColor);
        }

        public final Integer getBackgroundColor() {
            return this.backgroundColor;
        }

        public final int getHorizontalChildGravity() {
            return this.horizontalChildGravity;
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

        @NotNull
        public final WidthMode getWidthMode() {
            return this.widthMode;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.horizontalChildGravity, (this.widthMode.hashCode() + C2454a.a(this.paddingBottom, C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31), 31)) * 31, 31);
            Integer num = this.backgroundColor;
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
            WidthMode widthMode = this.widthMode;
            int i15 = this.horizontalChildGravity;
            Integer num = this.backgroundColor;
            StringBuilder a11 = C2438a.a("Configuration(paddingStart=", i11, ", paddingEnd=", ", paddingTop=", i12);
            a.f(i13, i14, ", paddingBottom=", ", widthMode=", a11);
            a11.append(widthMode);
            a11.append(", horizontalChildGravity=");
            a11.append(i15);
            a11.append(", backgroundColor=");
            return Ep.a.c(a11, num, ")");
        }

        public Configuration(int i11, int i12, int i13, int i14, @NotNull WidthMode widthMode, int i15, Integer num) {
            Intrinsics.checkNotNullParameter(widthMode, "widthMode");
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
            this.widthMode = widthMode;
            this.horizontalChildGravity = i15;
            this.backgroundColor = num;
        }

        public /* synthetic */ Configuration(int i11, int i12, int i13, int i14, WidthMode widthMode, int i15, Integer num, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? 0 : i11, (i16 & 2) != 0 ? 0 : i12, (i16 & 4) != 0 ? 0 : i13, (i16 & 8) != 0 ? 0 : i14, (i16 & 16) != 0 ? WidthMode.Parent.INSTANCE : widthMode, (i16 & 32) != 0 ? 8388611 : i15, (i16 & 64) != 0 ? null : num);
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$ItemsDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "context", "Landroid/content/Context;", "widthMode", "Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode;", "nestedDecorator", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/atoms/af/holders/VerticalContainerAtom$Configuration$WidthMode;Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;)V", "decorateHelper", "Lru/ozon/uni/atoms/af/layout/DecorateHelper;", "modifyVerticalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "", "last", "", "decorate", "", "canvas", "Landroid/graphics/Canvas;", "bounds", "Landroid/graphics/Rect;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ItemsDecorator extends AtomDecorator implements VerticalAtomsDecorator {

        @NotNull
        private final DecorateHelper decorateHelper;
        private VerticalAtomsDecorator nestedDecorator;

        @NotNull
        private final Configuration.WidthMode widthMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemsDecorator(@NotNull Context context, @NotNull Configuration.WidthMode widthMode, VerticalAtomsDecorator verticalAtomsDecorator) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(widthMode, "widthMode");
            this.widthMode = widthMode;
            this.nestedDecorator = verticalAtomsDecorator;
            this.decorateHelper = new DecorateHelper(context);
        }

        @Override // ru.ozon.uni.atoms.af.AtomDecorator, ru.ozon.uni.atoms.af.CommonAtomDecorator
        public void decorate(@NotNull Canvas canvas, @NotNull Rect bounds, int position, boolean last) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            VerticalAtomsDecorator verticalAtomsDecorator = this.nestedDecorator;
            if (verticalAtomsDecorator != null) {
                verticalAtomsDecorator.decorate(canvas, bounds, position, last);
            }
        }

        @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
        @NotNull
        public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
            int px;
            LinearLayout.LayoutParams modifyVerticalLayoutParams;
            Intrinsics.checkNotNullParameter(lp, "lp");
            Intrinsics.checkNotNullParameter(data, "data");
            Configuration.WidthMode widthMode = this.widthMode;
            if (Intrinsics.d(widthMode, Configuration.WidthMode.Parent.INSTANCE)) {
                px = -1;
            } else if (Intrinsics.d(widthMode, Configuration.WidthMode.Wrap.INSTANCE)) {
                px = -2;
            } else {
                if (!(widthMode instanceof Configuration.WidthMode.Fixed)) {
                    throw new o();
                }
                px = toPx(((Configuration.WidthMode.Fixed) this.widthMode).getWidth());
            }
            lp.width = px;
            lp.height = -2;
            VerticalAtomsDecorator verticalAtomsDecorator = this.nestedDecorator;
            return (verticalAtomsDecorator == null || (modifyVerticalLayoutParams = verticalAtomsDecorator.modifyVerticalLayoutParams((LinearLayout.LayoutParams) this.decorateHelper.processLp(data, lp), data, position, last)) == null) ? lp : modifyVerticalLayoutParams;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalContainerAtom(@NotNull View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        AtomVerticalContainerBinding bind = AtomVerticalContainerBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.defaultConfigurations = U.i(new Pair(new Atom.ConfCondition(VerticalContainer.class, null, 2, null), new Configuration(0, 0, 0, 0, null, 0, null, 127, null)));
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Map<Atom.ConfCondition, Configuration> getDefaultConfigurations() {
        return this.defaultConfigurations;
    }

    @Override // ru.ozon.uni.atoms.af.HasNested
    public void setNestedConfigs(String atomContext, @NotNull Map<Atom.ConfCondition, ? extends Map<Atom.ConfCondition, ? extends Atom.AtomConfiguration>> nestedConfigs, Map<Atom.ConfCondition, ? extends AtomDecorator> nestedDecorators) {
        Intrinsics.checkNotNullParameter(nestedConfigs, "nestedConfigs");
        Map<Atom.ConfCondition, ? extends Atom.AtomConfiguration> map = nestedConfigs.get(new Atom.ConfCondition(VerticalContainer.class, atomContext));
        if (map == null) {
            map = U.c();
        }
        this.adapter = new AtomsAdapter(map, nestedConfigs, nestedDecorators, null, 8, null);
        CommonAtomDecorator commonAtomDecorator = nestedDecorators != null ? (AtomDecorator) nestedDecorators.get(new Atom.ConfCondition(VerticalContainer.class, atomContext)) : null;
        this.nestedDecorator = commonAtomDecorator instanceof VerticalAtomsDecorator ? (VerticalAtomsDecorator) commonAtomDecorator : null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull VerticalContainer item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AtomsAdapter atomsAdapter = this.adapter;
        if (atomsAdapter != null) {
            atomsAdapter.bind(getContext(), item.getItems());
        } else {
            Intrinsics.n("adapter");
            throw null;
        }
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        getContainerView().setPadding(ResourceExtKt.toPx(configuration.getPaddingStart()), ResourceExtKt.toPx(configuration.getPaddingTop()), ResourceExtKt.toPx(configuration.getPaddingEnd()), ResourceExtKt.toPx(configuration.getPaddingBottom()));
        Integer backgroundColor = configuration.getBackgroundColor();
        if (backgroundColor != null) {
            getContainerView().setBackgroundColor(androidx.core.content.a.getColor(getContext(), backgroundColor.intValue()));
        }
        this.decorator = new ItemsDecorator(getContext(), configuration.getWidthMode(), this.nestedDecorator);
        this.binding.itemsVAL.setHorizontalGravity(configuration.getHorizontalChildGravity());
        AtomsAdapter atomsAdapter = this.adapter;
        if (atomsAdapter == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        atomsAdapter.setOnAction(getOnAction());
        VerticalAtomsLayout verticalAtomsLayout = this.binding.itemsVAL;
        AtomsAdapter atomsAdapter2 = this.adapter;
        if (atomsAdapter2 == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        verticalAtomsLayout.setAdapter(atomsAdapter2);
        VerticalAtomsLayout verticalAtomsLayout2 = this.binding.itemsVAL;
        ItemsDecorator itemsDecorator = this.decorator;
        if (itemsDecorator != null) {
            verticalAtomsLayout2.setDecorator(itemsDecorator);
        } else {
            Intrinsics.n("decorator");
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VerticalContainerAtom(@NotNull Context context, String str) {
        this(r3, str);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, R$layout.atom_vertical_container, null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
    }
}
