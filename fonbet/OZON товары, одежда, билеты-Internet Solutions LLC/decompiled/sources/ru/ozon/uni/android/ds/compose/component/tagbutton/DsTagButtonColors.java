package ru.ozon.uni.android.ds.compose.component.tagbutton;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B;\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ?\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;", "", "Ll1/Z;", "backgroundColor", "textColor", "iconTint", "closeIconTint", "loaderColor", "<init>", "(JJJJJ)V", "copy-t635Npw", "(JJJJJ)Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;", "copy", "J", "getBackgroundColor-0d7_KjU$uni_release", "()J", "getTextColor-0d7_KjU$uni_release", "getIconTint-0d7_KjU$uni_release", "getCloseIconTint-0d7_KjU$uni_release", "getLoaderColor-0d7_KjU$uni_release", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTagButtonColors {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long backgroundColor;
    private final long closeIconTint;
    private final long iconTint;
    private final long loaderColor;
    private final long textColor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors$Companion;", "", "<init>", "()V", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;", "default", "(LS0/k;I)Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;", "selected", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: default, reason: not valid java name */
        public final DsTagButtonColors m1807default(InterfaceC3967k interfaceC3967k, int i11) {
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            return new DsTagButtonColors(uniTheme.getColors(interfaceC3967k, i12).getBgSecondary(), uniTheme.getColors(interfaceC3967k, i12).getTextPrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), null);
        }

        @NotNull
        public final DsTagButtonColors selected(InterfaceC3967k interfaceC3967k, int i11) {
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            return new DsTagButtonColors(uniTheme.getColors(interfaceC3967k, i12).getBgPremiumPrimaryInverted(), uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryInverted(), uniTheme.getColors(interfaceC3967k, i12).getGraphicSecondaryInverted(), uniTheme.getColors(interfaceC3967k, i12).getGraphicSecondaryInverted(), uniTheme.getColors(interfaceC3967k, i12).getGraphicSecondaryInverted(), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DsTagButtonColors(long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15);
    }

    /* renamed from: copy-t635Npw$default, reason: not valid java name */
    public static /* synthetic */ DsTagButtonColors m1800copyt635Npw$default(DsTagButtonColors dsTagButtonColors, long j11, long j12, long j13, long j14, long j15, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = dsTagButtonColors.backgroundColor;
        }
        long j16 = j11;
        if ((i11 & 2) != 0) {
            j12 = dsTagButtonColors.textColor;
        }
        return dsTagButtonColors.m1801copyt635Npw(j16, j12, (i11 & 4) != 0 ? dsTagButtonColors.iconTint : j13, (i11 & 8) != 0 ? dsTagButtonColors.closeIconTint : j14, (i11 & 16) != 0 ? dsTagButtonColors.loaderColor : j15);
    }

    @NotNull
    /* renamed from: copy-t635Npw, reason: not valid java name */
    public final DsTagButtonColors m1801copyt635Npw(long backgroundColor, long textColor, long iconTint, long closeIconTint, long loaderColor) {
        return new DsTagButtonColors(backgroundColor, textColor, iconTint, closeIconTint, loaderColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU$uni_release, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getCloseIconTint-0d7_KjU$uni_release, reason: not valid java name and from getter */
    public final long getCloseIconTint() {
        return this.closeIconTint;
    }

    /* renamed from: getIconTint-0d7_KjU$uni_release, reason: not valid java name and from getter */
    public final long getIconTint() {
        return this.iconTint;
    }

    /* renamed from: getLoaderColor-0d7_KjU$uni_release, reason: not valid java name and from getter */
    public final long getLoaderColor() {
        return this.loaderColor;
    }

    /* renamed from: getTextColor-0d7_KjU$uni_release, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    private DsTagButtonColors(long j11, long j12, long j13, long j14, long j15) {
        this.backgroundColor = j11;
        this.textColor = j12;
        this.iconTint = j13;
        this.closeIconTint = j14;
        this.loaderColor = j15;
    }
}
