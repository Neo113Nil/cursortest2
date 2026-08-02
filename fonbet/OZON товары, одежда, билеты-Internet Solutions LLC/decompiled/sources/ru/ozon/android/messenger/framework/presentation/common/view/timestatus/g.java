package ru.ozon.android.messenger.framework.presentation.common.view.timestatus;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.core.UniTextStyles;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function0<AppCompatTextView> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f91304b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TimeStatusView f91305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(Context context, TimeStatusView timeStatusView) {
        super(0);
        this.f91304b = context;
        this.f91305c = timeStatusView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AppCompatTextView invoke() {
        int i11;
        int i12;
        int i13;
        int i14;
        Context context = this.f91304b;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.m_time_sent_tv);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.f91305c.getClass();
        i11 = ru.ozon.android.messenger.utils.e.f91907d;
        i12 = ru.ozon.android.messenger.utils.e.f91906c;
        i13 = ru.ozon.android.messenger.utils.e.f91905b;
        i14 = ru.ozon.android.messenger.utils.e.f91906c;
        layoutParams.setMargins(i11, i12, i13, i14);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setMaxLines(1);
        TextViewExtKt.applyStyle(appCompatTextView, context, UniTextStyles.BODY_CONTROL_300_X_SMALL.getResId());
        return appCompatTextView;
    }
}
