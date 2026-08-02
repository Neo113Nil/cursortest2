package ru.ozon.uni.android.ds.compose.component.selectionControls.checkbox;

import S0.InterfaceC3967k;
import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle;", "", "enabledColors", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle$DSCheckboxColoredProps;", "errorColors", "disabledColors", "<init>", "(Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle$DSCheckboxColoredProps;Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle$DSCheckboxColoredProps;Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle$DSCheckboxColoredProps;)V", "getEnabledColors", "()Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle$DSCheckboxColoredProps;", "getErrorColors", "getDisabledColors", "getStateColors", "state", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxState;", "Companion", "DSCheckboxColoredProps", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsCheckboxStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final DSCheckboxColoredProps disabledColors;

    @NotNull
    private final DSCheckboxColoredProps enabledColors;

    @NotNull
    private final DSCheckboxColoredProps errorColors;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle$Companion;", "", "<init>", "()V", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle;", "base", "(LS0/k;I)Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DsCheckboxStyle base(InterfaceC3967k interfaceC3967k, int i11) {
            DSCheckboxColoredProps.Companion companion = DSCheckboxColoredProps.INSTANCE;
            return new DsCheckboxStyle(companion.enabled(interfaceC3967k, 6), companion.error(interfaceC3967k, 6), companion.disabled(interfaceC3967k, 6));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle$DSCheckboxColoredProps;", "", "Ll1/Z;", "backgroundColor", "borderColor", "color", "iconColor", "textColor", "<init>", "(JJJJJ)V", "J", "getBackgroundColor-0d7_KjU", "()J", "getBorderColor-0d7_KjU", "getColor-0d7_KjU", "getIconColor-0d7_KjU", "getTextColor-0d7_KjU", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DSCheckboxColoredProps {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final long backgroundColor;
        private final long borderColor;
        private final long color;
        private final long iconColor;
        private final long textColor;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006JS\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle$DSCheckboxColoredProps$Companion;", "", "<init>", "()V", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle$DSCheckboxColoredProps;", "enabled", "(LS0/k;I)Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle$DSCheckboxColoredProps;", "error", "disabled", "baseScheme", "Ll1/Z;", "backgroundColor", "borderColor", "color", "iconColor", "textColor", "custom-zVxc6go", "(Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle$DSCheckboxColoredProps;Ll1/Z;Ll1/Z;Ll1/Z;Ll1/Z;Ll1/Z;LS0/k;II)Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle$DSCheckboxColoredProps;", "custom", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* renamed from: custom-zVxc6go, reason: not valid java name */
            public final DSCheckboxColoredProps m1785customzVxc6go(@NotNull DSCheckboxColoredProps baseScheme, C7807Z c7807z, C7807Z c7807z2, C7807Z c7807z3, C7807Z c7807z4, C7807Z c7807z5, InterfaceC3967k interfaceC3967k, int i11, int i12) {
                Intrinsics.checkNotNullParameter(baseScheme, "baseScheme");
                C7807Z c7807z6 = (i12 & 2) != 0 ? null : c7807z;
                C7807Z c7807z7 = (i12 & 4) != 0 ? null : c7807z2;
                C7807Z c7807z8 = (i12 & 8) != 0 ? null : c7807z3;
                C7807Z c7807z9 = (i12 & 16) != 0 ? null : c7807z4;
                C7807Z c7807z10 = (i12 & 32) == 0 ? c7807z5 : null;
                return new DSCheckboxColoredProps(c7807z6 != null ? c7807z6.w() : baseScheme.getBackgroundColor(), c7807z7 != null ? c7807z7.w() : baseScheme.getBorderColor(), c7807z8 != null ? c7807z8.w() : baseScheme.getColor(), c7807z9 != null ? c7807z9.w() : baseScheme.getIconColor(), c7807z10 != null ? c7807z10.w() : baseScheme.getTextColor(), null);
            }

            @NotNull
            public final DSCheckboxColoredProps disabled(InterfaceC3967k interfaceC3967k, int i11) {
                UniTheme uniTheme = UniTheme.INSTANCE;
                int i12 = UniTheme.$stable;
                return new DSCheckboxColoredProps(uniTheme.getColors(interfaceC3967k, i12).getBgOverlap(), uniTheme.getColors(interfaceC3967k, i12).getGraphicNeutral(), uniTheme.getColors(interfaceC3967k, i12).getBgOverlap(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getTextTertiary(), null);
            }

            @NotNull
            public final DSCheckboxColoredProps enabled(InterfaceC3967k interfaceC3967k, int i11) {
                UniTheme uniTheme = UniTheme.INSTANCE;
                int i12 = UniTheme.$stable;
                return new DSCheckboxColoredProps(uniTheme.getColors(interfaceC3967k, i12).getBgPrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicNeutral(), uniTheme.getColors(interfaceC3967k, i12).getBgActionPrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPrimaryDynamic(), uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryInverted(), null);
            }

            @NotNull
            public final DSCheckboxColoredProps error(InterfaceC3967k interfaceC3967k, int i11) {
                UniTheme uniTheme = UniTheme.INSTANCE;
                int i12 = UniTheme.$stable;
                return new DSCheckboxColoredProps(uniTheme.getColors(interfaceC3967k, i12).getBgOpaqueNegativeSecondary(), uniTheme.getColors(interfaceC3967k, i12).getBgNegativePrimary(), uniTheme.getColors(interfaceC3967k, i12).getBgNegativePrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPrimaryDynamic(), uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryInverted(), null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ DSCheckboxColoredProps(long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, j12, j13, j14, j15);
        }

        /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: getBorderColor-0d7_KjU, reason: not valid java name and from getter */
        public final long getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: getIconColor-0d7_KjU, reason: not valid java name and from getter */
        public final long getIconColor() {
            return this.iconColor;
        }

        /* renamed from: getTextColor-0d7_KjU, reason: not valid java name and from getter */
        public final long getTextColor() {
            return this.textColor;
        }

        private DSCheckboxColoredProps(long j11, long j12, long j13, long j14, long j15) {
            this.backgroundColor = j11;
            this.borderColor = j12;
            this.color = j13;
            this.iconColor = j14;
            this.textColor = j15;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DsCheckboxState.values().length];
            try {
                iArr[DsCheckboxState.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DsCheckboxState.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DsCheckboxState.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DsCheckboxStyle(@NotNull DSCheckboxColoredProps enabledColors, @NotNull DSCheckboxColoredProps errorColors, @NotNull DSCheckboxColoredProps disabledColors) {
        Intrinsics.checkNotNullParameter(enabledColors, "enabledColors");
        Intrinsics.checkNotNullParameter(errorColors, "errorColors");
        Intrinsics.checkNotNullParameter(disabledColors, "disabledColors");
        this.enabledColors = enabledColors;
        this.errorColors = errorColors;
        this.disabledColors = disabledColors;
    }

    @NotNull
    public final DSCheckboxColoredProps getDisabledColors() {
        return this.disabledColors;
    }

    @NotNull
    public final DSCheckboxColoredProps getEnabledColors() {
        return this.enabledColors;
    }

    @NotNull
    public final DSCheckboxColoredProps getErrorColors() {
        return this.errorColors;
    }

    @NotNull
    public final DSCheckboxColoredProps getStateColors(@NotNull DsCheckboxState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            return this.enabledColors;
        }
        if (i11 == 2) {
            return this.disabledColors;
        }
        if (i11 == 3) {
            return this.errorColors;
        }
        throw new o();
    }
}
