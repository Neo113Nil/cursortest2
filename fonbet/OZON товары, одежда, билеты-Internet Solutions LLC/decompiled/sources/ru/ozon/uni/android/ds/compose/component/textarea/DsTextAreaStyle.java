package ru.ozon.uni.android.ds.compose.component.textarea;

import S0.InterfaceC3967k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b#\u0010\"R\u001a\u0010$\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001a\u0010*\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001a\u0010,\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'¨\u0006/"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStyle;", "", "Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStatus;", "status", "Ll1/Z;", "borderColor", "activeBorderColor", "textColor", "labelColor", "captionColor", "systemIconColor", "Lq1/b;", "systemIcon", "rightContentIcon", "<init>", "(Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStatus;JJJJJJLq1/b;Lq1/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hasInfoIcon", "hasRightContentInfoIcon$uni_release", "(Z)Z", "hasRightContentInfoIcon", "Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStatus;", "getStatus", "()Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStatus;", "J", "getBorderColor-0d7_KjU", "()J", "getActiveBorderColor-0d7_KjU", "getTextColor-0d7_KjU", "getLabelColor-0d7_KjU", "getCaptionColor-0d7_KjU", "getSystemIconColor-0d7_KjU", "Lq1/b;", "getSystemIcon", "()Lq1/b;", "getRightContentIcon", "isEnabled", "Z", "isEnabled$uni_release", "()Z", "isDisabled", "isDisabled$uni_release", "isReadOnly", "isReadOnly$uni_release", "hasSystemIcon", "getHasSystemIcon$uni_release", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTextAreaStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long activeBorderColor;
    private final long borderColor;
    private final long captionColor;
    private final boolean hasSystemIcon;
    private final boolean isDisabled;
    private final boolean isEnabled;
    private final boolean isReadOnly;
    private final long labelColor;
    private final AbstractC8972b rightContentIcon;

    @NotNull
    private final DsTextAreaStatus status;
    private final AbstractC8972b systemIcon;
    private final long systemIconColor;
    private final long textColor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStyle$Companion;", "", "<init>", "()V", "Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStyle;", "default", "(LS0/k;I)Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStyle;", "success", "error", "disabled", "readOnly", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: default, reason: not valid java name */
        public final DsTextAreaStyle m1828default(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(1245829745);
            DsTextAreaStatus dsTextAreaStatus = DsTextAreaStatus.DEFAULT;
            UniTheme uniTheme = UniTheme.INSTANCE;
            uniTheme.getIcons();
            interfaceC3967k.B(-618687229);
            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_info_filled, "ic_m_info_filled", interfaceC3967k, 48);
            interfaceC3967k.K();
            int i12 = UniTheme.$stable;
            DsTextAreaStyle dsTextAreaStyle = new DsTextAreaStyle(dsTextAreaStatus, uniTheme.getColors(interfaceC3967k, i12).getGraphicNeutral(), uniTheme.getColors(interfaceC3967k, i12).getGraphicActionPrimary(), uniTheme.getColors(interfaceC3967k, i12).getTextPrimary(), uniTheme.getColors(interfaceC3967k, i12).getTextTertiary(), uniTheme.getColors(interfaceC3967k, i12).getTextSecondary(), 0L, null, uniPainterResource, 192, null);
            interfaceC3967k.k();
            return dsTextAreaStyle;
        }

        @NotNull
        public final DsTextAreaStyle disabled(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(689998266);
            DsTextAreaStatus dsTextAreaStatus = DsTextAreaStatus.DISABLED;
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsTextAreaStyle dsTextAreaStyle = new DsTextAreaStyle(dsTextAreaStatus, uniTheme.getColors(interfaceC3967k, i12).getGraphicNeutral(), 0L, C7807Z.o(0.2f, uniTheme.getColors(interfaceC3967k, i12).getTextPrimary()), C7807Z.o(0.2f, uniTheme.getColors(interfaceC3967k, i12).getTextTertiary()), uniTheme.getColors(interfaceC3967k, i12).getTextSecondary(), 0L, null, null, 452, null);
            interfaceC3967k.k();
            return dsTextAreaStyle;
        }

        @NotNull
        public final DsTextAreaStyle error(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-436363638);
            DsTextAreaStatus dsTextAreaStatus = DsTextAreaStatus.ERROR;
            UniTheme uniTheme = UniTheme.INSTANCE;
            uniTheme.getIcons();
            interfaceC3967k.B(-618687229);
            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_info_filled, "ic_m_info_filled", interfaceC3967k, 48);
            interfaceC3967k.K();
            int i12 = UniTheme.$stable;
            DsTextAreaStyle dsTextAreaStyle = new DsTextAreaStyle(dsTextAreaStatus, uniTheme.getColors(interfaceC3967k, i12).getGraphicNegativePrimary(), 0L, uniTheme.getColors(interfaceC3967k, i12).getTextPrimary(), uniTheme.getColors(interfaceC3967k, i12).getTextTertiary(), uniTheme.getColors(interfaceC3967k, i12).getTextNegative(), 0L, null, uniPainterResource, 196, null);
            interfaceC3967k.k();
            return dsTextAreaStyle;
        }

        @NotNull
        public final DsTextAreaStyle readOnly(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(1480847764);
            DsTextAreaStatus dsTextAreaStatus = DsTextAreaStatus.READ_ONLY;
            UniTheme uniTheme = UniTheme.INSTANCE;
            uniTheme.getIcons();
            interfaceC3967k.B(2006897247);
            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_lock_closed_filled_compact, "ic_m_lock_closed_filled_compact", interfaceC3967k, 48);
            interfaceC3967k.K();
            int i12 = UniTheme.$stable;
            long graphicTertiary = uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary();
            uniTheme.getIcons();
            interfaceC3967k.B(1810476643);
            AbstractC8972b uniPainterResource2 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_copy_filled, "ic_m_copy_filled", interfaceC3967k, 48);
            interfaceC3967k.K();
            DsTextAreaStyle dsTextAreaStyle = new DsTextAreaStyle(dsTextAreaStatus, uniTheme.getColors(interfaceC3967k, i12).getGraphicNeutral(), 0L, uniTheme.getColors(interfaceC3967k, i12).getTextPrimary(), uniTheme.getColors(interfaceC3967k, i12).getTextTertiary(), uniTheme.getColors(interfaceC3967k, i12).getTextSecondary(), graphicTertiary, uniPainterResource, uniPainterResource2, 4, null);
            interfaceC3967k.k();
            return dsTextAreaStyle;
        }

        @NotNull
        public final DsTextAreaStyle success(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-47162897);
            DsTextAreaStatus dsTextAreaStatus = DsTextAreaStatus.SUCCESS;
            UniTheme uniTheme = UniTheme.INSTANCE;
            uniTheme.getIcons();
            interfaceC3967k.B(-618687229);
            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_info_filled, "ic_m_info_filled", interfaceC3967k, 48);
            interfaceC3967k.K();
            int i12 = UniTheme.$stable;
            long graphicPositivePrimary = uniTheme.getColors(interfaceC3967k, i12).getGraphicPositivePrimary();
            long textPrimary = uniTheme.getColors(interfaceC3967k, i12).getTextPrimary();
            long textTertiary = uniTheme.getColors(interfaceC3967k, i12).getTextTertiary();
            AbstractC8972b icon = TokensExtKt.getIcon(uniTheme.getIconTokens().getIc_m_check(), interfaceC3967k, UniIconToken.$stable);
            DsTextAreaStyle dsTextAreaStyle = new DsTextAreaStyle(dsTextAreaStatus, graphicPositivePrimary, 0L, textPrimary, textTertiary, uniTheme.getColors(interfaceC3967k, i12).getTextSecondary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPositivePrimary(), icon, uniPainterResource, 4, null);
            interfaceC3967k.k();
            return dsTextAreaStyle;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DsTextAreaStyle(DsTextAreaStatus dsTextAreaStatus, long j11, long j12, long j13, long j14, long j15, long j16, AbstractC8972b abstractC8972b, AbstractC8972b abstractC8972b2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dsTextAreaStatus, j11, j12, j13, j14, j15, j16, abstractC8972b, abstractC8972b2);
    }

    /* renamed from: getActiveBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveBorderColor() {
        return this.activeBorderColor;
    }

    /* renamed from: getBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: getCaptionColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCaptionColor() {
        return this.captionColor;
    }

    /* renamed from: getHasSystemIcon$uni_release, reason: from getter */
    public final boolean getHasSystemIcon() {
        return this.hasSystemIcon;
    }

    /* renamed from: getLabelColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getLabelColor() {
        return this.labelColor;
    }

    public final AbstractC8972b getRightContentIcon() {
        return this.rightContentIcon;
    }

    @NotNull
    public final DsTextAreaStatus getStatus() {
        return this.status;
    }

    public final AbstractC8972b getSystemIcon() {
        return this.systemIcon;
    }

    /* renamed from: getSystemIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSystemIconColor() {
        return this.systemIconColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    public final boolean hasRightContentInfoIcon$uni_release(boolean hasInfoIcon) {
        DsTextAreaStatus dsTextAreaStatus = this.status;
        return (dsTextAreaStatus == DsTextAreaStatus.DISABLED || dsTextAreaStatus == DsTextAreaStatus.READ_ONLY || !hasInfoIcon) ? false : true;
    }

    /* renamed from: isDisabled$uni_release, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: isEnabled$uni_release, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: isReadOnly$uni_release, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    private DsTextAreaStyle(DsTextAreaStatus status, long j11, long j12, long j13, long j14, long j15, long j16, AbstractC8972b abstractC8972b, AbstractC8972b abstractC8972b2) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.borderColor = j11;
        this.activeBorderColor = j12;
        this.textColor = j13;
        this.labelColor = j14;
        this.captionColor = j15;
        this.systemIconColor = j16;
        this.systemIcon = abstractC8972b;
        this.rightContentIcon = abstractC8972b2;
        DsTextAreaStatus dsTextAreaStatus = DsTextAreaStatus.DISABLED;
        this.isEnabled = status != dsTextAreaStatus;
        this.isDisabled = status == dsTextAreaStatus;
        this.isReadOnly = status == DsTextAreaStatus.READ_ONLY;
        this.hasSystemIcon = abstractC8972b != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DsTextAreaStyle(DsTextAreaStatus dsTextAreaStatus, long j11, long j12, long j13, long j14, long j15, long j16, AbstractC8972b abstractC8972b, AbstractC8972b abstractC8972b2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dsTextAreaStatus, j11, r6, j13, j14, j15, r14, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : abstractC8972b, (i11 & 256) != 0 ? null : abstractC8972b2, null);
        long j17;
        long j18;
        long j19 = (i11 & 4) != 0 ? j11 : j12;
        if ((i11 & 64) != 0) {
            int i12 = C7807Z.f72260n;
            j18 = C7807Z.f72259m;
            j17 = j18;
        } else {
            j17 = j16;
        }
    }
}
