package ru.ozon.android.uikit.view.atoms.rating;

import android.graphics.drawable.Drawable;
import androidx.core.content.res.g;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class VectorRatingBar$starDrawable$2 extends AbstractC7737t implements Function0<Drawable> {
    final /* synthetic */ VectorRatingBar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VectorRatingBar$starDrawable$2(VectorRatingBar vectorRatingBar) {
        super(0);
        this.this$0 = vectorRatingBar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        float f7;
        float f11;
        Drawable d11 = g.d(this.this$0.getResources(), this.this$0.getStarIcon(), this.this$0.getContext().getTheme());
        if (d11 == null) {
            return null;
        }
        VectorRatingBar vectorRatingBar = this.this$0;
        d11.setTint(vectorRatingBar.getResources().getColor(R.color.oz_semantic_bg_secondary, vectorRatingBar.getContext().getTheme()));
        f7 = vectorRatingBar.currentStarSize;
        int c11 = C6915b.c(f7);
        f11 = vectorRatingBar.currentStarSize;
        d11.setBounds(0, 0, c11, C6915b.c(f11));
        return d11;
    }
}
