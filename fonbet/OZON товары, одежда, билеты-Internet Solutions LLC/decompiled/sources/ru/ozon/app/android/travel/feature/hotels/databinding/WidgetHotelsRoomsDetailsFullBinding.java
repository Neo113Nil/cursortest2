package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes4.dex */
public final class WidgetHotelsRoomsDetailsFullBinding implements a {

    @NonNull
    public final ScrollingPagerIndicator hotelsRoomsDetailsFullDotsSpi;

    @NonNull
    public final RecyclerView hotelsRoomsDetailsFullInfoCardsRv;

    @NonNull
    public final Group hotelsRoomsDetailsFullPhotosGroup;

    @NonNull
    public final ViewPager hotelsRoomsDetailsFullPhotosVp;

    @NonNull
    public final TextAtomView hotelsRoomsDetailsFullSubtitleTav;

    @NonNull
    public final TextAtomView hotelsRoomsDetailsFullTitleTav;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final VerticalAtomsLayout seatsDetailsVAL;

    private WidgetHotelsRoomsDetailsFullBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull RecyclerView recyclerView, @NonNull Group group, @NonNull ViewPager viewPager, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull VerticalAtomsLayout verticalAtomsLayout) {
        this.rootView = constraintLayout;
        this.hotelsRoomsDetailsFullDotsSpi = scrollingPagerIndicator;
        this.hotelsRoomsDetailsFullInfoCardsRv = recyclerView;
        this.hotelsRoomsDetailsFullPhotosGroup = group;
        this.hotelsRoomsDetailsFullPhotosVp = viewPager;
        this.hotelsRoomsDetailsFullSubtitleTav = textAtomView;
        this.hotelsRoomsDetailsFullTitleTav = textAtomView2;
        this.seatsDetailsVAL = verticalAtomsLayout;
    }

    @NonNull
    public static WidgetHotelsRoomsDetailsFullBinding bind(@NonNull View view) {
        int i11 = R$id.hotelsRoomsDetailsFullDotsSpi;
        ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) C2548q.d(i11, view);
        if (scrollingPagerIndicator != null) {
            i11 = R$id.hotelsRoomsDetailsFullInfoCardsRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.hotelsRoomsDetailsFullPhotosGroup;
                Group group = (Group) C2548q.d(i11, view);
                if (group != null) {
                    i11 = R$id.hotelsRoomsDetailsFullPhotosVp;
                    ViewPager viewPager = (ViewPager) C2548q.d(i11, view);
                    if (viewPager != null) {
                        i11 = R$id.hotelsRoomsDetailsFullSubtitleTav;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            i11 = R$id.hotelsRoomsDetailsFullTitleTav;
                            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView2 != null) {
                                i11 = R$id.seatsDetailsVAL;
                                VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                                if (verticalAtomsLayout != null) {
                                    return new WidgetHotelsRoomsDetailsFullBinding((ConstraintLayout) view, scrollingPagerIndicator, recyclerView, group, viewPager, textAtomView, textAtomView2, verticalAtomsLayout);
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
