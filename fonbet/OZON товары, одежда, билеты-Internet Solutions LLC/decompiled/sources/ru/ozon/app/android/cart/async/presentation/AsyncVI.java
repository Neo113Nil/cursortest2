package ru.ozon.app.android.cart.async.presentation;

import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cart/async/presentation/AsyncVI;", "Ll20/c;", "", "id", "", "enabled", "Lkotlin/time/b;", "operationsDebounceDelay", "<init>", "(JZLkotlin/time/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "getEnabled", "()Z", "Lkotlin/time/b;", "getOperationsDebounceDelay-FghU774", "()Lkotlin/time/b;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AsyncVI implements c {
    private final boolean enabled;
    private final long id;
    private final b operationsDebounceDelay;

    public /* synthetic */ AsyncVI(long j11, boolean z11, b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, z11, bVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncVI)) {
            return false;
        }
        AsyncVI asyncVI = (AsyncVI) other;
        return this.id == asyncVI.id && this.enabled == asyncVI.enabled && Intrinsics.d(this.operationsDebounceDelay, asyncVI.operationsDebounceDelay);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    /* renamed from: getOperationsDebounceDelay-FghU774, reason: not valid java name and from getter */
    public final b getOperationsDebounceDelay() {
        return this.operationsDebounceDelay;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(Long.hashCode(this.id) * 31, 31, this.enabled);
        b bVar = this.operationsDebounceDelay;
        return a11 + (bVar == null ? 0 : Long.hashCode(bVar.getF71985a()));
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.enabled;
        b bVar = this.operationsDebounceDelay;
        StringBuilder c11 = Bl.b.c(j11, "AsyncVI(id=", ", enabled=", z11);
        c11.append(", operationsDebounceDelay=");
        c11.append(bVar);
        c11.append(")");
        return c11.toString();
    }

    private AsyncVI(long j11, boolean z11, b bVar) {
        this.id = j11;
        this.enabled = z11;
        this.operationsDebounceDelay = bVar;
    }
}
