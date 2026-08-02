package com.commit451.coiltransformations;

import coil.size.Dimension;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ext.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0005"}, d2 = {"pxOrElse", "", "Lcoil/size/Dimension;", "block", "Lkotlin/Function0;", "transformations_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtKt {
    public static final int pxOrElse(Dimension dimension, Function0<Integer> block) {
        Intrinsics.checkNotNullParameter(dimension, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return dimension instanceof Dimension.Pixels ? ((Dimension.Pixels) dimension).px : block.invoke().intValue();
    }
}
