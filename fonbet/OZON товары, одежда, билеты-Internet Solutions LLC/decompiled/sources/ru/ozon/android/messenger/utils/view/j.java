package ru.ozon.android.messenger.utils.view;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.labelRating.LabelRatingView;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;

/* loaded from: classes10.dex */
public final class j {
    public static void a(LabelRatingView labelRatingView, Function1 listener) {
        Intrinsics.checkNotNullParameter(labelRatingView, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        labelRatingView.setRatingClickCallback(new h(listener));
    }

    public static void b(VectorRatingBar vectorRatingBar, Function1 listener) {
        Intrinsics.checkNotNullParameter(vectorRatingBar, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        vectorRatingBar.setOnRatingBarChangeListener(new i(listener));
    }
}
