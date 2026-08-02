package com.sofascore.model.util;

import com.ironsource.U3;
import defpackage.lnb;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u001c\u0010\u0003\u001a\u00028\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0015"}, d2 = {"Lcom/sofascore/model/util/ValueWrapper;", "T", "Ljava/io/Serializable;", U3.i.X, "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "setValue", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/sofascore/model/util/ValueWrapper;", "equals", "", "other", "", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ValueWrapper<T> implements Serializable {
    private T value;

    public ValueWrapper(T t) {
        this.value = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ValueWrapper copy$default(ValueWrapper valueWrapper, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = valueWrapper.value;
        }
        return valueWrapper.copy(obj);
    }

    public final T component1() {
        return this.value;
    }

    @NotNull
    public final ValueWrapper<T> copy(T value) {
        return new ValueWrapper<>(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ValueWrapper) && Intrinsics.c(this.value, ((ValueWrapper) other).value);
    }

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

    public final void setValue(T t) {
        this.value = t;
    }

    @NotNull
    public String toString() {
        return lnb.m(this.value, "ValueWrapper(value=", ")");
    }
}
