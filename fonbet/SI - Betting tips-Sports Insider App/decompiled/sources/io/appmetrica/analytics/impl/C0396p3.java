package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396p3 implements InterfaceC0622y5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0622y5, kotlin.jvm.functions.Function1
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(@NotNull ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap c2 = AbstractC0176gb.c(asString);
        if (Fm.a(c2)) {
            return c2;
        }
        AbstractC0158fj.a(androidx.appcompat.widget.c1.n("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
