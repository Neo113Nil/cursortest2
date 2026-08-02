package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.f5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144f5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final IExecutionPolicy[] f13717a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13718b;

    public C0144f5(@NotNull IExecutionPolicy... iExecutionPolicyArr) {
        this.f13717a = iExecutionPolicyArr;
        this.f13718b = d9.e.k(new StringBuilder("Composite of {"), kotlin.collections.p.v(iExecutionPolicyArr, C0118e5.f13638a, 30), '}');
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        IExecutionPolicy iExecutionPolicy;
        IExecutionPolicy[] iExecutionPolicyArr = this.f13717a;
        if (iExecutionPolicyArr.length == 0) {
            return false;
        }
        int length = iExecutionPolicyArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                iExecutionPolicy = null;
                break;
            }
            iExecutionPolicy = iExecutionPolicyArr[i5];
            if (!iExecutionPolicy.canBeExecuted()) {
                break;
            }
            i5++;
        }
        return iExecutionPolicy == null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    @NotNull
    public final String description() {
        return this.f13718b;
    }
}
