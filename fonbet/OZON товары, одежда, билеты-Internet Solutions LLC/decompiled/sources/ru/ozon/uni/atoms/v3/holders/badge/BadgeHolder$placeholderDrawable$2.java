package ru.ozon.uni.atoms.v3.holders.badge;

import B3.D;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BadgeHolder$placeholderDrawable$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    public static final BadgeHolder$placeholderDrawable$2 INSTANCE = new BadgeHolder$placeholderDrawable$2();

    BadgeHolder$placeholderDrawable$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        GradientDrawable b11 = D.b(0);
        b11.setColor(ColorStateList.valueOf(0));
        BadgeView.Companion companion = BadgeView.INSTANCE;
        b11.setBounds(0, 0, companion.getICON_SIZE_DEFAULT_PX(), companion.getICON_SIZE_DEFAULT_PX());
        return b11;
    }
}
