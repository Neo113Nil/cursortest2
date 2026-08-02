package ru.ozon.android.messenger.framework.presentation.common.view.timestatus;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.atom.loader.data.LoaderSize;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function0<LoaderView> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f91302b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TimeStatusView f91303c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(Context context, TimeStatusView timeStatusView) {
        super(0);
        this.f91302b = context;
        this.f91303c = timeStatusView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LoaderView invoke() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        LoaderView loaderView = new LoaderView(this.f91302b, null, 0, 6, null);
        this.f91303c.getClass();
        i11 = ru.ozon.android.messenger.utils.e.f91911h;
        i12 = ru.ozon.android.messenger.utils.e.f91911h;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i12);
        i13 = ru.ozon.android.messenger.utils.e.f91905b;
        i14 = ru.ozon.android.messenger.utils.e.f91907d;
        i15 = ru.ozon.android.messenger.utils.e.f91905b;
        layoutParams.setMargins(0, i13, i14, i15);
        loaderView.setLayoutParams(layoutParams);
        loaderView.setLoaderSize(LoaderSize.LOADER_200);
        return loaderView;
    }
}
