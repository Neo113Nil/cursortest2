package og;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.zoho.livechat.android.utils.LiveChatUtil;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rd.C6218a;

/* loaded from: classes4.dex */
public abstract class n {
    public static final void a(Toolbar toolbar) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            int childCount = toolbar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = toolbar.getChildAt(i10);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setTypeface(C6218a.P());
                    ((TextView) childAt).setIncludeFontPadding(false);
                }
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
    }

    public static final void b(Toolbar toolbar, int i10) {
        Intrinsics.checkNotNullParameter(toolbar, "<this>");
        toolbar.setSubtitle(i10);
        a(toolbar);
    }

    public static final void c(Toolbar toolbar, String str) {
        Intrinsics.checkNotNullParameter(toolbar, "<this>");
        if (str != null) {
            toolbar.setSubtitle(str);
            a(toolbar);
        }
    }
}
