package ru.ozon.app.android.pdp.ui.configurators.monetization.shareLinkBloggerCopyResult;

import Pc.a;
import a00.h;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import androidx.fragment.app.r;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger.ShareLinkBloggerViewModel;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/monetization/shareLinkBloggerCopyResult/ShareLinkBloggerCopyResultConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel;", "pViewModel", "<init>", "(LPc/a;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "(IILandroid/content/Intent;)V", "LPc/a;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShareLinkBloggerCopyResultConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<ShareLinkBloggerViewModel> pViewModel;

    public ShareLinkBloggerCopyResultConfigurator(@NotNull a<ShareLinkBloggerViewModel> pViewModel) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.pViewModel = pViewModel;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        r a11;
        ConfiguratorReferences references;
        h viewModelOwnerProvider;
        B0 a12;
        ClipData primaryClip;
        ClipData.Item itemAt;
        CharSequence text;
        String obj;
        ShareLinkBloggerViewModel.ShareLinkBloggerState value;
        if (requestCode != 3434 || resultCode != -1 || (a11 = getContainer().a()) == null || (references = getReferences()) == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null || (a12 = viewModelOwnerProvider.a()) == null) {
            return;
        }
        final a<ShareLinkBloggerViewModel> aVar = this.pViewModel;
        ShareLinkBloggerViewModel shareLinkBloggerViewModel = (ShareLinkBloggerViewModel) new z0(a12, new z0.c() { // from class: ru.ozon.app.android.pdp.ui.configurators.monetization.shareLinkBloggerCopyResult.ShareLinkBloggerCopyResultConfigurator$onActivityResult$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ShareLinkBloggerViewModel shareLinkBloggerViewModel2 = (ShareLinkBloggerViewModel) a.this.get();
                Intrinsics.g(shareLinkBloggerViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return shareLinkBloggerViewModel2;
            }
        }).a(ShareLinkBloggerViewModel.class);
        if (shareLinkBloggerViewModel != null) {
            Object systemService = a11.getSystemService("clipboard");
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null || (obj = text.toString()) == null || (value = shareLinkBloggerViewModel.getState().getValue()) == null || !obj.equals(value.getShareText())) {
                return;
            }
            shareLinkBloggerViewModel.obtainIntent(ShareLinkBloggerViewModel.ShareLinkBloggerIntent.ShowCurrentNotification.INSTANCE);
        }
    }
}
