package fi;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: fi.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4294j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f46773a;

    static {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            m147constructorimpl = Result.m147constructorimpl(property != null ? StringsKt.toIntOrNull(property) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Integer num = (Integer) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
        f46773a = num != null ? num.intValue() : PKIFailureInfo.badSenderNonce;
    }
}
