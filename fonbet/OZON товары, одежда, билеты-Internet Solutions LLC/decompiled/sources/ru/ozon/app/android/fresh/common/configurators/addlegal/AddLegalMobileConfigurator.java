package ru.ozon.app.android.fresh.common.configurators.addlegal;

import Ve.C4598rp;
import a00.C4911f;
import a00.h;
import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import com.google.android.material.bottomsheet.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolder;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b*\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/common/configurators/addlegal/AddLegalMobileConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolder;", "legalsResultStateHolder", "<init>", "(Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolder;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "", "generateTag", "(La00/f;)Ljava/lang/String;", "", "onComposerInitialized", "()V", "Landroid/os/Bundle;", "outState", "La00/h;", "viewModelOwnerProvider", "onSaveInstanceState", "(Landroid/os/Bundle;La00/h;)V", "onRestoreInstanceState", "Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolder;", "", "saveStateWasInvoked", "Z", "savedTag", "Ljava/lang/String;", "Companion", "LegalsStateChangedLifecycleObserver", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddLegalMobileConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final LegalsResultStateHolder legalsResultStateHolder;
    private boolean saveStateWasInvoked;
    private String savedTag;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f*\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/common/configurators/addlegal/AddLegalMobileConfigurator$LegalsStateChangedLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "", "componentTag", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "references", "Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolder;", "legalsResultStateHolder", "<init>", "(Lru/ozon/app/android/fresh/common/configurators/addlegal/AddLegalMobileConfigurator;Ljava/lang/String;Lru/ozon/app/android/composer/ConfiguratorReferences;Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolder;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "", "isFragmentInBottomSheetDialog", "(La00/f;)Z", "Landroidx/lifecycle/J;", "owner", "", "onResume", "(Landroidx/lifecycle/J;)V", "onDestroy", "Ljava/lang/String;", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolder;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public final class LegalsStateChangedLifecycleObserver implements DefaultLifecycleObserver {

        @NotNull
        private final String componentTag;

        @NotNull
        private final LegalsResultStateHolder legalsResultStateHolder;

        @NotNull
        private final ConfiguratorReferences references;
        final /* synthetic */ AddLegalMobileConfigurator this$0;

        public LegalsStateChangedLifecycleObserver(@NotNull AddLegalMobileConfigurator addLegalMobileConfigurator, @NotNull String componentTag, @NotNull ConfiguratorReferences references, LegalsResultStateHolder legalsResultStateHolder) {
            Intrinsics.checkNotNullParameter(componentTag, "componentTag");
            Intrinsics.checkNotNullParameter(references, "references");
            Intrinsics.checkNotNullParameter(legalsResultStateHolder, "legalsResultStateHolder");
            this.this$0 = addLegalMobileConfigurator;
            this.componentTag = componentTag;
            this.references = references;
            this.legalsResultStateHolder = legalsResultStateHolder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isFragmentInBottomSheetDialog(C4911f c4911f) {
            ComponentCallbacksC5392m c11 = c4911f.c();
            if (c11 == null) {
                return false;
            }
            return c11.getParentFragment() instanceof b;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(@NotNull J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.references.getOwnerContainer().f().getLifecycle().e(this);
            if (this.this$0.saveStateWasInvoked) {
                return;
            }
            this.legalsResultStateHolder.removeObserver(this.componentTag);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(@NotNull J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.legalsResultStateHolder.invokeIfChanged(this.componentTag, new AddLegalMobileConfigurator$LegalsStateChangedLifecycleObserver$onResume$1(this));
        }
    }

    public AddLegalMobileConfigurator(@NotNull LegalsResultStateHolder legalsResultStateHolder) {
        Intrinsics.checkNotNullParameter(legalsResultStateHolder, "legalsResultStateHolder");
        this.legalsResultStateHolder = legalsResultStateHolder;
    }

    private final String generateTag(C4911f c4911f) {
        String canonicalName = c4911f.f().getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        return C4598rp.c(c4911f.hashCode(), canonicalName, "_");
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        String str = this.savedTag;
        if (str == null) {
            str = generateTag(references.getOwnerContainer());
        }
        this.legalsResultStateHolder.registerObserver(str);
        references.getOwnerContainer().f().getLifecycle().a(new LegalsStateChangedLifecycleObserver(this, str, references, this.legalsResultStateHolder));
        this.savedTag = str;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onRestoreInstanceState(Bundle outState, @NotNull h viewModelOwnerProvider) {
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        super.onRestoreInstanceState(outState, viewModelOwnerProvider);
        this.saveStateWasInvoked = false;
        this.savedTag = outState != null ? outState.getString("owner_container_tag") : null;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onSaveInstanceState(@NotNull Bundle outState, @NotNull h viewModelOwnerProvider) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        outState.putString("owner_container_tag", this.savedTag);
        this.saveStateWasInvoked = true;
        super.onSaveInstanceState(outState, viewModelOwnerProvider);
    }
}
