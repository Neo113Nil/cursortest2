package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import com.ironsource.U3;
import defpackage.b6h;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\"\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;", "T", "", U3.i.X, "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "setValue", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;", "equals", "", "other", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OverridableValueRemoteDto<T> {
    public static final int $stable = 8;

    @b6h(U3.i.X)
    @Nullable
    private T value;

    public OverridableValueRemoteDto(@Nullable T t) {
        this.value = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OverridableValueRemoteDto copy$default(OverridableValueRemoteDto overridableValueRemoteDto, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = overridableValueRemoteDto.value;
        }
        return overridableValueRemoteDto.copy(obj);
    }

    @Nullable
    public final T component1() {
        return this.value;
    }

    @NotNull
    public final OverridableValueRemoteDto<T> copy(@Nullable T value) {
        return new OverridableValueRemoteDto<>(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OverridableValueRemoteDto) && Intrinsics.c(this.value, ((OverridableValueRemoteDto) other).value);
    }

    @Nullable
    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t = this.value;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final void setValue(@Nullable T t) {
        this.value = t;
    }

    @NotNull
    public String toString() {
        return lnb.p(new StringBuilder("OverridableValueRemoteDto(value="), this.value, ')');
    }
}
