package ru.ozon.app.android.atoms.atom2;

import Am.C2438a;
import B0.C2454a;
import Sc.InterfaceC3999a;
import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.atom2.InputAtom;
import ru.ozon.app.android.atoms.data.deprecated.Input;
import ru.ozon.app.android.atoms.databinding.AtomInputBinding;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.atoms.af.Atom;

@InterfaceC3999a
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001%B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\fR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/atoms/atom2/InputAtom;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onConfigurationChanged", "()V", "Landroid/text/TextWatcher;", "textWatcher", "addTextChangedListener", "(Landroid/text/TextWatcher;)V", "removeTextChangedListener", "Lru/ozon/app/android/atoms/data/deprecated/Input;", "item", "bind", "(Lru/ozon/app/android/atoms/data/deprecated/Input;)V", "", "getAtomTextValue", "()Ljava/lang/String;", "clearError", "Lru/ozon/app/android/atoms/databinding/AtomInputBinding;", "binding", "Lru/ozon/app/android/atoms/databinding/AtomInputBinding;", "Lru/ozon/app/android/atoms/atom2/InputAtom$Configuration;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "configuration", "Lru/ozon/app/android/atoms/atom2/InputAtom$Configuration;", "getConfiguration", "()Lru/ozon/app/android/atoms/atom2/InputAtom$Configuration;", "setConfiguration", "(Lru/ozon/app/android/atoms/atom2/InputAtom$Configuration;)V", "Configuration", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputAtom extends FrameLayout {

    @NotNull
    private final AtomInputBinding binding;

    @NotNull
    private Configuration configuration;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(BQ\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b'\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/atoms/atom2/InputAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "Lru/ozon/app/android/atoms/atom2/InputAtom$Configuration$InputType;", "inputType", "maxLines", "minimumHeight", "<init>", "(IIIILru/ozon/app/android/atoms/atom2/InputAtom$Configuration$InputType;Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "Lru/ozon/app/android/atoms/atom2/InputAtom$Configuration$InputType;", "getInputType", "()Lru/ozon/app/android/atoms/atom2/InputAtom$Configuration$InputType;", "Ljava/lang/Integer;", "getMaxLines", "()Ljava/lang/Integer;", "getMinimumHeight", "InputType", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Configuration implements Atom.AtomConfiguration {

        @NotNull
        private final InputType inputType;
        private final Integer maxLines;
        private final Integer minimumHeight;
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/atoms/atom2/InputAtom$Configuration$InputType;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT", "TEXT_MULTILINE", "NUMBER", "PHONE", "EMAIL", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InputType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ InputType[] $VALUES;
            public static final InputType TEXT = new InputType("TEXT", 0);
            public static final InputType TEXT_MULTILINE = new InputType("TEXT_MULTILINE", 1);
            public static final InputType NUMBER = new InputType("NUMBER", 2);
            public static final InputType PHONE = new InputType("PHONE", 3);
            public static final InputType EMAIL = new InputType("EMAIL", 4);

            private static final /* synthetic */ InputType[] $values() {
                return new InputType[]{TEXT, TEXT_MULTILINE, NUMBER, PHONE, EMAIL};
            }

            static {
                InputType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private InputType(String str, int i11) {
            }

            public static InputType valueOf(String str) {
                return (InputType) Enum.valueOf(InputType.class, str);
            }

            public static InputType[] values() {
                return (InputType[]) $VALUES.clone();
            }
        }

        public Configuration() {
            this(0, 0, 0, 0, null, null, null, 127, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.paddingStart == configuration.paddingStart && this.paddingEnd == configuration.paddingEnd && this.paddingTop == configuration.paddingTop && this.paddingBottom == configuration.paddingBottom && this.inputType == configuration.inputType && Intrinsics.d(this.maxLines, configuration.maxLines) && Intrinsics.d(this.minimumHeight, configuration.minimumHeight);
        }

        @NotNull
        public final InputType getInputType() {
            return this.inputType;
        }

        public final Integer getMaxLines() {
            return this.maxLines;
        }

        public final Integer getMinimumHeight() {
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
            int hashCode = (this.inputType.hashCode() + C2454a.a(this.paddingBottom, C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31), 31)) * 31;
            Integer num = this.maxLines;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.minimumHeight;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
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
            InputType inputType = this.inputType;
            Integer num = this.maxLines;
            Integer num2 = this.minimumHeight;
            StringBuilder a11 = C2438a.a("Configuration(paddingStart=", i11, ", paddingEnd=", ", paddingTop=", i12);
            Ek.a.f(i13, i14, ", paddingBottom=", ", inputType=", a11);
            a11.append(inputType);
            a11.append(", maxLines=");
            a11.append(num);
            a11.append(", minimumHeight=");
            return Ep.a.c(a11, num2, ")");
        }

        public Configuration(int i11, int i12, int i13, int i14, @NotNull InputType inputType, Integer num, Integer num2) {
            Intrinsics.checkNotNullParameter(inputType, "inputType");
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
            this.inputType = inputType;
            this.maxLines = num;
            this.minimumHeight = num2;
        }

        public /* synthetic */ Configuration(int i11, int i12, int i13, int i14, InputType inputType, Integer num, Integer num2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? 16 : i11, (i15 & 2) != 0 ? 16 : i12, (i15 & 4) != 0 ? 4 : i13, (i15 & 8) != 0 ? 4 : i14, (i15 & 16) != 0 ? InputType.TEXT : inputType, (i15 & 32) != 0 ? null : num, (i15 & 64) != 0 ? null : num2);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Configuration.InputType.values().length];
            try {
                iArr[Configuration.InputType.TEXT_MULTILINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Configuration.InputType.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Configuration.InputType.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Configuration.InputType.PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Configuration.InputType.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ InputAtom(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(AtomInputBinding atomInputBinding, KeyListener keyListener, View view, boolean z11) {
        if (z11) {
            atomInputBinding.fieldEt.setKeyListener(keyListener);
            atomInputBinding.fieldEt.setEllipsize(null);
        } else {
            atomInputBinding.fieldEt.setKeyListener(null);
            atomInputBinding.fieldEt.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    private final void onConfigurationChanged() {
        int i11;
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
        TextInputEditText textInputEditText = this.binding.fieldEt;
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.configuration.getInputType().ordinal()];
        if (i12 != 1) {
            i11 = 2;
            if (i12 == 2) {
                i11 = 16385;
            } else if (i12 != 3) {
                if (i12 == 4) {
                    i11 = 3;
                } else {
                    if (i12 != 5) {
                        throw new o();
                    }
                    i11 = 33;
                }
            }
        } else {
            i11 = 147457;
        }
        textInputEditText.setInputType(i11);
        Integer maxLines = this.configuration.getMaxLines();
        if (maxLines != null) {
            this.binding.fieldEt.setMaxLines(maxLines.intValue());
        }
        Integer minimumHeight = this.configuration.getMinimumHeight();
        if (minimumHeight != null) {
            setMinimumHeight(minimumHeight.intValue());
        }
        requestLayout();
    }

    public final void addTextChangedListener(@NotNull TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        this.binding.fieldEt.addTextChangedListener(textWatcher);
    }

    public final void bind(@NotNull Input item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextInputLayout textInputLayout = this.binding.fieldTil;
        textInputLayout.Z(item.getError());
        String error = item.getError();
        textInputLayout.a0(!(error == null || h.K(error)));
        textInputLayout.d0(item.getHint());
        String text = item.getText();
        if (text != null) {
            TextInputEditText textInputEditText = this.binding.fieldEt;
            Intrinsics.f(textInputEditText);
            TextViewExtKt.setTextWithSaveCursorPosition(textInputEditText, text);
        }
    }

    public final void clearError() {
        this.binding.fieldTil.Z(null);
        this.binding.fieldTil.a0(false);
    }

    @NotNull
    public final String getAtomTextValue() {
        return String.valueOf(this.binding.fieldEt.getText());
    }

    public final void removeTextChangedListener(@NotNull TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        this.binding.fieldEt.removeTextChangedListener(textWatcher);
    }

    public final void setConfiguration(@NotNull Configuration value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.configuration = value;
        onConfigurationChanged();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputAtom(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.configuration = new Configuration(0, 0, 0, 0, null, null, null, 127, null);
        final AtomInputBinding inflate = AtomInputBinding.inflate(LayoutInflater.from(context), this);
        this.binding = inflate;
        if (attributeSet == null) {
            onConfigurationChanged();
        }
        final KeyListener keyListener = inflate.fieldEt.getKeyListener();
        inflate.fieldEt.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Ql.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                InputAtom.lambda$1$lambda$0(AtomInputBinding.this, keyListener, view, z11);
            }
        });
    }
}
