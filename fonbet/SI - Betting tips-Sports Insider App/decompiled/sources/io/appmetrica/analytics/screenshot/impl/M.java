package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class M implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Y f15315a;

    /* JADX WARN: Multi-variable type inference failed */
    public M() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S fromModel(@NotNull J j) {
        S s8 = new S();
        s8.f15330a = j.f15310a;
        W w10 = j.f15311b;
        s8.f15331b = w10 != null ? this.f15315a.fromModel(w10) : null;
        return s8;
    }

    public M(@NotNull Y y5) {
        this.f15315a = y5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ M(Y y5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(y5);
        if ((i5 & 1) != 0) {
            y5 = new Y(null, null, null, 7, null);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(@NotNull S s8) {
        return new J(s8.f15330a, this.f15315a.toModel(s8.f15331b));
    }
}
