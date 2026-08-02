package ru.ozon.fintech.features.offline.ui.itemcard;

import AD.b;
import E30.f;
import H30.z;
import L30.c;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/fintech/features/offline/ui/itemcard/IconTextCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IconTextCardView extends ConstraintLayout {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ImageView f95799c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final TextView f95800d;

    /* renamed from: e, reason: collision with root package name */
    private IconTextCardState f95801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconTextCardView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        z.d(this, R.color.bg_primary, null, 124);
        setOutlineProvider(new c(16));
        setClipToOutline(true);
        setPadding(f.a(), f.a(), f.a(), f.a());
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f95799c = imageView;
        setOnClickListener(new b(this, 12));
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        TextViewExtKt.applyStyle(textView, context, UniTextStyles.BODY_CONTROL_400_SMALL.getResId());
        textView.setTextColor(a.getColor(context, UniColors.TEXT_PRIMARY.getResId()));
        textView.setTypeface(null, 1);
        this.f95800d = textView;
        addView(imageView);
        addView(textView);
        d dVar = new d();
        dVar.p(this);
        dVar.s(imageView.getId(), 6, 0, 6);
        dVar.s(imageView.getId(), 3, 0, 3);
        dVar.A(imageView.getId(), f.f());
        dVar.w(imageView.getId(), f.f());
        dVar.s(textView.getId(), 6, 0, 6);
        dVar.s(textView.getId(), 3, imageView.getId(), 4);
        dVar.w(textView.getId(), -2);
        dVar.e0(textView.getId(), 3, f.a());
        dVar.f(this);
    }

    public static void b(IconTextCardView iconTextCardView) {
        String id2;
        IconTextCardState iconTextCardState;
        Function1<String, Unit> onClick;
        IconTextCardState iconTextCardState2 = iconTextCardView.f95801e;
        if (iconTextCardState2 == null || (id2 = iconTextCardState2.getId()) == null || (iconTextCardState = iconTextCardView.f95801e) == null || (onClick = iconTextCardState.getOnClick()) == null) {
            return;
        }
        onClick.invoke(id2);
    }

    public final void c(@NotNull IconTextCardState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f95801e = state;
        ImageView imageView = this.f95799c;
        ImageViewExtKt.load$default(imageView, state.getIcon(), null, null, null, null, false, null, 126, null);
        String iconColor = state.getIconColor();
        if (iconColor != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            imageView.setColorFilter(styleParser.parseColor(context, iconColor, R.color.oz_semantic_text_action), PorterDuff.Mode.SRC_IN);
        }
        this.f95800d.setText(state.getText());
    }
}
