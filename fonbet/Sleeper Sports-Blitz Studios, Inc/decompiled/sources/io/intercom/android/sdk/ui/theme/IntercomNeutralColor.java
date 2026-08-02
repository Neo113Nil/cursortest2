package io.intercom.android.sdk.ui.theme;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.ui.graphics.Color;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: IntercomColors.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000bJB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010!\u001a\u00020\"H×\u0001J\t\u0010#\u001a\u00020$H×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006%"}, d2 = {"Lio/intercom/android/sdk/ui/theme/IntercomNeutralColor;", "", "container", "Landroidx/compose/ui/graphics/Color;", "containerAlt", "containerEmphasis", OutlinedTextFieldKt.BorderId, "borderEmphasis", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContainer-0d7_KjU", "()J", "J", "getContainerAlt-0d7_KjU", "getContainerEmphasis-0d7_KjU", "getBorder-0d7_KjU", "getBorderEmphasis-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "copy", "copy-t635Npw", "(JJJJJ)Lio/intercom/android/sdk/ui/theme/IntercomNeutralColor;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class IntercomNeutralColor {
    public static final int $stable = 0;
    private final long border;
    private final long borderEmphasis;
    private final long container;
    private final long containerAlt;
    private final long containerEmphasis;

    public /* synthetic */ IntercomNeutralColor(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }

    /* renamed from: copy-t635Npw$default, reason: not valid java name */
    public static /* synthetic */ IntercomNeutralColor m13147copyt635Npw$default(IntercomNeutralColor intercomNeutralColor, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        if ((i & 1) != 0) {
            j = intercomNeutralColor.container;
        }
        long j6 = j;
        if ((i & 2) != 0) {
            j2 = intercomNeutralColor.containerAlt;
        }
        return intercomNeutralColor.m13153copyt635Npw(j6, j2, (i & 4) != 0 ? intercomNeutralColor.containerEmphasis : j3, (i & 8) != 0 ? intercomNeutralColor.border : j4, (i & 16) != 0 ? intercomNeutralColor.borderEmphasis : j5);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainer() {
        return this.container;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerAlt() {
        return this.containerAlt;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerEmphasis() {
        return this.containerEmphasis;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorder() {
        return this.border;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderEmphasis() {
        return this.borderEmphasis;
    }

    /* renamed from: copy-t635Npw, reason: not valid java name */
    public final IntercomNeutralColor m13153copyt635Npw(long container, long containerAlt, long containerEmphasis, long border, long borderEmphasis) {
        return new IntercomNeutralColor(container, containerAlt, containerEmphasis, border, borderEmphasis, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntercomNeutralColor)) {
            return false;
        }
        IntercomNeutralColor intercomNeutralColor = (IntercomNeutralColor) other;
        return Color.m6040equalsimpl0(this.container, intercomNeutralColor.container) && Color.m6040equalsimpl0(this.containerAlt, intercomNeutralColor.containerAlt) && Color.m6040equalsimpl0(this.containerEmphasis, intercomNeutralColor.containerEmphasis) && Color.m6040equalsimpl0(this.border, intercomNeutralColor.border) && Color.m6040equalsimpl0(this.borderEmphasis, intercomNeutralColor.borderEmphasis);
    }

    public int hashCode() {
        return (((((((Color.m6046hashCodeimpl(this.container) * 31) + Color.m6046hashCodeimpl(this.containerAlt)) * 31) + Color.m6046hashCodeimpl(this.containerEmphasis)) * 31) + Color.m6046hashCodeimpl(this.border)) * 31) + Color.m6046hashCodeimpl(this.borderEmphasis);
    }

    public String toString() {
        return "IntercomNeutralColor(container=" + ((Object) Color.m6047toStringimpl(this.container)) + ", containerAlt=" + ((Object) Color.m6047toStringimpl(this.containerAlt)) + ", containerEmphasis=" + ((Object) Color.m6047toStringimpl(this.containerEmphasis)) + ", border=" + ((Object) Color.m6047toStringimpl(this.border)) + ", borderEmphasis=" + ((Object) Color.m6047toStringimpl(this.borderEmphasis)) + ')';
    }

    private IntercomNeutralColor(long j, long j2, long j3, long j4, long j5) {
        this.container = j;
        this.containerAlt = j2;
        this.containerEmphasis = j3;
        this.border = j4;
        this.borderEmphasis = j5;
    }

    /* renamed from: getContainer-0d7_KjU, reason: not valid java name */
    public final long m13156getContainer0d7_KjU() {
        return this.container;
    }

    /* renamed from: getContainerAlt-0d7_KjU, reason: not valid java name */
    public final long m13157getContainerAlt0d7_KjU() {
        return this.containerAlt;
    }

    /* renamed from: getContainerEmphasis-0d7_KjU, reason: not valid java name */
    public final long m13158getContainerEmphasis0d7_KjU() {
        return this.containerEmphasis;
    }

    /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
    public final long m13154getBorder0d7_KjU() {
        return this.border;
    }

    /* renamed from: getBorderEmphasis-0d7_KjU, reason: not valid java name */
    public final long m13155getBorderEmphasis0d7_KjU() {
        return this.borderEmphasis;
    }
}
