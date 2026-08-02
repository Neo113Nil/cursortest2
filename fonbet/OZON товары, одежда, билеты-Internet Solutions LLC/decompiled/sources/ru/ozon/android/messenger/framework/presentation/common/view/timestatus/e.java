package ru.ozon.android.messenger.framework.presentation.common.view.timestatus;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.messenger.R$id;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function0<ImageView> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f91300b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TimeStatusView f91301c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(Context context, TimeStatusView timeStatusView) {
        super(0);
        this.f91300b = context;
        this.f91301c = timeStatusView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ImageView invoke() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ImageView imageView = new ImageView(this.f91300b);
        imageView.setId(R$id.m_message_status_iv);
        this.f91301c.getClass();
        i11 = ru.ozon.android.messenger.utils.e.f91911h;
        i12 = ru.ozon.android.messenger.utils.e.f91911h;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i12);
        i13 = ru.ozon.android.messenger.utils.e.f91905b;
        i14 = ru.ozon.android.messenger.utils.e.f91907d;
        i15 = ru.ozon.android.messenger.utils.e.f91905b;
        layoutParams.setMargins(0, i13, i14, i15);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }
}
