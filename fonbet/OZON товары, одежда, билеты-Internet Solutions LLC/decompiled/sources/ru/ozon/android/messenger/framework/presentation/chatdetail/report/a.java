package ru.ozon.android.messenger.framework.presentation.chatdetail.report;

import Bs.ViewOnClickListenerC2671b;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.presentation.models.y;
import ru.ozon.android.messenger.utils.f;
import ru.ozon.android.messenger.utils.g;
import ru.ozon.app.android.messenger.R$style;
import ru.ozon.app.android.messenger.databinding.MReportBottomSheetBinding;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/chatdetail/report/a;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends b {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f89935c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.navigation.controller.a f89936a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f89937b = f.b(new C1663a());

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.report.a$a, reason: collision with other inner class name */
    static final class C1663a extends AbstractC7737t implements Function0<y> {
        C1663a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final y invoke() {
            Parcelable parcelable = a.this.requireArguments().getParcelable("BUNDLE_ARG_REPORT_CONTENT");
            y yVar = parcelable instanceof y ? (y) parcelable : null;
            if (yVar != null) {
                return yVar;
            }
            throw new IllegalStateException("Unable to open report dialog without content");
        }
    }

    public static void t(a aVar) {
        ru.ozon.android.messenger.framework.navigation.controller.a aVar2 = aVar.f89936a;
        if (aVar2 == null) {
            Intrinsics.n("messengerController");
            throw null;
        }
        aVar2.q(ru.ozon.android.messenger.framework.navigation.action.b.d(aVar.u().a(), U.j(new Pair(d.c.REPORT_SUCCESS_FLASHBAR.a(), aVar.u().e()), new Pair(d.c.REPORT_ERROR_FLASHBAR.a(), aVar.u().d()))));
        aVar.dismiss();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    private final y u() {
        return (y) this.f89937b.getValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public final int getTheme() {
        return R$style.m_OzonBottomSheetDialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        g.d(this).f(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        MReportBottomSheetBinding inflate = MReportBottomSheetBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        inflate.reportTitleTAV.setText(u().f());
        inflate.closeIV.setOnClickListener(new HY.d(this, 7));
        inflate.descriptionTAV.setText(u().c());
        inflate.submitButton.setText(u().b());
        inflate.submitButton.setOnClickListener(new ViewOnClickListenerC2671b(this, 6));
        ConstraintLayout constraintLayout = inflate.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }
}
