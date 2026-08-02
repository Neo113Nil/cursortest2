package vi;

import Hi.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import c6.C5748A;
import com.bumptech.glide.c;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import y7.k;

/* renamed from: vi.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10321a extends ConstraintLayout {

    /* renamed from: f, reason: collision with root package name */
    private static final int f102973f = View.generateViewId();

    /* renamed from: g, reason: collision with root package name */
    private static final int f102974g = View.generateViewId();

    /* renamed from: h, reason: collision with root package name */
    private static final int f102975h = View.generateViewId();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ShapeableImageView f102976c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AppCompatTextView f102977d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AppCompatTextView f102978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10321a(@NotNull Context context) {
        super(context, null, 0, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        int i11 = f102973f;
        shapeableImageView.setId(i11);
        shapeableImageView.setLayoutParams(new ConstraintLayout.b(UiExtKt.toPx(72), UiExtKt.toPx(72)));
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        k.a aVar = new k.a();
        aVar.c(UiExtKt.toPxF(12));
        shapeableImageView.setShapeAppearanceModel(aVar.a());
        this.f102976c = shapeableImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        int i12 = f102974g;
        appCompatTextView.setId(i12);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_L_Bold);
        appCompatTextView.setTextColor(androidx.core.content.a.getColor(context, R$color.selector_oz_black_text));
        appCompatTextView.setPadding(0, 0, 0, UiExtKt.toPx(2));
        this.f102977d = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        int i13 = f102975h;
        appCompatTextView2.setId(i13);
        appCompatTextView2.setTextAppearance(R$style.TextStyle_Body_M);
        appCompatTextView2.setTextColor(androidx.core.content.a.getColor(context, R$color.oz_text_secondary));
        appCompatTextView2.setPadding(0, UiExtKt.toPx(2), 0, 0);
        this.f102978e = appCompatTextView2;
        addView(shapeableImageView);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        d dVar = new d();
        dVar.p(this);
        dVar.s(i11, 6, 0, 6);
        dVar.s(i11, 3, 0, 3);
        dVar.s(i11, 4, 0, 4);
        dVar.X(i11, "1:1");
        dVar.s(i12, 6, i11, 7);
        dVar.s(i12, 3, 0, 3);
        dVar.e0(i12, 6, UiExtKt.toPx(12));
        dVar.s(i13, 6, i11, 7);
        dVar.s(i13, 4, 0, 4);
        dVar.e0(i13, 6, UiExtKt.toPx(12));
        dVar.F(0, 0, new int[]{i12, i13}, new float[]{1.0f, 1.0f});
        dVar.f(this);
        setPadding(UiExtKt.toPx(16), UiExtKt.toPx(8), UiExtKt.toPx(16), UiExtKt.toPx(8));
        setLayoutParams(new ConstraintLayout.b(-1, -2));
    }

    public final void b(@NotNull j album) {
        Intrinsics.checkNotNullParameter(album, "album");
        c.n(getContext()).load(album.F1()).transform(new C5748A(UiExtKt.toPx(12))).into(this.f102976c);
        this.f102977d.setText(album.getTitle());
        this.f102978e.setText(String.valueOf(album.getCount()));
    }
}
