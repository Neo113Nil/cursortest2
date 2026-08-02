package ru.ozon.uni.android.input.textinput.data;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001d2\u00020\u0001:\u0004\u001a\u001b\u001c\u001dBK\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0001\u0003\u001e\u001f ¨\u0006!"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/TextInputStyle;", "", "withInputLabelStyle", "", "withoutInputLabelStyle", "inputStyle", "height", "cornerRadius", "", "leftOffset", "rightOffset", "hasLabel", "", "<init>", "(IIIIFIIZ)V", "getWithInputLabelStyle", "()I", "getWithoutInputLabelStyle", "getInputStyle", "getHeight", "getCornerRadius", "()F", "getLeftOffset", "getRightOffset", "getHasLabel", "()Z", "Input500", "Input600", "Input600Accent", "Companion", "Lru/ozon/uni/android/input/textinput/data/TextInputStyle$Input500;", "Lru/ozon/uni/android/input/textinput/data/TextInputStyle$Input600;", "Lru/ozon/uni/android/input/textinput/data/TextInputStyle$Input600Accent;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class TextInputStyle {
    private final float cornerRadius;
    private final boolean hasLabel;
    private final int height;
    private final int inputStyle;
    private final int leftOffset;
    private final int rightOffset;
    private final int withInputLabelStyle;
    private final int withoutInputLabelStyle;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int input500Height = UiExtKt.toPx(44);
    private static final float input500CornerRadius = UiExtKt.toPxF(12);
    private static final int input500LeftOffset = UiExtKt.toPx(16);
    private static final int input500RightOffset = UiExtKt.toPx(10);
    private static final int input600Height = UiExtKt.toPx(56);
    private static final float input600CornerRadius = UiExtKt.toPxF(16);
    private static final int input600LeftOffset = UiExtKt.toPx(16);
    private static final int input600RightOffset = UiExtKt.toPx(16);
    private static final int input600AccentHeight = UiExtKt.toPx(56);
    private static final float input600AccentCornerRadius = UiExtKt.toPxF(16);
    private static final int input600AccentLeftOffset = UiExtKt.toPx(16);
    private static final int input600AccentRightOffset = UiExtKt.toPx(16);
    private static final float inputRoundedCornerRadius = UiExtKt.toPxF(16);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/TextInputStyle$Companion;", "", "<init>", "()V", "input500Height", "", "input500CornerRadius", "", "input500LeftOffset", "input500RightOffset", "input600Height", "input600CornerRadius", "input600LeftOffset", "input600RightOffset", "input600AccentHeight", "input600AccentCornerRadius", "input600AccentLeftOffset", "input600AccentRightOffset", "inputRoundedCornerRadius", "getInputRoundedCornerRadius$uni_release", "()F", "createInput600Style", "Lru/ozon/uni/android/input/textinput/data/TextInputStyle;", "createInput500Style", "createInput600AccentStyle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextInputStyle createInput500Style() {
            return new Input500();
        }

        @NotNull
        public final TextInputStyle createInput600AccentStyle() {
            return new Input600Accent();
        }

        @NotNull
        public final TextInputStyle createInput600Style() {
            return new Input600();
        }

        public final float getInputRoundedCornerRadius$uni_release() {
            return TextInputStyle.inputRoundedCornerRadius;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/TextInputStyle$Input500;", "Lru/ozon/uni/android/input/textinput/data/TextInputStyle;", "<init>", "()V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Input500 extends TextInputStyle {
        public Input500() {
            super(-1, -1, UniTextStyles.COMPACT_500_MEDIUM.getResId(), TextInputStyle.input500Height, TextInputStyle.input500CornerRadius, TextInputStyle.input500LeftOffset, TextInputStyle.input500RightOffset, false, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/TextInputStyle$Input600;", "Lru/ozon/uni/android/input/textinput/data/TextInputStyle;", "<init>", "()V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Input600 extends TextInputStyle {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Input600() {
            super(r2, r0.getResId(), r0.getResId(), TextInputStyle.input600Height, TextInputStyle.input600CornerRadius, TextInputStyle.input600LeftOffset, TextInputStyle.input600RightOffset, false, UserVerificationMethods.USER_VERIFY_PATTERN, null);
            int resId = UniTextStyles.BODY_300_X_SMALL.getResId();
            UniTextStyles uniTextStyles = UniTextStyles.COMPACT_500_MEDIUM;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/TextInputStyle$Input600Accent;", "Lru/ozon/uni/android/input/textinput/data/TextInputStyle;", "<init>", "()V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Input600Accent extends TextInputStyle {
        public Input600Accent() {
            super(UniTextStyles.BODY_300_X_SMALL.getResId(), UniTextStyles.COMPACT_500_MEDIUM.getResId(), UniTextStyles.HEADLINE_500_MEDIUM.getResId(), TextInputStyle.input600AccentHeight, TextInputStyle.input600AccentCornerRadius, TextInputStyle.input600AccentLeftOffset, TextInputStyle.input600AccentRightOffset, false, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        }
    }

    public /* synthetic */ TextInputStyle(int i11, int i12, int i13, int i14, float f7, int i15, int i16, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, i14, f7, i15, i16, z11);
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final boolean getHasLabel() {
        return this.hasLabel;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getInputStyle() {
        return this.inputStyle;
    }

    public final int getLeftOffset() {
        return this.leftOffset;
    }

    public final int getRightOffset() {
        return this.rightOffset;
    }

    public final int getWithInputLabelStyle() {
        return this.withInputLabelStyle;
    }

    public final int getWithoutInputLabelStyle() {
        return this.withoutInputLabelStyle;
    }

    private TextInputStyle(int i11, int i12, int i13, int i14, float f7, int i15, int i16, boolean z11) {
        this.withInputLabelStyle = i11;
        this.withoutInputLabelStyle = i12;
        this.inputStyle = i13;
        this.height = i14;
        this.cornerRadius = f7;
        this.leftOffset = i15;
        this.rightOffset = i16;
        this.hasLabel = z11;
    }

    /* synthetic */ TextInputStyle(int i11, int i12, int i13, int i14, float f7, int i15, int i16, boolean z11, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, i14, f7, i15, i16, (i17 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? true : z11, null);
    }
}
