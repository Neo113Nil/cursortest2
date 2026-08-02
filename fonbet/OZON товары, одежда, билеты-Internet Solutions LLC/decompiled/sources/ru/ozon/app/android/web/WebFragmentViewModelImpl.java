package ru.ozon.app.android.web;

import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\n\u0010\tR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00050\u00050\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/web/WebFragmentViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/web/WebFragmentViewModel;", "<init>", "()V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "setDefaultTitle", "(Ljava/lang/String;)V", "updateTitle", "Landroidx/lifecycle/T;", "toolbarTitle", "Landroidx/lifecycle/T;", "getToolbarTitle", "()Landroidx/lifecycle/T;", "Landroidx/lifecycle/V;", "kotlin.jvm.PlatformType", "defaultToolbarTitle", "Landroidx/lifecycle/V;", "receivedToolbarTitle", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebFragmentViewModelImpl extends w0 implements WebFragmentViewModel {

    @NotNull
    private final V<String> defaultToolbarTitle;

    @NotNull
    private final V<String> receivedToolbarTitle;

    @NotNull
    private final T<String> toolbarTitle = new T<>();

    public WebFragmentViewModelImpl() {
        V<String> v11 = new V<>("");
        this.defaultToolbarTitle = v11;
        V<String> v12 = new V<>(null);
        this.receivedToolbarTitle = v12;
        T<String> toolbarTitle = getToolbarTitle();
        toolbarTitle.a(v11, new WebFragmentViewModelImpl$sam$androidx_lifecycle_Observer$0(new WebFragmentViewModelImpl$1$1(this, toolbarTitle)));
        toolbarTitle.a(v12, new WebFragmentViewModelImpl$sam$androidx_lifecycle_Observer$0(new WebFragmentViewModelImpl$1$2(toolbarTitle, this)));
    }

    @Override // ru.ozon.app.android.web.WebFragmentViewModel
    public void setDefaultTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.defaultToolbarTitle.setValue(title);
    }

    @Override // ru.ozon.app.android.web.WebFragmentViewModel
    public void updateTitle(String title) {
        getToolbarTitle().setValue(title);
    }

    @Override // ru.ozon.app.android.web.WebFragmentViewModel
    @NotNull
    public T<String> getToolbarTitle() {
        return this.toolbarTitle;
    }
}
