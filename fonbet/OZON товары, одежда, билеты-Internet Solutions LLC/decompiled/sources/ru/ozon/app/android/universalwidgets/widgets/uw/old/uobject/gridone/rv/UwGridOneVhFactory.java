package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.rv;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.views.UwObjectGridOneCenterTextView;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.views.UwObjectGridOneStartTextView;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.views.UwObjectGridOneView;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/UwGridOneVhFactory;", "", "<init>", "()V", "createVH", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/BindableUwViewHolder;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "viewType", "", "needCorners", "", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "context", "Landroid/content/Context;", "configure", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/views/UwObjectGridOneView;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UwGridOneVhFactory {

    @NotNull
    public static final UwGridOneVhFactory INSTANCE = new UwGridOneVhFactory();

    private UwGridOneVhFactory() {
    }

    private final UwObjectGridOneView configure(UwObjectGridOneView uwObjectGridOneView, boolean z11) {
        if (z11) {
            uwObjectGridOneView.applyCorners();
        } else {
            uwObjectGridOneView.resetCorners();
        }
        uwObjectGridOneView.setLayoutParams(new RecyclerView.p(-1, -2));
        return uwObjectGridOneView;
    }

    @NotNull
    public final BindableUwViewHolder createVH(@NotNull ComposerReferences ref, int viewType, boolean needCorners, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(context, "context");
        if (viewType == UwGridOneCenterTextViewHolder.INSTANCE.getVIEW_TYPE()) {
            return new UwGridOneCenterTextViewHolder(configure(new UwObjectGridOneCenterTextView(context, null, 0, 6, null), needCorners), ref, onAction);
        }
        if (viewType == UwGridOneStartTextViewHolder.INSTANCE.getVIEW_TYPE()) {
            return new UwGridOneStartTextViewHolder(configure(new UwObjectGridOneStartTextView(context, null, 0, 6, null), needCorners), ref, onAction);
        }
        final View view = new View(context);
        return new BindableUwViewHolder(view) { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.rv.UwGridOneVhFactory$createVH$1
            @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.rv.BindableUwViewHolder
            public void bind(ObjectItemVO item, int position, UwAdapterData adapterData) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(adapterData, "adapterData");
            }
        };
    }
}
