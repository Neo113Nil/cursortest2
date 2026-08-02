package io.sentry.android.replay.util;

import android.graphics.Rect;
import androidx.compose.ui.node.LayoutNode;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class j {
    public static final M.f a(V.a aVar, V.a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        V.a a10 = aVar2 == null ? V.b.a(aVar) : aVar2;
        float b10 = (int) (a10.b() >> 32);
        float b11 = (int) (a10.b() & BodyPartID.bodyIdMax);
        M.f c10 = a10.c(aVar, true);
        float c11 = c10.c();
        if (c11 < 0.0f) {
            c11 = 0.0f;
        }
        if (c11 > b10) {
            c11 = b10;
        }
        float e10 = c10.e();
        if (e10 < 0.0f) {
            e10 = 0.0f;
        }
        if (e10 > b11) {
            e10 = b11;
        }
        float d10 = c10.d();
        if (d10 < 0.0f) {
            d10 = 0.0f;
        }
        if (d10 <= b10) {
            b10 = d10;
        }
        float b12 = c10.b();
        if (b12 < 0.0f) {
            b12 = 0.0f;
        }
        if (b12 <= b11) {
            b11 = b12;
        }
        if (c11 == b10 || e10 == b11) {
            return new M.f(0.0f, 0.0f, 0.0f, 0.0f);
        }
        long d11 = a10.d(M.d.b((Float.floatToRawIntBits(c11) << 32) | (Float.floatToRawIntBits(e10) & BodyPartID.bodyIdMax)));
        long d12 = a10.d(M.d.b((Float.floatToRawIntBits(b10) << 32) | (Float.floatToRawIntBits(e10) & BodyPartID.bodyIdMax)));
        long d13 = a10.d(M.d.b((Float.floatToRawIntBits(b11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(b10) << 32)));
        long d14 = a10.d(M.d.b((Float.floatToRawIntBits(b11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(c11) << 32)));
        float intBitsToFloat = Float.intBitsToFloat((int) (d11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d12 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (d14 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (d13 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (d11 & BodyPartID.bodyIdMax));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (d12 & BodyPartID.bodyIdMax));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (d14 & BodyPartID.bodyIdMax));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (d13 & BodyPartID.bodyIdMax));
        return new M.f(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final P.a b(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        List q10 = layoutNode.q();
        int size = q10.size();
        for (int i10 = 0; i10 < size; i10++) {
            J.a a10 = ((V.f) q10.get(i10)).a();
            String name = a10.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.contains$default((CharSequence) name, (CharSequence) "Painter", false, 2, (Object) null)) {
                try {
                    Field declaredField = a10.getClass().getDeclaredField("painter");
                    declaredField.setAccessible(true);
                    declaredField.get(a10);
                } catch (Throwable unused) {
                }
                return null;
            }
        }
        return null;
    }

    public static final Rect c(M.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new Rect((int) Math.floor(fVar.c()), (int) Math.floor(fVar.e()), (int) Math.ceil(fVar.d()), (int) Math.ceil(fVar.b()));
    }
}
