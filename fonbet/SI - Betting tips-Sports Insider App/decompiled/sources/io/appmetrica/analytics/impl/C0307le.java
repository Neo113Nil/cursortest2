package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.le, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307le implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(@Nullable Boolean bool) {
        int i5;
        if (bool == null) {
            i5 = -1;
        } else if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            i5 = 1;
        } else {
            if (!Intrinsics.areEqual(bool, Boolean.FALSE)) {
                throw new gf.m();
            }
            i5 = 0;
        }
        return Integer.valueOf(i5);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object toModel(Object obj) {
        return a(((Number) obj).intValue());
    }

    @Nullable
    public final Boolean a(int i5) {
        if (i5 == -1) {
            return null;
        }
        if (i5 == 0) {
            return Boolean.FALSE;
        }
        if (i5 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
