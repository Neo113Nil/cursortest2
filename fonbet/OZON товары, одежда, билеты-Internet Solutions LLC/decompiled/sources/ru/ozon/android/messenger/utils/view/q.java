package ru.ozon.android.messenger.utils.view;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;

/* loaded from: classes10.dex */
public final class q implements PikazonLoaderCallback<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Integer f92020a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Rect f92021b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TextView f92022c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ b f92023d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f92024e;

    q(Integer num, Rect rect, TextView textView, b bVar, int i11) {
        this.f92020a = num;
        this.f92021b = rect;
        this.f92022c = textView;
        this.f92023d = bVar;
        this.f92024e = i11;
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
    public final void onLoadFailed(Exception exc) {
        PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
    public final void onLoadSuccessful(Drawable drawable) {
        Drawable drawable2 = drawable;
        Integer num = this.f92020a;
        if (num != null && drawable2 != null) {
            drawable2.setTint(num.intValue());
        }
        Rect rect = this.f92021b;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
        b bVar = this.f92023d;
        TextView textView = this.f92022c;
        n.c(textView, drawable2, bVar);
        textView.setCompoundDrawablePadding(this.f92024e);
    }
}
