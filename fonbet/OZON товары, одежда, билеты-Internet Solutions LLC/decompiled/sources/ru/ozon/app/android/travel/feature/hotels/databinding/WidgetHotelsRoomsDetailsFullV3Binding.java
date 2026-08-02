package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.molecules.view.indicator.DottedIndicatorView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes4.dex */
public final class WidgetHotelsRoomsDetailsFullV3Binding implements a {

    @NonNull
    public final BadgeView hotelsRoomsDetailsFullBadgeBv;

    @NonNull
    public final DottedIndicatorView hotelsRoomsDetailsFullDotsDiv;

    @NonNull
    public final RecyclerView hotelsRoomsDetailsFullImagesRv;

    @NonNull
    public final RecyclerView hotelsRoomsDetailsFullInfoCardsRv;

    @NonNull
    public final Group hotelsRoomsDetailsFullPhotosGroup;

    @NonNull
    public final TextAtomV2View hotelsRoomsDetailsFullSubtitleTav;

    @NonNull
    public final TextAtomV2View hotelsRoomsDetailsFullTitleTav;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetHotelsRoomsDetailsFullV3Binding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull DottedIndicatorView dottedIndicatorView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull Group group, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.hotelsRoomsDetailsFullBadgeBv = badgeView;
        this.hotelsRoomsDetailsFullDotsDiv = dottedIndicatorView;
        this.hotelsRoomsDetailsFullImagesRv = recyclerView;
        this.hotelsRoomsDetailsFullInfoCardsRv = recyclerView2;
        this.hotelsRoomsDetailsFullPhotosGroup = group;
        this.hotelsRoomsDetailsFullSubtitleTav = textAtomV2View;
        this.hotelsRoomsDetailsFullTitleTav = textAtomV2View2;
    }

    @NonNull
    public static WidgetHotelsRoomsDetailsFullV3Binding bind(@NonNull View view) {
        int i11 = R$id.hotelsRoomsDetailsFullBadgeBv;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.hotelsRoomsDetailsFullDotsDiv;
            DottedIndicatorView dottedIndicatorView = (DottedIndicatorView) C2548q.d(i11, view);
            if (dottedIndicatorView != null) {
                i11 = R$id.hotelsRoomsDetailsFullImagesRv;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.hotelsRoomsDetailsFullInfoCardsRv;
                    RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView2 != null) {
                        i11 = R$id.hotelsRoomsDetailsFullPhotosGroup;
                        Group group = (Group) C2548q.d(i11, view);
                        if (group != null) {
                            i11 = R$id.hotelsRoomsDetailsFullSubtitleTav;
                            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View != null) {
                                i11 = R$id.hotelsRoomsDetailsFullTitleTav;
                                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View2 != null) {
                                    return new WidgetHotelsRoomsDetailsFullV3Binding((ConstraintLayout) view, badgeView, dottedIndicatorView, recyclerView, recyclerView2, group, textAtomV2View, textAtomV2View2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
