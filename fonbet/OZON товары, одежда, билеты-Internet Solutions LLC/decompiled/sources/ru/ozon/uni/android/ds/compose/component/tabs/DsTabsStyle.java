package ru.ozon.uni.android.ds.compose.component.tabs;

import I0.C3173b;
import N3.C3660k;
import Nh.a;
import Pk0.c;
import S0.InterfaceC3967k;
import Sc.C;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tabs/DsTabsStyle;", "", "Ll1/Z;", "bgColor", "bgColorSelected", "titleColor", "titleColorSelected", "subtitleColor", "subtitleColorSelected", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBgColor-0d7_KjU", "()J", "getBgColorSelected-0d7_KjU", "getTitleColor-0d7_KjU", "getTitleColorSelected-0d7_KjU", "getSubtitleColor-0d7_KjU", "getSubtitleColorSelected-0d7_KjU", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DsTabsStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long bgColor;
    private final long bgColorSelected;
    private final long subtitleColor;
    private final long subtitleColorSelected;
    private final long titleColor;
    private final long titleColorSelected;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tabs/DsTabsStyle$Companion;", "", "<init>", "()V", "Lru/ozon/uni/android/ds/compose/component/tabs/DsTabsStyle;", "accent", "(LS0/k;I)Lru/ozon/uni/android/ds/compose/component/tabs/DsTabsStyle;", "base", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DsTabsStyle accent(InterfaceC3967k interfaceC3967k, int i11) {
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            return new DsTabsStyle(uniTheme.getColors(interfaceC3967k, i12).getBgPrimary(), uniTheme.getColors(interfaceC3967k, i12).getBgPremiumPrimaryInverted(), uniTheme.getColors(interfaceC3967k, i12).getTextPrimary(), uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryInverted(), uniTheme.getColors(interfaceC3967k, i12).getTextSecondary(), uniTheme.getColors(interfaceC3967k, i12).getTextSecondaryInverted(), null);
        }

        @NotNull
        public final DsTabsStyle base(InterfaceC3967k interfaceC3967k, int i11) {
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            return new DsTabsStyle(uniTheme.getColors(interfaceC3967k, i12).getBgPrimary(), uniTheme.getColors(interfaceC3967k, i12).getLayerFloor3(), uniTheme.getColors(interfaceC3967k, i12).getTextPrimary(), uniTheme.getColors(interfaceC3967k, i12).getTextPrimary(), uniTheme.getColors(interfaceC3967k, i12).getTextSecondary(), uniTheme.getColors(interfaceC3967k, i12).getTextSecondary(), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DsTabsStyle(long j11, long j12, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, j16);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DsTabsStyle)) {
            return false;
        }
        DsTabsStyle dsTabsStyle = (DsTabsStyle) other;
        return C7807Z.p(this.bgColor, dsTabsStyle.bgColor) && C7807Z.p(this.bgColorSelected, dsTabsStyle.bgColorSelected) && C7807Z.p(this.titleColor, dsTabsStyle.titleColor) && C7807Z.p(this.titleColorSelected, dsTabsStyle.titleColorSelected) && C7807Z.p(this.subtitleColor, dsTabsStyle.subtitleColor) && C7807Z.p(this.subtitleColorSelected, dsTabsStyle.subtitleColorSelected);
    }

    /* renamed from: getBgColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBgColor() {
        return this.bgColor;
    }

    /* renamed from: getBgColorSelected-0d7_KjU, reason: not valid java name and from getter */
    public final long getBgColorSelected() {
        return this.bgColorSelected;
    }

    /* renamed from: getSubtitleColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSubtitleColor() {
        return this.subtitleColor;
    }

    /* renamed from: getSubtitleColorSelected-0d7_KjU, reason: not valid java name and from getter */
    public final long getSubtitleColorSelected() {
        return this.subtitleColorSelected;
    }

    /* renamed from: getTitleColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTitleColor() {
        return this.titleColor;
    }

    /* renamed from: getTitleColorSelected-0d7_KjU, reason: not valid java name and from getter */
    public final long getTitleColorSelected() {
        return this.titleColorSelected;
    }

    public int hashCode() {
        long j11 = this.bgColor;
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Long.hashCode(this.subtitleColorSelected) + c.a(c.a(c.a(c.a(Long.hashCode(j11) * 31, 31, this.bgColorSelected), 31, this.titleColor), 31, this.titleColorSelected), 31, this.subtitleColor);
    }

    @NotNull
    public String toString() {
        String v11 = C7807Z.v(this.bgColor);
        String v12 = C7807Z.v(this.bgColorSelected);
        String v13 = C7807Z.v(this.titleColor);
        String v14 = C7807Z.v(this.titleColorSelected);
        String v15 = C7807Z.v(this.subtitleColor);
        String v16 = C7807Z.v(this.subtitleColorSelected);
        StringBuilder d11 = C3660k.d("DsTabsStyle(bgColor=", v11, ", bgColorSelected=", v12, ", titleColor=");
        a.h(d11, v13, ", titleColorSelected=", v14, ", subtitleColor=");
        return C3173b.c(d11, v15, ", subtitleColorSelected=", v16, ")");
    }

    private DsTabsStyle(long j11, long j12, long j13, long j14, long j15, long j16) {
        this.bgColor = j11;
        this.bgColorSelected = j12;
        this.titleColor = j13;
        this.titleColorSelected = j14;
        this.subtitleColor = j15;
        this.subtitleColorSelected = j16;
    }
}
