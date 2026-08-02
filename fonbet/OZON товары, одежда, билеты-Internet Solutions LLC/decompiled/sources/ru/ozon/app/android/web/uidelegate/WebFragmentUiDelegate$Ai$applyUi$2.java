package ru.ozon.app.android.web.uidelegate;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.feature.common.web.databinding.FragmentWebStandardBinding;
import ru.ozon.app.android.web.WebFragment;
import ru.ozon.app.android.web.uidelegate.WebFragmentUiDelegate;
import ru.ozon.app.android.web.webview.OzonWebView;
import ru.ozon.uni.android.notificationbar.ConstraintLayoutManager;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "notificationDTO", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WebFragmentUiDelegate$Ai$applyUi$2 extends AbstractC7737t implements Function1<NotificationDTO, Unit> {
    final /* synthetic */ FragmentWebStandardBinding $binding;
    final /* synthetic */ WebFragment $fragment;
    final /* synthetic */ WebFragmentUiDelegate.Ai this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "actionDTO", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.web.uidelegate.WebFragmentUiDelegate$Ai$applyUi$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AtomActionDTO, Unit> {
        final /* synthetic */ FragmentWebStandardBinding $binding;
        final /* synthetic */ WebFragmentUiDelegate.Ai this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WebFragmentUiDelegate.Ai ai, FragmentWebStandardBinding fragmentWebStandardBinding) {
            super(1);
            this.this$0 = ai;
            this.$binding = fragmentWebStandardBinding;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomActionDTO atomActionDTO) {
            invoke2(atomActionDTO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomActionDTO actionDTO) {
            Moshi moshi;
            Intrinsics.checkNotNullParameter(actionDTO, "actionDTO");
            moshi = this.this$0.moshi;
            String json = moshi.c(AtomActionDTO.class).toJson(actionDTO);
            WebFragmentUiDelegate.Ai ai = this.this$0;
            OzonWebView webView = this.$binding.webView;
            Intrinsics.checkNotNullExpressionValue(webView, "webView");
            ai.onNotificationClickJs(webView, json);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebFragmentUiDelegate$Ai$applyUi$2(WebFragmentUiDelegate.Ai ai, WebFragment webFragment, FragmentWebStandardBinding fragmentWebStandardBinding) {
        super(1);
        this.this$0 = ai;
        this.$fragment = webFragment;
        this.$binding = fragmentWebStandardBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NotificationDTO notificationDTO) {
        invoke2(notificationDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NotificationDTO notificationDTO) {
        Intrinsics.checkNotNullParameter(notificationDTO, "notificationDTO");
        WebFragmentUiDelegate.Ai ai = this.this$0;
        WebFragment webFragment = this.$fragment;
        ConstraintLayout constraintLayout = this.$binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ai.showNotification(webFragment, notificationDTO, new ConstraintLayoutManager(constraintLayout), new AnonymousClass1(this.this$0, this.$binding));
    }
}
