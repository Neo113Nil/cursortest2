package og;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.zoho.livechat.android.utils.LiveChatUtil;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: og.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5893e {
    public static final Drawable a(Drawable drawable, int i10) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return drawable;
    }
}
