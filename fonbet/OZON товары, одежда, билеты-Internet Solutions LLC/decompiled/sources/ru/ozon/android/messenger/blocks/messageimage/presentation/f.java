package ru.ozon.android.messenger.blocks.messageimage.presentation;

import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.models.s;

/* loaded from: classes10.dex */
public final class f implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f85782a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ShapeableImageView f85783b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ s f85784c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.d f85785d;

    public f(ShapeableImageView shapeableImageView, e eVar, ru.ozon.android.messenger.framework.presentation.models.d dVar, s sVar) {
        this.f85782a = eVar;
        this.f85783b = shapeableImageView;
        this.f85784c = sVar;
        this.f85785d = dVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.removeOnLayoutChangeListener(this);
        ShapeableImageView shapeableImageView = this.f85783b;
        Intrinsics.f(shapeableImageView);
        s sVar = this.f85784c;
        this.f85782a.n(shapeableImageView, sVar.p(), this.f85785d.a(), sVar.a());
    }
}
