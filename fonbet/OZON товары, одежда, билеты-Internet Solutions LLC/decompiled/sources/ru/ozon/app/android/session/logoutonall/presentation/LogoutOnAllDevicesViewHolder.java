package ru.ozon.app.android.session.logoutonall.presentation;

import Bl.b;
import GZ.g;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.f;
import androidx.lifecycle.J;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.R$string;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.session.databinding.WidgetLogoutOnAllDevicesBinding;
import ru.ozon.app.android.session.logoutonall.data.LogoutOnAllDevicesVO;
import ru.ozon.app.android.session.logoutonall.presentation.LogoutOnAllDevicesViewHolder;
import ru.ozon.app.android.session.logoutonall.presentation.LogoutOnAllDevicesViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010 \u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LGZ/g;", "screenRouter", "<init>", "(Landroid/view/View;Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel;Lru/ozon/app/android/composer/ComposerReferences;LGZ/g;)V", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action$Loading;", "action", "", "onLoadingAction", "(Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action$Loading;)V", "onErrorAction", "()V", "data", "showConfirmDialog", "(Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesVO;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesVO;Ll20/d;)V", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "LGZ/g;", "Lru/ozon/app/android/session/databinding/WidgetLogoutOnAllDevicesBinding;", "binding", "Lru/ozon/app/android/session/databinding/WidgetLogoutOnAllDevicesBinding;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogoutOnAllDevicesViewHolder extends k<LogoutOnAllDevicesVO> {

    @NotNull
    private final WidgetLogoutOnAllDevicesBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final g screenRouter;

    @NotNull
    private final LogoutOnAllDevicesViewModel viewModel;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.logoutonall.presentation.LogoutOnAllDevicesViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            LogoutOnAllDevicesVO boundedData = LogoutOnAllDevicesViewHolder.this.getBoundedData();
            if (boundedData != null) {
                LogoutOnAllDevicesViewHolder.this.showConfirmDialog(boundedData);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutOnAllDevicesViewHolder(@NotNull View containerView, @NotNull LogoutOnAllDevicesViewModel viewModel, @NotNull ComposerReferences composerReferences, @NotNull g screenRouter) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(screenRouter, "screenRouter");
        this.viewModel = viewModel;
        this.composerReferences = composerReferences;
        this.screenRouter = screenRouter;
        WidgetLogoutOnAllDevicesBinding bind = WidgetLogoutOnAllDevicesBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewExtKt.setOnClickListenerThrottle$default(itemView, 0L, new AnonymousClass1(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onErrorAction() {
        ViewGroup b11 = b.b(this.composerReferences);
        if (b11 != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, b11, null, null, null, null, null, this.composerReferences.getContainer().g(), 62, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadingAction(LogoutOnAllDevicesViewModel.Action.Loading action) {
        InterfaceC7851b controller = this.composerReferences.getController();
        if (action.getLoading()) {
            controller.e(new l.a.C1079a(0L, null, 3));
        } else {
            controller.hideLoader();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showConfirmDialog(final LogoutOnAllDevicesVO data) {
        new f.a(getContext()).setTitle(data.getConfirmTitle()).f(data.getConfirmDescription()).setPositiveButton(R$string.common_adult_confirm, new DialogInterface.OnClickListener() { // from class: DJ.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                LogoutOnAllDevicesViewHolder.showConfirmDialog$lambda$3(LogoutOnAllDevicesViewHolder.this, data, dialogInterface, i11);
            }
        }).setNegativeButton(ru.ozon.app.android.uikit.R$string.common_button_cancel, new DJ.b()).q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showConfirmDialog$lambda$3(LogoutOnAllDevicesViewHolder logoutOnAllDevicesViewHolder, LogoutOnAllDevicesVO logoutOnAllDevicesVO, DialogInterface dialogInterface, int i11) {
        logoutOnAllDevicesViewHolder.viewModel.onConfirmClick(logoutOnAllDevicesVO.getAction(), logoutOnAllDevicesViewHolder.getTrackingData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showConfirmDialog$lambda$4(DialogInterface dialogInterface, int i11) {
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.viewModel.getActionLiveData().observe(this, new LogoutOnAllDevicesViewHolder$sam$androidx_lifecycle_Observer$0(new LogoutOnAllDevicesViewHolder$onAttachViewModel$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull LogoutOnAllDevicesVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextView textView = this.binding.logoutOnAllDevicesTv;
        textView.setText(item.getTitle());
        textView.setGravity(item.getGravity());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(styleParser.parseColor(context, item.getTextColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY));
    }
}
