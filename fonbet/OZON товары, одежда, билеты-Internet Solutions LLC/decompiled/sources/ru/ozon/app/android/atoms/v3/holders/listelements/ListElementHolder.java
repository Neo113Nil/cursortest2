package ru.ozon.app.android.atoms.v3.holders.listelements;

import Sc.o;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/listelements/ListElementHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$ListElement;", "Lru/ozon/app/android/atoms/v3/holders/listelements/ListElementView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/atoms/v3/holders/listelements/ListElementView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "bindMarker", "marker", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ListElementHolder extends AtomV3<ListElementAtom.ListElement, ListElementView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListElementHolder(@NotNull ListElementView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final void bindMarker(ListElementAtom.Marker marker) {
        if (marker instanceof ListElementAtom.Marker.Bullet) {
            getContainerView().setBullet();
            ListElementView containerView = getContainerView();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContainerView().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            containerView.setElementColor(styleParser.parseColor(context, ((ListElementAtom.Marker.Bullet) marker).getColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY));
            getContainerView().showTextMarker();
            return;
        }
        if (marker instanceof ListElementAtom.Marker.Icon) {
            ListElementAtom.Marker.Icon icon = (ListElementAtom.Marker.Icon) marker;
            AtomConfig.INSTANCE.getImageLoader().load(getContainerView().getIcon(), icon.getImage());
            ListElementView containerView2 = getContainerView();
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context2 = getContainerView().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            containerView2.setImageTint(styleParser2.parseColor(context2, icon.getTintColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY));
            getContainerView().showImageMarker();
            return;
        }
        if (!(marker instanceof ListElementAtom.Marker.Number)) {
            throw new o();
        }
        ListElementAtom.Marker.Number number = (ListElementAtom.Marker.Number) marker;
        getContainerView().setText(number.getNumber());
        ListElementView containerView3 = getContainerView();
        StyleParser styleParser3 = StyleParser.INSTANCE;
        Context context3 = getContainerView().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        containerView3.setElementColor(styleParser3.parseColor(context3, number.getColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY));
        getContainerView().showTextMarker();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListElementHolder(@NotNull Context context, String str) {
        this(new ListElementView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ListElementAtom.ListElement item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((ListElementHolder) item);
        ListElementView containerView = getContainerView();
        containerView.setTitle(item.getTitle());
        bindMarker(item.getMarker());
        containerView.bindAtomsOrGone(item.getAtoms());
        containerView.showSeparator(item.getHasSeparator());
    }
}
