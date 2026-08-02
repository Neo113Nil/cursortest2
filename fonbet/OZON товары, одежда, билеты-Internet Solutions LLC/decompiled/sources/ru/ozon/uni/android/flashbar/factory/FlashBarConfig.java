package ru.ozon.uni.android.flashbar.factory;

import B90.C2618u;
import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/android/flashbar/factory/FlashBarConfig;", "", "", "isIndefinite", "<init>", "(Z)V", "copy", "(Z)Lru/ozon/uni/android/flashbar/factory/FlashBarConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FlashBarConfig {
    private final boolean isIndefinite;

    public FlashBarConfig() {
        this(false, 1, null);
    }

    @NotNull
    public final FlashBarConfig copy(boolean isIndefinite) {
        return new FlashBarConfig(isIndefinite);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FlashBarConfig) && this.isIndefinite == ((FlashBarConfig) other).isIndefinite;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isIndefinite);
    }

    /* renamed from: isIndefinite, reason: from getter */
    public final boolean getIsIndefinite() {
        return this.isIndefinite;
    }

    @NotNull
    public String toString() {
        return C2618u.g("FlashBarConfig(isIndefinite=", ")", this.isIndefinite);
    }

    public FlashBarConfig(boolean z11) {
        this.isIndefinite = z11;
    }

    public /* synthetic */ FlashBarConfig(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
