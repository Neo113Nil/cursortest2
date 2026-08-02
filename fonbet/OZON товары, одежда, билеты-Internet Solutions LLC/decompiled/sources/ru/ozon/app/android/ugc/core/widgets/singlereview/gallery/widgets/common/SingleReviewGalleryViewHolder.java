package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common;

import Sc.InterfaceC4008j;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R'\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/SingleReviewGalleryViewHolder;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "VO", "Lru/ozon/composer/ui/widget/k;", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "link", "", "openDeeplink", "(Ljava/lang/String;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SingleReviewGalleryViewHolder<VO extends c> extends k<VO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final ComposerReferences references;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewGalleryViewHolder(@NotNull View view, @NotNull ComposerReferences references) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        this.references = references;
        this.actionHandler = LazyUtilsKt.unsafeLazy(new SingleReviewGalleryViewHolder$actionHandler$2(this));
    }

    @NotNull
    protected final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void openDeeplink(String link) {
        getActionHandler().invoke(new AtomAction.Move(link, null, null, null, 10, null));
    }
}
