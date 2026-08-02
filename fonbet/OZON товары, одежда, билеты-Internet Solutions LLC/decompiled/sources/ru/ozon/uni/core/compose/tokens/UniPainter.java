package ru.ozon.uni.core.compose.tokens;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l1.C7809a0;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0016\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/uni/core/compose/tokens/UniPainter;", "Lq1/b;", "", "iconName", "painter", "<init>", "(Ljava/lang/String;Lq1/b;)V", "Ln1/e;", "", "onDraw", "(Ln1/e;)V", "Ll1/a0;", "colorFilter", "", "applyColorFilter", "(Ll1/a0;)Z", "", "alpha", "applyAlpha", "(F)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIconName", "Lq1/b;", "getPainter", "()Lq1/b;", "isMulticolor", "Z", "()Z", "currentAlpha", "F", "currentColorFilter", "Ll1/a0;", "Lk1/j;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UniPainter extends AbstractC8972b {
    private float currentAlpha;
    private C7809a0 currentColorFilter;

    @NotNull
    private final String iconName;
    private final boolean isMulticolor;

    @NotNull
    private final AbstractC8972b painter;

    public UniPainter(@NotNull String iconName, @NotNull AbstractC8972b painter) {
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        Intrinsics.checkNotNullParameter(painter, "painter");
        this.iconName = iconName;
        this.painter = painter;
        this.isMulticolor = h.t(iconName, "_multicolor_", false) || h.t(iconName, "_flag_", false);
        this.currentAlpha = 1.0f;
    }

    @Override // q1.AbstractC8972b
    protected boolean applyAlpha(float alpha) {
        this.currentAlpha = alpha;
        return true;
    }

    @Override // q1.AbstractC8972b
    protected boolean applyColorFilter(C7809a0 colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniPainter)) {
            return false;
        }
        UniPainter uniPainter = (UniPainter) other;
        return Intrinsics.d(this.iconName, uniPainter.iconName) && Intrinsics.d(this.painter, uniPainter.painter);
    }

    @NotNull
    public final String getIconName() {
        return this.iconName;
    }

    @Override // q1.AbstractC8972b
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo14getIntrinsicSizeNHjbRc() {
        return this.painter.mo14getIntrinsicSizeNHjbRc();
    }

    public int hashCode() {
        return this.painter.hashCode() + (this.iconName.hashCode() * 31);
    }

    /* renamed from: isMulticolor, reason: from getter */
    public final boolean getIsMulticolor() {
        return this.isMulticolor;
    }

    @Override // q1.AbstractC8972b
    protected void onDraw(@NotNull InterfaceC8412e interfaceC8412e) {
        Intrinsics.checkNotNullParameter(interfaceC8412e, "<this>");
        this.painter.m444drawx_KDEd0(interfaceC8412e, interfaceC8412e.i(), this.currentAlpha, this.currentColorFilter);
    }

    @NotNull
    public String toString() {
        return "UniPainter(iconName=" + this.iconName + ", painter=" + this.painter + ")";
    }
}
